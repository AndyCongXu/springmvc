package com.zion.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zion.domain.UserInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jianjiu.xc
 * @version : ParamsController, v 0.1 2020-10-13 10:54 jianjiu.xc Exp $
 */
@Controller
@RequestMapping(path = "/param")
public class ParamsController {

    /**
     * 测试程序：http://localhost:8080/apply/param/getParams?userName=jianjiu
     *
     * @param userName  URL 中的这个字段必须和参数一致
     * @return
     */
    @RequestMapping(path = "/getParams")
    public String getParams(String userName){
        System.out.println("参数解析");
        System.out.println(userName);
        return "sayHello";
    }

    /**
     * 测试程序：
     * http://localhost:8080/apply/param/getMultiParams?name=jianjiu&age=20&sex=gg
     * http://localhost:8080/apply/param/getMultiParams?name=jianjiu&age=20&sex=gg&subUserInfo.nick=jj&subUserInfo.staffId=1
     *
     * 注意 URL 中的入参必须和 UserInfoVO 的名字一致
     *
     * @param userInfoVO
     * @return
     */
    @RequestMapping(path = "/getMultiParams")
    public String getMultiParams(UserInfoVO userInfoVO) {
        System.out.println("参数解析");
        System.out.println(userInfoVO.toString());
        return "sayHello";
    }

    @RequestMapping(path = "/getServletParams")
    public String getServletParams(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        System.out.println(request.getParameter("name"));
        return "sayHello";
    }

}
