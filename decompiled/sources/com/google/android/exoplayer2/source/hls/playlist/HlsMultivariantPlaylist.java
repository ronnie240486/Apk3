package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes2.dex */
public class HlsMultivariantPlaylist extends com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist {
    public static final com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist EMPTY = null;
    public static final int GROUP_INDEX_AUDIO = 1;
    public static final int GROUP_INDEX_SUBTITLE = 2;
    public static final int GROUP_INDEX_VARIANT = 0;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> audios;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> closedCaptions;
    public final java.util.List<android.net.Uri> mediaPlaylistUrls;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.Format muxedAudioFormat;

    @androidx.annotation.Nullable
    public final java.util.List<com.google.android.exoplayer2.Format> muxedCaptionFormats;
    public final java.util.List<com.google.android.exoplayer2.drm.DrmInitData> sessionKeyDrmInitData;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> subtitles;
    public final java.util.Map<java.lang.String, java.lang.String> variableDefinitions;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant> variants;
    public final java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> videos;

    public static final class Rendition {
        public final com.google.android.exoplayer2.Format format;
        public final java.lang.String groupId;
        public final java.lang.String name;

        @androidx.annotation.Nullable
        public final android.net.Uri url;

        public Rendition(@androidx.annotation.Nullable android.net.Uri r1, com.google.android.exoplayer2.Format r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                r0.format = r2
                r0.groupId = r3
                r0.name = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Variant {

        @androidx.annotation.Nullable
        public final java.lang.String audioGroupId;

        @androidx.annotation.Nullable
        public final java.lang.String captionGroupId;
        public final com.google.android.exoplayer2.Format format;

        @androidx.annotation.Nullable
        public final java.lang.String subtitleGroupId;
        public final android.net.Uri url;

        @androidx.annotation.Nullable
        public final java.lang.String videoGroupId;

        public Variant(android.net.Uri r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.lang.String r6) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                r0.format = r2
                r0.videoGroupId = r3
                r0.audioGroupId = r4
                r0.subtitleGroupId = r5
                r0.captionGroupId = r6
                return
        }

        public static com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant createMediaPlaylistVariantUrl(android.net.Uri r8) {
                com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
                r0.<init>()
                java.lang.String r1 = "0"
                com.google.android.exoplayer2.Format$Builder r0 = r0.setId(r1)
                java.lang.String r1 = "application/x-mpegURL"
                com.google.android.exoplayer2.Format$Builder r0 = r0.setContainerMimeType(r1)
                com.google.android.exoplayer2.Format r3 = r0.build()
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r1 = r0
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant copyWithFormat(com.google.android.exoplayer2.Format r9) {
                r8 = this;
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r7 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant
                android.net.Uri r1 = r8.url
                java.lang.String r3 = r8.videoGroupId
                java.lang.String r4 = r8.audioGroupId
                java.lang.String r5 = r8.subtitleGroupId
                java.lang.String r6 = r8.captionGroupId
                r0 = r7
                r2 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    static {
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r13 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.Map r11 = java.util.Collections.emptyMap()
            java.util.List r12 = java.util.Collections.emptyList()
            java.lang.String r1 = ""
            r8 = 0
            r10 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.EMPTY = r13
            return
    }

    public HlsMultivariantPlaylist(java.lang.String r1, java.util.List<java.lang.String> r2, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant> r3, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r4, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r5, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r6, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r7, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r8, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r9, boolean r10, java.util.Map<java.lang.String, java.lang.String> r11, java.util.List<com.google.android.exoplayer2.drm.DrmInitData> r12) {
            r0 = this;
            r0.<init>(r1, r2, r10)
            java.util.List r1 = getMediaPlaylistUrls(r3, r4, r5, r6, r7)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.mediaPlaylistUrls = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.variants = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.videos = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.audios = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r6)
            r0.subtitles = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r7)
            r0.closedCaptions = r1
            r0.muxedAudioFormat = r8
            if (r9 == 0) goto L34
            java.util.List r1 = java.util.Collections.unmodifiableList(r9)
            goto L35
        L34:
            r1 = 0
        L35:
            r0.muxedCaptionFormats = r1
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r11)
            r0.variableDefinitions = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r12)
            r0.sessionKeyDrmInitData = r1
            return
    }

    private static void addMediaPlaylistUrls(java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r3, java.util.List<android.net.Uri> r4) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L1d
            java.lang.Object r1 = r3.get(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition) r1
            android.net.Uri r1 = r1.url
            if (r1 == 0) goto L1a
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L1a
            r4.add(r1)
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    private static <T> java.util.List<T> copyStreams(java.util.List<T> r7, int r8, java.util.List<com.google.android.exoplayer2.offline.StreamKey> r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r7.size()
            if (r2 >= r3) goto L34
            java.lang.Object r3 = r7.get(r2)
            r4 = 0
        L16:
            int r5 = r9.size()
            if (r4 >= r5) goto L31
            java.lang.Object r5 = r9.get(r4)
            com.google.android.exoplayer2.offline.StreamKey r5 = (com.google.android.exoplayer2.offline.StreamKey) r5
            int r6 = r5.groupIndex
            if (r6 != r8) goto L2e
            int r5 = r5.streamIndex
            if (r5 != r2) goto L2e
            r0.add(r3)
            goto L31
        L2e:
            int r4 = r4 + 1
            goto L16
        L31:
            int r2 = r2 + 1
            goto Lb
        L34:
            return r0
    }

    public static com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist createSingleVariantMultivariantPlaylist(java.lang.String r13) {
            android.net.Uri r13 = android.net.Uri.parse(r13)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r13 = com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant.createMediaPlaylistVariantUrl(r13)
            java.util.List r3 = java.util.Collections.singletonList(r13)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r13 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.Map r11 = java.util.Collections.emptyMap()
            java.util.List r12 = java.util.Collections.emptyList()
            java.lang.String r1 = ""
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    private static java.util.List<android.net.Uri> getMediaPlaylistUrls(java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant> r4, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r5, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r6, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r7, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r4.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r2
            android.net.Uri r2 = r2.url
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L1d
            r0.add(r2)
        L1d:
            int r1 = r1 + 1
            goto L6
        L20:
            addMediaPlaylistUrls(r5, r0)
            addMediaPlaylistUrls(r6, r0)
            addMediaPlaylistUrls(r7, r0)
            addMediaPlaylistUrls(r8, r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist copy(java.util.List<com.google.android.exoplayer2.offline.StreamKey> r15) {
            r14 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r13 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist
            java.lang.String r1 = r14.baseUri
            java.util.List<java.lang.String> r2 = r14.tags
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r0 = r14.variants
            r3 = 0
            java.util.List r3 = copyStreams(r0, r3, r15)
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r0 = r14.audios
            r5 = 1
            java.util.List r5 = copyStreams(r0, r5, r15)
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r0 = r14.subtitles
            r6 = 2
            java.util.List r6 = copyStreams(r0, r6, r15)
            java.util.List r7 = java.util.Collections.emptyList()
            com.google.android.exoplayer2.Format r8 = r14.muxedAudioFormat
            java.util.List<com.google.android.exoplayer2.Format> r9 = r14.muxedCaptionFormats
            boolean r10 = r14.hasIndependentSegments
            java.util.Map<java.lang.String, java.lang.String> r11 = r14.variableDefinitions
            java.util.List<com.google.android.exoplayer2.drm.DrmInitData> r12 = r14.sessionKeyDrmInitData
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist copy2(java.util.List r1) {
            r0 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = r0.copy(r1)
            return r1
    }
}
