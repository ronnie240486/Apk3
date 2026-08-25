package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
final class HtmlUtils {
    private HtmlUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String cssAllClassDescendantsSelector(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ",."
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " *"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String toCssRgba(@androidx.annotation.ColorInt int r5) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = android.graphics.Color.red(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = android.graphics.Color.green(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = android.graphics.Color.blue(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r5 = android.graphics.Color.alpha(r5)
            double r1 = (double) r5
            r3 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 / r3
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r1 = 3
            r0[r1] = r5
            java.lang.String r5 = "rgba(%d,%d,%d,%.3f)"
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.formatInvariant(r5, r0)
            return r5
    }
}
