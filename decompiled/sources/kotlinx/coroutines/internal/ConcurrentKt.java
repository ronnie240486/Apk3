package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Concurrent.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0080\b\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u0002H\u00040\fj\b\u0012\u0004\u0012\u0002H\u0004`\r\"\u0004\b\u0000\u0010\u0004H\u0000\u001a*\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00060\u0010j\u0002`\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0080\b¢\u0006\u0002\u0010\u0014\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u0010\u0015\"\u00020\u00102\u00020\u0010¨\u0006\u0016"}, d2 = {"REMOVE_FUTURE_ON_CANCEL", "Ljava/lang/reflect/Method;", "identitySet", "", "E", "expectedSize", "", "removeFutureOnCancel", "", "executor", "Ljava/util/concurrent/Executor;", "subscriberList", "", "Lkotlinx/coroutines/internal/SubscribersList;", "withLock", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ReentrantLock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ConcurrentKt {

    @org.jetbrains.annotations.Nullable
    private static final java.lang.reflect.Method REMOVE_FUTURE_ON_CANCEL = null;

    static {
            java.lang.Class<java.util.concurrent.ScheduledThreadPoolExecutor> r0 = java.util.concurrent.ScheduledThreadPoolExecutor.class
            java.lang.String r1 = "setRemoveOnCancelPolicy"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L12
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L12
            r2[r3] = r4     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r0 = 0
        L13:
            kotlinx.coroutines.internal.ConcurrentKt.REMOVE_FUTURE_ON_CANCEL = r0
            return
    }

    public static /* synthetic */ void ReentrantLock$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.util.Set<E> identitySet(int r1) {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>(r1)
            java.util.Set r1 = java.util.Collections.newSetFromMap(r0)
            return r1
    }

    public static final boolean removeFutureOnCancel(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r5) {
            r0 = 0
            boolean r1 = r5 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L8
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = (java.util.concurrent.ScheduledThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L1c
            goto L9
        L8:
            r5 = 0
        L9:
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.lang.reflect.Method r1 = kotlinx.coroutines.internal.ConcurrentKt.REMOVE_FUTURE_ON_CANCEL     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L11
            return r0
        L11:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            r3[r0] = r4     // Catch: java.lang.Throwable -> L1c
            r1.invoke(r5, r3)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.util.List<E> subscriberList() {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            return r0
    }

    public static final <T> T withLock(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.ReentrantLock r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r2
        L12:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }
}
