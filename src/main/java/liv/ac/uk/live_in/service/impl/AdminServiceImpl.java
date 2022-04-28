package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.Admin;
import liv.ac.uk.live_in.dao.AdminExample;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.AdminMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.AdminService;
import liv.ac.uk.live_in.util.PwdEncryptionUtil;
import liv.ac.uk.live_in.vo.AdminVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public BaseResponse<Admin> updateAdminPwd(AdminVO adminVO) {
        return null;
    }

    @Override
    public BaseResponse<Admin> deleteAdmin(AdminVO adminVO) {
        // Validates request
        if (adminVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Queries database
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(adminVO.getUsername());
        criteria.andDeleteStatusEqualTo(false);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() == 0)
            throw new BaseException(ErrorCodeEnum.NO_DATA);

        // Logically deletes
        Admin admin = admins.get(0);
        admin.setDeleteStatus(true);
        admin.setModifiedDate(null);
        adminMapper.updateByPrimaryKeySelective(admin);
        return new BaseResponse<>().setData(admin).setSuccess();
    }

    @Override
    public BaseResponse<Admin> queryAdmin(AdminVO adminVO) {
        // Validates request
        if (adminVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);
        // Queries database
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(adminVO.getUsername());
        criteria.andDeleteStatusEqualTo(false);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() == 0)
            throw new BaseException(ErrorCodeEnum.NO_DATA);

        return new BaseResponse().setData(admins.get(0)).setSuccess();
    }

    @Override
    public BaseResponse<Admin> addAdmin(AdminVO adminVO) {
        String userName = adminVO.getUsername();
        String oriPassword = adminVO.getPassword();

        // Validates request
        if (userName == null || oriPassword == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Checks if the admin username has been used
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        criteria.andDeleteStatusEqualTo(false);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() != 0)
            throw new BaseException(ErrorCodeEnum.FAIL).setDesc("The admin username " + userName + " has been used");

        // TODO: Checks password format

        // Encrypts the password
        String uuid = UUID.randomUUID().toString();
        String password = PwdEncryptionUtil.ReMd5PwdToDB(adminVO.getPassword(), uuid);

        // Creates the Admin object
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminVO, admin);
        admin.setSalt(uuid);
        admin.setPassword(password);
        adminMapper.insertSelective(admin);

        return new BaseResponse().setData(admin).setSuccess();
    }

    @Override
    public BaseResponse<Admin> updateAdmin(AdminVO adminVO) {
        // Validates request
        if (adminVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        if (adminVO.getPassword() != null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("Password cannot be changed");

        // Queries database
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(adminVO.getUsername());
        criteria.andDeleteStatusEqualTo(false);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() == 0)
            throw new BaseException(ErrorCodeEnum.NO_DATA);

        Admin oldAdmin = admins.get(0);
        oldAdmin.setModifiedDate(null);
        oldAdmin.setDeleteStatus(true);
        adminMapper.updateByPrimaryKeySelective(oldAdmin);

        Admin admin = new Admin();
        BeanUtils.copyProperties(adminVO, admin);
        admin.setPassword(oldAdmin.getPassword());
        admin.setSalt(oldAdmin.getSalt());
        admin.setCreatedDate(oldAdmin.getCreatedDate());
        adminMapper.insertSelective(admin);
        return new BaseResponse<>().setData(admin).setSuccess();
    }
}
