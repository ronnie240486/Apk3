package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
final class FadeThroughUtils {
    private FadeThroughUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void calculateFadeOutAndInAlphas(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r6, float[] r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L15
            float r6 = r6 * r1
            float r0 = r0 - r6
            r7[r4] = r0
            r7[r2] = r3
            goto L1c
        L15:
            r7[r4] = r3
            float r6 = r6 * r1
            float r6 = r6 - r0
            r7[r2] = r6
        L1c:
            return
    }
}
