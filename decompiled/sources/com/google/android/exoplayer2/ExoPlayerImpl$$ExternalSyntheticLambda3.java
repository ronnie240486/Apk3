package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda3 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.MediaMetadata f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda3(com.google.android.exoplayer2.MediaMetadata r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            com.google.android.exoplayer2.MediaMetadata r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$gxZyoFETB7c7E7EoPjPOW1X1BrY(r0, r2)
            return
        Le:
            com.google.android.exoplayer2.MediaMetadata r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.SimpleBasePlayer.$r8$lambda$_UjzCyLsveLqTUXMp7zkNOmdX80(r0, r2)
            return
    }
}
