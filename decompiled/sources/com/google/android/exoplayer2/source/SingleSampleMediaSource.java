package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleSampleMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final long durationUs;
    private final com.google.android.exoplayer2.Format format;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final com.google.android.exoplayer2.Timeline timeline;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.SingleSampleMediaSource$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Factory {
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @androidx.annotation.Nullable
        private java.lang.Object tag;

        @androidx.annotation.Nullable
        private java.lang.String trackId;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.upstream.DataSource$Factory r1 = (com.google.android.exoplayer2.upstream.DataSource.Factory) r1
                r0.dataSourceFactory = r1
                com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r1 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
                r1.<init>()
                r0.loadErrorHandlingPolicy = r1
                r1 = 1
                r0.treatLoadErrorsAsEndOfStream = r1
                return
        }

        public com.google.android.exoplayer2.source.SingleSampleMediaSource createMediaSource(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration r12, long r13) {
                r11 = this;
                com.google.android.exoplayer2.source.SingleSampleMediaSource r10 = new com.google.android.exoplayer2.source.SingleSampleMediaSource
                java.lang.String r1 = r11.trackId
                com.google.android.exoplayer2.upstream.DataSource$Factory r3 = r11.dataSourceFactory
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6 = r11.loadErrorHandlingPolicy
                boolean r7 = r11.treatLoadErrorsAsEndOfStream
                java.lang.Object r8 = r11.tag
                r9 = 0
                r0 = r10
                r2 = r12
                r4 = r13
                r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
                return r10
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setLoadErrorHandlingPolicy(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L8
            L3:
                com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy r1 = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy
                r1.<init>()
            L8:
                r0.loadErrorHandlingPolicy = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setTag(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                r0.tag = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setTrackId(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.trackId = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setTreatLoadErrorsAsEndOfStream(boolean r1) {
                r0 = this;
                r0.treatLoadErrorsAsEndOfStream = r1
                return r0
        }
    }

    private SingleSampleMediaSource(@androidx.annotation.Nullable java.lang.String r11, com.google.android.exoplayer2.MediaItem.SubtitleConfiguration r12, com.google.android.exoplayer2.upstream.DataSource.Factory r13, long r14, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r16, boolean r17, @androidx.annotation.Nullable java.lang.Object r18) {
            r10 = this;
            r0 = r10
            r1 = r12
            r10.<init>()
            r2 = r13
            r0.dataSourceFactory = r2
            r2 = r14
            r0.durationUs = r2
            r4 = r16
            r0.loadErrorHandlingPolicy = r4
            r4 = r17
            r0.treatLoadErrorsAsEndOfStream = r4
            com.google.android.exoplayer2.MediaItem$Builder r4 = new com.google.android.exoplayer2.MediaItem$Builder
            r4.<init>()
            android.net.Uri r5 = android.net.Uri.EMPTY
            com.google.android.exoplayer2.MediaItem$Builder r4 = r4.setUri(r5)
            android.net.Uri r5 = r1.uri
            java.lang.String r5 = r5.toString()
            com.google.android.exoplayer2.MediaItem$Builder r4 = r4.setMediaId(r5)
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of(r12)
            com.google.android.exoplayer2.MediaItem$Builder r4 = r4.setSubtitleConfigurations(r5)
            r5 = r18
            com.google.android.exoplayer2.MediaItem$Builder r4 = r4.setTag(r5)
            com.google.android.exoplayer2.MediaItem r8 = r4.build()
            r0.mediaItem = r8
            com.google.android.exoplayer2.Format$Builder r4 = new com.google.android.exoplayer2.Format$Builder
            r4.<init>()
            java.lang.String r5 = r1.mimeType
            java.lang.String r6 = "text/x-unknown"
            java.lang.Object r5 = com.google.common.base.MoreObjects.firstNonNull(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleMimeType(r5)
            java.lang.String r5 = r1.language
            com.google.android.exoplayer2.Format$Builder r4 = r4.setLanguage(r5)
            int r5 = r1.selectionFlags
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSelectionFlags(r5)
            int r5 = r1.roleFlags
            com.google.android.exoplayer2.Format$Builder r4 = r4.setRoleFlags(r5)
            java.lang.String r5 = r1.label
            com.google.android.exoplayer2.Format$Builder r4 = r4.setLabel(r5)
            java.lang.String r5 = r1.id
            if (r5 == 0) goto L6d
            goto L6e
        L6d:
            r5 = r11
        L6e:
            com.google.android.exoplayer2.Format$Builder r4 = r4.setId(r5)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r0.format = r4
            com.google.android.exoplayer2.upstream.DataSpec$Builder r4 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r4.<init>()
            android.net.Uri r1 = r1.uri
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r4.setUri(r1)
            r4 = 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r1 = r1.setFlags(r4)
            com.google.android.exoplayer2.upstream.DataSpec r1 = r1.build()
            r0.dataSpec = r1
            com.google.android.exoplayer2.source.SinglePeriodTimeline r9 = new com.google.android.exoplayer2.source.SinglePeriodTimeline
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r9
            r2 = r14
            r1.<init>(r2, r4, r5, r6, r7, r8)
            r0.timeline = r9
            return
    }

    public /* synthetic */ SingleSampleMediaSource(java.lang.String r1, com.google.android.exoplayer2.MediaItem.SubtitleConfiguration r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, long r4, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6, boolean r7, java.lang.Object r8, com.google.android.exoplayer2.source.SingleSampleMediaSource.AnonymousClass1 r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r11, com.google.android.exoplayer2.upstream.Allocator r12, long r13) {
            r10 = this;
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod r12 = new com.google.android.exoplayer2.source.SingleSampleMediaPeriod
            com.google.android.exoplayer2.upstream.DataSpec r1 = r10.dataSpec
            com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r10.dataSourceFactory
            com.google.android.exoplayer2.upstream.TransferListener r3 = r10.transferListener
            com.google.android.exoplayer2.Format r4 = r10.format
            long r5 = r10.durationUs
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7 = r10.loadErrorHandlingPolicy
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r8 = r10.createEventDispatcher(r11)
            boolean r9 = r10.treatLoadErrorsAsEndOfStream
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r12
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = r1.mediaItem
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
            r0 = this;
            r0.transferListener = r1
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            r0.refreshSourceInfo(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod r1 = (com.google.android.exoplayer2.source.SingleSampleMediaPeriod) r1
            r1.release()
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r0 = this;
            return
    }
}
