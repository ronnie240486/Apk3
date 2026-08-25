package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "prev", "", "pointers", "<init>", "(JLkotlinx/coroutines/internal/Segment;I)V", "", "decPointers$kotlinx_coroutines_core", "()Z", "decPointers", "", "onSlotCleaned", "()V", "tryIncPointers$kotlinx_coroutines_core", "tryIncPointers", "J", "getId", "()J", "getMaxSlots", "()I", "maxSlots", "getRemoved", "removed", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Segment<S extends kotlinx.coroutines.internal.Segment<S>> extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<S> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater cleanedAndPointers$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int cleanedAndPointers;
    private final long id;

    static {
            java.lang.Class<kotlinx.coroutines.internal.Segment> r0 = kotlinx.coroutines.internal.Segment.class
            java.lang.String r1 = "cleanedAndPointers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU = r0
            return
    }

    public Segment(long r1, @org.jetbrains.annotations.Nullable S r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.id = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers = r1
            return
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.getMaxSlots()
            if (r0 != r1) goto L16
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public abstract int getMaxSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean getRemoved() {
            r2 = this;
            int r0 = r2.cleanedAndPointers
            int r1 = r2.getMaxSlots()
            if (r0 != r1) goto L10
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final void onSlotCleaned() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.getMaxSlots()
            if (r0 != r1) goto L15
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L15
            r2.remove()
        L15:
            return
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
            r4 = this;
        L0:
            int r0 = r4.cleanedAndPointers
            int r1 = r4.getMaxSlots()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L13
            boolean r1 = r4.isTail()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            if (r1 != 0) goto L17
            goto L23
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r0
            boolean r0 = r1.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L0
            r2 = 1
        L23:
            return r2
    }
}
