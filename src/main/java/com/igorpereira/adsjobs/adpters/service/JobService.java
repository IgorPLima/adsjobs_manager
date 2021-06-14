package com.igorpereira.adsjobs.adpters.service;

import com.igorpereira.adsjobs.adpters.db.jparepository.JobsRepository;
import com.igorpereira.adsjobs.adpters.dto.MessageResponseDTO;
import com.igorpereira.adsjobs.domain.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private JobsRepository jobsRepository;

    @Autowired
    public JobService(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    public MessageResponseDTO create(Job job) {
        Job savedJob = jobsRepository.save(job);
        return MessageResponseDTO.builder()
                .message("Job created with ID" + savedJob.getId())
                .build();
    }
}
