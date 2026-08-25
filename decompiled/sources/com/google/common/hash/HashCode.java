package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
public abstract class HashCode {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final char[] hexDigits = null;

    /* JADX INFO: loaded from: classes.dex */
    public static final class BytesHashCode extends com.google.common.hash.HashCode implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final byte[] bytes;

        public BytesHashCode(byte[] r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                byte[] r1 = (byte[]) r1
                r0.bytes = r1
                return
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
                r1 = this;
                byte[] r0 = r1.bytes
                java.lang.Object r0 = r0.clone()
                byte[] r0 = (byte[]) r0
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
                r5 = this;
                byte[] r0 = r5.bytes
                int r1 = r0.length
                r2 = 1
                r3 = 0
                r4 = 4
                if (r1 < r4) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                int r0 = r0.length
                java.lang.String r4 = "HashCode#asInt() requires >= 4 bytes (it only has %s bytes)."
                com.google.common.base.Preconditions.checkState(r1, r4, r0)
                byte[] r0 = r5.bytes
                r1 = r0[r3]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r2 = r0[r2]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 8
                r1 = r1 | r2
                r2 = 2
                r2 = r0[r2]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 16
                r1 = r1 | r2
                r2 = 3
                r0 = r0[r2]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r1
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
                r3 = this;
                byte[] r0 = r3.bytes
                int r1 = r0.length
                r2 = 8
                if (r1 < r2) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                int r0 = r0.length
                java.lang.String r2 = "HashCode#asLong() requires >= 8 bytes (it only has %s bytes)."
                com.google.common.base.Preconditions.checkState(r1, r2, r0)
                long r0 = r3.padToLong()
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
                r1 = this;
                byte[] r0 = r1.bytes
                int r0 = r0.length
                int r0 = r0 * 8
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public final boolean equalsSameBits(com.google.common.hash.HashCode r7) {
                r6 = this;
                byte[] r0 = r6.bytes
                int r0 = r0.length
                byte[] r1 = r7.getBytesInternal()
                int r1 = r1.length
                r2 = 0
                if (r0 == r1) goto Lc
                return r2
            Lc:
                r0 = 1
                r1 = 0
                r3 = 1
            Lf:
                byte[] r4 = r6.bytes
                int r5 = r4.length
                if (r1 >= r5) goto L25
                r4 = r4[r1]
                byte[] r5 = r7.getBytesInternal()
                r5 = r5[r1]
                if (r4 != r5) goto L20
                r4 = 1
                goto L21
            L20:
                r4 = 0
            L21:
                r3 = r3 & r4
                int r1 = r1 + 1
                goto Lf
            L25:
                return r3
        }

        @Override // com.google.common.hash.HashCode
        public final byte[] getBytesInternal() {
                r1 = this;
                byte[] r0 = r1.bytes
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
                r7 = this;
                byte[] r0 = r7.bytes
                r1 = 0
                r0 = r0[r1]
                r0 = r0 & 255(0xff, float:3.57E-43)
                long r0 = (long) r0
                r2 = 1
            L9:
                byte[] r3 = r7.bytes
                int r3 = r3.length
                r4 = 8
                int r3 = java.lang.Math.min(r3, r4)
                if (r2 >= r3) goto L23
                byte[] r3 = r7.bytes
                r3 = r3[r2]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r5 = r2 * 8
                long r3 = r3 << r5
                long r0 = r0 | r3
                int r2 = r2 + 1
                goto L9
            L23:
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public final void writeBytesToImpl(byte[] r3, int r4, int r5) {
                r2 = this;
                byte[] r0 = r2.bytes
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class IntHashCode extends com.google.common.hash.HashCode implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final int hash;

        public IntHashCode(int r1) {
                r0 = this;
                r0.<init>()
                r0.hash = r1
                return
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
                r4 = this;
                r0 = 4
                byte[] r0 = new byte[r0]
                int r1 = r4.hash
                byte r2 = (byte) r1
                r3 = 0
                r0[r3] = r2
                int r2 = r1 >> 8
                byte r2 = (byte) r2
                r3 = 1
                r0[r3] = r2
                int r2 = r1 >> 16
                byte r2 = (byte) r2
                r3 = 2
                r0[r3] = r2
                int r1 = r1 >> 24
                byte r1 = (byte) r1
                r2 = 3
                r0[r2] = r1
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "this HashCode only has 32 bits; cannot create a long"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
                r1 = this;
                r0 = 32
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public final boolean equalsSameBits(com.google.common.hash.HashCode r2) {
                r1 = this;
                int r0 = r1.hash
                int r2 = r2.asInt()
                if (r0 != r2) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
                r2 = this;
                int r0 = r2.hash
                long r0 = com.google.common.primitives.UnsignedInts.toLong(r0)
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public final void writeBytesToImpl(byte[] r5, int r6, int r7) {
                r4 = this;
                r0 = 0
            L1:
                if (r0 >= r7) goto L10
                int r1 = r6 + r0
                int r2 = r4.hash
                int r3 = r0 * 8
                int r2 = r2 >> r3
                byte r2 = (byte) r2
                r5[r1] = r2
                int r0 = r0 + 1
                goto L1
            L10:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LongHashCode extends com.google.common.hash.HashCode implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final long hash;

        public LongHashCode(long r1) {
                r0 = this;
                r0.<init>()
                r0.hash = r1
                return
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
                r6 = this;
                r0 = 8
                byte[] r1 = new byte[r0]
                long r2 = r6.hash
                int r4 = (int) r2
                byte r4 = (byte) r4
                r5 = 0
                r1[r5] = r4
                long r4 = r2 >> r0
                int r0 = (int) r4
                byte r0 = (byte) r0
                r4 = 1
                r1[r4] = r0
                r0 = 16
                long r4 = r2 >> r0
                int r0 = (int) r4
                byte r0 = (byte) r0
                r4 = 2
                r1[r4] = r0
                r0 = 24
                long r4 = r2 >> r0
                int r0 = (int) r4
                byte r0 = (byte) r0
                r4 = 3
                r1[r4] = r0
                r0 = 32
                long r4 = r2 >> r0
                int r0 = (int) r4
                byte r0 = (byte) r0
                r4 = 4
                r1[r4] = r0
                r0 = 40
                long r4 = r2 >> r0
                int r0 = (int) r4
                byte r0 = (byte) r0
                r4 = 5
                r1[r4] = r0
                r0 = 48
                long r4 = r2 >> r0
                int r0 = (int) r4
                byte r0 = (byte) r0
                r4 = 6
                r1[r4] = r0
                r0 = 56
                long r2 = r2 >> r0
                int r0 = (int) r2
                byte r0 = (byte) r0
                r2 = 7
                r1[r2] = r0
                return r1
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
                r2 = this;
                long r0 = r2.hash
                int r1 = (int) r0
                return r1
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
                r2 = this;
                long r0 = r2.hash
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
                r1 = this;
                r0 = 64
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public final boolean equalsSameBits(com.google.common.hash.HashCode r5) {
                r4 = this;
                long r0 = r4.hash
                long r2 = r5.asLong()
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Lc
                r5 = 1
                goto Ld
            Lc:
                r5 = 0
            Ld:
                return r5
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
                r2 = this;
                long r0 = r2.hash
                return r0
        }

        @Override // com.google.common.hash.HashCode
        public final void writeBytesToImpl(byte[] r6, int r7, int r8) {
                r5 = this;
                r0 = 0
            L1:
                if (r0 >= r8) goto L11
                int r1 = r7 + r0
                long r2 = r5.hash
                int r4 = r0 * 8
                long r2 = r2 >> r4
                int r3 = (int) r2
                byte r2 = (byte) r3
                r6[r1] = r2
                int r0 = r0 + 1
                goto L1
            L11:
                return
        }
    }

    static {
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            com.google.common.hash.HashCode.hexDigits = r0
            return
    }

    public HashCode() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int decode(char r3) {
            r0 = 48
            if (r3 < r0) goto La
            r1 = 57
            if (r3 > r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r3 < r0) goto L16
            r1 = 102(0x66, float:1.43E-43)
            if (r3 > r1) goto L16
            int r3 = r3 - r0
            int r3 = r3 + 10
            return r3
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Illegal hexadecimal character: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    public static com.google.common.hash.HashCode fromBytes(byte[] r2) {
            int r0 = r2.length
            r1 = 1
            if (r0 < r1) goto L5
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.String r0 = "A HashCode must contain at least 1 byte."
            com.google.common.base.Preconditions.checkArgument(r1, r0)
            java.lang.Object r2 = r2.clone()
            byte[] r2 = (byte[]) r2
            com.google.common.hash.HashCode$BytesHashCode r0 = new com.google.common.hash.HashCode$BytesHashCode
            r0.<init>(r2)
            return r0
    }

    public static com.google.common.hash.HashCode fromInt(int r1) {
            com.google.common.hash.HashCode$IntHashCode r0 = new com.google.common.hash.HashCode$IntHashCode
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.hash.HashCode fromLong(long r1) {
            com.google.common.hash.HashCode$LongHashCode r0 = new com.google.common.hash.HashCode$LongHashCode
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.hash.HashCode fromString(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 < r3) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r4 = "input string (%s) must have at least 2 characters"
            com.google.common.base.Preconditions.checkArgument(r0, r4, r5)
            int r0 = r5.length()
            int r0 = r0 % r3
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r0 = "input string (%s) must have an even number of characters"
            com.google.common.base.Preconditions.checkArgument(r1, r0, r5)
            int r0 = r5.length()
            int r0 = r0 / r3
            byte[] r0 = new byte[r0]
        L26:
            int r1 = r5.length()
            if (r2 >= r1) goto L49
            char r1 = r5.charAt(r2)
            int r1 = decode(r1)
            int r1 = r1 << 4
            int r3 = r2 + 1
            char r3 = r5.charAt(r3)
            int r3 = decode(r3)
            int r4 = r2 / 2
            int r1 = r1 + r3
            byte r1 = (byte) r1
            r0[r4] = r1
            int r2 = r2 + 2
            goto L26
        L49:
            com.google.common.hash.HashCode$BytesHashCode r5 = new com.google.common.hash.HashCode$BytesHashCode
            r5.<init>(r0)
            return r5
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.hash.HashCode
            r1 = 0
            if (r0 == 0) goto L18
            com.google.common.hash.HashCode r4 = (com.google.common.hash.HashCode) r4
            int r0 = r3.bits()
            int r2 = r4.bits()
            if (r0 != r2) goto L18
            boolean r4 = r3.equalsSameBits(r4)
            if (r4 == 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    public abstract boolean equalsSameBits(com.google.common.hash.HashCode r1);

    public byte[] getBytesInternal() {
            r1 = this;
            byte[] r0 = r1.asBytes()
            return r0
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.bits()
            r1 = 32
            if (r0 < r1) goto Ld
            int r0 = r5.asInt()
            return r0
        Ld:
            byte[] r0 = r5.getBytesInternal()
            r1 = 0
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
        L17:
            int r3 = r0.length
            if (r2 >= r3) goto L25
            r3 = r0[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 * 8
            int r3 = r3 << r4
            r1 = r1 | r3
            int r2 = r2 + 1
            goto L17
        L25:
            return r1
    }

    public abstract long padToLong();

    public final java.lang.String toString() {
            r7 = this;
            byte[] r0 = r7.getBytesInternal()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length
            int r2 = r2 * 2
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L27
            r4 = r0[r3]
            char[] r5 = com.google.common.hash.HashCode.hexDigits
            int r6 = r4 >> 4
            r6 = r6 & 15
            char r6 = r5[r6]
            r1.append(r6)
            r4 = r4 & 15
            char r4 = r5[r4]
            r1.append(r4)
            int r3 = r3 + 1
            goto Le
        L27:
            java.lang.String r0 = r1.toString()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int writeBytesTo(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r5
            int r5 = r2.bits()
            int r5 = r5 / 8
            r1 = 1
            r0[r1] = r5
            int r5 = com.google.common.primitives.Ints.min(r0)
            int r0 = r4 + r5
            int r1 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r0, r1)
            r2.writeBytesToImpl(r3, r4, r5)
            return r5
    }

    public abstract void writeBytesToImpl(byte[] r1, int r2, int r3);
}
