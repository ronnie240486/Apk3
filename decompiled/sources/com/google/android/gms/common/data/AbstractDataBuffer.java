package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDataBuffer<T> implements com.google.android.gms.common.data.DataBuffer<T> {

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.data.DataHolder mDataHolder;

    @com.google.android.gms.common.annotation.KeepForSdk
    public AbstractDataBuffer(@androidx.annotation.Nullable com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>()
            r0.mDataHolder = r1
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            r0.release()
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public abstract T get(int r1);

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getCount()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.Nullable
    public final android.os.Bundle getMetadata() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.Bundle r0 = r0.getMetadata()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @java.lang.Deprecated
    public boolean isClosed() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            if (r0 == 0) goto Ld
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    @androidx.annotation.NonNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            com.google.android.gms.common.data.DataBufferIterator r0 = new com.google.android.gms.common.data.DataBufferIterator
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public void release() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.NonNull
    public java.util.Iterator<T> singleRefIterator() {
            r1 = this;
            com.google.android.gms.common.data.SingleRefDataBufferIterator r0 = new com.google.android.gms.common.data.SingleRefDataBufferIterator
            r0.<init>(r1)
            return r0
    }
}
