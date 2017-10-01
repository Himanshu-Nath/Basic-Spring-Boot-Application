package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {
	@Query(value = "select * from mdl_ctx_lab where active_ind=1", nativeQuery = true)
	public List<Lab> findAllActiveLab();
	
	@Query(value = "select cl.id as course_lab_id, cl.active_ind as course_active_id, cl.max_instances, cl.ctx_lab_id, cl.course_id, lab.* from mdl_ctx_course_lab cl join mdl_ctx_lab lab on cl.ctx_lab_id = lab.id", nativeQuery = true)
	public List<Object[]> findAllCourseLab();

}
