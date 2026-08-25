package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class ArrayObjectAdapter extends androidx.leanback.widget.ObjectAdapter {
    private static final java.lang.Boolean DEBUG = null;
    private static final java.lang.String TAG = "ArrayObjectAdapter";
    private final java.util.List mItems;
    public androidx.recyclerview.widget.ListUpdateCallback mListUpdateCallback;
    public final java.util.ArrayList mOldItems;
    private java.util.List mUnmodifiableItems;



    static {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.leanback.widget.ArrayObjectAdapter.DEBUG = r0
            return
    }

    public ArrayObjectAdapter() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mItems = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOldItems = r0
            return
    }

    public ArrayObjectAdapter(androidx.leanback.widget.Presenter r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mItems = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mOldItems = r1
            return
    }

    public ArrayObjectAdapter(androidx.leanback.widget.PresenterSelector r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mItems = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mOldItems = r1
            return
    }

    public static /* synthetic */ java.lang.Boolean access$000() {
            java.lang.Boolean r0 = androidx.leanback.widget.ArrayObjectAdapter.DEBUG
            return r0
    }

    public void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.List r0 = r1.mItems
            r0.add(r2, r3)
            r3 = 1
            r1.notifyItemRangeInserted(r2, r3)
            return
    }

    public void add(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.mItems
            int r0 = r0.size()
            r1.add(r0, r2)
            return
    }

    public void addAll(int r3, java.util.Collection r4) {
            r2 = this;
            int r0 = r4.size()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.List r1 = r2.mItems
            r1.addAll(r3, r4)
            r2.notifyItemRangeInserted(r3, r0)
            return
    }

    public void clear() {
            r2 = this;
            java.util.List r0 = r2.mItems
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            java.util.List r1 = r2.mItems
            r1.clear()
            r1 = 0
            r2.notifyItemRangeRemoved(r1, r0)
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public java.lang.Object get(int r2) {
            r1 = this;
            java.util.List r0 = r1.mItems
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.mItems
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public boolean isImmediateNotifySupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void move(int r3, int r4) {
            r2 = this;
            if (r3 != r4) goto L3
            return
        L3:
            java.util.List r0 = r2.mItems
            java.lang.Object r0 = r0.remove(r3)
            java.util.List r1 = r2.mItems
            r1.add(r4, r0)
            r2.notifyItemMoved(r3, r4)
            return
    }

    public void notifyArrayItemRangeChanged(int r1, int r2) {
            r0 = this;
            r0.notifyItemRangeChanged(r1, r2)
            return
    }

    public boolean remove(java.lang.Object r3) {
            r2 = this;
            java.util.List r0 = r2.mItems
            int r3 = r0.indexOf(r3)
            r0 = 1
            if (r3 < 0) goto L11
            java.util.List r1 = r2.mItems
            r1.remove(r3)
            r2.notifyItemRangeRemoved(r3, r0)
        L11:
            if (r3 < 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public int removeItems(int r3, int r4) {
            r2 = this;
            java.util.List r0 = r2.mItems
            int r0 = r0.size()
            int r0 = r0 - r3
            int r4 = java.lang.Math.min(r4, r0)
            r0 = 0
            if (r4 > 0) goto Lf
            return r0
        Lf:
            if (r0 >= r4) goto L19
            java.util.List r1 = r2.mItems
            r1.remove(r3)
            int r0 = r0 + 1
            goto Lf
        L19:
            r2.notifyItemRangeRemoved(r3, r4)
            return r4
    }

    public void replace(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.List r0 = r1.mItems
            r0.set(r2, r3)
            r3 = 1
            r1.notifyItemRangeChanged(r2, r3)
            return
    }

    public void setItems(java.util.List r3, androidx.leanback.widget.DiffCallback r4) {
            r2 = this;
            if (r4 != 0) goto L10
            java.util.List r4 = r2.mItems
            r4.clear()
            java.util.List r4 = r2.mItems
            r4.addAll(r3)
            r2.notifyChanged()
            return
        L10:
            java.util.ArrayList r0 = r2.mOldItems
            r0.clear()
            java.util.ArrayList r0 = r2.mOldItems
            java.util.List r1 = r2.mItems
            r0.addAll(r1)
            androidx.leanback.widget.ArrayObjectAdapter$1 r0 = new androidx.leanback.widget.ArrayObjectAdapter$1
            r0.<init>(r2, r3, r4)
            androidx.recyclerview.widget.DiffUtil$DiffResult r4 = androidx.recyclerview.widget.DiffUtil.calculateDiff(r0)
            java.util.List r0 = r2.mItems
            r0.clear()
            java.util.List r0 = r2.mItems
            r0.addAll(r3)
            androidx.recyclerview.widget.ListUpdateCallback r3 = r2.mListUpdateCallback
            if (r3 != 0) goto L3a
            androidx.leanback.widget.ArrayObjectAdapter$2 r3 = new androidx.leanback.widget.ArrayObjectAdapter$2
            r3.<init>(r2)
            r2.mListUpdateCallback = r3
        L3a:
            androidx.recyclerview.widget.ListUpdateCallback r3 = r2.mListUpdateCallback
            r4.dispatchUpdatesTo(r3)
            java.util.ArrayList r3 = r2.mOldItems
            r3.clear()
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
            r1 = this;
            java.util.List r0 = r1.mItems
            int r0 = r0.size()
            return r0
    }

    public <E> java.util.List<E> unmodifiableList() {
            r1 = this;
            java.util.List r0 = r1.mUnmodifiableItems
            if (r0 != 0) goto Lc
            java.util.List r0 = r1.mItems
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.mUnmodifiableItems = r0
        Lc:
            java.util.List r0 = r1.mUnmodifiableItems
            return r0
    }
}
