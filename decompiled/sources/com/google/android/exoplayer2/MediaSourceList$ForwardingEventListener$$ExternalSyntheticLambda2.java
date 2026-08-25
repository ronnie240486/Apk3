package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener f$0;
    public final /* synthetic */ android.util.Pair f$1;
    public final /* synthetic */ com.google.android.exoplayer2.source.MediaLoadData f$2;

    public /* synthetic */ MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r1, android.util.Pair r2, com.google.android.exoplayer2.source.MediaLoadData r3, int r4) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r3.f$0
            android.util.Pair r1 = r3.f$1
            com.google.android.exoplayer2.source.MediaLoadData r2 = r3.f$2
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$1F0h0us8Zh9Z8E8qZ5sAsC3YrPY(r0, r1, r2)
            return
        L10:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r3.f$0
            android.util.Pair r1 = r3.f$1
            com.google.android.exoplayer2.source.MediaLoadData r2 = r3.f$2
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$jur7tk7vKzzjIjjCVHXdRaxRZlI(r0, r1, r2)
            return
    }
}
