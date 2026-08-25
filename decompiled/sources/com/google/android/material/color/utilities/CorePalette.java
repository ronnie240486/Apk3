package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class CorePalette {
    public com.google.android.material.color.utilities.TonalPalette a1;
    public com.google.android.material.color.utilities.TonalPalette a2;
    public com.google.android.material.color.utilities.TonalPalette a3;
    public com.google.android.material.color.utilities.TonalPalette error;
    public com.google.android.material.color.utilities.TonalPalette n1;
    public com.google.android.material.color.utilities.TonalPalette n2;

    private CorePalette(int r11, boolean r12) {
            r10 = this;
            r10.<init>()
            com.google.android.material.color.utilities.Hct r11 = com.google.android.material.color.utilities.Hct.fromInt(r11)
            double r0 = r11.getHue()
            double r2 = r11.getChroma()
            r4 = 4620693217682128896(0x4020000000000000, double:8.0)
            r6 = 4616189618054758400(0x4010000000000000, double:4.0)
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            if (r12 == 0) goto L4e
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r2)
            r10.a1 = r11
            r11 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r11 = r2 / r11
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r11)
            r10.a2 = r11
            double r8 = r8 + r0
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r2 / r11
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r8, r11)
            r10.a3 = r11
            r11 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r11 = r2 / r11
            double r11 = java.lang.Math.min(r11, r6)
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r11)
            r10.n1 = r11
            r11 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r2 = r2 / r11
            double r11 = java.lang.Math.min(r2, r4)
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r11)
            r10.n2 = r11
            goto L77
        L4e:
            r11 = 4631952216750555136(0x4048000000000000, double:48.0)
            double r11 = java.lang.Math.max(r11, r2)
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r11)
            r10.a1 = r11
            r11 = 4625196817309499392(0x4030000000000000, double:16.0)
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r11)
            r10.a2 = r11
            double r8 = r8 + r0
            r11 = 4627448617123184640(0x4038000000000000, double:24.0)
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r8, r11)
            r10.a3 = r11
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r6)
            r10.n1 = r11
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r0, r4)
            r10.n2 = r11
        L77:
            r11 = 4627730092099895296(0x4039000000000000, double:25.0)
            r0 = 4635611391447793664(0x4055000000000000, double:84.0)
            com.google.android.material.color.utilities.TonalPalette r11 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r11, r0)
            r10.error = r11
            return
    }

    public static com.google.android.material.color.utilities.CorePalette contentOf(int r2) {
            com.google.android.material.color.utilities.CorePalette r0 = new com.google.android.material.color.utilities.CorePalette
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.material.color.utilities.CorePalette of(int r2) {
            com.google.android.material.color.utilities.CorePalette r0 = new com.google.android.material.color.utilities.CorePalette
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
