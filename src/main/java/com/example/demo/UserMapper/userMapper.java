package com.example.demo.UserMapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {
//    @Insert("""
//            insert into `user`(id,username,password,age,created)
//            values (#{id},#{username},#{password},#{age},#{created})
//            """)
    int insertUser(User user);

    /*
    delete from user
        where id=#{id}
     */
    int deleteUser(Integer id);

//    int updateUser();

}
