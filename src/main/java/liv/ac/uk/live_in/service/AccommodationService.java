package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.dao.Accommodation;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.AccommodationVO;

import java.util.List;

public interface AccommodationService {

    public BaseResponse<Accommodation> updateAccommodation(AccommodationVO acmdVO);
    public BaseResponse<Accommodation> deleteAccommodation(AccommodationVO acmdVO);
    public BaseResponse<List<Accommodation>> queryAccommodation(AccommodationVO acmdVO);

    public BaseResponse<List<Accommodation>> queryAllAccommodation();
    public BaseResponse<List<Accommodation>> queryAccommodationByKeyWord(String keyword);

    public BaseResponse<Accommodation> queryAccommodationByAcmdName(String acmdName);

}
