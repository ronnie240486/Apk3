package com.google.android.exoplayer2.source.hls.offline;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HlsDownloader$$ExternalSyntheticLambda0 implements java.util.concurrent.Executor {
    public static final /* synthetic */ com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0.INSTANCE = r0
            return
    }

    public /* synthetic */ HlsDownloader$$ExternalSyntheticLambda0(int r1) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto La
        L6:
            r2.run()
            return
        La:
            r2.run()
            return
    }
}
