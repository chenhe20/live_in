package liv.ac.uk.live_in.Enum;

public enum ErrorCodeEnum {
    SUCCESS("000000", "Success"),
    FAIL("000001", "Fail"),
    SYS_ERROR("SY0001", "System Error"),
    INVALID_REQUEST("BS0001", "Invalid request data"),
    NO_DATA("BS0002", "Cannot find Data"),
    DB_UPDATE_ERROR("BS0003", "Update Error"),
    ACCESS_DENY_ERROR("BS004","Unauthorized Access");


    private String code;
    private String desc;

    ErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public static ErrorCodeEnum getByCode(String code) {
        for (ErrorCodeEnum accountErrorEnum: ErrorCodeEnum.values()){
            if(accountErrorEnum.getCode().equals(code)){
                return accountErrorEnum;
            }
        }
        return null;
    }
}
