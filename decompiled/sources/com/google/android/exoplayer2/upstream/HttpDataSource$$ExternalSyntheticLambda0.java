package com.google.android.exoplayer2.upstream;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HttpDataSource$$ExternalSyntheticLambda0 implements com.google.common.base.Predicate {
    public static final /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public static final /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 INSTANCE$2 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0
            r1 = 2
            r0.<init>(r1)
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0.INSTANCE$2 = r0
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0.INSTANCE = r0
            return
    }

    public /* synthetic */ HttpDataSource$$ExternalSyntheticLambda0(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = com.google.android.exoplayer2.upstream.DefaultHttpDataSource.NullFilteringHeadersMap.m271$r8$lambda$KEnQ8YaC9x7448oc4v_duvcOo(r2)
            return r2
        Ld:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = com.google.android.exoplayer2.upstream.HttpDataSource.CC.lambda$static$0(r2)
            return r2
        L14:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = com.google.android.exoplayer2.upstream.DefaultHttpDataSource.NullFilteringHeadersMap.$r8$lambda$DVYd1RNlWDfio80CnK0S49qNCjc(r2)
            return r2
    }
}
