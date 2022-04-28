package liv.ac.uk.live_in.controller;


import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.impl.RoomServiceImpl;
import liv.ac.uk.live_in.vo.RoomVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/live-in/room")
@CrossOrigin
public class RoomController {
    @Autowired
    RoomServiceImpl roomService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse addRoom(@RequestBody RoomVO roomVO) {
        return roomService.addRoom(roomVO);
    }

    @RequestMapping(value = "/query-by-acmd-name/{acmdName}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse queryAcmdByAcmdName(@PathVariable String acmdName) {
        return roomService.queryRoomByAcmdName(acmdName);
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse queryRoom(@RequestBody RoomVO roomVO) {
        return roomService.queryRoom(roomVO);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse deleteRoom(@PathVariable Integer id) {
        return roomService.deleteRoom(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse updateRoom(@RequestBody RoomVO roomVO) {
        return roomService.updateRoom(roomVO);
    }


}
