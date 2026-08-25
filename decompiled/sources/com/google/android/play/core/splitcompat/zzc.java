package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements java.util.concurrent.ThreadFactory {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = "SplitCompatBackgroundThread"
            r0.<init>(r3, r1)
            return r0
    }
}
