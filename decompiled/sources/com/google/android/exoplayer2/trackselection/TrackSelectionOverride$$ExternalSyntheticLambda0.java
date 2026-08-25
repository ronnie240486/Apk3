package com.google.android.exoplayer2.trackselection;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TrackSelectionOverride$$ExternalSyntheticLambda0 implements com.google.android.exoplayer2.Bundleable.Creator {
    public static final /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 INSTANCE$2 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 INSTANCE$3 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
            r1 = 2
            r0.<init>(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE$2 = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
            r1 = 3
            r0.<init>(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE$3 = r0
            return
    }

    public /* synthetic */ TrackSelectionOverride$$ExternalSyntheticLambda0(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L10;
                case 1: goto Lb;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L15
        L6:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.$r8$lambda$NvZ4OweqBCNRql1Yy7vv2wiHdEU(r2)
            return r2
        Lb:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.$r8$lambda$U98Wdd2EwvvSUOXBjakY0Uxo3EE(r2)
            return r2
        L10:
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r2 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.m261$r8$lambda$N4Ptq4JuVCQBA7OXQkgjxWNK9U(r2)
            return r2
        L15:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.fromBundle(r2)
            return r2
    }
}
