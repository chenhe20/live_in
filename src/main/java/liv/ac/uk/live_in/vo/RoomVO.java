package liv.ac.uk.live_in.vo;


import lombok.Data;

@Data
public class RoomVO {

    /**
     *
     */
    private Integer acmdId;

    /**
     *
     */
    private String acmdName;

    /**
     *
     */
    private String roomType;

    /**
     * Rent per week
     */
    private Integer rent;

    /**
     * tenancy length list, values are divided by string space
     */
    private String tenancy;

    /**
     *
     */
    private String infoUrl;

    /**
     * Tenancy term
     */
    private String term;

    /**
     * price upper limit
     */
    private Integer priceUpperBound;

    private Double distanceUpperBound;

    private Double ratingLowerBound;

    /**
     * must-cantain facility
     */
    private String facility;

    /**
     * must-contain amenities
     */
    private String amenities;

    /**
     * Order by distance desc
     */
    Boolean distanceAscOrder;

    Boolean priceAscOrder;

    Boolean priceDescOrder;

    Boolean ratingDescOrder;


}
