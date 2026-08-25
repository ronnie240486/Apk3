package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ConcatenatingMediaSource$$ExternalSyntheticLambda0 implements android.os.Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.source.CompositeMediaSource f$0;

    public /* synthetic */ ConcatenatingMediaSource$$ExternalSyntheticLambda0(com.google.android.exoplayer2.source.CompositeMediaSource r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            com.google.android.exoplayer2.source.CompositeMediaSource r0 = r1.f$0
            com.google.android.exoplayer2.source.ConcatenatingMediaSource r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource) r0
            boolean r2 = com.google.android.exoplayer2.source.ConcatenatingMediaSource.m236$r8$lambda$JacrSZ3qFBT98_Hb7oUkRJgk1w(r0, r2)
            return r2
        Lf:
            com.google.android.exoplayer2.source.CompositeMediaSource r0 = r1.f$0
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2 r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2) r0
            boolean r2 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.$r8$lambda$5QwC6UTDyJPrb6lu5LkhFaRJXVw(r0, r2)
            return r2
    }
}
