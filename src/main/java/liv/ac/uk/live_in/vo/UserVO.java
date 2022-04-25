package liv.ac.uk.live_in.vo;

import lombok.Data;

import java.util.Date;


@Data
public class UserVO {

    /**  */
    private Integer id;

    /**  */
    private String username;

    /**  */
    private String password;

    /** date of birth */
    private Date dob;

    /** University or company */
    private String institution;

    /**  */
    private String gender;

    /**  */
    private String nationality;

    /** Email address */
    private String email;

    /** Short biography */
    private String bio;

}
