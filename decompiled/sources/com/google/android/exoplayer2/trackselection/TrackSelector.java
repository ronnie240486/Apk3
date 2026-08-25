package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TrackSelector {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener listener;

    /* JADX INFO: loaded from: classes.dex */
    public interface InvalidationListener {
        void onTrackSelectionsInvalidated();
    }

    public TrackSelector() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.exoplayer2.upstream.BandwidthMeter getBandwidthMeter() {
            r1 = this;
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = r1.bandwidthMeter
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.upstream.BandwidthMeter r0 = (com.google.android.exoplayer2.upstream.BandwidthMeter) r0
            return r0
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters getParameters() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT
            return r0
    }

    @androidx.annotation.CallSuper
    public void init(com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener r1, com.google.android.exoplayer2.upstream.BandwidthMeter r2) {
            r0 = this;
            r0.listener = r1
            r0.bandwidthMeter = r2
            return
    }

    public final void invalidate() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.TrackSelector$InvalidationListener r0 = r1.listener
            if (r0 == 0) goto L7
            r0.onTrackSelectionsInvalidated()
        L7:
            return
    }

    public boolean isSetParametersSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void onSelectionActivated(@androidx.annotation.Nullable java.lang.Object r1);

    @androidx.annotation.CallSuper
    public void release() {
            r1 = this;
            r0 = 0
            r1.listener = r0
            r1.bandwidthMeter = r0
            return
    }

    public abstract com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks(com.google.android.exoplayer2.RendererCapabilities[] r1, com.google.android.exoplayer2.source.TrackGroupArray r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.Timeline r4) throws com.google.android.exoplayer2.ExoPlaybackException;

    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r1) {
            r0 = this;
            return
    }

    public void setParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
            r0 = this;
            return
    }
}
