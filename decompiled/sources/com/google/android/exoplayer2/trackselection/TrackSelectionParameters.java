package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionParameters implements com.google.android.exoplayer2.Bundleable {

    @java.lang.Deprecated
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.TrackSelectionParameters> CREATOR = null;

    @java.lang.Deprecated
    public static final com.google.android.exoplayer2.trackselection.TrackSelectionParameters DEFAULT = null;
    public static final com.google.android.exoplayer2.trackselection.TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT = null;
    private static final java.lang.String FIELD_DISABLED_TRACK_TYPE = null;
    private static final java.lang.String FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = null;
    private static final java.lang.String FIELD_FORCE_LOWEST_BITRATE = null;
    private static final java.lang.String FIELD_IGNORED_TEXT_SELECTION_FLAGS = null;
    private static final java.lang.String FIELD_MAX_AUDIO_BITRATE = null;
    private static final java.lang.String FIELD_MAX_AUDIO_CHANNEL_COUNT = null;
    private static final java.lang.String FIELD_MAX_VIDEO_BITRATE = null;
    private static final java.lang.String FIELD_MAX_VIDEO_FRAMERATE = null;
    private static final java.lang.String FIELD_MAX_VIDEO_HEIGHT = null;
    private static final java.lang.String FIELD_MAX_VIDEO_WIDTH = null;
    private static final java.lang.String FIELD_MIN_VIDEO_BITRATE = null;
    private static final java.lang.String FIELD_MIN_VIDEO_FRAMERATE = null;
    private static final java.lang.String FIELD_MIN_VIDEO_HEIGHT = null;
    private static final java.lang.String FIELD_MIN_VIDEO_WIDTH = null;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_LANGUAGES = null;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_MIME_TYPES = null;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_ROLE_FLAGS = null;
    private static final java.lang.String FIELD_PREFERRED_TEXT_LANGUAGES = null;
    private static final java.lang.String FIELD_PREFERRED_TEXT_ROLE_FLAGS = null;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_MIMETYPES = null;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_ROLE_FLAGS = null;
    private static final java.lang.String FIELD_SELECTION_OVERRIDES = null;
    private static final java.lang.String FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = null;
    private static final java.lang.String FIELD_VIEWPORT_HEIGHT = null;
    private static final java.lang.String FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = null;
    private static final java.lang.String FIELD_VIEWPORT_WIDTH = null;
    public final com.google.common.collect.ImmutableSet<java.lang.Integer> disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    /* JADX INFO: loaded from: classes.dex */
    public static class Builder {
        private java.util.HashSet<java.lang.Integer> disabledTrackTypes;
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int ignoredTextSelectionFlags;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
        private int preferredAudioRoleFlags;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
        private int preferredTextRoleFlags;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
        private int preferredVideoRoleFlags;
        private boolean selectUndeterminedTextLanguage;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        @java.lang.Deprecated
        public Builder() {
                r3 = this;
                r3.<init>()
                r0 = 2147483647(0x7fffffff, float:NaN)
                r3.maxVideoWidth = r0
                r3.maxVideoHeight = r0
                r3.maxVideoFrameRate = r0
                r3.maxVideoBitrate = r0
                r3.viewportWidth = r0
                r3.viewportHeight = r0
                r1 = 1
                r3.viewportOrientationMayChange = r1
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
                r3.preferredVideoMimeTypes = r1
                r1 = 0
                r3.preferredVideoRoleFlags = r1
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
                r3.preferredAudioLanguages = r2
                r3.preferredAudioRoleFlags = r1
                r3.maxAudioChannelCount = r0
                r3.maxAudioBitrate = r0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
                r3.preferredAudioMimeTypes = r0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
                r3.preferredTextLanguages = r0
                r3.preferredTextRoleFlags = r1
                r3.ignoredTextSelectionFlags = r1
                r3.selectUndeterminedTextLanguage = r1
                r3.forceLowestBitrate = r1
                r3.forceHighestSupportedBitrate = r1
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r3.overrides = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r3.disabledTrackTypes = r0
                return
        }

        public Builder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r1.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(r2)
                r0 = 1
                r1.setViewportSizeToPhysicalDisplaySize(r2, r0)
                return
        }

        public Builder(android.os.Bundle r7) {
                r6 = this;
                r6.<init>()
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$000()
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT
                int r2 = r1.maxVideoWidth
                int r0 = r7.getInt(r0, r2)
                r6.maxVideoWidth = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$100()
                int r2 = r1.maxVideoHeight
                int r0 = r7.getInt(r0, r2)
                r6.maxVideoHeight = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$200()
                int r2 = r1.maxVideoFrameRate
                int r0 = r7.getInt(r0, r2)
                r6.maxVideoFrameRate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$300()
                int r2 = r1.maxVideoBitrate
                int r0 = r7.getInt(r0, r2)
                r6.maxVideoBitrate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$400()
                int r2 = r1.minVideoWidth
                int r0 = r7.getInt(r0, r2)
                r6.minVideoWidth = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$500()
                int r2 = r1.minVideoHeight
                int r0 = r7.getInt(r0, r2)
                r6.minVideoHeight = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$600()
                int r2 = r1.minVideoFrameRate
                int r0 = r7.getInt(r0, r2)
                r6.minVideoFrameRate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$700()
                int r2 = r1.minVideoBitrate
                int r0 = r7.getInt(r0, r2)
                r6.minVideoBitrate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$800()
                int r2 = r1.viewportWidth
                int r0 = r7.getInt(r0, r2)
                r6.viewportWidth = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$900()
                int r2 = r1.viewportHeight
                int r0 = r7.getInt(r0, r2)
                r6.viewportHeight = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1000()
                boolean r2 = r1.viewportOrientationMayChange
                boolean r0 = r7.getBoolean(r0, r2)
                r6.viewportOrientationMayChange = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1100()
                java.lang.String[] r0 = r7.getStringArray(r0)
                r2 = 0
                java.lang.String[] r3 = new java.lang.String[r2]
                java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r3)
                java.lang.String[] r0 = (java.lang.String[]) r0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                r6.preferredVideoMimeTypes = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1200()
                int r3 = r1.preferredVideoRoleFlags
                int r0 = r7.getInt(r0, r3)
                r6.preferredVideoRoleFlags = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1300()
                java.lang.String[] r0 = r7.getStringArray(r0)
                java.lang.String[] r3 = new java.lang.String[r2]
                java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r3)
                java.lang.String[] r0 = (java.lang.String[]) r0
                com.google.common.collect.ImmutableList r0 = normalizeLanguageCodes(r0)
                r6.preferredAudioLanguages = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1400()
                int r3 = r1.preferredAudioRoleFlags
                int r0 = r7.getInt(r0, r3)
                r6.preferredAudioRoleFlags = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1500()
                int r3 = r1.maxAudioChannelCount
                int r0 = r7.getInt(r0, r3)
                r6.maxAudioChannelCount = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1600()
                int r3 = r1.maxAudioBitrate
                int r0 = r7.getInt(r0, r3)
                r6.maxAudioBitrate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1700()
                java.lang.String[] r0 = r7.getStringArray(r0)
                java.lang.String[] r3 = new java.lang.String[r2]
                java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r3)
                java.lang.String[] r0 = (java.lang.String[]) r0
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                r6.preferredAudioMimeTypes = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1800()
                java.lang.String[] r0 = r7.getStringArray(r0)
                java.lang.String[] r3 = new java.lang.String[r2]
                java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r3)
                java.lang.String[] r0 = (java.lang.String[]) r0
                com.google.common.collect.ImmutableList r0 = normalizeLanguageCodes(r0)
                r6.preferredTextLanguages = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$1900()
                int r3 = r1.preferredTextRoleFlags
                int r0 = r7.getInt(r0, r3)
                r6.preferredTextRoleFlags = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$2000()
                int r3 = r1.ignoredTextSelectionFlags
                int r0 = r7.getInt(r0, r3)
                r6.ignoredTextSelectionFlags = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$2100()
                boolean r3 = r1.selectUndeterminedTextLanguage
                boolean r0 = r7.getBoolean(r0, r3)
                r6.selectUndeterminedTextLanguage = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$2200()
                boolean r3 = r1.forceLowestBitrate
                boolean r0 = r7.getBoolean(r0, r3)
                r6.forceLowestBitrate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$2300()
                boolean r1 = r1.forceHighestSupportedBitrate
                boolean r0 = r7.getBoolean(r0, r1)
                r6.forceHighestSupportedBitrate = r0
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$2400()
                java.util.ArrayList r0 = r7.getParcelableArrayList(r0)
                if (r0 != 0) goto L15d
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
                goto L163
            L15d:
                com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r1 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.CREATOR
                com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r1, r0)
            L163:
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r6.overrides = r1
                r1 = 0
            L16b:
                int r3 = r0.size()
                if (r1 >= r3) goto L181
                java.lang.Object r3 = r0.get(r1)
                com.google.android.exoplayer2.trackselection.TrackSelectionOverride r3 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r3
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r4 = r6.overrides
                com.google.android.exoplayer2.source.TrackGroup r5 = r3.mediaTrackGroup
                r4.put(r5, r3)
                int r1 = r1 + 1
                goto L16b
            L181:
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.access$2500()
                int[] r7 = r7.getIntArray(r0)
                int[] r0 = new int[r2]
                java.lang.Object r7 = com.google.common.base.MoreObjects.firstNonNull(r7, r0)
                int[] r7 = (int[]) r7
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r6.disabledTrackTypes = r0
                int r0 = r7.length
            L199:
                if (r2 >= r0) goto L1a9
                r1 = r7[r2]
                java.util.HashSet<java.lang.Integer> r3 = r6.disabledTrackTypes
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3.add(r1)
                int r2 = r2 + 1
                goto L199
            L1a9:
                return
        }

        public Builder(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                r0 = this;
                r0.<init>()
                r0.init(r1)
                return
        }

        public static /* synthetic */ int access$2600(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.maxVideoWidth
                return r0
        }

        public static /* synthetic */ int access$2700(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.maxVideoHeight
                return r0
        }

        public static /* synthetic */ int access$2800(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.maxVideoFrameRate
                return r0
        }

        public static /* synthetic */ int access$2900(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.maxVideoBitrate
                return r0
        }

        public static /* synthetic */ int access$3000(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.minVideoWidth
                return r0
        }

        public static /* synthetic */ int access$3100(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.minVideoHeight
                return r0
        }

        public static /* synthetic */ int access$3200(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.minVideoFrameRate
                return r0
        }

        public static /* synthetic */ int access$3300(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.minVideoBitrate
                return r0
        }

        public static /* synthetic */ int access$3400(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.viewportWidth
                return r0
        }

        public static /* synthetic */ int access$3500(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.viewportHeight
                return r0
        }

        public static /* synthetic */ boolean access$3600(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                boolean r0 = r0.viewportOrientationMayChange
                return r0
        }

        public static /* synthetic */ com.google.common.collect.ImmutableList access$3700(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r0.preferredVideoMimeTypes
                return r0
        }

        public static /* synthetic */ int access$3800(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.preferredVideoRoleFlags
                return r0
        }

        public static /* synthetic */ com.google.common.collect.ImmutableList access$3900(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r0.preferredAudioLanguages
                return r0
        }

        public static /* synthetic */ int access$4000(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.preferredAudioRoleFlags
                return r0
        }

        public static /* synthetic */ int access$4100(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.maxAudioChannelCount
                return r0
        }

        public static /* synthetic */ int access$4200(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.maxAudioBitrate
                return r0
        }

        public static /* synthetic */ com.google.common.collect.ImmutableList access$4300(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r0.preferredAudioMimeTypes
                return r0
        }

        public static /* synthetic */ com.google.common.collect.ImmutableList access$4400(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r0.preferredTextLanguages
                return r0
        }

        public static /* synthetic */ int access$4500(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.preferredTextRoleFlags
                return r0
        }

        public static /* synthetic */ int access$4600(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                int r0 = r0.ignoredTextSelectionFlags
                return r0
        }

        public static /* synthetic */ boolean access$4700(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                boolean r0 = r0.selectUndeterminedTextLanguage
                return r0
        }

        public static /* synthetic */ boolean access$4800(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                boolean r0 = r0.forceLowestBitrate
                return r0
        }

        public static /* synthetic */ boolean access$4900(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                boolean r0 = r0.forceHighestSupportedBitrate
                return r0
        }

        public static /* synthetic */ java.util.HashMap access$5000(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r0.overrides
                return r0
        }

        public static /* synthetic */ java.util.HashSet access$5100(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r0) {
                java.util.HashSet<java.lang.Integer> r0 = r0.disabledTrackTypes
                return r0
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void init(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3) {
                r2 = this;
                int r0 = r3.maxVideoWidth
                r2.maxVideoWidth = r0
                int r0 = r3.maxVideoHeight
                r2.maxVideoHeight = r0
                int r0 = r3.maxVideoFrameRate
                r2.maxVideoFrameRate = r0
                int r0 = r3.maxVideoBitrate
                r2.maxVideoBitrate = r0
                int r0 = r3.minVideoWidth
                r2.minVideoWidth = r0
                int r0 = r3.minVideoHeight
                r2.minVideoHeight = r0
                int r0 = r3.minVideoFrameRate
                r2.minVideoFrameRate = r0
                int r0 = r3.minVideoBitrate
                r2.minVideoBitrate = r0
                int r0 = r3.viewportWidth
                r2.viewportWidth = r0
                int r0 = r3.viewportHeight
                r2.viewportHeight = r0
                boolean r0 = r3.viewportOrientationMayChange
                r2.viewportOrientationMayChange = r0
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r3.preferredVideoMimeTypes
                r2.preferredVideoMimeTypes = r0
                int r0 = r3.preferredVideoRoleFlags
                r2.preferredVideoRoleFlags = r0
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r3.preferredAudioLanguages
                r2.preferredAudioLanguages = r0
                int r0 = r3.preferredAudioRoleFlags
                r2.preferredAudioRoleFlags = r0
                int r0 = r3.maxAudioChannelCount
                r2.maxAudioChannelCount = r0
                int r0 = r3.maxAudioBitrate
                r2.maxAudioBitrate = r0
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r3.preferredAudioMimeTypes
                r2.preferredAudioMimeTypes = r0
                com.google.common.collect.ImmutableList<java.lang.String> r0 = r3.preferredTextLanguages
                r2.preferredTextLanguages = r0
                int r0 = r3.preferredTextRoleFlags
                r2.preferredTextRoleFlags = r0
                int r0 = r3.ignoredTextSelectionFlags
                r2.ignoredTextSelectionFlags = r0
                boolean r0 = r3.selectUndeterminedTextLanguage
                r2.selectUndeterminedTextLanguage = r0
                boolean r0 = r3.forceLowestBitrate
                r2.forceLowestBitrate = r0
                boolean r0 = r3.forceHighestSupportedBitrate
                r2.forceHighestSupportedBitrate = r0
                java.util.HashSet r0 = new java.util.HashSet
                com.google.common.collect.ImmutableSet<java.lang.Integer> r1 = r3.disabledTrackTypes
                r0.<init>(r1)
                r2.disabledTrackTypes = r0
                java.util.HashMap r0 = new java.util.HashMap
                com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r3.overrides
                r0.<init>(r3)
                r2.overrides = r0
                return
        }

        private static com.google.common.collect.ImmutableList<java.lang.String> normalizeLanguageCodes(java.lang.String[] r4) {
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                java.lang.String[] r4 = (java.lang.String[]) r4
                int r1 = r4.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L20
                r3 = r4[r2]
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r3 = com.google.android.exoplayer2.util.Util.normalizeLanguageCode(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto Lc
            L20:
                com.google.common.collect.ImmutableList r4 = r0.build()
                return r4
        }

        @androidx.annotation.RequiresApi(19)
        private void setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(android.content.Context r3) {
                r2 = this;
                int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
                r1 = 23
                if (r0 >= r1) goto Ld
                android.os.Looper r0 = android.os.Looper.myLooper()
                if (r0 != 0) goto Ld
                return
            Ld:
                java.lang.String r0 = "captioning"
                java.lang.Object r3 = r3.getSystemService(r0)
                android.view.accessibility.CaptioningManager r3 = (android.view.accessibility.CaptioningManager) r3
                if (r3 == 0) goto L32
                boolean r0 = r3.isEnabled()
                if (r0 != 0) goto L1e
                goto L32
            L1e:
                r0 = 1088(0x440, float:1.525E-42)
                r2.preferredTextRoleFlags = r0
                java.util.Locale r3 = r3.getLocale()
                if (r3 == 0) goto L32
                java.lang.String r3 = com.google.android.exoplayer2.util.Util.getLocaleLanguageTag(r3)
                com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
                r2.preferredTextLanguages = r3
            L32:
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r3) {
                r2 = this;
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r2.overrides
                com.google.android.exoplayer2.source.TrackGroup r1 = r3.mediaTrackGroup
                r0.put(r1, r3)
                return r2
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters build() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters
                r0.<init>(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverride(com.google.android.exoplayer2.source.TrackGroup r2) {
                r1 = this;
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r1.overrides
                r0.remove(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverrides() {
                r1 = this;
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r1.overrides
                r0.clear()
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverridesOfType(int r3) {
                r2 = this;
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r2.overrides
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r1
                int r1 = r1.getType()
                if (r1 != r3) goto La
                r0.remove()
                goto La
            L20:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = r1.setMaxVideoSize(r0, r0)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
                r2 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 1
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = r2.setViewportSize(r0, r0, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder set(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                r0 = this;
                r0.init(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> r2) {
                r1 = this;
                java.util.HashSet<java.lang.Integer> r0 = r1.disabledTrackTypes
                r0.clear()
                java.util.HashSet<java.lang.Integer> r0 = r1.disabledTrackTypes
                r0.addAll(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean r1) {
                r0 = this;
                r0.forceHighestSupportedBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceLowestBitrate(boolean r1) {
                r0 = this;
                r0.forceLowestBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int r1) {
                r0 = this;
                r0.ignoredTextSelectionFlags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioBitrate(int r1) {
                r0 = this;
                r0.maxAudioBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioChannelCount(int r1) {
                r0 = this;
                r0.maxAudioChannelCount = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoBitrate(int r1) {
                r0 = this;
                r0.maxVideoBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoFrameRate(int r1) {
                r0 = this;
                r0.maxVideoFrameRate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSize(int r1, int r2) {
                r0 = this;
                r0.maxVideoWidth = r1
                r0.maxVideoHeight = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
                r2 = this;
                r0 = 1279(0x4ff, float:1.792E-42)
                r1 = 719(0x2cf, float:1.008E-42)
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = r2.setMaxVideoSize(r0, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoBitrate(int r1) {
                r0 = this;
                r0.minVideoBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoFrameRate(int r1) {
                r0 = this;
                r0.minVideoFrameRate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoSize(int r1, int r2) {
                r0 = this;
                r0.minVideoWidth = r1
                r0.minVideoHeight = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r3) {
                r2 = this;
                int r0 = r3.getType()
                r2.clearOverridesOfType(r0)
                java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r2.overrides
                com.google.android.exoplayer2.source.TrackGroup r1 = r3.mediaTrackGroup
                r0.put(r1, r3)
                return r2
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguage(@androidx.annotation.Nullable java.lang.String r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto La
                java.lang.String[] r3 = new java.lang.String[r0]
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredAudioLanguages(r3)
                goto L13
            La:
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r1[r0] = r3
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredAudioLanguages(r1)
            L13:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String... r1) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = normalizeLanguageCodes(r1)
                r0.preferredAudioLanguages = r1
                return r0
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeType(@androidx.annotation.Nullable java.lang.String r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto La
                java.lang.String[] r3 = new java.lang.String[r0]
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredAudioMimeTypes(r3)
                goto L13
            La:
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r1[r0] = r3
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredAudioMimeTypes(r1)
            L13:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String... r1) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
                r0.preferredAudioMimeTypes = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int r1) {
                r0 = this;
                r0.preferredAudioRoleFlags = r1
                return r0
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguage(@androidx.annotation.Nullable java.lang.String r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto La
                java.lang.String[] r3 = new java.lang.String[r0]
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredTextLanguages(r3)
                goto L13
            La:
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r1[r0] = r3
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredTextLanguages(r1)
            L13:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context r3) {
                r2 = this;
                int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
                r1 = 19
                if (r0 < r1) goto L9
                r2.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(r3)
            L9:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String... r1) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = normalizeLanguageCodes(r1)
                r0.preferredTextLanguages = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int r1) {
                r0 = this;
                r0.preferredTextRoleFlags = r1
                return r0
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeType(@androidx.annotation.Nullable java.lang.String r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto La
                java.lang.String[] r3 = new java.lang.String[r0]
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredVideoMimeTypes(r3)
                goto L13
            La:
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r1[r0] = r3
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r2.setPreferredVideoMimeTypes(r1)
            L13:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String... r1) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
                r0.preferredVideoMimeTypes = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int r1) {
                r0 = this;
                r0.preferredVideoRoleFlags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean r1) {
                r0 = this;
                r0.selectUndeterminedTextLanguage = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setTrackTypeDisabled(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto Lc
                java.util.HashSet<java.lang.Integer> r2 = r0.disabledTrackTypes
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.add(r1)
                goto L15
            Lc:
                java.util.HashSet<java.lang.Integer> r2 = r0.disabledTrackTypes
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.remove(r1)
            L15:
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSize(int r1, int r2, boolean r3) {
                r0 = this;
                r0.viewportWidth = r1
                r0.viewportHeight = r2
                r0.viewportOrientationMayChange = r3
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context r2, boolean r3) {
                r1 = this;
                android.graphics.Point r2 = com.google.android.exoplayer2.util.Util.getCurrentDisplayModeSize(r2)
                int r0 = r2.x
                int r2 = r2.y
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r2 = r1.setViewportSize(r0, r2, r3)
                return r2
        }
    }

    static {
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r0.<init>()
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.build()
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_LANGUAGES = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_ROLE_FLAGS = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_TEXT_LANGUAGES = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_TEXT_ROLE_FLAGS = r0
            r0 = 5
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = r0
            r0 = 6
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_WIDTH = r0
            r0 = 7
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_HEIGHT = r0
            r0 = 8
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_FRAMERATE = r0
            r0 = 9
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_BITRATE = r0
            r0 = 10
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_WIDTH = r0
            r0 = 11
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_HEIGHT = r0
            r0 = 12
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_FRAMERATE = r0
            r0 = 13
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_BITRATE = r0
            r0 = 14
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_WIDTH = r0
            r0 = 15
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_HEIGHT = r0
            r0 = 16
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = r0
            r0 = 17
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_MIMETYPES = r0
            r0 = 18
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_AUDIO_CHANNEL_COUNT = r0
            r0 = 19
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_AUDIO_BITRATE = r0
            r0 = 20
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_MIME_TYPES = r0
            r0 = 21
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_FORCE_LOWEST_BITRATE = r0
            r0 = 22
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = r0
            r0 = 23
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_SELECTION_OVERRIDES = r0
            r0 = 24
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_DISABLED_TRACK_TYPE = r0
            r0 = 25
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_ROLE_FLAGS = r0
            r0 = 26
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_IGNORED_TEXT_SELECTION_FLAGS = r0
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE$3
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters.CREATOR = r0
            return
    }

    public TrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$2600(r2)
            r1.maxVideoWidth = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$2700(r2)
            r1.maxVideoHeight = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$2800(r2)
            r1.maxVideoFrameRate = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$2900(r2)
            r1.maxVideoBitrate = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3000(r2)
            r1.minVideoWidth = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3100(r2)
            r1.minVideoHeight = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3200(r2)
            r1.minVideoFrameRate = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3300(r2)
            r1.minVideoBitrate = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3400(r2)
            r1.viewportWidth = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3500(r2)
            r1.viewportHeight = r0
            boolean r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3600(r2)
            r1.viewportOrientationMayChange = r0
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3700(r2)
            r1.preferredVideoMimeTypes = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3800(r2)
            r1.preferredVideoRoleFlags = r0
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$3900(r2)
            r1.preferredAudioLanguages = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4000(r2)
            r1.preferredAudioRoleFlags = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4100(r2)
            r1.maxAudioChannelCount = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4200(r2)
            r1.maxAudioBitrate = r0
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4300(r2)
            r1.preferredAudioMimeTypes = r0
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4400(r2)
            r1.preferredTextLanguages = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4500(r2)
            r1.preferredTextRoleFlags = r0
            int r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4600(r2)
            r1.ignoredTextSelectionFlags = r0
            boolean r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4700(r2)
            r1.selectUndeterminedTextLanguage = r0
            boolean r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4800(r2)
            r1.forceLowestBitrate = r0
            boolean r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$4900(r2)
            r1.forceHighestSupportedBitrate = r0
            java.util.HashMap r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$5000(r2)
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            r1.overrides = r0
            java.util.HashSet r2 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder.access$5100(r2)
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.copyOf(r2)
            r1.disabledTrackTypes = r2
            return
    }

    public static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_WIDTH
            return r0
    }

    public static /* synthetic */ java.lang.String access$100() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_HEIGHT
            return r0
    }

    public static /* synthetic */ java.lang.String access$1000() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE
            return r0
    }

    public static /* synthetic */ java.lang.String access$1100() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_MIMETYPES
            return r0
    }

    public static /* synthetic */ java.lang.String access$1200() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_ROLE_FLAGS
            return r0
    }

    public static /* synthetic */ java.lang.String access$1300() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_LANGUAGES
            return r0
    }

    public static /* synthetic */ java.lang.String access$1400() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_ROLE_FLAGS
            return r0
    }

    public static /* synthetic */ java.lang.String access$1500() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_AUDIO_CHANNEL_COUNT
            return r0
    }

    public static /* synthetic */ java.lang.String access$1600() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_AUDIO_BITRATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$1700() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_MIME_TYPES
            return r0
    }

    public static /* synthetic */ java.lang.String access$1800() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_TEXT_LANGUAGES
            return r0
    }

    public static /* synthetic */ java.lang.String access$1900() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_TEXT_ROLE_FLAGS
            return r0
    }

    public static /* synthetic */ java.lang.String access$200() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_FRAMERATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$2000() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_IGNORED_TEXT_SELECTION_FLAGS
            return r0
    }

    public static /* synthetic */ java.lang.String access$2100() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE
            return r0
    }

    public static /* synthetic */ java.lang.String access$2200() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_FORCE_LOWEST_BITRATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$2300() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$2400() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_SELECTION_OVERRIDES
            return r0
    }

    public static /* synthetic */ java.lang.String access$2500() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_DISABLED_TRACK_TYPE
            return r0
    }

    public static /* synthetic */ java.lang.String access$300() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_BITRATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$400() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_WIDTH
            return r0
    }

    public static /* synthetic */ java.lang.String access$500() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_HEIGHT
            return r0
    }

    public static /* synthetic */ java.lang.String access$600() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_FRAMERATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$700() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_BITRATE
            return r0
    }

    public static /* synthetic */ java.lang.String access$800() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_WIDTH
            return r0
    }

    public static /* synthetic */ java.lang.String access$900() {
            java.lang.String r0 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_HEIGHT
            return r0
    }

    public static com.google.android.exoplayer2.trackselection.TrackSelectionParameters fromBundle(android.os.Bundle r1) {
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r0.<init>(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r0.build()
            return r1
    }

    public static com.google.android.exoplayer2.trackselection.TrackSelectionParameters getDefaults(android.content.Context r1) {
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r0.<init>(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r0.build()
            return r1
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder buildUpon() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder
            r0.<init>(r1)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto Lcc
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            goto Lcc
        L13:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5 = (com.google.android.exoplayer2.trackselection.TrackSelectionParameters) r5
            int r2 = r4.maxVideoWidth
            int r3 = r5.maxVideoWidth
            if (r2 != r3) goto Lca
            int r2 = r4.maxVideoHeight
            int r3 = r5.maxVideoHeight
            if (r2 != r3) goto Lca
            int r2 = r4.maxVideoFrameRate
            int r3 = r5.maxVideoFrameRate
            if (r2 != r3) goto Lca
            int r2 = r4.maxVideoBitrate
            int r3 = r5.maxVideoBitrate
            if (r2 != r3) goto Lca
            int r2 = r4.minVideoWidth
            int r3 = r5.minVideoWidth
            if (r2 != r3) goto Lca
            int r2 = r4.minVideoHeight
            int r3 = r5.minVideoHeight
            if (r2 != r3) goto Lca
            int r2 = r4.minVideoFrameRate
            int r3 = r5.minVideoFrameRate
            if (r2 != r3) goto Lca
            int r2 = r4.minVideoBitrate
            int r3 = r5.minVideoBitrate
            if (r2 != r3) goto Lca
            boolean r2 = r4.viewportOrientationMayChange
            boolean r3 = r5.viewportOrientationMayChange
            if (r2 != r3) goto Lca
            int r2 = r4.viewportWidth
            int r3 = r5.viewportWidth
            if (r2 != r3) goto Lca
            int r2 = r4.viewportHeight
            int r3 = r5.viewportHeight
            if (r2 != r3) goto Lca
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r4.preferredVideoMimeTypes
            com.google.common.collect.ImmutableList<java.lang.String> r3 = r5.preferredVideoMimeTypes
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            int r2 = r4.preferredVideoRoleFlags
            int r3 = r5.preferredVideoRoleFlags
            if (r2 != r3) goto Lca
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r4.preferredAudioLanguages
            com.google.common.collect.ImmutableList<java.lang.String> r3 = r5.preferredAudioLanguages
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            int r2 = r4.preferredAudioRoleFlags
            int r3 = r5.preferredAudioRoleFlags
            if (r2 != r3) goto Lca
            int r2 = r4.maxAudioChannelCount
            int r3 = r5.maxAudioChannelCount
            if (r2 != r3) goto Lca
            int r2 = r4.maxAudioBitrate
            int r3 = r5.maxAudioBitrate
            if (r2 != r3) goto Lca
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r4.preferredAudioMimeTypes
            com.google.common.collect.ImmutableList<java.lang.String> r3 = r5.preferredAudioMimeTypes
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r4.preferredTextLanguages
            com.google.common.collect.ImmutableList<java.lang.String> r3 = r5.preferredTextLanguages
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            int r2 = r4.preferredTextRoleFlags
            int r3 = r5.preferredTextRoleFlags
            if (r2 != r3) goto Lca
            int r2 = r4.ignoredTextSelectionFlags
            int r3 = r5.ignoredTextSelectionFlags
            if (r2 != r3) goto Lca
            boolean r2 = r4.selectUndeterminedTextLanguage
            boolean r3 = r5.selectUndeterminedTextLanguage
            if (r2 != r3) goto Lca
            boolean r2 = r4.forceLowestBitrate
            boolean r3 = r5.forceLowestBitrate
            if (r2 != r3) goto Lca
            boolean r2 = r4.forceHighestSupportedBitrate
            boolean r3 = r5.forceHighestSupportedBitrate
            if (r2 != r3) goto Lca
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = r4.overrides
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r5.overrides
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lca
            com.google.common.collect.ImmutableSet<java.lang.Integer> r2 = r4.disabledTrackTypes
            com.google.common.collect.ImmutableSet<java.lang.Integer> r5 = r5.disabledTrackTypes
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto Lca
            goto Lcb
        Lca:
            r0 = 0
        Lcb:
            return r0
        Lcc:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.maxVideoWidth
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r3.maxVideoHeight
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.maxVideoFrameRate
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.maxVideoBitrate
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.minVideoWidth
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.minVideoHeight
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.minVideoFrameRate
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.minVideoBitrate
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r3.viewportOrientationMayChange
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.viewportWidth
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.viewportHeight
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r3.preferredVideoMimeTypes
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            int r0 = r3.preferredVideoRoleFlags
            int r2 = r2 + r0
            int r2 = r2 * 31
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r3.preferredAudioLanguages
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.preferredAudioRoleFlags
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.maxAudioChannelCount
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.maxAudioBitrate
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r3.preferredAudioMimeTypes
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r3.preferredTextLanguages
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.preferredTextRoleFlags
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.ignoredTextSelectionFlags
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r3.selectUndeterminedTextLanguage
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r3.forceLowestBitrate
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r3.forceHighestSupportedBitrate
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = r3.overrides
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            com.google.common.collect.ImmutableSet<java.lang.Integer> r0 = r3.disabledTrackTypes
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_WIDTH
            int r2 = r5.maxVideoWidth
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_HEIGHT
            int r2 = r5.maxVideoHeight
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_FRAMERATE
            int r2 = r5.maxVideoFrameRate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_VIDEO_BITRATE
            int r2 = r5.maxVideoBitrate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_WIDTH
            int r2 = r5.minVideoWidth
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_HEIGHT
            int r2 = r5.minVideoHeight
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_FRAMERATE
            int r2 = r5.minVideoFrameRate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MIN_VIDEO_BITRATE
            int r2 = r5.minVideoBitrate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_WIDTH
            int r2 = r5.viewportWidth
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_HEIGHT
            int r2 = r5.viewportHeight
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE
            boolean r2 = r5.viewportOrientationMayChange
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_MIMETYPES
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r5.preferredVideoMimeTypes
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.putStringArray(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_ROLE_FLAGS
            int r2 = r5.preferredVideoRoleFlags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_LANGUAGES
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r5.preferredAudioLanguages
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.putStringArray(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_ROLE_FLAGS
            int r2 = r5.preferredAudioRoleFlags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_AUDIO_CHANNEL_COUNT
            int r2 = r5.maxAudioChannelCount
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_MAX_AUDIO_BITRATE
            int r2 = r5.maxAudioBitrate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_MIME_TYPES
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r5.preferredAudioMimeTypes
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.putStringArray(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_TEXT_LANGUAGES
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r5.preferredTextLanguages
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.putStringArray(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_PREFERRED_TEXT_ROLE_FLAGS
            int r2 = r5.preferredTextRoleFlags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_IGNORED_TEXT_SELECTION_FLAGS
            int r2 = r5.ignoredTextSelectionFlags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE
            boolean r2 = r5.selectUndeterminedTextLanguage
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_FORCE_LOWEST_BITRATE
            boolean r2 = r5.forceLowestBitrate
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE
            boolean r2 = r5.forceHighestSupportedBitrate
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_SELECTION_OVERRIDES
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = r5.overrides
            com.google.common.collect.ImmutableCollection r2 = r2.values()
            java.util.ArrayList r2 = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(r2)
            r0.putParcelableArrayList(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.FIELD_DISABLED_TRACK_TYPE
            com.google.common.collect.ImmutableSet<java.lang.Integer> r2 = r5.disabledTrackTypes
            int[] r2 = com.google.common.primitives.Ints.toArray(r2)
            r0.putIntArray(r1, r2)
            return r0
    }
}
