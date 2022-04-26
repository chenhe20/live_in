package liv.ac.uk.live_in.vo;

import lombok.Data;

import java.util.Date;

@Data
public class AccommodationVO {

    /**  */
    private Integer acmdId;

    /** Accommodation name */
    private String acmdName;

    /** Geography longitude */
    private String longitude;

    /** Geography Latitude */
    private String latitude;

    /** Official website link */
    private String webUrl;

    /**  */
    private String picUrl;

    /** Nearby infrastructures */
    private String infrastructures;

    /**  */
    private Date createdDate;

    /**  */
    private Date modifiedDate;

    /**  */
    private String facilities;

}
