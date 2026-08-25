package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface Extractor {
    public static final int RESULT_CONTINUE = 0;
    public static final int RESULT_END_OF_INPUT = -1;
    public static final int RESULT_SEEK = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1);

    int read(com.google.android.exoplayer2.extractor.ExtractorInput r1, com.google.android.exoplayer2.extractor.PositionHolder r2) throws java.io.IOException;

    void release();

    void seek(long r1, long r3);

    boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException;
}
