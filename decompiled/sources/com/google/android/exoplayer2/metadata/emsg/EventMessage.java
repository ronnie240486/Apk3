package com.google.android.exoplayer2.metadata.emsg;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.emsg.EventMessage> CREATOR = null;
    private static final com.google.android.exoplayer2.Format ID3_FORMAT = null;

    @androidx.annotation.VisibleForTesting
    public static final java.lang.String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final java.lang.String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    private static final com.google.android.exoplayer2.Format SCTE35_FORMAT = null;

    @androidx.annotation.VisibleForTesting
    public static final java.lang.String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;


    static {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "application/id3"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.metadata.emsg.EventMessage.ID3_FORMAT = r0
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "application/x-scte35"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.metadata.emsg.EventMessage.SCTE35_FORMAT = r0
            com.google.android.exoplayer2.metadata.emsg.EventMessage$1 r0 = new com.google.android.exoplayer2.metadata.emsg.EventMessage$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.emsg.EventMessage.CREATOR = r0
            return
    }

    public EventMessage(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.schemeIdUri = r0
            java.lang.String r0 = r3.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.value = r0
            long r0 = r3.readLong()
            r2.durationMs = r0
            long r0 = r3.readLong()
            r2.id = r0
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            byte[] r3 = (byte[]) r3
            r2.messageData = r3
            return
    }

    public EventMessage(java.lang.String r1, java.lang.String r2, long r3, long r5, byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.schemeIdUri = r1
            r0.value = r2
            r0.durationMs = r3
            r0.id = r5
            r0.messageData = r7
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L43
            java.lang.Class<com.google.android.exoplayer2.metadata.emsg.EventMessage> r2 = com.google.android.exoplayer2.metadata.emsg.EventMessage.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L43
        L10:
            com.google.android.exoplayer2.metadata.emsg.EventMessage r8 = (com.google.android.exoplayer2.metadata.emsg.EventMessage) r8
            long r2 = r7.durationMs
            long r4 = r8.durationMs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L41
            long r2 = r7.id
            long r4 = r8.id
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L41
            java.lang.String r2 = r7.schemeIdUri
            java.lang.String r3 = r8.schemeIdUri
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = r7.value
            java.lang.String r3 = r8.value
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L41
            byte[] r2 = r7.messageData
            byte[] r8 = r8.messageData
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
        L43:
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @androidx.annotation.Nullable
    public byte[] getWrappedMetadataBytes() {
            r1 = this;
            com.google.android.exoplayer2.Format r0 = r1.getWrappedMetadataFormat()
            if (r0 == 0) goto L9
            byte[] r0 = r1.messageData
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
            r3 = this;
            java.lang.String r0 = r3.schemeIdUri
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1468477611: goto L24;
                case -795945609: goto L19;
                case 1303648457: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2f
        Le:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L2f
        L17:
            r2 = 2
            goto L2f
        L19:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L2f
        L22:
            r2 = 1
            goto L2f
        L24:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            switch(r2) {
                case 0: goto L37;
                case 1: goto L34;
                case 2: goto L34;
                default: goto L32;
            }
        L32:
            r0 = 0
            return r0
        L34:
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.metadata.emsg.EventMessage.ID3_FORMAT
            return r0
        L37:
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.metadata.emsg.EventMessage.SCTE35_FORMAT
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.hashCode
            if (r0 != 0) goto L3c
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r1 = r6.schemeIdUri
            r2 = 0
            if (r1 == 0) goto L10
            int r1 = r1.hashCode()
            goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.value
            if (r1 == 0) goto L1c
            int r2 = r1.hashCode()
        L1c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.durationMs
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.id
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            byte[] r1 = r6.messageData
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            r6.hashCode = r1
        L3c:
            int r0 = r6.hashCode
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
            java.lang.String r0 = "EMSG: scheme="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r3.schemeIdUri
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            long r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r3.durationMs
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r3.value
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.schemeIdUri
            r3.writeString(r4)
            java.lang.String r4 = r2.value
            r3.writeString(r4)
            long r0 = r2.durationMs
            r3.writeLong(r0)
            long r0 = r2.id
            r3.writeLong(r0)
            byte[] r4 = r2.messageData
            r3.writeByteArray(r4)
            return
    }
}
