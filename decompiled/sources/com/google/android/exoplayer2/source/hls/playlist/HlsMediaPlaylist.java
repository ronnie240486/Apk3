package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaPlaylist extends com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.drm.DrmInitData protectionSchemes;
    public final java.util.Map<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.RenditionReport> renditionReports;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment> segments;
    public final com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part> trailingParts;
    public final int version;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Part extends com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(java.lang.String r18, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment r19, long r20, int r22, long r23, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r25, @androidx.annotation.Nullable java.lang.String r26, @androidx.annotation.Nullable java.lang.String r27, long r28, long r30, boolean r32, boolean r33, boolean r34) {
                r17 = this;
                r15 = r17
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                r5 = r22
                r6 = r23
                r8 = r25
                r9 = r26
                r10 = r27
                r11 = r28
                r13 = r30
                r15 = r32
                r16 = 0
                r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r15, r16)
                r1 = r33
                r0.isIndependent = r1
                r1 = r34
                r0.isPreload = r1
                return
        }

        public com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part copyWith(long r21, int r23) {
                r20 = this;
                r0 = r20
                r7 = r21
                r6 = r23
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r19 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part
                r1 = r19
                java.lang.String r2 = r0.url
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r3 = r0.initializationSegment
                long r4 = r0.durationUs
                com.google.android.exoplayer2.drm.DrmInitData r9 = r0.drmInitData
                java.lang.String r10 = r0.fullSegmentEncryptionKeyUri
                java.lang.String r11 = r0.encryptionIV
                long r12 = r0.byteRangeOffset
                long r14 = r0.byteRangeLength
                r21 = r1
                boolean r1 = r0.hasGapTag
                r16 = r1
                boolean r1 = r0.isIndependent
                r17 = r1
                boolean r1 = r0.isPreload
                r18 = r1
                r1 = r21
                r1.<init>(r2, r3, r4, r6, r7, r9, r10, r11, r12, r14, r16, r17, r18)
                return r19
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final android.net.Uri playlistUri;

        public RenditionReport(android.net.Uri r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.playlistUri = r1
                r0.lastMediaSequence = r2
                r0.lastPartIndex = r4
                return
        }
    }

    public static final class Segment extends com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.SegmentBase {
        public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part> parts;
        public final java.lang.String title;

        public Segment(java.lang.String r19, long r20, long r22, @androidx.annotation.Nullable java.lang.String r24, @androidx.annotation.Nullable java.lang.String r25) {
                r18 = this;
                r0 = r18
                r1 = r19
                r12 = r20
                r14 = r22
                r10 = r24
                r11 = r25
                com.google.common.collect.ImmutableList r17 = com.google.common.collect.ImmutableList.of()
                r2 = 0
                java.lang.String r3 = ""
                r4 = 0
                r6 = -1
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = 0
                r16 = 0
                r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r14, r16, r17)
                return
        }

        public Segment(java.lang.String r18, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment r19, java.lang.String r20, long r21, int r23, long r24, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r26, @androidx.annotation.Nullable java.lang.String r27, @androidx.annotation.Nullable java.lang.String r28, long r29, long r31, boolean r33, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part> r34) {
                r17 = this;
                r15 = r17
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r21
                r5 = r23
                r6 = r24
                r8 = r26
                r9 = r27
                r10 = r28
                r11 = r29
                r13 = r31
                r15 = r33
                r16 = 0
                r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r15, r16)
                r1 = r20
                r0.title = r1
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r34)
                r0.parts = r1
                return
        }

        public com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment copyWith(long r21, int r23) {
                r20 = this;
                r0 = r20
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r1 = 0
                r2 = r21
            La:
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r4 = r0.parts
                int r4 = r4.size()
                if (r1 >= r4) goto L29
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r4 = r0.parts
                java.lang.Object r4 = r4.get(r1)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r4 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r4
                r7 = r23
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r5 = r4.copyWith(r2, r7)
                r8.add(r5)
                long r4 = r4.durationUs
                long r2 = r2 + r4
                int r1 = r1 + 1
                goto La
            L29:
                r7 = r23
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r19 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
                r1 = r19
                java.lang.String r2 = r0.url
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r3 = r0.initializationSegment
                java.lang.String r4 = r0.title
                long r5 = r0.durationUs
                com.google.android.exoplayer2.drm.DrmInitData r10 = r0.drmInitData
                java.lang.String r11 = r0.fullSegmentEncryptionKeyUri
                java.lang.String r12 = r0.encryptionIV
                long r13 = r0.byteRangeOffset
                r9 = r8
                long r7 = r0.byteRangeLength
                r15 = r7
                boolean r7 = r0.hasGapTag
                r17 = r7
                r7 = r23
                r18 = r9
                r8 = r21
                r1.<init>(r2, r3, r4, r5, r7, r8, r10, r11, r12, r13, r15, r17, r18)
                return r19
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SegmentBase implements java.lang.Comparable<java.lang.Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        public final long durationUs;

        @androidx.annotation.Nullable
        public final java.lang.String encryptionIV;

        @androidx.annotation.Nullable
        public final java.lang.String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final java.lang.String url;

        private SegmentBase(java.lang.String r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment r2, long r3, int r5, long r6, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10, long r11, long r13, boolean r15) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                r0.initializationSegment = r2
                r0.durationUs = r3
                r0.relativeDiscontinuitySequence = r5
                r0.relativeStartTimeUs = r6
                r0.drmInitData = r8
                r0.fullSegmentEncryptionKeyUri = r9
                r0.encryptionIV = r10
                r0.byteRangeOffset = r11
                r0.byteRangeLength = r13
                r0.hasGapTag = r15
                return
        }

        public /* synthetic */ SegmentBase(java.lang.String r1, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment r2, long r3, int r5, long r6, com.google.android.exoplayer2.drm.DrmInitData r8, java.lang.String r9, java.lang.String r10, long r11, long r13, boolean r15, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.AnonymousClass1 r16) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r15)
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(java.lang.Long r6) {
                r5 = this;
                long r0 = r5.relativeStartTimeUs
                long r2 = r6.longValue()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Lc
                r6 = 1
                goto L19
            Lc:
                long r0 = r5.relativeStartTimeUs
                long r2 = r6.longValue()
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 >= 0) goto L18
                r6 = -1
                goto L19
            L18:
                r6 = 0
            L19:
                return r6
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Long r1) {
                r0 = this;
                java.lang.Long r1 = (java.lang.Long) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long r1, boolean r3, long r4, long r6, boolean r8) {
                r0 = this;
                r0.<init>()
                r0.skipUntilUs = r1
                r0.canSkipDateRanges = r3
                r0.holdBackUs = r4
                r0.partHoldBackUs = r6
                r0.canBlockReload = r8
                return
        }
    }

    public HlsMediaPlaylist(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r31, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment> r32, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part> r33, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.ServerControl r34, java.util.Map<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.RenditionReport> r35) {
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.playlistType = r3
            r3 = r17
            r0.startTimeUs = r3
            r3 = r16
            r0.preciseStart = r3
            r3 = r19
            r0.hasDiscontinuitySequence = r3
            r3 = r20
            r0.discontinuitySequence = r3
            r3 = r21
            r0.mediaSequence = r3
            r3 = r23
            r0.version = r3
            r3 = r24
            r0.targetDurationUs = r3
            r3 = r26
            r0.partTargetDurationUs = r3
            r3 = r29
            r0.hasEndTag = r3
            r3 = r30
            r0.hasProgramDateTime = r3
            r3 = r31
            r0.protectionSchemes = r3
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r32)
            r0.segments = r3
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r33)
            r0.trailingParts = r3
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r35)
            r0.renditionReports = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = com.google.common.collect.Iterables.getLast(r33)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r3 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r3
            long r6 = r3.relativeStartTimeUs
            long r8 = r3.durationUs
            long r6 = r6 + r8
            r0.durationUs = r6
            goto L76
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L74
            java.lang.Object r3 = com.google.common.collect.Iterables.getLast(r32)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r3 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r3
            long r6 = r3.relativeStartTimeUs
            long r8 = r3.durationUs
            long r6 = r6 + r8
            r0.durationUs = r6
            goto L76
        L74:
            r0.durationUs = r4
        L76:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L80
            goto L92
        L80:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L8b
            long r6 = r0.durationUs
            long r6 = java.lang.Math.min(r6, r14)
            goto L92
        L8b:
            long r6 = r0.durationUs
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L92:
            r0.startOffsetUs = r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L9a
            r1 = 1
            goto L9b
        L9a:
            r1 = 0
        L9b:
            r0.hasPositiveStartOffset = r1
            r1 = r34
            r0.serverControl = r1
            return
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist copy(java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1) {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist copy2(java.util.List r1) {
            r0 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = r0.copy(r1)
            return r1
    }

    public com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist copyWith(long r29, int r31) {
            r28 = this;
            r0 = r28
            r8 = r29
            r11 = r31
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r27 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
            r1 = r27
            int r2 = r0.playlistType
            java.lang.String r3 = r0.baseUri
            java.util.List<java.lang.String> r4 = r0.tags
            long r5 = r0.startOffsetUs
            boolean r7 = r0.preciseStart
            long r12 = r0.mediaSequence
            int r14 = r0.version
            r29 = r1
            r30 = r2
            long r1 = r0.targetDurationUs
            r15 = r1
            long r1 = r0.partTargetDurationUs
            r17 = r1
            boolean r1 = r0.hasIndependentSegments
            r19 = r1
            boolean r1 = r0.hasEndTag
            r20 = r1
            boolean r1 = r0.hasProgramDateTime
            r21 = r1
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.protectionSchemes
            r22 = r1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r0.segments
            r23 = r1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r1 = r0.trailingParts
            r24 = r1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r1 = r0.serverControl
            r25 = r1
            java.util.Map<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport> r1 = r0.renditionReports
            r26 = r1
            r10 = 1
            r1 = r29
            r2 = r30
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r11, r12, r14, r15, r17, r19, r20, r21, r22, r23, r24, r25, r26)
            return r27
    }

    public com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist copyWithEndTag() {
            r30 = this;
            r0 = r30
            boolean r1 = r0.hasEndTag
            if (r1 == 0) goto L7
            return r0
        L7:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
            r2 = r1
            int r3 = r0.playlistType
            java.lang.String r4 = r0.baseUri
            java.util.List<java.lang.String> r5 = r0.tags
            long r6 = r0.startOffsetUs
            boolean r8 = r0.preciseStart
            long r9 = r0.startTimeUs
            boolean r11 = r0.hasDiscontinuitySequence
            int r12 = r0.discontinuitySequence
            long r13 = r0.mediaSequence
            int r15 = r0.version
            r28 = r1
            r29 = r2
            long r1 = r0.targetDurationUs
            r16 = r1
            long r1 = r0.partTargetDurationUs
            r18 = r1
            boolean r1 = r0.hasIndependentSegments
            r20 = r1
            r21 = 1
            boolean r1 = r0.hasProgramDateTime
            r22 = r1
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.protectionSchemes
            r23 = r1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r0.segments
            r24 = r1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r1 = r0.trailingParts
            r25 = r1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r1 = r0.serverControl
            r26 = r1
            java.util.Map<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport> r1 = r0.renditionReports
            r27 = r1
            r2 = r29
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r12, r13, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            return r28
    }

    public long getEndTimeUs() {
            r4 = this;
            long r0 = r4.startTimeUs
            long r2 = r4.durationUs
            long r0 = r0 + r2
            return r0
    }

    public boolean isNewerThan(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r8) {
            r7 = this;
            r0 = 1
            if (r8 == 0) goto L40
            long r1 = r7.mediaSequence
            long r3 = r8.mediaSequence
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto Lc
            goto L40
        Lc:
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L12
            return r5
        L12:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r7.segments
            int r1 = r1.size()
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r2 = r8.segments
            int r2 = r2.size()
            int r1 = r1 - r2
            if (r1 == 0) goto L26
            if (r1 <= 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r1 = r7.trailingParts
            int r1 = r1.size()
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r2 = r8.trailingParts
            int r2 = r2.size()
            if (r1 > r2) goto L40
            if (r1 != r2) goto L3f
            boolean r1 = r7.hasEndTag
            if (r1 == 0) goto L3f
            boolean r8 = r8.hasEndTag
            if (r8 != 0) goto L3f
            goto L40
        L3f:
            r0 = 0
        L40:
            return r0
    }
}
