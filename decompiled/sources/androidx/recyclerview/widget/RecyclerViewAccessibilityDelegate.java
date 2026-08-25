package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerViewAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
    private final androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate mItemDelegate;
    public final androidx.recyclerview.widget.RecyclerView mRecyclerView;

    /* JADX INFO: loaded from: classes3.dex */
    public static class ItemDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> mOriginalItemDelegates;
        public final androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r2) {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.mOriginalItemDelegates = r0
                r1.mRecyclerViewDelegate = r2
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
            Lf:
                boolean r2 = super.dispatchPopulateAccessibilityEvent(r2, r3)
                return r2
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        @androidx.annotation.Nullable
        public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Lf
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r2 = r0.getAccessibilityNodeProvider(r2)
                return r2
            Lf:
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r2 = super.getAccessibilityNodeProvider(r2)
                return r2
        }

        public final androidx.core.view.AccessibilityDelegateCompat getAndRemoveOriginalDelegateForItem(android.view.View r2) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r2 = r0.remove(r2)
                androidx.core.view.AccessibilityDelegateCompat r2 = (androidx.core.view.AccessibilityDelegateCompat) r2
                return r2
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Le
                r0.onInitializeAccessibilityEvent(r2, r3)
                goto L11
            Le:
                super.onInitializeAccessibilityEvent(r2, r3)
            L11:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r1.mRecyclerViewDelegate
                boolean r0 = r0.shouldIgnore()
                if (r0 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r1.mRecyclerViewDelegate
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                if (r0 == 0) goto L2f
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r1.mRecyclerViewDelegate
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                r0.onInitializeAccessibilityNodeInfoForItem(r2, r3)
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto L2b
                r0.onInitializeAccessibilityNodeInfo(r2, r3)
                goto L32
            L2b:
                super.onInitializeAccessibilityNodeInfo(r2, r3)
                goto L32
            L2f:
                super.onInitializeAccessibilityNodeInfo(r2, r3)
            L32:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Le
                r0.onPopulateAccessibilityEvent(r2, r3)
                goto L11
            Le:
                super.onPopulateAccessibilityEvent(r2, r3)
            L11:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(@androidx.annotation.NonNull android.view.ViewGroup r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Lf
                boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
            Lf:
                boolean r2 = super.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View r8, int r9, android.os.Bundle r10) {
                r7 = this;
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r7.mRecyclerViewDelegate
                boolean r0 = r0.shouldIgnore()
                if (r0 != 0) goto L41
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r7.mRecyclerViewDelegate
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                if (r0 == 0) goto L41
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r7.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r8)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                r1 = 1
                if (r0 == 0) goto L24
                boolean r0 = r0.performAccessibilityAction(r8, r9, r10)
                if (r0 == 0) goto L2b
                return r1
            L24:
                boolean r0 = super.performAccessibilityAction(r8, r9, r10)
                if (r0 == 0) goto L2b
                return r1
            L2b:
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r7.mRecyclerViewDelegate
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r2 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r3 = r0.mState
                r4 = r8
                r5 = r9
                r6 = r10
                boolean r8 = r1.performAccessibilityActionForItem(r2, r3, r4, r5, r6)
                return r8
            L41:
                boolean r8 = super.performAccessibilityAction(r8, r9, r10)
                return r8
        }

        public final void saveOriginalDelegate(android.view.View r3) {
                r2 = this;
                androidx.core.view.AccessibilityDelegateCompat r0 = androidx.core.view.ViewCompat.getAccessibilityDelegate(r3)
                if (r0 == 0) goto Ld
                if (r0 == r2) goto Ld
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r1 = r2.mOriginalItemDelegates
                r1.put(r3, r0)
            Ld:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEvent(@androidx.annotation.NonNull android.view.View r2, int r3) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Le
                r0.sendAccessibilityEvent(r2, r3)
                goto L11
            Le:
                super.sendAccessibilityEvent(r2, r3)
            L11:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEventUnchecked(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                java.util.Map<android.view.View, androidx.core.view.AccessibilityDelegateCompat> r0 = r1.mOriginalItemDelegates
                java.lang.Object r0 = r0.get(r2)
                androidx.core.view.AccessibilityDelegateCompat r0 = (androidx.core.view.AccessibilityDelegateCompat) r0
                if (r0 == 0) goto Le
                r0.sendAccessibilityEventUnchecked(r2, r3)
                goto L11
            Le:
                super.sendAccessibilityEventUnchecked(r2, r3)
            L11:
                return
        }
    }

    public RecyclerViewAccessibilityDelegate(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            r1.mRecyclerView = r2
            androidx.core.view.AccessibilityDelegateCompat r2 = r1.getItemDelegate()
            if (r2 == 0) goto L14
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r2 = (androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) r2
            r1.mItemDelegate = r2
            goto L1b
        L14:
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r2 = new androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate
            r2.<init>(r1)
            r1.mItemDelegate = r2
        L1b:
            return
    }

    @androidx.annotation.NonNull
    public androidx.core.view.AccessibilityDelegateCompat getItemDelegate() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r0 = r1.mItemDelegate
            return r0
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1c
            boolean r0 = r1.shouldIgnore()
            if (r0 != 0) goto L1c
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.getLayoutManager()
            if (r0 == 0) goto L1c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            r2.onInitializeAccessibilityEvent(r3)
        L1c:
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3, r4)
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L20
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            if (r3 == 0) goto L20
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
            r3.onInitializeAccessibilityNodeInfo(r1, r0, r4)
        L20:
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            boolean r3 = super.performAccessibilityAction(r3, r4, r5)
            if (r3 == 0) goto L8
            r3 = 1
            return r3
        L8:
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L27
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            if (r3 == 0) goto L27
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
            boolean r3 = r3.performAccessibilityAction(r1, r0, r4, r5)
            return r3
        L27:
            r3 = 0
            return r3
    }

    public final boolean shouldIgnore() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            boolean r0 = r0.hasPendingAdapterUpdates()
            return r0
    }
}
