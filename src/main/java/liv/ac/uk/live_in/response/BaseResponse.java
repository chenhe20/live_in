package liv.ac.uk.live_in.response;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;

public class BaseResponse <T>{
    private String code;
    private String desc;
    private T data;

    public BaseResponse setSuccess() {
        this.setCode(ErrorCodeEnum.SUCCESS.getCode());
        this.setDesc(ErrorCodeEnum.SUCCESS.getDesc());
        return this;
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

    public BaseResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public T getData() {
        return data;
    }

    public BaseResponse<T> setData(T data) {
        this.data = data;
        return this;
    }
}
