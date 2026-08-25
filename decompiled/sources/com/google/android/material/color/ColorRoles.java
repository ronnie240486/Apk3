package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(@androidx.annotation.ColorInt int r1, @androidx.annotation.ColorInt int r2, @androidx.annotation.ColorInt int r3, @androidx.annotation.ColorInt int r4) {
            r0 = this;
            r0.<init>()
            r0.accent = r1
            r0.onAccent = r2
            r0.accentContainer = r3
            r0.onAccentContainer = r4
            return
    }

    @androidx.annotation.ColorInt
    public int getAccent() {
            r1 = this;
            int r0 = r1.accent
            return r0
    }

    @androidx.annotation.ColorInt
    public int getAccentContainer() {
            r1 = this;
            int r0 = r1.accentContainer
            return r0
    }

    @androidx.annotation.ColorInt
    public int getOnAccent() {
            r1 = this;
            int r0 = r1.onAccent
            return r0
    }

    @androidx.annotation.ColorInt
    public int getOnAccentContainer() {
            r1 = this;
            int r0 = r1.onAccentContainer
            return r0
    }
}
