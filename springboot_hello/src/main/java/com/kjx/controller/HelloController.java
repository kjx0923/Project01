package com.kjx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * kjx
 */@RestController
public class HelloController {

     @RequestMapping(value = "/hello")
     public  Map hello() {
         Map map = new HashMap();
         map.put("msg","hello spring boot");
         map.put("name","康佳兴");
         map.put("age",18);
         map.put("addr","河北保定市");
         return map;
     }
}
