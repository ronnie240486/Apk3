package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.MappingTrackSelector {
    private static final java.lang.String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final com.google.common.collect.Ordering<java.lang.Integer> FORMAT_VALUE_ORDERING = null;
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private static final com.google.common.collect.Ordering<java.lang.Integer> NO_ORDER = null;
    private static final java.lang.String TAG = "DefaultTrackSelector";

    @androidx.annotation.GuardedBy("lock")
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;

    @androidx.annotation.Nullable
    public final android.content.Context context;
    private final boolean deviceIsTV;
    private final java.lang.Object lock;

    @androidx.annotation.GuardedBy("lock")
    private com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("lock")
    private com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializer;
    private final com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory trackSelectionFactory;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class AudioTrackInfo extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> implements java.lang.Comparable<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> {
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;

        @androidx.annotation.Nullable
        private final java.lang.String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int r6, com.google.android.exoplayer2.source.TrackGroup r7, int r8, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r9, int r10, boolean r11, com.google.common.base.Predicate<com.google.android.exoplayer2.Format> r12) {
                r5 = this;
                r5.<init>(r6, r7, r8)
                r5.parameters = r9
                com.google.android.exoplayer2.Format r6 = r5.format
                java.lang.String r6 = r6.language
                java.lang.String r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(r6)
                r5.language = r6
                r6 = 0
                boolean r7 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r10, r6)
                r5.isWithinRendererCapabilities = r7
                r7 = 0
            L17:
                com.google.common.collect.ImmutableList<java.lang.String> r8 = r9.preferredAudioLanguages
                int r8 = r8.size()
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r7 >= r8) goto L36
                com.google.android.exoplayer2.Format r8 = r5.format
                com.google.common.collect.ImmutableList<java.lang.String> r1 = r9.preferredAudioLanguages
                java.lang.Object r1 = r1.get(r7)
                java.lang.String r1 = (java.lang.String) r1
                int r8 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(r8, r1, r6)
                if (r8 <= 0) goto L33
                goto L3a
            L33:
                int r7 = r7 + 1
                goto L17
            L36:
                r7 = 2147483647(0x7fffffff, float:NaN)
                r8 = 0
            L3a:
                r5.preferredLanguageIndex = r7
                r5.preferredLanguageScore = r8
                com.google.android.exoplayer2.Format r7 = r5.format
                int r7 = r7.roleFlags
                int r8 = r9.preferredAudioRoleFlags
                int r7 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$3800(r7, r8)
                r5.preferredRoleFlagsScore = r7
                com.google.android.exoplayer2.Format r7 = r5.format
                int r8 = r7.roleFlags
                r1 = 1
                if (r8 == 0) goto L57
                r8 = r8 & r1
                if (r8 == 0) goto L55
                goto L57
            L55:
                r8 = 0
                goto L58
            L57:
                r8 = 1
            L58:
                r5.hasMainOrNoRoleFlag = r8
                int r8 = r7.selectionFlags
                r8 = r8 & r1
                if (r8 == 0) goto L61
                r8 = 1
                goto L62
            L61:
                r8 = 0
            L62:
                r5.isDefaultSelectionFlag = r8
                int r8 = r7.channelCount
                r5.channelCount = r8
                int r2 = r7.sampleRate
                r5.sampleRate = r2
                int r2 = r7.bitrate
                r5.bitrate = r2
                r3 = -1
                if (r2 == r3) goto L77
                int r4 = r9.maxAudioBitrate
                if (r2 > r4) goto L85
            L77:
                if (r8 == r3) goto L7d
                int r2 = r9.maxAudioChannelCount
                if (r8 > r2) goto L85
            L7d:
                boolean r7 = r12.apply(r7)
                if (r7 == 0) goto L85
                r7 = 1
                goto L86
            L85:
                r7 = 0
            L86:
                r5.isWithinConstraints = r7
                java.lang.String[] r7 = com.google.android.exoplayer2.util.Util.getSystemLanguageCodes()
                r8 = 0
            L8d:
                int r12 = r7.length
                if (r8 >= r12) goto L9e
                com.google.android.exoplayer2.Format r12 = r5.format
                r2 = r7[r8]
                int r12 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(r12, r2, r6)
                if (r12 <= 0) goto L9b
                goto La2
            L9b:
                int r8 = r8 + 1
                goto L8d
            L9e:
                r8 = 2147483647(0x7fffffff, float:NaN)
                r12 = 0
            La2:
                r5.localeLanguageMatchIndex = r8
                r5.localeLanguageScore = r12
                r7 = 0
            La7:
                com.google.common.collect.ImmutableList<java.lang.String> r8 = r9.preferredAudioMimeTypes
                int r8 = r8.size()
                if (r7 >= r8) goto Lc6
                com.google.android.exoplayer2.Format r8 = r5.format
                java.lang.String r8 = r8.sampleMimeType
                if (r8 == 0) goto Lc3
                com.google.common.collect.ImmutableList<java.lang.String> r12 = r9.preferredAudioMimeTypes
                java.lang.Object r12 = r12.get(r7)
                boolean r8 = r8.equals(r12)
                if (r8 == 0) goto Lc3
                r0 = r7
                goto Lc6
            Lc3:
                int r7 = r7 + 1
                goto La7
            Lc6:
                r5.preferredMimeTypeMatchIndex = r0
                int r7 = com.google.android.exoplayer2.RendererCapabilities.CC.getDecoderSupport(r10)
                r8 = 128(0x80, float:1.8E-43)
                if (r7 != r8) goto Ld2
                r7 = 1
                goto Ld3
            Ld2:
                r7 = 0
            Ld3:
                r5.usesPrimaryDecoder = r7
                int r7 = com.google.android.exoplayer2.RendererCapabilities.CC.getHardwareAccelerationSupport(r10)
                r8 = 64
                if (r7 != r8) goto Lde
                r6 = 1
            Lde:
                r5.usesHardwareAcceleration = r6
                int r6 = r5.evaluateSelectionEligibility(r10, r11)
                r5.selectionEligibility = r6
                return
        }

        public static int compareSelections(java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> r0, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> r1) {
                java.lang.Object r0 = java.util.Collections.max(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$AudioTrackInfo r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo) r0
                java.lang.Object r1 = java.util.Collections.max(r1)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$AudioTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo) r1
                int r0 = r0.compareTo2(r1)
                return r0
        }

        public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> createForTrackGroup(int r12, com.google.android.exoplayer2.source.TrackGroup r13, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r14, int[] r15, boolean r16, com.google.common.base.Predicate<com.google.android.exoplayer2.Format> r17) {
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                r1 = 0
                r10 = r13
            L6:
                int r2 = r10.length
                if (r1 >= r2) goto L20
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$AudioTrackInfo r11 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$AudioTrackInfo
                r7 = r15[r1]
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r1
                r6 = r14
                r8 = r16
                r9 = r17
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                r0.add(r11)
                int r1 = r1 + 1
                goto L6
            L20:
                com.google.common.collect.ImmutableList r0 = r0.build()
                return r0
        }

        private int evaluateSelectionEligibility(int r3, boolean r4) {
                r2 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r2.parameters
                boolean r0 = r0.exceedRendererCapabilitiesIfNecessary
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r3, r0)
                r1 = 0
                if (r0 != 0) goto Lc
                return r1
            Lc:
                boolean r0 = r2.isWithinConstraints
                if (r0 != 0) goto L17
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r2.parameters
                boolean r0 = r0.exceedAudioConstraintsIfNecessary
                if (r0 != 0) goto L17
                return r1
            L17:
                boolean r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r3, r1)
                if (r3 == 0) goto L3a
                boolean r3 = r2.isWithinConstraints
                if (r3 == 0) goto L3a
                com.google.android.exoplayer2.Format r3 = r2.format
                int r3 = r3.bitrate
                r0 = -1
                if (r3 == r0) goto L3a
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r3 = r2.parameters
                boolean r0 = r3.forceHighestSupportedBitrate
                if (r0 != 0) goto L3a
                boolean r0 = r3.forceLowestBitrate
                if (r0 != 0) goto L3a
                boolean r3 = r3.allowMultipleAdaptiveSelections
                if (r3 != 0) goto L38
                if (r4 != 0) goto L3a
            L38:
                r3 = 2
                goto L3b
            L3a:
                r3 = 1
            L3b:
                return r3
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo r6) {
                r5 = this;
                boolean r0 = r5.isWithinConstraints
                if (r0 == 0) goto Ld
                boolean r0 = r5.isWithinRendererCapabilities
                if (r0 == 0) goto Ld
                com.google.common.collect.Ordering r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4000()
                goto L15
            Ld:
                com.google.common.collect.Ordering r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4000()
                com.google.common.collect.Ordering r0 = r0.reverse()
            L15:
                com.google.common.collect.ComparisonChain r1 = com.google.common.collect.ComparisonChain.start()
                boolean r2 = r5.isWithinRendererCapabilities
                boolean r3 = r6.isWithinRendererCapabilities
                com.google.common.collect.ComparisonChain r1 = r1.compareFalseFirst(r2, r3)
                int r2 = r5.preferredLanguageIndex
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.preferredLanguageIndex
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.Ordering r4 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r4 = r4.reverse()
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r4)
                int r2 = r5.preferredLanguageScore
                int r3 = r6.preferredLanguageScore
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3)
                int r2 = r5.preferredRoleFlagsScore
                int r3 = r6.preferredRoleFlagsScore
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3)
                boolean r2 = r5.isDefaultSelectionFlag
                boolean r3 = r6.isDefaultSelectionFlag
                com.google.common.collect.ComparisonChain r1 = r1.compareFalseFirst(r2, r3)
                boolean r2 = r5.hasMainOrNoRoleFlag
                boolean r3 = r6.hasMainOrNoRoleFlag
                com.google.common.collect.ComparisonChain r1 = r1.compareFalseFirst(r2, r3)
                int r2 = r5.localeLanguageMatchIndex
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.localeLanguageMatchIndex
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.Ordering r4 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r4 = r4.reverse()
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r4)
                int r2 = r5.localeLanguageScore
                int r3 = r6.localeLanguageScore
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3)
                boolean r2 = r5.isWithinConstraints
                boolean r3 = r6.isWithinConstraints
                com.google.common.collect.ComparisonChain r1 = r1.compareFalseFirst(r2, r3)
                int r2 = r5.preferredMimeTypeMatchIndex
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.preferredMimeTypeMatchIndex
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.Ordering r4 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r4 = r4.reverse()
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r4)
                int r2 = r5.bitrate
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.bitrate
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r4 = r5.parameters
                boolean r4 = r4.forceLowestBitrate
                if (r4 == 0) goto Lb4
                com.google.common.collect.Ordering r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4000()
                com.google.common.collect.Ordering r4 = r4.reverse()
                goto Lb8
            Lb4:
                com.google.common.collect.Ordering r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4100()
            Lb8:
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r4)
                boolean r2 = r5.usesPrimaryDecoder
                boolean r3 = r6.usesPrimaryDecoder
                com.google.common.collect.ComparisonChain r1 = r1.compareFalseFirst(r2, r3)
                boolean r2 = r5.usesHardwareAcceleration
                boolean r3 = r6.usesHardwareAcceleration
                com.google.common.collect.ComparisonChain r1 = r1.compareFalseFirst(r2, r3)
                int r2 = r5.channelCount
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.channelCount
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r0)
                int r2 = r5.sampleRate
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.sampleRate
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r0)
                int r2 = r5.bitrate
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.bitrate
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = r5.language
                java.lang.String r6 = r6.language
                boolean r6 = com.google.android.exoplayer2.util.Util.areEqual(r4, r6)
                if (r6 == 0) goto L103
                goto L107
            L103:
                com.google.common.collect.Ordering r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4100()
            L107:
                com.google.common.collect.ComparisonChain r6 = r1.compare(r2, r3, r0)
                int r6 = r6.result()
                return r6
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$AudioTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
                r1 = this;
                int r0 = r1.selectionEligibility
                return r0
        }

        public boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo r5) {
                r4 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r4.parameters
                boolean r1 = r0.allowAudioMixedChannelCountAdaptiveness
                r2 = -1
                if (r1 != 0) goto L13
                com.google.android.exoplayer2.Format r1 = r4.format
                int r1 = r1.channelCount
                if (r1 == r2) goto L4a
                com.google.android.exoplayer2.Format r3 = r5.format
                int r3 = r3.channelCount
                if (r1 != r3) goto L4a
            L13:
                boolean r0 = r0.allowAudioMixedMimeTypeAdaptiveness
                if (r0 != 0) goto L27
                com.google.android.exoplayer2.Format r0 = r4.format
                java.lang.String r0 = r0.sampleMimeType
                if (r0 == 0) goto L4a
                com.google.android.exoplayer2.Format r1 = r5.format
                java.lang.String r1 = r1.sampleMimeType
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L4a
            L27:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r4.parameters
                boolean r1 = r0.allowAudioMixedSampleRateAdaptiveness
                if (r1 != 0) goto L39
                com.google.android.exoplayer2.Format r1 = r4.format
                int r1 = r1.sampleRate
                if (r1 == r2) goto L4a
                com.google.android.exoplayer2.Format r2 = r5.format
                int r2 = r2.sampleRate
                if (r1 != r2) goto L4a
            L39:
                boolean r0 = r0.allowAudioMixedDecoderSupportAdaptiveness
                if (r0 != 0) goto L4c
                boolean r0 = r4.usesPrimaryDecoder
                boolean r1 = r5.usesPrimaryDecoder
                if (r0 != r1) goto L4a
                boolean r0 = r4.usesHardwareAcceleration
                boolean r5 = r5.usesHardwareAcceleration
                if (r0 != r5) goto L4a
                goto L4c
            L4a:
                r5 = 0
                goto L4d
            L4c:
                r5 = 1
            L4d:
                return r5
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$AudioTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo) r1
                boolean r1 = r0.isCompatibleForAdaptationWith(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class OtherTrackScore implements java.lang.Comparable<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(com.google.android.exoplayer2.Format r3, int r4) {
                r2 = this;
                r2.<init>()
                int r3 = r3.selectionFlags
                r0 = 1
                r3 = r3 & r0
                r1 = 0
                if (r3 == 0) goto Lb
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r2.isDefault = r0
                boolean r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r4, r1)
                r2.isWithinRendererCapabilities = r3
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore r4) {
                r3 = this;
                com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.start()
                boolean r1 = r3.isWithinRendererCapabilities
                boolean r2 = r4.isWithinRendererCapabilities
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                boolean r1 = r3.isDefault
                boolean r4 = r4.isDefault
                com.google.common.collect.ComparisonChain r4 = r0.compareFalseFirst(r1, r4)
                int r4 = r4.result()
                return r4
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$OtherTrackScore r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Parameters extends com.google.android.exoplayer2.trackselection.TrackSelectionParameters {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters> CREATOR = null;

        @java.lang.Deprecated
        public static final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters DEFAULT = null;
        public static final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters DEFAULT_WITHOUT_CONTEXT = null;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = null;
        private static final java.lang.String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = null;
        private static final java.lang.String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = null;
        private static final java.lang.String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = null;
        private static final java.lang.String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = null;
        private static final java.lang.String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = null;
        private static final java.lang.String FIELD_RENDERER_DISABLED_INDICES = null;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES = null;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = null;
        private static final java.lang.String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = null;
        private static final java.lang.String FIELD_TUNNELING_ENABLED = null;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final android.util.SparseBooleanArray rendererDisabledFlags;
        private final android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class Builder extends com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final android.util.SparseBooleanArray rendererDisabledFlags;
            private final android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            @java.lang.Deprecated
            public Builder() {
                    r1 = this;
                    r1.<init>()
                    android.util.SparseArray r0 = new android.util.SparseArray
                    r0.<init>()
                    r1.selectionOverrides = r0
                    android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
                    r0.<init>()
                    r1.rendererDisabledFlags = r0
                    r1.init()
                    return
            }

            public Builder(android.content.Context r1) {
                    r0 = this;
                    r0.<init>(r1)
                    android.util.SparseArray r1 = new android.util.SparseArray
                    r1.<init>()
                    r0.selectionOverrides = r1
                    android.util.SparseBooleanArray r1 = new android.util.SparseBooleanArray
                    r1.<init>()
                    r0.rendererDisabledFlags = r1
                    r0.init()
                    return
            }

            private Builder(android.os.Bundle r4) {
                    r3 = this;
                    r3.<init>(r4)
                    r3.init()
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$200()
                    boolean r2 = r0.exceedVideoConstraintsIfNecessary
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setExceedVideoConstraintsIfNecessary(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$300()
                    boolean r2 = r0.allowVideoMixedMimeTypeAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowVideoMixedMimeTypeAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$400()
                    boolean r2 = r0.allowVideoNonSeamlessAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowVideoNonSeamlessAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$500()
                    boolean r2 = r0.allowVideoMixedDecoderSupportAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowVideoMixedDecoderSupportAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$600()
                    boolean r2 = r0.exceedAudioConstraintsIfNecessary
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setExceedAudioConstraintsIfNecessary(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$700()
                    boolean r2 = r0.allowAudioMixedMimeTypeAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowAudioMixedMimeTypeAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$800()
                    boolean r2 = r0.allowAudioMixedSampleRateAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowAudioMixedSampleRateAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$900()
                    boolean r2 = r0.allowAudioMixedChannelCountAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowAudioMixedChannelCountAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1000()
                    boolean r2 = r0.allowAudioMixedDecoderSupportAdaptiveness
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setAllowAudioMixedDecoderSupportAdaptiveness(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1100()
                    boolean r2 = r0.constrainAudioChannelCountToDeviceCapabilities
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setConstrainAudioChannelCountToDeviceCapabilities(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1200()
                    boolean r2 = r0.exceedRendererCapabilitiesIfNecessary
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setExceedRendererCapabilitiesIfNecessary(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1300()
                    boolean r2 = r0.tunnelingEnabled
                    boolean r1 = r4.getBoolean(r1, r2)
                    r3.setTunnelingEnabled(r1)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1400()
                    boolean r0 = r0.allowMultipleAdaptiveSelections
                    boolean r0 = r4.getBoolean(r1, r0)
                    r3.setAllowMultipleAdaptiveSelections(r0)
                    android.util.SparseArray r0 = new android.util.SparseArray
                    r0.<init>()
                    r3.selectionOverrides = r0
                    r3.setSelectionOverridesFromBundle(r4)
                    java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1500()
                    int[] r4 = r4.getIntArray(r0)
                    android.util.SparseBooleanArray r4 = r3.makeSparseBooleanArrayFromTrueKeys(r4)
                    r3.rendererDisabledFlags = r4
                    return
            }

            public /* synthetic */ Builder(android.os.Bundle r1, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            private Builder(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r2) {
                    r1 = this;
                    r1.<init>(r2)
                    boolean r0 = r2.exceedVideoConstraintsIfNecessary
                    r1.exceedVideoConstraintsIfNecessary = r0
                    boolean r0 = r2.allowVideoMixedMimeTypeAdaptiveness
                    r1.allowVideoMixedMimeTypeAdaptiveness = r0
                    boolean r0 = r2.allowVideoNonSeamlessAdaptiveness
                    r1.allowVideoNonSeamlessAdaptiveness = r0
                    boolean r0 = r2.allowVideoMixedDecoderSupportAdaptiveness
                    r1.allowVideoMixedDecoderSupportAdaptiveness = r0
                    boolean r0 = r2.exceedAudioConstraintsIfNecessary
                    r1.exceedAudioConstraintsIfNecessary = r0
                    boolean r0 = r2.allowAudioMixedMimeTypeAdaptiveness
                    r1.allowAudioMixedMimeTypeAdaptiveness = r0
                    boolean r0 = r2.allowAudioMixedSampleRateAdaptiveness
                    r1.allowAudioMixedSampleRateAdaptiveness = r0
                    boolean r0 = r2.allowAudioMixedChannelCountAdaptiveness
                    r1.allowAudioMixedChannelCountAdaptiveness = r0
                    boolean r0 = r2.allowAudioMixedDecoderSupportAdaptiveness
                    r1.allowAudioMixedDecoderSupportAdaptiveness = r0
                    boolean r0 = r2.constrainAudioChannelCountToDeviceCapabilities
                    r1.constrainAudioChannelCountToDeviceCapabilities = r0
                    boolean r0 = r2.exceedRendererCapabilitiesIfNecessary
                    r1.exceedRendererCapabilitiesIfNecessary = r0
                    boolean r0 = r2.tunnelingEnabled
                    r1.tunnelingEnabled = r0
                    boolean r0 = r2.allowMultipleAdaptiveSelections
                    r1.allowMultipleAdaptiveSelections = r0
                    android.util.SparseArray r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$000(r2)
                    android.util.SparseArray r0 = cloneSelectionOverrides(r0)
                    r1.selectionOverrides = r0
                    android.util.SparseBooleanArray r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$100(r2)
                    android.util.SparseBooleanArray r2 = r2.clone()
                    r1.rendererDisabledFlags = r2
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r1, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ boolean access$2000(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.exceedVideoConstraintsIfNecessary
                    return r0
            }

            public static /* synthetic */ boolean access$2100(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowVideoMixedMimeTypeAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2200(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowVideoNonSeamlessAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2300(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowVideoMixedDecoderSupportAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2400(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.exceedAudioConstraintsIfNecessary
                    return r0
            }

            public static /* synthetic */ boolean access$2500(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowAudioMixedMimeTypeAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2600(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowAudioMixedSampleRateAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2700(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowAudioMixedChannelCountAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2800(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowAudioMixedDecoderSupportAdaptiveness
                    return r0
            }

            public static /* synthetic */ boolean access$2900(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.constrainAudioChannelCountToDeviceCapabilities
                    return r0
            }

            public static /* synthetic */ boolean access$3000(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.exceedRendererCapabilitiesIfNecessary
                    return r0
            }

            public static /* synthetic */ boolean access$3100(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.tunnelingEnabled
                    return r0
            }

            public static /* synthetic */ boolean access$3200(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    boolean r0 = r0.allowMultipleAdaptiveSelections
                    return r0
            }

            public static /* synthetic */ android.util.SparseArray access$3300(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r0.selectionOverrides
                    return r0
            }

            public static /* synthetic */ android.util.SparseBooleanArray access$3400(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r0) {
                    android.util.SparseBooleanArray r0 = r0.rendererDisabledFlags
                    return r0
            }

            private static android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> cloneSelectionOverrides(android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> r5) {
                    android.util.SparseArray r0 = new android.util.SparseArray
                    r0.<init>()
                    r1 = 0
                L6:
                    int r2 = r5.size()
                    if (r1 >= r2) goto L21
                    int r2 = r5.keyAt(r1)
                    java.util.HashMap r3 = new java.util.HashMap
                    java.lang.Object r4 = r5.valueAt(r1)
                    java.util.Map r4 = (java.util.Map) r4
                    r3.<init>(r4)
                    r0.put(r2, r3)
                    int r1 = r1 + 1
                    goto L6
                L21:
                    return r0
            }

            private void init() {
                    r2 = this;
                    r0 = 1
                    r2.exceedVideoConstraintsIfNecessary = r0
                    r1 = 0
                    r2.allowVideoMixedMimeTypeAdaptiveness = r1
                    r2.allowVideoNonSeamlessAdaptiveness = r0
                    r2.allowVideoMixedDecoderSupportAdaptiveness = r1
                    r2.exceedAudioConstraintsIfNecessary = r0
                    r2.allowAudioMixedMimeTypeAdaptiveness = r1
                    r2.allowAudioMixedSampleRateAdaptiveness = r1
                    r2.allowAudioMixedChannelCountAdaptiveness = r1
                    r2.allowAudioMixedDecoderSupportAdaptiveness = r1
                    r2.constrainAudioChannelCountToDeviceCapabilities = r0
                    r2.exceedRendererCapabilitiesIfNecessary = r0
                    r2.tunnelingEnabled = r1
                    r2.allowMultipleAdaptiveSelections = r0
                    return
            }

            private android.util.SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(@androidx.annotation.Nullable int[] r6) {
                    r5 = this;
                    if (r6 != 0) goto L8
                    android.util.SparseBooleanArray r6 = new android.util.SparseBooleanArray
                    r6.<init>()
                    return r6
                L8:
                    android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
                    int r1 = r6.length
                    r0.<init>(r1)
                    int r1 = r6.length
                    r2 = 0
                L10:
                    if (r2 >= r1) goto L1b
                    r3 = r6[r2]
                    r4 = 1
                    r0.append(r3, r4)
                    int r2 = r2 + 1
                    goto L10
                L1b:
                    return r0
            }

            private void setSelectionOverridesFromBundle(android.os.Bundle r7) {
                    r6 = this;
                    java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1700()
                    int[] r0 = r7.getIntArray(r0)
                    java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1800()
                    java.util.ArrayList r1 = r7.getParcelableArrayList(r1)
                    if (r1 != 0) goto L17
                    com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
                    goto L1d
                L17:
                    com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.source.TrackGroupArray> r2 = com.google.android.exoplayer2.source.TrackGroupArray.CREATOR
                    com.google.common.collect.ImmutableList r1 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r2, r1)
                L1d:
                    java.lang.String r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.access$1900()
                    android.util.SparseArray r7 = r7.getSparseParcelableArray(r2)
                    if (r7 != 0) goto L2d
                    android.util.SparseArray r7 = new android.util.SparseArray
                    r7.<init>()
                    goto L33
                L2d:
                    com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride> r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.CREATOR
                    android.util.SparseArray r7 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleSparseArray(r2, r7)
                L33:
                    if (r0 == 0) goto L55
                    int r2 = r0.length
                    int r3 = r1.size()
                    if (r2 == r3) goto L3d
                    goto L55
                L3d:
                    r2 = 0
                L3e:
                    int r3 = r0.length
                    if (r2 >= r3) goto L55
                    r3 = r0[r2]
                    java.lang.Object r4 = r1.get(r2)
                    com.google.android.exoplayer2.source.TrackGroupArray r4 = (com.google.android.exoplayer2.source.TrackGroupArray) r4
                    java.lang.Object r5 = r7.get(r2)
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r5 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) r5
                    r6.setSelectionOverride(r3, r4, r5)
                    int r2 = r2 + 1
                    goto L3e
                L55:
                    return
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1) {
                    r0 = this;
                    super.addOverride(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.addOverride(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters build() {
                    r2 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters build() {
                    r1 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r1.build()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearOverride(com.google.android.exoplayer2.source.TrackGroup r1) {
                    r0 = this;
                    super.clearOverride(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverride(com.google.android.exoplayer2.source.TrackGroup r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.clearOverride(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearOverrides() {
                    r0 = this;
                    super.clearOverrides()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverrides() {
                    r1 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.clearOverrides()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearOverridesOfType(int r1) {
                    r0 = this;
                    super.clearOverridesOfType(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverridesOfType(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.clearOverridesOfType(r1)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverride(int r3, com.google.android.exoplayer2.source.TrackGroupArray r4) {
                    r2 = this;
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r2.selectionOverrides
                    java.lang.Object r0 = r0.get(r3)
                    java.util.Map r0 = (java.util.Map) r0
                    if (r0 == 0) goto L1f
                    boolean r1 = r0.containsKey(r4)
                    if (r1 != 0) goto L11
                    goto L1f
                L11:
                    r0.remove(r4)
                    boolean r4 = r0.isEmpty()
                    if (r4 == 0) goto L1f
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r4 = r2.selectionOverrides
                    r4.remove(r3)
                L1f:
                    return r2
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides() {
                    r1 = this;
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r1.selectionOverrides
                    int r0 = r0.size()
                    if (r0 != 0) goto L9
                    return r1
                L9:
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r1.selectionOverrides
                    r0.clear()
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides(int r2) {
                    r1 = this;
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r1.selectionOverrides
                    java.lang.Object r0 = r0.get(r2)
                    java.util.Map r0 = (java.util.Map) r0
                    if (r0 == 0) goto L16
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L11
                    goto L16
                L11:
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r1.selectionOverrides
                    r0.remove(r2)
                L16:
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearVideoSizeConstraints() {
                    r0 = this;
                    super.clearVideoSizeConstraints()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
                    r1 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.clearVideoSizeConstraints()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearViewportSizeConstraints() {
                    r0 = this;
                    super.clearViewportSizeConstraints()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
                    r1 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.clearViewportSizeConstraints()
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedChannelCountAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowAudioMixedChannelCountAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowAudioMixedDecoderSupportAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowAudioMixedMimeTypeAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedSampleRateAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowAudioMixedSampleRateAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowMultipleAdaptiveSelections(boolean r1) {
                    r0 = this;
                    r0.allowMultipleAdaptiveSelections = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowVideoMixedDecoderSupportAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowVideoMixedMimeTypeAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoNonSeamlessAdaptiveness(boolean r1) {
                    r0 = this;
                    r0.allowVideoNonSeamlessAdaptiveness = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean r1) {
                    r0 = this;
                    r0.constrainAudioChannelCountToDeviceCapabilities = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTextTrackSelectionFlags(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setIgnoredTextSelectionFlags(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> r1) {
                    r0 = this;
                    super.setDisabledTrackTypes(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setDisabledTrackTypes(r1)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setExceedAudioConstraintsIfNecessary(boolean r1) {
                    r0 = this;
                    r0.exceedAudioConstraintsIfNecessary = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setExceedRendererCapabilitiesIfNecessary(boolean r1) {
                    r0 = this;
                    r0.exceedRendererCapabilitiesIfNecessary = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setExceedVideoConstraintsIfNecessary(boolean r1) {
                    r0 = this;
                    r0.exceedVideoConstraintsIfNecessary = r1
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setForceHighestSupportedBitrate(boolean r1) {
                    r0 = this;
                    super.setForceHighestSupportedBitrate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setForceHighestSupportedBitrate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setForceLowestBitrate(boolean r1) {
                    r0 = this;
                    super.setForceLowestBitrate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceLowestBitrate(boolean r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setForceLowestBitrate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setIgnoredTextSelectionFlags(int r1) {
                    r0 = this;
                    super.setIgnoredTextSelectionFlags(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setIgnoredTextSelectionFlags(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioBitrate(int r1) {
                    r0 = this;
                    super.setMaxAudioBitrate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioBitrate(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMaxAudioBitrate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioChannelCount(int r1) {
                    r0 = this;
                    super.setMaxAudioChannelCount(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioChannelCount(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMaxAudioChannelCount(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoBitrate(int r1) {
                    r0 = this;
                    super.setMaxVideoBitrate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoBitrate(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMaxVideoBitrate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoFrameRate(int r1) {
                    r0 = this;
                    super.setMaxVideoFrameRate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoFrameRate(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMaxVideoFrameRate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSize(int r1, int r2) {
                    r0 = this;
                    super.setMaxVideoSize(r1, r2)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSize(int r1, int r2) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMaxVideoSize(r1, r2)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSizeSd() {
                    r0 = this;
                    super.setMaxVideoSizeSd()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
                    r1 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.setMaxVideoSizeSd()
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoBitrate(int r1) {
                    r0 = this;
                    super.setMinVideoBitrate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoBitrate(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMinVideoBitrate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoFrameRate(int r1) {
                    r0 = this;
                    super.setMinVideoFrameRate(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoFrameRate(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMinVideoFrameRate(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoSize(int r1, int r2) {
                    r0 = this;
                    super.setMinVideoSize(r1, r2)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoSize(int r1, int r2) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setMinVideoSize(r1, r2)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1) {
                    r0 = this;
                    super.setOverrideForType(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setOverrideForType(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    super.setPreferredAudioLanguage(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredAudioLanguage(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguages(java.lang.String... r1) {
                    r0 = this;
                    super.setPreferredAudioLanguages(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String[] r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredAudioLanguages(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    super.setPreferredAudioMimeType(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredAudioMimeType(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeTypes(java.lang.String... r1) {
                    r0 = this;
                    super.setPreferredAudioMimeTypes(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String[] r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredAudioMimeTypes(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioRoleFlags(int r1) {
                    r0 = this;
                    super.setPreferredAudioRoleFlags(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredAudioRoleFlags(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    super.setPreferredTextLanguage(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredTextLanguage(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context r1) {
                    r0 = this;
                    super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguages(java.lang.String... r1) {
                    r0 = this;
                    super.setPreferredTextLanguages(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String[] r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredTextLanguages(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextRoleFlags(int r1) {
                    r0 = this;
                    super.setPreferredTextRoleFlags(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredTextRoleFlags(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    super.setPreferredVideoMimeType(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredVideoMimeType(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeTypes(java.lang.String... r1) {
                    r0 = this;
                    super.setPreferredVideoMimeTypes(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String[] r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredVideoMimeTypes(r1)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoRoleFlags(int r1) {
                    r0 = this;
                    super.setPreferredVideoRoleFlags(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setPreferredVideoRoleFlags(r1)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setRendererDisabled(int r2, boolean r3) {
                    r1 = this;
                    android.util.SparseBooleanArray r0 = r1.rendererDisabledFlags
                    boolean r0 = r0.get(r2)
                    if (r0 != r3) goto L9
                    return r1
                L9:
                    if (r3 == 0) goto L12
                    android.util.SparseBooleanArray r3 = r1.rendererDisabledFlags
                    r0 = 1
                    r3.put(r2, r0)
                    goto L17
                L12:
                    android.util.SparseBooleanArray r3 = r1.rendererDisabledFlags
                    r3.delete(r2)
                L17:
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setSelectUndeterminedTextLanguage(boolean r1) {
                    r0 = this;
                    super.setSelectUndeterminedTextLanguage(r1)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean r1) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setSelectUndeterminedTextLanguage(r1)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setSelectionOverride(int r3, com.google.android.exoplayer2.source.TrackGroupArray r4, @androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride r5) {
                    r2 = this;
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r2.selectionOverrides
                    java.lang.Object r0 = r0.get(r3)
                    java.util.Map r0 = (java.util.Map) r0
                    if (r0 != 0) goto L14
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r1 = r2.selectionOverrides
                    r1.put(r3, r0)
                L14:
                    boolean r3 = r0.containsKey(r4)
                    if (r3 == 0) goto L25
                    java.lang.Object r3 = r0.get(r4)
                    boolean r3 = com.google.android.exoplayer2.util.Util.areEqual(r3, r5)
                    if (r3 == 0) goto L25
                    return r2
                L25:
                    r0.put(r4, r5)
                    return r2
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setTrackTypeDisabled(int r1, boolean r2) {
                    r0 = this;
                    super.setTrackTypeDisabled(r1, r2)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setTrackTypeDisabled(int r1, boolean r2) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setTrackTypeDisabled(r1, r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setTunnelingEnabled(boolean r1) {
                    r0 = this;
                    r0.tunnelingEnabled = r1
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSize(int r1, int r2, boolean r3) {
                    r0 = this;
                    super.setViewportSize(r1, r2, r3)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSize(int r1, int r2, boolean r3) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setViewportSize(r1, r2, r3)
                    return r1
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context r1, boolean r2) {
                    r0 = this;
                    super.setViewportSizeToPhysicalDisplaySize(r1, r2)
                    return r0
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context r1, boolean r2) {
                    r0 = this;
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r0.setViewportSizeToPhysicalDisplaySize(r1, r2)
                    return r1
            }
        }

        public static /* synthetic */ com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters $r8$lambda$U98Wdd2EwvvSUOXBjakY0Uxo3EE(android.os.Bundle r0) {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = lambda$static$0(r0)
                return r0
        }

        static {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
                r0.<init>()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r0.build()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT = r0
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT = r0
                r0 = 1000(0x3e8, float:1.401E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = r0
                r0 = 1001(0x3e9, float:1.403E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = r0
                r0 = 1002(0x3ea, float:1.404E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = r0
                r0 = 1003(0x3eb, float:1.406E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = r0
                r0 = 1004(0x3ec, float:1.407E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = r0
                r0 = 1005(0x3ed, float:1.408E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = r0
                r0 = 1006(0x3ee, float:1.41E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = r0
                r0 = 1007(0x3ef, float:1.411E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = r0
                r0 = 1008(0x3f0, float:1.413E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_TUNNELING_ENABLED = r0
                r0 = 1009(0x3f1, float:1.414E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = r0
                r0 = 1010(0x3f2, float:1.415E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = r0
                r0 = 1011(0x3f3, float:1.417E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = r0
                r0 = 1012(0x3f4, float:1.418E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES = r0
                r0 = 1013(0x3f5, float:1.42E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_RENDERER_DISABLED_INDICES = r0
                r0 = 1014(0x3f6, float:1.421E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = r0
                r0 = 1015(0x3f7, float:1.422E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = r0
                r0 = 1016(0x3f8, float:1.424E-42)
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = r0
                com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE$1
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.CREATOR = r0
                return
        }

        private Parameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r2) {
                r1 = this;
                r1.<init>(r2)
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2000(r2)
                r1.exceedVideoConstraintsIfNecessary = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2100(r2)
                r1.allowVideoMixedMimeTypeAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2200(r2)
                r1.allowVideoNonSeamlessAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2300(r2)
                r1.allowVideoMixedDecoderSupportAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2400(r2)
                r1.exceedAudioConstraintsIfNecessary = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2500(r2)
                r1.allowAudioMixedMimeTypeAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2600(r2)
                r1.allowAudioMixedSampleRateAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2700(r2)
                r1.allowAudioMixedChannelCountAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2800(r2)
                r1.allowAudioMixedDecoderSupportAdaptiveness = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$2900(r2)
                r1.constrainAudioChannelCountToDeviceCapabilities = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$3000(r2)
                r1.exceedRendererCapabilitiesIfNecessary = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$3100(r2)
                r1.tunnelingEnabled = r0
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$3200(r2)
                r1.allowMultipleAdaptiveSelections = r0
                android.util.SparseArray r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$3300(r2)
                r1.selectionOverrides = r0
                android.util.SparseBooleanArray r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder.access$3400(r2)
                r1.rendererDisabledFlags = r2
                return
        }

        public /* synthetic */ Parameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r1, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ android.util.SparseArray access$000(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0) {
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r0.selectionOverrides
                return r0
        }

        public static /* synthetic */ android.util.SparseBooleanArray access$100(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0) {
                android.util.SparseBooleanArray r0 = r0.rendererDisabledFlags
                return r0
        }

        public static /* synthetic */ java.lang.String access$1000() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS
                return r0
        }

        public static /* synthetic */ java.lang.String access$1100() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES
                return r0
        }

        public static /* synthetic */ java.lang.String access$1200() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY
                return r0
        }

        public static /* synthetic */ java.lang.String access$1300() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_TUNNELING_ENABLED
                return r0
        }

        public static /* synthetic */ java.lang.String access$1400() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS
                return r0
        }

        public static /* synthetic */ java.lang.String access$1500() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_RENDERER_DISABLED_INDICES
                return r0
        }

        public static /* synthetic */ java.lang.String access$1700() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES
                return r0
        }

        public static /* synthetic */ java.lang.String access$1800() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS
                return r0
        }

        public static /* synthetic */ java.lang.String access$1900() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES
                return r0
        }

        public static /* synthetic */ java.lang.String access$200() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY
                return r0
        }

        public static /* synthetic */ java.lang.String access$300() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS
                return r0
        }

        public static /* synthetic */ java.lang.String access$400() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS
                return r0
        }

        public static /* synthetic */ java.lang.String access$500() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS
                return r0
        }

        public static /* synthetic */ java.lang.String access$600() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY
                return r0
        }

        public static /* synthetic */ java.lang.String access$700() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS
                return r0
        }

        public static /* synthetic */ java.lang.String access$800() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS
                return r0
        }

        public static /* synthetic */ java.lang.String access$900() {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS
                return r0
        }

        private static boolean areRendererDisabledFlagsEqual(android.util.SparseBooleanArray r4, android.util.SparseBooleanArray r5) {
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                r1 = 0
            Ld:
                if (r1 >= r0) goto L1d
                int r3 = r4.keyAt(r1)
                int r3 = r5.indexOfKey(r3)
                if (r3 >= 0) goto L1a
                return r2
            L1a:
                int r1 = r1 + 1
                goto Ld
            L1d:
                r4 = 1
                return r4
        }

        private static boolean areSelectionOverridesEqual(android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> r5, android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> r6) {
                int r0 = r5.size()
                int r1 = r6.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                r1 = 0
            Ld:
                if (r1 >= r0) goto L30
                int r3 = r5.keyAt(r1)
                int r3 = r6.indexOfKey(r3)
                if (r3 < 0) goto L2f
                java.lang.Object r4 = r5.valueAt(r1)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.Object r3 = r6.valueAt(r3)
                java.util.Map r3 = (java.util.Map) r3
                boolean r3 = areSelectionOverridesEqual(r4, r3)
                if (r3 != 0) goto L2c
                goto L2f
            L2c:
                int r1 = r1 + 1
                goto Ld
            L2f:
                return r2
            L30:
                r5 = 1
                return r5
        }

        private static boolean areSelectionOverridesEqual(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r5) {
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
        }

        public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters getDefaults(android.content.Context r1) {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
                r0.<init>(r1)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r0.build()
                return r1
        }

        private static int[] getKeysFromSparseBooleanArray(android.util.SparseBooleanArray r3) {
                int r0 = r3.size()
                int[] r0 = new int[r0]
                r1 = 0
            L7:
                int r2 = r3.size()
                if (r1 >= r2) goto L16
                int r2 = r3.keyAt(r1)
                r0[r1] = r2
                int r1 = r1 + 1
                goto L7
            L16:
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters lambda$static$0(android.os.Bundle r2) {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
                r1 = 0
                r0.<init>(r2, r1)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = r0.build()
                return r2
        }

        private static void putSelectionOverridesToBundle(android.os.Bundle r9, android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> r10) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                r3 = 0
            L10:
                int r4 = r10.size()
                if (r3 >= r4) goto L72
                int r4 = r10.keyAt(r3)
                java.lang.Object r5 = r10.valueAt(r3)
                java.util.Map r5 = (java.util.Map) r5
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L28:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L54
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getValue()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r7 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) r7
                if (r7 == 0) goto L43
                int r8 = r1.size()
                r2.put(r8, r7)
            L43:
                java.lang.Object r6 = r6.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r6 = (com.google.android.exoplayer2.source.TrackGroupArray) r6
                r1.add(r6)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
                r0.add(r6)
                goto L28
            L54:
                java.lang.String r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES
                int[] r5 = com.google.common.primitives.Ints.toArray(r0)
                r9.putIntArray(r4, r5)
                java.lang.String r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS
                java.util.ArrayList r5 = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(r1)
                r9.putParcelableArrayList(r4, r5)
                java.lang.String r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_SELECTION_OVERRIDES
                android.util.SparseArray r5 = com.google.android.exoplayer2.util.BundleableUtil.toBundleSparseArray(r2)
                r9.putSparseParcelableArray(r4, r5)
                int r3 = r3 + 1
                goto L10
            L72:
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder buildUpon() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.buildUpon()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L7e
                java.lang.Class<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters> r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L11
                goto L7e
            L11:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r5 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r5
                boolean r2 = super.equals(r5)
                if (r2 == 0) goto L7c
                boolean r2 = r4.exceedVideoConstraintsIfNecessary
                boolean r3 = r5.exceedVideoConstraintsIfNecessary
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowVideoMixedMimeTypeAdaptiveness
                boolean r3 = r5.allowVideoMixedMimeTypeAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowVideoNonSeamlessAdaptiveness
                boolean r3 = r5.allowVideoNonSeamlessAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowVideoMixedDecoderSupportAdaptiveness
                boolean r3 = r5.allowVideoMixedDecoderSupportAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.exceedAudioConstraintsIfNecessary
                boolean r3 = r5.exceedAudioConstraintsIfNecessary
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowAudioMixedMimeTypeAdaptiveness
                boolean r3 = r5.allowAudioMixedMimeTypeAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowAudioMixedSampleRateAdaptiveness
                boolean r3 = r5.allowAudioMixedSampleRateAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowAudioMixedChannelCountAdaptiveness
                boolean r3 = r5.allowAudioMixedChannelCountAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowAudioMixedDecoderSupportAdaptiveness
                boolean r3 = r5.allowAudioMixedDecoderSupportAdaptiveness
                if (r2 != r3) goto L7c
                boolean r2 = r4.constrainAudioChannelCountToDeviceCapabilities
                boolean r3 = r5.constrainAudioChannelCountToDeviceCapabilities
                if (r2 != r3) goto L7c
                boolean r2 = r4.exceedRendererCapabilitiesIfNecessary
                boolean r3 = r5.exceedRendererCapabilitiesIfNecessary
                if (r2 != r3) goto L7c
                boolean r2 = r4.tunnelingEnabled
                boolean r3 = r5.tunnelingEnabled
                if (r2 != r3) goto L7c
                boolean r2 = r4.allowMultipleAdaptiveSelections
                boolean r3 = r5.allowMultipleAdaptiveSelections
                if (r2 != r3) goto L7c
                android.util.SparseBooleanArray r2 = r4.rendererDisabledFlags
                android.util.SparseBooleanArray r3 = r5.rendererDisabledFlags
                boolean r2 = areRendererDisabledFlagsEqual(r2, r3)
                if (r2 == 0) goto L7c
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r2 = r4.selectionOverrides
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r5 = r5.selectionOverrides
                boolean r5 = areSelectionOverridesEqual(r2, r5)
                if (r5 == 0) goto L7c
                goto L7d
            L7c:
                r0 = 0
            L7d:
                return r0
            L7e:
                return r1
        }

        public boolean getRendererDisabled(int r2) {
                r1 = this;
                android.util.SparseBooleanArray r0 = r1.rendererDisabledFlags
                boolean r2 = r0.get(r2)
                return r2
        }

        @androidx.annotation.Nullable
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride getSelectionOverride(int r2, com.google.android.exoplayer2.source.TrackGroupArray r3) {
                r1 = this;
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r1.selectionOverrides
                java.lang.Object r2 = r0.get(r2)
                java.util.Map r2 = (java.util.Map) r2
                if (r2 == 0) goto L11
                java.lang.Object r2 = r2.get(r3)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) r2
                goto L12
            L11:
                r2 = 0
            L12:
                return r2
        }

        @java.lang.Deprecated
        public boolean hasSelectionOverride(int r2, com.google.android.exoplayer2.source.TrackGroupArray r3) {
                r1 = this;
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r0 = r1.selectionOverrides
                java.lang.Object r2 = r0.get(r2)
                java.util.Map r2 = (java.util.Map) r2
                if (r2 == 0) goto L12
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
                r3 = this;
                int r0 = super.hashCode()
                r1 = 31
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r2 = r3.exceedVideoConstraintsIfNecessary
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowVideoMixedMimeTypeAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowVideoNonSeamlessAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowVideoMixedDecoderSupportAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.exceedAudioConstraintsIfNecessary
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowAudioMixedMimeTypeAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowAudioMixedSampleRateAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowAudioMixedChannelCountAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.allowAudioMixedDecoderSupportAdaptiveness
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.constrainAudioChannelCountToDeviceCapabilities
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.exceedRendererCapabilitiesIfNecessary
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.tunnelingEnabled
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r3.allowMultipleAdaptiveSelections
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = super.toBundle()
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY
                boolean r2 = r3.exceedVideoConstraintsIfNecessary
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS
                boolean r2 = r3.allowVideoMixedMimeTypeAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS
                boolean r2 = r3.allowVideoNonSeamlessAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS
                boolean r2 = r3.allowVideoMixedDecoderSupportAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY
                boolean r2 = r3.exceedAudioConstraintsIfNecessary
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS
                boolean r2 = r3.allowAudioMixedMimeTypeAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS
                boolean r2 = r3.allowAudioMixedSampleRateAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS
                boolean r2 = r3.allowAudioMixedChannelCountAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS
                boolean r2 = r3.allowAudioMixedDecoderSupportAdaptiveness
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES
                boolean r2 = r3.constrainAudioChannelCountToDeviceCapabilities
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY
                boolean r2 = r3.exceedRendererCapabilitiesIfNecessary
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_TUNNELING_ENABLED
                boolean r2 = r3.tunnelingEnabled
                r0.putBoolean(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS
                boolean r2 = r3.allowMultipleAdaptiveSelections
                r0.putBoolean(r1, r2)
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r1 = r3.selectionOverrides
                putSelectionOverridesToBundle(r0, r1)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.FIELD_RENDERER_DISABLED_INDICES
                android.util.SparseBooleanArray r2 = r3.rendererDisabledFlags
                int[] r2 = getKeysFromSparseBooleanArray(r2)
                r0.putIntArray(r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public static final class ParametersBuilder extends com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder {
        private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder delegate;

        @java.lang.Deprecated
        public ParametersBuilder() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
                r0.<init>()
                r1.delegate = r0
                return
        }

        public ParametersBuilder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
                r0.<init>(r2)
                r1.delegate = r0
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.addOverride(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.addOverride(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters build() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r0.build()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters build() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r1.build()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearOverride(com.google.android.exoplayer2.source.TrackGroup r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearOverride(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverride(com.google.android.exoplayer2.source.TrackGroup r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.clearOverride(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearOverrides() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearOverrides()
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverrides() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r0 = r1.clearOverrides()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearOverridesOfType(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearOverridesOfType(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverridesOfType(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.clearOverridesOfType(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverride(int r2, com.google.android.exoplayer2.source.TrackGroupArray r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearSelectionOverride(r2, r3)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearSelectionOverrides()
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearSelectionOverrides(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearVideoSizeConstraints() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearVideoSizeConstraints()
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r0 = r1.clearVideoSizeConstraints()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearViewportSizeConstraints() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.clearViewportSizeConstraints()
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r0 = r1.clearViewportSizeConstraints()
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowAudioMixedChannelCountAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowAudioMixedDecoderSupportAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowAudioMixedMimeTypeAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowAudioMixedSampleRateAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowMultipleAdaptiveSelections(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowMultipleAdaptiveSelections(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowVideoMixedDecoderSupportAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowVideoMixedMimeTypeAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setAllowVideoNonSeamlessAdaptiveness(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTextTrackSelectionFlags(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setDisabledTextTrackSelectionFlags(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTrackTypes(java.util.Set<java.lang.Integer> r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setDisabledTrackTypes(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setDisabledTrackTypes(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setExceedAudioConstraintsIfNecessary(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setExceedRendererCapabilitiesIfNecessary(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setExceedVideoConstraintsIfNecessary(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setForceHighestSupportedBitrate(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setForceHighestSupportedBitrate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setForceHighestSupportedBitrate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setForceLowestBitrate(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setForceLowestBitrate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceLowestBitrate(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setForceLowestBitrate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setIgnoredTextSelectionFlags(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setIgnoredTextSelectionFlags(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setIgnoredTextSelectionFlags(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioBitrate(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMaxAudioBitrate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioBitrate(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMaxAudioBitrate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioChannelCount(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMaxAudioChannelCount(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioChannelCount(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMaxAudioChannelCount(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoBitrate(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMaxVideoBitrate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoBitrate(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMaxVideoBitrate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoFrameRate(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMaxVideoFrameRate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoFrameRate(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMaxVideoFrameRate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSize(int r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMaxVideoSize(r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSize(int r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMaxVideoSize(r1, r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSizeSd() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMaxVideoSizeSd()
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r0 = r1.setMaxVideoSizeSd()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoBitrate(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMinVideoBitrate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoBitrate(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMinVideoBitrate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoFrameRate(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMinVideoFrameRate(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoFrameRate(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMinVideoFrameRate(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoSize(int r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setMinVideoSize(r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoSize(int r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setMinVideoSize(r1, r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setOverrideForType(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setOverrideForType(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguage(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredAudioLanguage(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredAudioLanguage(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguages(java.lang.String... r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredAudioLanguages(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String[] r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredAudioLanguages(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeType(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredAudioMimeType(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredAudioMimeType(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeTypes(java.lang.String... r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredAudioMimeTypes(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String[] r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredAudioMimeTypes(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioRoleFlags(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredAudioRoleFlags(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredAudioRoleFlags(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguage(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredTextLanguage(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredTextLanguage(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguages(java.lang.String... r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredTextLanguages(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String[] r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredTextLanguages(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextRoleFlags(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredTextRoleFlags(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredTextRoleFlags(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeType(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredVideoMimeType(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredVideoMimeType(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeTypes(java.lang.String... r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredVideoMimeTypes(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String[] r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredVideoMimeTypes(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoRoleFlags(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setPreferredVideoRoleFlags(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setPreferredVideoRoleFlags(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setRendererDisabled(int r2, boolean r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setRendererDisabled(r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setSelectUndeterminedTextLanguage(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setSelectUndeterminedTextLanguage(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setSelectUndeterminedTextLanguage(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setSelectionOverride(int r2, com.google.android.exoplayer2.source.TrackGroupArray r3, @androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride r4) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setSelectionOverride(r2, r3, r4)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setTrackTypeDisabled(int r2, boolean r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setTrackTypeDisabled(r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setTrackTypeDisabled(int r1, boolean r2) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setTrackTypeDisabled(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setTunnelingEnabled(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setTunnelingEnabled(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSize(int r2, int r3, boolean r4) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setViewportSize(r2, r3, r4)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSize(int r1, int r2, boolean r3) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setViewportSize(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSizeToPhysicalDisplaySize(android.content.Context r2, boolean r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r1.delegate
                r0.setViewportSizeToPhysicalDisplaySize(r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context r1, boolean r2) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$ParametersBuilder r1 = r0.setViewportSizeToPhysicalDisplaySize(r1, r2)
                return r1
        }
    }

    public static final class SelectionOverride implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> CREATOR = null;
        private static final java.lang.String FIELD_GROUP_INDEX = null;
        private static final java.lang.String FIELD_TRACKS = null;
        private static final java.lang.String FIELD_TRACK_TYPE = null;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public static /* synthetic */ com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride $r8$lambda$NvZ4OweqBCNRql1Yy7vv2wiHdEU(android.os.Bundle r0) {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r0 = lambda$static$0(r0)
                return r0
        }

        static {
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_GROUP_INDEX = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_TRACKS = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_TRACK_TYPE = r0
                com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0.INSTANCE$2
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.CREATOR = r0
                return
        }

        public SelectionOverride(int r2, int... r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public SelectionOverride(int r1, int[] r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.groupIndex = r1
                int r1 = r2.length
                int[] r1 = java.util.Arrays.copyOf(r2, r1)
                r0.tracks = r1
                int r2 = r2.length
                r0.length = r2
                r0.type = r3
                java.util.Arrays.sort(r1)
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride lambda$static$0(android.os.Bundle r4) {
                java.lang.String r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_GROUP_INDEX
                r1 = -1
                int r0 = r4.getInt(r0, r1)
                java.lang.String r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_TRACKS
                int[] r2 = r4.getIntArray(r2)
                java.lang.String r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_TRACK_TYPE
                int r4 = r4.getInt(r3, r1)
                if (r0 < 0) goto L19
                if (r4 < 0) goto L19
                r1 = 1
                goto L1a
            L19:
                r1 = 0
            L1a:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r1 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride
                r1.<init>(r0, r2, r4)
                return r1
        }

        public boolean containsTrack(int r6) {
                r5 = this;
                int[] r0 = r5.tracks
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L10
                r4 = r0[r3]
                if (r4 != r6) goto Ld
                r6 = 1
                return r6
            Ld:
                int r3 = r3 + 1
                goto L5
            L10:
                return r2
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2b
                java.lang.Class<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride> r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L2b
            L10:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r5 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) r5
                int r2 = r4.groupIndex
                int r3 = r5.groupIndex
                if (r2 != r3) goto L29
                int[] r2 = r4.tracks
                int[] r3 = r5.tracks
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L29
                int r2 = r4.type
                int r5 = r5.type
                if (r2 != r5) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.groupIndex
                int r0 = r0 * 31
                int[] r1 = r2.tracks
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.type
                int r1 = r1 + r0
                return r1
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_GROUP_INDEX
                int r2 = r3.groupIndex
                r0.putInt(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_TRACKS
                int[] r2 = r3.tracks
                r0.putIntArray(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.FIELD_TRACK_TYPE
                int r2 = r3.type
                r0.putInt(r1, r2)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(32)
    public static class SpatializerWrapperV32 {

        @androidx.annotation.Nullable
        private android.os.Handler handler;

        @androidx.annotation.Nullable
        private android.media.Spatializer.OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final android.media.Spatializer spatializer;


        private SpatializerWrapperV32(android.media.Spatializer r1) {
                r0 = this;
                r0.<init>()
                r0.spatializer = r1
                int r1 = r1.getImmersiveAudioLevel()
                if (r1 == 0) goto Ld
                r1 = 1
                goto Le
            Ld:
                r1 = 0
            Le:
                r0.spatializationSupported = r1
                return
        }

        @androidx.annotation.Nullable
        public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 tryCreateInstance(android.content.Context r1) {
                java.lang.String r0 = "audio"
                java.lang.Object r1 = r1.getSystemService(r0)
                android.media.AudioManager r1 = (android.media.AudioManager) r1
                if (r1 != 0) goto Lc
                r1 = 0
                goto L16
            Lc:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32
                android.media.Spatializer r1 = r1.getSpatializer()
                r0.<init>(r1)
                r1 = r0
            L16:
                return r1
        }

        public boolean canBeSpatialized(com.google.android.exoplayer2.audio.AudioAttributes r4, com.google.android.exoplayer2.Format r5) {
                r3 = this;
                java.lang.String r0 = r5.sampleMimeType
                java.lang.String r1 = "audio/eac3-joc"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L13
                int r0 = r5.channelCount
                r1 = 16
                if (r0 != r1) goto L13
                r0 = 12
                goto L15
            L13:
                int r0 = r5.channelCount
            L15:
                android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
                r1.<init>()
                r2 = 2
                android.media.AudioFormat$Builder r1 = r1.setEncoding(r2)
                int r0 = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(r0)
                android.media.AudioFormat$Builder r0 = r1.setChannelMask(r0)
                int r5 = r5.sampleRate
                r1 = -1
                if (r5 == r1) goto L2f
                r0.setSampleRate(r5)
            L2f:
                android.media.Spatializer r5 = r3.spatializer
                com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r4 = r4.getAudioAttributesV21()
                android.media.AudioAttributes r4 = r4.audioAttributes
                android.media.AudioFormat r0 = r0.build()
                boolean r4 = r5.canBeSpatialized(r4, r0)
                return r4
        }

        public void ensureInitialized(com.google.android.exoplayer2.trackselection.DefaultTrackSelector r3, android.os.Looper r4) {
                r2 = this;
                android.media.Spatializer$OnSpatializerStateChangedListener r0 = r2.listener
                if (r0 != 0) goto L24
                android.os.Handler r0 = r2.handler
                if (r0 == 0) goto L9
                goto L24
            L9:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32$1 r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32$1
                r0.<init>(r3)
                r2.listener = r0
                android.os.Handler r3 = new android.os.Handler
                r3.<init>(r4)
                r2.handler = r3
                android.media.Spatializer r4 = r2.spatializer
                com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r3, r1)
                android.media.Spatializer$OnSpatializerStateChangedListener r3 = r2.listener
                r4.addOnSpatializerStateChangedListener(r0, r3)
            L24:
                return
        }

        public boolean isAvailable() {
                r1 = this;
                android.media.Spatializer r0 = r1.spatializer
                boolean r0 = r0.isAvailable()
                return r0
        }

        public boolean isEnabled() {
                r1 = this;
                android.media.Spatializer r0 = r1.spatializer
                boolean r0 = r0.isEnabled()
                return r0
        }

        public boolean isSpatializationSupported() {
                r1 = this;
                boolean r0 = r1.spatializationSupported
                return r0
        }

        public void release() {
                r2 = this;
                android.media.Spatializer$OnSpatializerStateChangedListener r0 = r2.listener
                if (r0 == 0) goto L1e
                android.os.Handler r1 = r2.handler
                if (r1 != 0) goto L9
                goto L1e
            L9:
                android.media.Spatializer r1 = r2.spatializer
                r1.removeOnSpatializerStateChangedListener(r0)
                android.os.Handler r0 = r2.handler
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                android.os.Handler r0 = (android.os.Handler) r0
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                r2.handler = r1
                r2.listener = r1
            L1e:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TextTrackInfo extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> implements java.lang.Comparable<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int r6, com.google.android.exoplayer2.source.TrackGroup r7, int r8, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r9, int r10, @androidx.annotation.Nullable java.lang.String r11) {
                r5 = this;
                r5.<init>(r6, r7, r8)
                r6 = 0
                boolean r7 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r10, r6)
                r5.isWithinRendererCapabilities = r7
                com.google.android.exoplayer2.Format r7 = r5.format
                int r7 = r7.selectionFlags
                int r8 = r9.ignoredTextSelectionFlags
                int r8 = ~r8
                r7 = r7 & r8
                r8 = r7 & 1
                r0 = 1
                if (r8 == 0) goto L19
                r8 = 1
                goto L1a
            L19:
                r8 = 0
            L1a:
                r5.isDefault = r8
                r7 = r7 & 2
                if (r7 == 0) goto L22
                r7 = 1
                goto L23
            L22:
                r7 = 0
            L23:
                r5.isForced = r7
                r7 = 2147483647(0x7fffffff, float:NaN)
                com.google.common.collect.ImmutableList<java.lang.String> r8 = r9.preferredTextLanguages
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L37
                java.lang.String r8 = ""
                com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r8)
                goto L39
            L37:
                com.google.common.collect.ImmutableList<java.lang.String> r8 = r9.preferredTextLanguages
            L39:
                r1 = 0
            L3a:
                int r2 = r8.size()
                if (r1 >= r2) goto L55
                com.google.android.exoplayer2.Format r2 = r5.format
                java.lang.Object r3 = r8.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                boolean r4 = r9.selectUndeterminedTextLanguage
                int r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(r2, r3, r4)
                if (r2 <= 0) goto L52
                r7 = r1
                goto L56
            L52:
                int r1 = r1 + 1
                goto L3a
            L55:
                r2 = 0
            L56:
                r5.preferredLanguageIndex = r7
                r5.preferredLanguageScore = r2
                com.google.android.exoplayer2.Format r7 = r5.format
                int r7 = r7.roleFlags
                int r8 = r9.preferredTextRoleFlags
                int r7 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$3800(r7, r8)
                r5.preferredRoleFlagsScore = r7
                com.google.android.exoplayer2.Format r8 = r5.format
                int r8 = r8.roleFlags
                r8 = r8 & 1088(0x440, float:1.525E-42)
                if (r8 == 0) goto L70
                r8 = 1
                goto L71
            L70:
                r8 = 0
            L71:
                r5.hasCaptionRoleFlags = r8
                java.lang.String r8 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(r11)
                if (r8 != 0) goto L7b
                r8 = 1
                goto L7c
            L7b:
                r8 = 0
            L7c:
                com.google.android.exoplayer2.Format r1 = r5.format
                int r8 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(r1, r11, r8)
                r5.selectedAudioLanguageScore = r8
                if (r2 > 0) goto L9d
                com.google.common.collect.ImmutableList<java.lang.String> r11 = r9.preferredTextLanguages
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto L90
                if (r7 > 0) goto L9d
            L90:
                boolean r7 = r5.isDefault
                if (r7 != 0) goto L9d
                boolean r7 = r5.isForced
                if (r7 == 0) goto L9b
                if (r8 <= 0) goto L9b
                goto L9d
            L9b:
                r7 = 0
                goto L9e
            L9d:
                r7 = 1
            L9e:
                boolean r8 = r9.exceedRendererCapabilitiesIfNecessary
                boolean r8 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r10, r8)
                if (r8 == 0) goto La9
                if (r7 == 0) goto La9
                r6 = 1
            La9:
                r5.selectionEligibility = r6
                return
        }

        public static int compareSelections(java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> r1, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> r2) {
                r0 = 0
                java.lang.Object r1 = r1.get(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo) r1
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo) r2
                int r1 = r1.compareTo2(r2)
                return r1
        }

        public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> createForTrackGroup(int r10, com.google.android.exoplayer2.source.TrackGroup r11, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r12, int[] r13, @androidx.annotation.Nullable java.lang.String r14) {
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                r1 = 0
            L5:
                int r2 = r11.length
                if (r1 >= r2) goto L1c
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo r9 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo
                r7 = r13[r1]
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r1
                r6 = r12
                r8 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r0.add(r9)
                int r1 = r1 + 1
                goto L5
            L1c:
                com.google.common.collect.ImmutableList r10 = r0.build()
                return r10
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo r5) {
                r4 = this;
                com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.start()
                boolean r1 = r4.isWithinRendererCapabilities
                boolean r2 = r5.isWithinRendererCapabilities
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                int r1 = r4.preferredLanguageIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r5.preferredLanguageIndex
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r3 = r3.reverse()
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2, r3)
                int r1 = r4.preferredLanguageScore
                int r2 = r5.preferredLanguageScore
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2)
                int r1 = r4.preferredRoleFlagsScore
                int r2 = r5.preferredRoleFlagsScore
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2)
                boolean r1 = r4.isDefault
                boolean r2 = r5.isDefault
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                boolean r1 = r4.isForced
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                boolean r2 = r5.isForced
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                int r3 = r4.preferredLanguageScore
                if (r3 != 0) goto L51
                com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
                goto L59
            L51:
                com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r3 = r3.reverse()
            L59:
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2, r3)
                int r1 = r4.selectedAudioLanguageScore
                int r2 = r5.selectedAudioLanguageScore
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2)
                int r1 = r4.preferredRoleFlagsScore
                if (r1 != 0) goto L71
                boolean r1 = r4.hasCaptionRoleFlags
                boolean r5 = r5.hasCaptionRoleFlags
                com.google.common.collect.ComparisonChain r0 = r0.compareTrueFirst(r1, r5)
            L71:
                int r5 = r0.result()
                return r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
                r1 = this;
                int r0 = r1.selectionEligibility
                return r0
        }

        public boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo) r1
                boolean r1 = r0.isCompatibleForAdaptationWith(r1)
                return r1
        }
    }

    public static abstract class TrackInfo<T extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<T>> {
        public final com.google.android.exoplayer2.Format format;
        public final int rendererIndex;
        public final com.google.android.exoplayer2.source.TrackGroup trackGroup;
        public final int trackIndex;

        /* JADX INFO: loaded from: classes3.dex */
        public interface Factory<T extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<T>> {
            java.util.List<T> create(int r1, com.google.android.exoplayer2.source.TrackGroup r2, int[] r3);
        }

        public TrackInfo(int r1, com.google.android.exoplayer2.source.TrackGroup r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.rendererIndex = r1
                r0.trackGroup = r2
                r0.trackIndex = r3
                com.google.android.exoplayer2.Format r1 = r2.getFormat(r3)
                r0.format = r1
                return
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T r1);
    }

    public static final class VideoTrackInfo extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static /* synthetic */ int $r8$lambda$edrE9ReKEEMhYewQsqcS1VQ6zfA(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r0, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r1) {
                int r0 = compareNonQualityPreferences(r0, r1)
                return r0
        }

        public static /* synthetic */ int $r8$lambda$xlJdgRDIOOxPlzotyYFWfne7YcA(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r0, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r1) {
                int r0 = compareQualityPreferences(r0, r1)
                return r0
        }

        public VideoTrackInfo(int r5, com.google.android.exoplayer2.source.TrackGroup r6, int r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r8, int r9, int r10, boolean r11) {
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.parameters = r8
                boolean r5 = r8.allowVideoNonSeamlessAdaptiveness
                if (r5 == 0) goto Lc
                r5 = 24
                goto Le
            Lc:
                r5 = 16
            Le:
                boolean r6 = r8.allowVideoMixedMimeTypeAdaptiveness
                r7 = 1
                r0 = 0
                if (r6 == 0) goto L1a
                r6 = r10 & r5
                if (r6 == 0) goto L1a
                r6 = 1
                goto L1b
            L1a:
                r6 = 0
            L1b:
                r4.allowMixedMimeTypes = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L4b
                com.google.android.exoplayer2.Format r1 = r4.format
                int r2 = r1.width
                if (r2 == r10) goto L2c
                int r3 = r8.maxVideoWidth
                if (r2 > r3) goto L4b
            L2c:
                int r2 = r1.height
                if (r2 == r10) goto L34
                int r3 = r8.maxVideoHeight
                if (r2 > r3) goto L4b
            L34:
                float r2 = r1.frameRate
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L41
                int r3 = r8.maxVideoFrameRate
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L4b
            L41:
                int r1 = r1.bitrate
                if (r1 == r10) goto L49
                int r2 = r8.maxVideoBitrate
                if (r1 > r2) goto L4b
            L49:
                r1 = 1
                goto L4c
            L4b:
                r1 = 0
            L4c:
                r4.isWithinMaxConstraints = r1
                if (r11 == 0) goto L79
                com.google.android.exoplayer2.Format r11 = r4.format
                int r1 = r11.width
                if (r1 == r10) goto L5a
                int r2 = r8.minVideoWidth
                if (r1 < r2) goto L79
            L5a:
                int r1 = r11.height
                if (r1 == r10) goto L62
                int r2 = r8.minVideoHeight
                if (r1 < r2) goto L79
            L62:
                float r1 = r11.frameRate
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L6f
                int r6 = r8.minVideoFrameRate
                float r6 = (float) r6
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 < 0) goto L79
            L6f:
                int r6 = r11.bitrate
                if (r6 == r10) goto L77
                int r10 = r8.minVideoBitrate
                if (r6 < r10) goto L79
            L77:
                r6 = 1
                goto L7a
            L79:
                r6 = 0
            L7a:
                r4.isWithinMinConstraints = r6
                boolean r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r9, r0)
                r4.isWithinRendererCapabilities = r6
                com.google.android.exoplayer2.Format r6 = r4.format
                int r10 = r6.bitrate
                r4.bitrate = r10
                int r6 = r6.getPixelCount()
                r4.pixelCount = r6
                com.google.android.exoplayer2.Format r6 = r4.format
                int r6 = r6.roleFlags
                int r10 = r8.preferredVideoRoleFlags
                int r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$3800(r6, r10)
                r4.preferredRoleFlagsScore = r6
                com.google.android.exoplayer2.Format r6 = r4.format
                int r6 = r6.roleFlags
                if (r6 == 0) goto La6
                r6 = r6 & r7
                if (r6 == 0) goto La4
                goto La6
            La4:
                r6 = 0
                goto La7
            La6:
                r6 = 1
            La7:
                r4.hasMainOrNoRoleFlag = r6
                r6 = 2147483647(0x7fffffff, float:NaN)
                r10 = 0
            Lad:
                com.google.common.collect.ImmutableList<java.lang.String> r11 = r8.preferredVideoMimeTypes
                int r11 = r11.size()
                if (r10 >= r11) goto Lcc
                com.google.android.exoplayer2.Format r11 = r4.format
                java.lang.String r11 = r11.sampleMimeType
                if (r11 == 0) goto Lc9
                com.google.common.collect.ImmutableList<java.lang.String> r1 = r8.preferredVideoMimeTypes
                java.lang.Object r1 = r1.get(r10)
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto Lc9
                r6 = r10
                goto Lcc
            Lc9:
                int r10 = r10 + 1
                goto Lad
            Lcc:
                r4.preferredMimeTypeMatchIndex = r6
                int r6 = com.google.android.exoplayer2.RendererCapabilities.CC.getDecoderSupport(r9)
                r8 = 128(0x80, float:1.8E-43)
                if (r6 != r8) goto Ld8
                r6 = 1
                goto Ld9
            Ld8:
                r6 = 0
            Ld9:
                r4.usesPrimaryDecoder = r6
                int r6 = com.google.android.exoplayer2.RendererCapabilities.CC.getHardwareAccelerationSupport(r9)
                r8 = 64
                if (r6 != r8) goto Le4
                goto Le5
            Le4:
                r7 = 0
            Le5:
                r4.usesHardwareAcceleration = r7
                com.google.android.exoplayer2.Format r6 = r4.format
                java.lang.String r6 = r6.sampleMimeType
                int r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$3900(r6)
                r4.codecPreferenceScore = r6
                int r5 = r4.evaluateSelectionEligibility(r9, r5)
                r4.selectionEligibility = r5
                return
        }

        private static int compareNonQualityPreferences(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r4, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r5) {
                com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.start()
                boolean r1 = r4.isWithinRendererCapabilities
                boolean r2 = r5.isWithinRendererCapabilities
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                int r1 = r4.preferredRoleFlagsScore
                int r2 = r5.preferredRoleFlagsScore
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2)
                boolean r1 = r4.hasMainOrNoRoleFlag
                boolean r2 = r5.hasMainOrNoRoleFlag
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                boolean r1 = r4.isWithinMaxConstraints
                boolean r2 = r5.isWithinMaxConstraints
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                boolean r1 = r4.isWithinMinConstraints
                boolean r2 = r5.isWithinMinConstraints
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                int r1 = r4.preferredMimeTypeMatchIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r5.preferredMimeTypeMatchIndex
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r3 = r3.reverse()
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2, r3)
                boolean r1 = r4.usesPrimaryDecoder
                boolean r2 = r5.usesPrimaryDecoder
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                boolean r1 = r4.usesHardwareAcceleration
                boolean r2 = r5.usesHardwareAcceleration
                com.google.common.collect.ComparisonChain r0 = r0.compareFalseFirst(r1, r2)
                boolean r1 = r4.usesPrimaryDecoder
                if (r1 == 0) goto L64
                boolean r1 = r4.usesHardwareAcceleration
                if (r1 == 0) goto L64
                int r4 = r4.codecPreferenceScore
                int r5 = r5.codecPreferenceScore
                com.google.common.collect.ComparisonChain r0 = r0.compare(r4, r5)
            L64:
                int r4 = r0.result()
                return r4
        }

        private static int compareQualityPreferences(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r5, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r6) {
                boolean r0 = r5.isWithinMaxConstraints
                if (r0 == 0) goto Ld
                boolean r0 = r5.isWithinRendererCapabilities
                if (r0 == 0) goto Ld
                com.google.common.collect.Ordering r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4000()
                goto L15
            Ld:
                com.google.common.collect.Ordering r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4000()
                com.google.common.collect.Ordering r0 = r0.reverse()
            L15:
                com.google.common.collect.ComparisonChain r1 = com.google.common.collect.ComparisonChain.start()
                int r2 = r5.bitrate
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.bitrate
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r4 = r5.parameters
                boolean r4 = r4.forceLowestBitrate
                if (r4 == 0) goto L34
                com.google.common.collect.Ordering r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4000()
                com.google.common.collect.Ordering r4 = r4.reverse()
                goto L38
            L34:
                com.google.common.collect.Ordering r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$4100()
            L38:
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r4)
                int r2 = r5.pixelCount
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r3 = r6.pixelCount
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.common.collect.ComparisonChain r1 = r1.compare(r2, r3, r0)
                int r5 = r5.bitrate
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                int r6 = r6.bitrate
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                com.google.common.collect.ComparisonChain r5 = r1.compare(r5, r6, r0)
                int r5 = r5.result()
                return r5
        }

        public static int compareSelections(java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> r4, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> r5) {
                com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.start()
                com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$4
                java.lang.Object r1 = java.util.Collections.max(r4, r1)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) r1
                com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r2 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$5
                java.lang.Object r2 = java.util.Collections.max(r5, r2)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) r2
                com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r3 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$6
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2, r3)
                int r1 = r4.size()
                int r2 = r5.size()
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r2)
                com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$7
                java.lang.Object r4 = java.util.Collections.max(r4, r1)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo r4 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) r4
                com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$8
                java.lang.Object r5 = java.util.Collections.max(r5, r1)
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo r5 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) r5
                com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$9
                com.google.common.collect.ComparisonChain r4 = r0.compare(r4, r5, r1)
                int r4 = r4.result()
                return r4
        }

        public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> createForTrackGroup(int r15, com.google.android.exoplayer2.source.TrackGroup r16, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r17, int[] r18, int r19) {
                r8 = r16
                r9 = r17
                int r0 = r9.viewportWidth
                int r1 = r9.viewportHeight
                boolean r2 = r9.viewportOrientationMayChange
                int r10 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.access$3700(r8, r0, r1, r2)
                com.google.common.collect.ImmutableList$Builder r11 = com.google.common.collect.ImmutableList.builder()
                r12 = 0
                r13 = 0
            L14:
                int r0 = r8.length
                if (r13 >= r0) goto L45
                com.google.android.exoplayer2.Format r0 = r8.getFormat(r13)
                int r0 = r0.getPixelCount()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r10 == r1) goto L2d
                r1 = -1
                if (r0 == r1) goto L2b
                if (r0 > r10) goto L2b
                goto L2d
            L2b:
                r7 = 0
                goto L2f
            L2d:
                r0 = 1
                r7 = 1
            L2f:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo r14 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo
                r5 = r18[r13]
                r0 = r14
                r1 = r15
                r2 = r16
                r3 = r13
                r4 = r17
                r6 = r19
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r11.add(r14)
                int r13 = r13 + 1
                goto L14
            L45:
                com.google.common.collect.ImmutableList r0 = r11.build()
                return r0
        }

        private int evaluateSelectionEligibility(int r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.Format r0 = r2.format
                int r0 = r0.roleFlags
                r0 = r0 & 16384(0x4000, float:2.2959E-41)
                r1 = 0
                if (r0 == 0) goto La
                return r1
            La:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r2.parameters
                boolean r0 = r0.exceedRendererCapabilitiesIfNecessary
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r3, r0)
                if (r0 != 0) goto L15
                return r1
            L15:
                boolean r0 = r2.isWithinMaxConstraints
                if (r0 != 0) goto L20
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r2.parameters
                boolean r0 = r0.exceedVideoConstraintsIfNecessary
                if (r0 != 0) goto L20
                return r1
            L20:
                boolean r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r3, r1)
                if (r0 == 0) goto L44
                boolean r0 = r2.isWithinMinConstraints
                if (r0 == 0) goto L44
                boolean r0 = r2.isWithinMaxConstraints
                if (r0 == 0) goto L44
                com.google.android.exoplayer2.Format r0 = r2.format
                int r0 = r0.bitrate
                r1 = -1
                if (r0 == r1) goto L44
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r2.parameters
                boolean r1 = r0.forceHighestSupportedBitrate
                if (r1 != 0) goto L44
                boolean r0 = r0.forceLowestBitrate
                if (r0 != 0) goto L44
                r3 = r3 & r4
                if (r3 == 0) goto L44
                r3 = 2
                goto L45
            L44:
                r3 = 1
            L45:
                return r3
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
                r1 = this;
                int r0 = r1.selectionEligibility
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) r1
                boolean r1 = r0.isCompatibleForAdaptationWith(r1)
                return r1
        }

        public boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo r3) {
                r2 = this;
                boolean r0 = r2.allowMixedMimeTypes
                if (r0 != 0) goto L12
                com.google.android.exoplayer2.Format r0 = r2.format
                java.lang.String r0 = r0.sampleMimeType
                com.google.android.exoplayer2.Format r1 = r3.format
                java.lang.String r1 = r1.sampleMimeType
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
                if (r0 == 0) goto L25
            L12:
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r2.parameters
                boolean r0 = r0.allowVideoMixedDecoderSupportAdaptiveness
                if (r0 != 0) goto L27
                boolean r0 = r2.usesPrimaryDecoder
                boolean r1 = r3.usesPrimaryDecoder
                if (r0 != r1) goto L25
                boolean r0 = r2.usesHardwareAcceleration
                boolean r3 = r3.usesHardwareAcceleration
                if (r0 != r3) goto L25
                goto L27
            L25:
                r3 = 0
                goto L28
            L27:
                r3 = 1
            L28:
                return r3
        }
    }

    public static /* synthetic */ int $r8$lambda$NHmGa6GSMuUHfNQ5Uz42mHzM_0g(java.lang.Integer r0, java.lang.Integer r1) {
            int r0 = lambda$static$1(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$PKRIg-Mnu5wiJ8Ai8vqpW69PiNI, reason: not valid java name */
    public static /* synthetic */ boolean m259$r8$lambda$PKRIgMnu5wiJ8Ai8vqpW69PiNI(com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0, com.google.android.exoplayer2.Format r1) {
            boolean r0 = r0.isAudioFormatWithinAudioChannelCountConstraints(r1)
            return r0
    }

    public static /* synthetic */ java.util.List $r8$lambda$RJHKYon4KBWh5h6TU7dMcobv_60(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0, int[] r1, int r2, com.google.android.exoplayer2.source.TrackGroup r3, int[] r4) {
            java.util.List r0 = lambda$selectVideoTrack$2(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.util.List $r8$lambda$a61h7PpVEP1iVAKhOefXczU16G4(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0, java.lang.String r1, int r2, com.google.android.exoplayer2.source.TrackGroup r3, int[] r4) {
            java.util.List r0 = lambda$selectTextTrack$4(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.util.List $r8$lambda$aK8yyUkU76CirRbWd4rJv5M7pGA(com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r1, boolean r2, int r3, com.google.android.exoplayer2.source.TrackGroup r4, int[] r5) {
            java.util.List r0 = r0.lambda$selectAudioTrack$3(r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$memq-_P1PuS7XvrukBISlgzn2v4, reason: not valid java name */
    public static /* synthetic */ int m260$r8$lambda$memq_P1PuS7XvrukBISlgzn2v4(java.lang.Integer r0, java.lang.Integer r1) {
            int r0 = lambda$static$0(r0, r1)
            return r0
    }

    static {
            com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$10
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING = r0
            com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$11
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.NO_ORDER = r0
            return
    }

    @java.lang.Deprecated
    public DefaultTrackSelector() {
            r2 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory r1 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
            r1.<init>()
            r2.<init>(r0, r1)
            return
    }

    public DefaultTrackSelector(android.content.Context r2) {
            r1 = this;
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory r0 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public DefaultTrackSelector(android.content.Context r2, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory r3) {
            r1 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(r2)
            r1.<init>(r2, r0, r3)
            return
    }

    public DefaultTrackSelector(android.content.Context r2, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3) {
            r1 = this;
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory r0 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
            r0.<init>()
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultTrackSelector(android.content.Context r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory r3) {
            r0 = this;
            r0.<init>(r2, r3, r1)
            return
    }

    @java.lang.Deprecated
    public DefaultTrackSelector(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private DefaultTrackSelector(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory r3, @androidx.annotation.Nullable android.content.Context r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            if (r4 == 0) goto L11
            android.content.Context r0 = r4.getApplicationContext()
            goto L12
        L11:
            r0 = 0
        L12:
            r1.context = r0
            r1.trackSelectionFactory = r3
            boolean r3 = r2 instanceof com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters
            if (r3 == 0) goto L1f
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r2
            r1.parameters = r2
            goto L35
        L1f:
            if (r4 != 0) goto L24
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT
            goto L28
        L24:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r3 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(r4)
        L28:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r3 = r3.buildUpon()
            r3.set(r2)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = r3.build()
            r1.parameters = r2
        L35:
            com.google.android.exoplayer2.audio.AudioAttributes r2 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
            r1.audioAttributes = r2
            if (r4 == 0) goto L43
            boolean r2 = com.google.android.exoplayer2.util.Util.isTv(r4)
            if (r2 == 0) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            r1.deviceIsTV = r2
            if (r2 != 0) goto L56
            if (r4 == 0) goto L56
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT
            r3 = 32
            if (r2 < r3) goto L56
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32.tryCreateInstance(r4)
            r1.spatializer = r2
        L56:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = r1.parameters
            boolean r2 = r2.constrainAudioChannelCountToDeviceCapabilities
            if (r2 == 0) goto L65
            if (r4 != 0) goto L65
            java.lang.String r2 = "DefaultTrackSelector"
            java.lang.String r3 = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."
            com.google.android.exoplayer2.util.Log.w(r2, r3)
        L65:
            return
    }

    public static /* synthetic */ int access$3700(com.google.android.exoplayer2.source.TrackGroup r0, int r1, int r2, boolean r3) {
            int r0 = getMaxVideoPixelsToRetainForViewport(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int access$3800(int r0, int r1) {
            int r0 = getRoleFlagMatchScore(r0, r1)
            return r0
    }

    public static /* synthetic */ int access$3900(java.lang.String r0) {
            int r0 = getVideoCodecPreferenceScore(r0)
            return r0
    }

    public static /* synthetic */ com.google.common.collect.Ordering access$4000() {
            com.google.common.collect.Ordering<java.lang.Integer> r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING
            return r0
    }

    public static /* synthetic */ com.google.common.collect.Ordering access$4100() {
            com.google.common.collect.Ordering<java.lang.Integer> r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.NO_ORDER
            return r0
    }

    public static /* synthetic */ void access$4200(com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0) {
            r0.maybeInvalidateForAudioChannelCountConstraints()
            return
    }

    private static void applyLegacyRendererOverrides(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r6, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r7, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r8) {
            int r0 = r6.getRendererCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L33
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r6.getTrackGroups(r1)
            boolean r3 = r7.hasSelectionOverride(r1, r2)
            if (r3 != 0) goto L12
            goto L30
        L12:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r3 = r7.getSelectionOverride(r1, r2)
            if (r3 == 0) goto L2d
            int[] r4 = r3.tracks
            int r4 = r4.length
            if (r4 == 0) goto L2d
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r4 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition
            int r5 = r3.groupIndex
            com.google.android.exoplayer2.source.TrackGroup r2 = r2.get(r5)
            int[] r5 = r3.tracks
            int r3 = r3.type
            r4.<init>(r2, r5, r3)
            goto L2e
        L2d:
            r4 = 0
        L2e:
            r8[r1] = r4
        L30:
            int r1 = r1 + 1
            goto L5
        L33:
            return
    }

    private static void applyTrackSelectionOverrides(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r5, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r6, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r7) {
            int r0 = r5.getRendererCount()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L17
            com.google.android.exoplayer2.source.TrackGroupArray r4 = r5.getTrackGroups(r3)
            collectTrackSelectionOverrides(r4, r6, r1)
            int r3 = r3 + 1
            goto Lb
        L17:
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r5.getUnmappedTrackGroups()
            collectTrackSelectionOverrides(r3, r6, r1)
        L1e:
            if (r2 >= r0) goto L5a
            int r6 = r5.getRendererType(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r1.get(r6)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r6 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r6
            if (r6 != 0) goto L31
            goto L57
        L31:
            com.google.common.collect.ImmutableList<java.lang.Integer> r3 = r6.trackIndices
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L54
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r5.getTrackGroups(r2)
            com.google.android.exoplayer2.source.TrackGroup r4 = r6.mediaTrackGroup
            int r3 = r3.indexOf(r4)
            r4 = -1
            if (r3 == r4) goto L54
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r3 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition
            com.google.android.exoplayer2.source.TrackGroup r4 = r6.mediaTrackGroup
            com.google.common.collect.ImmutableList<java.lang.Integer> r6 = r6.trackIndices
            int[] r6 = com.google.common.primitives.Ints.toArray(r6)
            r3.<init>(r4, r6)
            goto L55
        L54:
            r3 = 0
        L55:
            r7[r2] = r3
        L57:
            int r2 = r2 + 1
            goto L1e
        L5a:
            return
    }

    private static void collectTrackSelectionOverrides(com.google.android.exoplayer2.source.TrackGroupArray r3, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4, java.util.Map<java.lang.Integer, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r5) {
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto L42
            com.google.android.exoplayer2.source.TrackGroup r1 = r3.get(r0)
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = r4.overrides
            java.lang.Object r1 = r2.get(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r1
            if (r1 != 0) goto L14
            goto L3f
        L14:
            int r2 = r1.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r5.get(r2)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r2 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r2
            if (r2 == 0) goto L34
            com.google.common.collect.ImmutableList<java.lang.Integer> r2 = r2.trackIndices
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3f
            com.google.common.collect.ImmutableList<java.lang.Integer> r2 = r1.trackIndices
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3f
        L34:
            int r2 = r1.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r2, r1)
        L3f:
            int r0 = r0 + 1
            goto L1
        L42:
            return
    }

    public static int getFormatLanguageScore(com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable java.lang.String r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L10
            java.lang.String r0 = r1.language
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            r1 = 4
            return r1
        L10:
            java.lang.String r2 = normalizeUndeterminedLanguageToNull(r2)
            java.lang.String r1 = r1.language
            java.lang.String r1 = normalizeUndeterminedLanguageToNull(r1)
            r0 = 0
            if (r1 == 0) goto L46
            if (r2 != 0) goto L20
            goto L46
        L20:
            boolean r3 = r1.startsWith(r2)
            if (r3 != 0) goto L44
            boolean r3 = r2.startsWith(r1)
            if (r3 == 0) goto L2d
            goto L44
        L2d:
            java.lang.String r3 = "-"
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.splitAtFirst(r1, r3)
            r1 = r1[r0]
            java.lang.String[] r2 = com.google.android.exoplayer2.util.Util.splitAtFirst(r2, r3)
            r2 = r2[r0]
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L43
            r1 = 2
            return r1
        L43:
            return r0
        L44:
            r1 = 3
            return r1
        L46:
            if (r3 == 0) goto L4b
            if (r1 != 0) goto L4b
            r0 = 1
        L4b:
            return r0
    }

    private static int getMaxVideoPixelsToRetainForViewport(com.google.android.exoplayer2.source.TrackGroup r8, int r9, int r10, boolean r11) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r0) goto L3c
            if (r10 != r0) goto L8
            goto L3c
        L8:
            r1 = 0
        L9:
            int r2 = r8.length
            if (r1 >= r2) goto L3c
            com.google.android.exoplayer2.Format r2 = r8.getFormat(r1)
            int r3 = r2.width
            if (r3 <= 0) goto L39
            int r4 = r2.height
            if (r4 <= 0) goto L39
            android.graphics.Point r3 = getMaxVideoSizeInViewport(r11, r9, r10, r3, r4)
            int r4 = r2.width
            int r2 = r2.height
            int r5 = r4 * r2
            int r6 = r3.x
            float r6 = (float) r6
            r7 = 1065017672(0x3f7ae148, float:0.98)
            float r6 = r6 * r7
            int r6 = (int) r6
            if (r4 < r6) goto L39
            int r3 = r3.y
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            if (r2 < r3) goto L39
            if (r5 >= r0) goto L39
            r0 = r5
        L39:
            int r1 = r1 + 1
            goto L9
        L3c:
            return r0
    }

    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
    }

    private static int getRoleFlagMatchScore(int r0, int r1) {
            if (r0 == 0) goto L8
            if (r0 != r1) goto L8
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L8:
            r0 = r0 & r1
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    private static int getVideoCodecPreferenceScore(@androidx.annotation.Nullable java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r7.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1851077871: goto L41;
                case -1662735862: goto L35;
                case -1662541442: goto L29;
                case 1331836730: goto L1d;
                case 1599127257: goto L11;
                default: goto L10;
            }
        L10:
            goto L4c
        L11:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L1b
            goto L4c
        L1b:
            r1 = 4
            goto L4c
        L1d:
            java.lang.String r2 = "video/avc"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L27
            goto L4c
        L27:
            r1 = 3
            goto L4c
        L29:
            java.lang.String r2 = "video/hevc"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L33
            goto L4c
        L33:
            r1 = 2
            goto L4c
        L35:
            java.lang.String r2 = "video/av01"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L3f
            goto L4c
        L3f:
            r1 = 1
            goto L4c
        L41:
            java.lang.String r2 = "video/dolby-vision"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L4b
            goto L4c
        L4b:
            r1 = 0
        L4c:
            switch(r1) {
                case 0: goto L54;
                case 1: goto L53;
                case 2: goto L52;
                case 3: goto L51;
                case 4: goto L50;
                default: goto L4f;
            }
        L4f:
            return r0
        L50:
            return r5
        L51:
            return r6
        L52:
            return r4
        L53:
            return r3
        L54:
            r7 = 5
            return r7
    }

    private boolean isAudioFormatWithinAudioChannelCountConstraints(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r3.parameters     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.constrainAudioChannelCountToDeviceCapabilities     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
            boolean r1 = r3.deviceIsTV     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L53
            int r1 = r4.channelCount     // Catch: java.lang.Throwable -> L56
            r2 = 2
            if (r1 <= r2) goto L53
            boolean r1 = isDolbyAudio(r4)     // Catch: java.lang.Throwable -> L56
            r2 = 32
            if (r1 == 0) goto L28
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L56
            if (r1 < r2) goto L53
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
            boolean r1 = r1.isSpatializationSupported()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
        L28:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L56
            if (r1 < r2) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            boolean r1 = r1.isSpatializationSupported()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.isAvailable()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.isEnabled()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            com.google.android.exoplayer2.audio.AudioAttributes r2 = r3.audioAttributes     // Catch: java.lang.Throwable -> L56
            boolean r4 = r1.canBeSpatialized(r2, r4)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L51
            goto L53
        L51:
            r4 = 0
            goto L54
        L53:
            r4 = 1
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return r4
        L56:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r4
    }

    private static boolean isDolbyAudio(com.google.android.exoplayer2.Format r4) {
            java.lang.String r4 = r4.sampleMimeType
            r0 = 0
            if (r4 != 0) goto L6
            return r0
        L6:
            java.util.Objects.requireNonNull(r4)
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 1
            switch(r2) {
                case -2123537834: goto L34;
                case 187078296: goto L29;
                case 187078297: goto L1e;
                case 1504578661: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1c
            goto L3e
        L1c:
            r1 = 3
            goto L3e
        L1e:
            java.lang.String r2 = "audio/ac4"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L27
            goto L3e
        L27:
            r1 = 2
            goto L3e
        L29:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L32
            goto L3e
        L32:
            r1 = 1
            goto L3e
        L34:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r1 = 0
        L3e:
            switch(r1) {
                case 0: goto L42;
                case 1: goto L42;
                case 2: goto L42;
                case 3: goto L42;
                default: goto L41;
            }
        L41:
            return r0
        L42:
            return r3
    }

    public static boolean isSupported(int r1, boolean r2) {
            int r1 = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(r1)
            r0 = 4
            if (r1 == r0) goto Lf
            if (r2 == 0) goto Ld
            r2 = 3
            if (r1 != r2) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private /* synthetic */ java.util.List lambda$selectAudioTrack$3(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r7, boolean r8, int r9, com.google.android.exoplayer2.source.TrackGroup r10, int[] r11) {
            r6 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1 r5 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1
            r5.<init>(r6)
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r11
            r4 = r8
            com.google.common.collect.ImmutableList r7 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo.createForTrackGroup(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private static /* synthetic */ java.util.List lambda$selectTextTrack$4(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0, java.lang.String r1, int r2, com.google.android.exoplayer2.source.TrackGroup r3, int[] r4) {
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo.createForTrackGroup(r2, r3, r0, r4, r1)
            return r0
    }

    private static /* synthetic */ java.util.List lambda$selectVideoTrack$2(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0, int[] r1, int r2, com.google.android.exoplayer2.source.TrackGroup r3, int[] r4) {
            r1 = r1[r2]
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(r2, r3, r0, r4, r1)
            return r0
    }

    private static /* synthetic */ int lambda$static$0(java.lang.Integer r2, java.lang.Integer r3) {
            int r0 = r2.intValue()
            r1 = -1
            if (r0 != r1) goto Lf
            int r2 = r3.intValue()
            if (r2 != r1) goto L21
            r1 = 0
            goto L21
        Lf:
            int r0 = r3.intValue()
            if (r0 != r1) goto L17
            r1 = 1
            goto L21
        L17:
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            int r1 = r2 - r3
        L21:
            return r1
    }

    private static /* synthetic */ int lambda$static$1(java.lang.Integer r0, java.lang.Integer r1) {
            r0 = 0
            return r0
    }

    private static void maybeConfigureRenderersForTunneling(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r10, int[][][] r11, com.google.android.exoplayer2.RendererConfiguration[] r12, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r13) {
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
            r4 = -1
        L5:
            int r5 = r10.getRendererCount()
            r6 = 1
            if (r2 >= r5) goto L34
            int r5 = r10.getRendererType(r2)
            r7 = r13[r2]
            if (r5 == r6) goto L17
            r8 = 2
            if (r5 != r8) goto L31
        L17:
            if (r7 == 0) goto L31
            r8 = r11[r2]
            com.google.android.exoplayer2.source.TrackGroupArray r9 = r10.getTrackGroups(r2)
            boolean r7 = rendererSupportsTunneling(r8, r9, r7)
            if (r7 == 0) goto L31
            if (r5 != r6) goto L2c
            if (r4 == r1) goto L2a
            goto L2e
        L2a:
            r4 = r2
            goto L31
        L2c:
            if (r3 == r1) goto L30
        L2e:
            r10 = 0
            goto L35
        L30:
            r3 = r2
        L31:
            int r2 = r2 + 1
            goto L5
        L34:
            r10 = 1
        L35:
            if (r4 == r1) goto L3a
            if (r3 == r1) goto L3a
            r0 = 1
        L3a:
            r10 = r10 & r0
            if (r10 == 0) goto L46
            com.google.android.exoplayer2.RendererConfiguration r10 = new com.google.android.exoplayer2.RendererConfiguration
            r10.<init>(r6)
            r12[r4] = r10
            r12[r3] = r10
        L46:
            return
    }

    private void maybeInvalidateForAudioChannelCountConstraints() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r3.parameters     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.constrainAudioChannelCountToDeviceCapabilities     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            boolean r1 = r3.deviceIsTV     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L1f
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L27
            r2 = 32
            if (r1 < r2) goto L1f
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            boolean r1 = r1.isSpatializationSupported()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L26
            r3.invalidate()
        L26:
            return
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String normalizeUndeterminedLanguageToNull(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lf
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private static boolean rendererSupportsTunneling(int[][] r4, com.google.android.exoplayer2.source.TrackGroupArray r5, com.google.android.exoplayer2.trackselection.ExoTrackSelection r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.google.android.exoplayer2.source.TrackGroup r1 = r6.getTrackGroup()
            int r5 = r5.indexOf(r1)
            r1 = 0
        Ld:
            int r2 = r6.length()
            if (r1 >= r2) goto L27
            r2 = r4[r5]
            int r3 = r6.getIndexInTrackGroup(r1)
            r2 = r2[r3]
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.getTunnelingSupport(r2)
            r3 = 32
            if (r2 == r3) goto L24
            return r0
        L24:
            int r1 = r1 + 1
            goto Ld
        L27:
            r4 = 1
            return r4
    }

    @androidx.annotation.Nullable
    private <T extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<T>> android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTracksForType(int r19, com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r20, int[][][] r21, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory<T> r22, java.util.Comparator<java.util.List<T>> r23) {
            r18 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r20.getRendererCount()
            r4 = 0
        Lc:
            if (r4 >= r2) goto La9
            int r5 = r0.getRendererType(r4)
            r6 = r19
            if (r6 != r5) goto L9d
            com.google.android.exoplayer2.source.TrackGroupArray r5 = r0.getTrackGroups(r4)
            r7 = 0
        L1b:
            int r8 = r5.length
            if (r7 >= r8) goto L9d
            com.google.android.exoplayer2.source.TrackGroup r8 = r5.get(r7)
            r9 = r21[r4]
            r9 = r9[r7]
            r10 = r22
            java.util.List r9 = r10.create(r4, r8, r9)
            int r11 = r8.length
            boolean[] r11 = new boolean[r11]
            r12 = 0
        L32:
            int r13 = r8.length
            if (r12 >= r13) goto L95
            java.lang.Object r13 = r9.get(r12)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo r13 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo) r13
            int r14 = r13.getSelectionEligibility()
            boolean r15 = r11[r12]
            if (r15 != 0) goto L8c
            if (r14 != 0) goto L47
            goto L8c
        L47:
            r15 = 1
            if (r14 != r15) goto L51
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r13)
            r17 = r2
            goto L88
        L51:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r13)
            int r16 = r12 + 1
            r3 = r16
        L5d:
            int r15 = r8.length
            if (r3 >= r15) goto L85
            java.lang.Object r15 = r9.get(r3)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo r15 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo) r15
            int r0 = r15.getSelectionEligibility()
            r17 = r2
            r2 = 2
            if (r0 != r2) goto L7d
            boolean r0 = r13.isCompatibleForAdaptationWith(r15)
            if (r0 == 0) goto L7d
            r14.add(r15)
            r0 = 1
            r11[r3] = r0
            goto L7e
        L7d:
            r0 = 1
        L7e:
            int r3 = r3 + 1
            r0 = r20
            r2 = r17
            goto L5d
        L85:
            r17 = r2
            r13 = r14
        L88:
            r1.add(r13)
            goto L8e
        L8c:
            r17 = r2
        L8e:
            int r12 = r12 + 1
            r0 = r20
            r2 = r17
            goto L32
        L95:
            r17 = r2
            int r7 = r7 + 1
            r0 = r20
            goto L1b
        L9d:
            r10 = r22
            r17 = r2
            int r4 = r4 + 1
            r0 = r20
            r2 = r17
            goto Lc
        La9:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb1
            r0 = 0
            return r0
        Lb1:
            r0 = r23
            java.lang.Object r0 = java.util.Collections.max(r1, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            int[] r1 = new int[r1]
            r2 = 0
        Lc0:
            int r3 = r0.size()
            if (r2 >= r3) goto Ld3
            java.lang.Object r3 = r0.get(r2)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo r3 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo) r3
            int r3 = r3.trackIndex
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lc0
        Ld3:
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo) r0
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r2 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition
            com.google.android.exoplayer2.source.TrackGroup r3 = r0.trackGroup
            r2.<init>(r3, r1)
            int r0 = r0.rendererIndex
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
    }

    private void setParametersInternal(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r3) {
            r2 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r2.parameters     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            r2.parameters = r3     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L28
            boolean r3 = r3.constrainAudioChannelCountToDeviceCapabilities
            if (r3 == 0) goto L25
            android.content.Context r3 = r2.context
            if (r3 != 0) goto L25
            java.lang.String r3 = "DefaultTrackSelector"
            java.lang.String r0 = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."
            com.google.android.exoplayer2.util.Log.w(r3, r0)
        L25:
            r2.invalidate()
        L28:
            return
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUponParameters() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r1.getParameters()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.buildUpon()
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters getParameters() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r2.parameters     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters getParameters() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void release() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L15
            r2 = 32
            if (r1 < r2) goto L10
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L10
            r1.release()     // Catch: java.lang.Throwable -> L15
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            super.release()
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    public final android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> selectTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r22, int[][][] r23, int[] r24, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r25, com.google.android.exoplayer2.Timeline r26) throws com.google.android.exoplayer2.ExoPlaybackException {
            r21 = this;
            r7 = r21
            r0 = r22
            r8 = r23
            java.lang.Object r1 = r7.lock
            monitor-enter(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r9 = r7.parameters     // Catch: java.lang.Throwable -> L1ca
            boolean r2 = r9.constrainAudioChannelCountToDeviceCapabilities     // Catch: java.lang.Throwable -> L1ca
            if (r2 == 0) goto L26
            int r2 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L1ca
            r3 = 32
            if (r2 < r3) goto L26
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r2 = r7.spatializer     // Catch: java.lang.Throwable -> L1ca
            if (r2 == 0) goto L26
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r3)     // Catch: java.lang.Throwable -> L1ca
            android.os.Looper r3 = (android.os.Looper) r3     // Catch: java.lang.Throwable -> L1ca
            r2.ensureInitialized(r7, r3)     // Catch: java.lang.Throwable -> L1ca
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1ca
            int r10 = r22.getRendererCount()
            int r11 = r22.getRendererCount()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition[] r12 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[r11]
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r5 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r1 = 14
            r2 = r24
            r5.<init>(r9, r2, r1)
            com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r6 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$2
            r2 = 2
            r1 = r21
            r3 = r22
            r4 = r23
            android.util.Pair r1 = r1.selectTracksForType(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L57
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.first
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r1 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) r1
            r12[r2] = r1
        L57:
            r13 = 0
            r1 = 0
        L59:
            int r2 = r22.getRendererCount()
            r14 = 2
            r15 = 1
            if (r1 >= r2) goto L74
            int r2 = r0.getRendererType(r1)
            if (r14 != r2) goto L71
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r0.getTrackGroups(r1)
            int r2 = r2.length
            if (r2 <= 0) goto L71
            r1 = 1
            goto L75
        L71:
            int r1 = r1 + 1
            goto L59
        L74:
            r1 = 0
        L75:
            r2 = 1
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0 r5 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0
            r5.<init>(r7, r9, r1)
            com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r6 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$3
            r1 = r21
            r3 = r22
            r4 = r23
            android.util.Pair r1 = r1.selectTracksForType(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L97
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.first
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r3 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) r3
            r12[r2] = r3
        L97:
            r16 = 0
            if (r1 != 0) goto L9e
            r1 = r16
            goto Lae
        L9e:
            java.lang.Object r1 = r1.first
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r1 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) r1
            com.google.android.exoplayer2.source.TrackGroup r2 = r1.group
            int[] r1 = r1.tracks
            r1 = r1[r13]
            com.google.android.exoplayer2.Format r1 = r2.getFormat(r1)
            java.lang.String r1 = r1.language
        Lae:
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1 r5 = new com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda1
            r2 = 13
            r5.<init>(r9, r1, r2)
            com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r6 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE$1
            r2 = 3
            r1 = r21
            r3 = r22
            r4 = r23
            android.util.Pair r1 = r1.selectTracksForType(r2, r3, r4, r5, r6)
            if (r1 == 0) goto Ld2
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.first
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r1 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) r1
            r12[r2] = r1
        Ld2:
            r1 = 0
        Ld3:
            if (r1 >= r11) goto L14f
            int r2 = r0.getRendererType(r1)
            if (r2 == r14) goto L147
            if (r2 == r15) goto L147
            r3 = 3
            if (r2 == r3) goto L147
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r0.getTrackGroups(r1)
            r3 = r8[r1]
            r5 = r16
            r6 = r5
            r4 = 0
            r17 = 0
        Lec:
            int r14 = r2.length
            if (r4 >= r14) goto L132
            com.google.android.exoplayer2.source.TrackGroup r14 = r2.get(r4)
            r18 = r3[r4]
        Lf6:
            int r15 = r14.length
            if (r13 >= r15) goto L129
            r15 = r18[r13]
            r19 = r2
            boolean r2 = r9.exceedRendererCapabilitiesIfNecessary
            boolean r2 = isSupported(r15, r2)
            if (r2 == 0) goto L120
            com.google.android.exoplayer2.Format r2 = r14.getFormat(r13)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$OtherTrackScore r15 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$OtherTrackScore
            r20 = r3
            r3 = r18[r13]
            r15.<init>(r2, r3)
            if (r6 == 0) goto L11b
            int r2 = r15.compareTo2(r6)
            if (r2 <= 0) goto L122
        L11b:
            r17 = r13
            r5 = r14
            r6 = r15
            goto L122
        L120:
            r20 = r3
        L122:
            int r13 = r13 + 1
            r2 = r19
            r3 = r20
            goto Lf6
        L129:
            r19 = r2
            r20 = r3
            int r4 = r4 + 1
            r13 = 0
            r15 = 1
            goto Lec
        L132:
            if (r5 != 0) goto L139
            r2 = r16
            r3 = 1
            r6 = 0
            goto L144
        L139:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition r2 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection$Definition
            r3 = 1
            int[] r4 = new int[r3]
            r6 = 0
            r4[r6] = r17
            r2.<init>(r5, r4)
        L144:
            r12[r1] = r2
            goto L149
        L147:
            r3 = 1
            r6 = 0
        L149:
            int r1 = r1 + 1
            r13 = 0
            r14 = 2
            r15 = 1
            goto Ld3
        L14f:
            r3 = 1
            r6 = 0
            applyTrackSelectionOverrides(r0, r9, r12)
            applyLegacyRendererOverrides(r0, r9, r12)
            r1 = 0
        L158:
            if (r1 >= r10) goto L175
            int r2 = r0.getRendererType(r1)
            boolean r4 = r9.getRendererDisabled(r1)
            if (r4 != 0) goto L170
            com.google.common.collect.ImmutableSet<java.lang.Integer> r4 = r9.disabledTrackTypes
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L172
        L170:
            r12[r1] = r16
        L172:
            int r1 = r1 + 1
            goto L158
        L175:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection$Factory r1 = r7.trackSelectionFactory
            com.google.android.exoplayer2.upstream.BandwidthMeter r2 = r21.getBandwidthMeter()
            r4 = r25
            r5 = r26
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r1.createTrackSelections(r12, r2, r4, r5)
            com.google.android.exoplayer2.RendererConfiguration[] r2 = new com.google.android.exoplayer2.RendererConfiguration[r10]
            r4 = 0
        L186:
            if (r4 >= r10) goto L1be
            int r5 = r0.getRendererType(r4)
            boolean r11 = r9.getRendererDisabled(r4)
            if (r11 != 0) goto L1a1
            com.google.common.collect.ImmutableSet<java.lang.Integer> r11 = r9.disabledTrackTypes
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r11.contains(r5)
            if (r5 == 0) goto L19f
            goto L1a1
        L19f:
            r5 = 0
            goto L1a2
        L1a1:
            r5 = 1
        L1a2:
            if (r5 != 0) goto L1b1
            int r5 = r0.getRendererType(r4)
            r11 = -2
            if (r5 == r11) goto L1af
            r5 = r1[r4]
            if (r5 == 0) goto L1b1
        L1af:
            r5 = 1
            goto L1b2
        L1b1:
            r5 = 0
        L1b2:
            if (r5 == 0) goto L1b7
            com.google.android.exoplayer2.RendererConfiguration r5 = com.google.android.exoplayer2.RendererConfiguration.DEFAULT
            goto L1b9
        L1b7:
            r5 = r16
        L1b9:
            r2[r4] = r5
            int r4 = r4 + 1
            goto L186
        L1be:
            boolean r3 = r9.tunnelingEnabled
            if (r3 == 0) goto L1c5
            maybeConfigureRenderersForTunneling(r0, r8, r2, r1)
        L1c5:
            android.util.Pair r0 = android.util.Pair.create(r2, r1)
            return r0
        L1ca:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1ca
            throw r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.audio.AudioAttributes r1 = r2.audioAttributes     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r2.audioAttributes = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L16
            r2.maybeInvalidateForAudioChannelCountConstraints()
        L16:
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public void setParameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder r1) {
            r0 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r1.build()
            r0.setParametersInternal(r1)
            return
    }

    @java.lang.Deprecated
    public void setParameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder r1) {
            r0 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r1.build()
            r0.setParametersInternal(r1)
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters
            if (r0 == 0) goto La
            r0 = r4
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r0
            r3.setParametersInternal(r0)
        La:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r3.getParameters()
            r2 = 0
            r0.<init>(r1, r2)
            r0.set(r4)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r4 = r0.build()
            r3.setParametersInternal(r4)
            return
    }
}
