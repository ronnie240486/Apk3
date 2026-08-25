package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class Tracks implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Tracks> CREATOR = null;
    public static final com.google.android.exoplayer2.Tracks EMPTY = null;
    private static final java.lang.String FIELD_TRACK_GROUPS = null;
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> groups;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Group implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Tracks.Group> CREATOR = null;
        private static final java.lang.String FIELD_ADAPTIVE_SUPPORTED = null;
        private static final java.lang.String FIELD_TRACK_GROUP = null;
        private static final java.lang.String FIELD_TRACK_SELECTED = null;
        private static final java.lang.String FIELD_TRACK_SUPPORT = null;
        private final boolean adaptiveSupported;
        public final int length;
        private final com.google.android.exoplayer2.source.TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;

        /* JADX INFO: renamed from: $r8$lambda$hOW-gn3kdpb2XNVi5rFd3jRcRuo, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.Tracks.Group m185$r8$lambda$hOWgn3kdpb2XNVi5rFd3jRcRuo(android.os.Bundle r0) {
                com.google.android.exoplayer2.Tracks$Group r0 = lambda$static$0(r0)
                return r0
        }

        static {
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_GROUP = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_SUPPORT = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_SELECTED = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Tracks.Group.FIELD_ADAPTIVE_SUPPORTED = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$26
                com.google.android.exoplayer2.Tracks.Group.CREATOR = r0
                return
        }

        public Group(com.google.android.exoplayer2.source.TrackGroup r5, boolean r6, int[] r7, boolean[] r8) {
                r4 = this;
                r4.<init>()
                int r0 = r5.length
                r4.length = r0
                int r1 = r7.length
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L11
                int r1 = r8.length
                if (r0 != r1) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
                r4.mediaTrackGroup = r5
                if (r6 == 0) goto L1c
                if (r0 <= r3) goto L1c
                r2 = 1
            L1c:
                r4.adaptiveSupported = r2
                java.lang.Object r5 = r7.clone()
                int[] r5 = (int[]) r5
                r4.trackSupport = r5
                java.lang.Object r5 = r8.clone()
                boolean[] r5 = (boolean[]) r5
                r4.trackSelected = r5
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.Tracks.Group lambda$static$0(android.os.Bundle r5) {
                com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.source.TrackGroup> r0 = com.google.android.exoplayer2.source.TrackGroup.CREATOR
                java.lang.String r1 = com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_GROUP
                android.os.Bundle r1 = r5.getBundle(r1)
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                android.os.Bundle r1 = (android.os.Bundle) r1
                com.google.android.exoplayer2.Bundleable r0 = r0.fromBundle(r1)
                com.google.android.exoplayer2.source.TrackGroup r0 = (com.google.android.exoplayer2.source.TrackGroup) r0
                java.lang.String r1 = com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_SUPPORT
                int[] r1 = r5.getIntArray(r1)
                int r2 = r0.length
                int[] r2 = new int[r2]
                java.lang.Object r1 = com.google.common.base.MoreObjects.firstNonNull(r1, r2)
                int[] r1 = (int[]) r1
                java.lang.String r2 = com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_SELECTED
                boolean[] r2 = r5.getBooleanArray(r2)
                int r3 = r0.length
                boolean[] r3 = new boolean[r3]
                java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r3)
                boolean[] r2 = (boolean[]) r2
                java.lang.String r3 = com.google.android.exoplayer2.Tracks.Group.FIELD_ADAPTIVE_SUPPORTED
                r4 = 0
                boolean r5 = r5.getBoolean(r3, r4)
                com.google.android.exoplayer2.Tracks$Group r3 = new com.google.android.exoplayer2.Tracks$Group
                r3.<init>(r0, r5, r1, r2)
                return r3
        }

        public com.google.android.exoplayer2.Tracks.Group copyWithId(java.lang.String r5) {
                r4 = this;
                com.google.android.exoplayer2.Tracks$Group r0 = new com.google.android.exoplayer2.Tracks$Group
                com.google.android.exoplayer2.source.TrackGroup r1 = r4.mediaTrackGroup
                com.google.android.exoplayer2.source.TrackGroup r5 = r1.copyWithId(r5)
                boolean r1 = r4.adaptiveSupported
                int[] r2 = r4.trackSupport
                boolean[] r3 = r4.trackSelected
                r0.<init>(r5, r1, r2, r3)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L39
                java.lang.Class<com.google.android.exoplayer2.Tracks$Group> r2 = com.google.android.exoplayer2.Tracks.Group.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L39
            L10:
                com.google.android.exoplayer2.Tracks$Group r5 = (com.google.android.exoplayer2.Tracks.Group) r5
                boolean r2 = r4.adaptiveSupported
                boolean r3 = r5.adaptiveSupported
                if (r2 != r3) goto L37
                com.google.android.exoplayer2.source.TrackGroup r2 = r4.mediaTrackGroup
                com.google.android.exoplayer2.source.TrackGroup r3 = r5.mediaTrackGroup
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L37
                int[] r2 = r4.trackSupport
                int[] r3 = r5.trackSupport
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L37
                boolean[] r2 = r4.trackSelected
                boolean[] r5 = r5.trackSelected
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 == 0) goto L37
                goto L38
            L37:
                r0 = 0
            L38:
                return r0
            L39:
                return r1
        }

        public com.google.android.exoplayer2.source.TrackGroup getMediaTrackGroup() {
                r1 = this;
                com.google.android.exoplayer2.source.TrackGroup r0 = r1.mediaTrackGroup
                return r0
        }

        public com.google.android.exoplayer2.Format getTrackFormat(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.TrackGroup r0 = r1.mediaTrackGroup
                com.google.android.exoplayer2.Format r2 = r0.getFormat(r2)
                return r2
        }

        public int getTrackSupport(int r2) {
                r1 = this;
                int[] r0 = r1.trackSupport
                r2 = r0[r2]
                return r2
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
                int r0 = r0 * 31
                boolean r1 = r2.adaptiveSupported
                int r0 = r0 + r1
                int r0 = r0 * 31
                int[] r1 = r2.trackSupport
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean[] r0 = r2.trackSelected
                int r0 = java.util.Arrays.hashCode(r0)
                int r0 = r0 + r1
                return r0
        }

        public boolean isAdaptiveSupported() {
                r1 = this;
                boolean r0 = r1.adaptiveSupported
                return r0
        }

        public boolean isSelected() {
                r2 = this;
                boolean[] r0 = r2.trackSelected
                r1 = 1
                boolean r0 = com.google.common.primitives.Booleans.contains(r0, r1)
                return r0
        }

        public boolean isSupported() {
                r1 = this;
                r0 = 0
                boolean r0 = r1.isSupported(r0)
                return r0
        }

        public boolean isSupported(boolean r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                int[] r2 = r3.trackSupport
                int r2 = r2.length
                if (r1 >= r2) goto L12
                boolean r2 = r3.isTrackSupported(r1, r4)
                if (r2 == 0) goto Lf
                r4 = 1
                return r4
            Lf:
                int r1 = r1 + 1
                goto L2
            L12:
                return r0
        }

        public boolean isTrackSelected(int r2) {
                r1 = this;
                boolean[] r0 = r1.trackSelected
                boolean r2 = r0[r2]
                return r2
        }

        public boolean isTrackSupported(int r2) {
                r1 = this;
                r0 = 0
                boolean r2 = r1.isTrackSupported(r2, r0)
                return r2
        }

        public boolean isTrackSupported(int r4, boolean r5) {
                r3 = this;
                int[] r0 = r3.trackSupport
                r1 = r0[r4]
                r2 = 4
                if (r1 == r2) goto L11
                if (r5 == 0) goto Lf
                r4 = r0[r4]
                r5 = 3
                if (r4 != r5) goto Lf
                goto L11
            Lf:
                r4 = 0
                goto L12
            L11:
                r4 = 1
            L12:
                return r4
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_GROUP
                com.google.android.exoplayer2.source.TrackGroup r2 = r3.mediaTrackGroup
                android.os.Bundle r2 = r2.toBundle()
                r0.putBundle(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_SUPPORT
                int[] r2 = r3.trackSupport
                r0.putIntArray(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.Tracks.Group.FIELD_TRACK_SELECTED
                boolean[] r2 = r3.trackSelected
                r0.putBooleanArray(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.Tracks.Group.FIELD_ADAPTIVE_SUPPORTED
                boolean r2 = r3.adaptiveSupported
                r0.putBoolean(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$lg-TYyKXBDHqAhYf3V9uwKV2up8, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.Tracks m184$r8$lambda$lgTYyKXBDHqAhYf3V9uwKV2up8(android.os.Bundle r0) {
            com.google.android.exoplayer2.Tracks r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.Tracks r0 = new com.google.android.exoplayer2.Tracks
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1)
            com.google.android.exoplayer2.Tracks.EMPTY = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Tracks.FIELD_TRACK_GROUPS = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$25
            com.google.android.exoplayer2.Tracks.CREATOR = r0
            return
    }

    public Tracks(java.util.List<com.google.android.exoplayer2.Tracks.Group> r1) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            r0.groups = r1
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.Tracks lambda$static$0(android.os.Bundle r1) {
            java.lang.String r0 = com.google.android.exoplayer2.Tracks.FIELD_TRACK_GROUPS
            java.util.ArrayList r1 = r1.getParcelableArrayList(r0)
            if (r1 != 0) goto Ld
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            goto L13
        Ld:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Tracks$Group> r0 = com.google.android.exoplayer2.Tracks.Group.CREATOR
            com.google.common.collect.ImmutableList r1 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r0, r1)
        L13:
            com.google.android.exoplayer2.Tracks r0 = new com.google.android.exoplayer2.Tracks
            r0.<init>(r1)
            return r0
    }

    public boolean containsType(int r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r3.groups
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r3.groups
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.Tracks$Group r2 = (com.google.android.exoplayer2.Tracks.Group) r2
            int r2 = r2.getType()
            if (r2 != r4) goto L1a
            r4 = 1
            return r4
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.google.android.exoplayer2.Tracks> r0 = com.google.android.exoplayer2.Tracks.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.google.android.exoplayer2.Tracks r3 = (com.google.android.exoplayer2.Tracks) r3
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r0 = r2.groups
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r3 = r3.groups
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> getGroups() {
            r1 = this;
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r0 = r1.groups
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r0 = r1.groups
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r0 = r1.groups
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isTypeSelected(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r4.groups
            int r2 = r2.size()
            if (r1 >= r2) goto L23
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r4.groups
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.Tracks$Group r2 = (com.google.android.exoplayer2.Tracks.Group) r2
            boolean r3 = r2.isSelected()
            if (r3 == 0) goto L20
            int r2 = r2.getType()
            if (r2 != r5) goto L20
            r5 = 1
            return r5
        L20:
            int r1 = r1 + 1
            goto L2
        L23:
            return r0
    }

    public boolean isTypeSupported(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.isTypeSupported(r2, r0)
            return r2
    }

    public boolean isTypeSupported(int r4, boolean r5) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r3.groups
            int r2 = r2.size()
            if (r1 >= r2) goto L2b
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r3.groups
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.Tracks$Group r2 = (com.google.android.exoplayer2.Tracks.Group) r2
            int r2 = r2.getType()
            if (r2 != r4) goto L28
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r3.groups
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.Tracks$Group r2 = (com.google.android.exoplayer2.Tracks.Group) r2
            boolean r2 = r2.isSupported(r5)
            if (r2 == 0) goto L28
            r4 = 1
            return r4
        L28:
            int r1 = r1 + 1
            goto L2
        L2b:
            return r0
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.isTypeSupportedOrEmpty(r2, r0)
            return r2
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.containsType(r2)
            if (r0 == 0) goto Lf
            boolean r2 = r1.isTypeSupported(r2, r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.Tracks.FIELD_TRACK_GROUPS
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks$Group> r2 = r3.groups
            java.util.ArrayList r2 = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(r2)
            r0.putParcelableArrayList(r1, r2)
            return r0
    }
}
