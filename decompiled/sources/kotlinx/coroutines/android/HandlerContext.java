package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HandlerContext extends kotlinx.coroutines.android.HandlerDispatcher {

    @org.jetbrains.annotations.Nullable
    private volatile kotlinx.coroutines.android.HandlerContext _immediate;

    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.android.HandlerContext immediate;
    private final boolean invokeImmediately;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;


    /* JADX INFO: renamed from: $r8$lambda$-TOZof2GYGCn1P43qXNY1O5Gvm8, reason: not valid java name */
    public static /* synthetic */ void m1815$r8$lambda$TOZof2GYGCn1P43qXNY1O5Gvm8(kotlinx.coroutines.android.HandlerContext r0, java.lang.Runnable r1) {
            m1816invokeOnTimeout$lambda3(r0, r1)
            return
    }

    public HandlerContext(@org.jetbrains.annotations.NotNull android.os.Handler r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public /* synthetic */ HandlerContext(android.os.Handler r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private HandlerContext(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.handler = r2
            r1.name = r3
            r1.invokeImmediately = r4
            if (r4 == 0) goto Ld
            r0 = r1
        Ld:
            r1._immediate = r0
            kotlinx.coroutines.android.HandlerContext r4 = r1._immediate
            if (r4 != 0) goto L1b
            kotlinx.coroutines.android.HandlerContext r4 = new kotlinx.coroutines.android.HandlerContext
            r0 = 1
            r4.<init>(r2, r3, r0)
            r1._immediate = r4
        L1b:
            r1.immediate = r4
            return
    }

    public static final /* synthetic */ android.os.Handler access$getHandler$p(kotlinx.coroutines.android.HandlerContext r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    private final void cancelOnRejection(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "' was closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            kotlinx.coroutines.JobKt.cancel(r4, r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r0.mo1866dispatch(r4, r5)
            return
    }

    /* JADX INFO: renamed from: invokeOnTimeout$lambda-3, reason: not valid java name */
    private static final void m1816invokeOnTimeout$lambda3(kotlinx.coroutines.android.HandlerContext r0, java.lang.Runnable r1) {
            android.os.Handler r0 = r0.handler
            r0.removeCallbacks(r1)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.cancelOnRejection(r2, r3)
        Lb:
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.android.HandlerContext
            if (r0 == 0) goto Le
            kotlinx.coroutines.android.HandlerContext r2 = (kotlinx.coroutines.android.HandlerContext) r2
            android.os.Handler r2 = r2.handler
            android.os.Handler r0 = r1.handler
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public /* bridge */ /* synthetic */ kotlinx.coroutines.MainCoroutineDispatcher getImmediate() {
            r1 = this;
            kotlinx.coroutines.android.HandlerContext r0 = r1.getImmediate()
            return r0
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.android.HandlerContext getImmediate() {
            r1 = this;
            kotlinx.coroutines.android.HandlerContext r0 = r1.immediate
            return r0
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public /* bridge */ /* synthetic */ kotlinx.coroutines.android.HandlerDispatcher getImmediate() {
            r1 = this;
            kotlinx.coroutines.android.HandlerContext r0 = r1.getImmediate()
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.handler
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r4, @org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r7) {
            r3 = this;
            android.os.Handler r0 = r3.handler
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r4 = kotlin.ranges.RangesKt.coerceAtMost(r4, r1)
            boolean r4 = r0.postDelayed(r6, r4)
            if (r4 == 0) goto L17
            kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda0 r4 = new kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda0
            r4.<init>(r3, r6)
            return r4
        L17:
            r3.cancelOnRejection(r7, r6)
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            return r4
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            boolean r2 = r1.invokeImmediately
            if (r2 == 0) goto L17
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Handler r0 = r1.handler
            android.os.Looper r0 = r0.getLooper()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1867scheduleResumeAfterDelay(long r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r7) {
            r4 = this;
            kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1 r0 = new kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1
            r0.<init>(r7, r4)
            android.os.Handler r1 = r4.handler
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r2)
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L1f
            kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1 r5 = new kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
            r5.<init>(r4, r0)
            r7.invokeOnCancellation(r5)
            goto L26
        L1f:
            kotlin.coroutines.CoroutineContext r5 = r7.getContext()
            r4.cancelOnRejection(r5, r0)
        L26:
            return
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toStringInternalImpl()
            if (r0 != 0) goto L1a
            java.lang.String r0 = r2.name
            if (r0 != 0) goto L10
            android.os.Handler r0 = r2.handler
            java.lang.String r0 = r0.toString()
        L10:
            boolean r1 = r2.invokeImmediately
            if (r1 == 0) goto L1a
            java.lang.String r1 = ".immediate"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
        L1a:
            return r0
    }
}
