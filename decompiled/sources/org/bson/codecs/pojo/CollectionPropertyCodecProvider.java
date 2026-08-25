package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class CollectionPropertyCodecProvider implements org.bson.codecs.pojo.PropertyCodecProvider {

    public static class CollectionCodec<T> implements org.bson.codecs.Codec<java.util.Collection<T>> {
        private final org.bson.codecs.Codec<T> codec;
        private final java.lang.Class<java.util.Collection<T>> encoderClass;

        public CollectionCodec(java.lang.Class<java.util.Collection<T>> r1, org.bson.codecs.Codec<T> r2) {
                r0 = this;
                r0.<init>()
                r0.encoderClass = r1
                r0.codec = r2
                return
        }

        private java.util.Collection<T> getInstance() {
                r4 = this;
                java.lang.Class<java.util.Collection<T>> r0 = r4.encoderClass
                boolean r0 = r0.isInterface()
                r1 = 0
                if (r0 == 0) goto L40
                java.lang.Class<java.util.Collection<T>> r0 = r4.encoderClass
                java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 == 0) goto L19
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
            L19:
                java.lang.Class<java.util.Collection<T>> r0 = r4.encoderClass
                java.lang.Class<java.util.HashSet> r2 = java.util.HashSet.class
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 == 0) goto L29
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                return r0
            L29:
                org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Class<java.util.Collection<T>> r3 = r4.encoderClass
                java.lang.String r3 = r3.getName()
                r2[r1] = r3
                java.lang.String r1 = "Unsupported Collection interface of %s!"
                java.lang.String r1 = java.lang.String.format(r1, r2)
                r0.<init>(r1)
                throw r0
            L40:
                java.lang.Class<java.util.Collection<T>> r0 = r4.encoderClass     // Catch: java.lang.Exception -> L51
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L51
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L51
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L51
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L51
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Exception -> L51
                return r0
            L51:
                r0 = move-exception
                org.bson.codecs.configuration.CodecConfigurationException r1 = new org.bson.codecs.configuration.CodecConfigurationException
                java.lang.String r2 = r0.getMessage()
                r1.<init>(r2, r0)
                throw r1
        }

        @Override // org.bson.codecs.Decoder
        public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
                r0 = this;
                java.util.Collection r1 = r0.decode(r1, r2)
                return r1
        }

        @Override // org.bson.codecs.Decoder
        public java.util.Collection<T> decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
                r3 = this;
                java.util.Collection r0 = r3.getInstance()
                r4.readStartArray()
            L7:
                org.bson.BsonType r1 = r4.readBsonType()
                org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
                if (r1 == r2) goto L29
                org.bson.BsonType r1 = r4.getCurrentBsonType()
                org.bson.BsonType r2 = org.bson.BsonType.NULL
                if (r1 != r2) goto L1f
                r1 = 0
                r0.add(r1)
                r4.readNull()
                goto L7
            L1f:
                org.bson.codecs.Codec<T> r1 = r3.codec
                java.lang.Object r1 = r1.decode(r4, r5)
                r0.add(r1)
                goto L7
            L29:
                r4.readEndArray()
                return r0
        }

        @Override // org.bson.codecs.Encoder
        public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.encode(r1, r2, r3)
                return
        }

        public void encode(org.bson.BsonWriter r3, java.util.Collection<T> r4, org.bson.codecs.EncoderContext r5) {
                r2 = this;
                r3.writeStartArray()
                java.util.Iterator r4 = r4.iterator()
            L7:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r4.next()
                if (r0 != 0) goto L17
                r3.writeNull()
                goto L7
            L17:
                org.bson.codecs.Codec<T> r1 = r2.codec
                r1.encode(r3, r0, r5)
                goto L7
            L1d:
                r3.writeEndArray()
                return
        }

        @Override // org.bson.codecs.Encoder
        public java.lang.Class<java.util.Collection<T>> getEncoderClass() {
                r1 = this;
                java.lang.Class<java.util.Collection<T>> r0 = r1.encoderClass
                return r0
        }
    }

    public CollectionPropertyCodecProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public <T> org.bson.codecs.Codec<T> get(org.bson.codecs.pojo.TypeWithTypeParameters<T> r4, org.bson.codecs.pojo.PropertyCodecRegistry r5) {
            r3 = this;
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.Class r1 = r4.getType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L30
            java.util.List r0 = r4.getTypeParameters()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L30
            org.bson.codecs.pojo.CollectionPropertyCodecProvider$CollectionCodec r0 = new org.bson.codecs.pojo.CollectionPropertyCodecProvider$CollectionCodec
            java.lang.Class r1 = r4.getType()
            java.util.List r4 = r4.getTypeParameters()
            r2 = 0
            java.lang.Object r4 = r4.get(r2)
            org.bson.codecs.pojo.TypeWithTypeParameters r4 = (org.bson.codecs.pojo.TypeWithTypeParameters) r4
            org.bson.codecs.Codec r4 = r5.get(r4)
            r0.<init>(r1, r4)
            return r0
        L30:
            r4 = 0
            return r4
    }
}
