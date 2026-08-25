package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CompositeMediaSource<T> extends com.google.android.exoplayer2.source.BaseMediaSource {
    private final java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener<T>> childSources;

    @androidx.annotation.Nullable
    private android.os.Handler eventHandler;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.TransferListener mediaTransferListener;

    /* JADX INFO: loaded from: classes.dex */
    public final class ForwardingEventListener implements com.google.android.exoplayer2.source.MediaSourceEventListener, com.google.android.exoplayer2.drm.DrmSessionEventListener {
        private com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;

        @com.google.android.exoplayer2.util.UnknownNull
        private final T id;
        private com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final /* synthetic */ com.google.android.exoplayer2.source.CompositeMediaSource this$0;

        public ForwardingEventListener(@com.google.android.exoplayer2.util.UnknownNull com.google.android.exoplayer2.source.CompositeMediaSource r3, T r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r0 = 0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r3.createEventDispatcher(r0)
                r2.mediaSourceEventDispatcher = r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r3 = r3.createDrmEventDispatcher(r0)
                r2.drmEventDispatcher = r3
                r2.id = r4
                return
        }

        private boolean maybeUpdateEventDispatcher(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                if (r4 == 0) goto Le
                com.google.android.exoplayer2.source.CompositeMediaSource r0 = r2.this$0
                T r1 = r2.id
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r0.getMediaPeriodIdForChildMediaPeriodId(r1, r4)
                if (r4 != 0) goto Lf
                r3 = 0
                return r3
            Le:
                r4 = 0
            Lf:
                com.google.android.exoplayer2.source.CompositeMediaSource r0 = r2.this$0
                T r1 = r2.id
                int r3 = r0.getWindowIndexForChildWindowIndex(r1, r3)
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r2.mediaSourceEventDispatcher
                int r1 = r0.windowIndex
                if (r1 != r3) goto L25
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.mediaPeriodId
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r4)
                if (r0 != 0) goto L2d
            L25:
                com.google.android.exoplayer2.source.CompositeMediaSource r0 = r2.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r0.createEventDispatcher(r3, r4)
                r2.mediaSourceEventDispatcher = r0
            L2d:
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r2.drmEventDispatcher
                int r1 = r0.windowIndex
                if (r1 != r3) goto L3b
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.mediaPeriodId
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r4)
                if (r0 != 0) goto L43
            L3b:
                com.google.android.exoplayer2.source.CompositeMediaSource r0 = r2.this$0
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r3 = r0.createDrmEventDispatcher(r3, r4)
                r2.drmEventDispatcher = r3
            L43:
                r3 = 1
                return r3
        }

        private com.google.android.exoplayer2.source.MediaLoadData maybeUpdateMediaLoadData(com.google.android.exoplayer2.source.MediaLoadData r15) {
                r14 = this;
                com.google.android.exoplayer2.source.CompositeMediaSource r0 = r14.this$0
                T r1 = r14.id
                long r2 = r15.mediaStartTimeMs
                long r10 = r0.getMediaTimeForChildMediaTime(r1, r2)
                com.google.android.exoplayer2.source.CompositeMediaSource r0 = r14.this$0
                T r1 = r14.id
                long r2 = r15.mediaEndTimeMs
                long r12 = r0.getMediaTimeForChildMediaTime(r1, r2)
                long r0 = r15.mediaStartTimeMs
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 != 0) goto L21
                long r0 = r15.mediaEndTimeMs
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 != 0) goto L21
                return r15
            L21:
                com.google.android.exoplayer2.source.MediaLoadData r0 = new com.google.android.exoplayer2.source.MediaLoadData
                int r5 = r15.dataType
                int r6 = r15.trackType
                com.google.android.exoplayer2.Format r7 = r15.trackFormat
                int r8 = r15.trackSelectionReason
                java.lang.Object r9 = r15.trackSelectionData
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r12)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lf
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.mediaSourceEventDispatcher
                com.google.android.exoplayer2.source.MediaLoadData r2 = r0.maybeUpdateMediaLoadData(r3)
                r1.downstreamFormatChanged(r2)
            Lf:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lb
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.drmEventDispatcher
                r1.drmKeysLoaded()
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lb
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.drmEventDispatcher
                r1.drmKeysRemoved()
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lb
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.drmEventDispatcher
                r1.drmKeysRestored()
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final /* synthetic */ void onDrmSessionAcquired(int r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                com.google.android.exoplayer2.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, int r3) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lb
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.drmEventDispatcher
                r1.drmSessionAcquired(r3)
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, java.lang.Exception r3) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lb
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.drmEventDispatcher
                r1.drmSessionManagerError(r3)
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lb
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.drmEventDispatcher
                r1.drmSessionReleased()
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lf
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.mediaSourceEventDispatcher
                com.google.android.exoplayer2.source.MediaLoadData r2 = r0.maybeUpdateMediaLoadData(r4)
                r1.loadCanceled(r3, r2)
            Lf:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lf
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.mediaSourceEventDispatcher
                com.google.android.exoplayer2.source.MediaLoadData r2 = r0.maybeUpdateMediaLoadData(r4)
                r1.loadCompleted(r3, r2)
            Lf:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4, java.io.IOException r5, boolean r6) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lf
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.mediaSourceEventDispatcher
                com.google.android.exoplayer2.source.MediaLoadData r2 = r0.maybeUpdateMediaLoadData(r4)
                r1.loadError(r3, r2, r5, r6)
            Lf:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lf
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.mediaSourceEventDispatcher
                com.google.android.exoplayer2.source.MediaLoadData r2 = r0.maybeUpdateMediaLoadData(r4)
                r1.loadStarted(r3, r2)
            Lf:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0 = this;
                boolean r1 = r0.maybeUpdateEventDispatcher(r1, r2)
                if (r1 == 0) goto Lf
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.mediaSourceEventDispatcher
                com.google.android.exoplayer2.source.MediaLoadData r2 = r0.maybeUpdateMediaLoadData(r3)
                r1.upstreamDiscarded(r2)
            Lf:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MediaSourceAndListener<T> {
        public final com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller caller;
        public final com.google.android.exoplayer2.source.CompositeMediaSource<T>.ForwardingEventListener eventListener;
        public final com.google.android.exoplayer2.source.MediaSource mediaSource;

        public MediaSourceAndListener(com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r2, com.google.android.exoplayer2.source.CompositeMediaSource<T>.ForwardingEventListener r3) {
                r0 = this;
                r0.<init>()
                r0.mediaSource = r1
                r0.caller = r2
                r0.eventListener = r3
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$lU5TDdLYJk4FzgCLkUChati_nlA(com.google.android.exoplayer2.source.CompositeMediaSource r0, java.lang.Object r1, com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3) {
            r0.lambda$prepareChildSource$0(r1, r2, r3)
            return
    }

    public CompositeMediaSource() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.childSources = r0
            return
    }

    private /* synthetic */ void lambda$prepareChildSource$0(java.lang.Object r1, com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3) {
            r0 = this;
            r0.onChildSourceInfoRefreshed(r1, r2, r3)
            return
    }

    public final void disableChildSource(@com.google.android.exoplayer2.util.UnknownNull T r2) {
            r1 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r1.childSources
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r2 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r2 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r2
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r2 = r2.caller
            r0.disable(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @androidx.annotation.CallSuper
    public void disableInternal() {
            r3 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r3.childSources
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r1 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r1
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r1 = r1.caller
            r2.disable(r1)
            goto La
        L1e:
            return
    }

    public final void enableChildSource(@com.google.android.exoplayer2.util.UnknownNull T r2) {
            r1 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r1.childSources
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r2 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r2 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r2
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r2 = r2.caller
            r0.enable(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @androidx.annotation.CallSuper
    public void enableInternal() {
            r3 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r3.childSources
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r1 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r1
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r1 = r1.caller
            r2.enable(r1)
            goto La
        L1e:
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@com.google.android.exoplayer2.util.UnknownNull T r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r0 = this;
            return r2
    }

    public long getMediaTimeForChildMediaTime(@com.google.android.exoplayer2.util.UnknownNull T r1, long r2) {
            r0 = this;
            return r2
    }

    public int getWindowIndexForChildWindowIndex(@com.google.android.exoplayer2.util.UnknownNull T r1, int r2) {
            r0 = this;
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @androidx.annotation.CallSuper
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
            r2 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r2.childSources
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r1 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r1
            com.google.android.exoplayer2.source.MediaSource r1 = r1.mediaSource
            r1.maybeThrowSourceInfoRefreshError()
            goto La
        L1c:
            return
    }

    public abstract void onChildSourceInfoRefreshed(@com.google.android.exoplayer2.util.UnknownNull T r1, com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3);

    public final void prepareChildSource(@com.google.android.exoplayer2.util.UnknownNull T r5, com.google.android.exoplayer2.source.MediaSource r6) {
            r4 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r4.childSources
            boolean r0 = r0.containsKey(r5)
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.source.CompositeMediaSource$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.CompositeMediaSource$$ExternalSyntheticLambda0
            r0.<init>(r4, r5)
            com.google.android.exoplayer2.source.CompositeMediaSource$ForwardingEventListener r1 = new com.google.android.exoplayer2.source.CompositeMediaSource$ForwardingEventListener
            r1.<init>(r4, r5)
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r2 = r4.childSources
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r3 = new com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener
            r3.<init>(r6, r0, r1)
            r2.put(r5, r3)
            android.os.Handler r5 = r4.eventHandler
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            android.os.Handler r5 = (android.os.Handler) r5
            r6.addEventListener(r5, r1)
            android.os.Handler r5 = r4.eventHandler
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            android.os.Handler r5 = (android.os.Handler) r5
            r6.addDrmEventListener(r5, r1)
            com.google.android.exoplayer2.upstream.TransferListener r5 = r4.mediaTransferListener
            com.google.android.exoplayer2.analytics.PlayerId r1 = r4.getPlayerId()
            r6.prepareSource(r0, r5, r1)
            boolean r5 = r4.isEnabled()
            if (r5 != 0) goto L47
            r6.disable(r0)
        L47:
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @androidx.annotation.CallSuper
    public void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
            r0 = this;
            r0.mediaTransferListener = r1
            android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
            r0.eventHandler = r1
            return
    }

    public final void releaseChildSource(@com.google.android.exoplayer2.util.UnknownNull T r3) {
            r2 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r2.childSources
            java.lang.Object r3 = r0.remove(r3)
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r3 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r3
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r3 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r3
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r1 = r3.caller
            r0.releaseSource(r1)
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource
            com.google.android.exoplayer2.source.CompositeMediaSource<T>$ForwardingEventListener r1 = r3.eventListener
            r0.removeEventListener(r1)
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource
            com.google.android.exoplayer2.source.CompositeMediaSource<T>$ForwardingEventListener r3 = r3.eventListener
            r0.removeDrmEventListener(r3)
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @androidx.annotation.CallSuper
    public void releaseSourceInternal() {
            r4 = this;
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r4.childSources
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener r1 = (com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener) r1
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r3 = r1.caller
            r2.releaseSource(r3)
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.source.CompositeMediaSource<T>$ForwardingEventListener r3 = r1.eventListener
            r2.removeEventListener(r3)
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.source.CompositeMediaSource<T>$ForwardingEventListener r1 = r1.eventListener
            r2.removeDrmEventListener(r1)
            goto La
        L2c:
            java.util.HashMap<T, com.google.android.exoplayer2.source.CompositeMediaSource$MediaSourceAndListener<T>> r0 = r4.childSources
            r0.clear()
            return
    }
}
