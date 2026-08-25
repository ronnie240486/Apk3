package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaj<E> implements java.util.Iterator<E> {
    public zzaj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    @java.lang.Deprecated
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
