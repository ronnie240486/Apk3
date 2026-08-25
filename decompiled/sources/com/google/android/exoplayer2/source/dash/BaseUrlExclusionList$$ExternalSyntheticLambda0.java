package com.google.android.exoplayer2.source.dash;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BaseUrlExclusionList$$ExternalSyntheticLambda0 implements java.util.Comparator {
    public static final /* synthetic */ com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 INSTANCE$2 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0.INSTANCE = r0
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0
            r1 = 2
            r0.<init>(r1)
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0.INSTANCE$2 = r0
            return
    }

    public /* synthetic */ BaseUrlExclusionList$$ExternalSyntheticLambda0(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lf;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r2 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) r2
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r3 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) r3
            int r2 = com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.$r8$lambda$fHu7dMf5JFxgXhjPMION0osau7U(r2, r3)
            return r2
        Lf:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r2 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r2
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r3 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r3
            int r2 = com.google.android.exoplayer2.source.dash.BaseUrlExclusionList.$r8$lambda$fyxDHfz3hA5wz9LunlAhNpFsO64(r2, r3)
            return r2
        L18:
            com.google.android.exoplayer2.upstream.cache.CacheSpan r2 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r2
            com.google.android.exoplayer2.upstream.cache.CacheSpan r3 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r3
            int r2 = com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor.m272$r8$lambda$fGGQpb4lm4rCLKn4zylNcQiqeo(r2, r3)
            return r2
    }
}
