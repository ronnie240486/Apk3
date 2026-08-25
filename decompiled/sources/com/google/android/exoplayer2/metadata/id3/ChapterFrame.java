package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.ChapterFrame> CREATOR = null;
    public static final java.lang.String ID = "CHAP";
    public final java.lang.String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final com.google.android.exoplayer2.metadata.id3.Id3Frame[] subFrames;


    static {
            com.google.android.exoplayer2.metadata.id3.ChapterFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.ChapterFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.ChapterFrame.CREATOR = r0
            return
    }

    public ChapterFrame(android.os.Parcel r5) {
            r4 = this;
            java.lang.String r0 = "CHAP"
            r4.<init>(r0)
            java.lang.String r0 = r5.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.chapterId = r0
            int r0 = r5.readInt()
            r4.startTimeMs = r0
            int r0 = r5.readInt()
            r4.endTimeMs = r0
            long r0 = r5.readLong()
            r4.startOffset = r0
            long r0 = r5.readLong()
            r4.endOffset = r0
            int r0 = r5.readInt()
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r1 = new com.google.android.exoplayer2.metadata.id3.Id3Frame[r0]
            r4.subFrames = r1
            r1 = 0
        L32:
            if (r1 >= r0) goto L47
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = r4.subFrames
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.Id3Frame> r3 = com.google.android.exoplayer2.metadata.id3.Id3Frame.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            com.google.android.exoplayer2.metadata.id3.Id3Frame r3 = (com.google.android.exoplayer2.metadata.id3.Id3Frame) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L32
        L47:
            return
    }

    public ChapterFrame(java.lang.String r2, int r3, int r4, long r5, long r7, com.google.android.exoplayer2.metadata.id3.Id3Frame[] r9) {
            r1 = this;
            java.lang.String r0 = "CHAP"
            r1.<init>(r0)
            r1.chapterId = r2
            r1.startTimeMs = r3
            r1.endTimeMs = r4
            r1.startOffset = r5
            r1.endOffset = r7
            r1.subFrames = r9
            return
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L45
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.ChapterFrame> r2 = com.google.android.exoplayer2.metadata.id3.ChapterFrame.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L45
        L10:
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r8 = (com.google.android.exoplayer2.metadata.id3.ChapterFrame) r8
            int r2 = r7.startTimeMs
            int r3 = r8.startTimeMs
            if (r2 != r3) goto L43
            int r2 = r7.endTimeMs
            int r3 = r8.endTimeMs
            if (r2 != r3) goto L43
            long r2 = r7.startOffset
            long r4 = r8.startOffset
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            long r2 = r7.endOffset
            long r4 = r8.endOffset
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            java.lang.String r2 = r7.chapterId
            java.lang.String r3 = r8.chapterId
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L43
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = r7.subFrames
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r8 = r8.subFrames
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            return r1
    }

    public com.google.android.exoplayer2.metadata.id3.Id3Frame getSubFrame(int r2) {
            r1 = this;
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r0 = r1.subFrames
            r2 = r0[r2]
            return r2
    }

    public int getSubFrameCount() {
            r1 = this;
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r0 = r1.subFrames
            int r0 = r0.length
            return r0
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.startTimeMs
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r4.endTimeMs
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.startOffset
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.endOffset
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.chapterId
            if (r0 == 0) goto L21
            int r0 = r0.hashCode()
            goto L22
        L21:
            r0 = 0
        L22:
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r6 = r4.chapterId
            r5.writeString(r6)
            int r6 = r4.startTimeMs
            r5.writeInt(r6)
            int r6 = r4.endTimeMs
            r5.writeInt(r6)
            long r0 = r4.startOffset
            r5.writeLong(r0)
            long r0 = r4.endOffset
            r5.writeLong(r0)
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r6 = r4.subFrames
            int r6 = r6.length
            r5.writeInt(r6)
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r6 = r4.subFrames
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L24:
            if (r2 >= r0) goto L2e
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto L24
        L2e:
            return
    }
}
