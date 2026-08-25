package androidx.core.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckedTextViewCompat {
    private static final java.lang.String TAG = "CheckedTextViewCompat";

    /* JADX INFO: loaded from: classes.dex */
    public static class Api14Impl {
        private static java.lang.reflect.Field sCheckMarkDrawableField;
        private static boolean sResolved;

        private Api14Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private CheckedTextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getCheckMarkDrawable(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
            android.graphics.drawable.Drawable r0 = r0.getCheckMarkDrawable()
            return r0
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getCheckMarkTintList(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
            android.content.res.ColorStateList r0 = r0.getCheckMarkTintList()
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getCheckMarkTintMode()
            return r0
    }

    public static void setCheckMarkTintList(@androidx.annotation.NonNull android.widget.CheckedTextView r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0.setCheckMarkTintList(r1)
            return
    }

    public static void setCheckMarkTintMode(@androidx.annotation.NonNull android.widget.CheckedTextView r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0.setCheckMarkTintMode(r1)
            return
    }
}
