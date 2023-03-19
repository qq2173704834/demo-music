package com.example.musicdemo;

import com.example.musicdemo.controller.DefaultController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MusicDemoApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private DefaultController defaultController;
//    @Test
//    public void defaultControllerTest(){
//        String hello = defaultController.sayHello();
//        System.out.println(hello);
//    }
}
