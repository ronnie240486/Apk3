package com.google.android.material.shadow;

/* JADX INFO: loaded from: classes.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1);

    void setShadowPadding(int r1, int r2, int r3, int r4);
}
