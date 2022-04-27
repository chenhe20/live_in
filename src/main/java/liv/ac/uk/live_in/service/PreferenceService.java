package liv.ac.uk.live_in.service;

import liv.ac.uk.live_in.dao.Preference;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.PreferenceVO;

public interface PreferenceService {

    public BaseResponse submitPreference(PreferenceVO prfVO);

    public BaseResponse<Preference> updatePreference(PreferenceVO preferenceVO);

    public BaseResponse<Preference> deletePreference(PreferenceVO preferenceVO);

    public BaseResponse<Preference> queryPreference(PreferenceVO preferenceVO);

    public BaseResponse<Preference> addPreference(PreferenceVO preferenceVO);

}
