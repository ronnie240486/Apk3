package com.andyhax.veeepeeen.ui.login;

/* JADX INFO: loaded from: classes2.dex */
public class LoginViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.andyhax.veeepeeen.ui.login.LoginFormState> loginFormState;
    private androidx.lifecycle.MutableLiveData<com.andyhax.veeepeeen.ui.login.LoginResult> loginResult;

    native LoginViewModel();

    private native boolean isPasswordValid(java.lang.String r1);

    private native boolean isUserNameValid(java.lang.String r1);

    native androidx.lifecycle.LiveData getLoginFormState();

    native androidx.lifecycle.LiveData getLoginResult();

    public native void login(java.lang.String r1, java.lang.String r2);

    public native void loginDataChanged(java.lang.String r1, java.lang.String r2);
}
