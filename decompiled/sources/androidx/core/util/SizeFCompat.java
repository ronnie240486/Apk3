package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(21)
    public static final class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static android.util.SizeF toSizeF(@androidx.annotation.NonNull androidx.core.util.SizeFCompat r2) {
                androidx.core.util.Preconditions.checkNotNull(r2)
                android.util.SizeF r0 = new android.util.SizeF
                float r1 = r2.getWidth()
                float r2 = r2.getHeight()
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static androidx.core.util.SizeFCompat toSizeFCompat(@androidx.annotation.NonNull android.util.SizeF r2) {
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.SizeFCompat r0 = new androidx.core.util.SizeFCompat
                float r1 = r2.getWidth()
                float r2 = r2.getHeight()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public SizeFCompat(float r2, float r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "width"
            float r2 = androidx.core.util.Preconditions.checkArgumentFinite(r2, r0)
            r1.mWidth = r2
            java.lang.String r2 = "height"
            float r2 = androidx.core.util.Preconditions.checkArgumentFinite(r3, r2)
            r1.mHeight = r2
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public static androidx.core.util.SizeFCompat toSizeFCompat(@androidx.annotation.NonNull android.util.SizeF r0) {
            androidx.core.util.SizeFCompat r0 = androidx.core.util.SizeFCompat.Api21Impl.toSizeFCompat(r0)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.core.util.SizeFCompat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.core.util.SizeFCompat r5 = (androidx.core.util.SizeFCompat) r5
            float r1 = r5.mWidth
            float r3 = r4.mWidth
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            float r5 = r5.mHeight
            float r1 = r4.mHeight
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public float getHeight() {
            r1 = this;
            float r0 = r1.mHeight
            return r0
    }

    public float getWidth() {
            r1 = this;
            float r0 = r1.mWidth
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.mWidth
            int r0 = java.lang.Float.floatToIntBits(r0)
            float r1 = r2.mHeight
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public android.util.SizeF toSizeF() {
            r1 = this;
            android.util.SizeF r0 = androidx.core.util.SizeFCompat.Api21Impl.toSizeF(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.mWidth
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            float r1 = r2.mHeight
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
