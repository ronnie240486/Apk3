package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
public interface InstanceCreator<T> {
    T getInstance();

    <S> void set(S r1, org.bson.codecs.pojo.PropertyModel<S> r2);
}
