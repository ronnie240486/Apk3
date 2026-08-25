package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.MlltFrame> CREATOR = null;
    public static final java.lang.String ID = "MLLT";
    public final int bytesBetweenReference;
    public final int[] bytesDeviations;
    public final int millisecondsBetweenReference;
    public final int[] millisecondsDeviations;
    public final int mpegFramesBetweenReference;


    static {
            com.google.android.exoplayer2.metadata.id3.MlltFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.MlltFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.MlltFrame.CREATOR = r0
            return
    }

    public MlltFrame(int r2, int r3, int r4, int[] r5, int[] r6) {
            r1 = this;
            java.lang.String r0 = "MLLT"
            r1.<init>(r0)
            r1.mpegFramesBetweenReference = r2
            r1.bytesBetweenReference = r3
            r1.millisecondsBetweenReference = r4
            r1.bytesDeviations = r5
            r1.millisecondsDeviations = r6
            return
    }

    public MlltFrame(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = "MLLT"
            r1.<init>(r0)
            int r0 = r2.readInt()
            r1.mpegFramesBetweenReference = r0
            int r0 = r2.readInt()
            r1.bytesBetweenReference = r0
            int r0 = r2.readInt()
            r1.millisecondsBetweenReference = r0
            int[] r0 = r2.createIntArray()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            int[] r0 = (int[]) r0
            r1.bytesDeviations = r0
            int[] r2 = r2.createIntArray()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            int[] r2 = (int[]) r2
            r1.millisecondsDeviations = r2
            return
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.MlltFrame> r2 = com.google.android.exoplayer2.metadata.id3.MlltFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            com.google.android.exoplayer2.metadata.id3.MlltFrame r5 = (com.google.android.exoplayer2.metadata.id3.MlltFrame) r5
            int r2 = r4.mpegFramesBetweenReference
            int r3 = r5.mpegFramesBetweenReference
            if (r2 != r3) goto L39
            int r2 = r4.bytesBetweenReference
            int r3 = r5.bytesBetweenReference
            if (r2 != r3) goto L39
            int r2 = r4.millisecondsBetweenReference
            int r3 = r5.millisecondsBetweenReference
            if (r2 != r3) goto L39
            int[] r2 = r4.bytesDeviations
            int[] r3 = r5.bytesDeviations
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L39
            int[] r2 = r4.millisecondsDeviations
            int[] r5 = r5.millisecondsDeviations
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
        L3b:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.mpegFramesBetweenReference
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.bytesBetweenReference
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.millisecondsBetweenReference
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r0 = r2.bytesDeviations
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int[] r1 = r2.millisecondsDeviations
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.mpegFramesBetweenReference
            r1.writeInt(r2)
            int r2 = r0.bytesBetweenReference
            r1.writeInt(r2)
            int r2 = r0.millisecondsBetweenReference
            r1.writeInt(r2)
            int[] r2 = r0.bytesDeviations
            r1.writeIntArray(r2)
            int[] r2 = r0.millisecondsDeviations
            r1.writeIntArray(r2)
            return
    }
}
