package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ThreadPoolDispatcherKt {
    /* JADX INFO: renamed from: $r8$lambda$IYX-93i18CF3E6e1K_suGGxRFcI, reason: not valid java name */
    public static /* synthetic */ java.lang.Thread m1811$r8$lambda$IYX93i18CF3E6e1K_suGGxRFcI(int r0, java.lang.String r1, java.util.concurrent.atomic.AtomicInteger r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = m1812newFixedThreadPoolContext$lambda1(r0, r1, r2, r3)
            return r0
    }

    @kotlinx.coroutines.DelicateCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = 1
            if (r2 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0 r1 = new kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0
            r1.<init>(r2, r3, r0)
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r2 = kotlinx.coroutines.ExecutorsKt.from(r2)
            return r2
        L1a:
            java.lang.String r3 = "Expected at least one thread, but "
            java.lang.String r0 = " specified"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r0)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: newFixedThreadPoolContext$lambda-1, reason: not valid java name */
    private static final java.lang.Thread m1812newFixedThreadPoolContext$lambda1(int r2, java.lang.String r3, java.util.concurrent.atomic.AtomicInteger r4, java.lang.Runnable r5) {
            java.lang.Thread r0 = new java.lang.Thread
            r1 = 1
            if (r2 != r1) goto L6
            goto L1e
        L6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r3 = 45
            r2.append(r3)
            int r3 = r4.incrementAndGet()
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L1e:
            r0.<init>(r5, r3)
            r0.setDaemon(r1)
            return r0
    }

    @kotlinx.coroutines.DelicateCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            r0 = 1
            kotlinx.coroutines.ExecutorCoroutineDispatcher r1 = newFixedThreadPoolContext(r0, r1)
            return r1
    }
}
