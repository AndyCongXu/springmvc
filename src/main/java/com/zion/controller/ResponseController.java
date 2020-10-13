package com.zion.controller;

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
}
