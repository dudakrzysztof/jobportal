package com.github.dudakrzysztof.jobportal.repository;

import com.github.dudakrzysztof.jobportal.entity.JobPostActivity;
import com.github.dudakrzysztof.jobportal.entity.JobSeekerProfile;
import com.github.dudakrzysztof.jobportal.entity.JobSeekerSave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
