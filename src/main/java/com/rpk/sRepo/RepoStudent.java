package com.rpk.sRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpk.studtls.StudentRegistratin;

public interface RepoStudent extends JpaRepository<StudentRegistratin, Integer> {

}
