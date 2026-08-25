package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/sync/CancelSemaphoreAcquisitionHandler;", "Lkotlinx/coroutines/CancelHandler;", "segment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "index", "", "(Lkotlinx/coroutines/sync/SemaphoreSegment;I)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class CancelSemaphoreAcquisitionHandler extends kotlinx.coroutines.CancelHandler {
    private final int index;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.SemaphoreSegment segment;

    public CancelSemaphoreAcquisitionHandler(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.SemaphoreSegment r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.segment = r1
            r0.index = r2
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

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.sync.SemaphoreSegment r2 = r1.segment
            int r0 = r1.index
            r2.cancel(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CancelSemaphoreAcquisitionHandler["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            kotlinx.coroutines.sync.SemaphoreSegment r1 = r3.segment
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r3.index
            r2 = 93
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
