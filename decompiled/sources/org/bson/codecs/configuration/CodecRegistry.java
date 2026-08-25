package org.bson.codecs.configuration;

/* JADX INFO: loaded from: classes3.dex */
public interface CodecRegistry {
    <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1);
}
