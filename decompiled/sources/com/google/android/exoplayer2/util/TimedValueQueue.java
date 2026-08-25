package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public TimedValueQueue(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = new long[r2]
            r1.timestamps = r0
            java.lang.Object[] r2 = newArray(r2)
            r1.values = r2
            return
    }

    private void addUnchecked(long r5, V r7) {
            r4 = this;
            int r0 = r4.first
            int r1 = r4.size
            int r0 = r0 + r1
            V[] r2 = r4.values
            int r3 = r2.length
            int r0 = r0 % r3
            long[] r3 = r4.timestamps
            r3[r0] = r5
            r2[r0] = r7
            int r1 = r1 + 1
            r4.size = r1
            return
    }

    private void clearBufferOnTimeDiscontinuity(long r4) {
            r3 = this;
            int r0 = r3.size
            if (r0 <= 0) goto L18
            int r1 = r3.first
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            V[] r0 = r3.values
            int r0 = r0.length
            int r1 = r1 % r0
            long[] r0 = r3.timestamps
            r1 = r0[r1]
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            r3.clear()
        L18:
            return
    }

    private void doubleCapacityIfFull() {
            r6 = this;
            V[] r0 = r6.values
            int r0 = r0.length
            int r1 = r6.size
            if (r1 >= r0) goto L8
            return
        L8:
            int r1 = r0 * 2
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = newArray(r1)
            int r3 = r6.first
            int r0 = r0 - r3
            long[] r4 = r6.timestamps
            r5 = 0
            java.lang.System.arraycopy(r4, r3, r2, r5, r0)
            V[] r3 = r6.values
            int r4 = r6.first
            java.lang.System.arraycopy(r3, r4, r1, r5, r0)
            int r3 = r6.first
            if (r3 <= 0) goto L30
            long[] r4 = r6.timestamps
            java.lang.System.arraycopy(r4, r5, r2, r0, r3)
            V[] r3 = r6.values
            int r4 = r6.first
            java.lang.System.arraycopy(r3, r5, r1, r0, r4)
        L30:
            r6.timestamps = r2
            r6.values = r1
            r6.first = r5
            return
    }

    private static <V> V[] newArray(int r0) {
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    @androidx.annotation.Nullable
    private V poll(long r9, boolean r11) {
            r8 = this;
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6:
            int r3 = r8.size
            if (r3 <= 0) goto L26
            long[] r3 = r8.timestamps
            int r4 = r8.first
            r4 = r3[r4]
            long r3 = r9 - r4
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L20
            if (r11 != 0) goto L26
            long r5 = -r3
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L20
            goto L26
        L20:
            java.lang.Object r0 = r8.popFirst()
            r1 = r3
            goto L6
        L26:
            return r0
    }

    @androidx.annotation.Nullable
    private V popFirst() {
            r5 = this;
            int r0 = r5.size
            r1 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            V[] r0 = r5.values
            int r2 = r5.first
            r3 = r0[r2]
            r4 = 0
            r0[r2] = r4
            int r2 = r2 + r1
            int r0 = r0.length
            int r2 = r2 % r0
            r5.first = r2
            int r0 = r5.size
            int r0 = r0 - r1
            r5.size = r0
            return r3
    }

    public synchronized void add(long r1, V r3) {
            r0 = this;
            monitor-enter(r0)
            r0.clearBufferOnTimeDiscontinuity(r1)     // Catch: java.lang.Throwable -> Lc
            r0.doubleCapacityIfFull()     // Catch: java.lang.Throwable -> Lc
            r0.addUnchecked(r1, r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized void clear() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.first = r0     // Catch: java.lang.Throwable -> Le
            r2.size = r0     // Catch: java.lang.Throwable -> Le
            V[] r0 = r2.values     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @androidx.annotation.Nullable
    public synchronized V poll(long r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            java.lang.Object r2 = r1.poll(r2, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.Nullable
    public synchronized V pollFirst() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.size     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            java.lang.Object r0 = r1.popFirst()     // Catch: java.lang.Throwable -> Ld
        Lb:
            monitor-exit(r1)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public synchronized V pollFloor(long r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r1.poll(r2, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
