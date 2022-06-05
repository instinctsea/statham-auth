package com.hms.auth.provider.controller;

import com.hms.auth.common.ResponseDto;
import com.hms.auth.dao.single.SystemResourceMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    SystemResourceMapper resourceMapper;
    @RequestMapping("login")
    public ResponseDto<String> login(){
        int count=resourceMapper.getCount();
        return ResponseDto.success("welcome");
    }
}
