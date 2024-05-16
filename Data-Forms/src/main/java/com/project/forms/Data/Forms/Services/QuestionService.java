package com.project.forms.Data.Forms.Services;

import com.project.forms.Data.Forms.Models.QuestionTable;
import com.project.forms.Data.Forms.Repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo){
        this.questionRepo=questionRepo;
    }

    public void addQuestions(List<QuestionTable> questionsList){
        for(QuestionTable ques : questionsList){
            questionRepo.save(ques);
        }
    }
    public List<QuestionTable> findAllQuesByFormId(int id){
    	return questionRepo.findByFormId(id);
    }
}
