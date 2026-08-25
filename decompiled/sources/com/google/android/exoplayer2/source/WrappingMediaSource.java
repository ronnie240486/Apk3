package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class WrappingMediaSource extends com.google.android.exoplayer2.source.CompositeMediaSource<java.lang.Void> {
    private static final java.lang.Void CHILD_SOURCE_ID = null;
    public final com.google.android.exoplayer2.source.MediaSource mediaSource;

    public WrappingMediaSource(com.google.android.exoplayer2.source.MediaSource r1) {
            r0 = this;
            r0.<init>()
            r0.mediaSource = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.upstream.Allocator r3, long r4) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            com.google.android.exoplayer2.source.MediaPeriod r2 = r0.createPeriod(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Timeline getInitialTimeline() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            com.google.android.exoplayer2.Timeline r0 = r0.getInitialTimeline()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            com.google.android.exoplayer2.MediaItem r0 = r0.getMediaItem()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1) {
            r0 = this;
            return r1
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(java.lang.Void r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.getMediaPeriodIdForChildMediaPeriodId(r2)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(java.lang.Void r1, long r2) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            return r2
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(java.lang.Void r1, int r2) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            return r2
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            boolean r0 = r0.isSingleWindow()
            return r0
    }

    public void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline r1) {
            r0 = this;
            r0.refreshSourceInfo(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(java.lang.Void r1, com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            r0.onChildSourceInfoRefreshed(r3)
            return
    }

    public final void prepareChildSource() {
            r2 = this;
            java.lang.Void r0 = com.google.android.exoplayer2.source.WrappingMediaSource.CHILD_SOURCE_ID
            com.google.android.exoplayer2.source.MediaSource r1 = r2.mediaSource
            r2.prepareChildSource(r0, r1)
            return
    }

    public void prepareSourceInternal() {
            r0 = this;
            r0.prepareChildSource()
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
            r0 = this;
            super.prepareSourceInternal(r1)
            r0.prepareSourceInternal()
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.releasePeriod(r2)
            return
    }
}
