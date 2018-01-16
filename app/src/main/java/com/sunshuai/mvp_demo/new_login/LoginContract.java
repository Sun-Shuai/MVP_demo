package com.sunshuai.mvp_demo.new_login;

import com.sunshuai.mvp_demo.base.BasePresenter;
import com.sunshuai.mvp_demo.base.BaseView;

/**
 * Created by sunshuai on 2018/1/16.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        String getUserName();

        String getPassword();

        void showSuccessMeg();

        void showFailmeg();

        void showLoading();

        void hideLoading();
    }

    interface Presenter extends BasePresenter {
        void login();
    }

}
