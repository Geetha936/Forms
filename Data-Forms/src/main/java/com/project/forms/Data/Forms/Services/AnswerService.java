package com.project.forms.Data.Forms.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.forms.Data.Forms.Models.AnswersTable;
import com.project.forms.Data.Forms.Repositories.AnswersRepo;

@Service
public class AnswerService {
	
	private AnswersRepo answersRepo;
	
	public AnswerService(AnswersRepo answersRepo) {
		this.answersRepo = answersRepo;
	}
	
	public void postAnswers(List<AnswersTable> answersList) {
		for(AnswersTable ans : answersList) {
			answersRepo.save(ans);
		}
	}
	
	public List<AnswersTable> formAns(int formId){
		return answersRepo.findByFormId(formId);
	}
	

}
