package kotlinx.coroutines.test;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B%\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/test/TimedRunnableObsolete;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "run", "count", "", "time", "(Ljava/lang/Runnable;JJ)V", "heap", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class TimedRunnableObsolete implements java.lang.Comparable<kotlinx.coroutines.test.TimedRunnableObsolete>, java.lang.Runnable, kotlinx.coroutines.internal.ThreadSafeHeapNode {
    private final long count;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.internal.ThreadSafeHeap<?> heap;
    private int index;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable run;

    @kotlin.jvm.JvmField
    public final long time;

    public TimedRunnableObsolete(@org.jetbrains.annotations.NotNull java.lang.Runnable r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.run = r1
            r0.count = r2
            r0.time = r4
            return
    }

    public /* synthetic */ TimedRunnableObsolete(java.lang.Runnable r9, long r10, long r12, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            r8 = this;
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto L8
            r4 = r0
            goto L9
        L8:
            r4 = r10
        L9:
            r10 = r14 & 4
            if (r10 == 0) goto Lf
            r6 = r0
            goto L10
        Lf:
            r6 = r12
        L10:
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r6)
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.test.TimedRunnableObsolete r1) {
            r0 = this;
            kotlinx.coroutines.test.TimedRunnableObsolete r1 = (kotlinx.coroutines.test.TimedRunnableObsolete) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.test.TimedRunnableObsolete r6) {
            r5 = this;
            long r0 = r5.time
            long r2 = r6.time
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            long r0 = r5.count
            long r2 = r6.count
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            goto L15
        L11:
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
        L15:
            return r6
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
            r1 = this;
            kotlinx.coroutines.internal.ThreadSafeHeap<?> r0 = r1.heap
            return r0
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.run
            r0.run()
            return
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setHeap(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.ThreadSafeHeap<?> r1) {
            r0 = this;
            r0.heap = r1
            return
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setIndex(int r1) {
            r0 = this;
            r0.index = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TimedRunnable(time="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.time
            r0.append(r1)
            java.lang.String r1 = ", run="
            r0.append(r1)
            java.lang.Runnable r1 = r3.run
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
