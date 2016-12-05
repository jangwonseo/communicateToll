package koreatech.cse.repository;

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
public interface NoticeMapper {

    @Insert("INSERT INTO notice_list (title, content, date, writer_user_name) VALUES (#{title}, #{content}, #{date}, #{writerUserName})")
    void insert(Notice notice);

    @Update("UPDATE notice_list SET title = #{title}, content = #{content}, date = #{date}, writer_user_name = #{writerUserName} WHERE ID = #{id}")
    void update(Notice notice);

    @Select("SELECT * FROM notice_list WHERE id = #{id}")
    Notice findOne(@Param("id") int id);

    @Select("SELECT * FROM notice_list")
    List<Notice> findAll();
}
