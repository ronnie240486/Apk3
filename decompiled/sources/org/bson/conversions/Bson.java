package org.bson.conversions;

/* JADX INFO: loaded from: classes3.dex */
public interface Bson {
    <TDocument> org.bson.BsonDocument toBsonDocument(java.lang.Class<TDocument> r1, org.bson.codecs.configuration.CodecRegistry r2);
}
