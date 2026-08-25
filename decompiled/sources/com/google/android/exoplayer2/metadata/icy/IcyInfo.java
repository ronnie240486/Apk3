package com.google.android.exoplayer2.metadata.icy;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyInfo implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.icy.IcyInfo> CREATOR = null;
    public final byte[] rawMetadata;

    @androidx.annotation.Nullable
    public final java.lang.String title;

    @androidx.annotation.Nullable
    public final java.lang.String url;


    static {
            com.google.android.exoplayer2.metadata.icy.IcyInfo$1 r0 = new com.google.android.exoplayer2.metadata.icy.IcyInfo$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.icy.IcyInfo.CREATOR = r0
            return
    }

    public IcyInfo(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = r2.createByteArray()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            byte[] r0 = (byte[]) r0
            r1.rawMetadata = r0
            java.lang.String r0 = r2.readString()
            r1.title = r0
            java.lang.String r2 = r2.readString()
            r1.url = r2
            return
    }

    public IcyInfo(byte[] r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.rawMetadata = r1
            r0.title = r2
            r0.url = r3
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.google.android.exoplayer2.metadata.icy.IcyInfo> r0 = com.google.android.exoplayer2.metadata.icy.IcyInfo.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.google.android.exoplayer2.metadata.icy.IcyInfo r3 = (com.google.android.exoplayer2.metadata.icy.IcyInfo) r3
            byte[] r0 = r2.rawMetadata
            byte[] r3 = r3.rawMetadata
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
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
            r1 = this;
            byte[] r0 = r1.rawMetadata
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r2) {
            r1 = this;
            java.lang.String r0 = r1.title
            if (r0 == 0) goto L7
            r2.setTitle(r0)
        L7:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.title
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.url
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.rawMetadata
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\""
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            byte[] r2 = r0.rawMetadata
            r1.writeByteArray(r2)
            java.lang.String r2 = r0.title
            r1.writeString(r2)
            java.lang.String r2 = r0.url
            r1.writeString(r2)
            return
    }
}
