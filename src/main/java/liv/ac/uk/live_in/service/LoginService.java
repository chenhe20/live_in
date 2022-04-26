package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.dao.Admin;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.AdminVO;
import liv.ac.uk.live_in.vo.UserVO;


public interface LoginService {
    public BaseResponse<User> loginUser(UserVO userVO);

    public BaseResponse<Admin> loginAdmin(AdminVO adminVO);

    public BaseResponse<User> registerUser(UserVO userVO);

    public BaseResponse<User> updateUserPwd(UserVO userVO);
}
