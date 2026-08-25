package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¨\u0006\b"}, d2 = {"checkIndexOverflow", "", "index", "checkOwnership", "", "Lkotlinx/coroutines/flow/internal/AbortFlowException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FlowExceptions_commonKt {
    @kotlin.PublishedApi
    public static final int checkIndexOverflow(int r1) {
            if (r1 < 0) goto L3
            return r1
        L3:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened"
            r1.<init>(r0)
            throw r1
    }

    public static final void checkOwnership(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.internal.AbortFlowException r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<?> r2) {
            kotlinx.coroutines.flow.FlowCollector r0 = r1.getOwner()
            if (r0 != r2) goto L7
            return
        L7:
            throw r1
    }
}
