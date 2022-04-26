package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.dao.Accommodation;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.AccommodationService;
import liv.ac.uk.live_in.vo.AccommodationVO;
import org.springframework.stereotype.Service;

@Service
public class AccommodationServiceImpl implements AccommodationService {
    @Override
    public BaseResponse<Accommodation> updateAccommodation(AccommodationVO acmdVO) {
        return null;
    }

    @Override
    public BaseResponse<Accommodation> deleteAccommodation(AccommodationVO acmdVO) {
        return null;
    }

    @Override
    public BaseResponse<Accommodation> queryAccommodation(AccommodationVO acmdVO) {
        return null;
    }
}
