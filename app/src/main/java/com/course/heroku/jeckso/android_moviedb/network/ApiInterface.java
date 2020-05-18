package com.course.heroku.jeckso.android_moviedb.network;

import com.course.heroku.jeckso.android_moviedb.model.Movie;
import com.course.heroku.jeckso.android_moviedb.model.MovieDetail;
import com.course.heroku.jeckso.android_moviedb.model.Review;
import com.course.heroku.jeckso.android_moviedb.model.Trailer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;



public interface ApiInterface {

    @GET(Constant.MOVIE_PATH + "/")
    Call<Movie> popularMovies(
            );
//    Call<Movie> popularMovies(
//            @Query("page") int page);


    @GET(Constant.MOVIE_PATH + "/{movie_id}")
    Call<MovieDetail> movieDetail(
            @Path("movie_id") int movieId);

    @GET(Constant.MOVIE_PATH + "/{movie_id}/" + Constant.VIDEOS)
    Call<Trailer> trailers(
            @Path("movie_id") int movieId);

    @GET(Constant.MOVIE_PATH + "/{movie_id}/" + Constant.REVIEWS)
    Call<Review> reviews(
            @Path("movie_id") int movieId);

}
