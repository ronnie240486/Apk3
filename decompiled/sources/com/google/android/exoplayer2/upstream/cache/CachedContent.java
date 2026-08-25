package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
final class CachedContent {
    private static final java.lang.String TAG = "CachedContent";
    private final java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> cachedSpans;
    public final int id;
    public final java.lang.String key;
    private final java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent.Range> lockedRanges;
    private com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata metadata;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Range {
        public final long length;
        public final long position;

        public Range(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.position = r1
                r0.length = r3
                return
        }

        public boolean contains(long r8, long r10) {
                r7 = this;
                long r0 = r7.length
                r2 = 1
                r3 = -1
                r5 = 0
                int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r6 != 0) goto L13
                long r10 = r7.position
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 < 0) goto L11
                goto L12
            L11:
                r2 = 0
            L12:
                return r2
            L13:
                int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r6 != 0) goto L18
                return r5
            L18:
                long r3 = r7.position
                int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r6 > 0) goto L25
                long r8 = r8 + r10
                long r3 = r3 + r0
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 > 0) goto L25
                goto L26
            L25:
                r2 = 0
            L26:
                return r2
        }

        public boolean intersects(long r8, long r10) {
                r7 = this;
                long r0 = r7.position
                r2 = 0
                r3 = 1
                r4 = -1
                int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r6 > 0) goto L17
                long r10 = r7.length
                int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r6 == 0) goto L15
                long r0 = r0 + r10
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r10 <= 0) goto L16
            L15:
                r2 = 1
            L16:
                return r2
            L17:
                int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r6 == 0) goto L20
                long r8 = r8 + r10
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 <= 0) goto L21
            L20:
                r2 = 1
            L21:
                return r2
        }
    }

    public CachedContent(int r2, java.lang.String r3) {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0 = com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.EMPTY
            r1.<init>(r2, r3, r0)
            return
    }

    public CachedContent(int r1, java.lang.String r2, com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r3) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.key = r2
            r0.metadata = r3
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            r0.cachedSpans = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.lockedRanges = r1
            return
    }

    public void addSpan(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r2) {
            r1 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r0 = r1.cachedSpans
            r0.add(r2)
            return
    }

    public boolean applyMetadataMutations(com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r2) {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0 = r1.metadata
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r2 = r0.copyWithMutationsApplied(r2)
            r1.metadata = r2
            boolean r2 = r2.equals(r0)
            r2 = r2 ^ 1
            return r2
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L39
            java.lang.Class<com.google.android.exoplayer2.upstream.cache.CachedContent> r2 = com.google.android.exoplayer2.upstream.cache.CachedContent.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L39
        L10:
            com.google.android.exoplayer2.upstream.cache.CachedContent r5 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r5
            int r2 = r4.id
            int r3 = r5.id
            if (r2 != r3) goto L37
            java.lang.String r2 = r4.key
            java.lang.String r3 = r5.key
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L37
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r2 = r4.cachedSpans
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r3 = r5.cachedSpans
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L37
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r2 = r4.metadata
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r5 = r5.metadata
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
        L39:
            return r1
    }

    public long getCachedBytesLength(long r12, long r14) {
            r11 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r4)
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r0 = r11.getSpan(r12, r14)
            boolean r4 = r0.isHoleSpan()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 == 0) goto L35
            boolean r12 = r0.isOpenEnded()
            if (r12 == 0) goto L2d
            goto L2f
        L2d:
            long r5 = r0.length
        L2f:
            long r12 = java.lang.Math.min(r5, r14)
            long r12 = -r12
            return r12
        L35:
            long r7 = r12 + r14
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3c
            goto L3d
        L3c:
            r5 = r7
        L3d:
            long r2 = r0.position
            long r7 = r0.length
            long r2 = r2 + r7
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L6e
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r4 = r11.cachedSpans
            java.util.NavigableSet r0 = r4.tailSet(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r1 = (com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan) r1
            long r7 = r1.position
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L63
            goto L6e
        L63:
            long r9 = r1.length
            long r7 = r7 + r9
            long r2 = java.lang.Math.max(r2, r7)
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 < 0) goto L50
        L6e:
            long r2 = r2 - r12
            long r12 = java.lang.Math.min(r2, r14)
            return r12
    }

    public com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata getMetadata() {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0 = r1.metadata
            return r0
    }

    public com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan getSpan(long r7, long r9) {
            r6 = this;
            java.lang.String r0 = r6.key
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r0 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createLookup(r0, r7)
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r1 = r6.cachedSpans
            java.lang.Object r1 = r1.floor(r0)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r1 = (com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan) r1
            if (r1 == 0) goto L1a
            long r2 = r1.position
            long r4 = r1.length
            long r2 = r2 + r4
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L1a
            return r1
        L1a:
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r1 = r6.cachedSpans
            java.lang.Object r0 = r1.ceiling(r0)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r0 = (com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan) r0
            if (r0 == 0) goto L33
            long r0 = r0.position
            long r0 = r0 - r7
            r2 = -1
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            r9 = r0
            goto L33
        L2f:
            long r9 = java.lang.Math.min(r0, r9)
        L33:
            java.lang.String r0 = r6.key
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r7 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.createHole(r0, r7, r9)
            return r7
    }

    public java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> getSpans() {
            r1 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r0 = r1.cachedSpans
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.id
            int r0 = r0 * 31
            java.lang.String r1 = r3.key
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r1 = r3.metadata
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r0 = r1.cachedSpans
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isFullyLocked(long r4, long r6) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r2 = r3.lockedRanges
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r2 = r3.lockedRanges
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.upstream.cache.CachedContent$Range r2 = (com.google.android.exoplayer2.upstream.cache.CachedContent.Range) r2
            boolean r2 = r2.contains(r4, r6)
            if (r2 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    public boolean isFullyUnlocked() {
            r1 = this;
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r0 = r1.lockedRanges
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean lockRange(long r4, long r6) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r2 = r3.lockedRanges
            int r2 = r2.size()
            if (r1 >= r2) goto L1c
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r2 = r3.lockedRanges
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.upstream.cache.CachedContent$Range r2 = (com.google.android.exoplayer2.upstream.cache.CachedContent.Range) r2
            boolean r2 = r2.intersects(r4, r6)
            if (r2 == 0) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r0 = r3.lockedRanges
            com.google.android.exoplayer2.upstream.cache.CachedContent$Range r1 = new com.google.android.exoplayer2.upstream.cache.CachedContent$Range
            r1.<init>(r4, r6)
            r0.add(r1)
            r4 = 1
            return r4
    }

    public boolean removeSpan(com.google.android.exoplayer2.upstream.cache.CacheSpan r2) {
            r1 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r0 = r1.cachedSpans
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L11
            java.io.File r2 = r2.file
            if (r2 == 0) goto Lf
            r2.delete()
        Lf:
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan setLastTouchTimestamp(com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r8, long r9, boolean r11) {
            r7 = this;
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r0 = r7.cachedSpans
            boolean r0 = r0.remove(r8)
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.io.File r0 = r8.file
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.io.File r0 = (java.io.File) r0
            if (r11 == 0) goto L4d
            java.io.File r11 = r0.getParentFile()
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            r1 = r11
            java.io.File r1 = (java.io.File) r1
            long r3 = r8.position
            int r2 = r7.id
            r5 = r9
            java.io.File r11 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.getCacheFile(r1, r2, r3, r5)
            boolean r1 = r0.renameTo(r11)
            if (r1 == 0) goto L2f
            r0 = r11
            goto L4d
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to rename "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "CachedContent"
            com.google.android.exoplayer2.util.Log.w(r1, r11)
        L4d:
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r8 = r8.copyWithFileAndLastTouchTimestamp(r0, r9)
            java.util.TreeSet<com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan> r9 = r7.cachedSpans
            r9.add(r8)
            return r8
    }

    public void unlockRange(long r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r1 = r4.lockedRanges
            int r1 = r1.size()
            if (r0 >= r1) goto L20
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r1 = r4.lockedRanges
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.upstream.cache.CachedContent$Range r1 = (com.google.android.exoplayer2.upstream.cache.CachedContent.Range) r1
            long r1 = r1.position
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L1d
            java.util.ArrayList<com.google.android.exoplayer2.upstream.cache.CachedContent$Range> r5 = r4.lockedRanges
            r5.remove(r0)
            return
        L1d:
            int r0 = r0 + 1
            goto L1
        L20:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
    }
}
