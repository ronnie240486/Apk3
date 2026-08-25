package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class EnumPropertyCodecProvider implements org.bson.codecs.pojo.PropertyCodecProvider {
    private final org.bson.codecs.configuration.CodecRegistry codecRegistry;

    /* JADX INFO: loaded from: classes.dex */
    public static class EnumCodec<T extends java.lang.Enum<T>> implements org.bson.codecs.Codec<T> {
        private final java.lang.Class<T> clazz;

        public EnumCodec(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.clazz = r1
                return
        }

        @Override // org.bson.codecs.Decoder
        public T decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
                r0 = this;
                java.lang.Class<T extends java.lang.Enum<T>> r2 = r0.clazz
                java.lang.String r1 = r1.readString()
                java.lang.Enum r1 = java.lang.Enum.valueOf(r2, r1)
                return r1
        }

        @Override // org.bson.codecs.Decoder
        public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
                r0 = this;
                java.lang.Enum r1 = r0.decode(r1, r2)
                return r1
        }

        public void encode(org.bson.BsonWriter r1, T r2, org.bson.codecs.EncoderContext r3) {
                r0 = this;
                java.lang.String r2 = r2.name()
                r1.writeString(r2)
                return
        }

        @Override // org.bson.codecs.Encoder
        public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
                r0 = this;
                java.lang.Enum r2 = (java.lang.Enum) r2
                r0.encode(r1, r2, r3)
                return
        }

        @Override // org.bson.codecs.Encoder
        public java.lang.Class<T> getEncoderClass() {
                r1 = this;
                java.lang.Class<T extends java.lang.Enum<T>> r0 = r1.clazz
                return r0
        }
    }

    public EnumPropertyCodecProvider(org.bson.codecs.configuration.CodecRegistry r1) {
            r0 = this;
            r0.<init>()
            r0.codecRegistry = r1
            return
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public <T> org.bson.codecs.Codec<T> get(org.bson.codecs.pojo.TypeWithTypeParameters<T> r1, org.bson.codecs.pojo.PropertyCodecRegistry r2) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L19
            org.bson.codecs.configuration.CodecRegistry r2 = r0.codecRegistry     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L13
            org.bson.codecs.Codec r1 = r2.get(r1)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L13
            return r1
        L13:
            org.bson.codecs.pojo.EnumPropertyCodecProvider$EnumCodec r2 = new org.bson.codecs.pojo.EnumPropertyCodecProvider$EnumCodec
            r2.<init>(r1)
            return r2
        L19:
            r1 = 0
            return r1
    }
}
