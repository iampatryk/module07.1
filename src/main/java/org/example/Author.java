package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Author_Table")
public class Author {

    @Id
    @GeneratedValue
    private String name;
    private Integer age;
    private String favouriteGenre;
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author() {}

    public Author(String name, Integer age, String favouriteGenre, List<Book> books) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteGenre='" + favouriteGenre + '\'' +
                ", books=" + books +
                '}';
    }
}
