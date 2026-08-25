package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Task<TResult> {
    public Task() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "addOnCanceledListener is not implemented."
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "addOnCanceledListener is not implemented."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCanceledListener r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "addOnCanceledListener is not implemented"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "addOnCompleteListener is not implemented"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "addOnCompleteListener is not implemented"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnCompleteListener<TResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "addOnCompleteListener is not implemented"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnFailureListener r2);

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnFailureListener r1);

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnFailureListener r2);

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnSuccessListener<? super TResult> r2);

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(@androidx.annotation.NonNull com.google.android.gms.tasks.OnSuccessListener<? super TResult> r1);

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.OnSuccessListener<? super TResult> r2);

    @androidx.annotation.NonNull
    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(@androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "continueWith is not implemented"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "continueWith is not implemented"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(@androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "continueWithTask is not implemented"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "continueWithTask is not implemented"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.Nullable
    public abstract java.lang.Exception getException();

    public abstract TResult getResult();

    public abstract <X extends java.lang.Throwable> TResult getResult(@androidx.annotation.NonNull java.lang.Class<X> r1) throws java.lang.Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    @androidx.annotation.NonNull
    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(@androidx.annotation.NonNull com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "onSuccessTask is not implemented"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "onSuccessTask is not implemented"
            r1.<init>(r2)
            throw r1
    }
}
