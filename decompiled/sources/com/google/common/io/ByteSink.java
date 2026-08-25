package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ByteSink {

    /* JADX INFO: renamed from: com.google.common.io.ByteSink$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class AsCharSink extends com.google.common.io.CharSink {
        private final java.nio.charset.Charset charset;
        public final /* synthetic */ com.google.common.io.ByteSink this$0;

        private AsCharSink(com.google.common.io.ByteSink r1, java.nio.charset.Charset r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
                r0.charset = r1
                return
        }

        public /* synthetic */ AsCharSink(com.google.common.io.ByteSink r1, java.nio.charset.Charset r2, com.google.common.io.ByteSink.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.io.CharSink
        public java.io.Writer openStream() throws java.io.IOException {
                r3 = this;
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
                com.google.common.io.ByteSink r1 = r3.this$0
                java.io.OutputStream r1 = r1.openStream()
                java.nio.charset.Charset r2 = r3.charset
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.io.ByteSink r0 = r5.this$0
                java.lang.String r0 = r0.toString()
                java.nio.charset.Charset r1 = r5.charset
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = 13
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = ".asCharSink("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    public ByteSink() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.common.io.CharSink asCharSink(java.nio.charset.Charset r3) {
            r2 = this;
            com.google.common.io.ByteSink$AsCharSink r0 = new com.google.common.io.ByteSink$AsCharSink
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public java.io.OutputStream openBufferedStream() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.openStream()
            boolean r1 = r0 instanceof java.io.BufferedOutputStream
            if (r1 == 0) goto Lb
            java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
            goto L11
        Lb:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            r1.<init>(r0)
            r0 = r1
        L11:
            return r0
    }

    public abstract java.io.OutputStream openStream() throws java.io.IOException;

    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.OutputStream r1 = r2.openStream()     // Catch: java.lang.Throwable -> L1b
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1b
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch: java.lang.Throwable -> L1b
            r1.write(r3)     // Catch: java.lang.Throwable -> L1b
            r1.flush()     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r3 = move-exception
            java.lang.RuntimeException r3 = r0.rethrow(r3)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L21
        L21:
            r3 = move-exception
            r0.close()
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long writeFrom(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.OutputStream r1 = r4.openStream()     // Catch: java.lang.Throwable -> L1c
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1c
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch: java.lang.Throwable -> L1c
            long r2 = com.google.common.io.ByteStreams.copy(r5, r1)     // Catch: java.lang.Throwable -> L1c
            r1.flush()     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return r2
        L1c:
            r5 = move-exception
            java.lang.RuntimeException r5 = r0.rethrow(r5)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L22:
            r5 = move-exception
            r0.close()
            throw r5
    }
}
