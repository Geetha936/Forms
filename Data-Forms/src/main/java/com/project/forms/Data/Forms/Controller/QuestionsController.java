package com.project.forms.Data.Forms.Controller;

import com.project.forms.Data.Forms.Models.QuestionTable;
import com.project.forms.Data.Forms.RequestModels.AddQuestionsModel;
import com.project.forms.Data.Forms.Services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/ques/")
@CrossOrigin("http://localhost:3000")
@RestController
public class QuestionsController {
    private QuestionService questionService ;

    public QuestionsController(QuestionService questionService){
        this.questionService=questionService;
    }

    @PostMapping("add")
    public void addquestions(@RequestBody List<AddQuestionsModel> questionsList){
        questionService.addQuestions(questionsList);
    }
    @GetMapping("formques")
    public List<QuestionTable> quesbyformId(@RequestParam int formId) {
    	return questionService.findAllQuesByFormId(formId);
    }
}
