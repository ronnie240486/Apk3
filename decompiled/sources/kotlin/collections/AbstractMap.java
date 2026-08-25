package kotlin.collections;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\r\b'\u0018\u0000 +*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001+J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001f8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "", "entry", "", "toString", "", "o", "key", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "isEmpty", "", "_keys", "Ljava/util/Set;", "", "_values", "Ljava/util/Collection;", "getSize", "()I", "size", "getKeys", "()Ljava/util/Set;", "keys", "getValues", "()Ljava/util/Collection;", "values", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractMap<K, V> implements java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.AbstractMap.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private volatile java.util.Set<? extends K> _keys;

    @org.jetbrains.annotations.Nullable
    private volatile java.util.Collection<? extends V> _values;

    /* JADX INFO: compiled from: AbstractMap.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean entryEquals$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<?, ?> r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r3 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto Lb
                return r1
            Lb:
                java.lang.Object r0 = r4.getKey()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r2 = r5.getKey()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L2a
                java.lang.Object r4 = r4.getValue()
                java.lang.Object r5 = r5.getValue()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
                if (r4 == 0) goto L2a
                r1 = 1
            L2a:
                return r1
        }

        public final int entryHashCode$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<?, ?> r3) {
                r2 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto L11
                int r0 = r0.hashCode()
                goto L12
            L11:
                r0 = 0
            L12:
                java.lang.Object r3 = r3.getValue()
                if (r3 == 0) goto L1c
                int r1 = r3.hashCode()
            L1c:
                r3 = r0 ^ r1
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String entryToString$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<?, ?> r3) {
                r2 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r3.getKey()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.Object r3 = r3.getValue()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }



    static {
            kotlin.collections.AbstractMap$Companion r0 = new kotlin.collections.AbstractMap$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.AbstractMap.Companion = r0
            return
    }

    public AbstractMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.String access$toString(kotlin.collections.AbstractMap r0, java.util.Map.Entry r1) {
            java.lang.String r0 = r0.toString(r1)
            return r0
    }

    private final java.util.Map.Entry<K, V> implFindEntry(K r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L8
            goto L21
        L20:
            r1 = 0
        L21:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    private final java.lang.String toString(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L5
            java.lang.String r1 = "(this Map)"
            goto L9
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L9:
            return r1
    }

    private final java.lang.String toString(java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = r2.toString(r1)
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = r2.toString(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final boolean containsEntry$kotlin_stdlib(@org.jetbrains.annotations.Nullable java.util.Map.Entry<?, ?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r2)
            java.lang.Object r2 = r3.get(r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r4 != 0) goto L1c
            return r0
        L1c:
            if (r2 != 0) goto L2a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            boolean r4 = r3.containsKey(r1)
            if (r4 != 0) goto L2a
            return r0
        L2a:
            r4 = 1
            return r4
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.implFindEntry(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L10
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            goto L2b
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == 0) goto L14
            r2 = 1
        L2b:
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r4.size()
            java.util.Map r5 = (java.util.Map) r5
            int r3 = r5.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Set r5 = r5.entrySet()
            boolean r1 = r5 instanceof java.util.Collection
            if (r1 == 0) goto L26
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L26
            goto L3d
        L26:
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r4.containsEntry$kotlin_stdlib(r1)
            if (r1 != 0) goto L2a
            r0 = 0
        L3d:
            return r0
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.implFindEntry(r1)
            if (r1 == 0) goto Lb
            java.lang.Object r1 = r1.getValue()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public abstract java.util.Set getEntries();

    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> getKeys() {
            r1 = this;
            java.util.Set<? extends K> r0 = r1._keys
            if (r0 != 0) goto Lb
            kotlin.collections.AbstractMap$keys$1 r0 = new kotlin.collections.AbstractMap$keys$1
            r0.<init>(r1)
            r1._keys = r0
        Lb:
            java.util.Set<? extends K> r0 = r1._keys
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public int getSize() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<V> getValues() {
            r1 = this;
            java.util.Collection<? extends V> r0 = r1._values
            if (r0 != 0) goto Lb
            kotlin.collections.AbstractMap$values$1 r0 = new kotlin.collections.AbstractMap$values$1
            r0.<init>(r1)
            r1._values = r0
        Lb:
            java.util.Collection<? extends V> r0 = r1._values
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @Override // java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r9 = this;
            java.util.Set r0 = r9.entrySet()
            kotlin.collections.AbstractMap$toString$1 r6 = new kotlin.collections.AbstractMap$toString$1
            r6.<init>(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            r4 = 0
            r5 = 0
            r7 = 24
            r8 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }
}
