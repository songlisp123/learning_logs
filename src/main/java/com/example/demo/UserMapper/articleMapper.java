package com.example.demo.UserMapper;

import com.example.demo.pojo.Article;
import com.example.demo.pojo.articleVO1;
import org.apache.ibatis.annotations.*;

@Mapper
public interface articleMapper {
//    @Insert("""
//            insert into article(
//            id,
//            content,
//            created,
//            user_id
//            )
//            values (
//            #{id},
//            #{content},
//            #{Timestamp},
//            #{userId}
//            )
//            """)

    int insertArticle(Article article);

//    @Delete("""
//            delete from article
//            where id=#{id}
//            """)
    int deleteArticle(Integer id);

//    @Update("""
//            update article
//            set content=#{content},
//            created=#{Timestamp},
//            user_id=#{userId}
//            where id=#{id}
//            """)
    int updateArticleById(Article article);

//    @Select("""
//            select id,content,created as TimeStamp ,user_id as userId from article
//              WHERE id = #{id}
//            """)
    Article selectVyId(Integer id);

//    @Select("""
//            select id,content,created as TimeStamp ,
//            user_id as userId
//            from article
//            """)
    Article[] selectAllArticle();

//    @Select("""
//            select content,
//            created as TimeStamp,
//            user_id as userID
//            from article
//            where id=#{id}
//            """)
    articleVO1 selectArticleById(Integer id);

//    @Select("""
//            select content,
//            created as timeStamp,
//            user_id as userId
//            from article
//            """)
    articleVO1[] selectArticleByIdV2();

    //动态修改方法
    int dynamicUpdateArticle(Article article);

    //批量删除
    int dynamicDeleteArticle(Integer...ids);

}
