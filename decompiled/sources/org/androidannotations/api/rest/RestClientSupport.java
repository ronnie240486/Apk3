package org.androidannotations.api.rest;

/* JADX INFO: loaded from: classes3.dex */
public interface RestClientSupport {
    org.springframework.web.client.RestTemplate getRestTemplate();

    void setRestTemplate(org.springframework.web.client.RestTemplate r1);
}
