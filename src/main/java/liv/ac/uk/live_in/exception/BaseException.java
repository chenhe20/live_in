package liv.ac.uk.live_in.exception;


import liv.ac.uk.live_in.Enum.ErrorCodeEnum;

public class BaseException extends RuntimeException{
    private String code;
    private String desc;

    public BaseException(String code, String desc) {
        super(desc);
        this.code = code;
        this.desc = desc;
    }

    public BaseException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getDesc());
        this.code = errorCodeEnum.getCode();
        this.desc = errorCodeEnum.getDesc();
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
}
