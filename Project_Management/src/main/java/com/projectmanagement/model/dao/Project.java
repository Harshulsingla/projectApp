package com.projectmanagement.model.dao;

import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table(name="project_table")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	private String projectName;
	
	private Date startDate=null;
	private Date endDate=null;
	private String status;
	private String clientName;
	
	public Project() {
		super();
	}

	public Project(String projectName, Date startDate, Date endDate, String status, String clientName) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.clientName = clientName;
	}
	
	
	
	
}
