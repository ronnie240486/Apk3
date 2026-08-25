package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadEventInfo {
    private static final java.util.concurrent.atomic.AtomicLong idSource = null;
    public final long bytesLoaded;
    public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders;
    public final android.net.Uri uri;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            com.google.android.exoplayer2.source.LoadEventInfo.idSource = r0
            return
    }

    public LoadEventInfo(long r13, com.google.android.exoplayer2.upstream.DataSpec r15, long r16) {
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.uri
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
    }

    public LoadEventInfo(long r1, com.google.android.exoplayer2.upstream.DataSpec r3, android.net.Uri r4, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5, long r6, long r8, long r10) {
            r0 = this;
            r0.<init>()
            r0.loadTaskId = r1
            r0.dataSpec = r3
            r0.uri = r4
            r0.responseHeaders = r5
            r0.elapsedRealtimeMs = r6
            r0.loadDurationMs = r8
            r0.bytesLoaded = r10
            return
    }

    public static long getNewId() {
            java.util.concurrent.atomic.AtomicLong r0 = com.google.android.exoplayer2.source.LoadEventInfo.idSource
            long r0 = r0.getAndIncrement()
            return r0
    }
}
