package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public interface HasApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.common.api.internal.ApiKey<O> getApiKey();
}
