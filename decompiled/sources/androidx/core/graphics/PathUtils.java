package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PathUtils {

    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float[] approximate(android.graphics.Path r0, float r1) {
                float[] r0 = r0.approximate(r1)
                return r0
        }
    }

    private PathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public static java.util.Collection<androidx.core.graphics.PathSegment> flatten(@androidx.annotation.NonNull android.graphics.Path r1) {
            r0 = 1056964608(0x3f000000, float:0.5)
            java.util.Collection r1 = flatten(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public static java.util.Collection<androidx.core.graphics.PathSegment> flatten(@androidx.annotation.NonNull android.graphics.Path r10, @androidx.annotation.FloatRange(from = 0.0d) float r11) {
            float[] r10 = androidx.core.graphics.PathUtils.Api26Impl.approximate(r10, r11)
            int r11 = r10.length
            int r11 = r11 / 3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            r1 = 1
        Ld:
            if (r1 >= r11) goto L4a
            int r2 = r1 * 3
            int r3 = r1 + (-1)
            int r3 = r3 * 3
            r4 = r10[r2]
            int r5 = r2 + 1
            r5 = r10[r5]
            int r2 = r2 + 2
            r2 = r10[r2]
            r6 = r10[r3]
            int r7 = r3 + 1
            r7 = r10[r7]
            int r3 = r3 + 2
            r3 = r10[r3]
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L47
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 != 0) goto L35
            int r8 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r8 == 0) goto L47
        L35:
            androidx.core.graphics.PathSegment r8 = new androidx.core.graphics.PathSegment
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r7, r3)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r5, r2)
            r8.<init>(r9, r6, r3, r4)
            r0.add(r8)
        L47:
            int r1 = r1 + 1
            goto Ld
        L4a:
            return r0
    }
}
