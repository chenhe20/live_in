package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.Accommodation;
import liv.ac.uk.live_in.dao.AccommodationExample;
import liv.ac.uk.live_in.dao.Room;
import liv.ac.uk.live_in.dao.RoomExample;
import liv.ac.uk.live_in.dto.RoomDTO;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.AccommodationMapper;
import liv.ac.uk.live_in.mapper.RoomMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.RoomService;
import liv.ac.uk.live_in.vo.RoomVO;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;

    @Autowired
    AccommodationMapper accommodationMapper;

    @Override
    public BaseResponse<List<RoomDTO>> queryRoomByAcmdName(String acmdName) {

        if (acmdName == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        AccommodationExample accommodationExample = new AccommodationExample();
        AccommodationExample.Criteria acmdCriteria = accommodationExample.createCriteria();
        acmdCriteria.andAcmdNameEqualTo(acmdName);
        acmdCriteria.andDeleteStatusEqualTo(false);
        List<Accommodation> accommodations = accommodationMapper.selectByExample(accommodationExample);

        if (accommodations.size() == 0)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("No match accommodation");
        Accommodation accommodation = accommodations.get(0);

        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        criteria.andAcmdNameEqualTo(acmdName);
        criteria.andDeleteStatusEqualTo(false);
        List<Room> rooms = roomMapper.selectByExample(roomExample);

        ArrayList<RoomDTO> roomDTOS = new ArrayList<>();
        rooms.forEach(room -> {
            RoomDTO roomDTO = new RoomDTO();
            BeanUtils.copyProperties(accommodation, roomDTO);
            BeanUtils.copyProperties(room, roomDTO);
            roomDTOS.add(roomDTO);
        });

        return new BaseResponse().setData(roomDTOS).setSuccess();
    }

    @Override
    public BaseResponse<List<RoomDTO>> queryRoom(RoomVO roomVO) {
        if (BooleanUtils.isTrue(roomVO.getPriceAscOrder()) && BooleanUtils.isTrue(roomVO.getPriceDescOrder()))
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("Conflict order clause condition");

        ArrayList<RoomDTO> roomDTOS = new ArrayList<>();

        // Searches matched accommodations
        AccommodationExample accommodationExample = new AccommodationExample();
        AccommodationExample.Criteria criteria = accommodationExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);

        if (roomVO.getAcmdName() != null)
            criteria.andAcmdNameEqualTo(roomVO.getAcmdName());

        if (roomVO.getDistanceUpperBound() != null)
            criteria.andDistanceToCampusLessThanOrEqualTo(roomVO.getDistanceUpperBound());

        if (roomVO.getRatingLowerBound() != null)
            criteria.andRatingsGreaterThan(roomVO.getRatingLowerBound());

        if (roomVO.getFacility() != null)
            criteria.andFacilitiesLike("%" + roomVO.getFacility() + "%");

        if (roomVO.getAmenities() != null)
            criteria.andAmenitiesLike("%" + roomVO.getAmenities() + "%");

        StringBuilder acmdOrderClause = new StringBuilder();

        if (BooleanUtils.isTrue(roomVO.getDistanceAscOrder()))
            acmdOrderClause.append("distance_to_campus asc");

        if (BooleanUtils.isTrue(roomVO.getRatingDescOrder()))
            acmdOrderClause.append(",ratings desc");

        if (acmdOrderClause.length() > 0)
            accommodationExample.setOrderByClause(acmdOrderClause.toString());

        List<Accommodation> accommodations = accommodationMapper.selectByExample(accommodationExample);

        accommodations.forEach(acmd -> {
            // For each matched accommodation, searches matched rooms
            RoomExample roomExample = new RoomExample();
            RoomExample.Criteria roomExampleCriteria = roomExample.createCriteria();
            roomExampleCriteria.andDeleteStatusEqualTo(false);

            if (roomVO.getPriceUpperBound() != null)
                roomExampleCriteria.andRentLessThanOrEqualTo(roomVO.getPriceUpperBound());

            if (roomVO.getTenancy() != null)
                roomExampleCriteria.andTenancyLike("%" + roomVO.getTenancy() + "%");

            if (roomVO.getRoomType() != null)
                roomExampleCriteria.andRoomTypeEqualTo(roomVO.getRoomType());

            StringBuilder roomOrderClause = new StringBuilder();

            if (BooleanUtils.isTrue(roomVO.getPriceDescOrder()))
                roomOrderClause.append("rent desc");

            if (BooleanUtils.isTrue(roomVO.getPriceAscOrder()))
                roomOrderClause.append("rent asc");

            if (roomOrderClause.length() > 1)
                roomExample.setOrderByClause(roomOrderClause.toString());
            roomExampleCriteria.andAcmdNameEqualTo(acmd.getAcmdName());
            List<Room> rooms = roomMapper.selectByExample(roomExample);

            rooms.forEach(room -> {
                RoomDTO roomDTO = new RoomDTO();
                BeanUtils.copyProperties(room, roomDTO);
                BeanUtils.copyProperties(acmd, roomDTO);
                roomDTOS.add(roomDTO);

            });
        });

        return new BaseResponse<>().setData(roomDTOS).setSuccess();
    }

    @Override
    public BaseResponse<Room> addRoom(RoomVO roomVO) {
        if (roomVO.getAcmdName() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("Accommodation name can not be null");
        Room room = new Room();
        BeanUtils.copyProperties(roomVO, room);
        roomMapper.insertSelective(room);
        return new BaseResponse().setData(room).setSuccess();
    }

    @Override
    public BaseResponse<Room> updateRoom(RoomVO roomVO) {
        return null;
    }

    @Override
    public BaseResponse<Room> deleteRoom(RoomVO roomVO) {
        return null;
    }


}
