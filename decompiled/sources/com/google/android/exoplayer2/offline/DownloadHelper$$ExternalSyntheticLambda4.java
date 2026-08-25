package com.google.android.exoplayer2.offline;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadHelper$$ExternalSyntheticLambda4 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ DownloadHelper$$ExternalSyntheticLambda4(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.offline.DownloadHelper r0 = (com.google.android.exoplayer2.offline.DownloadHelper) r0
            com.google.android.exoplayer2.offline.DownloadHelper.m230$r8$lambda$KeStGaF2KHebvcVcqEmpDq4A5Q(r0)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.offline.DownloadService$ForegroundNotificationUpdater r0 = (com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater) r0
            com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater.$r8$lambda$pYuZL1QRc5pDjZBDyUT_MTJZ65U(r0)
            return
    }
}
