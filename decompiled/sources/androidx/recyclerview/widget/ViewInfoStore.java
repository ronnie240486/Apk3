package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
class ViewInfoStore {
    private static final boolean DEBUG = false;

    @androidx.annotation.VisibleForTesting
    public final androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.ViewInfoStore.InfoRecord> mLayoutHolderMap;

    @androidx.annotation.VisibleForTesting
    public final androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView.ViewHolder> mOldChangedHolders;

    public static class InfoRecord {
        public static androidx.core.util.Pools.Pool<androidx.recyclerview.widget.ViewInfoStore.InfoRecord> sPool;
        public int flags;

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo postInfo;

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        static {
                androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
                r1 = 20
                r0.<init>(r1)
                androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool = r0
                return
        }

        private InfoRecord() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.recyclerview.widget.ViewInfoStore.InfoRecord obtain() {
                androidx.core.util.Pools$Pool<androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool
                java.lang.Object r0 = r0.acquire()
                androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
                if (r0 != 0) goto Lf
                androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = new androidx.recyclerview.widget.ViewInfoStore$InfoRecord
                r0.<init>()
            Lf:
                return r0
        }

        public static void recycle(androidx.recyclerview.widget.ViewInfoStore.InfoRecord r1) {
                r0 = 0
                r1.flags = r0
                r0 = 0
                r1.preInfo = r0
                r1.postInfo = r0
                androidx.core.util.Pools$Pool<androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool
                r0.release(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface ProcessCallback {
        void processAppeared(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        void processDisappeared(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        void processPersistent(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        void unused(androidx.recyclerview.widget.RecyclerView.ViewHolder r1);
    }

    public ViewInfoStore() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mLayoutHolderMap = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            r1.mOldChangedHolders = r0
            return
    }

    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
            r4 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r4.mLayoutHolderMap
            int r5 = r0.indexOfKey(r5)
            r0 = 0
            if (r5 >= 0) goto La
            return r0
        La:
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r4.mLayoutHolderMap
            java.lang.Object r1 = r1.valueAt(r5)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r1 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r1
            if (r1 == 0) goto L3f
            int r2 = r1.flags
            r3 = r2 & r6
            if (r3 == 0) goto L3f
            int r0 = ~r6
            r0 = r0 & r2
            r1.flags = r0
            r2 = 4
            if (r6 != r2) goto L24
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r6 = r1.preInfo
            goto L2a
        L24:
            r2 = 8
            if (r6 != r2) goto L37
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r6 = r1.postInfo
        L2a:
            r0 = r0 & 12
            if (r0 != 0) goto L36
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r4.mLayoutHolderMap
            r0.removeAt(r5)
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(r1)
        L36:
            return r6
        L37:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Must provide flag PRE or POST"
            r5.<init>(r6)
            throw r5
        L3f:
            return r0
    }

    public final void addToDisappearedInLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            int r3 = r0.flags
            r3 = r3 | 1
            r0.flags = r3
            return
    }

    public final void addToPostLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            r0.postInfo = r4
            int r3 = r0.flags
            r3 = r3 | 8
            r0.flags = r3
            return
    }

    public final void addToPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            r0.preInfo = r4
            int r3 = r0.flags
            r3 = r3 | 4
            r0.flags = r3
            return
    }

    public void onViewDetached(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.removeFromDisappearedInLayout(r1)
            return
    }

    @androidx.annotation.Nullable
    public final androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r0 = 8
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r1.popFromLayoutStep(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public final androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r0 = 4
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r1.popFromLayoutStep(r2, r0)
            return r2
    }

    public final void removeFromDisappearedInLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r1.mLayoutHolderMap
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r2 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            int r0 = r2.flags
            r0 = r0 & (-2)
            r2.flags = r0
            return
    }

    public final void removeViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mOldChangedHolders
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1b
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.mOldChangedHolders
            java.lang.Object r1 = r1.valueAt(r0)
            if (r3 != r1) goto L18
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.mOldChangedHolders
            r1.removeAt(r0)
            goto L1b
        L18:
            int r0 = r0 + (-1)
            goto L8
        L1b:
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r3 = r0.remove(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r3 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r3
            if (r3 == 0) goto L28
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(r3)
        L28:
            return
    }
}
