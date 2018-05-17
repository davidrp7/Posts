package com.example.aula7.posts.presenter;

public interface PostActivityPresenter  {

    //Abrir interfaces de view e interfactor

    //view
    void showData();
    void showResult();
    void showError();
    //interfactor
    void listarData();
    void validarData();
    void searchData();
}
