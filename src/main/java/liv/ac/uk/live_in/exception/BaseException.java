package liv.ac.uk.live_in.exception;


import com.fasterxml.jackson.databind.ser.Serializers;
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

    public BaseException setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public BaseException setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
