package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerCelebi {
    private QuantizerCelebi() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> quantize(int[] r5, int r6) {
            com.google.android.material.color.utilities.QuantizerWu r0 = new com.google.android.material.color.utilities.QuantizerWu
            r0.<init>()
            com.google.android.material.color.utilities.QuantizerResult r0 = r0.quantize(r5, r6)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.colorToCount
            java.util.Set r0 = r0.keySet()
            int r1 = r0.size()
            int[] r1 = new int[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L1a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r2 + 1
            int r3 = r3.intValue()
            r1[r2] = r3
            r2 = r4
            goto L1a
        L30:
            java.util.Map r5 = com.google.android.material.color.utilities.QuantizerWsmeans.quantize(r5, r1, r6)
            return r5
    }
}
