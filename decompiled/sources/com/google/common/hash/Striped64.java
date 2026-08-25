package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class Striped64 extends java.lang.Number {
    public static final int NCPU = 0;
    private static final sun.misc.Unsafe UNSAFE = null;
    private static final long baseOffset = 0;
    private static final long busyOffset = 0;
    public static final java.util.Random rng = null;
    public static final java.lang.ThreadLocal<int[]> threadHashCode = null;
    public volatile transient long base;
    public volatile transient int busy;

    @javax.annotation.CheckForNull
    public volatile transient com.google.common.hash.Striped64.Cell[] cells;


    /* JADX INFO: loaded from: classes3.dex */
    public static final class Cell {
        private static final sun.misc.Unsafe UNSAFE = null;
        private static final long valueOffset = 0;
        public volatile long value;

        static {
                sun.misc.Unsafe r0 = com.google.common.hash.Striped64.access$000()     // Catch: java.lang.Exception -> L15
                com.google.common.hash.Striped64.Cell.UNSAFE = r0     // Catch: java.lang.Exception -> L15
                java.lang.Class<com.google.common.hash.Striped64$Cell> r1 = com.google.common.hash.Striped64.Cell.class
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L15
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Exception -> L15
                com.google.common.hash.Striped64.Cell.valueOffset = r0     // Catch: java.lang.Exception -> L15
                return
            L15:
                r0 = move-exception
                java.lang.Error r1 = new java.lang.Error
                r1.<init>(r0)
                throw r1
        }

        public Cell(long r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public final boolean cas(long r9, long r11) {
                r8 = this;
                sun.misc.Unsafe r0 = com.google.common.hash.Striped64.Cell.UNSAFE
                long r2 = com.google.common.hash.Striped64.Cell.valueOffset
                r1 = r8
                r4 = r9
                r6 = r11
                boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
                return r9
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.common.hash.Striped64.threadHashCode = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.google.common.hash.Striped64.rng = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.google.common.hash.Striped64.NCPU = r0
            sun.misc.Unsafe r0 = getUnsafe()     // Catch: java.lang.Exception -> L39
            com.google.common.hash.Striped64.UNSAFE = r0     // Catch: java.lang.Exception -> L39
            java.lang.Class<com.google.common.hash.Striped64> r1 = com.google.common.hash.Striped64.class
            java.lang.String r2 = "base"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L39
            long r2 = r0.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L39
            com.google.common.hash.Striped64.baseOffset = r2     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "busy"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L39
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Exception -> L39
            com.google.common.hash.Striped64.busyOffset = r0     // Catch: java.lang.Exception -> L39
            return
        L39:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            throw r1
    }

    public Striped64() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ sun.misc.Unsafe access$000() {
            sun.misc.Unsafe r0 = getUnsafe()
            return r0
    }

    private static sun.misc.Unsafe getUnsafe() {
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L5
            return r0
        L5:
            com.google.common.hash.Striped64$1 r0 = new com.google.common.hash.Striped64$1     // Catch: java.security.PrivilegedActionException -> L11
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

    public final boolean casBase(long r9, long r11) {
            r8 = this;
            sun.misc.Unsafe r0 = com.google.common.hash.Striped64.UNSAFE
            long r2 = com.google.common.hash.Striped64.baseOffset
            r1 = r8
            r4 = r9
            r6 = r11
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            return r9
    }

    public final boolean casBusy() {
            r6 = this;
            sun.misc.Unsafe r0 = com.google.common.hash.Striped64.UNSAFE
            long r2 = com.google.common.hash.Striped64.busyOffset
            r4 = 0
            r5 = 1
            r1 = r6
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            return r0
    }
}
