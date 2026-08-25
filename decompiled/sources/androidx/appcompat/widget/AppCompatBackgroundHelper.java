package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatBackgroundHelper {
    private int mBackgroundResId;
    private androidx.appcompat.widget.TintInfo mBackgroundTint;
    private final androidx.appcompat.widget.AppCompatDrawableManager mDrawableManager;
    private androidx.appcompat.widget.TintInfo mInternalBackgroundTint;
    private androidx.appcompat.widget.TintInfo mTmpInfo;

    @androidx.annotation.NonNull
    private final android.view.View mView;

    public AppCompatBackgroundHelper(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mBackgroundResId = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatDrawableManager r2 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            r1.mDrawableManager = r2
            return
    }

    private boolean applyFrameworkTintUsingColorFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.widget.TintInfo r0 = r4.mTmpInfo
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r4.mTmpInfo = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r4.mTmpInfo
            r1 = 0
            r0.mTintList = r1
            r2 = 0
            r0.mHasTintList = r2
            r0.mTintMode = r1
            r0.mHasTintMode = r2
            android.view.View r1 = r4.mView
            android.content.res.ColorStateList r1 = androidx.core.view.ViewCompat.getBackgroundTintList(r1)
            r3 = 1
            if (r1 == 0) goto L24
            r0.mHasTintList = r3
            r0.mTintList = r1
        L24:
            android.view.View r1 = r4.mView
            android.graphics.PorterDuff$Mode r1 = androidx.core.view.ViewCompat.getBackgroundTintMode(r1)
            if (r1 == 0) goto L30
            r0.mHasTintMode = r3
            r0.mTintMode = r1
        L30:
            boolean r1 = r0.mHasTintList
            if (r1 != 0) goto L3a
            boolean r1 = r0.mHasTintMode
            if (r1 == 0) goto L39
            goto L3a
        L39:
            return r2
        L3a:
            android.view.View r1 = r4.mView
            int[] r1 = r1.getDrawableState()
            int r2 = androidx.appcompat.widget.AppCompatDrawableManager.$r8$clinit
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r5, r0, r1)
            return r3
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 21
            if (r0 <= r3) goto Lf
            androidx.appcompat.widget.TintInfo r0 = r4.mInternalBackgroundTint
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
        Lf:
            if (r0 != r3) goto L12
            return r1
        L12:
            return r2
    }

    public final void applySupportBackgroundTint() {
            r4 = this;
            android.view.View r0 = r4.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L34
            boolean r1 = r4.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L15
            boolean r1 = r4.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L15
            return
        L15:
            androidx.appcompat.widget.TintInfo r1 = r4.mBackgroundTint
            if (r1 == 0) goto L25
            android.view.View r2 = r4.mView
            int[] r2 = r2.getDrawableState()
            int r3 = androidx.appcompat.widget.AppCompatDrawableManager.$r8$clinit
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r0, r1, r2)
            goto L34
        L25:
            androidx.appcompat.widget.TintInfo r1 = r4.mInternalBackgroundTint
            if (r1 == 0) goto L34
            android.view.View r2 = r4.mView
            int[] r2 = r2.getDrawableState()
            int r3 = androidx.appcompat.widget.AppCompatDrawableManager.$r8$clinit
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r0, r1, r2)
        L34:
            return
    }

    public final android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.view.View r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r3, r10, r1)
            android.view.View r1 = r8.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L6a
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L6a
            r1 = -1
            if (r10 == 0) goto L3f
            int r9 = r0.getResourceId(r9, r1)     // Catch: java.lang.Throwable -> L6a
            r8.mBackgroundResId = r9     // Catch: java.lang.Throwable -> L6a
            androidx.appcompat.widget.AppCompatDrawableManager r9 = r8.mDrawableManager     // Catch: java.lang.Throwable -> L6a
            android.view.View r10 = r8.mView     // Catch: java.lang.Throwable -> L6a
            android.content.Context r10 = r10.getContext()     // Catch: java.lang.Throwable -> L6a
            int r2 = r8.mBackgroundResId     // Catch: java.lang.Throwable -> L6a
            android.content.res.ColorStateList r9 = r9.getTintList(r10, r2)     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L3f
            r8.setInternalBackgroundTint(r9)     // Catch: java.lang.Throwable -> L6a
        L3f:
            int r9 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L6a
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto L50
            android.view.View r10 = r8.mView     // Catch: java.lang.Throwable -> L6a
            android.content.res.ColorStateList r9 = r0.getColorStateList(r9)     // Catch: java.lang.Throwable -> L6a
            androidx.core.view.ViewCompat.setBackgroundTintList(r10, r9)     // Catch: java.lang.Throwable -> L6a
        L50:
            int r9 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L6a
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto L66
            android.view.View r10 = r8.mView     // Catch: java.lang.Throwable -> L6a
            int r9 = r0.getInt(r9, r1)     // Catch: java.lang.Throwable -> L6a
            r1 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r9, r1)     // Catch: java.lang.Throwable -> L6a
            androidx.core.view.ViewCompat.setBackgroundTintMode(r10, r9)     // Catch: java.lang.Throwable -> L6a
        L66:
            r0.recycle()
            return
        L6a:
            r9 = move-exception
            r0.recycle()
            throw r9
    }

    public final void onSetBackgroundDrawable() {
            r1 = this;
            r0 = -1
            r1.mBackgroundResId = r0
            r0 = 0
            r1.setInternalBackgroundTint(r0)
            r1.applySupportBackgroundTint()
            return
    }

    public final void onSetBackgroundResource(int r3) {
            r2 = this;
            r2.mBackgroundResId = r3
            androidx.appcompat.widget.AppCompatDrawableManager r0 = r2.mDrawableManager
            if (r0 == 0) goto L11
            android.view.View r1 = r2.mView
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.getTintList(r1, r3)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.setInternalBackgroundTint(r3)
            r2.applySupportBackgroundTint()
            return
    }

    public final void setInternalBackgroundTint(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mInternalBackgroundTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r1.mInternalBackgroundTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            goto L18
        L15:
            r2 = 0
            r1.mInternalBackgroundTint = r2
        L18:
            r1.applySupportBackgroundTint()
            return
    }

    public final void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            r1.applySupportBackgroundTint()
            return
    }

    public final void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            r0.mTintMode = r2
            r2 = 1
            r0.mHasTintMode = r2
            r1.applySupportBackgroundTint()
            return
    }
}
