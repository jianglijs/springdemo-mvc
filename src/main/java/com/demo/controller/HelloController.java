package com.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/mvc")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name,@RequestParam(value = "age",required=false)Double age){       
        return "hello name = "+name;
    }
    
    
    @RequestMapping("/world")
    public ModelAndView helloWorld() { 
        String message = "Hello World, Spring 3.x!";
        return new ModelAndView("hello", "message", message);
    }
    
    
    @RequestMapping(value ="/json",produces="application/json;charset=utf-8")
    @ResponseBody
    public String load1(@RequestParam String name,@RequestParam String password) throws IOException{
        System.out.println(name+" : "+password);  
        //return name+" : "+password;
        MyDog dog=new MyDog();
        dog.setName("Ð¡¹þ");
        dog.setAge("1Ëê");
        dog.setColor("Éî»Ò");
    
        String jsonString=  JSON.toJSONString(dog);
        System.out.println(jsonString);
        return jsonString;
    }
    
    //boxing automatically
    @RequestMapping("/person1")
    public String toPerson(Person p){
        System.out.println(p.getName()+" "+p.getAge());
        return "hello";
    }
}