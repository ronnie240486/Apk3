package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Blend {
    private Blend() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int cam16Ucs(int r18, int r19, double r20) {
            com.google.android.material.color.utilities.Cam16 r0 = com.google.android.material.color.utilities.Cam16.fromInt(r18)
            com.google.android.material.color.utilities.Cam16 r1 = com.google.android.material.color.utilities.Cam16.fromInt(r19)
            double r2 = r0.getJstar()
            double r4 = r0.getAstar()
            double r6 = r0.getBstar()
            double r8 = r1.getJstar()
            double r10 = r1.getAstar()
            double r0 = r1.getBstar()
            double r8 = r8 - r2
            double r8 = r8 * r20
            double r12 = r8 + r2
            double r10 = r10 - r4
            double r10 = r10 * r20
            double r14 = r10 + r4
            double r0 = r0 - r6
            double r0 = r0 * r20
            double r16 = r0 + r6
            com.google.android.material.color.utilities.Cam16 r0 = com.google.android.material.color.utilities.Cam16.fromUcs(r12, r14, r16)
            int r0 = r0.toInt()
            return r0
    }

    public static int harmonize(int r12, int r13) {
            com.google.android.material.color.utilities.Hct r12 = com.google.android.material.color.utilities.Hct.fromInt(r12)
            com.google.android.material.color.utilities.Hct r13 = com.google.android.material.color.utilities.Hct.fromInt(r13)
            double r0 = r12.getHue()
            double r2 = r13.getHue()
            double r0 = com.google.android.material.color.utilities.MathUtils.differenceDegrees(r0, r2)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 * r2
            r2 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r0 = java.lang.Math.min(r0, r2)
            double r2 = r12.getHue()
            double r4 = r12.getHue()
            double r6 = r13.getHue()
            double r4 = com.google.android.material.color.utilities.MathUtils.rotationDirection(r4, r6)
            double r4 = r4 * r0
            double r4 = r4 + r2
            double r6 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r4)
            double r8 = r12.getChroma()
            double r10 = r12.getTone()
            com.google.android.material.color.utilities.Hct r12 = com.google.android.material.color.utilities.Hct.from(r6, r8, r10)
            int r12 = r12.toInt()
            return r12
    }

    public static int hctHue(int r6, int r7, double r8) {
            int r7 = cam16Ucs(r6, r7, r8)
            com.google.android.material.color.utilities.Cam16 r7 = com.google.android.material.color.utilities.Cam16.fromInt(r7)
            com.google.android.material.color.utilities.Cam16 r8 = com.google.android.material.color.utilities.Cam16.fromInt(r6)
            double r0 = r7.getHue()
            double r2 = r8.getChroma()
            double r4 = com.google.android.material.color.utilities.ColorUtils.lstarFromArgb(r6)
            com.google.android.material.color.utilities.Hct r6 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            int r6 = r6.toInt()
            return r6
    }
}
