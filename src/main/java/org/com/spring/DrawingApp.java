package org.com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Gaurav on 8/2/19.
 */
public class DrawingApp {
    public static void main(String[] args) {
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Shape obj = (Triangle) factory.getBean("triangle_equilateral");
        obj.draw();
        obj = (Triangle) factory.getBean("triangle_isosceles");
        obj.draw();
        obj = (Triangle) factory.getBean("triangle_scaline");
        obj.draw();
        obj = (Circle) factory.getBean("circle");
        obj.draw();
    }
}
