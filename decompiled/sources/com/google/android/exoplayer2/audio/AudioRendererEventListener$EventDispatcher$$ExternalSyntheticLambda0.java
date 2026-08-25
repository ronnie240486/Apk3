package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher f$0;
    public final /* synthetic */ com.google.android.exoplayer2.decoder.DecoderCounters f$1;

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r1, com.google.android.exoplayer2.decoder.DecoderCounters r2, int r3) {
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
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r2.f$1
            com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.$r8$lambda$SvVOQmSfq3q1LJUN9SDh9d7q0YA(r0, r1)
            return
        Le:
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.decoder.DecoderCounters r1 = r2.f$1
            com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.$r8$lambda$wM6x2yOc7LSRokkOnoNaLS7ezfU(r0, r1)
            return
    }
}
