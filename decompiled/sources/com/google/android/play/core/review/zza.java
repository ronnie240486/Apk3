package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zza extends com.google.android.play.core.review.ReviewInfo {
    private final android.app.PendingIntent zza;
    private final boolean zzb;

    public zza(android.app.PendingIntent r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null pendingIntent"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.review.ReviewInfo
            r2 = 0
            if (r1 == 0) goto L20
            com.google.android.play.core.review.ReviewInfo r5 = (com.google.android.play.core.review.ReviewInfo) r5
            android.app.PendingIntent r1 = r4.zza
            android.app.PendingIntent r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            boolean r1 = r4.zzb
            boolean r5 = r5.zzb()
            if (r1 != r5) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.app.PendingIntent r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            boolean r1 = r3.zzb
            r2 = 1
            if (r2 == r1) goto L14
            r1 = 1237(0x4d5, float:1.733E-42)
            goto L16
        L14:
            r1 = 1231(0x4cf, float:1.725E-42)
        L16:
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            android.app.PendingIntent r0 = r4.zza
            java.lang.String r0 = r0.toString()
            boolean r1 = r4.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            int r3 = r3 + 40
            r2.<init>(r3)
            java.lang.String r3 = "ReviewInfo{pendingIntent="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", isNoOp="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final android.app.PendingIntent zza() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
