package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H&J\u0016\u0010\r\u001a\u0004\u0018\u00010\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H&R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/AtomicDesc;", "", "()V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "setAtomicOp", "(Lkotlinx/coroutines/internal/AtomicOp;)V", "complete", "", "op", "failure", "prepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AtomicDesc {
    public kotlinx.coroutines.internal.AtomicOp<?> atomicOp;

    public AtomicDesc() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void complete(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2);

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
            r1 = this;
            kotlinx.coroutines.internal.AtomicOp<?> r0 = r1.atomicOp
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "atomicOp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object prepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r1);

    public final void setAtomicOp(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.AtomicOp<?> r1) {
            r0 = this;
            r0.atomicOp = r1
            return
    }
}
