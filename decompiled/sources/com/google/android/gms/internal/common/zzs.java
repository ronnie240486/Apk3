package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs {
    public static int zza(int r5, int r6, java.lang.String r7) {
            if (r5 < 0) goto L6
            if (r5 < r6) goto L5
            goto L6
        L5:
            return r5
        L6:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 < 0) goto L37
            if (r6 >= 0) goto L1f
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r7 = 26
            java.lang.String r0 = "negative size: "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r7, r0, r6)
            r5.<init>(r6)
            throw r5
        L1f:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4[r3] = r5
            java.lang.String r5 = "%s (%s) must be less than size (%s)"
            java.lang.String r5 = com.google.android.gms.internal.common.zzy.zza(r5, r4)
            goto L47
        L37:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r1] = r5
            java.lang.String r5 = "%s (%s) must not be negative"
            java.lang.String r5 = com.google.android.gms.internal.common.zzy.zza(r5, r6)
        L47:
            r7.<init>(r5)
            throw r7
    }

    public static int zzb(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 > r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            java.lang.String r1 = zzd(r1, r2, r0)
            r3.<init>(r1)
            throw r3
    }

    public static void zzc(int r2, int r3, int r4) {
            if (r2 < 0) goto L8
            if (r3 < r2) goto L8
            if (r3 <= r4) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r2 < 0) goto L32
            if (r2 > r4) goto L32
            if (r3 < 0) goto L2b
            if (r3 <= r4) goto L13
            goto L2b
        L13:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r2 = com.google.android.gms.internal.common.zzy.zza(r2, r4)
            goto L39
        L2b:
            java.lang.String r2 = "end index"
            java.lang.String r2 = zzd(r3, r4, r2)
            goto L39
        L32:
            java.lang.String r3 = "start index"
            java.lang.String r2 = zzd(r2, r4, r3)
        L39:
            r0.<init>(r2)
            throw r0
    }

    private static java.lang.String zzd(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = com.google.android.gms.internal.common.zzy.zza(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r2] = r4
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r4 = com.google.android.gms.internal.common.zzy.zza(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r6 = 26
            java.lang.String r0 = "negative size: "
            java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r0, r5)
            r4.<init>(r5)
            throw r4
    }
}
