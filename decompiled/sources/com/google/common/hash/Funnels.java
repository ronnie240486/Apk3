package com.google.common.hash;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class Funnels {

    /* JADX INFO: loaded from: classes.dex */
    public static final enum ByteArrayFunnel extends java.lang.Enum<com.google.common.hash.Funnels.ByteArrayFunnel> implements com.google.common.hash.Funnel<byte[]> {
        private static final /* synthetic */ com.google.common.hash.Funnels.ByteArrayFunnel[] $VALUES = null;
        public static final com.google.common.hash.Funnels.ByteArrayFunnel INSTANCE = null;

        private static /* synthetic */ com.google.common.hash.Funnels.ByteArrayFunnel[] $values() {
                r0 = 1
                com.google.common.hash.Funnels$ByteArrayFunnel[] r0 = new com.google.common.hash.Funnels.ByteArrayFunnel[r0]
                com.google.common.hash.Funnels$ByteArrayFunnel r1 = com.google.common.hash.Funnels.ByteArrayFunnel.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.hash.Funnels$ByteArrayFunnel r0 = new com.google.common.hash.Funnels$ByteArrayFunnel
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.hash.Funnels.ByteArrayFunnel.INSTANCE = r0
                com.google.common.hash.Funnels$ByteArrayFunnel[] r0 = $values()
                com.google.common.hash.Funnels.ByteArrayFunnel.$VALUES = r0
                return
        }

        private ByteArrayFunnel(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.hash.Funnels.ByteArrayFunnel valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.Funnels$ByteArrayFunnel> r0 = com.google.common.hash.Funnels.ByteArrayFunnel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.Funnels$ByteArrayFunnel r1 = (com.google.common.hash.Funnels.ByteArrayFunnel) r1
                return r1
        }

        public static com.google.common.hash.Funnels.ByteArrayFunnel[] values() {
                com.google.common.hash.Funnels$ByteArrayFunnel[] r0 = com.google.common.hash.Funnels.ByteArrayFunnel.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.Funnels$ByteArrayFunnel[] r0 = (com.google.common.hash.Funnels.ByteArrayFunnel[]) r0
                return r0
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(byte[] r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                byte[] r1 = (byte[]) r1
                r0.funnel2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(byte[] r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                r2.putBytes(r1)
                return
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Funnels.byteArrayFunnel()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum IntegerFunnel extends java.lang.Enum<com.google.common.hash.Funnels.IntegerFunnel> implements com.google.common.hash.Funnel<java.lang.Integer> {
        private static final /* synthetic */ com.google.common.hash.Funnels.IntegerFunnel[] $VALUES = null;
        public static final com.google.common.hash.Funnels.IntegerFunnel INSTANCE = null;

        private static /* synthetic */ com.google.common.hash.Funnels.IntegerFunnel[] $values() {
                r0 = 1
                com.google.common.hash.Funnels$IntegerFunnel[] r0 = new com.google.common.hash.Funnels.IntegerFunnel[r0]
                com.google.common.hash.Funnels$IntegerFunnel r1 = com.google.common.hash.Funnels.IntegerFunnel.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.hash.Funnels$IntegerFunnel r0 = new com.google.common.hash.Funnels$IntegerFunnel
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.hash.Funnels.IntegerFunnel.INSTANCE = r0
                com.google.common.hash.Funnels$IntegerFunnel[] r0 = $values()
                com.google.common.hash.Funnels.IntegerFunnel.$VALUES = r0
                return
        }

        private IntegerFunnel(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.hash.Funnels.IntegerFunnel valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.Funnels$IntegerFunnel> r0 = com.google.common.hash.Funnels.IntegerFunnel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.Funnels$IntegerFunnel r1 = (com.google.common.hash.Funnels.IntegerFunnel) r1
                return r1
        }

        public static com.google.common.hash.Funnels.IntegerFunnel[] values() {
                com.google.common.hash.Funnels$IntegerFunnel[] r0 = com.google.common.hash.Funnels.IntegerFunnel.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.Funnels$IntegerFunnel[] r0 = (com.google.common.hash.Funnels.IntegerFunnel[]) r0
                return r0
        }

        /* JADX INFO: renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(java.lang.Integer r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                int r1 = r1.intValue()
                r2.putInt(r1)
                return
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(java.lang.Integer r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                r0.funnel2(r1, r2)
                return
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Funnels.integerFunnel()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum LongFunnel extends java.lang.Enum<com.google.common.hash.Funnels.LongFunnel> implements com.google.common.hash.Funnel<java.lang.Long> {
        private static final /* synthetic */ com.google.common.hash.Funnels.LongFunnel[] $VALUES = null;
        public static final com.google.common.hash.Funnels.LongFunnel INSTANCE = null;

        private static /* synthetic */ com.google.common.hash.Funnels.LongFunnel[] $values() {
                r0 = 1
                com.google.common.hash.Funnels$LongFunnel[] r0 = new com.google.common.hash.Funnels.LongFunnel[r0]
                com.google.common.hash.Funnels$LongFunnel r1 = com.google.common.hash.Funnels.LongFunnel.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.hash.Funnels$LongFunnel r0 = new com.google.common.hash.Funnels$LongFunnel
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.hash.Funnels.LongFunnel.INSTANCE = r0
                com.google.common.hash.Funnels$LongFunnel[] r0 = $values()
                com.google.common.hash.Funnels.LongFunnel.$VALUES = r0
                return
        }

        private LongFunnel(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.hash.Funnels.LongFunnel valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.Funnels$LongFunnel> r0 = com.google.common.hash.Funnels.LongFunnel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.Funnels$LongFunnel r1 = (com.google.common.hash.Funnels.LongFunnel) r1
                return r1
        }

        public static com.google.common.hash.Funnels.LongFunnel[] values() {
                com.google.common.hash.Funnels$LongFunnel[] r0 = com.google.common.hash.Funnels.LongFunnel.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.Funnels$LongFunnel[] r0 = (com.google.common.hash.Funnels.LongFunnel[]) r0
                return r0
        }

        /* JADX INFO: renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(java.lang.Long r3, com.google.common.hash.PrimitiveSink r4) {
                r2 = this;
                long r0 = r3.longValue()
                r4.putLong(r0)
                return
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(java.lang.Long r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                r0.funnel2(r1, r2)
                return
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Funnels.longFunnel()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SequentialFunnel<E> implements com.google.common.hash.Funnel<java.lang.Iterable<? extends E>>, java.io.Serializable {
        private final com.google.common.hash.Funnel<E> elementFunnel;

        public SequentialFunnel(com.google.common.hash.Funnel<E> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.hash.Funnel r1 = (com.google.common.hash.Funnel) r1
                r0.elementFunnel = r1
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.hash.Funnels.SequentialFunnel
                if (r0 == 0) goto Lf
                com.google.common.hash.Funnels$SequentialFunnel r2 = (com.google.common.hash.Funnels.SequentialFunnel) r2
                com.google.common.hash.Funnel<E> r0 = r1.elementFunnel
                com.google.common.hash.Funnel<E> r2 = r2.elementFunnel
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public void funnel(java.lang.Iterable<? extends E> r3, com.google.common.hash.PrimitiveSink r4) {
                r2 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r3.next()
                com.google.common.hash.Funnel<E> r1 = r2.elementFunnel
                r1.funnel(r0, r4)
                goto L4
            L14:
                return
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(java.lang.Object r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r0.funnel(r1, r2)
                return
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<com.google.common.hash.Funnels$SequentialFunnel> r0 = com.google.common.hash.Funnels.SequentialFunnel.class
                int r0 = r0.hashCode()
                com.google.common.hash.Funnel<E> r1 = r2.elementFunnel
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.hash.Funnel<E> r0 = r4.elementFunnel
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 26
                java.lang.String r2 = "Funnels.sequentialFunnel("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static class SinkAsStream extends java.io.OutputStream {
        public final com.google.common.hash.PrimitiveSink sink;

        public SinkAsStream(com.google.common.hash.PrimitiveSink r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.hash.PrimitiveSink r1 = (com.google.common.hash.PrimitiveSink) r1
                r0.sink = r1
                return
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.hash.PrimitiveSink r0 = r4.sink
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 24
                java.lang.String r2 = "Funnels.asOutputStream("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }

        @Override // java.io.OutputStream
        public void write(int r2) {
                r1 = this;
                com.google.common.hash.PrimitiveSink r0 = r1.sink
                byte r2 = (byte) r2
                r0.putByte(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2) {
                r1 = this;
                com.google.common.hash.PrimitiveSink r0 = r1.sink
                r0.putBytes(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
                r1 = this;
                com.google.common.hash.PrimitiveSink r0 = r1.sink
                r0.putBytes(r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class StringCharsetFunnel implements com.google.common.hash.Funnel<java.lang.CharSequence>, java.io.Serializable {
        private final java.nio.charset.Charset charset;

        public static class SerializedForm implements java.io.Serializable {
            private static final long serialVersionUID = 0;
            private final java.lang.String charsetCanonicalName;

            private java.lang.Object readResolve() {
                    r1 = this;
                    java.lang.String r0 = r1.charsetCanonicalName
                    java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
                    com.google.common.hash.Funnel r0 = com.google.common.hash.Funnels.stringFunnel(r0)
                    return r0
            }
        }

        public StringCharsetFunnel(java.nio.charset.Charset r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
                r0.charset = r1
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.hash.Funnels.StringCharsetFunnel
                if (r0 == 0) goto Lf
                com.google.common.hash.Funnels$StringCharsetFunnel r2 = (com.google.common.hash.Funnels.StringCharsetFunnel) r2
                java.nio.charset.Charset r0 = r1.charset
                java.nio.charset.Charset r2 = r2.charset
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        /* JADX INFO: renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(java.lang.CharSequence r2, com.google.common.hash.PrimitiveSink r3) {
                r1 = this;
                java.nio.charset.Charset r0 = r1.charset
                r3.putString(r2, r0)
                return
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(java.lang.CharSequence r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.funnel2(r1, r2)
                return
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<com.google.common.hash.Funnels$StringCharsetFunnel> r0 = com.google.common.hash.Funnels.StringCharsetFunnel.class
                int r0 = r0.hashCode()
                java.nio.charset.Charset r1 = r2.charset
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.nio.charset.Charset r0 = r4.charset
                java.lang.String r0 = r0.name()
                r1 = 22
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
                java.lang.String r2 = "Funnels.stringFunnel("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum UnencodedCharsFunnel extends java.lang.Enum<com.google.common.hash.Funnels.UnencodedCharsFunnel> implements com.google.common.hash.Funnel<java.lang.CharSequence> {
        private static final /* synthetic */ com.google.common.hash.Funnels.UnencodedCharsFunnel[] $VALUES = null;
        public static final com.google.common.hash.Funnels.UnencodedCharsFunnel INSTANCE = null;

        private static /* synthetic */ com.google.common.hash.Funnels.UnencodedCharsFunnel[] $values() {
                r0 = 1
                com.google.common.hash.Funnels$UnencodedCharsFunnel[] r0 = new com.google.common.hash.Funnels.UnencodedCharsFunnel[r0]
                com.google.common.hash.Funnels$UnencodedCharsFunnel r1 = com.google.common.hash.Funnels.UnencodedCharsFunnel.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.hash.Funnels$UnencodedCharsFunnel r0 = new com.google.common.hash.Funnels$UnencodedCharsFunnel
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.hash.Funnels.UnencodedCharsFunnel.INSTANCE = r0
                com.google.common.hash.Funnels$UnencodedCharsFunnel[] r0 = $values()
                com.google.common.hash.Funnels.UnencodedCharsFunnel.$VALUES = r0
                return
        }

        private UnencodedCharsFunnel(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.hash.Funnels.UnencodedCharsFunnel valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.Funnels$UnencodedCharsFunnel> r0 = com.google.common.hash.Funnels.UnencodedCharsFunnel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.Funnels$UnencodedCharsFunnel r1 = (com.google.common.hash.Funnels.UnencodedCharsFunnel) r1
                return r1
        }

        public static com.google.common.hash.Funnels.UnencodedCharsFunnel[] values() {
                com.google.common.hash.Funnels$UnencodedCharsFunnel[] r0 = com.google.common.hash.Funnels.UnencodedCharsFunnel.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.Funnels$UnencodedCharsFunnel[] r0 = (com.google.common.hash.Funnels.UnencodedCharsFunnel[]) r0
                return r0
        }

        /* JADX INFO: renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(java.lang.CharSequence r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                r2.putUnencodedChars(r1)
                return
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(java.lang.CharSequence r1, com.google.common.hash.PrimitiveSink r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.funnel2(r1, r2)
                return
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Funnels.unencodedCharsFunnel()"
                return r0
        }
    }

    private Funnels() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.OutputStream asOutputStream(com.google.common.hash.PrimitiveSink r1) {
            com.google.common.hash.Funnels$SinkAsStream r0 = new com.google.common.hash.Funnels$SinkAsStream
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.hash.Funnel<byte[]> byteArrayFunnel() {
            com.google.common.hash.Funnels$ByteArrayFunnel r0 = com.google.common.hash.Funnels.ByteArrayFunnel.INSTANCE
            return r0
    }

    public static com.google.common.hash.Funnel<java.lang.Integer> integerFunnel() {
            com.google.common.hash.Funnels$IntegerFunnel r0 = com.google.common.hash.Funnels.IntegerFunnel.INSTANCE
            return r0
    }

    public static com.google.common.hash.Funnel<java.lang.Long> longFunnel() {
            com.google.common.hash.Funnels$LongFunnel r0 = com.google.common.hash.Funnels.LongFunnel.INSTANCE
            return r0
    }

    public static <E> com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> sequentialFunnel(com.google.common.hash.Funnel<E> r1) {
            com.google.common.hash.Funnels$SequentialFunnel r0 = new com.google.common.hash.Funnels$SequentialFunnel
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.hash.Funnel<java.lang.CharSequence> stringFunnel(java.nio.charset.Charset r1) {
            com.google.common.hash.Funnels$StringCharsetFunnel r0 = new com.google.common.hash.Funnels$StringCharsetFunnel
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.hash.Funnel<java.lang.CharSequence> unencodedCharsFunnel() {
            com.google.common.hash.Funnels$UnencodedCharsFunnel r0 = com.google.common.hash.Funnels.UnencodedCharsFunnel.INSTANCE
            return r0
    }
}
