package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda1 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ com.google.android.exoplayer2.Player.PositionInfo f$1;
    public final /* synthetic */ com.google.android.exoplayer2.Player.PositionInfo f$2;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda1(int r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            int r0 = r3.f$0
            com.google.android.exoplayer2.Player$PositionInfo r1 = r3.f$1
            com.google.android.exoplayer2.Player$PositionInfo r2 = r3.f$2
            com.google.android.exoplayer2.Player$Listener r4 = (com.google.android.exoplayer2.Player.Listener) r4
            com.google.android.exoplayer2.ExoPlayerImpl.m158$r8$lambda$algpPrtDZKm0JDTv21lpQ8EQzI(r0, r1, r2, r4)
            return
        L12:
            int r0 = r3.f$0
            com.google.android.exoplayer2.Player$PositionInfo r1 = r3.f$1
            com.google.android.exoplayer2.Player$PositionInfo r2 = r3.f$2
            com.google.android.exoplayer2.Player$Listener r4 = (com.google.android.exoplayer2.Player.Listener) r4
            com.google.android.exoplayer2.SimpleBasePlayer.$r8$lambda$WNlrrOc8a5QSPPc9fnpK89rIh_g(r0, r1, r2, r4)
            return
    }
}
