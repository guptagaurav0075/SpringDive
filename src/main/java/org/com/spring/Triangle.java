package org.com.spring;

/**
 * Created by Gaurav on 8/2/19.
 */
public class Triangle implements Shape{
    String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(getType() + " Triangle is drawn");
    }
}
