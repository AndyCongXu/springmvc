package com.zion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jianjiu.xc
 * @version : HelloController, v 0.1 2020-10-13 07:13 jianjiu.xc Exp $
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/sayHello")
    public String sayHello(){
        System.out.println("sayHello");
        return "sayHello";
    }
}
