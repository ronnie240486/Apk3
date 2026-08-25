package kotlinx.coroutines;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a\u001b\u0010\u001b\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__JobKt {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CompletableJob Job(@org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.JobImpl r0 = new kotlinx.coroutines.JobImpl
            r0.<init>(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kotlin.jvm.JvmName(name = "Job")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m1807Job(kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt.Job(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.JobKt.Job(r0)
            return r0
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m1808Job$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.JobKt.m1805Job(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancel(kotlin.coroutines.CoroutineContext r1) {
            r0 = 0
            kotlinx.coroutines.JobKt.cancel(r1, r0)
            return
    }

    public static final void cancel(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto Lb
            goto Le
        Lb:
            r1.cancel(r2)
        Le:
            return
    }

    public static final void cancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r1 = kotlinx.coroutines.ExceptionsKt.CancellationException(r1, r2)
            r0.cancel(r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(kotlin.coroutines.CoroutineContext r1, java.lang.Throwable r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            boolean r0 = r1 instanceof kotlinx.coroutines.JobSupport
            if (r0 == 0) goto Ld
            kotlinx.coroutines.JobSupport r1 = (kotlinx.coroutines.JobSupport) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L12
            r1 = 0
            return r1
        L12:
            java.lang.Throwable r2 = orCancellation$JobKt__JobKt(r2, r1)
            r1.cancelInternal(r2)
            r1 = 1
            return r1
    }

    public static /* synthetic */ void cancel$default(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancel(r0, r1)
            return
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.Job r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.JobKt.cancel(r0, r1, r2)
            return
    }

    public static /* synthetic */ boolean cancel$default(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            boolean r0 = kotlinx.coroutines.JobKt.cancel(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object cancelAndJoin(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = 0
            r1 = 1
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r2, r0, r1, r0)
            java.lang.Object r2 = r2.join(r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L10
            return r2
        L10:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext r1) {
            r0 = 0
            kotlinx.coroutines.JobKt.cancelChildren(r1, r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext r3, java.lang.Throwable r4) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r0)
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            if (r3 != 0) goto Lb
            return
        Lb:
            kotlin.sequences.Sequence r0 = r3.getChildren()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            boolean r2 = r1 instanceof kotlinx.coroutines.JobSupport
            if (r2 == 0) goto L26
            kotlinx.coroutines.JobSupport r1 = (kotlinx.coroutines.JobSupport) r1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 != 0) goto L2a
            goto L13
        L2a:
            java.lang.Throwable r2 = orCancellation$JobKt__JobKt(r4, r3)
            r1.cancelInternal(r2)
            goto L13
        L32:
            return
    }

    public static final void cancelChildren(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto Lb
            goto L26
        Lb:
            kotlin.sequences.Sequence r1 = r1.getChildren()
            if (r1 != 0) goto L12
            goto L26
        L12:
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r0.cancel(r2)
            goto L16
        L26:
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job r1) {
            r0 = 0
            kotlinx.coroutines.JobKt.cancelChildren(r1, r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job r3, java.lang.Throwable r4) {
            kotlin.sequences.Sequence r0 = r3.getChildren()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            boolean r2 = r1 instanceof kotlinx.coroutines.JobSupport
            if (r2 == 0) goto L1b
            kotlinx.coroutines.JobSupport r1 = (kotlinx.coroutines.JobSupport) r1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L1f
            goto L8
        L1f:
            java.lang.Throwable r2 = orCancellation$JobKt__JobKt(r4, r3)
            r1.cancelInternal(r2)
            goto L8
        L27:
            return
    }

    public static final void cancelChildren(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            kotlin.sequences.Sequence r1 = r1.getChildren()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r0.cancel(r2)
            goto L8
        L18:
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.JobKt.cancelChildren(r0, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.DisposableHandle r2) {
            kotlinx.coroutines.DisposeOnCompletion r0 = new kotlinx.coroutines.DisposeOnCompletion
            r0.<init>(r2)
            kotlinx.coroutines.DisposableHandle r1 = r1.invokeOnCompletion(r0)
            return r1
    }

    public static final void ensureActive(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto Lb
            goto Le
        Lb:
            kotlinx.coroutines.JobKt.ensureActive(r1)
        Le:
            return
    }

    public static final void ensureActive(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1) {
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.Job getJob(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Current context doesn't contain Job in it: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static final boolean isActive(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r0)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r0 = 0
            r1 = 1
            if (r2 != 0) goto Ld
            goto L14
        Ld:
            boolean r2 = r2.isActive()
            if (r2 != r1) goto L14
            r0 = 1
        L14:
            return r0
    }

    private static final java.lang.Throwable orCancellation$JobKt__JobKt(java.lang.Throwable r2, kotlinx.coroutines.Job r3) {
            if (r2 != 0) goto La
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            r0 = 0
            java.lang.String r1 = "Job was cancelled"
            r2.<init>(r1, r0, r3)
        La:
            return r2
    }
}
