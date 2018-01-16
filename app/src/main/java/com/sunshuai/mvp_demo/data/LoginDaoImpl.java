package com.sunshuai.mvp_demo.data;

/**
 * Created by sunshuai on 2018/1/16.
 */

public class LoginDaoImpl implements LoginDao{

    @Override
    public void checkUser(String username, String password, LoginDao.CallbackCheck callbackCheck) {
        if (username.equals("sun") && password.equals("sun")) {
            callbackCheck.onSuccess();
        } else {
            callbackCheck.onFail();
        }
    }
}
