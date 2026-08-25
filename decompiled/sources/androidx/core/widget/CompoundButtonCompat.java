package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class CompoundButtonCompat {
    private static final java.lang.String TAG = "CompoundButtonCompat";
    private static java.lang.reflect.Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton r0) {
                android.content.res.ColorStateList r0 = r0.getButtonTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getButtonTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setButtonTintList(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
                r0.setButtonTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setButtonTintMode(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
                r0.setButtonTintMode(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton r0) {
                android.graphics.drawable.Drawable r0 = r0.getButtonDrawable()
                return r0
        }
    }

    private CompoundButtonCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getButtonDrawable(@androidx.annotation.NonNull android.widget.CompoundButton r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r4 = androidx.core.widget.CompoundButtonCompat.Api23Impl.getButtonDrawable(r4)
            return r4
        Lb:
            boolean r0 = androidx.core.widget.CompoundButtonCompat.sButtonDrawableFieldFetched
            java.lang.String r1 = "CompoundButtonCompat"
            if (r0 != 0) goto L28
            r0 = 1
            java.lang.Class<android.widget.CompoundButton> r2 = android.widget.CompoundButton.class
            java.lang.String r3 = "mButtonDrawable"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L20
            androidx.core.widget.CompoundButtonCompat.sButtonDrawableField = r2     // Catch: java.lang.NoSuchFieldException -> L20
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L20
            goto L26
        L20:
            r2 = move-exception
            java.lang.String r3 = "Failed to retrieve mButtonDrawable field"
            android.util.Log.i(r1, r3, r2)
        L26:
            androidx.core.widget.CompoundButtonCompat.sButtonDrawableFieldFetched = r0
        L28:
            java.lang.reflect.Field r0 = androidx.core.widget.CompoundButtonCompat.sButtonDrawableField
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L34
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: java.lang.IllegalAccessException -> L34
            return r4
        L34:
            r4 = move-exception
            java.lang.String r0 = "Failed to get button drawable via reflection"
            android.util.Log.i(r1, r0, r4)
            androidx.core.widget.CompoundButtonCompat.sButtonDrawableField = r2
        L3c:
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getButtonTintList(@androidx.annotation.NonNull android.widget.CompoundButton r0) {
            android.content.res.ColorStateList r0 = androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintList(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getButtonTintMode(@androidx.annotation.NonNull android.widget.CompoundButton r0) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintMode(r0)
            return r0
    }

    public static void setButtonTintList(@androidx.annotation.NonNull android.widget.CompoundButton r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintList(r0, r1)
            return
    }

    public static void setButtonTintMode(@androidx.annotation.NonNull android.widget.CompoundButton r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintMode(r0, r1)
            return
    }
}
