package org.bson.codecs.configuration;

/* JADX INFO: loaded from: classes.dex */
public interface CodecProvider {
    <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1, org.bson.codecs.configuration.CodecRegistry r2);
}
