package com.projectx.dododoc.Sentences;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.projectx.dododoc.User_Input.User_Input;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Sentences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String sentence;

    @OneToOne
    private User_Input user_input;
}
