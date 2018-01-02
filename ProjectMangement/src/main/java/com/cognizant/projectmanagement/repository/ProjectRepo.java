package com.cognizant.projectmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.projectmanagement.dao.ProjectDao;

public interface ProjectRepo extends CrudRepository<ProjectDao,Integer>{

}
