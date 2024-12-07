package com.github.dudakrzysztof.jobportal.services;

import com.github.dudakrzysztof.jobportal.entity.JobPostActivity;
import com.github.dudakrzysztof.jobportal.entity.JobSeekerProfile;
import com.github.dudakrzysztof.jobportal.entity.JobSeekerSave;
import com.github.dudakrzysztof.jobportal.repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId){
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job){
        return jobSeekerSaveRepository.findByJob(job);
    }
}
