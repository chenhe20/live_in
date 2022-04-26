package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.PreferenceSubmissionVO;

public interface PreferenceService {

    public BaseResponse submitPreference(PreferenceSubmissionVO prfVO);

}
