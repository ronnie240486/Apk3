package org.androidannotations.api.rest;

/* JADX INFO: loaded from: classes.dex */
public interface RestClientHeaders {
    java.lang.String getCookie(java.lang.String r1);

    java.lang.String getHeader(java.lang.String r1);

    void setAuthentication(org.springframework.http.HttpAuthentication r1);

    void setBearerAuth(java.lang.String r1);

    void setCookie(java.lang.String r1, java.lang.String r2);

    void setHeader(java.lang.String r1, java.lang.String r2);

    void setHttpBasicAuth(java.lang.String r1, java.lang.String r2);
}
