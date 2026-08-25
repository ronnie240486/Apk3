package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public interface OverridableUuidRepresentationCodec<T> {
    org.bson.codecs.Codec<T> withUuidRepresentation(org.bson.UuidRepresentation r1);
}
