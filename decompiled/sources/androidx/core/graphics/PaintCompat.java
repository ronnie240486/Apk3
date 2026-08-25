package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PaintCompat {
    private static final java.lang.String EM_STRING = "m";
    private static final java.lang.String TOFU_STRING = "\udfffd";
    private static final java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> sRectThreadLocal = null;

    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean hasGlyph(android.graphics.Paint r0, java.lang.String r1) {
                boolean r0 = r0.hasGlyph(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setBlendMode(android.graphics.Paint r0, java.lang.Object r1) {
                android.graphics.BlendMode r1 = (android.graphics.BlendMode) r1
                r0.setBlendMode(r1)
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.graphics.PaintCompat.sRectThreadLocal = r0
            return
    }

    private PaintCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasGlyph(@androidx.annotation.NonNull android.graphics.Paint r9, @androidx.annotation.NonNull java.lang.String r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r9 = androidx.core.graphics.PaintCompat.Api23Impl.hasGlyph(r9, r10)
            return r9
        Lb:
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L1e
            char r3 = r10.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 == 0) goto L1e
            return r1
        L1e:
            java.lang.String r3 = "\udfffd"
            float r4 = r9.measureText(r3)
            java.lang.String r5 = "m"
            float r5 = r9.measureText(r5)
            float r6 = r9.measureText(r10)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L35
            return r2
        L35:
            int r8 = r10.length()
            int r8 = r10.codePointCount(r2, r8)
            if (r8 <= r1) goto L60
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L48
            return r2
        L48:
            r5 = 0
        L49:
            if (r5 >= r0) goto L5b
            int r8 = r10.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r9.measureText(r10, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L49
        L5b:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L60
            return r2
        L60:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L65
            return r1
        L65:
            androidx.core.util.Pair r4 = obtainEmptyRects()
            r5 = 2
            F r6 = r4.first
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r9.getTextBounds(r3, r2, r5, r6)
            S r3 = r4.second
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r9.getTextBounds(r10, r2, r0, r3)
            F r9 = r4.first
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            S r10 = r4.second
            boolean r9 = r9.equals(r10)
            r9 = r9 ^ r1
            return r9
    }

    private static androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect> obtainEmptyRects() {
            java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> r0 = androidx.core.graphics.PaintCompat.sRectThreadLocal
            java.lang.Object r1 = r0.get()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            if (r1 != 0) goto L1d
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.<init>(r2, r3)
            r0.set(r1)
            goto L2b
        L1d:
            F r0 = r1.first
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.setEmpty()
            S r0 = r1.second
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.setEmpty()
        L2b:
            return r1
    }

    public static boolean setBlendMode(@androidx.annotation.NonNull android.graphics.Paint r4, @androidx.annotation.Nullable androidx.core.graphics.BlendModeCompat r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 < r3) goto L12
            if (r5 == 0) goto Le
            java.lang.Object r2 = androidx.core.graphics.BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(r5)
        Le:
            androidx.core.graphics.PaintCompat.Api29Impl.setBlendMode(r4, r2)
            return r1
        L12:
            if (r5 == 0) goto L27
            android.graphics.PorterDuff$Mode r5 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r5)
            if (r5 == 0) goto L1f
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            r2.<init>(r5)
        L1f:
            r4.setXfermode(r2)
            if (r5 == 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            return r1
        L27:
            r4.setXfermode(r2)
            return r1
    }
}
