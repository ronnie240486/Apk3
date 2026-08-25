package androidx.core.util;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0087\n\u001a!\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a&\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\f\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\r\u001aT\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u001a.\u0010\u0014\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0016\u001a7\u0010\u0017\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a\u0019\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a\u0018\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a-\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\u0002\u001a&\u0010 \u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a-\u0010!\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\"\u001a.\u0010#\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010$\u001a\u001e\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020&\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"size", "", "T", "Landroid/util/LongSparseArray;", "getSize", "(Landroid/util/LongSparseArray;)I", "contains", "", "key", "", "containsKey", "containsValue", "value", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "other", "putAll", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LongSparseArrayKt {


    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0097\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class C00551<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
        public final /* synthetic */ android.util.LongSparseArray<T> $this_valueIterator;
        private int index;

        public C00551(android.util.LongSparseArray<T> r1) {
                r0 = this;
                r0.$this_valueIterator = r1
                r0.<init>()
                return
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.Iterator
        @android.annotation.SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                android.util.LongSparseArray<T> r1 = r2.$this_valueIterator
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        @android.annotation.SuppressLint({"ClassVerificationFailure"})
        public T next() {
                r3 = this;
                android.util.LongSparseArray<T> r0 = r3.$this_valueIterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                java.lang.Object r0 = r0.valueAt(r1)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        public final void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean contains(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean containsKey(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean containsValue(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.indexOfValue(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> void forEach(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, ? super T, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L23
            long r2 = r4.keyAt(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r4.valueAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L23:
            return
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> T getOrDefault(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, long r2, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto Lc
            goto Ld
        Lc:
            r4 = r1
        Ld:
            return r4
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> T getOrElse(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L14
            java.lang.Object r1 = r4.invoke()
        L14:
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> int getSize(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean isEmpty(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.collections.LongIterator keyIterator(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.util.LongSparseArrayKt$keyIterator$1 r0 = new androidx.core.util.LongSparseArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final <T> android.util.LongSparseArray<T> plus(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r3, @org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    @androidx.annotation.RequiresApi(16)
    public static final <T> void putAll(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r5, @org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            long r2 = r6.keyAt(r1)
            java.lang.Object r4 = r6.valueAt(r1)
            r5.put(r2, r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean remove(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, long r2, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L1a
            java.lang.Object r3 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r3 == 0) goto L1a
            r1.removeAt(r2)
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final <T> void set(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1, long r2, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.put(r2, r4)
            return
    }

    @androidx.annotation.RequiresApi(16)
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<T> valueIterator(@org.jetbrains.annotations.NotNull android.util.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.util.LongSparseArrayKt$valueIterator$1 r0 = new androidx.core.util.LongSparseArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
