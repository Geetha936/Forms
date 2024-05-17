package com.project.forms.Data.Forms.Services;

import java.util.List;

import com.project.forms.Data.Forms.Repositories.AnswersRepo;
import com.project.forms.Data.Forms.Repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.forms.Data.Forms.Models.FormTable;
import com.project.forms.Data.Forms.Repositories.FormsRepo;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FormService {
	
	private FormsRepo formsRepo;
	private QuestionRepo questionRepo;
	private AnswersRepo answersRepo;
	
	@Autowired
	public FormService(FormsRepo formsRepo,QuestionRepo questionRepo , AnswersRepo answersRepo) {
		this.formsRepo=formsRepo;
		this.questionRepo=questionRepo;
		this.answersRepo=answersRepo;
	}
	
	public void createForm(FormTable form) {
		formsRepo.save(form);
	}
	
	public List<FormTable> allForms(){
		return formsRepo.findAll();
	}

	public void deleteform(int Id){
		formsRepo.deleteById(Id);
		answersRepo.deleteByFormId(Id);
		questionRepo.deleteByFormId(Id);
	}
	
}
