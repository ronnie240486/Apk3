package com.google.android.exoplayer2.metadata.dvbsi;

/* JADX INFO: loaded from: classes2.dex */
public final class AppInfoTableDecoder extends com.google.android.exoplayer2.metadata.SimpleMetadataDecoder {
    public static final int APPLICATION_INFORMATION_TABLE_ID = 116;
    private static final int DESCRIPTOR_SIMPLE_APPLICATION_LOCATION = 21;
    private static final int DESCRIPTOR_TRANSPORT_PROTOCOL = 2;
    private static final int TRANSPORT_PROTOCOL_HTTP = 3;

    public AppInfoTableDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.Metadata parseAit(com.google.android.exoplayer2.util.ParsableBitArray r14) {
            r0 = 12
            r14.skipBits(r0)
            int r1 = r14.readBits(r0)
            int r2 = r14.getBytePosition()
            int r2 = r2 + r1
            r1 = 4
            int r2 = r2 - r1
            r3 = 44
            r14.skipBits(r3)
            int r3 = r14.readBits(r0)
            r14.skipBytes(r3)
            r3 = 16
            r14.skipBits(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L26:
            int r5 = r14.getBytePosition()
            r6 = 0
            if (r5 >= r2) goto Lad
            r5 = 48
            r14.skipBits(r5)
            r5 = 8
            int r7 = r14.readBits(r5)
            r14.skipBits(r1)
            int r8 = r14.readBits(r0)
            int r9 = r14.getBytePosition()
            int r9 = r9 + r8
            r8 = r6
        L45:
            int r10 = r14.getBytePosition()
            if (r10 >= r9) goto L96
            int r10 = r14.readBits(r5)
            int r11 = r14.readBits(r5)
            int r12 = r14.getBytePosition()
            int r12 = r12 + r11
            r13 = 2
            if (r10 != r13) goto L86
            int r10 = r14.readBits(r3)
            r14.skipBits(r5)
            r11 = 3
            if (r10 != r11) goto L90
        L65:
            int r10 = r14.getBytePosition()
            if (r10 >= r12) goto L90
            int r6 = r14.readBits(r5)
            java.nio.charset.Charset r10 = com.google.common.base.Charsets.US_ASCII
            java.lang.String r6 = r14.readBytesAsString(r6, r10)
            int r10 = r14.readBits(r5)
            r11 = 0
        L7a:
            if (r11 >= r10) goto L65
            int r13 = r14.readBits(r5)
            r14.skipBytes(r13)
            int r11 = r11 + 1
            goto L7a
        L86:
            r13 = 21
            if (r10 != r13) goto L90
            java.nio.charset.Charset r8 = com.google.common.base.Charsets.US_ASCII
            java.lang.String r8 = r14.readBytesAsString(r11, r8)
        L90:
            int r12 = r12 * 8
            r14.setPosition(r12)
            goto L45
        L96:
            int r9 = r9 * 8
            r14.setPosition(r9)
            if (r6 == 0) goto L26
            if (r8 == 0) goto L26
            com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable r5 = new com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r8)
            r5.<init>(r7, r6)
            r4.add(r5)
            goto L26
        Lad:
            boolean r14 = r4.isEmpty()
            if (r14 == 0) goto Lb4
            goto Lb9
        Lb4:
            com.google.android.exoplayer2.metadata.Metadata r6 = new com.google.android.exoplayer2.metadata.Metadata
            r6.<init>(r4)
        Lb9:
            return r6
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer r2, java.nio.ByteBuffer r3) {
            r1 = this;
            byte r2 = r3.get()
            r0 = 116(0x74, float:1.63E-43)
            if (r2 != r0) goto L1a
            com.google.android.exoplayer2.util.ParsableBitArray r2 = new com.google.android.exoplayer2.util.ParsableBitArray
            byte[] r0 = r3.array()
            int r3 = r3.limit()
            r2.<init>(r0, r3)
            com.google.android.exoplayer2.metadata.Metadata r2 = parseAit(r2)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }
}
