package com.google.android.play.core.install;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zza extends com.google.android.play.core.install.InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final java.lang.String zze;

    public zza(int r1, long r2, long r4, int r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            r0.zzd = r6
            java.lang.String r1 = "Null packageName"
            java.util.Objects.requireNonNull(r7, r1)
            r0.zze = r7
            return
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.install.InstallState
            r2 = 0
            if (r1 == 0) goto L3c
            com.google.android.play.core.install.InstallState r8 = (com.google.android.play.core.install.InstallState) r8
            int r1 = r7.zza
            int r3 = r8.installStatus()
            if (r1 != r3) goto L3c
            long r3 = r7.zzb
            long r5 = r8.bytesDownloaded()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3c
            long r3 = r7.zzc
            long r5 = r8.totalBytesToDownload()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r1 = r7.zzd
            int r3 = r8.installErrorCode()
            if (r1 != r3) goto L3c
            java.lang.String r1 = r7.zze
            java.lang.String r8 = r8.packageName()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L3c
            return r0
        L3c:
            return r2
    }

    public final int hashCode() {
            r9 = this;
            int r0 = r9.zza
            long r1 = r9.zzb
            long r3 = r9.zzc
            r5 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r5
            int r0 = r0 * r5
            r6 = 32
            long r7 = r1 >>> r6
            long r1 = r1 ^ r7
            int r2 = (int) r1
            r0 = r0 ^ r2
            int r0 = r0 * r5
            long r1 = r3 >>> r6
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            int r0 = r0 * r5
            int r1 = r9.zzd
            r0 = r0 ^ r1
            int r0 = r0 * r5
            java.lang.String r1 = r9.zze
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.android.play.core.install.InstallState
    @com.google.android.play.core.install.model.InstallErrorCode
    public final int installErrorCode() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.play.core.install.InstallState
    @com.google.android.play.core.install.model.InstallStatus
    public final int installStatus() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.install.InstallState
    public final java.lang.String packageName() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final java.lang.String toString() {
            r9 = this;
            int r0 = r9.zza
            long r1 = r9.zzb
            long r3 = r9.zzc
            int r5 = r9.zzd
            java.lang.String r6 = r9.zze
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r8 = r6.length()
            int r8 = r8 + 164
            r7.<init>(r8)
            java.lang.String r8 = "InstallState{installStatus="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = ", bytesDownloaded="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ", totalBytesToDownload="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ", installErrorCode="
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = ", packageName="
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = "}"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            return r0
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }
}
