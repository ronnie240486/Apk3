package com.google.android.exoplayer2.metadata.icy;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyHeaders implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.icy.IcyHeaders> CREATOR = null;
    public static final java.lang.String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final java.lang.String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final java.lang.String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final java.lang.String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final java.lang.String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final java.lang.String RESPONSE_HEADER_NAME = "icy-name";
    private static final java.lang.String RESPONSE_HEADER_PUB = "icy-pub";
    private static final java.lang.String RESPONSE_HEADER_URL = "icy-url";
    private static final java.lang.String TAG = "IcyHeaders";
    public final int bitrate;

    @androidx.annotation.Nullable
    public final java.lang.String genre;
    public final boolean isPublic;
    public final int metadataInterval;

    @androidx.annotation.Nullable
    public final java.lang.String name;

    @androidx.annotation.Nullable
    public final java.lang.String url;


    static {
            com.google.android.exoplayer2.metadata.icy.IcyHeaders$1 r0 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.icy.IcyHeaders.CREATOR = r0
            return
    }

    public IcyHeaders(int r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, boolean r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r7 == r0) goto Lb
            if (r7 <= 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.bitrate = r2
            r1.genre = r3
            r1.name = r4
            r1.url = r5
            r1.isPublic = r6
            r1.metadataInterval = r7
            return
    }

    public IcyHeaders(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.bitrate = r0
            java.lang.String r0 = r2.readString()
            r1.genre = r0
            java.lang.String r0 = r2.readString()
            r1.name = r0
            java.lang.String r0 = r2.readString()
            r1.url = r0
            boolean r0 = com.google.android.exoplayer2.util.Util.readBoolean(r2)
            r1.isPublic = r0
            int r2 = r2.readInt()
            r1.metadataInterval = r2
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L41
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L38
            int r6 = r6 * 1000
            if (r6 <= 0) goto L21
            r1 = 1
            goto L3f
        L21:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L39
            r7.<init>()     // Catch: java.lang.NumberFormatException -> L39
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch: java.lang.NumberFormatException -> L39
            r7.append(r1)     // Catch: java.lang.NumberFormatException -> L39
            java.lang.String r7 = r7.toString()     // Catch: java.lang.NumberFormatException -> L39
            com.google.android.exoplayer2.util.Log.w(r2, r7)     // Catch: java.lang.NumberFormatException -> L39
            r1 = 0
            r6 = -1
            goto L3f
        L38:
            r6 = -1
        L39:
            java.lang.String r7 = "Invalid bitrate header: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r7, r1, r2)
            r1 = 0
        L3f:
            r7 = r6
            goto L44
        L41:
            r1 = 0
            r6 = -1
            r7 = -1
        L44:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L59
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            r9 = r1
            r1 = 1
            goto L5a
        L59:
            r9 = r8
        L5a:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L6e
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            r10 = r1
            r1 = 1
            goto L6f
        L6e:
            r10 = r8
        L6f:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L83
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 1
            r11 = r1
            r1 = 1
            goto L84
        L83:
            r11 = r8
        L84:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L9e
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r6 = 1
            r12 = r1
            r1 = 1
            goto La0
        L9e:
            r6 = 0
            r12 = 0
        La0:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto Ld1
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.NumberFormatException -> Lce
            if (r5 <= 0) goto Lb8
            r3 = r5
            goto Lcb
        Lb8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lcd
            r4.<init>()     // Catch: java.lang.NumberFormatException -> Lcd
            r4.append(r0)     // Catch: java.lang.NumberFormatException -> Lcd
            r4.append(r13)     // Catch: java.lang.NumberFormatException -> Lcd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lcd
            com.google.android.exoplayer2.util.Log.w(r2, r4)     // Catch: java.lang.NumberFormatException -> Lcd
            r4 = r1
        Lcb:
            r1 = r4
            goto Ld1
        Lcd:
            r3 = r5
        Lce:
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m27m(r0, r13, r2)
        Ld1:
            if (r1 == 0) goto Ldf
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r13 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        Ldf:
            return r8
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
            if (r5 == 0) goto L45
            java.lang.Class<com.google.android.exoplayer2.metadata.icy.IcyHeaders> r2 = com.google.android.exoplayer2.metadata.icy.IcyHeaders.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L45
        L10:
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r5 = (com.google.android.exoplayer2.metadata.icy.IcyHeaders) r5
            int r2 = r4.bitrate
            int r3 = r5.bitrate
            if (r2 != r3) goto L43
            java.lang.String r2 = r4.genre
            java.lang.String r3 = r5.genre
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.name
            java.lang.String r3 = r5.name
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.url
            java.lang.String r3 = r5.url
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L43
            boolean r2 = r4.isPublic
            boolean r3 = r5.isPublic
            if (r2 != r3) goto L43
            int r2 = r4.metadataInterval
            int r5 = r5.metadataInterval
            if (r2 != r5) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
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
            int r0 = r3.bitrate
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.genre
            r2 = 0
            if (r0 == 0) goto L11
            int r0 = r0.hashCode()
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.name
            if (r0 == 0) goto L1e
            int r0 = r0.hashCode()
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.url
            if (r0 == 0) goto L2a
            int r2 = r0.hashCode()
        L2a:
            int r1 = r1 + r2
            int r1 = r1 * 31
            boolean r0 = r3.isPublic
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.metadataInterval
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r2) {
            r1 = this;
            java.lang.String r0 = r1.name
            if (r0 == 0) goto L7
            r2.setStation(r0)
        L7:
            java.lang.String r0 = r1.genre
            if (r0 == 0) goto Le
            r2.setGenre(r0)
        Le:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "IcyHeaders: name=\""
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "\", genre=\""
            r0.append(r1)
            java.lang.String r1 = r2.genre
            r0.append(r1)
            java.lang.String r1 = "\", bitrate="
            r0.append(r1)
            int r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = ", metadataInterval="
            r0.append(r1)
            int r1 = r2.metadataInterval
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.bitrate
            r1.writeInt(r2)
            java.lang.String r2 = r0.genre
            r1.writeString(r2)
            java.lang.String r2 = r0.name
            r1.writeString(r2)
            java.lang.String r2 = r0.url
            r1.writeString(r2)
            boolean r2 = r0.isPublic
            com.google.android.exoplayer2.util.Util.writeBoolean(r1, r2)
            int r2 = r0.metadataInterval
            r1.writeInt(r2)
            return
    }
}
