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

    /**
     * Accommodation name
     */
    private String acmdName;

    /**
     * Geography longitude
     */
    private String longitude;

    /**
     * Geography Latitude
     */
    private String latitude;

    /**
     * Nearby facility map url list
     */
    private String facilities;

    /**
     * Official website link
     */
    private String webUrl;

    /**
     *
     */
    private String picUrl;

    /**
     * flat amenities list
     */
    private String amenities;

    /**
     *
     */
    private Date createdDate;

    /**
     *
     */
    private Date modifiedDate;

    /**
     * Distance to north campus
     */
    private String distanceToNorth;

    /**
     * Distance to south campus
     */
    private String distanceToSouth;

    /**
     * Average rating
     */
    private Double ratings;

    /**
     *
     */
    private String postcode;

    /**
     *
     */
    private Double distanceToCampus;


}
