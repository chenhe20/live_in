package liv.ac.uk.live_in.service.impl;


import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.Admin;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.dao.UserExample;
import liv.ac.uk.live_in.exception.BaseException;
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

    @Override
    public BaseResponse<User> loginUser(UserVO userVO) {

        String username = userVO.getUsername();
        String password = userVO.getPassword();

        // Validates request
        if (username == null || password == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);

        // If there is no such username in the database
        if (users.size() == 0) throw new BaseException(ErrorCodeEnum.FAIL).setDesc("No match username");

        // Compares passwords
        User dbUser = users.get(0);
        if (PwdEncryptionUtil.ToDB(password,dbUser.getSalt()).equals(dbUser.getPassword())) {
            return new BaseResponse<User>().setData(dbUser).setSuccess();
        } else throw new BaseException(ErrorCodeEnum.FAIL).setDesc("Password is incorrect");
    }

    @Override
    public BaseResponse<Admin> loginAdmin(AdminVO adminVO) {
        BaseResponse baseResponse = new BaseResponse();

        String username = adminVO.getUsername();
        String password = adminVO.getPassword();

        // Validates request
        if (username == null || password == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);

        // If there is no such username in the database
        if (users == null) throw new BaseException(ErrorCodeEnum.FAIL).setDesc("No match username");

        // Compares passwords
        User dbUser = users.get(0);
        if (PwdEncryptionUtil.ToDB(password,dbUser.getSalt()).equals(dbUser.getPassword())) {
            baseResponse.setSuccess();
            baseResponse.setData(dbUser);

        } else throw new BaseException(ErrorCodeEnum.FAIL).setDesc("Password is incorrect");

        return baseResponse;
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

        // Encrypts the password
        String uuid = UUID.randomUUID().toString();
        String password = PwdEncryptionUtil.ToDB(userVO.getPassword(),uuid);

        // Creates the user object
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        user.setSalt(uuid);
        user.setPassword(password);
        userMapper.insertSelective(user);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(user);
        return baseResponse.setSuccess();
    }

    @Override
    public BaseResponse<User> updateUsrPwd(UserVO userVO) {
        return null;
    }
}
