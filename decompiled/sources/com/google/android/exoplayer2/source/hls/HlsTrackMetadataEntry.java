package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsTrackMetadataEntry implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry> CREATOR = null;

    @androidx.annotation.Nullable
    public final java.lang.String groupId;

    @androidx.annotation.Nullable
    public final java.lang.String name;
    public final java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo> variantInfos;


    /* JADX INFO: loaded from: classes.dex */
    public static final class VariantInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo> CREATOR = null;

        @androidx.annotation.Nullable
        public final java.lang.String audioGroupId;
        public final int averageBitrate;

        @androidx.annotation.Nullable
        public final java.lang.String captionGroupId;
        public final int peakBitrate;

        @androidx.annotation.Nullable
        public final java.lang.String subtitleGroupId;

        @androidx.annotation.Nullable
        public final java.lang.String videoGroupId;


        static {
                com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo$1 r0 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo$1
                r0.<init>()
                com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo.CREATOR = r0
                return
        }

        public VariantInfo(int r1, int r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.String r6) {
                r0 = this;
                r0.<init>()
                r0.averageBitrate = r1
                r0.peakBitrate = r2
                r0.videoGroupId = r3
                r0.audioGroupId = r4
                r0.subtitleGroupId = r5
                r0.captionGroupId = r6
                return
        }

        public VariantInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.averageBitrate = r0
                int r0 = r2.readInt()
                r1.peakBitrate = r0
                java.lang.String r0 = r2.readString()
                r1.videoGroupId = r0
                java.lang.String r0 = r2.readString()
                r1.audioGroupId = r0
                java.lang.String r0 = r2.readString()
                r1.subtitleGroupId = r0
                java.lang.String r2 = r2.readString()
                r1.captionGroupId = r2
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
                if (r5 == 0) goto L49
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r2 = com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L49
            L10:
                com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo r5 = (com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo) r5
                int r2 = r4.averageBitrate
                int r3 = r5.averageBitrate
                if (r2 != r3) goto L47
                int r2 = r4.peakBitrate
                int r3 = r5.peakBitrate
                if (r2 != r3) goto L47
                java.lang.String r2 = r4.videoGroupId
                java.lang.String r3 = r5.videoGroupId
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L47
                java.lang.String r2 = r4.audioGroupId
                java.lang.String r3 = r5.audioGroupId
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L47
                java.lang.String r2 = r4.subtitleGroupId
                java.lang.String r3 = r5.subtitleGroupId
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L47
                java.lang.String r2 = r4.captionGroupId
                java.lang.String r5 = r5.captionGroupId
                boolean r5 = android.text.TextUtils.equals(r2, r5)
                if (r5 == 0) goto L47
                goto L48
            L47:
                r0 = 0
            L48:
                return r0
            L49:
                return r1
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.averageBitrate
                int r0 = r0 * 31
                int r1 = r3.peakBitrate
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.videoGroupId
                r2 = 0
                if (r1 == 0) goto L13
                int r1 = r1.hashCode()
                goto L14
            L13:
                r1 = 0
            L14:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.audioGroupId
                if (r1 == 0) goto L20
                int r1 = r1.hashCode()
                goto L21
            L20:
                r1 = 0
            L21:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.subtitleGroupId
                if (r1 == 0) goto L2d
                int r1 = r1.hashCode()
                goto L2e
            L2d:
                r1 = 0
            L2e:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.captionGroupId
                if (r1 == 0) goto L39
                int r2 = r1.hashCode()
            L39:
                int r0 = r0 + r2
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.averageBitrate
                r1.writeInt(r2)
                int r2 = r0.peakBitrate
                r1.writeInt(r2)
                java.lang.String r2 = r0.videoGroupId
                r1.writeString(r2)
                java.lang.String r2 = r0.audioGroupId
                r1.writeString(r2)
                java.lang.String r2 = r0.subtitleGroupId
                r1.writeString(r2)
                java.lang.String r2 = r0.captionGroupId
                r1.writeString(r2)
                return
        }
    }

    static {
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$1 r0 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$1
            r0.<init>()
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.CREATOR = r0
            return
    }

    public HlsTrackMetadataEntry(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.readString()
            r4.groupId = r0
            java.lang.String r0 = r5.readString()
            r4.name = r0
            int r0 = r5.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L19:
            if (r2 >= r0) goto L2d
            java.lang.Class<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r3 = com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo r3 = (com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo) r3
            r1.add(r3)
            int r2 = r2 + 1
            goto L19
        L2d:
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            r4.variantInfos = r5
            return
    }

    public HlsTrackMetadataEntry(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo> r3) {
            r0 = this;
            r0.<init>()
            r0.groupId = r1
            r0.name = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.variantInfos = r1
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
            if (r5 == 0) goto L33
            java.lang.Class<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry> r2 = com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r5 = (com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry) r5
            java.lang.String r2 = r4.groupId
            java.lang.String r3 = r5.groupId
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.name
            java.lang.String r3 = r5.name
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L31
            java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r2 = r4.variantInfos
            java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r5 = r5.variantInfos
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
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
            java.lang.String r0 = r3.groupId
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.name
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r1 = r3.variantInfos
            int r1 = r1.hashCode()
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
            r4 = this;
            java.lang.String r0 = "HlsTrackMetadataEntry"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.groupId
            if (r1 == 0) goto L23
            java.lang.String r1 = " ["
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r4.groupId
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r2 = r4.name
            java.lang.String r3 = "]"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
            goto L25
        L23:
            java.lang.String r1 = ""
        L25:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.groupId
            r4.writeString(r5)
            java.lang.String r5 = r3.name
            r4.writeString(r5)
            java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r5 = r3.variantInfos
            int r5 = r5.size()
            r4.writeInt(r5)
            r0 = 0
            r1 = 0
        L15:
            if (r1 >= r5) goto L25
            java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r2 = r3.variantInfos
            java.lang.Object r2 = r2.get(r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r4.writeParcelable(r2, r0)
            int r1 = r1 + 1
            goto L15
        L25:
            return
    }
}
