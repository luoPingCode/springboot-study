package org.elp;

import org.elp.dao.UserDao;
import org.elp.dao.UserDaoXml;
import org.elp.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/18 18:08
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    UserDao userDao;

    @Autowired
    UserDaoXml userDaoXml;

    @Test
    public void getUsers(){
//        List<User> userList = userDao.findAll();
        List<User> userDaoXmlAll = userDaoXml.findAll();
        System.out.println(userDaoXmlAll);
    }
}
