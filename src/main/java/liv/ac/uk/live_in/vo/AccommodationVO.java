package liv.ac.uk.live_in.vo;

import lombok.Data;

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
 * distance
 *
 * order:
 * price asc dsc
 *
 *
 * distance dsc
 * rating asc
 */

@Data
public class AccommodationVO {

    /** Accommodation name */
    private String acmdName;

}
