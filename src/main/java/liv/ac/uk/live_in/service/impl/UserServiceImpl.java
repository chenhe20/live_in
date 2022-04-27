package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.UserService;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public BaseResponse<User> updateUser(UserVO userVO) {
        return null;
    }

    @Override
    public BaseResponse<User> deleteUser(UserVO userVO) {
        return null;
    }

    @Override
    public BaseResponse<User> queryUser(UserVO userVO) {
        return null;
    }

    @Override
    public BaseResponse<User> addUser(UserVO userVO) {
        return null;
    }
}
