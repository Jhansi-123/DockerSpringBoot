package com.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/docker")
    public String getinfo(){
        return "This is a spring boot docker job!!";
    }
    @GetMapping("/msg")
    	public String getmessage() {
    		return "Message to you";
    	}
    }

