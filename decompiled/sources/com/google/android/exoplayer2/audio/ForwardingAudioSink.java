package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes3.dex */
public class ForwardingAudioSink implements com.google.android.exoplayer2.audio.AudioSink {
    private final com.google.android.exoplayer2.audio.AudioSink sink;

    public ForwardingAudioSink(com.google.android.exoplayer2.audio.AudioSink r1) {
            r0 = this;
            r0.<init>()
            r0.sink = r1
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(com.google.android.exoplayer2.Format r2, int r3, @androidx.annotation.Nullable int[] r4) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.configure(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.disableTunneling()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.enableTunnelingV21()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.experimentalFlushWithoutAudioTrackRelease()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.getAudioAttributes()
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean r3) {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r2.sink
            long r0 = r0.getCurrentPositionUs(r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            int r2 = r0.getFormatSupport(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            boolean r0 = r0.getSkipSilenceEnabled()
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer r2, long r3, int r5) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            boolean r2 = r0.handleBuffer(r2, r3, r5)
            return r2
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.handleDiscontinuity()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            boolean r0 = r0.hasPendingData()
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            boolean r0 = r0.isEnded()
            return r0
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.pause()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.play()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.playToEndOfStream()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.reset()
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setAudioAttributes(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setAudioSessionId(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setAuxEffectInfo(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(com.google.android.exoplayer2.audio.AudioSink.Listener r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setOutputStreamOffsetUs(long r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setOutputStreamOffsetUs(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setPlaybackParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(@androidx.annotation.Nullable com.google.android.exoplayer2.analytics.PlayerId r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setPlayerId(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @androidx.annotation.RequiresApi(23)
    public void setPreferredDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setPreferredDevice(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setSkipSilenceEnabled(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            r0.setVolume(r2)
            return
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioSink r0 = r1.sink
            boolean r2 = r0.supportsFormat(r2)
            return r2
    }
}
