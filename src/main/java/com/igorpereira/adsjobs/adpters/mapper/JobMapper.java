package com.igorpereira.adsjobs.adpters.mapper;

import com.igorpereira.adsjobs.adpters.dto.JobDTO;
import com.igorpereira.adsjobs.domain.entity.Job;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JobMapper {

    JobMapper INSTANCE = Mappers.getMapper(JobMapper.class);

    Job toModel(JobDTO jobDTO);

    JobDTO toDto(Job job);
}
