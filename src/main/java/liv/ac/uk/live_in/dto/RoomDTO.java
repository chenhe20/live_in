package liv.ac.uk.live_in.dto;

import lombok.Data;

@Data
public class RoomDTO {

    /**
     * Room ID
     */
    private Integer id;

    /** Accommodation ID */
    private String acmdId;

    /** Accommodation name */
    private String acmdName;

    /** Room Type: en-suite or studio */
    private String roomType;

    /** Rent per week */
    private Integer rent;

    /** tenancy length list, values are divided by string space */
    private String tenancy;

    /** room url */
    private String infoUrl;

    /** Tenancy terms */
    private String term;

    /** accommodation url */
    private String webUrl;

    /** accommodation url  */
    private String picUrl;

    /** flat amenities list */
    private String amenities;

    /** Distance to north campus */
    private String distanceToNorth;

    /** Distance to south campus */
    private String distanceToSouth;

    /** Average rating */
    private Double ratings;

    /**  */
    private String postcode;

    /**  */
    private Double distanceToCampus;

    /** Nearby facility map url list */
    private String facilities;
}
