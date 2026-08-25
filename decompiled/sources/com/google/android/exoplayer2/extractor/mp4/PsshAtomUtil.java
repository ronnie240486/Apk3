package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class PsshAtomUtil {
    private static final java.lang.String TAG = "PsshAtomUtil";

    /* JADX INFO: loaded from: classes2.dex */
    public static class PsshAtom {
        private final byte[] schemeData;
        private final java.util.UUID uuid;
        private final int version;

        public PsshAtom(java.util.UUID r1, int r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.uuid = r1
                r0.version = r2
                r0.schemeData = r3
                return
        }

        public static /* synthetic */ java.util.UUID access$000(com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom r0) {
                java.util.UUID r0 = r0.uuid
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom r0) {
                int r0 = r0.version
                return r0
        }

        public static /* synthetic */ byte[] access$200(com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom r0) {
                byte[] r0 = r0.schemeData
                return r0
        }
    }

    private PsshAtomUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] buildPsshAtom(java.util.UUID r1, @androidx.annotation.Nullable byte[] r2) {
            r0 = 0
            byte[] r1 = buildPsshAtom(r1, r0, r2)
            return r1
    }

    public static byte[] buildPsshAtom(java.util.UUID r5, @androidx.annotation.Nullable java.util.UUID[] r6, @androidx.annotation.Nullable byte[] r7) {
            r0 = 0
            if (r7 == 0) goto L5
            int r1 = r7.length
            goto L6
        L5:
            r1 = 0
        L6:
            int r1 = r1 + 32
            if (r6 == 0) goto L10
            int r2 = r6.length
            int r2 = r2 * 16
            int r2 = r2 + 4
            int r1 = r1 + r2
        L10:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            r2.putInt(r1)
            r1 = 1886614376(0x70737368, float:3.013775E29)
            r2.putInt(r1)
            if (r6 == 0) goto L22
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            goto L23
        L22:
            r1 = 0
        L23:
            r2.putInt(r1)
            long r3 = r5.getMostSignificantBits()
            r2.putLong(r3)
            long r3 = r5.getLeastSignificantBits()
            r2.putLong(r3)
            if (r6 == 0) goto L50
            int r5 = r6.length
            r2.putInt(r5)
            int r5 = r6.length
        L3b:
            if (r0 >= r5) goto L50
            r1 = r6[r0]
            long r3 = r1.getMostSignificantBits()
            r2.putLong(r3)
            long r3 = r1.getLeastSignificantBits()
            r2.putLong(r3)
            int r0 = r0 + 1
            goto L3b
        L50:
            if (r7 == 0) goto L5c
            int r5 = r7.length
            if (r5 == 0) goto L5c
            int r5 = r7.length
            r2.putInt(r5)
            r2.put(r7)
        L5c:
            byte[] r5 = r2.array()
            return r5
    }

    public static boolean isPsshAtom(byte[] r0) {
            com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil$PsshAtom r0 = parsePsshAtom(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom(byte[] r9) {
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0.<init>(r9)
            int r9 = r0.limit()
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto Lf
            return r1
        Lf:
            r9 = 0
            r0.setPosition(r9)
            int r2 = r0.readInt()
            int r3 = r0.bytesLeft()
            int r3 = r3 + 4
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r0.readInt()
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r3) goto L2a
            return r1
        L2a:
            int r2 = r0.readInt()
            int r2 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(r2)
            r3 = 1
            if (r2 <= r3) goto L3d
            java.lang.String r9 = "Unsupported pssh version: "
            java.lang.String r0 = "PsshAtomUtil"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r9, r2, r0)
            return r1
        L3d:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.readLong()
            long r7 = r0.readLong()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L55
            int r3 = r0.readUnsignedIntToInt()
            int r3 = r3 * 16
            r0.skipBytes(r3)
        L55:
            int r3 = r0.readUnsignedIntToInt()
            int r5 = r0.bytesLeft()
            if (r3 == r5) goto L60
            return r1
        L60:
            byte[] r1 = new byte[r3]
            r0.readBytes(r1, r9, r3)
            com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil$PsshAtom r9 = new com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil$PsshAtom
            r9.<init>(r4, r2, r1)
            return r9
    }

    @androidx.annotation.Nullable
    public static byte[] parseSchemeSpecificData(byte[] r3, java.util.UUID r4) {
            com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil$PsshAtom r3 = parsePsshAtom(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.UUID r1 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom.access$000(r3)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UUID mismatch. Expected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", got: "
            r1.append(r4)
            java.util.UUID r3 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom.access$000(r3)
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "PsshAtomUtil"
            com.google.android.exoplayer2.util.Log.w(r4, r3)
            return r0
        L3a:
            byte[] r3 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom.access$200(r3)
            return r3
    }

    @androidx.annotation.Nullable
    public static java.util.UUID parseUuid(byte[] r0) {
            com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil$PsshAtom r0 = parsePsshAtom(r0)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.util.UUID r0 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom.access$000(r0)
            return r0
    }

    public static int parseVersion(byte[] r0) {
            com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil$PsshAtom r0 = parsePsshAtom(r0)
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom.access$100(r0)
            return r0
    }
}
