package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class Atomics {
    private Atomics() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference() {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            return r0
    }

    public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(@com.google.common.util.concurrent.ParametricNullness V r1) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(int r1) {
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E[] r1) {
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r1)
            return r0
    }
}
