package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher f$0;
    public final /* synthetic */ java.lang.Exception f$1;

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r1, java.lang.Exception r2, int r3) {
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
            java.lang.Exception r1 = r2.f$1
            com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.$r8$lambda$bleGgwMcLNB0ceG2coTQZmt9LKU(r0, r1)
            return
        Le:
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = r2.f$0
            java.lang.Exception r1 = r2.f$1
            com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.$r8$lambda$U50ysTRNBEuoHspHobE2jeZXB_I(r0, r1)
            return
    }
}
