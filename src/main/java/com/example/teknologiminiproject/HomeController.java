package com.example.teknologiminiproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "/index";
    }
    @GetMapping("/område1")
    public String område1(){
        return "/område1";
    }
    @GetMapping("/område2")
    public String område2(){
        return "/område2";
    }
    @GetMapping("/område3")
    public String område3(){
        return "/område3";
    }
    @GetMapping("/område4")
    public String område4(){
        return "/område4";
    }
    @GetMapping("/webservice")
    public String webservice(){
        return "/webservice";
    }
    @GetMapping("/useWebservice")
    public String useWebservice(){


        return "/webservice";

    }

}
