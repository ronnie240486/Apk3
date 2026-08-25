package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class Format implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Format> CREATOR = null;
    private static final com.google.android.exoplayer2.Format DEFAULT = null;
    private static final java.lang.String FIELD_ACCESSIBILITY_CHANNEL = null;
    private static final java.lang.String FIELD_AVERAGE_BITRATE = null;
    private static final java.lang.String FIELD_CHANNEL_COUNT = null;
    private static final java.lang.String FIELD_CODECS = null;
    private static final java.lang.String FIELD_COLOR_INFO = null;
    private static final java.lang.String FIELD_CONTAINER_MIME_TYPE = null;
    private static final java.lang.String FIELD_CRYPTO_TYPE = null;
    private static final java.lang.String FIELD_DRM_INIT_DATA = null;
    private static final java.lang.String FIELD_ENCODER_DELAY = null;
    private static final java.lang.String FIELD_ENCODER_PADDING = null;
    private static final java.lang.String FIELD_FRAME_RATE = null;
    private static final java.lang.String FIELD_HEIGHT = null;
    private static final java.lang.String FIELD_ID = null;
    private static final java.lang.String FIELD_INITIALIZATION_DATA = null;
    private static final java.lang.String FIELD_LABEL = null;
    private static final java.lang.String FIELD_LANGUAGE = null;
    private static final java.lang.String FIELD_MAX_INPUT_SIZE = null;
    private static final java.lang.String FIELD_METADATA = null;
    private static final java.lang.String FIELD_PCM_ENCODING = null;
    private static final java.lang.String FIELD_PEAK_BITRATE = null;
    private static final java.lang.String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = null;
    private static final java.lang.String FIELD_PROJECTION_DATA = null;
    private static final java.lang.String FIELD_ROLE_FLAGS = null;
    private static final java.lang.String FIELD_ROTATION_DEGREES = null;
    private static final java.lang.String FIELD_SAMPLE_MIME_TYPE = null;
    private static final java.lang.String FIELD_SAMPLE_RATE = null;
    private static final java.lang.String FIELD_SELECTION_FLAGS = null;
    private static final java.lang.String FIELD_STEREO_MODE = null;
    private static final java.lang.String FIELD_SUBSAMPLE_OFFSET_US = null;
    private static final java.lang.String FIELD_TILE_COUNT_HORIZONTAL = null;
    private static final java.lang.String FIELD_TILE_COUNT_VERTICAL = null;
    private static final java.lang.String FIELD_WIDTH = null;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;

    @androidx.annotation.Nullable
    public final java.lang.String codecs;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.video.ColorInfo colorInfo;

    @androidx.annotation.Nullable
    public final java.lang.String containerMimeType;
    public final int cryptoType;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.drm.DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;

    @androidx.annotation.Nullable
    public final java.lang.String id;
    public final java.util.List<byte[]> initializationData;

    @androidx.annotation.Nullable
    public final java.lang.String label;

    @androidx.annotation.Nullable
    public final java.lang.String language;
    public final int maxInputSize;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.metadata.Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;

    @androidx.annotation.Nullable
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;

    @androidx.annotation.Nullable
    public final java.lang.String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.Format$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private int accessibilityChannel;
        private int averageBitrate;
        private int channelCount;

        @androidx.annotation.Nullable
        private java.lang.String codecs;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.video.ColorInfo colorInfo;

        @androidx.annotation.Nullable
        private java.lang.String containerMimeType;
        private int cryptoType;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private int height;

        @androidx.annotation.Nullable
        private java.lang.String id;

        @androidx.annotation.Nullable
        private java.util.List<byte[]> initializationData;

        @androidx.annotation.Nullable
        private java.lang.String label;

        @androidx.annotation.Nullable
        private java.lang.String language;
        private int maxInputSize;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.metadata.Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;

        @androidx.annotation.Nullable
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;

        @androidx.annotation.Nullable
        private java.lang.String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int tileCountHorizontal;
        private int tileCountVertical;
        private int width;

        public Builder() {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.averageBitrate = r0
                r3.peakBitrate = r0
                r3.maxInputSize = r0
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.subsampleOffsetUs = r1
                r3.width = r0
                r3.height = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3.frameRate = r1
                r1 = 1065353216(0x3f800000, float:1.0)
                r3.pixelWidthHeightRatio = r1
                r3.stereoMode = r0
                r3.channelCount = r0
                r3.sampleRate = r0
                r3.pcmEncoding = r0
                r3.accessibilityChannel = r0
                r3.tileCountHorizontal = r0
                r3.tileCountVertical = r0
                r0 = 0
                r3.cryptoType = r0
                return
        }

        private Builder(com.google.android.exoplayer2.Format r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.id
                r2.id = r0
                java.lang.String r0 = r3.label
                r2.label = r0
                java.lang.String r0 = r3.language
                r2.language = r0
                int r0 = r3.selectionFlags
                r2.selectionFlags = r0
                int r0 = r3.roleFlags
                r2.roleFlags = r0
                int r0 = r3.averageBitrate
                r2.averageBitrate = r0
                int r0 = r3.peakBitrate
                r2.peakBitrate = r0
                java.lang.String r0 = r3.codecs
                r2.codecs = r0
                com.google.android.exoplayer2.metadata.Metadata r0 = r3.metadata
                r2.metadata = r0
                java.lang.String r0 = r3.containerMimeType
                r2.containerMimeType = r0
                java.lang.String r0 = r3.sampleMimeType
                r2.sampleMimeType = r0
                int r0 = r3.maxInputSize
                r2.maxInputSize = r0
                java.util.List<byte[]> r0 = r3.initializationData
                r2.initializationData = r0
                com.google.android.exoplayer2.drm.DrmInitData r0 = r3.drmInitData
                r2.drmInitData = r0
                long r0 = r3.subsampleOffsetUs
                r2.subsampleOffsetUs = r0
                int r0 = r3.width
                r2.width = r0
                int r0 = r3.height
                r2.height = r0
                float r0 = r3.frameRate
                r2.frameRate = r0
                int r0 = r3.rotationDegrees
                r2.rotationDegrees = r0
                float r0 = r3.pixelWidthHeightRatio
                r2.pixelWidthHeightRatio = r0
                byte[] r0 = r3.projectionData
                r2.projectionData = r0
                int r0 = r3.stereoMode
                r2.stereoMode = r0
                com.google.android.exoplayer2.video.ColorInfo r0 = r3.colorInfo
                r2.colorInfo = r0
                int r0 = r3.channelCount
                r2.channelCount = r0
                int r0 = r3.sampleRate
                r2.sampleRate = r0
                int r0 = r3.pcmEncoding
                r2.pcmEncoding = r0
                int r0 = r3.encoderDelay
                r2.encoderDelay = r0
                int r0 = r3.encoderPadding
                r2.encoderPadding = r0
                int r0 = r3.accessibilityChannel
                r2.accessibilityChannel = r0
                int r0 = r3.tileCountHorizontal
                r2.tileCountHorizontal = r0
                int r0 = r3.tileCountVertical
                r2.tileCountVertical = r0
                int r3 = r3.cryptoType
                r2.cryptoType = r3
                return
        }

        public /* synthetic */ Builder(com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.Format.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.lang.String access$100(com.google.android.exoplayer2.Format.Builder r0) {
                java.lang.String r0 = r0.id
                return r0
        }

        public static /* synthetic */ java.lang.String access$1000(com.google.android.exoplayer2.Format.Builder r0) {
                java.lang.String r0 = r0.containerMimeType
                return r0
        }

        public static /* synthetic */ java.lang.String access$1100(com.google.android.exoplayer2.Format.Builder r0) {
                java.lang.String r0 = r0.sampleMimeType
                return r0
        }

        public static /* synthetic */ int access$1200(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.maxInputSize
                return r0
        }

        public static /* synthetic */ java.util.List access$1300(com.google.android.exoplayer2.Format.Builder r0) {
                java.util.List<byte[]> r0 = r0.initializationData
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.DrmInitData access$1400(com.google.android.exoplayer2.Format.Builder r0) {
                com.google.android.exoplayer2.drm.DrmInitData r0 = r0.drmInitData
                return r0
        }

        public static /* synthetic */ long access$1500(com.google.android.exoplayer2.Format.Builder r2) {
                long r0 = r2.subsampleOffsetUs
                return r0
        }

        public static /* synthetic */ int access$1600(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.width
                return r0
        }

        public static /* synthetic */ int access$1700(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.height
                return r0
        }

        public static /* synthetic */ float access$1800(com.google.android.exoplayer2.Format.Builder r0) {
                float r0 = r0.frameRate
                return r0
        }

        public static /* synthetic */ int access$1900(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.rotationDegrees
                return r0
        }

        public static /* synthetic */ java.lang.String access$200(com.google.android.exoplayer2.Format.Builder r0) {
                java.lang.String r0 = r0.label
                return r0
        }

        public static /* synthetic */ float access$2000(com.google.android.exoplayer2.Format.Builder r0) {
                float r0 = r0.pixelWidthHeightRatio
                return r0
        }

        public static /* synthetic */ byte[] access$2100(com.google.android.exoplayer2.Format.Builder r0) {
                byte[] r0 = r0.projectionData
                return r0
        }

        public static /* synthetic */ int access$2200(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.stereoMode
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.video.ColorInfo access$2300(com.google.android.exoplayer2.Format.Builder r0) {
                com.google.android.exoplayer2.video.ColorInfo r0 = r0.colorInfo
                return r0
        }

        public static /* synthetic */ int access$2400(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.channelCount
                return r0
        }

        public static /* synthetic */ int access$2500(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.sampleRate
                return r0
        }

        public static /* synthetic */ int access$2600(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.pcmEncoding
                return r0
        }

        public static /* synthetic */ int access$2700(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.encoderDelay
                return r0
        }

        public static /* synthetic */ int access$2800(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.encoderPadding
                return r0
        }

        public static /* synthetic */ int access$2900(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.accessibilityChannel
                return r0
        }

        public static /* synthetic */ java.lang.String access$300(com.google.android.exoplayer2.Format.Builder r0) {
                java.lang.String r0 = r0.language
                return r0
        }

        public static /* synthetic */ int access$3000(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.tileCountHorizontal
                return r0
        }

        public static /* synthetic */ int access$3100(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.tileCountVertical
                return r0
        }

        public static /* synthetic */ int access$3200(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.cryptoType
                return r0
        }

        public static /* synthetic */ int access$400(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.selectionFlags
                return r0
        }

        public static /* synthetic */ int access$500(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.roleFlags
                return r0
        }

        public static /* synthetic */ int access$600(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.averageBitrate
                return r0
        }

        public static /* synthetic */ int access$700(com.google.android.exoplayer2.Format.Builder r0) {
                int r0 = r0.peakBitrate
                return r0
        }

        public static /* synthetic */ java.lang.String access$800(com.google.android.exoplayer2.Format.Builder r0) {
                java.lang.String r0 = r0.codecs
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.metadata.Metadata access$900(com.google.android.exoplayer2.Format.Builder r0) {
                com.google.android.exoplayer2.metadata.Metadata r0 = r0.metadata
                return r0
        }

        public com.google.android.exoplayer2.Format build() {
                r2 = this;
                com.google.android.exoplayer2.Format r0 = new com.google.android.exoplayer2.Format
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setAccessibilityChannel(int r1) {
                r0 = this;
                r0.accessibilityChannel = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setAverageBitrate(int r1) {
                r0 = this;
                r0.averageBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setChannelCount(int r1) {
                r0 = this;
                r0.channelCount = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setCodecs(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.codecs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setColorInfo(@androidx.annotation.Nullable com.google.android.exoplayer2.video.ColorInfo r1) {
                r0 = this;
                r0.colorInfo = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setContainerMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.containerMimeType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setCryptoType(int r1) {
                r0 = this;
                r0.cryptoType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setDrmInitData(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r1) {
                r0 = this;
                r0.drmInitData = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setEncoderDelay(int r1) {
                r0 = this;
                r0.encoderDelay = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setEncoderPadding(int r1) {
                r0 = this;
                r0.encoderPadding = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setFrameRate(float r1) {
                r0 = this;
                r0.frameRate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setHeight(int r1) {
                r0 = this;
                r0.height = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setId(int r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Integer.toString(r1)
                r0.id = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setId(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.id = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setInitializationData(@androidx.annotation.Nullable java.util.List<byte[]> r1) {
                r0 = this;
                r0.initializationData = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setLabel(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.label = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setLanguage(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.language = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setMaxInputSize(int r1) {
                r0 = this;
                r0.maxInputSize = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setMetadata(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r1) {
                r0 = this;
                r0.metadata = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setPcmEncoding(int r1) {
                r0 = this;
                r0.pcmEncoding = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setPeakBitrate(int r1) {
                r0 = this;
                r0.peakBitrate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setPixelWidthHeightRatio(float r1) {
                r0 = this;
                r0.pixelWidthHeightRatio = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setProjectionData(@androidx.annotation.Nullable byte[] r1) {
                r0 = this;
                r0.projectionData = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setRoleFlags(int r1) {
                r0 = this;
                r0.roleFlags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setRotationDegrees(int r1) {
                r0 = this;
                r0.rotationDegrees = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setSampleMimeType(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.sampleMimeType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setSampleRate(int r1) {
                r0 = this;
                r0.sampleRate = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setSelectionFlags(int r1) {
                r0 = this;
                r0.selectionFlags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setStereoMode(int r1) {
                r0 = this;
                r0.stereoMode = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setSubsampleOffsetUs(long r1) {
                r0 = this;
                r0.subsampleOffsetUs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setTileCountHorizontal(int r1) {
                r0 = this;
                r0.tileCountHorizontal = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setTileCountVertical(int r1) {
                r0 = this;
                r0.tileCountVertical = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Format.Builder setWidth(int r1) {
                r0 = this;
                r0.width = r1
                return r0
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format $r8$lambda$4wXnd4xtd49V1jolbzSo3RtlsBw(android.os.Bundle r0) {
            com.google.android.exoplayer2.Format r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.Format.DEFAULT = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_ID = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_LABEL = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_LANGUAGE = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_SELECTION_FLAGS = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_ROLE_FLAGS = r0
            r0 = 5
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_AVERAGE_BITRATE = r0
            r0 = 6
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_PEAK_BITRATE = r0
            r0 = 7
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_CODECS = r0
            r0 = 8
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_METADATA = r0
            r0 = 9
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_CONTAINER_MIME_TYPE = r0
            r0 = 10
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_SAMPLE_MIME_TYPE = r0
            r0 = 11
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_MAX_INPUT_SIZE = r0
            r0 = 12
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_INITIALIZATION_DATA = r0
            r0 = 13
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_DRM_INIT_DATA = r0
            r0 = 14
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_SUBSAMPLE_OFFSET_US = r0
            r0 = 15
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_WIDTH = r0
            r0 = 16
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_HEIGHT = r0
            r0 = 17
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_FRAME_RATE = r0
            r0 = 18
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_ROTATION_DEGREES = r0
            r0 = 19
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_PIXEL_WIDTH_HEIGHT_RATIO = r0
            r0 = 20
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_PROJECTION_DATA = r0
            r0 = 21
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_STEREO_MODE = r0
            r0 = 22
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_COLOR_INFO = r0
            r0 = 23
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_CHANNEL_COUNT = r0
            r0 = 24
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_SAMPLE_RATE = r0
            r0 = 25
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_PCM_ENCODING = r0
            r0 = 26
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_ENCODER_DELAY = r0
            r0 = 27
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_ENCODER_PADDING = r0
            r0 = 28
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_ACCESSIBILITY_CHANNEL = r0
            r0 = 29
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_CRYPTO_TYPE = r0
            r0 = 30
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_TILE_COUNT_HORIZONTAL = r0
            r0 = 31
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Format.FIELD_TILE_COUNT_VERTICAL = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.Format.CREATOR = r0
            return
    }

    private Format(com.google.android.exoplayer2.Format.Builder r6) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = com.google.android.exoplayer2.Format.Builder.access$100(r6)
            r5.id = r0
            java.lang.String r0 = com.google.android.exoplayer2.Format.Builder.access$200(r6)
            r5.label = r0
            java.lang.String r0 = com.google.android.exoplayer2.Format.Builder.access$300(r6)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.normalizeLanguageCode(r0)
            r5.language = r0
            int r0 = com.google.android.exoplayer2.Format.Builder.access$400(r6)
            r5.selectionFlags = r0
            int r0 = com.google.android.exoplayer2.Format.Builder.access$500(r6)
            r5.roleFlags = r0
            int r0 = com.google.android.exoplayer2.Format.Builder.access$600(r6)
            r5.averageBitrate = r0
            int r1 = com.google.android.exoplayer2.Format.Builder.access$700(r6)
            r5.peakBitrate = r1
            r2 = -1
            if (r1 == r2) goto L35
            r0 = r1
        L35:
            r5.bitrate = r0
            java.lang.String r0 = com.google.android.exoplayer2.Format.Builder.access$800(r6)
            r5.codecs = r0
            com.google.android.exoplayer2.metadata.Metadata r0 = com.google.android.exoplayer2.Format.Builder.access$900(r6)
            r5.metadata = r0
            java.lang.String r0 = com.google.android.exoplayer2.Format.Builder.access$1000(r6)
            r5.containerMimeType = r0
            java.lang.String r0 = com.google.android.exoplayer2.Format.Builder.access$1100(r6)
            r5.sampleMimeType = r0
            int r0 = com.google.android.exoplayer2.Format.Builder.access$1200(r6)
            r5.maxInputSize = r0
            java.util.List r0 = com.google.android.exoplayer2.Format.Builder.access$1300(r6)
            if (r0 != 0) goto L60
            java.util.List r0 = java.util.Collections.emptyList()
            goto L64
        L60:
            java.util.List r0 = com.google.android.exoplayer2.Format.Builder.access$1300(r6)
        L64:
            r5.initializationData = r0
            com.google.android.exoplayer2.drm.DrmInitData r0 = com.google.android.exoplayer2.Format.Builder.access$1400(r6)
            r5.drmInitData = r0
            long r3 = com.google.android.exoplayer2.Format.Builder.access$1500(r6)
            r5.subsampleOffsetUs = r3
            int r1 = com.google.android.exoplayer2.Format.Builder.access$1600(r6)
            r5.width = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$1700(r6)
            r5.height = r1
            float r1 = com.google.android.exoplayer2.Format.Builder.access$1800(r6)
            r5.frameRate = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$1900(r6)
            r3 = 0
            if (r1 != r2) goto L8d
            r1 = 0
            goto L91
        L8d:
            int r1 = com.google.android.exoplayer2.Format.Builder.access$1900(r6)
        L91:
            r5.rotationDegrees = r1
            float r1 = com.google.android.exoplayer2.Format.Builder.access$2000(r6)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto La0
            r1 = 1065353216(0x3f800000, float:1.0)
            goto La4
        La0:
            float r1 = com.google.android.exoplayer2.Format.Builder.access$2000(r6)
        La4:
            r5.pixelWidthHeightRatio = r1
            byte[] r1 = com.google.android.exoplayer2.Format.Builder.access$2100(r6)
            r5.projectionData = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2200(r6)
            r5.stereoMode = r1
            com.google.android.exoplayer2.video.ColorInfo r1 = com.google.android.exoplayer2.Format.Builder.access$2300(r6)
            r5.colorInfo = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2400(r6)
            r5.channelCount = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2500(r6)
            r5.sampleRate = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2600(r6)
            r5.pcmEncoding = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2700(r6)
            if (r1 != r2) goto Ld2
            r1 = 0
            goto Ld6
        Ld2:
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2700(r6)
        Ld6:
            r5.encoderDelay = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2800(r6)
            if (r1 != r2) goto Ldf
            goto Le3
        Ldf:
            int r3 = com.google.android.exoplayer2.Format.Builder.access$2800(r6)
        Le3:
            r5.encoderPadding = r3
            int r1 = com.google.android.exoplayer2.Format.Builder.access$2900(r6)
            r5.accessibilityChannel = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$3000(r6)
            r5.tileCountHorizontal = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$3100(r6)
            r5.tileCountVertical = r1
            int r1 = com.google.android.exoplayer2.Format.Builder.access$3200(r6)
            if (r1 != 0) goto L103
            if (r0 == 0) goto L103
            r6 = 1
            r5.cryptoType = r6
            goto L109
        L103:
            int r6 = com.google.android.exoplayer2.Format.Builder.access$3200(r6)
            r5.cryptoType = r6
        L109:
            return
    }

    public /* synthetic */ Format(com.google.android.exoplayer2.Format.Builder r1, com.google.android.exoplayer2.Format.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createAudioSampleFormat(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, int r6, int r7, int r8, @androidx.annotation.Nullable java.util.List<byte[]> r9, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r10, int r11, @androidx.annotation.Nullable java.lang.String r12) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r12)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSelectionFlags(r11)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMaxInputSize(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setInitializationData(r9)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r10)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPcmEncoding(r8)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createAudioSampleFormat(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, int r6, int r7, @androidx.annotation.Nullable java.util.List<byte[]> r8, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r9, int r10, @androidx.annotation.Nullable java.lang.String r11) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r11)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSelectionFlags(r10)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMaxInputSize(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setInitializationData(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r9)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r7)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createContainerFormat(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, int r6, int r7, int r8, @androidx.annotation.Nullable java.lang.String r9) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLabel(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r9)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSelectionFlags(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRoleFlags(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setContainerMimeType(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r4)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createSampleFormat(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createVideoSampleFormat(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, int r6, int r7, float r8, @androidx.annotation.Nullable java.util.List<byte[]> r9, int r10, float r11, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r12) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMaxInputSize(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setInitializationData(r9)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r12)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setWidth(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setFrameRate(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRotationDegrees(r10)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPixelWidthHeightRatio(r11)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createVideoSampleFormat(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, int r6, int r7, float r8, @androidx.annotation.Nullable java.util.List<byte[]> r9, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r10) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMaxInputSize(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setInitializationData(r9)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r10)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setWidth(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setFrameRate(r8)
            com.google.android.exoplayer2.Format r1 = r1.build()
            return r1
    }

    @androidx.annotation.Nullable
    private static <T> T defaultIfNull(@androidx.annotation.Nullable T r0, @androidx.annotation.Nullable T r1) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r0 = r1
        L4:
            return r0
    }

    private static com.google.android.exoplayer2.Format fromBundle(android.os.Bundle r6) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.util.BundleableUtil.ensureClassLoader(r6)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_ID
            java.lang.String r1 = r6.getString(r1)
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.DEFAULT
            java.lang.String r3 = r2.id
            java.lang.Object r1 = defaultIfNull(r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.exoplayer2.Format$Builder r1 = r0.setId(r1)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_LABEL
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = r2.label
            java.lang.Object r3 = defaultIfNull(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLabel(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_LANGUAGE
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = r2.language
            java.lang.Object r3 = defaultIfNull(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_SELECTION_FLAGS
            int r4 = r2.selectionFlags
            int r3 = r6.getInt(r3, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSelectionFlags(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_ROLE_FLAGS
            int r4 = r2.roleFlags
            int r3 = r6.getInt(r3, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRoleFlags(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_AVERAGE_BITRATE
            int r4 = r2.averageBitrate
            int r3 = r6.getInt(r3, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_PEAK_BITRATE
            int r4 = r2.peakBitrate
            int r3 = r6.getInt(r3, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_CODECS
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = r2.codecs
            java.lang.Object r3 = defaultIfNull(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_METADATA
            android.os.Parcelable r3 = r6.getParcelable(r3)
            com.google.android.exoplayer2.metadata.Metadata r3 = (com.google.android.exoplayer2.metadata.Metadata) r3
            com.google.android.exoplayer2.metadata.Metadata r4 = r2.metadata
            java.lang.Object r3 = defaultIfNull(r3, r4)
            com.google.android.exoplayer2.metadata.Metadata r3 = (com.google.android.exoplayer2.metadata.Metadata) r3
            com.google.android.exoplayer2.Format$Builder r1 = r1.setMetadata(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_CONTAINER_MIME_TYPE
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = r2.containerMimeType
            java.lang.Object r3 = defaultIfNull(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.exoplayer2.Format$Builder r1 = r1.setContainerMimeType(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_SAMPLE_MIME_TYPE
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r4 = r2.sampleMimeType
            java.lang.Object r3 = defaultIfNull(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r3)
            java.lang.String r3 = com.google.android.exoplayer2.Format.FIELD_MAX_INPUT_SIZE
            int r2 = r2.maxInputSize
            int r2 = r6.getInt(r3, r2)
            r1.setMaxInputSize(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        Lcb:
            java.lang.String r3 = keyForInitializationData(r2)
            byte[] r3 = r6.getByteArray(r3)
            if (r3 != 0) goto L1c7
            com.google.android.exoplayer2.Format$Builder r1 = r0.setInitializationData(r1)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_DRM_INIT_DATA
            android.os.Parcelable r2 = r6.getParcelable(r2)
            com.google.android.exoplayer2.drm.DrmInitData r2 = (com.google.android.exoplayer2.drm.DrmInitData) r2
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_SUBSAMPLE_OFFSET_US
            com.google.android.exoplayer2.Format r3 = com.google.android.exoplayer2.Format.DEFAULT
            long r4 = r3.subsampleOffsetUs
            long r4 = r6.getLong(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSubsampleOffsetUs(r4)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_WIDTH
            int r4 = r3.width
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setWidth(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_HEIGHT
            int r4 = r3.height
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_FRAME_RATE
            float r4 = r3.frameRate
            float r2 = r6.getFloat(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setFrameRate(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_ROTATION_DEGREES
            int r4 = r3.rotationDegrees
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRotationDegrees(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_PIXEL_WIDTH_HEIGHT_RATIO
            float r4 = r3.pixelWidthHeightRatio
            float r2 = r6.getFloat(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPixelWidthHeightRatio(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_PROJECTION_DATA
            byte[] r2 = r6.getByteArray(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setProjectionData(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_STEREO_MODE
            int r4 = r3.stereoMode
            int r2 = r6.getInt(r2, r4)
            r1.setStereoMode(r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_COLOR_INFO
            android.os.Bundle r1 = r6.getBundle(r1)
            if (r1 == 0) goto L157
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.video.ColorInfo> r2 = com.google.android.exoplayer2.video.ColorInfo.CREATOR
            com.google.android.exoplayer2.Bundleable r1 = r2.fromBundle(r1)
            com.google.android.exoplayer2.video.ColorInfo r1 = (com.google.android.exoplayer2.video.ColorInfo) r1
            r0.setColorInfo(r1)
        L157:
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_CHANNEL_COUNT
            int r2 = r3.channelCount
            int r1 = r6.getInt(r1, r2)
            com.google.android.exoplayer2.Format$Builder r1 = r0.setChannelCount(r1)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_SAMPLE_RATE
            int r4 = r3.sampleRate
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_PCM_ENCODING
            int r4 = r3.pcmEncoding
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPcmEncoding(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_ENCODER_DELAY
            int r4 = r3.encoderDelay
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setEncoderDelay(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_ENCODER_PADDING
            int r4 = r3.encoderPadding
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setEncoderPadding(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_ACCESSIBILITY_CHANNEL
            int r4 = r3.accessibilityChannel
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAccessibilityChannel(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_TILE_COUNT_HORIZONTAL
            int r4 = r3.tileCountHorizontal
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setTileCountHorizontal(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_TILE_COUNT_VERTICAL
            int r4 = r3.tileCountVertical
            int r2 = r6.getInt(r2, r4)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setTileCountVertical(r2)
            java.lang.String r2 = com.google.android.exoplayer2.Format.FIELD_CRYPTO_TYPE
            int r3 = r3.cryptoType
            int r6 = r6.getInt(r2, r3)
            r1.setCryptoType(r6)
            com.google.android.exoplayer2.Format r6 = r0.build()
            return r6
        L1c7:
            r1.add(r3)
            int r2 = r2 + 1
            goto Lcb
    }

    private static java.lang.String keyForInitializationData(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_INITIALIZATION_DATA
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r1 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String toLogString(@androidx.annotation.Nullable com.google.android.exoplayer2.Format r8) {
            if (r8 != 0) goto L5
            java.lang.String r8 = "null"
            return r8
        L5:
            java.lang.String r0 = "id="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r8.id
            r0.append(r1)
            java.lang.String r1 = ", mimeType="
            r0.append(r1)
            java.lang.String r1 = r8.sampleMimeType
            r0.append(r1)
            int r1 = r8.bitrate
            r2 = -1
            if (r1 == r2) goto L29
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            int r1 = r8.bitrate
            r0.append(r1)
        L29:
            java.lang.String r1 = r8.codecs
            if (r1 == 0) goto L37
            java.lang.String r1 = ", codecs="
            r0.append(r1)
            java.lang.String r1 = r8.codecs
            r0.append(r1)
        L37:
            com.google.android.exoplayer2.drm.DrmInitData r1 = r8.drmInitData
            r3 = 44
            if (r1 == 0) goto Lc5
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r4 = 0
        L43:
            com.google.android.exoplayer2.drm.DrmInitData r5 = r8.drmInitData
            int r6 = r5.schemeDataCount
            if (r4 >= r6) goto Lb4
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r5 = r5.get(r4)
            java.util.UUID r5 = r5.uuid
            java.util.UUID r6 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L5d
            java.lang.String r5 = "cenc"
            r1.add(r5)
            goto Lb1
        L5d:
            java.util.UUID r6 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L6b
            java.lang.String r5 = "clearkey"
            r1.add(r5)
            goto Lb1
        L6b:
            java.util.UUID r6 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L79
            java.lang.String r5 = "playready"
            r1.add(r5)
            goto Lb1
        L79:
            java.util.UUID r6 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L88
            java.lang.String r5 = "widevine"
            r1.add(r5)
            goto Lb1
        L88:
            java.util.UUID r6 = com.google.android.exoplayer2.C.UUID_NIL
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L97
            java.lang.String r5 = "universal"
            r1.add(r5)
            goto Lb1
        L97:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "unknown ("
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = ")"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.add(r5)
        Lb1:
            int r4 = r4 + 1
            goto L43
        Lb4:
            java.lang.String r4 = ", drm=["
            r0.append(r4)
            com.google.common.base.Joiner r4 = com.google.common.base.Joiner.on(r3)
            r4.appendTo(r0, r1)
            r1 = 93
            r0.append(r1)
        Lc5:
            int r1 = r8.width
            if (r1 == r2) goto Le2
            int r1 = r8.height
            if (r1 == r2) goto Le2
            java.lang.String r1 = ", res="
            r0.append(r1)
            int r1 = r8.width
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r8.height
            r0.append(r1)
        Le2:
            float r1 = r8.frameRate
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto Lf4
            java.lang.String r1 = ", fps="
            r0.append(r1)
            float r1 = r8.frameRate
            r0.append(r1)
        Lf4:
            int r1 = r8.channelCount
            if (r1 == r2) goto L102
            java.lang.String r1 = ", channels="
            r0.append(r1)
            int r1 = r8.channelCount
            r0.append(r1)
        L102:
            int r1 = r8.sampleRate
            if (r1 == r2) goto L110
            java.lang.String r1 = ", sample_rate="
            r0.append(r1)
            int r1 = r8.sampleRate
            r0.append(r1)
        L110:
            java.lang.String r1 = r8.language
            if (r1 == 0) goto L11e
            java.lang.String r1 = ", language="
            r0.append(r1)
            java.lang.String r1 = r8.language
            r0.append(r1)
        L11e:
            java.lang.String r1 = r8.label
            if (r1 == 0) goto L12c
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r8.label
            r0.append(r1)
        L12c:
            int r1 = r8.selectionFlags
            java.lang.String r2 = "]"
            if (r1 == 0) goto L167
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r8.selectionFlags
            r4 = r4 & 4
            if (r4 == 0) goto L142
            java.lang.String r4 = "auto"
            r1.add(r4)
        L142:
            int r4 = r8.selectionFlags
            r4 = r4 & 1
            if (r4 == 0) goto L14d
            java.lang.String r4 = "default"
            r1.add(r4)
        L14d:
            int r4 = r8.selectionFlags
            r4 = r4 & 2
            if (r4 == 0) goto L158
            java.lang.String r4 = "forced"
            r1.add(r4)
        L158:
            java.lang.String r4 = ", selectionFlags=["
            r0.append(r4)
            com.google.common.base.Joiner r4 = com.google.common.base.Joiner.on(r3)
            r4.appendTo(r0, r1)
            r0.append(r2)
        L167:
            int r1 = r8.roleFlags
            if (r1 == 0) goto L229
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r8.roleFlags
            r4 = r4 & 1
            if (r4 == 0) goto L17b
            java.lang.String r4 = "main"
            r1.add(r4)
        L17b:
            int r4 = r8.roleFlags
            r4 = r4 & 2
            if (r4 == 0) goto L186
            java.lang.String r4 = "alt"
            r1.add(r4)
        L186:
            int r4 = r8.roleFlags
            r4 = r4 & 4
            if (r4 == 0) goto L192
            java.lang.String r4 = "supplementary"
            r1.add(r4)
        L192:
            int r4 = r8.roleFlags
            r4 = r4 & 8
            if (r4 == 0) goto L19d
            java.lang.String r4 = "commentary"
            r1.add(r4)
        L19d:
            int r4 = r8.roleFlags
            r4 = r4 & 16
            if (r4 == 0) goto L1a8
            java.lang.String r4 = "dub"
            r1.add(r4)
        L1a8:
            int r4 = r8.roleFlags
            r4 = r4 & 32
            if (r4 == 0) goto L1b3
            java.lang.String r4 = "emergency"
            r1.add(r4)
        L1b3:
            int r4 = r8.roleFlags
            r4 = r4 & 64
            if (r4 == 0) goto L1be
            java.lang.String r4 = "caption"
            r1.add(r4)
        L1be:
            int r4 = r8.roleFlags
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L1ca
            java.lang.String r4 = "subtitle"
            r1.add(r4)
        L1ca:
            int r4 = r8.roleFlags
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L1d6
            java.lang.String r4 = "sign"
            r1.add(r4)
        L1d6:
            int r4 = r8.roleFlags
            r4 = r4 & 512(0x200, float:7.17E-43)
            if (r4 == 0) goto L1e1
            java.lang.String r4 = "describes-video"
            r1.add(r4)
        L1e1:
            int r4 = r8.roleFlags
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L1ec
            java.lang.String r4 = "describes-music"
            r1.add(r4)
        L1ec:
            int r4 = r8.roleFlags
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L1f7
            java.lang.String r4 = "enhanced-intelligibility"
            r1.add(r4)
        L1f7:
            int r4 = r8.roleFlags
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L203
            java.lang.String r4 = "transcribes-dialog"
            r1.add(r4)
        L203:
            int r4 = r8.roleFlags
            r4 = r4 & 8192(0x2000, float:1.148E-41)
            if (r4 == 0) goto L20e
            java.lang.String r4 = "easy-read"
            r1.add(r4)
        L20e:
            int r8 = r8.roleFlags
            r8 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L21a
            java.lang.String r8 = "trick-play"
            r1.add(r8)
        L21a:
            java.lang.String r8 = ", roleFlags=["
            r0.append(r8)
            com.google.common.base.Joiner r8 = com.google.common.base.Joiner.on(r3)
            r8.appendTo(r0, r1)
            r0.append(r2)
        L229:
            java.lang.String r8 = r0.toString()
            return r8
    }

    public com.google.android.exoplayer2.Format.Builder buildUpon() {
            r2 = this;
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithBitrate(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setAverageBitrate(r2)
            com.google.android.exoplayer2.Format$Builder r2 = r0.setPeakBitrate(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    public com.google.android.exoplayer2.Format copyWithCryptoType(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setCryptoType(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithDrmInitData(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setDrmInitData(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithFrameRate(float r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setFrameRate(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithGaplessInfo(int r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setEncoderDelay(r2)
            com.google.android.exoplayer2.Format$Builder r2 = r2.setEncoderPadding(r3)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithLabel(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setLabel(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithManifestFormatInfo(com.google.android.exoplayer2.Format r1) {
            r0 = this;
            com.google.android.exoplayer2.Format r1 = r0.withManifestFormatInfo(r1)
            return r1
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithMaxInputSize(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setMaxInputSize(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithMetadata(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setMetadata(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithSubsampleOffsetUs(long r2) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setSubsampleOffsetUs(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithVideoSize(int r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.Format$Builder r0 = r1.buildUpon()
            com.google.android.exoplayer2.Format$Builder r2 = r0.setWidth(r2)
            com.google.android.exoplayer2.Format$Builder r2 = r2.setHeight(r3)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L113
            java.lang.Class<com.google.android.exoplayer2.Format> r2 = com.google.android.exoplayer2.Format.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L11
            goto L113
        L11:
            com.google.android.exoplayer2.Format r8 = (com.google.android.exoplayer2.Format) r8
            int r2 = r7.hashCode
            if (r2 == 0) goto L1e
            int r3 = r8.hashCode
            if (r3 == 0) goto L1e
            if (r2 == r3) goto L1e
            return r1
        L1e:
            int r2 = r7.selectionFlags
            int r3 = r8.selectionFlags
            if (r2 != r3) goto L111
            int r2 = r7.roleFlags
            int r3 = r8.roleFlags
            if (r2 != r3) goto L111
            int r2 = r7.averageBitrate
            int r3 = r8.averageBitrate
            if (r2 != r3) goto L111
            int r2 = r7.peakBitrate
            int r3 = r8.peakBitrate
            if (r2 != r3) goto L111
            int r2 = r7.maxInputSize
            int r3 = r8.maxInputSize
            if (r2 != r3) goto L111
            long r2 = r7.subsampleOffsetUs
            long r4 = r8.subsampleOffsetUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L111
            int r2 = r7.width
            int r3 = r8.width
            if (r2 != r3) goto L111
            int r2 = r7.height
            int r3 = r8.height
            if (r2 != r3) goto L111
            int r2 = r7.rotationDegrees
            int r3 = r8.rotationDegrees
            if (r2 != r3) goto L111
            int r2 = r7.stereoMode
            int r3 = r8.stereoMode
            if (r2 != r3) goto L111
            int r2 = r7.channelCount
            int r3 = r8.channelCount
            if (r2 != r3) goto L111
            int r2 = r7.sampleRate
            int r3 = r8.sampleRate
            if (r2 != r3) goto L111
            int r2 = r7.pcmEncoding
            int r3 = r8.pcmEncoding
            if (r2 != r3) goto L111
            int r2 = r7.encoderDelay
            int r3 = r8.encoderDelay
            if (r2 != r3) goto L111
            int r2 = r7.encoderPadding
            int r3 = r8.encoderPadding
            if (r2 != r3) goto L111
            int r2 = r7.accessibilityChannel
            int r3 = r8.accessibilityChannel
            if (r2 != r3) goto L111
            int r2 = r7.tileCountHorizontal
            int r3 = r8.tileCountHorizontal
            if (r2 != r3) goto L111
            int r2 = r7.tileCountVertical
            int r3 = r8.tileCountVertical
            if (r2 != r3) goto L111
            int r2 = r7.cryptoType
            int r3 = r8.cryptoType
            if (r2 != r3) goto L111
            float r2 = r7.frameRate
            float r3 = r8.frameRate
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 != 0) goto L111
            float r2 = r7.pixelWidthHeightRatio
            float r3 = r8.pixelWidthHeightRatio
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 != 0) goto L111
            java.lang.String r2 = r7.id
            java.lang.String r3 = r8.id
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            java.lang.String r2 = r7.label
            java.lang.String r3 = r8.label
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            java.lang.String r2 = r7.codecs
            java.lang.String r3 = r8.codecs
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            java.lang.String r2 = r7.containerMimeType
            java.lang.String r3 = r8.containerMimeType
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            java.lang.String r2 = r7.sampleMimeType
            java.lang.String r3 = r8.sampleMimeType
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            java.lang.String r2 = r7.language
            java.lang.String r3 = r8.language
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            byte[] r2 = r7.projectionData
            byte[] r3 = r8.projectionData
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L111
            com.google.android.exoplayer2.metadata.Metadata r2 = r7.metadata
            com.google.android.exoplayer2.metadata.Metadata r3 = r8.metadata
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            com.google.android.exoplayer2.video.ColorInfo r2 = r7.colorInfo
            com.google.android.exoplayer2.video.ColorInfo r3 = r8.colorInfo
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            com.google.android.exoplayer2.drm.DrmInitData r2 = r7.drmInitData
            com.google.android.exoplayer2.drm.DrmInitData r3 = r8.drmInitData
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L111
            boolean r8 = r7.initializationDataEquals(r8)
            if (r8 == 0) goto L111
            goto L112
        L111:
            r0 = 0
        L112:
            return r0
        L113:
            return r1
    }

    public int getPixelCount() {
            r3 = this;
            int r0 = r3.width
            r1 = -1
            if (r0 == r1) goto Lc
            int r2 = r3.height
            if (r2 != r1) goto La
            goto Lc
        La:
            int r1 = r0 * r2
        Lc:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.hashCode
            if (r0 != 0) goto Ld3
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r1 = r3.id
            r2 = 0
            if (r1 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            int r1 = r1.hashCode()
        L11:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.label
            if (r1 == 0) goto L1d
            int r1 = r1.hashCode()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.language
            if (r1 != 0) goto L27
            r1 = 0
            goto L2b
        L27:
            int r1 = r1.hashCode()
        L2b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.selectionFlags
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.roleFlags
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.averageBitrate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.peakBitrate
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.codecs
            if (r1 != 0) goto L48
            r1 = 0
            goto L4c
        L48:
            int r1 = r1.hashCode()
        L4c:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.exoplayer2.metadata.Metadata r1 = r3.metadata
            if (r1 != 0) goto L55
            r1 = 0
            goto L59
        L55:
            int r1 = r1.hashCode()
        L59:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.containerMimeType
            if (r1 != 0) goto L62
            r1 = 0
            goto L66
        L62:
            int r1 = r1.hashCode()
        L66:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.sampleMimeType
            if (r1 != 0) goto L6e
            goto L72
        L6e:
            int r2 = r1.hashCode()
        L72:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.maxInputSize
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.subsampleOffsetUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.width
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.height
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r3.frameRate
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.rotationDegrees
            int r1 = r1 + r0
            int r1 = r1 * 31
            float r0 = r3.pixelWidthHeightRatio
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.stereoMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.channelCount
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.sampleRate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.pcmEncoding
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.encoderDelay
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.encoderPadding
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.accessibilityChannel
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.tileCountHorizontal
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.tileCountVertical
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.cryptoType
            int r0 = r0 + r1
            r3.hashCode = r0
        Ld3:
            int r0 = r3.hashCode
            return r0
    }

    public boolean initializationDataEquals(com.google.android.exoplayer2.Format r5) {
            r4 = this;
            java.util.List<byte[]> r0 = r4.initializationData
            int r0 = r0.size()
            java.util.List<byte[]> r1 = r5.initializationData
            int r1 = r1.size()
            r2 = 0
            if (r0 == r1) goto L10
            return r2
        L10:
            r0 = 0
        L11:
            java.util.List<byte[]> r1 = r4.initializationData
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            java.util.List<byte[]> r1 = r4.initializationData
            java.lang.Object r1 = r1.get(r0)
            byte[] r1 = (byte[]) r1
            java.util.List<byte[]> r3 = r5.initializationData
            java.lang.Object r3 = r3.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            int r0 = r0 + 1
            goto L11
        L33:
            r5 = 1
            return r5
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r1 = this;
            r0 = 0
            android.os.Bundle r0 = r1.toBundle(r0)
            return r0
    }

    public android.os.Bundle toBundle(boolean r4) {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_ID
            java.lang.String r2 = r3.id
            r0.putString(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_LABEL
            java.lang.String r2 = r3.label
            r0.putString(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_LANGUAGE
            java.lang.String r2 = r3.language
            r0.putString(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_SELECTION_FLAGS
            int r2 = r3.selectionFlags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_ROLE_FLAGS
            int r2 = r3.roleFlags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_AVERAGE_BITRATE
            int r2 = r3.averageBitrate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_PEAK_BITRATE
            int r2 = r3.peakBitrate
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_CODECS
            java.lang.String r2 = r3.codecs
            r0.putString(r1, r2)
            if (r4 != 0) goto L46
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_METADATA
            com.google.android.exoplayer2.metadata.Metadata r1 = r3.metadata
            r0.putParcelable(r4, r1)
        L46:
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_CONTAINER_MIME_TYPE
            java.lang.String r1 = r3.containerMimeType
            r0.putString(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_SAMPLE_MIME_TYPE
            java.lang.String r1 = r3.sampleMimeType
            r0.putString(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_MAX_INPUT_SIZE
            int r1 = r3.maxInputSize
            r0.putInt(r4, r1)
            r4 = 0
        L5c:
            java.util.List<byte[]> r1 = r3.initializationData
            int r1 = r1.size()
            if (r4 >= r1) goto L76
            java.lang.String r1 = keyForInitializationData(r4)
            java.util.List<byte[]> r2 = r3.initializationData
            java.lang.Object r2 = r2.get(r4)
            byte[] r2 = (byte[]) r2
            r0.putByteArray(r1, r2)
            int r4 = r4 + 1
            goto L5c
        L76:
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_DRM_INIT_DATA
            com.google.android.exoplayer2.drm.DrmInitData r1 = r3.drmInitData
            r0.putParcelable(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_SUBSAMPLE_OFFSET_US
            long r1 = r3.subsampleOffsetUs
            r0.putLong(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_WIDTH
            int r1 = r3.width
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_HEIGHT
            int r1 = r3.height
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_FRAME_RATE
            float r1 = r3.frameRate
            r0.putFloat(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_ROTATION_DEGREES
            int r1 = r3.rotationDegrees
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_PIXEL_WIDTH_HEIGHT_RATIO
            float r1 = r3.pixelWidthHeightRatio
            r0.putFloat(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_PROJECTION_DATA
            byte[] r1 = r3.projectionData
            r0.putByteArray(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_STEREO_MODE
            int r1 = r3.stereoMode
            r0.putInt(r4, r1)
            com.google.android.exoplayer2.video.ColorInfo r4 = r3.colorInfo
            if (r4 == 0) goto Lc2
            java.lang.String r1 = com.google.android.exoplayer2.Format.FIELD_COLOR_INFO
            android.os.Bundle r4 = r4.toBundle()
            r0.putBundle(r1, r4)
        Lc2:
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_CHANNEL_COUNT
            int r1 = r3.channelCount
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_SAMPLE_RATE
            int r1 = r3.sampleRate
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_PCM_ENCODING
            int r1 = r3.pcmEncoding
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_ENCODER_DELAY
            int r1 = r3.encoderDelay
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_ENCODER_PADDING
            int r1 = r3.encoderPadding
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_ACCESSIBILITY_CHANNEL
            int r1 = r3.accessibilityChannel
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_TILE_COUNT_HORIZONTAL
            int r1 = r3.tileCountHorizontal
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_TILE_COUNT_VERTICAL
            int r1 = r3.tileCountVertical
            r0.putInt(r4, r1)
            java.lang.String r4 = com.google.android.exoplayer2.Format.FIELD_CRYPTO_TYPE
            int r1 = r3.cryptoType
            r0.putInt(r4, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Format("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r2 = r3.label
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.containerMimeType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.sampleMimeType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.codecs
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.bitrate
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.language
            r0.append(r2)
            java.lang.String r2 = ", ["
            r0.append(r2)
            int r2 = r3.width
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.height
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.frameRate
            r0.append(r2)
            java.lang.String r2 = "], ["
            r0.append(r2)
            int r2 = r3.channelCount
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.sampleRate
            java.lang.String r2 = "])"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    public com.google.android.exoplayer2.Format withManifestFormatInfo(com.google.android.exoplayer2.Format r12) {
            r11 = this;
            if (r11 != r12) goto L3
            return r11
        L3:
            java.lang.String r0 = r11.sampleMimeType
            int r0 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
            java.lang.String r1 = r12.id
            java.lang.String r2 = r12.label
            if (r2 == 0) goto L10
            goto L12
        L10:
            java.lang.String r2 = r11.label
        L12:
            java.lang.String r3 = r11.language
            r4 = 3
            r5 = 1
            if (r0 == r4) goto L1a
            if (r0 != r5) goto L1f
        L1a:
            java.lang.String r4 = r12.language
            if (r4 == 0) goto L1f
            r3 = r4
        L1f:
            int r4 = r11.averageBitrate
            r6 = -1
            if (r4 != r6) goto L26
            int r4 = r12.averageBitrate
        L26:
            int r7 = r11.peakBitrate
            if (r7 != r6) goto L2c
            int r7 = r12.peakBitrate
        L2c:
            java.lang.String r6 = r11.codecs
            if (r6 != 0) goto L3e
            java.lang.String r8 = r12.codecs
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r8, r0)
            java.lang.String[] r9 = com.google.android.exoplayer2.util.Util.splitCodecs(r8)
            int r9 = r9.length
            if (r9 != r5) goto L3e
            r6 = r8
        L3e:
            com.google.android.exoplayer2.metadata.Metadata r5 = r11.metadata
            if (r5 != 0) goto L45
            com.google.android.exoplayer2.metadata.Metadata r5 = r12.metadata
            goto L4b
        L45:
            com.google.android.exoplayer2.metadata.Metadata r8 = r12.metadata
            com.google.android.exoplayer2.metadata.Metadata r5 = r5.copyWithAppendedEntriesFrom(r8)
        L4b:
            float r8 = r11.frameRate
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L58
            r9 = 2
            if (r0 != r9) goto L58
            float r8 = r12.frameRate
        L58:
            int r0 = r11.selectionFlags
            int r9 = r12.selectionFlags
            r0 = r0 | r9
            int r9 = r11.roleFlags
            int r10 = r12.roleFlags
            r9 = r9 | r10
            com.google.android.exoplayer2.drm.DrmInitData r12 = r12.drmInitData
            com.google.android.exoplayer2.drm.DrmInitData r10 = r11.drmInitData
            com.google.android.exoplayer2.drm.DrmInitData r12 = com.google.android.exoplayer2.drm.DrmInitData.createSessionCreationData(r12, r10)
            com.google.android.exoplayer2.Format$Builder r10 = r11.buildUpon()
            com.google.android.exoplayer2.Format$Builder r1 = r10.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLabel(r2)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r3)
            com.google.android.exoplayer2.Format$Builder r0 = r1.setSelectionFlags(r0)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setRoleFlags(r9)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setAverageBitrate(r4)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPeakBitrate(r7)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setCodecs(r6)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setMetadata(r5)
            com.google.android.exoplayer2.Format$Builder r12 = r0.setDrmInitData(r12)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setFrameRate(r8)
            com.google.android.exoplayer2.Format r12 = r12.build()
            return r12
    }
}
