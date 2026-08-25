package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseMediaSource implements com.google.android.exoplayer2.source.MediaSource {
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final java.util.HashSet<com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller> enabledMediaSourceCallers;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;

    @androidx.annotation.Nullable
    private android.os.Looper looper;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller> mediaSourceCallers;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.analytics.PlayerId playerId;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Timeline timeline;

    public BaseMediaSource() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.mediaSourceCallers = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.enabledMediaSourceCallers = r0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
            r0.<init>()
            r2.eventDispatcher = r0
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher
            r0.<init>()
            r2.drmEventDispatcher = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addDrmEventListener(android.os.Handler r2, com.google.android.exoplayer2.drm.DrmSessionEventListener r3) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r1.drmEventDispatcher
            r0.addEventListener(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addEventListener(android.os.Handler r2, com.google.android.exoplayer2.source.MediaSourceEventListener r3) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.addEventListener(r2, r3)
            return
    }

    public final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r1.drmEventDispatcher
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r0.withParameters(r2, r3)
            return r2
    }

    public final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r2 = this;
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r2.drmEventDispatcher
            r1 = 0
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r3 = r0.withParameters(r1, r3)
            return r3
    }

    public final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(int r4, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5) {
            r3 = this;
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r3.eventDispatcher
            r1 = 0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r0.withParameters(r4, r5, r1)
            return r4
    }

    public final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5) {
            r4 = this;
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r4.eventDispatcher
            r1 = 0
            r2 = 0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r5 = r0.withParameters(r1, r5, r2)
            return r5
    }

    public final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, long r4) {
            r2 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r2.eventDispatcher
            r1 = 0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.withParameters(r1, r3, r4)
            return r3
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void disable(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r3) {
            r2 = this;
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r0 = r2.enabledMediaSourceCallers
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r1 = r2.enabledMediaSourceCallers
            r1.remove(r3)
            if (r0 == 0) goto L1a
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r3 = r2.enabledMediaSourceCallers
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1a
            r2.disableInternal()
        L1a:
            return
    }

    public void disableInternal() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void enable(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r3) {
            r2 = this;
            android.os.Looper r0 = r2.looper
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r0 = r2.enabledMediaSourceCallers
            boolean r0 = r0.isEmpty()
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r1 = r2.enabledMediaSourceCallers
            r1.add(r3)
            if (r0 == 0) goto L15
            r2.enableInternal()
        L15:
            return
    }

    public void enableInternal() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ com.google.android.exoplayer2.Timeline getInitialTimeline() {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = com.google.android.exoplayer2.source.MediaSource.CC.$default$getInitialTimeline(r1)
            return r0
    }

    public final com.google.android.exoplayer2.analytics.PlayerId getPlayerId() {
            r1 = this;
            com.google.android.exoplayer2.analytics.PlayerId r0 = r1.playerId
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.analytics.PlayerId r0 = (com.google.android.exoplayer2.analytics.PlayerId) r0
            return r0
    }

    public final boolean isEnabled() {
            r1 = this;
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r0 = r1.enabledMediaSourceCallers
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ boolean isSingleWindow() {
            r1 = this;
            boolean r0 = com.google.android.exoplayer2.source.MediaSource.CC.$default$isSingleWindow(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void prepareSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r2, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r1 = this;
            com.google.android.exoplayer2.analytics.PlayerId r0 = com.google.android.exoplayer2.analytics.PlayerId.UNSET
            r1.prepareSource(r2, r3, r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void prepareSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r4, com.google.android.exoplayer2.analytics.PlayerId r5) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r2.looper
            if (r1 == 0) goto Ld
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r2.playerId = r5
            com.google.android.exoplayer2.Timeline r5 = r2.timeline
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r1 = r2.mediaSourceCallers
            r1.add(r3)
            android.os.Looper r1 = r2.looper
            if (r1 != 0) goto L29
            r2.looper = r0
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r5 = r2.enabledMediaSourceCallers
            r5.add(r3)
            r2.prepareSourceInternal(r4)
            goto L31
        L29:
            if (r5 == 0) goto L31
            r2.enable(r3)
            r3.onSourceInfoRefreshed(r2, r5)
        L31:
            return
    }

    public abstract void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1);

    public final void refreshSourceInfo(com.google.android.exoplayer2.Timeline r3) {
            r2 = this;
            r2.timeline = r3
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r0 = r2.mediaSourceCallers
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r1 = (com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller) r1
            r1.onSourceInfoRefreshed(r2, r3)
            goto L8
        L18:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void releaseSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r0 = r1.mediaSourceCallers
            r0.remove(r2)
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r0 = r1.mediaSourceCallers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            r2 = 0
            r1.looper = r2
            r1.timeline = r2
            r1.playerId = r2
            java.util.HashSet<com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller> r2 = r1.enabledMediaSourceCallers
            r2.clear()
            r1.releaseSourceInternal()
            goto L20
        L1d:
            r1.disable(r2)
        L20:
            return
    }

    public abstract void releaseSourceInternal();

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeDrmEventListener(com.google.android.exoplayer2.drm.DrmSessionEventListener r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r1.drmEventDispatcher
            r0.removeEventListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r1.eventDispatcher
            r0.removeEventListener(r2)
            return
    }
}
