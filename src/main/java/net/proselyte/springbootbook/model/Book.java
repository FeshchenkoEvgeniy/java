package net.proselyte.springbootbook.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author")
    private String author;
    @Column(name = "pages")
    private Integer pages;
    @Column(name = "publishing_house")
    private String publishingHouse;
    @Column(name = "description")
    private String description;
    @Column(name = "img")
    private String img;
}
