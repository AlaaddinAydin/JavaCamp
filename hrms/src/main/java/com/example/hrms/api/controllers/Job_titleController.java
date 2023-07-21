package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.bussines.abstracts.Job_titleService;
import com.example.hrms.bussines.concretes.Job_titleManager;
import com.example.hrms.entities.concretes.Job_title;

@RestController
@RequestMapping("/api/job_titles")
public class Job_titleController {
	
	private Job_titleService job_titleService;
	
	@Autowired
	public Job_titleController(Job_titleService job_titleService) {
		super();
		this.job_titleService = job_titleService;
	}
	
	@GetMapping("/getall")
	public List<Job_title> getAll(){
		return this.job_titleService.getAll();
	}
	
}
