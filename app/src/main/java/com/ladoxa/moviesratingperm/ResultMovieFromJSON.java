package com.ladoxa.moviesratingperm;

import com.ladoxa.moviesratingperm.data.Movie;

import org.json.JSONObject;

import java.util.ArrayList;

public class ResultMovieFromJSON {

    private static final String KEY_RESULTS = "results"; // ключ result из JSON
    private static final String KEY_VOTE_COUNT = "vote_count"; // ключ vote_count из JSON
    private static final String KEY_ID = "id"; // ключ id из JSON
    private static final String KEY_TITLE = "title"; // ключ title из JSON
    private static final String KEY_ORIGINAL_TITLE = "original_title"; // ключ original_title из JSON
    private static final String KEY_OVERVIEW = "overview"; // ключ overview из JSON
    private static final String KEY_POSTER_PATH = "poster_path"; // ключ poster_path из JSON
    private static final String KEY_BACKDROP_PATH = "backdrop_path"; // ключ poster_path из JSON
    private static final String KEY_VOTE_AVERAGE = "vote_average"; // ключ poster_path из JSON
    private static final String KEY_RELEASE_DATE = "release_date"; // ключ poster_path из JSON

    private static final String BASE_POSTER_URL = "https://image.tmdb.org/t/p/";
    private static final String BASE_SMALL_POSTER_SIZE = "w185";
    private static final String BASE_BIG_POSTER_SIZE = "w780";

    public static ArrayList<Movie> getResultMovieFromJSON(ArrayList<Movie> movies) {

        ArrayList<Movie> resultMovie = new ArrayList<>();

            for (int i = 0; i < movies.size(); i++) {
                int id = movies.get(i).getId();
                int voteCount = movies.get(i).getVoteCount();
                String title = movies.get(i).getTitle();
                String originalTitle = movies.get(i).getOriginalTitle();
                String overview = movies.get(i).getOverview();
                String posterPath = BASE_POSTER_URL + BASE_SMALL_POSTER_SIZE + movies.get(i).getPosterPath();
                String bigPosterPath = BASE_POSTER_URL + BASE_BIG_POSTER_SIZE + movies.get(i).getPosterPath();
                String backdropPath = movies.get(i).getBackdropPath();
                double voteAverage = movies.get(i).getVoteAverage();
                String releaseDate = movies.get(i).getReleaseDate();
                Movie movie = new Movie(id, voteCount, title, originalTitle, overview, posterPath, bigPosterPath, backdropPath, releaseDate, voteAverage);
                resultMovie.add(movie);
            }
            return resultMovie;
        }

}
