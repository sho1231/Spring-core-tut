package org.example;

import org.example.pojos.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext ioc=new ClassPathXmlApplicationContext("constructorInjection.xml");
//        Addition obj=(Addition) ioc.getBean("add2");
//        ADependent obj=(ADependent) ioc.getBean("student");
//        System.out.println(obj);
//        obj.display();
        AbstractApplicationContext ioc2=new ClassPathXmlApplicationContext("lifeCycle.xml");
        ioc2.registerShutdownHook();
       BDependency obj= (BDependency)ioc2.getBean("b");
       obj.display();

    }
}
