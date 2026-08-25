package com.google.android.play.core.tasks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Task<ResultT> {
    public Task() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(@androidx.annotation.NonNull com.google.android.play.core.tasks.OnCompleteListener<ResultT> r1);

    @androidx.annotation.NonNull
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.play.core.tasks.OnCompleteListener<ResultT> r2);

    @androidx.annotation.NonNull
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(@androidx.annotation.NonNull com.google.android.play.core.tasks.OnFailureListener r1);

    @androidx.annotation.NonNull
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.play.core.tasks.OnFailureListener r2);

    @androidx.annotation.NonNull
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> r1);

    @androidx.annotation.NonNull
    public abstract com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> r2);

    @androidx.annotation.Nullable
    public abstract java.lang.Exception getException();

    @androidx.annotation.NonNull
    public abstract ResultT getResult();

    public abstract <X extends java.lang.Throwable> ResultT getResult(java.lang.Class<X> r1) throws java.lang.Throwable;

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();
}
