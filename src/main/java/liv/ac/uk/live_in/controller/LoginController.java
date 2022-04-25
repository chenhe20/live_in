package liv.ac.uk.live_in.controller;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.LoginService;
import liv.ac.uk.live_in.service.impl.LoginServiceImpl;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The controller deals with login and registration
 */

@RestController
@RequestMapping("/livein/log-in")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value = "/sign-in", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse loginUser(UserVO userVO){
        return loginService.loginUser(userVO);
    }

}
