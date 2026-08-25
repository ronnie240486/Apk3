package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes3.dex */
public final class DolbyVisionConfig {
    public final java.lang.String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.profile = r1
            r0.level = r2
            r0.codecs = r3
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.video.DolbyVisionConfig parse(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            r0 = 2
            r4.skipBytes(r0)
            int r0 = r4.readUnsignedByte()
            int r1 = r0 >> 1
            r0 = r0 & 1
            r2 = 5
            int r0 = r0 << r2
            int r4 = r4.readUnsignedByte()
            int r4 = r4 >> 3
            r4 = r4 & 31
            r4 = r4 | r0
            r0 = 4
            if (r1 == r0) goto L30
            if (r1 == r2) goto L30
            r0 = 7
            if (r1 != r0) goto L20
            goto L30
        L20:
            r0 = 8
            if (r1 != r0) goto L27
            java.lang.String r0 = "hev1"
            goto L32
        L27:
            r0 = 9
            if (r1 != r0) goto L2e
            java.lang.String r0 = "avc3"
            goto L32
        L2e:
            r4 = 0
            return r4
        L30:
            java.lang.String r0 = "dvhe"
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ".0"
            r2.append(r0)
            r2.append(r1)
            r3 = 10
            if (r4 >= r3) goto L47
            goto L49
        L47:
            java.lang.String r0 = "."
        L49:
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.google.android.exoplayer2.video.DolbyVisionConfig r2 = new com.google.android.exoplayer2.video.DolbyVisionConfig
            r2.<init>(r1, r4, r0)
            return r2
    }
}
