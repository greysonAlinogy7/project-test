package com.Tn316;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello controller cicd";
    }

    @RequestMapping("/another")
    public  String hell(){
        return "this is another one";
    }
}
