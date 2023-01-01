package org.elp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.elp.pojo.User;

import java.util.List;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/18 18:03
 */
@Mapper
public interface UserDao {

    @Select("select * from user")
    public List<User> findAll();
}
