package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackGroupArray implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.TrackGroupArray> CREATOR = null;
    public static final com.google.android.exoplayer2.source.TrackGroupArray EMPTY = null;
    private static final java.lang.String FIELD_TRACK_GROUPS = null;
    private static final java.lang.String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> trackGroups;

    public static /* synthetic */ com.google.android.exoplayer2.source.TrackGroupArray $r8$lambda$Ux6uYjhjCac6ofzNm8CE0IjVCHM(android.os.Bundle r0) {
            com.google.android.exoplayer2.source.TrackGroupArray r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.source.TrackGroupArray r0 = new com.google.android.exoplayer2.source.TrackGroupArray
            r1 = 0
            com.google.android.exoplayer2.source.TrackGroup[] r2 = new com.google.android.exoplayer2.source.TrackGroup[r1]
            r0.<init>(r2)
            com.google.android.exoplayer2.source.TrackGroupArray.EMPTY = r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r1)
            com.google.android.exoplayer2.source.TrackGroupArray.FIELD_TRACK_GROUPS = r0
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$4
            com.google.android.exoplayer2.source.TrackGroupArray.CREATOR = r0
            return
    }

    public TrackGroupArray(com.google.android.exoplayer2.source.TrackGroup... r2) {
            r1 = this;
            r1.<init>()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r2)
            r1.trackGroups = r0
            int r2 = r2.length
            r1.length = r2
            r1.verifyCorrectness()
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.source.TrackGroupArray lambda$static$0(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.source.TrackGroupArray.FIELD_TRACK_GROUPS
            java.util.ArrayList r3 = r3.getParcelableArrayList(r0)
            r0 = 0
            if (r3 != 0) goto L11
            com.google.android.exoplayer2.source.TrackGroupArray r3 = new com.google.android.exoplayer2.source.TrackGroupArray
            com.google.android.exoplayer2.source.TrackGroup[] r0 = new com.google.android.exoplayer2.source.TrackGroup[r0]
            r3.<init>(r0)
            return r3
        L11:
            com.google.android.exoplayer2.source.TrackGroupArray r1 = new com.google.android.exoplayer2.source.TrackGroupArray
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.source.TrackGroup> r2 = com.google.android.exoplayer2.source.TrackGroup.CREATOR
            com.google.common.collect.ImmutableList r3 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r2, r3)
            com.google.android.exoplayer2.source.TrackGroup[] r0 = new com.google.android.exoplayer2.source.TrackGroup[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            com.google.android.exoplayer2.source.TrackGroup[] r3 = (com.google.android.exoplayer2.source.TrackGroup[]) r3
            r1.<init>(r3)
            return r1
    }

    private void verifyCorrectness() {
            r6 = this;
            r0 = 0
        L1:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r1 = r6.trackGroups
            int r1 = r1.size()
            if (r0 >= r1) goto L3b
            int r1 = r0 + 1
            r2 = r1
        Lc:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r3 = r6.trackGroups
            int r3 = r3.size()
            if (r2 >= r3) goto L39
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r3 = r6.trackGroups
            java.lang.Object r3 = r3.get(r0)
            com.google.android.exoplayer2.source.TrackGroup r3 = (com.google.android.exoplayer2.source.TrackGroup) r3
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r4 = r6.trackGroups
            java.lang.Object r4 = r4.get(r2)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L36
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Multiple identical TrackGroups added to one TrackGroupArray."
            r3.<init>(r4)
            java.lang.String r4 = "TrackGroupArray"
            java.lang.String r5 = ""
            com.google.android.exoplayer2.util.Log.e(r4, r5, r3)
        L36:
            int r2 = r2 + 1
            goto Lc
        L39:
            r0 = r1
            goto L1
        L3b:
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<com.google.android.exoplayer2.source.TrackGroupArray> r2 = com.google.android.exoplayer2.source.TrackGroupArray.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.exoplayer2.source.TrackGroupArray r5 = (com.google.android.exoplayer2.source.TrackGroupArray) r5
            int r2 = r4.length
            int r3 = r5.length
            if (r2 != r3) goto L23
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r2 = r4.trackGroups
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r5 = r5.trackGroups
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public com.google.android.exoplayer2.source.TrackGroup get(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r0 = r1.trackGroups
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.TrackGroup r2 = (com.google.android.exoplayer2.source.TrackGroup) r2
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            if (r0 != 0) goto Lc
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r0 = r1.trackGroups
            int r0 = r0.hashCode()
            r1.hashCode = r0
        Lc:
            int r0 = r1.hashCode
            return r0
    }

    public int indexOf(com.google.android.exoplayer2.source.TrackGroup r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r0 = r1.trackGroups
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto L9
            goto La
        L9:
            r2 = -1
        La:
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.length
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.source.TrackGroupArray.FIELD_TRACK_GROUPS
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> r2 = r3.trackGroups
            java.util.ArrayList r2 = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(r2)
            r0.putParcelableArrayList(r1, r2)
            return r0
    }
}
