package com.sunshuai.mvp_demo.data;

/**
 * Created by sunshuai on 2018/1/16.
 */

public interface LoginDao {
    public void checkUser(String username, String password, CallbackCheck callbackCheck);

    public interface CallbackCheck {
        public void onSuccess();

        public void onFail();
    }
}
