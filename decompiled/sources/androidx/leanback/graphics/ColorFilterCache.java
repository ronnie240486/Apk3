package androidx.leanback.graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorFilterCache {
    private static final android.util.SparseArray<androidx.leanback.graphics.ColorFilterCache> sColorToFiltersMap = null;
    private final android.graphics.PorterDuffColorFilter[] mFilters;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.leanback.graphics.ColorFilterCache.sColorToFiltersMap = r0
            return
    }

    private ColorFilterCache(int r6, int r7, int r8) {
            r5 = this;
            r5.<init>()
            r0 = 256(0x100, float:3.59E-43)
            android.graphics.PorterDuffColorFilter[] r0 = new android.graphics.PorterDuffColorFilter[r0]
            r5.mFilters = r0
            r0 = 0
        La:
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L20
            int r1 = android.graphics.Color.argb(r0, r6, r7, r8)
            android.graphics.PorterDuffColorFilter[] r2 = r5.mFilters
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.<init>(r1, r4)
            r2[r0] = r3
            int r0 = r0 + 1
            goto La
        L20:
            return
    }

    public static androidx.leanback.graphics.ColorFilterCache getColorFilterCache(int r5) {
            int r0 = android.graphics.Color.red(r5)
            int r1 = android.graphics.Color.green(r5)
            int r5 = android.graphics.Color.blue(r5)
            int r2 = android.graphics.Color.rgb(r0, r1, r5)
            android.util.SparseArray<androidx.leanback.graphics.ColorFilterCache> r3 = androidx.leanback.graphics.ColorFilterCache.sColorToFiltersMap
            java.lang.Object r4 = r3.get(r2)
            androidx.leanback.graphics.ColorFilterCache r4 = (androidx.leanback.graphics.ColorFilterCache) r4
            if (r4 != 0) goto L22
            androidx.leanback.graphics.ColorFilterCache r4 = new androidx.leanback.graphics.ColorFilterCache
            r4.<init>(r0, r1, r5)
            r3.put(r2, r4)
        L22:
            return r4
    }

    public android.graphics.ColorFilter getFilterForLevel(float r6) {
            r5 = this;
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L16
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r0
            int r6 = (int) r6
            android.graphics.PorterDuffColorFilter[] r0 = r5.mFilters
            r6 = r0[r6]
            return r6
        L16:
            r6 = 0
            return r6
    }
}
