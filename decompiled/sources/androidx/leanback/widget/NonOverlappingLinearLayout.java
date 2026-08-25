package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class NonOverlappingLinearLayout extends android.widget.LinearLayout {
    public boolean mDeferFocusableViewAvailableInLayout;
    public boolean mFocusableViewAvailableFixEnabled;
    public final java.util.ArrayList<java.util.ArrayList<android.view.View>> mSortedAvailableViews;

    public NonOverlappingLinearLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NonOverlappingLinearLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NonOverlappingLinearLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mFocusableViewAvailableFixEnabled = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mSortedAvailableViews = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.mDeferFocusableViewAvailableInLayout
            if (r0 == 0) goto L2b
            r0 = r4
        L5:
            r1 = -1
            if (r0 == r3) goto L1c
            if (r0 == 0) goto L1c
            android.view.ViewParent r2 = r0.getParent()
            if (r2 != r3) goto L15
            int r0 = r3.indexOfChild(r0)
            goto L1d
        L15:
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L5
        L1c:
            r0 = -1
        L1d:
            if (r0 == r1) goto L2e
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r1 = r3.mSortedAvailableViews
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            goto L2e
        L2b:
            super.focusableViewAvailable(r4)
        L2e:
            return
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            r0 = 0
            boolean r1 = r4.mFocusableViewAvailableFixEnabled     // Catch: java.lang.Throwable -> L9a
            r2 = 1
            if (r1 == 0) goto L14
            int r1 = r4.getOrientation()     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto L14
            int r1 = r4.getLayoutDirection()     // Catch: java.lang.Throwable -> L9a
            if (r1 != r2) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r4.mDeferFocusableViewAvailableInLayout = r1     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L47
        L19:
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r1 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9a
            int r3 = r4.getChildCount()     // Catch: java.lang.Throwable -> L9a
            if (r1 <= r3) goto L30
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r1 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L9a
            int r3 = r3 - r2
            r1.remove(r3)     // Catch: java.lang.Throwable -> L9a
            goto L19
        L30:
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r1 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9a
            int r2 = r4.getChildCount()     // Catch: java.lang.Throwable -> L9a
            if (r1 >= r2) goto L47
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r1 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            r2.<init>()     // Catch: java.lang.Throwable -> L9a
            r1.add(r2)     // Catch: java.lang.Throwable -> L9a
            goto L30
        L47:
            super.onLayout(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r4.mDeferFocusableViewAvailableInLayout     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L7d
            r5 = 0
        L4f:
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r6 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L9a
            if (r5 >= r6) goto L7d
            r6 = 0
        L58:
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r7 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L9a
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L9a
            if (r6 >= r7) goto L7a
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r7 = r4.mSortedAvailableViews     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L9a
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Throwable -> L9a
            super.focusableViewAvailable(r7)     // Catch: java.lang.Throwable -> L9a
            int r6 = r6 + 1
            goto L58
        L7a:
            int r5 = r5 + 1
            goto L4f
        L7d:
            boolean r5 = r4.mDeferFocusableViewAvailableInLayout
            if (r5 == 0) goto L99
            r4.mDeferFocusableViewAvailableInLayout = r0
        L83:
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r5 = r4.mSortedAvailableViews
            int r5 = r5.size()
            if (r0 >= r5) goto L99
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r5 = r4.mSortedAvailableViews
            java.lang.Object r5 = r5.get(r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.clear()
            int r0 = r0 + 1
            goto L83
        L99:
            return
        L9a:
            r5 = move-exception
            boolean r6 = r4.mDeferFocusableViewAvailableInLayout
            if (r6 == 0) goto Lb7
            r4.mDeferFocusableViewAvailableInLayout = r0
        La1:
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r6 = r4.mSortedAvailableViews
            int r6 = r6.size()
            if (r0 >= r6) goto Lb7
            java.util.ArrayList<java.util.ArrayList<android.view.View>> r6 = r4.mSortedAvailableViews
            java.lang.Object r6 = r6.get(r0)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.clear()
            int r0 = r0 + 1
            goto La1
        Lb7:
            throw r5
    }

    public void setFocusableViewAvailableFixEnabled(boolean r1) {
            r0 = this;
            r0.mFocusableViewAvailableFixEnabled = r1
            return
    }
}
