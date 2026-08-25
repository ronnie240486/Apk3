package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlLinkFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.UrlLinkFrame> CREATOR = null;

    @androidx.annotation.Nullable
    public final java.lang.String description;
    public final java.lang.String url;


    static {
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.CREATOR = r0
            return
    }

    public UrlLinkFrame(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = r2.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            r1.description = r0
            java.lang.String r2 = r2.readString()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.url = r2
            return
    }

    public UrlLinkFrame(java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.description = r2
            r0.url = r3
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.UrlLinkFrame> r2 = com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r5 = (com.google.android.exoplayer2.metadata.id3.UrlLinkFrame) r5
            java.lang.String r2 = r4.id
            java.lang.String r3 = r5.id
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.description
            java.lang.String r3 = r5.description
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.url
            java.lang.String r5 = r5.url
            boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r2, r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.id
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            java.lang.String r1 = r3.description
            r2 = 0
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = 0
        L15:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.url
            if (r1 == 0) goto L20
            int r2 = r1.hashCode()
        L20:
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
            java.lang.String r1 = ": url="
            r0.append(r1)
            java.lang.String r1 = r2.url
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.id
            r1.writeString(r2)
            java.lang.String r2 = r0.description
            r1.writeString(r2)
            java.lang.String r2 = r0.url
            r1.writeString(r2)
            return
    }
}
