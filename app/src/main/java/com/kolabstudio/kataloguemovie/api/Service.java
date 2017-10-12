package com.kolabstudio.kataloguemovie.api;

import com.kolabstudio.kataloguemovie.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by SVF on 10/6/2017.
 */

public interface Service {

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<MovieResponse> getRatedMovies(@Query("api_key") String apiKey);

}
