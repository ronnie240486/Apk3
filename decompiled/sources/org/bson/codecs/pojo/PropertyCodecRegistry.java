package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
public interface PropertyCodecRegistry {
    <T> org.bson.codecs.Codec<T> get(org.bson.codecs.pojo.TypeWithTypeParameters<T> r1);
}
