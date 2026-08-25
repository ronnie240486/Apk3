package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda4 implements com.google.common.base.Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.RenderersFactory f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda4(com.google.android.exoplayer2.RenderersFactory r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.common.base.Supplier
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L14;
                case 1: goto Ld;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L1b
        L6:
            com.google.android.exoplayer2.RenderersFactory r0 = r1.f$0
            com.google.android.exoplayer2.RenderersFactory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.m154$r8$lambda$wgX52bOwJN_SxWywq4KmaBRPbk(r0)
            return r0
        Ld:
            com.google.android.exoplayer2.RenderersFactory r0 = r1.f$0
            com.google.android.exoplayer2.RenderersFactory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.m148$r8$lambda$20PXyNKLUvSsFndoLKShjDf3xg(r0)
            return r0
        L14:
            com.google.android.exoplayer2.RenderersFactory r0 = r1.f$0
            com.google.android.exoplayer2.RenderersFactory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$Iqf1h2yL4j8lAvHKbYQzK_Rux9k(r0)
            return r0
        L1b:
            com.google.android.exoplayer2.RenderersFactory r0 = r1.f$0
            com.google.android.exoplayer2.RenderersFactory r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$_vjDsacr1VX7EACpX86I7y_s60A(r0)
            return r0
    }
}
