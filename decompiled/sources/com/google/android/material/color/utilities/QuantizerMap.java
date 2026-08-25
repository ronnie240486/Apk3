package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerMap implements com.google.android.material.color.utilities.Quantizer {
    public java.util.Map<java.lang.Integer, java.lang.Integer> colorToCount;

    public QuantizerMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.Map<java.lang.Integer, java.lang.Integer> getColorToCount() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.colorToCount
            return r0
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public com.google.android.material.color.utilities.QuantizerResult quantize(int[] r6, int r7) {
            r5 = this;
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r0 = r6.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L2c
            r2 = r6[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r7.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 1
            if (r3 != 0) goto L19
            goto L1e
        L19:
            int r3 = r3.intValue()
            int r4 = r4 + r3
        L1e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r7.put(r2, r3)
            int r1 = r1 + 1
            goto L7
        L2c:
            r5.colorToCount = r7
            com.google.android.material.color.utilities.QuantizerResult r6 = new com.google.android.material.color.utilities.QuantizerResult
            r6.<init>(r7)
            return r6
    }
}
