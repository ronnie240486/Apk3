package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.PrivFrame> CREATOR = null;
    public static final java.lang.String ID = "PRIV";
    public final java.lang.String owner;
    public final byte[] privateData;


    static {
            com.google.android.exoplayer2.metadata.id3.PrivFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.PrivFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.PrivFrame.CREATOR = r0
            return
    }

    public PrivFrame(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = "PRIV"
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.owner = r0
            byte[] r2 = r2.createByteArray()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            byte[] r2 = (byte[]) r2
            r1.privateData = r2
            return
    }

    public PrivFrame(java.lang.String r2, byte[] r3) {
            r1 = this;
            java.lang.String r0 = "PRIV"
            r1.<init>(r0)
            r1.owner = r2
            r1.privateData = r3
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
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.PrivFrame> r2 = com.google.android.exoplayer2.metadata.id3.PrivFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.exoplayer2.metadata.id3.PrivFrame r5 = (com.google.android.exoplayer2.metadata.id3.PrivFrame) r5
            java.lang.String r2 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L27
            byte[] r2 = r4.privateData
            byte[] r5 = r5.privateData
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
            r2 = this;
            java.lang.String r0 = r2.owner
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            byte[] r0 = r2.privateData
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ": owner="
            r0.append(r1)
            java.lang.String r1 = r2.owner
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.owner
            r1.writeString(r2)
            byte[] r2 = r0.privateData
            r1.writeByteArray(r2)
            return
    }
}
