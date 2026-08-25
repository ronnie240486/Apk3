package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes.dex */
class RealmModelOperator extends io.realm.RealmAnyOperator {
    private final java.lang.Class<? extends io.realm.RealmModel> clazz;
    private final io.realm.RealmModel value;

    public <T extends io.realm.RealmModel> RealmModelOperator(io.realm.BaseRealm r2, io.realm.internal.core.NativeRealmAny r3, java.lang.Class<T> r4) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.OBJECT
            r1.<init>(r0, r3)
            r1.clazz = r4
            io.realm.RealmModel r2 = getRealmModel(r2, r4, r3)
            r1.value = r2
            return
    }

    public RealmModelOperator(io.realm.RealmModel r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.OBJECT
            r1.<init>(r0)
            r1.value = r2
            java.lang.Class r2 = r2.getClass()
            r1.clazz = r2
            return
    }

    private static <T extends io.realm.RealmModel> T getRealmModel(io.realm.BaseRealm r2, java.lang.Class<T> r3, io.realm.internal.core.NativeRealmAny r4) {
            long r0 = r4.getRealmModelRowKey()
            java.util.List r4 = java.util.Collections.emptyList()
            io.realm.RealmModel r2 = r2.get(r3, r0, r4)
            return r2
    }

    @Override // io.realm.RealmAnyOperator
    public void checkValidObject(io.realm.BaseRealm r2) {
            r1 = this;
            io.realm.RealmModel r0 = r1.value
            boolean r0 = io.realm.RealmObject.isValid(r0)
            if (r0 == 0) goto L27
            io.realm.RealmModel r0 = r1.value
            boolean r0 = io.realm.RealmObject.isManaged(r0)
            if (r0 == 0) goto L27
            io.realm.RealmModel r0 = r1.value
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            if (r0 != r2) goto L1f
            return
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Realm object belongs to a different Realm."
            r2.<init>(r0)
            throw r2
        L27:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Realm object is not a valid managed object."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r3 = this;
            io.realm.RealmModel r0 = r3.value
            boolean r0 = r0 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L16
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<io.realm.internal.RealmObjectProxy> r1 = io.realm.internal.RealmObjectProxy.class
            io.realm.RealmModel r2 = r3.value
            java.lang.Object r1 = r1.cast(r2)
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            r0.<init>(r1)
            return r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Native RealmAny instances only allow managed Realm objects or primitives"
            r0.<init>(r1)
            throw r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L22
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L12
            goto L22
        L12:
            io.realm.RealmModelOperator r4 = (io.realm.RealmModelOperator) r4
            io.realm.RealmModel r1 = r3.value
            io.realm.RealmModel r4 = r4.value
            if (r1 != 0) goto L1e
            if (r4 != 0) goto L22
            r0 = 1
            goto L22
        L1e:
            boolean r0 = r1.equals(r4)
        L22:
            return r0
    }

    @Override // io.realm.RealmAnyOperator
    public java.lang.Class<?> getTypedClass() {
            r2 = this;
            java.lang.Class<io.realm.internal.RealmObjectProxy> r0 = io.realm.internal.RealmObjectProxy.class
            java.lang.Class<? extends io.realm.RealmModel> r1 = r2.clazz
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L11
            java.lang.Class<? extends io.realm.RealmModel> r0 = r2.clazz
            java.lang.Class r0 = r0.getSuperclass()
            goto L13
        L11:
            java.lang.Class<? extends io.realm.RealmModel> r0 = r2.clazz
        L13:
            return r0
    }

    @Override // io.realm.RealmAnyOperator
    public final <T> T getValue(java.lang.Class<T> r2) {
            r1 = this;
            io.realm.RealmModel r0 = r1.value
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    public int hashCode() {
            r1 = this;
            io.realm.RealmModel r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            io.realm.RealmModel r0 = r1.value
            java.lang.String r0 = r0.toString()
            return r0
    }
}
