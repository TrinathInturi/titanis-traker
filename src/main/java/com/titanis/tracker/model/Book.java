package com.titanis.tracker.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(schema = "titanis", name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Isbn")
    private String Isbn;
    @Column(name = "Isbn13")
    private String Isbn13;
    @Column(name = "Publisher")
    private String Publisher;
    @Column(name = "Language")
    private String Language;
    @Column(name = "Pages")
    private Integer Pages;
    @Column(name = "Date_Published")
    private Date DatePublished;

}
