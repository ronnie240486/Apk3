package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AppCompatImageHelper {
    private androidx.appcompat.widget.TintInfo mImageTint;
    private androidx.appcompat.widget.TintInfo mInternalImageTint;
    private int mLevel;
    private androidx.appcompat.widget.TintInfo mTmpInfo;

    @androidx.annotation.NonNull
    private final android.widget.ImageView mView;

    public AppCompatImageHelper(@androidx.annotation.NonNull android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLevel = r0
            r1.mView = r2
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
            android.widget.ImageView r1 = r4.mView
            android.content.res.ColorStateList r1 = androidx.core.widget.ImageViewCompat.getImageTintList(r1)
            r3 = 1
            if (r1 == 0) goto L24
            r0.mHasTintList = r3
            r0.mTintList = r1
        L24:
            android.widget.ImageView r1 = r4.mView
            android.graphics.PorterDuff$Mode r1 = androidx.core.widget.ImageViewCompat.getImageTintMode(r1)
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
            android.widget.ImageView r1 = r4.mView
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
            androidx.appcompat.widget.TintInfo r0 = r4.mInternalImageTint
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

    public final void applyImageLevel() {
            r2 = this;
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            int r1 = r2.mLevel
            r0.setLevel(r1)
        L13:
            return
    }

    public final void applySupportImageTint() {
            r4 = this;
            android.widget.ImageView r0 = r4.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)
        Lb:
            if (r0 == 0) goto L39
            boolean r1 = r4.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L1a
            boolean r1 = r4.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L1a
            return
        L1a:
            androidx.appcompat.widget.TintInfo r1 = r4.mImageTint
            if (r1 == 0) goto L2a
            android.widget.ImageView r2 = r4.mView
            int[] r2 = r2.getDrawableState()
            int r3 = androidx.appcompat.widget.AppCompatDrawableManager.$r8$clinit
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r0, r1, r2)
            goto L39
        L2a:
            androidx.appcompat.widget.TintInfo r1 = r4.mInternalImageTint
            if (r1 == 0) goto L39
            android.widget.ImageView r2 = r4.mView
            int[] r2 = r2.getDrawableState()
            int r3 = androidx.appcompat.widget.AppCompatDrawableManager.$r8$clinit
            androidx.appcompat.widget.ResourceManagerInternal.tintDrawable(r0, r1, r2)
        L39:
            return
    }

    public final android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final boolean hasOverlappingRendering() {
            r1 = this;
            android.widget.ImageView r0 = r1.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            return r0
    }

    public void loadFromAttributes(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.ImageView r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatImageView
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r3, r10, r1)
            android.widget.ImageView r1 = r8.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r9 = r8.mView     // Catch: java.lang.Throwable -> L6f
            android.graphics.drawable.Drawable r9 = r9.getDrawable()     // Catch: java.lang.Throwable -> L6f
            r10 = -1
            if (r9 != 0) goto L3f
            int r1 = androidx.appcompat.R.styleable.AppCompatImageView_srcCompat     // Catch: java.lang.Throwable -> L6f
            int r1 = r0.getResourceId(r1, r10)     // Catch: java.lang.Throwable -> L6f
            if (r1 == r10) goto L3f
            android.widget.ImageView r9 = r8.mView     // Catch: java.lang.Throwable -> L6f
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L6f
            android.graphics.drawable.Drawable r9 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r9, r1)     // Catch: java.lang.Throwable -> L6f
            if (r9 == 0) goto L3f
            android.widget.ImageView r1 = r8.mView     // Catch: java.lang.Throwable -> L6f
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L6f
        L3f:
            if (r9 == 0) goto L44
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r9)     // Catch: java.lang.Throwable -> L6f
        L44:
            int r9 = androidx.appcompat.R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L6f
            boolean r1 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L55
            android.widget.ImageView r1 = r8.mView     // Catch: java.lang.Throwable -> L6f
            android.content.res.ColorStateList r9 = r0.getColorStateList(r9)     // Catch: java.lang.Throwable -> L6f
            androidx.core.widget.ImageViewCompat.setImageTintList(r1, r9)     // Catch: java.lang.Throwable -> L6f
        L55:
            int r9 = androidx.appcompat.R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L6f
            boolean r1 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L6b
            android.widget.ImageView r1 = r8.mView     // Catch: java.lang.Throwable -> L6f
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L6f
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r9, r10)     // Catch: java.lang.Throwable -> L6f
            androidx.core.widget.ImageViewCompat.setImageTintMode(r1, r9)     // Catch: java.lang.Throwable -> L6f
        L6b:
            r0.recycle()
            return
        L6f:
            r9 = move-exception
            r0.recycle()
            throw r9
    }

    public final void obtainLevelFromDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            int r1 = r1.getLevel()
            r0.mLevel = r1
            return
    }

    public void setImageResource(int r2) {
            r1 = this;
            if (r2 == 0) goto L17
            android.widget.ImageView r0 = r1.mView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            if (r2 == 0) goto L11
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r2)
        L11:
            android.widget.ImageView r0 = r1.mView
            r0.setImageDrawable(r2)
            goto L1d
        L17:
            android.widget.ImageView r2 = r1.mView
            r0 = 0
            r2.setImageDrawable(r0)
        L1d:
            r1.applySupportImageTint()
            return
    }

    public final void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            r0.mTintList = r2
            r2 = 1
            r0.mHasTintList = r2
            r1.applySupportImageTint()
            return
    }

    public final void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            r0.mTintMode = r2
            r2 = 1
            r0.mHasTintMode = r2
            r1.applySupportImageTint()
            return
    }
}
