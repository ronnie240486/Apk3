package io.realm.rx;

import io.realm.RealmModel;

/* JADX INFO: loaded from: classes.dex */
public class ObjectChange<E extends io.realm.RealmModel> {
    private final io.realm.ObjectChangeSet changeset;
    private final E object;

    public ObjectChange(E r1, @javax.annotation.Nullable io.realm.ObjectChangeSet r2) {
            r0 = this;
            r0.<init>()
            r0.object = r1
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
            io.realm.rx.ObjectChange r5 = (io.realm.rx.ObjectChange) r5
            E extends io.realm.RealmModel r2 = r4.object
            E extends io.realm.RealmModel r3 = r5.object
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            io.realm.ObjectChangeSet r2 = r4.changeset
            io.realm.ObjectChangeSet r5 = r5.changeset
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
    public io.realm.ObjectChangeSet getChangeset() {
            r1 = this;
            io.realm.ObjectChangeSet r0 = r1.changeset
            return r0
    }

    public E getObject() {
            r1 = this;
            E extends io.realm.RealmModel r0 = r1.object
            return r0
    }

    public int hashCode() {
            r2 = this;
            E extends io.realm.RealmModel r0 = r2.object
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            io.realm.ObjectChangeSet r1 = r2.changeset
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ObjectChange{object="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            E extends io.realm.RealmModel r1 = r2.object
            r0.append(r1)
            java.lang.String r1 = ", changeset="
            r0.append(r1)
            io.realm.ObjectChangeSet r1 = r2.changeset
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
