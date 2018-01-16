package com.sunshuai.mvp_demo.data;

/**
 * Created by sunshuai on 2018/1/16.
 */

public interface LoginDao {
    void checkUser(String username, String password, CallbackCheck callbackCheck);

    interface CallbackCheck {
        void onSuccess();

        void onFail();
    }
}
