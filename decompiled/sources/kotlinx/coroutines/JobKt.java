package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class JobKt {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CompletableJob Job(@org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt__JobKt.Job(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kotlin.jvm.JvmName(name = "Job")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m1805Job(kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.JobKt__JobKt.m1807Job(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt__JobKt.Job$default(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m1806Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.JobKt__JobKt.m1808Job$default(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancel(kotlin.coroutines.CoroutineContext r0) {
            kotlinx.coroutines.JobKt__JobKt.cancel(r0)
            return
    }

    public static final void cancel(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            kotlinx.coroutines.JobKt__JobKt.cancel(r0, r1)
            return
    }

    public static final void cancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            kotlinx.coroutines.JobKt__JobKt.cancel(r0, r1, r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1) {
            boolean r0 = kotlinx.coroutines.JobKt__JobKt.cancel(r0, r1)
            return r0
    }

    public static /* synthetic */ void cancel$default(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.JobKt__JobKt.cancel$default(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.Job r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.JobKt__JobKt.cancel$default(r0, r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ boolean cancel$default(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            boolean r0 = kotlinx.coroutines.JobKt__JobKt.cancel$default(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object cancelAndJoin(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            java.lang.Object r0 = kotlinx.coroutines.JobKt__JobKt.cancelAndJoin(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext r0) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren(r0, r1)
            return
    }

    public static final void cancelChildren(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job r0, java.lang.Throwable r1) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren(r0, r1)
            return
    }

    public static final void cancelChildren(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3)
            return
    }

    public static final void cancelFutureOnCancellation(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<?> r0, @org.jetbrains.annotations.NotNull java.util.concurrent.Future<?> r1) {
            kotlinx.coroutines.JobKt__FutureKt.cancelFutureOnCancellation(r0, r1)
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.DisposableHandle cancelFutureOnCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull java.util.concurrent.Future<?> r1) {
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt__FutureKt.cancelFutureOnCompletion(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.DisposableHandle r1) {
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.JobKt__JobKt.disposeOnCompletion(r0, r1)
            return r0
    }

    public static final void ensureActive(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0) {
            kotlinx.coroutines.JobKt__JobKt.ensureActive(r0)
            return
    }

    public static final void ensureActive(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.JobKt__JobKt.ensureActive(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.Job getJob(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.JobKt__JobKt.getJob(r0)
            return r0
    }

    public static final boolean isActive(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0) {
            boolean r0 = kotlinx.coroutines.JobKt__JobKt.isActive(r0)
            return r0
    }
}
