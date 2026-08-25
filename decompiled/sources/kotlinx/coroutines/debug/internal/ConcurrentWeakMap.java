package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*:\u0003&'(B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "", "weakRefQueue", "<init>", "(Z)V", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "w", "", "cleanWeakRef", "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "clear", "()V", "decrementSize", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putSynchronized", "remove", "runWeakRefQueueCleaningLoopUntilInterrupted", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getSize", "()I", "size", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core", "Lkotlin/collections/AbstractMutableMap;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ConcurrentWeakMap<K, V> extends kotlin.collections.AbstractMutableMap<K, V> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _size$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int _size;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ java.lang.Object core;

    @org.jetbrains.annotations.Nullable
    private final java.lang.ref.ReferenceQueue<K> weakRefQueue;

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0018:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013\"\u0004\b\u0002\u0010\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010 R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "allocated", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "weakRef", "", "cleanWeakRef", "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "key", "getImpl", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "index", "(I)I", "E", "Lkotlin/Function2;", "factory", "", "keyValueIterator", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "value", "weakKey0", "", "putImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "rehash", "()Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "removeCleanedAt", "(I)V", "I", "shift", "threshold", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Core {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater load$FU = null;
        private final int allocated;

        @org.jetbrains.annotations.NotNull
        public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray keys;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ int load;
        private final int shift;
        public final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> this$0;
        private final int threshold;

        @org.jetbrains.annotations.NotNull
        public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray values;

        /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
        /* JADX INFO: loaded from: classes.dex */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", "index", "", "key", "Ljava/lang/Object;", "value", "findNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public final class KeyValueIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {

            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function2<K, V, E> factory;
            private int index;
            private K key;
            public final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core this$0;
            private V value;

            public KeyValueIterator(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r1, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.factory = r2
                    r1 = -1
                    r0.index = r1
                    r0.findNext()
                    return
            }

            private final void findNext() {
                    r2 = this;
                L0:
                    int r0 = r2.index
                    int r0 = r0 + 1
                    r2.index = r0
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r1 = r2.this$0
                    int r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getAllocated$p(r1)
                    if (r0 >= r1) goto L3d
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r0 = r2.this$0
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.keys
                    int r1 = r2.index
                    java.lang.Object r0 = r0.get(r1)
                    kotlinx.coroutines.debug.internal.HashedWeakRef r0 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r0
                    if (r0 != 0) goto L1e
                    r0 = 0
                    goto L22
                L1e:
                    java.lang.Object r0 = r0.get()
                L22:
                    if (r0 != 0) goto L25
                    goto L0
                L25:
                    r2.key = r0
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r0 = r2.this$0
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.values
                    int r1 = r2.index
                    java.lang.Object r0 = r0.get(r1)
                    boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.Marked
                    if (r1 == 0) goto L39
                    kotlinx.coroutines.debug.internal.Marked r0 = (kotlinx.coroutines.debug.internal.Marked) r0
                    java.lang.Object r0 = r0.ref
                L39:
                    if (r0 == 0) goto L0
                    r2.value = r0
                L3d:
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.index
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r1 = r2.this$0
                    int r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getAllocated$p(r1)
                    if (r0 >= r1) goto Lc
                    r0 = 1
                    goto Ld
                Lc:
                    r0 = 0
                Ld:
                    return r0
            }

            @Override // java.util.Iterator
            public E next() {
                    r3 = this;
                    int r0 = r3.index
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r1 = r3.this$0
                    int r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getAllocated$p(r1)
                    if (r0 >= r1) goto L2b
                    kotlin.jvm.functions.Function2<K, V, E> r0 = r3.factory
                    K r1 = r3.key
                    if (r1 != 0) goto L17
                    java.lang.String r1 = "key"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                L17:
                    V r2 = r3.value
                    if (r2 != 0) goto L23
                    java.lang.String r2 = "value"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                L23:
                    java.lang.Object r0 = r0.invoke(r1, r2)
                    r3.findNext()
                    return r0
                L2b:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            @org.jetbrains.annotations.NotNull
            public java.lang.Void remove() {
                    r1 = this;
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl()
                    kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                    r0 = this;
                    r0.remove()
                    return
            }
        }

        static {
                java.lang.Class<kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core> r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.class
                java.lang.String r1 = "load"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.load$FU = r0
                return
        }

        public Core(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.allocated = r2
                int r1 = java.lang.Integer.numberOfLeadingZeros(r2)
                int r1 = r1 + 1
                r0.shift = r1
                int r1 = r2 * 2
                int r1 = r1 / 3
                r0.threshold = r1
                r1 = 0
                r0.load = r1
                java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
                r1.<init>(r2)
                r0.keys = r1
                java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
                r1.<init>(r2)
                r0.values = r1
                return
        }

        public static final /* synthetic */ int access$getAllocated$p(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r0) {
                int r0 = r0.allocated
                return r0
        }

        private final int index(int r2) {
                r1 = this;
                r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
                int r2 = r2 * r0
                int r0 = r1.shift
                int r2 = r2 >>> r0
                return r2
        }

        public static /* synthetic */ java.lang.Object putImpl$default(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r0, java.lang.Object r1, java.lang.Object r2, kotlinx.coroutines.debug.internal.HashedWeakRef r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.lang.Object r0 = r0.putImpl(r1, r2, r3)
                return r0
        }

        private final void removeCleanedAt(int r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.values
                java.lang.Object r0 = r0.get(r4)
                if (r0 != 0) goto L9
                return
            L9:
                boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r1 == 0) goto Le
                return
            Le:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.values
                r2 = 0
                boolean r0 = r1.compareAndSet(r4, r0, r2)
                if (r0 == 0) goto L0
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r4 = r3.this$0
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$decrementSize(r4)
                return
        }

        public final void cleanWeakRef(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.HashedWeakRef<?> r3) {
                r2 = this;
                int r0 = r3.hash
                int r0 = r2.index(r0)
            L6:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.keys
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r1 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r1
                if (r1 != 0) goto L11
                return
            L11:
                if (r1 != r3) goto L17
                r2.removeCleanedAt(r0)
                return
            L17:
                if (r0 != 0) goto L1b
                int r0 = r2.allocated
            L1b:
                int r0 = r0 + (-1)
                goto L6
        }

        @org.jetbrains.annotations.Nullable
        public final V getImpl(@org.jetbrains.annotations.NotNull K r4) {
                r3 = this;
                int r0 = r4.hashCode()
                int r0 = r3.index(r0)
            L8:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.keys
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r1 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r1
                if (r1 != 0) goto L14
                r4 = 0
                return r4
            L14:
                java.lang.Object r1 = r1.get()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                if (r2 == 0) goto L2d
                java.util.concurrent.atomic.AtomicReferenceArray r4 = r3.values
                java.lang.Object r4 = r4.get(r0)
                boolean r0 = r4 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r0 == 0) goto L2c
                kotlinx.coroutines.debug.internal.Marked r4 = (kotlinx.coroutines.debug.internal.Marked) r4
                java.lang.Object r4 = r4.ref
            L2c:
                return r4
            L2d:
                if (r1 != 0) goto L32
                r3.removeCleanedAt(r0)
            L32:
                if (r0 != 0) goto L36
                int r0 = r3.allocated
            L36:
                int r0 = r0 + (-1)
                goto L8
        }

        @org.jetbrains.annotations.NotNull
        public final <E> java.util.Iterator<E> keyValueIterator(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$KeyValueIterator r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$KeyValueIterator
                r0.<init>(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object putImpl(@org.jetbrains.annotations.NotNull K r6, @org.jetbrains.annotations.Nullable V r7, @org.jetbrains.annotations.Nullable kotlinx.coroutines.debug.internal.HashedWeakRef<K> r8) {
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.index(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.keys
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r2
                if (r2 != 0) goto L45
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L2f
            L19:
                int r1 = r5.load
                int r3 = r5.threshold
                if (r1 < r3) goto L24
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.load$FU
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 == 0) goto L19
                r1 = 1
            L2f:
                if (r8 != 0) goto L3c
                kotlinx.coroutines.debug.internal.HashedWeakRef r8 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r3 = r5.this$0
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getWeakRefQueue$p(r3)
                r8.<init>(r6, r3)
            L3c:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.keys
                boolean r2 = r3.compareAndSet(r0, r2, r8)
                if (r2 == 0) goto L9
                goto L56
            L45:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
                if (r3 == 0) goto L6e
                if (r1 == 0) goto L56
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.load$FU
                r6.decrementAndGet(r5)
            L56:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.values
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r8 == 0) goto L65
                kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r6
            L65:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.values
                boolean r8 = r8.compareAndSet(r0, r6, r7)
                if (r8 == 0) goto L56
                return r6
            L6e:
                if (r2 != 0) goto L73
                r5.removeCleanedAt(r0)
            L73:
                if (r0 != 0) goto L77
                int r0 = r5.allocated
            L77:
                int r0 = r0 + (-1)
                goto L9
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core rehash() {
                r9 = this;
            L0:
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r0 = r9.this$0
                int r0 = r0.size()
                r1 = 4
                int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
                int r0 = java.lang.Integer.highestOneBit(r0)
                int r0 = r0 * 4
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r1 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r2 = r9.this$0
                r1.<init>(r2, r0)
                r0 = 0
                int r2 = r9.allocated
            L1b:
                if (r0 >= r2) goto L62
                int r3 = r0 + 1
                java.util.concurrent.atomic.AtomicReferenceArray r4 = r9.keys
                java.lang.Object r4 = r4.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r4 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r4
                if (r4 != 0) goto L2b
                r5 = 0
                goto L2f
            L2b:
                java.lang.Object r5 = r4.get()
            L2f:
                if (r4 == 0) goto L36
                if (r5 != 0) goto L36
                r9.removeCleanedAt(r0)
            L36:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r9.values
                java.lang.Object r6 = r6.get(r0)
                boolean r7 = r6 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r7 == 0) goto L45
                kotlinx.coroutines.debug.internal.Marked r6 = (kotlinx.coroutines.debug.internal.Marked) r6
                java.lang.Object r6 = r6.ref
                goto L51
            L45:
                java.util.concurrent.atomic.AtomicReferenceArray r7 = r9.values
                kotlinx.coroutines.debug.internal.Marked r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$mark(r6)
                boolean r7 = r7.compareAndSet(r0, r6, r8)
                if (r7 == 0) goto L36
            L51:
                if (r5 == 0) goto L60
                if (r6 == 0) goto L60
                java.lang.Object r0 = r1.putImpl(r5, r6, r4)
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                if (r0 != r4) goto L60
                goto L0
            L60:
                r0 = r3
                goto L1b
            L62:
                return r1
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Entry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
        private final K key;
        private final V value;

        public Entry(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r1) {
                r0 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl()
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0096\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class KeyValueSet<E> extends kotlin.collections.AbstractMutableSet<E> {

        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function2<K, V, E> factory;
        public final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> this$0;

        public KeyValueSet(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.ConcurrentWeakMap r1, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.factory = r2
                return
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E r1) {
                r0 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl()
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
                r1 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @org.jetbrains.annotations.NotNull
        public java.util.Iterator<E> iterator() {
                r2 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r0 = r2.this$0
                java.lang.Object r0 = r0.core
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0
                kotlin.jvm.functions.Function2<K, V, E> r1 = r2.factory
                java.util.Iterator r0 = r0.keyValueIterator(r1)
                return r0
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.debug.internal.ConcurrentWeakMap> r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.class
            java.lang.String r1 = "_size"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap._size$FU = r0
            return
    }

    public ConcurrentWeakMap() {
            r3 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    public ConcurrentWeakMap(boolean r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._size = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core
            r1 = 16
            r0.<init>(r2, r1)
            r2.core = r0
            if (r3 == 0) goto L17
            java.lang.ref.ReferenceQueue r3 = new java.lang.ref.ReferenceQueue
            r3.<init>()
            goto L18
        L17:
            r3 = 0
        L18:
            r2.weakRefQueue = r3
            return
    }

    public /* synthetic */ ConcurrentWeakMap(boolean r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void access$decrementSize(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0) {
            r0.decrementSize()
            return
    }

    public static final /* synthetic */ java.lang.ref.ReferenceQueue access$getWeakRefQueue$p(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0) {
            java.lang.ref.ReferenceQueue<K> r0 = r0.weakRefQueue
            return r0
    }

    private final void cleanWeakRef(kotlinx.coroutines.debug.internal.HashedWeakRef<?> r2) {
            r1 = this;
            java.lang.Object r0 = r1.core
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0
            r0.cleanWeakRef(r2)
            return
    }

    private final void decrementSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap._size$FU
            r0.decrementAndGet(r1)
            return
    }

    private final synchronized V putSynchronized(K r8, V r9) {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object r0 = r7.core     // Catch: java.lang.Throwable -> L1e
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0     // Catch: java.lang.Throwable -> L1e
        L5:
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            java.lang.Object r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1e
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()     // Catch: java.lang.Throwable -> L1e
            if (r1 == r2) goto L17
            monitor-exit(r7)
            return r1
        L17:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = r0.rehash()     // Catch: java.lang.Throwable -> L1e
            r7.core = r0     // Catch: java.lang.Throwable -> L1e
            goto L5
        L1e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r2 = this;
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            r2.remove(r1)
            goto L8
        L16:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.Object r0 = r1.core
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0
            java.lang.Object r2 = r0.getImpl(r2)
            return r2
    }

    @Override // kotlin.collections.AbstractMutableMap
    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r2 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1 r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1.INSTANCE
            r0.<init>(r2, r1)
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap
    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> getKeys() {
            r2 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1 r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1.INSTANCE
            r0.<init>(r2, r1)
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public V put(@org.jetbrains.annotations.NotNull K r8, @org.jetbrains.annotations.NotNull V r9) {
            r7 = this;
            java.lang.Object r0 = r7.core
            r1 = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r1 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r1
            r4 = 0
            r5 = 4
            r6 = 0
            r2 = r8
            r3 = r9
            java.lang.Object r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
            if (r0 != r1) goto L18
            java.lang.Object r0 = r7.putSynchronized(r8, r9)
        L18:
            if (r0 != 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap._size$FU
            r8.incrementAndGet(r7)
        L1f:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public V remove(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r8.core
            r2 = r1
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r2 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r2
            r4 = 0
            r5 = 0
            r6 = 4
            r7 = 0
            r3 = r9
            java.lang.Object r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.putSynchronized(r9, r0)
        L1c:
            if (r1 == 0) goto L23
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap._size$FU
            r9.decrementAndGet(r8)
        L23:
            return r1
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
            r2 = this;
            java.lang.ref.ReferenceQueue<K> r0 = r2.weakRefQueue
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L27
        L9:
            java.lang.ref.ReferenceQueue<K> r0 = r2.weakRefQueue     // Catch: java.lang.InterruptedException -> L1f
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L1f
            if (r0 == 0) goto L17
            kotlinx.coroutines.debug.internal.HashedWeakRef r0 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r0     // Catch: java.lang.InterruptedException -> L1f
            r2.cleanWeakRef(r0)     // Catch: java.lang.InterruptedException -> L1f
            goto L9
        L17:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.InterruptedException -> L1f
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1f
            throw r0     // Catch: java.lang.InterruptedException -> L1f
        L1f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be created with weakRefQueue = true"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
