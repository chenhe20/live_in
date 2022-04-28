package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.dao.Preference;
import liv.ac.uk.live_in.dao.PreferenceExample;
import liv.ac.uk.live_in.dao.User;
import liv.ac.uk.live_in.dao.UserExample;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.mapper.PreferenceMapper;
import liv.ac.uk.live_in.mapper.UserMapper;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.PreferenceService;
import liv.ac.uk.live_in.vo.PreferenceVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceServiceImpl implements PreferenceService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    PreferenceMapper preferenceMapper;

    @Override
    public BaseResponse submitPreference(PreferenceVO prfVO) {
        return null;
    }

    @Override
    public BaseResponse<Preference> updatePreference(PreferenceVO preferenceVO) {
        if (preferenceVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        PreferenceExample preferenceExample = new PreferenceExample();
        PreferenceExample.Criteria criteria = preferenceExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        criteria.andUsernameEqualTo(preferenceVO.getUsername());

        List<Preference> preferences = preferenceMapper.selectByExample(preferenceExample);

        if (preferences.size() == 0)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("No matched preference");

        // Logically deletes
        Preference oldPreference = preferences.get(0);
        oldPreference.setDeleteStatus(true);
        oldPreference.setModifiedDate(null);
        preferenceMapper.updateByPrimaryKeySelective(oldPreference);

        // Inserts new entry
        Preference preference = new Preference();
        BeanUtils.copyProperties(preferenceVO, preference);
        preference.setCreatedDate(oldPreference.getCreatedDate());
        preferenceMapper.insertSelective(preference);

        return new BaseResponse().setData(preference).setSuccess();
    }

    @Override
    public BaseResponse<Preference> deletePreference(PreferenceVO preferenceVO) {
        // Validates preference existence
        if (preferenceVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        PreferenceExample preferenceExample = new PreferenceExample();
        PreferenceExample.Criteria criteria = preferenceExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        criteria.andUsernameEqualTo(preferenceVO.getUsername());

        List<Preference> preferences = preferenceMapper.selectByExample(preferenceExample);

        if (preferences.size() == 0)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("No matched preference");

        // Logically deletes
        Preference oldPreference = preferences.get(0);
        oldPreference.setDeleteStatus(true);
        oldPreference.setModifiedDate(null);
        preferenceMapper.updateByPrimaryKeySelective(oldPreference);

        return new BaseResponse().setData(oldPreference).setSuccess();
    }

    @Override
    public BaseResponse<Preference> queryPreference(PreferenceVO preferenceVO) {
        if (preferenceVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        PreferenceExample preferenceExample = new PreferenceExample();
        PreferenceExample.Criteria criteria = preferenceExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        criteria.andUsernameEqualTo(preferenceVO.getUsername());

        List<Preference> preferences = preferenceMapper.selectByExample(preferenceExample);

        if (preferences.size() == 0)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("No matched preference");

        return new BaseResponse().setData(preferences.get(0)).setSuccess();
    }

    @Override
    public BaseResponse<Preference> addPreference(PreferenceVO preferenceVO) {
        if (preferenceVO.getUsername() == null)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST);

        // Validates user existence
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andDeleteStatusEqualTo(false);
        criteria.andUsernameEqualTo(preferenceVO.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("No matched user");

        // Validates preference dao uniqueness
        PreferenceExample preferenceExample = new PreferenceExample();
        PreferenceExample.Criteria pCriteria = preferenceExample.createCriteria();
        pCriteria.andDeleteStatusEqualTo(false);
        pCriteria.andUsernameEqualTo(preferenceVO.getUsername());

        List<Preference> preferences = preferenceMapper.selectByExample(preferenceExample);

        if (preferences.size() != 0)
            throw new BaseException(ErrorCodeEnum.INVALID_REQUEST).setDesc("One user can only have one preference");

        // Inserts preference
        Preference preference = new Preference();
        BeanUtils.copyProperties(preferenceVO, preference);
        preferenceMapper.insertSelective(preference);

        return new BaseResponse().setData(preference).setSuccess();
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
