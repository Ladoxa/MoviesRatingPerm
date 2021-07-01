package com.ladoxa.moviesratingperm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.ladoxa.moviesratingperm.data.Movie;
import com.ladoxa.moviesratingperm.data.MovieResult;
import com.ladoxa.moviesratingperm.services.MovieService;
import com.ladoxa.moviesratingperm.services.RetrofitService;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String API_KEY = "d4c42757234033cb6b5f52580cbf5fae";
    private static final String BASE_URL = "https://api.themoviedb.org/3/discover/movie";
    private static final String LANGUAGE_VALUE = "ru-RU";
    private static final String SORT_BY_POPULARITY_VALUE = "popularity.desc";
    private static final String SORT_BY_TOP_RATED_VALUE = "vote_average.desc";

    public static final int POPULARITY = 0;
    public static final int TOP_RATED = 1;

    //private static RetrofitService service;
    private static MovieService service2;
    String methodOfSort = SORT_BY_POPULARITY_VALUE;


   ArrayList<Movie> movieResults;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("123create", "create");

       initRetrofit();



    }


    private void initRetrofit() {

//        if (sort_by == POPULARITY) {
//            methodOfSort = SORT_BY_POPULARITY_VALUE;
//        } else {
//            methodOfSort = SORT_BY_TOP_RATED_VALUE;
//        }

        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        Retrofit retrofit = (new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/discover/")
                .addConverterFactory(GsonConverterFactory.create())
                //.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build());

//        service = retrofit.create(RetrofitService.class);
        service2 = retrofit.create(MovieService.class);

        service2.getMoviesResult(API_KEY, LANGUAGE_VALUE, SORT_BY_POPULARITY_VALUE, 2).enqueue(new Callback<MovieResult>() {
            @Override
            public void onResponse(Call<MovieResult> call, Response<MovieResult> response) {
                Toast.makeText(getApplicationContext(), getString(R.string.successful_load_data), Toast.LENGTH_LONG).show();
                movieResults = response.body().getResults();
                printMoviesList(movieResults);
            }

            @Override
            public void onFailure(Call<MovieResult> call, Throwable t) {
                Toast.makeText(getApplicationContext(), getString(R.string.failed_load_data), Toast.LENGTH_LONG).show();
            }
        });

//        service.getMoviesPage(API_KEY, LANGUAGE_VALUE, SORT_BY_POPULARITY_VALUE, 2).enqueue(new Callback<Movie>() {
//
//            @Override
//            public void onResponse(Call<Movie> call, Response<Movie> response) {
//                Log.d("123create", "create223");
//                movieArrayList = response.body();
//                Log.d("123create", movieArrayList.getTitle());
//                TextView textView = findViewById(R.id.textView);
//                textView.setText("asd");
//            }
//
//            @Override
//            public void onFailure(Call<Movie> call, Throwable t) {
//                TextView textView = findViewById(R.id.textView);
//                textView.setText("Ошибка");
//            }
//        });

//        service.getMoviesPage(API_KEY, LANGUAGE_VALUE, SORT_BY_POPULARITY_VALUE, 2)
//                .subscribe(v -> {
//                    movieArrayList = v;
//                    Log.d("123create", movieArrayList.get(0).getTitle());
//                });

    }

    private void printMoviesList(ArrayList<Movie> list){
        for (int i = 0; i < list.size(); i++) {
            Log.d("123create", list.get(i).getTitle());
        }
    };


}