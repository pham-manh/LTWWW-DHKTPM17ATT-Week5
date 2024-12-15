package com.java.findworks.frontend.controllers;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.findworks.backend.data.model.Job;
import com.java.findworks.backend.services.JobService;

@Controller
public class HomeController {

    private final JobService jobService;

    public HomeController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "0") int page) {
        int pageSize = 9; // Set the page size to 9
        Page<Job> jobPage = jobService.findPaginated(page, pageSize);
        model.addAttribute("jobs", jobPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", jobPage.getTotalPages());
        return "index";
    }
}
