package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0014:\u0002\u0095\u0001B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0017*\u00020\u00142\u001e\b\u0004\u0010\u001b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u0018H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¢\u0006\u0004\b \u0010\u0012J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010!\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J5\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010)\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b,\u0010-J?\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.012\u0006\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\u00020.2\u0006\u00104\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020&2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u0002J%\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bL\u0010JJ'\u0010P\u001a\b\u0012\u0004\u0012\u00020\"0\u000f\"\b\b\u0000\u0010\u0003*\u00020N2\u0006\u0010O\u001a\u00028\u0000H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010\u0002J\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0002J\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010\u0002J\u001f\u0010V\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020U2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010YJ/\u0010X\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010ZJ;\u0010b\u001a\u00020\f*\u00020;2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\\0[2\n\u0010`\u001a\u00060^j\u0002`_2\u0006\u0010a\u001a\u00020&H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u000208*\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bd\u0010eJ\u001d\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\bC\u0010fJ\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u00020UH\u0082\u0010¢\u0006\u0004\bC\u0010gJ\u0016\u0010h\u001a\u0004\u0018\u00010U*\u00020UH\u0082\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020&*\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\\0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010v\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR$\u0010w\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u0002080p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010rR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\"\u0010~\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR)\u0010\u0080\u0001\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0089\u0001\u001a\u0002088@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001R)\u0010\u008a\u0001\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0081\u0001\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001\"\u0006\b\u008c\u0001\u0010\u0085\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\"\u0010\u0092\u0001\u001a\u00020&*\u00020;8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u008f\u0001\u0010>R\u001b\u0010\u0093\u0001\u001a\u000208*\u00020\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0096\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "<init>", "()V", "T", "Lkotlin/coroutines/Continuation;", "completion", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "createOwner", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "Ljava/io/PrintStream;", "out", "", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfo", "()Ljava/util/List;", "", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/CoroutineContext;", "create", "dumpCoroutinesInfoImpl", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "dumpCoroutinesSynchronized", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "info", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "state", "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/Function1;", "", "getDynamicAttach", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "job", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "install", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "owner", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "updateState", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "realCaller", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStringWithQuotes", "(Ljava/lang/Object;)Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "capturedCoroutinesMap", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/jvm/functions/Function1;", "enableCreationStackTraces", "Z", "getEnableCreationStackTraces", "()Z", "setEnableCreationStackTraces", "(Z)V", "installations", "I", "isInstalled$kotlinx_coroutines_core", "isInstalled", "sanitizeStackTraces", "getSanitizeStackTraces", "setSanitizeStackTraces", "weakRefCleanerThread", "Ljava/lang/Thread;", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DebugProbesImpl {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARTIFICIAL_FRAME_MESSAGE = "Coroutine creation stacktrace";

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.debug.internal.DebugProbesImpl INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> callerInfoCache = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> capturedCoroutinesMap = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.locks.ReentrantReadWriteLock coroutineStateLock = null;

    @org.jetbrains.annotations.NotNull
    private static final java.text.SimpleDateFormat dateFormat = null;

    @org.jetbrains.annotations.NotNull
    private static final /* synthetic */ kotlinx.coroutines.debug.internal.DebugProbesImpl.SequenceNumberRefVolatile debugProbesImpl$SequenceNumberRefVolatile = null;

    @org.jetbrains.annotations.Nullable
    private static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> dynamicAttach = null;
    private static boolean enableCreationStackTraces;
    private static volatile int installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater sequenceNumber$FU = null;

    @org.jetbrains.annotations.Nullable
    private static java.lang.Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "frame", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<T> delegate;

        @org.jetbrains.annotations.Nullable
        private final kotlin.coroutines.jvm.internal.CoroutineStackFrame frame;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl info;

        public CoroutineOwner(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2, @org.jetbrains.annotations.Nullable kotlin.coroutines.jvm.internal.CoroutineStackFrame r3) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.info = r2
                r0.frame = r3
                return
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @org.jetbrains.annotations.Nullable
        public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
                r1 = this;
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.frame
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            La:
                return r0
        }

        @Override // kotlin.coroutines.Continuation
        @org.jetbrains.annotations.NotNull
        public kotlin.coroutines.CoroutineContext getContext() {
                r1 = this;
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @org.jetbrains.annotations.Nullable
        public java.lang.StackTraceElement getStackTraceElement() {
                r1 = this;
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.frame
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                java.lang.StackTraceElement r0 = r0.getStackTraceElement()
            La:
                return r0
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
                kotlinx.coroutines.debug.internal.DebugProbesImpl.access$probeCoroutineCompleted(r0, r1)
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                r0.resumeWith(r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                java.lang.String r0 = r0.toString()
                return r0
        }
    }



    static {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl
            r0.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE = r0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy/MM/dd HH:mm:ss"
            r1.<init>(r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.dateFormat = r1
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap r1 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap
            r2 = 0
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap = r1
            kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile
            r4 = 0
            r1.<init>(r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.debugProbesImpl$SequenceNumberRefVolatile = r1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r1.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock = r1
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces = r3
            kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces = r3
            kotlin.jvm.functions.Function1 r0 = r0.getDynamicAttach()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap
            r0.<init>(r3)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache = r0
            java.lang.Class<kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.SequenceNumberRefVolatile.class
            java.lang.String r1 = "sequenceNumber"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sequenceNumber$FU = r0
            return
    }

    private DebugProbesImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap access$getCallerInfoCache$p() {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            return r0
    }

    public static final /* synthetic */ boolean access$isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl r0, kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner r1) {
            boolean r0 = r0.isFinished(r1)
            return r0
    }

    public static final /* synthetic */ void access$probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl r0, kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner r1) {
            r0.probeCoroutineCompleted(r1)
            return
    }

    private final void build(kotlinx.coroutines.Job r9, java.util.Map<kotlinx.coroutines.Job, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r10, java.lang.StringBuilder r11, java.lang.String r12) {
            r8 = this;
            java.lang.Object r0 = r10.get(r9)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r0
            java.lang.String r1 = "\t"
            r2 = 10
            if (r0 != 0) goto L2a
            boolean r0 = r9 instanceof kotlinx.coroutines.internal.ScopeCoroutine
            if (r0 != 0) goto L58
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
            java.lang.String r3 = r8.getDebugString(r9)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r12 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r1)
            goto L58
        L2a:
            java.util.List r3 = r0.lastObservedStackTrace()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r0 = r0.getState()
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
            java.lang.String r5 = r8.getDebugString(r9)
            java.lang.String r6 = ", continuation is "
            java.lang.String r7 = " at line "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r5, r6, r0, r7)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r11.append(r0)
            java.lang.String r12 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r1)
        L58:
            kotlin.sequences.Sequence r9 = r9.getChildren()
            java.util.Iterator r9 = r9.iterator()
        L60:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r9.next()
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r8.build(r0, r10, r11, r12)
            goto L60
        L70:
            return
    }

    private final <T> kotlin.coroutines.Continuation<T> createOwner(kotlin.coroutines.Continuation<? super T> r5, kotlinx.coroutines.debug.internal.StackTraceFrame r6) {
            r4 = this;
            boolean r0 = r4.isInstalled$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            return r5
        L7:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sequenceNumber$FU
            kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumberRefVolatile r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.debugProbesImpl$SequenceNumberRefVolatile
            long r2 = r2.incrementAndGet(r3)
            r0.<init>(r1, r6, r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner
            r1.<init>(r5, r0, r6)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.put(r1, r6)
            boolean r6 = r4.isInstalled$kotlinx_coroutines_core()
            if (r6 != 0) goto L2d
            r5.clear()
        L2d:
            return r1
    }

    private final <R> java.util.List<R> dumpCoroutinesInfoImpl(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> r8) {
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 1
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L68
            boolean r6 = r5.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L5c
            java.util.Set r5 = r5.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L68
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r6 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L68
            r6.<init>()     // Catch: java.lang.Throwable -> L68
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.sortedWith(r5, r6)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3 r6 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3     // Catch: java.lang.Throwable -> L68
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L68
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.mapNotNull(r5, r6)     // Catch: java.lang.Throwable -> L68
            java.util.List r8 = kotlin.sequences.SequencesKt.toList(r8)     // Catch: java.lang.Throwable -> L68
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
        L4d:
            if (r3 >= r2) goto L55
            int r3 = r3 + 1
            r1.lock()
            goto L4d
        L55:
            r0.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r8
        L5c:
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L68
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
        L6c:
            if (r3 >= r2) goto L74
            int r3 = r3 + 1
            r1.lock()
            goto L6c
        L74:
            r0.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r8
    }

    private final void dumpCoroutinesSynchronized(java.io.PrintStream r14) {
            r13 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lf1
            boolean r5 = r4.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Lf1
            if (r5 == 0) goto Le5
            java.lang.String r5 = "Coroutines dump "
            java.text.SimpleDateFormat r6 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dateFormat     // Catch: java.lang.Throwable -> Lf1
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = r6.format(r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r6)     // Catch: java.lang.Throwable -> Lf1
            r14.print(r5)     // Catch: java.lang.Throwable -> Lf1
            java.util.Set r4 = r4.getCapturedCoroutines()     // Catch: java.lang.Throwable -> Lf1
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$1$2 r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$1$2.INSTANCE     // Catch: java.lang.Throwable -> Lf1
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.filter(r4, r5)     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$lambda-19$$inlined$sortedBy$1 r5 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$lambda-19$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> Lf1
            r5.<init>()     // Catch: java.lang.Throwable -> Lf1
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.sortedWith(r4, r5)     // Catch: java.lang.Throwable -> Lf1
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lf1
        L5d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lf1
            if (r5 == 0) goto Ld7
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r5 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r5     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r6 = r5.info     // Catch: java.lang.Throwable -> Lf1
            java.util.List r7 = r6.lastObservedStackTrace()     // Catch: java.lang.Throwable -> Lf1
            kotlinx.coroutines.debug.internal.DebugProbesImpl r8 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r9 = r6.getState()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Thread r10 = r6.lastObservedThread     // Catch: java.lang.Throwable -> Lf1
            java.util.List r9 = r8.enhanceStackTraceWithThreadDumpImpl(r9, r10, r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = r6.getState()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r11 = "RUNNING"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto L94
            if (r9 != r7) goto L94
            java.lang.String r10 = r6.getState()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r11 = " (Last suspension stacktrace, not an actual stacktrace)"
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r11)     // Catch: java.lang.Throwable -> Lf1
            goto L98
        L94:
            java.lang.String r10 = r6.getState()     // Catch: java.lang.Throwable -> Lf1
        L98:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r11.<init>()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r12 = "\n\nCoroutine "
            r11.append(r12)     // Catch: java.lang.Throwable -> Lf1
            kotlin.coroutines.Continuation<T> r5 = r5.delegate     // Catch: java.lang.Throwable -> Lf1
            r11.append(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = ", state: "
            r11.append(r5)     // Catch: java.lang.Throwable -> Lf1
            r11.append(r10)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> Lf1
            r14.print(r5)     // Catch: java.lang.Throwable -> Lf1
            boolean r5 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lf1
            if (r5 == 0) goto Ld3
            java.lang.String r5 = "\n\tat "
            java.lang.String r7 = "Coroutine creation stacktrace"
            java.lang.StackTraceElement r7 = kotlinx.coroutines.internal.StackTraceRecoveryKt.artificialFrame(r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r7)     // Catch: java.lang.Throwable -> Lf1
            r14.print(r5)     // Catch: java.lang.Throwable -> Lf1
            java.util.List r5 = r6.getCreationStackTrace()     // Catch: java.lang.Throwable -> Lf1
            r8.printStackTrace(r14, r5)     // Catch: java.lang.Throwable -> Lf1
            goto L5d
        Ld3:
            r8.printStackTrace(r14, r9)     // Catch: java.lang.Throwable -> Lf1
            goto L5d
        Ld7:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lf1
        Ld9:
            if (r3 >= r2) goto Le1
            int r3 = r3 + 1
            r1.lock()
            goto Ld9
        Le1:
            r0.unlock()
            return
        Le5:
            java.lang.String r14 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Lf1
            r4.<init>(r14)     // Catch: java.lang.Throwable -> Lf1
            throw r4     // Catch: java.lang.Throwable -> Lf1
        Lf1:
            r14 = move-exception
        Lf2:
            if (r3 >= r2) goto Lfa
            int r3 = r3 + 1
            r1.lock()
            goto Lf2
        Lfa:
            r0.unlock()
            throw r14
    }

    private final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDumpImpl(java.lang.String r9, java.lang.Thread r10, java.util.List<java.lang.StackTraceElement> r11) {
            r8 = this;
            java.lang.String r0 = "RUNNING"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r9 == 0) goto Lae
            if (r10 != 0) goto Lc
            goto Lae
        Lc:
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            java.lang.StackTraceElement[] r9 = r10.getStackTrace()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = kotlin.Result.m333constructorimpl(r9)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r9 = move-exception
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m333constructorimpl(r9)
        L22:
            boolean r10 = kotlin.Result.m339isFailureimpl(r9)
            if (r10 == 0) goto L29
            r9 = 0
        L29:
            java.lang.StackTraceElement[] r9 = (java.lang.StackTraceElement[]) r9
            if (r9 != 0) goto L2e
            return r11
        L2e:
            int r10 = r9.length
            r0 = 0
            r1 = 0
        L31:
            r2 = -1
            r3 = 1
            if (r1 >= r10) goto L66
            int r4 = r1 + 1
            r5 = r9[r1]
            java.lang.String r6 = r5.getClassName()
            java.lang.String r7 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L60
            java.lang.String r6 = r5.getMethodName()
            java.lang.String r7 = "resumeWith"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L60
            java.lang.String r5 = r5.getFileName()
            java.lang.String r6 = "ContinuationImpl.kt"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L60
            r5 = 1
            goto L61
        L60:
            r5 = 0
        L61:
            if (r5 == 0) goto L64
            goto L67
        L64:
            r1 = r4
            goto L31
        L66:
            r1 = -1
        L67:
            kotlin.Pair r10 = r8.findContinuationStartIndex(r1, r9, r11)
            java.lang.Object r4 = r10.component1()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r10 = r10.component2()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r4 != r2) goto L82
            return r11
        L82:
            int r2 = r11.size()
            int r2 = r2 + r1
            int r2 = r2 - r4
            int r2 = r2 - r3
            int r2 = r2 - r10
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            int r1 = r1 - r10
        L90:
            if (r0 >= r1) goto L9b
            int r10 = r0 + 1
            r0 = r9[r0]
            r5.add(r0)
            r0 = r10
            goto L90
        L9b:
            int r4 = r4 + r3
            int r9 = r11.size()
        La0:
            if (r4 >= r9) goto Lad
            int r10 = r4 + 1
            java.lang.Object r0 = r11.get(r4)
            r5.add(r0)
            r4 = r10
            goto La0
        Lad:
            return r5
        Lae:
            return r11
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> findContinuationStartIndex(int r7, java.lang.StackTraceElement[] r8, java.util.List<java.lang.StackTraceElement> r9) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = -1
            r3 = 3
            if (r1 >= r3) goto L22
            int r3 = r1 + 1
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            int r5 = r7 + (-1)
            int r5 = r5 - r1
            int r4 = r4.findIndexOfFrame(r5, r8, r9)
            if (r4 == r2) goto L20
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            return r7
        L20:
            r1 = r3
            goto L2
        L22:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            return r7
    }

    private final int findIndexOfFrame(int r6, java.lang.StackTraceElement[] r7, java.util.List<java.lang.StackTraceElement> r8) {
            r5 = this;
            java.lang.Object r6 = kotlin.collections.ArraysKt.getOrNull(r7, r6)
            java.lang.StackTraceElement r6 = (java.lang.StackTraceElement) r6
            r7 = -1
            if (r6 != 0) goto La
            return r7
        La:
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = 0
        L10:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r8.next()
            java.lang.StackTraceElement r2 = (java.lang.StackTraceElement) r2
            java.lang.String r3 = r2.getFileName()
            java.lang.String r4 = r6.getFileName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L48
            java.lang.String r3 = r2.getClassName()
            java.lang.String r4 = r6.getClassName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L48
            java.lang.String r2 = r2.getMethodName()
            java.lang.String r3 = r6.getMethodName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L48
            r2 = 1
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L4d
            r7 = r1
            goto L50
        L4d:
            int r1 = r1 + 1
            goto L10
        L50:
            return r7
    }

    private final java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> getCapturedCoroutines() {
            r1 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    private final java.lang.String getDebugString(kotlinx.coroutines.Job r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport
            if (r0 == 0) goto Lb
            kotlinx.coroutines.JobSupport r2 = (kotlinx.coroutines.JobSupport) r2
            java.lang.String r2 = r2.toDebugString()
            goto Lf
        Lb:
            java.lang.String r2 = r2.toString()
        Lf:
            return r2
    }

    private static /* synthetic */ void getDebugString$annotations(kotlinx.coroutines.Job r0) {
            return
    }

    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getDynamicAttach() {
            r2 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L23
            r1 = 1
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r0, r1)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)     // Catch: java.lang.Throwable -> L2b
            goto L36
        L23:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
        L36:
            boolean r1 = kotlin.Result.m339isFailureimpl(r0)
            if (r1 == 0) goto L3d
            r0 = 0
        L3d:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    private final boolean isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r3) {
            r2 = this;
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r3.info
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            if (r0 != 0) goto La
            r0 = 0
            goto L12
        La:
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
        L12:
            r1 = 0
            if (r0 != 0) goto L16
            return r1
        L16:
            boolean r0 = r0.isCompleted()
            if (r0 != 0) goto L1d
            return r1
        L1d:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r0.remove(r3)
            r3 = 1
            return r3
    }

    private final boolean isInternalMethod(java.lang.StackTraceElement r2) {
            r1 = this;
            java.lang.String r2 = r2.getClassName()
            java.lang.String r0 = "kotlinx.coroutines"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r2, r0)
            return r2
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 == 0) goto L8
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 != 0) goto Lc
            goto L10
        Lc:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = r2.owner(r3)
        L10:
            return r1
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            r1 = this;
        L0:
            boolean r0 = r2 instanceof kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner
            if (r0 == 0) goto L7
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r2 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r2
            goto Le
        L7:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getCallerFrame()
            if (r2 != 0) goto L0
            r2 = 0
        Le:
            return r2
    }

    private final void printStackTrace(java.io.PrintStream r3, java.util.List<java.lang.StackTraceElement> r4) {
            r2 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r4.next()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            java.lang.String r1 = "\n\tat "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            r3.print(r0)
            goto L4
        L1a:
            return
    }

    private final void probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r2) {
            r1 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r0.remove(r2)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = r2.info
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getLastObservedFrame$kotlinx_coroutines_core()
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r1.realCaller(r2)
        L13:
            if (r2 != 0) goto L16
            return
        L16:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            r0.remove(r2)
            return
    }

    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller(kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            r1 = this;
        L0:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getCallerFrame()
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.StackTraceElement r0 = r2.getStackTraceElement()
            if (r0 == 0) goto L0
            return r2
    }

    private final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> sanitizeStackTrace(T r8) {
            r7 = this;
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            int r0 = r8.length
            int r1 = r8.length
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L21
        La:
            int r3 = r1 + (-1)
            r4 = r8[r1]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = "kotlin.coroutines.jvm.internal.DebugProbesKt"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L1c
            r2 = r1
            goto L21
        L1c:
            if (r3 >= 0) goto L1f
            goto L21
        L1f:
            r1 = r3
            goto La
        L21:
            boolean r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces
            java.lang.String r3 = "Coroutine creation stacktrace"
            if (r1 != 0) goto L42
            int r0 = r0 - r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r4 = 0
        L2e:
            if (r4 >= r0) goto L41
            int r5 = r4 + 1
            if (r4 != 0) goto L39
            java.lang.StackTraceElement r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.artificialFrame(r3)
            goto L3c
        L39:
            int r4 = r4 + r2
            r4 = r8[r4]
        L3c:
            r1.add(r4)
            r4 = r5
            goto L2e
        L41:
            return r1
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r0 - r2
            int r4 = r4 + 1
            r1.<init>(r4)
            java.lang.StackTraceElement r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.artificialFrame(r3)
            r1.add(r3)
        L52:
            int r2 = r2 + 1
        L54:
            if (r2 >= r0) goto L98
            r3 = r8[r2]
            boolean r3 = r7.isInternalMethod(r3)
            if (r3 == 0) goto L92
            r3 = r8[r2]
            r1.add(r3)
            int r3 = r2 + 1
        L65:
            if (r3 >= r0) goto L72
            r4 = r8[r3]
            boolean r4 = r7.isInternalMethod(r4)
            if (r4 == 0) goto L72
            int r3 = r3 + 1
            goto L65
        L72:
            int r4 = r3 + (-1)
            r5 = r4
        L75:
            if (r5 <= r2) goto L82
            r6 = r8[r5]
            java.lang.String r6 = r6.getFileName()
            if (r6 != 0) goto L82
            int r5 = r5 + (-1)
            goto L75
        L82:
            if (r5 <= r2) goto L8b
            if (r5 >= r4) goto L8b
            r2 = r8[r5]
            r1.add(r2)
        L8b:
            r2 = r8[r4]
            r1.add(r2)
            r2 = r3
            goto L54
        L92:
            r3 = r8[r2]
            r1.add(r3)
            goto L52
        L98:
            return r1
    }

    private final void startWeakRefCleanerThread() {
            r8 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1 r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.AnonymousClass1.INSTANCE
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "Coroutines Debugger Cleaner"
            r4 = 0
            r6 = 21
            r7 = 0
            java.lang.Thread r0 = kotlin.concurrent.ThreadsKt.thread$default(r0, r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread = r0
            return
    }

    private final void stopWeakRefCleanerThread() {
            r2 = this;
            java.lang.Thread r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread = r1
            r0.interrupt()
            r0.join()
            return
    }

    private final kotlinx.coroutines.debug.internal.StackTraceFrame toStackTraceFrame(java.util.List<java.lang.StackTraceElement> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L22
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        Lf:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.previous()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            kotlinx.coroutines.debug.internal.StackTraceFrame r2 = new kotlinx.coroutines.debug.internal.StackTraceFrame
            r2.<init>(r1, r0)
            r1 = r2
            goto Lf
        L22:
            return r1
    }

    private final java.lang.String toStringWithQuotes(java.lang.Object r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private final void updateRunningState(kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, java.lang.String r8) {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r1.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L15
            r0.unlock()
            return
        L15:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r3 = r2.remove(r7)     // Catch: java.lang.Throwable -> L5a
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r3     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L20
            goto L41
        L20:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r3 = r1.owner(r7)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            if (r3 != 0) goto L29
            r3 = r4
            goto L2b
        L29:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r3.info     // Catch: java.lang.Throwable -> L5a
        L2b:
            if (r3 != 0) goto L31
            r0.unlock()
            return
        L31:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = r3.getLastObservedFrame$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L38
            goto L3c
        L38:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = r1.realCaller(r5)     // Catch: java.lang.Throwable -> L5a
        L3c:
            if (r4 == 0) goto L41
            r2.remove(r4)     // Catch: java.lang.Throwable -> L5a
        L41:
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L5a
            r3.updateState$kotlinx_coroutines_core(r8, r4)     // Catch: java.lang.Throwable -> L5a
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r1.realCaller(r7)     // Catch: java.lang.Throwable -> L5a
            if (r7 != 0) goto L51
            r0.unlock()
            return
        L51:
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L5a
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5a
            r0.unlock()
            return
        L5a:
            r7 = move-exception
            r0.unlock()
            throw r7
    }

    private final void updateState(kotlin.coroutines.Continuation<?> r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.isInstalled$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r0 == 0) goto L2a
            kotlin.KotlinVersion r0 = kotlin.KotlinVersion.CURRENT
            r1 = 1
            r2 = 3
            r3 = 30
            boolean r0 = r0.isAtLeast(r1, r2, r3)
            if (r0 == 0) goto L2a
            boolean r0 = r5 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r0 == 0) goto L22
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r5
            goto L23
        L22:
            r5 = 0
        L23:
            if (r5 != 0) goto L26
            return
        L26:
            r4.updateRunningState(r5, r6)
            return
        L2a:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = r4.owner(r5)
            if (r0 != 0) goto L31
            return
        L31:
            r4.updateState(r0, r5, r6)
            return
    }

    private final void updateState(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r3, kotlin.coroutines.Continuation<?> r4, java.lang.String r5) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L15
            r0.unlock()
            return
        L15:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r3.info     // Catch: java.lang.Throwable -> L20
            r3.updateState$kotlinx_coroutines_core(r5, r4)     // Catch: java.lang.Throwable -> L20
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return
        L20:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    public final void dumpCoroutines(@org.jetbrains.annotations.NotNull java.io.PrintStream r2) {
            r1 = this;
            monitor-enter(r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> La
            r0.dumpCoroutinesSynchronized(r2)     // Catch: java.lang.Throwable -> La
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L61
            boolean r5 = r4.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L55
            java.util.Set r4 = r4.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L61
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r5 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L61
            r5.<init>()     // Catch: java.lang.Throwable -> L61
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.sortedWith(r4, r5)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 r5 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1     // Catch: java.lang.Throwable -> L61
            r5.<init>()     // Catch: java.lang.Throwable -> L61
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.mapNotNull(r4, r5)     // Catch: java.lang.Throwable -> L61
            java.util.List r4 = kotlin.sequences.SequencesKt.toList(r4)     // Catch: java.lang.Throwable -> L61
        L49:
            if (r3 >= r2) goto L51
            int r3 = r3 + 1
            r1.lock()
            goto L49
        L51:
            r0.unlock()
            return r4
        L55:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L61
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r4 = move-exception
        L62:
            if (r3 >= r2) goto L6a
            int r3 = r3 + 1
            r1.lock()
            goto L62
        L6a:
            r0.unlock()
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] dumpCoroutinesInfoAsJsonAndReferences() {
            r12 = this;
            java.util.List r0 = r12.dumpCoroutinesInfo()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L1b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r1.next()
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo r5 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfo) r5
            kotlin.coroutines.CoroutineContext r6 = r5.getContext()
            kotlinx.coroutines.CoroutineName$Key r7 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Element r7 = r6.get(r7)
            kotlinx.coroutines.CoroutineName r7 = (kotlinx.coroutines.CoroutineName) r7
            r8 = 0
            if (r7 != 0) goto L37
            goto L3d
        L37:
            java.lang.String r7 = r7.getName()
            if (r7 != 0) goto L3f
        L3d:
            r7 = r8
            goto L43
        L3f:
            java.lang.String r7 = r12.toStringWithQuotes(r7)
        L43:
            kotlinx.coroutines.CoroutineDispatcher$Key r9 = kotlinx.coroutines.CoroutineDispatcher.Key
            kotlin.coroutines.CoroutineContext$Element r9 = r6.get(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = (kotlinx.coroutines.CoroutineDispatcher) r9
            if (r9 != 0) goto L4f
            r9 = r8
            goto L53
        L4f:
            java.lang.String r9 = r12.toStringWithQuotes(r9)
        L53:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n                {\n                    \"name\": "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = ",\n                    \"id\": "
            r10.append(r7)
            kotlinx.coroutines.CoroutineId$Key r7 = kotlinx.coroutines.CoroutineId.Key
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r7)
            kotlinx.coroutines.CoroutineId r6 = (kotlinx.coroutines.CoroutineId) r6
            if (r6 != 0) goto L70
            goto L78
        L70:
            long r6 = r6.getId()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
        L78:
            r10.append(r8)
            java.lang.String r6 = ",\n                    \"dispatcher\": "
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = ",\n                    \"sequenceNumber\": "
            r10.append(r6)
            long r6 = r5.getSequenceNumber()
            r10.append(r6)
            java.lang.String r6 = ",\n                    \"state\": \""
            r10.append(r6)
            java.lang.String r6 = r5.getState()
            r10.append(r6)
            java.lang.String r6 = "\"\n                } \n                "
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r6 = kotlin.text.StringsKt.trimIndent(r6)
            r4.add(r6)
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = r5.getLastObservedFrame()
            r3.add(r6)
            java.lang.Thread r5 = r5.getLastObservedThread()
            r2.add(r5)
            goto L1b
        Lbb:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r5 = 91
            r10.append(r5)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            java.lang.String r4 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9)
            r10.append(r4)
            r4 = 93
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r5 = 0
            r1[r5] = r4
            r4 = 1
            java.lang.Thread[] r6 = new java.lang.Thread[r5]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r2, r6)
            r1[r4] = r2
            r2 = 2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame[] r4 = new kotlin.coroutines.jvm.internal.CoroutineStackFrame[r5]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.util.Objects.requireNonNull(r3, r6)
            r1[r2] = r3
            r2 = 3
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo[] r3 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfo[r5]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.util.Objects.requireNonNull(r0, r6)
            r1[r2] = r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> dumpDebuggerInfo() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L61
            boolean r5 = r4.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L55
            java.util.Set r4 = r4.getCapturedCoroutines()     // Catch: java.lang.Throwable -> L61
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r5 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch: java.lang.Throwable -> L61
            r5.<init>()     // Catch: java.lang.Throwable -> L61
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.sortedWith(r4, r5)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 r5 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1     // Catch: java.lang.Throwable -> L61
            r5.<init>()     // Catch: java.lang.Throwable -> L61
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.mapNotNull(r4, r5)     // Catch: java.lang.Throwable -> L61
            java.util.List r4 = kotlin.sequences.SequencesKt.toList(r4)     // Catch: java.lang.Throwable -> L61
        L49:
            if (r3 >= r2) goto L51
            int r3 = r3 + 1
            r1.lock()
            goto L49
        L51:
            r0.unlock()
            return r4
        L55:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L61
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r4 = move-exception
        L62:
            if (r3 >= r2) goto L6a
            int r3 = r3 + 1
            r1.lock()
            goto L62
        L6a:
            r0.unlock()
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDump(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.DebugCoroutineInfo r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.StackTraceElement> r3) {
            r1 = this;
            java.lang.String r0 = r2.getState()
            java.lang.Thread r2 = r2.getLastObservedThread()
            java.util.List r2 = r1.enhanceStackTraceWithThreadDumpImpl(r0, r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String enhanceStackTraceWithThreadDumpAsJson(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.DebugCoroutineInfo r7) {
            r6 = this;
            java.util.List r0 = r7.lastObservedStackTrace()
            java.util.List r7 = r6.enhanceStackTraceWithThreadDump(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L11:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            java.lang.StackTraceElement r1 = (java.lang.StackTraceElement) r1
            java.lang.String r2 = "\n                {\n                    \"declaringClass\": \""
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = r1.getClassName()
            r2.append(r3)
            java.lang.String r3 = "\",\n                    \"methodName\": \""
            r2.append(r3)
            java.lang.String r3 = r1.getMethodName()
            r2.append(r3)
            java.lang.String r3 = "\",\n                    \"fileName\": "
            r2.append(r3)
            java.lang.String r3 = r1.getFileName()
            if (r3 != 0) goto L43
            r3 = 0
            goto L47
        L43:
            java.lang.String r3 = r6.toStringWithQuotes(r3)
        L47:
            r2.append(r3)
            java.lang.String r3 = ",\n                    \"lineNumber\": "
            r2.append(r3)
            int r1 = r1.getLineNumber()
            r2.append(r1)
            java.lang.String r1 = "\n                }\n                "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = kotlin.text.StringsKt.trimIndent(r1)
            r0.add(r1)
            goto L11
        L67:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r1 = 91
            r7.append(r1)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 63
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5)
            r7.append(r0)
            r0 = 93
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public final boolean getEnableCreationStackTraces() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces
            return r0
    }

    public final boolean getSanitizeStackTraces() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String hierarchyToString(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r10) {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            boolean r5 = r4.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto Lb3
            java.util.Set r4 = r4.getCapturedCoroutines()     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            r5.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lbf
        L38:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Lbf
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Lbf
            r7 = r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r7 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r7     // Catch: java.lang.Throwable -> Lbf
            kotlin.coroutines.Continuation<T> r7 = r7.delegate     // Catch: java.lang.Throwable -> Lbf
            kotlin.coroutines.CoroutineContext r7 = r7.getContext()     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.Job$Key r8 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lbf
            kotlin.coroutines.CoroutineContext$Element r7 = r7.get(r8)     // Catch: java.lang.Throwable -> Lbf
            if (r7 == 0) goto L55
            r7 = 1
            goto L56
        L55:
            r7 = 0
        L56:
            if (r7 == 0) goto L38
            r5.add(r6)     // Catch: java.lang.Throwable -> Lbf
            goto L38
        L5c:
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5)     // Catch: java.lang.Throwable -> Lbf
            int r4 = kotlin.collections.MapsKt.mapCapacity(r4)     // Catch: java.lang.Throwable -> Lbf
            r6 = 16
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r6)     // Catch: java.lang.Throwable -> Lbf
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> Lbf
        L73:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto L92
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lbf
            r7 = r5
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r7 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r7     // Catch: java.lang.Throwable -> Lbf
            kotlin.coroutines.Continuation<T> r7 = r7.delegate     // Catch: java.lang.Throwable -> Lbf
            kotlin.coroutines.CoroutineContext r7 = r7.getContext()     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.Job r7 = kotlinx.coroutines.JobKt.getJob(r7)     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r5 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r5     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r5 = r5.info     // Catch: java.lang.Throwable -> Lbf
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> Lbf
            goto L73
        L92:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r4.<init>()     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = ""
            r5.build(r10, r6, r4, r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)     // Catch: java.lang.Throwable -> Lbf
        La7:
            if (r3 >= r2) goto Laf
            int r3 = r3 + 1
            r1.lock()
            goto La7
        Laf:
            r0.unlock()
            return r10
        Lb3:
            java.lang.String r10 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lbf
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Lbf
            throw r4     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r10 = move-exception
        Lc0:
            if (r3 >= r2) goto Lc8
            int r3 = r3 + 1
            r1.lock()
            goto Lc0
        Lc8:
            r0.unlock()
            throw r10
    }

    public final void install() {
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L6a
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L6a
            r6 = 1
            int r5 = r5 + r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl.installations = r5     // Catch: java.lang.Throwable -> L6a
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L6a
            if (r5 <= r6) goto L3b
        L2f:
            if (r3 >= r2) goto L37
            int r3 = r3 + 1
            r1.lock()
            goto L2f
        L37:
            r0.unlock()
            return
        L3b:
            r4.startWeakRefCleanerThread()     // Catch: java.lang.Throwable -> L6a
            kotlinx.coroutines.debug.internal.AgentInstallationType r4 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r4.isInstalledStatically$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L52
        L46:
            if (r3 >= r2) goto L4e
            int r3 = r3 + 1
            r1.lock()
            goto L46
        L4e:
            r0.unlock()
            return
        L52:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L57
            goto L5c
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6a
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L6a
        L5c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6a
        L5e:
            if (r3 >= r2) goto L66
            int r3 = r3 + 1
            r1.lock()
            goto L5e
        L66:
            r0.unlock()
            return
        L6a:
            r4 = move-exception
        L6b:
            if (r3 >= r2) goto L73
            int r3 = r3 + 1
            r1.lock()
            goto L6b
        L73:
            r0.unlock()
            throw r4
    }

    public final boolean isInstalled$kotlinx_coroutines_core() {
            r1 = this;
            int r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            r1 = this;
            boolean r0 = r1.isInstalled$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            return r2
        L7:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = r1.owner(r2)
            if (r0 == 0) goto Le
            return r2
        Le:
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces
            if (r0 == 0) goto L20
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.util.List r0 = r1.sanitizeStackTrace(r0)
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r1.toStackTraceFrame(r0)
            goto L21
        L20:
            r0 = 0
        L21:
            kotlin.coroutines.Continuation r2 = r1.createOwner(r2, r0)
            return r2
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "RUNNING"
            r1.updateState(r2, r0)
            return
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "SUSPENDED"
            r1.updateState(r2, r0)
            return
    }

    public final void setEnableCreationStackTraces(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces = r1
            return
    }

    public final void setSanitizeStackTraces(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces = r1
            return
    }

    public final void uninstall() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = 0
        L13:
            r4 = 0
        L14:
            if (r4 >= r2) goto L1c
            int r4 = r4 + 1
            r1.unlock()
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> L86
            boolean r5 = r4.isInstalled$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L7a
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L86
            int r5 = r5 + (-1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.installations = r5     // Catch: java.lang.Throwable -> L86
            int r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.installations     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L41
        L35:
            if (r3 >= r2) goto L3d
            int r3 = r3 + 1
            r1.lock()
            goto L35
        L3d:
            r0.unlock()
            return
        L41:
            r4.stopWeakRefCleanerThread()     // Catch: java.lang.Throwable -> L86
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap     // Catch: java.lang.Throwable -> L86
            r4.clear()     // Catch: java.lang.Throwable -> L86
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache     // Catch: java.lang.Throwable -> L86
            r4.clear()     // Catch: java.lang.Throwable -> L86
            kotlinx.coroutines.debug.internal.AgentInstallationType r4 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE     // Catch: java.lang.Throwable -> L86
            boolean r4 = r4.isInstalledStatically$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L62
        L56:
            if (r3 >= r2) goto L5e
            int r3 = r3 + 1
            r1.lock()
            goto L56
        L5e:
            r0.unlock()
            return
        L62:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L67
            goto L6c
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L86
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L86
        L6c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L86
        L6e:
            if (r3 >= r2) goto L76
            int r3 = r3 + 1
            r1.lock()
            goto L6e
        L76:
            r0.unlock()
            return
        L7a:
            java.lang.String r4 = "Agent was not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L86
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L86
            throw r5     // Catch: java.lang.Throwable -> L86
        L86:
            r4 = move-exception
        L87:
            if (r3 >= r2) goto L8f
            int r3 = r3 + 1
            r1.lock()
            goto L87
        L8f:
            r0.unlock()
            throw r4
    }
}
