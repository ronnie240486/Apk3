package kotlinx.coroutines;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\u0018\u0010\u001c\u001a\u00020\u001f2\u000e\u0010\u001d\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017J\f\u0010\"\u001a\u00060 j\u0002`!H\u0017JA\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001f0(j\u0002`+H\u0017J1\u0010#\u001a\u00020$2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001f0(j\u0002`+H\u0017J\u0011\u0010,\u001a\u00020\u001fH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\nH\u0017J\b\u0010/\u001a\u00020\u0012H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\t\u0010\fR\u001a\u0010\r\u001a\u00020\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\u00020\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u00148VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlinx/coroutines/NonCancellable;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/Job;", "()V", "children", "Lkotlin/sequences/Sequence;", "getChildren$annotations", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "isActive$annotations", "()Z", "isCancelled", "isCancelled$annotations", "isCompleted", "isCompleted$annotations", "message", "", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "cause", "", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NonCancellable extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.Job {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.NonCancellable INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    static {
            kotlinx.coroutines.NonCancellable r0 = new kotlinx.coroutines.NonCancellable
            r0.<init>()
            kotlinx.coroutines.NonCancellable.INSTANCE = r0
            return
    }

    private NonCancellable() {
            r1 = this;
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            r1.<init>(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void getChildren$annotations() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void getOnJoin$annotations() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void isActive$annotations() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void isCancelled$annotations() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void isCompleted$annotations() {
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.ChildHandle attachChild(@org.jetbrains.annotations.NotNull kotlinx.coroutines.ChildJob r1) {
            r0 = this;
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void cancel(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.CancellationException getCancellationException() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job is always active"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
            r1 = this;
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This job is always active"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnCompletion(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1) {
            r0 = this;
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object join(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This job is always active"
            r2.<init>(r0)
            throw r2
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.Job plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1) {
            r0 = this;
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NonCancellable"
            return r0
    }
}
