package com.google.android.exoplayer2.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class IntArrayQueue {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int[] data;
    private int headIndex;
    private int size;
    private int tailIndex;
    private int wrapAroundMask;

    public IntArrayQueue() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.headIndex = r0
            r1 = -1
            r2.tailIndex = r1
            r2.size = r0
            r0 = 16
            int[] r0 = new int[r0]
            r2.data = r0
            int r0 = r0.length
            int r0 = r0 + (-1)
            r2.wrapAroundMask = r0
            return
    }

    private void doubleArraySize() {
            r5 = this;
            int[] r0 = r5.data
            int r1 = r0.length
            int r1 = r1 << 1
            if (r1 < 0) goto L26
            int[] r1 = new int[r1]
            int r2 = r0.length
            int r3 = r5.headIndex
            int r2 = r2 - r3
            r4 = 0
            java.lang.System.arraycopy(r0, r3, r1, r4, r2)
            int[] r0 = r5.data
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            r5.headIndex = r4
            int r0 = r5.size
            int r0 = r0 + (-1)
            r5.tailIndex = r0
            r5.data = r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r5.wrapAroundMask = r0
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public void add(int r3) {
            r2 = this;
            int r0 = r2.size
            int[] r1 = r2.data
            int r1 = r1.length
            if (r0 != r1) goto La
            r2.doubleArraySize()
        La:
            int r0 = r2.tailIndex
            int r0 = r0 + 1
            int r1 = r2.wrapAroundMask
            r0 = r0 & r1
            r2.tailIndex = r0
            int[] r1 = r2.data
            r1[r0] = r3
            int r3 = r2.size
            int r3 = r3 + 1
            r2.size = r3
            return
    }

    public int capacity() {
            r1 = this;
            int[] r0 = r1.data
            int r0 = r0.length
            return r0
    }

    public void clear() {
            r2 = this;
            r0 = 0
            r2.headIndex = r0
            r1 = -1
            r2.tailIndex = r1
            r2.size = r0
            return
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int remove() {
            r4 = this;
            int r0 = r4.size
            if (r0 == 0) goto L16
            int[] r1 = r4.data
            int r2 = r4.headIndex
            r1 = r1[r2]
            int r2 = r2 + 1
            int r3 = r4.wrapAroundMask
            r2 = r2 & r3
            r4.headIndex = r2
            int r0 = r0 + (-1)
            r4.size = r0
            return r1
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
