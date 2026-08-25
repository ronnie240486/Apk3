package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public interface Encoder<T> {
    void encode(org.bson.BsonWriter r1, T r2, org.bson.codecs.EncoderContext r3);

    java.lang.Class<T> getEncoderClass();
}
