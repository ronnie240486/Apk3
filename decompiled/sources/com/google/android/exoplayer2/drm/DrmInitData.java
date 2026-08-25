package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements java.util.Comparator<com.google.android.exoplayer2.drm.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.drm.DrmInitData> CREATOR = null;
    private int hashCode;
    public final int schemeDataCount;
    private final com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] schemeDatas;

    @androidx.annotation.Nullable
    public final java.lang.String schemeType;


    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> CREATOR = null;

        @androidx.annotation.Nullable
        public final byte[] data;
        private int hashCode;

        @androidx.annotation.Nullable
        public final java.lang.String licenseServerUrl;
        public final java.lang.String mimeType;
        public final java.util.UUID uuid;


        static {
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData$1 r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData$1
                r0.<init>()
                com.google.android.exoplayer2.drm.DrmInitData.SchemeData.CREATOR = r0
                return
        }

        public SchemeData(android.os.Parcel r6) {
                r5 = this;
                r5.<init>()
                java.util.UUID r0 = new java.util.UUID
                long r1 = r6.readLong()
                long r3 = r6.readLong()
                r0.<init>(r1, r3)
                r5.uuid = r0
                java.lang.String r0 = r6.readString()
                r5.licenseServerUrl = r0
                java.lang.String r0 = r6.readString()
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                r5.mimeType = r0
                byte[] r6 = r6.createByteArray()
                r5.data = r6
                return
        }

        public SchemeData(java.util.UUID r1, @androidx.annotation.Nullable java.lang.String r2, java.lang.String r3, @androidx.annotation.Nullable byte[] r4) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                java.util.UUID r1 = (java.util.UUID) r1
                r0.uuid = r1
                r0.licenseServerUrl = r2
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.lang.String r1 = (java.lang.String) r1
                r0.mimeType = r1
                r0.data = r4
                return
        }

        public SchemeData(java.util.UUID r2, java.lang.String r3, @androidx.annotation.Nullable byte[] r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0, r3, r4)
                return
        }

        public boolean canReplace(com.google.android.exoplayer2.drm.DrmInitData.SchemeData r2) {
                r1 = this;
                boolean r0 = r1.hasData()
                if (r0 == 0) goto L16
                boolean r0 = r2.hasData()
                if (r0 != 0) goto L16
                java.util.UUID r2 = r2.uuid
                boolean r2 = r1.matches(r2)
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.drm.DrmInitData.SchemeData copyWithData(@androidx.annotation.Nullable byte[] r5) {
                r4 = this;
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
                java.util.UUID r1 = r4.uuid
                java.lang.String r2 = r4.licenseServerUrl
                java.lang.String r3 = r4.mimeType
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.android.exoplayer2.drm.DrmInitData.SchemeData
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = 1
                if (r5 != r4) goto La
                return r0
            La:
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData r5 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r5
                java.lang.String r2 = r4.licenseServerUrl
                java.lang.String r3 = r5.licenseServerUrl
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L35
                java.lang.String r2 = r4.mimeType
                java.lang.String r3 = r5.mimeType
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L35
                java.util.UUID r2 = r4.uuid
                java.util.UUID r3 = r5.uuid
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L35
                byte[] r2 = r4.data
                byte[] r5 = r5.data
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 == 0) goto L35
                r1 = 1
            L35:
                return r1
        }

        public boolean hasData() {
                r1 = this;
                byte[] r0 = r1.data
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.hashCode
                if (r0 != 0) goto L2a
                java.util.UUID r0 = r3.uuid
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.licenseServerUrl
                if (r1 != 0) goto L12
                r1 = 0
                goto L16
            L12:
                int r1 = r1.hashCode()
            L16:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.mimeType
                r2 = 31
                int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
                byte[] r1 = r3.data
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                r3.hashCode = r1
            L2a:
                int r0 = r3.hashCode
                return r0
        }

        public boolean matches(java.util.UUID r3) {
                r2 = this;
                java.util.UUID r0 = com.google.android.exoplayer2.C.UUID_NIL
                java.util.UUID r1 = r2.uuid
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L15
                java.util.UUID r0 = r2.uuid
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L13
                goto L15
            L13:
                r3 = 0
                goto L16
            L15:
                r3 = 1
            L16:
                return r3
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                java.util.UUID r4 = r2.uuid
                long r0 = r4.getMostSignificantBits()
                r3.writeLong(r0)
                java.util.UUID r4 = r2.uuid
                long r0 = r4.getLeastSignificantBits()
                r3.writeLong(r0)
                java.lang.String r4 = r2.licenseServerUrl
                r3.writeString(r4)
                java.lang.String r4 = r2.mimeType
                r3.writeString(r4)
                byte[] r4 = r2.data
                r3.writeByteArray(r4)
                return
        }
    }

    static {
            com.google.android.exoplayer2.drm.DrmInitData$1 r0 = new com.google.android.exoplayer2.drm.DrmInitData$1
            r0.<init>()
            com.google.android.exoplayer2.drm.DrmInitData.CREATOR = r0
            return
    }

    public DrmInitData(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.schemeType = r0
            android.os.Parcelable$Creator<com.google.android.exoplayer2.drm.DrmInitData$SchemeData> r0 = com.google.android.exoplayer2.drm.DrmInitData.SchemeData.CREATOR
            java.lang.Object[] r2 = r2.createTypedArray(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r2
            r1.schemeDatas = r2
            int r2 = r2.length
            r1.schemeDataCount = r2
            return
    }

    public DrmInitData(@androidx.annotation.Nullable java.lang.String r3, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r4) {
            r2 = this;
            r0 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            java.lang.Object[] r4 = r4.toArray(r1)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r4 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r4
            r2.<init>(r3, r0, r4)
            return
    }

    private DrmInitData(@androidx.annotation.Nullable java.lang.String r1, boolean r2, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r3) {
            r0 = this;
            r0.<init>()
            r0.schemeType = r1
            if (r2 == 0) goto Le
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
        Le:
            r0.schemeDatas = r3
            int r1 = r3.length
            r0.schemeDataCount = r1
            java.util.Arrays.sort(r3, r0)
            return
    }

    public DrmInitData(@androidx.annotation.Nullable java.lang.String r2, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    public DrmInitData(java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r3) {
            r2 = this;
            r0 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
            r1 = 0
            r2.<init>(r1, r0, r3)
            return
    }

    public DrmInitData(com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    private static boolean containsSchemeDataWithUuid(java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r3, int r4, java.util.UUID r5) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r4) goto L17
            java.lang.Object r2 = r3.get(r1)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r2
            java.util.UUID r2 = r2.uuid
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L14
            r3 = 1
            return r3
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.drm.DrmInitData createSessionCreationData(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r8, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L1f
            java.lang.String r3 = r8.schemeType
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r8 = r8.schemeDatas
            int r4 = r8.length
            r5 = 0
        Lf:
            if (r5 >= r4) goto L20
            r6 = r8[r5]
            boolean r7 = r6.hasData()
            if (r7 == 0) goto L1c
            r0.add(r6)
        L1c:
            int r5 = r5 + 1
            goto Lf
        L1f:
            r3 = r2
        L20:
            if (r9 == 0) goto L46
            if (r3 != 0) goto L27
            java.lang.String r8 = r9.schemeType
            r3 = r8
        L27:
            int r8 = r0.size()
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r9 = r9.schemeDatas
            int r4 = r9.length
        L2e:
            if (r1 >= r4) goto L46
            r5 = r9[r1]
            boolean r6 = r5.hasData()
            if (r6 == 0) goto L43
            java.util.UUID r6 = r5.uuid
            boolean r6 = containsSchemeDataWithUuid(r0, r8, r6)
            if (r6 != 0) goto L43
            r0.add(r5)
        L43:
            int r1 = r1 + 1
            goto L2e
        L46:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L4d
            goto L52
        L4d:
            com.google.android.exoplayer2.drm.DrmInitData r2 = new com.google.android.exoplayer2.drm.DrmInitData
            r2.<init>(r3, r0)
        L52:
            return r2
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(com.google.android.exoplayer2.drm.DrmInitData.SchemeData r3, com.google.android.exoplayer2.drm.DrmInitData.SchemeData r4) {
            r2 = this;
            java.util.UUID r0 = com.google.android.exoplayer2.C.UUID_NIL
            java.util.UUID r1 = r3.uuid
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L16
            java.util.UUID r3 = r4.uuid
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L14
            r3 = 0
            goto L1e
        L14:
            r3 = 1
            goto L1e
        L16:
            java.util.UUID r3 = r3.uuid
            java.util.UUID r4 = r4.uuid
            int r3 = r3.compareTo(r4)
        L1e:
            return r3
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(com.google.android.exoplayer2.drm.DrmInitData.SchemeData r1, com.google.android.exoplayer2.drm.DrmInitData.SchemeData r2) {
            r0 = this;
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.drm.DrmInitData copyWithSchemeType(@androidx.annotation.Nullable java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.schemeType
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r4)
            if (r0 == 0) goto L9
            return r3
        L9:
            com.google.android.exoplayer2.drm.DrmInitData r0 = new com.google.android.exoplayer2.drm.DrmInitData
            r1 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = r3.schemeDatas
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Comparator
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<com.google.android.exoplayer2.drm.DrmInitData> r2 = com.google.android.exoplayer2.drm.DrmInitData.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.exoplayer2.drm.DrmInitData r5 = (com.google.android.exoplayer2.drm.DrmInitData) r5
            java.lang.String r2 = r4.schemeType
            java.lang.String r3 = r5.schemeType
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L27
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = r4.schemeDatas
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r5 = r5.schemeDatas
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public com.google.android.exoplayer2.drm.DrmInitData.SchemeData get(int r2) {
            r1 = this;
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = r1.schemeDatas
            r2 = r0[r2]
            return r2
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.schemeType
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            int r0 = r0 * 31
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = r2.schemeDatas
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.hashCode = r0
        L19:
            int r0 = r2.hashCode
            return r0
    }

    public com.google.android.exoplayer2.drm.DrmInitData merge(com.google.android.exoplayer2.drm.DrmInitData r3) {
            r2 = this;
            java.lang.String r0 = r2.schemeType
            if (r0 == 0) goto L11
            java.lang.String r1 = r3.schemeType
            if (r1 == 0) goto L11
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.lang.String r0 = r2.schemeType
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r0 = r3.schemeType
        L1c:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = r2.schemeDatas
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = r3.schemeDatas
            java.lang.Object[] r3 = com.google.android.exoplayer2.util.Util.nullSafeArrayConcatenation(r1, r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = new com.google.android.exoplayer2.drm.DrmInitData
            r1.<init>(r0, r3)
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r3 = r1.schemeType
            r2.writeString(r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = r1.schemeDatas
            r0 = 0
            r2.writeTypedArray(r3, r0)
            return
    }
}
