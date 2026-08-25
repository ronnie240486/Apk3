package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeWithTypeParameters<T> {
    java.lang.Class<T> getType();

    java.util.List<? extends org.bson.codecs.pojo.TypeWithTypeParameters<?>> getTypeParameters();
}
