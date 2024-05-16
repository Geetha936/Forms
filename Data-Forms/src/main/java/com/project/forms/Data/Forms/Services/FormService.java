package com.project.forms.Data.Forms.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.forms.Data.Forms.Models.FormTable;
import com.project.forms.Data.Forms.Repositories.FormsRepo;

@Service
public class FormService {
	
	private FormsRepo formsRepo;
	
	@Autowired
	public FormService(FormsRepo formsRepo) {
		this.formsRepo=formsRepo;
	}
	
	public void createForm(FormTable form) {
		formsRepo.save(form);
	}
	
	public List<FormTable> allForms(){
		return formsRepo.findAll();
	}
	
}
