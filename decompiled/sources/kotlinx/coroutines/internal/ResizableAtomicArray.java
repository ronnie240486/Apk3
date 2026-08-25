package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ResizableAtomicArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/ResizableAtomicArray;", "T", "", "initialLength", "", "(I)V", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "currentLength", "get", "index", "(I)Ljava/lang/Object;", "setSynchronized", "", "value", "(ILjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ResizableAtomicArray<T> {

    @org.jetbrains.annotations.NotNull
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.array = r0
            return
    }

    public final int currentLength() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<T> r0 = r1.array
            int r0 = r0.length()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final T get(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<T> r0 = r2.array
            int r1 = r0.length()
            if (r3 >= r1) goto Ld
            java.lang.Object r3 = r0.get(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            return r3
    }

    public final void setSynchronized(int r7, @org.jetbrains.annotations.Nullable T r8) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<T> r0 = r6.array
            int r1 = r0.length()
            if (r7 >= r1) goto Lc
            r0.set(r7, r8)
            goto L2c
        Lc:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r3 = r7 + 1
            int r4 = r1 * 2
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r4)
            r2.<init>(r3)
            r3 = 0
        L1a:
            if (r3 >= r1) goto L27
            int r4 = r3 + 1
            java.lang.Object r5 = r0.get(r3)
            r2.set(r3, r5)
            r3 = r4
            goto L1a
        L27:
            r2.set(r7, r8)
            r6.array = r2
        L2c:
            return
    }
}
