package com.example.aula7.posts.interactor;

import com.example.aula7.posts.presenter.PostActivityPresenter;
import com.example.aula7.posts.presenter.PostActivityPresenterImpl;
import com.example.aula7.posts.repository.PostActivityRepository;
import com.example.aula7.posts.repository.PostActivityRepositoryImpl;

public class PostActivityInteractorImpl implements PostActivityInteractor{

    private PostActivityPresenter postActivityPresenter;
    private PostActivityRepository postActivityRepository;


    public PostActivityInteractorImpl(PostActivityPresenter postActivityPresenter) {
        this.postActivityPresenter = postActivityPresenter;
        postActivityRepository = new PostActivityRepositoryImpl(this);

    }

    @Override
    public void listarData() {

    }

    @Override
    public void validarData() {

    }

    @Override
    public void searchData() {

    }
}
