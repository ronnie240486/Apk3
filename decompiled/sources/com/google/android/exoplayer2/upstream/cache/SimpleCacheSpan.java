package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
final class SimpleCacheSpan extends com.google.android.exoplayer2.upstream.cache.CacheSpan {
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V1 = null;
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V2 = null;
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V3 = null;
    private static final java.lang.String SUFFIX = ".v3.exo";

    static {
            java.lang.String r0 = "^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$"
            r1 = 32
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.CACHE_FILE_PATTERN_V1 = r0
            java.lang.String r0 = "^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.CACHE_FILE_PATTERN_V2 = r0
            java.lang.String r0 = "^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.CACHE_FILE_PATTERN_V3 = r0
            return
    }

    private SimpleCacheSpan(java.lang.String r1, long r2, long r4, long r6, @androidx.annotation.Nullable java.io.File r8) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6, r8)
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createCacheEntry(java.io.File r13, long r14, long r16, com.google.android.exoplayer2.upstream.cache.CachedContentIndex r18) {
            r0 = r18
            java.lang.String r1 = r13.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 0
            if (r2 != 0) goto L1e
            r2 = r13
            java.io.File r1 = upgradeFile(r13, r0)
            if (r1 != 0) goto L17
            return r3
        L17:
            java.lang.String r2 = r1.getName()
            r12 = r1
            r1 = r2
            goto L20
        L1e:
            r2 = r13
            r12 = r2
        L20:
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.CACHE_FILE_PATTERN_V3
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L2d
            return r3
        L2d:
            r2 = 1
            java.lang.String r2 = r1.group(r2)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r5 = r0.getKeyForId(r2)
            if (r5 != 0) goto L43
            return r3
        L43:
            r6 = -1
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 != 0) goto L4f
            long r6 = r12.length()
            r8 = r6
            goto L50
        L4f:
            r8 = r14
        L50:
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L57
            return r3
        L57:
            r0 = 2
            java.lang.String r0 = r1.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r6 = java.lang.Long.parseLong(r0)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 != 0) goto L80
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            r10 = r0
            goto L82
        L80:
            r10 = r16
        L82:
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r0 = new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan
            r4 = r0
            r4.<init>(r5, r6, r8, r10, r12)
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createCacheEntry(java.io.File r6, long r7, com.google.android.exoplayer2.upstream.cache.CachedContentIndex r9) {
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r6
            r1 = r7
            r5 = r9
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r6 = createCacheEntry(r0, r1, r3, r5)
            return r6
    }

    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createHole(java.lang.String r10, long r11, long r13) {
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r9 = new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4, r6, r8)
            return r9
    }

    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createLookup(java.lang.String r10, long r11) {
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r9 = new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan
            r4 = -1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r4, r6, r8)
            return r9
    }

    public static java.io.File getCacheFile(java.io.File r2, int r3, long r4, long r6) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            r1.append(r4)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = ".v3.exo"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.Nullable
    private static java.io.File upgradeFile(java.io.File r11, com.google.android.exoplayer2.upstream.cache.CachedContentIndex r12) {
            java.lang.String r0 = r11.getName()
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.CACHE_FILE_PATTERN_V2
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r2 = r1.matches()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            java.lang.String r0 = r1.group(r3)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.unescapeFileName(r0)
            goto L39
        L21:
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.CACHE_FILE_PATTERN_V1
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L38
            java.lang.String r0 = r1.group(r3)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 != 0) goto L3c
            return r4
        L3c:
            java.io.File r2 = r11.getParentFile()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r2)
            r5 = r2
            java.io.File r5 = (java.io.File) r5
            int r6 = r12.assignIdForKey(r0)
            r12 = 2
            java.lang.String r12 = r1.group(r12)
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            java.lang.String r12 = (java.lang.String) r12
            long r7 = java.lang.Long.parseLong(r12)
            r12 = 3
            java.lang.String r12 = r1.group(r12)
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            java.lang.String r12 = (java.lang.String) r12
            long r9 = java.lang.Long.parseLong(r12)
            java.io.File r12 = getCacheFile(r5, r6, r7, r9)
            boolean r11 = r11.renameTo(r12)
            if (r11 != 0) goto L74
            return r4
        L74:
            return r12
    }

    public com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan copyWithFileAndLastTouchTimestamp(java.io.File r11, long r12) {
            r10 = this;
            boolean r0 = r10.isCached
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan r0 = new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan
            java.lang.String r2 = r10.key
            long r3 = r10.position
            long r5 = r10.length
            r1 = r0
            r7 = r12
            r9 = r11
            r1.<init>(r2, r3, r5, r7, r9)
            return r0
    }
}
