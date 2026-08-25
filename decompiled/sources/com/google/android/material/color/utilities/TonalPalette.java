package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class TonalPalette {
    public java.util.Map<java.lang.Integer, java.lang.Integer> cache;
    public double chroma;
    public double hue;

    private TonalPalette(double r2, double r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cache = r0
            r1.hue = r2
            r1.chroma = r4
            return
    }

    public static final com.google.android.material.color.utilities.TonalPalette fromHueAndChroma(double r1, double r3) {
            com.google.android.material.color.utilities.TonalPalette r0 = new com.google.android.material.color.utilities.TonalPalette
            r0.<init>(r1, r3)
            return r0
    }

    public static final com.google.android.material.color.utilities.TonalPalette fromInt(int r4) {
            com.google.android.material.color.utilities.Hct r4 = com.google.android.material.color.utilities.Hct.fromInt(r4)
            double r0 = r4.getHue()
            double r2 = r4.getChroma()
            com.google.android.material.color.utilities.TonalPalette r4 = fromHueAndChroma(r0, r2)
            return r4
    }

    public int tone(int r8) {
            r7 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r7.cache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L28
            double r1 = r7.hue
            double r3 = r7.chroma
            double r5 = (double) r8
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r1, r3, r5)
            int r0 = r0.toInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.cache
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.put(r8, r0)
        L28:
            int r8 = r0.intValue()
            return r8
    }
}
