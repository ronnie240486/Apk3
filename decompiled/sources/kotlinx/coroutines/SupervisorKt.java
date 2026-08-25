package kotlinx.coroutines;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0000\u001aM\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"SupervisorJob", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "SupervisorJob0", "supervisorScope", "R", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SupervisorKt {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CompletableJob SupervisorJob(@org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.SupervisorJobImpl r0 = new kotlinx.coroutines.SupervisorJobImpl
            r0.<init>(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kotlin.jvm.JvmName(name = "SupervisorJob")
    /* JADX INFO: renamed from: SupervisorJob, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m1809SupervisorJob(kotlinx.coroutines.Job r0) {
            kotlinx.coroutines.CompletableJob r0 = SupervisorJob(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob SupervisorJob$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableJob r0 = SupervisorJob(r0)
            return r0
    }

    /* JADX INFO: renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m1810SupervisorJob$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.Job r0 = m1809SupervisorJob(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object supervisorScope(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r3) {
            kotlinx.coroutines.SupervisorCoroutine r0 = new kotlinx.coroutines.SupervisorCoroutine
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L16:
            return r2
    }
}
