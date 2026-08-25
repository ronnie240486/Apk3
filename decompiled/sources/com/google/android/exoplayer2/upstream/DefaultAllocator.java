package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAllocator implements com.google.android.exoplayer2.upstream.Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private com.google.android.exoplayer2.upstream.Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;

    @androidx.annotation.Nullable
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultAllocator(boolean r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            if (r7 < 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r4.trimOnReset = r5
            r4.individualAllocationSize = r6
            r4.availableCount = r7
            int r5 = r7 + 100
            com.google.android.exoplayer2.upstream.Allocation[] r5 = new com.google.android.exoplayer2.upstream.Allocation[r5]
            r4.availableAllocations = r5
            if (r7 <= 0) goto L3a
            int r5 = r7 * r6
            byte[] r5 = new byte[r5]
            r4.initialAllocationBlock = r5
        L28:
            if (r1 >= r7) goto L3d
            int r5 = r1 * r6
            com.google.android.exoplayer2.upstream.Allocation[] r0 = r4.availableAllocations
            com.google.android.exoplayer2.upstream.Allocation r2 = new com.google.android.exoplayer2.upstream.Allocation
            byte[] r3 = r4.initialAllocationBlock
            r2.<init>(r3, r5)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L28
        L3a:
            r5 = 0
            r4.initialAllocationBlock = r5
        L3d:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized com.google.android.exoplayer2.upstream.Allocation allocate() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.allocatedCount     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + 1
            r4.allocatedCount = r0     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.availableCount     // Catch: java.lang.Throwable -> L3f
            if (r0 <= 0) goto L21
            com.google.android.exoplayer2.upstream.Allocation[] r1 = r4.availableAllocations     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + (-1)
            r4.availableCount = r0     // Catch: java.lang.Throwable -> L3f
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L3f
            com.google.android.exoplayer2.upstream.Allocation r0 = (com.google.android.exoplayer2.upstream.Allocation) r0     // Catch: java.lang.Throwable -> L3f
            com.google.android.exoplayer2.upstream.Allocation[] r1 = r4.availableAllocations     // Catch: java.lang.Throwable -> L3f
            int r2 = r4.availableCount     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L21:
            com.google.android.exoplayer2.upstream.Allocation r0 = new com.google.android.exoplayer2.upstream.Allocation     // Catch: java.lang.Throwable -> L3f
            int r1 = r4.individualAllocationSize     // Catch: java.lang.Throwable -> L3f
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L3f
            int r1 = r4.allocatedCount     // Catch: java.lang.Throwable -> L3f
            com.google.android.exoplayer2.upstream.Allocation[] r2 = r4.availableAllocations     // Catch: java.lang.Throwable -> L3f
            int r3 = r2.length     // Catch: java.lang.Throwable -> L3f
            if (r1 <= r3) goto L3d
            int r1 = r2.length     // Catch: java.lang.Throwable -> L3f
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.lang.Throwable -> L3f
            com.google.android.exoplayer2.upstream.Allocation[] r1 = (com.google.android.exoplayer2.upstream.Allocation[]) r1     // Catch: java.lang.Throwable -> L3f
            r4.availableAllocations = r1     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r4)
            return r0
        L3f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
            r1 = this;
            int r0 = r1.individualAllocationSize
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.allocatedCount     // Catch: java.lang.Throwable -> L9
            int r1 = r2.individualAllocationSize     // Catch: java.lang.Throwable -> L9
            int r0 = r0 * r1
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(com.google.android.exoplayer2.upstream.Allocation r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.exoplayer2.upstream.Allocation[] r0 = r3.availableAllocations     // Catch: java.lang.Throwable -> L16
            int r1 = r3.availableCount     // Catch: java.lang.Throwable -> L16
            int r2 = r1 + 1
            r3.availableCount = r2     // Catch: java.lang.Throwable -> L16
            r0[r1] = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r3.allocatedCount     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + (-1)
            r3.allocatedCount = r4     // Catch: java.lang.Throwable -> L16
            r3.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return
        L16:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.Allocator.AllocationNode r4) {
            r3 = this;
            monitor-enter(r3)
        L1:
            if (r4 == 0) goto L1c
            com.google.android.exoplayer2.upstream.Allocation[] r0 = r3.availableAllocations     // Catch: java.lang.Throwable -> L21
            int r1 = r3.availableCount     // Catch: java.lang.Throwable -> L21
            int r2 = r1 + 1
            r3.availableCount = r2     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.Allocation r2 = r4.getAllocation()     // Catch: java.lang.Throwable -> L21
            r0[r1] = r2     // Catch: java.lang.Throwable -> L21
            int r0 = r3.allocatedCount     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + (-1)
            r3.allocatedCount = r0     // Catch: java.lang.Throwable -> L21
            com.google.android.exoplayer2.upstream.Allocator$AllocationNode r4 = r4.next()     // Catch: java.lang.Throwable -> L21
            goto L1
        L1c:
            r3.notifyAll()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)
            return
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.trimOnReset     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L9
            r0 = 0
            r1.setTargetBufferSize(r0)     // Catch: java.lang.Throwable -> Lb
        L9:
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void setTargetBufferSize(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.targetBufferSize     // Catch: java.lang.Throwable -> L11
            if (r2 >= r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            r1.targetBufferSize = r2     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            r1.trim()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.targetBufferSize     // Catch: java.lang.Throwable -> L68
            int r1 = r7.individualAllocationSize     // Catch: java.lang.Throwable -> L68
            int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)     // Catch: java.lang.Throwable -> L68
            int r1 = r7.allocatedCount     // Catch: java.lang.Throwable -> L68
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L68
            int r2 = r7.availableCount     // Catch: java.lang.Throwable -> L68
            if (r0 < r2) goto L17
            monitor-exit(r7)
            return
        L17:
            byte[] r3 = r7.initialAllocationBlock     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L5c
            int r2 = r2 + (-1)
        L1d:
            if (r1 > r2) goto L52
            com.google.android.exoplayer2.upstream.Allocation[] r3 = r7.availableAllocations     // Catch: java.lang.Throwable -> L68
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L68
            com.google.android.exoplayer2.upstream.Allocation r3 = (com.google.android.exoplayer2.upstream.Allocation) r3     // Catch: java.lang.Throwable -> L68
            byte[] r4 = r3.data     // Catch: java.lang.Throwable -> L68
            byte[] r5 = r7.initialAllocationBlock     // Catch: java.lang.Throwable -> L68
            if (r4 != r5) goto L32
            int r1 = r1 + 1
            goto L1d
        L32:
            com.google.android.exoplayer2.upstream.Allocation[] r4 = r7.availableAllocations     // Catch: java.lang.Throwable -> L68
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L68
            com.google.android.exoplayer2.upstream.Allocation r4 = (com.google.android.exoplayer2.upstream.Allocation) r4     // Catch: java.lang.Throwable -> L68
            byte[] r5 = r4.data     // Catch: java.lang.Throwable -> L68
            byte[] r6 = r7.initialAllocationBlock     // Catch: java.lang.Throwable -> L68
            if (r5 == r6) goto L45
            int r2 = r2 + (-1)
            goto L1d
        L45:
            com.google.android.exoplayer2.upstream.Allocation[] r5 = r7.availableAllocations     // Catch: java.lang.Throwable -> L68
            int r6 = r1 + 1
            r5[r1] = r4     // Catch: java.lang.Throwable -> L68
            int r1 = r2 + (-1)
            r5[r2] = r3     // Catch: java.lang.Throwable -> L68
            r2 = r1
            r1 = r6
            goto L1d
        L52:
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L68
            int r1 = r7.availableCount     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L5c
            monitor-exit(r7)
            return
        L5c:
            com.google.android.exoplayer2.upstream.Allocation[] r1 = r7.availableAllocations     // Catch: java.lang.Throwable -> L68
            int r2 = r7.availableCount     // Catch: java.lang.Throwable -> L68
            r3 = 0
            java.util.Arrays.fill(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L68
            r7.availableCount = r0     // Catch: java.lang.Throwable -> L68
            monitor-exit(r7)
            return
        L68:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }
}
