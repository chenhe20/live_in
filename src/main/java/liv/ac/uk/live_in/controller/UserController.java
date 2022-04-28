package liv.ac.uk.live_in.controller;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.impl.LoginServiceImpl;
import liv.ac.uk.live_in.service.impl.UserServiceImpl;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/live-in/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse updateUser(@RequestBody UserVO userVO) {
        return userService.updateUser(userVO);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse deleteUser(@RequestBody UserVO userVO) {
        return userService.deleteUser(userVO);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse addUser(@RequestBody UserVO userVO) {
        return loginService.registerUser(userVO);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryUser(@RequestBody UserVO userVO) {
        return userService.queryUser(userVO);
    }

}
