package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaSource {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.MediaSource$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        @androidx.annotation.Nullable
        public static com.google.android.exoplayer2.Timeline $default$getInitialTimeline(com.google.android.exoplayer2.source.MediaSource r0) {
                r0 = 0
                return r0
        }

        public static boolean $default$isSingleWindow(com.google.android.exoplayer2.source.MediaSource r0) {
                r0 = 1
                return r0
        }

        @java.lang.Deprecated
        public static void $default$prepareSource(com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r2, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
                com.google.android.exoplayer2.analytics.PlayerId r0 = com.google.android.exoplayer2.analytics.PlayerId.UNSET
                r1.prepareSource(r2, r3, r0)
                return
        }
    }

    public interface Factory {
        public static final com.google.android.exoplayer2.source.MediaSource.Factory UNSUPPORTED = null;

        static {
                com.google.android.exoplayer2.source.MediaSourceFactory r0 = com.google.android.exoplayer2.source.MediaSourceFactory.UNSUPPORTED
                com.google.android.exoplayer2.source.MediaSource.Factory.UNSUPPORTED = r0
                return
        }

        com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r1);

        int[] getSupportedTypes();

        com.google.android.exoplayer2.source.MediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r1);

        com.google.android.exoplayer2.source.MediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class MediaPeriodId extends com.google.android.exoplayer2.source.MediaPeriodId {
        public MediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public MediaPeriodId(java.lang.Object r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public MediaPeriodId(java.lang.Object r1, int r2, int r3, long r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public MediaPeriodId(java.lang.Object r1, long r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public MediaPeriodId(java.lang.Object r1, long r2, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaPeriodId copyWithPeriodUid(java.lang.Object r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.copyWithPeriodUid(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId copyWithPeriodUid(java.lang.Object r2) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
                com.google.android.exoplayer2.source.MediaPeriodId r2 = super.copyWithPeriodUid(r2)
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaPeriodId copyWithWindowSequenceNumber(long r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.copyWithWindowSequenceNumber(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId copyWithWindowSequenceNumber(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
                com.google.android.exoplayer2.source.MediaPeriodId r2 = super.copyWithWindowSequenceNumber(r2)
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.Timeline r2);
    }

    void addDrmEventListener(android.os.Handler r1, com.google.android.exoplayer2.drm.DrmSessionEventListener r2);

    void addEventListener(android.os.Handler r1, com.google.android.exoplayer2.source.MediaSourceEventListener r2);

    com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, com.google.android.exoplayer2.upstream.Allocator r2, long r3);

    void disable(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r1);

    void enable(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r1);

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.Timeline getInitialTimeline();

    com.google.android.exoplayer2.MediaItem getMediaItem();

    boolean isSingleWindow();

    void maybeThrowSourceInfoRefreshError() throws java.io.IOException;

    @java.lang.Deprecated
    void prepareSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r1, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r2);

    void prepareSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r1, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r2, com.google.android.exoplayer2.analytics.PlayerId r3);

    void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r1);

    void releaseSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r1);

    void removeDrmEventListener(com.google.android.exoplayer2.drm.DrmSessionEventListener r1);

    void removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener r1);
}
