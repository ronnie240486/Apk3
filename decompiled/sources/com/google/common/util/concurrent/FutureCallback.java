package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable r1);

    void onSuccess(@com.google.common.util.concurrent.ParametricNullness V r1);
}
