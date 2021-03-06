package com.example.macbookpro.MovieBook.Presenter;

import com.facebook.login.LoginResult;


public interface MVPContracts {


    //presenter will receive data from the view
    interface ViewPresenterContract {
        void onSignupClicked();

        void onSuccess(LoginResult loginResult);

        void onLoadPopularMovies();

        void onLoadUpcomingMovies();

        void onLoadNowPlayingMovies();


    }


    interface RequestModel {
        void getUserInfo();
    }


}

