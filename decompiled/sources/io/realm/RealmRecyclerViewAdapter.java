package io.realm;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import io.realm.RealmModel;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmRecyclerViewAdapter<T extends io.realm.RealmModel, S extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<S> {

    @androidx.annotation.Nullable
    private io.realm.OrderedRealmCollection<T> adapterData;
    private final boolean hasAutoUpdates;
    private final io.realm.OrderedRealmCollectionChangeListener listener;
    private final boolean updateOnModification;


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

    public static /* synthetic */ boolean access$000(io.realm.RealmRecyclerViewAdapter r0) {
            boolean r0 = r0.updateOnModification
            return r0
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
            io.realm.RealmRecyclerViewAdapter$1 r0 = new io.realm.RealmRecyclerViewAdapter$1
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
