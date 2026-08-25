package io.realm;

/* JADX INFO: loaded from: classes.dex */
abstract class ManagedListOperator<T> {

    @javax.annotation.Nullable
    public final java.lang.Class<T> clazz;
    public final io.realm.internal.OsList osList;
    public final io.realm.BaseRealm realm;

    public ManagedListOperator(io.realm.BaseRealm r1, io.realm.internal.OsList r2, @javax.annotation.Nullable java.lang.Class<T> r3) {
            r0 = this;
            r0.<init>()
            r0.realm = r1
            r0.clazz = r3
            r0.osList = r2
            return
    }

    private void appendNull() {
            r1 = this;
            io.realm.internal.OsList r0 = r1.osList
            r0.addNull()
            return
    }

    public final void append(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            r0.checkValidValue(r1)
            if (r1 != 0) goto L9
            r0.appendNull()
            goto Lc
        L9:
            r0.appendValue(r1)
        Lc:
            return
    }

    public abstract void appendValue(java.lang.Object r1);

    public final void checkInsertIndex(int r4) {
            r3 = this;
            int r0 = r3.size()
            if (r4 < 0) goto L9
            if (r0 < r4) goto L9
            return
        L9:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Invalid index "
            java.lang.String r2 = ", size is "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
            io.realm.internal.OsList r1 = r3.osList
            long r1 = r1.size()
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public abstract void checkValidValue(@javax.annotation.Nullable java.lang.Object r1);

    public abstract boolean forRealmModel();

    @javax.annotation.Nullable
    public abstract T get(int r1);

    public final io.realm.internal.OsList getOsList() {
            r1 = this;
            io.realm.internal.OsList r0 = r1.osList
            return r0
    }

    public final void insert(int r1, @javax.annotation.Nullable T r2) {
            r0 = this;
            r0.checkValidValue(r2)
            if (r2 != 0) goto L9
            r0.insertNull(r1)
            goto Lc
        L9:
            r0.insertValue(r1, r2)
        Lc:
            return
    }

    public void insertNull(int r4) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            r0.insertNull(r1)
            return
    }

    public abstract void insertValue(int r1, java.lang.Object r2);

    public final boolean isEmpty() {
            r1 = this;
            io.realm.internal.OsList r0 = r1.osList
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final boolean isValid() {
            r1 = this;
            io.realm.internal.OsList r0 = r1.osList
            boolean r0 = r0.isValid()
            return r0
    }

    @javax.annotation.Nullable
    public final T set(int r2, @javax.annotation.Nullable java.lang.Object r3) {
            r1 = this;
            r1.checkValidValue(r3)
            java.lang.Object r0 = r1.get(r2)
            if (r3 != 0) goto Ld
            r1.setNull(r2)
            goto L10
        Ld:
            r1.setValue(r2, r3)
        L10:
            return r0
    }

    public void setNull(int r4) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            r0.setNull(r1)
            return
    }

    public abstract void setValue(int r1, java.lang.Object r2);

    public final int size() {
            r5 = this;
            io.realm.internal.OsList r0 = r5.osList
            long r0 = r0.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            int r1 = (int) r0
            goto L12
        Lf:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L12:
            return r1
    }
}
