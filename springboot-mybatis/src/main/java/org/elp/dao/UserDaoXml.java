package org.elp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.elp.pojo.User;

import java.util.List;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/18 19:51
 */
@Mapper
public interface UserDaoXml {
    List<User> findAll();
}
