package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
public interface PropertyAccessor<T> {
    <S> T get(S r1);

    <S> void set(S r1, T r2);
}
