package com.google.android.exoplayer2.metadata.flac;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.flac.PictureFrame> CREATOR = null;
    public final int colors;
    public final int depth;
    public final java.lang.String description;
    public final int height;
    public final java.lang.String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;


    static {
            com.google.android.exoplayer2.metadata.flac.PictureFrame$1 r0 = new com.google.android.exoplayer2.metadata.flac.PictureFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.flac.PictureFrame.CREATOR = r0
            return
    }

    public PictureFrame(int r1, java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, int r7, byte[] r8) {
            r0 = this;
            r0.<init>()
            r0.pictureType = r1
            r0.mimeType = r2
            r0.description = r3
            r0.width = r4
            r0.height = r5
            r0.depth = r6
            r0.colors = r7
            r0.pictureData = r8
            return
    }

    public PictureFrame(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.pictureType = r0
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.mimeType = r0
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.description = r0
            int r0 = r2.readInt()
            r1.width = r0
            int r0 = r2.readInt()
            r1.height = r0
            int r0 = r2.readInt()
            r1.depth = r0
            int r0 = r2.readInt()
            r1.colors = r0
            byte[] r2 = r2.createByteArray()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            byte[] r2 = (byte[]) r2
            r1.pictureData = r2
            return
    }

    public static com.google.android.exoplayer2.metadata.flac.PictureFrame fromPictureBlock(com.google.android.exoplayer2.util.ParsableByteArray r10) {
            int r1 = r10.readInt()
            int r0 = r10.readInt()
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.US_ASCII
            java.lang.String r2 = r10.readString(r0, r2)
            int r0 = r10.readInt()
            java.lang.String r3 = r10.readString(r0)
            int r4 = r10.readInt()
            int r5 = r10.readInt()
            int r6 = r10.readInt()
            int r7 = r10.readInt()
            int r0 = r10.readInt()
            byte[] r8 = new byte[r0]
            r9 = 0
            r10.readBytes(r8, r9, r0)
            com.google.android.exoplayer2.metadata.flac.PictureFrame r10 = new com.google.android.exoplayer2.metadata.flac.PictureFrame
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable
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
            if (r5 == 0) goto L51
            java.lang.Class<com.google.android.exoplayer2.metadata.flac.PictureFrame> r2 = com.google.android.exoplayer2.metadata.flac.PictureFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L51
        L10:
            com.google.android.exoplayer2.metadata.flac.PictureFrame r5 = (com.google.android.exoplayer2.metadata.flac.PictureFrame) r5
            int r2 = r4.pictureType
            int r3 = r5.pictureType
            if (r2 != r3) goto L4f
            java.lang.String r2 = r4.mimeType
            java.lang.String r3 = r5.mimeType
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            java.lang.String r2 = r4.description
            java.lang.String r3 = r5.description
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            int r2 = r4.width
            int r3 = r5.width
            if (r2 != r3) goto L4f
            int r2 = r4.height
            int r3 = r5.height
            if (r2 != r3) goto L4f
            int r2 = r4.depth
            int r3 = r5.depth
            if (r2 != r3) goto L4f
            int r2 = r4.colors
            int r3 = r5.colors
            if (r2 != r3) goto L4f
            byte[] r2 = r4.pictureData
            byte[] r5 = r5.pictureData
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            return r0
        L51:
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
            r1 = this;
            byte[] r0 = com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataBytes(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
            r1 = this;
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataFormat(r1)
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.pictureType
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.lang.String r1 = r3.mimeType
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            java.lang.String r1 = r3.description
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            int r1 = r3.width
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.height
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.depth
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.colors
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r3.pictureData
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r3) {
            r2 = this;
            byte[] r0 = r2.pictureData
            int r1 = r2.pictureType
            r3.maybeSetArtworkData(r0, r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Picture: mimeType="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.mimeType
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
            int r2 = r0.pictureType
            r1.writeInt(r2)
            java.lang.String r2 = r0.mimeType
            r1.writeString(r2)
            java.lang.String r2 = r0.description
            r1.writeString(r2)
            int r2 = r0.width
            r1.writeInt(r2)
            int r2 = r0.height
            r1.writeInt(r2)
            int r2 = r0.depth
            r1.writeInt(r2)
            int r2 = r0.colors
            r1.writeInt(r2)
            byte[] r2 = r0.pictureData
            r1.writeByteArray(r2)
            return
    }
}
