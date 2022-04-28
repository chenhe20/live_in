package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.dao.UserExample;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.UserMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.UserService;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public BaseResponse<User> updateUser(UserVO userVO) {
        // Validates request
        if (userVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        if (userVO.getPassword() != null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("Password cannot be changed");

        // Queries database
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userVO.getUsername());
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0)
            throw new BaseException(ErrorCodeEnum.NO_DATA);

        User odlUser = users.get(0);
        odlUser.setModifiedDate(null);
        odlUser.setDeleteStatus(true);
        userMapper.updateByPrimaryKeySelective(odlUser);

        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        user.setPassword(odlUser.getPassword());
        user.setSalt(odlUser.getSalt());
        user.setCreatedDate(odlUser.getCreatedDate());
        userMapper.insertSelective(user);

        return new BaseResponse<>().setData(user).setSuccess();
    }

    @Override
    public BaseResponse<User> deleteUser(UserVO userVO) {
        // Validates request
        if (userVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Queries database
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userVO.getUsername());
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0)
            throw new BaseException(ErrorCodeEnum.NO_DATA);

        User user = users.get(0);
        user.setDeleteStatus(true);
        user.setModifiedDate(null);
        userMapper.updateByPrimaryKeySelective(user);
        return new BaseResponse<>().setData(user).setSuccess();
    }

    @Override
    public BaseResponse<User> queryUser(UserVO userVO) {
        // Validates request
        if (userVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Queries database
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userVO.getUsername());
        criteria.andDeleteStatusEqualTo(false);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0)
            throw new BaseException(ErrorCodeEnum.NO_DATA);

        return new BaseResponse().setData(users.get(0)).setSuccess();
    }
}
