package io.realm;

import io.realm.RealmModel;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmBaseAdapter<T extends io.realm.RealmModel> extends android.widget.BaseAdapter {

    @androidx.annotation.Nullable
    public io.realm.OrderedRealmCollection<T> adapterData;
    private final io.realm.RealmChangeListener<io.realm.OrderedRealmCollection<T>> listener;


    public RealmBaseAdapter(@androidx.annotation.Nullable io.realm.OrderedRealmCollection<T> r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L14
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only use this adapter with managed list, for un-managed lists you can just use the BaseAdapter"
            r2.<init>(r0)
            throw r2
        L14:
            r1.adapterData = r2
            io.realm.RealmBaseAdapter$1 r0 = new io.realm.RealmBaseAdapter$1
            r0.<init>(r1)
            r1.listener = r0
            boolean r0 = r1.isDataValid()
            if (r0 == 0) goto L26
            r1.addListener(r2)
        L26:
            return
    }

    private void addListener(@androidx.annotation.NonNull io.realm.OrderedRealmCollection<T> r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.realm.RealmResults
            if (r0 == 0) goto Lc
            io.realm.RealmResults r3 = (io.realm.RealmResults) r3
            io.realm.RealmChangeListener<io.realm.OrderedRealmCollection<T extends io.realm.RealmModel>> r0 = r2.listener
            r3.addChangeListener(r0)
            goto L17
        Lc:
            boolean r0 = r3 instanceof io.realm.RealmList
            if (r0 == 0) goto L18
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.RealmChangeListener<io.realm.OrderedRealmCollection<T extends io.realm.RealmModel>> r0 = r2.listener
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
            io.realm.RealmChangeListener<io.realm.OrderedRealmCollection<T extends io.realm.RealmModel>> r0 = r2.listener
            r3.removeChangeListener(r0)
            goto L17
        Lc:
            boolean r0 = r3 instanceof io.realm.RealmList
            if (r0 == 0) goto L18
            io.realm.RealmList r3 = (io.realm.RealmList) r3
            io.realm.RealmChangeListener<io.realm.OrderedRealmCollection<T extends io.realm.RealmModel>> r0 = r2.listener
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

    @Override // android.widget.Adapter
    public int getCount() {
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

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    public T getItem(int r2) {
            r1 = this;
            boolean r0 = r1.isDataValid()
            if (r0 == 0) goto Lf
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r1.adapterData
            java.lang.Object r2 = r0.get(r2)
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            io.realm.RealmModel r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    public void updateData(@androidx.annotation.Nullable io.realm.OrderedRealmCollection<T> r2) {
            r1 = this;
            io.realm.RealmChangeListener<io.realm.OrderedRealmCollection<T extends io.realm.RealmModel>> r0 = r1.listener
            if (r0 == 0) goto L1a
            boolean r0 = r1.isDataValid()
            if (r0 == 0) goto Lf
            io.realm.OrderedRealmCollection<T extends io.realm.RealmModel> r0 = r1.adapterData
            r1.removeListener(r0)
        Lf:
            if (r2 == 0) goto L1a
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L1a
            r1.addListener(r2)
        L1a:
            r1.adapterData = r2
            r1.notifyDataSetChanged()
            return
    }
}
