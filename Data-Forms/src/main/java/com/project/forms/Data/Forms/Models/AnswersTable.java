package com.project.forms.Data.Forms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class AnswersTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansId;
	
	private String response;

	private int questionId;
	
	private int formId;
	
	
}
