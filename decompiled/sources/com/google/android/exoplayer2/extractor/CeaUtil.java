package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final java.lang.String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private CeaUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void consume(long r10, com.google.android.exoplayer2.util.ParsableByteArray r12, com.google.android.exoplayer2.extractor.TrackOutput[] r13) {
        L0:
            int r0 = r12.bytesLeft()
            r1 = 1
            if (r0 <= r1) goto L70
            int r0 = readNon255TerminatedValue(r12)
            int r2 = readNon255TerminatedValue(r12)
            int r3 = r12.getPosition()
            int r3 = r3 + r2
            r4 = -1
            if (r2 == r4) goto L61
            int r4 = r12.bytesLeft()
            if (r2 <= r4) goto L1e
            goto L61
        L1e:
            r4 = 4
            if (r0 != r4) goto L6c
            r0 = 8
            if (r2 < r0) goto L6c
            int r0 = r12.readUnsignedByte()
            int r2 = r12.readUnsignedShort()
            r4 = 49
            r5 = 0
            if (r2 != r4) goto L37
            int r6 = r12.readInt()
            goto L38
        L37:
            r6 = 0
        L38:
            int r7 = r12.readUnsignedByte()
            r8 = 47
            if (r2 != r8) goto L43
            r12.skipBytes(r1)
        L43:
            r9 = 181(0xb5, float:2.54E-43)
            if (r0 != r9) goto L50
            if (r2 == r4) goto L4b
            if (r2 != r8) goto L50
        L4b:
            r0 = 3
            if (r7 != r0) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r2 != r4) goto L5b
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r6 != r2) goto L59
            goto L5a
        L59:
            r1 = 0
        L5a:
            r0 = r0 & r1
        L5b:
            if (r0 == 0) goto L6c
            consumeCcData(r10, r12, r13)
            goto L6c
        L61:
            java.lang.String r0 = "CeaUtil"
            java.lang.String r1 = "Skipping remainder of malformed SEI NAL unit."
            com.google.android.exoplayer2.util.Log.w(r0, r1)
            int r3 = r12.limit()
        L6c:
            r12.setPosition(r3)
            goto L0
        L70:
            return
    }

    public static void consumeCcData(long r11, com.google.android.exoplayer2.util.ParsableByteArray r13, com.google.android.exoplayer2.extractor.TrackOutput[] r14) {
            int r0 = r13.readUnsignedByte()
            r1 = r0 & 64
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 != 0) goto L10
            return
        L10:
            r0 = r0 & 31
            r13.skipBytes(r3)
            int r0 = r0 * 3
            int r1 = r13.getPosition()
            int r3 = r14.length
        L1c:
            if (r2 >= r3) goto L3a
            r4 = r14[r2]
            r13.setPosition(r1)
            r4.sampleData(r13, r0)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 == 0) goto L37
            r7 = 1
            r9 = 0
            r10 = 0
            r5 = r11
            r8 = r0
            r4.sampleMetadata(r5, r7, r8, r9, r10)
        L37:
            int r2 = r2 + 1
            goto L1c
        L3a:
            return
    }

    private static int readNon255TerminatedValue(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            r0 = 0
        L1:
            int r1 = r3.bytesLeft()
            if (r1 != 0) goto L9
            r3 = -1
            return r3
        L9:
            int r1 = r3.readUnsignedByte()
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L1
            return r0
    }
}
