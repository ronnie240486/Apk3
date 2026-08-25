package com.google.android.exoplayer2.extractor.mkv;

/* JADX INFO: loaded from: classes2.dex */
public interface EbmlProcessor {
    public static final int ELEMENT_TYPE_BINARY = 4;
    public static final int ELEMENT_TYPE_FLOAT = 5;
    public static final int ELEMENT_TYPE_MASTER = 1;
    public static final int ELEMENT_TYPE_STRING = 3;
    public static final int ELEMENT_TYPE_UNKNOWN = 0;
    public static final int ELEMENT_TYPE_UNSIGNED_INT = 2;

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    void binaryElement(int r1, int r2, com.google.android.exoplayer2.extractor.ExtractorInput r3) throws java.io.IOException;

    void endMasterElement(int r1) throws com.google.android.exoplayer2.ParserException;

    void floatElement(int r1, double r2) throws com.google.android.exoplayer2.ParserException;

    int getElementType(int r1);

    void integerElement(int r1, long r2) throws com.google.android.exoplayer2.ParserException;

    boolean isLevel1Element(int r1);

    void startMasterElement(int r1, long r2, long r4) throws com.google.android.exoplayer2.ParserException;

    void stringElement(int r1, java.lang.String r2) throws com.google.android.exoplayer2.ParserException;
}
