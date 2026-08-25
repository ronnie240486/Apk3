package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilities {
    private static final com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = null;
    public static final com.google.android.exoplayer2.audio.AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = null;
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final com.google.android.exoplayer2.audio.AudioCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = null;
    private static final java.lang.String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;

    @androidx.annotation.RequiresApi(29)
    public static final class Api29 {
        private static final android.media.AudioAttributes DEFAULT_AUDIO_ATTRIBUTES = null;

        static {
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 1
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                r1 = 3
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                r1 = 0
                android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
                android.media.AudioAttributes r0 = r0.build()
                com.google.android.exoplayer2.audio.AudioCapabilities.Api29.DEFAULT_AUDIO_ATTRIBUTES = r0
                return
        }

        private Api29() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int[] getDirectPlaybackSupportedEncodings() {
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                com.google.common.collect.ImmutableMap r1 = com.google.android.exoplayer2.audio.AudioCapabilities.access$000()
                com.google.common.collect.ImmutableSet r1 = r1.keySet()
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L4a
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                android.media.AudioFormat$Builder r3 = new android.media.AudioFormat$Builder
                r3.<init>()
                r4 = 12
                android.media.AudioFormat$Builder r3 = r3.setChannelMask(r4)
                android.media.AudioFormat$Builder r3 = r3.setEncoding(r2)
                r4 = 48000(0xbb80, float:6.7262E-41)
                android.media.AudioFormat$Builder r3 = r3.setSampleRate(r4)
                android.media.AudioFormat r3 = r3.build()
                android.media.AudioAttributes r4 = com.google.android.exoplayer2.audio.AudioCapabilities.Api29.DEFAULT_AUDIO_ATTRIBUTES
                boolean r3 = android.media.AudioTrack.isDirectPlaybackSupported(r3, r4)
                if (r3 == 0) goto L10
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.add(r2)
                goto L10
            L4a:
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.add(r1)
                com.google.common.collect.ImmutableList r0 = r0.build()
                int[] r0 = com.google.common.primitives.Ints.toArray(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getMaxSupportedChannelCountForPassthrough(int r3, int r4) {
                r0 = 8
            L2:
                if (r0 <= 0) goto L29
                android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
                r1.<init>()
                android.media.AudioFormat$Builder r1 = r1.setEncoding(r3)
                android.media.AudioFormat$Builder r1 = r1.setSampleRate(r4)
                int r2 = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(r0)
                android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
                android.media.AudioFormat r1 = r1.build()
                android.media.AudioAttributes r2 = com.google.android.exoplayer2.audio.AudioCapabilities.Api29.DEFAULT_AUDIO_ATTRIBUTES
                boolean r1 = android.media.AudioTrack.isDirectPlaybackSupported(r1, r2)
                if (r1 == 0) goto L26
                return r0
            L26:
                int r0 = r0 + (-1)
                goto L2
            L29:
                r3 = 0
                return r3
        }
    }

    static {
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = new com.google.android.exoplayer2.audio.AudioCapabilities
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 2
            r1[r2] = r3
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES = r0
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = new com.google.android.exoplayer2.audio.AudioCapabilities
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x006a: FILL_ARRAY_DATA , data: [2, 5, 6} // fill-array
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.audio.AudioCapabilities.EXTERNAL_SURROUND_SOUND_CAPABILITIES = r0
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            r0.<init>()
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r1, r2)
            r1 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r1, r2)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r1, r2)
            r1 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r1, r2)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r3)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r3, r3)
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r1, r3)
            com.google.common.collect.ImmutableMap r0 = r0.buildOrThrow()
            com.google.android.exoplayer2.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = r0
            return
    }

    public AudioCapabilities(@androidx.annotation.Nullable int[] r2, int r3) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L10
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.supportedEncodings = r2
            java.util.Arrays.sort(r2)
            goto L15
        L10:
            r2 = 0
            int[] r2 = new int[r2]
            r1.supportedEncodings = r2
        L15:
            r1.maxChannelCount = r3
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableMap access$000() {
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> r0 = com.google.android.exoplayer2.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS
            return r0
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 17
            if (r0 < r1) goto L1a
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L18
            java.lang.String r1 = "Xiaomi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public static com.google.android.exoplayer2.audio.AudioCapabilities getCapabilities(android.content.Context r2) {
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.media.action.HDMI_AUDIO_PLUG"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r0 = r2.registerReceiver(r1, r0)
            com.google.android.exoplayer2.audio.AudioCapabilities r2 = getCapabilities(r2, r0)
            return r2
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    public static com.google.android.exoplayer2.audio.AudioCapabilities getCapabilities(android.content.Context r4, @androidx.annotation.Nullable android.content.Intent r5) {
            boolean r0 = deviceMaySetExternalSurroundSoundGlobalSetting()
            r1 = 0
            if (r0 == 0) goto L17
            android.content.ContentResolver r0 = r4.getContentResolver()
            java.lang.String r2 = "external_surround_sound_enabled"
            int r0 = android.provider.Settings.Global.getInt(r0, r2, r1)
            r2 = 1
            if (r0 != r2) goto L17
            com.google.android.exoplayer2.audio.AudioCapabilities r4 = com.google.android.exoplayer2.audio.AudioCapabilities.EXTERNAL_SURROUND_SOUND_CAPABILITIES
            return r4
        L17:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 29
            r3 = 8
            if (r0 < r2) goto L35
            boolean r0 = com.google.android.exoplayer2.util.Util.isTv(r4)
            if (r0 != 0) goto L2b
            boolean r4 = com.google.android.exoplayer2.util.Util.isAutomotive(r4)
            if (r4 == 0) goto L35
        L2b:
            com.google.android.exoplayer2.audio.AudioCapabilities r4 = new com.google.android.exoplayer2.audio.AudioCapabilities
            int[] r5 = com.google.android.exoplayer2.audio.AudioCapabilities.Api29.getDirectPlaybackSupportedEncodings()
            r4.<init>(r5, r3)
            return r4
        L35:
            if (r5 == 0) goto L52
            java.lang.String r4 = "android.media.extra.AUDIO_PLUG_STATE"
            int r4 = r5.getIntExtra(r4, r1)
            if (r4 != 0) goto L40
            goto L52
        L40:
            com.google.android.exoplayer2.audio.AudioCapabilities r4 = new com.google.android.exoplayer2.audio.AudioCapabilities
            java.lang.String r0 = "android.media.extra.ENCODINGS"
            int[] r0 = r5.getIntArrayExtra(r0)
            java.lang.String r1 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r5 = r5.getIntExtra(r1, r3)
            r4.<init>(r0, r5)
            return r4
        L52:
            com.google.android.exoplayer2.audio.AudioCapabilities r4 = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES
            return r4
    }

    private static int getChannelConfigForPassthrough(int r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            if (r0 > r1) goto L16
            r1 = 7
            if (r2 != r1) goto Lc
            r2 = 8
            goto L16
        Lc:
            r1 = 3
            if (r2 == r1) goto L15
            r1 = 4
            if (r2 == r1) goto L15
            r1 = 5
            if (r2 != r1) goto L16
        L15:
            r2 = 6
        L16:
            r1 = 26
            if (r0 > r1) goto L28
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.DEVICE
            java.lang.String r1 = "fugu"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            r0 = 1
            if (r2 != r0) goto L28
            r2 = 2
        L28:
            int r2 = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.net.Uri getExternalSurroundSoundGlobalSettingUri() {
            boolean r0 = deviceMaySetExternalSurroundSoundGlobalSetting()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "external_surround_sound_enabled"
            android.net.Uri r0 = android.provider.Settings.Global.getUriFor(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private static int getMaxSupportedChannelCountForPassthrough(int r2, int r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            int r2 = com.google.android.exoplayer2.audio.AudioCapabilities.Api29.getMaxSupportedChannelCountForPassthrough(r2, r3)
            return r2
        Lb:
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> r3 = com.google.android.exoplayer2.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r3.getOrDefault(r2, r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.audio.AudioCapabilities
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.audio.AudioCapabilities r5 = (com.google.android.exoplayer2.audio.AudioCapabilities) r5
            int[] r1 = r4.supportedEncodings
            int[] r3 = r5.supportedEncodings
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L1d
            int r1 = r4.maxChannelCount
            int r5 = r5.maxChannelCount
            if (r1 != r5) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    @androidx.annotation.Nullable
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(com.google.android.exoplayer2.Format r6) {
            r5 = this;
            java.lang.String r0 = r6.sampleMimeType
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r6.codecs
            int r0 = com.google.android.exoplayer2.util.MimeTypes.getEncoding(r0, r1)
            com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> r1 = com.google.android.exoplayer2.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            r2 = 0
            if (r1 != 0) goto L1c
            return r2
        L1c:
            r1 = 18
            if (r0 != r1) goto L28
            boolean r3 = r5.supportsEncoding(r1)
            if (r3 != 0) goto L28
            r0 = 6
            goto L33
        L28:
            r3 = 8
            if (r0 != r3) goto L33
            boolean r3 = r5.supportsEncoding(r3)
            if (r3 != 0) goto L33
            r0 = 7
        L33:
            boolean r3 = r5.supportsEncoding(r0)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            int r3 = r6.channelCount
            r4 = -1
            if (r3 == r4) goto L47
            if (r0 != r1) goto L42
            goto L47
        L42:
            int r6 = r5.maxChannelCount
            if (r3 <= r6) goto L53
            return r2
        L47:
            int r6 = r6.sampleRate
            if (r6 == r4) goto L4c
            goto L4f
        L4c:
            r6 = 48000(0xbb80, float:6.7262E-41)
        L4f:
            int r3 = getMaxSupportedChannelCountForPassthrough(r0, r6)
        L53:
            int r6 = getChannelConfigForPassthrough(r3)
            if (r6 != 0) goto L5a
            return r2
        L5a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Pair r6 = android.util.Pair.create(r0, r6)
            return r6
    }

    public int getMaxChannelCount() {
            r1 = this;
            int r0 = r1.maxChannelCount
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.maxChannelCount
            int[] r1 = r2.supportedEncodings
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public boolean isPassthroughPlaybackSupported(com.google.android.exoplayer2.Format r1) {
            r0 = this;
            android.util.Pair r1 = r0.getEncodingAndChannelConfigForPassthrough(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean supportsEncoding(int r2) {
            r1 = this;
            int[] r0 = r1.supportedEncodings
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AudioCapabilities[maxChannelCount="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.maxChannelCount
            r0.append(r1)
            java.lang.String r1 = ", supportedEncodings="
            r0.append(r1)
            int[] r1 = r2.supportedEncodings
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
