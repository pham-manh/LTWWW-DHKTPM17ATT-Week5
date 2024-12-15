package com.java.findworks.frontend.controllers.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

    @GetMapping("/company")
    public String company(Model model) {
        return "company/index";
    }
}
