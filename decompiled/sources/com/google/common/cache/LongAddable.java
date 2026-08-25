package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
interface LongAddable {
    void add(long r1);

    void increment();

    long sum();
}
