package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskingMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaPeriod.Callback {
    private final com.google.android.exoplayer2.upstream.Allocator allocator;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId id;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener listener;
    private com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
    private com.google.android.exoplayer2.source.MediaSource mediaSource;
    private boolean notifiedPrepareError;
    private long preparePositionOverrideUs;
    private final long preparePositionUs;

    /* JADX INFO: loaded from: classes.dex */
    public interface PrepareListener {
        void onPrepareComplete(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1);

        void onPrepareError(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, java.io.IOException r2);
    }

    public MaskingMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, com.google.android.exoplayer2.upstream.Allocator r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.allocator = r2
            r0.preparePositionUs = r3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.preparePositionOverrideUs = r1
            return
    }

    private long getPreparePositionWithOverride(long r6) {
            r5 = this;
            long r0 = r5.preparePositionOverrideUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r6 = r0
        Lc:
            return r6
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            if (r0 == 0) goto Lc
            boolean r2 = r0.continueLoading(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5) {
            r4 = this;
            long r0 = r4.preparePositionUs
            long r0 = r4.getPreparePositionWithOverride(r0)
            com.google.android.exoplayer2.source.MediaSource r2 = r4.mediaSource
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.source.MediaSource r2 = (com.google.android.exoplayer2.source.MediaSource) r2
            com.google.android.exoplayer2.upstream.Allocator r3 = r4.allocator
            com.google.android.exoplayer2.source.MediaPeriod r5 = r2.createPeriod(r5, r3, r0)
            r4.mediaPeriod = r5
            com.google.android.exoplayer2.source.MediaPeriod$Callback r2 = r4.callback
            if (r2 == 0) goto L1d
            r5.prepare(r4, r0)
        L1d:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r2, boolean r4) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            r0.discardBuffer(r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long r2, com.google.android.exoplayer2.SeekParameters r4) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            long r2 = r0.getAdjustedSeekPositionUs(r2, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r2 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r2.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            long r0 = r0.getBufferedPositionUs()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r2 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r2.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            long r0 = r0.getNextLoadPositionUs()
            return r0
    }

    public long getPreparePositionOverrideUs() {
            r2 = this;
            long r0 = r2.preparePositionOverrideUs
            return r0
    }

    public long getPreparePositionUs() {
            r2 = this;
            long r0 = r2.preparePositionUs
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final /* synthetic */ java.util.List getStreamKeys(java.util.List r1) {
            r0 = this;
            java.util.List r1 = com.google.android.exoplayer2.source.MediaPeriod.CC.$default$getStreamKeys(r0, r1)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            if (r0 == 0) goto Lc
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod     // Catch: java.io.IOException -> L10
            if (r0 == 0) goto L8
            r0.maybeThrowPrepareError()     // Catch: java.io.IOException -> L10
            goto L21
        L8:
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource     // Catch: java.io.IOException -> L10
            if (r0 == 0) goto L21
            r0.maybeThrowSourceInfoRefreshError()     // Catch: java.io.IOException -> L10
            goto L21
        L10:
            r0 = move-exception
            com.google.android.exoplayer2.source.MaskingMediaPeriod$PrepareListener r1 = r3.listener
            if (r1 == 0) goto L22
            boolean r2 = r3.notifiedPrepareError
            if (r2 != 0) goto L21
            r2 = 1
            r3.notifiedPrepareError = r2
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r3.id
            r1.onPrepareError(r2, r0)
        L21:
            return
        L22:
            throw r0
    }

    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
            r1.onContinueLoadingRequested(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
            r0.onContinueLoadingRequested(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod$Callback r2 = r1.callback
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r2 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r2
            r2.onPrepared(r1)
            com.google.android.exoplayer2.source.MaskingMediaPeriod$PrepareListener r2 = r1.listener
            if (r2 == 0) goto L14
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r1.id
            r2.onPrepareComplete(r0)
        L14:
            return
    }

    public void overridePreparePositionUs(long r1) {
            r0 = this;
            r0.preparePositionOverrideUs = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
            r0 = this;
            r0.callback = r1
            com.google.android.exoplayer2.source.MediaPeriod r1 = r0.mediaPeriod
            if (r1 == 0) goto Lf
            long r2 = r0.preparePositionUs
            long r2 = r0.getPreparePositionWithOverride(r2)
            r1.prepare(r0, r2)
        Lf:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
            r2 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r2.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            long r0 = r0.readDiscontinuity()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            r0.reevaluateBuffer(r2)
            return
    }

    public void releasePeriod() {
            r2 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r2.mediaPeriod
            if (r0 == 0) goto L11
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.MediaSource r0 = (com.google.android.exoplayer2.source.MediaSource) r0
            com.google.android.exoplayer2.source.MediaPeriod r1 = r2.mediaPeriod
            r0.releasePeriod(r1)
        L11:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.source.MediaPeriod r0 = (com.google.android.exoplayer2.source.MediaPeriod) r0
            long r2 = r0.seekToUs(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r16, boolean[] r17, com.google.android.exoplayer2.source.SampleStream[] r18, boolean[] r19, long r20) {
            r15 = this;
            r0 = r15
            long r1 = r0.preparePositionOverrideUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L16
            long r5 = r0.preparePositionUs
            int r7 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r7 != 0) goto L16
            r0.preparePositionOverrideUs = r3
            r13 = r1
            goto L18
        L16:
            r13 = r20
        L18:
            com.google.android.exoplayer2.source.MediaPeriod r1 = r0.mediaPeriod
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            r8 = r1
            com.google.android.exoplayer2.source.MediaPeriod r8 = (com.google.android.exoplayer2.source.MediaPeriod) r8
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            long r1 = r8.selectTracks(r9, r10, r11, r12, r13)
            return r1
    }

    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.mediaSource = r2
            return
    }

    public void setPrepareListener(com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
