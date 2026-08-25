package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public class AtomicDoubleArray implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient java.util.concurrent.atomic.AtomicLongArray longs;

    public AtomicDoubleArray(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongArray r0 = new java.util.concurrent.atomic.AtomicLongArray
            r0.<init>(r2)
            r1.longs = r0
            return
    }

    public AtomicDoubleArray(double[] r6) {
            r5 = this;
            r5.<init>()
            int r0 = r6.length
            long[] r1 = new long[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L14
            r3 = r6[r2]
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L14:
            java.util.concurrent.atomic.AtomicLongArray r6 = new java.util.concurrent.atomic.AtomicLongArray
            r6.<init>(r1)
            r5.longs = r6
            return
    }

    private void readObject(java.io.ObjectInputStream r6) throws java.io.IOException, java.lang.ClassNotFoundException {
            r5 = this;
            r6.defaultReadObject()
            int r0 = r6.readInt()
            com.google.common.primitives.ImmutableLongArray$Builder r1 = com.google.common.primitives.ImmutableLongArray.builder()
            r2 = 0
        Lc:
            if (r2 >= r0) goto L1c
            double r3 = r6.readDouble()
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto Lc
        L1c:
            java.util.concurrent.atomic.AtomicLongArray r6 = new java.util.concurrent.atomic.AtomicLongArray
            com.google.common.primitives.ImmutableLongArray r0 = r1.build()
            long[] r0 = r0.toArray()
            r6.<init>(r0)
            r5.longs = r6
            return
    }

    private void writeObject(java.io.ObjectOutputStream r5) throws java.io.IOException {
            r4 = this;
            r5.defaultWriteObject()
            int r0 = r4.length()
            r5.writeInt(r0)
            r1 = 0
        Lb:
            if (r1 >= r0) goto L17
            double r2 = r4.get(r1)
            r5.writeDouble(r2)
            int r1 = r1 + 1
            goto Lb
        L17:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public double addAndGet(int r10, double r11) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongArray r0 = r9.longs
            long r3 = r0.get(r10)
            double r0 = java.lang.Double.longBitsToDouble(r3)
            double r7 = r0 + r11
            long r5 = java.lang.Double.doubleToRawLongBits(r7)
            java.util.concurrent.atomic.AtomicLongArray r1 = r9.longs
            r2 = r10
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L0
            return r7
    }

    public final boolean compareAndSet(int r7, double r8, double r10) {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongArray r0 = r6.longs
            long r2 = java.lang.Double.doubleToRawLongBits(r8)
            long r4 = java.lang.Double.doubleToRawLongBits(r10)
            r1 = r7
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            return r7
    }

    public final double get(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongArray r0 = r2.longs
            long r0 = r0.get(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final double getAndAdd(int r10, double r11) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongArray r0 = r9.longs
            long r3 = r0.get(r10)
            double r7 = java.lang.Double.longBitsToDouble(r3)
            double r0 = r7 + r11
            long r5 = java.lang.Double.doubleToRawLongBits(r0)
            java.util.concurrent.atomic.AtomicLongArray r1 = r9.longs
            r2 = r10
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L0
            return r7
    }

    public final double getAndSet(int r2, double r3) {
            r1 = this;
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            java.util.concurrent.atomic.AtomicLongArray r0 = r1.longs
            long r2 = r0.getAndSet(r2, r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            return r2
    }

    public final void lazySet(int r2, double r3) {
            r1 = this;
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            java.util.concurrent.atomic.AtomicLongArray r0 = r1.longs
            r0.lazySet(r2, r3)
            return
    }

    public final int length() {
            r1 = this;
            java.util.concurrent.atomic.AtomicLongArray r0 = r1.longs
            int r0 = r0.length()
            return r0
    }

    public final void set(int r2, double r3) {
            r1 = this;
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            java.util.concurrent.atomic.AtomicLongArray r0 = r1.longs
            r0.set(r2, r3)
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.length()
            int r0 = r0 + (-1)
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.String r0 = "[]"
            return r0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 + 1
            int r2 = r2 * 19
            r1.<init>(r2)
            r2 = 91
            r1.append(r2)
            r2 = 0
        L1b:
            java.util.concurrent.atomic.AtomicLongArray r3 = r5.longs
            long r3 = r3.get(r2)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r1.append(r3)
            if (r2 != r0) goto L34
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L34:
            r3 = 44
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            int r2 = r2 + 1
            goto L1b
    }

    public final boolean weakCompareAndSet(int r7, double r8, double r10) {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongArray r0 = r6.longs
            long r2 = java.lang.Double.doubleToRawLongBits(r8)
            long r4 = java.lang.Double.doubleToRawLongBits(r10)
            r1 = r7
            boolean r7 = r0.weakCompareAndSet(r1, r2, r4)
            return r7
    }
}
