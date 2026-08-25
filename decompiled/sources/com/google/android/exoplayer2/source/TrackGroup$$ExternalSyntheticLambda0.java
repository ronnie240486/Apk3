package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TrackGroup$$ExternalSyntheticLambda0 implements com.google.android.exoplayer2.util.Consumer, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory, com.google.android.exoplayer2.Bundleable.Creator {
    public static final /* synthetic */ com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 INSTANCE$2 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 INSTANCE$3 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 INSTANCE$4 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0
            r1 = 2
            r0.<init>(r1)
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$2 = r0
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0
            r1 = 3
            r0.<init>(r1)
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$3 = r0
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE = r0
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0
            r1 = 4
            r0.<init>(r1)
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$4 = r0
            return
    }

    public /* synthetic */ TrackGroup$$ExternalSyntheticLambda0(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r2 = (com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) r2
            com.google.android.exoplayer2.source.SampleQueue.m248$r8$lambda$hFs3IL9V0TIHwUdHiPGyNB2vwM(r2)
            return
        Lc:
            com.google.android.exoplayer2.source.SpannedData.m249$r8$lambda$JNbvRhK52ewUFOuqtqABNtXO9o(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public final com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(com.google.android.exoplayer2.analytics.PlayerId r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaParserExtractorAdapter r0 = new com.google.android.exoplayer2.source.MediaParserExtractorAdapter
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            com.google.android.exoplayer2.source.TrackGroup r2 = com.google.android.exoplayer2.source.TrackGroup.m250$r8$lambda$OSucOGokAXNCAKDiwNz_o1YsYw(r2)
            return r2
        Lb:
            com.google.android.exoplayer2.source.TrackGroupArray r2 = com.google.android.exoplayer2.source.TrackGroupArray.$r8$lambda$Ux6uYjhjCac6ofzNm8CE0IjVCHM(r2)
            return r2
    }
}
