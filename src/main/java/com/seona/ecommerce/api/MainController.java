package com.seona.ecommerce.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class MainController {
    @GetMapping(value = "/hi")
    public String main() {
        return "/main-page";
    }
}
