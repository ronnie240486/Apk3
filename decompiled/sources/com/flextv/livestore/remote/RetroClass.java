package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes.dex */
public class RetroClass {
    public RetroClass() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.flextv.livestore.remote.APIService getAPIService(java.lang.String r1) {
            retrofit2.Retrofit r1 = getRetrofitInstance(r1)
            java.lang.Class<com.flextv.livestore.remote.APIService> r0 = com.flextv.livestore.remote.APIService.class
            java.lang.Object r1 = r1.create(r0)
            com.flextv.livestore.remote.APIService r1 = (com.flextv.livestore.remote.APIService) r1
            return r1
    }

    private static retrofit2.Retrofit getRetrofitInstance(java.lang.String r6) {
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder
            r0.<init>()
            com.google.gson.GsonBuilder r0 = r0.setLenient()
            com.google.gson.Gson r0 = r0.create()
            okhttp3.logging.HttpLoggingInterceptor r1 = new okhttp3.logging.HttpLoggingInterceptor
            r1.<init>()
            okhttp3.OkHttpClient$Builder r2 = new okhttp3.OkHttpClient$Builder
            r2.<init>()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 60
            okhttp3.OkHttpClient$Builder r2 = r2.connectTimeout(r4, r3)
            okhttp3.OkHttpClient$Builder r2 = r2.readTimeout(r4, r3)
            okhttp3.OkHttpClient$Builder r2 = r2.writeTimeout(r4, r3)
            okhttp3.OkHttpClient$Builder r1 = r2.addInterceptor(r1)
            okhttp3.OkHttpClient r1 = r1.build()
            retrofit2.Retrofit$Builder r2 = new retrofit2.Retrofit$Builder
            r2.<init>()
            retrofit2.Retrofit$Builder r6 = r2.baseUrl(r6)
            retrofit2.Retrofit$Builder r6 = r6.client(r1)
            retrofit2.converter.scalars.ScalarsConverterFactory r1 = retrofit2.converter.scalars.ScalarsConverterFactory.create()
            retrofit2.Retrofit$Builder r6 = r6.addConverterFactory(r1)
            retrofit2.converter.gson.GsonConverterFactory r0 = retrofit2.converter.gson.GsonConverterFactory.create(r0)
            retrofit2.Retrofit$Builder r6 = r6.addConverterFactory(r0)
            retrofit2.Retrofit r6 = r6.build()
            return r6
    }
}
