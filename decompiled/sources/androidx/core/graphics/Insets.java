package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class Insets {

    @androidx.annotation.NonNull
    public static final androidx.core.graphics.Insets NONE = null;
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Insets of(int r0, int r1, int r2, int r3) {
                android.graphics.Insets r0 = android.graphics.Insets.of(r0, r1, r2, r3)
                return r0
        }
    }

    static {
            androidx.core.graphics.Insets r0 = new androidx.core.graphics.Insets
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            androidx.core.graphics.Insets.NONE = r0
            return
    }

    private Insets(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.top = r2
            r0.right = r3
            r0.bottom = r4
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.Insets add(@androidx.annotation.NonNull androidx.core.graphics.Insets r4, @androidx.annotation.NonNull androidx.core.graphics.Insets r5) {
            int r0 = r4.left
            int r1 = r5.left
            int r0 = r0 + r1
            int r1 = r4.top
            int r2 = r5.top
            int r1 = r1 + r2
            int r2 = r4.right
            int r3 = r5.right
            int r2 = r2 + r3
            int r4 = r4.bottom
            int r5 = r5.bottom
            int r4 = r4 + r5
            androidx.core.graphics.Insets r4 = of(r0, r1, r2, r4)
            return r4
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.Insets max(@androidx.annotation.NonNull androidx.core.graphics.Insets r4, @androidx.annotation.NonNull androidx.core.graphics.Insets r5) {
            int r0 = r4.left
            int r1 = r5.left
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r4.top
            int r2 = r5.top
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.right
            int r3 = r5.right
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r4.bottom
            int r5 = r5.bottom
            int r4 = java.lang.Math.max(r4, r5)
            androidx.core.graphics.Insets r4 = of(r0, r1, r2, r4)
            return r4
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.Insets min(@androidx.annotation.NonNull androidx.core.graphics.Insets r4, @androidx.annotation.NonNull androidx.core.graphics.Insets r5) {
            int r0 = r4.left
            int r1 = r5.left
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.top
            int r2 = r5.top
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r4.right
            int r3 = r5.right
            int r2 = java.lang.Math.min(r2, r3)
            int r4 = r4.bottom
            int r5 = r5.bottom
            int r4 = java.lang.Math.min(r4, r5)
            androidx.core.graphics.Insets r4 = of(r0, r1, r2, r4)
            return r4
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.Insets of(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            return r1
        Lb:
            androidx.core.graphics.Insets r0 = new androidx.core.graphics.Insets
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.Insets of(@androidx.annotation.NonNull android.graphics.Rect r3) {
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            androidx.core.graphics.Insets r3 = of(r0, r1, r2, r3)
            return r3
    }

    @androidx.annotation.NonNull
    public static androidx.core.graphics.Insets subtract(@androidx.annotation.NonNull androidx.core.graphics.Insets r4, @androidx.annotation.NonNull androidx.core.graphics.Insets r5) {
            int r0 = r4.left
            int r1 = r5.left
            int r0 = r0 - r1
            int r1 = r4.top
            int r2 = r5.top
            int r1 = r1 - r2
            int r2 = r4.right
            int r3 = r5.right
            int r2 = r2 - r3
            int r4 = r4.bottom
            int r5 = r5.bottom
            int r4 = r4 - r5
            androidx.core.graphics.Insets r4 = of(r0, r1, r2, r4)
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 29)
    public static androidx.core.graphics.Insets toCompatInsets(@androidx.annotation.NonNull android.graphics.Insets r3) {
            int r0 = r3.left
            int r1 = r3.top
            int r2 = r3.right
            int r3 = r3.bottom
            androidx.core.graphics.Insets r3 = of(r0, r1, r2, r3)
            return r3
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    @androidx.annotation.RequiresApi(api = 29)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.graphics.Insets wrap(@androidx.annotation.NonNull android.graphics.Insets r0) {
            androidx.core.graphics.Insets r0 = toCompatInsets(r0)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<androidx.core.graphics.Insets> r2 = androidx.core.graphics.Insets.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            androidx.core.graphics.Insets r5 = (androidx.core.graphics.Insets) r5
            int r2 = r4.bottom
            int r3 = r5.bottom
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.left
            int r3 = r5.left
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.right
            int r3 = r5.right
            if (r2 == r3) goto L27
            return r1
        L27:
            int r2 = r4.top
            int r5 = r5.top
            if (r2 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.left
            int r0 = r0 * 31
            int r1 = r2.top
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.right
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.bottom
            int r0 = r0 + r1
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(29)
    public android.graphics.Insets toPlatformInsets() {
            r4 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r3 = r4.bottom
            android.graphics.Insets r0 = androidx.core.graphics.Insets.Api29Impl.of(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Insets{left="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.left
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r3.top
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r3.right
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r1 = r3.bottom
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
