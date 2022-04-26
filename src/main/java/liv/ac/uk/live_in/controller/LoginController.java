package liv.ac.uk.live_in.controller;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.LoginService;
import liv.ac.uk.live_in.service.impl.LoginServiceImpl;
import liv.ac.uk.live_in.vo.AdminVO;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * The controller deals with login and registration
 */

@Controller
@RequestMapping("/live-in/log-in")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value = "/user-sign-in", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse loginUser(@RequestBody UserVO userVO){
        return loginService.loginUser(userVO);
    }

    @RequestMapping(value = "/admin-sign-in", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse loginAdmin(@RequestBody AdminVO adminVO){
        return loginService.loginAdmin(adminVO);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse registerUser(@RequestBody UserVO userVO){
        return loginService.registerUser(userVO);
    }

    @RequestMapping(value = "/update-password", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse updateUserPassword(@RequestBody UserVO userVO){
        return loginService.updateUsrPwd(userVO);
    }

}
