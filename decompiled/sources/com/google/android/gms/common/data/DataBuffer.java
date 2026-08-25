package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public interface DataBuffer<T> extends java.lang.Iterable<T>, com.google.android.gms.common.api.Releasable, java.io.Closeable {
    void close();

    T get(int r1);

    int getCount();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    android.os.Bundle getMetadata();

    @java.lang.Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @androidx.annotation.NonNull
    java.util.Iterator<T> iterator();

    void release();

    @androidx.annotation.NonNull
    java.util.Iterator<T> singleRefIterator();
}
