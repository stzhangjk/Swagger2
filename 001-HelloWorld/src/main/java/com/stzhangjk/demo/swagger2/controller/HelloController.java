package com.stzhangjk.demo.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhjk on 2017/9/15.
 */
@Api
@RestController
public class HelloController {
    @ApiOperation("/hello")
    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
