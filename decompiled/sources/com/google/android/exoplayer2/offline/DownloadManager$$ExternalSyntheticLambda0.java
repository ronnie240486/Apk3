package com.google.android.exoplayer2.offline;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda0 implements android.os.Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.offline.DownloadManager r0 = (com.google.android.exoplayer2.offline.DownloadManager) r0
            boolean r2 = com.google.android.exoplayer2.offline.DownloadManager.$r8$lambda$VH8vRSTYO69o4pUCxUdzDQ0ZEQ0(r0, r2)
            return r2
        Lf:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = (com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer) r0
            boolean r2 = com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer.$r8$lambda$Db71ShN3QybOcTYlOayKmy_uYGE(r0, r2)
            return r2
    }
}
