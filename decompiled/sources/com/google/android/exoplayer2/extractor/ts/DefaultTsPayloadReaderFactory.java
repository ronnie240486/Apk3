package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTsPayloadReaderFactory implements com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final java.util.List<com.google.android.exoplayer2.Format> closedCaptionFormats;
    private final int flags;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public DefaultTsPayloadReaderFactory(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r1.<init>(r2, r0)
            return
    }

    public DefaultTsPayloadReaderFactory(int r1, java.util.List<com.google.android.exoplayer2.Format> r2) {
            r0 = this;
            r0.<init>()
            r0.flags = r1
            r0.closedCaptionFormats = r2
            return
    }

    private com.google.android.exoplayer2.extractor.ts.SeiReader buildSeiReader(com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo r2) {
            r1 = this;
            com.google.android.exoplayer2.extractor.ts.SeiReader r0 = new com.google.android.exoplayer2.extractor.ts.SeiReader
            java.util.List r2 = r1.getClosedCaptionFormats(r2)
            r0.<init>(r2)
            return r0
    }

    private com.google.android.exoplayer2.extractor.ts.UserDataReader buildUserDataReader(com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo r2) {
            r1 = this;
            com.google.android.exoplayer2.extractor.ts.UserDataReader r0 = new com.google.android.exoplayer2.extractor.ts.UserDataReader
            java.util.List r2 = r1.getClosedCaptionFormats(r2)
            r0.<init>(r2)
            return r0
    }

    private java.util.List<com.google.android.exoplayer2.Format> getClosedCaptionFormats(com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo r13) {
            r12 = this;
            r0 = 32
            boolean r0 = r12.isSet(r0)
            if (r0 == 0) goto Lb
            java.util.List<com.google.android.exoplayer2.Format> r13 = r12.closedCaptionFormats
            return r13
        Lb:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r13 = r13.descriptorBytes
            r0.<init>(r13)
            java.util.List<com.google.android.exoplayer2.Format> r13 = r12.closedCaptionFormats
        L14:
            int r1 = r0.bytesLeft()
            if (r1 <= 0) goto L8d
            int r1 = r0.readUnsignedByte()
            int r2 = r0.readUnsignedByte()
            int r3 = r0.getPosition()
            int r3 = r3 + r2
            r2 = 134(0x86, float:1.88E-43)
            if (r1 != r2) goto L89
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r1 = r0.readUnsignedByte()
            r1 = r1 & 31
            r2 = 0
            r4 = 0
        L38:
            if (r4 >= r1) goto L89
            r5 = 3
            java.lang.String r5 = r0.readString(r5)
            int r6 = r0.readUnsignedByte()
            r7 = r6 & 128(0x80, float:1.8E-43)
            r8 = 1
            if (r7 == 0) goto L4a
            r7 = 1
            goto L4b
        L4a:
            r7 = 0
        L4b:
            if (r7 == 0) goto L52
            r6 = r6 & 63
            java.lang.String r9 = "application/cea-708"
            goto L55
        L52:
            java.lang.String r9 = "application/cea-608"
            r6 = 1
        L55:
            int r10 = r0.readUnsignedByte()
            byte r10 = (byte) r10
            r0.skipBytes(r8)
            r11 = 0
            if (r7 == 0) goto L6a
            r7 = r10 & 64
            if (r7 == 0) goto L65
            goto L66
        L65:
            r8 = 0
        L66:
            java.util.List r11 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildCea708InitializationData(r8)
        L6a:
            com.google.android.exoplayer2.Format$Builder r7 = new com.google.android.exoplayer2.Format$Builder
            r7.<init>()
            com.google.android.exoplayer2.Format$Builder r7 = r7.setSampleMimeType(r9)
            com.google.android.exoplayer2.Format$Builder r5 = r7.setLanguage(r5)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setAccessibilityChannel(r6)
            com.google.android.exoplayer2.Format$Builder r5 = r5.setInitializationData(r11)
            com.google.android.exoplayer2.Format r5 = r5.build()
            r13.add(r5)
            int r4 = r4 + 1
            goto L38
        L89:
            r0.setPosition(r3)
            goto L14
        L8d:
            return r13
    }

    private boolean isSet(int r2) {
            r1 = this;
            int r0 = r1.flags
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> createInitialPayloadReaders() {
            r1 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.ts.TsPayloadReader createPayloadReader(int r5, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo r6) {
            r4 = this;
            r0 = 2
            if (r5 == r0) goto L115
            r1 = 3
            if (r5 == r1) goto L108
            r1 = 4
            if (r5 == r1) goto L108
            r2 = 21
            if (r5 == r2) goto Lfd
            r2 = 27
            r3 = 0
            if (r5 == r2) goto Ldc
            r1 = 36
            if (r5 == r1) goto Lcd
            r1 = 89
            if (r5 == r1) goto Lc0
            r1 = 138(0x8a, float:1.93E-43)
            if (r5 == r1) goto Lb3
            r1 = 172(0xac, float:2.41E-43)
            if (r5 == r1) goto La6
            r1 = 257(0x101, float:3.6E-43)
            if (r5 == r1) goto L99
            r1 = 134(0x86, float:1.88E-43)
            if (r5 == r1) goto L83
            r1 = 135(0x87, float:1.89E-43)
            if (r5 == r1) goto L76
            switch(r5) {
                case 15: goto L61;
                case 16: goto L52;
                case 17: goto L3e;
                default: goto L31;
            }
        L31:
            switch(r5) {
                case 128: goto L115;
                case 129: goto L76;
                case 130: goto L35;
                default: goto L34;
            }
        L34:
            return r3
        L35:
            r5 = 64
            boolean r5 = r4.isSet(r5)
            if (r5 != 0) goto Lb3
            return r3
        L3e:
            boolean r5 = r4.isSet(r0)
            if (r5 == 0) goto L45
            goto L51
        L45:
            com.google.android.exoplayer2.extractor.ts.PesReader r3 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.LatmReader r5 = new com.google.android.exoplayer2.extractor.ts.LatmReader
            java.lang.String r6 = r6.language
            r5.<init>(r6)
            r3.<init>(r5)
        L51:
            return r3
        L52:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.H263Reader r0 = new com.google.android.exoplayer2.extractor.ts.H263Reader
            com.google.android.exoplayer2.extractor.ts.UserDataReader r6 = r4.buildUserDataReader(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L61:
            boolean r5 = r4.isSet(r0)
            if (r5 == 0) goto L68
            goto L75
        L68:
            com.google.android.exoplayer2.extractor.ts.PesReader r3 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.AdtsReader r5 = new com.google.android.exoplayer2.extractor.ts.AdtsReader
            r0 = 0
            java.lang.String r6 = r6.language
            r5.<init>(r0, r6)
            r3.<init>(r5)
        L75:
            return r3
        L76:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.Ac3Reader r0 = new com.google.android.exoplayer2.extractor.ts.Ac3Reader
            java.lang.String r6 = r6.language
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L83:
            r5 = 16
            boolean r5 = r4.isSet(r5)
            if (r5 == 0) goto L8c
            goto L98
        L8c:
            com.google.android.exoplayer2.extractor.ts.SectionReader r3 = new com.google.android.exoplayer2.extractor.ts.SectionReader
            com.google.android.exoplayer2.extractor.ts.PassthroughSectionPayloadReader r5 = new com.google.android.exoplayer2.extractor.ts.PassthroughSectionPayloadReader
            java.lang.String r6 = "application/x-scte35"
            r5.<init>(r6)
            r3.<init>(r5)
        L98:
            return r3
        L99:
            com.google.android.exoplayer2.extractor.ts.SectionReader r5 = new com.google.android.exoplayer2.extractor.ts.SectionReader
            com.google.android.exoplayer2.extractor.ts.PassthroughSectionPayloadReader r6 = new com.google.android.exoplayer2.extractor.ts.PassthroughSectionPayloadReader
            java.lang.String r0 = "application/vnd.dvb.ait"
            r6.<init>(r0)
            r5.<init>(r6)
            return r5
        La6:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.Ac4Reader r0 = new com.google.android.exoplayer2.extractor.ts.Ac4Reader
            java.lang.String r6 = r6.language
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Lb3:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.DtsReader r0 = new com.google.android.exoplayer2.extractor.ts.DtsReader
            java.lang.String r6 = r6.language
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Lc0:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.DvbSubtitleReader r0 = new com.google.android.exoplayer2.extractor.ts.DvbSubtitleReader
            java.util.List<com.google.android.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo> r6 = r6.dvbSubtitleInfos
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Lcd:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.H265Reader r0 = new com.google.android.exoplayer2.extractor.ts.H265Reader
            com.google.android.exoplayer2.extractor.ts.SeiReader r6 = r4.buildSeiReader(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        Ldc:
            boolean r5 = r4.isSet(r1)
            if (r5 == 0) goto Le3
            goto Lfc
        Le3:
            com.google.android.exoplayer2.extractor.ts.PesReader r3 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.H264Reader r5 = new com.google.android.exoplayer2.extractor.ts.H264Reader
            com.google.android.exoplayer2.extractor.ts.SeiReader r6 = r4.buildSeiReader(r6)
            r0 = 1
            boolean r0 = r4.isSet(r0)
            r1 = 8
            boolean r1 = r4.isSet(r1)
            r5.<init>(r6, r0, r1)
            r3.<init>(r5)
        Lfc:
            return r3
        Lfd:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.Id3Reader r6 = new com.google.android.exoplayer2.extractor.ts.Id3Reader
            r6.<init>()
            r5.<init>(r6)
            return r5
        L108:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.MpegAudioReader r0 = new com.google.android.exoplayer2.extractor.ts.MpegAudioReader
            java.lang.String r6 = r6.language
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L115:
            com.google.android.exoplayer2.extractor.ts.PesReader r5 = new com.google.android.exoplayer2.extractor.ts.PesReader
            com.google.android.exoplayer2.extractor.ts.H262Reader r0 = new com.google.android.exoplayer2.extractor.ts.H262Reader
            com.google.android.exoplayer2.extractor.ts.UserDataReader r6 = r4.buildUserDataReader(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
    }
}
