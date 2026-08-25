package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class ThemeUtils {
    public static final int[] CHECKED_STATE_SET = null;
    public static final int[] DISABLED_STATE_SET = null;
    public static final int[] EMPTY_STATE_SET = null;
    public static final int[] FOCUSED_STATE_SET = null;
    public static final int[] PRESSED_STATE_SET = null;
    private static final java.lang.String TAG = "ThemeUtils";
    private static final int[] TEMP_ARRAY = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> TL_TYPED_VALUE = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r3 = 0
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.FOCUSED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.PRESSED_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r3] = r2
            androidx.appcompat.widget.ThemeUtils.CHECKED_STATE_SET = r1
            int[] r1 = new int[r3]
            androidx.appcompat.widget.ThemeUtils.EMPTY_STATE_SET = r1
            int[] r0 = new int[r0]
            androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY = r0
            return
    }

    private ThemeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkAppCompatTheme(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.content.Context r4) {
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r0)
            int r0 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar     // Catch: java.lang.Throwable -> L31
            boolean r0 = r4.hasValue(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L2d
            java.lang.String r0 = "ThemeUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "View "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L31
        L2d:
            r4.recycle()
            return
        L31:
            r3 = move-exception
            r4.recycle()
            throw r3
    }

    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList createDisabledStateList(int r4, int r5) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            int[] r2 = androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET
            r3 = 0
            r1[r3] = r2
            r0[r3] = r5
            int[] r5 = androidx.appcompat.widget.ThemeUtils.EMPTY_STATE_SET
            r2 = 1
            r1[r2] = r5
            r0[r2] = r4
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r1, r0)
            return r4
    }

    public static int getDisabledThemeAttrColor(@androidx.annotation.NonNull android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = getThemeAttrColorStateList(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            android.util.TypedValue r0 = getTypedValue()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            float r0 = r0.getFloat()
            int r4 = getThemeAttrColor(r4, r5)
            int r5 = android.graphics.Color.alpha(r4)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            int r4 = androidx.core.graphics.ColorUtils.setAlphaComponent(r4, r5)
            return r4
    }

    public static int getThemeAttrColor(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            r1 = 0
            r0[r1] = r3
            r3 = 0
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r2, r3, r0)
            int r3 = r2.getColor(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getThemeAttrColorStateList(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            r1 = 0
            r0[r1] = r3
            r3 = 0
            androidx.appcompat.widget.TintTypedArray r2 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r2, r3, r0)
            android.content.res.ColorStateList r3 = r2.getColorStateList(r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }
}
