package org.example;

import org.example.pojos.ADependent;
import org.example.pojos.Employee;
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
        ApplicationContext ioc=new ClassPathXmlApplicationContext("dependencyInjection.xml");
//        Employee obj=(Employee) ioc.getBean("employee");
        ADependent obj=(ADependent) ioc.getBean("a2");
        System.out.println("Test");
        obj.display();
    }
}
