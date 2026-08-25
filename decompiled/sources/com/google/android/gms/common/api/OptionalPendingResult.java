package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OptionalPendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    public OptionalPendingResult() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public abstract R get();

    public abstract boolean isDone();
}
