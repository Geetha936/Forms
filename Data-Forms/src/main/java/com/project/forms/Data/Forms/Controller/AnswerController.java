package com.project.forms.Data.Forms.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.forms.Data.Forms.Models.AnswersTable;
import com.project.forms.Data.Forms.Services.AnswerService;
import com.project.forms.Data.Forms.Services.FormService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/ans/")
public class AnswerController {
	
	private AnswerService answerService;
	
	public AnswerController(AnswerService answerService) {
		this.answerService=answerService;
	}
	
	@GetMapping("listofans")
	public List<AnswersTable> FormAns(@RequestParam int formId){
		return answerService.formAns(formId);
	}
	
	@PostMapping("postans")
	public void postAns(@RequestBody List<AnswersTable> ansList ) {
		System.out.println(ansList.toString());
		
		answerService.postAnswers(ansList);
	}

}
