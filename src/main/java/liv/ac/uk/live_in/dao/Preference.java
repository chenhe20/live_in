package liv.ac.uk.live_in.dao;

import java.util.Date;

/**
 * preferencedao object
 * 
 **/
public class Preference {
    /**
     *
     */
    private Integer id;

    /**  */
    private Date sleepingTime;

    /** Willing to share the kitchen is 1, otherwise 0 */
    private Boolean shareKitchen;

    /** Roommate same gender constraint 1, otherwise 0 */
    private Boolean sameGenderConstraint;

    /**  */
    private Date createdDate;

    /**  */
    private Date modifiedDate;

    /** Deleted is 1, otherwise 0 */
    private Boolean deleteStatus;

    /**  */
    private String hobby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.id
     *
     * @return the value of preference.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.id
     *
     * @param id the value for preference.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.sleeping_time
     *
     * @return the value of preference.sleeping_time
     *
     * @mbggenerated
     */
    public Date getSleepingTime() {
        return sleepingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.sleeping_time
     *
     * @param sleepingTime the value for preference.sleeping_time
     *
     * @mbggenerated
     */
    public void setSleepingTime(Date sleepingTime) {
        this.sleepingTime = sleepingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.share_kitchen
     *
     * @return the value of preference.share_kitchen
     *
     * @mbggenerated
     */
    public Boolean getShareKitchen() {
        return shareKitchen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.share_kitchen
     *
     * @param shareKitchen the value for preference.share_kitchen
     *
     * @mbggenerated
     */
    public void setShareKitchen(Boolean shareKitchen) {
        this.shareKitchen = shareKitchen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.same_gender_constraint
     *
     * @return the value of preference.same_gender_constraint
     *
     * @mbggenerated
     */
    public Boolean getSameGenderConstraint() {
        return sameGenderConstraint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.same_gender_constraint
     *
     * @param sameGenderConstraint the value for preference.same_gender_constraint
     *
     * @mbggenerated
     */
    public void setSameGenderConstraint(Boolean sameGenderConstraint) {
        this.sameGenderConstraint = sameGenderConstraint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.created_date
     *
     * @return the value of preference.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.created_date
     *
     * @param createdDate the value for preference.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.modified_date
     *
     * @return the value of preference.modified_date
     *
     * @mbggenerated
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.modified_date
     *
     * @param modifiedDate the value for preference.modified_date
     *
     * @mbggenerated
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.delete_status
     *
     * @return the value of preference.delete_status
     *
     * @mbggenerated
     */
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.delete_status
     *
     * @param deleteStatus the value for preference.delete_status
     *
     * @mbggenerated
     */
    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column preference.hobby
     *
     * @return the value of preference.hobby
     *
     * @mbggenerated
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column preference.hobby
     *
     * @param hobby the value for preference.hobby
     *
     * @mbggenerated
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }
}