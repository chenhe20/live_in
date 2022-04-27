package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.UserVO;

public interface UserService {

    public BaseResponse<User> updateUser(UserVO userVO);
    public BaseResponse<User> deleteUser(UserVO userVO);
    public BaseResponse<User> queryUser(UserVO userVO);

    public BaseResponse<User> addUser(UserVO userVO);
}
