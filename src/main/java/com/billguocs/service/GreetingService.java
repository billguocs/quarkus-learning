package com.billguocs.service;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author billg
 */
@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name;
    }

}
