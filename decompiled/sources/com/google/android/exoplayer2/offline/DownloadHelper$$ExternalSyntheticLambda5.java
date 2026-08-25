package com.google.android.exoplayer2.offline;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadHelper$$ExternalSyntheticLambda5 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ DownloadHelper$$ExternalSyntheticLambda5(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.offline.DownloadService$DownloadManagerHelper r0 = (com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.offline.DownloadService r1 = (com.google.android.exoplayer2.offline.DownloadService) r1
            com.google.android.exoplayer2.offline.DownloadService.DownloadManagerHelper.$r8$lambda$qq9H8ivS_AHHJLwDXbhMquS4lDU(r0, r1)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.offline.DownloadHelper r0 = (com.google.android.exoplayer2.offline.DownloadHelper) r0
            java.lang.Object r1 = r2.f$1
            java.io.IOException r1 = (java.io.IOException) r1
            com.google.android.exoplayer2.offline.DownloadHelper.$r8$lambda$MY46M7IxuWh3va1M0Vu1EOnSN9I(r0, r1)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.offline.DownloadHelper r0 = (com.google.android.exoplayer2.offline.DownloadHelper) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.offline.DownloadHelper$Callback r1 = (com.google.android.exoplayer2.offline.DownloadHelper.Callback) r1
            com.google.android.exoplayer2.offline.DownloadHelper.$r8$lambda$n824A1oj6IOjH0FRR1dWusSkZrk(r0, r1)
            return
    }
}
