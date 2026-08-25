package com.google.android.exoplayer2.metadata.flac;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class VorbisComment implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.flac.VorbisComment> CREATOR = null;
    public final java.lang.String key;
    public final java.lang.String value;


    static {
            com.google.android.exoplayer2.metadata.flac.VorbisComment$1 r0 = new com.google.android.exoplayer2.metadata.flac.VorbisComment$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.flac.VorbisComment.CREATOR = r0
            return
    }

    public VorbisComment(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.key = r0
            java.lang.String r2 = r2.readString()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.value = r2
            return
    }

    public VorbisComment(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
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
            if (r5 == 0) goto L2b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2b
        L12:
            com.google.android.exoplayer2.metadata.flac.VorbisComment r5 = (com.google.android.exoplayer2.metadata.flac.VorbisComment) r5
            java.lang.String r2 = r4.key
            java.lang.String r3 = r5.key
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.lang.String r2 = r4.value
            java.lang.String r5 = r5.value
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
        L2b:
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
            java.lang.String r1 = r3.value
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r4) {
            r3 = this;
            java.lang.String r0 = r3.key
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case 62359119: goto L3a;
                case 79833656: goto L2f;
                case 428414940: goto L24;
                case 1746739798: goto L19;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L44
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L44
        L17:
            r2 = 4
            goto L44
        L19:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L44
        L22:
            r2 = 3
            goto L44
        L24:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L44
        L2d:
            r2 = 2
            goto L44
        L2f:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L44
        L38:
            r2 = 1
            goto L44
        L3a:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L44
        L43:
            r2 = 0
        L44:
            switch(r2) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto L54;
                case 3: goto L4e;
                case 4: goto L48;
                default: goto L47;
            }
        L47:
            goto L65
        L48:
            java.lang.String r0 = r3.value
            r4.setArtist(r0)
            goto L65
        L4e:
            java.lang.String r0 = r3.value
            r4.setAlbumArtist(r0)
            goto L65
        L54:
            java.lang.String r0 = r3.value
            r4.setDescription(r0)
            goto L65
        L5a:
            java.lang.String r0 = r3.value
            r4.setTitle(r0)
            goto L65
        L60:
            java.lang.String r0 = r3.value
            r4.setAlbumTitle(r0)
        L65:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "VC: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.key
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.String r1 = r2.value
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.key
            r1.writeString(r2)
            java.lang.String r2 = r0.value
            r1.writeString(r2)
            return
    }
}
