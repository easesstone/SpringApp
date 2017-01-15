package com.sydney.dream.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sydney on 2017/1/15.
 */
public class HelloWorldSuite {
    @Test
    public void testSayHello(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hello.xml");
        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
        if (helloWorld.equals(null)) {
            return ;
        }
        helloWorld.sayHello();
    }
}
