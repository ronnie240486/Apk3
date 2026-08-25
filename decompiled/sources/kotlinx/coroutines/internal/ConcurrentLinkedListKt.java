package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001ao\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0004*\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u000628\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\bH\u0082\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "close", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "getCLOSED$annotations", "()V", "", "POINTERS_SHIFT", "I", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ConcurrentLinkedListKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol CLOSED = null;
    private static final int POINTERS_SHIFT = 16;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> N close(@org.jetbrains.annotations.NotNull N r2) {
        L0:
            java.lang.Object r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r2)
            kotlinx.coroutines.internal.Symbol r1 = access$getCLOSED$p()
            if (r0 != r1) goto Lb
            return r2
        Lb:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            if (r0 != 0) goto L16
            boolean r0 = r2.markAsClosed()
            if (r0 == 0) goto L0
            return r2
        L16:
            r2 = r0
            goto L0
    }

    private static final <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentInternal(S r4, long r5, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r7) {
        L0:
            long r0 = r4.getId()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L14
            boolean r0 = r4.getRemoved()
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            java.lang.Object r4 = kotlinx.coroutines.internal.SegmentOrClosed.m1869constructorimpl(r4)
            return r4
        L14:
            java.lang.Object r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r4)
            kotlinx.coroutines.internal.Symbol r1 = access$getCLOSED$p()
            if (r0 != r1) goto L27
            kotlinx.coroutines.internal.Symbol r4 = access$getCLOSED$p()
            java.lang.Object r4 = kotlinx.coroutines.internal.SegmentOrClosed.m1869constructorimpl(r4)
            return r4
        L27:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            if (r0 == 0) goto L2f
        L2d:
            r4 = r0
            goto L0
        L2f:
            long r0 = r4.getId()
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            boolean r1 = r4.trySetNext(r0)
            if (r1 == 0) goto L0
            boolean r1 = r4.getRemoved()
            if (r1 == 0) goto L2d
            r4.remove()
            goto L2d
    }

    private static /* synthetic */ void getCLOSED$annotations() {
            return
    }
}
