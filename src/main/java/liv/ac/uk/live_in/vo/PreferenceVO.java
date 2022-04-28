package liv.ac.uk.live_in.vo;


import lombok.Data;

import java.util.Date;

@Data
public class PreferenceVO {

    /**
     *
     */
    private String username;

    /**
     *
     */
    private Date sleepingTime;

    /**
     * Willing to share the kitchen is 1, otherwise 0
     */
    private Integer shareKitchen;

    /** Roommate same gender constraint 1, otherwise 0 */
    private Integer sameGenderConstraint;

    /**  */
    private String hobby;
}
