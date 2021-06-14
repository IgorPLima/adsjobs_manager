package com.igorpereira.adsjobs.adpters.db.jparepository;

import com.igorpereira.adsjobs.domain.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Job, Long> {


}
