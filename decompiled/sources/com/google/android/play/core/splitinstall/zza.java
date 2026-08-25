package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zza extends com.google.android.play.core.splitinstall.SplitInstallSessionState {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private final java.util.List zzf;
    private final java.util.List zzg;
    private final android.app.PendingIntent zzh;
    private final java.util.List zzi;

    public zza(int r1, int r2, int r3, long r4, long r6, @androidx.annotation.Nullable java.util.List r8, @androidx.annotation.Nullable java.util.List r9, @androidx.annotation.Nullable android.app.PendingIntent r10, @androidx.annotation.Nullable java.util.List r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            r0.zzf = r8
            r0.zzg = r9
            r0.zzh = r10
            r0.zzi = r11
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.splitinstall.SplitInstallSessionState
            r2 = 0
            if (r1 == 0) goto L8d
            com.google.android.play.core.splitinstall.SplitInstallSessionState r8 = (com.google.android.play.core.splitinstall.SplitInstallSessionState) r8
            int r1 = r7.zza
            int r3 = r8.sessionId()
            if (r1 != r3) goto L8d
            int r1 = r7.zzb
            int r3 = r8.status()
            if (r1 != r3) goto L8d
            int r1 = r7.zzc
            int r3 = r8.errorCode()
            if (r1 != r3) goto L8d
            long r3 = r7.zzd
            long r5 = r8.bytesDownloaded()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L8d
            long r3 = r7.zze
            long r5 = r8.totalBytesToDownload()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L8d
            java.util.List r1 = r7.zzf
            if (r1 != 0) goto L42
            java.util.List r1 = r8.zzb()
            if (r1 != 0) goto L8d
            goto L4c
        L42:
            java.util.List r3 = r8.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L4c:
            java.util.List r1 = r7.zzg
            if (r1 != 0) goto L57
            java.util.List r1 = r8.zza()
            if (r1 != 0) goto L8d
            goto L61
        L57:
            java.util.List r3 = r8.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L61:
            android.app.PendingIntent r1 = r7.zzh
            if (r1 != 0) goto L6c
            android.app.PendingIntent r1 = r8.resolutionIntent()
            if (r1 != 0) goto L8d
            goto L76
        L6c:
            android.app.PendingIntent r3 = r8.resolutionIntent()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8d
        L76:
            java.util.List r1 = r7.zzi
            if (r1 != 0) goto L81
            java.util.List r8 = r8.zzc()
            if (r8 != 0) goto L8d
            goto L8c
        L81:
            java.util.List r8 = r8.zzc()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L8c
            goto L8d
        L8c:
            return r0
        L8d:
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    public final int errorCode() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final int hashCode() {
            r10 = this;
            int r0 = r10.zza
            int r1 = r10.zzb
            int r2 = r10.zzc
            long r3 = r10.zzd
            long r5 = r10.zze
            r7 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r7
            int r0 = r0 * r7
            r0 = r0 ^ r1
            int r0 = r0 * r7
            r0 = r0 ^ r2
            int r0 = r0 * r7
            r1 = 32
            long r8 = r3 >>> r1
            long r2 = r8 ^ r3
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r7
            long r1 = r5 >>> r1
            long r1 = r1 ^ r5
            int r2 = (int) r1
            r0 = r0 ^ r2
            int r0 = r0 * r7
            java.util.List r1 = r10.zzf
            r2 = 0
            if (r1 != 0) goto L2e
            r1 = 0
            goto L32
        L2e:
            int r1 = r1.hashCode()
        L32:
            r0 = r0 ^ r1
            int r0 = r0 * r7
            java.util.List r1 = r10.zzg
            if (r1 != 0) goto L3b
            r1 = 0
            goto L3f
        L3b:
            int r1 = r1.hashCode()
        L3f:
            r0 = r0 ^ r1
            int r0 = r0 * r7
            android.app.PendingIntent r1 = r10.zzh
            if (r1 != 0) goto L48
            r1 = 0
            goto L4c
        L48:
            int r1 = r1.hashCode()
        L4c:
            r0 = r0 ^ r1
            int r0 = r0 * r7
            java.util.List r1 = r10.zzi
            if (r1 != 0) goto L54
            goto L58
        L54:
            int r2 = r1.hashCode()
        L58:
            r0 = r0 ^ r2
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public final android.app.PendingIntent resolutionIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus
    public final int status() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final java.lang.String toString() {
            r16 = this;
            r0 = r16
            int r1 = r0.zza
            int r2 = r0.zzb
            int r3 = r0.zzc
            long r4 = r0.zzd
            long r6 = r0.zze
            java.util.List r8 = r0.zzf
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.util.List r9 = r0.zzg
            java.lang.String r9 = java.lang.String.valueOf(r9)
            android.app.PendingIntent r10 = r0.zzh
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.util.List r11 = r0.zzi
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r8.length()
            int r13 = r9.length()
            int r14 = r10.length()
            int r15 = r11.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r12 = r12 + 251
            int r12 = r12 + r13
            int r12 = r12 + r14
            int r12 = r12 + r15
            r0.<init>(r12)
            java.lang.String r12 = "SplitInstallSessionState{sessionId="
            r0.append(r12)
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", bytesDownloaded="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", totalBytesToDownload="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", moduleNamesNullable="
            r0.append(r1)
            java.lang.String r1 = ", languagesNullable="
            java.lang.String r2 = ", resolutionIntent="
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r8, r1, r9, r2)
            java.lang.String r1 = ", splitFileIntents="
            java.lang.String r2 = "}"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r10, r1, r11, r2)
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @androidx.annotation.Nullable
    public final java.util.List zza() {
            r1 = this;
            java.util.List r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @androidx.annotation.Nullable
    public final java.util.List zzb() {
            r1 = this;
            java.util.List r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @androidx.annotation.Nullable
    public final java.util.List zzc() {
            r1 = this;
            java.util.List r0 = r1.zzi
            return r0
    }
}
