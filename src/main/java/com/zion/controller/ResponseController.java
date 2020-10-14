package com.zion.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zion.domain.UserInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jianjiu.xc
 * @version : ResponseController, v 0.1 2020-10-13 22:37 jianjiu.xc Exp $
 */
@Controller
@RequestMapping(path = "/response")
public class ResponseController {

    /**
     * http://localhost:8080/apply/response/string
     *
     * @param model
     * @return
     */
    @RequestMapping(path = "/string")
    public String getStringResult(Model model){

        UserInfoVO userInfoVO = new UserInfoVO();
        userInfoVO.setName("jianjiu");
        userInfoVO.setAge("11");
        userInfoVO.setSex("男");

        model.addAttribute("userInfoVO", userInfoVO);

        return "result";
    }

    /**
     * http://localhost:8080/apply/response/void
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(path = "/void")
    public void getVoidResult(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        System.out.println("getVoidResult");

        // 3 种方法任选其一即可
        // 方法 1：转发请求
        // request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);

        // 方法 2：重定向
        // response.sendRedirect(request.getContextPath() + "/index.jsp");

        // 方法 3：直接进行相应
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("void");
    }
}
