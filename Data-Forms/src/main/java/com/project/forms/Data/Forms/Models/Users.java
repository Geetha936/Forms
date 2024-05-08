package com.project.forms.Data.Forms.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
}
