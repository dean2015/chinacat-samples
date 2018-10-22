package com.chinacat.boot.starter.web.sample.controller;

import com.chinacat.boot.starter.web.core.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chinacat
 */
@RestController
public class SampleController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String hello(@RequestParam("someone") String someone){
        return "Hello " + someone;
    }

}
