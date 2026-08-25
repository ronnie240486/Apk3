package com.google.android.exoplayer2.metadata.dvbsi;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable> CREATOR = null;
    public final int controlCode;
    public final java.lang.String url;


    static {
            com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable$1 r0 = new com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable.CREATOR = r0
            return
    }

    public AppInfoTable(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.controlCode = r1
            r0.url = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
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

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1) {
            r0 = this;
            com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(r0, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Ait(controlCode="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.controlCode
            r0.append(r1)
            java.lang.String r1 = ",url="
            r0.append(r1)
            java.lang.String r1 = r3.url
            java.lang.String r2 = ")"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.url
            r1.writeString(r2)
            int r2 = r0.controlCode
            r1.writeInt(r2)
            return
    }
}
