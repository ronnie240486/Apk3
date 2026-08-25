package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SplitInstallSessionState {
    public SplitInstallSessionState() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.splitinstall.SplitInstallSessionState create(int r13, @com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus int r14, @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode int r15, long r16, long r18, java.util.List<java.lang.String> r20, java.util.List<java.lang.String> r21) {
            r0 = 8
            r3 = r14
            if (r3 == r0) goto L19
            com.google.android.play.core.splitinstall.zza r0 = new com.google.android.play.core.splitinstall.zza
            r11 = 0
            r12 = 0
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r20
            r10 = r21
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12)
            return r0
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "REQUIRES_USER_CONFIRMATION state not supported."
            r0.<init>(r1)
            throw r0
    }

    public static com.google.android.play.core.splitinstall.SplitInstallSessionState zzd(android.os.Bundle r13) {
            com.google.android.play.core.splitinstall.zza r12 = new com.google.android.play.core.splitinstall.zza
            java.lang.String r0 = "session_id"
            int r1 = r13.getInt(r0)
            java.lang.String r0 = "status"
            int r2 = r13.getInt(r0)
            java.lang.String r0 = "error_code"
            int r3 = r13.getInt(r0)
            java.lang.String r0 = "bytes_downloaded"
            long r4 = r13.getLong(r0)
            java.lang.String r0 = "total_bytes_to_download"
            long r6 = r13.getLong(r0)
            java.lang.String r0 = "module_names"
            java.util.ArrayList r8 = r13.getStringArrayList(r0)
            java.lang.String r0 = "languages"
            java.util.ArrayList r9 = r13.getStringArrayList(r0)
            java.lang.String r0 = "user_confirmation_intent"
            android.os.Parcelable r0 = r13.getParcelable(r0)
            r10 = r0
            android.app.PendingIntent r10 = (android.app.PendingIntent) r10
            java.lang.String r0 = "split_file_intents"
            java.util.ArrayList r11 = r13.getParcelableArrayList(r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            return r12
    }

    public abstract long bytesDownloaded();

    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    public abstract int errorCode();

    public boolean hasTerminalStatus() {
            r2 = this;
            int r0 = r2.status()
            if (r0 == 0) goto L12
            r1 = 5
            if (r0 == r1) goto L12
            r1 = 6
            if (r0 == r1) goto L12
            r1 = 7
            if (r0 != r1) goto L10
            goto L12
        L10:
            r0 = 0
            return r0
        L12:
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.String> languages() {
            r2 = this;
            java.util.List r0 = r2.zza()
            if (r0 == 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r2.zza()
            r0.<init>(r1)
            goto L15
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L15:
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.String> moduleNames() {
            r2 = this;
            java.util.List r0 = r2.zzb()
            if (r0 == 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r2.zzb()
            r0.<init>(r1)
            goto L15
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L15:
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public abstract android.app.PendingIntent resolutionIntent();

    public abstract int sessionId();

    @com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus
    public abstract int status();

    public abstract long totalBytesToDownload();

    @androidx.annotation.Nullable
    public abstract java.util.List zza();

    @androidx.annotation.Nullable
    public abstract java.util.List zzb();

    @androidx.annotation.Nullable
    public abstract java.util.List zzc();
}
