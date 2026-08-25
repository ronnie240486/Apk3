package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
class GuidedStepRootLayout extends android.widget.LinearLayout {
    private boolean mFocusOutEnd;
    private boolean mFocusOutStart;

    public GuidedStepRootLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mFocusOutStart = r1
            r0.mFocusOutEnd = r1
            return
    }

    public GuidedStepRootLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mFocusOutStart = r1
            r0.mFocusOutEnd = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r5, int r6) {
            r4 = this;
            android.view.View r0 = super.focusSearch(r5, r6)
            r1 = 66
            r2 = 17
            if (r6 == r2) goto Lc
            if (r6 != r1) goto L28
        Lc:
            boolean r3 = androidx.leanback.widget.Util.isDescendant(r4, r0)
            if (r3 == 0) goto L13
            return r0
        L13:
            int r3 = r4.getLayoutDirection()
            if (r3 != 0) goto L1c
            if (r6 != r2) goto L23
            goto L1e
        L1c:
            if (r6 != r1) goto L23
        L1e:
            boolean r6 = r4.mFocusOutStart
            if (r6 != 0) goto L28
            return r5
        L23:
            boolean r6 = r4.mFocusOutEnd
            if (r6 != 0) goto L28
            return r5
        L28:
            return r0
    }

    public void setFocusOutEnd(boolean r1) {
            r0 = this;
            r0.mFocusOutEnd = r1
            return
    }

    public void setFocusOutStart(boolean r1) {
            r0 = this;
            r0.mFocusOutStart = r1
            return
    }
}
