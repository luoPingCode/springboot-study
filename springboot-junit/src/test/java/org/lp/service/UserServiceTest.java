package org.lp.service;



import org.junit.jupiter.api.Test;
import org.lp.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/18 17:34
 */
@SpringBootTest(classes = Main.class)//springboot测试类
//@RunWith(SpringRunner.class)//junit 框架整合
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void test(){
        userService.addUser();
    }
}
