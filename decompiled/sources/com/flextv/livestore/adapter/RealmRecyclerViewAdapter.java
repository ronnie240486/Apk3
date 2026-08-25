package com.flextv.livestore.adapter;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import io.realm.RealmModel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RealmRecyclerViewAdapter<T extends io.realm.RealmModel, S extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<S> {

    @androidx.annotation.Nullable
    private io.realm.OrderedRealmCollection<T> adapterData;
    private final boolean hasAutoUpdates;
    private final io.realm.OrderedRealmCollectionChangeListener listener;
    private final boolean updateOnModification;

    public static /* synthetic */ void $r8$lambda$AbkMNCV4rffGQFPatwPMN4cRHRw(com.flextv.livestore.adapter.RealmRecyclerViewAdapter r0, java.lang.Object r1, io.realm.OrderedCollectionChangeSet r2) {
            r0.lambda$createListener$0(r1, r2)
            return
    }

    public RealmRecyclerViewAdapter(@androidx.annotation.Nullable io.realm.OrderedRealmCollection<T> r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public RealmRecyclerViewAdapter(@androidx.annotation.Nullable io.realm.OrderedRealmCollection<T> r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L14
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Only use this adapter with managed RealmCollection, for un-managed lists you can just use the BaseRecyclerViewAdapter"
            r2.<init>(r3)
            throw r2
        L14:
            r1.adapterData = r2
            r1.hasAutoUpdates = r3
            if (r3 == 0) goto L1f
            io.realm.OrderedRealmCollectionChangeListener r2 = r1.createListener()
            goto L20
        L1f:
            r2 = 0
        L20:
            r1.listener = r2
            r1.updateOnModification = r4
            return
    }

    private void addListener(@androidx.annotation.NonNull io.realm.OrderedRealmCollection<T> r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.realm.RealmResults
            if (r0 == 0) goto Lc
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.OrderedRealmCollectionChangeListener r0 = r2.listener
            r3.addChangeListener(r0)
            goto L17
        Lc:
            boolean r0 = r3 instanceof io.realm.RealmList
            if (r0 == 0) goto L18
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.OrderedRealmCollectionChangeListener r0 = r2.listener
            r3.addChangeListener(r0)
        L17:
            return
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "RealmCollection not supported: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r3 = r3.getClass()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private io.realm.OrderedRealmCollectionChangeListener createListener() {
            r1 = this;
            com.flextv.livestore.adapter.RealmRecyclerViewAdapter$$ExternalSyntheticLambda0 r0 = new com.flextv.livestore.adapter.RealmRecyclerViewAdapter$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    private boolean isDataValid() {
            r1 = this;
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r1.adapterData
            if (r0 == 0) goto Lc
            boolean r0 = r0.isValid()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private /* synthetic */ void lambda$createListener$0(java.lang.Object r7, io.realm.OrderedCollectionChangeSet r8) {
            r6 = this;
            io.realm.OrderedCollectionChangeSet$State r7 = r8.getState()
            io.realm.OrderedCollectionChangeSet$State r0 = io.realm.OrderedCollectionChangeSet.State.INITIAL
            if (r7 != r0) goto Lc
            r6.notifyDataSetChanged()
            return
        Lc:
            io.realm.OrderedCollectionChangeSet$Range[] r7 = r8.getDeletionRanges()
            int r0 = r7.length
            int r0 = r0 + (-1)
        L13:
            if (r0 < 0) goto L26
            r1 = r7[r0]
            int r2 = r1.startIndex
            int r3 = r6.dataOffset()
            int r3 = r3 + r2
            int r1 = r1.length
            r6.notifyItemRangeRemoved(r3, r1)
            int r0 = r0 + (-1)
            goto L13
        L26:
            io.realm.OrderedCollectionChangeSet$Range[] r7 = r8.getInsertionRanges()
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L2d:
            if (r2 >= r0) goto L40
            r3 = r7[r2]
            int r4 = r3.startIndex
            int r5 = r6.dataOffset()
            int r5 = r5 + r4
            int r3 = r3.length
            r6.notifyItemRangeInserted(r5, r3)
            int r2 = r2 + 1
            goto L2d
        L40:
            boolean r7 = r6.updateOnModification
            if (r7 != 0) goto L45
            return
        L45:
            io.realm.OrderedCollectionChangeSet$Range[] r7 = r8.getChangeRanges()
            int r8 = r7.length
        L4a:
            if (r1 >= r8) goto L5d
            r0 = r7[r1]
            int r2 = r0.startIndex
            int r3 = r6.dataOffset()
            int r3 = r3 + r2
            int r0 = r0.length
            r6.notifyItemRangeChanged(r3, r0)
            int r1 = r1 + 1
            goto L4a
        L5d:
            return
    }

    private void removeListener(@androidx.annotation.NonNull io.realm.OrderedRealmCollection<T> r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.realm.RealmResults
            if (r0 == 0) goto Lc
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.OrderedRealmCollectionChangeListener r0 = r2.listener
            r3.removeChangeListener(r0)
            goto L17
        Lc:
            boolean r0 = r3 instanceof io.realm.RealmList
            if (r0 == 0) goto L18
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.OrderedRealmCollectionChangeListener r0 = r2.listener
            r3.removeChangeListener(r0)
        L17:
            return
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "RealmCollection not supported: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r3 = r3.getClass()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public int dataOffset() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public io.realm.OrderedRealmCollection<T> getData() {
            r1 = this;
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r1.adapterData
            return r0
    }

    @androidx.annotation.Nullable
    public T getItem(int r3) {
            r2 = this;
            if (r3 < 0) goto L1e
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r2.adapterData
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = r0.size()
            if (r3 < r0) goto Le
            return r1
        Le:
            boolean r0 = r2.isDataValid()
            if (r0 == 0) goto L1d
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r2.adapterData
            java.lang.Object r3 = r0.get(r3)
            r1 = r3
            io.realm.RealmModel r1 = (io.realm.RealmModel) r1
        L1d:
            return r1
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only indexes >= 0 are allowed. Input was: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            boolean r0 = r1.isDataValid()
            if (r0 == 0) goto Ld
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r1.adapterData
            int r0 = r0.size()
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            super.onAttachedToRecyclerView(r1)
            boolean r1 = r0.hasAutoUpdates
            if (r1 == 0) goto L12
            boolean r1 = r0.isDataValid()
            if (r1 == 0) goto L12
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r1 = r0.adapterData
            r0.addListener(r1)
        L12:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            super.onDetachedFromRecyclerView(r1)
            boolean r1 = r0.hasAutoUpdates
            if (r1 == 0) goto L12
            boolean r1 = r0.isDataValid()
            if (r1 == 0) goto L12
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r1 = r0.adapterData
            r0.removeListener(r1)
        L12:
            return
    }

    public void updateData(@androidx.annotation.Nullable io.realm.OrderedRealmCollection<T> r2) {
            r1 = this;
            boolean r0 = r1.hasAutoUpdates
            if (r0 == 0) goto L14
            boolean r0 = r1.isDataValid()
            if (r0 == 0) goto Lf
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r1.adapterData
            r1.removeListener(r0)
        Lf:
            if (r2 == 0) goto L14
            r1.addListener(r2)
        L14:
            r1.adapterData = r2
            r1.notifyDataSetChanged()
            return
    }
}
