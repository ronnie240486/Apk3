package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener f$0;
    public final /* synthetic */ android.util.Pair f$1;
    public final /* synthetic */ com.google.android.exoplayer2.source.LoadEventInfo f$2;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaLoadData f$3;

    public /* synthetic */ MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r1, android.util.Pair r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4, int r5) {
            r0 = this;
            r0.$r8$classId = r5
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.f$3 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r4.f$0
            android.util.Pair r1 = r4.f$1
            com.google.android.exoplayer2.source.LoadEventInfo r2 = r4.f$2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.m170$r8$lambda$wndeDC3gUyEYeOHnUrs8rlAd8g(r0, r1, r2, r3)
            return
        L12:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r4.f$0
            android.util.Pair r1 = r4.f$1
            com.google.android.exoplayer2.source.LoadEventInfo r2 = r4.f$2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$1irD_JbyOLxWYS6zMlyDPUAT9cw(r0, r1, r2, r3)
            return
        L1e:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r4.f$0
            android.util.Pair r1 = r4.f$1
            com.google.android.exoplayer2.source.LoadEventInfo r2 = r4.f$2
            com.google.android.exoplayer2.source.MediaLoadData r3 = r4.f$3
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.m169$r8$lambda$MKpfHLPRP3N3B3fZcvRqgW5fIk(r0, r1, r2, r3)
            return
    }
}
