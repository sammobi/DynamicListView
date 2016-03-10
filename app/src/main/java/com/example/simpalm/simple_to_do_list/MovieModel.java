package com.example.simpalm.simple_to_do_list;

/**
 * Created by Simpalm on 3/9/16.
 */
public class MovieModel {
    private String title, genre, year;

    public MovieModel() {
    }

    public MovieModel(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
