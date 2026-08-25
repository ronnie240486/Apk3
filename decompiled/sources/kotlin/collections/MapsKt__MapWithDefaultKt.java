package kotlin.collections;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\t\u001aX\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\tH\u0007¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"getOrImplicitDefault", "V", "K", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "withDefault", "defaultValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "withDefaultMutable", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapWithDefaultKt {
    public MapsKt__MapWithDefaultKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.PublishedApi
    @kotlin.jvm.JvmName(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V getOrImplicitDefaultNullable(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r2, K r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof kotlin.collections.MapWithDefault
            if (r0 == 0) goto L10
            kotlin.collections.MapWithDefault r2 = (kotlin.collections.MapWithDefault) r2
            java.lang.Object r2 = r2.getOrImplicitDefault(r3)
            return r2
        L10:
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L39
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L1d
            goto L39
        L1d:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Key "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is missing in the map."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L39:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> withDefault(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof kotlin.collections.MapWithDefault
            if (r0 == 0) goto L19
            kotlin.collections.MapWithDefault r1 = (kotlin.collections.MapWithDefault) r1
            java.util.Map r1 = r1.getMap()
            java.util.Map r1 = withDefault(r1, r2)
            goto L1f
        L19:
            kotlin.collections.MapWithDefaultImpl r0 = new kotlin.collections.MapWithDefaultImpl
            r0.<init>(r1, r2)
            r1 = r0
        L1f:
            return r1
    }

    @kotlin.jvm.JvmName(name = "withDefaultMutable")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> withDefaultMutable(@org.jetbrains.annotations.NotNull java.util.Map<K, V> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof kotlin.collections.MutableMapWithDefault
            if (r0 == 0) goto L19
            kotlin.collections.MutableMapWithDefault r1 = (kotlin.collections.MutableMapWithDefault) r1
            java.util.Map r1 = r1.getMap()
            java.util.Map r1 = withDefaultMutable(r1, r2)
            goto L1f
        L19:
            kotlin.collections.MutableMapWithDefaultImpl r0 = new kotlin.collections.MutableMapWithDefaultImpl
            r0.<init>(r1, r2)
            r1 = r0
        L1f:
            return r1
    }
}
