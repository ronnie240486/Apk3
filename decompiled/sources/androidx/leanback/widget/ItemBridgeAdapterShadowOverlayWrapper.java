package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ItemBridgeAdapterShadowOverlayWrapper extends androidx.leanback.widget.ItemBridgeAdapter.Wrapper {
    private final androidx.leanback.widget.ShadowOverlayHelper mHelper;

    public ItemBridgeAdapterShadowOverlayWrapper(androidx.leanback.widget.ShadowOverlayHelper r1) {
            r0 = this;
            r0.<init>()
            r0.mHelper = r1
            return
    }

    @Override // androidx.leanback.widget.ItemBridgeAdapter.Wrapper
    public android.view.View createWrapper(android.view.View r2) {
            r1 = this;
            android.content.Context r2 = r2.getContext()
            androidx.leanback.widget.ShadowOverlayHelper r0 = r1.mHelper
            androidx.leanback.widget.ShadowOverlayContainer r2 = r0.createShadowOverlayContainer(r2)
            return r2
    }

    @Override // androidx.leanback.widget.ItemBridgeAdapter.Wrapper
    public void wrap(android.view.View r1, android.view.View r2) {
            r0 = this;
            androidx.leanback.widget.ShadowOverlayContainer r1 = (androidx.leanback.widget.ShadowOverlayContainer) r1
            r1.wrap(r2)
            return
    }
}
