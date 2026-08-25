package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultLoadErrorHandlingPolicy implements com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @java.lang.Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    public DefaultLoadErrorHandlingPolicy() {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            return
    }

    public DefaultLoadErrorHandlingPolicy(int r1) {
            r0 = this;
            r0.<init>()
            r0.minimumLoadableRetryCount = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions r4, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r5) {
            r3 = this;
            java.io.IOException r5 = r5.exception
            boolean r0 = r5 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L9
            goto L26
        L9:
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r5 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r5
            int r5 = r5.responseCode
            r0 = 403(0x193, float:5.65E-43)
            if (r5 == r0) goto L25
            r0 = 404(0x194, float:5.66E-43)
            if (r5 == r0) goto L25
            r0 = 410(0x19a, float:5.75E-43)
            if (r5 == r0) goto L25
            r0 = 416(0x1a0, float:5.83E-43)
            if (r5 == r0) goto L25
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 == r0) goto L25
            r0 = 503(0x1f7, float:7.05E-43)
            if (r5 != r0) goto L26
        L25:
            r1 = 1
        L26:
            r5 = 0
            if (r1 != 0) goto L2a
            return r5
        L2a:
            boolean r0 = r4.isFallbackAvailable(r2)
            if (r0 == 0) goto L39
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r4 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection
            r0 = 300000(0x493e0, double:1.482197E-318)
            r4.<init>(r2, r0)
            return r4
        L39:
            r0 = 2
            boolean r4 = r4.isFallbackAvailable(r0)
            if (r4 == 0) goto L49
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r4 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection
            r1 = 60000(0xea60, double:2.9644E-319)
            r4.<init>(r0, r1)
            return r4
        L49:
            return r5
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int r3) {
            r2 = this;
            int r0 = r2.minimumLoadableRetryCount
            r1 = -1
            if (r0 != r1) goto Lc
            r0 = 7
            if (r3 != r0) goto La
            r3 = 6
            goto Lb
        La:
            r3 = 3
        Lb:
            return r3
        Lc:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r3) {
            r2 = this;
            java.io.IOException r0 = r3.exception
            boolean r1 = r0 instanceof com.google.android.exoplayer2.ParserException
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.CleartextNotPermittedException
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException
            if (r1 != 0) goto L27
            boolean r0 = com.google.android.exoplayer2.upstream.DataSourceException.isCausedByPositionOutOfRange(r0)
            if (r0 == 0) goto L19
            goto L27
        L19:
            int r3 = r3.errorCount
            int r3 = r3 + (-1)
            int r3 = r3 * 1000
            r0 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r0)
            long r0 = (long) r3
            goto L2c
        L27:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2c:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public final /* synthetic */ void onLoadTaskConcluded(long r1) {
            r0 = this;
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.CC.$default$onLoadTaskConcluded(r0, r1)
            return
    }
}
