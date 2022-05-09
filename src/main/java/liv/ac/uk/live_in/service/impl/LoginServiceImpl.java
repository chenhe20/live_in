package liv.ac.uk.live_in.service.impl;


import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.Admin;
import liv.ac.uk.live_in.dao.AdminExample;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.dao.UserExample;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.AdminMapper;
import liv.ac.uk.live_in.mapper.UserMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.LoginService;
import liv.ac.uk.live_in.util.PwdEncryptionUtil;
import liv.ac.uk.live_in.vo.AdminVO;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    AdminMapper adminMapper;

    @Override
    public BaseResponse<User> loginUser(UserVO userVO) {

        String username = userVO.getUsername();
        String password = userVO.getPassword();

        // Validates request
        if (username == null || password == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);

        // If there is no such username in the database
        if (users.size() == 0)
            throw new BaseException(ErrorCodeEnum.FAIL).setDesc("No match username");

        // Compares passwords
        User dbUser = users.get(0);
        if (PwdEncryptionUtil.ReMd5PwdToDB(password, dbUser.getSalt()).equals(dbUser.getPassword()))
            return new BaseResponse<User>().setData(dbUser).setSuccess();
        else
            throw new BaseException(ErrorCodeEnum.FAIL).setDesc("Password is incorrect");
    }

    @Override
    public BaseResponse<Admin> loginAdmin(AdminVO adminVO) {
        BaseResponse baseResponse = new BaseResponse();

        String username = adminVO.getUsername();
        String password = adminVO.getPassword();

        // Validates request
        if (username == null || password == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<Admin> admins = adminMapper.selectByExample(adminExample);

        // If there is no such username in the database
        if (admins.size() == 0) throw new BaseException(ErrorCodeEnum.FAIL).setDesc("No match username");

        // Compares passwords
        Admin admin = admins.get(0);
        if (PwdEncryptionUtil.ReMd5PwdToDB(password, admin.getSalt()).equals(admin.getPassword())) {
            return new BaseResponse().setData(admin).setSuccess();

        } else throw new BaseException(ErrorCodeEnum.FAIL).setDesc("Password is incorrect");
    }

    @Override
    public BaseResponse<User> registerUser(UserVO userVO) {

        String username = userVO.getUsername();
        String oriPassword = userVO.getPassword();

        // Validates request
        if (username == null || oriPassword == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Checks if the username has been used
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() != 0) throw new BaseException(ErrorCodeEnum.FAIL).setDesc("The username " + username + " has been used");

        // TODO: Checks password format

        // Encrypts the password
        String uuid = UUID.randomUUID().toString();
        String password = PwdEncryptionUtil.ReMd5PwdToDB(userVO.getPassword(),uuid);

        // Creates the user object
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        user.setSalt(uuid);
        user.setPassword(password);
        userMapper.insertSelective(user);

        return new BaseResponse().setData(user).setSuccess();
    }

    @Override
    public BaseResponse<User> updateUserPwd(UserVO userVO) {
        String username = userVO.getUsername();
        String password = userVO.getPassword();

        // Validates request
        if (username == null || password == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Compares the new password with the old one
        String newPassword = userVO.getNewPassword();
        if (newPassword == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("New password cannot be null");

        if (newPassword.equals(password))
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("New password cannot be same with the old password");

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);

        // If there is no such username in the database
        if (users.size() == 0)
            throw new BaseException(ErrorCodeEnum.FAIL).setDesc("No match username");

        // Compares passwords
        User dbUser = users.get(0);
        if (!PwdEncryptionUtil.ReMd5PwdToDB(password, dbUser.getSalt()).equals(dbUser.getPassword()))
            throw new BaseException(ErrorCodeEnum.FAIL).setDesc("Password is incorrect");

        // Encrypts the password
        String uuid = UUID.randomUUID().toString();
        String passwordToDb = PwdEncryptionUtil.ReMd5PwdToDB(password, uuid);

        dbUser.setDeleteStatus(true);
        dbUser.setModifiedDate(null);
        userMapper.updateByPrimaryKeySelective(dbUser);

        User user = new User();
        BeanUtils.copyProperties(dbUser, user);
        user.setDeleteStatus(false);
        user.setCreatedDate(dbUser.getCreatedDate());
        user.setSalt(uuid);
        user.setPassword(passwordToDb);
        user.setId(null);
        userMapper.insertSelective(user);

        return new BaseResponse<>().setSuccess().setData(user);

    }
}
