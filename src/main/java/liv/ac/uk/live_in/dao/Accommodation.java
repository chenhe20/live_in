package liv.ac.uk.live_in.dao;

import java.util.Date;

/**
 * accommodation dao object
 * 
 **/
public class Accommodation {
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

    /** Nearby infrustructures */
    private String infrastructures;

    /**  */
    private Date createdDate;

    /**  */
    private Date modifiedDate;

    /**  */
    private String facilities;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.acmd_id
     *
     * @return the value of accommodation.acmd_id
     *
     * @mbggenerated
     */
    public Integer getAcmdId() {
        return acmdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.acmd_id
     *
     * @param acmdId the value for accommodation.acmd_id
     *
     * @mbggenerated
     */
    public void setAcmdId(Integer acmdId) {
        this.acmdId = acmdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.acmd_name
     *
     * @return the value of accommodation.acmd_name
     *
     * @mbggenerated
     */
    public String getAcmdName() {
        return acmdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.acmd_name
     *
     * @param acmdName the value for accommodation.acmd_name
     *
     * @mbggenerated
     */
    public void setAcmdName(String acmdName) {
        this.acmdName = acmdName == null ? null : acmdName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.longitude
     *
     * @return the value of accommodation.longitude
     *
     * @mbggenerated
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.longitude
     *
     * @param longitude the value for accommodation.longitude
     *
     * @mbggenerated
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.latitude
     *
     * @return the value of accommodation.latitude
     *
     * @mbggenerated
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.latitude
     *
     * @param latitude the value for accommodation.latitude
     *
     * @mbggenerated
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.web_url
     *
     * @return the value of accommodation.web_url
     *
     * @mbggenerated
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.web_url
     *
     * @param webUrl the value for accommodation.web_url
     *
     * @mbggenerated
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.pic_url
     *
     * @return the value of accommodation.pic_url
     *
     * @mbggenerated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.pic_url
     *
     * @param picUrl the value for accommodation.pic_url
     *
     * @mbggenerated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.infrastructures
     *
     * @return the value of accommodation.infrastructures
     *
     * @mbggenerated
     */
    public String getInfrastructures() {
        return infrastructures;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.infrastructures
     *
     * @param infrastructures the value for accommodation.infrastructures
     *
     * @mbggenerated
     */
    public void setInfrastructures(String infrastructures) {
        this.infrastructures = infrastructures == null ? null : infrastructures.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.created_date
     *
     * @return the value of accommodation.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.created_date
     *
     * @param createdDate the value for accommodation.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.modified_date
     *
     * @return the value of accommodation.modified_date
     *
     * @mbggenerated
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.modified_date
     *
     * @param modifiedDate the value for accommodation.modified_date
     *
     * @mbggenerated
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accommodation.facilities
     *
     * @return the value of accommodation.facilities
     *
     * @mbggenerated
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accommodation.facilities
     *
     * @param facilities the value for accommodation.facilities
     *
     * @mbggenerated
     */
    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }
}