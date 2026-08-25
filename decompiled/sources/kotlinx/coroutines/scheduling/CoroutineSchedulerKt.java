package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0005"}, d2 = {"isSchedulerWorker", "", "thread", "Ljava/lang/Thread;", "mayNotBlock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CoroutineSchedulerKt {
    @kotlin.jvm.JvmName(name = "isSchedulerWorker")
    public static final boolean isSchedulerWorker(@org.jetbrains.annotations.NotNull java.lang.Thread r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            return r0
    }

    @kotlin.jvm.JvmName(name = "mayNotBlock")
    public static final boolean mayNotBlock(@org.jetbrains.annotations.NotNull java.lang.Thread r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            if (r0 == 0) goto Le
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r1
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r1.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
            if (r1 != r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }
}
