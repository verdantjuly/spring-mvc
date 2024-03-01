package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Htmlcontroller {

    private static  long visitCount = 0;
    @GetMapping("/static-hello")
    public  String hello(){
        return "hello.html";
    }

    @GetMapping("/lala")
    public  String htmlStatic(){
        return "redirect:/hello.html";
    }

    @GetMapping("/mama")
    public  String htmlTemplates(){
        return "hello";
    }

    @GetMapping("/dynamic")
    public  String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
