package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // 자바 객체를 반환하면 자동으로 json 형태로 변환해 준다.
    @GetMapping("/json/class")
    @ResponseBody
    public  Star helloClassJson(){
        return new Star("dayoung", 30);
    }
}


