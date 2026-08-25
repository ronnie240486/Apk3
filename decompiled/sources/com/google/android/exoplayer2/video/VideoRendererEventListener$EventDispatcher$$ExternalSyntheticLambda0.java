package com.google.android.exoplayer2.video;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher f$0;
    public final /* synthetic */ com.google.android.exoplayer2.decoder.DecoderCounters f$1;

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r1, com.google.android.exoplayer2.decoder.DecoderCounters r2, int r3) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r2.f$1
            com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.$r8$lambda$0wEcYr7ztj3ofEMIi0XdztgAhbs(r0, r1)
            return
        Le:
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r2.f$1
            com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.m275$r8$lambda$RxBENRwvFErOnQM84ZS2H2saCQ(r0, r1)
            return
    }
}
