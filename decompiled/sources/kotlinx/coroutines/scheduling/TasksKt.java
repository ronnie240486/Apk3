package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0010*\u00020\u00118À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"BlockingContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "CORE_POOL_SIZE", "", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "NonBlockingContext", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "isBlocking", "", "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TasksKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.TaskContext BlockingContext = null;

    @kotlin.jvm.JvmField
    public static final int CORE_POOL_SIZE = 0;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_SCHEDULER_NAME = "DefaultDispatcher";

    @kotlin.jvm.JvmField
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = 0;

    @kotlin.jvm.JvmField
    public static final int MAX_POOL_SIZE = 0;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.TaskContext NonBlockingContext = null;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;

    @kotlin.jvm.JvmField
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = 0;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static kotlinx.coroutines.scheduling.SchedulerTimeSource schedulerTimeSource;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.resolution.ns"
            r1 = 100000(0x186a0, double:4.94066E-319)
            r3 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            long r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r0, r1, r3, r5, r7, r8)
            kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS = r0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()
            r1 = 2
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE = r0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.max.pool.size"
            r2 = 2097150(0x1ffffe, float:2.938733E-39)
            r3 = 0
            r4 = 2097150(0x1ffffe, float:2.938733E-39)
            r5 = 4
            r6 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            r4 = 0
            r6 = 0
            r8 = 12
            r9 = 0
            long r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r4, r6, r8, r9)
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS = r0
            kotlinx.coroutines.scheduling.NanoTimeSource r0 = kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE
            kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource = r0
            kotlinx.coroutines.scheduling.TaskContextImpl r0 = new kotlinx.coroutines.scheduling.TaskContextImpl
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext = r0
            kotlinx.coroutines.scheduling.TaskContextImpl r0 = new kotlinx.coroutines.scheduling.TaskContextImpl
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.TasksKt.BlockingContext = r0
            return
    }

    public static final boolean isBlocking(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.Task r1) {
            kotlinx.coroutines.scheduling.TaskContext r1 = r1.taskContext
            int r1 = r1.getTaskMode()
            r0 = 1
            if (r1 != r0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
