package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping (path =  "/showView" , method = RequestMethod.GET)
    public ModelAndView showView() {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName( "viewName" );
       modelAndView.addObject( " ��Ҫ�ŵ� model �е��������� " , " ��Ӧ������ֵ������һ������ " );
       return modelAndView;
    }

} 