package androidx.core.util;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aû\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\b\u0006\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000e2d\b\u0006\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"lruCache", "Landroid/util/LruCache;", "K", "V", "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LruCacheKt {




    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    public static final class AnonymousClass4<K, V> extends android.util.LruCache<K, V> {
        public final /* synthetic */ kotlin.jvm.functions.Function1<K, V> $create;
        public final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit> $onEntryRemoved;
        public final /* synthetic */ kotlin.jvm.functions.Function2<K, V, java.lang.Integer> $sizeOf;

        public AnonymousClass4(int r1, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> r2, kotlin.jvm.functions.Function1<? super K, ? extends V> r3, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> r4) {
                r0 = this;
                r0.$sizeOf = r2
                r0.$create = r3
                r0.$onEntryRemoved = r4
                r0.<init>(r1)
                return
        }

        @Override // android.util.LruCache
        @org.jetbrains.annotations.Nullable
        public final V create(@org.jetbrains.annotations.NotNull K r2) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.jvm.functions.Function1<K, V> r0 = r1.$create
                java.lang.Object r2 = r0.invoke(r2)
                return r2
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean r2, @org.jetbrains.annotations.NotNull K r3, @org.jetbrains.annotations.NotNull V r4, @org.jetbrains.annotations.Nullable V r5) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "oldValue"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit> r0 = r1.$onEntryRemoved
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.invoke(r2, r3, r4, r5)
                return
        }

        @Override // android.util.LruCache
        public final int sizeOf(@org.jetbrains.annotations.NotNull K r2, @org.jetbrains.annotations.NotNull V r3) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.jvm.functions.Function2<K, V, java.lang.Integer> r0 = r1.$sizeOf
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                return r2
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> android.util.LruCache<K, V> lruCache(int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> r4) {
            java.lang.String r0 = "sizeOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "create"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onEntryRemoved"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.core.util.LruCacheKt$lruCache$4 r0 = new androidx.core.util.LruCacheKt$lruCache$4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ android.util.LruCache lruCache$default(int r0, kotlin.jvm.functions.Function2 r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function4 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            androidx.core.util.LruCacheKt$lruCache$1 r1 = androidx.core.util.LruCacheKt.AnonymousClass1.INSTANCE
        L6:
            r5 = r4 & 4
            if (r5 == 0) goto Lc
            androidx.core.util.LruCacheKt$lruCache$2 r2 = androidx.core.util.LruCacheKt.AnonymousClass2.INSTANCE
        Lc:
            r4 = r4 & 8
            if (r4 == 0) goto L12
            androidx.core.util.LruCacheKt$lruCache$3 r3 = androidx.core.util.LruCacheKt.AnonymousClass3.INSTANCE
        L12:
            java.lang.String r4 = "sizeOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "create"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "onEntryRemoved"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            androidx.core.util.LruCacheKt$lruCache$4 r4 = new androidx.core.util.LruCacheKt$lruCache$4
            r4.<init>(r0, r1, r2, r3)
            return r4
    }
}
