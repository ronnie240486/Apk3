package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes3.dex */
public final class BinaryFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.BinaryFrame> CREATOR = null;
    public final byte[] data;


    static {
            com.google.android.exoplayer2.metadata.id3.BinaryFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.BinaryFrame.CREATOR = r0
            return
    }

    public BinaryFrame(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            byte[] r2 = r2.createByteArray()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            byte[] r2 = (byte[]) r2
            r1.data = r2
            return
    }

    public BinaryFrame(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r0.data = r2
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.BinaryFrame> r2 = com.google.android.exoplayer2.metadata.id3.BinaryFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r5 = (com.google.android.exoplayer2.metadata.id3.BinaryFrame) r5
            java.lang.String r2 = r4.id
            java.lang.String r3 = r5.id
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            byte[] r2 = r4.data
            byte[] r5 = r5.data
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.id
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            byte[] r1 = r3.data
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.id
            r1.writeString(r2)
            byte[] r2 = r0.data
            r1.writeByteArray(r2)
            return
    }
}
