package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "defaultMainDelayOptIn", "", "initializeDefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DefaultExecutorKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.Delay DefaultDelay = null;
    private static final boolean defaultMainDelayOptIn = false;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            r1 = 0
            boolean r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            kotlinx.coroutines.DefaultExecutorKt.defaultMainDelayOptIn = r0
            kotlinx.coroutines.Delay r0 = initializeDefaultDelay()
            kotlinx.coroutines.DefaultExecutorKt.DefaultDelay = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.Delay getDefaultDelay() {
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.DefaultDelay
            return r0
    }

    private static final kotlinx.coroutines.Delay initializeDefaultDelay() {
            boolean r0 = kotlinx.coroutines.DefaultExecutorKt.defaultMainDelayOptIn
            if (r0 != 0) goto L7
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            return r0
        L7:
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            boolean r1 = kotlinx.coroutines.internal.MainDispatchersKt.isMissing(r0)
            if (r1 != 0) goto L19
            boolean r1 = r0 instanceof kotlinx.coroutines.Delay
            if (r1 != 0) goto L16
            goto L19
        L16:
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            goto L1b
        L19:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
        L1b:
            return r0
    }
}
