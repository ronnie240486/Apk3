package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface Allocator {

    public interface AllocationNode {
        com.google.android.exoplayer2.upstream.Allocation getAllocation();

        @androidx.annotation.Nullable
        com.google.android.exoplayer2.upstream.Allocator.AllocationNode next();
    }

    com.google.android.exoplayer2.upstream.Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(com.google.android.exoplayer2.upstream.Allocation r1);

    void release(com.google.android.exoplayer2.upstream.Allocator.AllocationNode r1);

    void trim();
}
