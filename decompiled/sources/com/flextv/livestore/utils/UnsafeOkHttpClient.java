package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public class UnsafeOkHttpClient {



    public UnsafeOkHttpClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static okhttp3.OkHttpClient getUnsafeOkHttpClient() {
            r0 = 1
            javax.net.ssl.TrustManager[] r0 = new javax.net.ssl.TrustManager[r0]     // Catch: java.lang.Exception -> L37
            com.flextv.livestore.utils.UnsafeOkHttpClient$1 r1 = new com.flextv.livestore.utils.UnsafeOkHttpClient$1     // Catch: java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Exception -> L37
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = "SSL"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Exception -> L37
            r3 = 0
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L37
            r4.<init>()     // Catch: java.lang.Exception -> L37
            r1.init(r3, r0, r4)     // Catch: java.lang.Exception -> L37
            javax.net.ssl.SSLSocketFactory r1 = r1.getSocketFactory()     // Catch: java.lang.Exception -> L37
            okhttp3.OkHttpClient$Builder r3 = new okhttp3.OkHttpClient$Builder     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
            r0 = r0[r2]     // Catch: java.lang.Exception -> L37
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0     // Catch: java.lang.Exception -> L37
            r3.sslSocketFactory(r1, r0)     // Catch: java.lang.Exception -> L37
            com.flextv.livestore.utils.UnsafeOkHttpClient$2 r0 = new com.flextv.livestore.utils.UnsafeOkHttpClient$2     // Catch: java.lang.Exception -> L37
            r0.<init>()     // Catch: java.lang.Exception -> L37
            r3.hostnameVerifier(r0)     // Catch: java.lang.Exception -> L37
            okhttp3.OkHttpClient r0 = r3.build()     // Catch: java.lang.Exception -> L37
            return r0
        L37:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
