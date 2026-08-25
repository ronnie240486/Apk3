package com.google.android.exoplayer2.upstream;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SlidingPercentile$$ExternalSyntheticLambda0 implements java.util.Comparator {
    public static final /* synthetic */ com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0.INSTANCE = r0
            com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.upstream.SlidingPercentile$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            return
    }

    public /* synthetic */ SlidingPercentile$$ExternalSyntheticLambda0(int r1) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r2 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r2
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r3 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r3
            int r2 = com.google.android.exoplayer2.upstream.SlidingPercentile.$r8$lambda$rSKVMpYhq9pJGDaeHheQ7jtQcCo(r2, r3)
            return r2
        Lf:
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r2 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r2
            com.google.android.exoplayer2.upstream.SlidingPercentile$Sample r3 = (com.google.android.exoplayer2.upstream.SlidingPercentile.Sample) r3
            int r2 = com.google.android.exoplayer2.upstream.SlidingPercentile.$r8$lambda$kHXYHfok8QC8DQsYRzQ_7PvLqTo(r2, r3)
            return r2
    }
}
