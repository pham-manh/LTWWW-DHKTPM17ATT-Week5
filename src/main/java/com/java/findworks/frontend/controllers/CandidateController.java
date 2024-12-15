package com.java.findworks.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.findworks.backend.data.model.Candidate;
import com.java.findworks.backend.services.CandidateService;
import com.java.findworks.backend.services.CandidateSkillService;

@Controller
public class CandidateController {

    private final CandidateService candidateService;
    private final CandidateSkillService candidateSkillService;

    public CandidateController(CandidateService candidateService, CandidateSkillService candidateSkillService) {
        this.candidateService = candidateService;
        this.candidateSkillService = candidateSkillService;
    }

    @GetMapping("/candidate")
    public String index(Model model) {
        model.addAttribute("candidates", candidateService.findAllCandidates());
        return "candidate/candidate";
    }

    @GetMapping("/candidate/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateService.findAllCandidates());
        return "candidate/candidate-list";
    }

    @GetMapping("/candidate/{id}")
    public String showCandidate(@PathVariable("id") long id, Model model) {
        model.addAttribute("candidate", candidateService.findCandidateById(id).get());
        model.addAttribute("skills", candidateSkillService.findSkillsByCandidateId(id));
        return "candidate/candidate";
    }

    @GetMapping("/candidate/edit/{id}")
    public String editCandidate(@PathVariable("id") String id, Model model) {
        Long longId = Long.parseLong(id);
        model.addAttribute("candidate", candidateService.findCandidateById(longId).get());
        return "candidate/edit-candidate";
    }

    @PostMapping("/candidate/edit")
    public String updateCandidate(Candidate candidate) {
        candidateService.saveCandidate(candidate);
        return "redirect:/candidate/" + candidate.getId();
    }
}
