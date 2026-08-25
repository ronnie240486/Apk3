package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.images.Size parseSize(@androidx.annotation.NonNull java.lang.String r3) throws java.lang.NumberFormatException {
            if (r3 == 0) goto L35
            r0 = 42
            int r0 = r3.indexOf(r0)
            if (r0 >= 0) goto L10
            r0 = 120(0x78, float:1.68E-43)
            int r0 = r3.indexOf(r0)
        L10:
            if (r0 < 0) goto L30
            com.google.android.gms.common.images.Size r1 = new com.google.android.gms.common.images.Size     // Catch: java.lang.NumberFormatException -> L2b
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2b
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2b
            r1.<init>(r2, r0)     // Catch: java.lang.NumberFormatException -> L2b
            return r1
        L2b:
            java.lang.NumberFormatException r3 = zaa(r3)
            throw r3
        L30:
            java.lang.NumberFormatException r3 = zaa(r3)
            throw r3
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "string must not be null"
            r3.<init>(r0)
            throw r3
    }

    private static java.lang.NumberFormatException zaa(java.lang.String r4) {
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r2 = r2 + 16
            r1.<init>(r2)
            java.lang.String r2 = "Invalid Size: \""
            java.lang.String r3 = "\""
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r4, r3)
            r0.<init>(r4)
            throw r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.images.Size
            if (r2 == 0) goto L1b
            com.google.android.gms.common.images.Size r5 = (com.google.android.gms.common.images.Size) r5
            int r2 = r4.zaa
            int r3 = r5.zaa
            if (r2 != r3) goto L1b
            int r2 = r4.zab
            int r5 = r5.zab
            if (r2 != r5) goto L1b
            return r1
        L1b:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.zab
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.zab
            int r1 = r3.zaa
            int r2 = r1 << 16
            int r1 = r1 >>> 16
            r1 = r1 | r2
            r0 = r0 ^ r1
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.zaa
            int r1 = r4.zab
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 23
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
