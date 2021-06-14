package com.igorpereira.adsjobs.adpters.api.controllers;

import com.igorpereira.adsjobs.adpters.dto.MessageResponseDTO;
import com.igorpereira.adsjobs.adpters.service.JobService;
import com.igorpereira.adsjobs.domain.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobController {

    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Job job) {
        return jobService.create(job);
    }
}
