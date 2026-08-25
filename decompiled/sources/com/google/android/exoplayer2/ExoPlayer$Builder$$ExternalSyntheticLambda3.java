package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda3 implements com.google.common.base.Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.LoadControl f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda3(com.google.android.exoplayer2.LoadControl r1, int r2) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            com.google.android.exoplayer2.LoadControl r0 = r1.f$0
            com.google.android.exoplayer2.LoadControl r0 = com.google.android.exoplayer2.ExoPlayer.Builder.$r8$lambda$xZaK9DjLoRNdBWtrqbwfHJduMcE(r0)
            return r0
        Ld:
            com.google.android.exoplayer2.LoadControl r0 = r1.f$0
            com.google.android.exoplayer2.LoadControl r0 = com.google.android.exoplayer2.ExoPlayer.Builder.m150$r8$lambda$C5Ffb4z3uoaL1oyuSYPz9pS68g(r0)
            return r0
    }
}
