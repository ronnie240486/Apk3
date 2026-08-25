package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u001fB!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "", "id", "prev", "", "pointers", "<init>", "(JLkotlinx/coroutines/sync/SemaphoreSegment;I)V", "index", "", "cancel", "(I)V", "", "expected", "value", "", "cas", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "get", "(I)Ljava/lang/Object;", "getAndSet", "(ILjava/lang/Object;)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getMaxSlots", "()I", "maxSlots", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/Segment;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SemaphoreSegment extends kotlinx.coroutines.internal.Segment<kotlinx.coroutines.sync.SemaphoreSegment> {

    @org.jetbrains.annotations.NotNull
    public /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray acquirers;

    public SemaphoreSegment(long r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.sync.SemaphoreSegment r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            r1.<init>(r2)
            r0.acquirers = r1
            return
    }

    public final void cancel(int r3) {
            r2 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.acquirers
            r1.set(r3, r0)
            r2.onSlotCleaned()
            return
    }

    public final boolean cas(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.acquirers
            boolean r2 = r0.compareAndSet(r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.acquirers
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAndSet(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.acquirers
            java.lang.Object r2 = r0.getAndSet(r2, r3)
            return r2
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getMaxSlots() {
            r1 = this;
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            return r0
    }

    public final void set(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.acquirers
            r0.set(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SemaphoreSegment[id="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.getId()
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
