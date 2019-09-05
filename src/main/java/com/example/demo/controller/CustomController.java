package com.example.demo.controller;

import com.example.demo.web.rest.CustomApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class CustomController implements CustomApi {
}
