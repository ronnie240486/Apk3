package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
final class WrappedDrawableState extends android.graphics.drawable.Drawable.ConstantState {
    public int mChangingConfigurations;
    public android.graphics.drawable.Drawable.ConstantState mDrawableState;
    public android.content.res.ColorStateList mTint;
    public android.graphics.PorterDuff.Mode mTintMode;

    public WrappedDrawableState(@androidx.annotation.Nullable androidx.core.graphics.drawable.WrappedDrawableState r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mTint = r0
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.WrappedDrawableApi14.DEFAULT_TINT_MODE
            r1.mTintMode = r0
            if (r2 == 0) goto L1c
            int r0 = r2.mChangingConfigurations
            r1.mChangingConfigurations = r0
            android.graphics.drawable.Drawable$ConstantState r0 = r2.mDrawableState
            r1.mDrawableState = r0
            android.content.res.ColorStateList r0 = r2.mTint
            r1.mTint = r0
            android.graphics.PorterDuff$Mode r2 = r2.mTintMode
            r1.mTintMode = r2
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = r2.mChangingConfigurations
            android.graphics.drawable.Drawable$ConstantState r1 = r2.mDrawableState
            if (r1 == 0) goto Lb
            int r1 = r1.getChangingConfigurations()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @androidx.annotation.NonNull
    public android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            r0 = 0
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @androidx.annotation.NonNull
    public android.graphics.drawable.Drawable newDrawable(@androidx.annotation.Nullable android.content.res.Resources r2) {
            r1 = this;
            androidx.core.graphics.drawable.WrappedDrawableApi21 r0 = new androidx.core.graphics.drawable.WrappedDrawableApi21
            r0.<init>(r1, r2)
            return r0
    }
}
