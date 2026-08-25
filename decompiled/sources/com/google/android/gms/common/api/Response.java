package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private T zza;

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    public Response(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    public final T getResult() {
            r1 = this;
            T extends com.google.android.gms.common.api.Result r0 = r1.zza
            return r0
    }

    public void setResult(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
