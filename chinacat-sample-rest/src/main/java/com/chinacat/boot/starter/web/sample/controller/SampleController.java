package com.chinacat.boot.starter.web.sample.controller;

import com.chinacat.boot.model.response.RestResponse;
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

    @RequestMapping(value="/hello1", method= RequestMethod.GET)
    public RestResponse<String> hello1(@RequestParam("someone") String someone){
        return RestResponse.<String>newInstance().success("Success", "Hello " + someone);
    }

}
