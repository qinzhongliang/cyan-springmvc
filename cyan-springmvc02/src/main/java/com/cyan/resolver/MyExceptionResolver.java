package com.cyan.resolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView("error");
        if(e instanceof IllegalAccessException){
            modelAndView.addObject("errorType","非法参数异常");
        }else{
            modelAndView.addObject("errorType",e.getClass().getSimpleName());
        }
        modelAndView.addObject("message",e.getMessage());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e.printStackTrace(new PrintStream(byteArrayOutputStream,true));
        modelAndView.addObject("stack",byteArrayOutputStream.toString());
        return modelAndView;
    }
}
