package liv.ac.uk.live_in.vo;

import lombok.Data;

import java.util.Date;

/**
 * Users can sort them by rating, distance or price, or filter them by number of rooms,
 * price range, facilities, distance to campus, and facilities nearby.
 *
 * rating, room type,
 *
 * filter:
 * price range
 * room type
 * facility
 * infrastructure
 *
 *
 * order:
 * price asc dsc
 * distance dsc
 * rating asc
 */

@Data
public class AccommodationVO {

    /**  */
    private Integer acmdId;

    /** Accommodation name */
    private String acmdName;

    /**  */
    private Date createdDate;

    /**  */
    private Date modifiedDate;


}
