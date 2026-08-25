package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.play.core.splitcompat.zzs {
    private final java.io.File zza;
    private final java.lang.String zzb;

    public zzb(java.io.File r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.String r1 = "Null splitId"
            java.util.Objects.requireNonNull(r2, r1)
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.splitcompat.zzs
            r2 = 0
            if (r1 == 0) goto L24
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5
            java.io.File r1 = r4.zza
            java.io.File r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.zzb
            java.lang.String r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            return r0
        L24:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.io.File r0 = r2.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.zzb
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.io.File r0 = r5.zza
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            int r3 = r3 + 35
            int r4 = r1.length()
            int r4 = r4 + r3
            r2.<init>(r4)
            java.lang.String r3 = "SplitFileInfo{splitFile="
            java.lang.String r4 = ", splitId="
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r0, r4, r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.play.core.splitcompat.zzs
    @androidx.annotation.NonNull
    public final java.io.File zza() {
            r1 = this;
            java.io.File r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.splitcompat.zzs
    @androidx.annotation.NonNull
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
