package org.com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Gaurav on 8/2/19.
 */
public class DrawingApp {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Shape obj = (Triangle) factory.getBean("triangle");
        obj.draw();
    }
}
