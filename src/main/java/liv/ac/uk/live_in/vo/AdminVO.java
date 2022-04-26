package liv.ac.uk.live_in.vo;

import lombok.Data;


@Data
public class AdminVO {
    /**  */
    private Integer id;

    /**  */
    private String username;

    /**  */
    private String password;

    /**  */
    private String salt;

    /**  */
    private String memo;
}
