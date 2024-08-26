package com.github.dudakrzysztof.jobportal.repository;

import com.github.dudakrzysztof.jobportal.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}
