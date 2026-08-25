package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes2.dex */
public interface Authenticator {
    java.lang.String getAuthToken() throws com.android.volley.AuthFailureError;

    void invalidateAuthToken(java.lang.String r1);
}
