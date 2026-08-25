package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.offline.DownloadRequest> CREATOR = null;

    @androidx.annotation.Nullable
    public final java.lang.String customCacheKey;
    public final byte[] data;
    public final java.lang.String id;

    @androidx.annotation.Nullable
    public final byte[] keySetId;

    @androidx.annotation.Nullable
    public final java.lang.String mimeType;
    public final java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;
    public final android.net.Uri uri;


    /* JADX INFO: loaded from: classes.dex */
    public static class Builder {

        @androidx.annotation.Nullable
        private java.lang.String customCacheKey;

        @androidx.annotation.Nullable
        private byte[] data;
        private final java.lang.String id;

        @androidx.annotation.Nullable
        private byte[] keySetId;

        @androidx.annotation.Nullable
        private java.lang.String mimeType;

        @androidx.annotation.Nullable
        private java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;
        private final android.net.Uri uri;

        public Builder(java.lang.String r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.uri = r2
                return
        }

        public com.google.android.exoplayer2.offline.DownloadRequest build() {
                r10 = this;
                com.google.android.exoplayer2.offline.DownloadRequest r9 = new com.google.android.exoplayer2.offline.DownloadRequest
                java.lang.String r1 = r10.id
                android.net.Uri r2 = r10.uri
                java.lang.String r3 = r10.mimeType
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r0 = r10.streamKeys
                if (r0 == 0) goto Ld
                goto L11
            Ld:
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            L11:
                r4 = r0
                byte[] r5 = r10.keySetId
                java.lang.String r6 = r10.customCacheKey
                byte[] r7 = r10.data
                r8 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.offline.DownloadRequest.Builder setCustomCacheKey(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.customCacheKey = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.offline.DownloadRequest.Builder setData(@androidx.annotation.Nullable byte[] r1) {
                r0 = this;
                r0.data = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.offline.DownloadRequest.Builder setKeySetId(@androidx.annotation.Nullable byte[] r1) {
                r0 = this;
                r0.keySetId = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.offline.DownloadRequest.Builder setMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mimeType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.offline.DownloadRequest.Builder setStreamKeys(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1) {
                r0 = this;
                r0.streamKeys = r1
                return r0
        }
    }

    public static class UnsupportedRequestException extends java.io.IOException {
        public UnsupportedRequestException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.google.android.exoplayer2.offline.DownloadRequest$1 r0 = new com.google.android.exoplayer2.offline.DownloadRequest$1
            r0.<init>()
            com.google.android.exoplayer2.offline.DownloadRequest.CREATOR = r0
            return
    }

    public DownloadRequest(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.id = r0
            java.lang.String r0 = r5.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.uri = r0
            java.lang.String r0 = r5.readString()
            r4.mimeType = r0
            int r0 = r5.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L2f:
            if (r2 >= r0) goto L43
            java.lang.Class<com.google.android.exoplayer2.offline.StreamKey> r3 = com.google.android.exoplayer2.offline.StreamKey.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            com.google.android.exoplayer2.offline.StreamKey r3 = (com.google.android.exoplayer2.offline.StreamKey) r3
            r1.add(r3)
            int r2 = r2 + 1
            goto L2f
        L43:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r4.streamKeys = r0
            byte[] r0 = r5.createByteArray()
            r4.keySetId = r0
            java.lang.String r0 = r5.readString()
            r4.customCacheKey = r0
            byte[] r5 = r5.createByteArray()
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            byte[] r5 = (byte[]) r5
            r4.data = r5
            return
    }

    private DownloadRequest(java.lang.String r5, android.net.Uri r6, @androidx.annotation.Nullable java.lang.String r7, java.util.List<com.google.android.exoplayer2.offline.StreamKey> r8, @androidx.annotation.Nullable byte[] r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable byte[] r11) {
            r4 = this;
            r4.<init>()
            int r0 = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(r6, r7)
            r1 = 1
            if (r0 == 0) goto Lf
            r2 = 2
            if (r0 == r2) goto Lf
            if (r0 != r1) goto L27
        Lf:
            if (r10 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "customCacheKey must be null for type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1, r0)
        L27:
            r4.id = r5
            r4.uri = r6
            r4.mimeType = r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r8)
            java.util.Collections.sort(r5)
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            r4.streamKeys = r5
            if (r9 == 0) goto L43
            int r5 = r9.length
            byte[] r5 = java.util.Arrays.copyOf(r9, r5)
            goto L44
        L43:
            r5 = 0
        L44:
            r4.keySetId = r5
            r4.customCacheKey = r10
            if (r11 == 0) goto L50
            int r5 = r11.length
            byte[] r5 = java.util.Arrays.copyOf(r11, r5)
            goto L52
        L50:
            byte[] r5 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
        L52:
            r4.data = r5
            return
    }

    public /* synthetic */ DownloadRequest(java.lang.String r1, android.net.Uri r2, java.lang.String r3, java.util.List r4, byte[] r5, java.lang.String r6, byte[] r7, com.google.android.exoplayer2.offline.DownloadRequest.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public com.google.android.exoplayer2.offline.DownloadRequest copyWithId(java.lang.String r10) {
            r9 = this;
            com.google.android.exoplayer2.offline.DownloadRequest r8 = new com.google.android.exoplayer2.offline.DownloadRequest
            android.net.Uri r2 = r9.uri
            java.lang.String r3 = r9.mimeType
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r4 = r9.streamKeys
            byte[] r5 = r9.keySetId
            java.lang.String r6 = r9.customCacheKey
            byte[] r7 = r9.data
            r0 = r8
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public com.google.android.exoplayer2.offline.DownloadRequest copyWithKeySetId(@androidx.annotation.Nullable byte[] r10) {
            r9 = this;
            com.google.android.exoplayer2.offline.DownloadRequest r8 = new com.google.android.exoplayer2.offline.DownloadRequest
            java.lang.String r1 = r9.id
            android.net.Uri r2 = r9.uri
            java.lang.String r3 = r9.mimeType
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r4 = r9.streamKeys
            java.lang.String r6 = r9.customCacheKey
            byte[] r7 = r9.data
            r0 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public com.google.android.exoplayer2.offline.DownloadRequest copyWithMergedRequest(com.google.android.exoplayer2.offline.DownloadRequest r10) {
            r9 = this;
            java.lang.String r0 = r9.id
            java.lang.String r1 = r10.id
            boolean r0 = r0.equals(r1)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r0 = r9.streamKeys
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r0 = r10.streamKeys
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            goto L40
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r9.streamKeys
            r0.<init>(r1)
            r1 = 0
        L24:
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r10.streamKeys
            int r2 = r2.size()
            if (r1 >= r2) goto L44
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r10.streamKeys
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.offline.StreamKey r2 = (com.google.android.exoplayer2.offline.StreamKey) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L3d
            r0.add(r2)
        L3d:
            int r1 = r1 + 1
            goto L24
        L40:
            java.util.List r0 = java.util.Collections.emptyList()
        L44:
            r5 = r0
            com.google.android.exoplayer2.offline.DownloadRequest r0 = new com.google.android.exoplayer2.offline.DownloadRequest
            java.lang.String r2 = r9.id
            android.net.Uri r3 = r10.uri
            java.lang.String r4 = r10.mimeType
            byte[] r6 = r10.keySetId
            java.lang.String r7 = r10.customCacheKey
            byte[] r8 = r10.data
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.exoplayer2.offline.DownloadRequest
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.exoplayer2.offline.DownloadRequest r4 = (com.google.android.exoplayer2.offline.DownloadRequest) r4
            java.lang.String r0 = r3.id
            java.lang.String r2 = r4.id
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4f
            android.net.Uri r0 = r3.uri
            android.net.Uri r2 = r4.uri
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.mimeType
            java.lang.String r2 = r4.mimeType
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 == 0) goto L4f
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r0 = r3.streamKeys
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r4.streamKeys
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4f
            byte[] r0 = r3.keySetId
            byte[] r2 = r4.keySetId
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.customCacheKey
            java.lang.String r2 = r4.customCacheKey
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 == 0) goto L4f
            byte[] r0 = r3.data
            byte[] r4 = r4.data
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L4f
            r1 = 1
        L4f:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r0 = r0 * 31
            android.net.Uri r1 = r3.uri
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.mimeType
            r2 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.hashCode()
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r0 = r3.streamKeys
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r3.keySetId
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.customCacheKey
            if (r0 == 0) goto L3b
            int r2 = r0.hashCode()
        L3b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            byte[] r0 = r3.data
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public com.google.android.exoplayer2.MediaItem toMediaItem() {
            r2 = this;
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            java.lang.String r1 = r2.id
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMediaId(r1)
            android.net.Uri r1 = r2.uri
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setUri(r1)
            java.lang.String r1 = r2.customCacheKey
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setCustomCacheKey(r1)
            java.lang.String r1 = r2.mimeType
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMimeType(r1)
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r2.streamKeys
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setStreamKeys(r1)
            com.google.android.exoplayer2.MediaItem r0 = r0.build()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mimeType
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.id
            r3.writeString(r4)
            android.net.Uri r4 = r2.uri
            java.lang.String r4 = r4.toString()
            r3.writeString(r4)
            java.lang.String r4 = r2.mimeType
            r3.writeString(r4)
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r4 = r2.streamKeys
            int r4 = r4.size()
            r3.writeInt(r4)
            r4 = 0
            r0 = 0
        L1e:
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r2.streamKeys
            int r1 = r1.size()
            if (r0 >= r1) goto L34
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r2.streamKeys
            java.lang.Object r1 = r1.get(r0)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r3.writeParcelable(r1, r4)
            int r0 = r0 + 1
            goto L1e
        L34:
            byte[] r4 = r2.keySetId
            r3.writeByteArray(r4)
            java.lang.String r4 = r2.customCacheKey
            r3.writeString(r4)
            byte[] r4 = r2.data
            r3.writeByteArray(r4)
            return
    }
}
