package com.andyhax.veeepeeen.data;

/* JADX INFO: loaded from: classes.dex */
public class Result<T> {

    /* JADX INFO: renamed from: com.andyhax.veeepeeen.data.Result$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Error extends com.andyhax.veeepeeen.data.Result {
        private java.lang.Exception error;

        public native Error(java.lang.Exception r1);

        public native java.lang.Exception getError();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Success<T> extends com.andyhax.veeepeeen.data.Result {
        private T data;

        public native Success(java.lang.Object r1);

        public native java.lang.Object getData();
    }

    private native Result();

    native /* synthetic */ Result(com.andyhax.veeepeeen.data.Result.AnonymousClass1 r1);

    public native java.lang.String toString();
}
