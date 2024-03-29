package liv.ac.uk.live_in.config;

import liv.ac.uk.live_in.Enum.ErrorCodeEnum;
import liv.ac.uk.live_in.exception.BaseException;
import liv.ac.uk.live_in.response.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResponse defaultExceptionHandler(HttpServletRequest request, Exception e) {

        e.printStackTrace();

        BaseResponse baseResponse = new BaseResponse();
        if (e instanceof BaseException) {
            baseResponse.setCode(((BaseException) e).getCode());
            baseResponse.setDesc(((BaseException) e).getDesc());
        } else {
            baseResponse.setCode(ErrorCodeEnum.SYS_ERROR.getCode());
            baseResponse.setDesc(ErrorCodeEnum.SYS_ERROR.getDesc());
        }
        return baseResponse;
    }
}
