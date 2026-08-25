package com.google.android.play.core.install;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class InstallState {
    public InstallState() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.install.InstallState zza(@com.google.android.play.core.install.model.InstallStatus int r9, long r10, long r12, @com.google.android.play.core.install.model.InstallErrorCode int r14, @androidx.annotation.NonNull java.lang.String r15) {
            com.google.android.play.core.install.zza r8 = new com.google.android.play.core.install.zza
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r4, r6, r7)
            return r8
    }

    public static com.google.android.play.core.install.InstallState zzb(@androidx.annotation.NonNull android.content.Intent r17, @androidx.annotation.NonNull com.google.android.play.core.internal.zzag r18) {
            r0 = r17
            r1 = r18
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "List of extras in received intent needed by fromUpdateIntent:"
            r1.zza(r4, r3)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "install.status"
            r4[r2] = r5
            int r6 = r0.getIntExtra(r5, r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r4[r7] = r6
            java.lang.String r6 = "Key: %s; value: %s"
            r1.zza(r6, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "error.code"
            r3[r2] = r4
            int r8 = r0.getIntExtra(r4, r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r7] = r8
            r1.zza(r6, r3)
            int r10 = r0.getIntExtra(r5, r2)
            java.lang.String r1 = "bytes.downloaded"
            r5 = 0
            long r11 = r0.getLongExtra(r1, r5)
            java.lang.String r1 = "total.bytes.to.download"
            long r13 = r0.getLongExtra(r1, r5)
            int r15 = r0.getIntExtra(r4, r2)
            java.lang.String r1 = "package.name"
            java.lang.String r16 = r0.getStringExtra(r1)
            com.google.android.play.core.install.zza r0 = new com.google.android.play.core.install.zza
            r9 = r0
            r9.<init>(r10, r11, r13, r15, r16)
            return r0
    }

    public abstract long bytesDownloaded();

    @com.google.android.play.core.install.model.InstallErrorCode
    public abstract int installErrorCode();

    @com.google.android.play.core.install.model.InstallStatus
    public abstract int installStatus();

    public abstract java.lang.String packageName();

    public abstract long totalBytesToDownload();
}
