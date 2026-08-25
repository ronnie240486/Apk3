package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.GeobFrame> CREATOR = null;
    public static final java.lang.String ID = "GEOB";
    public final byte[] data;
    public final java.lang.String description;
    public final java.lang.String filename;
    public final java.lang.String mimeType;


    static {
            com.google.android.exoplayer2.metadata.id3.GeobFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.GeobFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.GeobFrame.CREATOR = r0
            return
    }

    public GeobFrame(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = "GEOB"
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.mimeType = r0
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.filename = r0
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.description = r0
            byte[] r2 = r2.createByteArray()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            byte[] r2 = (byte[]) r2
            r1.data = r2
            return
    }

    public GeobFrame(java.lang.String r2, java.lang.String r3, java.lang.String r4, byte[] r5) {
            r1 = this;
            java.lang.String r0 = "GEOB"
            r1.<init>(r0)
            r1.mimeType = r2
            r1.filename = r3
            r1.description = r4
            r1.data = r5
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.GeobFrame> r2 = com.google.android.exoplayer2.metadata.id3.GeobFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r5 = (com.google.android.exoplayer2.metadata.id3.GeobFrame) r5
            java.lang.String r2 = r4.mimeType
            java.lang.String r3 = r5.mimeType
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L3b
            java.lang.String r2 = r4.filename
            java.lang.String r3 = r5.filename
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L3b
            java.lang.String r2 = r4.description
            java.lang.String r3 = r5.description
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L3b
            byte[] r2 = r4.data
            byte[] r5 = r5.data
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L3b
            goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
        L3d:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.mimeType
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.filename
            if (r0 == 0) goto L19
            int r0 = r0.hashCode()
            goto L1a
        L19:
            r0 = 0
        L1a:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.description
            if (r0 == 0) goto L25
            int r1 = r0.hashCode()
        L25:
            int r2 = r2 + r1
            int r2 = r2 * 31
            byte[] r0 = r3.data
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ": mimeType="
            r0.append(r1)
            java.lang.String r1 = r2.mimeType
            r0.append(r1)
            java.lang.String r1 = ", filename="
            r0.append(r1)
            java.lang.String r1 = r2.filename
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r2.description
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.mimeType
            r1.writeString(r2)
            java.lang.String r2 = r0.filename
            r1.writeString(r2)
            java.lang.String r2 = r0.description
            r1.writeString(r2)
            byte[] r2 = r0.data
            r1.writeByteArray(r2)
            return
    }
}
