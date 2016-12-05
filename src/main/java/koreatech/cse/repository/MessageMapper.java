package koreatech.cse.repository;

import koreatech.cse.domain.Message;
import koreatech.cse.domain.Notice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by seo on 2016-12-05.
 */
@Repository
public interface MessageMapper {

    @Insert("INSERT INTO message (send_id, receive_id, content, send_time, send_name) VALUES (#{sendId}, #{receiveId}, #{content}, #{sendTime}, #{sendName})")
    void insert(Message message);

    @Update("UPDATE message SET send_id = #{sendId}, receive_id = #{receiveId}, content = #{content}, send_time = #{sendTime}, send_name = #{sendName} WHERE id = #{id}")
    void update(Message message);

    @Select("SELECT * FROM message WHERE id = #{id}")
    Message findOne(@Param("id") int id);

    @Select("SELECT * FROM message")
    List<Message> findAll();

    @Select("SELECT * FROM message WHERE receive_id = #{id}")
    List<Message> findMessageByReceivedId(@Param("id") int id);
}
