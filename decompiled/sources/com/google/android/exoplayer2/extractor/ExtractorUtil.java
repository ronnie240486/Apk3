package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class ExtractorUtil {
    private ExtractorUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void checkContainerInput(boolean r0, @androidx.annotation.Nullable java.lang.String r1) throws com.google.android.exoplayer2.ParserException {
            if (r0 == 0) goto L3
            return
        L3:
            r0 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
    }

    public static boolean peekFullyQuietly(com.google.android.exoplayer2.extractor.ExtractorInput r0, byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException {
            boolean r0 = r0.peekFully(r1, r2, r3, r4)     // Catch: java.io.EOFException -> L5
            return r0
        L5:
            r0 = move-exception
            if (r4 == 0) goto La
            r0 = 0
            return r0
        La:
            throw r0
    }

    public static int peekToLength(com.google.android.exoplayer2.extractor.ExtractorInput r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            r0 = 0
        L1:
            if (r0 >= r6) goto L11
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.peek(r4, r1, r2)
            r2 = -1
            if (r1 != r2) goto Lf
            goto L11
        Lf:
            int r0 = r0 + r1
            goto L1
        L11:
            return r0
    }

    public static boolean readFullyQuietly(com.google.android.exoplayer2.extractor.ExtractorInput r0, byte[] r1, int r2, int r3) throws java.io.IOException {
            r0.readFully(r1, r2, r3)     // Catch: java.io.EOFException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean skipFullyQuietly(com.google.android.exoplayer2.extractor.ExtractorInput r0, int r1) throws java.io.IOException {
            r0.skipFully(r1)     // Catch: java.io.EOFException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}
