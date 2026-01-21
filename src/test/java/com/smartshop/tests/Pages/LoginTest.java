package com.smartshop.tests.Pages;


import com.smartshop.tests.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
public void  OpenHomePage(){
    System.out.println("Test running Page 1 successfully :" + Thread.currentThread().getId());

}
    @Test
    public void  OpenHomePage2(){
        System.out.println("Test running Page 2 successfully :" + Thread.currentThread().getId());

    }
    @Test
    public void  OpenHomePage3(){
        System.out.println("Test running Page 3 successfully :" + Thread.currentThread().getId());

    }
}
