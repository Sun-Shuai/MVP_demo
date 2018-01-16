package com.sunshuai.mvp_demo.data;

/**
 * Created by sunshuai on 2018/1/16.
 */

public class LoginDaoImpl implements LoginDao{

    private CallbackCheck callbackCheck;

    @Override
    public void checkUser(String username, String password, LoginDao.CallbackCheck callbackCheck) {
        callbackCheck = callbackCheck;
        if (username.equals("sun") && password.equals("sun")) {
            callbackCheck.onSuccess();
        } else {
            callbackCheck.onFail();
        }
    }
}
