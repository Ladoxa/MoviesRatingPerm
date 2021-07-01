package com.ladoxa.moviesratingperm.data;

import com.google.gson.annotations.SerializedName;

// класс будем испльзовать в БД
public class Movie {
//
//    private static  String API_KEY;// = "d4c42757234033cb6b5f52580cbf5fae";
//    private static  String BASE_URL;// = "https://api.themoviedb.org/3/discover/movie";
//    private static  String LANGUAGE_VALUE;// = "ru-RU";
//    private static  String SORT_BY_POPULARITY_VALUE;// = "popularity.desc";

    @SerializedName("id")
    private int id;  //  id фильма

    @SerializedName("vote_count")
    private int voteCount; // количество голосов

    @SerializedName("title")
    private String title; // название

    @SerializedName("original_title")
    private String originalTitle; // оригинальное название

    @SerializedName("overview")
    private String overview; // описание фильма

    @SerializedName("poster_path")
    private String posterPath; // путь к постеру


    private String bigPosterPath;// путь к постеру

    @SerializedName("backdrop_path")
    private String backdropPath; // фоновое изображение

    @SerializedName("release_date")
    private String releaseDate; // дата релиза

    @SerializedName("vote_average")
    private double voteAverage; // средний голос


    public Movie(int id, int voteCount, String title, String originalTitle, String overview, String posterPath, String bigPosterPath, String backdropPath, String releaseDate, double voteAverage) {
        this.id = id;
        this.voteCount = voteCount;
        this.title = title;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.posterPath = posterPath;
        this.bigPosterPath = bigPosterPath;
        this.backdropPath = backdropPath;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getBigPosterPath() {
        return bigPosterPath;
    }

    public void setBigPosterPath(String bigPosterPath) {
        this.bigPosterPath = bigPosterPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }
}
