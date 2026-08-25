package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.String f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2(java.lang.Object r1, java.lang.String r2, long r3, long r5, int r7) {
            r0 = this;
            r0.$r8$classId = r7
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L15
        L6:
            java.lang.Object r0 = r7.f$0
            r1 = r0
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r1 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) r1
            java.lang.String r2 = r7.f$1
            long r3 = r7.f$2
            long r5 = r7.f$3
            com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.$r8$lambda$q590SjkvmhHa8kO2_7jSOgj6fck(r1, r2, r3, r5)
            return
        L15:
            java.lang.Object r0 = r7.f$0
            r1 = r0
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r1 = (com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher) r1
            java.lang.String r2 = r7.f$1
            long r3 = r7.f$2
            long r5 = r7.f$3
            com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.m278$r8$lambda$c5PVgyPI6cEJjS0i6dHpT5aag(r1, r2, r3, r5)
            return
    }
}
