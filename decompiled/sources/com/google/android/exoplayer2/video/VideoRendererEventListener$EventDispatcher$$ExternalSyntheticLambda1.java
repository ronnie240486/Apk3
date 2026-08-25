package com.google.android.exoplayer2.video;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r2, int r3, long r4) {
            r1 = this;
            r0 = 1
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$2 = r3
            r1.f$1 = r4
            return
    }

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r2, long r3, int r5) {
            r1 = this;
            r0 = 0
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$1 = r3
            r1.f$2 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r4.f$0
            long r1 = r4.f$1
            int r3 = r4.f$2
            com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.m279$r8$lambda$xM5AhFhvkfHyYQYOC6q5mcL8jg(r0, r1, r3)
            return
        L10:
            com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r4.f$0
            int r1 = r4.f$2
            long r2 = r4.f$1
            com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.m277$r8$lambda$b2kGnP5SrIEYRCQyhf39twFppI(r0, r1, r2)
            return
    }
}
