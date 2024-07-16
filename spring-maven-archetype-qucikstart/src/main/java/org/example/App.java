package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        //container got changed to AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop = (Desktop)context.getBean("desktop");
        desktop.compile();

        Employee emp = (Employee) context.getBean("employee");
        emp.code();
        System.out.println(emp.getAge());


        PrototypeEmployee emp1 = (PrototypeEmployee) context.getBean("prototypeEmployee");
        emp1.age = 20;
        emp1.code();
        System.out.println(emp1.age);

        PrototypeEmployee emp2 = (PrototypeEmployee) context.getBean("prototypeEmployee");
        emp2.age = 10;
        emp2.code();
        System.out.println(emp2.age);









        /* xml based configuration code execution part */
        /*ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Employee emp = (Employee) context.getBean("employee1");
        emp.code();
        System.out.println(emp.getAge());

        Employee empp = (Employee) context.getBean("employee2");
        empp.code();
        System.out.println(empp.getAge());

        Employee emppp = (Employee) context.getBean("employee3");
        emppp.code();
        System.out.println(emppp.getAge());


        //----------------------------------------------------------------------------------------------------
        //here prototype employee bean get loaded by the container during getBean call because scope is prototype.
        PrototypeEmployee emp1 = (PrototypeEmployee) context.getBean("prototypeEmployee");
        emp1.age = 20;
        emp1.code();
        System.out.println(emp1.age);

        PrototypeEmployee emp2 = (PrototypeEmployee) context.getBean("prototypeEmployee");
        emp2.age = 10;
        emp2.code();
        System.out.println(emp2.age);*/
    }
}
