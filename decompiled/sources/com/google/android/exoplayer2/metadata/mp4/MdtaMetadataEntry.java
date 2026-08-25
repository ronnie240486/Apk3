package com.google.android.exoplayer2.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry> CREATOR = null;
    public static final java.lang.String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public final java.lang.String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;


    static {
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$1 r0 = new com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry.CREATOR = r0
            return
    }

    private MdtaMetadataEntry(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.key = r0
            byte[] r0 = r2.createByteArray()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            byte[] r0 = (byte[]) r0
            r1.value = r0
            int r0 = r2.readInt()
            r1.localeIndicator = r0
            int r2 = r2.readInt()
            r1.typeIndicator = r2
            return
    }

    public /* synthetic */ MdtaMetadataEntry(android.os.Parcel r1, com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MdtaMetadataEntry(java.lang.String r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            r0.localeIndicator = r3
            r0.typeIndicator = r4
            return
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
            if (r5 == 0) goto L35
            java.lang.Class<com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry> r2 = com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L35
        L10:
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r5 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r5
            java.lang.String r2 = r4.key
            java.lang.String r3 = r5.key
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            byte[] r2 = r4.value
            byte[] r3 = r5.value
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L33
            int r2 = r4.localeIndicator
            int r3 = r5.localeIndicator
            if (r2 != r3) goto L33
            int r2 = r4.typeIndicator
            int r5 = r5.typeIndicator
            if (r2 != r5) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
        L35:
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
            java.lang.String r0 = r3.key
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            byte[] r1 = r3.value
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.localeIndicator
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.typeIndicator
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1) {
            r0 = this;
            com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(r0, r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "mdta: key="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.key
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.key
            r1.writeString(r2)
            byte[] r2 = r0.value
            r1.writeByteArray(r2)
            int r2 = r0.localeIndicator
            r1.writeInt(r2)
            int r2 = r0.typeIndicator
            r1.writeInt(r2)
            return
    }
}
