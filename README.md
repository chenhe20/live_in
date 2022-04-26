# live_in
live_in platform

# LiveIn Back-end Design







## Project Structure

### Layers 

>  Controller - Service - Mapper -Dao

### Controller (control layer): the background master controller, receives all the requests from the front end,  and then assigns it to the service it needs to adjust. Contoller receives CRUD (Create, Read, Update, Delete) requests and delegates them to Services.

> This system will include loginController, userAndAdminController, UserPreferenceController, AccommodationController, postController, etc.

###  Services (business layer) : All logic is in Services, logic, algorithm, etc. The service gets data indirectly from mappers.

### Mappers: Directly manupulate the database.

### Dao (persistence layer): interface (application layer and data layer interface), only define objects, No specific content is defined. The reason there is Dao is to allow Services to directly use the things defined in it

> 5 MySQL tables mapps 5 dao object in JAVA.



## Login Example

```java
@RequestMapping(value = "/sign-in", method = RequestMethod.POST)
@ResponseBody
public BaseResponse loginUser(UserVO userVO){
    return loginService.loginUser(userVO);
}
```



> + The login method receives a servo object from a http post reqeust, then it calls loginUser service to process the reqeust. 

```java
public BaseResponse<User> loginUser(UserVO userVO) {
    BaseResponse baseResponse = new BaseResponse();

    String username = userVO.getUsername();
    String password = userVO.getPassword();

    if (username == null || password == null) {
        baseResponse.setCode(ErrorCodeEnum.NO_DATA.getCode());
        baseResponse.setDesc(ErrorCodeEnum.NO_DATA.getDesc());
        return baseResponse;
    }

    UserExample userExample = new UserExample();
    UserExample.Criteria criteria = userExample.createCriteria();
    criteria.andUsernameEqualTo(username);
    criteria.andDeleteStatusEqualTo(false);
    List<User> users = userMapper.selectByExample(userExample);


    if (users == null) {
        baseResponse.setCode(ErrorCodeEnum.FAIL.getCode());
        baseResponse.setDesc("No match username");
        return baseResponse;
    }

    User dbUser = users.get(0);
    if (PwdEncryptionUtil.ToDB(password,dbUser.getSalt()).equals(dbUser.getPassword())) {
        baseResponse.setCode(ErrorCodeEnum.SUCCESS.getCode());
        baseResponse.setDesc(ErrorCodeEnum.SUCCESS.getDesc());
        baseResponse.setData(dbUser);
    } else {
        baseResponse.setCode(ErrorCodeEnum.FAIL.getCode());
        baseResponse.setDesc("Password is incorrect");
    }

    return baseResponse;
}
```



> The method validates the username and password by comparing the encrypeted password strored in the database and returns the result
>
> The result is encapsulated in a defined form baseResponse<T>, which contains the result data, status code and status description.
>
> The font-end could tell if the user logs into the system successfully via the code (000000 means succuss).



## Other design



> An enumeration for status code

```java
public enum ErrorCodeEnum {
    SUCCESS("000000", "Success"),
    FAIL("000001", "Fail"),
    SYS_ERROR("SY0001", "System Error"),
    NO_DATA("BS0001", "Invalid Data"),
    DB_UPDATE_ERROR("BS0002", "Update Error"),
    ACCESS_DENY_ERROR("BS003","Unauthorized Access");
```



> Md5 encryption algorithm

```java
public static String md5(String src){
    return DigestUtils.md5Hex(src);
}

public static String beginMd5PassowrdToDB(String password){
    String str = salt.charAt(0)+salt.charAt(5)+password+salt.charAt(3)+salt.charAt(7)+salt.charAt(10);
    return md5(str);
}

public static String ToDB(String password,String salt){
    String s = beginMd5PassowrdToDB(password);
    String newPwd = salt.charAt(0)+s+salt.charAt(3);

    return md5(newPwd);
}
```

