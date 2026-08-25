package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @androidx.annotation.NonNull
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private androidx.appcompat.widget.TintInfo mDrawableBottomTint;
    private androidx.appcompat.widget.TintInfo mDrawableEndTint;
    private androidx.appcompat.widget.TintInfo mDrawableLeftTint;
    private androidx.appcompat.widget.TintInfo mDrawableRightTint;
    private androidx.appcompat.widget.TintInfo mDrawableStartTint;
    private androidx.appcompat.widget.TintInfo mDrawableTint;
    private androidx.appcompat.widget.TintInfo mDrawableTopTint;
    private android.graphics.Typeface mFontTypeface;
    private int mFontWeight;
    private int mStyle;

    @androidx.annotation.NonNull
    private final android.widget.TextView mView;



    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView r0) {
                android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
                r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTextLocale(android.widget.TextView r0, java.util.Locale r1) {
                r0.setTextLocale(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.util.Locale forLanguageTag(java.lang.String r0) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.LocaleList forLanguageTags(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setTextLocales(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getAutoSizeStepGranularity(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeStepGranularity()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean setFontVariationSettings(android.widget.TextView r0, java.lang.String r1) {
                boolean r0 = r0.setFontVariationSettings(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Typeface create(android.graphics.Typeface r0, int r1, boolean r2) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
                return r0
        }
    }

    public AppCompatTextHelper(@androidx.annotation.NonNull android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStyle = r0
            r0 = -1
            r1.mFontWeight = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
            r0.<init>(r2)
            r1.mAutoSizeTextHelper = r0
            return
    }

    private void applyCompoundDrawableTint(android.graphics.drawable.Drawable r3, androidx.appcompat.widget.TintInfo r4) {
            r2 = this;
            if (r3 == 0) goto Lf
            if (r4 == 0) goto Lf
            android.widget.TextView r0 = r2.mView
            int[] r0 = r0.getDrawableState()
            int r1 = androidx.appcompat.widget.AppCompatDrawableManager.$r8$clinit
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r3, r4, r0)
        Lf:
            return
    }

    private static androidx.appcompat.widget.TintInfo createTintInfo(android.content.Context r0, androidx.appcompat.widget.AppCompatDrawableManager r1, int r2) {
            android.content.res.ColorStateList r0 = r1.getTintList(r0, r2)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.TintInfo r1 = new androidx.appcompat.widget.TintInfo
            r1.<init>()
            r2 = 1
            r1.mHasTintList = r2
            r1.mTintList = r0
            return r1
        L11:
            r0 = 0
            return r0
    }

    private void setCompoundDrawables(android.graphics.drawable.Drawable r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10) {
            r4 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            r3 = 0
            if (r9 != 0) goto L54
            if (r10 == 0) goto L9
            goto L54
        L9:
            if (r5 != 0) goto L11
            if (r6 != 0) goto L11
            if (r7 != 0) goto L11
            if (r8 == 0) goto L73
        L11:
            android.widget.TextView r9 = r4.mView
            android.graphics.drawable.Drawable[] r9 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r9)
            r10 = r9[r3]
            if (r10 != 0) goto L40
            r10 = r9[r2]
            if (r10 == 0) goto L20
            goto L40
        L20:
            android.widget.TextView r9 = r4.mView
            android.graphics.drawable.Drawable[] r9 = r9.getCompoundDrawables()
            android.widget.TextView r10 = r4.mView
            if (r5 == 0) goto L2b
            goto L2d
        L2b:
            r5 = r9[r3]
        L2d:
            if (r6 == 0) goto L30
            goto L32
        L30:
            r6 = r9[r1]
        L32:
            if (r7 == 0) goto L35
            goto L37
        L35:
            r7 = r9[r2]
        L37:
            if (r8 == 0) goto L3a
            goto L3c
        L3a:
            r8 = r9[r0]
        L3c:
            r10.setCompoundDrawablesWithIntrinsicBounds(r5, r6, r7, r8)
            goto L73
        L40:
            android.widget.TextView r5 = r4.mView
            r7 = r9[r3]
            if (r6 == 0) goto L47
            goto L49
        L47:
            r6 = r9[r1]
        L49:
            r10 = r9[r2]
            if (r8 == 0) goto L4e
            goto L50
        L4e:
            r8 = r9[r0]
        L50:
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r7, r6, r10, r8)
            return
        L54:
            android.widget.TextView r5 = r4.mView
            android.graphics.drawable.Drawable[] r5 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r5)
            android.widget.TextView r7 = r4.mView
            if (r9 == 0) goto L5f
            goto L61
        L5f:
            r9 = r5[r3]
        L61:
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = r5[r1]
        L66:
            if (r10 == 0) goto L69
            goto L6b
        L69:
            r10 = r5[r2]
        L6b:
            if (r8 == 0) goto L6e
            goto L70
        L6e:
            r8 = r5[r0]
        L70:
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r9, r6, r10, r8)
        L73:
            return
    }

    private void setCompoundTints() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableLeftTint = r0
            r1.mDrawableTopTint = r0
            r1.mDrawableRightTint = r0
            r1.mDrawableBottomTint = r0
            r1.mDrawableStartTint = r0
            r1.mDrawableEndTint = r0
            return
    }

    private void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setTextSizeInternal(r2, r3)
            return
    }

    private void updateTypefaceAndStyle(android.content.Context r11, androidx.appcompat.widget.TintTypedArray r12) {
            r10 = this;
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r1 = r10.mStyle
            int r0 = r12.getInt(r0, r1)
            r10.mStyle = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 2
            r3 = -1
            r4 = 0
            if (r0 < r1) goto L23
            int r5 = androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight
            int r5 = r12.getInt(r5, r3)
            r10.mFontWeight = r5
            if (r5 == r3) goto L23
            int r5 = r10.mStyle
            r5 = r5 & r2
            r5 = r5 | r4
            r10.mStyle = r5
        L23:
            int r5 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
            boolean r6 = r12.hasValue(r5)
            r7 = 1
            if (r6 != 0) goto L5a
            int r6 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r6 = r12.hasValue(r6)
            if (r6 == 0) goto L35
            goto L5a
        L35:
            int r11 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            boolean r0 = r12.hasValue(r11)
            if (r0 == 0) goto L59
            r10.mAsyncFontPending = r4
            int r11 = r12.getInt(r11, r7)
            if (r11 == r7) goto L55
            if (r11 == r2) goto L50
            r12 = 3
            if (r11 == r12) goto L4b
            goto L59
        L4b:
            android.graphics.Typeface r11 = android.graphics.Typeface.MONOSPACE
            r10.mFontTypeface = r11
            goto L59
        L50:
            android.graphics.Typeface r11 = android.graphics.Typeface.SERIF
            r10.mFontTypeface = r11
            goto L59
        L55:
            android.graphics.Typeface r11 = android.graphics.Typeface.SANS_SERIF
            r10.mFontTypeface = r11
        L59:
            return
        L5a:
            r6 = 0
            r10.mFontTypeface = r6
            int r6 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r8 = r12.hasValue(r6)
            if (r8 == 0) goto L66
            r5 = r6
        L66:
            int r6 = r10.mFontWeight
            int r8 = r10.mStyle
            boolean r11 = r11.isRestricted()
            if (r11 != 0) goto Lac
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.widget.TextView r9 = r10.mView
            r11.<init>(r9)
            androidx.appcompat.widget.AppCompatTextHelper$1 r9 = new androidx.appcompat.widget.AppCompatTextHelper$1
            r9.<init>(r10, r6, r8, r11)
            int r11 = r10.mStyle     // Catch: java.lang.Throwable -> Lab
            android.graphics.Typeface r11 = r12.getFont(r5, r11, r9)     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto La1
            if (r0 < r1) goto L9f
            int r0 = r10.mFontWeight     // Catch: java.lang.Throwable -> Lab
            if (r0 == r3) goto L9f
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r4)     // Catch: java.lang.Throwable -> Lab
            int r0 = r10.mFontWeight     // Catch: java.lang.Throwable -> Lab
            int r6 = r10.mStyle     // Catch: java.lang.Throwable -> Lab
            r6 = r6 & r2
            if (r6 == 0) goto L97
            r6 = 1
            goto L98
        L97:
            r6 = 0
        L98:
            android.graphics.Typeface r11 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r11, r0, r6)     // Catch: java.lang.Throwable -> Lab
            r10.mFontTypeface = r11     // Catch: java.lang.Throwable -> Lab
            goto La1
        L9f:
            r10.mFontTypeface = r11     // Catch: java.lang.Throwable -> Lab
        La1:
            android.graphics.Typeface r11 = r10.mFontTypeface     // Catch: java.lang.Throwable -> Lab
            if (r11 != 0) goto La7
            r11 = 1
            goto La8
        La7:
            r11 = 0
        La8:
            r10.mAsyncFontPending = r11     // Catch: java.lang.Throwable -> Lab
            goto Lac
        Lab:
        Lac:
            android.graphics.Typeface r11 = r10.mFontTypeface
            if (r11 != 0) goto Ld9
            java.lang.String r11 = r12.getString(r5)
            if (r11 == 0) goto Ld9
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r1) goto Ld1
            int r12 = r10.mFontWeight
            if (r12 == r3) goto Ld1
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r4)
            int r12 = r10.mFontWeight
            int r0 = r10.mStyle
            r0 = r0 & r2
            if (r0 == 0) goto Lca
            r4 = 1
        Lca:
            android.graphics.Typeface r11 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r11, r12, r4)
            r10.mFontTypeface = r11
            goto Ld9
        Ld1:
            int r12 = r10.mStyle
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r12)
            r10.mFontTypeface = r11
        Ld9:
            return
    }

    public final void applyCompoundDrawablesTints() {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableLeftTint
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableTopTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableRightTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableBottomTint
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableLeftTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableTopTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableRightTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 3
            r0 = r0[r3]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableBottomTint
            r5.applyCompoundDrawableTint(r0, r3)
        L36:
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableStartTint
            if (r0 != 0) goto L3e
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableEndTint
            if (r0 == 0) goto L52
        L3e:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r0)
            r2 = r0[r2]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableStartTint
            r5.applyCompoundDrawableTint(r2, r3)
            r0 = r0[r1]
            androidx.appcompat.widget.TintInfo r1 = r5.mDrawableEndTint
            r5.applyCompoundDrawableTint(r0, r1)
        L52:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void autoSizeText() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.autoSizeText()
            return
    }

    public final int getAutoSizeMaxTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
    }

    public final int getAutoSizeMinTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
    }

    public final int getAutoSizeStepGranularity() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
    }

    public final int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
    }

    public final int getAutoSizeTextType() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.ColorStateList getCompoundDrawableTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isAutoSizeEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            boolean r0 = r0.isAutoSizeEnabled()
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r24, int r25) {
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.mView
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r11 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.mView
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.getWrappedTypeArray()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.getResourceId(r0, r14)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L42
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableLeftTint = r1
        L42:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L54
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableTopTint = r1
        L54:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L66
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableRightTint = r1
        L66:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L78
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableBottomTint = r1
        L78:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.hasValue(r2)
            if (r3 == 0) goto L8c
            int r2 = r13.getResourceId(r2, r12)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r10, r11, r2)
            r7.mDrawableStartTint = r2
        L8c:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.hasValue(r2)
            if (r3 == 0) goto L9e
            int r2 = r13.getResourceId(r2, r12)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r10, r11, r2)
            r7.mDrawableEndTint = r2
        L9e:
            r13.recycle()
            android.widget.TextView r2 = r7.mView
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L11a
            int[] r6 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r0, r6)
            if (r2 != 0) goto Lc5
            int r6 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r15 = r0.hasValue(r6)
            if (r15 == 0) goto Lc5
            boolean r6 = r0.getBoolean(r6, r12)
            r15 = 1
            goto Lc7
        Lc5:
            r6 = 0
            r15 = 0
        Lc7:
            r7.updateTypefaceAndStyle(r10, r0)
            if (r1 >= r5) goto Lf5
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r17 = r0.hasValue(r4)
            if (r17 == 0) goto Ld9
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            goto Lda
        Ld9:
            r4 = 0
        Lda:
            int r13 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r18 = r0.hasValue(r13)
            if (r18 == 0) goto Le7
            android.content.res.ColorStateList r13 = r0.getColorStateList(r13)
            goto Le8
        Le7:
            r13 = 0
        Le8:
            int r14 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r19 = r0.hasValue(r14)
            if (r19 == 0) goto Lf7
            android.content.res.ColorStateList r14 = r0.getColorStateList(r14)
            goto Lf8
        Lf5:
            r4 = 0
            r13 = 0
        Lf7:
            r14 = 0
        Lf8:
            int r5 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r20 = r0.hasValue(r5)
            if (r20 == 0) goto L105
            java.lang.String r5 = r0.getString(r5)
            goto L106
        L105:
            r5 = 0
        L106:
            if (r1 < r3) goto L115
            int r3 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r21 = r0.hasValue(r3)
            if (r21 == 0) goto L115
            java.lang.String r3 = r0.getString(r3)
            goto L116
        L115:
            r3 = 0
        L116:
            r0.recycle()
            goto L121
        L11a:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L121:
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L13c
            int r12 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r22 = r0.hasValue(r12)
            if (r22 == 0) goto L13c
            r22 = r3
            r3 = 0
            boolean r6 = r0.getBoolean(r12, r3)
            r3 = 23
            r15 = 1
            goto L140
        L13c:
            r22 = r3
            r3 = 23
        L140:
            if (r1 >= r3) goto L166
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L14e
            android.content.res.ColorStateList r4 = r0.getColorStateList(r3)
        L14e:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L15a
            android.content.res.ColorStateList r13 = r0.getColorStateList(r3)
        L15a:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L166
            android.content.res.ColorStateList r14 = r0.getColorStateList(r3)
        L166:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L172
            java.lang.String r5 = r0.getString(r3)
        L172:
            r3 = 26
            if (r1 < r3) goto L183
            int r3 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L183
            java.lang.String r3 = r0.getString(r3)
            goto L185
        L183:
            r3 = r22
        L185:
            r12 = 28
            if (r1 < r12) goto L1a2
            int r12 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r16 = r0.hasValue(r12)
            if (r16 == 0) goto L1a2
            r16 = r11
            r11 = -1
            int r12 = r0.getDimensionPixelSize(r12, r11)
            if (r12 != 0) goto L1a4
            android.widget.TextView r11 = r7.mView
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L1a4
        L1a2:
            r16 = r11
        L1a4:
            r7.updateTypefaceAndStyle(r10, r0)
            r0.recycle()
            if (r4 == 0) goto L1b1
            android.widget.TextView r0 = r7.mView
            r0.setTextColor(r4)
        L1b1:
            if (r13 == 0) goto L1b8
            android.widget.TextView r0 = r7.mView
            r0.setHintTextColor(r13)
        L1b8:
            if (r14 == 0) goto L1bf
            android.widget.TextView r0 = r7.mView
            r0.setLinkTextColor(r14)
        L1bf:
            if (r2 != 0) goto L1c6
            if (r15 == 0) goto L1c6
            r7.setAllCaps(r6)
        L1c6:
            android.graphics.Typeface r0 = r7.mFontTypeface
            if (r0 == 0) goto L1dc
            int r2 = r7.mFontWeight
            r4 = -1
            if (r2 != r4) goto L1d7
            android.widget.TextView r2 = r7.mView
            int r4 = r7.mStyle
            r2.setTypeface(r0, r4)
            goto L1dc
        L1d7:
            android.widget.TextView r2 = r7.mView
            r2.setTypeface(r0)
        L1dc:
            if (r3 == 0) goto L1e3
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r3)
        L1e3:
            if (r5 == 0) goto L205
            r0 = 24
            if (r1 < r0) goto L1f3
            android.widget.TextView r0 = r7.mView
            android.os.LocaleList r1 = androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(r5)
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(r0, r1)
            goto L205
        L1f3:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)
            r1 = 0
            r0 = r0[r1]
            android.widget.TextView r1 = r7.mView
            java.util.Locale r0 = androidx.appcompat.widget.AppCompatTextHelper.Api21Impl.forLanguageTag(r0)
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setTextLocale(r1, r0)
        L205:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            r1 = r24
            r0.loadFromAttributes(r1, r9)
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L24d
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            if (r0 == 0) goto L24d
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            int r2 = r0.length
            if (r2 <= 0) goto L24d
            android.widget.TextView r2 = r7.mView
            int r2 = androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L247
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r7.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeMinTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r7.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeMaxTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r4 = r7.mAutoSizeTextHelper
            int r4 = r4.getAutoSizeStepGranularity()
            r5 = 0
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r0, r2, r3, r4, r5)
            goto L24d
        L247:
            r5 = 0
            android.widget.TextView r2 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r2, r0, r5)
        L24d:
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r1, r0)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r2 = r16
            if (r0 == r1) goto L264
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r3 = r0
            goto L265
        L264:
            r3 = 0
        L265:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L273
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r4 = r0
            goto L274
        L273:
            r4 = 0
        L274:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L282
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r5 = r0
            goto L283
        L282:
            r5 = 0
        L283:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L291
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r6 = r0
            goto L292
        L291:
            r6 = 0
        L292:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L2a0
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r9 = r0
            goto L2a1
        L2a0:
            r9 = 0
        L2a1:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L2af
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r10 = r0
            goto L2b0
        L2af:
            r10 = 0
        L2b0:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r1 = r8.hasValue(r0)
            if (r1 == 0) goto L2cc
            android.content.res.ColorStateList r0 = r8.getColorStateList(r0)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r1, r0)
        L2cc:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r1 = r8.hasValue(r0)
            if (r1 == 0) goto L2e4
            r1 = -1
            int r0 = r8.getInt(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r2)
            android.widget.TextView r2 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r2, r0)
            goto L2e5
        L2e4:
            r1 = -1
        L2e5:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.getDimensionPixelSize(r0, r1)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.getDimensionPixelSize(r2, r1)
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r8.recycle()
            if (r0 == r1) goto L301
            android.widget.TextView r4 = r7.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r4, r0)
        L301:
            if (r2 == r1) goto L308
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r0, r2)
        L308:
            if (r3 == r1) goto L30f
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r3)
        L30f:
            return
    }

    public final void onAsyncTypefaceReceived(java.lang.ref.WeakReference<android.widget.TextView> r3, android.graphics.Typeface r4) {
            r2 = this;
            boolean r0 = r2.mAsyncFontPending
            if (r0 == 0) goto L24
            r2.mFontTypeface = r4
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L24
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r3)
            if (r0 == 0) goto L1f
            int r0 = r2.mStyle
            androidx.appcompat.widget.AppCompatTextHelper$2 r1 = new androidx.appcompat.widget.AppCompatTextHelper$2
            r1.<init>(r3, r4, r0)
            r3.post(r1)
            goto L24
        L1f:
            int r0 = r2.mStyle
            r3.setTypeface(r4, r0)
        L24:
            return
    }

    public final void onSetTextAppearance(android.content.Context r5, int r6) {
            r4 = this;
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r6 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r5, r6, r0)
            int r0 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r1 = r6.hasValue(r0)
            r2 = 0
            if (r1 == 0) goto L16
            boolean r0 = r6.getBoolean(r0, r2)
            r4.setAllCaps(r0)
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L55
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L2f
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            if (r1 == 0) goto L2f
            android.widget.TextView r3 = r4.mView
            r3.setTextColor(r1)
        L2f:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L42
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            if (r1 == 0) goto L42
            android.widget.TextView r3 = r4.mView
            r3.setLinkTextColor(r1)
        L42:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L55
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            if (r1 == 0) goto L55
            android.widget.TextView r3 = r4.mView
            r3.setHintTextColor(r1)
        L55:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L6a
            r3 = -1
            int r1 = r6.getDimensionPixelSize(r1, r3)
            if (r1 != 0) goto L6a
            android.widget.TextView r1 = r4.mView
            r3 = 0
            r1.setTextSize(r2, r3)
        L6a:
            r4.updateTypefaceAndStyle(r5, r6)
            r5 = 26
            if (r0 < r5) goto L84
            int r5 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L84
            java.lang.String r5 = r6.getString(r5)
            if (r5 == 0) goto L84
            android.widget.TextView r0 = r4.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r5)
        L84:
            r6.recycle()
            android.graphics.Typeface r5 = r4.mFontTypeface
            if (r5 == 0) goto L92
            android.widget.TextView r6 = r4.mView
            int r0 = r4.mStyle
            r6.setTypeface(r5, r0)
        L92:
            return
    }

    public final void setAllCaps(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mView
            r0.setAllCaps(r2)
            return
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.NonNull int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    public final void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    public final void setCompoundDrawableTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r0.mTintList = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.mHasTintList = r2
            r1.setCompoundTints()
            return
    }

    public final void setCompoundDrawableTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r0.mTintMode = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.mHasTintMode = r2
            r1.setCompoundTints()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto Ld
            boolean r0 = r1.isAutoSizeEnabled()
            if (r0 != 0) goto Ld
            r1.setTextSizeInternal(r2, r3)
        Ld:
            return
    }
}
