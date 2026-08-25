package io.realm;

/* JADX INFO: compiled from: ManagedListOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class RealmAnyListOperator extends io.realm.ManagedListOperator<io.realm.RealmAny> {
    public RealmAnyListOperator(io.realm.BaseRealm r1, io.realm.internal.OsList r2, java.lang.Class<io.realm.RealmAny> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(java.lang.Object r4) {
            r3 = this;
            io.realm.RealmAny r4 = (io.realm.RealmAny) r4
            io.realm.BaseRealm r0 = r3.realm
            io.realm.RealmAny r4 = io.realm.CollectionUtils.copyToRealmIfNeeded(r0, r4)
            io.realm.internal.OsList r0 = r3.osList
            long r1 = r4.getNativePtr()
            r0.addRealmAny(r1)
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void checkValidValue(@javax.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r6 instanceof io.realm.RealmAny
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "java.util.RealmAny"
            r2[r3] = r4
            r3 = 1
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2[r3] = r6
            java.lang.String r6 = "Unacceptable value type. Acceptable: %1$s, actual: %2$s ."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    public io.realm.RealmAny get(int r4) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Object r4 = r0.getValue(r1)
            io.realm.internal.core.NativeRealmAny r4 = (io.realm.internal.core.NativeRealmAny) r4
            if (r4 != 0) goto L10
            io.realm.internal.core.NativeRealmAny r4 = new io.realm.internal.core.NativeRealmAny
            r4.<init>()
        L10:
            io.realm.RealmAny r0 = new io.realm.RealmAny
            io.realm.BaseRealm r1 = r3.realm
            io.realm.RealmAnyOperator r4 = io.realm.RealmAnyOperator.fromNativeRealmAny(r1, r4)
            r0.<init>(r4)
            return r0
    }

    @Override // io.realm.ManagedListOperator
    public /* bridge */ /* synthetic */ io.realm.RealmAny get(int r1) {
            r0 = this;
            io.realm.RealmAny r1 = r0.get(r1)
            return r1
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int r4, java.lang.Object r5) {
            r3 = this;
            r3.checkInsertIndex(r4)
            io.realm.RealmAny r5 = (io.realm.RealmAny) r5
            io.realm.BaseRealm r0 = r3.realm
            io.realm.RealmAny r5 = io.realm.CollectionUtils.copyToRealmIfNeeded(r0, r5)
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            long r4 = r5.getNativePtr()
            r0.insertRealmAny(r1, r4)
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void setValue(int r4, java.lang.Object r5) {
            r3 = this;
            io.realm.RealmAny r5 = (io.realm.RealmAny) r5
            io.realm.BaseRealm r0 = r3.realm
            io.realm.RealmAny r5 = io.realm.CollectionUtils.copyToRealmIfNeeded(r0, r5)
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            long r4 = r5.getNativePtr()
            r0.setRealmAny(r1, r4)
            return
    }
}
