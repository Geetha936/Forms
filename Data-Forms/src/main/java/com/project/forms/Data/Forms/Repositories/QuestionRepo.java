package com.project.forms.Data.Forms.Repositories;

import com.project.forms.Data.Forms.Models.QuestionTable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface QuestionRepo extends JpaRepository<QuestionTable , Integer> {
	
	List<QuestionTable> findByFormId(int formId);
}
