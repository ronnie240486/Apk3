package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public class FrameInfo {
    public final int height;
    public final float pixelWidthHeightRatio;
    public final long streamOffsetUs;
    public final int width;

    public FrameInfo(int r6, int r7, float r8, long r9) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "width must be positive, but is: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2, r3)
            if (r7 <= 0) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "height must be positive, but is: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            r5.width = r6
            r5.height = r7
            r5.pixelWidthHeightRatio = r8
            r5.streamOffsetUs = r9
            return
    }
}
