package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Util$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ Util$$ExternalSyntheticLambda1(com.google.common.util.concurrent.SettableFuture r2, java.lang.Runnable r3, java.lang.Object r4) {
            r1 = this;
            r0 = 4
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$1 = r2
            r1.f$0 = r3
            r1.f$2 = r4
            return
    }

    public /* synthetic */ Util$$ExternalSyntheticLambda1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L44;
                case 1: goto L34;
                case 2: goto L24;
                case 3: goto L14;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L54
        L6:
            java.lang.Object r0 = r3.f$1
            com.google.common.util.concurrent.SettableFuture r0 = (com.google.common.util.concurrent.SettableFuture) r0
            java.lang.Object r1 = r3.f$0
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r2 = r3.f$2
            com.google.android.exoplayer2.util.Util.m274$r8$lambda$ZfnFplegwixrRMpxSt_dFcCTgo(r0, r1, r2)
            return
        L14:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) r0
            java.lang.Object r1 = r3.f$1
            com.google.android.exoplayer2.source.MediaSourceEventListener r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener) r1
            java.lang.Object r2 = r3.f$2
            com.google.android.exoplayer2.source.MediaLoadData r2 = (com.google.android.exoplayer2.source.MediaLoadData) r2
            com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.m244$r8$lambda$ksQLx11TblSbVRe1SW5K2we0i4(r0, r1, r2)
            return
        L24:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) r0
            java.lang.Object r1 = r3.f$1
            com.google.android.exoplayer2.drm.DrmSessionEventListener r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener) r1
            java.lang.Object r2 = r3.f$2
            java.lang.Exception r2 = (java.lang.Exception) r2
            com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.m219$r8$lambda$eIlxixoq5EOGzuz7iieNWOglWE(r0, r1, r2)
            return
        L34:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) r0
            java.lang.Object r1 = r3.f$1
            com.google.android.exoplayer2.Format r1 = (com.google.android.exoplayer2.Format) r1
            java.lang.Object r2 = r3.f$2
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2 = (com.google.android.exoplayer2.decoder.DecoderReuseEvaluation) r2
            com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.$r8$lambda$enhPTF1JVF9YZZj3tQrmMkRorOk(r0, r1, r2)
            return
        L44:
            java.lang.Object r0 = r3.f$0
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0
            java.lang.Object r1 = r3.f$1
            com.google.common.util.concurrent.SettableFuture r1 = (com.google.common.util.concurrent.SettableFuture) r1
            java.lang.Object r2 = r3.f$2
            com.google.common.util.concurrent.AsyncFunction r2 = (com.google.common.util.concurrent.AsyncFunction) r2
            com.google.android.exoplayer2.util.Util.$r8$lambda$DSdcFhMZFeNvai4CKemAhlKDeCY(r0, r1, r2)
            return
        L54:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher) r0
            java.lang.Object r1 = r3.f$1
            com.google.android.exoplayer2.Format r1 = (com.google.android.exoplayer2.Format) r1
            java.lang.Object r2 = r3.f$2
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2 = (com.google.android.exoplayer2.decoder.DecoderReuseEvaluation) r2
            com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.$r8$lambda$lRgnwRtINjNzTNR52Sx12shHxOA(r0, r1, r2)
            return
    }
}
