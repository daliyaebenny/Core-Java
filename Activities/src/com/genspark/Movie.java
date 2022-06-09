package com.genspark;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";

    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Casino Royal", "Eon Productions", "PG-13");
        Movie m2 = new Movie("Casino ", "test Productions");
        ArrayList<Movie> Movies = new ArrayList<>();
        Movies.add(m1);
        Movies.add(m2);

        for (Movie movie : m1.getPG(Movies)) {
            System.out.println(movie.rating);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ArrayList<Movie> getPG(ArrayList<Movie> Movies) {
        return (ArrayList<Movie>) Movies.stream().filter(movie -> movie.getRating().contains("PG")).collect(Collectors.toList());
    }
}