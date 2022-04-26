package liv.ac.uk.live_in.service.impl;

import liv.ac.uk.live_in.dao.Admin;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.service.AdminService;
import liv.ac.uk.live_in.vo.AdminVO;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public BaseResponse<Admin> updateAdminPwd(AdminVO adminVO) {
        return null;
    }

    @Override
    public BaseResponse<Admin> deleteAdmin(AdminVO adminVO) {
        return null;
    }

    @Override
    public BaseResponse<Admin> queryAdmin(AdminVO adminVO) {
        return null;
    }

    @Override
    public BaseResponse<Admin> addAdmin(AdminVO adminVO) {
        return null;
    }
}
