package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.dao.Preference;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.PreferenceService;
import liv.ac.uk.live_in.vo.PreferenceVO;
import org.springframework.stereotype.Service;

@Service
public class PreferenceServiceImpl implements PreferenceService {
    @Override
    public BaseResponse submitPreference(PreferenceVO prfVO) {
        return null;
    }

    @Override
    public BaseResponse<Preference> updatePreference(PreferenceVO preferenceVO) {
        return null;
    }

    @Override
    public BaseResponse<Preference> deletePreference(PreferenceVO preferenceVO) {
        return null;
    }

    @Override
    public BaseResponse<Preference> queryPreference(PreferenceVO preferenceVO) {
        return null;
    }

    @Override
    public BaseResponse<Preference> addPreference(PreferenceVO preferenceVO) {
        return null;
    }

    public int calculate_score(PreferenceVO prfVO) {
        int res = 0;
        if (prfVO.getShareKitchen() == 1) {
            res += 10;
        }
        if (prfVO.getSameGenderConstraint() == 1) {
            res += 10;
        }
        if (Integer.valueOf(prfVO.getSleepingTime().toString().substring(4, 6)) < 23) {
            res += 10;
        }
        if(prfVO.getHobby().length() > 30) {
            res += 10;
        }
        return res;
    }
}
