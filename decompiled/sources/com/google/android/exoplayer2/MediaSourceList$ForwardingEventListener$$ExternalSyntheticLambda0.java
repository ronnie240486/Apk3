package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener f$0;
    public final /* synthetic */ android.util.Pair f$1;

    public /* synthetic */ MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r1, android.util.Pair r2, int r3) {
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
                case 0: goto L16;
                case 1: goto Le;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r2.f$0
            android.util.Pair r1 = r2.f$1
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$Z252bkVZmh2EYOVlfel9NmBBgmY(r0, r1)
            return
        Le:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r2.f$0
            android.util.Pair r1 = r2.f$1
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$CrewDdLXFGx1pP2NvroyaGw7eeY(r0, r1)
            return
        L16:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r2.f$0
            android.util.Pair r1 = r2.f$1
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$crDo_6psujTIswCodqiLesLyERI(r0, r1)
            return
        L1e:
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r2.f$0
            android.util.Pair r1 = r2.f$1
            com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener.$r8$lambda$nAHq6gMYlBawBUCanNG8GHGElp4(r0, r1)
            return
    }
}
