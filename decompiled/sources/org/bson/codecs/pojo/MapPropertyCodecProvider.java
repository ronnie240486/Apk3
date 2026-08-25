package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class MapPropertyCodecProvider implements org.bson.codecs.pojo.PropertyCodecProvider {

    /* JADX INFO: loaded from: classes.dex */
    public static class MapCodec<T> implements org.bson.codecs.Codec<java.util.Map<java.lang.String, T>> {
        private final org.bson.codecs.Codec<T> codec;
        private final java.lang.Class<java.util.Map<java.lang.String, T>> encoderClass;

        public MapCodec(java.lang.Class<java.util.Map<java.lang.String, T>> r1, org.bson.codecs.Codec<T> r2) {
                r0 = this;
                r0.<init>()
                r0.encoderClass = r1
                r0.codec = r2
                return
        }

        private java.util.Map<java.lang.String, T> getInstance() {
                r3 = this;
                java.lang.Class<java.util.Map<java.lang.String, T>> r0 = r3.encoderClass
                boolean r0 = r0.isInterface()
                if (r0 == 0) goto Le
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                return r0
            Le:
                java.lang.Class<java.util.Map<java.lang.String, T>> r0 = r3.encoderClass     // Catch: java.lang.Exception -> L20
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L20
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L20
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L20
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L20
                java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L20
                return r0
            L20:
                r0 = move-exception
                org.bson.codecs.configuration.CodecConfigurationException r1 = new org.bson.codecs.configuration.CodecConfigurationException
                java.lang.String r2 = r0.getMessage()
                r1.<init>(r2, r0)
                throw r1
        }

        @Override // org.bson.codecs.Decoder
        public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
                r0 = this;
                java.util.Map r1 = r0.decode(r1, r2)
                return r1
        }

        @Override // org.bson.codecs.Decoder
        public java.util.Map<java.lang.String, T> decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
                r3 = this;
                r4.readStartDocument()
                java.util.Map r0 = r3.getInstance()
            L7:
                org.bson.BsonType r1 = r4.readBsonType()
                org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
                if (r1 == r2) goto L31
                org.bson.BsonType r1 = r4.getCurrentBsonType()
                org.bson.BsonType r2 = org.bson.BsonType.NULL
                if (r1 != r2) goto L23
                java.lang.String r1 = r4.readName()
                r2 = 0
                r0.put(r1, r2)
                r4.readNull()
                goto L7
            L23:
                java.lang.String r1 = r4.readName()
                org.bson.codecs.Codec<T> r2 = r3.codec
                java.lang.Object r2 = r2.decode(r4, r5)
                r0.put(r1, r2)
                goto L7
            L31:
                r4.readEndDocument()
                return r0
        }

        @Override // org.bson.codecs.Encoder
        public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.encode(r1, r2, r3)
                return
        }

        public void encode(org.bson.BsonWriter r3, java.util.Map<java.lang.String, T> r4, org.bson.codecs.EncoderContext r5) {
                r2 = this;
                r3.writeStartDocument()
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            Lb:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L34
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                r3.writeName(r1)
                java.lang.Object r1 = r0.getValue()
                if (r1 != 0) goto L2a
                r3.writeNull()
                goto Lb
            L2a:
                org.bson.codecs.Codec<T> r1 = r2.codec
                java.lang.Object r0 = r0.getValue()
                r1.encode(r3, r0, r5)
                goto Lb
            L34:
                r3.writeEndDocument()
                return
        }

        @Override // org.bson.codecs.Encoder
        public java.lang.Class<java.util.Map<java.lang.String, T>> getEncoderClass() {
                r1 = this;
                java.lang.Class<java.util.Map<java.lang.String, T>> r0 = r1.encoderClass
                return r0
        }
    }

    public MapPropertyCodecProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public <T> org.bson.codecs.Codec<T> get(org.bson.codecs.pojo.TypeWithTypeParameters<T> r5, org.bson.codecs.pojo.PropertyCodecRegistry r6) {
            r4 = this;
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.Class r1 = r5.getType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L7a
            java.util.List r0 = r5.getTypeParameters()
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L7a
            java.util.List r0 = r5.getTypeParameters()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.bson.codecs.pojo.TypeWithTypeParameters r0 = (org.bson.codecs.pojo.TypeWithTypeParameters) r0
            java.lang.Class r0 = r0.getType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r2 = r0.equals(r2)
            r3 = 1
            if (r2 == 0) goto L6a
            org.bson.codecs.pojo.MapPropertyCodecProvider$MapCodec r0 = new org.bson.codecs.pojo.MapPropertyCodecProvider$MapCodec     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            java.lang.Class r1 = r5.getType()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            java.util.List r2 = r5.getTypeParameters()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            java.lang.Object r2 = r2.get(r3)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            org.bson.codecs.pojo.TypeWithTypeParameters r2 = (org.bson.codecs.pojo.TypeWithTypeParameters) r2     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            org.bson.codecs.Codec r2 = r6.get(r2)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            r0.<init>(r1, r2)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L47
            return r0
        L47:
            r0 = move-exception
            java.util.List r5 = r5.getTypeParameters()
            java.lang.Object r5 = r5.get(r3)
            org.bson.codecs.pojo.TypeWithTypeParameters r5 = (org.bson.codecs.pojo.TypeWithTypeParameters) r5
            java.lang.Class r5 = r5.getType()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r5 != r1) goto L69
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            org.bson.codecs.pojo.TypeData$Builder r5 = org.bson.codecs.pojo.TypeData.builder(r5)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L69
            org.bson.codecs.pojo.TypeData r5 = r5.build()     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L69
            org.bson.codecs.Codec r5 = r6.get(r5)     // Catch: org.bson.codecs.configuration.CodecConfigurationException -> L69
            return r5
        L69:
            throw r0
        L6a:
            org.bson.codecs.configuration.CodecConfigurationException r5 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r1] = r0
            java.lang.String r0 = "Invalid Map type. Maps MUST have string keys, found %s instead."
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r5.<init>(r6)
            throw r5
        L7a:
            r5 = 0
            return r5
    }
}
