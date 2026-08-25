package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class DataBufferResponse<T, R extends com.google.android.gms.common.data.AbstractDataBuffer<T> & com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.Response<R> implements com.google.android.gms.common.data.DataBuffer<T> {
    @com.google.android.gms.common.annotation.KeepForSdk
    public DataBufferResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    @com.google.android.gms.common.annotation.KeepForSdk
    public DataBufferResponse(@androidx.annotation.NonNull com.google.android.gms.common.data.AbstractDataBuffer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            r0.close()
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.NonNull
    public final T get(int r2) {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            int r0 = r0.getCount()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.Nullable
    public final android.os.Bundle getMetadata() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            android.os.Bundle r0 = r0.getMetadata()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            boolean r0 = r0.isClosed()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    @androidx.annotation.NonNull
    public final java.util.Iterator<T> iterator() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            r0.release()
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.NonNull
    public final java.util.Iterator<T> singleRefIterator() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            java.util.Iterator r0 = r0.singleRefIterator()
            return r0
    }
}
