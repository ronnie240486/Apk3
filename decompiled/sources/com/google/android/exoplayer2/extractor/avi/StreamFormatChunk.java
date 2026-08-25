package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class StreamFormatChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    private static final java.lang.String TAG = "StreamFormatChunk";
    public final com.google.android.exoplayer2.Format format;

    public StreamFormatChunk(com.google.android.exoplayer2.Format r1) {
            r0 = this;
            r0.<init>()
            r0.format = r1
            return
    }

    @androidx.annotation.Nullable
    private static java.lang.String getMimeTypeFromCompression(int r0) {
            switch(r0) {
                case 808802372: goto L15;
                case 826496577: goto L11;
                case 828601953: goto L11;
                case 842289229: goto Ld;
                case 859066445: goto L9;
                case 875967048: goto L11;
                case 877677894: goto L15;
                case 1145656883: goto L15;
                case 1145656920: goto L15;
                case 1196444237: goto L5;
                case 1482049860: goto L15;
                case 1684633208: goto L15;
                case 1735420525: goto L5;
                case 2021026148: goto L15;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            java.lang.String r0 = "video/mjpeg"
            return r0
        L9:
            java.lang.String r0 = "video/mp43"
            return r0
        Ld:
            java.lang.String r0 = "video/mp42"
            return r0
        L11:
            java.lang.String r0 = "video/avc"
            return r0
        L15:
            java.lang.String r0 = "video/mp4v-es"
            return r0
    }

    @androidx.annotation.Nullable
    private static java.lang.String getMimeTypeFromTag(int r1) {
            r0 = 1
            if (r1 == r0) goto L21
            r0 = 85
            if (r1 == r0) goto L1e
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1b
            r0 = 8192(0x2000, float:1.148E-41)
            if (r1 == r0) goto L18
            r0 = 8193(0x2001, float:1.1481E-41)
            if (r1 == r0) goto L15
            r1 = 0
            return r1
        L15:
            java.lang.String r1 = "audio/vnd.dts"
            return r1
        L18:
            java.lang.String r1 = "audio/ac3"
            return r1
        L1b:
            java.lang.String r1 = "audio/mp4a-latm"
            return r1
        L1e:
            java.lang.String r1 = "audio/mpeg"
            return r1
        L21:
            java.lang.String r1 = "audio/raw"
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.avi.AviChunk parseBitmapInfoHeader(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r0 = 4
            r3.skipBytes(r0)
            int r1 = r3.readLittleEndianInt()
            int r2 = r3.readLittleEndianInt()
            r3.skipBytes(r0)
            int r3 = r3.readLittleEndianInt()
            java.lang.String r0 = getMimeTypeFromCompression(r3)
            if (r0 != 0) goto L22
            java.lang.String r0 = "Ignoring track with unsupported compression "
            java.lang.String r1 = "StreamFormatChunk"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r3, r1)
            r3 = 0
            return r3
        L22:
            com.google.android.exoplayer2.Format$Builder r3 = new com.google.android.exoplayer2.Format$Builder
            r3.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r3.setWidth(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r2)
            r1.setSampleMimeType(r0)
            com.google.android.exoplayer2.extractor.avi.StreamFormatChunk r0 = new com.google.android.exoplayer2.extractor.avi.StreamFormatChunk
            com.google.android.exoplayer2.Format r3 = r3.build()
            r0.<init>(r3)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.extractor.avi.AviChunk parseFrom(int r1, com.google.android.exoplayer2.util.ParsableByteArray r2) {
            r0 = 2
            if (r1 != r0) goto L8
            com.google.android.exoplayer2.extractor.avi.AviChunk r1 = parseBitmapInfoHeader(r2)
            return r1
        L8:
            r0 = 1
            if (r1 != r0) goto L10
            com.google.android.exoplayer2.extractor.avi.AviChunk r1 = parseWaveFormatEx(r2)
            return r1
        L10:
            java.lang.String r2 = "Ignoring strf box for unsupported track type: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.getTrackTypeString(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StreamFormatChunk"
            com.google.android.exoplayer2.util.Log.w(r2, r1)
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.avi.AviChunk parseWaveFormatEx(com.google.android.exoplayer2.util.ParsableByteArray r7) {
            int r0 = r7.readLittleEndianUnsignedShort()
            java.lang.String r1 = getMimeTypeFromTag(r0)
            if (r1 != 0) goto L13
            java.lang.String r7 = "Ignoring track with unsupported format tag "
            java.lang.String r1 = "StreamFormatChunk"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r7, r0, r1)
            r7 = 0
            return r7
        L13:
            int r0 = r7.readLittleEndianUnsignedShort()
            int r2 = r7.readLittleEndianInt()
            r3 = 6
            r7.skipBytes(r3)
            int r3 = r7.readUnsignedShort()
            int r3 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r3)
            int r4 = r7.readLittleEndianUnsignedShort()
            byte[] r5 = new byte[r4]
            r6 = 0
            r7.readBytes(r5, r6, r4)
            com.google.android.exoplayer2.Format$Builder r7 = new com.google.android.exoplayer2.Format$Builder
            r7.<init>()
            com.google.android.exoplayer2.Format$Builder r6 = r7.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r6.setChannelCount(r0)
            r0.setSampleRate(r2)
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            if (r3 == 0) goto L4e
            r7.setPcmEncoding(r3)
        L4e:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            if (r4 <= 0) goto L5f
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r5)
            r7.setInitializationData(r0)
        L5f:
            com.google.android.exoplayer2.extractor.avi.StreamFormatChunk r0 = new com.google.android.exoplayer2.extractor.avi.StreamFormatChunk
            com.google.android.exoplayer2.Format r7 = r7.build()
            r0.<init>(r7)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
            r1 = this;
            r0 = 1718776947(0x66727473, float:2.862402E23)
            return r0
    }
}
