package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class Size {
    public static final com.google.android.exoplayer2.util.Size UNKNOWN = null;
    public static final com.google.android.exoplayer2.util.Size ZERO = null;
    private final int height;
    private final int width;

    static {
            com.google.android.exoplayer2.util.Size r0 = new com.google.android.exoplayer2.util.Size
            r1 = -1
            r0.<init>(r1, r1)
            com.google.android.exoplayer2.util.Size.UNKNOWN = r0
            com.google.android.exoplayer2.util.Size r0 = new com.google.android.exoplayer2.util.Size
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.exoplayer2.util.Size.ZERO = r0
            return
    }

    public Size(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r2 == r0) goto L8
            if (r2 < 0) goto Ld
        L8:
            if (r3 == r0) goto Lf
            if (r3 < 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.width = r2
            r1.height = r3
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.exoplayer2.util.Size
            if (r2 == 0) goto L1b
            com.google.android.exoplayer2.util.Size r5 = (com.google.android.exoplayer2.util.Size) r5
            int r2 = r4.width
            int r3 = r5.width
            if (r2 != r3) goto L1b
            int r2 = r4.height
            int r5 = r5.height
            if (r2 != r5) goto L1b
            r0 = 1
        L1b:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.height
            int r1 = r3.width
            int r2 = r1 << 16
            int r1 = r1 >>> 16
            r1 = r1 | r2
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.width
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r2.height
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
