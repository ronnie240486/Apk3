package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public interface Renderer extends com.google.android.exoplayer2.PlayerMessage.Target {
    public static final int MSG_CUSTOM_BASE = 10000;
    public static final int MSG_SET_AUDIO_ATTRIBUTES = 3;
    public static final int MSG_SET_AUDIO_SESSION_ID = 10;
    public static final int MSG_SET_AUX_EFFECT_INFO = 6;
    public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
    public static final int MSG_SET_CHANGE_FRAME_RATE_STRATEGY = 5;
    public static final int MSG_SET_PREFERRED_AUDIO_DEVICE = 12;
    public static final int MSG_SET_SCALING_MODE = 4;
    public static final int MSG_SET_SKIP_SILENCE_ENABLED = 9;
    public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
    public static final int MSG_SET_VIDEO_OUTPUT = 1;
    public static final int MSG_SET_VOLUME = 2;
    public static final int MSG_SET_WAKEUP_LISTENER = 11;
    public static final int STATE_DISABLED = 0;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_STARTED = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.Renderer$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$setPlaybackSpeed(com.google.android.exoplayer2.Renderer r0, float r1, float r2) throws com.google.android.exoplayer2.ExoPlaybackException {
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface WakeupListener {
        void onSleep();

        void onWakeup();
    }

    void disable();

    void enable(com.google.android.exoplayer2.RendererConfiguration r1, com.google.android.exoplayer2.Format[] r2, com.google.android.exoplayer2.source.SampleStream r3, long r4, boolean r6, boolean r7, long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException;

    com.google.android.exoplayer2.RendererCapabilities getCapabilities();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.util.MediaClock getMediaClock();

    java.lang.String getName();

    long getReadingPositionUs();

    int getState();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.source.SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int r1, com.google.android.exoplayer2.analytics.PlayerId r2);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws java.io.IOException;

    void render(long r1, long r3) throws com.google.android.exoplayer2.ExoPlaybackException;

    void replaceStream(com.google.android.exoplayer2.Format[] r1, com.google.android.exoplayer2.source.SampleStream r2, long r3, long r5) throws com.google.android.exoplayer2.ExoPlaybackException;

    void reset();

    void resetPosition(long r1) throws com.google.android.exoplayer2.ExoPlaybackException;

    void setCurrentStreamFinal();

    void setPlaybackSpeed(float r1, float r2) throws com.google.android.exoplayer2.ExoPlaybackException;

    void start() throws com.google.android.exoplayer2.ExoPlaybackException;

    void stop();
}
