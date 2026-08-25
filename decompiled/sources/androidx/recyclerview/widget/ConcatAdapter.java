package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final androidx.recyclerview.widget.ConcatAdapterController mController;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Config {

        @androidx.annotation.NonNull
        public static final androidx.recyclerview.widget.ConcatAdapter.Config DEFAULT = null;
        public final boolean isolateViewTypes;

        @androidx.annotation.NonNull
        public final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode;

        public static final class Builder {
            private boolean mIsolateViewTypes;
            private androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode mStableIdMode;

            public Builder() {
                    r2 = this;
                    r2.<init>()
                    androidx.recyclerview.widget.ConcatAdapter$Config r0 = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT
                    boolean r1 = r0.isolateViewTypes
                    r2.mIsolateViewTypes = r1
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r0 = r0.stableIdMode
                    r2.mStableIdMode = r0
                    return
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.ConcatAdapter.Config build() {
                    r3 = this;
                    androidx.recyclerview.widget.ConcatAdapter$Config r0 = new androidx.recyclerview.widget.ConcatAdapter$Config
                    boolean r1 = r3.mIsolateViewTypes
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r2 = r3.mStableIdMode
                    r0.<init>(r1, r2)
                    return r0
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.ConcatAdapter.Config.Builder setIsolateViewTypes(boolean r1) {
                    r0 = this;
                    r0.mIsolateViewTypes = r1
                    return r0
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.ConcatAdapter.Config.Builder setStableIdMode(@androidx.annotation.NonNull androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode r1) {
                    r0 = this;
                    r0.mStableIdMode = r1
                    return r0
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final enum StableIdMode extends java.lang.Enum<androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode> {
            private static final /* synthetic */ androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode[] $VALUES = null;
            public static final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode ISOLATED_STABLE_IDS = null;
            public static final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode NO_STABLE_IDS = null;
            public static final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode SHARED_STABLE_IDS = null;

            static {
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r0 = new androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode
                    java.lang.String r1 = "NO_STABLE_IDS"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS = r0
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r1 = new androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode
                    java.lang.String r3 = "ISOLATED_STABLE_IDS"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS = r1
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r3 = new androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode
                    java.lang.String r5 = "SHARED_STABLE_IDS"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS = r3
                    r5 = 3
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode[] r5 = new androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.$VALUES = r5
                    return
            }

            private StableIdMode(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode> r0 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r1 = (androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode) r1
                    return r1
            }

            public static androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode[] values() {
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode[] r0 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode[] r0 = (androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode[]) r0
                    return r0
            }
        }

        static {
                androidx.recyclerview.widget.ConcatAdapter$Config r0 = new androidx.recyclerview.widget.ConcatAdapter$Config
                androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r1 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS
                r2 = 1
                r0.<init>(r2, r1)
                androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT = r0
                return
        }

        public Config(boolean r1, @androidx.annotation.NonNull androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode r2) {
                r0 = this;
                r0.<init>()
                r0.isolateViewTypes = r1
                r0.stableIdMode = r2
                return
        }
    }

    public ConcatAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.ConcatAdapter.Config r2, @androidx.annotation.NonNull java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> r3) {
            r1 = this;
            r1.<init>()
            androidx.recyclerview.widget.ConcatAdapterController r0 = new androidx.recyclerview.widget.ConcatAdapterController
            r0.<init>(r1, r2)
            r1.mController = r0
            java.util.Iterator r2 = r3.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r2.next()
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = (androidx.recyclerview.widget.RecyclerView.Adapter) r3
            r1.addAdapter(r3)
            goto Le
        L1e:
            androidx.recyclerview.widget.ConcatAdapterController r2 = r1.mController
            boolean r2 = r2.hasStableIds()
            super.setHasStableIds(r2)
            return
    }

    @java.lang.SafeVarargs
    public ConcatAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.ConcatAdapter.Config r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r1, r2)
            return
    }

    public ConcatAdapter(@androidx.annotation.NonNull java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapter$Config r0 = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT
            r1.<init>(r0, r2)
            return
    }

    @java.lang.SafeVarargs
    public ConcatAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>... r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapter$Config r0 = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT
            r1.<init>(r0, r2)
            return
    }

    public boolean addAdapter(int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r3) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            boolean r2 = r0.addAdapter(r2, r3)
            return r2
    }

    public boolean addAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            boolean r2 = r0.addAdapter(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int findRelativeAdapterPositionIn(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            int r2 = r0.getLocalAdapterPosition(r2, r3, r4)
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> getAdapters() {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            java.util.List r0 = r0.getCopyOfAdapters()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            int r0 = r0.getTotalCount()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r2.mController
            long r0 = r0.getItemId(r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            int r2 = r0.getItemViewType(r2)
            return r2
    }

    public final void internalSetStateRestorationPolicy(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy r1) {
            r0 = this;
            super.setStateRestorationPolicy(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            r0.onAttachedToRecyclerView(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            r0.onBindViewHolder(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.onCreateViewHolder(r2, r3)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            r0.onDetachedFromRecyclerView(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            boolean r2 = r0.onFailedToRecycleView(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            r0.onViewAttachedToWindow(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            r0.onViewDetachedFromWindow(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            r0.onViewRecycled(r2)
            return
    }

    public boolean removeAdapter(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r2) {
            r1 = this;
            androidx.recyclerview.widget.ConcatAdapterController r0 = r1.mController
            boolean r2 = r0.removeAdapter(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters"
            r2.<init>(r0)
            throw r2
    }
}
