package org.bson.internal;

/* JADX INFO: loaded from: classes2.dex */
interface CycleDetectingCodecRegistry extends org.bson.codecs.configuration.CodecRegistry {
    <T> org.bson.codecs.Codec<T> get(org.bson.internal.ChildCodecRegistry<T> r1);
}
