package liv.ac.uk.live_in.controller;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.impl.PreferenceServiceImpl;
import liv.ac.uk.live_in.vo.PreferenceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/live-in/reference")
@CrossOrigin
public class PreferenceController {

    @Autowired
    PreferenceServiceImpl PreferenceService;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse updatePreference(@RequestBody PreferenceVO preferenceVO) {
        return PreferenceService.updatePreference(preferenceVO);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse deletePreference(@RequestBody PreferenceVO preferenceVO) {
        return PreferenceService.deletePreference(preferenceVO);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse addPreference(@RequestBody PreferenceVO preferenceVO) {
        return PreferenceService.addPreference(preferenceVO);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryPreference(@RequestBody PreferenceVO preferenceVO) {
        return PreferenceService.queryPreference(preferenceVO);
    }
}
