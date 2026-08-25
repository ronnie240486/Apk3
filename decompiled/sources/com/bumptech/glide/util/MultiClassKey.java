package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes3.dex */
public class MultiClassKey {
    private java.lang.Class<?> first;
    private java.lang.Class<?> second;
    private java.lang.Class<?> third;

    public MultiClassKey() {
            r0 = this;
            r0.<init>()
            return
    }

    public MultiClassKey(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r2)
            return
    }

    public MultiClassKey(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.Nullable java.lang.Class<?> r3) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L36
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L36
        L12:
            com.bumptech.glide.util.MultiClassKey r5 = (com.bumptech.glide.util.MultiClassKey) r5
            java.lang.Class<?> r2 = r4.first
            java.lang.Class<?> r3 = r5.first
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            java.lang.Class<?> r2 = r4.second
            java.lang.Class<?> r3 = r5.second
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2a
            return r1
        L2a:
            java.lang.Class<?> r2 = r4.third
            java.lang.Class<?> r5 = r5.third
            boolean r5 = com.bumptech.glide.util.Util.bothNullOrEqual(r2, r5)
            if (r5 != 0) goto L35
            return r1
        L35:
            return r0
        L36:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.first
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.second
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Class<?> r0 = r2.third
            if (r0 == 0) goto L1a
            int r0 = r0.hashCode()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public void set(@androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
            r1 = this;
            r0 = 0
            r1.set(r2, r3, r0)
            return
    }

    public void set(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.Nullable java.lang.Class<?> r3) {
            r0 = this;
            r0.first = r1
            r0.second = r2
            r0.third = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MultiClassKey{first="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class<?> r1 = r2.first
            r0.append(r1)
            java.lang.String r1 = ", second="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.second
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
