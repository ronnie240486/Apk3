package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class NestedAdapterWrapper {
    public final androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mAdapterObserver;
    public int mCachedItemCount;
    public final androidx.recyclerview.widget.NestedAdapterWrapper.Callback mCallback;

    @androidx.annotation.NonNull
    private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mStableIdLookup;

    @androidx.annotation.NonNull
    private final androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup mViewTypeLookup;


    /* JADX INFO: loaded from: classes2.dex */
    public interface Callback {
        void onChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1);

        void onItemRangeChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1, int r2, int r3);

        void onItemRangeChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1, int r2, int r3, @androidx.annotation.Nullable java.lang.Object r4);

        void onItemRangeInserted(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1, int r2, int r3);

        void onItemRangeMoved(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1, int r2, int r3);

        void onItemRangeRemoved(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1, int r2, int r3);

        void onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper r1);
    }

    public NestedAdapterWrapper(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> r2, androidx.recyclerview.widget.NestedAdapterWrapper.Callback r3, androidx.recyclerview.widget.ViewTypeStorage r4, androidx.recyclerview.widget.StableIdStorage.StableIdLookup r5) {
            r1 = this;
            r1.<init>()
            androidx.recyclerview.widget.NestedAdapterWrapper$1 r0 = new androidx.recyclerview.widget.NestedAdapterWrapper$1
            r0.<init>(r1)
            r1.mAdapterObserver = r0
            r1.adapter = r2
            r1.mCallback = r3
            androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup r3 = r4.createViewTypeWrapper(r1)
            r1.mViewTypeLookup = r3
            r1.mStableIdLookup = r5
            int r3 = r2.getItemCount()
            r1.mCachedItemCount = r3
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r3 = r1.mAdapterObserver
            r2.registerAdapterDataObserver(r3)
            return
    }

    public final void dispose() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.adapter
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = r2.mAdapterObserver
            r0.unregisterAdapterDataObserver(r1)
            androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup r0 = r2.mViewTypeLookup
            r0.dispose()
            return
    }

    public long getItemId(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.adapter
            long r0 = r0.getItemId(r3)
            androidx.recyclerview.widget.StableIdStorage$StableIdLookup r3 = r2.mStableIdLookup
            long r0 = r3.localToGlobal(r0)
            return r0
    }

    public final int getItemViewType(int r3) {
            r2 = this;
            androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup r0 = r2.mViewTypeLookup
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.adapter
            int r3 = r1.getItemViewType(r3)
            int r3 = r0.localToGlobal(r3)
            return r3
    }

    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup r0 = r1.mViewTypeLookup
            int r3 = r0.globalToLocal(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.adapter
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.onCreateViewHolder(r2, r3)
            return r2
    }
}
