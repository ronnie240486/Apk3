package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\f\u001a\u00020\rH\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/OpDescriptor;", "", "()V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "isEarlierThan", "", "that", "perform", "affected", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class OpDescriptor {
    public OpDescriptor() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp();

    public final boolean isEarlierThan(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.OpDescriptor r7) {
            r6 = this;
            kotlinx.coroutines.internal.AtomicOp r0 = r6.getAtomicOp()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlinx.coroutines.internal.AtomicOp r7 = r7.getAtomicOp()
            if (r7 != 0) goto Lf
            return r1
        Lf:
            long r2 = r0.getOpSequence()
            long r4 = r7.getOpSequence()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object perform(@org.jetbrains.annotations.Nullable java.lang.Object r1);

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
