package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
class ViewGroupOverlayApi14 extends androidx.transition.ViewOverlayApi14 implements androidx.transition.ViewGroupOverlayImpl {
    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.transition.ViewOverlayApi14$OverlayViewGroup r0 = r1.mOverlayViewGroup
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.transition.ViewOverlayApi14$OverlayViewGroup r0 = r1.mOverlayViewGroup
            r0.remove(r2)
            return
    }
}
