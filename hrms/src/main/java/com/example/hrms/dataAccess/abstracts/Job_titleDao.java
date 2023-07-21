package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Job_title;

public interface Job_titleDao extends JpaRepository<Job_title, Integer>{

}
