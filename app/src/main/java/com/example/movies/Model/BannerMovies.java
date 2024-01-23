package com.example.movies.Model;

public class BannerMovies {

    Integer id;
    String MovieName;
    String imageUrl;
    String filrUrl;

    public BannerMovies(Integer id, String MoviName, String imageUrl, String filrUrl){
        this.id =id;
        this.MovieName = MoviName;
        this.imageUrl = imageUrl;
        this.filrUrl = filrUrl;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFilrUrl() {
        return filrUrl;
    }

    public void setFilrUrl(String filrUrl) {
        this.filrUrl = filrUrl;
    }
}
