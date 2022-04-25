package liv.ac.uk.live_in.service.impl;


import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.dao.UserExample;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.UserMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.LoginService;
import liv.ac.uk.live_in.util.PwdEncryptionUtil;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    @Override
    public BaseResponse<User> loginUser(UserVO userVO) {
        BaseResponse baseResponse = new BaseResponse();

        String username = userVO.getUsername();
        String password = userVO.getPassword();

        if (username == null || password == null) {
            baseResponse.setCode(ErrorCodeEnum.NO_DATA.getCode());
            baseResponse.setDesc(ErrorCodeEnum.NO_DATA.getDesc());
            return baseResponse;
        }

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);


        if (users == null) {
            baseResponse.setCode(ErrorCodeEnum.FAIL.getCode());
            baseResponse.setDesc("No match username");
            return baseResponse;
        }

        User dbUser = users.get(0);
        if (PwdEncryptionUtil.ToDB(password,dbUser.getSalt()).equals(dbUser.getPassword())) {
            baseResponse.setCode(ErrorCodeEnum.SUCCESS.getCode());
            baseResponse.setDesc(ErrorCodeEnum.SUCCESS.getDesc());
            baseResponse.setData(dbUser);
        } else {
            baseResponse.setCode(ErrorCodeEnum.FAIL.getCode());
            baseResponse.setDesc("Password is incorrect");
        }

        return baseResponse;
    }
}
