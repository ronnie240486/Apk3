package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzc extends com.google.android.play.core.splitinstall.testing.zzt {
    private final java.lang.Integer zzb;
    private final java.util.Map zzc;

    public /* synthetic */ zzc(java.lang.Integer r1, java.util.Map r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.splitinstall.testing.zzt
            r2 = 0
            if (r1 == 0) goto L2d
            com.google.android.play.core.splitinstall.testing.zzt r5 = (com.google.android.play.core.splitinstall.testing.zzt) r5
            java.lang.Integer r1 = r4.zzb
            if (r1 != 0) goto L16
            java.lang.Integer r1 = r5.zza()
            if (r1 != 0) goto L2d
            goto L20
        L16:
            java.lang.Integer r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
        L20:
            java.util.Map r1 = r4.zzc
            java.util.Map r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2d
            return r0
        L2d:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Integer r0 = r2.zzb
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.Map r1 = r2.zzc
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.Integer r0 = r5.zzb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.Map r1 = r5.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 81
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "LocalTestingConfig{defaultSplitInstallErrorCode="
            java.lang.String r3 = ", splitInstallErrorCodeByModule="
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r0, r3, r1)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzt
    @androidx.annotation.Nullable
    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    public final java.lang.Integer zza() {
            r1 = this;
            java.lang.Integer r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzt
    public final java.util.Map zzb() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            return r0
    }
}
