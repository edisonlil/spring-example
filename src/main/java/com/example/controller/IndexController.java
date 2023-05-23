package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author edison
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    String index(){
        return "index";
    }

}
