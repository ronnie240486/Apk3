package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionOverride implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.TrackSelectionOverride> CREATOR = null;
    private static final java.lang.String FIELD_TRACKS = null;
    private static final java.lang.String FIELD_TRACK_GROUP = null;
    public final com.google.android.exoplayer2.source.TrackGroup mediaTrackGroup;
    public final com.google.common.collect.ImmutableList<java.lang.Integer> trackIndices;

    /* JADX INFO: renamed from: $r8$lambda$N4Pt-q4JuVCQBA7OXQkgjxWNK9U, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride m261$r8$lambda$N4Ptq4JuVCQBA7OXQkgjxWNK9U(android.os.Bundle r0) {
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r0 = lambda$static$0(r0)
            return r0
    }

    static {
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride.FIELD_TRACK_GROUP = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride.FIELD_TRACKS = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride.CREATOR = r0
            return
    }

    public TrackSelectionOverride(com.google.android.exoplayer2.source.TrackGroup r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r0.<init>(r1, r2)
            return
    }

    public TrackSelectionOverride(com.google.android.exoplayer2.source.TrackGroup r3, java.util.List<java.lang.Integer> r4) {
            r2 = this;
            r2.<init>()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L2a
            java.lang.Object r0 = java.util.Collections.min(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L24
            java.lang.Object r0 = java.util.Collections.max(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r3.length
            if (r0 >= r1) goto L24
            goto L2a
        L24:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
        L2a:
            r2.mediaTrackGroup = r3
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r4)
            r2.trackIndices = r3
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride lambda$static$0(android.os.Bundle r2) {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.FIELD_TRACK_GROUP
            android.os.Bundle r0 = r2.getBundle(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.source.TrackGroup> r1 = com.google.android.exoplayer2.source.TrackGroup.CREATOR
            com.google.android.exoplayer2.Bundleable r0 = r1.fromBundle(r0)
            com.google.android.exoplayer2.source.TrackGroup r0 = (com.google.android.exoplayer2.source.TrackGroup) r0
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.FIELD_TRACKS
            int[] r2 = r2.getIntArray(r1)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            int[] r2 = (int[]) r2
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride
            java.util.List r2 = com.google.common.primitives.Ints.asList(r2)
            r1.<init>(r0, r2)
            return r1
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r5 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r5
            com.google.android.exoplayer2.source.TrackGroup r2 = r4.mediaTrackGroup
            com.google.android.exoplayer2.source.TrackGroup r3 = r5.mediaTrackGroup
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            com.google.common.collect.ImmutableList<java.lang.Integer> r2 = r4.trackIndices
            com.google.common.collect.ImmutableList<java.lang.Integer> r5 = r5.trackIndices
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public int getType() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroup r0 = r1.mediaTrackGroup
            int r0 = r0.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.android.exoplayer2.source.TrackGroup r0 = r2.mediaTrackGroup
            int r0 = r0.hashCode()
            com.google.common.collect.ImmutableList<java.lang.Integer> r1 = r2.trackIndices
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.FIELD_TRACK_GROUP
            com.google.android.exoplayer2.source.TrackGroup r2 = r3.mediaTrackGroup
            android.os.Bundle r2 = r2.toBundle()
            r0.putBundle(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.FIELD_TRACKS
            com.google.common.collect.ImmutableList<java.lang.Integer> r2 = r3.trackIndices
            int[] r2 = com.google.common.primitives.Ints.toArray(r2)
            r0.putIntArray(r1, r2)
            return r0
    }
}
