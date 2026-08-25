package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.TrackGroup> CREATOR = null;
    private static final java.lang.String FIELD_FORMATS = null;
    private static final java.lang.String FIELD_ID = null;
    private static final java.lang.String TAG = "TrackGroup";
    private final com.google.android.exoplayer2.Format[] formats;
    private int hashCode;
    public final java.lang.String id;
    public final int length;
    public final int type;

    /* JADX INFO: renamed from: $r8$lambda$OSucO-GokAXNCAKDiwNz_o1YsYw, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.source.TrackGroup m250$r8$lambda$OSucOGokAXNCAKDiwNz_o1YsYw(android.os.Bundle r0) {
            com.google.android.exoplayer2.source.TrackGroup r0 = lambda$static$0(r0)
            return r0
    }

    static {
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.source.TrackGroup.FIELD_FORMATS = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.source.TrackGroup.FIELD_ID = r0
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.source.TrackGroup.CREATOR = r0
            return
    }

    public TrackGroup(java.lang.String r3, com.google.android.exoplayer2.Format... r4) {
            r2 = this;
            r2.<init>()
            int r0 = r4.length
            r1 = 0
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r2.id = r3
            r2.formats = r4
            int r3 = r4.length
            r2.length = r3
            r3 = r4[r1]
            java.lang.String r3 = r3.sampleMimeType
            int r3 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r3)
            r0 = -1
            if (r3 != r0) goto L27
            r3 = r4[r1]
            java.lang.String r3 = r3.containerMimeType
            int r3 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r3)
        L27:
            r2.type = r3
            r2.verifyCorrectness()
            return
    }

    public TrackGroup(com.google.android.exoplayer2.Format... r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r2)
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.source.TrackGroup lambda$static$0(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.source.TrackGroup.FIELD_FORMATS
            java.util.ArrayList r0 = r3.getParcelableArrayList(r0)
            if (r0 != 0) goto Ld
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L13
        Ld:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Format> r1 = com.google.android.exoplayer2.Format.CREATOR
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r1, r0)
        L13:
            java.lang.String r1 = com.google.android.exoplayer2.source.TrackGroup.FIELD_ID
            java.lang.String r2 = ""
            java.lang.String r3 = r3.getString(r1, r2)
            com.google.android.exoplayer2.source.TrackGroup r1 = new com.google.android.exoplayer2.source.TrackGroup
            r2 = 0
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.exoplayer2.Format[] r0 = (com.google.android.exoplayer2.Format[]) r0
            r1.<init>(r3, r0)
            return r1
    }

    private static void logErrorMessage(java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, int r6) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Different "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " combined in one TrackGroup: '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "' (track 0) and '"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = "' (track "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            java.lang.String r3 = "TrackGroup"
            java.lang.String r4 = ""
            com.google.android.exoplayer2.util.Log.e(r3, r4, r0)
            return
    }

    private static java.lang.String normalizeLanguage(@androidx.annotation.Nullable java.lang.String r1) {
            if (r1 == 0) goto Lb
            java.lang.String r0 = "und"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
        Lb:
            java.lang.String r1 = ""
        Ld:
            return r1
    }

    private static int normalizeRoleFlags(int r0) {
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            return r0
    }

    private void verifyCorrectness() {
            r6 = this;
            com.google.android.exoplayer2.Format[] r0 = r6.formats
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.language
            java.lang.String r0 = normalizeLanguage(r0)
            com.google.android.exoplayer2.Format[] r2 = r6.formats
            r2 = r2[r1]
            int r2 = r2.roleFlags
            int r2 = normalizeRoleFlags(r2)
            r3 = 1
        L16:
            com.google.android.exoplayer2.Format[] r4 = r6.formats
            int r5 = r4.length
            if (r3 >= r5) goto L63
            r4 = r4[r3]
            java.lang.String r4 = r4.language
            java.lang.String r4 = normalizeLanguage(r4)
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L39
            com.google.android.exoplayer2.Format[] r0 = r6.formats
            r1 = r0[r1]
            java.lang.String r1 = r1.language
            r0 = r0[r3]
            java.lang.String r0 = r0.language
            java.lang.String r2 = "languages"
            logErrorMessage(r2, r1, r0, r3)
            return
        L39:
            com.google.android.exoplayer2.Format[] r4 = r6.formats
            r4 = r4[r3]
            int r4 = r4.roleFlags
            int r4 = normalizeRoleFlags(r4)
            if (r2 == r4) goto L60
            com.google.android.exoplayer2.Format[] r0 = r6.formats
            r0 = r0[r1]
            int r0 = r0.roleFlags
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            com.google.android.exoplayer2.Format[] r1 = r6.formats
            r1 = r1[r3]
            int r1 = r1.roleFlags
            java.lang.String r1 = java.lang.Integer.toBinaryString(r1)
            java.lang.String r2 = "role flags"
            logErrorMessage(r2, r0, r1, r3)
            return
        L60:
            int r3 = r3 + 1
            goto L16
        L63:
            return
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.TrackGroup copyWithId(java.lang.String r3) {
            r2 = this;
            com.google.android.exoplayer2.source.TrackGroup r0 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r1 = r2.formats
            r0.<init>(r3, r1)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<com.google.android.exoplayer2.source.TrackGroup> r2 = com.google.android.exoplayer2.source.TrackGroup.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.exoplayer2.source.TrackGroup r5 = (com.google.android.exoplayer2.source.TrackGroup) r5
            java.lang.String r2 = r4.id
            java.lang.String r3 = r5.id
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            com.google.android.exoplayer2.Format[] r2 = r4.formats
            com.google.android.exoplayer2.Format[] r5 = r5.formats
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

    public com.google.android.exoplayer2.Format getFormat(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Format[] r0 = r1.formats
            r2 = r0[r2]
            return r2
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.hashCode
            if (r0 != 0) goto L17
            java.lang.String r0 = r3.id
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            com.google.android.exoplayer2.Format[] r1 = r3.formats
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r3.hashCode = r0
        L17:
            int r0 = r3.hashCode
            return r0
    }

    public int indexOf(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.Format[] r1 = r3.formats
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r1 = r1[r0]
            if (r4 != r1) goto Lb
            return r0
        Lb:
            int r0 = r0 + 1
            goto L1
        Le:
            r4 = -1
            return r4
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            com.google.android.exoplayer2.Format[] r2 = r7.formats
            int r2 = r2.length
            r1.<init>(r2)
            com.google.android.exoplayer2.Format[] r2 = r7.formats
            int r3 = r2.length
            r4 = 0
        L11:
            if (r4 >= r3) goto L20
            r5 = r2[r4]
            r6 = 1
            android.os.Bundle r5 = r5.toBundle(r6)
            r1.add(r5)
            int r4 = r4 + 1
            goto L11
        L20:
            java.lang.String r2 = com.google.android.exoplayer2.source.TrackGroup.FIELD_FORMATS
            r0.putParcelableArrayList(r2, r1)
            java.lang.String r1 = com.google.android.exoplayer2.source.TrackGroup.FIELD_ID
            java.lang.String r2 = r7.id
            r0.putString(r1, r2)
            return r0
    }
}
