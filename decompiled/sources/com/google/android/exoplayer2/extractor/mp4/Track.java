package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
public final class Track {
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final long durationUs;

    @androidx.annotation.Nullable
    public final long[] editListDurations;

    @androidx.annotation.Nullable
    public final long[] editListMediaTimes;
    public final com.google.android.exoplayer2.Format format;
    public final int id;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;
    public final int type;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int r1, int r2, long r3, long r5, long r7, com.google.android.exoplayer2.Format r9, int r10, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r11, int r12, @androidx.annotation.Nullable long[] r13, @androidx.annotation.Nullable long[] r14) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.type = r2
            r0.timescale = r3
            r0.movieTimescale = r5
            r0.durationUs = r7
            r0.format = r9
            r0.sampleTransformation = r10
            r0.sampleDescriptionEncryptionBoxes = r11
            r0.nalUnitLengthFieldLength = r12
            r0.editListDurations = r13
            r0.editListMediaTimes = r14
            return
    }

    public com.google.android.exoplayer2.extractor.mp4.Track copyWithFormat(com.google.android.exoplayer2.Format r18) {
            r17 = this;
            r0 = r17
            com.google.android.exoplayer2.extractor.mp4.Track r16 = new com.google.android.exoplayer2.extractor.mp4.Track
            int r2 = r0.id
            int r3 = r0.type
            long r4 = r0.timescale
            long r6 = r0.movieTimescale
            long r8 = r0.durationUs
            int r11 = r0.sampleTransformation
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r12 = r0.sampleDescriptionEncryptionBoxes
            int r13 = r0.nalUnitLengthFieldLength
            long[] r14 = r0.editListDurations
            long[] r15 = r0.editListMediaTimes
            r1 = r16
            r10 = r18
            r1.<init>(r2, r3, r4, r6, r8, r10, r11, r12, r13, r14, r15)
            return r16
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox getSampleDescriptionEncryptionBox(int r2) {
            r1 = this;
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r0 = r1.sampleDescriptionEncryptionBoxes
            if (r0 != 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = r0[r2]
        L8:
            return r2
    }
}
