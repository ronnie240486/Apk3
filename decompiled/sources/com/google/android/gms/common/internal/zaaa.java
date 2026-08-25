package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends android.widget.Button {
    public zaaa(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 16842824(0x1010048, float:2.369376E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    private static final int zab(int r0, int r1, int r2, int r3) {
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 != r1) goto L9
            return r3
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = 33
            java.lang.String r3 = "Unknown color scheme: "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r0)
            r1.<init>(r0)
            throw r1
        L17:
            return r2
        L18:
            return r1
    }

    public final void zaa(android.content.res.Resources r7, int r8, int r9) {
            r6 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r0)
            android.util.DisplayMetrics r0 = r7.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.setMinHeight(r0)
            r6.setMinWidth(r0)
            int r0 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark
            int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light
            int r0 = zab(r9, r0, r1, r1)
            int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark
            int r2 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light
            int r1 = zab(r9, r1, r2, r2)
            java.lang.String r2 = "Unknown button size: "
            r3 = 32
            r4 = 2
            r5 = 1
            if (r8 == 0) goto L45
            if (r8 == r5) goto L45
            if (r8 != r4) goto L3b
            goto L46
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r2, r8)
            r7.<init>(r8)
            throw r7
        L45:
            r0 = r1
        L46:
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            int r1 = com.google.android.gms.base.R.color.common_google_signin_btn_tint
            android.content.res.ColorStateList r1 = r7.getColorStateList(r1)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
            r6.setBackgroundDrawable(r0)
            int r0 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark
            int r1 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light
            int r9 = zab(r9, r0, r1, r1)
            android.content.res.ColorStateList r9 = r7.getColorStateList(r9)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            android.content.res.ColorStateList r9 = (android.content.res.ColorStateList) r9
            r6.setTextColor(r9)
            r9 = 0
            if (r8 == 0) goto L93
            if (r8 == r5) goto L89
            if (r8 != r4) goto L7f
            r6.setText(r9)
            goto L9c
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r2, r8)
            r7.<init>(r8)
            throw r7
        L89:
            int r8 = com.google.android.gms.base.R.string.common_signin_button_text_long
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
            goto L9c
        L93:
            int r8 = com.google.android.gms.base.R.string.common_signin_button_text
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
        L9c:
            r6.setTransformationMethod(r9)
            android.content.Context r7 = r6.getContext()
            boolean r7 = com.google.android.gms.common.util.DeviceProperties.isWearable(r7)
            if (r7 == 0) goto Lae
            r7 = 19
            r6.setGravity(r7)
        Lae:
            return
    }
}
