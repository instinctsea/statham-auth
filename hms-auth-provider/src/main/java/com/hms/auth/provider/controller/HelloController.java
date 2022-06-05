package com.hms.auth.provider.controller;

import com.hms.auth.common.ResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("hi")
    public ResponseDto<String> hi(){
        return ResponseDto.success("hello");
    }
}
