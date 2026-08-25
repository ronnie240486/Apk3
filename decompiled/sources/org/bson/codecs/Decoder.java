package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public interface Decoder<T> {
    T decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2);
}
