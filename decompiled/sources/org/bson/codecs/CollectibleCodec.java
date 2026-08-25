package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public interface CollectibleCodec<T> extends org.bson.codecs.Codec<T> {
    boolean documentHasId(T r1);

    T generateIdIfAbsentFromDocument(T r1);

    org.bson.BsonValue getDocumentId(T r1);
}
