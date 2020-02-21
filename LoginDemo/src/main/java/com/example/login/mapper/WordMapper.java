package com.example.login.mapper;

import com.example.login.model.User;
import com.example.login.model.Word;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Author: Zhong
 * Date: 2019-10-9
 * Description:
 */
@Mapper
public interface WordMapper {
    @Select("select * from words limit 10")
    List<Word> words();

}
