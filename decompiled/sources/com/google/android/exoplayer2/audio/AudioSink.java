package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioSink$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setOutputStreamOffsetUs(com.google.android.exoplayer2.audio.AudioSink r0, long r1) {
                return
        }

        public static void $default$setPlayerId(com.google.android.exoplayer2.audio.AudioSink r0, @androidx.annotation.Nullable com.google.android.exoplayer2.analytics.PlayerId r1) {
                return
        }

        @androidx.annotation.RequiresApi(23)
        public static void $default$setPreferredDevice(com.google.android.exoplayer2.audio.AudioSink r0, @androidx.annotation.Nullable android.media.AudioDeviceInfo r1) {
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ConfigurationException extends java.lang.Exception {
        public final com.google.android.exoplayer2.Format format;

        public ConfigurationException(java.lang.String r1, com.google.android.exoplayer2.Format r2) {
                r0 = this;
                r0.<init>(r1)
                r0.format = r2
                return
        }

        public ConfigurationException(java.lang.Throwable r1, com.google.android.exoplayer2.Format r2) {
                r0 = this;
                r0.<init>(r1)
                r0.format = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class InitializationException extends java.lang.Exception {
        public final int audioTrackState;
        public final com.google.android.exoplayer2.Format format;
        public final boolean isRecoverable;

        public InitializationException(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.Format r8, boolean r9, @androidx.annotation.Nullable java.lang.Exception r10) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.audioTrackState = r4
                r3.isRecoverable = r9
                r3.format = r8
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Listener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioSink$Listener$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            public static void $default$onAudioSinkError(com.google.android.exoplayer2.audio.AudioSink.Listener r0, java.lang.Exception r1) {
                    return
            }

            public static void $default$onOffloadBufferEmptying(com.google.android.exoplayer2.audio.AudioSink.Listener r0) {
                    return
            }

            public static void $default$onOffloadBufferFull(com.google.android.exoplayer2.audio.AudioSink.Listener r0) {
                    return
            }

            public static void $default$onPositionAdvancing(com.google.android.exoplayer2.audio.AudioSink.Listener r0, long r1) {
                    return
            }
        }

        void onAudioSinkError(java.lang.Exception r1);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long r1);

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean r1);

        void onUnderrun(int r1, long r2, long r4);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class UnexpectedDiscontinuityException extends java.lang.Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long r3, long r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = ", got "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.actualPresentationTimeUs = r3
                r2.expectedPresentationTimeUs = r5
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WriteException extends java.lang.Exception {
        public final int errorCode;
        public final com.google.android.exoplayer2.Format format;
        public final boolean isRecoverable;

        public WriteException(int r2, com.google.android.exoplayer2.Format r3, boolean r4) {
                r1 = this;
                java.lang.String r0 = "AudioTrack write failed: "
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
                r1.<init>(r0)
                r1.isRecoverable = r4
                r1.errorCode = r2
                r1.format = r3
                return
        }
    }

    void configure(com.google.android.exoplayer2.Format r1, int r2, @androidx.annotation.Nullable int[] r3) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void experimentalFlushWithoutAudioTrackRelease();

    void flush();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes();

    long getCurrentPositionUs(boolean r1);

    int getFormatSupport(com.google.android.exoplayer2.Format r1);

    com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(java.nio.ByteBuffer r1, long r2, int r4) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException;

    void reset();

    void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r1);

    void setAudioSessionId(int r1);

    void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r1);

    void setListener(com.google.android.exoplayer2.audio.AudioSink.Listener r1);

    void setOutputStreamOffsetUs(long r1);

    void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r1);

    void setPlayerId(@androidx.annotation.Nullable com.google.android.exoplayer2.analytics.PlayerId r1);

    @androidx.annotation.RequiresApi(23)
    void setPreferredDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r1);

    void setSkipSilenceEnabled(boolean r1);

    void setVolume(float r1);

    boolean supportsFormat(com.google.android.exoplayer2.Format r1);
}
