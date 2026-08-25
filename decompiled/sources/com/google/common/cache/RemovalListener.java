package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public interface RemovalListener<K, V> {
    void onRemoval(com.google.common.cache.RemovalNotification<K, V> r1);
}
