package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
public interface IdGenerator<T> {
    T generate();

    java.lang.Class<T> getType();
}
