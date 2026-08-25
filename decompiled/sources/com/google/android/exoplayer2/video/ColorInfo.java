package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes3.dex */
public final class ColorInfo implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.video.ColorInfo> CREATOR = null;
    private static final java.lang.String FIELD_COLOR_RANGE = null;
    private static final java.lang.String FIELD_COLOR_SPACE = null;
    private static final java.lang.String FIELD_COLOR_TRANSFER = null;
    private static final java.lang.String FIELD_HDR_STATIC_INFO = null;
    public static final com.google.android.exoplayer2.video.ColorInfo SDR_BT709_LIMITED = null;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;

    @androidx.annotation.Nullable
    public final byte[] hdrStaticInfo;

    public static /* synthetic */ com.google.android.exoplayer2.video.ColorInfo $r8$lambda$SRsLTOVVRwVPpRNRARPGRQrMdQM(android.os.Bundle r0) {
            com.google.android.exoplayer2.video.ColorInfo r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.video.ColorInfo r0 = new com.google.android.exoplayer2.video.ColorInfo
            r1 = 1
            r2 = 2
            r3 = 3
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            com.google.android.exoplayer2.video.ColorInfo.SDR_BT709_LIMITED = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_SPACE = r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r1)
            com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_RANGE = r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r2)
            com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_TRANSFER = r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r3)
            com.google.android.exoplayer2.video.ColorInfo.FIELD_HDR_STATIC_INFO = r0
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$25
            com.google.android.exoplayer2.video.ColorInfo.CREATOR = r0
            return
    }

    public ColorInfo(int r1, int r2, int r3, @androidx.annotation.Nullable byte[] r4) {
            r0 = this;
            r0.<init>()
            r0.colorSpace = r1
            r0.colorRange = r2
            r0.colorTransfer = r3
            r0.hdrStaticInfo = r4
            return
    }

    public static boolean isTransferHdr(@androidx.annotation.Nullable com.google.android.exoplayer2.video.ColorInfo r1) {
            if (r1 == 0) goto Lc
            int r1 = r1.colorTransfer
            r0 = -1
            if (r1 == r0) goto Lc
            r0 = 3
            if (r1 == r0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoColorPrimariesToColorSpace(int r2) {
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 9
            r1 = 6
            if (r2 == r0) goto L17
            r0 = 4
            if (r2 == r0) goto L15
            r0 = 5
            if (r2 == r0) goto L15
            if (r2 == r1) goto L15
            r0 = 7
            if (r2 == r0) goto L15
            r2 = -1
            return r2
        L15:
            r2 = 2
            return r2
        L17:
            return r1
        L18:
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoTransferCharacteristicsToColorTransfer(int r3) {
            r0 = 1
            if (r3 == r0) goto L15
            r0 = 16
            r1 = 6
            if (r3 == r0) goto L14
            r0 = 18
            r2 = 7
            if (r3 == r0) goto L13
            if (r3 == r1) goto L15
            if (r3 == r2) goto L15
            r3 = -1
            return r3
        L13:
            return r2
        L14:
            return r1
        L15:
            r3 = 3
            return r3
    }

    private static /* synthetic */ com.google.android.exoplayer2.video.ColorInfo lambda$static$0(android.os.Bundle r5) {
            com.google.android.exoplayer2.video.ColorInfo r0 = new com.google.android.exoplayer2.video.ColorInfo
            java.lang.String r1 = com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_SPACE
            r2 = -1
            int r1 = r5.getInt(r1, r2)
            java.lang.String r3 = com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_RANGE
            int r3 = r5.getInt(r3, r2)
            java.lang.String r4 = com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_TRANSFER
            int r2 = r5.getInt(r4, r2)
            java.lang.String r4 = com.google.android.exoplayer2.video.ColorInfo.FIELD_HDR_STATIC_INFO
            byte[] r5 = r5.getByteArray(r4)
            r0.<init>(r1, r3, r2, r5)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class<com.google.android.exoplayer2.video.ColorInfo> r2 = com.google.android.exoplayer2.video.ColorInfo.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L31
        L10:
            com.google.android.exoplayer2.video.ColorInfo r5 = (com.google.android.exoplayer2.video.ColorInfo) r5
            int r2 = r4.colorSpace
            int r3 = r5.colorSpace
            if (r2 != r3) goto L2f
            int r2 = r4.colorRange
            int r3 = r5.colorRange
            if (r2 != r3) goto L2f
            int r2 = r4.colorTransfer
            int r3 = r5.colorTransfer
            if (r2 != r3) goto L2f
            byte[] r2 = r4.hdrStaticInfo
            byte[] r5 = r5.hdrStaticInfo
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
        L31:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L1e
            r0 = 527(0x20f, float:7.38E-43)
            int r1 = r2.colorSpace
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.colorRange
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.colorTransfer
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r2.hdrStaticInfo
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            r2.hashCode = r1
        L1e:
            int r0 = r2.hashCode
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_SPACE
            int r2 = r3.colorSpace
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_RANGE
            int r2 = r3.colorRange
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.video.ColorInfo.FIELD_COLOR_TRANSFER
            int r2 = r3.colorTransfer
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.video.ColorInfo.FIELD_HDR_STATIC_INFO
            byte[] r2 = r3.hdrStaticInfo
            r0.putByteArray(r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ColorInfo("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.colorSpace
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r2 = r3.colorRange
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.colorTransfer
            r0.append(r2)
            r0.append(r1)
            byte[] r1 = r3.hdrStaticInfo
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
