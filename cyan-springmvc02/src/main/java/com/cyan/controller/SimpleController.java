package com.cyan.controller;

import com.cyan.exception.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("userView");
        modelAndView.addObject("name","cyan");
        if(request.getParameter("name").length() < 2){
            //throw new ResponseStatusException();
            throw new IllegalArgumentException("名称不能少于2个字符");
        }
        int i = 1/0;
        return modelAndView;
    }
}
