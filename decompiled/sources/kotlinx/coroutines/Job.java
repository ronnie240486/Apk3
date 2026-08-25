package kotlinx.coroutines;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H\u0017J\u0014\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H'J\u001a\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H&J\f\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H'JE\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"H'J1\u0010\u001a\u001a\u00020\u001b2'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"H&J\u0011\u0010#\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0097\u0002J\b\u0010'\u001a\u00020\u0007H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus", "other", "start", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Job extends kotlin.coroutines.CoroutineContext.Element {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.Job.Key Key = null;

    /* JADX INFO: compiled from: Job.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(kotlinx.coroutines.Job r1) {
                r0 = 0
                r1.cancel(r0)
                return
        }

        public static /* synthetic */ void cancel$default(kotlinx.coroutines.Job r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.cancel(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        public static /* synthetic */ boolean cancel$default(kotlinx.coroutines.Job r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.cancel(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        public static <R> R fold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
                java.lang.Object r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r0, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1) {
                kotlin.coroutines.CoroutineContext$Element r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlinx.coroutines.DisposableHandle invokeOnCompletion$default(kotlinx.coroutines.Job r0, boolean r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L11
                r5 = r4 & 1
                if (r5 == 0) goto L7
                r1 = 0
            L7:
                r4 = r4 & 2
                if (r4 == 0) goto Lc
                r2 = 1
            Lc:
                kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnCompletion(r1, r2, r3)
                return r0
            L11:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: invokeOnCompletion"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r0, r1)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.Job plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1) {
                return r1
        }
    }

    /* JADX INFO: compiled from: Job.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/Job$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Job;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.Job> {
        public static final /* synthetic */ kotlinx.coroutines.Job.Key $$INSTANCE = null;

        static {
                kotlinx.coroutines.Job$Key r0 = new kotlinx.coroutines.Job$Key
                r0.<init>()
                kotlinx.coroutines.Job.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key.$$INSTANCE
            kotlinx.coroutines.Job.Key = r0
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.ChildHandle attachChild(@org.jetbrains.annotations.NotNull kotlinx.coroutines.ChildJob r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(java.lang.Throwable r1);

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    java.util.concurrent.CancellationException getCancellationException();

    @org.jetbrains.annotations.NotNull
    kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.SelectClause0 getOnJoin();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.DisposableHandle invokeOnCompletion(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1);

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @org.jetbrains.annotations.Nullable
    java.lang.Object join(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.Job plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1);

    boolean start();
}
