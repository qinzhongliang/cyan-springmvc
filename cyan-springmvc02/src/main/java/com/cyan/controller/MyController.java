package com.cyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "myController")
public class MyController {
    @RequestMapping(value = "hello")
    public void hello(HttpServletResponse response, String name)throws IOException {
        response.getWriter().println("hello "+name);
    }
}
