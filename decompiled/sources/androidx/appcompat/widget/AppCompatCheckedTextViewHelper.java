package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class AppCompatCheckedTextViewHelper {
    private android.content.res.ColorStateList mCheckMarkTintList;
    private android.graphics.PorterDuff.Mode mCheckMarkTintMode;
    private boolean mHasCheckMarkTint;
    private boolean mHasCheckMarkTintMode;
    private boolean mSkipNextApply;

    @androidx.annotation.NonNull
    private final android.widget.CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(@androidx.annotation.NonNull android.widget.CheckedTextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCheckMarkTintList = r0
            r1.mCheckMarkTintMode = r0
            r0 = 0
            r1.mHasCheckMarkTint = r0
            r1.mHasCheckMarkTintMode = r0
            r1.mView = r2
            return
    }

    public final void applyCheckMarkTint() {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 != 0) goto L10
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mCheckMarkTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.mCheckMarkTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CheckedTextView r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CheckedTextView r1 = r2.mView
            r1.setCheckMarkDrawable(r0)
        L3e:
            return
    }

    public final android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mCheckMarkTintList
            return r0
    }

    public final android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mCheckMarkTintMode
            return r0
    }

    public final void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.widget.CheckedTextView r0 = r9.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CheckedTextView
            r8 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.getResourceId(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CheckedTextView r11 = r9.mView     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 != 0) goto L58
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.getResourceId(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CheckedTextView r11 = r9.mView     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CheckedTextView r11 = r9.mView     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.getColorStateList(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.hasValue(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CheckedTextView r11 = r9.mView     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.getInt(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.recycle()
            return
        L84:
            r10 = move-exception
            r0.recycle()
            throw r10
    }

    public final void onSetCheckMarkDrawable() {
            r1 = this;
            boolean r0 = r1.mSkipNextApply
            if (r0 == 0) goto L8
            r0 = 0
            r1.mSkipNextApply = r0
            return
        L8:
            r0 = 1
            r1.mSkipNextApply = r0
            r1.applyCheckMarkTint()
            return
    }

    public final void setSupportCheckMarkTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mCheckMarkTintList = r1
            r1 = 1
            r0.mHasCheckMarkTint = r1
            r0.applyCheckMarkTint()
            return
    }

    public final void setSupportCheckMarkTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mCheckMarkTintMode = r1
            r1 = 1
            r0.mHasCheckMarkTintMode = r1
            r0.applyCheckMarkTint()
            return
    }
}
