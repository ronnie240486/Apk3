package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001:\u0005IJKLMB\u0007¢\u0006\u0004\bH\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b8\u00109J'\u0010=\u001a\u00020\n2\n\u0010:\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0015\u0010E\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bD\u00100R\u0015\u0010G\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bF\u00100¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "Lkotlinx/coroutines/internal/Node;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "", "finishAdd", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addLast", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "remove", "()Z", "removeOrNext", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "helpRemove", "()V", "helpRemovePrev", "removeFirstOrNull", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "", "toString", "()Ljava/lang/String;", "isRemoved", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "<init>", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class LockFreeLinkedListNode {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _removedRef$FU = null;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ java.lang.Object _next;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ java.lang.Object _prev;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _removedRef;

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\r\u001a\u00020\n2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eJ\u001c\u0010\u0012\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "next", "", "updatedNext", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "", "finishPrepare", "onPrepare", "onRemoved", "Lkotlinx/coroutines/internal/AtomicOp;", "op", "prepare", "failure", "complete", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class AbstractAtomicDesc extends kotlinx.coroutines.internal.AtomicDesc {
        public AbstractAtomicDesc() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public final void complete(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
                r7 = this;
                r0 = 0
                r1 = 1
                if (r9 != 0) goto L6
                r9 = 1
                goto L7
            L6:
                r9 = 0
            L7:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r7.getAffectedNode()
                if (r2 != 0) goto Le
                return
            Le:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r7.getOriginalNext()
                if (r3 != 0) goto L15
                return
            L15:
                if (r9 == 0) goto L1c
                java.lang.Object r4 = r7.updatedNext(r2, r3)
                goto L1d
            L1c:
                r4 = r3
            L1d:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            L1f:
                boolean r6 = r5.compareAndSet(r2, r8, r4)
                if (r6 == 0) goto L27
                r0 = 1
                goto L2d
            L27:
                java.lang.Object r6 = r5.get(r2)
                if (r6 == r8) goto L1f
            L2d:
                if (r0 == 0) goto L34
                if (r9 == 0) goto L34
                r7.finishOnSuccess(r3)
            L34:
                return
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object failure(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public abstract void finishOnSuccess(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1);

        public abstract void finishPrepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1);

        @org.jetbrains.annotations.Nullable
        public abstract kotlinx.coroutines.internal.LockFreeLinkedListNode getAffectedNode();

        @org.jetbrains.annotations.Nullable
        public abstract kotlinx.coroutines.internal.LockFreeLinkedListNode getOriginalNext();

        @org.jetbrains.annotations.Nullable
        public java.lang.Object onPrepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1) {
                r0 = this;
                r0.finishPrepare(r1)
                r1 = 0
                return r1
        }

        public void onRemoved(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object prepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r7) {
                r6 = this;
            L0:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r6.takeAffectedNode(r7)
                if (r0 != 0) goto L9
                java.lang.Object r7 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r7
            L9:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto Lf
                return r2
            Lf:
                boolean r3 = r7.isDecided()
                if (r3 == 0) goto L16
                return r2
            L16:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r3 == 0) goto L29
                kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
                boolean r2 = r7.isEarlierThan(r1)
                if (r2 == 0) goto L25
                java.lang.Object r7 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r7
            L25:
                r1.perform(r0)
                goto L0
            L29:
                java.lang.Object r3 = r6.failure(r0)
                if (r3 == 0) goto L30
                return r3
            L30:
                boolean r3 = r6.retry(r1)
                if (r3 == 0) goto L37
                goto L0
            L37:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r3 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp
                r4 = r1
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            L41:
                boolean r5 = r4.compareAndSet(r0, r1, r3)
                if (r5 == 0) goto L49
                r4 = 1
                goto L50
            L49:
                java.lang.Object r5 = r4.get(r0)
                if (r5 == r1) goto L41
                r4 = 0
            L50:
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.perform(r0)     // Catch: java.lang.Throwable -> L5c
                java.lang.Object r0 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED     // Catch: java.lang.Throwable -> L5c
                if (r4 != r0) goto L5b
                goto L0
            L5b:
                return r2
            L5c:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            L5f:
                boolean r4 = r2.compareAndSet(r0, r3, r1)
                if (r4 != 0) goto L6c
                java.lang.Object r4 = r2.get(r0)
                if (r4 != r3) goto L6c
                goto L5f
            L6c:
                throw r7
        }

        public boolean retry(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.OpDescriptor r1) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.getAffectedNode()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public abstract java.lang.Object updatedNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2);
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "affected", "next", "", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class AddLastDesc<T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = null;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ java.lang.Object _affectedNode;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final T node;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode queue;

        static {
                java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc> r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc.class
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                java.lang.String r2 = "_affectedNode"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc._affectedNode$FU = r0
                return
        }

        public AddLastDesc(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1, @org.jetbrains.annotations.NotNull T r2) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                r0.node = r2
                r1 = 0
                r0._affectedNode = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void finishOnSuccess(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.node
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$finishAdd(r2, r0)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishPrepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc._affectedNode$FU
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r3.affected
            L4:
                r1 = 0
                boolean r1 = r0.compareAndSet(r2, r1, r3)
                if (r1 == 0) goto Lc
                goto L12
            Lc:
                java.lang.Object r1 = r0.get(r2)
                if (r1 == 0) goto L4
            L12:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode getAffectedNode() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode getOriginalNext() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final boolean retry(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                if (r2 == r0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.OpDescriptor r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$correctPrev(r0, r2)
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.NotNull
        public java.lang.Object updatedNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r6) {
                r4 = this;
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r4.node
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            L4:
                boolean r1 = r0.compareAndSet(r6, r6, r5)
                if (r1 == 0) goto Lb
                goto L11
            Lb:
                java.lang.Object r1 = r0.get(r6)
                if (r1 == r6) goto L4
            L11:
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.node
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r4.queue
            L17:
                boolean r5 = r2.compareAndSet(r1, r1, r3)
                if (r5 == 0) goto L1e
                goto L24
            L1e:
                java.lang.Object r5 = r2.get(r1)
                if (r5 == r1) goto L17
            L24:
                T extends kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r4.node
                return r5
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @kotlin.PublishedApi
    public static abstract class CondAddOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode newNode;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r0.<init>()
                r0.newNode = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                r0.complete2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r6, @org.jetbrains.annotations.Nullable java.lang.Object r7) {
                r5 = this;
                r0 = 1
                r1 = 0
                if (r7 != 0) goto L6
                r7 = 1
                goto L7
            L6:
                r7 = 0
            L7:
                if (r7 == 0) goto Lc
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r5.newNode
                goto Le
            Lc:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r5.oldNext
            Le:
                if (r2 == 0) goto L2e
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            L12:
                boolean r4 = r3.compareAndSet(r6, r5, r2)
                if (r4 == 0) goto L19
                goto L20
            L19:
                java.lang.Object r4 = r3.get(r6)
                if (r4 == r5) goto L12
                r0 = 0
            L20:
                if (r0 == 0) goto L2e
                if (r7 == 0) goto L2e
                kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r5.newNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r7 = r5.oldNext
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$finishAdd(r6, r7)
            L2e:
                return
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "next", "desc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "finishPrepare", "", "perform", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode affected;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode next;

        public PrepareOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc r3) {
                r0 = this;
                r0.<init>()
                r0.affected = r1
                r0.next = r2
                r0.desc = r3
                return
        }

        public final void finishPrepare() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r1.desc
                r0.finishPrepare(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r1.desc
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                return r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @org.jetbrains.annotations.Nullable
        public java.lang.Object perform(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
                r5 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                java.util.Objects.requireNonNull(r6, r0)
                kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r6
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r5.desc
                java.lang.Object r0 = r0.onPrepare(r5)
                java.lang.Object r1 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                r2 = 0
                if (r0 != r1) goto L36
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r5.next
                kotlinx.coroutines.internal.Removed r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$removed(r1)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            L1a:
                boolean r0 = r4.compareAndSet(r6, r5, r3)
                if (r0 == 0) goto L22
                r0 = 1
                goto L29
            L22:
                java.lang.Object r0 = r4.get(r6)
                if (r0 == r5) goto L1a
                r0 = 0
            L29:
                if (r0 == 0) goto L33
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r5.desc
                r0.onRemoved(r6)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$correctPrev(r1, r2)
            L33:
                java.lang.Object r6 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r6
            L36:
                if (r0 == 0) goto L41
                kotlinx.coroutines.internal.AtomicOp r1 = r5.getAtomicOp()
                java.lang.Object r0 = r1.decide(r0)
                goto L49
            L41:
                kotlinx.coroutines.internal.AtomicOp r0 = r5.getAtomicOp()
                java.lang.Object r0 = r0.getConsensus()
            L49:
                java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
                if (r0 != r1) goto L52
                kotlinx.coroutines.internal.AtomicOp r0 = r5.getAtomicOp()
                goto L5f
            L52:
                if (r0 != 0) goto L5d
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r0 = r5.desc
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r5.next
                java.lang.Object r0 = r0.updatedNext(r6, r1)
                goto L5f
            L5d:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r5.next
            L5f:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            L61:
                boolean r3 = r1.compareAndSet(r6, r5, r0)
                if (r3 == 0) goto L68
                goto L6e
            L68:
                java.lang.Object r3 = r1.get(r6)
                if (r3 == r5) goto L61
            L6e:
                return r2
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "PrepareOp(op="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                kotlinx.coroutines.internal.AtomicOp r1 = r2.getAtomicOp()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u000f\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\bj\u0002`\t2\n\u0010\u000b\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\bj\u0002`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "next", "", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class RemoveFirstDesc<T> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = null;
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = null;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ java.lang.Object _affectedNode;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ java.lang.Object _originalNext;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode queue;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode$RemoveFirstDesc> r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc.class
                java.lang.String r2 = "_affectedNode"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._affectedNode$FU = r2
                java.lang.String r2 = "_originalNext"
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._originalNext$FU = r0
                return
        }

        public RemoveFirstDesc(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r0.<init>()
                r0.queue = r1
                r1 = 0
                r0._affectedNode = r1
                r0._originalNext = r1
                return
        }

        public static /* synthetic */ void getResult$annotations() {
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public java.lang.Object failure(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.queue
                if (r2 != r0) goto L9
                java.lang.Object r2 = kotlinx.coroutines.internal.LockFreeLinkedListKt.getLIST_EMPTY()
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void finishOnSuccess(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                r0 = 0
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$correctPrev(r2, r0)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishPrepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._affectedNode$FU
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r6.affected
            L4:
                r2 = 0
                boolean r3 = r0.compareAndSet(r5, r2, r1)
                if (r3 == 0) goto Lc
                goto L12
            Lc:
                java.lang.Object r3 = r0.get(r5)
                if (r3 == 0) goto L4
            L12:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc._originalNext$FU
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r6.next
            L16:
                boolean r6 = r3.compareAndSet(r5, r2, r4)
                if (r6 == 0) goto L1d
                goto L23
            L1d:
                java.lang.Object r6 = r3.get(r5)
                if (r6 == 0) goto L16
            L23:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode getAffectedNode() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode getOriginalNext() {
                r1 = this;
                java.lang.Object r0 = r1._originalNext
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                return r0
        }

        public final T getResult() {
                r1 = this;
                java.lang.Object r0 = r1._affectedNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                return r0
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final boolean retry(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.internal.Removed
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                kotlinx.coroutines.internal.Removed r2 = (kotlinx.coroutines.internal.Removed) r2
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.ref
                r2.helpRemovePrev()
                r2 = 1
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.OpDescriptor r4) {
                r3 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.queue
            L2:
                java.lang.Object r1 = r0._next
                boolean r2 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r2 == 0) goto L18
                kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
                boolean r2 = r4.isEarlierThan(r1)
                if (r2 == 0) goto L12
                r4 = 0
                return r4
            L12:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r3.queue
                r1.perform(r2)
                goto L2
            L18:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                return r1
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.NotNull
        public final java.lang.Object updatedNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r0 = this;
                kotlinx.coroutines.internal.Removed r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$removed(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass1 extends kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp {
        public final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $condition;

        public AnonymousClass1(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlin.jvm.functions.Function0<java.lang.Boolean> r2) {
                r0 = this;
                r0.$condition = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                java.lang.Object r1 = r0.prepare2(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public java.lang.Object prepare2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                kotlin.jvm.functions.Function0<java.lang.Boolean> r1 = r0.$condition
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L10
                r1 = 0
                goto L14
            L10:
                java.lang.Object r1 = kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE()
            L14:
                return r1
        }
    }


    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode> r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU = r2
            java.lang.String r2 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU = r2
            java.lang.String r2 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$FU = r0
            return
    }

    public LockFreeLinkedListNode() {
            r1 = this;
            r1.<init>()
            r1._next = r1
            r1._prev = r1
            r0 = 0
            r1._removedRef = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.LockFreeLinkedListNode access$correctPrev(kotlinx.coroutines.internal.LockFreeLinkedListNode r0, kotlinx.coroutines.internal.OpDescriptor r1) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.correctPrev(r1)
            return r0
    }

    public static final /* synthetic */ void access$finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r0, kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0.finishAdd(r1)
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Removed access$removed(kotlinx.coroutines.internal.LockFreeLinkedListNode r0) {
            kotlinx.coroutines.internal.Removed r0 = r0.removed()
            return r0
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.OpDescriptor r11) {
            r10 = this;
        L0:
            java.lang.Object r0 = r10._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.isRemoved()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != r11) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r7 == 0) goto L44
            if (r11 == 0) goto L3e
            r0 = r4
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            boolean r0 = r11.isEarlierThan(r0)
            if (r0 == 0) goto L3e
            return r1
        L3e:
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r2)
            goto L0
        L44:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.Removed
            if (r7 == 0) goto L68
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            kotlinx.coroutines.internal.Removed r4 = (kotlinx.coroutines.internal.Removed) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.ref
        L50:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L58
            r5 = 1
            goto L5e
        L58:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L50
        L5e:
            if (r5 != 0) goto L61
            goto L0
        L61:
            r2 = r3
            goto L6
        L63:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L7
        L68:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L0
    }

    private final void finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r4._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            java.lang.Object r1 = r3.getNext()
            if (r1 == r4) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
        Ld:
            boolean r2 = r1.compareAndSet(r4, r0, r3)
            if (r2 == 0) goto L15
            r0 = 1
            goto L1c
        L15:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r0) goto Ld
            r0 = 0
        L1c:
            if (r0 == 0) goto L0
            boolean r0 = r3.isRemoved()
            if (r0 == 0) goto L28
            r0 = 0
            r4.correctPrev(r0)
        L28:
            return
    }

    private final kotlinx.coroutines.internal.Removed removed() {
            r2 = this;
            java.lang.Object r0 = r2._removedRef
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            if (r0 != 0) goto L10
            kotlinx.coroutines.internal.Removed r0 = new kotlinx.coroutines.internal.Removed
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$FU
            r1.lazySet(r2, r0)
        L10:
            return r0
    }

    public final void addLast(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.getPrevNode()
            boolean r0 = r0.addNext(r2, r1)
            if (r0 == 0) goto L0
            return
    }

    public final boolean addLastIf(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r4) {
            r2 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r0.<init>(r3, r4)
        L5:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r2.getPrevNode()
            int r4 = r4.tryCondAddNext(r3, r2, r0)
            r1 = 1
            if (r4 == r1) goto L16
            r1 = 2
            if (r4 == r1) goto L14
            goto L5
        L14:
            r3 = 0
            return r3
        L16:
            return r1
    }

    public final boolean addLastIfPrev(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, java.lang.Boolean> r4) {
            r2 = this;
        L0:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.getPrevNode()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r0.addNext(r3, r2)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
    }

    public final boolean addLastIfPrevAndIf(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, java.lang.Boolean> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r6) {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r0.<init>(r4, r6)
        L5:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r3.getPrevNode()
            java.lang.Object r1 = r5.invoke(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L17
            return r2
        L17:
            int r6 = r6.tryCondAddNext(r4, r3, r0)
            r1 = 1
            if (r6 == r1) goto L23
            r1 = 2
            if (r6 == r1) goto L22
            goto L5
        L22:
            return r2
        L23:
            return r1
    }

    @kotlin.PublishedApi
    public final boolean addNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r5, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r5, r6)
        La:
            boolean r1 = r0.compareAndSet(r4, r6, r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            r0 = 1
            goto L1b
        L14:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r6) goto La
            r0 = 0
        L1b:
            if (r0 != 0) goto L1e
            return r2
        L1e:
            r5.finishAdd(r6)
            return r3
    }

    public final boolean addOneIfEmpty(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r5, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r5, r4)
        La:
            java.lang.Object r0 = r4.getNext()
            r1 = 0
            if (r0 == r4) goto L12
            return r1
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
        L14:
            boolean r2 = r0.compareAndSet(r4, r4, r5)
            r3 = 1
            if (r2 == 0) goto L1d
            r1 = 1
            goto L23
        L1d:
            java.lang.Object r2 = r0.get(r4)
            if (r2 == r4) goto L14
        L23:
            if (r1 == 0) goto La
            r5.finishAdd(r4)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final <T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<T> describeAddLast(@org.jetbrains.annotations.NotNull T r2) {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.internal.LockFreeLinkedListNode> describeRemoveFirst() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$RemoveFirstDesc r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$RemoveFirstDesc
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getNext() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._next
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 != 0) goto L7
            return r0
        L7:
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r2)
            goto L0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.correctPrev(r0)
            if (r0 != 0) goto Lf
            java.lang.Object r0 = r1._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.findPrevNonRemoved(r0)
        Lf:
            return r0
    }

    public final void helpRemove() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            r0.helpRemovePrev()
            return
    }

    @kotlin.PublishedApi
    public final void helpRemovePrev() {
            r3 = this;
            r0 = r3
        L1:
            java.lang.Object r1 = r0.getNext()
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.Removed
            if (r2 != 0) goto Le
            r1 = 0
            r0.correctPrev(r1)
            return
        Le:
            kotlinx.coroutines.internal.Removed r1 = (kotlinx.coroutines.internal.Removed) r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.ref
            goto L1
    }

    public boolean isRemoved() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.Removed
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r3) {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r0 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: remove */
    public boolean mo1865remove() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.removeOrNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final /* synthetic */ <T> T removeFirstIfIsInstanceOfOrPeekIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            if (r0 != r4) goto La
            return r1
        La:
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r3)
            boolean r2 = r0 instanceof java.lang.Object
            if (r2 != 0) goto L15
            return r1
        L15:
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            boolean r1 = r0.isRemoved()
            if (r1 != 0) goto L28
            return r0
        L28:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.removeOrNext()
            if (r1 != 0) goto L2f
            return r0
        L2f:
            r1.helpRemovePrev()
            goto L0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeFirstOrNull() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            if (r0 != r2) goto La
            r0 = 0
            return r0
        La:
            boolean r1 = r0.mo1865remove()
            if (r1 == 0) goto L11
            return r0
        L11:
            r0.helpRemove()
            goto L0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeOrNext() {
            r5 = this;
        L0:
            java.lang.Object r0 = r5.getNext()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.Removed
            if (r1 == 0) goto Ld
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            return r0
        Ld:
            if (r0 != r5) goto L12
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            return r0
        L12:
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            kotlinx.coroutines.internal.Removed r2 = r1.removed()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
        L1b:
            boolean r4 = r3.compareAndSet(r5, r0, r2)
            if (r4 == 0) goto L23
            r0 = 1
            goto L2a
        L23:
            java.lang.Object r4 = r3.get(r5)
            if (r4 == r0) goto L1b
            r0 = 0
        L2a:
            if (r0 == 0) goto L0
            r0 = 0
            r1.correctPrev(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1 r1 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            r1.<init>(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @kotlin.PublishedApi
    public final int tryCondAddNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp r6) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r4, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r4, r5)
            r6.oldNext = r5
        Lc:
            boolean r4 = r0.compareAndSet(r3, r5, r6)
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L16
            r4 = 1
            goto L1d
        L16:
            java.lang.Object r4 = r0.get(r3)
            if (r4 == r5) goto Lc
            r4 = 0
        L1d:
            if (r4 != 0) goto L20
            return r1
        L20:
            java.lang.Object r4 = r6.perform(r3)
            if (r4 != 0) goto L27
            goto L28
        L27:
            r2 = 2
        L28:
            return r2
    }

    public final void validateNode$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r0 = this;
            return
    }
}
