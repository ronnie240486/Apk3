package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
abstract class PojoCodec<T> implements org.bson.codecs.Codec<T> {
    public PojoCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract org.bson.codecs.pojo.ClassModel<T> getClassModel();
}
