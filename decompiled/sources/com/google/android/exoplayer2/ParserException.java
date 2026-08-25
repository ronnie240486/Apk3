package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public class ParserException extends java.io.IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.contentIsMalformed = r3
            r0.dataType = r4
            return
    }

    public static com.google.android.exoplayer2.ParserException createForMalformedContainer(@androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.Throwable r3) {
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 1
            r0.<init>(r2, r3, r1, r1)
            return r0
    }

    public static com.google.android.exoplayer2.ParserException createForMalformedDataOfUnknownType(@androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 1
            r2 = 0
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.ParserException createForMalformedManifest(@androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 1
            r2 = 4
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.ParserException createForManifestWithUnsupportedFeature(@androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 0
            r2 = 4
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static com.google.android.exoplayer2.ParserException createForUnsupportedContainerFeature(@androidx.annotation.Nullable java.lang.String r4) {
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r4, r1, r2, r3)
            return r0
    }
}
