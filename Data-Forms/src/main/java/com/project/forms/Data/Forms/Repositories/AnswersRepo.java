package com.project.forms.Data.Forms.Repositories;

import com.project.forms.Data.Forms.Models.AnswersTable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswersRepo extends JpaRepository<AnswersTable , Integer> {
	
	List<AnswersTable> findByFormId(int formId);
	void deleteByFormId(int formId);
}
