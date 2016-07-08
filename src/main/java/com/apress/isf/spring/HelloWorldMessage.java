package com.apress.isf.spring;

/**
 * Created by james on 7/8/2016.
 */
public class HelloWorldMessage implements MessageService {
    public String getMessage() {
        return "Hello World";
    }
}
