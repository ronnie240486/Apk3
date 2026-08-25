package com.google.android.exoplayer2.offline;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda2 implements java.util.concurrent.Executor {
    public static final /* synthetic */ com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 INSTANCE$1 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 INSTANCE$2 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2.INSTANCE$1 = r0
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2.INSTANCE = r0
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2
            r1 = 2
            r0.<init>(r1)
            com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda2.INSTANCE$2 = r0
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda2(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto La;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            r2.run()
            return
        La:
            r2.run()
            return
        Le:
            r2.run()
            return
    }
}
