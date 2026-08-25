package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher = null;

    static {
            kotlinx.coroutines.internal.MainDispatcherLoader r0 = new kotlinx.coroutines.internal.MainDispatcherLoader
            r0.<init>()
            kotlinx.coroutines.internal.MainDispatcherLoader.INSTANCE = r0
            java.lang.String r1 = "kotlinx.coroutines.fast.service.loader"
            r2 = 1
            boolean r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1, r2)
            kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED = r1
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.loadMainDispatcher()
            kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher = r0
            return
    }

    private MainDispatcherLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.MainCoroutineDispatcher loadMainDispatcher() {
            r7 = this;
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r1 = kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto Ld
            kotlinx.coroutines.internal.FastServiceLoader r0 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L67
            java.util.List r0 = r0.loadMainDispatcherFactory$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L67
            goto L21
        Ld:
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L67
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L67
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)     // Catch: java.lang.Throwable -> L67
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)     // Catch: java.lang.Throwable -> L67
        L21:
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L67
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            r3 = 0
            if (r2 != 0) goto L2e
            r2 = r3
            goto L55
        L2e:
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L67
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L39
            goto L55
        L39:
            r4 = r2
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch: java.lang.Throwable -> L67
            int r4 = r4.getLoadPriority()     // Catch: java.lang.Throwable -> L67
        L40:
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L67
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch: java.lang.Throwable -> L67
            int r6 = r6.getLoadPriority()     // Catch: java.lang.Throwable -> L67
            if (r4 >= r6) goto L4f
            r2 = r5
            r4 = r6
        L4f:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L40
        L55:
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L5b
            r0 = r3
            goto L5f
        L5b:
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(r2, r0)     // Catch: java.lang.Throwable -> L67
        L5f:
            if (r0 != 0) goto L6d
            r0 = 3
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r3, r0)     // Catch: java.lang.Throwable -> L67
            goto L6d
        L67:
            r0 = move-exception
            r1 = 2
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r0, r1)
        L6d:
            return r0
    }
}
