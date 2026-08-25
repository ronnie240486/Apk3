package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public interface SampleStream {
    public static final int FLAG_OMIT_SAMPLE_DATA = 4;
    public static final int FLAG_PEEK = 1;
    public static final int FLAG_REQUIRE_FORMAT = 2;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadFlags {
    }

    boolean isReady();

    void maybeThrowError() throws java.io.IOException;

    int readData(com.google.android.exoplayer2.FormatHolder r1, com.google.android.exoplayer2.decoder.DecoderInputBuffer r2, int r3);

    int skipData(long r1);
}
