package com.google.android.exoplayer2.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry> CREATOR = null;
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;


    static {
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$1 r0 = new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry.CREATOR = r0
            return
    }

    public SmtaMetadataEntry(float r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.captureFrameRate = r1
            r0.svcTemporalLayerCount = r2
            return
    }

    private SmtaMetadataEntry(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            float r0 = r2.readFloat()
            r1.captureFrameRate = r0
            int r2 = r2.readInt()
            r1.svcTemporalLayerCount = r2
            return
    }

    public /* synthetic */ SmtaMetadataEntry(android.os.Parcel r1, com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
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
            if (r5 == 0) goto L23
            java.lang.Class<com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry> r2 = com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry r5 = (com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry) r5
            float r2 = r4.captureFrameRate
            float r3 = r5.captureFrameRate
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L21
            int r2 = r4.svcTemporalLayerCount
            int r5 = r5.svcTemporalLayerCount
            if (r2 != r5) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        L23:
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
            r2 = this;
            float r0 = r2.captureFrameRate
            int r0 = com.google.common.primitives.Floats.hashCode(r0)
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r2.svcTemporalLayerCount
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1) {
            r0 = this;
            com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(r0, r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "smta: captureFrameRate="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            float r1 = r2.captureFrameRate
            r0.append(r1)
            java.lang.String r1 = ", svcTemporalLayerCount="
            r0.append(r1)
            int r1 = r2.svcTemporalLayerCount
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.captureFrameRate
            r1.writeFloat(r2)
            int r2 = r0.svcTemporalLayerCount
            r1.writeInt(r2)
            return
    }
}
