package com.cognizant.projectmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.projectmanagement.dao.ParentTaskDao;
import com.cognizant.projectmanagement.repository.ParentTaskRepo;

@Controller
@RequestMapping(path="/parenttask")
public class ParentTaskController {

	@Autowired
	private ParentTaskRepo repo;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<ParentTaskDao> getAllUsers() {
		return repo.findAll();
	}
	
	@PostMapping(path="/add")
	public @ResponseBody ParentTaskDao addNew (@RequestBody String taske) {
		ParentTaskDao task = new ParentTaskDao();
		task.setParentTask(taske);
		return repo.save(task);
	}
}
