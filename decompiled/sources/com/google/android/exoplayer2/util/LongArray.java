package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
            r1 = this;
            r0 = 32
            r1.<init>(r0)
            return
    }

    public LongArray(int r1) {
            r0 = this;
            r0.<init>()
            long[] r1 = new long[r1]
            r0.values = r1
            return
    }

    public void add(long r4) {
            r3 = this;
            int r0 = r3.size
            long[] r1 = r3.values
            int r2 = r1.length
            if (r0 != r2) goto Lf
            int r0 = r0 * 2
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.values = r0
        Lf:
            long[] r0 = r3.values
            int r1 = r3.size
            int r2 = r1 + 1
            r3.size = r2
            r0[r1] = r4
            return
    }

    public long get(int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3.size
            if (r4 >= r0) goto Lb
            long[] r0 = r3.values
            r1 = r0[r4]
            return r1
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Invalid index "
            java.lang.String r2 = ", size is "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
            int r1 = r3.size
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public long[] toArray() {
            r2 = this;
            long[] r0 = r2.values
            int r1 = r2.size
            long[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }
}
