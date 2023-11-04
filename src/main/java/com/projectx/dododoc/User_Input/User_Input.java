package com.projectx.dododoc.User_Input;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.projectx.dododoc.Sentences.Sentences;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User_Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String user_input;

    @OneToOne(mappedBy = "user_input")
    private Sentences sentences;

}
