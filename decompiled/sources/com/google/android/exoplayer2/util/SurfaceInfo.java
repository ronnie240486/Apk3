package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceInfo {
    public final int height;
    public final int orientationDegrees;
    public final android.view.Surface surface;
    public final int width;

    public SurfaceInfo(android.view.Surface r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public SurfaceInfo(android.view.Surface r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            if (r6 == 0) goto L14
            r0 = 90
            if (r6 == r0) goto L14
            r0 = 180(0xb4, float:2.52E-43)
            if (r6 == r0) goto L14
            r0 = 270(0x10e, float:3.78E-43)
            if (r6 != r0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            java.lang.String r1 = "orientationDegrees must be 0, 90, 180, or 270"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            r2.surface = r3
            r2.width = r4
            r2.height = r5
            r2.orientationDegrees = r6
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.util.SurfaceInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.util.SurfaceInfo r5 = (com.google.android.exoplayer2.util.SurfaceInfo) r5
            int r1 = r4.width
            int r3 = r5.width
            if (r1 != r3) goto L29
            int r1 = r4.height
            int r3 = r5.height
            if (r1 != r3) goto L29
            int r1 = r4.orientationDegrees
            int r3 = r5.orientationDegrees
            if (r1 != r3) goto L29
            android.view.Surface r1 = r4.surface
            android.view.Surface r5 = r5.surface
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    public int hashCode() {
            r2 = this;
            android.view.Surface r0 = r2.surface
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.width
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.height
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.orientationDegrees
            int r0 = r0 + r1
            return r0
    }
}
