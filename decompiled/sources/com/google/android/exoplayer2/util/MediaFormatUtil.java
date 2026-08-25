package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaFormatUtil {
    public static final java.lang.String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final java.lang.String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final java.lang.String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private MediaFormatUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    public static android.media.MediaFormat createMediaFormatFromFormat(com.google.android.exoplayer2.Format r4) {
            android.media.MediaFormat r0 = new android.media.MediaFormat
            r0.<init>()
            int r1 = r4.bitrate
            java.lang.String r2 = "bitrate"
            maybeSetInteger(r0, r2, r1)
            int r1 = r4.peakBitrate
            java.lang.String r2 = "max-bitrate"
            maybeSetInteger(r0, r2, r1)
            int r1 = r4.channelCount
            java.lang.String r2 = "channel-count"
            maybeSetInteger(r0, r2, r1)
            com.google.android.exoplayer2.video.ColorInfo r1 = r4.colorInfo
            maybeSetColorInfo(r0, r1)
            java.lang.String r1 = r4.sampleMimeType
            java.lang.String r2 = "mime"
            maybeSetString(r0, r2, r1)
            java.lang.String r1 = r4.codecs
            java.lang.String r2 = "codecs-string"
            maybeSetString(r0, r2, r1)
            float r1 = r4.frameRate
            java.lang.String r2 = "frame-rate"
            maybeSetFloat(r0, r2, r1)
            int r1 = r4.width
            java.lang.String r2 = "width"
            maybeSetInteger(r0, r2, r1)
            int r1 = r4.height
            java.lang.String r2 = "height"
            maybeSetInteger(r0, r2, r1)
            java.util.List<byte[]> r1 = r4.initializationData
            setCsdBuffers(r0, r1)
            int r1 = r4.pcmEncoding
            maybeSetPcmEncoding(r0, r1)
            java.lang.String r1 = r4.language
            java.lang.String r2 = "language"
            maybeSetString(r0, r2, r1)
            int r1 = r4.maxInputSize
            java.lang.String r2 = "max-input-size"
            maybeSetInteger(r0, r2, r1)
            int r1 = r4.sampleRate
            java.lang.String r2 = "sample-rate"
            maybeSetInteger(r0, r2, r1)
            int r1 = r4.accessibilityChannel
            java.lang.String r2 = "caption-service-number"
            maybeSetInteger(r0, r2, r1)
            int r1 = r4.rotationDegrees
            java.lang.String r2 = "rotation-degrees"
            r0.setInteger(r2, r1)
            int r1 = r4.selectionFlags
            r2 = r1 & 4
            java.lang.String r3 = "is-autoselect"
            setBooleanAsInt(r0, r3, r2)
            r2 = r1 & 1
            java.lang.String r3 = "is-default"
            setBooleanAsInt(r0, r3, r2)
            r1 = r1 & 2
            java.lang.String r2 = "is-forced-subtitle"
            setBooleanAsInt(r0, r2, r1)
            int r1 = r4.encoderDelay
            java.lang.String r2 = "encoder-delay"
            r0.setInteger(r2, r1)
            int r1 = r4.encoderPadding
            java.lang.String r2 = "encoder-padding"
            r0.setInteger(r2, r1)
            float r4 = r4.pixelWidthHeightRatio
            maybeSetPixelAspectRatio(r0, r4)
            return r0
    }

    public static byte[] getArray(java.nio.ByteBuffer r1) {
            int r0 = r1.remaining()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.video.ColorInfo getColorInfo(android.media.MediaFormat r6) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 >= r2) goto L8
            return r1
        L8:
            java.lang.String r0 = "color-standard"
            r2 = -1
            int r0 = r6.getInteger(r0, r2)
            java.lang.String r3 = "color-range"
            int r3 = r6.getInteger(r3, r2)
            java.lang.String r4 = "color-transfer"
            int r4 = r6.getInteger(r4, r2)
            java.lang.String r5 = "hdr-static-info"
            java.nio.ByteBuffer r6 = r6.getByteBuffer(r5)
            if (r6 == 0) goto L28
            byte[] r6 = getArray(r6)
            goto L29
        L28:
            r6 = r1
        L29:
            boolean r5 = isValidColorSpace(r0)
            if (r5 != 0) goto L30
            r0 = -1
        L30:
            boolean r5 = isValidColorRange(r3)
            if (r5 != 0) goto L37
            r3 = -1
        L37:
            boolean r5 = isValidColorTransfer(r4)
            if (r5 != 0) goto L3e
            r4 = -1
        L3e:
            if (r0 != r2) goto L48
            if (r3 != r2) goto L48
            if (r4 != r2) goto L48
            if (r6 == 0) goto L47
            goto L48
        L47:
            return r1
        L48:
            com.google.android.exoplayer2.video.ColorInfo r1 = new com.google.android.exoplayer2.video.ColorInfo
            r1.<init>(r0, r3, r4, r6)
            return r1
    }

    private static boolean isValidColorRange(int r2) {
            r0 = 1
            r1 = 2
            if (r2 == r1) goto Lb
            if (r2 == r0) goto Lb
            r1 = -1
            if (r2 != r1) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private static boolean isValidColorSpace(int r2) {
            r0 = 1
            r1 = 2
            if (r2 == r1) goto Le
            if (r2 == r0) goto Le
            r1 = 6
            if (r2 == r1) goto Le
            r1 = -1
            if (r2 != r1) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private static boolean isValidColorTransfer(int r1) {
            r0 = 3
            if (r1 == r0) goto Lf
            r0 = 6
            if (r1 == r0) goto Lf
            r0 = 7
            if (r1 == r0) goto Lf
            r0 = -1
            if (r1 != r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    public static void maybeSetByteBuffer(android.media.MediaFormat r0, java.lang.String r1, @androidx.annotation.Nullable byte[] r2) {
            if (r2 == 0) goto L9
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r0.setByteBuffer(r1, r2)
        L9:
            return
    }

    public static void maybeSetColorInfo(android.media.MediaFormat r2, @androidx.annotation.Nullable com.google.android.exoplayer2.video.ColorInfo r3) {
            if (r3 == 0) goto L1e
            int r0 = r3.colorTransfer
            java.lang.String r1 = "color-transfer"
            maybeSetInteger(r2, r1, r0)
            int r0 = r3.colorSpace
            java.lang.String r1 = "color-standard"
            maybeSetInteger(r2, r1, r0)
            int r0 = r3.colorRange
            java.lang.String r1 = "color-range"
            maybeSetInteger(r2, r1, r0)
            byte[] r3 = r3.hdrStaticInfo
            java.lang.String r0 = "hdr-static-info"
            maybeSetByteBuffer(r2, r0, r3)
        L1e:
            return
    }

    public static void maybeSetFloat(android.media.MediaFormat r1, java.lang.String r2, float r3) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L9
            r1.setFloat(r2, r3)
        L9:
            return
    }

    public static void maybeSetInteger(android.media.MediaFormat r1, java.lang.String r2, int r3) {
            r0 = -1
            if (r3 == r0) goto L6
            r1.setInteger(r2, r3)
        L6:
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private static void maybeSetPcmEncoding(android.media.MediaFormat r4, int r5) {
            r0 = -1
            if (r5 != r0) goto L4
            return
        L4:
            java.lang.String r0 = "exo-pcm-encoding-int"
            maybeSetInteger(r4, r0, r5)
            r0 = 4
            r1 = 3
            r2 = 2
            if (r5 == 0) goto L27
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r5 == r3) goto L24
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 == r3) goto L21
            if (r5 == r2) goto L1f
            if (r5 == r1) goto L1d
            if (r5 == r0) goto L28
            return
        L1d:
            r0 = 3
            goto L28
        L1f:
            r0 = 2
            goto L28
        L21:
            r0 = 22
            goto L28
        L24:
            r0 = 21
            goto L28
        L27:
            r0 = 0
        L28:
            java.lang.String r5 = "pcm-encoding"
            r4.setInteger(r5, r0)
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(android.media.MediaFormat r4, float r5) {
            java.lang.String r0 = "exo-pixel-width-height-ratio-float"
            r4.setFloat(r0, r5)
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L16
            float r1 = (float) r0
            float r5 = r5 * r1
            int r5 = (int) r5
            r0 = r5
            r5 = 1073741824(0x40000000, float:2.0)
            goto L20
        L16:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1e
            float r1 = (float) r0
            float r1 = r1 / r5
            int r5 = (int) r1
            goto L20
        L1e:
            r5 = 1
            r0 = 1
        L20:
            java.lang.String r1 = "sar-width"
            r4.setInteger(r1, r0)
            java.lang.String r0 = "sar-height"
            r4.setInteger(r0, r5)
            return
    }

    public static void maybeSetString(android.media.MediaFormat r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2) {
            if (r2 == 0) goto L5
            r0.setString(r1, r2)
        L5:
            return
    }

    private static void setBooleanAsInt(android.media.MediaFormat r0, java.lang.String r1, int r2) {
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 0
        L5:
            r0.setInteger(r1, r2)
            return
    }

    public static void setCsdBuffers(android.media.MediaFormat r3, java.util.List<byte[]> r4) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L1d
            java.lang.String r1 = "csd-"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            java.lang.Object r2 = r4.get(r0)
            byte[] r2 = (byte[]) r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r3.setByteBuffer(r1, r2)
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }
}
