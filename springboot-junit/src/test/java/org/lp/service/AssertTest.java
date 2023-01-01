package org.lp.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.junit.JUnitRule;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/22 17:28
 */

public class AssertTest {
    public static void main(String[] args) {

    }
}
class AssertTest1{
    String t1 = "hello";
    String t2 = "world";
    int num1 = 1;
    int num2 = 2;
    int[] arr1 = new int[]{1, 2, 3};
    int[] arr2 = new int[]{1, 2, 3};
    double dnum1 = 1.0;
    double dnum2 = 1.9;
    Object ob1 = null;
    Object ob2 = "hahaha";


    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testAssertEquals() {
        //fail("Not yet implemented");
        assertEquals(num1, num1);//num1和num1相等
        assertNotEquals(num1, num2); //num1和num2不相等
        assertEquals(dnum1, dnum2, 1.0); //dnum1和dnum2的误差为0.9在范围在1.0之内
    }

    @Test
    void testAssertTrue() {
        assertTrue(num1 != num2);//num1!=num2为true
        assertFalse(num1 == num2);//num1==num2为false
    }

    @Test
    void testAssertSame() {
        assertSame(t1, t1); //t1和t1引用同一对象
        assertNotSame(t1, t2); //t1和t2引用不同对象
    }

    @Test
    void testAssertArrayEquals() {
        assertArrayEquals(arr1, arr2); //arr1和arr2的数组内容相同
    }

    @Test
    void testAssertNull() {
        assertNull(ob1); //ob1为null
        assertNotNull(ob2); //ob2不空
    }
}

