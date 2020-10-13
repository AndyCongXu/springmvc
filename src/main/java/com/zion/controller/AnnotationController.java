package com.zion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jianjiu.xc
 * @version : AnnotationController, v 0.1 2020-10-13 20:09 jianjiu.xc Exp $
 */
@Controller
@RequestMapping(path = "/annotation")
public class AnnotationController {

    /**
     * RequestParam 注解的作用：URL 参数和控制器入参可以解耦
     * 测试串：http://localhost:8080/apply//annotation/requestParam?nick=jj
     *
     * @param name
     * @return
     */
    @RequestMapping(path = "/requestParam")
    public String testRequestParamAnnotation(
        @RequestParam(value = "nick", required = false) String name){

        System.out.println(name);

        return "success";
    }

    /**
     * RequestBody 注解的作用：获取整个URL请求的body 内容，不适用 get 方法
     * 测试串：body 体给定的参数为：
     * name=22
     * age=333
     *
     * @param body
     * @return
     */
    @RequestMapping(path = "/requestBody")
    public String testRequestBodyAnnotation(@RequestBody String body){

        /**
         * 输出结果为：name=22&age=333
         */
        System.out.println(body);

        return "success";
    }
}
