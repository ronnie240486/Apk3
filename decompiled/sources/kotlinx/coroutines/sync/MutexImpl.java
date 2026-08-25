package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 :\u0006$%&'()B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJT\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\"\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "", "locked", "<init>", "(Z)V", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MutexImpl implements kotlinx.coroutines.sync.Mutex, kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: compiled from: Mutex.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class LockCont extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        public final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public LockCont(@org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.MutexImpl r1, @org.jetbrains.annotations.NotNull java.lang.Object r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.cont = r3
                return
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter() {
                r2 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r2.cont
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r0.completeResume(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "LockCont["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.owner
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                r0.append(r1)
                java.lang.String r1 = "] for "
                r0.append(r1)
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public boolean tryResumeLockWaiter() {
                r6 = this;
                boolean r0 = r6.take()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r6.cont
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                r3 = 0
                kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1 r4 = new kotlinx.coroutines.sync.MutexImpl$LockCont$tryResumeLockWaiter$1
                kotlinx.coroutines.sync.MutexImpl r5 = r6.this$0
                r4.<init>(r5, r6)
                java.lang.Object r0 = r0.tryResume(r2, r3, r4)
                if (r0 == 0) goto L1b
                r1 = 1
            L1b:
                return r1
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BD\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R1\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "completeResumeLockWaiter", "", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class LockSelect<R> extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.selects.SelectInstance<R> select;
        public final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public LockSelect(@org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.MutexImpl r1, @org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.select = r3
                r0.block = r4
                return
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter() {
                r5 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r5.block
                kotlinx.coroutines.sync.MutexImpl r1 = r5.this$0
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r5.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1 r3 = new kotlinx.coroutines.sync.MutexImpl$LockSelect$completeResumeLockWaiter$1
                kotlinx.coroutines.sync.MutexImpl r4 = r5.this$0
                r3.<init>(r4, r5)
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1, r2, r3)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "LockSelect["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.owner
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                r0.append(r1)
                java.lang.String r1 = "] for "
                r0.append(r1)
                kotlinx.coroutines.sync.MutexImpl r1 = r2.this$0
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public boolean tryResumeLockWaiter() {
                r1 = this;
                boolean r0 = r1.take()
                if (r0 == 0) goto L10
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b¢\u0004\u0018\u00002\u00020\u000f2\u00020\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "", "completeResumeLockWaiter", "()V", "dispose", "", "take", "()Z", "tryResumeLockWaiter", "Ljava/lang/Object;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public abstract class LockWaiter extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater isTaken$FU = null;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ int isTaken;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object owner;

        static {
                java.lang.Class<kotlinx.coroutines.sync.MutexImpl$LockWaiter> r0 = kotlinx.coroutines.sync.MutexImpl.LockWaiter.class
                java.lang.String r1 = "isTaken"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.sync.MutexImpl.LockWaiter.isTaken$FU = r0
                return
        }

        public LockWaiter(@org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r2
                r1 = 0
                r0.isTaken = r1
                return
        }

        public abstract void completeResumeLockWaiter();

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
                r0 = this;
                r0.mo1865remove()
                return
        }

        public final boolean take() {
                r3 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.LockWaiter.isTaken$FU
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r3, r1, r2)
                return r0
        }

        public abstract boolean tryResumeLockWaiter();
    }

    /* JADX INFO: compiled from: Mutex.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", "", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LockedQueue extends kotlinx.coroutines.internal.LockFreeLinkedListHead {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public java.lang.Object owner;

        public LockedQueue(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "LockedQueue["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.owner
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "prepare", "PrepareOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class TryLockDesc extends kotlinx.coroutines.internal.AtomicDesc {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.sync.MutexImpl mutex;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object owner;

        /* JADX INFO: compiled from: Mutex.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "(Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;Lkotlinx/coroutines/internal/AtomicOp;)V", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {

            @org.jetbrains.annotations.NotNull
            private final kotlinx.coroutines.internal.AtomicOp<?> atomicOp;

            public PrepareOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.MutexImpl.TryLockDesc r1, kotlinx.coroutines.internal.AtomicOp<?> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.atomicOp = r2
                    return
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            @org.jetbrains.annotations.NotNull
            public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                    r1 = this;
                    kotlinx.coroutines.internal.AtomicOp<?> r0 = r1.atomicOp
                    return r0
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            @org.jetbrains.annotations.Nullable
            public java.lang.Object perform(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                    r3 = this;
                    kotlinx.coroutines.internal.AtomicOp r0 = r3.getAtomicOp()
                    boolean r0 = r0.isDecided()
                    if (r0 == 0) goto Lf
                    kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                    goto L13
                Lf:
                    kotlinx.coroutines.internal.AtomicOp r0 = r3.getAtomicOp()
                L13:
                    java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl"
                    java.util.Objects.requireNonNull(r4, r1)
                    kotlinx.coroutines.sync.MutexImpl r4 = (kotlinx.coroutines.sync.MutexImpl) r4
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
                L1c:
                    boolean r2 = r1.compareAndSet(r4, r3, r0)
                    if (r2 == 0) goto L23
                    goto L29
                L23:
                    java.lang.Object r2 = r1.get(r4)
                    if (r2 == r3) goto L1c
                L29:
                    r4 = 0
                    return r4
            }
        }

        public TryLockDesc(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.MutexImpl r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.mutex = r1
                r0.owner = r2
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public void complete(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r3 = this;
                if (r5 == 0) goto L7
                kotlinx.coroutines.sync.Empty r5 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                goto L16
            L7:
                java.lang.Object r5 = r3.owner
                if (r5 != 0) goto L10
                kotlinx.coroutines.sync.Empty r5 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
                goto L16
            L10:
                kotlinx.coroutines.sync.Empty r0 = new kotlinx.coroutines.sync.Empty
                r0.<init>(r5)
                r5 = r0
            L16:
                kotlinx.coroutines.sync.MutexImpl r0 = r3.mutex
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
            L1a:
                boolean r2 = r1.compareAndSet(r0, r4, r5)
                if (r2 == 0) goto L21
                goto L27
            L21:
                java.lang.Object r2 = r1.get(r0)
                if (r2 == r4) goto L1a
            L27:
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        @org.jetbrains.annotations.Nullable
        public java.lang.Object prepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r5) {
                r4 = this;
                kotlinx.coroutines.sync.MutexImpl$TryLockDesc$PrepareOp r0 = new kotlinx.coroutines.sync.MutexImpl$TryLockDesc$PrepareOp
                r0.<init>(r4, r5)
                kotlinx.coroutines.sync.MutexImpl r5 = r4.mutex
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl._state$FU
                kotlinx.coroutines.sync.Empty r2 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
            Ld:
                boolean r3 = r1.compareAndSet(r5, r2, r0)
                if (r3 == 0) goto L15
                r5 = 1
                goto L1c
            L15:
                java.lang.Object r3 = r1.get(r5)
                if (r3 == r2) goto Ld
                r5 = 0
            L1c:
                if (r5 != 0) goto L23
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.MutexKt.access$getLOCK_FAIL$p()
                return r5
            L23:
                kotlinx.coroutines.sync.MutexImpl r5 = r4.mutex
                java.lang.Object r5 = r0.perform(r5)
                return r5
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", "complete", "", "affected", "failure", "", "prepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UnlockOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.sync.MutexImpl> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.sync.MutexImpl.LockedQueue queue;

        public UnlockOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.MutexImpl.LockedQueue r1) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.sync.MutexImpl r1 = (kotlinx.coroutines.sync.MutexImpl) r1
                r0.complete2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.MutexImpl r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r2 = this;
                if (r4 != 0) goto L7
                kotlinx.coroutines.sync.Empty r4 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
                goto L9
            L7:
                kotlinx.coroutines.sync.MutexImpl$LockedQueue r4 = r2.queue
            L9:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl._state$FU
            Lb:
                boolean r1 = r0.compareAndSet(r3, r2, r4)
                if (r1 == 0) goto L12
                goto L18
            L12:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r2) goto Lb
            L18:
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ java.lang.Object prepare(kotlinx.coroutines.sync.MutexImpl r1) {
                r0 = this;
                kotlinx.coroutines.sync.MutexImpl r1 = (kotlinx.coroutines.sync.MutexImpl) r1
                java.lang.Object r1 = r0.prepare2(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public java.lang.Object prepare2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.MutexImpl r1) {
                r0 = this;
                kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = r0.queue
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto La
                r1 = 0
                goto Le
            La:
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCK_FAIL$p()
            Le:
                return r1
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.sync.MutexImpl> r0 = kotlinx.coroutines.sync.MutexImpl.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.sync.MutexImpl._state$FU = r0
            return
    }

    public MutexImpl(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            kotlinx.coroutines.sync.Empty r1 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto Le
        La:
            kotlinx.coroutines.sync.Empty r1 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
        Le:
            r0._state = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$lockSuspend(kotlinx.coroutines.sync.MutexImpl r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.lockSuspend(r1, r2)
            return r0
    }

    private final java.lang.Object lockSuspend(java.lang.Object r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r10)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            kotlinx.coroutines.sync.MutexImpl$LockCont r1 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r1.<init>(r8, r9, r0)
        Ld:
            java.lang.Object r2 = r8._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.Empty
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L60
            r3 = r2
            kotlinx.coroutines.sync.Empty r3 = (kotlinx.coroutines.sync.Empty) r3
            java.lang.Object r6 = r3.locked
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r6 == r7) goto L37
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r7 = new kotlinx.coroutines.sync.MutexImpl$LockedQueue
            java.lang.Object r3 = r3.locked
            r7.<init>(r3)
        L29:
            boolean r3 = r6.compareAndSet(r8, r2, r7)
            if (r3 == 0) goto L30
            goto Ld
        L30:
            java.lang.Object r3 = r6.get(r8)
            if (r3 == r2) goto L29
            goto Ld
        L37:
            if (r9 != 0) goto L3e
            kotlinx.coroutines.sync.Empty r3 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto L43
        L3e:
            kotlinx.coroutines.sync.Empty r3 = new kotlinx.coroutines.sync.Empty
            r3.<init>(r9)
        L43:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.sync.MutexImpl._state$FU
        L45:
            boolean r7 = r6.compareAndSet(r8, r2, r3)
            if (r7 == 0) goto L4c
            goto L53
        L4c:
            java.lang.Object r7 = r6.get(r8)
            if (r7 == r2) goto L45
            r4 = 0
        L53:
            if (r4 == 0) goto Ld
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r2 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r2.<init>(r8, r9)
            r0.resume(r1, r2)
            goto L86
        L60:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r3 == 0) goto Lad
            r3 = r2
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r3 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r3
            java.lang.Object r6 = r3.owner
            if (r6 == r9) goto L6c
            goto L6d
        L6c:
            r4 = 0
        L6d:
            if (r4 == 0) goto L9d
            r3.addLast(r1)
            java.lang.Object r3 = r8._state
            if (r3 == r2) goto L83
            boolean r2 = r1.take()
            if (r2 != 0) goto L7d
            goto L83
        L7d:
            kotlinx.coroutines.sync.MutexImpl$LockCont r1 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r1.<init>(r8, r9, r0)
            goto Ld
        L83:
            kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(r0, r1)
        L86:
            java.lang.Object r9 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r0) goto L93
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L93:
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r10) goto L9a
            return r9
        L9a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L9d:
            java.lang.String r10 = "Already locked by "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r9)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        Lad:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r3 == 0) goto Lb8
            kotlinx.coroutines.internal.OpDescriptor r2 = (kotlinx.coroutines.internal.OpDescriptor) r2
            r2.perform(r8)
            goto Ld
        Lb8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Illegal state "
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            kotlinx.coroutines.sync.Empty r0 = (kotlinx.coroutines.sync.Empty) r0
            java.lang.Object r0 = r0.locked
            if (r0 != r5) goto L1a
            goto L1b
        Lf:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L1a
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            java.lang.Object r0 = r0.owner
            if (r0 != r5) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 1
            if (r1 == 0) goto L14
            kotlinx.coroutines.sync.Empty r0 = (kotlinx.coroutines.sync.Empty) r0
            java.lang.Object r0 = r0.locked
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r0 == r1) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
        L14:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L19
            return r2
        L19:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L23
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r3)
            goto L0
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Illegal state "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final boolean isLockedEmptyQueueState$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L10
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @org.jetbrains.annotations.Nullable
    public java.lang.Object lock(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            boolean r0 = r1.tryLock(r2)
            if (r0 == 0) goto L9
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L9:
            java.lang.Object r2 = r1.lockSuspend(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L14
            return r2
        L14:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r7) {
            r4 = this;
        L0:
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            if (r1 == 0) goto L65
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r2 = r1.locked
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r2 == r3) goto L2f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r3 = new kotlinx.coroutines.sync.MutexImpl$LockedQueue
            java.lang.Object r1 = r1.locked
            r3.<init>(r1)
        L21:
            boolean r1 = r2.compareAndSet(r4, r0, r3)
            if (r1 == 0) goto L28
            goto L0
        L28:
            java.lang.Object r1 = r2.get(r4)
            if (r1 == r0) goto L21
            goto L0
        L2f:
            kotlinx.coroutines.sync.MutexImpl$TryLockDesc r0 = new kotlinx.coroutines.sync.MutexImpl$TryLockDesc
            r0.<init>(r4, r6)
            java.lang.Object r0 = r5.performAtomicTrySelect(r0)
            if (r0 != 0) goto L42
            kotlin.coroutines.Continuation r5 = r5.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r7, r4, r5)
            return
        L42:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L49
            return
        L49:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getLOCK_FAIL$p()
            if (r0 != r1) goto L50
            goto L0
        L50:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L55
            goto L0
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "performAtomicTrySelect(TryLockDesc) returned "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L9b
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            java.lang.Object r2 = r1.owner
            if (r2 == r6) goto L72
            r2 = 1
            goto L73
        L72:
            r2 = 0
        L73:
            if (r2 == 0) goto L8b
            kotlinx.coroutines.sync.MutexImpl$LockSelect r2 = new kotlinx.coroutines.sync.MutexImpl$LockSelect
            r2.<init>(r4, r6, r5, r7)
            r1.addLast(r2)
            java.lang.Object r1 = r4._state
            if (r1 == r0) goto L87
            boolean r0 = r2.take()
            if (r0 != 0) goto L0
        L87:
            r5.disposeOnSelect(r2)
            return
        L8b:
            java.lang.String r5 = "Already locked by "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L9b:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto La6
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r4)
            goto L0
        La6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Illegal state "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 93
            java.lang.String r3 = "Mutex["
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            kotlinx.coroutines.sync.Empty r0 = (kotlinx.coroutines.sync.Empty) r0
            java.lang.Object r0 = r0.locked
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L1d:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L27
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r4)
            goto L0
        L27:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            java.lang.Object r0 = r0.owner
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Illegal state "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r1 = r1.locked
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r1 == r4) goto L14
            return r3
        L14:
            if (r7 != 0) goto L1b
            kotlinx.coroutines.sync.Empty r1 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_LOCKED$p()
            goto L20
        L1b:
            kotlinx.coroutines.sync.Empty r1 = new kotlinx.coroutines.sync.Empty
            r1.<init>(r7)
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl._state$FU
        L22:
            boolean r5 = r4.compareAndSet(r6, r0, r1)
            if (r5 == 0) goto L2a
            r3 = 1
            goto L30
        L2a:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L22
        L30:
            if (r3 == 0) goto L0
            return r2
        L33:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto L52
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r0 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r0
            java.lang.Object r0 = r0.owner
            if (r0 == r7) goto L3e
            goto L3f
        L3e:
            r2 = 0
        L3f:
            if (r2 == 0) goto L42
            return r3
        L42:
            java.lang.String r0 = "Already locked by "
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L52:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L5c
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r6)
            goto L0
        L5c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal state "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.Empty
            java.lang.String r2 = " but expected "
            java.lang.String r3 = "Mutex is locked by "
            r4 = 1
            if (r1 == 0) goto L6a
            if (r8 != 0) goto L2a
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r1 = r1.locked
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getUNLOCKED$p()
            if (r1 == r2) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L1e
            goto L36
        L1e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Mutex is not locked"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L2a:
            r1 = r0
            kotlinx.coroutines.sync.Empty r1 = (kotlinx.coroutines.sync.Empty) r1
            java.lang.Object r5 = r1.locked
            if (r5 != r8) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r5 == 0) goto L4d
        L36:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.sync.MutexImpl._state$FU
            kotlinx.coroutines.sync.Empty r6 = kotlinx.coroutines.sync.MutexKt.access$getEMPTY_UNLOCKED$p()
        L3c:
            boolean r1 = r5.compareAndSet(r7, r0, r6)
            if (r1 == 0) goto L43
            goto L4a
        L43:
            java.lang.Object r1 = r5.get(r7)
            if (r1 == r0) goto L3c
            r4 = 0
        L4a:
            if (r4 == 0) goto L0
            return
        L4d:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Object r1 = r1.locked
            r0.append(r1)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L6a:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L74
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r7)
            goto L0
        L74:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue
            if (r1 == 0) goto Le1
            if (r8 == 0) goto La4
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            java.lang.Object r5 = r1.owner
            if (r5 != r8) goto L83
            r5 = 1
            goto L84
        L83:
            r5 = 0
        L84:
            if (r5 == 0) goto L87
            goto La4
        L87:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.Object r1 = r1.owner
            r0.append(r1)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        La4:
            r1 = r0
            kotlinx.coroutines.sync.MutexImpl$LockedQueue r1 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.removeFirstOrNull()
            if (r2 != 0) goto Lcb
            kotlinx.coroutines.sync.MutexImpl$UnlockOp r3 = new kotlinx.coroutines.sync.MutexImpl$UnlockOp
            r3.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.sync.MutexImpl._state$FU
        Lb4:
            boolean r1 = r5.compareAndSet(r7, r0, r3)
            if (r1 == 0) goto Lbb
            goto Lc2
        Lbb:
            java.lang.Object r1 = r5.get(r7)
            if (r1 == r0) goto Lb4
            r4 = 0
        Lc2:
            if (r4 == 0) goto L0
            java.lang.Object r0 = r3.perform(r7)
            if (r0 != 0) goto L0
            return
        Lcb:
            kotlinx.coroutines.sync.MutexImpl$LockWaiter r2 = (kotlinx.coroutines.sync.MutexImpl.LockWaiter) r2
            boolean r0 = r2.tryResumeLockWaiter()
            if (r0 == 0) goto L0
            java.lang.Object r8 = r2.owner
            if (r8 != 0) goto Ldb
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.sync.MutexKt.access$getLOCKED$p()
        Ldb:
            r1.owner = r8
            r2.completeResumeLockWaiter()
            return
        Le1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal state "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }
}
