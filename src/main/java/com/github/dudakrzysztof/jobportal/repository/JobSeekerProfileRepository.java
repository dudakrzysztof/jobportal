package com.github.dudakrzysztof.jobportal.repository;

import com.github.dudakrzysztof.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository  extends JpaRepository<JobSeekerProfile, Integer> {
}
