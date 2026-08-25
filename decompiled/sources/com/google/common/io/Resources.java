package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class Resources {


    /* JADX INFO: loaded from: classes2.dex */
    public static final class UrlByteSource extends com.google.common.io.ByteSource {
        private final java.net.URL url;

        private UrlByteSource(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.net.URL r1 = (java.net.URL) r1
                r0.url = r1
                return
        }

        public /* synthetic */ UrlByteSource(java.net.URL r1, com.google.common.io.Resources.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
                r1 = this;
                java.net.URL r0 = r1.url
                java.io.InputStream r0 = r0.openStream()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.net.URL r0 = r4.url
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 24
                java.lang.String r2 = "Resources.asByteSource("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    private Resources() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.io.ByteSource asByteSource(java.net.URL r2) {
            com.google.common.io.Resources$UrlByteSource r0 = new com.google.common.io.Resources$UrlByteSource
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.io.CharSource asCharSource(java.net.URL r0, java.nio.charset.Charset r1) {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            com.google.common.io.CharSource r0 = r0.asCharSource(r1)
            return r0
    }

    public static void copy(java.net.URL r0, java.io.OutputStream r1) throws java.io.IOException {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            r0.copyTo(r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static java.net.URL getResource(java.lang.Class<?> r3, java.lang.String r4) {
            java.net.URL r0 = r3.getResource(r4)
            if (r0 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r3 = r3.getName()
            java.lang.String r2 = "resource %s relative to %s not found."
            com.google.common.base.Preconditions.checkArgument(r1, r2, r4, r3)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static java.net.URL getResource(java.lang.String r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.lang.Class<com.google.common.io.Resources> r1 = com.google.common.io.Resources.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r1)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.net.URL r0 = r0.getResource(r3)
            if (r0 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            java.lang.String r2 = "resource %s not found."
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.io.ParametricNullness
    public static <T> T readLines(java.net.URL r0, java.nio.charset.Charset r1, com.google.common.io.LineProcessor<T> r2) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            java.lang.Object r0 = r0.readLines(r2)
            return r0
    }

    public static java.util.List<java.lang.String> readLines(java.net.URL r1, java.nio.charset.Charset r2) throws java.io.IOException {
            com.google.common.io.Resources$1 r0 = new com.google.common.io.Resources$1
            r0.<init>()
            java.lang.Object r1 = readLines(r1, r2, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static byte[] toByteArray(java.net.URL r0) throws java.io.IOException {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            byte[] r0 = r0.read()
            return r0
    }

    public static java.lang.String toString(java.net.URL r0, java.nio.charset.Charset r1) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            java.lang.String r0 = r0.read()
            return r0
    }
}
