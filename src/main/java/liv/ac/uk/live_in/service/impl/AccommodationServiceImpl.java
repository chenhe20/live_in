package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.Accommodation;
import liv.ac.uk.live_in.dao.AccommodationExample;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.AccommodationMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.AccommodationService;
import liv.ac.uk.live_in.vo.AccommodationVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationServiceImpl implements AccommodationService {

    @Autowired
    AccommodationMapper accommodationMapper;

    @Override
    public BaseResponse<Accommodation> updateAccommodation(AccommodationVO acmdVO) {
        if (acmdVO == null || acmdVO.getAcmdName() == null) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        AccommodationExample accommodationExample = new AccommodationExample();
        AccommodationExample.Criteria criteria = accommodationExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        criteria.andAcmdNameEqualTo(acmdVO.getAcmdName());
        List<Accommodation> accommodations = accommodationMapper.selectByExample(accommodationExample);

        if (accommodations.size() == 0) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("No match accommodation");

        Accommodation accommodation = accommodations.get(0);
        BeanUtils.copyProperties(acmdVO, accommodation);
        accommodation.setModifiedDate(null);
        accommodationMapper.insertSelective(accommodation);
        return new BaseResponse().setData(accommodation).setSuccess();

    }

    @Override
    public BaseResponse<Accommodation> deleteAccommodation(AccommodationVO acmdVO) {
        return null;
    }

    @Override
    public BaseResponse<List<Accommodation>> queryAccommodation(AccommodationVO acmdVO) {
        return null;
    }

    @Override
    public BaseResponse<List<Accommodation>> queryAllAccommodation() {
        AccommodationExample accommodationExample = new AccommodationExample();
        AccommodationExample.Criteria criteria = accommodationExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        List<Accommodation> accommodations = accommodationMapper.selectByExample(accommodationExample);
        return new BaseResponse().setData(accommodations).setSuccess();
    }

    @Override
    public BaseResponse<List<Accommodation>> queryAccommodationByKeyWord(String keyword) {

        if (keyword.equals(null)) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        List<Accommodation> accommodations = accommodationMapper.customSelectByKeyword(keyword);
        return new BaseResponse().setData(accommodations).setSuccess();
    }

    @Override
    public BaseResponse<Accommodation> queryAccommodationByAcmdName(String acmdName) {

        if (acmdName.equals(null)) throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        AccommodationExample accommodationExample = new AccommodationExample();
        AccommodationExample.Criteria criteria = accommodationExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        criteria.andAcmdNameEqualTo(acmdName);

        List<Accommodation> accommodations = accommodationMapper.selectByExample(accommodationExample);
        if (accommodations.size() == 0) throw new BaseException(ErrorCodeEnum.NO_DATA);

        return new BaseResponse().setData(accommodations.get(0)).setSuccess();

    }
}
