package org.agoncal.quarkus.starting;

public class Book {
    public int id;
    public String title;
    public String author;
    public int yearOfPublication;
    public String name;


    public Book(int id, String title, String author, int yearOfPublication, String name) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.name = name;
    }
}
