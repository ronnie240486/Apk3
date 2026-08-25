package io.realm.rx;

import io.realm.OrderedRealmCollection;

/* JADX INFO: loaded from: classes.dex */
public class CollectionChange<E extends io.realm.OrderedRealmCollection> {
    private final io.realm.OrderedCollectionChangeSet changeset;
    private final E collection;

    public CollectionChange(E r1, @javax.annotation.Nullable io.realm.OrderedCollectionChangeSet r2) {
            r0 = this;
            r0.<init>()
            r0.collection = r1
            r0.changeset = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2f
        L12:
            io.realm.rx.CollectionChange r5 = (io.realm.rx.CollectionChange) r5
            E extends io.realm.OrderedRealmCollection r2 = r4.collection
            E extends io.realm.OrderedRealmCollection r3 = r5.collection
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            io.realm.OrderedCollectionChangeSet r2 = r4.changeset
            io.realm.OrderedCollectionChangeSet r5 = r5.changeset
            if (r2 == 0) goto L2a
            boolean r0 = r2.equals(r5)
            goto L2e
        L2a:
            if (r5 != 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r1
    }

    @javax.annotation.Nullable
    public io.realm.OrderedCollectionChangeSet getChangeset() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            return r0
    }

    public E getCollection() {
            r1 = this;
            E extends io.realm.OrderedRealmCollection r0 = r1.collection
            return r0
    }

    public int hashCode() {
            r2 = this;
            E extends io.realm.OrderedRealmCollection r0 = r2.collection
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            io.realm.OrderedCollectionChangeSet r1 = r2.changeset
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }
}
