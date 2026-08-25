package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ItemBridgeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter implements androidx.leanback.widget.FacetProviderAdapter {
    private androidx.leanback.widget.ObjectAdapter mAdapter;
    private androidx.leanback.widget.ItemBridgeAdapter.AdapterListener mAdapterListener;
    private androidx.leanback.widget.ObjectAdapter.DataObserver mDataObserver;
    public androidx.leanback.widget.FocusHighlightHandler mFocusHighlight;
    private androidx.leanback.widget.PresenterSelector mPresenterSelector;
    private java.util.ArrayList<androidx.leanback.widget.Presenter> mPresenters;
    public androidx.leanback.widget.ItemBridgeAdapter.Wrapper mWrapper;


    public static class AdapterListener {
        public AdapterListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAddPresenter(androidx.leanback.widget.Presenter r1, int r2) {
                r0 = this;
                return
        }

        public void onAttachedToWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
                r0 = this;
                return
        }

        public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
                r0 = this;
                return
        }

        public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1, java.util.List r2) {
                r0 = this;
                r0.onBind(r1)
                return
        }

        public void onCreate(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
                r0 = this;
                return
        }

        public void onDetachedFromWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
                r0 = this;
                return
        }

        public void onUnbind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class OnFocusChangeListener implements android.view.View.OnFocusChangeListener {
        public android.view.View.OnFocusChangeListener mChainedListener;
        public final /* synthetic */ androidx.leanback.widget.ItemBridgeAdapter this$0;

        public OnFocusChangeListener(androidx.leanback.widget.ItemBridgeAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r2, boolean r3) {
                r1 = this;
                androidx.leanback.widget.ItemBridgeAdapter r0 = r1.this$0
                androidx.leanback.widget.ItemBridgeAdapter$Wrapper r0 = r0.mWrapper
                if (r0 == 0) goto Lc
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
            Lc:
                androidx.leanback.widget.ItemBridgeAdapter r0 = r1.this$0
                androidx.leanback.widget.FocusHighlightHandler r0 = r0.mFocusHighlight
                if (r0 == 0) goto L15
                r0.onItemFocused(r2, r3)
            L15:
                android.view.View$OnFocusChangeListener r0 = r1.mChainedListener
                if (r0 == 0) goto L1c
                r0.onFocusChange(r2, r3)
            L1c:
                return
        }
    }

    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements androidx.leanback.widget.FacetProvider {
        public java.lang.Object mExtraObject;
        public final androidx.leanback.widget.ItemBridgeAdapter.OnFocusChangeListener mFocusChangeListener;
        public final androidx.leanback.widget.Presenter.ViewHolder mHolder;
        public java.lang.Object mItem;
        public final androidx.leanback.widget.Presenter mPresenter;

        public ViewHolder(androidx.leanback.widget.ItemBridgeAdapter r1, androidx.leanback.widget.Presenter r2, android.view.View r3, androidx.leanback.widget.Presenter.ViewHolder r4) {
                r0 = this;
                r0.<init>(r3)
                androidx.leanback.widget.ItemBridgeAdapter$OnFocusChangeListener r3 = new androidx.leanback.widget.ItemBridgeAdapter$OnFocusChangeListener
                r3.<init>(r1)
                r0.mFocusChangeListener = r3
                r0.mPresenter = r2
                r0.mHolder = r4
                return
        }

        public final java.lang.Object getExtraObject() {
                r1 = this;
                java.lang.Object r0 = r1.mExtraObject
                return r0
        }

        @Override // androidx.leanback.widget.FacetProvider
        public java.lang.Object getFacet(java.lang.Class<?> r2) {
                r1 = this;
                androidx.leanback.widget.Presenter$ViewHolder r0 = r1.mHolder
                java.lang.Object r2 = r0.getFacet(r2)
                return r2
        }

        public final java.lang.Object getItem() {
                r1 = this;
                java.lang.Object r0 = r1.mItem
                return r0
        }

        public final androidx.leanback.widget.Presenter getPresenter() {
                r1 = this;
                androidx.leanback.widget.Presenter r0 = r1.mPresenter
                return r0
        }

        public final androidx.leanback.widget.Presenter.ViewHolder getViewHolder() {
                r1 = this;
                androidx.leanback.widget.Presenter$ViewHolder r0 = r1.mHolder
                return r0
        }

        public void setExtraObject(java.lang.Object r1) {
                r0 = this;
                r0.mExtraObject = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Wrapper {
        public Wrapper() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract android.view.View createWrapper(android.view.View r1);

        public abstract void wrap(android.view.View r1, android.view.View r2);
    }

    public ItemBridgeAdapter() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPresenters = r0
            androidx.leanback.widget.ItemBridgeAdapter$1 r0 = new androidx.leanback.widget.ItemBridgeAdapter$1
            r0.<init>(r1)
            r1.mDataObserver = r0
            return
    }

    public ItemBridgeAdapter(androidx.leanback.widget.ObjectAdapter r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ItemBridgeAdapter(androidx.leanback.widget.ObjectAdapter r2, androidx.leanback.widget.PresenterSelector r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPresenters = r0
            androidx.leanback.widget.ItemBridgeAdapter$1 r0 = new androidx.leanback.widget.ItemBridgeAdapter$1
            r0.<init>(r1)
            r1.mDataObserver = r0
            r1.setAdapter(r2)
            r1.mPresenterSelector = r3
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.setAdapter(r0)
            return
    }

    @Override // androidx.leanback.widget.FacetProviderAdapter
    public androidx.leanback.widget.FacetProvider getFacetProvider(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r1.mPresenters
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.widget.FacetProvider r2 = (androidx.leanback.widget.FacetProvider) r2
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            long r0 = r0.getId(r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r3) {
            r2 = this;
            androidx.leanback.widget.PresenterSelector r0 = r2.mPresenterSelector
            if (r0 == 0) goto L5
            goto Lb
        L5:
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            androidx.leanback.widget.PresenterSelector r0 = r0.getPresenterSelector()
        Lb:
            androidx.leanback.widget.ObjectAdapter r1 = r2.mAdapter
            java.lang.Object r3 = r1.get(r3)
            androidx.leanback.widget.Presenter r3 = r0.getPresenter(r3)
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenters
            int r0 = r0.indexOf(r3)
            if (r0 >= 0) goto L32
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenters
            r0.add(r3)
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenters
            int r0 = r0.indexOf(r3)
            r2.onAddPresenter(r3, r0)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r1 = r2.mAdapterListener
            if (r1 == 0) goto L32
            r1.onAddPresenter(r3, r0)
        L32:
            return r0
    }

    public java.util.ArrayList<androidx.leanback.widget.Presenter> getPresenterMapper() {
            r1 = this;
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r1.mPresenters
            return r0
    }

    public androidx.leanback.widget.ItemBridgeAdapter.Wrapper getWrapper() {
            r1 = this;
            androidx.leanback.widget.ItemBridgeAdapter$Wrapper r0 = r1.mWrapper
            return r0
    }

    public void onAddPresenter(androidx.leanback.widget.Presenter r1, int r2) {
            r0 = this;
            return
    }

    public void onAttachedToWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4) {
            r2 = this;
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r3 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r3
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            java.lang.Object r4 = r0.get(r4)
            r3.mItem = r4
            androidx.leanback.widget.Presenter r0 = r3.mPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mHolder
            r0.onBindViewHolder(r1, r4)
            r2.onBind(r3)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r4 = r2.mAdapterListener
            if (r4 == 0) goto L1b
            r4.onBind(r3)
        L1b:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4, java.util.List r5) {
            r2 = this;
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r3 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r3
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            java.lang.Object r4 = r0.get(r4)
            r3.mItem = r4
            androidx.leanback.widget.Presenter r0 = r3.mPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mHolder
            r0.onBindViewHolder(r1, r4, r5)
            r2.onBind(r3)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r4 = r2.mAdapterListener
            if (r4 == 0) goto L1b
            r4.onBind(r3, r5)
        L1b:
            return
    }

    public void onCreate(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r4, int r5) {
            r3 = this;
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r3.mPresenters
            java.lang.Object r5 = r0.get(r5)
            androidx.leanback.widget.Presenter r5 = (androidx.leanback.widget.Presenter) r5
            androidx.leanback.widget.ItemBridgeAdapter$Wrapper r0 = r3.mWrapper
            if (r0 == 0) goto L1c
            android.view.View r0 = r0.createWrapper(r4)
            androidx.leanback.widget.Presenter$ViewHolder r4 = r5.onCreateViewHolder(r4)
            androidx.leanback.widget.ItemBridgeAdapter$Wrapper r1 = r3.mWrapper
            android.view.View r2 = r4.view
            r1.wrap(r0, r2)
            goto L22
        L1c:
            androidx.leanback.widget.Presenter$ViewHolder r4 = r5.onCreateViewHolder(r4)
            android.view.View r0 = r4.view
        L22:
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r1 = new androidx.leanback.widget.ItemBridgeAdapter$ViewHolder
            r1.<init>(r3, r5, r0, r4)
            r3.onCreate(r1)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r4 = r3.mAdapterListener
            if (r4 == 0) goto L31
            r4.onCreate(r1)
        L31:
            androidx.leanback.widget.Presenter$ViewHolder r4 = r1.mHolder
            android.view.View r4 = r4.view
            if (r4 == 0) goto L44
            androidx.leanback.widget.ItemBridgeAdapter$OnFocusChangeListener r5 = r1.mFocusChangeListener
            android.view.View$OnFocusChangeListener r2 = r4.getOnFocusChangeListener()
            r5.mChainedListener = r2
            androidx.leanback.widget.ItemBridgeAdapter$OnFocusChangeListener r5 = r1.mFocusChangeListener
            r4.setOnFocusChangeListener(r5)
        L44:
            androidx.leanback.widget.FocusHighlightHandler r4 = r3.mFocusHighlight
            if (r4 == 0) goto L4b
            r4.onInitializeView(r0)
        L4b:
            return r1
    }

    public void onDetachedFromWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onViewRecycled(r1)
            r1 = 0
            return r1
    }

    public void onUnbind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
            r1.onAttachedToWindow(r2)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r0 = r1.mAdapterListener
            if (r0 == 0) goto Lc
            r0.onAttachedToWindow(r2)
        Lc:
            androidx.leanback.widget.Presenter r0 = r2.mPresenter
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mHolder
            r0.onViewAttachedToWindow(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r3 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r3
            androidx.leanback.widget.Presenter r0 = r3.mPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mHolder
            r0.onViewDetachedFromWindow(r1)
            r2.onDetachedFromWindow(r3)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r0 = r2.mAdapterListener
            if (r0 == 0) goto L13
            r0.onDetachedFromWindow(r3)
        L13:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r3 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r3
            androidx.leanback.widget.Presenter r0 = r3.mPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mHolder
            r0.onUnbindViewHolder(r1)
            r2.onUnbind(r3)
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r0 = r2.mAdapterListener
            if (r0 == 0) goto L13
            r0.onUnbind(r3)
        L13:
            r0 = 0
            r3.mItem = r0
            return
    }

    public void setAdapter(androidx.leanback.widget.ObjectAdapter r3) {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            if (r3 != r0) goto L5
            return
        L5:
            if (r0 == 0) goto Lc
            androidx.leanback.widget.ObjectAdapter$DataObserver r1 = r2.mDataObserver
            r0.unregisterObserver(r1)
        Lc:
            r2.mAdapter = r3
            if (r3 != 0) goto L14
            r2.notifyDataSetChanged()
            return
        L14:
            androidx.leanback.widget.ObjectAdapter$DataObserver r0 = r2.mDataObserver
            r3.registerObserver(r0)
            boolean r3 = r2.hasStableIds()
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r3 == r0) goto L2e
            androidx.leanback.widget.ObjectAdapter r3 = r2.mAdapter
            boolean r3 = r3.hasStableIds()
            r2.setHasStableIds(r3)
        L2e:
            r2.notifyDataSetChanged()
            return
    }

    public void setAdapterListener(androidx.leanback.widget.ItemBridgeAdapter.AdapterListener r1) {
            r0 = this;
            r0.mAdapterListener = r1
            return
    }

    public void setPresenter(androidx.leanback.widget.PresenterSelector r1) {
            r0 = this;
            r0.mPresenterSelector = r1
            r0.notifyDataSetChanged()
            return
    }

    public void setPresenterMapper(java.util.ArrayList<androidx.leanback.widget.Presenter> r1) {
            r0 = this;
            r0.mPresenters = r1
            return
    }

    public void setWrapper(androidx.leanback.widget.ItemBridgeAdapter.Wrapper r1) {
            r0 = this;
            r0.mWrapper = r1
            return
    }
}
