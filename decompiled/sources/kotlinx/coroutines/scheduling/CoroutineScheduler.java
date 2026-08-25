package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010!\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\u0082\b¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b$\u0010\u0017J-\u0010&\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\n\u0010(\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b-\u0010\u0017J\u001b\u0010/\u001a\u00020\u00012\n\u0010.\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\f2\n\u0010.\u001a\u00060 R\u00020\u0000¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u00132\n\u0010.\u001a\u00060 R\u00020\u00002\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b8\u0010,J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0013¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\fH\u0082\b¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ+\u0010I\u001a\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JR\u0015\u0010\u0010\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010LR\u0015\u0010\u001f\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010O\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0014\u0010\u0003\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u001e\u0010V\u001a\f\u0012\b\u0012\u00060 R\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.CoroutineScheduler.Companion Companion = null;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = null;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$FU = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int _isTerminated;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ long controlState;

    @kotlin.jvm.JvmField
    public final int corePoolSize;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.scheduling.GlobalQueue globalBlockingQueue;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.scheduling.GlobalQueue globalCpuQueue;

    @kotlin.jvm.JvmField
    public final long idleWorkerKeepAliveNs;

    @kotlin.jvm.JvmField
    public final int maxPoolSize;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ long parkedWorkersStack;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String schedulerName;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> workers;

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                int r1 = r1.ordinal()
                r2 = 5
                r0[r1] = r2
                kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0080\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u001cR*\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0014\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0012\u0010B\u001a\u00020?8Æ\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00106¨\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Worker extends java.lang.Thread {
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater workerCtl$FU = null;
        private volatile int indexInArray;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;

        @kotlin.jvm.JvmField
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;

        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object nextParkedWorker;
        private int rngState;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private long terminationDeadline;
        public final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler this$0;

        @org.jetbrains.annotations.NotNull
        public volatile /* synthetic */ int workerCtl;

        static {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class
                java.lang.String r1 = "workerCtl"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU = r0
                return
        }

        private Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.setDaemon(r1)
                kotlinx.coroutines.scheduling.WorkQueue r1 = new kotlinx.coroutines.scheduling.WorkQueue
                r1.<init>()
                r0.localQueue = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r0.state = r1
                r1 = 0
                r0.workerCtl = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                r0.nextParkedWorker = r1
                kotlin.random.Random$Default r1 = kotlin.random.Random.Default
                int r1 = r1.nextInt()
                r0.rngState = r1
                return
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.setIndexInArray(r2)
                return
        }

        public static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler access$getThis$0$p(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r0) {
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r0.this$0
                return r0
        }

        private final void afterTask(int r4) {
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r3.this$0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
                r1 = -2097152(0xffffffffffe00000, double:NaN)
                r0.addAndGet(r4, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = r3.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r4 == r0) goto L17
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r3.state = r4
            L17:
                return
        }

        private final void beforeTask(int r1) {
                r0 = this;
                if (r1 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                boolean r1 = r0.tryReleaseCpu(r1)
                if (r1 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                r1.signalCpuWork()
            L10:
                return
        }

        private final void executeTask(kotlinx.coroutines.scheduling.Task r3) {
                r2 = this;
                kotlinx.coroutines.scheduling.TaskContext r0 = r3.taskContext
                int r0 = r0.getTaskMode()
                r2.idleReset(r0)
                r2.beforeTask(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.this$0
                r1.runSafely(r3)
                r2.afterTask(r0)
                return
        }

        private final kotlinx.coroutines.scheduling.Task findAnyTask(boolean r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L2f
                kotlinx.coroutines.scheduling.CoroutineScheduler r3 = r2.this$0
                int r3 = r3.corePoolSize
                int r3 = r3 * 2
                int r3 = r2.nextInt(r3)
                if (r3 != 0) goto L11
                r3 = 1
                goto L12
            L11:
                r3 = 0
            L12:
                if (r3 == 0) goto L1c
                kotlinx.coroutines.scheduling.Task r1 = r2.pollGlobalQueues()
                if (r1 != 0) goto L1b
                goto L1c
            L1b:
                return r1
            L1c:
                kotlinx.coroutines.scheduling.WorkQueue r1 = r2.localQueue
                kotlinx.coroutines.scheduling.Task r1 = r1.poll()
                if (r1 != 0) goto L2e
                if (r3 != 0) goto L35
                kotlinx.coroutines.scheduling.Task r3 = r2.pollGlobalQueues()
                if (r3 != 0) goto L2d
                goto L35
            L2d:
                return r3
            L2e:
                return r1
            L2f:
                kotlinx.coroutines.scheduling.Task r3 = r2.pollGlobalQueues()
                if (r3 != 0) goto L39
            L35:
                kotlinx.coroutines.scheduling.Task r3 = r2.trySteal(r0)
            L39:
                return r3
        }

        private final void idleReset(int r3) {
                r2 = this;
                r0 = 0
                r2.terminationDeadline = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = r2.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                if (r3 != r0) goto Le
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2.state = r3
            Le:
                return
        }

        private final boolean inStack() {
                r2 = this;
                java.lang.Object r0 = r2.nextParkedWorker
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        private final void park() {
                r6 = this;
                long r0 = r6.terminationDeadline
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L13
                long r0 = java.lang.System.nanoTime()
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r6.this$0
                long r4 = r4.idleWorkerKeepAliveNs
                long r0 = r0 + r4
                r6.terminationDeadline = r0
            L13:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.this$0
                long r0 = r0.idleWorkerKeepAliveNs
                java.util.concurrent.locks.LockSupport.parkNanos(r0)
                long r0 = java.lang.System.nanoTime()
                long r4 = r6.terminationDeadline
                long r0 = r0 - r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L2a
                r6.terminationDeadline = r2
                r6.tryTerminateWorker()
            L2a:
                return
        }

        private final kotlinx.coroutines.scheduling.Task pollGlobalQueues() {
                r1 = this;
                r0 = 2
                int r0 = r1.nextInt(r0)
                if (r0 != 0) goto L1e
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L1d
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            L1d:
                return r0
            L1e:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            L34:
                return r0
        }

        private final void runWorker() {
                r7 = this;
                r0 = 0
            L1:
                r1 = 0
            L2:
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r7.this$0
                boolean r2 = r2.isTerminated()
                if (r2 != 0) goto L40
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = r7.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r2 == r3) goto L40
                boolean r2 = r7.mayHaveLocalTasks
                kotlinx.coroutines.scheduling.Task r2 = r7.findTask(r2)
                r3 = 0
                if (r2 == 0) goto L20
                r7.minDelayUntilStealableTaskNs = r3
                r7.executeTask(r2)
                goto L1
            L20:
                r7.mayHaveLocalTasks = r0
                long r5 = r7.minDelayUntilStealableTaskNs
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 == 0) goto L3c
                if (r1 != 0) goto L2c
                r1 = 1
                goto L2
            L2c:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r7.tryReleaseCpu(r1)
                java.lang.Thread.interrupted()
                long r1 = r7.minDelayUntilStealableTaskNs
                java.util.concurrent.locks.LockSupport.parkNanos(r1)
                r7.minDelayUntilStealableTaskNs = r3
                goto L1
            L3c:
                r7.tryPark()
                goto L2
            L40:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r7.tryReleaseCpu(r0)
                return
        }

        private final boolean tryAcquireCpuPermit() {
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto La
            L8:
                r2 = 1
                goto L34
            La:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r10.this$0
            Lc:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L1c
                r0 = 0
                goto L2d
            L1c:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto Lc
                r0 = 1
            L2d:
                if (r0 == 0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.state = r0
                goto L8
            L34:
                return r2
        }

        private final void tryPark() {
                r3 = this;
                boolean r0 = r3.inStack()
                if (r0 != 0) goto Lc
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                r0.parkedWorkersStackPush(r3)
                return
            Lc:
                r0 = -1
                r3.workerCtl = r0
            Lf:
                boolean r1 = r3.inStack()
                if (r1 == 0) goto L34
                int r1 = r3.workerCtl
                if (r1 != r0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r3.this$0
                boolean r1 = r1.isTerminated()
                if (r1 != 0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r3.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r1 != r2) goto L28
                goto L34
            L28:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r3.tryReleaseCpu(r1)
                java.lang.Thread.interrupted()
                r3.park()
                goto Lf
            L34:
                return
        }

        private final kotlinx.coroutines.scheduling.Task trySteal(boolean r18) {
                r17 = this;
                r0 = r17
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                long r1 = r1.controlState
                r3 = 2097151(0x1fffff, double:1.0361303E-317)
                long r1 = r1 & r3
                int r2 = (int) r1
                r1 = 2
                r3 = 0
                if (r2 >= r1) goto L10
                return r3
            L10:
                int r1 = r0.nextInt(r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r0.this$0
                r5 = 0
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = r6
            L1d:
                r10 = 0
                if (r5 >= r2) goto L5d
                int r5 = r5 + 1
                r12 = 1
                int r1 = r1 + r12
                if (r1 <= r2) goto L28
                r1 = 1
            L28:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r12 = r4.workers
                java.lang.Object r12 = r12.get(r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r12 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r12
                if (r12 == 0) goto L1d
                if (r12 == r0) goto L1d
                if (r18 == 0) goto L3f
                kotlinx.coroutines.scheduling.WorkQueue r13 = r0.localQueue
                kotlinx.coroutines.scheduling.WorkQueue r12 = r12.localQueue
                long r12 = r13.tryStealBlockingFrom(r12)
                goto L47
            L3f:
                kotlinx.coroutines.scheduling.WorkQueue r13 = r0.localQueue
                kotlinx.coroutines.scheduling.WorkQueue r12 = r12.localQueue
                long r12 = r13.tryStealFrom(r12)
            L47:
                r14 = -1
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 != 0) goto L54
                kotlinx.coroutines.scheduling.WorkQueue r1 = r0.localQueue
                kotlinx.coroutines.scheduling.Task r1 = r1.poll()
                return r1
            L54:
                int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r14 <= 0) goto L1d
                long r8 = java.lang.Math.min(r8, r12)
                goto L1d
            L5d:
                int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r1 == 0) goto L62
                goto L63
            L62:
                r8 = r10
            L63:
                r0.minDelayUntilStealableTaskNs = r8
                return r3
        }

        private final void tryTerminateWorker() {
                r8 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r8.this$0
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r0.workers
                monitor-enter(r1)
                boolean r2 = r0.isTerminated()     // Catch: java.lang.Throwable -> L60
                if (r2 == 0) goto Ld
                monitor-exit(r1)
                return
            Ld:
                long r2 = r0.controlState     // Catch: java.lang.Throwable -> L60
                r4 = 2097151(0x1fffff, double:1.0361303E-317)
                long r2 = r2 & r4
                int r3 = (int) r2     // Catch: java.lang.Throwable -> L60
                int r2 = r0.corePoolSize     // Catch: java.lang.Throwable -> L60
                if (r3 > r2) goto L1a
                monitor-exit(r1)
                return
            L1a:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU     // Catch: java.lang.Throwable -> L60
                r3 = -1
                r6 = 1
                boolean r2 = r2.compareAndSet(r8, r3, r6)     // Catch: java.lang.Throwable -> L60
                if (r2 != 0) goto L26
                monitor-exit(r1)
                return
            L26:
                int r2 = r8.getIndexInArray()     // Catch: java.lang.Throwable -> L60
                r3 = 0
                r8.setIndexInArray(r3)     // Catch: java.lang.Throwable -> L60
                r0.parkedWorkersStackTopUpdate(r8, r2, r3)     // Catch: java.lang.Throwable -> L60
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU     // Catch: java.lang.Throwable -> L60
                long r6 = r3.getAndDecrement(r0)     // Catch: java.lang.Throwable -> L60
                long r3 = r6 & r4
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L60
                if (r4 == r2) goto L52
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r3 = r0.workers     // Catch: java.lang.Throwable -> L60
                java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L60
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L60
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r3 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r3     // Catch: java.lang.Throwable -> L60
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r5 = r0.workers     // Catch: java.lang.Throwable -> L60
                r5.setSynchronized(r2, r3)     // Catch: java.lang.Throwable -> L60
                r3.setIndexInArray(r2)     // Catch: java.lang.Throwable -> L60
                r0.parkedWorkersStackTopUpdate(r3, r4, r2)     // Catch: java.lang.Throwable -> L60
            L52:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r0.workers     // Catch: java.lang.Throwable -> L60
                r2 = 0
                r0.setSynchronized(r4, r2)     // Catch: java.lang.Throwable -> L60
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L60
                monitor-exit(r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r8.state = r0
                return
            L60:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.scheduling.Task findTask(boolean r2) {
                r1 = this;
                boolean r0 = r1.tryAcquireCpuPermit()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.scheduling.Task r2 = r1.findAnyTask(r2)
                return r2
            Lb:
                if (r2 == 0) goto L20
                kotlinx.coroutines.scheduling.WorkQueue r2 = r1.localQueue
                kotlinx.coroutines.scheduling.Task r2 = r2.poll()
                if (r2 != 0) goto L2a
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r2 = r2.globalBlockingQueue
                java.lang.Object r2 = r2.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
                goto L2a
            L20:
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r2 = r2.globalBlockingQueue
                java.lang.Object r2 = r2.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            L2a:
                if (r2 != 0) goto L31
                r2 = 1
                kotlinx.coroutines.scheduling.Task r2 = r1.trySteal(r2)
            L31:
                return r2
        }

        public final int getIndexInArray() {
                r1 = this;
                int r0 = r1.indexInArray
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getNextParkedWorker() {
                r1 = this;
                java.lang.Object r0 = r1.nextParkedWorker
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.scheduling.CoroutineScheduler getScheduler() {
                r1 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = access$getThis$0$p(r1)
                return r0
        }

        public final int nextInt(int r4) {
                r3 = this;
                int r0 = r3.rngState
                int r1 = r0 << 13
                r0 = r0 ^ r1
                int r1 = r0 >> 17
                r0 = r0 ^ r1
                int r1 = r0 << 5
                r0 = r0 ^ r1
                r3.rngState = r0
                int r1 = r4 + (-1)
                r2 = r1 & r4
                if (r2 != 0) goto L16
                r4 = r0 & r1
                return r4
            L16:
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0 = r0 & r1
                int r0 = r0 % r4
                return r0
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
                r0.runWorker()
                return
        }

        public final void setIndexInArray(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.this$0
                java.lang.String r1 = r1.schedulerName
                r0.append(r1)
                java.lang.String r1 = "-worker-"
                r0.append(r1)
                if (r3 != 0) goto L16
                java.lang.String r1 = "TERMINATED"
                goto L1a
            L16:
                java.lang.String r1 = java.lang.String.valueOf(r3)
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setName(r0)
                r2.indexInArray = r3
                return
        }

        public final void setNextParkedWorker(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                r0.nextParkedWorker = r1
                return
        }

        public final boolean tryReleaseCpu(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState r7) {
                r6 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r6.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                if (r0 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L17
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r6.this$0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r3.addAndGet(r2, r4)
            L17:
                if (r0 == r7) goto L1b
                r6.state = r7
            L1b:
                return r1
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final enum WorkerState extends java.lang.Enum<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> {
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $VALUES = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED = null;

        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values() {
                r0 = 5
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2 = 1
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r2 = 2
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r2 = 3
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "CPU_ACQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "BLOCKING"
                r2 = 1
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "PARKING"
                r2 = 2
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "DORMANT"
                r2 = 3
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "TERMINATED"
                r2 = 4
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = $values()
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES = r0
                return
        }

        private WorkerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String r1) {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) r1
                return r1
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) r0
                return r0
        }
    }

    static {
            kotlinx.coroutines.scheduling.CoroutineScheduler$Companion r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.Companion = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NOT_IN_STACK"
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK = r0
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.lang.String r1 = "parkedWorkersStack"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU = r0
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.lang.String r1 = "controlState"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU = r0
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.lang.String r1 = "_isTerminated"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU = r0
            return
    }

    public CoroutineScheduler(int r4, int r5, long r6, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            r3 = this;
            r3.<init>()
            r3.corePoolSize = r4
            r3.maxPoolSize = r5
            r3.idleWorkerKeepAliveNs = r6
            r3.schedulerName = r8
            r8 = 0
            r0 = 1
            if (r4 < r0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L93
            if (r5 < r4) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r2 = "Max pool size "
            if (r1 == 0) goto L83
            r1 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r5 > r1) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L73
            r1 = 0
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L53
            kotlinx.coroutines.scheduling.GlobalQueue r5 = new kotlinx.coroutines.scheduling.GlobalQueue
            r5.<init>()
            r3.globalCpuQueue = r5
            kotlinx.coroutines.scheduling.GlobalQueue r5 = new kotlinx.coroutines.scheduling.GlobalQueue
            r5.<init>()
            r3.globalBlockingQueue = r5
            r3.parkedWorkersStack = r1
            kotlinx.coroutines.internal.ResizableAtomicArray r5 = new kotlinx.coroutines.internal.ResizableAtomicArray
            int r6 = r4 + 1
            r5.<init>(r6)
            r3.workers = r5
            long r4 = (long) r4
            r6 = 42
            long r4 = r4 << r6
            r3.controlState = r4
            r3._isTerminated = r8
            return
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Idle worker keep alive time "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " must be positive"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L73:
            java.lang.String r4 = " should not exceed maximal supported number of threads 2097150"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L83:
            java.lang.String r6 = " should be greater than or equals to core pool size "
            java.lang.String r4 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r2, r5, r6, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L93:
            java.lang.String r5 = "Core pool size "
            java.lang.String r6 = " should be at least 1"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r4, r6)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public /* synthetic */ CoroutineScheduler(int r7, int r8, long r9, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            long r9 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Ld
            java.lang.String r11 = "DefaultDispatcher"
        Ld:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            return
    }

    private final boolean addToGlobalQueue(kotlinx.coroutines.scheduling.Task r3) {
            r2 = this;
            kotlinx.coroutines.scheduling.TaskContext r0 = r3.taskContext
            int r0 = r0.getTaskMode()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L14
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r2.globalBlockingQueue
            boolean r3 = r0.addLast(r3)
            goto L1a
        L14:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r2.globalCpuQueue
            boolean r3 = r0.addLast(r3)
        L1a:
            return r3
    }

    private final int blockingTasks(long r3) {
            r2 = this;
            r0 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r3 = r3 & r0
            r0 = 21
            long r3 = r3 >> r0
            int r4 = (int) r3
            return r4
    }

    private final int createNewWorker() {
            r10 = this;
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r10.workers
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto Lc
            r1 = -1
            monitor-exit(r0)
            return r1
        Lc:
            long r1 = r10.controlState     // Catch: java.lang.Throwable -> L7b
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L7b
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L7b
            int r1 = r6 - r2
            r2 = 0
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)     // Catch: java.lang.Throwable -> L7b
            int r5 = r10.corePoolSize     // Catch: java.lang.Throwable -> L7b
            if (r1 < r5) goto L2b
            monitor-exit(r0)
            return r2
        L2b:
            int r5 = r10.maxPoolSize     // Catch: java.lang.Throwable -> L7b
            if (r6 < r5) goto L31
            monitor-exit(r0)
            return r2
        L31:
            long r5 = r10.controlState     // Catch: java.lang.Throwable -> L7b
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L7b
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L43
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r7 = r10.workers     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L7b
            if (r7 != 0) goto L43
            r7 = 1
            goto L44
        L43:
            r7 = 0
        L44:
            if (r7 == 0) goto L6f
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r7 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Worker     // Catch: java.lang.Throwable -> L7b
            r7.<init>(r10, r6)     // Catch: java.lang.Throwable -> L7b
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r8 = r10.workers     // Catch: java.lang.Throwable -> L7b
            r8.setSynchronized(r6, r7)     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU     // Catch: java.lang.Throwable -> L7b
            long r8 = r8.incrementAndGet(r10)     // Catch: java.lang.Throwable -> L7b
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L7b
            if (r6 != r4) goto L5b
            r2 = 1
        L5b:
            if (r2 == 0) goto L63
            r7.start()     // Catch: java.lang.Throwable -> L7b
            int r1 = r1 + r5
            monitor-exit(r0)
            return r1
        L63:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L6f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L7b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private final int createdWorkers(long r3) {
            r2 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r0
            int r4 = (int) r3
            return r4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L1b
        L10:
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.access$getThis$0$p(r0)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L1b
            r2 = r0
        L1b:
            return r2
    }

    private final void decrementBlockingTasks() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r1 = -2097152(0xffffffffffe00000, double:NaN)
            r0.addAndGet(r3, r1)
            return
    }

    private final int decrementCreatedWorkers() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            long r0 = r0.getAndDecrement(r4)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, java.lang.Runnable r1, kotlinx.coroutines.scheduling.TaskContext r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            kotlinx.coroutines.scheduling.TaskContext r2 = kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.dispatch(r1, r2, r3)
            return
    }

    private final int getAvailableCpuPermits() {
            r4 = this;
            long r0 = r4.controlState
            r2 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r0 & r2
            r2 = 42
            long r0 = r0 >> r2
            int r1 = (int) r0
            return r1
    }

    private final int getCreatedWorkers() {
            r4 = this;
            long r0 = r4.controlState
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    private final long incrementBlockingTasks() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r0.addAndGet(r3, r1)
            return r0
    }

    private final int incrementCreatedWorkers() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            long r0 = r0.incrementAndGet(r4)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r2) {
            r1 = this;
            java.lang.Object r2 = r2.getNextParkedWorker()
        L4:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            if (r2 != r0) goto La
            r2 = -1
            return r2
        La:
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r2
            int r0 = r2.getIndexInArray()
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.Object r2 = r2.getNextParkedWorker()
            goto L4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
            r9 = this;
        L0:
            long r2 = r9.parkedWorkersStack
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r9.workers
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r6 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r6
            if (r6 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r0 + r2
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r0 = r0 & r4
            int r4 = r9.parkedWorkersStackNextIndex(r6)
            if (r4 >= 0) goto L23
            goto L0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r7 = (long) r4
            long r7 = r7 | r0
            r0 = r5
            r1 = r9
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            r6.setNextParkedWorker(r0)
            return r6
    }

    private final long releaseCpuPermit() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r0 = r0.addAndGet(r3, r1)
            return r0
    }

    private final void signalBlockingWork(boolean r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r0.addAndGet(r3, r1)
            if (r4 == 0) goto Lc
            return
        Lc:
            boolean r4 = r3.tryUnpark()
            if (r4 == 0) goto L13
            return
        L13:
            boolean r4 = r3.tryCreateWorker(r0)
            if (r4 == 0) goto L1a
            return
        L1a:
            r3.tryUnpark()
            return
    }

    private final kotlinx.coroutines.scheduling.Task submitToLocalQueue(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r3, kotlinx.coroutines.scheduling.Task r4, boolean r5) {
            r2 = this;
            if (r3 != 0) goto L3
            return r4
        L3:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r0 != r1) goto La
            return r4
        La:
            kotlinx.coroutines.scheduling.TaskContext r0 = r4.taskContext
            int r0 = r0.getTaskMode()
            if (r0 != 0) goto L19
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
            if (r0 != r1) goto L19
            return r4
        L19:
            r0 = 1
            r3.mayHaveLocalTasks = r0
            kotlinx.coroutines.scheduling.WorkQueue r3 = r3.localQueue
            kotlinx.coroutines.scheduling.Task r3 = r3.add(r4, r5)
            return r3
    }

    private final boolean tryAcquireCpuPermit() {
            r6 = this;
        L0:
            long r2 = r6.controlState
            r0 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r0 & r2
            r4 = 42
            long r0 = r0 >> r4
            int r1 = (int) r0
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r4 = r2 - r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r1 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }

    private final boolean tryCreateWorker(long r5) {
            r4 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r1 = (int) r0
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r2
            r0 = 21
            long r5 = r5 >> r0
            int r6 = (int) r5
            int r1 = r1 - r6
            r5 = 0
            int r6 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r5)
            int r0 = r4.corePoolSize
            if (r6 >= r0) goto L2a
            int r6 = r4.createNewWorker()
            r0 = 1
            if (r6 != r0) goto L27
            int r1 = r4.corePoolSize
            if (r1 <= r0) goto L27
            r4.createNewWorker()
        L27:
            if (r6 <= 0) goto L2a
            return r0
        L2a:
            return r5
    }

    private final boolean tryUnpark() {
            r4 = this;
        L0:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r4.parkedWorkersStackPop()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU
            r3 = -1
            boolean r1 = r2.compareAndSet(r0, r3, r1)
            if (r1 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r0 = 1
            return r0
    }

    public final int availableCpuPermits(long r3) {
            r2 = this;
            r0 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r0
            r0 = 42
            long r3 = r3 >> r0
            int r4 = (int) r3
            return r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.shutdown(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.scheduling.Task createTask(@org.jetbrains.annotations.NotNull java.lang.Runnable r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.TaskContext r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.SchedulerTimeSource r0 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r0 = r0.nanoTime()
            boolean r2 = r4 instanceof kotlinx.coroutines.scheduling.Task
            if (r2 == 0) goto L11
            kotlinx.coroutines.scheduling.Task r4 = (kotlinx.coroutines.scheduling.Task) r4
            r4.submissionTime = r0
            r4.taskContext = r5
            return r4
        L11:
            kotlinx.coroutines.scheduling.TaskImpl r2 = new kotlinx.coroutines.scheduling.TaskImpl
            r2.<init>(r4, r0, r5)
            return r2
    }

    public final void dispatch(@org.jetbrains.annotations.NotNull java.lang.Runnable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.TaskContext r3, boolean r4) {
            r1 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.trackTask()
        La:
            kotlinx.coroutines.scheduling.Task r2 = r1.createTask(r2, r3)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r3 = r1.currentWorker()
            kotlinx.coroutines.scheduling.Task r0 = r1.submitToLocalQueue(r3, r2, r4)
            if (r0 == 0) goto L2d
            boolean r0 = r1.addToGlobalQueue(r0)
            if (r0 == 0) goto L1f
            goto L2d
        L1f:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r3 = r1.schedulerName
            java.lang.String r4 = " was terminated"
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r4)
            r2.<init>(r3)
            throw r2
        L2d:
            if (r4 == 0) goto L33
            if (r3 == 0) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            kotlinx.coroutines.scheduling.TaskContext r2 = r2.taskContext
            int r2 = r2.getTaskMode()
            if (r2 != 0) goto L43
            if (r3 == 0) goto L3f
            return
        L3f:
            r1.signalCpuWork()
            goto L46
        L43:
            r1.signalBlockingWork(r3)
        L46:
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r1 = r7
            dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final boolean isTerminated() {
            r1 = this;
            int r0 = r1._isTerminated
            return r0
    }

    public final boolean parkedWorkersStackPush(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r9) {
            r8 = this;
            java.lang.Object r0 = r9.getNextParkedWorker()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            if (r0 == r1) goto La
            r9 = 0
            return r9
        La:
            long r2 = r8.parkedWorkersStack
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r0 = r9.getIndexInArray()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r6 = r8.workers
            java.lang.Object r1 = r6.get(r1)
            r9.setNextParkedWorker(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r6 = (long) r0
            long r4 = r4 | r6
            r0 = r1
            r1 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto La
            r9 = 1
            return r9
    }

    public final void parkedWorkersStackTopUpdate(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r9, int r10, int r11) {
            r8 = this;
        L0:
            long r2 = r8.parkedWorkersStack
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            if (r1 != r10) goto L19
            if (r11 != 0) goto L18
            int r1 = r8.parkedWorkersStackNextIndex(r9)
            goto L19
        L18:
            r1 = r11
        L19:
            if (r1 >= 0) goto L1c
            goto L0
        L1c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r6 = (long) r1
            long r4 = r4 | r6
            r1 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            return
    }

    public final void runSafely(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.Task r3) {
            r2 = this;
            r3.run()     // Catch: java.lang.Throwable -> Le
            kotlinx.coroutines.AbstractTimeSource r3 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r3 != 0) goto La
            goto L20
        La:
            r3.unTrackTask()
            goto L20
        Le:
            r3 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L21
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L21
            r1.uncaughtException(r0, r3)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.AbstractTimeSource r3 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r3 != 0) goto La
        L20:
            return
        L21:
            r3 = move-exception
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L29
            goto L2c
        L29:
            r0.unTrackTask()
        L2c:
            throw r3
    }

    public final void shutdown(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r7.currentWorker()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r7.workers
            monitor-enter(r1)
            long r3 = r7.controlState     // Catch: java.lang.Throwable -> L80
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L45
            r1 = 1
        L1d:
            int r3 = r1 + 1
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r5 = r7.workers
            java.lang.Object r5 = r5.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r5 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r5
            if (r5 == r0) goto L40
        L2c:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L39
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r5.join(r8)
            goto L2c
        L39:
            kotlinx.coroutines.scheduling.WorkQueue r5 = r5.localQueue
            kotlinx.coroutines.scheduling.GlobalQueue r6 = r7.globalBlockingQueue
            r5.offloadAllWorkTo(r6)
        L40:
            if (r1 != r4) goto L43
            goto L45
        L43:
            r1 = r3
            goto L1d
        L45:
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalBlockingQueue
            r8.close()
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalCpuQueue
            r8.close()
        L4f:
            if (r0 != 0) goto L53
            r8 = 0
            goto L57
        L53:
            kotlinx.coroutines.scheduling.Task r8 = r0.findTask(r2)
        L57:
            if (r8 != 0) goto L7c
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r8 = (kotlinx.coroutines.scheduling.Task) r8
            if (r8 != 0) goto L7c
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r8 = (kotlinx.coroutines.scheduling.Task) r8
            if (r8 != 0) goto L7c
            if (r0 != 0) goto L70
            goto L75
        L70:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.tryReleaseCpu(r8)
        L75:
            r8 = 0
            r7.parkedWorkersStack = r8
            r7.controlState = r8
            return
        L7c:
            r7.runSafely(r8)
            goto L4f
        L80:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    public final void signalCpuWork() {
            r2 = this;
            boolean r0 = r2.tryUnpark()
            if (r0 == 0) goto L7
            return
        L7:
            long r0 = r2.controlState
            boolean r0 = r2.tryCreateWorker(r0)
            if (r0 == 0) goto L10
            return
        L10:
            r2.tryUnpark()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r12.workers
            int r1 = r1.currentLength()
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L12:
            if (r8 >= r1) goto L8e
            int r9 = r8 + 1
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r10 = r12.workers
            java.lang.Object r8 = r10.get(r8)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r8 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r8
            if (r8 != 0) goto L22
        L20:
            r8 = r9
            goto L12
        L22:
            kotlinx.coroutines.scheduling.WorkQueue r10 = r8.localQueue
            int r10 = r10.getSize$kotlinx_coroutines_core()
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = r8.state
            int[] r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r11[r8]
            if (r8 == r3) goto L8b
            r11 = 2
            if (r8 == r11) goto L74
            r11 = 3
            if (r8 == r11) goto L5d
            r11 = 4
            if (r8 == r11) goto L44
            r10 = 5
            if (r8 == r10) goto L41
            goto L20
        L41:
            int r7 = r7 + 1
            goto L20
        L44:
            int r6 = r6 + 1
            if (r10 <= 0) goto L20
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r10 = 100
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
            goto L20
        L5d:
            int r2 = r2 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r10 = 99
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
            goto L20
        L74:
            int r4 = r4 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r10 = 98
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
            goto L20
        L8b:
            int r5 = r5 + 1
            goto L20
        L8e:
            long r8 = r12.controlState
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r12.schedulerName
            r1.append(r3)
            r3 = 64
            r1.append(r3)
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r12)
            r1.append(r3)
            java.lang.String r3 = "[Pool Size {core = "
            r1.append(r3)
            int r3 = r12.corePoolSize
            r1.append(r3)
            java.lang.String r3 = ", max = "
            r1.append(r3)
            int r3 = r12.maxPoolSize
            r1.append(r3)
            java.lang.String r3 = "}, Worker States {CPU = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", blocking = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", parked = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", dormant = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", terminated = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = "}, running workers queues = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r1.append(r0)
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r12.globalCpuQueue
            int r0 = r0.getSize()
            r1.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r1.append(r0)
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r12.globalBlockingQueue
            int r0 = r0.getSize()
            r1.append(r0)
            java.lang.String r0 = ", Control State {created workers= "
            r1.append(r0)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = ", blocking tasks = "
            r1.append(r0)
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r2 = r2 & r8
            r0 = 21
            long r2 = r2 >> r0
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = ", CPUs acquired = "
            r1.append(r0)
            int r0 = r12.corePoolSize
            r2 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r2 = r2 & r8
            r4 = 42
            long r2 = r2 >> r4
            int r3 = (int) r2
            int r0 = r0 - r3
            r1.append(r0)
            java.lang.String r0 = "}]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
