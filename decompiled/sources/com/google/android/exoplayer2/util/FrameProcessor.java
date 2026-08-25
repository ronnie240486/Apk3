package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public interface FrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final long RELEASE_OUTPUT_FRAME_IMMEDIATELY = -1;

    public interface Factory {
        com.google.android.exoplayer2.util.FrameProcessor create(android.content.Context r1, com.google.android.exoplayer2.util.FrameProcessor.Listener r2, java.util.List<com.google.android.exoplayer2.util.Effect> r3, com.google.android.exoplayer2.util.DebugViewProvider r4, com.google.android.exoplayer2.video.ColorInfo r5, boolean r6) throws com.google.android.exoplayer2.util.FrameProcessingException;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Listener {
        void onFrameProcessingEnded();

        void onFrameProcessingError(com.google.android.exoplayer2.util.FrameProcessingException r1);

        void onOutputFrameAvailable(long r1);

        void onOutputSizeChanged(int r1, int r2);
    }

    android.view.Surface getInputSurface();

    int getPendingInputFrameCount();

    void registerInputFrame();

    void release();

    void releaseOutputFrame(long r1);

    void setInputFrameInfo(com.google.android.exoplayer2.util.FrameInfo r1);

    void setOutputSurfaceInfo(@androidx.annotation.Nullable com.google.android.exoplayer2.util.SurfaceInfo r1);

    void signalEndOfInput();
}
