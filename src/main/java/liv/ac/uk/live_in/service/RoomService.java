package liv.ac.uk.live_in.service;


import liv.ac.uk.live_in.dao.Room;
import liv.ac.uk.live_in.dto.RoomDTO;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.RoomVO;

import java.util.List;

public interface RoomService {
    public BaseResponse<List<RoomDTO>> queryRoomByAcmdName(String acmdName);

    public BaseResponse<List<RoomDTO>> queryRoom(RoomVO roomVO);

    public BaseResponse<Room> addRoom(RoomVO roomVO);

    public BaseResponse<Room> updateRoom(RoomVO roomVO);

    public BaseResponse<Room> deleteRoom(RoomVO roomVO);


}
