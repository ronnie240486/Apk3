package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "(I)V", "value", "getValue", "()Ljava/lang/Integer;", "increment", "", "delta", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SubscriptionCountStateFlow extends kotlinx.coroutines.flow.SharedFlowImpl<java.lang.Integer> implements kotlinx.coroutines.flow.StateFlow<java.lang.Integer> {
    public SubscriptionCountStateFlow(int r4) {
            r3 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r1 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3.<init>(r1, r2, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.tryEmit(r4)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.StateFlow
    @org.jetbrains.annotations.NotNull
    public java.lang.Integer getValue() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.getLastReplayedLocked()     // Catch: java.lang.Throwable -> L11
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L11
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public /* bridge */ /* synthetic */ java.lang.Integer getValue() {
            r1 = this;
            java.lang.Integer r0 = r1.getValue()
            return r0
    }

    public final boolean increment(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.getLastReplayedLocked()     // Catch: java.lang.Throwable -> L16
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L16
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.tryEmit(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
