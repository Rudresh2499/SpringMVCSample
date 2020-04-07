/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelclasses.LoginDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import serviceclasses.LoginService;

/**
 *
 * @author RUDRESH PATEL
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/Login",method = RequestMethod.POST)
    public ModelAndView loginCheck(HttpServletRequest request,HttpServletResponse response)
    {
        ModelAndView loginPage = new ModelAndView();
        boolean loginFlag;
        LoginDetails userDetails = new LoginDetails(request.getParameter("username"),request.getParameter("password"));
        loginFlag = new LoginService().loginCheck(userDetails);
        if(loginFlag)
        {
            loginPage.setViewName("LoginPage.jsp");
            loginPage.addObject("username",userDetails.getUsername());
        }
        else
        {
            loginPage.setViewName("index.jsp");
        }
        return loginPage;
    }
}
