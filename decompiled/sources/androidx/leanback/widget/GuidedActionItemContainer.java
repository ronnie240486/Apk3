package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionItemContainer extends androidx.leanback.widget.NonOverlappingLinearLayoutWithForeground {
    private boolean mFocusOutAllowed;

    public GuidedActionItemContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GuidedActionItemContainer(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GuidedActionItemContainer(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.mFocusOutAllowed = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r2, int r3) {
            r1 = this;
            boolean r0 = r1.mFocusOutAllowed
            if (r0 != 0) goto L18
            boolean r0 = androidx.leanback.widget.Util.isDescendant(r1, r2)
            if (r0 != 0) goto Lb
            goto L18
        Lb:
            android.view.View r2 = super.focusSearch(r2, r3)
            boolean r3 = androidx.leanback.widget.Util.isDescendant(r1, r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
        L18:
            android.view.View r2 = super.focusSearch(r2, r3)
            return r2
    }

    public void setFocusOutAllowed(boolean r1) {
            r0 = this;
            r0.mFocusOutAllowed = r1
            return
    }
}
