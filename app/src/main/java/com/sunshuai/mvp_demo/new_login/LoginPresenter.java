package com.sunshuai.mvp_demo.new_login;

import com.sunshuai.mvp_demo.data.LoginDao;
import com.sunshuai.mvp_demo.data.LoginDaoImpl;

/**
 * Created by sunshuai on 2018/1/16.
 */

public class LoginPresenter implements LoginContract.Presenter {

    LoginContract.View mView;
    LoginDao mLoginDao;


    public LoginPresenter(LoginContract.View view) {
        mView = view;
        mLoginDao = new LoginDaoImpl();
        mView.setPresent(this);
    }

    @Override
    public void start() {
        login();
    }

    @Override
    public void login() {
        mView.showLoading();
        mLoginDao.checkUser(mView.getUserName(), mView.getPassword(), new LoginDao.CallbackCheck() {
            @Override
            public void onSuccess() {
                mView.hideLoading();
                mView.showSuccessMeg();
            }

            @Override
            public void onFail() {
                mView.hideLoading();
                mView.showFailmeg();
            }
        });
    }
}
