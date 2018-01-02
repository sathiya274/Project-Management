package com.cognizant.projectmanagement.repository;


import org.springframework.data.repository.CrudRepository;

import com.cognizant.projectmanagement.dao.UserDao;


public interface UserRepo extends CrudRepository<UserDao, Integer> {

}