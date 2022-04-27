package liv.ac.uk.live_in.service;


import liv.ac.uk.live_in.dao.Admin;
import liv.ac.uk.live_in.response.BaseResponse;
import liv.ac.uk.live_in.vo.AdminVO;

public interface AdminService {

    public BaseResponse<Admin> updateAdminPwd(AdminVO adminVO);
    public BaseResponse<Admin> deleteAdmin(AdminVO adminVO);
    public BaseResponse<Admin> queryAdmin(AdminVO adminVO);
    public BaseResponse<Admin> addAdmin(AdminVO adminVO);
}
