package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends com.google.common.hash.AbstractNonStreamingHashFunction {
    public static final com.google.common.hash.HashFunction FARMHASH_FINGERPRINT_64 = null;
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    static {
            com.google.common.hash.FarmHashFingerprint64 r0 = new com.google.common.hash.FarmHashFingerprint64
            r0.<init>()
            com.google.common.hash.FarmHashFingerprint64.FARMHASH_FINGERPRINT_64 = r0
            return
    }

    public FarmHashFingerprint64() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long hashLength0to16(byte[] r12, int r13, int r14) {
            r0 = 8
            r1 = -7286425919675154353(0x9ae16a3b2f90404f, double:-3.35749372464804E-179)
            if (r14 < r0) goto L31
            int r3 = r14 * 2
            long r3 = (long) r3
            long r9 = r3 + r1
            long r3 = com.google.common.hash.LittleEndianByteArray.load64(r12, r13)
            long r3 = r3 + r1
            int r13 = r13 + r14
            int r13 = r13 - r0
            long r12 = com.google.common.hash.LittleEndianByteArray.load64(r12, r13)
            r14 = 37
            long r0 = java.lang.Long.rotateRight(r12, r14)
            long r0 = r0 * r9
            long r5 = r0 + r3
            r14 = 25
            long r0 = java.lang.Long.rotateRight(r3, r14)
            long r0 = r0 + r12
            long r7 = r0 * r9
            long r12 = hashLength16(r5, r7, r9)
            return r12
        L31:
            r3 = 4
            if (r14 < r3) goto L56
            int r0 = r14 * 2
            long r4 = (long) r0
            long r10 = r4 + r1
            int r0 = com.google.common.hash.LittleEndianByteArray.load32(r12, r13)
            long r0 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r6 = (long) r14
            r2 = 3
            long r0 = r0 << r2
            long r6 = r6 + r0
            int r13 = r13 + r14
            int r13 = r13 - r3
            int r12 = com.google.common.hash.LittleEndianByteArray.load32(r12, r13)
            long r12 = (long) r12
            long r8 = r12 & r4
            long r12 = hashLength16(r6, r8, r10)
            return r12
        L56:
            if (r14 <= 0) goto L83
            r3 = r12[r13]
            int r4 = r14 >> 1
            int r4 = r4 + r13
            r4 = r12[r4]
            int r5 = r14 + (-1)
            int r5 = r5 + r13
            r12 = r12[r5]
            r13 = r3 & 255(0xff, float:3.57E-43)
            r3 = r4 & 255(0xff, float:3.57E-43)
            int r0 = r3 << 8
            int r13 = r13 + r0
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 2
            int r14 = r14 + r12
            long r12 = (long) r13
            long r12 = r12 * r1
            long r3 = (long) r14
            r5 = -4348849565147123417(0xc3a5c85c97cb3127, double:-7.848031385787155E17)
            long r3 = r3 * r5
            long r12 = r12 ^ r3
            long r12 = shiftMix(r12)
            long r12 = r12 * r1
            return r12
        L83:
            return r1
    }

    private static long hashLength16(long r3, long r5, long r7) {
            long r3 = r3 ^ r5
            long r3 = r3 * r7
            r0 = 47
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            long r3 = r3 ^ r5
            long r3 = r3 * r7
            long r5 = r3 >>> r0
            long r3 = r3 ^ r5
            long r3 = r3 * r7
            return r3
    }

    private static long hashLength17to32(byte[] r17, int r18, int r19) {
            r0 = r17
            int r1 = r19 * 2
            long r1 = (long) r1
            r3 = -7286425919675154353(0x9ae16a3b2f90404f, double:-3.35749372464804E-179)
            long r9 = r1 + r3
            long r1 = com.google.common.hash.LittleEndianByteArray.load64(r17, r18)
            r5 = -5435081209227447693(0xb492b66fbe98f273, double:-1.9079014105469082E-55)
            long r1 = r1 * r5
            int r5 = r18 + 8
            long r5 = com.google.common.hash.LittleEndianByteArray.load64(r0, r5)
            int r7 = r18 + r19
            int r8 = r7 + (-8)
            long r11 = com.google.common.hash.LittleEndianByteArray.load64(r0, r8)
            long r11 = r11 * r9
            int r7 = r7 + (-16)
            long r7 = com.google.common.hash.LittleEndianByteArray.load64(r0, r7)
            long r7 = r7 * r3
            long r13 = r1 + r5
            r0 = 43
            long r13 = java.lang.Long.rotateRight(r13, r0)
            r0 = 30
            long r15 = java.lang.Long.rotateRight(r11, r0)
            long r15 = r15 + r13
            long r7 = r7 + r15
            long r5 = r5 + r3
            r0 = 18
            long r3 = java.lang.Long.rotateRight(r5, r0)
            long r3 = r3 + r1
            long r0 = r3 + r11
            r5 = r7
            r7 = r0
            long r0 = hashLength16(r5, r7, r9)
            return r0
    }

    private static long hashLength33To64(byte[] r20, int r21, int r22) {
            r0 = r20
            int r1 = r22 * 2
            long r1 = (long) r1
            r3 = -7286425919675154353(0x9ae16a3b2f90404f, double:-3.35749372464804E-179)
            long r1 = r1 + r3
            long r5 = com.google.common.hash.LittleEndianByteArray.load64(r20, r21)
            long r11 = r5 * r3
            int r5 = r21 + 8
            long r5 = com.google.common.hash.LittleEndianByteArray.load64(r0, r5)
            int r13 = r21 + r22
            int r7 = r13 + (-8)
            long r7 = com.google.common.hash.LittleEndianByteArray.load64(r0, r7)
            long r7 = r7 * r1
            int r9 = r13 + (-16)
            long r9 = com.google.common.hash.LittleEndianByteArray.load64(r0, r9)
            long r9 = r9 * r3
            long r14 = r11 + r5
            r3 = 43
            long r14 = java.lang.Long.rotateRight(r14, r3)
            r4 = 30
            long r18 = java.lang.Long.rotateRight(r7, r4)
            long r18 = r18 + r14
            long r18 = r18 + r9
            r9 = -7286425919675154353(0x9ae16a3b2f90404f, double:-3.35749372464804E-179)
            long r5 = r5 + r9
            r14 = 18
            long r5 = java.lang.Long.rotateRight(r5, r14)
            long r5 = r5 + r11
            long r7 = r7 + r5
            r5 = r18
            r9 = r1
            long r5 = hashLength16(r5, r7, r9)
            int r7 = r21 + 16
            long r7 = com.google.common.hash.LittleEndianByteArray.load64(r0, r7)
            long r7 = r7 * r1
            int r9 = r21 + 24
            long r9 = com.google.common.hash.LittleEndianByteArray.load64(r0, r9)
            int r15 = r13 + (-32)
            long r15 = com.google.common.hash.LittleEndianByteArray.load64(r0, r15)
            long r18 = r18 + r15
            long r14 = r18 * r1
            int r13 = r13 + (-24)
            long r16 = com.google.common.hash.LittleEndianByteArray.load64(r0, r13)
            long r5 = r5 + r16
            long r5 = r5 * r1
            r16 = r1
            long r0 = r7 + r9
            long r0 = java.lang.Long.rotateRight(r0, r3)
            long r2 = java.lang.Long.rotateRight(r14, r4)
            long r2 = r2 + r0
            long r5 = r5 + r2
            long r9 = r9 + r11
            r0 = 18
            long r0 = java.lang.Long.rotateRight(r9, r0)
            long r0 = r0 + r7
            long r7 = r0 + r14
            r9 = r16
            long r0 = hashLength16(r5, r7, r9)
            return r0
    }

    private static long hashLength65Plus(byte[] r24, int r25, int r26) {
            r7 = r24
            r0 = -7956866745689871395(0x919387da22096bdd, double:-5.27643297140616E-224)
            long r0 = shiftMix(r0)
            r2 = -7286425919675154353(0x9ae16a3b2f90404f, double:-3.35749372464804E-179)
            long r0 = r0 * r2
            r2 = 2
            long[] r8 = new long[r2]
            long[] r9 = new long[r2]
            long r2 = com.google.common.hash.LittleEndianByteArray.load64(r24, r25)
            r4 = 95310865018149119(0x1529cba0ca458ff, double:2.714078450271586E-302)
            long r4 = r4 + r2
            r10 = 1
            int r2 = r26 + (-1)
            int r3 = r2 / 64
            int r3 = r3 * 64
            int r11 = r3 + r25
            r12 = r2 & 63
            int r2 = r11 + r12
            int r13 = r2 + (-63)
            r2 = 2480279821605975764(0x226bb95b4e64b6d4, double:7.104748899679321E-143)
            r14 = r25
        L37:
            long r4 = r4 + r2
            r15 = 0
            r16 = r8[r15]
            long r4 = r4 + r16
            int r6 = r14 + 8
            long r16 = com.google.common.hash.LittleEndianByteArray.load64(r7, r6)
            long r4 = r4 + r16
            r6 = 37
            long r4 = java.lang.Long.rotateRight(r4, r6)
            r16 = -5435081209227447693(0xb492b66fbe98f273, double:-1.9079014105469082E-55)
            long r4 = r4 * r16
            r18 = r8[r10]
            long r2 = r2 + r18
            int r6 = r14 + 48
            long r18 = com.google.common.hash.LittleEndianByteArray.load64(r7, r6)
            long r2 = r2 + r18
            r6 = 42
            long r2 = java.lang.Long.rotateRight(r2, r6)
            long r2 = r2 * r16
            r18 = r9[r10]
            long r18 = r4 ^ r18
            r4 = r8[r15]
            int r6 = r14 + 40
            long r20 = com.google.common.hash.LittleEndianByteArray.load64(r7, r6)
            long r4 = r4 + r20
            long r20 = r4 + r2
            r2 = r9[r15]
            long r0 = r0 + r2
            r6 = 33
            long r0 = java.lang.Long.rotateRight(r0, r6)
            long r22 = r0 * r16
            r0 = r8[r10]
            long r2 = r0 * r16
            r0 = r9[r15]
            long r4 = r18 + r0
            r0 = r24
            r1 = r14
            r6 = r8
            weakHashLength32WithSeeds(r0, r1, r2, r4, r6)
            int r1 = r14 + 32
            r2 = r9[r10]
            long r2 = r22 + r2
            int r0 = r14 + 16
            long r4 = com.google.common.hash.LittleEndianByteArray.load64(r7, r0)
            long r4 = r20 + r4
            r0 = r24
            r6 = r9
            weakHashLength32WithSeeds(r0, r1, r2, r4, r6)
            int r14 = r14 + 64
            if (r14 != r11) goto L156
            r0 = 255(0xff, double:1.26E-321)
            long r0 = r18 & r0
            long r0 = r0 << r10
            long r16 = r0 + r16
            r0 = r9[r15]
            long r2 = (long) r12
            long r0 = r0 + r2
            r9[r15] = r0
            r0 = r8[r15]
            r2 = r9[r15]
            long r0 = r0 + r2
            r8[r15] = r0
            r0 = r9[r15]
            r2 = r8[r15]
            long r0 = r0 + r2
            r9[r15] = r0
            long r22 = r22 + r20
            r0 = r8[r15]
            long r22 = r22 + r0
            int r0 = r13 + 8
            long r0 = com.google.common.hash.LittleEndianByteArray.load64(r7, r0)
            long r0 = r22 + r0
            r2 = 37
            long r0 = java.lang.Long.rotateRight(r0, r2)
            long r0 = r0 * r16
            r2 = r8[r10]
            long r20 = r20 + r2
            int r2 = r13 + 48
            long r2 = com.google.common.hash.LittleEndianByteArray.load64(r7, r2)
            long r2 = r20 + r2
            r4 = 42
            long r2 = java.lang.Long.rotateRight(r2, r4)
            long r2 = r2 * r16
            r4 = r9[r10]
            r11 = 9
            long r4 = r4 * r11
            long r20 = r0 ^ r4
            r0 = r8[r15]
            long r0 = r0 * r11
            int r4 = r13 + 40
            long r4 = com.google.common.hash.LittleEndianByteArray.load64(r7, r4)
            long r0 = r0 + r4
            long r11 = r0 + r2
            r0 = r9[r15]
            long r0 = r18 + r0
            r2 = 33
            long r0 = java.lang.Long.rotateRight(r0, r2)
            long r18 = r0 * r16
            r0 = r8[r10]
            long r2 = r0 * r16
            r0 = r9[r15]
            long r4 = r20 + r0
            r0 = r24
            r1 = r13
            r6 = r8
            weakHashLength32WithSeeds(r0, r1, r2, r4, r6)
            int r1 = r13 + 32
            r2 = r9[r10]
            long r2 = r18 + r2
            int r13 = r13 + 16
            long r4 = com.google.common.hash.LittleEndianByteArray.load64(r7, r13)
            long r4 = r4 + r11
            r6 = r9
            weakHashLength32WithSeeds(r0, r1, r2, r4, r6)
            r2 = r8[r15]
            r4 = r9[r15]
            r6 = r16
            long r0 = hashLength16(r2, r4, r6)
            long r2 = shiftMix(r11)
            r4 = -4348849565147123417(0xc3a5c85c97cb3127, double:-7.848031385787155E17)
            long r2 = r2 * r4
            long r2 = r2 + r0
            long r0 = r2 + r20
            r2 = r8[r10]
            r4 = r9[r10]
            long r2 = hashLength16(r2, r4, r6)
            long r4 = r2 + r18
            r2 = r0
            long r0 = hashLength16(r2, r4, r6)
            return r0
        L156:
            r0 = r18
            r2 = r20
            r4 = r22
            goto L37
    }

    private static long shiftMix(long r2) {
            r0 = 47
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            return r2
    }

    private static void weakHashLength32WithSeeds(byte[] r6, int r7, long r8, long r10, long[] r12) {
            long r0 = com.google.common.hash.LittleEndianByteArray.load64(r6, r7)
            int r2 = r7 + 8
            long r2 = com.google.common.hash.LittleEndianByteArray.load64(r6, r2)
            int r4 = r7 + 16
            long r4 = com.google.common.hash.LittleEndianByteArray.load64(r6, r4)
            int r7 = r7 + 24
            long r6 = com.google.common.hash.LittleEndianByteArray.load64(r6, r7)
            long r8 = r8 + r0
            long r10 = r10 + r8
            long r10 = r10 + r6
            r0 = 21
            long r10 = java.lang.Long.rotateRight(r10, r0)
            long r2 = r2 + r8
            long r2 = r2 + r4
            r0 = 44
            long r0 = java.lang.Long.rotateRight(r2, r0)
            long r0 = r0 + r10
            long r2 = r2 + r6
            r6 = 0
            r12[r6] = r2
            long r0 = r0 + r8
            r6 = 1
            r12[r6] = r0
            return
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            r0 = 64
            return r0
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            r0 = 32
            if (r5 > r0) goto L18
            r0 = 16
            if (r5 > r0) goto L13
            long r3 = hashLength0to16(r3, r4, r5)
            goto L25
        L13:
            long r3 = hashLength17to32(r3, r4, r5)
            goto L25
        L18:
            r0 = 64
            if (r5 > r0) goto L21
            long r3 = hashLength33To64(r3, r4, r5)
            goto L25
        L21:
            long r3 = hashLength65Plus(r3, r4, r5)
        L25:
            com.google.common.hash.HashCode r3 = com.google.common.hash.HashCode.fromLong(r3)
            return r3
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Hashing.farmHashFingerprint64()"
            return r0
    }
}
