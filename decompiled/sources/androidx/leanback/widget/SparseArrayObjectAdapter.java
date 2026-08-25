package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public class SparseArrayObjectAdapter extends androidx.leanback.widget.ObjectAdapter {
    private android.util.SparseArray<java.lang.Object> mItems;

    public SparseArrayObjectAdapter() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mItems = r0
            return
    }

    public SparseArrayObjectAdapter(androidx.leanback.widget.Presenter r1) {
            r0 = this;
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.mItems = r1
            return
    }

    public SparseArrayObjectAdapter(androidx.leanback.widget.PresenterSelector r1) {
            r0 = this;
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.mItems = r1
            return
    }

    public void clear() {
            r2 = this;
            android.util.SparseArray<java.lang.Object> r0 = r2.mItems
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            android.util.SparseArray<java.lang.Object> r1 = r2.mItems
            r1.clear()
            r1 = 0
            r2.notifyItemRangeRemoved(r1, r0)
            return
    }

    public void clear(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            int r2 = r0.indexOfKey(r2)
            if (r2 < 0) goto L11
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            r0.removeAt(r2)
            r0 = 1
            r1.notifyItemRangeRemoved(r2, r0)
        L11:
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public java.lang.Object get(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            java.lang.Object r2 = r0.valueAt(r2)
            return r2
    }

    public int indexOf(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            int r2 = r0.indexOfKey(r2)
            return r2
    }

    public int indexOf(java.lang.Object r2) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            int r2 = r0.indexOfValue(r2)
            return r2
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public boolean isImmediateNotifySupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.Object lookup(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public void notifyArrayItemRangeChanged(int r1, int r2) {
            r0 = this;
            r0.notifyItemRangeChanged(r1, r2)
            return
    }

    public void set(int r3, java.lang.Object r4) {
            r2 = this;
            android.util.SparseArray<java.lang.Object> r0 = r2.mItems
            int r0 = r0.indexOfKey(r3)
            r1 = 1
            if (r0 < 0) goto L1a
            android.util.SparseArray<java.lang.Object> r3 = r2.mItems
            java.lang.Object r3 = r3.valueAt(r0)
            if (r3 == r4) goto L28
            android.util.SparseArray<java.lang.Object> r3 = r2.mItems
            r3.setValueAt(r0, r4)
            r2.notifyItemRangeChanged(r0, r1)
            goto L28
        L1a:
            android.util.SparseArray<java.lang.Object> r0 = r2.mItems
            r0.append(r3, r4)
            android.util.SparseArray<java.lang.Object> r4 = r2.mItems
            int r3 = r4.indexOfKey(r3)
            r2.notifyItemRangeInserted(r3, r1)
        L28:
            return
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
            r1 = this;
            android.util.SparseArray<java.lang.Object> r0 = r1.mItems
            int r0 = r0.size()
            return r0
    }
}
