package com.github.dudakrzysztof.jobportal.repository;

import com.github.dudakrzysztof.jobportal.entity.JobPostActivity;
import com.github.dudakrzysztof.jobportal.entity.JobSeekerApply;
import com.github.dudakrzysztof.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
