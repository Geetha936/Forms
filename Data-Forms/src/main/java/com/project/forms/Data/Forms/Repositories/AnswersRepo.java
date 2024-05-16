package com.project.forms.Data.Forms.Repositories;

import com.project.forms.Data.Forms.Models.AnswersTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswersRepo extends JpaRepository<AnswersTable , Integer> {
}
