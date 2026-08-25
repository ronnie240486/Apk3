package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(18)
class ViewGroupOverlayApi18 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    private final android.view.ViewGroupOverlay viewGroupOverlay;

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.remove(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.remove(r2)
            return
    }
}
