package com.andyhax.veeepeeen.ui.login;

/* JADX INFO: loaded from: classes2.dex */
class LoginResult {
    private java.lang.Integer error;
    private com.andyhax.veeepeeen.ui.login.LoggedInUserView success;

    native LoginResult(com.andyhax.veeepeeen.ui.login.LoggedInUserView r1);

    native LoginResult(java.lang.Integer r1);

    native java.lang.Integer getError();

    native com.andyhax.veeepeeen.ui.login.LoggedInUserView getSuccess();
}
