package kotlin.collections;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B<\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010!J\u0013\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0018\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\b\u0010*\u001a\u00020\u0016H\u0016J\b\u0010+\u001a\u00020 H\u0016J\u001f\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\u00020\u001e2\u0014\u0010/\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0016J\u0017\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\b\u00102\u001a\u000203H\u0016R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lkotlin/collections/MutableMapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MutableMapWithDefault;", "map", "", "default", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "getMap", "()Ljava/util/Map;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrImplicitDefault", "hashCode", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class MutableMapWithDefaultImpl<K, V> implements kotlin.collections.MutableMapWithDefault<K, V> {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<K, V> f2default;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<K, V> map;

    public MutableMapWithDefaultImpl(@org.jetbrains.annotations.NotNull java.util.Map<K, V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r3) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.map = r2
            r1.f2default = r3
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> getKeys() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // kotlin.collections.MutableMapWithDefault, kotlin.collections.MapWithDefault
    @org.jetbrains.annotations.NotNull
    public java.util.Map<K, V> getMap() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.map
            return r0
    }

    @Override // kotlin.collections.MapWithDefault
    public V getOrImplicitDefault(K r3) {
            r2 = this;
            java.util.Map r0 = r2.getMap()
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L16
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L16
            kotlin.jvm.functions.Function1<K, V> r0 = r2.f2default
            java.lang.Object r1 = r0.invoke(r3)
        L16:
            return r1
    }

    public int getSize() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<V> getValues() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V put(K r2, V r3) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = r1.getMap()
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }
}
