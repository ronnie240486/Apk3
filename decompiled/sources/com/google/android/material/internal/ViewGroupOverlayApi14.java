package com.google.android.material.internal;

/* JADX INFO: loaded from: classes2.dex */
class ViewGroupOverlayApi14 extends com.google.android.material.internal.ViewOverlayApi14 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.ViewOverlayApi14$OverlayViewGroup r0 = r1.overlayViewGroup
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.ViewOverlayApi14$OverlayViewGroup r0 = r1.overlayViewGroup
            r0.remove(r2)
            return
    }
}
