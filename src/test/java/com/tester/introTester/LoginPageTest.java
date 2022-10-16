package com.tester.introTester;

import org.junit.Test;
import sun.rmi.runtime.Log;

public class LoginPageTest extends PageTest{


    @Test
    public void login(){
        new LoginPage(driver).login("deneme@gmail.com","deneme123");
    }

}
