package liv.ac.uk.live_in.dao;

import liv.ac.uk.live_in.page.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public RoomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAcmdIdIsNull() {
            addCriterion("acmd_id is null");
            return (Criteria) this;
        }

        public Criteria andAcmdIdIsNotNull() {
            addCriterion("acmd_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcmdIdEqualTo(Integer value) {
            addCriterion("acmd_id =", value, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdNotEqualTo(Integer value) {
            addCriterion("acmd_id <>", value, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdGreaterThan(Integer value) {
            addCriterion("acmd_id >", value, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("acmd_id >=", value, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdLessThan(Integer value) {
            addCriterion("acmd_id <", value, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdLessThanOrEqualTo(Integer value) {
            addCriterion("acmd_id <=", value, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdIn(List<Integer> values) {
            addCriterion("acmd_id in", values, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdNotIn(List<Integer> values) {
            addCriterion("acmd_id not in", values, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdBetween(Integer value1, Integer value2) {
            addCriterion("acmd_id between", value1, value2, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("acmd_id not between", value1, value2, "acmdId");
            return (Criteria) this;
        }

        public Criteria andAcmdNameIsNull() {
            addCriterion("acmd_name is null");
            return (Criteria) this;
        }

        public Criteria andAcmdNameIsNotNull() {
            addCriterion("acmd_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcmdNameEqualTo(String value) {
            addCriterion("acmd_name =", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameNotEqualTo(String value) {
            addCriterion("acmd_name <>", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameGreaterThan(String value) {
            addCriterion("acmd_name >", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameGreaterThanOrEqualTo(String value) {
            addCriterion("acmd_name >=", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameLessThan(String value) {
            addCriterion("acmd_name <", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameLessThanOrEqualTo(String value) {
            addCriterion("acmd_name <=", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameLike(String value) {
            addCriterion("acmd_name like", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameNotLike(String value) {
            addCriterion("acmd_name not like", value, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameIn(List<String> values) {
            addCriterion("acmd_name in", values, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameNotIn(List<String> values) {
            addCriterion("acmd_name not in", values, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameBetween(String value1, String value2) {
            addCriterion("acmd_name between", value1, value2, "acmdName");
            return (Criteria) this;
        }

        public Criteria andAcmdNameNotBetween(String value1, String value2) {
            addCriterion("acmd_name not between", value1, value2, "acmdName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(Integer value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(Integer value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(Integer value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(Integer value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(Integer value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<Integer> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<Integer> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(Integer value1, Integer value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(Integer value1, Integer value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("modified_date is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("modified_date =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("modified_date <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("modified_date >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_date >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("modified_date <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("modified_date <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("modified_date in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("modified_date not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("modified_date between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("modified_date not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Boolean value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Boolean value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Boolean value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Boolean value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Boolean> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Boolean> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andTenancyIsNull() {
            addCriterion("tenancy is null");
            return (Criteria) this;
        }

        public Criteria andTenancyIsNotNull() {
            addCriterion("tenancy is not null");
            return (Criteria) this;
        }

        public Criteria andTenancyEqualTo(String value) {
            addCriterion("tenancy =", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotEqualTo(String value) {
            addCriterion("tenancy <>", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyGreaterThan(String value) {
            addCriterion("tenancy >", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyGreaterThanOrEqualTo(String value) {
            addCriterion("tenancy >=", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyLessThan(String value) {
            addCriterion("tenancy <", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyLessThanOrEqualTo(String value) {
            addCriterion("tenancy <=", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyLike(String value) {
            addCriterion("tenancy like", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotLike(String value) {
            addCriterion("tenancy not like", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyIn(List<String> values) {
            addCriterion("tenancy in", values, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotIn(List<String> values) {
            addCriterion("tenancy not in", values, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyBetween(String value1, String value2) {
            addCriterion("tenancy between", value1, value2, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotBetween(String value1, String value2) {
            addCriterion("tenancy not between", value1, value2, "tenancy");
            return (Criteria) this;
        }

        public Criteria andInfoUrlIsNull() {
            addCriterion("info_url is null");
            return (Criteria) this;
        }

        public Criteria andInfoUrlIsNotNull() {
            addCriterion("info_url is not null");
            return (Criteria) this;
        }

        public Criteria andInfoUrlEqualTo(String value) {
            addCriterion("info_url =", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlNotEqualTo(String value) {
            addCriterion("info_url <>", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlGreaterThan(String value) {
            addCriterion("info_url >", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("info_url >=", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlLessThan(String value) {
            addCriterion("info_url <", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlLessThanOrEqualTo(String value) {
            addCriterion("info_url <=", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlLike(String value) {
            addCriterion("info_url like", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlNotLike(String value) {
            addCriterion("info_url not like", value, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlIn(List<String> values) {
            addCriterion("info_url in", values, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlNotIn(List<String> values) {
            addCriterion("info_url not in", values, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlBetween(String value1, String value2) {
            addCriterion("info_url between", value1, value2, "infoUrl");
            return (Criteria) this;
        }

        public Criteria andInfoUrlNotBetween(String value1, String value2) {
            addCriterion("info_url not between", value1, value2, "infoUrl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}