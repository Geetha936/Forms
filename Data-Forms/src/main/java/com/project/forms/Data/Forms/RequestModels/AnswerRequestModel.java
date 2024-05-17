package com.project.forms.Data.Forms.RequestModels;

import lombok.Data;

@Data
public class AnswerRequestModel {
    Integer questionId;
    String response ;
    Integer formId ;
}
