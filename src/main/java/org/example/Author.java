package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Author_Table")
public class Author {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Integer age;
    private String favouriteGenre;
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author() {}

    public Author(long id, String name, Integer age, String favouriteGenre, List<Book> books) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", favouriteGenre='" + favouriteGenre + '\'' +
                ", books=" + books +
                '}';
    }
}
