package com.example.login.mapper;

import com.example.login.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Author: Davion
 * Date: 2019-10-9
 * Description:
 */
@Mapper
public interface UserMapper {
    @Select("select * from users where username=#{username}")
    User selectByUsername(String username);

    @Insert("insert into users(username, password) values(#{username}, #{password})")
    void createNewUser(User newUser);
}
