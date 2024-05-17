package com.project.forms.Data.Forms.Services;

import com.project.forms.Data.Forms.Models.QuestionTable;
import com.project.forms.Data.Forms.Repositories.QuestionRepo;
import com.project.forms.Data.Forms.RequestModels.AddQuestionsModel;
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

    public void addQuestions(List<AddQuestionsModel> questionsList){
        for(AddQuestionsModel ques : questionsList){
            QuestionTable q = new QuestionTable();
            q.setQuestion(ques.getQuestion());
            q.setFormId(ques.getFormId());
            System.out.println(ques);
            questionRepo.save(q);
        }
    }
    public List<QuestionTable> findAllQuesByFormId(int id){
    	return questionRepo.findByFormId(id);
    }
}
