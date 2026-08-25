package com.google.android.exoplayer2.extractor.flv;

/* JADX INFO: loaded from: classes.dex */
abstract class TagPayloadReader {
    public final com.google.android.exoplayer2.extractor.TrackOutput output;

    public static final class UnsupportedFormatException extends com.google.android.exoplayer2.ParserException {
        public UnsupportedFormatException(java.lang.String r4) {
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                r3.<init>(r4, r0, r1, r2)
                return
        }
    }

    public TagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput r1) {
            r0 = this;
            r0.<init>()
            r0.output = r1
            return
    }

    public final boolean consume(com.google.android.exoplayer2.util.ParsableByteArray r2, long r3) throws com.google.android.exoplayer2.ParserException {
            r1 = this;
            boolean r0 = r1.parseHeader(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.parsePayload(r2, r3)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public abstract boolean parseHeader(com.google.android.exoplayer2.util.ParsableByteArray r1) throws com.google.android.exoplayer2.ParserException;

    public abstract boolean parsePayload(com.google.android.exoplayer2.util.ParsableByteArray r1, long r2) throws com.google.android.exoplayer2.ParserException;

    public abstract void seek();
}
