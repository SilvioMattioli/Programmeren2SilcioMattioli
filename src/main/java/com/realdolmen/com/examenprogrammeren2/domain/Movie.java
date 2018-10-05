package com.realdolmen.com.examenprogrammeren2.domain;

public class Movie {
    private String genre;
    private String title;
    private int id;
    
    public Movie(){
    }

    public Movie(int id,String genre, String title) {
        this.genre = genre;
        this.title = title;
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
    
   @Override
    public String toString() {
         String movie = "******************************\n"
         +"Title : "+ this.title+"\n"
         + "Genre : "+this.genre+
          "*******************************\n";
         
         return movie;
              
    }
}
