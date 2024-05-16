package com.project.forms.Data.Forms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.forms.Data.Forms.Models.FormTable;
import com.project.forms.Data.Forms.Services.FormService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/form/")
public class FormController {
	private FormService formService;
	public FormController (FormService formService) {
		this.formService=formService;
	}
	
	@PostMapping("create")
	public void createForm(@RequestBody FormTable form) {
		System.out.println(form);
		formService.createForm(form);
	}
	
	@GetMapping("listofforms")
	public List<FormTable> returnForms(){

		return formService.allForms();
	}
	
	
}
