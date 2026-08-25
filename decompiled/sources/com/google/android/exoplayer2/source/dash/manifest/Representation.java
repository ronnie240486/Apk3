package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> baseUrls;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> essentialProperties;
    public final com.google.android.exoplayer2.Format format;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> inbandEventStreams;
    private final com.google.android.exoplayer2.source.dash.manifest.RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;
    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> supplementalProperties;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.manifest.Representation$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class MultiSegmentRepresentation extends com.google.android.exoplayer2.source.dash.manifest.Representation implements com.google.android.exoplayer2.source.dash.DashSegmentIndex {

        @androidx.annotation.VisibleForTesting
        public final com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(long r11, com.google.android.exoplayer2.Format r13, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r14, com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase r15, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r16, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r17, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r18) {
                r10 = this;
                r9 = 0
                r0 = r10
                r1 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r8 = r18
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
                r1 = r15
                r0.segmentBase = r1
                return
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getAvailableSegmentCount(r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @androidx.annotation.Nullable
        public java.lang.String getCacheKey() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getDurationUs(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getSegmentDurationUs(r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getFirstAvailableSegmentNum(r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
                r2 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r2.segmentBase
                long r0 = r0.getFirstSegmentNum()
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public com.google.android.exoplayer2.source.dash.DashSegmentIndex getIndex() {
                r0 = this;
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getIndexUri() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getNextSegmentAvailableTimeUs(r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentCount(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getSegmentCount(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentNum(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getSegmentNum(r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r0.getSegmentUrl(r1, r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getTimeUs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                long r2 = r0.getSegmentTimeUs(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public boolean isExplicit() {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r0 = r1.segmentBase
                boolean r0 = r0.isExplicit()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SingleSegmentRepresentation extends com.google.android.exoplayer2.source.dash.manifest.Representation {

        @androidx.annotation.Nullable
        private final java.lang.String cacheKey;
        public final long contentLength;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.source.dash.manifest.RangedUri indexUri;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.source.dash.manifest.SingleSegmentIndex segmentIndex;
        public final android.net.Uri uri;

        public SingleSegmentRepresentation(long r12, com.google.android.exoplayer2.Format r14, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r15, com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase r16, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r17, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r18, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r19, @androidx.annotation.Nullable java.lang.String r20, long r21) {
                r11 = this;
                r10 = r11
                r9 = 0
                r0 = r11
                r1 = r12
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
                r0 = 0
                r1 = r15
                java.lang.Object r0 = r15.get(r0)
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r0 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r0
                java.lang.String r0 = r0.url
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r10.uri = r0
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r16.getIndex()
                r10.indexUri = r0
                r1 = r20
                r10.cacheKey = r1
                r1 = r21
                r10.contentLength = r1
                if (r0 == 0) goto L33
                r0 = 0
                goto L45
            L33:
                com.google.android.exoplayer2.source.dash.manifest.SingleSegmentIndex r0 = new com.google.android.exoplayer2.source.dash.manifest.SingleSegmentIndex
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r3 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
                r4 = 0
                r5 = 0
                r12 = r3
                r13 = r4
                r14 = r5
                r16 = r21
                r12.<init>(r13, r14, r16)
                r0.<init>(r3)
            L45:
                r10.segmentIndex = r0
                return
        }

        public static com.google.android.exoplayer2.source.dash.manifest.Representation.SingleSegmentRepresentation newInstance(long r21, com.google.android.exoplayer2.Format r23, java.lang.String r24, long r25, long r27, long r29, long r31, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r33, @androidx.annotation.Nullable java.lang.String r34, long r35) {
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
                long r0 = r27 - r25
                r7 = 1
                long r4 = r0 + r7
                r1 = 0
                r0 = r6
                r2 = r25
                r0.<init>(r1, r2, r4)
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r14 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase
                long r0 = r31 - r29
                long r8 = r0 + r7
                r2 = 1
                r4 = 0
                r0 = r14
                r1 = r6
                r6 = r29
                r0.<init>(r1, r2, r4, r6, r8)
                com.google.android.exoplayer2.source.dash.manifest.BaseUrl r0 = new com.google.android.exoplayer2.source.dash.manifest.BaseUrl
                r1 = r24
                r0.<init>(r1)
                com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r0)
                com.google.android.exoplayer2.source.dash.manifest.Representation$SingleSegmentRepresentation r0 = new com.google.android.exoplayer2.source.dash.manifest.Representation$SingleSegmentRepresentation
                com.google.common.collect.ImmutableList r16 = com.google.common.collect.ImmutableList.of()
                com.google.common.collect.ImmutableList r17 = com.google.common.collect.ImmutableList.of()
                r9 = r0
                r10 = r21
                r12 = r23
                r15 = r33
                r18 = r34
                r19 = r35
                r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @androidx.annotation.Nullable
        public java.lang.String getCacheKey() {
                r1 = this;
                java.lang.String r0 = r1.cacheKey
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.dash.DashSegmentIndex getIndex() {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.SingleSegmentIndex r0 = r1.segmentIndex
                return r0
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getIndexUri() {
                r1 = this;
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r1.indexUri
                return r0
        }
    }

    private Representation(long r2, com.google.android.exoplayer2.Format r4, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r5, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r6, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r7, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r8, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r9) {
            r1 = this;
            r1.<init>()
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.revisionId = r2
            r1.format = r4
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r5)
            r1.baseUrls = r2
            if (r7 != 0) goto L1d
            java.util.List r2 = java.util.Collections.emptyList()
            goto L21
        L1d:
            java.util.List r2 = java.util.Collections.unmodifiableList(r7)
        L21:
            r1.inbandEventStreams = r2
            r1.essentialProperties = r8
            r1.supplementalProperties = r9
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r6.getInitialization(r1)
            r1.initializationUri = r2
            long r2 = r6.getPresentationTimeOffsetUs()
            r1.presentationTimeOffsetUs = r2
            return
    }

    public /* synthetic */ Representation(long r1, com.google.android.exoplayer2.Format r3, java.util.List r4, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r5, java.util.List r6, java.util.List r7, java.util.List r8, com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1 r9) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
    }

    public static com.google.android.exoplayer2.source.dash.manifest.Representation newInstance(long r9, com.google.android.exoplayer2.Format r11, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r12, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r13) {
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of()
            r5 = 0
            r8 = 0
            r0 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            com.google.android.exoplayer2.source.dash.manifest.Representation r9 = newInstance(r0, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static com.google.android.exoplayer2.source.dash.manifest.Representation newInstance(long r14, com.google.android.exoplayer2.Format r16, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r17, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r18, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r19, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r20, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r21, @androidx.annotation.Nullable java.lang.String r22) {
            r0 = r18
            boolean r1 = r0 instanceof com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase
            if (r1 == 0) goto L1f
            com.google.android.exoplayer2.source.dash.manifest.Representation$SingleSegmentRepresentation r1 = new com.google.android.exoplayer2.source.dash.manifest.Representation$SingleSegmentRepresentation
            r7 = r0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r7 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r7
            r12 = -1
            r2 = r1
            r3 = r14
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L1f:
            boolean r1 = r0 instanceof com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
            if (r1 == 0) goto L38
            com.google.android.exoplayer2.source.dash.manifest.Representation$MultiSegmentRepresentation r1 = new com.google.android.exoplayer2.source.dash.manifest.Representation$MultiSegmentRepresentation
            r7 = r0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$MultiSegmentBase r7 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase) r7
            r2 = r1
            r3 = r14
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            return r1
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public abstract java.lang.String getCacheKey();

    @androidx.annotation.Nullable
    public abstract com.google.android.exoplayer2.source.dash.DashSegmentIndex getIndex();

    @androidx.annotation.Nullable
    public abstract com.google.android.exoplayer2.source.dash.manifest.RangedUri getIndexUri();

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.dash.manifest.RangedUri getInitializationUri() {
            r1 = this;
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r1.initializationUri
            return r0
    }
}
