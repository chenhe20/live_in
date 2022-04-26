package liv.ac.uk.live_in.controller;


import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.impl.AccommodationServiceImpl;
import liv.ac.uk.live_in.service.impl.UserServiceImpl;
import liv.ac.uk.live_in.vo.AccommodationVO;
import liv.ac.uk.live_in.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/live-in/accommodation")
@CrossOrigin
public class AccommodationController {

    @Autowired
    AccommodationServiceImpl accommodationService;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse updateAcmd(@RequestBody AccommodationVO acmdVO){
        return accommodationService.updateAccommodation(acmdVO);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse deleteAcmd(@RequestBody AccommodationVO acmdVO){
        return accommodationService.deleteAccommodation(acmdVO);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryAcmd(@RequestBody AccommodationVO acmdVO){
        return accommodationService.queryAccommodation(acmdVO);
    }

}
