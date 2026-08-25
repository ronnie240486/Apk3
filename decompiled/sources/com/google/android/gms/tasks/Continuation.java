package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<TResult> r1) throws java.lang.Exception;
}
