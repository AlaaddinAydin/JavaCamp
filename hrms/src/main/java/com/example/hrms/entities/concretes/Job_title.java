package com.example.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "job_titles")
public class Job_title {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;
	
	@Column(name = "title")
	String title;
	
	public Job_title() {
		// TODO Auto-generated constructor stub
	}

	public Job_title(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
}
