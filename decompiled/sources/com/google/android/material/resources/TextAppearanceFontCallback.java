package com.google.android.material.resources;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class TextAppearanceFontCallback {
    public TextAppearanceFontCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onFontRetrievalFailed(int r1);

    public abstract void onFontRetrieved(android.graphics.Typeface r1, boolean r2);
}
