package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatImageButton extends android.widget.ImageButton implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableImageSourceView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mHasLevel;
    private final androidx.appcompat.widget.AppCompatImageHelper mImageHelper;

    public AppCompatImageButton(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatImageButton(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.imageButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatImageButton(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            android.content.Context r1 = androidx.appcompat.widget.TintContextWrapper.wrap(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mHasLevel = r1
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r0, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r1.<init>(r0)
            r0.mBackgroundTintHelper = r1
            r1.loadFromAttributes(r2, r3)
            androidx.appcompat.widget.AppCompatImageHelper r1 = new androidx.appcompat.widget.AppCompatImageHelper
            r1.<init>(r0)
            r0.mImageHelper = r1
            r1.loadFromAttributes(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.applySupportBackgroundTint()
        La:
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L11
            r0.applySupportImageTint()
        L11:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportImageTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportImageTintMode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            boolean r0 = r0.hasOverlappingRendering()
            if (r0 == 0) goto L10
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = r0.mBackgroundTintHelper
            if (r1 == 0) goto La
            r1.onSetBackgroundDrawable()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundResource(r2)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            androidx.appcompat.widget.AppCompatImageHelper r1 = r0.mImageHelper
            if (r1 == 0) goto La
            r1.applySupportImageTint()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r2.mImageHelper
            if (r0 == 0) goto Ld
            if (r3 == 0) goto Ld
            boolean r1 = r2.mHasLevel
            if (r1 != 0) goto Ld
            r0.obtainLevelFromDrawable(r3)
        Ld:
            super.setImageDrawable(r3)
            androidx.appcompat.widget.AppCompatImageHelper r3 = r2.mImageHelper
            if (r3 == 0) goto L20
            r3.applySupportImageTint()
            boolean r3 = r2.mHasLevel
            if (r3 != 0) goto L20
            androidx.appcompat.widget.AppCompatImageHelper r3 = r2.mImageHelper
            r3.applyImageLevel()
        L20:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
            r0 = this;
            super.setImageLevel(r1)
            r1 = 1
            r0.mHasLevel = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.setImageResource(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            androidx.appcompat.widget.AppCompatImageHelper r1 = r0.mImageHelper
            if (r1 == 0) goto La
            r1.applySupportImageTint()
        La:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintMode(r2)
        L7:
            return
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L7
            r0.setSupportImageTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L7
            r0.setSupportImageTintMode(r2)
        L7:
            return
    }
}
