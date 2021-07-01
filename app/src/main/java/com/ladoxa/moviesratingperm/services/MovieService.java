package com.ladoxa.moviesratingperm.services;

import com.ladoxa.moviesratingperm.data.Movie;
import com.ladoxa.moviesratingperm.data.MovieResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {

    // https://api.themoviedb.org/3/discover/movie?api_key=d4c42757234033cb6b5f52580cbf5fae&language=ru-RU&sort_by=popularity.desc&page=1

    @GET("movie")
    Call<MovieResult> getMoviesResult(@Query("api_key") String api_key, @Query("language") String languageValue,
                                            @Query("sort_by") String methodOfSort, @Query("page") int page);
}
