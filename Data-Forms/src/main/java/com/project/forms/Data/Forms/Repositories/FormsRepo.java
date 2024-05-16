package com.project.forms.Data.Forms.Repositories;

import com.project.forms.Data.Forms.Models.FormTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormsRepo extends JpaRepository<FormTable, Integer> {
}
