package com.example.aula7.posts.presenter;

import com.example.aula7.posts.interactor.PostActivityInteractor;
import com.example.aula7.posts.interactor.PostActivityInteractorImpl;
import com.example.aula7.posts.view.PostActivityView;

public class PostActivityPresenterImpl implements PostActivityPresenter{

    private PostActivityView postActivityView;
    private PostActivityInteractor postActivityInteractor;

    public PostActivityPresenterImpl(PostActivityView postActivityView) {
        this.postActivityView = postActivityView;

        // es el primer metodo que se ejecuta, por eso se inicia dentro de este metodo
        postActivityInteractor = new PostActivityInteractorImpl(this);

    }

    @Override
    public void showData() {

    }

    @Override
    public void showResult() {

    }

    @Override
    public void showError() {

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
