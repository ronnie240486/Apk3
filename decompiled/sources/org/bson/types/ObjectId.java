package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectId implements java.lang.Comparable<org.bson.types.ObjectId>, java.io.Serializable {
    private static final char[] HEX_CHARS = null;
    private static final int LOW_ORDER_THREE_BYTES = 16777215;
    private static final java.util.concurrent.atomic.AtomicInteger NEXT_COUNTER = null;
    private static final int OBJECT_ID_LENGTH = 12;
    private static final int RANDOM_VALUE1 = 0;
    private static final short RANDOM_VALUE2 = 0;
    private static final long serialVersionUID = 3670079982654483072L;
    private final int counter;
    private final int randomValue1;
    private final short randomValue2;
    private final int timestamp;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            int r1 = r1.nextInt()
            r0.<init>(r1)
            org.bson.types.ObjectId.NEXT_COUNTER = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            org.bson.types.ObjectId.HEX_CHARS = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L31
            r0.<init>()     // Catch: java.lang.Exception -> L31
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r0.nextInt(r1)     // Catch: java.lang.Exception -> L31
            org.bson.types.ObjectId.RANDOM_VALUE1 = r1     // Catch: java.lang.Exception -> L31
            r1 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0.nextInt(r1)     // Catch: java.lang.Exception -> L31
            short r0 = (short) r0     // Catch: java.lang.Exception -> L31
            org.bson.types.ObjectId.RANDOM_VALUE2 = r0     // Catch: java.lang.Exception -> L31
            return
        L31:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public ObjectId() {
            r1 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public ObjectId(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public ObjectId(int r1, int r2, int r3) {
            r0 = this;
            byte[] r1 = legacyToBytes(r1, r2, r3)
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public ObjectId(int r7, int r8, short r9, int r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private ObjectId(int r3, int r4, short r5, int r6, boolean r7) {
            r2 = this;
            r2.<init>()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r4 & r0
            if (r1 != 0) goto L25
            if (r7 == 0) goto L18
            r7 = r6 & r0
            if (r7 != 0) goto L10
            goto L18
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The counter must be between 0 and 16777215 (it must fit in three bytes)."
            r3.<init>(r4)
            throw r3
        L18:
            r2.timestamp = r3
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r6
            r2.counter = r3
            r2.randomValue1 = r4
            r2.randomValue2 = r5
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The machine identifier must be between 0 and 16777215 (it must fit in three bytes)."
            r3.<init>(r4)
            throw r3
    }

    private ObjectId(int r7, int r8, boolean r9) {
            r6 = this;
            int r2 = org.bson.types.ObjectId.RANDOM_VALUE1
            short r3 = org.bson.types.ObjectId.RANDOM_VALUE2
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ObjectId(java.lang.String r1) {
            r0 = this;
            byte[] r1 = parseHexString(r1)
            r0.<init>(r1)
            return
    }

    public ObjectId(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "buffer"
            org.bson.assertions.Assertions.notNull(r0, r6)
            int r0 = r6.remaining()
            r1 = 0
            r2 = 12
            if (r0 < r2) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r2 = "buffer.remaining() >=12"
            org.bson.assertions.Assertions.isTrueArgument(r2, r0)
            byte r0 = r6.get()
            byte r2 = r6.get()
            byte r3 = r6.get()
            byte r4 = r6.get()
            int r0 = makeInt(r0, r2, r3, r4)
            r5.timestamp = r0
            byte r0 = r6.get()
            byte r2 = r6.get()
            byte r3 = r6.get()
            int r0 = makeInt(r1, r0, r2, r3)
            r5.randomValue1 = r0
            byte r0 = r6.get()
            byte r2 = r6.get()
            short r0 = makeShort(r0, r2)
            r5.randomValue2 = r0
            byte r0 = r6.get()
            byte r2 = r6.get()
            byte r6 = r6.get()
            int r6 = makeInt(r1, r0, r2, r6)
            r5.counter = r6
            return
    }

    public ObjectId(java.util.Date r3) {
            r2 = this;
            int r3 = dateToTimestampSeconds(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = org.bson.types.ObjectId.NEXT_COUNTER
            int r0 = r0.getAndIncrement()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public ObjectId(java.util.Date r2, int r3) {
            r1 = this;
            int r2 = dateToTimestampSeconds(r2)
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public ObjectId(java.util.Date r1, int r2, short r3, int r4) {
            r0 = this;
            int r1 = dateToTimestampSeconds(r1)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public ObjectId(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "bytes"
            java.lang.Object r0 = org.bson.assertions.Assertions.notNull(r0, r3)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r1 = 12
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "bytes has length of 12"
            java.lang.Object r3 = org.bson.assertions.Assertions.isTrueArgument(r1, r3, r0)
            byte[] r3 = (byte[]) r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r2.<init>(r3)
            return
    }

    @java.lang.Deprecated
    public static org.bson.types.ObjectId createFromLegacyFormat(int r1, int r2, int r3) {
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static int dateToTimestampSeconds(java.util.Date r4) {
            long r0 = r4.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r4 = (int) r0
            return r4
    }

    public static org.bson.types.ObjectId get() {
            org.bson.types.ObjectId r0 = new org.bson.types.ObjectId
            r0.<init>()
            return r0
    }

    @java.lang.Deprecated
    public static int getCurrentCounter() {
            java.util.concurrent.atomic.AtomicInteger r0 = org.bson.types.ObjectId.NEXT_COUNTER
            int r0 = r0.get()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    @java.lang.Deprecated
    public static int getGeneratedMachineIdentifier() {
            int r0 = org.bson.types.ObjectId.RANDOM_VALUE1
            return r0
    }

    @java.lang.Deprecated
    public static int getGeneratedProcessIdentifier() {
            short r0 = org.bson.types.ObjectId.RANDOM_VALUE2
            return r0
    }

    private static byte int0(int r0) {
            byte r0 = (byte) r0
            return r0
    }

    private static byte int1(int r0) {
            int r0 = r0 >> 8
            byte r0 = (byte) r0
            return r0
    }

    private static byte int2(int r0) {
            int r0 = r0 >> 16
            byte r0 = (byte) r0
            return r0
    }

    private static byte int3(int r0) {
            int r0 = r0 >> 24
            byte r0 = (byte) r0
            return r0
    }

    public static boolean isValid(java.lang.String r5) {
            if (r5 == 0) goto L33
            int r0 = r5.length()
            r1 = 24
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r1 = 0
        Ld:
            if (r1 >= r0) goto L31
            char r3 = r5.charAt(r1)
            r4 = 48
            if (r3 < r4) goto L1c
            r4 = 57
            if (r3 > r4) goto L1c
            goto L2d
        L1c:
            r4 = 97
            if (r3 < r4) goto L25
            r4 = 102(0x66, float:1.43E-43)
            if (r3 > r4) goto L25
            goto L2d
        L25:
            r4 = 65
            if (r3 < r4) goto L30
            r4 = 70
            if (r3 > r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            return r2
        L31:
            r5 = 1
            return r5
        L33:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    private static byte[] legacyToBytes(int r3, int r4, int r5) {
            r0 = 12
            byte[] r0 = new byte[r0]
            byte r1 = int3(r3)
            r2 = 0
            r0[r2] = r1
            byte r1 = int2(r3)
            r2 = 1
            r0[r2] = r1
            byte r1 = int1(r3)
            r2 = 2
            r0[r2] = r1
            byte r3 = int0(r3)
            r1 = 3
            r0[r1] = r3
            byte r3 = int3(r4)
            r1 = 4
            r0[r1] = r3
            byte r3 = int2(r4)
            r1 = 5
            r0[r1] = r3
            byte r3 = int1(r4)
            r1 = 6
            r0[r1] = r3
            byte r3 = int0(r4)
            r4 = 7
            r0[r4] = r3
            byte r3 = int3(r5)
            r4 = 8
            r0[r4] = r3
            byte r3 = int2(r5)
            r4 = 9
            r0[r4] = r3
            byte r3 = int1(r5)
            r4 = 10
            r0[r4] = r3
            byte r3 = int0(r5)
            r4 = 11
            r0[r4] = r3
            return r0
    }

    private static int makeInt(byte r0, byte r1, byte r2, byte r3) {
            int r0 = r0 << 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    private static short makeShort(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    private static byte[] parseHexString(java.lang.String r5) {
            boolean r0 = isValid(r5)
            if (r0 == 0) goto L22
            r0 = 12
            byte[] r1 = new byte[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L21
            int r3 = r2 * 2
            int r4 = r3 + 2
            java.lang.String r3 = r5.substring(r3, r4)
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L21:
            return r1
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid hexadecimal representation of an ObjectId: ["
            java.lang.String r2 = "]"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r2)
            r0.<init>(r5)
            throw r0
    }

    private static byte short0(short r0) {
            byte r0 = (byte) r0
            return r0
    }

    private static byte short1(short r0) {
            int r0 = r0 >> 8
            byte r0 = (byte) r0
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.types.ObjectId r1) {
            r0 = this;
            org.bson.types.ObjectId r1 = (org.bson.types.ObjectId) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.types.ObjectId r6) {
            r5 = this;
            java.util.Objects.requireNonNull(r6)
            byte[] r0 = r5.toByteArray()
            byte[] r6 = r6.toByteArray()
            r1 = 0
            r2 = 0
        Ld:
            r3 = 12
            if (r2 >= r3) goto L28
            r3 = r0[r2]
            r4 = r6[r2]
            if (r3 == r4) goto L25
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r6[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r0 >= r6) goto L23
            r6 = -1
            goto L24
        L23:
            r6 = 1
        L24:
            return r6
        L25:
            int r2 = r2 + 1
            goto Ld
        L28:
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<org.bson.types.ObjectId> r2 = org.bson.types.ObjectId.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            org.bson.types.ObjectId r5 = (org.bson.types.ObjectId) r5
            int r2 = r4.counter
            int r3 = r5.counter
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.timestamp
            int r3 = r5.timestamp
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.randomValue1
            int r3 = r5.randomValue1
            if (r2 == r3) goto L27
            return r1
        L27:
            short r2 = r4.randomValue2
            short r5 = r5.randomValue2
            if (r2 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    @java.lang.Deprecated
    public int getCounter() {
            r1 = this;
            int r0 = r1.counter
            return r0
    }

    public java.util.Date getDate() {
            r5 = this;
            java.util.Date r0 = new java.util.Date
            int r1 = r5.timestamp
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public int getMachineIdentifier() {
            r1 = this;
            int r0 = r1.randomValue1
            return r0
    }

    @java.lang.Deprecated
    public short getProcessIdentifier() {
            r1 = this;
            short r0 = r1.randomValue2
            return r0
    }

    @java.lang.Deprecated
    public long getTime() {
            r4 = this;
            int r0 = r4.timestamp
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
    }

    @java.lang.Deprecated
    public int getTimeSecond() {
            r1 = this;
            int r0 = r1.timestamp
            return r0
    }

    public int getTimestamp() {
            r1 = this;
            int r0 = r1.timestamp
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.timestamp
            int r0 = r0 * 31
            int r1 = r2.counter
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.randomValue1
            int r0 = r0 + r1
            int r0 = r0 * 31
            short r1 = r2.randomValue2
            int r0 = r0 + r1
            return r0
    }

    public void putToByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = "buffer"
            org.bson.assertions.Assertions.notNull(r0, r3)
            int r0 = r3.remaining()
            r1 = 12
            if (r0 < r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "buffer.remaining() >=12"
            org.bson.assertions.Assertions.isTrueArgument(r1, r0)
            int r0 = r2.timestamp
            byte r0 = int3(r0)
            r3.put(r0)
            int r0 = r2.timestamp
            byte r0 = int2(r0)
            r3.put(r0)
            int r0 = r2.timestamp
            byte r0 = int1(r0)
            r3.put(r0)
            int r0 = r2.timestamp
            byte r0 = int0(r0)
            r3.put(r0)
            int r0 = r2.randomValue1
            byte r0 = int2(r0)
            r3.put(r0)
            int r0 = r2.randomValue1
            byte r0 = int1(r0)
            r3.put(r0)
            int r0 = r2.randomValue1
            byte r0 = int0(r0)
            r3.put(r0)
            short r0 = r2.randomValue2
            byte r0 = short1(r0)
            r3.put(r0)
            short r0 = r2.randomValue2
            byte r0 = short0(r0)
            r3.put(r0)
            int r0 = r2.counter
            byte r0 = int2(r0)
            r3.put(r0)
            int r0 = r2.counter
            byte r0 = int1(r0)
            r3.put(r0)
            int r0 = r2.counter
            byte r0 = int0(r0)
            r3.put(r0)
            return
    }

    public byte[] toByteArray() {
            r1 = this;
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1.putToByteBuffer(r0)
            byte[] r0 = r0.array()
            return r0
    }

    public java.lang.String toHexString() {
            r9 = this;
            r0 = 24
            char[] r0 = new char[r0]
            byte[] r1 = r9.toByteArray()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        Lb:
            if (r3 >= r2) goto L26
            r5 = r1[r3]
            int r6 = r4 + 1
            char[] r7 = org.bson.types.ObjectId.HEX_CHARS
            int r8 = r5 >> 4
            r8 = r8 & 15
            char r8 = r7[r8]
            r0[r4] = r8
            int r4 = r6 + 1
            r5 = r5 & 15
            char r5 = r7[r5]
            r0[r6] = r5
            int r3 = r3 + 1
            goto Lb
        L26:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toHexString()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String toStringMongod() {
            r1 = this;
            java.lang.String r0 = r1.toHexString()
            return r0
    }
}
