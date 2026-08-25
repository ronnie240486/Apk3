package org.bson.codecs.jsr310;

/* JADX INFO: loaded from: classes3.dex */
public class Jsr310CodecProvider implements org.bson.codecs.configuration.CodecProvider {
    private static final java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> JSR310_CODEC_MAP = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.bson.codecs.jsr310.Jsr310CodecProvider.JSR310_CODEC_MAP = r0
            java.lang.String r0 = "java.time.Instant"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2c
            org.bson.codecs.jsr310.InstantCodec r0 = new org.bson.codecs.jsr310.InstantCodec     // Catch: java.lang.ClassNotFoundException -> L2c
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2c
            putCodec(r0)     // Catch: java.lang.ClassNotFoundException -> L2c
            org.bson.codecs.jsr310.LocalDateCodec r0 = new org.bson.codecs.jsr310.LocalDateCodec     // Catch: java.lang.ClassNotFoundException -> L2c
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2c
            putCodec(r0)     // Catch: java.lang.ClassNotFoundException -> L2c
            org.bson.codecs.jsr310.LocalDateTimeCodec r0 = new org.bson.codecs.jsr310.LocalDateTimeCodec     // Catch: java.lang.ClassNotFoundException -> L2c
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2c
            putCodec(r0)     // Catch: java.lang.ClassNotFoundException -> L2c
            org.bson.codecs.jsr310.LocalTimeCodec r0 = new org.bson.codecs.jsr310.LocalTimeCodec     // Catch: java.lang.ClassNotFoundException -> L2c
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L2c
            putCodec(r0)     // Catch: java.lang.ClassNotFoundException -> L2c
        L2c:
            return
    }

    public Jsr310CodecProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void putCodec(org.bson.codecs.Codec<?> r2) {
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r0 = org.bson.codecs.jsr310.Jsr310CodecProvider.JSR310_CODEC_MAP
            java.lang.Class r1 = r2.getEncoderClass()
            r0.put(r1, r2)
            return
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r2 = org.bson.codecs.jsr310.Jsr310CodecProvider.JSR310_CODEC_MAP
            java.lang.Object r1 = r2.get(r1)
            org.bson.codecs.Codec r1 = (org.bson.codecs.Codec) r1
            return r1
    }
}
