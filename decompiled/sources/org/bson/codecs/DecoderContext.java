package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public final class DecoderContext {
    private static final org.bson.codecs.DecoderContext DEFAULT_CONTEXT = null;
    private final boolean checkedDiscriminator;

    /* JADX INFO: renamed from: org.bson.codecs.DecoderContext$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean checkedDiscriminator;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Builder(org.bson.codecs.DecoderContext.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public org.bson.codecs.DecoderContext build() {
                r2 = this;
                org.bson.codecs.DecoderContext r0 = new org.bson.codecs.DecoderContext
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public org.bson.codecs.DecoderContext.Builder checkedDiscriminator(boolean r1) {
                r0 = this;
                r0.checkedDiscriminator = r1
                return r0
        }

        public boolean hasCheckedDiscriminator() {
                r1 = this;
                boolean r0 = r1.checkedDiscriminator
                return r0
        }
    }

    static {
            org.bson.codecs.DecoderContext$Builder r0 = builder()
            org.bson.codecs.DecoderContext r0 = r0.build()
            org.bson.codecs.DecoderContext.DEFAULT_CONTEXT = r0
            return
    }

    private DecoderContext(org.bson.codecs.DecoderContext.Builder r1) {
            r0 = this;
            r0.<init>()
            boolean r1 = r1.hasCheckedDiscriminator()
            r0.checkedDiscriminator = r1
            return
    }

    public /* synthetic */ DecoderContext(org.bson.codecs.DecoderContext.Builder r1, org.bson.codecs.DecoderContext.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.bson.codecs.DecoderContext.Builder builder() {
            org.bson.codecs.DecoderContext$Builder r0 = new org.bson.codecs.DecoderContext$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public <T> T decodeWithChildContext(org.bson.codecs.Decoder<T> r2, org.bson.BsonReader r3) {
            r1 = this;
            org.bson.codecs.DecoderContext r0 = org.bson.codecs.DecoderContext.DEFAULT_CONTEXT
            java.lang.Object r2 = r2.decode(r3, r0)
            return r2
    }

    public boolean hasCheckedDiscriminator() {
            r1 = this;
            boolean r0 = r1.checkedDiscriminator
            return r0
    }
}
