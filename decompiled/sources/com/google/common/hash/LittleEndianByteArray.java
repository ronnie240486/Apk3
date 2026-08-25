package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class LittleEndianByteArray {
    private static final com.google.common.hash.LittleEndianByteArray.LittleEndianBytes byteArray = null;

    /* JADX INFO: renamed from: com.google.common.hash.LittleEndianByteArray$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract enum JavaLittleEndianBytes extends java.lang.Enum<com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes> implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        private static final /* synthetic */ com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[] $VALUES = null;
        public static final com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes INSTANCE = null;


        private static /* synthetic */ com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[] $values() {
                r0 = 1
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r0 = new com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[r0]
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes r1 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1 r0 = new com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1
                r0.<init>()
                com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE = r0
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r0 = $values()
                com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.$VALUES = r0
                return
        }

        public /* synthetic */ JavaLittleEndianBytes() {
                r2 = this;
                java.lang.String r0 = "INSTANCE"
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        private JavaLittleEndianBytes(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes> r0 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes r1 = (com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes) r1
                return r1
        }

        public static com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[] values() {
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r0 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r0 = (com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface LittleEndianBytes {
        long getLongLittleEndian(byte[] r1, int r2);

        void putLongLittleEndian(byte[] r1, int r2, long r3);
    }

    public static abstract enum UnsafeByteArray extends java.lang.Enum<com.google.common.hash.LittleEndianByteArray.UnsafeByteArray> implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        private static final /* synthetic */ com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[] $VALUES = null;
        private static final int BYTE_ARRAY_BASE_OFFSET = 0;
        public static final com.google.common.hash.LittleEndianByteArray.UnsafeByteArray UNSAFE_BIG_ENDIAN = null;
        public static final com.google.common.hash.LittleEndianByteArray.UnsafeByteArray UNSAFE_LITTLE_ENDIAN = null;
        private static final sun.misc.Unsafe theUnsafe = null;




        private static /* synthetic */ com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[] $values() {
                r0 = 2
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r0 = new com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[r0]
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r1 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN
                r2 = 0
                r0[r2] = r1
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r1 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                java.lang.Class<byte[]> r0 = byte[].class
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1 r1 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1
                r1.<init>()
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN = r1
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2 r1 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2
                r1.<init>()
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN = r1
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r1 = $values()
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.$VALUES = r1
                sun.misc.Unsafe r1 = getUnsafe()
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe = r1
                int r2 = r1.arrayBaseOffset(r0)
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET = r2
                int r0 = r1.arrayIndexScale(r0)
                r1 = 1
                if (r0 != r1) goto L2a
                return
            L2a:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        private UnsafeByteArray(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ UnsafeByteArray(java.lang.String r1, int r2, com.google.common.hash.LittleEndianByteArray.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ int access$100() {
                int r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET
                return r0
        }

        public static /* synthetic */ sun.misc.Unsafe access$200() {
                sun.misc.Unsafe r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe
                return r0
        }

        private static sun.misc.Unsafe getUnsafe() {
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L5
                return r0
            L5:
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3 r0 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3     // Catch: java.security.PrivilegedActionException -> L11
                r0.<init>()     // Catch: java.security.PrivilegedActionException -> L11
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L11
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.security.PrivilegedActionException -> L11
                return r0
            L11:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
        }

        public static com.google.common.hash.LittleEndianByteArray.UnsafeByteArray valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.LittleEndianByteArray$UnsafeByteArray> r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r1 = (com.google.common.hash.LittleEndianByteArray.UnsafeByteArray) r1
                return r1
        }

        public static com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[] values() {
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r0 = (com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[]) r0
                return r0
        }
    }

    static {
            com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes r0 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "amd64"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L21
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L21
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L21
            goto L21
        L1f:
            com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN     // Catch: java.lang.Throwable -> L21
        L21:
            com.google.common.hash.LittleEndianByteArray.byteArray = r0
            return
    }

    private LittleEndianByteArray() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int load32(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static long load64(byte[] r1, int r2) {
            com.google.common.hash.LittleEndianByteArray$LittleEndianBytes r0 = com.google.common.hash.LittleEndianByteArray.byteArray
            long r1 = r0.getLongLittleEndian(r1, r2)
            return r1
    }
}
