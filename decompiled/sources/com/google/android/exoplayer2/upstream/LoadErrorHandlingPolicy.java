package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public interface LoadErrorHandlingPolicy {
    public static final int FALLBACK_TYPE_LOCATION = 1;
    public static final int FALLBACK_TYPE_TRACK = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static void $default$onLoadTaskConcluded(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0, long r1) {
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class FallbackOptions {
        public final int numberOfExcludedLocations;
        public final int numberOfExcludedTracks;
        public final int numberOfLocations;
        public final int numberOfTracks;

        public FallbackOptions(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.numberOfLocations = r1
                r0.numberOfExcludedLocations = r2
                r0.numberOfTracks = r3
                r0.numberOfExcludedTracks = r4
                return
        }

        public boolean isFallbackAvailable(int r4) {
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 != r1) goto Lc
                int r4 = r3.numberOfLocations
                int r2 = r3.numberOfExcludedLocations
                int r4 = r4 - r2
                if (r4 <= r1) goto L14
                goto L13
            Lc:
                int r4 = r3.numberOfTracks
                int r2 = r3.numberOfExcludedTracks
                int r4 = r4 - r2
                if (r4 <= r1) goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }
    }

    public static final class FallbackSelection {
        public final long exclusionDurationMs;
        public final int type;

        public FallbackSelection(int r4, long r5) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r3.type = r4
                r3.exclusionDurationMs = r5
                return
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class LoadErrorInfo {
        public final int errorCount;
        public final java.io.IOException exception;
        public final com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo;
        public final com.google.android.exoplayer2.source.MediaLoadData mediaLoadData;

        public LoadErrorInfo(com.google.android.exoplayer2.source.LoadEventInfo r1, com.google.android.exoplayer2.source.MediaLoadData r2, java.io.IOException r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.loadEventInfo = r1
                r0.mediaLoadData = r2
                r0.exception = r3
                r0.errorCount = r4
                return
        }
    }

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions r1, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r2);

    int getMinimumLoadableRetryCount(int r1);

    long getRetryDelayMsFor(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r1);

    void onLoadTaskConcluded(long r1);
}
