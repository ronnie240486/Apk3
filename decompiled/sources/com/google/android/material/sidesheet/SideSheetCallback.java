package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes.dex */
public abstract class SideSheetCallback implements com.google.android.material.sidesheet.SheetCallback {
    public SideSheetCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@androidx.annotation.NonNull android.view.View r1, float r2);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@androidx.annotation.NonNull android.view.View r1, int r2);
}
