package com.example.aula7.posts.Apirest;

import com.example.aula7.posts.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("posts")
    Call<List<Post>> getDataPost();

}
