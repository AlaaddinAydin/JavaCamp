package com.example.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.bussines.abstracts.Job_titleService;
import com.example.hrms.dataAccess.abstracts.Job_titleDao;
import com.example.hrms.entities.concretes.Job_title;

@Service
public class Job_titleManager implements Job_titleService {
	
	
	private Job_titleDao job_titleDao;
	
	@Autowired
	public Job_titleManager(Job_titleDao job_titleDao) {
		super();
		this.job_titleDao = job_titleDao;
	}


	@Override
	public List<Job_title> getAll() {
		// TODO Auto-generated method stub
		return job_titleDao.findAll();
	}

}
