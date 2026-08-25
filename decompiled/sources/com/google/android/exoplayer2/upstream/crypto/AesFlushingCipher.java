package com.google.android.exoplayer2.upstream.crypto;

/* JADX INFO: loaded from: classes.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final javax.crypto.Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int r7, byte[] r8, long r9, long r11) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r6.cipher = r0     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            int r1 = r0.getBlockSize()     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r6.blockSize = r1     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            byte[] r2 = new byte[r1]     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r6.zerosBlock = r2     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            byte[] r2 = new byte[r1]     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r6.flushedBlock = r2     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            long r2 = (long) r1     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            long r2 = r11 / r2
            long r4 = (long) r1     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            long r11 = r11 % r4
            int r12 = (int) r11     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            javax.crypto.spec.SecretKeySpec r11 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r1 = r0.getAlgorithm()     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            java.lang.String r4 = "/"
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.splitAtFirst(r1, r4)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r4 = 0
            r1 = r1[r4]     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r11.<init>(r8, r1)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            javax.crypto.spec.IvParameterSpec r8 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            byte[] r9 = r6.getInitializationVector(r9, r2)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r8.<init>(r9)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r0.init(r7, r11, r8)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            if (r12 == 0) goto L44
            byte[] r7 = new byte[r12]     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
            r6.updateInPlace(r7, r4, r12)     // Catch: java.security.InvalidAlgorithmParameterException -> L45 java.security.InvalidKeyException -> L47 javax.crypto.NoSuchPaddingException -> L49 java.security.NoSuchAlgorithmException -> L4b
        L44:
            return
        L45:
            r7 = move-exception
            goto L4c
        L47:
            r7 = move-exception
            goto L4c
        L49:
            r7 = move-exception
            goto L4c
        L4b:
            r7 = move-exception
        L4c:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    public AesFlushingCipher(int r8, byte[] r9, @androidx.annotation.Nullable java.lang.String r10, long r11) {
            r7 = this;
            long r3 = getFNV64Hash(r10)
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            return
    }

    private static long getFNV64Hash(@androidx.annotation.Nullable java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto L5
            return r0
        L5:
            r2 = 0
        L6:
            int r3 = r7.length()
            if (r2 >= r3) goto L2f
            char r3 = r7.charAt(r2)
            long r3 = (long) r3
            long r0 = r0 ^ r3
            r3 = 1
            long r3 = r0 << r3
            r5 = 4
            long r5 = r0 << r5
            long r3 = r3 + r5
            r5 = 5
            long r5 = r0 << r5
            long r3 = r3 + r5
            r5 = 7
            long r5 = r0 << r5
            long r3 = r3 + r5
            r5 = 8
            long r5 = r0 << r5
            long r3 = r3 + r5
            r5 = 40
            long r5 = r0 << r5
            long r3 = r3 + r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L2f:
            return r0
    }

    private byte[] getInitializationVector(long r2, long r4) {
            r1 = this;
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r2 = r0.putLong(r2)
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            return r2
    }

    private int nonFlushingUpdate(byte[] r7, int r8, int r9, byte[] r10, int r11) {
            r6 = this;
            javax.crypto.Cipher r0 = r6.cipher     // Catch: javax.crypto.ShortBufferException -> Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r7 = r0.update(r1, r2, r3, r4, r5)     // Catch: javax.crypto.ShortBufferException -> Lc
            return r7
        Lc:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    public void update(byte[] r9, int r10, int r11, byte[] r12, int r13) {
            r8 = this;
            r2 = r10
        L1:
            int r10 = r8.pendingXorBytes
            if (r10 <= 0) goto L1f
            r0 = r9[r2]
            byte[] r1 = r8.flushedBlock
            int r3 = r8.blockSize
            int r3 = r3 - r10
            r1 = r1[r3]
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            r12[r13] = r0
            int r13 = r13 + 1
            int r2 = r2 + 1
            int r10 = r10 + (-1)
            r8.pendingXorBytes = r10
            int r11 = r11 + (-1)
            if (r11 != 0) goto L1
            return
        L1f:
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            int r9 = r0.nonFlushingUpdate(r1, r2, r3, r4, r5)
            if (r11 != r9) goto L2b
            return
        L2b:
            int r11 = r11 - r9
            int r10 = r8.blockSize
            r0 = 0
            r1 = 1
            if (r11 >= r10) goto L34
            r10 = 1
            goto L35
        L34:
            r10 = 0
        L35:
            com.google.android.exoplayer2.util.Assertions.checkState(r10)
            int r13 = r13 + r9
            int r9 = r8.blockSize
            int r5 = r9 - r11
            r8.pendingXorBytes = r5
            byte[] r3 = r8.zerosBlock
            r4 = 0
            byte[] r6 = r8.flushedBlock
            r7 = 0
            r2 = r8
            int r9 = r2.nonFlushingUpdate(r3, r4, r5, r6, r7)
            int r10 = r8.blockSize
            if (r9 != r10) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
        L53:
            if (r0 >= r11) goto L61
            int r9 = r13 + 1
            byte[] r10 = r8.flushedBlock
            r10 = r10[r0]
            r12[r13] = r10
            int r0 = r0 + 1
            r13 = r9
            goto L53
        L61:
            return
    }

    public void updateInPlace(byte[] r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r7
            r5 = r8
            r0.update(r1, r2, r3, r4, r5)
            return
    }
}
