package com.example.aula7.posts.repository;

import android.telecom.Call;

import com.example.aula7.posts.Apirest.RestApiAdapter;
import com.example.aula7.posts.Apirest.Service;
import com.example.aula7.posts.interactor.PostActivityInteractor;
import com.example.aula7.posts.interactor.PostActivityInteractorImpl;
import com.example.aula7.posts.model.Post;

import java.util.List;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityRepositoryImpl implements PostActivityRepository {

    private  PostActivityInteractor postActivityInteractor;

    public PostActivityRepositoryImpl(PostActivityInteractor postActivityInteractor) {
        this.postActivityInteractor = postActivityInteractor;
    }

    @Override
    public void loadDataPost() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();

        Call<List<Post>> items = service.getDataPost();

        items
    }
}
