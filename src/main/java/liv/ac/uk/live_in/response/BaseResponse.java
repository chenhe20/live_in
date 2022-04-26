package liv.ac.uk.live_in.response;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;

public class BaseResponse <T>{
    private String code;
    private String desc;
    private T data;

    public BaseResponse setSuccess() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ErrorCodeEnum.SUCCESS.getCode());
        baseResponse.setDesc(ErrorCodeEnum.SUCCESS.getDesc());
        return baseResponse;
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

    public BaseResponse setData(T data) {
        this.data = data;
        return this;
    }
}
