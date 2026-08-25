package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class WeakMapCtorCache extends kotlinx.coroutines.internal.CtorCache {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.WeakMapCtorCache INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.locks.ReentrantReadWriteLock cacheLock = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> exceptionCtors = null;

    static {
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = new kotlinx.coroutines.internal.WeakMapCtorCache
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors = r0
            return
    }

    private WeakMapCtorCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(@org.jetbrains.annotations.NotNull java.lang.Class<? extends java.lang.Throwable> r7) {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r2 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L6e
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L6e
            r1.unlock()
            if (r2 != 0) goto L6d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L26
            int r2 = r0.getReadHoldCount()
            goto L27
        L26:
            r2 = 0
        L27:
            r4 = 0
        L28:
            if (r4 >= r2) goto L30
            int r4 = r4 + 1
            r1.unlock()
            goto L28
        L30:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r4 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r4.get(r7)     // Catch: java.lang.Throwable -> L60
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L54
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.internal.ExceptionsConstructorKt.access$createConstructor(r7)     // Catch: java.lang.Throwable -> L60
            r4.put(r7, r5)     // Catch: java.lang.Throwable -> L60
        L48:
            if (r3 >= r2) goto L50
            int r3 = r3 + 1
            r1.lock()
            goto L48
        L50:
            r0.unlock()
            return r5
        L54:
            if (r3 >= r2) goto L5c
            int r3 = r3 + 1
            r1.lock()
            goto L54
        L5c:
            r0.unlock()
            return r5
        L60:
            r7 = move-exception
        L61:
            if (r3 >= r2) goto L69
            int r3 = r3 + 1
            r1.lock()
            goto L61
        L69:
            r0.unlock()
            throw r7
        L6d:
            return r2
        L6e:
            r7 = move-exception
            r1.unlock()
            throw r7
    }
}
