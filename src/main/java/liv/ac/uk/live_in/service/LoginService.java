package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.stereotype.Service;


public interface LoginService {
    public BaseResponse<User> loginUser(UserVO userVO);
}
