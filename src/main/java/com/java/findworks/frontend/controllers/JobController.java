package com.java.findworks.frontend.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.findworks.backend.data.model.Job;
import com.java.findworks.backend.services.JobService;

@Controller
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/job/{id}")
    public String jobDetail(@PathVariable Long id, Model model) {
        Optional<Job> job = jobService.findById(id);
        model.addAttribute("job", job.get());
        return "job-detail";
    }

}
