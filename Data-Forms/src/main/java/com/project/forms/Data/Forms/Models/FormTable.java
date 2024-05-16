package com.project.forms.Data.Forms.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class FormTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String formName;
    private int userId ;
	
	}

