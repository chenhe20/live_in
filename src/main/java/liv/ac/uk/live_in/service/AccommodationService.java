package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.dao.Accommodation;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.AccommodationVO;
import liv.ac.uk.live_in.vo.UserVO;

public interface AccommodationService {

    public BaseResponse<Accommodation> updateAccommodation(AccommodationVO acmdVO);
    public BaseResponse<Accommodation> deleteAccommodation(AccommodationVO acmdVO);
    public BaseResponse<Accommodation> queryAccommodation(AccommodationVO acmdVO);

}
