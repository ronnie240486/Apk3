package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class PointProviderLab implements com.google.android.material.color.utilities.PointProvider {
    public PointProviderLab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] r8, double[] r9) {
            r7 = this;
            r0 = 0
            r1 = r8[r0]
            r3 = r9[r0]
            double r1 = r1 - r3
            r0 = 1
            r3 = r8[r0]
            r5 = r9[r0]
            double r3 = r3 - r5
            r0 = 2
            r5 = r8[r0]
            r8 = r9[r0]
            double r5 = r5 - r8
            double r1 = r1 * r1
            double r3 = r3 * r3
            double r3 = r3 + r1
            double r5 = r5 * r5
            double r5 = r5 + r3
            return r5
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int r5) {
            r4 = this;
            double[] r5 = com.google.android.material.color.utilities.ColorUtils.labFromArgb(r5)
            r0 = 3
            double[] r0 = new double[r0]
            r1 = 0
            r2 = r5[r1]
            r0[r1] = r2
            r1 = 1
            r2 = r5[r1]
            r0[r1] = r2
            r1 = 2
            r2 = r5[r1]
            r0[r1] = r2
            return r0
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] r8) {
            r7 = this;
            r0 = 0
            r1 = r8[r0]
            r0 = 1
            r3 = r8[r0]
            r0 = 2
            r5 = r8[r0]
            int r8 = com.google.android.material.color.utilities.ColorUtils.argbFromLab(r1, r3, r5)
            return r8
    }
}
