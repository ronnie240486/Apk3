package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
class IconHelper {
    private IconHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyIconTint(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r2, @androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r3, android.content.res.ColorStateList r4, android.graphics.PorterDuff.Mode r5) {
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            if (r0 == 0) goto L32
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r4 == 0) goto L2a
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L2a
            int[] r2 = mergeIconState(r2, r3)
            int r1 = r4.getDefaultColor()
            int r2 = r4.getColorForState(r2, r1)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            goto L2d
        L2a:
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r4)
        L2d:
            if (r5 == 0) goto L32
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r5)
        L32:
            android.graphics.drawable.Drawable r2 = r3.getDrawable()
            if (r2 == r0) goto L3b
            r3.setImageDrawable(r0)
        L3b:
            return
    }

    public static android.widget.ImageView.ScaleType convertScaleType(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 5
            if (r1 == r0) goto L17
            r0 = 6
            if (r1 == r0) goto L14
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            return r1
        L14:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            return r1
        L17:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            return r1
        L1a:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            return r1
        L1d:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            return r1
        L20:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            return r1
        L23:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            return r1
    }

    private static int[] mergeIconState(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r3, @androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r4) {
            int[] r3 = r3.getDrawableState()
            int[] r4 = r4.getDrawableState()
            int r0 = r3.length
            int r1 = r3.length
            int r2 = r4.length
            int r1 = r1 + r2
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return r3
    }

    public static void refreshIconDrawableState(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r2, @androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r3, android.content.res.ColorStateList r4) {
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            android.graphics.drawable.Drawable r1 = r3.getDrawable()
            if (r1 == 0) goto L31
            if (r4 == 0) goto L31
            boolean r1 = r4.isStateful()
            if (r1 != 0) goto L13
            goto L31
        L13:
            int[] r2 = mergeIconState(r2, r3)
            int r1 = r4.getDefaultColor()
            int r2 = r4.getColorForState(r2, r1)
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r4, r2)
            r3.setImageDrawable(r4)
        L31:
            return
    }

    public static void setCompatRippleBackgroundIfNeeded(@androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 > r1) goto L1b
            android.content.Context r0 = r3.getContext()
            android.content.Context r1 = r3.getContext()
            r2 = 4
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            int r1 = (int) r1
            android.graphics.drawable.Drawable r0 = com.google.android.material.ripple.RippleUtils.createOvalRippleLollipop(r0, r1)
            r3.setBackground(r0)
        L1b:
            return
    }

    private static void setIconClickable(@androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r3, @androidx.annotation.Nullable android.view.View.OnLongClickListener r4) {
            boolean r0 = androidx.core.view.ViewCompat.hasOnClickListeners(r3)
            r1 = 0
            r2 = 1
            if (r4 == 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L10
        Lf:
            r1 = 1
        L10:
            r3.setFocusable(r1)
            r3.setClickable(r0)
            r3.setPressable(r0)
            r3.setLongClickable(r4)
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = 2
        L20:
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r2)
            return
    }

    public static void setIconMinSize(@androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r0, @androidx.annotation.Px int r1) {
            r0.setMinimumWidth(r1)
            r0.setMinimumHeight(r1)
            return
    }

    public static void setIconOnClickListener(@androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r0, @androidx.annotation.Nullable android.view.View.OnClickListener r1, @androidx.annotation.Nullable android.view.View.OnLongClickListener r2) {
            r0.setOnClickListener(r1)
            setIconClickable(r0, r2)
            return
    }

    public static void setIconOnLongClickListener(@androidx.annotation.NonNull com.google.android.material.internal.CheckableImageButton r0, @androidx.annotation.Nullable android.view.View.OnLongClickListener r1) {
            r0.setOnLongClickListener(r1)
            setIconClickable(r0, r1)
            return
    }
}
