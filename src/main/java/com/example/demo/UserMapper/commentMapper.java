package com.example.demo.UserMapper;

import com.example.demo.pojo.comment;
import com.example.demo.pojo.commentVO02;
import com.example.demo.pojo.commentVO1;
import org.apache.ibatis.annotations.*;

@Mapper
public interface commentMapper {

//    @Insert("""
//            insert into comment(
//            id,
//            article_id,
//            content,
//            created,
//            user_id
//            )
//            values (
//            #{id},
//            #{articleId},
//            #{content},
//            #{timeStamp},
//            #{userId}
//            )
//            """)
    int insertComment(comment comment);

//    @Delete("""
//            delete from comment
//            where id = #{id}
//            """)
    int deleteByID(Integer id);

//    @Update("""
//            update comment
//            set content=#{content}
//            where id = #{id}
//            """)
    int updateById(comment comment);

//    @Select("""
//            select id,content,
//            user_id as userId,
//            article_id as articleId
//            from comment
//            where id = #{id}
//            """)
    commentVO1 selectCommentById1(Integer id);

//    @Select("""
//            select a.id as articleId,c.content,c.user_id as userId
//            from comment as c,
//            article as a
//            where a.id = c.article_id
//            and a.id = #{id}
//            """)
    commentVO02[] selectCommentById2(Integer id);

//    @Select("""
//            select id,article_id as articleId,
//            content,
//            created as timeStamp,
//            user_id as userId
//            from comment
//            where id = #{id}
//            """)
    comment selectById(Integer id);
}
