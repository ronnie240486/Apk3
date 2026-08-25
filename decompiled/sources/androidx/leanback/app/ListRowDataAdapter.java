package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
class ListRowDataAdapter extends androidx.leanback.widget.ObjectAdapter {
    public static final int ON_CHANGED = 16;
    public static final int ON_ITEM_RANGE_CHANGED = 2;
    public static final int ON_ITEM_RANGE_INSERTED = 4;
    public static final int ON_ITEM_RANGE_REMOVED = 8;
    private final androidx.leanback.widget.ObjectAdapter mAdapter;
    public final androidx.leanback.widget.ObjectAdapter.DataObserver mDataObserver;
    public int mLastVisibleRowIndex;

    public class QueueBasedDataObserver extends androidx.leanback.widget.ObjectAdapter.DataObserver {
        public final /* synthetic */ androidx.leanback.app.ListRowDataAdapter this$0;

        public QueueBasedDataObserver(androidx.leanback.app.ListRowDataAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onChanged() {
                r1 = this;
                androidx.leanback.app.ListRowDataAdapter r0 = r1.this$0
                r0.initialize()
                androidx.leanback.app.ListRowDataAdapter r0 = r1.this$0
                r0.notifyChanged()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class SimpleDataObserver extends androidx.leanback.widget.ObjectAdapter.DataObserver {
        public final /* synthetic */ androidx.leanback.app.ListRowDataAdapter this$0;

        public SimpleDataObserver(androidx.leanback.app.ListRowDataAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onChanged() {
                r2 = this;
                androidx.leanback.app.ListRowDataAdapter r0 = r2.this$0
                r0.initialize()
                r0 = 16
                r1 = -1
                r2.onEventFired(r0, r1, r1)
                return
        }

        public final void onEventFired(int r3, int r4, int r5) {
                r2 = this;
                androidx.leanback.app.ListRowDataAdapter r0 = r2.this$0
                java.util.Objects.requireNonNull(r0)
                r1 = 2
                if (r3 == r1) goto L2b
                r1 = 4
                if (r3 == r1) goto L27
                r1 = 8
                if (r3 == r1) goto L23
                r4 = 16
                if (r3 != r4) goto L17
                r0.notifyChanged()
                goto L2e
            L17:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Invalid event type "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r3)
                r4.<init>(r3)
                throw r4
            L23:
                r0.notifyItemRangeRemoved(r4, r5)
                goto L2e
            L27:
                r0.notifyItemRangeInserted(r4, r5)
                goto L2e
            L2b:
                r0.notifyItemRangeChanged(r4, r5)
            L2e:
                return
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onItemRangeChanged(int r3, int r4) {
                r2 = this;
                androidx.leanback.app.ListRowDataAdapter r0 = r2.this$0
                int r0 = r0.mLastVisibleRowIndex
                if (r3 > r0) goto L11
                r1 = 2
                int r0 = r0 - r3
                int r0 = r0 + 1
                int r4 = java.lang.Math.min(r4, r0)
                r2.onEventFired(r1, r3, r4)
            L11:
                return
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onItemRangeInserted(int r4, int r5) {
                r3 = this;
                androidx.leanback.app.ListRowDataAdapter r0 = r3.this$0
                int r1 = r0.mLastVisibleRowIndex
                r2 = 4
                if (r4 > r1) goto Le
                int r1 = r1 + r5
                r0.mLastVisibleRowIndex = r1
                r3.onEventFired(r2, r4, r5)
                return
            Le:
                r0.initialize()
                androidx.leanback.app.ListRowDataAdapter r4 = r3.this$0
                int r4 = r4.mLastVisibleRowIndex
                if (r4 <= r1) goto L1d
                int r4 = r4 - r1
                int r1 = r1 + 1
                r3.onEventFired(r2, r1, r4)
            L1d:
                return
        }

        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onItemRangeRemoved(int r5, int r6) {
                r4 = this;
                int r0 = r5 + r6
                int r0 = r0 + (-1)
                androidx.leanback.app.ListRowDataAdapter r1 = r4.this$0
                int r2 = r1.mLastVisibleRowIndex
                r3 = 8
                if (r0 >= r2) goto L13
                int r2 = r2 - r6
                r1.mLastVisibleRowIndex = r2
                r4.onEventFired(r3, r5, r6)
                return
            L13:
                r1.initialize()
                androidx.leanback.app.ListRowDataAdapter r6 = r4.this$0
                int r6 = r6.mLastVisibleRowIndex
                int r2 = r2 - r6
                if (r2 <= 0) goto L26
                int r6 = r6 + 1
                int r5 = java.lang.Math.min(r6, r5)
                r4.onEventFired(r3, r5, r2)
            L26:
                return
        }
    }

    public ListRowDataAdapter(androidx.leanback.widget.ObjectAdapter r2) {
            r1 = this;
            androidx.leanback.widget.PresenterSelector r0 = r2.getPresenterSelector()
            r1.<init>(r0)
            r1.mAdapter = r2
            r1.initialize()
            boolean r0 = r2.isImmediateNotifySupported()
            if (r0 == 0) goto L1a
            androidx.leanback.app.ListRowDataAdapter$SimpleDataObserver r0 = new androidx.leanback.app.ListRowDataAdapter$SimpleDataObserver
            r0.<init>(r1)
            r1.mDataObserver = r0
            goto L21
        L1a:
            androidx.leanback.app.ListRowDataAdapter$QueueBasedDataObserver r0 = new androidx.leanback.app.ListRowDataAdapter$QueueBasedDataObserver
            r0.<init>(r1)
            r1.mDataObserver = r0
        L21:
            r1.initialize()
            androidx.leanback.widget.ObjectAdapter$DataObserver r0 = r1.mDataObserver
            r2.registerObserver(r0)
            return
    }

    public final void detach() {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            androidx.leanback.widget.ObjectAdapter$DataObserver r1 = r2.mDataObserver
            r0.unregisterObserver(r1)
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public java.lang.Object get(int r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final void initialize() {
            r2 = this;
            r0 = -1
            r2.mLastVisibleRowIndex = r0
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L21
            androidx.leanback.widget.ObjectAdapter r1 = r2.mAdapter
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.Row r1 = (androidx.leanback.widget.Row) r1
            boolean r1 = r1.isRenderedAsRowView()
            if (r1 == 0) goto L1e
            r2.mLastVisibleRowIndex = r0
            goto L21
        L1e:
            int r0 = r0 + (-1)
            goto Lb
        L21:
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
            r1 = this;
            int r0 = r1.mLastVisibleRowIndex
            int r0 = r0 + 1
            return r0
    }
}
