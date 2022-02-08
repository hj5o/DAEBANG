package com.example.DAEBANG.model;


import lombok.Data;
import javax.persistence.*;
import java.sql.Date;


@Entity
@Data
public class Board {
    @Id //id가 pk임을 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private long id;
    private String title;
    private String content;
    private Date created_date;

}

