package com.bumptech.glide.gifdecoder;

/* JADX INFO: loaded from: classes2.dex */
public class GifHeader {
    public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
    public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;

    @androidx.annotation.ColorInt
    public int bgColor;
    public int bgIndex;
    public com.bumptech.glide.gifdecoder.GifFrame currentFrame;
    public int frameCount;
    public final java.util.List<com.bumptech.glide.gifdecoder.GifFrame> frames;

    @androidx.annotation.ColorInt
    public int[] gct;
    public boolean gctFlag;
    public int gctSize;
    public int height;
    public int loopCount;
    public int status;
    public int width;

    public GifHeader() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.gct = r0
            r0 = 0
            r1.status = r0
            r1.frameCount = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.frames = r0
            r0 = -1
            r1.loopCount = r0
            return
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getNumFrames() {
            r1 = this;
            int r0 = r1.frameCount
            return r0
    }

    public int getStatus() {
            r1 = this;
            int r0 = r1.status
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }
}
