package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda11 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda11(java.lang.Object r1, java.lang.Object r2, int r3) {
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
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = (com.google.android.exoplayer2.ExoPlayerImplInternal) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.PlayerMessage r1 = (com.google.android.exoplayer2.PlayerMessage) r1
            com.google.android.exoplayer2.ExoPlayerImplInternal.$r8$lambda$3HitbVL62UKYp7hLXQr7Za1RR_8(r0, r1)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.ExoPlayerImpl r0 = (com.google.android.exoplayer2.ExoPlayerImpl) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r1 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate) r1
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$nOBJYkeEQ2uz3sBKLToLWmzrgZk(r0, r1)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.SimpleBasePlayer r0 = (com.google.android.exoplayer2.SimpleBasePlayer) r0
            java.lang.Object r1 = r2.f$1
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            com.google.android.exoplayer2.SimpleBasePlayer.$r8$lambda$yyPcUZj804b8lLv2whVr4CfF27U(r0, r1)
            return
    }
}
