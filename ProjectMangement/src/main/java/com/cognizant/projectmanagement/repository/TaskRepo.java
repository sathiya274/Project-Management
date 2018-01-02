package com.cognizant.projectmanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.projectmanagement.dao.TaskDao;

public interface TaskRepo extends CrudRepository<TaskDao,Integer>{

	List<TaskDao> findAllByProjectId(Integer id);
		
	List<TaskDao> findAllByProjectIdAndStatus(Integer id, String status);
	
}
