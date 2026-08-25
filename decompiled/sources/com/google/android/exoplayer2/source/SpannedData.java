package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
final class SpannedData<V> {
    private int memoizedReadIndex;
    private final com.google.android.exoplayer2.util.Consumer<V> removeCallback;
    private final android.util.SparseArray<V> spans;

    /* JADX INFO: renamed from: $r8$lambda$JNb-vRhK52ewUFOuqtqABNtXO9o, reason: not valid java name */
    public static /* synthetic */ void m249$r8$lambda$JNbvRhK52ewUFOuqtqABNtXO9o(java.lang.Object r0) {
            lambda$new$0(r0)
            return
    }

    public SpannedData() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0.INSTANCE$2
            r1.<init>(r0)
            return
    }

    public SpannedData(com.google.android.exoplayer2.util.Consumer<V> r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.spans = r0
            r1.removeCallback = r2
            r2 = -1
            r1.memoizedReadIndex = r2
            return
    }

    private static /* synthetic */ void lambda$new$0(java.lang.Object r0) {
            return
    }

    public void appendSpan(int r5, V r6) {
            r4 = this;
            int r0 = r4.memoizedReadIndex
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L17
            android.util.SparseArray<V> r0 = r4.spans
            int r0 = r0.size()
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r4.memoizedReadIndex = r1
        L17:
            android.util.SparseArray<V> r0 = r4.spans
            int r0 = r0.size()
            if (r0 <= 0) goto L42
            android.util.SparseArray<V> r0 = r4.spans
            int r3 = r0.size()
            int r3 = r3 - r2
            int r0 = r0.keyAt(r3)
            if (r5 < r0) goto L2d
            r1 = 1
        L2d:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            if (r0 != r5) goto L42
            com.google.android.exoplayer2.util.Consumer<V> r0 = r4.removeCallback
            android.util.SparseArray<V> r1 = r4.spans
            int r3 = r1.size()
            int r3 = r3 - r2
            java.lang.Object r1 = r1.valueAt(r3)
            r0.accept(r1)
        L42:
            android.util.SparseArray<V> r0 = r4.spans
            r0.append(r5, r6)
            return
    }

    public void clear() {
            r3 = this;
            r0 = 0
        L1:
            android.util.SparseArray<V> r1 = r3.spans
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            com.google.android.exoplayer2.util.Consumer<V> r1 = r3.removeCallback
            android.util.SparseArray<V> r2 = r3.spans
            java.lang.Object r2 = r2.valueAt(r0)
            r1.accept(r2)
            int r0 = r0 + 1
            goto L1
        L17:
            r0 = -1
            r3.memoizedReadIndex = r0
            android.util.SparseArray<V> r0 = r3.spans
            r0.clear()
            return
    }

    public void discardFrom(int r4) {
            r3 = this;
            android.util.SparseArray<V> r0 = r3.spans
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L25
            android.util.SparseArray<V> r1 = r3.spans
            int r1 = r1.keyAt(r0)
            if (r4 >= r1) goto L25
            com.google.android.exoplayer2.util.Consumer<V> r1 = r3.removeCallback
            android.util.SparseArray<V> r2 = r3.spans
            java.lang.Object r2 = r2.valueAt(r0)
            r1.accept(r2)
            android.util.SparseArray<V> r1 = r3.spans
            r1.removeAt(r0)
            int r0 = r0 + (-1)
            goto L8
        L25:
            android.util.SparseArray<V> r4 = r3.spans
            int r4 = r4.size()
            if (r4 <= 0) goto L3c
            int r4 = r3.memoizedReadIndex
            android.util.SparseArray<V> r0 = r3.spans
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r4 = java.lang.Math.min(r4, r0)
            goto L3d
        L3c:
            r4 = -1
        L3d:
            r3.memoizedReadIndex = r4
            return
    }

    public void discardTo(int r5) {
            r4 = this;
            r0 = 0
        L1:
            android.util.SparseArray<V> r1 = r4.spans
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L2f
            android.util.SparseArray<V> r1 = r4.spans
            int r2 = r0 + 1
            int r1 = r1.keyAt(r2)
            if (r5 < r1) goto L2f
            com.google.android.exoplayer2.util.Consumer<V> r1 = r4.removeCallback
            android.util.SparseArray<V> r3 = r4.spans
            java.lang.Object r3 = r3.valueAt(r0)
            r1.accept(r3)
            android.util.SparseArray<V> r1 = r4.spans
            r1.removeAt(r0)
            int r0 = r4.memoizedReadIndex
            if (r0 <= 0) goto L2d
            int r0 = r0 + (-1)
            r4.memoizedReadIndex = r0
        L2d:
            r0 = r2
            goto L1
        L2f:
            return
    }

    public V get(int r3) {
            r2 = this;
            int r0 = r2.memoizedReadIndex
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 0
            r2.memoizedReadIndex = r0
        L8:
            int r0 = r2.memoizedReadIndex
            if (r0 <= 0) goto L1b
            android.util.SparseArray<V> r1 = r2.spans
            int r0 = r1.keyAt(r0)
            if (r3 >= r0) goto L1b
            int r0 = r2.memoizedReadIndex
            int r0 = r0 + (-1)
            r2.memoizedReadIndex = r0
            goto L8
        L1b:
            int r0 = r2.memoizedReadIndex
            android.util.SparseArray<V> r1 = r2.spans
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L3a
            android.util.SparseArray<V> r0 = r2.spans
            int r1 = r2.memoizedReadIndex
            int r1 = r1 + 1
            int r0 = r0.keyAt(r1)
            if (r3 < r0) goto L3a
            int r0 = r2.memoizedReadIndex
            int r0 = r0 + 1
            r2.memoizedReadIndex = r0
            goto L1b
        L3a:
            android.util.SparseArray<V> r3 = r2.spans
            int r0 = r2.memoizedReadIndex
            java.lang.Object r3 = r3.valueAt(r0)
            return r3
    }

    public V getEndValue() {
            r2 = this;
            android.util.SparseArray<V> r0 = r2.spans
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.valueAt(r1)
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            android.util.SparseArray<V> r0 = r1.spans
            int r0 = r0.size()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
