package com.github.dudakrzysztof.jobportal.repository;


import com.github.dudakrzysztof.jobportal.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {
}
