package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class MediaItem implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem> CREATOR = null;
    public static final java.lang.String DEFAULT_MEDIA_ID = "";
    public static final com.google.android.exoplayer2.MediaItem EMPTY = null;
    private static final java.lang.String FIELD_CLIPPING_PROPERTIES = null;
    private static final java.lang.String FIELD_LIVE_CONFIGURATION = null;
    private static final java.lang.String FIELD_MEDIA_ID = null;
    private static final java.lang.String FIELD_MEDIA_METADATA = null;
    private static final java.lang.String FIELD_REQUEST_METADATA = null;
    public final com.google.android.exoplayer2.MediaItem.ClippingConfiguration clippingConfiguration;

    @java.lang.Deprecated
    public final com.google.android.exoplayer2.MediaItem.ClippingProperties clippingProperties;
    public final com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    public final java.lang.String mediaId;
    public final com.google.android.exoplayer2.MediaMetadata mediaMetadata;

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public final com.google.android.exoplayer2.MediaItem.PlaybackProperties playbackProperties;
    public final com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.MediaItem$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AdsConfiguration {
        public final android.net.Uri adTagUri;

        @androidx.annotation.Nullable
        public final java.lang.Object adsId;

        /* JADX INFO: loaded from: classes.dex */
        public static final class Builder {
            private android.net.Uri adTagUri;

            @androidx.annotation.Nullable
            private java.lang.Object adsId;

            public Builder(android.net.Uri r1) {
                    r0 = this;
                    r0.<init>()
                    r0.adTagUri = r1
                    return
            }

            public static /* synthetic */ android.net.Uri access$1600(com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder r0) {
                    android.net.Uri r0 = r0.adTagUri
                    return r0
            }

            public static /* synthetic */ java.lang.Object access$1700(com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder r0) {
                    java.lang.Object r0 = r0.adsId
                    return r0
            }

            public com.google.android.exoplayer2.MediaItem.AdsConfiguration build() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$AdsConfiguration r0 = new com.google.android.exoplayer2.MediaItem$AdsConfiguration
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder setAdTagUri(android.net.Uri r1) {
                    r0 = this;
                    r0.adTagUri = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder setAdsId(@androidx.annotation.Nullable java.lang.Object r1) {
                    r0 = this;
                    r0.adsId = r1
                    return r0
            }
        }

        private AdsConfiguration(com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder r2) {
                r1 = this;
                r1.<init>()
                android.net.Uri r0 = com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder.access$1600(r2)
                r1.adTagUri = r0
                java.lang.Object r2 = com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder.access$1700(r2)
                r1.adsId = r2
                return
        }

        public /* synthetic */ AdsConfiguration(com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$AdsConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$AdsConfiguration$Builder
                android.net.Uri r1 = r2.adTagUri
                r0.<init>(r1)
                java.lang.Object r1 = r2.adsId
                com.google.android.exoplayer2.MediaItem$AdsConfiguration$Builder r0 = r0.setAdsId(r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.MediaItem.AdsConfiguration
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r5 = (com.google.android.exoplayer2.MediaItem.AdsConfiguration) r5
                android.net.Uri r1 = r4.adTagUri
                android.net.Uri r3 = r5.adTagUri
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                java.lang.Object r1 = r4.adsId
                java.lang.Object r5 = r5.adsId
                boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r1, r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                android.net.Uri r0 = r2.adTagUri
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object r1 = r2.adsId
                if (r1 == 0) goto L11
                int r1 = r1.hashCode()
                goto L12
            L11:
                r1 = 0
            L12:
                int r0 = r0 + r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration;
        private com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder clippingConfiguration;

        @androidx.annotation.Nullable
        private java.lang.String customCacheKey;
        private com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder drmConfiguration;
        private com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder liveConfiguration;

        @androidx.annotation.Nullable
        private java.lang.String mediaId;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.MediaMetadata mediaMetadata;

        @androidx.annotation.Nullable
        private java.lang.String mimeType;
        private com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata;
        private java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;
        private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> subtitleConfigurations;

        @androidx.annotation.Nullable
        private java.lang.Object tag;

        @androidx.annotation.Nullable
        private android.net.Uri uri;

        public Builder() {
                r2 = this;
                r2.<init>()
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder
                r0.<init>()
                r2.clippingConfiguration = r0
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder
                r1 = 0
                r0.<init>(r1)
                r2.drmConfiguration = r0
                java.util.List r0 = java.util.Collections.emptyList()
                r2.streamKeys = r0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
                r2.subtitleConfigurations = r0
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder
                r0.<init>()
                r2.liveConfiguration = r0
                com.google.android.exoplayer2.MediaItem$RequestMetadata r0 = com.google.android.exoplayer2.MediaItem.RequestMetadata.EMPTY
                r2.requestMetadata = r0
                return
        }

        private Builder(com.google.android.exoplayer2.MediaItem r3) {
                r2 = this;
                r2.<init>()
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration r0 = r3.clippingConfiguration
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r0.buildUpon()
                r2.clippingConfiguration = r0
                java.lang.String r0 = r3.mediaId
                r2.mediaId = r0
                com.google.android.exoplayer2.MediaMetadata r0 = r3.mediaMetadata
                r2.mediaMetadata = r0
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r3.liveConfiguration
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r0.buildUpon()
                r2.liveConfiguration = r0
                com.google.android.exoplayer2.MediaItem$RequestMetadata r0 = r3.requestMetadata
                r2.requestMetadata = r0
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r3 = r3.localConfiguration
                if (r3 == 0) goto L50
                java.lang.String r0 = r3.customCacheKey
                r2.customCacheKey = r0
                java.lang.String r0 = r3.mimeType
                r2.mimeType = r0
                android.net.Uri r0 = r3.uri
                r2.uri = r0
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r0 = r3.streamKeys
                r2.streamKeys = r0
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r0 = r3.subtitleConfigurations
                r2.subtitleConfigurations = r0
                java.lang.Object r0 = r3.tag
                r2.tag = r0
                com.google.android.exoplayer2.MediaItem$DrmConfiguration r0 = r3.drmConfiguration
                if (r0 == 0) goto L44
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r0.buildUpon()
                goto L4a
            L44:
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder
                r1 = 0
                r0.<init>(r1)
            L4a:
                r2.drmConfiguration = r0
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r3 = r3.adsConfiguration
                r2.adsConfiguration = r3
            L50:
                return
        }

        public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.MediaItem build() {
                r21 = this;
                r0 = r21
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r1 = r0.drmConfiguration
                android.net.Uri r1 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$200(r1)
                if (r1 == 0) goto L15
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r1 = r0.drmConfiguration
                java.util.UUID r1 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$300(r1)
                if (r1 == 0) goto L13
                goto L15
            L13:
                r1 = 0
                goto L16
            L15:
                r1 = 1
            L16:
                com.google.android.exoplayer2.util.Assertions.checkState(r1)
                android.net.Uri r3 = r0.uri
                r1 = 0
                if (r3 == 0) goto L43
                com.google.android.exoplayer2.MediaItem$PlaybackProperties r12 = new com.google.android.exoplayer2.MediaItem$PlaybackProperties
                java.lang.String r4 = r0.mimeType
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r2 = r0.drmConfiguration
                java.util.UUID r2 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$300(r2)
                if (r2 == 0) goto L30
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r1 = r0.drmConfiguration
                com.google.android.exoplayer2.MediaItem$DrmConfiguration r1 = r1.build()
            L30:
                r5 = r1
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r6 = r0.adsConfiguration
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r7 = r0.streamKeys
                java.lang.String r8 = r0.customCacheKey
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r9 = r0.subtitleConfigurations
                java.lang.Object r10 = r0.tag
                r11 = 0
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r16 = r12
                goto L45
            L43:
                r16 = r1
            L45:
                com.google.android.exoplayer2.MediaItem r1 = new com.google.android.exoplayer2.MediaItem
                java.lang.String r2 = r0.mediaId
                if (r2 == 0) goto L4c
                goto L4e
            L4c:
                java.lang.String r2 = ""
            L4e:
                r14 = r2
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r2 = r0.clippingConfiguration
                com.google.android.exoplayer2.MediaItem$ClippingProperties r15 = r2.buildClippingProperties()
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r2 = r0.liveConfiguration
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r17 = r2.build()
                com.google.android.exoplayer2.MediaMetadata r2 = r0.mediaMetadata
                if (r2 == 0) goto L60
                goto L62
            L60:
                com.google.android.exoplayer2.MediaMetadata r2 = com.google.android.exoplayer2.MediaMetadata.EMPTY
            L62:
                r18 = r2
                com.google.android.exoplayer2.MediaItem$RequestMetadata r2 = r0.requestMetadata
                r20 = 0
                r13 = r1
                r19 = r2
                r13.<init>(r14, r15, r16, r17, r18, r19, r20)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setAdTagUri(@androidx.annotation.Nullable android.net.Uri r2) {
                r1 = this;
                r0 = 0
                com.google.android.exoplayer2.MediaItem$Builder r2 = r1.setAdTagUri(r2, r0)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setAdTagUri(@androidx.annotation.Nullable android.net.Uri r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r1 = this;
                if (r2 == 0) goto L10
                com.google.android.exoplayer2.MediaItem$AdsConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$AdsConfiguration$Builder
                r0.<init>(r2)
                com.google.android.exoplayer2.MediaItem$AdsConfiguration$Builder r2 = r0.setAdsId(r3)
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r2 = r2.build()
                goto L11
            L10:
                r2 = 0
            L11:
                r1.adsConfiguration = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setAdTagUri(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                if (r1 == 0) goto L7
                android.net.Uri r1 = android.net.Uri.parse(r1)
                goto L8
            L7:
                r1 = 0
            L8:
                com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setAdTagUri(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setAdsConfiguration(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.AdsConfiguration r1) {
                r0 = this;
                r0.adsConfiguration = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipEndPositionMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r1.clippingConfiguration
                r0.setEndPositionMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipRelativeToDefaultPosition(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r1.clippingConfiguration
                r0.setRelativeToDefaultPosition(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipRelativeToLiveWindow(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r1.clippingConfiguration
                r0.setRelativeToLiveWindow(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipStartPositionMs(@androidx.annotation.IntRange(from = 0) long r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r1.clippingConfiguration
                r0.setStartPositionMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipStartsAtKeyFrame(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r1.clippingConfiguration
                r0.setStartsAtKeyFrame(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setClippingConfiguration(com.google.android.exoplayer2.MediaItem.ClippingConfiguration r1) {
                r0 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r1 = r1.buildUpon()
                r0.clippingConfiguration = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setCustomCacheKey(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.customCacheKey = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setDrmConfiguration(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.DrmConfiguration r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r2 = r2.buildUpon()
                goto Ld
            L7:
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r2 = new com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder
                r0 = 0
                r2.<init>(r0)
            Ld:
                r1.drmConfiguration = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmForceDefaultLicenseUri(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setForceDefaultLicenseUri(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmKeySetId(@androidx.annotation.Nullable byte[] r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setKeySetId(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmLicenseRequestHeaders(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                if (r2 == 0) goto L5
                goto L9
            L5:
                com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of()
            L9:
                r0.setLicenseRequestHeaders(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmLicenseUri(@androidx.annotation.Nullable android.net.Uri r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setLicenseUri(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmLicenseUri(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setLicenseUri(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmMultiSession(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setMultiSession(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmPlayClearContentWithoutKey(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setPlayClearContentWithoutKey(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmSessionForClearPeriods(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                r0.setForceSessionsForAudioAndVideoTracks(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmSessionForClearTypes(@androidx.annotation.Nullable java.util.List<java.lang.Integer> r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                if (r2 == 0) goto L5
                goto L9
            L5:
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            L9:
                r0.setForcedSessionTrackTypes(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmUuid(@androidx.annotation.Nullable java.util.UUID r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r1.drmConfiguration
                com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$100(r0, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setLiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration r1) {
                r0 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r1 = r1.buildUpon()
                r0.liveConfiguration = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMaxOffsetMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r1.liveConfiguration
                r0.setMaxOffsetMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMaxPlaybackSpeed(float r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r1.liveConfiguration
                r0.setMaxPlaybackSpeed(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMinOffsetMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r1.liveConfiguration
                r0.setMinOffsetMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMinPlaybackSpeed(float r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r1.liveConfiguration
                r0.setMinPlaybackSpeed(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveTargetOffsetMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r1.liveConfiguration
                r0.setTargetOffsetMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setMediaId(java.lang.String r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.mediaId = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setMediaMetadata(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                r0.mediaMetadata = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mimeType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setRequestMetadata(com.google.android.exoplayer2.MediaItem.RequestMetadata r1) {
                r0 = this;
                r0.requestMetadata = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setStreamKeys(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2) {
                r1 = this;
                if (r2 == 0) goto L12
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L12
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                java.util.List r2 = java.util.Collections.unmodifiableList(r0)
                goto L16
            L12:
                java.util.List r2 = java.util.Collections.emptyList()
            L16:
                r1.streamKeys = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setSubtitleConfigurations(java.util.List<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> r1) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
                r0.subtitleConfigurations = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setSubtitles(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.MediaItem.Subtitle> r1) {
                r0 = this;
                if (r1 == 0) goto L7
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
                goto Lb
            L7:
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            Lb:
                r0.subtitleConfigurations = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setTag(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                r0.tag = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setUri(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.uri = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaItem.Builder setUri(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.net.Uri r1 = android.net.Uri.parse(r1)
            L8:
                com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setUri(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ClippingConfiguration implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem.ClippingProperties> CREATOR = null;
        private static final java.lang.String FIELD_END_POSITION_MS = null;
        private static final java.lang.String FIELD_RELATIVE_TO_DEFAULT_POSITION = null;
        private static final java.lang.String FIELD_RELATIVE_TO_LIVE_WINDOW = null;
        private static final java.lang.String FIELD_STARTS_AT_KEY_FRAME = null;
        private static final java.lang.String FIELD_START_POSITION_MS = null;
        public static final com.google.android.exoplayer2.MediaItem.ClippingConfiguration UNSET = null;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;

        @androidx.annotation.IntRange(from = 0)
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;

        /* JADX INFO: loaded from: classes.dex */
        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            public Builder() {
                    r2 = this;
                    r2.<init>()
                    r0 = -9223372036854775808
                    r2.endPositionMs = r0
                    return
            }

            private Builder(com.google.android.exoplayer2.MediaItem.ClippingConfiguration r3) {
                    r2 = this;
                    r2.<init>()
                    long r0 = r3.startPositionMs
                    r2.startPositionMs = r0
                    long r0 = r3.endPositionMs
                    r2.endPositionMs = r0
                    boolean r0 = r3.relativeToLiveWindow
                    r2.relativeToLiveWindow = r0
                    boolean r0 = r3.relativeToDefaultPosition
                    r2.relativeToDefaultPosition = r0
                    boolean r3 = r3.startsAtKeyFrame
                    r2.startsAtKeyFrame = r3
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem.ClippingConfiguration r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ long access$3900(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r2) {
                    long r0 = r2.startPositionMs
                    return r0
            }

            public static /* synthetic */ long access$4000(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r2) {
                    long r0 = r2.endPositionMs
                    return r0
            }

            public static /* synthetic */ boolean access$4100(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r0) {
                    boolean r0 = r0.relativeToLiveWindow
                    return r0
            }

            public static /* synthetic */ boolean access$4200(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r0) {
                    boolean r0 = r0.relativeToDefaultPosition
                    return r0
            }

            public static /* synthetic */ boolean access$4300(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r0) {
                    boolean r0 = r0.startsAtKeyFrame
                    return r0
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration build() {
                    r1 = this;
                    com.google.android.exoplayer2.MediaItem$ClippingProperties r0 = r1.buildClippingProperties()
                    return r0
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.MediaItem.ClippingProperties buildClippingProperties() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$ClippingProperties r0 = new com.google.android.exoplayer2.MediaItem$ClippingProperties
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setEndPositionMs(long r4) {
                    r3 = this;
                    r0 = -9223372036854775808
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 == 0) goto Lf
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto Ld
                    goto Lf
                Ld:
                    r0 = 0
                    goto L10
                Lf:
                    r0 = 1
                L10:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r3.endPositionMs = r4
                    return r3
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setRelativeToDefaultPosition(boolean r1) {
                    r0 = this;
                    r0.relativeToDefaultPosition = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setRelativeToLiveWindow(boolean r1) {
                    r0 = this;
                    r0.relativeToLiveWindow = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setStartPositionMs(@androidx.annotation.IntRange(from = 0) long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r3.startPositionMs = r4
                    return r3
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setStartsAtKeyFrame(boolean r1) {
                    r0 = this;
                    r0.startsAtKeyFrame = r1
                    return r0
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$4pyVj5Cp-fNpq6xhvLCIEAFTHF8, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.MediaItem.ClippingProperties m166$r8$lambda$4pyVj5CpfNpq6xhvLCIEAFTHF8(android.os.Bundle r0) {
                com.google.android.exoplayer2.MediaItem$ClippingProperties r0 = lambda$static$0(r0)
                return r0
        }

        static {
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder
                r0.<init>()
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration r0 = r0.build()
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.UNSET = r0
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_START_POSITION_MS = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_END_POSITION_MS = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_RELATIVE_TO_LIVE_WINDOW = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_RELATIVE_TO_DEFAULT_POSITION = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_STARTS_AT_KEY_FRAME = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$8
                com.google.android.exoplayer2.MediaItem.ClippingConfiguration.CREATOR = r0
                return
        }

        private ClippingConfiguration(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r3) {
                r2 = this;
                r2.<init>()
                long r0 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder.access$3900(r3)
                r2.startPositionMs = r0
                long r0 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder.access$4000(r3)
                r2.endPositionMs = r0
                boolean r0 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder.access$4100(r3)
                r2.relativeToLiveWindow = r0
                boolean r0 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder.access$4200(r3)
                r2.relativeToDefaultPosition = r0
                boolean r3 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder.access$4300(r3)
                r2.startsAtKeyFrame = r3
                return
        }

        public /* synthetic */ ClippingConfiguration(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.MediaItem.ClippingProperties lambda$static$0(android.os.Bundle r5) {
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder
                r0.<init>()
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_START_POSITION_MS
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration r2 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.UNSET
                long r3 = r2.startPositionMs
                long r3 = r5.getLong(r1, r3)
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r0.setStartPositionMs(r3)
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_END_POSITION_MS
                long r3 = r2.endPositionMs
                long r3 = r5.getLong(r1, r3)
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r0.setEndPositionMs(r3)
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_RELATIVE_TO_LIVE_WINDOW
                boolean r3 = r2.relativeToLiveWindow
                boolean r1 = r5.getBoolean(r1, r3)
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r0.setRelativeToLiveWindow(r1)
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_RELATIVE_TO_DEFAULT_POSITION
                boolean r3 = r2.relativeToDefaultPosition
                boolean r1 = r5.getBoolean(r1, r3)
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = r0.setRelativeToDefaultPosition(r1)
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_STARTS_AT_KEY_FRAME
                boolean r2 = r2.startsAtKeyFrame
                boolean r5 = r5.getBoolean(r1, r2)
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r5 = r0.setStartsAtKeyFrame(r5)
                com.google.android.exoplayer2.MediaItem$ClippingProperties r5 = r5.buildClippingProperties()
                return r5
        }

        public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.exoplayer2.MediaItem.ClippingConfiguration
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration r8 = (com.google.android.exoplayer2.MediaItem.ClippingConfiguration) r8
                long r3 = r7.startPositionMs
                long r5 = r8.startPositionMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L2f
                long r3 = r7.endPositionMs
                long r5 = r8.endPositionMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L2f
                boolean r1 = r7.relativeToLiveWindow
                boolean r3 = r8.relativeToLiveWindow
                if (r1 != r3) goto L2f
                boolean r1 = r7.relativeToDefaultPosition
                boolean r3 = r8.relativeToDefaultPosition
                if (r1 != r3) goto L2f
                boolean r1 = r7.startsAtKeyFrame
                boolean r8 = r8.startsAtKeyFrame
                if (r1 != r8) goto L2f
                goto L30
            L2f:
                r0 = 0
            L30:
                return r0
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.startPositionMs
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.endPositionMs
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r7.relativeToLiveWindow
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r7.relativeToDefaultPosition
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r7.startsAtKeyFrame
                int r1 = r1 + r0
                return r1
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r7 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                long r1 = r7.startPositionMs
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration r3 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.UNSET
                long r4 = r3.startPositionMs
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L14
                java.lang.String r4 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_START_POSITION_MS
                r0.putLong(r4, r1)
            L14:
                long r1 = r7.endPositionMs
                long r4 = r3.endPositionMs
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L21
                java.lang.String r4 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_END_POSITION_MS
                r0.putLong(r4, r1)
            L21:
                boolean r1 = r7.relativeToLiveWindow
                boolean r2 = r3.relativeToLiveWindow
                if (r1 == r2) goto L2c
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_RELATIVE_TO_LIVE_WINDOW
                r0.putBoolean(r2, r1)
            L2c:
                boolean r1 = r7.relativeToDefaultPosition
                boolean r2 = r3.relativeToDefaultPosition
                if (r1 == r2) goto L37
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_RELATIVE_TO_DEFAULT_POSITION
                r0.putBoolean(r2, r1)
            L37:
                boolean r1 = r7.startsAtKeyFrame
                boolean r2 = r3.startsAtKeyFrame
                if (r1 == r2) goto L42
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.FIELD_STARTS_AT_KEY_FRAME
                r0.putBoolean(r2, r1)
            L42:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public static final class ClippingProperties extends com.google.android.exoplayer2.MediaItem.ClippingConfiguration {
        public static final com.google.android.exoplayer2.MediaItem.ClippingProperties UNSET = null;

        static {
                com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$ClippingConfiguration$Builder
                r0.<init>()
                com.google.android.exoplayer2.MediaItem$ClippingProperties r0 = r0.buildClippingProperties()
                com.google.android.exoplayer2.MediaItem.ClippingProperties.UNSET = r0
                return
        }

        private ClippingProperties(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public /* synthetic */ ClippingProperties(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;

        @androidx.annotation.Nullable
        private final byte[] keySetId;
        public final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> licenseRequestHeaders;

        @androidx.annotation.Nullable
        public final android.net.Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> requestHeaders;
        public final java.util.UUID scheme;

        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableList<java.lang.Integer> sessionForClearTypes;

        @java.lang.Deprecated
        public final java.util.UUID uuid;

        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;

            @androidx.annotation.Nullable
            private byte[] keySetId;
            private com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> licenseRequestHeaders;

            @androidx.annotation.Nullable
            private android.net.Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;

            @androidx.annotation.Nullable
            private java.util.UUID scheme;

            @java.lang.Deprecated
            private Builder() {
                    r1 = this;
                    r1.<init>()
                    com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
                    r1.licenseRequestHeaders = r0
                    com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
                    r1.forcedSessionTrackTypes = r0
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private Builder(com.google.android.exoplayer2.MediaItem.DrmConfiguration r2) {
                    r1 = this;
                    r1.<init>()
                    java.util.UUID r0 = r2.scheme
                    r1.scheme = r0
                    android.net.Uri r0 = r2.licenseUri
                    r1.licenseUri = r0
                    com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r0 = r2.licenseRequestHeaders
                    r1.licenseRequestHeaders = r0
                    boolean r0 = r2.multiSession
                    r1.multiSession = r0
                    boolean r0 = r2.playClearContentWithoutKey
                    r1.playClearContentWithoutKey = r0
                    boolean r0 = r2.forceDefaultLicenseUri
                    r1.forceDefaultLicenseUri = r0
                    com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r2.forcedSessionTrackTypes
                    r1.forcedSessionTrackTypes = r0
                    byte[] r2 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.access$600(r2)
                    r1.keySetId = r2
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem.DrmConfiguration r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public Builder(java.util.UUID r1) {
                    r0 = this;
                    r0.<init>()
                    r0.scheme = r1
                    com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
                    r0.licenseRequestHeaders = r1
                    com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
                    r0.forcedSessionTrackTypes = r1
                    return
            }

            public static /* synthetic */ com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder access$100(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0, java.util.UUID r1) {
                    com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = r0.setNullableScheme(r1)
                    return r0
            }

            public static /* synthetic */ boolean access$1000(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    boolean r0 = r0.multiSession
                    return r0
            }

            public static /* synthetic */ boolean access$1100(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    boolean r0 = r0.playClearContentWithoutKey
                    return r0
            }

            public static /* synthetic */ com.google.common.collect.ImmutableList access$1200(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r0.forcedSessionTrackTypes
                    return r0
            }

            public static /* synthetic */ byte[] access$1300(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    byte[] r0 = r0.keySetId
                    return r0
            }

            public static /* synthetic */ android.net.Uri access$200(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    android.net.Uri r0 = r0.licenseUri
                    return r0
            }

            public static /* synthetic */ java.util.UUID access$300(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    java.util.UUID r0 = r0.scheme
                    return r0
            }

            public static /* synthetic */ boolean access$800(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    boolean r0 = r0.forceDefaultLicenseUri
                    return r0
            }

            public static /* synthetic */ com.google.common.collect.ImmutableMap access$900(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r0) {
                    com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r0 = r0.licenseRequestHeaders
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            private com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setNullableScheme(@androidx.annotation.Nullable java.util.UUID r1) {
                    r0 = this;
                    r0.scheme = r1
                    return r0
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration build() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$DrmConfiguration r0 = new com.google.android.exoplayer2.MediaItem$DrmConfiguration
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @com.google.errorprone.annotations.InlineMe(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @java.lang.Deprecated
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder forceSessionsForAudioAndVideoTracks(boolean r1) {
                    r0 = this;
                    com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r1 = r0.setForceSessionsForAudioAndVideoTracks(r1)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setForceDefaultLicenseUri(boolean r1) {
                    r0 = this;
                    r0.forceDefaultLicenseUri = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setForceSessionsForAudioAndVideoTracks(boolean r2) {
                    r1 = this;
                    if (r2 == 0) goto L11
                    r2 = 2
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r0 = 1
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2, r0)
                    goto L15
                L11:
                    com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
                L15:
                    r1.setForcedSessionTrackTypes(r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setForcedSessionTrackTypes(java.util.List<java.lang.Integer> r1) {
                    r0 = this;
                    com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
                    r0.forcedSessionTrackTypes = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setKeySetId(@androidx.annotation.Nullable byte[] r2) {
                    r1 = this;
                    if (r2 == 0) goto L8
                    int r0 = r2.length
                    byte[] r2 = java.util.Arrays.copyOf(r2, r0)
                    goto L9
                L8:
                    r2 = 0
                L9:
                    r1.keySetId = r2
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> r1) {
                    r0 = this;
                    com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r1)
                    r0.licenseRequestHeaders = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setLicenseUri(@androidx.annotation.Nullable android.net.Uri r1) {
                    r0 = this;
                    r0.licenseUri = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setLicenseUri(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    if (r1 != 0) goto L4
                    r1 = 0
                    goto L8
                L4:
                    android.net.Uri r1 = android.net.Uri.parse(r1)
                L8:
                    r0.licenseUri = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setMultiSession(boolean r1) {
                    r0 = this;
                    r0.multiSession = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setPlayClearContentWithoutKey(boolean r1) {
                    r0 = this;
                    r0.playClearContentWithoutKey = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setScheme(java.util.UUID r1) {
                    r0 = this;
                    r0.scheme = r1
                    return r0
            }
        }

        private DrmConfiguration(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$800(r2)
                if (r0 == 0) goto L12
                android.net.Uri r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$200(r2)
                if (r0 == 0) goto L10
                goto L12
            L10:
                r0 = 0
                goto L13
            L12:
                r0 = 1
            L13:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                java.util.UUID r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$300(r2)
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.util.UUID r0 = (java.util.UUID) r0
                r1.scheme = r0
                r1.uuid = r0
                android.net.Uri r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$200(r2)
                r1.licenseUri = r0
                com.google.common.collect.ImmutableMap r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$900(r2)
                r1.requestHeaders = r0
                com.google.common.collect.ImmutableMap r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$900(r2)
                r1.licenseRequestHeaders = r0
                boolean r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1000(r2)
                r1.multiSession = r0
                boolean r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$800(r2)
                r1.forceDefaultLicenseUri = r0
                boolean r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1100(r2)
                r1.playClearContentWithoutKey = r0
                com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1200(r2)
                r1.sessionForClearTypes = r0
                com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1200(r2)
                r1.forcedSessionTrackTypes = r0
                byte[] r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1300(r2)
                if (r0 == 0) goto L68
                byte[] r0 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1300(r2)
                byte[] r2 = com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder.access$1300(r2)
                int r2 = r2.length
                byte[] r2 = java.util.Arrays.copyOf(r0, r2)
                goto L69
            L68:
                r2 = 0
            L69:
                r1.keySetId = r2
                return
        }

        public /* synthetic */ DrmConfiguration(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ byte[] access$600(com.google.android.exoplayer2.MediaItem.DrmConfiguration r0) {
                byte[] r0 = r0.keySetId
                return r0
        }

        public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$DrmConfiguration$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.MediaItem.DrmConfiguration
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$DrmConfiguration r5 = (com.google.android.exoplayer2.MediaItem.DrmConfiguration) r5
                java.util.UUID r1 = r4.scheme
                java.util.UUID r3 = r5.scheme
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L51
                android.net.Uri r1 = r4.licenseUri
                android.net.Uri r3 = r5.licenseUri
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L51
                com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r1 = r4.licenseRequestHeaders
                com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r3 = r5.licenseRequestHeaders
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L51
                boolean r1 = r4.multiSession
                boolean r3 = r5.multiSession
                if (r1 != r3) goto L51
                boolean r1 = r4.forceDefaultLicenseUri
                boolean r3 = r5.forceDefaultLicenseUri
                if (r1 != r3) goto L51
                boolean r1 = r4.playClearContentWithoutKey
                boolean r3 = r5.playClearContentWithoutKey
                if (r1 != r3) goto L51
                com.google.common.collect.ImmutableList<java.lang.Integer> r1 = r4.forcedSessionTrackTypes
                com.google.common.collect.ImmutableList<java.lang.Integer> r3 = r5.forcedSessionTrackTypes
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L51
                byte[] r1 = r4.keySetId
                byte[] r5 = r5.keySetId
                boolean r5 = java.util.Arrays.equals(r1, r5)
                if (r5 == 0) goto L51
                goto L52
            L51:
                r0 = 0
            L52:
                return r0
        }

        @androidx.annotation.Nullable
        public byte[] getKeySetId() {
                r2 = this;
                byte[] r0 = r2.keySetId
                if (r0 == 0) goto La
                int r1 = r0.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.util.UUID r0 = r2.scheme
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                android.net.Uri r1 = r2.licenseUri
                if (r1 == 0) goto L11
                int r1 = r1.hashCode()
                goto L12
            L11:
                r1 = 0
            L12:
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r1 = r2.licenseRequestHeaders
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r2.multiSession
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r2.forceDefaultLicenseUri
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r2.playClearContentWithoutKey
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r2.forcedSessionTrackTypes
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                byte[] r1 = r2.keySetId
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LiveConfiguration implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem.LiveConfiguration> CREATOR = null;
        private static final java.lang.String FIELD_MAX_OFFSET_MS = null;
        private static final java.lang.String FIELD_MAX_PLAYBACK_SPEED = null;
        private static final java.lang.String FIELD_MIN_OFFSET_MS = null;
        private static final java.lang.String FIELD_MIN_PLAYBACK_SPEED = null;
        private static final java.lang.String FIELD_TARGET_OFFSET_MS = null;
        public static final com.google.android.exoplayer2.MediaItem.LiveConfiguration UNSET = null;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;

        /* JADX INFO: loaded from: classes.dex */
        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public Builder() {
                    r2 = this;
                    r2.<init>()
                    r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    r2.targetOffsetMs = r0
                    r2.minOffsetMs = r0
                    r2.maxOffsetMs = r0
                    r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                    r2.minPlaybackSpeed = r0
                    r2.maxPlaybackSpeed = r0
                    return
            }

            private Builder(com.google.android.exoplayer2.MediaItem.LiveConfiguration r3) {
                    r2 = this;
                    r2.<init>()
                    long r0 = r3.targetOffsetMs
                    r2.targetOffsetMs = r0
                    long r0 = r3.minOffsetMs
                    r2.minOffsetMs = r0
                    long r0 = r3.maxOffsetMs
                    r2.maxOffsetMs = r0
                    float r0 = r3.minPlaybackSpeed
                    r2.minPlaybackSpeed = r0
                    float r3 = r3.maxPlaybackSpeed
                    r2.maxPlaybackSpeed = r3
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem.LiveConfiguration r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ long access$2100(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r2) {
                    long r0 = r2.targetOffsetMs
                    return r0
            }

            public static /* synthetic */ long access$2200(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r2) {
                    long r0 = r2.minOffsetMs
                    return r0
            }

            public static /* synthetic */ long access$2300(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r2) {
                    long r0 = r2.maxOffsetMs
                    return r0
            }

            public static /* synthetic */ float access$2400(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r0) {
                    float r0 = r0.minPlaybackSpeed
                    return r0
            }

            public static /* synthetic */ float access$2500(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r0) {
                    float r0 = r0.maxPlaybackSpeed
                    return r0
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration build() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMaxOffsetMs(long r1) {
                    r0 = this;
                    r0.maxOffsetMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMaxPlaybackSpeed(float r1) {
                    r0 = this;
                    r0.maxPlaybackSpeed = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMinOffsetMs(long r1) {
                    r0 = this;
                    r0.minOffsetMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMinPlaybackSpeed(float r1) {
                    r0 = this;
                    r0.minPlaybackSpeed = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setTargetOffsetMs(long r1) {
                    r0 = this;
                    r0.targetOffsetMs = r1
                    return r0
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$BU-8A0omnaqu9JdsySRxM9YKzHY, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.MediaItem.LiveConfiguration m167$r8$lambda$BU8A0omnaqu9JdsySRxM9YKzHY(android.os.Bundle r0) {
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = lambda$static$0(r0)
                return r0
        }

        static {
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder
                r0.<init>()
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r0.build()
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.UNSET = r0
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_TARGET_OFFSET_MS = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MIN_OFFSET_MS = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MAX_OFFSET_MS = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MIN_PLAYBACK_SPEED = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MAX_PLAYBACK_SPEED = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$9
                com.google.android.exoplayer2.MediaItem.LiveConfiguration.CREATOR = r0
                return
        }

        @java.lang.Deprecated
        public LiveConfiguration(long r1, long r3, long r5, float r7, float r8) {
                r0 = this;
                r0.<init>()
                r0.targetOffsetMs = r1
                r0.minOffsetMs = r3
                r0.maxOffsetMs = r5
                r0.minPlaybackSpeed = r7
                r0.maxPlaybackSpeed = r8
                return
        }

        private LiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r10) {
                r9 = this;
                long r1 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder.access$2100(r10)
                long r3 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder.access$2200(r10)
                long r5 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder.access$2300(r10)
                float r7 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder.access$2400(r10)
                float r8 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder.access$2500(r10)
                r0 = r9
                r0.<init>(r1, r3, r5, r7, r8)
                return
        }

        public /* synthetic */ LiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.MediaItem.LiveConfiguration lambda$static$0(android.os.Bundle r10) {
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r9 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_TARGET_OFFSET_MS
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.UNSET
                long r2 = r1.targetOffsetMs
                long r2 = r10.getLong(r0, r2)
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MIN_OFFSET_MS
                long r4 = r1.minOffsetMs
                long r4 = r10.getLong(r0, r4)
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MAX_OFFSET_MS
                long r6 = r1.maxOffsetMs
                long r6 = r10.getLong(r0, r6)
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MIN_PLAYBACK_SPEED
                float r8 = r1.minPlaybackSpeed
                float r8 = r10.getFloat(r0, r8)
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MAX_PLAYBACK_SPEED
                float r1 = r1.maxPlaybackSpeed
                float r10 = r10.getFloat(r0, r1)
                r0 = r9
                r1 = r2
                r3 = r4
                r5 = r6
                r7 = r8
                r8 = r10
                r0.<init>(r1, r3, r5, r7, r8)
                return r9
        }

        public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.exoplayer2.MediaItem.LiveConfiguration
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r8 = (com.google.android.exoplayer2.MediaItem.LiveConfiguration) r8
                long r3 = r7.targetOffsetMs
                long r5 = r8.targetOffsetMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L35
                long r3 = r7.minOffsetMs
                long r5 = r8.minOffsetMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L35
                long r3 = r7.maxOffsetMs
                long r5 = r8.maxOffsetMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L35
                float r1 = r7.minPlaybackSpeed
                float r3 = r8.minPlaybackSpeed
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L35
                float r1 = r7.maxPlaybackSpeed
                float r8 = r8.maxPlaybackSpeed
                int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r8 != 0) goto L35
                goto L36
            L35:
                r0 = 0
            L36:
                return r0
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.targetOffsetMs
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.minOffsetMs
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r3 = r7.maxOffsetMs
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                int r1 = r1 * 31
                float r0 = r7.minPlaybackSpeed
                r2 = 0
                r3 = 0
                int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r4 == 0) goto L2a
                int r0 = java.lang.Float.floatToIntBits(r0)
                goto L2b
            L2a:
                r0 = 0
            L2b:
                int r1 = r1 + r0
                int r1 = r1 * 31
                float r0 = r7.maxPlaybackSpeed
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 == 0) goto L38
                int r2 = java.lang.Float.floatToIntBits(r0)
            L38:
                int r1 = r1 + r2
                return r1
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r7 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                long r1 = r7.targetOffsetMs
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r3 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.UNSET
                long r4 = r3.targetOffsetMs
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L14
                java.lang.String r4 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_TARGET_OFFSET_MS
                r0.putLong(r4, r1)
            L14:
                long r1 = r7.minOffsetMs
                long r4 = r3.minOffsetMs
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L21
                java.lang.String r4 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MIN_OFFSET_MS
                r0.putLong(r4, r1)
            L21:
                long r1 = r7.maxOffsetMs
                long r4 = r3.maxOffsetMs
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L2e
                java.lang.String r4 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MAX_OFFSET_MS
                r0.putLong(r4, r1)
            L2e:
                float r1 = r7.minPlaybackSpeed
                float r2 = r3.minPlaybackSpeed
                int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r2 == 0) goto L3b
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MIN_PLAYBACK_SPEED
                r0.putFloat(r2, r1)
            L3b:
                float r1 = r7.maxPlaybackSpeed
                float r2 = r3.maxPlaybackSpeed
                int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r2 == 0) goto L48
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.FIELD_MAX_PLAYBACK_SPEED
                r0.putFloat(r2, r1)
            L48:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LocalConfiguration {

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration;

        @androidx.annotation.Nullable
        public final java.lang.String customCacheKey;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration;

        @androidx.annotation.Nullable
        public final java.lang.String mimeType;
        public final java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;
        public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> subtitleConfigurations;

        @java.lang.Deprecated
        public final java.util.List<com.google.android.exoplayer2.MediaItem.Subtitle> subtitles;

        @androidx.annotation.Nullable
        public final java.lang.Object tag;
        public final android.net.Uri uri;

        private LocalConfiguration(android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.DrmConfiguration r3, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.AdsConfiguration r4, java.util.List<com.google.android.exoplayer2.offline.StreamKey> r5, @androidx.annotation.Nullable java.lang.String r6, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> r7, @androidx.annotation.Nullable java.lang.Object r8) {
                r0 = this;
                r0.<init>()
                r0.uri = r1
                r0.mimeType = r2
                r0.drmConfiguration = r3
                r0.adsConfiguration = r4
                r0.streamKeys = r5
                r0.customCacheKey = r6
                r0.subtitleConfigurations = r7
                com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
                r2 = 0
            L16:
                int r3 = r7.size()
                if (r2 >= r3) goto L30
                java.lang.Object r3 = r7.get(r2)
                com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r3 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r3
                com.google.android.exoplayer2.MediaItem$SubtitleConfiguration$Builder r3 = r3.buildUpon()
                com.google.android.exoplayer2.MediaItem$Subtitle r3 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$1800(r3)
                r1.add(r3)
                int r2 = r2 + 1
                goto L16
            L30:
                com.google.common.collect.ImmutableList r1 = r1.build()
                r0.subtitles = r1
                r0.tag = r8
                return
        }

        public /* synthetic */ LocalConfiguration(android.net.Uri r1, java.lang.String r2, com.google.android.exoplayer2.MediaItem.DrmConfiguration r3, com.google.android.exoplayer2.MediaItem.AdsConfiguration r4, java.util.List r5, java.lang.String r6, com.google.common.collect.ImmutableList r7, java.lang.Object r8, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r9) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.MediaItem.LocalConfiguration
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r5 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r5
                android.net.Uri r1 = r4.uri
                android.net.Uri r3 = r5.uri
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5d
                java.lang.String r1 = r4.mimeType
                java.lang.String r3 = r5.mimeType
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L5d
                com.google.android.exoplayer2.MediaItem$DrmConfiguration r1 = r4.drmConfiguration
                com.google.android.exoplayer2.MediaItem$DrmConfiguration r3 = r5.drmConfiguration
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L5d
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r1 = r4.adsConfiguration
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r3 = r5.adsConfiguration
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L5d
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r4.streamKeys
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r3 = r5.streamKeys
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5d
                java.lang.String r1 = r4.customCacheKey
                java.lang.String r3 = r5.customCacheKey
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L5d
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r1 = r4.subtitleConfigurations
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r3 = r5.subtitleConfigurations
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5d
                java.lang.Object r1 = r4.tag
                java.lang.Object r5 = r5.tag
                boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r1, r5)
                if (r5 == 0) goto L5d
                goto L5e
            L5d:
                r0 = 0
            L5e:
                return r0
        }

        public int hashCode() {
                r3 = this;
                android.net.Uri r0 = r3.uri
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.mimeType
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = r1.hashCode()
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.MediaItem$DrmConfiguration r1 = r3.drmConfiguration
                if (r1 != 0) goto L1c
                r1 = 0
                goto L20
            L1c:
                int r1 = r1.hashCode()
            L20:
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.MediaItem$AdsConfiguration r1 = r3.adsConfiguration
                if (r1 != 0) goto L29
                r1 = 0
                goto L2d
            L29:
                int r1 = r1.hashCode()
            L2d:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r3.streamKeys
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r3.customCacheKey
                if (r0 != 0) goto L3f
                r0 = 0
                goto L43
            L3f:
                int r0 = r0.hashCode()
            L43:
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r0 = r3.subtitleConfigurations
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r3.tag
                if (r1 != 0) goto L54
                goto L58
            L54:
                int r2 = r1.hashCode()
            L58:
                int r0 = r0 + r2
                return r0
        }
    }

    @java.lang.Deprecated
    public static final class PlaybackProperties extends com.google.android.exoplayer2.MediaItem.LocalConfiguration {
        private PlaybackProperties(android.net.Uri r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.DrmConfiguration r13, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.AdsConfiguration r14, java.util.List<com.google.android.exoplayer2.offline.StreamKey> r15, @androidx.annotation.Nullable java.lang.String r16, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> r17, @androidx.annotation.Nullable java.lang.Object r18) {
                r10 = this;
                r9 = 0
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r8 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public /* synthetic */ PlaybackProperties(android.net.Uri r1, java.lang.String r2, com.google.android.exoplayer2.MediaItem.DrmConfiguration r3, com.google.android.exoplayer2.MediaItem.AdsConfiguration r4, java.util.List r5, java.lang.String r6, com.google.common.collect.ImmutableList r7, java.lang.Object r8, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r9) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    public static final class RequestMetadata implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem.RequestMetadata> CREATOR = null;
        public static final com.google.android.exoplayer2.MediaItem.RequestMetadata EMPTY = null;
        private static final java.lang.String FIELD_EXTRAS = null;
        private static final java.lang.String FIELD_MEDIA_URI = null;
        private static final java.lang.String FIELD_SEARCH_QUERY = null;

        @androidx.annotation.Nullable
        public final android.os.Bundle extras;

        @androidx.annotation.Nullable
        public final android.net.Uri mediaUri;

        @androidx.annotation.Nullable
        public final java.lang.String searchQuery;

        /* JADX INFO: loaded from: classes2.dex */
        public static final class Builder {

            @androidx.annotation.Nullable
            private android.os.Bundle extras;

            @androidx.annotation.Nullable
            private android.net.Uri mediaUri;

            @androidx.annotation.Nullable
            private java.lang.String searchQuery;

            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private Builder(com.google.android.exoplayer2.MediaItem.RequestMetadata r2) {
                    r1 = this;
                    r1.<init>()
                    android.net.Uri r0 = r2.mediaUri
                    r1.mediaUri = r0
                    java.lang.String r0 = r2.searchQuery
                    r1.searchQuery = r0
                    android.os.Bundle r2 = r2.extras
                    r1.extras = r2
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem.RequestMetadata r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ android.net.Uri access$4700(com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder r0) {
                    android.net.Uri r0 = r0.mediaUri
                    return r0
            }

            public static /* synthetic */ java.lang.String access$4800(com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder r0) {
                    java.lang.String r0 = r0.searchQuery
                    return r0
            }

            public static /* synthetic */ android.os.Bundle access$4900(com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder r0) {
                    android.os.Bundle r0 = r0.extras
                    return r0
            }

            public com.google.android.exoplayer2.MediaItem.RequestMetadata build() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$RequestMetadata r0 = new com.google.android.exoplayer2.MediaItem$RequestMetadata
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder setExtras(@androidx.annotation.Nullable android.os.Bundle r1) {
                    r0 = this;
                    r0.extras = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder setMediaUri(@androidx.annotation.Nullable android.net.Uri r1) {
                    r0 = this;
                    r0.mediaUri = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder setSearchQuery(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.searchQuery = r1
                    return r0
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$IqLQDXQ9BwxCVbo015J2mr-Lg94, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.MediaItem.RequestMetadata m168$r8$lambda$IqLQDXQ9BwxCVbo015J2mrLg94(android.os.Bundle r0) {
                com.google.android.exoplayer2.MediaItem$RequestMetadata r0 = lambda$static$0(r0)
                return r0
        }

        static {
                com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder r0 = new com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder
                r0.<init>()
                com.google.android.exoplayer2.MediaItem$RequestMetadata r0 = r0.build()
                com.google.android.exoplayer2.MediaItem.RequestMetadata.EMPTY = r0
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_MEDIA_URI = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_SEARCH_QUERY = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_EXTRAS = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$10
                com.google.android.exoplayer2.MediaItem.RequestMetadata.CREATOR = r0
                return
        }

        private RequestMetadata(com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder r2) {
                r1 = this;
                r1.<init>()
                android.net.Uri r0 = com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder.access$4700(r2)
                r1.mediaUri = r0
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder.access$4800(r2)
                r1.searchQuery = r0
                android.os.Bundle r2 = com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder.access$4900(r2)
                r1.extras = r2
                return
        }

        public /* synthetic */ RequestMetadata(com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.MediaItem.RequestMetadata lambda$static$0(android.os.Bundle r2) {
                com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder r0 = new com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder
                r0.<init>()
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_MEDIA_URI
                android.os.Parcelable r1 = r2.getParcelable(r1)
                android.net.Uri r1 = (android.net.Uri) r1
                com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder r0 = r0.setMediaUri(r1)
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_SEARCH_QUERY
                java.lang.String r1 = r2.getString(r1)
                com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder r0 = r0.setSearchQuery(r1)
                java.lang.String r1 = com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_EXTRAS
                android.os.Bundle r2 = r2.getBundle(r1)
                com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder r2 = r0.setExtras(r2)
                com.google.android.exoplayer2.MediaItem$RequestMetadata r2 = r2.build()
                return r2
        }

        public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder r0 = new com.google.android.exoplayer2.MediaItem$RequestMetadata$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.MediaItem.RequestMetadata
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$RequestMetadata r5 = (com.google.android.exoplayer2.MediaItem.RequestMetadata) r5
                android.net.Uri r1 = r4.mediaUri
                android.net.Uri r3 = r5.mediaUri
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L21
                java.lang.String r1 = r4.searchQuery
                java.lang.String r5 = r5.searchQuery
                boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r1, r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        public int hashCode() {
                r3 = this;
                android.net.Uri r0 = r3.mediaUri
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 * 31
                java.lang.String r2 = r3.searchQuery
                if (r2 != 0) goto L12
                goto L16
            L12:
                int r1 = r2.hashCode()
            L16:
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                android.net.Uri r1 = r3.mediaUri
                if (r1 == 0) goto Le
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_MEDIA_URI
                r0.putParcelable(r2, r1)
            Le:
                java.lang.String r1 = r3.searchQuery
                if (r1 == 0) goto L17
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_SEARCH_QUERY
                r0.putString(r2, r1)
            L17:
                android.os.Bundle r1 = r3.extras
                if (r1 == 0) goto L20
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.RequestMetadata.FIELD_EXTRAS
                r0.putBundle(r2, r1)
            L20:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public static final class Subtitle extends com.google.android.exoplayer2.MediaItem.SubtitleConfiguration {
        @java.lang.Deprecated
        public Subtitle(android.net.Uri r2, java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri r8, java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10, int r11) {
                r7 = this;
                r5 = 0
                r6 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri r1, java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, @androidx.annotation.Nullable java.lang.String r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private Subtitle(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public /* synthetic */ Subtitle(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SubtitleConfiguration {

        @androidx.annotation.Nullable
        public final java.lang.String id;

        @androidx.annotation.Nullable
        public final java.lang.String label;

        @androidx.annotation.Nullable
        public final java.lang.String language;

        @androidx.annotation.Nullable
        public final java.lang.String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final android.net.Uri uri;

        public static final class Builder {

            @androidx.annotation.Nullable
            private java.lang.String id;

            @androidx.annotation.Nullable
            private java.lang.String label;

            @androidx.annotation.Nullable
            private java.lang.String language;

            @androidx.annotation.Nullable
            private java.lang.String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private android.net.Uri uri;

            public Builder(android.net.Uri r1) {
                    r0 = this;
                    r0.<init>()
                    r0.uri = r1
                    return
            }

            private Builder(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration r2) {
                    r1 = this;
                    r1.<init>()
                    android.net.Uri r0 = r2.uri
                    r1.uri = r0
                    java.lang.String r0 = r2.mimeType
                    r1.mimeType = r0
                    java.lang.String r0 = r2.language
                    r1.language = r0
                    int r0 = r2.selectionFlags
                    r1.selectionFlags = r0
                    int r0 = r2.roleFlags
                    r1.roleFlags = r0
                    java.lang.String r0 = r2.label
                    r1.label = r0
                    java.lang.String r2 = r2.id
                    r1.id = r2
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ com.google.android.exoplayer2.MediaItem.Subtitle access$1800(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    com.google.android.exoplayer2.MediaItem$Subtitle r0 = r0.buildSubtitle()
                    return r0
            }

            public static /* synthetic */ android.net.Uri access$2900(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    android.net.Uri r0 = r0.uri
                    return r0
            }

            public static /* synthetic */ java.lang.String access$3000(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    java.lang.String r0 = r0.mimeType
                    return r0
            }

            public static /* synthetic */ java.lang.String access$3100(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    java.lang.String r0 = r0.language
                    return r0
            }

            public static /* synthetic */ int access$3200(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    int r0 = r0.selectionFlags
                    return r0
            }

            public static /* synthetic */ int access$3300(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    int r0 = r0.roleFlags
                    return r0
            }

            public static /* synthetic */ java.lang.String access$3400(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    java.lang.String r0 = r0.label
                    return r0
            }

            public static /* synthetic */ java.lang.String access$3500(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r0) {
                    java.lang.String r0 = r0.id
                    return r0
            }

            private com.google.android.exoplayer2.MediaItem.Subtitle buildSubtitle() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$Subtitle r0 = new com.google.android.exoplayer2.MediaItem$Subtitle
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration build() {
                    r2 = this;
                    com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r0 = new com.google.android.exoplayer2.MediaItem$SubtitleConfiguration
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setId(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.id = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setLabel(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.label = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.language = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.mimeType = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setRoleFlags(int r1) {
                    r0 = this;
                    r0.roleFlags = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setSelectionFlags(int r1) {
                    r0 = this;
                    r0.selectionFlags = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setUri(android.net.Uri r1) {
                    r0 = this;
                    r0.uri = r1
                    return r0
            }
        }

        public /* synthetic */ SubtitleConfiguration(android.net.Uri r9, java.lang.String r10, java.lang.String r11, int r12, int r13, java.lang.String r14) {
                r8 = this;
                r7 = 0
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private SubtitleConfiguration(android.net.Uri r1, java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, @androidx.annotation.Nullable java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.uri = r1
                r0.mimeType = r2
                r0.language = r3
                r0.selectionFlags = r4
                r0.roleFlags = r5
                r0.label = r6
                r0.id = r7
                return
        }

        private SubtitleConfiguration(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r2) {
                r1 = this;
                r1.<init>()
                android.net.Uri r0 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$2900(r2)
                r1.uri = r0
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$3000(r2)
                r1.mimeType = r0
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$3100(r2)
                r1.language = r0
                int r0 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$3200(r2)
                r1.selectionFlags = r0
                int r0 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$3300(r2)
                r1.roleFlags = r0
                java.lang.String r0 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$3400(r2)
                r1.label = r0
                java.lang.String r2 = com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder.access$3500(r2)
                r1.id = r2
                return
        }

        public /* synthetic */ SubtitleConfiguration(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder r1, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.MediaItem$SubtitleConfiguration$Builder r0 = new com.google.android.exoplayer2.MediaItem$SubtitleConfiguration$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.MediaItem.SubtitleConfiguration
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r5 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r5
                android.net.Uri r1 = r4.uri
                android.net.Uri r3 = r5.uri
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L4b
                java.lang.String r1 = r4.mimeType
                java.lang.String r3 = r5.mimeType
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L4b
                java.lang.String r1 = r4.language
                java.lang.String r3 = r5.language
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L4b
                int r1 = r4.selectionFlags
                int r3 = r5.selectionFlags
                if (r1 != r3) goto L4b
                int r1 = r4.roleFlags
                int r3 = r5.roleFlags
                if (r1 != r3) goto L4b
                java.lang.String r1 = r4.label
                java.lang.String r3 = r5.label
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L4b
                java.lang.String r1 = r4.id
                java.lang.String r5 = r5.id
                boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r1, r5)
                if (r5 == 0) goto L4b
                goto L4c
            L4b:
                r0 = 0
            L4c:
                return r0
        }

        public int hashCode() {
                r3 = this;
                android.net.Uri r0 = r3.uri
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.mimeType
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = r1.hashCode()
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.language
                if (r1 != 0) goto L1c
                r1 = 0
                goto L20
            L1c:
                int r1 = r1.hashCode()
            L20:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.selectionFlags
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.roleFlags
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.label
                if (r1 != 0) goto L33
                r1 = 0
                goto L37
            L33:
                int r1 = r1.hashCode()
            L37:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.id
                if (r1 != 0) goto L3f
                goto L43
            L3f:
                int r2 = r1.hashCode()
            L43:
                int r0 = r0 + r2
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$jV0pUJ-BLiCLPyDyDvfHo6BdOSE, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.MediaItem m165$r8$lambda$jV0pUJBLiCLPyDyDvfHo6BdOSE(android.os.Bundle r0) {
            com.google.android.exoplayer2.MediaItem r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem r0 = r0.build()
            com.google.android.exoplayer2.MediaItem.EMPTY = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaItem.FIELD_MEDIA_ID = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaItem.FIELD_LIVE_CONFIGURATION = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaItem.FIELD_MEDIA_METADATA = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaItem.FIELD_CLIPPING_PROPERTIES = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaItem.FIELD_REQUEST_METADATA = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$7
            com.google.android.exoplayer2.MediaItem.CREATOR = r0
            return
    }

    private MediaItem(java.lang.String r1, com.google.android.exoplayer2.MediaItem.ClippingProperties r2, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.PlaybackProperties r3, com.google.android.exoplayer2.MediaItem.LiveConfiguration r4, com.google.android.exoplayer2.MediaMetadata r5, com.google.android.exoplayer2.MediaItem.RequestMetadata r6) {
            r0 = this;
            r0.<init>()
            r0.mediaId = r1
            r0.localConfiguration = r3
            r0.playbackProperties = r3
            r0.liveConfiguration = r4
            r0.mediaMetadata = r5
            r0.clippingConfiguration = r2
            r0.clippingProperties = r2
            r0.requestMetadata = r6
            return
    }

    public /* synthetic */ MediaItem(java.lang.String r1, com.google.android.exoplayer2.MediaItem.ClippingProperties r2, com.google.android.exoplayer2.MediaItem.PlaybackProperties r3, com.google.android.exoplayer2.MediaItem.LiveConfiguration r4, com.google.android.exoplayer2.MediaMetadata r5, com.google.android.exoplayer2.MediaItem.RequestMetadata r6, com.google.android.exoplayer2.MediaItem.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private static com.google.android.exoplayer2.MediaItem fromBundle(android.os.Bundle r8) {
            java.lang.String r0 = com.google.android.exoplayer2.MediaItem.FIELD_MEDIA_ID
            java.lang.String r1 = ""
            java.lang.String r0 = r8.getString(r0, r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = com.google.android.exoplayer2.MediaItem.FIELD_LIVE_CONFIGURATION
            android.os.Bundle r0 = r8.getBundle(r0)
            if (r0 != 0) goto L1a
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.UNSET
            goto L22
        L1a:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaItem$LiveConfiguration> r1 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.CREATOR
            com.google.android.exoplayer2.Bundleable r0 = r1.fromBundle(r0)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = (com.google.android.exoplayer2.MediaItem.LiveConfiguration) r0
        L22:
            r5 = r0
            java.lang.String r0 = com.google.android.exoplayer2.MediaItem.FIELD_MEDIA_METADATA
            android.os.Bundle r0 = r8.getBundle(r0)
            if (r0 != 0) goto L2e
            com.google.android.exoplayer2.MediaMetadata r0 = com.google.android.exoplayer2.MediaMetadata.EMPTY
            goto L36
        L2e:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaMetadata> r1 = com.google.android.exoplayer2.MediaMetadata.CREATOR
            com.google.android.exoplayer2.Bundleable r0 = r1.fromBundle(r0)
            com.google.android.exoplayer2.MediaMetadata r0 = (com.google.android.exoplayer2.MediaMetadata) r0
        L36:
            r6 = r0
            java.lang.String r0 = com.google.android.exoplayer2.MediaItem.FIELD_CLIPPING_PROPERTIES
            android.os.Bundle r0 = r8.getBundle(r0)
            if (r0 != 0) goto L42
            com.google.android.exoplayer2.MediaItem$ClippingProperties r0 = com.google.android.exoplayer2.MediaItem.ClippingProperties.UNSET
            goto L4a
        L42:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaItem$ClippingProperties> r1 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.CREATOR
            com.google.android.exoplayer2.Bundleable r0 = r1.fromBundle(r0)
            com.google.android.exoplayer2.MediaItem$ClippingProperties r0 = (com.google.android.exoplayer2.MediaItem.ClippingProperties) r0
        L4a:
            r3 = r0
            java.lang.String r0 = com.google.android.exoplayer2.MediaItem.FIELD_REQUEST_METADATA
            android.os.Bundle r8 = r8.getBundle(r0)
            if (r8 != 0) goto L56
            com.google.android.exoplayer2.MediaItem$RequestMetadata r8 = com.google.android.exoplayer2.MediaItem.RequestMetadata.EMPTY
            goto L5e
        L56:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaItem$RequestMetadata> r0 = com.google.android.exoplayer2.MediaItem.RequestMetadata.CREATOR
            com.google.android.exoplayer2.Bundleable r8 = r0.fromBundle(r8)
            com.google.android.exoplayer2.MediaItem$RequestMetadata r8 = (com.google.android.exoplayer2.MediaItem.RequestMetadata) r8
        L5e:
            r7 = r8
            com.google.android.exoplayer2.MediaItem r8 = new com.google.android.exoplayer2.MediaItem
            r4 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static com.google.android.exoplayer2.MediaItem fromUri(android.net.Uri r1) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setUri(r1)
            com.google.android.exoplayer2.MediaItem r1 = r1.build()
            return r1
    }

    public static com.google.android.exoplayer2.MediaItem fromUri(java.lang.String r1) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setUri(r1)
            com.google.android.exoplayer2.MediaItem r1 = r1.build()
            return r1
    }

    public com.google.android.exoplayer2.MediaItem.Builder buildUpon() {
            r2 = this;
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.MediaItem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.MediaItem r5 = (com.google.android.exoplayer2.MediaItem) r5
            java.lang.String r1 = r4.mediaId
            java.lang.String r3 = r5.mediaId
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r1 = r4.clippingConfiguration
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r3 = r5.clippingConfiguration
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r4.localConfiguration
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r3 = r5.localConfiguration
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r4.liveConfiguration
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r3 = r5.liveConfiguration
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.MediaMetadata r1 = r4.mediaMetadata
            com.google.android.exoplayer2.MediaMetadata r3 = r5.mediaMetadata
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.MediaItem$RequestMetadata r1 = r4.requestMetadata
            com.google.android.exoplayer2.MediaItem$RequestMetadata r5 = r5.requestMetadata
            boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r1, r5)
            if (r5 == 0) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.mediaId
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r2.localConfiguration
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r2.liveConfiguration
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r0 = r2.clippingConfiguration
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.exoplayer2.MediaMetadata r1 = r2.mediaMetadata
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            com.google.android.exoplayer2.MediaItem$RequestMetadata r0 = r2.requestMetadata
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r3.mediaId
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
            java.lang.String r1 = com.google.android.exoplayer2.MediaItem.FIELD_MEDIA_ID
            java.lang.String r2 = r3.mediaId
            r0.putString(r1, r2)
        L16:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r3.liveConfiguration
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.UNSET
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2b
            java.lang.String r1 = com.google.android.exoplayer2.MediaItem.FIELD_LIVE_CONFIGURATION
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r3.liveConfiguration
            android.os.Bundle r2 = r2.toBundle()
            r0.putBundle(r1, r2)
        L2b:
            com.google.android.exoplayer2.MediaMetadata r1 = r3.mediaMetadata
            com.google.android.exoplayer2.MediaMetadata r2 = com.google.android.exoplayer2.MediaMetadata.EMPTY
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L40
            java.lang.String r1 = com.google.android.exoplayer2.MediaItem.FIELD_MEDIA_METADATA
            com.google.android.exoplayer2.MediaMetadata r2 = r3.mediaMetadata
            android.os.Bundle r2 = r2.toBundle()
            r0.putBundle(r1, r2)
        L40:
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r1 = r3.clippingConfiguration
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r2 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.UNSET
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L55
            java.lang.String r1 = com.google.android.exoplayer2.MediaItem.FIELD_CLIPPING_PROPERTIES
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r2 = r3.clippingConfiguration
            android.os.Bundle r2 = r2.toBundle()
            r0.putBundle(r1, r2)
        L55:
            com.google.android.exoplayer2.MediaItem$RequestMetadata r1 = r3.requestMetadata
            com.google.android.exoplayer2.MediaItem$RequestMetadata r2 = com.google.android.exoplayer2.MediaItem.RequestMetadata.EMPTY
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6a
            java.lang.String r1 = com.google.android.exoplayer2.MediaItem.FIELD_REQUEST_METADATA
            com.google.android.exoplayer2.MediaItem$RequestMetadata r2 = r3.requestMetadata
            android.os.Bundle r2 = r2.toBundle()
            r0.putBundle(r1, r2)
        L6a:
            return r0
    }
}
