package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public class AtomicDouble extends java.lang.Number {
    private static final long serialVersionUID = 0;
    private transient java.util.concurrent.atomic.AtomicLong value;

    public AtomicDouble() {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            return
    }

    public AtomicDouble(double r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.<init>(r2)
            r1.value = r0
            return
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.value = r0
            double r0 = r3.readDouble()
            r2.set(r0)
            return
    }

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            r3.defaultWriteObject()
            double r0 = r2.get()
            r3.writeDouble(r0)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final double addAndGet(double r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.value
            long r0 = r0.get()
            double r2 = java.lang.Double.longBitsToDouble(r0)
            double r2 = r2 + r8
            long r4 = java.lang.Double.doubleToRawLongBits(r2)
            java.util.concurrent.atomic.AtomicLong r6 = r7.value
            boolean r0 = r6.compareAndSet(r0, r4)
            if (r0 == 0) goto L0
            return r2
    }

    public final boolean compareAndSet(double r2, double r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.value
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            boolean r2 = r0.compareAndSet(r2, r4)
            return r2
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            double r0 = r2.get()
            return r0
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            double r0 = r2.get()
            float r0 = (float) r0
            return r0
    }

    public final double get() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.value
            long r0 = r0.get()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final double getAndAdd(double r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.value
            long r0 = r0.get()
            double r2 = java.lang.Double.longBitsToDouble(r0)
            double r4 = r2 + r8
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            java.util.concurrent.atomic.AtomicLong r6 = r7.value
            boolean r0 = r6.compareAndSet(r0, r4)
            if (r0 == 0) goto L0
            return r2
    }

    public final double getAndSet(double r2) {
            r1 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.util.concurrent.atomic.AtomicLong r0 = r1.value
            long r2 = r0.getAndSet(r2)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            return r2
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            double r0 = r2.get()
            int r0 = (int) r0
            return r0
    }

    public final void lazySet(double r2) {
            r1 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.util.concurrent.atomic.AtomicLong r0 = r1.value
            r0.lazySet(r2)
            return
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            double r0 = r2.get()
            long r0 = (long) r0
            return r0
    }

    public final void set(double r2) {
            r1 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.util.concurrent.atomic.AtomicLong r0 = r1.value
            r0.set(r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            double r0 = r2.get()
            java.lang.String r0 = java.lang.Double.toString(r0)
            return r0
    }

    public final boolean weakCompareAndSet(double r2, double r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.value
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            boolean r2 = r0.weakCompareAndSet(r2, r4)
            return r2
    }
}
