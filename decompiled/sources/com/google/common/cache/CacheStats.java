package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long r19, long r21, long r23, long r25, long r27, long r29) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r23
            r7 = r25
            r9 = r27
            r11 = r29
            r18.<init>()
            r13 = 1
            r14 = 0
            r15 = 0
            int r17 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r17 < 0) goto L1c
            r17 = 1
            goto L1e
        L1c:
            r17 = 0
        L1e:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r17 < 0) goto L28
            r17 = 1
            goto L2a
        L28:
            r17 = 0
        L2a:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r17 < 0) goto L34
            r17 = 1
            goto L36
        L34:
            r17 = 0
        L36:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r17 < 0) goto L40
            r17 = 1
            goto L42
        L40:
            r17 = 0
        L42:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 < 0) goto L4c
            r17 = 1
            goto L4e
        L4c:
            r17 = 0
        L4e:
            com.google.common.base.Preconditions.checkArgument(r17)
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 < 0) goto L56
            goto L57
        L56:
            r13 = 0
        L57:
            com.google.common.base.Preconditions.checkArgument(r13)
            r0.hitCount = r1
            r0.missCount = r3
            r0.loadSuccessCount = r5
            r0.loadExceptionCount = r7
            r0.totalLoadTime = r9
            r0.evictionCount = r11
            return
    }

    public double averageLoadPenalty() {
            r5 = this;
            long r0 = r5.loadSuccessCount
            long r2 = r5.loadExceptionCount
            long r0 = com.google.common.math.LongMath.saturatedAdd(r0, r2)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            r0 = 0
            goto L17
        L11:
            long r2 = r5.totalLoadTime
            double r2 = (double) r2
            double r0 = (double) r0
            double r0 = r2 / r0
        L17:
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.common.cache.CacheStats
            r1 = 0
            if (r0 == 0) goto L38
            com.google.common.cache.CacheStats r7 = (com.google.common.cache.CacheStats) r7
            long r2 = r6.hitCount
            long r4 = r7.hitCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L38
            long r2 = r6.missCount
            long r4 = r7.missCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L38
            long r2 = r6.loadSuccessCount
            long r4 = r7.loadSuccessCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L38
            long r2 = r6.loadExceptionCount
            long r4 = r7.loadExceptionCount
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L38
            long r2 = r6.totalLoadTime
            long r4 = r7.totalLoadTime
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L38
            long r2 = r6.evictionCount
            long r4 = r7.evictionCount
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L38
            r1 = 1
        L38:
            return r1
    }

    public long evictionCount() {
            r2 = this;
            long r0 = r2.evictionCount
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.hitCount
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.missCount
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            long r1 = r3.loadSuccessCount
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            long r1 = r3.loadExceptionCount
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            long r1 = r3.totalLoadTime
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            long r1 = r3.evictionCount
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public long hitCount() {
            r2 = this;
            long r0 = r2.hitCount
            return r0
    }

    public double hitRate() {
            r5 = this;
            long r0 = r5.requestCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L13
        Ld:
            long r2 = r5.hitCount
            double r2 = (double) r2
            double r0 = (double) r0
            double r0 = r2 / r0
        L13:
            return r0
    }

    public long loadCount() {
            r4 = this;
            long r0 = r4.loadSuccessCount
            long r2 = r4.loadExceptionCount
            long r0 = com.google.common.math.LongMath.saturatedAdd(r0, r2)
            return r0
    }

    public long loadExceptionCount() {
            r2 = this;
            long r0 = r2.loadExceptionCount
            return r0
    }

    public double loadExceptionRate() {
            r5 = this;
            long r0 = r5.loadSuccessCount
            long r2 = r5.loadExceptionCount
            long r0 = com.google.common.math.LongMath.saturatedAdd(r0, r2)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            r0 = 0
            goto L17
        L11:
            long r2 = r5.loadExceptionCount
            double r2 = (double) r2
            double r0 = (double) r0
            double r0 = r2 / r0
        L17:
            return r0
    }

    public long loadSuccessCount() {
            r2 = this;
            long r0 = r2.loadSuccessCount
            return r0
    }

    public com.google.common.cache.CacheStats minus(com.google.common.cache.CacheStats r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.common.cache.CacheStats r14 = new com.google.common.cache.CacheStats
            long r2 = r0.hitCount
            long r4 = r1.hitCount
            long r2 = com.google.common.math.LongMath.saturatedSubtract(r2, r4)
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            long r6 = r0.missCount
            long r8 = r1.missCount
            long r6 = com.google.common.math.LongMath.saturatedSubtract(r6, r8)
            long r6 = java.lang.Math.max(r4, r6)
            long r8 = r0.loadSuccessCount
            long r10 = r1.loadSuccessCount
            long r8 = com.google.common.math.LongMath.saturatedSubtract(r8, r10)
            long r8 = java.lang.Math.max(r4, r8)
            long r10 = r0.loadExceptionCount
            long r12 = r1.loadExceptionCount
            long r10 = com.google.common.math.LongMath.saturatedSubtract(r10, r12)
            long r10 = java.lang.Math.max(r4, r10)
            long r12 = r0.totalLoadTime
            r15 = r10
            long r10 = r1.totalLoadTime
            long r10 = com.google.common.math.LongMath.saturatedSubtract(r12, r10)
            long r10 = java.lang.Math.max(r4, r10)
            long r12 = r0.evictionCount
            long r0 = r1.evictionCount
            long r0 = com.google.common.math.LongMath.saturatedSubtract(r12, r0)
            long r12 = java.lang.Math.max(r4, r0)
            r1 = r14
            r4 = r6
            r6 = r8
            r8 = r15
            r1.<init>(r2, r4, r6, r8, r10, r12)
            return r14
    }

    public long missCount() {
            r2 = this;
            long r0 = r2.missCount
            return r0
    }

    public double missRate() {
            r5 = this;
            long r0 = r5.requestCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r0 = 0
            goto L13
        Ld:
            long r2 = r5.missCount
            double r2 = (double) r2
            double r0 = (double) r0
            double r0 = r2 / r0
        L13:
            return r0
    }

    public com.google.common.cache.CacheStats plus(com.google.common.cache.CacheStats r16) {
            r15 = this;
            r0 = r15
            r1 = r16
            com.google.common.cache.CacheStats r14 = new com.google.common.cache.CacheStats
            long r2 = r0.hitCount
            long r4 = r1.hitCount
            long r2 = com.google.common.math.LongMath.saturatedAdd(r2, r4)
            long r4 = r0.missCount
            long r6 = r1.missCount
            long r4 = com.google.common.math.LongMath.saturatedAdd(r4, r6)
            long r6 = r0.loadSuccessCount
            long r8 = r1.loadSuccessCount
            long r6 = com.google.common.math.LongMath.saturatedAdd(r6, r8)
            long r8 = r0.loadExceptionCount
            long r10 = r1.loadExceptionCount
            long r8 = com.google.common.math.LongMath.saturatedAdd(r8, r10)
            long r10 = r0.totalLoadTime
            long r12 = r1.totalLoadTime
            long r10 = com.google.common.math.LongMath.saturatedAdd(r10, r12)
            long r12 = r0.evictionCount
            long r0 = r1.evictionCount
            long r12 = com.google.common.math.LongMath.saturatedAdd(r12, r0)
            r1 = r14
            r1.<init>(r2, r4, r6, r8, r10, r12)
            return r14
    }

    public long requestCount() {
            r4 = this;
            long r0 = r4.hitCount
            long r2 = r4.missCount
            long r0 = com.google.common.math.LongMath.saturatedAdd(r0, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r4)
            long r1 = r4.hitCount
            java.lang.String r3 = "hitCount"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            long r1 = r4.missCount
            java.lang.String r3 = "missCount"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            long r1 = r4.loadSuccessCount
            java.lang.String r3 = "loadSuccessCount"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            long r1 = r4.loadExceptionCount
            java.lang.String r3 = "loadExceptionCount"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            long r1 = r4.totalLoadTime
            java.lang.String r3 = "totalLoadTime"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            long r1 = r4.evictionCount
            java.lang.String r3 = "evictionCount"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r3, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long totalLoadTime() {
            r2 = this;
            long r0 = r2.totalLoadTime
            return r0
    }
}
