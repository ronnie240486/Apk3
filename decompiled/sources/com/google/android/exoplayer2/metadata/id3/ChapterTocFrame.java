package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterTocFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.ChapterTocFrame> CREATOR = null;
    public static final java.lang.String ID = "CTOC";
    public final java.lang.String[] children;
    public final java.lang.String elementId;
    public final boolean isOrdered;
    public final boolean isRoot;
    private final com.google.android.exoplayer2.metadata.id3.Id3Frame[] subFrames;


    static {
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.CREATOR = r0
            return
    }

    public ChapterTocFrame(android.os.Parcel r5) {
            r4 = this;
            java.lang.String r0 = "CTOC"
            r4.<init>(r0)
            java.lang.String r0 = r5.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.elementId = r0
            byte r0 = r5.readByte()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r4.isRoot = r0
            byte r0 = r5.readByte()
            if (r0 == 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            r4.isOrdered = r1
            java.lang.String[] r0 = r5.createStringArray()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r4.children = r0
            int r0 = r5.readInt()
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r1 = new com.google.android.exoplayer2.metadata.id3.Id3Frame[r0]
            r4.subFrames = r1
        L3c:
            if (r2 >= r0) goto L51
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r1 = r4.subFrames
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.Id3Frame> r3 = com.google.android.exoplayer2.metadata.id3.Id3Frame.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            com.google.android.exoplayer2.metadata.id3.Id3Frame r3 = (com.google.android.exoplayer2.metadata.id3.Id3Frame) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L3c
        L51:
            return
    }

    public ChapterTocFrame(java.lang.String r2, boolean r3, boolean r4, java.lang.String[] r5, com.google.android.exoplayer2.metadata.id3.Id3Frame[] r6) {
            r1 = this;
            java.lang.String r0 = "CTOC"
            r1.<init>(r0)
            r1.elementId = r2
            r1.isRoot = r3
            r1.isOrdered = r4
            r1.children = r5
            r1.subFrames = r6
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3f
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.ChapterTocFrame> r2 = com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3f
        L10:
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r5 = (com.google.android.exoplayer2.metadata.id3.ChapterTocFrame) r5
            boolean r2 = r4.isRoot
            boolean r3 = r5.isRoot
            if (r2 != r3) goto L3d
            boolean r2 = r4.isOrdered
            boolean r3 = r5.isOrdered
            if (r2 != r3) goto L3d
            java.lang.String r2 = r4.elementId
            java.lang.String r3 = r5.elementId
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L3d
            java.lang.String[] r2 = r4.children
            java.lang.String[] r3 = r5.children
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L3d
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r2 = r4.subFrames
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r5 = r5.subFrames
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
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
            r2 = this;
            boolean r0 = r2.isRoot
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.isOrdered
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.elementId
            if (r0 == 0) goto L15
            int r0 = r0.hashCode()
            goto L16
        L15:
            r0 = 0
        L16:
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r6 = r4.elementId
            r5.writeString(r6)
            boolean r6 = r4.isRoot
            byte r6 = (byte) r6
            r5.writeByte(r6)
            boolean r6 = r4.isOrdered
            byte r6 = (byte) r6
            r5.writeByte(r6)
            java.lang.String[] r6 = r4.children
            r5.writeStringArray(r6)
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r6 = r4.subFrames
            int r6 = r6.length
            r5.writeInt(r6)
            com.google.android.exoplayer2.metadata.id3.Id3Frame[] r6 = r4.subFrames
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L21:
            if (r2 >= r0) goto L2b
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto L21
        L2b:
            return
    }
}
