package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StackTraceRecoveryKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final java.lang.String baseContinuationImplClassName = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final java.lang.String stackTraceRecoveryClassName = null;

    static {
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L11
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)     // Catch: java.lang.Throwable -> L11
            goto L1c
        L11:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
        L1c:
            java.lang.Throwable r2 = kotlin.Result.m336exceptionOrNullimpl(r1)
            if (r2 != 0) goto L23
            r0 = r1
        L23:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L34
            java.lang.Class<kotlinx.coroutines.internal.StackTraceRecoveryKt> r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)     // Catch: java.lang.Throwable -> L34
            goto L3f
        L34:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
        L3f:
            java.lang.Throwable r1 = kotlin.Result.m336exceptionOrNullimpl(r0)
            if (r1 != 0) goto L46
            goto L48
        L46:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L48:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName = r0
            return
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
            return
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
            return
    }

    public static final /* synthetic */ java.lang.Throwable access$recoverFromStackFrame(java.lang.Throwable r0, kotlin.coroutines.jvm.internal.CoroutineStackFrame r1) {
            java.lang.Throwable r0 = recoverFromStackFrame(r0, r1)
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final java.lang.StackTraceElement artificialFrame(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            java.lang.String r1 = "\b\b\b("
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r1 = "\b"
            r2 = -1
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.Pair<E, java.lang.StackTraceElement[]> causeAndStacktrace(E r6) {
            java.lang.Throwable r0 = r6.getCause()
            r1 = 0
            if (r0 == 0) goto L38
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r6.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L38
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()
            int r3 = r2.length
            r4 = 0
        L1b:
            if (r4 >= r3) goto L29
            r5 = r2[r4]
            int r4 = r4 + 1
            boolean r5 = isArtificial(r5)
            if (r5 == 0) goto L1b
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            if (r3 == 0) goto L31
            kotlin.Pair r6 = kotlin.TuplesKt.to(r0, r2)
            goto L3e
        L31:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r0)
            goto L3e
        L38:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r0)
        L3e:
            return r6
    }

    private static final <E extends java.lang.Throwable> E createFinalException(E r6, E r7, java.util.ArrayDeque<java.lang.StackTraceElement> r8) {
            java.lang.String r0 = "Coroutine boundary"
            java.lang.StackTraceElement r0 = artificialFrame(r0)
            r8.addFirst(r0)
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            java.lang.String r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName
            int r0 = frameIndex(r6, r0)
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L28
            java.lang.StackTraceElement[] r6 = new java.lang.StackTraceElement[r1]
            java.lang.Object[] r6 = r8.toArray(r6)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r6, r8)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r7.setStackTrace(r6)
            return r7
        L28:
            int r2 = r8.size()
            int r2 = r2 + r0
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r2]
            r3 = 0
        L30:
            if (r3 >= r0) goto L3a
            int r4 = r3 + 1
            r5 = r6[r3]
            r2[r3] = r5
            r3 = r4
            goto L30
        L3a:
            java.util.Iterator r6 = r8.iterator()
        L3e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L51
            int r8 = r1 + 1
            java.lang.Object r3 = r6.next()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            int r1 = r1 + r0
            r2[r1] = r3
            r1 = r8
            goto L3e
        L51:
            r7.setStackTrace(r2)
            return r7
    }

    private static final java.util.ArrayDeque<java.lang.StackTraceElement> createStackTrace(kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 != 0) goto Lc
            goto Lf
        Lc:
            r0.add(r1)
        Lf:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getCallerFrame()
            if (r2 != 0) goto L16
            return r0
        L16:
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 != 0) goto L1d
            goto Lf
        L1d:
            r0.add(r1)
            goto Lf
    }

    private static final boolean elementWiseEquals(java.lang.StackTraceElement r2, java.lang.StackTraceElement r3) {
            int r0 = r2.getLineNumber()
            int r1 = r3.getLineNumber()
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.getMethodName()
            java.lang.String r1 = r3.getMethodName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getFileName()
            java.lang.String r1 = r3.getFileName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r2 = r2.getClassName()
            java.lang.String r3 = r3.getClassName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            return r2
    }

    private static final int frameIndex(java.lang.StackTraceElement[] r4, java.lang.String r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L15
            int r2 = r1 + 1
            r3 = r4[r1]
            java.lang.String r3 = r3.getClassName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L13
            goto L16
        L13:
            r1 = r2
            goto L2
        L15:
            r1 = -1
        L16:
            return r1
    }

    public static final void initCause(@org.jetbrains.annotations.NotNull java.lang.Throwable r0, @org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0.initCause(r1)
            return
    }

    public static final boolean isArtificial(@org.jetbrains.annotations.NotNull java.lang.StackTraceElement r1) {
            java.lang.String r1 = r1.getClassName()
            java.lang.String r0 = "\b\b\b"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r1, r0)
            return r1
    }

    private static final void mergeRecoveredTraces(java.lang.StackTraceElement[] r5, java.util.ArrayDeque<java.lang.StackTraceElement> r6) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L11
            int r2 = r1 + 1
            r3 = r5[r1]
            boolean r3 = isArtificial(r3)
            if (r3 == 0) goto Lf
            goto L12
        Lf:
            r1 = r2
            goto L2
        L11:
            r1 = -1
        L12:
            int r1 = r1 + 1
            int r0 = r5.length
            int r0 = r0 + (-1)
            if (r1 > r0) goto L36
        L19:
            int r2 = r0 + (-1)
            r3 = r5[r0]
            java.lang.Object r4 = r6.getLast()
            java.lang.StackTraceElement r4 = (java.lang.StackTraceElement) r4
            boolean r3 = elementWiseEquals(r3, r4)
            if (r3 == 0) goto L2c
            r6.removeLast()
        L2c:
            r3 = r5[r0]
            r6.addFirst(r3)
            if (r0 != r1) goto L34
            goto L36
        L34:
            r0 = r2
            goto L19
        L36:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object recoverAndThrow(@org.jetbrains.annotations.NotNull java.lang.Throwable r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r1) {
            throw r0
    }

    private static final java.lang.Object recoverAndThrow$$forInline(java.lang.Throwable r0, kotlin.coroutines.Continuation<?> r1) {
            throw r0
    }

    private static final <E extends java.lang.Throwable> E recoverFromStackFrame(E r4, kotlin.coroutines.jvm.internal.CoroutineStackFrame r5) {
            kotlin.Pair r0 = causeAndStacktrace(r4)
            java.lang.Object r1 = r0.component1()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.component2()
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            java.lang.Throwable r2 = tryCopyAndVerify(r1)
            if (r2 != 0) goto L17
            return r4
        L17:
            java.util.ArrayDeque r5 = createStackTrace(r5)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L22
            return r4
        L22:
            if (r1 == r4) goto L27
            mergeRecoveredTraces(r0, r5)
        L27:
            java.lang.Throwable r4 = createFinalException(r1, r2, r5)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E recoverStackTrace(@org.jetbrains.annotations.NotNull E r0) {
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E recoverStackTrace(@org.jetbrains.annotations.NotNull E r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r1) {
            return r0
    }

    private static final <E extends java.lang.Throwable> E sanitizeStackTrace(E r7) {
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            int r1 = r0.length
            java.lang.String r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName
            int r2 = frameIndex(r0, r2)
            int r3 = r2 + 1
            java.lang.String r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName
            int r4 = frameIndex(r0, r4)
            r5 = 0
            r6 = -1
            if (r4 != r6) goto L19
            r4 = 0
            goto L1b
        L19:
            int r4 = r1 - r4
        L1b:
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r1]
        L1f:
            if (r5 >= r1) goto L35
            if (r5 != 0) goto L2a
            java.lang.String r4 = "Coroutine boundary"
            java.lang.StackTraceElement r4 = artificialFrame(r4)
            goto L30
        L2a:
            int r4 = r3 + r5
            int r4 = r4 + (-1)
            r4 = r0[r4]
        L30:
            r2[r5] = r4
            int r5 = r5 + 1
            goto L1f
        L35:
            r7.setStackTrace(r2)
            return r7
    }

    private static final <E extends java.lang.Throwable> E tryCopyAndVerify(E r3) {
            java.lang.Throwable r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r3 instanceof kotlinx.coroutines.CopyableThrowable
            if (r2 != 0) goto L1b
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = r3.getMessage()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 != 0) goto L1b
            return r1
        L1b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E unwrap(@org.jetbrains.annotations.NotNull E r0) {
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E extends java.lang.Throwable> E unwrapImpl(@org.jetbrains.annotations.NotNull E r6) {
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L2c
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = r6.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L15
            goto L2c
        L15:
            java.lang.StackTraceElement[] r1 = r6.getStackTrace()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L1c:
            if (r4 >= r2) goto L29
            r5 = r1[r4]
            int r4 = r4 + 1
            boolean r5 = isArtificial(r5)
            if (r5 == 0) goto L1c
            r3 = 1
        L29:
            if (r3 == 0) goto L2c
            return r0
        L2c:
            return r6
    }
}
