package liv.ac.uk.live_in.mapper;

import java.util.List;
import liv.ac.uk.live_in.dao.Room;
import liv.ac.uk.live_in.dao.RoomExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int countByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int deleteByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer roomTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    List<Room> selectByExampleWithBLOBs(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    Room selectByPrimaryKey(Integer roomTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Room record);
}