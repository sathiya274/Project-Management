package com.cognizant.projectmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.projectmanagement.dao.ParentTaskDao;

public interface ParentTaskRepo extends CrudRepository<ParentTaskDao, Integer> {

}
