package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public class SampleQueue implements com.google.android.exoplayer2.extractor.TrackOutput {
    private static final java.lang.String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private int capacity;
    private com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[] cryptoDatas;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmSession currentDrmSession;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format downstreamFormat;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private final com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder extrasHolder;
    private int[] flags;
    private boolean isLastSampleQueued;
    private long largestDiscardedTimestampUs;
    private long largestQueuedTimestampUs;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private long[] offsets;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final com.google.android.exoplayer2.source.SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private final com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata> sharedSampleMetadata;
    private int[] sizes;
    private int[] sourceIds;
    private long startTimeUs;
    private long[] timesUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangeListener;
    private boolean upstreamFormatRequired;
    private boolean upstreamKeyframeRequired;
    private int upstreamSourceId;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.SampleQueue$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SampleExtrasHolder {

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;

        public SampleExtrasHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SharedSampleMetadata {
        public final com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference drmSessionReference;
        public final com.google.android.exoplayer2.Format format;

        private SharedSampleMetadata(com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference r2) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                r0.drmSessionReference = r2
                return
        }

        public /* synthetic */ SharedSampleMetadata(com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference r2, com.google.android.exoplayer2.source.SampleQueue.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(com.google.android.exoplayer2.Format r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$h-Fs3IL9V0TIHwUdHiPGyNB2vwM, reason: not valid java name */
    public static /* synthetic */ void m248$r8$lambda$hFs3IL9V0TIHwUdHiPGyNB2vwM(com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata r0) {
            lambda$new$0(r0)
            return
    }

    public SampleQueue(com.google.android.exoplayer2.upstream.Allocator r1, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r2, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r3) {
            r0 = this;
            r0.<init>()
            r0.drmSessionManager = r2
            r0.drmEventDispatcher = r3
            com.google.android.exoplayer2.source.SampleDataQueue r2 = new com.google.android.exoplayer2.source.SampleDataQueue
            r2.<init>(r1)
            r0.sampleDataQueue = r2
            com.google.android.exoplayer2.source.SampleQueue$SampleExtrasHolder r1 = new com.google.android.exoplayer2.source.SampleQueue$SampleExtrasHolder
            r1.<init>()
            r0.extrasHolder = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.capacity = r1
            int[] r2 = new int[r1]
            r0.sourceIds = r2
            long[] r2 = new long[r1]
            r0.offsets = r2
            long[] r2 = new long[r1]
            r0.timesUs = r2
            int[] r2 = new int[r1]
            r0.flags = r2
            int[] r2 = new int[r1]
            r0.sizes = r2
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] r1 = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[r1]
            r0.cryptoDatas = r1
            com.google.android.exoplayer2.source.SpannedData r1 = new com.google.android.exoplayer2.source.SpannedData
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r2 = com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$1
            r1.<init>(r2)
            r0.sharedSampleMetadata = r1
            r1 = -9223372036854775808
            r0.startTimeUs = r1
            r0.largestDiscardedTimestampUs = r1
            r0.largestQueuedTimestampUs = r1
            r1 = 1
            r0.upstreamFormatRequired = r1
            r0.upstreamKeyframeRequired = r1
            return
    }

    private synchronized boolean attemptSplice(long r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.length     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L11
            long r3 = r5.largestDiscardedTimestampUs     // Catch: java.lang.Throwable -> L27
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            monitor-exit(r5)
            return r1
        L11:
            long r3 = r5.getLargestReadTimestampUs()     // Catch: java.lang.Throwable -> L27
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L1b
            monitor-exit(r5)
            return r2
        L1b:
            int r6 = r5.countUnreadSamplesBefore(r6)     // Catch: java.lang.Throwable -> L27
            int r7 = r5.absoluteFirstIndex     // Catch: java.lang.Throwable -> L27
            int r7 = r7 + r6
            r5.discardUpstreamSampleMetadata(r7)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            return r1
        L27:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    private synchronized void commitSample(long r9, int r11, long r12, int r14, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r15) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.length     // Catch: java.lang.Throwable -> L106
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L20
            int r0 = r0 - r1
            int r0 = r8.getRelativeIndex(r0)     // Catch: java.lang.Throwable -> L106
            long[] r3 = r8.offsets     // Catch: java.lang.Throwable -> L106
            r4 = r3[r0]     // Catch: java.lang.Throwable -> L106
            int[] r3 = r8.sizes     // Catch: java.lang.Throwable -> L106
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L106
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L106
            long r4 = r4 + r6
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)     // Catch: java.lang.Throwable -> L106
        L20:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r11
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            r8.isLastSampleQueued = r0     // Catch: java.lang.Throwable -> L106
            long r3 = r8.largestQueuedTimestampUs     // Catch: java.lang.Throwable -> L106
            long r3 = java.lang.Math.max(r3, r9)     // Catch: java.lang.Throwable -> L106
            r8.largestQueuedTimestampUs = r3     // Catch: java.lang.Throwable -> L106
            int r0 = r8.length     // Catch: java.lang.Throwable -> L106
            int r0 = r8.getRelativeIndex(r0)     // Catch: java.lang.Throwable -> L106
            long[] r3 = r8.timesUs     // Catch: java.lang.Throwable -> L106
            r3[r0] = r9     // Catch: java.lang.Throwable -> L106
            long[] r9 = r8.offsets     // Catch: java.lang.Throwable -> L106
            r9[r0] = r12     // Catch: java.lang.Throwable -> L106
            int[] r9 = r8.sizes     // Catch: java.lang.Throwable -> L106
            r9[r0] = r14     // Catch: java.lang.Throwable -> L106
            int[] r9 = r8.flags     // Catch: java.lang.Throwable -> L106
            r9[r0] = r11     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] r9 = r8.cryptoDatas     // Catch: java.lang.Throwable -> L106
            r9[r0] = r15     // Catch: java.lang.Throwable -> L106
            int[] r9 = r8.sourceIds     // Catch: java.lang.Throwable -> L106
            int r10 = r8.upstreamSourceId     // Catch: java.lang.Throwable -> L106
            r9[r0] = r10     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r9 = r8.sharedSampleMetadata     // Catch: java.lang.Throwable -> L106
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L106
            if (r9 != 0) goto L6c
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r9 = r8.sharedSampleMetadata     // Catch: java.lang.Throwable -> L106
            java.lang.Object r9 = r9.getEndValue()     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r9 = (com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) r9     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.Format r9 = r9.format     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.Format r10 = r8.upstreamFormat     // Catch: java.lang.Throwable -> L106
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L106
            if (r9 != 0) goto L92
        L6c:
            com.google.android.exoplayer2.drm.DrmSessionManager r9 = r8.drmSessionManager     // Catch: java.lang.Throwable -> L106
            if (r9 == 0) goto L79
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r10 = r8.drmEventDispatcher     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.Format r11 = r8.upstreamFormat     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference r9 = r9.preacquireSession(r10, r11)     // Catch: java.lang.Throwable -> L106
            goto L7b
        L79:
            com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference r9 = com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY     // Catch: java.lang.Throwable -> L106
        L7b:
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r10 = r8.sharedSampleMetadata     // Catch: java.lang.Throwable -> L106
            int r11 = r8.getWriteIndex()     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r12 = new com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.Format r13 = r8.upstreamFormat     // Catch: java.lang.Throwable -> L106
            java.lang.Object r13 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r13)     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.Format r13 = (com.google.android.exoplayer2.Format) r13     // Catch: java.lang.Throwable -> L106
            r14 = 0
            r12.<init>(r13, r9, r14)     // Catch: java.lang.Throwable -> L106
            r10.appendSpan(r11, r12)     // Catch: java.lang.Throwable -> L106
        L92:
            int r9 = r8.length     // Catch: java.lang.Throwable -> L106
            int r9 = r9 + r1
            r8.length = r9     // Catch: java.lang.Throwable -> L106
            int r10 = r8.capacity     // Catch: java.lang.Throwable -> L106
            if (r9 != r10) goto L104
            int r9 = r10 + 1000
            int[] r11 = new int[r9]     // Catch: java.lang.Throwable -> L106
            long[] r12 = new long[r9]     // Catch: java.lang.Throwable -> L106
            long[] r13 = new long[r9]     // Catch: java.lang.Throwable -> L106
            int[] r14 = new int[r9]     // Catch: java.lang.Throwable -> L106
            int[] r15 = new int[r9]     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] r0 = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[r9]     // Catch: java.lang.Throwable -> L106
            int r1 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            int r10 = r10 - r1
            long[] r3 = r8.offsets     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r1, r12, r2, r10)     // Catch: java.lang.Throwable -> L106
            long[] r1 = r8.timesUs     // Catch: java.lang.Throwable -> L106
            int r3 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r1, r3, r13, r2, r10)     // Catch: java.lang.Throwable -> L106
            int[] r1 = r8.flags     // Catch: java.lang.Throwable -> L106
            int r3 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r1, r3, r14, r2, r10)     // Catch: java.lang.Throwable -> L106
            int[] r1 = r8.sizes     // Catch: java.lang.Throwable -> L106
            int r3 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r1, r3, r15, r2, r10)     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] r1 = r8.cryptoDatas     // Catch: java.lang.Throwable -> L106
            int r3 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r1, r3, r0, r2, r10)     // Catch: java.lang.Throwable -> L106
            int[] r1 = r8.sourceIds     // Catch: java.lang.Throwable -> L106
            int r3 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r1, r3, r11, r2, r10)     // Catch: java.lang.Throwable -> L106
            int r1 = r8.relativeFirstIndex     // Catch: java.lang.Throwable -> L106
            long[] r3 = r8.offsets     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r2, r12, r10, r1)     // Catch: java.lang.Throwable -> L106
            long[] r3 = r8.timesUs     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r2, r13, r10, r1)     // Catch: java.lang.Throwable -> L106
            int[] r3 = r8.flags     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r2, r14, r10, r1)     // Catch: java.lang.Throwable -> L106
            int[] r3 = r8.sizes     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r2, r15, r10, r1)     // Catch: java.lang.Throwable -> L106
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] r3 = r8.cryptoDatas     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r2, r0, r10, r1)     // Catch: java.lang.Throwable -> L106
            int[] r3 = r8.sourceIds     // Catch: java.lang.Throwable -> L106
            java.lang.System.arraycopy(r3, r2, r11, r10, r1)     // Catch: java.lang.Throwable -> L106
            r8.offsets = r12     // Catch: java.lang.Throwable -> L106
            r8.timesUs = r13     // Catch: java.lang.Throwable -> L106
            r8.flags = r14     // Catch: java.lang.Throwable -> L106
            r8.sizes = r15     // Catch: java.lang.Throwable -> L106
            r8.cryptoDatas = r0     // Catch: java.lang.Throwable -> L106
            r8.sourceIds = r11     // Catch: java.lang.Throwable -> L106
            r8.relativeFirstIndex = r2     // Catch: java.lang.Throwable -> L106
            r8.capacity = r9     // Catch: java.lang.Throwable -> L106
        L104:
            monitor-exit(r8)
            return
        L106:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    private int countUnreadSamplesBefore(long r6) {
            r5 = this;
            int r0 = r5.length
            int r1 = r0 + (-1)
            int r1 = r5.getRelativeIndex(r1)
        L8:
            int r2 = r5.readPosition
            if (r0 <= r2) goto L20
            long[] r2 = r5.timesUs
            r3 = r2[r1]
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 < 0) goto L20
            int r0 = r0 + (-1)
            int r1 = r1 + (-1)
            r2 = -1
            if (r1 != r2) goto L8
            int r1 = r5.capacity
            int r1 = r1 + (-1)
            goto L8
        L20:
            return r0
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.source.SampleQueue createWithDrm(com.google.android.exoplayer2.upstream.Allocator r1, android.os.Looper r2, com.google.android.exoplayer2.drm.DrmSessionManager r3, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4) {
            com.google.android.exoplayer2.analytics.PlayerId r0 = com.google.android.exoplayer2.analytics.PlayerId.UNSET
            r3.setPlayer(r2, r0)
            com.google.android.exoplayer2.source.SampleQueue r2 = new com.google.android.exoplayer2.source.SampleQueue
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = (com.google.android.exoplayer2.drm.DrmSessionManager) r3
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r4 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) r4
            r2.<init>(r1, r3, r4)
            return r2
    }

    public static com.google.android.exoplayer2.source.SampleQueue createWithDrm(com.google.android.exoplayer2.upstream.Allocator r1, com.google.android.exoplayer2.drm.DrmSessionManager r2, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r3) {
            com.google.android.exoplayer2.source.SampleQueue r0 = new com.google.android.exoplayer2.source.SampleQueue
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.drm.DrmSessionManager r2 = (com.google.android.exoplayer2.drm.DrmSessionManager) r2
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r3 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) r3
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.exoplayer2.source.SampleQueue createWithoutDrm(com.google.android.exoplayer2.upstream.Allocator r2) {
            com.google.android.exoplayer2.source.SampleQueue r0 = new com.google.android.exoplayer2.source.SampleQueue
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    private synchronized long discardSampleMetadataTo(long r11, boolean r13, boolean r14) {
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.length     // Catch: java.lang.Throwable -> L2f
            r1 = -1
            if (r0 == 0) goto L2d
            long[] r3 = r10.timesUs     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.relativeFirstIndex     // Catch: java.lang.Throwable -> L2f
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2f
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L12
            goto L2d
        L12:
            if (r14 == 0) goto L1a
            int r14 = r10.readPosition     // Catch: java.lang.Throwable -> L2f
            if (r14 == r0) goto L1a
            int r0 = r14 + 1
        L1a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.findSampleBefore(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L2f
            r12 = -1
            if (r11 != r12) goto L27
            monitor-exit(r10)
            return r1
        L27:
            long r11 = r10.discardSamples(r11)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r10)
            return r11
        L2d:
            monitor-exit(r10)
            return r1
        L2f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    private synchronized long discardSampleMetadataToEnd() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L9
            r0 = -1
            monitor-exit(r2)
            return r0
        L9:
            long r0 = r2.discardSamples(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @androidx.annotation.GuardedBy("this")
    private long discardSamples(int r6) {
            r5 = this;
            long r0 = r5.largestDiscardedTimestampUs
            long r2 = r5.getLargestTimestamp(r6)
            long r0 = java.lang.Math.max(r0, r2)
            r5.largestDiscardedTimestampUs = r0
            int r0 = r5.length
            int r0 = r0 - r6
            r5.length = r0
            int r0 = r5.absoluteFirstIndex
            int r0 = r0 + r6
            r5.absoluteFirstIndex = r0
            int r1 = r5.relativeFirstIndex
            int r1 = r1 + r6
            r5.relativeFirstIndex = r1
            int r2 = r5.capacity
            if (r1 < r2) goto L22
            int r1 = r1 - r2
            r5.relativeFirstIndex = r1
        L22:
            int r1 = r5.readPosition
            int r1 = r1 - r6
            r5.readPosition = r1
            if (r1 >= 0) goto L2c
            r6 = 0
            r5.readPosition = r6
        L2c:
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r6 = r5.sharedSampleMetadata
            r6.discardTo(r0)
            int r6 = r5.length
            if (r6 != 0) goto L48
            int r6 = r5.relativeFirstIndex
            if (r6 != 0) goto L3b
            int r6 = r5.capacity
        L3b:
            int r6 = r6 + (-1)
            long[] r0 = r5.offsets
            r1 = r0[r6]
            int[] r0 = r5.sizes
            r6 = r0[r6]
            long r3 = (long) r6
            long r1 = r1 + r3
            return r1
        L48:
            long[] r6 = r5.offsets
            int r0 = r5.relativeFirstIndex
            r0 = r6[r0]
            return r0
    }

    private long discardUpstreamSampleMetadata(int r9) {
            r8 = this;
            int r0 = r8.getWriteIndex()
            int r0 = r0 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L12
            int r3 = r8.length
            int r4 = r8.readPosition
            int r3 = r3 - r4
            if (r0 > r3) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            int r3 = r8.length
            int r3 = r3 - r0
            r8.length = r3
            long r4 = r8.largestDiscardedTimestampUs
            long r6 = r8.getLargestTimestamp(r3)
            long r3 = java.lang.Math.max(r4, r6)
            r8.largestQueuedTimestampUs = r3
            if (r0 != 0) goto L2e
            boolean r0 = r8.isLastSampleQueued
            if (r0 == 0) goto L2e
            r1 = 1
        L2e:
            r8.isLastSampleQueued = r1
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r0 = r8.sharedSampleMetadata
            r0.discardFrom(r9)
            int r9 = r8.length
            if (r9 == 0) goto L49
            int r9 = r9 - r2
            int r9 = r8.getRelativeIndex(r9)
            long[] r0 = r8.offsets
            r1 = r0[r9]
            int[] r0 = r8.sizes
            r9 = r0[r9]
            long r3 = (long) r9
            long r1 = r1 + r3
            return r1
        L49:
            r0 = 0
            return r0
    }

    private int findSampleBefore(int r8, int r9, long r10, boolean r12) {
            r7 = this;
            r0 = 0
            r1 = -1
            r2 = 0
        L3:
            if (r2 >= r9) goto L2a
            long[] r3 = r7.timesUs
            r4 = r3[r8]
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L2a
            if (r12 == 0) goto L17
            int[] r4 = r7.flags
            r4 = r4[r8]
            r4 = r4 & 1
            if (r4 == 0) goto L20
        L17:
            r4 = r3[r8]
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 != 0) goto L1f
            r1 = r2
            goto L2a
        L1f:
            r1 = r2
        L20:
            int r8 = r8 + 1
            int r3 = r7.capacity
            if (r8 != r3) goto L27
            r8 = 0
        L27:
            int r2 = r2 + 1
            goto L3
        L2a:
            return r1
    }

    private long getLargestTimestamp(int r8) {
            r7 = this;
            r0 = -9223372036854775808
            if (r8 != 0) goto L5
            return r0
        L5:
            int r2 = r8 + (-1)
            int r2 = r7.getRelativeIndex(r2)
            r3 = 0
        Lc:
            if (r3 >= r8) goto L2b
            long[] r4 = r7.timesUs
            r5 = r4[r2]
            long r0 = java.lang.Math.max(r0, r5)
            int[] r4 = r7.flags
            r4 = r4[r2]
            r4 = r4 & 1
            if (r4 == 0) goto L1f
            goto L2b
        L1f:
            int r2 = r2 + (-1)
            r4 = -1
            if (r2 != r4) goto L28
            int r2 = r7.capacity
            int r2 = r2 + (-1)
        L28:
            int r3 = r3 + 1
            goto Lc
        L2b:
            return r0
    }

    private int getRelativeIndex(int r2) {
            r1 = this;
            int r0 = r1.relativeFirstIndex
            int r0 = r0 + r2
            int r2 = r1.capacity
            if (r0 >= r2) goto L8
            goto L9
        L8:
            int r0 = r0 - r2
        L9:
            return r0
    }

    private boolean hasNextSample() {
            r2 = this;
            int r0 = r2.readPosition
            int r1 = r2.length
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata r0) {
            com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference r0 = r0.drmSessionReference
            r0.release()
            return
    }

    private boolean mayReadSample(int r3) {
            r2 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r2.currentDrmSession
            if (r0 == 0) goto L1f
            int r0 = r0.getState()
            r1 = 4
            if (r0 == r1) goto L1f
            int[] r0 = r2.flags
            r3 = r0[r3]
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 != 0) goto L1d
            com.google.android.exoplayer2.drm.DrmSession r3 = r2.currentDrmSession
            boolean r3 = r3.playClearSamplesWithoutKeys()
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            return r3
    }

    private void onFormatResult(com.google.android.exoplayer2.Format r5, com.google.android.exoplayer2.FormatHolder r6) {
            r4 = this;
            com.google.android.exoplayer2.Format r0 = r4.downstreamFormat
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto Lb
            r0 = 0
            goto Ld
        Lb:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r0.drmInitData
        Ld:
            r4.downstreamFormat = r5
            com.google.android.exoplayer2.drm.DrmInitData r2 = r5.drmInitData
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r4.drmSessionManager
            if (r3 == 0) goto L1e
            int r3 = r3.getCryptoType(r5)
            com.google.android.exoplayer2.Format r3 = r5.copyWithCryptoType(r3)
            goto L1f
        L1e:
            r3 = r5
        L1f:
            r6.format = r3
            com.google.android.exoplayer2.drm.DrmSession r3 = r4.currentDrmSession
            r6.drmSession = r3
            com.google.android.exoplayer2.drm.DrmSessionManager r3 = r4.drmSessionManager
            if (r3 != 0) goto L2a
            return
        L2a:
            if (r1 != 0) goto L33
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 == 0) goto L33
            return
        L33:
            com.google.android.exoplayer2.drm.DrmSession r0 = r4.currentDrmSession
            com.google.android.exoplayer2.drm.DrmSessionManager r1 = r4.drmSessionManager
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r4.drmEventDispatcher
            com.google.android.exoplayer2.drm.DrmSession r5 = r1.acquireSession(r2, r5)
            r4.currentDrmSession = r5
            r6.drmSession = r5
            if (r0 == 0) goto L48
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r5 = r4.drmEventDispatcher
            r0.release(r5)
        L48:
            return
    }

    private synchronized int peekSampleMetadata(com.google.android.exoplayer2.FormatHolder r5, com.google.android.exoplayer2.decoder.DecoderInputBuffer r6, boolean r7, boolean r8, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder r9) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.waitingForKeys = r0     // Catch: java.lang.Throwable -> L88
            boolean r0 = r4.hasNextSample()     // Catch: java.lang.Throwable -> L88
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L31
            if (r8 != 0) goto L2b
            boolean r8 = r4.isLastSampleQueued     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L14
            goto L2b
        L14:
            com.google.android.exoplayer2.Format r6 = r4.upstreamFormat     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L29
            if (r7 != 0) goto L1e
            com.google.android.exoplayer2.Format r7 = r4.downstreamFormat     // Catch: java.lang.Throwable -> L88
            if (r6 == r7) goto L29
        L1e:
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L88
            com.google.android.exoplayer2.Format r6 = (com.google.android.exoplayer2.Format) r6     // Catch: java.lang.Throwable -> L88
            r4.onFormatResult(r6, r5)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r4)
            return r1
        L29:
            monitor-exit(r4)
            return r2
        L2b:
            r5 = 4
            r6.setFlags(r5)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r4)
            return r3
        L31:
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r8 = r4.sharedSampleMetadata     // Catch: java.lang.Throwable -> L88
            int r0 = r4.getReadIndex()     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L88
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r8 = (com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) r8     // Catch: java.lang.Throwable -> L88
            com.google.android.exoplayer2.Format r8 = r8.format     // Catch: java.lang.Throwable -> L88
            if (r7 != 0) goto L83
            com.google.android.exoplayer2.Format r7 = r4.downstreamFormat     // Catch: java.lang.Throwable -> L88
            if (r8 == r7) goto L46
            goto L83
        L46:
            int r5 = r4.readPosition     // Catch: java.lang.Throwable -> L88
            int r5 = r4.getRelativeIndex(r5)     // Catch: java.lang.Throwable -> L88
            boolean r7 = r4.mayReadSample(r5)     // Catch: java.lang.Throwable -> L88
            if (r7 != 0) goto L57
            r5 = 1
            r6.waitingForKeys = r5     // Catch: java.lang.Throwable -> L88
            monitor-exit(r4)
            return r2
        L57:
            int[] r7 = r4.flags     // Catch: java.lang.Throwable -> L88
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L88
            r6.setFlags(r7)     // Catch: java.lang.Throwable -> L88
            long[] r7 = r4.timesUs     // Catch: java.lang.Throwable -> L88
            r0 = r7[r5]     // Catch: java.lang.Throwable -> L88
            r6.timeUs = r0     // Catch: java.lang.Throwable -> L88
            long r7 = r4.startTimeUs     // Catch: java.lang.Throwable -> L88
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L6f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.addFlag(r7)     // Catch: java.lang.Throwable -> L88
        L6f:
            int[] r6 = r4.sizes     // Catch: java.lang.Throwable -> L88
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L88
            r9.size = r6     // Catch: java.lang.Throwable -> L88
            long[] r6 = r4.offsets     // Catch: java.lang.Throwable -> L88
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L88
            r9.offset = r7     // Catch: java.lang.Throwable -> L88
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] r6 = r4.cryptoDatas     // Catch: java.lang.Throwable -> L88
            r5 = r6[r5]     // Catch: java.lang.Throwable -> L88
            r9.cryptoData = r5     // Catch: java.lang.Throwable -> L88
            monitor-exit(r4)
            return r3
        L83:
            r4.onFormatResult(r8, r5)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r4)
            return r1
        L88:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private void releaseDrmSessionReferences() {
            r2 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r2.currentDrmSession
            if (r0 == 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r2.drmEventDispatcher
            r0.release(r1)
            r0 = 0
            r2.currentDrmSession = r0
            r2.downstreamFormat = r0
        Le:
            return
    }

    private synchronized void rewind() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.readPosition = r0     // Catch: java.lang.Throwable -> Lb
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r1.sampleDataQueue     // Catch: java.lang.Throwable -> Lb
            r0.rewind()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    private synchronized boolean setUpstreamFormat(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.upstreamFormatRequired = r0     // Catch: java.lang.Throwable -> L46
            com.google.android.exoplayer2.Format r1 = r2.upstreamFormat     // Catch: java.lang.Throwable -> L46
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r3, r1)     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto Le
            monitor-exit(r2)
            return r0
        Le:
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r1 = r2.sharedSampleMetadata     // Catch: java.lang.Throwable -> L46
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L33
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r1 = r2.sharedSampleMetadata     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r1.getEndValue()     // Catch: java.lang.Throwable -> L46
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r1 = (com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) r1     // Catch: java.lang.Throwable -> L46
            com.google.android.exoplayer2.Format r1 = r1.format     // Catch: java.lang.Throwable -> L46
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L33
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r3 = r2.sharedSampleMetadata     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.getEndValue()     // Catch: java.lang.Throwable -> L46
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r3 = (com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) r3     // Catch: java.lang.Throwable -> L46
            com.google.android.exoplayer2.Format r3 = r3.format     // Catch: java.lang.Throwable -> L46
            r2.upstreamFormat = r3     // Catch: java.lang.Throwable -> L46
            goto L35
        L33:
            r2.upstreamFormat = r3     // Catch: java.lang.Throwable -> L46
        L35:
            com.google.android.exoplayer2.Format r3 = r2.upstreamFormat     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r3.sampleMimeType     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r3.codecs     // Catch: java.lang.Throwable -> L46
            boolean r3 = com.google.android.exoplayer2.util.MimeTypes.allSamplesAreSyncSamples(r1, r3)     // Catch: java.lang.Throwable -> L46
            r2.upstreamAllSamplesAreSyncSamples = r3     // Catch: java.lang.Throwable -> L46
            r2.loggedUnexpectedNonSyncSample = r0     // Catch: java.lang.Throwable -> L46
            r3 = 1
            monitor-exit(r2)
            return r3
        L46:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized long discardSampleMetadataToRead() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.readPosition     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L9
            r0 = -1
            monitor-exit(r2)
            return r0
        L9:
            long r0 = r2.discardSamples(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void discardTo(long r2, boolean r4, boolean r5) {
            r1 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r1.sampleDataQueue
            long r2 = r1.discardSampleMetadataTo(r2, r4, r5)
            r0.discardDownstreamTo(r2)
            return
    }

    public final void discardToEnd() {
            r3 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r3.sampleDataQueue
            long r1 = r3.discardSampleMetadataToEnd()
            r0.discardDownstreamTo(r1)
            return
    }

    public final void discardToRead() {
            r3 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r3.sampleDataQueue
            long r1 = r3.discardSampleMetadataToRead()
            r0.discardDownstreamTo(r1)
            return
    }

    public final void discardUpstreamFrom(long r4) {
            r3 = this;
            int r0 = r3.length
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = r3.getLargestReadTimestampUs()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r4 = r3.countUnreadSamplesBefore(r4)
            int r5 = r3.absoluteFirstIndex
            int r5 = r5 + r4
            r3.discardUpstreamSamples(r5)
            return
    }

    public final void discardUpstreamSamples(int r4) {
            r3 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r3.sampleDataQueue
            long r1 = r3.discardUpstreamSampleMetadata(r4)
            r0.discardUpstreamSampleBytes(r1)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            com.google.android.exoplayer2.Format r0 = r2.getAdjustedUpstreamFormat(r3)
            r1 = 0
            r2.upstreamFormatAdjustmentRequired = r1
            r2.unadjustedUpstreamFormat = r3
            boolean r3 = r2.setUpstreamFormat(r0)
            com.google.android.exoplayer2.source.SampleQueue$UpstreamFormatChangedListener r1 = r2.upstreamFormatChangeListener
            if (r1 == 0) goto L16
            if (r3 == 0) goto L16
            r1.onUpstreamFormatChanged(r0)
        L16:
            return
    }

    @androidx.annotation.CallSuper
    public com.google.android.exoplayer2.Format getAdjustedUpstreamFormat(com.google.android.exoplayer2.Format r6) {
            r5 = this;
            long r0 = r5.sampleOffsetUs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            long r0 = r6.subsampleOffsetUs
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            com.google.android.exoplayer2.Format$Builder r0 = r6.buildUpon()
            long r1 = r6.subsampleOffsetUs
            long r3 = r5.sampleOffsetUs
            long r1 = r1 + r3
            com.google.android.exoplayer2.Format$Builder r6 = r0.setSubsampleOffsetUs(r1)
            com.google.android.exoplayer2.Format r6 = r6.build()
        L24:
            return r6
    }

    public final int getFirstIndex() {
            r1 = this;
            int r0 = r1.absoluteFirstIndex
            return r0
    }

    public final synchronized long getFirstTimestampUs() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.length     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L8
            r0 = -9223372036854775808
            goto Lf
        L8:
            long[] r0 = r3.timesUs     // Catch: java.lang.Throwable -> L11
            int r1 = r3.relativeFirstIndex     // Catch: java.lang.Throwable -> L11
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L11
            r0 = r1
        Lf:
            monitor-exit(r3)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized long getLargestQueuedTimestampUs() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.largestQueuedTimestampUs     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized long getLargestReadTimestampUs() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.largestDiscardedTimestampUs     // Catch: java.lang.Throwable -> Lf
            int r2 = r4.readPosition     // Catch: java.lang.Throwable -> Lf
            long r2 = r4.getLargestTimestamp(r2)     // Catch: java.lang.Throwable -> Lf
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final int getReadIndex() {
            r2 = this;
            int r0 = r2.absoluteFirstIndex
            int r1 = r2.readPosition
            int r0 = r0 + r1
            return r0
    }

    public final synchronized int getSkipCount(long r9, boolean r11) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.readPosition     // Catch: java.lang.Throwable -> L3c
            int r2 = r8.getRelativeIndex(r0)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r8.hasNextSample()     // Catch: java.lang.Throwable -> L3c
            r7 = 0
            if (r0 == 0) goto L3a
            long[] r0 = r8.timesUs     // Catch: java.lang.Throwable -> L3c
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L3c
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L17
            goto L3a
        L17:
            long r0 = r8.largestQueuedTimestampUs     // Catch: java.lang.Throwable -> L3c
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L26
            if (r11 == 0) goto L26
            int r9 = r8.length     // Catch: java.lang.Throwable -> L3c
            int r10 = r8.readPosition     // Catch: java.lang.Throwable -> L3c
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L26:
            int r11 = r8.length     // Catch: java.lang.Throwable -> L3c
            int r0 = r8.readPosition     // Catch: java.lang.Throwable -> L3c
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.findSampleBefore(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3c
            r10 = -1
            if (r9 != r10) goto L38
            monitor-exit(r8)
            return r7
        L38:
            monitor-exit(r8)
            return r9
        L3a:
            monitor-exit(r8)
            return r7
        L3c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @androidx.annotation.Nullable
    public final synchronized com.google.android.exoplayer2.Format getUpstreamFormat() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.upstreamFormatRequired     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L7
            r0 = 0
            goto L9
        L7:
            com.google.android.exoplayer2.Format r0 = r1.upstreamFormat     // Catch: java.lang.Throwable -> Lb
        L9:
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final int getWriteIndex() {
            r2 = this;
            int r0 = r2.absoluteFirstIndex
            int r1 = r2.length
            int r0 = r0 + r1
            return r0
    }

    public final void invalidateUpstreamFormatAdjustment() {
            r1 = this;
            r0 = 1
            r1.upstreamFormatAdjustmentRequired = r0
            return
    }

    public final synchronized boolean isLastSampleQueued() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isLastSampleQueued     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @androidx.annotation.CallSuper
    public synchronized boolean isReady(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasNextSample()     // Catch: java.lang.Throwable -> L3a
            r1 = 1
            if (r0 != 0) goto L1a
            if (r3 != 0) goto L18
            boolean r3 = r2.isLastSampleQueued     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L18
            com.google.android.exoplayer2.Format r3 = r2.upstreamFormat     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L17
            com.google.android.exoplayer2.Format r0 = r2.downstreamFormat     // Catch: java.lang.Throwable -> L3a
            if (r3 == r0) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            monitor-exit(r2)
            return r1
        L1a:
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r3 = r2.sharedSampleMetadata     // Catch: java.lang.Throwable -> L3a
            int r0 = r2.getReadIndex()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L3a
            com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata r3 = (com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) r3     // Catch: java.lang.Throwable -> L3a
            com.google.android.exoplayer2.Format r3 = r3.format     // Catch: java.lang.Throwable -> L3a
            com.google.android.exoplayer2.Format r0 = r2.downstreamFormat     // Catch: java.lang.Throwable -> L3a
            if (r3 == r0) goto L2e
            monitor-exit(r2)
            return r1
        L2e:
            int r3 = r2.readPosition     // Catch: java.lang.Throwable -> L3a
            int r3 = r2.getRelativeIndex(r3)     // Catch: java.lang.Throwable -> L3a
            boolean r3 = r2.mayReadSample(r3)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r2)
            return r3
        L3a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @androidx.annotation.CallSuper
    public void maybeThrowError() throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.drm.DrmSession r0 = r2.currentDrmSession
            if (r0 == 0) goto L19
            int r0 = r0.getState()
            r1 = 1
            if (r0 == r1) goto Lc
            goto L19
        Lc:
            com.google.android.exoplayer2.drm.DrmSession r0 = r2.currentDrmSession
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.getError()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) r0
            throw r0
        L19:
            return
    }

    public final synchronized int peekSourceId() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.readPosition     // Catch: java.lang.Throwable -> L16
            int r0 = r2.getRelativeIndex(r0)     // Catch: java.lang.Throwable -> L16
            boolean r1 = r2.hasNextSample()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L12
            int[] r1 = r2.sourceIds     // Catch: java.lang.Throwable -> L16
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L16
            goto L14
        L12:
            int r0 = r2.upstreamSourceId     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r2)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @androidx.annotation.CallSuper
    public void preRelease() {
            r0 = this;
            r0.discardToEnd()
            r0.releaseDrmSessionReferences()
            return
    }

    @androidx.annotation.CallSuper
    public int read(com.google.android.exoplayer2.FormatHolder r10, com.google.android.exoplayer2.decoder.DecoderInputBuffer r11, int r12, boolean r13) {
            r9 = this;
            r0 = r12 & 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r6 = 1
            goto L9
        L8:
            r6 = 0
        L9:
            com.google.android.exoplayer2.source.SampleQueue$SampleExtrasHolder r8 = r9.extrasHolder
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            int r10 = r3.peekSampleMetadata(r4, r5, r6, r7, r8)
            r13 = -4
            if (r10 != r13) goto L3d
            boolean r13 = r11.isEndOfStream()
            if (r13 != 0) goto L3d
            r13 = r12 & 1
            if (r13 == 0) goto L21
            r1 = 1
        L21:
            r12 = r12 & 4
            if (r12 != 0) goto L36
            if (r1 == 0) goto L2f
            com.google.android.exoplayer2.source.SampleDataQueue r12 = r9.sampleDataQueue
            com.google.android.exoplayer2.source.SampleQueue$SampleExtrasHolder r13 = r9.extrasHolder
            r12.peekToBuffer(r11, r13)
            goto L36
        L2f:
            com.google.android.exoplayer2.source.SampleDataQueue r12 = r9.sampleDataQueue
            com.google.android.exoplayer2.source.SampleQueue$SampleExtrasHolder r13 = r9.extrasHolder
            r12.readToBuffer(r11, r13)
        L36:
            if (r1 != 0) goto L3d
            int r11 = r9.readPosition
            int r11 = r11 + r2
            r9.readPosition = r11
        L3d:
            return r10
    }

    @androidx.annotation.CallSuper
    public void release() {
            r1 = this;
            r0 = 1
            r1.reset(r0)
            r1.releaseDrmSessionReferences()
            return
    }

    public final void reset() {
            r1 = this;
            r0 = 0
            r1.reset(r0)
            return
    }

    @androidx.annotation.CallSuper
    public void reset(boolean r5) {
            r4 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r4.sampleDataQueue
            r0.reset()
            r0 = 0
            r4.length = r0
            r4.absoluteFirstIndex = r0
            r4.relativeFirstIndex = r0
            r4.readPosition = r0
            r1 = 1
            r4.upstreamKeyframeRequired = r1
            r2 = -9223372036854775808
            r4.startTimeUs = r2
            r4.largestDiscardedTimestampUs = r2
            r4.largestQueuedTimestampUs = r2
            r4.isLastSampleQueued = r0
            com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue$SharedSampleMetadata> r0 = r4.sharedSampleMetadata
            r0.clear()
            if (r5 == 0) goto L29
            r5 = 0
            r4.unadjustedUpstreamFormat = r5
            r4.upstreamFormat = r5
            r4.upstreamFormatRequired = r1
        L29:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3) {
            r0 = this;
            int r1 = com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2, r3)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3, int r4) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r4 = r0.sampleDataQueue
            int r1 = r4.sampleData(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.source.SampleDataQueue r3 = r0.sampleDataQueue
            r3.sampleData(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long r12, int r14, int r15, int r16, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r17) {
            r11 = this;
            r8 = r11
            boolean r0 = r8.upstreamFormatAdjustmentRequired
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.Format r0 = r8.unadjustedUpstreamFormat
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            r11.format(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.upstreamKeyframeRequired
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.upstreamKeyframeRequired = r1
        L22:
            long r4 = r8.sampleOffsetUs
            long r4 = r4 + r12
            boolean r6 = r8.upstreamAllSamplesAreSyncSamples
            if (r6 == 0) goto L50
            long r6 = r8.startTimeUs
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L50
            boolean r0 = r8.loggedUnexpectedNonSyncSample
            if (r0 != 0) goto L4c
            java.lang.String r0 = "Overriding unexpected non-sync sample for format: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.google.android.exoplayer2.Format r6 = r8.upstreamFormat
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.google.android.exoplayer2.util.Log.w(r6, r0)
            r8.loggedUnexpectedNonSyncSample = r2
        L4c:
            r0 = r14 | 1
            r6 = r0
            goto L51
        L50:
            r6 = r14
        L51:
            boolean r0 = r8.pendingSplice
            if (r0 == 0) goto L62
            if (r3 == 0) goto L61
            boolean r0 = r11.attemptSplice(r4)
            if (r0 != 0) goto L5e
            goto L61
        L5e:
            r8.pendingSplice = r1
            goto L62
        L61:
            return
        L62:
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r8.sampleDataQueue
            long r0 = r0.getTotalBytesWritten()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.commitSample(r1, r3, r4, r6, r7)
            return
    }

    public final synchronized boolean seekTo(int r4) {
            r3 = this;
            monitor-enter(r3)
            r3.rewind()     // Catch: java.lang.Throwable -> L1b
            int r0 = r3.absoluteFirstIndex     // Catch: java.lang.Throwable -> L1b
            if (r4 < r0) goto L18
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 + r0
            if (r4 <= r1) goto Le
            goto L18
        Le:
            r1 = -9223372036854775808
            r3.startTimeUs = r1     // Catch: java.lang.Throwable -> L1b
            int r4 = r4 - r0
            r3.readPosition = r4     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            monitor-exit(r3)
            return r4
        L18:
            r4 = 0
            monitor-exit(r3)
            return r4
        L1b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized boolean seekTo(long r9, boolean r11) {
            r8 = this;
            monitor-enter(r8)
            r8.rewind()     // Catch: java.lang.Throwable -> L40
            int r0 = r8.readPosition     // Catch: java.lang.Throwable -> L40
            int r2 = r8.getRelativeIndex(r0)     // Catch: java.lang.Throwable -> L40
            boolean r0 = r8.hasNextSample()     // Catch: java.lang.Throwable -> L40
            r7 = 0
            if (r0 == 0) goto L3e
            long[] r0 = r8.timesUs     // Catch: java.lang.Throwable -> L40
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L40
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L3e
            long r0 = r8.largestQueuedTimestampUs     // Catch: java.lang.Throwable -> L40
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L22
            if (r11 != 0) goto L22
            goto L3e
        L22:
            int r11 = r8.length     // Catch: java.lang.Throwable -> L40
            int r0 = r8.readPosition     // Catch: java.lang.Throwable -> L40
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.findSampleBefore(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L40
            r0 = -1
            if (r11 != r0) goto L34
            monitor-exit(r8)
            return r7
        L34:
            r8.startTimeUs = r9     // Catch: java.lang.Throwable -> L40
            int r9 = r8.readPosition     // Catch: java.lang.Throwable -> L40
            int r9 = r9 + r11
            r8.readPosition = r9     // Catch: java.lang.Throwable -> L40
            r9 = 1
            monitor-exit(r8)
            return r9
        L3e:
            monitor-exit(r8)
            return r7
        L40:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final void setSampleOffsetUs(long r4) {
            r3 = this;
            long r0 = r3.sampleOffsetUs
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto Lb
            r3.sampleOffsetUs = r4
            r4 = 1
            r3.upstreamFormatAdjustmentRequired = r4
        Lb:
            return
    }

    public final void setStartTimeUs(long r1) {
            r0 = this;
            r0.startTimeUs = r1
            return
    }

    public final void setUpstreamFormatChangeListener(@androidx.annotation.Nullable com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener r1) {
            r0 = this;
            r0.upstreamFormatChangeListener = r1
            return
    }

    public final synchronized void skip(int r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.readPosition     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.length     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.readPosition     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.readPosition = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
    }

    public final void sourceId(int r1) {
            r0 = this;
            r0.upstreamSourceId = r1
            return
    }

    public final void splice() {
            r1 = this;
            r0 = 1
            r1.pendingSplice = r0
            return
    }
}
