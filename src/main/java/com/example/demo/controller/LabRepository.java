package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {
	@Query(value = "select * from mdl_ctx_lab where active_ind=1", nativeQuery = true)
	public List<Lab> findAllActiveLab();

}
