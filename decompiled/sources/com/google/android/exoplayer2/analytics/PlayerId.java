package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerId {
    public static final com.google.android.exoplayer2.analytics.PlayerId UNSET = null;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31;

    @androidx.annotation.RequiresApi(31)
    public static final class LogSessionIdApi31 {
        public static final com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31 UNSET = null;
        public final android.media.metrics.LogSessionId logSessionId;

        static {
                com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31 r0 = new com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31
                android.media.metrics.LogSessionId r1 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
                r0.<init>(r1)
                com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31.UNSET = r0
                return
        }

        public LogSessionIdApi31(android.media.metrics.LogSessionId r1) {
                r0 = this;
                r0.<init>()
                r0.logSessionId = r1
                return
        }
    }

    static {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 31
            if (r0 >= r1) goto Lc
            com.google.android.exoplayer2.analytics.PlayerId r0 = new com.google.android.exoplayer2.analytics.PlayerId
            r0.<init>()
            goto L13
        Lc:
            com.google.android.exoplayer2.analytics.PlayerId r0 = new com.google.android.exoplayer2.analytics.PlayerId
            com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31 r1 = com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31.UNSET
            r0.<init>(r1)
        L13:
            com.google.android.exoplayer2.analytics.PlayerId.UNSET = r0
            return
    }

    public PlayerId() {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 31
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            return
    }

    @androidx.annotation.RequiresApi(31)
    public PlayerId(android.media.metrics.LogSessionId r2) {
            r1 = this;
            com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31 r0 = new com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private PlayerId(@androidx.annotation.Nullable com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31 r1) {
            r0 = this;
            r0.<init>()
            r0.logSessionIdApi31 = r1
            return
    }

    @androidx.annotation.RequiresApi(31)
    public android.media.metrics.LogSessionId getLogSessionId() {
            r1 = this;
            com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31 r0 = r1.logSessionIdApi31
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.analytics.PlayerId$LogSessionIdApi31 r0 = (com.google.android.exoplayer2.analytics.PlayerId.LogSessionIdApi31) r0
            android.media.metrics.LogSessionId r0 = r0.logSessionId
            return r0
    }
}
