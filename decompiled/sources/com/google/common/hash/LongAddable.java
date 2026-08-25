package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
interface LongAddable {
    void add(long r1);

    void increment();

    long sum();
}
