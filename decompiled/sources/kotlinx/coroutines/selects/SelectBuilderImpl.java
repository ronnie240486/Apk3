package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020Y2\b\u0012\u0004\u0012\u00028\u00000Z2\b\u0012\u0004\u0012\u00028\u00000[2\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060Bj\u0002`C:\u0004TUVWB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ8\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001cJ \u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J5\u00108\u001a\u00020\b*\u0002072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109JG\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00010;2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010=J[\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010>\"\u0004\b\u0002\u0010:*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020?2\u0006\u0010@\u001a\u00028\u00012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010AR\u001c\u0010F\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00102R(\u0010R\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010S\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "handle", "", "disposeOnSelect", "(Lkotlinx/coroutines/DisposableHandle;)V", "doAfterSelect", "()V", "Lkotlin/Function0;", "", "value", "block", "doResume", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "e", "handleBuilderException", "(Ljava/lang/Throwable;)V", "initCancellability", "", "timeMillis", "Lkotlin/Function1;", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "performAtomicTrySelect", "(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;", "exception", "resumeSelectWithException", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "trySelect", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "trySelectOther", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getCompletion", "()Lkotlin/coroutines/Continuation;", "completion", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "isSelected", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "parentHandle", "Lkotlin/coroutines/Continuation;", "AtomicSelectOp", "DisposeNode", "PairSelectOp", "SelectOnCancelling", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.PublishedApi
public final class SelectBuilderImpl<R> extends kotlinx.coroutines.internal.LockFreeLinkedListHead implements kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstance<R>, kotlin.coroutines.Continuation<R>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _result$FU = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _parentHandle;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _result;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ java.lang.Object _state;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.Continuation<R> uCont;

    /* JADX INFO: compiled from: Select.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "impl", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;)V", "opSequence", "", "getOpSequence", "()J", "complete", "", "affected", "failure", "completeSelect", "prepare", "prepareSelectOp", "toString", "", "undoPrepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AtomicSelectOp extends kotlinx.coroutines.internal.AtomicOp<java.lang.Object> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.AtomicDesc desc;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.selects.SelectBuilderImpl<?> impl;
        private final long opSequence;

        public AtomicSelectOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectBuilderImpl<?> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicDesc r4) {
                r2 = this;
                r2.<init>()
                r2.impl = r3
                r2.desc = r4
                kotlinx.coroutines.selects.SeqNumber r3 = kotlinx.coroutines.selects.SelectKt.access$getSelectOpSequenceNumber$p()
                long r0 = r3.next()
                r2.opSequence = r0
                r4.setAtomicOp(r2)
                return
        }

        private final void completeSelect(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                r1 = 0
                if (r7 != 0) goto L6
                r7 = 1
                goto L7
            L6:
                r7 = 0
            L7:
                if (r7 == 0) goto Lb
                r2 = 0
                goto Lf
            Lb:
                java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            Lf:
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r3 = r6.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            L13:
                boolean r5 = r4.compareAndSet(r3, r6, r2)
                if (r5 == 0) goto L1a
                goto L21
            L1a:
                java.lang.Object r5 = r4.get(r3)
                if (r5 == r6) goto L13
                r0 = 0
            L21:
                if (r0 == 0) goto L2a
                if (r7 == 0) goto L2a
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r7 = r6.impl
                kotlinx.coroutines.selects.SelectBuilderImpl.access$doAfterSelect(r7)
            L2a:
                return
        }

        private final java.lang.Object prepareSelectOp() {
                r6 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r0 = r6.impl
            L2:
                java.lang.Object r1 = r0._state
                r2 = 0
                if (r1 != r6) goto L8
                return r2
            L8:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r3 == 0) goto L14
                kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r2 = r6.impl
                r1.perform(r2)
                goto L2
            L14:
                java.lang.Object r3 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                if (r1 != r3) goto L34
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r1 = r6.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            L22:
                boolean r5 = r3.compareAndSet(r1, r4, r6)
                if (r5 == 0) goto L2a
                r1 = 1
                goto L31
            L2a:
                java.lang.Object r5 = r3.get(r1)
                if (r5 == r4) goto L22
                r1 = 0
            L31:
                if (r1 == 0) goto L2
                return r2
            L34:
                java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
                return r0
        }

        private final void undoPrepare() {
                r4 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r0 = r4.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            L8:
                boolean r3 = r1.compareAndSet(r0, r4, r2)
                if (r3 == 0) goto Lf
                goto L15
            Lf:
                java.lang.Object r3 = r1.get(r0)
                if (r3 == r4) goto L8
            L15:
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r0 = this;
                r0.completeSelect(r2)
                kotlinx.coroutines.internal.AtomicDesc r1 = r0.desc
                r1.complete(r0, r2)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public long getOpSequence() {
                r2 = this;
                long r0 = r2.opSequence
                return r0
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        @org.jetbrains.annotations.Nullable
        public java.lang.Object prepare(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto La
                java.lang.Object r0 = r1.prepareSelectOp()
                if (r0 != 0) goto L9
                goto La
            L9:
                return r0
            La:
                kotlinx.coroutines.internal.AtomicDesc r0 = r1.desc     // Catch: java.lang.Throwable -> L11
                java.lang.Object r2 = r0.prepare(r1)     // Catch: java.lang.Throwable -> L11
                return r2
            L11:
                r0 = move-exception
                if (r2 != 0) goto L17
                r1.undoPrepare()
            L17:
                throw r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "AtomicSelectOp(sequence="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                long r1 = r3.getOpSequence()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DisposeNode extends kotlinx.coroutines.internal.LockFreeLinkedListNode {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.DisposableHandle handle;

        public DisposeNode(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DisposableHandle r1) {
                r0 = this;
                r0.<init>()
                r0.handle = r1
                return
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$PairSelectOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class PairSelectOp extends kotlinx.coroutines.internal.OpDescriptor {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp otherOp;

        public PairSelectOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1) {
                r0 = this;
                r0.<init>()
                r0.otherOp = r1
                return
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r1.otherOp
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                return r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @org.jetbrains.annotations.Nullable
        public java.lang.Object perform(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>"
                java.util.Objects.requireNonNull(r5, r0)
                kotlinx.coroutines.selects.SelectBuilderImpl r5 = (kotlinx.coroutines.selects.SelectBuilderImpl) r5
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r4.otherOp
                r0.finishPrepare()
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r4.otherOp
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                r1 = 0
                java.lang.Object r0 = r0.decide(r1)
                if (r0 != 0) goto L1e
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r1 = r4.otherOp
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r1 = r1.desc
                goto L22
            L1e:
                java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            L22:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            L24:
                boolean r3 = r2.compareAndSet(r5, r4, r1)
                if (r3 == 0) goto L2b
                goto L31
            L2b:
                java.lang.Object r3 = r2.get(r5)
                if (r3 == r4) goto L24
            L31:
                return r0
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class SelectOnCancelling extends kotlinx.coroutines.JobCancellingNode {
        public final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl<R> this$0;

        public SelectOnCancelling(kotlinx.coroutines.selects.SelectBuilderImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r1.this$0
                boolean r2 = r2.trySelect()
                if (r2 == 0) goto L15
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r2 = r1.this$0
                kotlinx.coroutines.JobSupport r0 = r1.getJob()
                java.util.concurrent.CancellationException r0 = r0.getCancellationException()
                r2.resumeSelectWithException(r0)
            L15:
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.selects.SelectBuilderImpl> r1 = kotlinx.coroutines.selects.SelectBuilderImpl.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.selects.SelectBuilderImpl._state$FU = r2
            java.lang.String r2 = "_result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.selects.SelectBuilderImpl._result$FU = r0
            return
    }

    public SelectBuilderImpl(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.uCont = r1
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            r0._state = r1
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            r0._result = r1
            r1 = 0
            r0._parentHandle = r1
            return
    }

    public static final /* synthetic */ void access$doAfterSelect(kotlinx.coroutines.selects.SelectBuilderImpl r0) {
            r0.doAfterSelect()
            return
    }

    private final void doAfterSelect() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.getParentHandle()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.dispose()
        La:
            java.lang.Object r0 = r2.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        L10:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode
            if (r1 == 0) goto L22
            r1 = r0
            kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode r1 = (kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode) r1
            kotlinx.coroutines.DisposableHandle r1 = r1.handle
            r1.dispose()
        L22:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L10
        L27:
            return
    }

    private final void doResume(kotlin.jvm.functions.Function0<? extends java.lang.Object> r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L25
            java.lang.Object r1 = r7.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
        L14:
            boolean r0 = r4.compareAndSet(r6, r5, r1)
            if (r0 == 0) goto L1c
            r2 = 1
            goto L22
        L1c:
            java.lang.Object r0 = r4.get(r6)
            if (r0 == r5) goto L14
        L22:
            if (r2 == 0) goto L0
            return
        L25:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L49
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
        L35:
            boolean r5 = r0.compareAndSet(r6, r1, r4)
            if (r5 == 0) goto L3d
            r2 = 1
            goto L43
        L3d:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L35
        L43:
            if (r2 == 0) goto L0
            r8.invoke()
            return
        L49:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Already resumed"
            r7.<init>(r8)
            throw r7
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
    }

    private final void initCancellability() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L10
            return
        L10:
            r2 = 1
            r3 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl$SelectOnCancelling r4 = new kotlinx.coroutines.selects.SelectBuilderImpl$SelectOnCancelling
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r7.setParentHandle(r0)
            boolean r1 = r7.isSelected()
            if (r1 == 0) goto L29
            r0.dispose()
        L29:
            return
    }

    private final void setParentHandle(kotlinx.coroutines.DisposableHandle r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnSelect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DisposableHandle r3) {
            r2 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode
            r0.<init>(r3)
            boolean r1 = r2.isSelected()
            if (r1 != 0) goto L15
            r2.addLast(r0)
            boolean r0 = r2.isSelected()
            if (r0 != 0) goto L15
            return
        L15:
            r3.dispose()
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<R> r0 = r2.uCont
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.Continuation<R> getCompletion() {
            r0 = this;
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<R> r0 = r1.uCont
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getResult() {
            r4 = this;
            boolean r0 = r4.isSelected()
            if (r0 != 0) goto L9
            r4.initCancellability()
        L9:
            java.lang.Object r0 = r4._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r0 != r1) goto L33
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
        L1b:
            boolean r0 = r1.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L23
            r0 = 1
            goto L2a
        L23:
            java.lang.Object r0 = r1.get(r4)
            if (r0 == r2) goto L1b
            r0 = 0
        L2a:
            if (r0 == 0) goto L31
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L31:
            java.lang.Object r0 = r4._result
        L33:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            if (r0 == r1) goto L43
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L3e
            return r0
        L3e:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @kotlin.PublishedApi
    public final void handleBuilderException(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.trySelect()
            if (r0 == 0) goto L14
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r2.resumeWith(r3)
            goto L2d
        L14:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L2d
            java.lang.Object r0 = r2.getResult()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L26
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            if (r0 == r3) goto L2d
        L26:
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r3)
        L2d:
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause0 r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            r1.registerSelectClause0(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause1<? extends Q> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            r1.registerSelectClause1(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r1, P r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r0 = this;
            r1.registerSelectClause2(r0, r2, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(r0, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean isSelected() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._state
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L14
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r2)
            goto L0
        L14:
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void onTimeout(long r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L14
            boolean r4 = r3.trySelect()
            if (r4 == 0) goto L13
            kotlin.coroutines.Continuation r4 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r6, r4)
        L13:
            return
        L14:
            kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1 r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1
            r0.<init>(r3, r6)
            kotlin.coroutines.CoroutineContext r6 = r3.getContext()
            kotlinx.coroutines.Delay r6 = kotlinx.coroutines.DelayKt.getDelay(r6)
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlinx.coroutines.DisposableHandle r4 = r6.invokeOnTimeout(r4, r0, r1)
            r3.disposeOnSelect(r4)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @org.jetbrains.annotations.Nullable
    public java.lang.Object performAtomicTrySelect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicDesc r2) {
            r1 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r2 = r0.perform(r2)
            return r2
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void resumeSelectWithException(@org.jetbrains.annotations.NotNull java.lang.Throwable r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L28
            kotlinx.coroutines.CompletedExceptionally r1 = new kotlinx.coroutines.CompletedExceptionally
            r0 = 2
            r4 = 0
            r1.<init>(r7, r3, r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
        L17:
            boolean r0 = r4.compareAndSet(r6, r5, r1)
            if (r0 == 0) goto L1e
            goto L25
        L1e:
            java.lang.Object r0 = r4.get(r6)
            if (r0 == r5) goto L17
            r2 = 0
        L25:
            if (r2 == 0) goto L0
            goto L5b
        L28:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L5c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
        L38:
            boolean r5 = r0.compareAndSet(r6, r1, r4)
            if (r5 == 0) goto L3f
            goto L46
        L3f:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L38
            r2 = 0
        L46:
            if (r2 == 0) goto L0
            kotlin.coroutines.Continuation<R> r0 = r6.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m333constructorimpl(r7)
            r0.resumeWith(r7)
        L5b:
            return
        L5c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r7.<init>(r0)
            throw r7
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L26
            r0 = 0
            java.lang.Object r1 = kotlinx.coroutines.CompletionStateKt.toState$default(r7, r0, r3, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
        L15:
            boolean r0 = r4.compareAndSet(r6, r5, r1)
            if (r0 == 0) goto L1d
            r2 = 1
            goto L23
        L1d:
            java.lang.Object r0 = r4.get(r6)
            if (r0 == r5) goto L15
        L23:
            if (r2 == 0) goto L0
            goto L68
        L26:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L69
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
        L36:
            boolean r5 = r0.compareAndSet(r6, r1, r4)
            if (r5 == 0) goto L3e
            r2 = 1
            goto L44
        L3e:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L36
        L44:
            if (r2 == 0) goto L0
            boolean r0 = kotlin.Result.m339isFailureimpl(r7)
            if (r0 == 0) goto L63
            kotlin.coroutines.Continuation<R> r0 = r6.uCont
            java.lang.Throwable r7 = kotlin.Result.m336exceptionOrNullimpl(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m333constructorimpl(r7)
            r0.resumeWith(r7)
            goto L68
        L63:
            kotlin.coroutines.Continuation<R> r0 = r6.uCont
            r0.resumeWith(r7)
        L68:
            return
        L69:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r7.<init>(r0)
            throw r7
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "SelectInstance(state="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object r1 = r2._state
            r0.append(r1)
            java.lang.String r1 = ", result="
            r0.append(r1)
            java.lang.Object r1 = r2._result
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect() {
            r3 = this;
            r0 = 0
            java.lang.Object r0 = r3.trySelectOther(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r0 != r1) goto Lb
            r0 = 1
            goto Le
        Lb:
            if (r0 != 0) goto Lf
            r0 = 0
        Le:
            return r0
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected trySelectIdempotent result "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @org.jetbrains.annotations.Nullable
    public java.lang.Object trySelectOther(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r8) {
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            r2 = 0
            if (r0 != r1) goto L4d
            r1 = 0
            r3 = 1
            if (r8 != 0) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
        L13:
            boolean r5 = r0.compareAndSet(r7, r4, r2)
            if (r5 == 0) goto L1b
            r1 = 1
            goto L21
        L1b:
            java.lang.Object r5 = r0.get(r7)
            if (r5 == r4) goto L13
        L21:
            if (r1 != 0) goto L47
            goto L0
        L24:
            kotlinx.coroutines.selects.SelectBuilderImpl$PairSelectOp r4 = new kotlinx.coroutines.selects.SelectBuilderImpl$PairSelectOp
            r4.<init>(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
        L2f:
            boolean r0 = r5.compareAndSet(r7, r6, r4)
            if (r0 == 0) goto L37
            r1 = 1
            goto L3d
        L37:
            java.lang.Object r0 = r5.get(r7)
            if (r0 == r6) goto L2f
        L3d:
            if (r1 != 0) goto L40
            goto L0
        L40:
            java.lang.Object r8 = r4.perform(r7)
            if (r8 == 0) goto L47
            return r8
        L47:
            r7.doAfterSelect()
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r8
        L4d:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 == 0) goto L82
            if (r8 == 0) goto L7b
            kotlinx.coroutines.internal.AtomicOp r1 = r8.getAtomicOp()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp
            if (r2 == 0) goto L6f
            r2 = r1
            kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp r2 = (kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp) r2
            kotlinx.coroutines.selects.SelectBuilderImpl<?> r2 = r2.impl
            if (r2 == r7) goto L63
            goto L6f
        L63:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L6f:
            r2 = r0
            kotlinx.coroutines.internal.OpDescriptor r2 = (kotlinx.coroutines.internal.OpDescriptor) r2
            boolean r1 = r1.isEarlierThan(r2)
            if (r1 == 0) goto L7b
            java.lang.Object r8 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            return r8
        L7b:
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r7)
            goto L0
        L82:
            if (r8 != 0) goto L85
            return r2
        L85:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r8 = r8.desc
            if (r0 != r8) goto L8c
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r8
        L8c:
            return r2
    }
}
