package org.example;

import org.example.pojos.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("config.xml");
        Student obj=(Student) ioc.getBean("student");
        System.out.print(obj.toString());
    }
}
