package com.google.common.cache;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
interface ReferenceEntry<K, V> {
    long getAccessTime();

    int getHash();

    @javax.annotation.CheckForNull
    K getKey();

    @javax.annotation.CheckForNull
    com.google.common.cache.ReferenceEntry<K, V> getNext();

    com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue();

    com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue();

    com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue();

    com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue();

    @javax.annotation.CheckForNull
    com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long r1);

    void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1);

    void setWriteTime(long r1);
}
