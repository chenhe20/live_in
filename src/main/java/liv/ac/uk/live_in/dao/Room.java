package liv.ac.uk.live_in.dao;

import java.util.Date;

/**
 * roomdao object
 * 
 **/
public class Room {
    /**  */
    private Integer roomTypeId;

    /**  */
    private String acmdId;

    /**  */
    private String acmdName;

    /**  */
    private String roomType;

    /** Rent per week */
    private String rent;

    /**  */
    private Date createdDate;

    /**  */
    private Date modifiedDate;

    /** Deleted is 1, otherwise 0 */
    private Boolean deleteStatus;

    /**  */
    private String imageUrl;

    /** Tenancy term */
    private String term;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_type_id
     *
     * @return the value of room.room_type_id
     *
     * @mbggenerated
     */
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_type_id
     *
     * @param roomTypeId the value for room.room_type_id
     *
     * @mbggenerated
     */
    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.acmd_id
     *
     * @return the value of room.acmd_id
     *
     * @mbggenerated
     */
    public String getAcmdId() {
        return acmdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.acmd_id
     *
     * @param acmdId the value for room.acmd_id
     *
     * @mbggenerated
     */
    public void setAcmdId(String acmdId) {
        this.acmdId = acmdId == null ? null : acmdId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.acmd_name
     *
     * @return the value of room.acmd_name
     *
     * @mbggenerated
     */
    public String getAcmdName() {
        return acmdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.acmd_name
     *
     * @param acmdName the value for room.acmd_name
     *
     * @mbggenerated
     */
    public void setAcmdName(String acmdName) {
        this.acmdName = acmdName == null ? null : acmdName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_type
     *
     * @return the value of room.room_type
     *
     * @mbggenerated
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_type
     *
     * @param roomType the value for room.room_type
     *
     * @mbggenerated
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.rent
     *
     * @return the value of room.rent
     *
     * @mbggenerated
     */
    public String getRent() {
        return rent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.rent
     *
     * @param rent the value for room.rent
     *
     * @mbggenerated
     */
    public void setRent(String rent) {
        this.rent = rent == null ? null : rent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.created_date
     *
     * @return the value of room.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.created_date
     *
     * @param createdDate the value for room.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.modified_date
     *
     * @return the value of room.modified_date
     *
     * @mbggenerated
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.modified_date
     *
     * @param modifiedDate the value for room.modified_date
     *
     * @mbggenerated
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.delete_status
     *
     * @return the value of room.delete_status
     *
     * @mbggenerated
     */
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.delete_status
     *
     * @param deleteStatus the value for room.delete_status
     *
     * @mbggenerated
     */
    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.image_url
     *
     * @return the value of room.image_url
     *
     * @mbggenerated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.image_url
     *
     * @param imageUrl the value for room.image_url
     *
     * @mbggenerated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.term
     *
     * @return the value of room.term
     *
     * @mbggenerated
     */
    public String getTerm() {
        return term;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.term
     *
     * @param term the value for room.term
     *
     * @mbggenerated
     */
    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }
}