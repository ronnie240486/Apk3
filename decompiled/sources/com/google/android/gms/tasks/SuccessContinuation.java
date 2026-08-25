package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<TContinuationResult> then(TResult r1) throws java.lang.Exception;
}
