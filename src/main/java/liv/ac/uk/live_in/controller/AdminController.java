package liv.ac.uk.live_in.controller;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.impl.AdminServiceImpl;
import liv.ac.uk.live_in.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/live-in/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminServiceImpl AdminService;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse updateAdmin(@RequestBody AdminVO adminVO) {
        return AdminService.updateAdmin(adminVO);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse deleteAdmin(@RequestBody AdminVO adminVO) {
        return AdminService.deleteAdmin(adminVO);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse addAdmin(@RequestBody AdminVO adminVO) {
        return AdminService.addAdmin(adminVO);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryAdmin(@RequestBody AdminVO adminVO) {
        return AdminService.queryAdmin(adminVO);
    }


}
