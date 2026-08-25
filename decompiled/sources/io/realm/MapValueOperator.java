package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes.dex */
abstract class MapValueOperator<K, V> {
    public final io.realm.BaseRealm baseRealm;
    public final io.realm.RealmMapEntrySet.IteratorType iteratorType;
    public final io.realm.internal.OsMap osMap;
    public final io.realm.TypeSelectorForMap<K, V> typeSelectorForMap;
    public final java.lang.Class<V> valueClass;

    public MapValueOperator(java.lang.Class<V> r1, io.realm.BaseRealm r2, io.realm.internal.OsMap r3, io.realm.TypeSelectorForMap<K, V> r4, io.realm.RealmMapEntrySet.IteratorType r5) {
            r0 = this;
            r0.<init>()
            r0.valueClass = r1
            r0.baseRealm = r2
            r0.osMap = r3
            r0.typeSelectorForMap = r4
            r0.iteratorType = r5
            return
    }

    public boolean containsValue(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L29
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<V> r1 = r2.valueClass
            if (r0 != r1) goto Lb
            goto L29
        Lb:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.String r0 = "Only '"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class<V> r1 = r2.valueClass
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "'  values can be used with 'containsValue'."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L29:
            boolean r3 = r2.containsValueInternal(r3)
            return r3
    }

    public abstract boolean containsValueInternal(@javax.annotation.Nullable java.lang.Object r1);

    public abstract java.util.Set<java.util.Map.Entry<K, V>> entrySet();

    @javax.annotation.Nullable
    public abstract V get(K r1);

    @javax.annotation.Nullable
    public abstract V put(K r1, @javax.annotation.Nullable V r2);
}
