package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\fR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "<init>", "()V", "affected", "", "failure", "", "complete", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decision", "decide", "(Ljava/lang/Object;)Ljava/lang/Object;", "perform", "prepare", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "atomicOp", "getConsensus", "()Ljava/lang/Object;", "consensus", "", "isDecided", "()Z", "", "getOpSequence", "()J", "opSequence", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/OpDescriptor;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AtomicOp<T> extends kotlinx.coroutines.internal.OpDescriptor {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _consensus$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _consensus;

    static {
            java.lang.Class<kotlinx.coroutines.internal.AtomicOp> r0 = kotlinx.coroutines.internal.AtomicOp.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_consensus"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.AtomicOp._consensus$FU = r0
            return
    }

    public AtomicOp() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            r1._consensus = r0
            return
    }

    public abstract void complete(T r1, @org.jetbrains.annotations.Nullable java.lang.Object r2);

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object decide(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3._consensus
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r0 == r1) goto L7
            return r0
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.AtomicOp._consensus$FU
        L9:
            boolean r2 = r0.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L11
            r0 = 1
            goto L18
        L11:
            java.lang.Object r2 = r0.get(r3)
            if (r2 == r1) goto L9
            r0 = 0
        L18:
            if (r0 == 0) goto L1b
            return r4
        L1b:
            java.lang.Object r4 = r3._consensus
            return r4
    }

    @Override // kotlinx.coroutines.internal.OpDescriptor
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
            r0 = this;
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getConsensus() {
            r1 = this;
            java.lang.Object r0 = r1._consensus
            return r0
    }

    public long getOpSequence() {
            r2 = this;
            r0 = 0
            return r0
    }

    public final boolean isDecided() {
            r2 = this;
            java.lang.Object r0 = r2._consensus
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.internal.OpDescriptor
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object perform(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2._consensus
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.prepare(r3)
            java.lang.Object r0 = r2.decide(r0)
        Le:
            r2.complete(r3, r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object prepare(T r1);
}
