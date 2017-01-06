package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nikolakaloyanov on 06.01.17.
 */
@RestController
public class Test {
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "PONG1";
    }
}
