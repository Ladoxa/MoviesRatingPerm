package com.ladoxa.moviesratingperm.data;

// класс будем испльзовать в БД
public class Movie {
//
//    private static  String API_KEY;// = "d4c42757234033cb6b5f52580cbf5fae";
//    private static  String BASE_URL;// = "https://api.themoviedb.org/3/discover/movie";
//    private static  String LANGUAGE_VALUE;// = "ru-RU";
//    private static  String SORT_BY_POPULARITY_VALUE;// = "popularity.desc";


    private int id;  //  id фильма
    private int voteCount; // количество голосов
    private String title; // название
    private String originalTitle; // оригинальное название
    private String overview; // описание фильма
    private String posterPath; // путь к постеру
    private String bigPosterPath; // путь к постеру
    private String backdropPath; // фоновое изображение
    private String releaseDate; // дата релиза
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
