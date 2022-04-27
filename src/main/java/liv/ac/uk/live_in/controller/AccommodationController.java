package liv.ac.uk.live_in.controller;


import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.impl.AccommodationServiceImpl;
import liv.ac.uk.live_in.vo.AccommodationVO;
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

    @RequestMapping(value = "/query-all", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryAllAcmd() {
        return accommodationService.queryAllAccommodation();
    }

    @RequestMapping(value = "/query/{keyword}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryAcmdByKeyword(@PathVariable String keyword) {
        return accommodationService.queryAccommodationByKeyWord(keyword);
    }

    @RequestMapping(value = "/query-name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryAcmdByAcmdName(@PathVariable String name) {
        return accommodationService.queryAccommodationByAcmdName(name);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse addAcmd(@RequestBody AccommodationVO acmdVO) {
        return accommodationService.addAccommodation(acmdVO);
    }


}
