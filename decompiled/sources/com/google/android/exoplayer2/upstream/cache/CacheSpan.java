package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
public class CacheSpan implements java.lang.Comparable<com.google.android.exoplayer2.upstream.cache.CacheSpan> {

    @androidx.annotation.Nullable
    public final java.io.File file;
    public final boolean isCached;
    public final java.lang.String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(java.lang.String r10, long r11, long r13) {
            r9 = this;
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4, r6, r8)
            return
    }

    public CacheSpan(java.lang.String r1, long r2, long r4, long r6, @androidx.annotation.Nullable java.io.File r8) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.position = r2
            r0.length = r4
            if (r8 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.isCached = r1
            r0.file = r8
            r0.lastTouchTimestamp = r6
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.android.exoplayer2.upstream.cache.CacheSpan r5) {
            r4 = this;
            java.lang.String r0 = r4.key
            java.lang.String r1 = r5.key
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            java.lang.String r0 = r4.key
            java.lang.String r5 = r5.key
            int r5 = r0.compareTo(r5)
            return r5
        L13:
            long r0 = r4.position
            long r2 = r5.position
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L20
            r5 = 0
            goto L25
        L20:
            if (r5 >= 0) goto L24
            r5 = -1
            goto L25
        L24:
            r5 = 1
        L25:
            return r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.upstream.cache.CacheSpan r1) {
            r0 = this;
            com.google.android.exoplayer2.upstream.cache.CacheSpan r1 = (com.google.android.exoplayer2.upstream.cache.CacheSpan) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean isHoleSpan() {
            r1 = this;
            boolean r0 = r1.isCached
            r0 = r0 ^ 1
            return r0
    }

    public boolean isOpenEnded() {
            r5 = this;
            long r0 = r5.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.position
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r1 = r3.length
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
