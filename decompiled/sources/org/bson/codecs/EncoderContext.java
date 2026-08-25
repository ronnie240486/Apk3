package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public final class EncoderContext {
    private static final org.bson.codecs.EncoderContext DEFAULT_CONTEXT = null;
    private final boolean encodingCollectibleDocument;

    /* JADX INFO: renamed from: org.bson.codecs.EncoderContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private boolean encodingCollectibleDocument;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Builder(org.bson.codecs.EncoderContext.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean access$200(org.bson.codecs.EncoderContext.Builder r0) {
                boolean r0 = r0.encodingCollectibleDocument
                return r0
        }

        public org.bson.codecs.EncoderContext build() {
                r2 = this;
                org.bson.codecs.EncoderContext r0 = new org.bson.codecs.EncoderContext
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public org.bson.codecs.EncoderContext.Builder isEncodingCollectibleDocument(boolean r1) {
                r0 = this;
                r0.encodingCollectibleDocument = r1
                return r0
        }
    }

    static {
            org.bson.codecs.EncoderContext$Builder r0 = builder()
            org.bson.codecs.EncoderContext r0 = r0.build()
            org.bson.codecs.EncoderContext.DEFAULT_CONTEXT = r0
            return
    }

    private EncoderContext(org.bson.codecs.EncoderContext.Builder r1) {
            r0 = this;
            r0.<init>()
            boolean r1 = org.bson.codecs.EncoderContext.Builder.access$200(r1)
            r0.encodingCollectibleDocument = r1
            return
    }

    public /* synthetic */ EncoderContext(org.bson.codecs.EncoderContext.Builder r1, org.bson.codecs.EncoderContext.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.bson.codecs.EncoderContext.Builder builder() {
            org.bson.codecs.EncoderContext$Builder r0 = new org.bson.codecs.EncoderContext$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public <T> void encodeWithChildContext(org.bson.codecs.Encoder<T> r2, org.bson.BsonWriter r3, T r4) {
            r1 = this;
            org.bson.codecs.EncoderContext r0 = org.bson.codecs.EncoderContext.DEFAULT_CONTEXT
            r2.encode(r3, r4, r0)
            return
    }

    public org.bson.codecs.EncoderContext getChildContext() {
            r1 = this;
            org.bson.codecs.EncoderContext r0 = org.bson.codecs.EncoderContext.DEFAULT_CONTEXT
            return r0
    }

    public boolean isEncodingCollectibleDocument() {
            r1 = this;
            boolean r0 = r1.encodingCollectibleDocument
            return r0
    }
}
