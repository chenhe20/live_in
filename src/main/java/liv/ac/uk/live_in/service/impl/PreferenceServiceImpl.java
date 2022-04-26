package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.PreferenceService;
import liv.ac.uk.live_in.vo.PreferenceSubmissionVO;
import org.springframework.stereotype.Service;

@Service
public class PreferenceServiceImpl implements PreferenceService {
    @Override
    public BaseResponse submitPreference(PreferenceSubmissionVO prfVO) {
        return null;
    }

    public int calculate_score(PreferenceSubmissionVO prfVO) {
        int res = 0;
        if(prfVO.getShareKitchen() == 1) {
            res += 10;
        }
        if(prfVO.getSameGenderConstraint() == 1) {
            res += 10;
        }
        if(Integer.valueOf(prfVO.getSleepingTime().toString().substring(4,6)) < 23) {
            res += 10;
        }
        if(prfVO.getHobby().length() > 30) {
            res += 10;
        }
        return res;
    }
}
