package io.realm;

/* JADX INFO: loaded from: classes3.dex */
public class RealmDictionary<V> extends io.realm.RealmMap<java.lang.String, V> {
    public RealmDictionary() {
            r0 = this;
            r0.<init>()
            return
    }

    public RealmDictionary(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, java.lang.Class<V> r3) {
            r0 = this;
            io.realm.RealmMap$ManagedMapStrategy r1 = getStrategy(r3, r1, r2)
            r0.<init>(r1)
            return
    }

    public RealmDictionary(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, java.lang.String r3) {
            r0 = this;
            io.realm.RealmMap$ManagedMapStrategy r1 = getStrategy(r3, r1, r2)
            r0.<init>(r1)
            return
    }

    public RealmDictionary(java.util.Map<java.lang.String, V> r2) {
            r1 = this;
            r1.<init>()
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.putAll(r2)
            return
    }

    private static <V> io.realm.DictionaryManager<V> getManager(java.lang.Class<V> r9, io.realm.BaseRealm r10, io.realm.internal.OsMap r11) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            io.realm.SelectorForMap r8 = new io.realm.SelectorForMap
            r8.<init>(r10, r11, r9)
            java.lang.Class<io.realm.RealmAny> r1 = io.realm.RealmAny.class
            if (r9 != r1) goto L12
            io.realm.RealmAnyValueOperator r9 = new io.realm.RealmAnyValueOperator
            r9.<init>(r10, r11, r8)
            goto Led
        L12:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r9 != r1) goto L25
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.LONG
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L25:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r9 != r1) goto L38
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.FLOAT
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L38:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r9 != r1) goto L4b
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.DOUBLE
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L4b:
            if (r9 != r0) goto L5c
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.STRING
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L5c:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r9 != r0) goto L6f
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.BOOLEAN
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L6f:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r9 != r0) goto L82
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.DATE
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L82:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            if (r9 != r0) goto L95
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<org.bson.types.Decimal128> r2 = org.bson.types.Decimal128.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.DECIMAL128
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        L95:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r9 != r0) goto L9f
            io.realm.IntegerValueOperator r9 = new io.realm.IntegerValueOperator
            r9.<init>(r10, r11, r8)
            goto Led
        L9f:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r9 != r0) goto La9
            io.realm.ShortValueOperator r9 = new io.realm.ShortValueOperator
            r9.<init>(r10, r11, r8)
            goto Led
        La9:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r9 != r0) goto Lb3
            io.realm.ByteValueOperator r9 = new io.realm.ByteValueOperator
            r9.<init>(r10, r11, r8)
            goto Led
        Lb3:
            java.lang.Class<byte[]> r0 = byte[].class
            if (r9 != r0) goto Lca
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<byte[]> r2 = byte[].class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.BINARY
            io.realm.BinaryEquals r7 = new io.realm.BinaryEquals
            r7.<init>()
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto Led
        Lca:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            if (r9 != r0) goto Ldc
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<org.bson.types.ObjectId> r2 = org.bson.types.ObjectId.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.OBJECT_ID
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto Led
        Ldc:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            if (r9 != r0) goto Lf3
            io.realm.GenericPrimitiveValueOperator r9 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.util.UUID> r2 = java.util.UUID.class
            io.realm.RealmMapEntrySet$IteratorType r6 = io.realm.RealmMapEntrySet.IteratorType.UUID
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
        Led:
            io.realm.DictionaryManager r11 = new io.realm.DictionaryManager
            r11.<init>(r10, r9, r8)
            return r11
        Lf3:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Only Maps of RealmAny or one of the types that can be boxed inside RealmAny can be used."
            r9.<init>(r10)
            throw r9
    }

    private static <V> io.realm.DictionaryManager<V> getManager(java.lang.String r14, io.realm.BaseRealm r15, io.realm.internal.OsMap r16) {
            r0 = r14
            r7 = r15
            r3 = r16
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            java.lang.Class<java.lang.Short> r4 = java.lang.Short.class
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r9 = java.lang.Float.class
            java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
            java.lang.Class<io.realm.RealmAny> r11 = io.realm.RealmAny.class
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.String r13 = r11.getCanonicalName()
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L2e
            io.realm.RealmAnyValueOperator r0 = new io.realm.RealmAnyValueOperator
            io.realm.SelectorForMap r1 = new io.realm.SelectorForMap
            r1.<init>(r15, r3, r11)
            r0.<init>(r15, r3, r1)
            goto L1ba
        L2e:
            java.lang.String r11 = r10.getCanonicalName()
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L4c
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            r4.<init>(r15, r3, r10)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.LONG
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        L4c:
            java.lang.String r10 = r9.getCanonicalName()
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L6a
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            r4.<init>(r15, r3, r9)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.FLOAT
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        L6a:
            java.lang.String r9 = r8.getCanonicalName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L88
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            r4.<init>(r15, r3, r8)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.DOUBLE
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        L88:
            java.lang.String r8 = r12.getCanonicalName()
            boolean r8 = r14.equals(r8)
            if (r8 == 0) goto La6
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            r4.<init>(r15, r3, r12)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.STRING
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        La6:
            java.lang.String r8 = r6.getCanonicalName()
            boolean r8 = r14.equals(r8)
            if (r8 == 0) goto Lc4
            io.realm.GenericPrimitiveValueOperator r8 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            r4.<init>(r15, r3, r6)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.BOOLEAN
            r0 = r8
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        Lc4:
            java.lang.Class<java.util.Date> r6 = java.util.Date.class
            java.lang.String r6 = r6.getCanonicalName()
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto Le6
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r4.<init>(r15, r3, r0)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.DATE
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        Le6:
            java.lang.Class<org.bson.types.Decimal128> r6 = org.bson.types.Decimal128.class
            java.lang.String r6 = r6.getCanonicalName()
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L108
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            r4.<init>(r15, r3, r0)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.DECIMAL128
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        L108:
            java.lang.String r6 = r5.getCanonicalName()
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L11e
            io.realm.IntegerValueOperator r0 = new io.realm.IntegerValueOperator
            io.realm.SelectorForMap r1 = new io.realm.SelectorForMap
            r1.<init>(r15, r3, r5)
            r0.<init>(r15, r3, r1)
            goto L1ba
        L11e:
            java.lang.String r5 = r4.getCanonicalName()
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L134
            io.realm.ShortValueOperator r0 = new io.realm.ShortValueOperator
            io.realm.SelectorForMap r1 = new io.realm.SelectorForMap
            r1.<init>(r15, r3, r4)
            r0.<init>(r15, r3, r1)
            goto L1ba
        L134:
            java.lang.String r4 = r2.getCanonicalName()
            boolean r4 = r14.equals(r4)
            if (r4 == 0) goto L14a
            io.realm.ByteValueOperator r0 = new io.realm.ByteValueOperator
            io.realm.SelectorForMap r1 = new io.realm.SelectorForMap
            r1.<init>(r15, r3, r2)
            r0.<init>(r15, r3, r1)
            goto L1ba
        L14a:
            java.lang.String r2 = r1.getCanonicalName()
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L16d
            io.realm.GenericPrimitiveValueOperator r8 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<byte[]> r2 = byte[].class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            r4.<init>(r15, r3, r1)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.BINARY
            io.realm.BinaryEquals r6 = new io.realm.BinaryEquals
            r6.<init>()
            r0 = r8
            r1 = r2
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L1ba
        L16d:
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L18e
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            r4.<init>(r15, r3, r0)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.OBJECT_ID
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        L18e:
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L1af
            io.realm.GenericPrimitiveValueOperator r6 = new io.realm.GenericPrimitiveValueOperator
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            io.realm.SelectorForMap r4 = new io.realm.SelectorForMap
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            r4.<init>(r15, r3, r0)
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.UUID
            r0 = r6
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            goto L1ba
        L1af:
            io.realm.RealmModelValueOperator r1 = new io.realm.RealmModelValueOperator
            io.realm.DynamicSelectorForMap r2 = new io.realm.DynamicSelectorForMap
            r2.<init>(r15, r3, r14)
            r1.<init>(r15, r3, r2)
            r0 = r1
        L1ba:
            io.realm.DictionaryManager r1 = new io.realm.DictionaryManager
            io.realm.TypeSelectorForMap<K, V> r2 = r0.typeSelectorForMap
            r1.<init>(r15, r0, r2)
            return r1
    }

    private static <V extends io.realm.RealmModel> io.realm.LinkSelectorForMap<java.lang.String, V> getRealmSelector(java.lang.Class<V> r1, io.realm.BaseRealm r2, io.realm.internal.OsMap r3) {
            io.realm.LinkSelectorForMap r0 = new io.realm.LinkSelectorForMap
            r0.<init>(r2, r3, r1)
            return r0
    }

    private static <V> io.realm.RealmMap.ManagedMapStrategy<java.lang.String, V> getStrategy(java.lang.Class<V> r2, io.realm.BaseRealm r3, io.realm.internal.OsMap r4) {
            boolean r0 = io.realm.CollectionUtils.isClassForRealmModel(r2)
            if (r0 == 0) goto L1a
            io.realm.LinkSelectorForMap r2 = getRealmSelector(r2, r3, r4)
            io.realm.DictionaryManager r0 = new io.realm.DictionaryManager
            io.realm.RealmModelValueOperator r1 = new io.realm.RealmModelValueOperator
            r1.<init>(r3, r4, r2)
            r0.<init>(r3, r1, r2)
            io.realm.RealmMap$ManagedMapStrategy r2 = new io.realm.RealmMap$ManagedMapStrategy
            r2.<init>(r0)
            return r2
        L1a:
            io.realm.DictionaryManager r2 = getManager(r2, r3, r4)
            io.realm.RealmMap$ManagedMapStrategy r3 = new io.realm.RealmMap$ManagedMapStrategy
            r3.<init>(r2)
            return r3
    }

    private static <V> io.realm.RealmMap.ManagedMapStrategy<java.lang.String, V> getStrategy(java.lang.String r0, io.realm.BaseRealm r1, io.realm.internal.OsMap r2) {
            io.realm.DictionaryManager r0 = getManager(r0, r1, r2)
            io.realm.RealmMap$ManagedMapStrategy r1 = new io.realm.RealmMap$ManagedMapStrategy
            r1.<init>(r0)
            return r1
    }

    private java.util.Map<java.lang.String, V> toMap() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            r0.put(r3, r2)
            goto Ld
        L27:
            return r0
    }
}
