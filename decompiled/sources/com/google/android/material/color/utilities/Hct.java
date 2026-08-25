package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int r1) {
            r0 = this;
            r0.<init>()
            r0.setInternalState(r1)
            return
    }

    public static com.google.android.material.color.utilities.Hct from(double r0, double r2, double r4) {
            int r0 = com.google.android.material.color.utilities.HctSolver.solveToInt(r0, r2, r4)
            com.google.android.material.color.utilities.Hct r1 = new com.google.android.material.color.utilities.Hct
            r1.<init>(r0)
            return r1
    }

    public static com.google.android.material.color.utilities.Hct fromInt(int r1) {
            com.google.android.material.color.utilities.Hct r0 = new com.google.android.material.color.utilities.Hct
            r0.<init>(r1)
            return r0
    }

    private void setInternalState(int r4) {
            r3 = this;
            r3.argb = r4
            com.google.android.material.color.utilities.Cam16 r0 = com.google.android.material.color.utilities.Cam16.fromInt(r4)
            double r1 = r0.getHue()
            r3.hue = r1
            double r0 = r0.getChroma()
            r3.chroma = r0
            double r0 = com.google.android.material.color.utilities.ColorUtils.lstarFromArgb(r4)
            r3.tone = r0
            return
    }

    public double getChroma() {
            r2 = this;
            double r0 = r2.chroma
            return r0
    }

    public double getHue() {
            r2 = this;
            double r0 = r2.hue
            return r0
    }

    public double getTone() {
            r2 = this;
            double r0 = r2.tone
            return r0
    }

    public void setChroma(double r7) {
            r6 = this;
            double r0 = r6.hue
            double r4 = r6.tone
            r2 = r7
            int r7 = com.google.android.material.color.utilities.HctSolver.solveToInt(r0, r2, r4)
            r6.setInternalState(r7)
            return
    }

    public void setHue(double r7) {
            r6 = this;
            double r2 = r6.chroma
            double r4 = r6.tone
            r0 = r7
            int r7 = com.google.android.material.color.utilities.HctSolver.solveToInt(r0, r2, r4)
            r6.setInternalState(r7)
            return
    }

    public void setTone(double r7) {
            r6 = this;
            double r0 = r6.hue
            double r2 = r6.chroma
            r4 = r7
            int r7 = com.google.android.material.color.utilities.HctSolver.solveToInt(r0, r2, r4)
            r6.setInternalState(r7)
            return
    }

    public int toInt() {
            r1 = this;
            int r0 = r1.argb
            return r0
    }
}
