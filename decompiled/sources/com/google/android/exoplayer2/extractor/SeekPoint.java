package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class SeekPoint {
    public static final com.google.android.exoplayer2.extractor.SeekPoint START = null;
    public final long position;
    public final long timeUs;

    static {
            com.google.android.exoplayer2.extractor.SeekPoint r0 = new com.google.android.exoplayer2.extractor.SeekPoint
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.exoplayer2.extractor.SeekPoint.START = r0
            return
    }

    public SeekPoint(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.timeUs = r1
            r0.position = r3
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L25
            java.lang.Class<com.google.android.exoplayer2.extractor.SeekPoint> r2 = com.google.android.exoplayer2.extractor.SeekPoint.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.exoplayer2.extractor.SeekPoint r8 = (com.google.android.exoplayer2.extractor.SeekPoint) r8
            long r2 = r7.timeUs
            long r4 = r8.timeUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            long r2 = r7.position
            long r4 = r8.position
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.timeUs
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r4.position
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "[timeUs="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.timeUs
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.position
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
