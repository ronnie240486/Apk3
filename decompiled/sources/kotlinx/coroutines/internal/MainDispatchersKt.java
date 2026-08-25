package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\b\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\u0003*\u00020\u000eH\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0082D¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"FAST_SERVICE_LOADER_PROPERTY_NAME", "", "SUPPORT_MISSING", "", "getSUPPORT_MISSING$annotations", "()V", "createMissingDispatcher", "Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "cause", "", "errorHint", "throwMissingMainDispatcherException", "", "isMissing", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "tryCreateDispatcher", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "factories", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MainDispatchersKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String FAST_SERVICE_LOADER_PROPERTY_NAME = "kotlinx.coroutines.fast.service.loader";
    private static final boolean SUPPORT_MISSING = true;

    private static final kotlinx.coroutines.internal.MissingMainCoroutineDispatcher createMissingDispatcher(java.lang.Throwable r1, java.lang.String r2) {
            boolean r0 = kotlinx.coroutines.internal.MainDispatchersKt.SUPPORT_MISSING
            if (r0 == 0) goto La
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = new kotlinx.coroutines.internal.MissingMainCoroutineDispatcher
            r0.<init>(r1, r2)
            return r0
        La:
            if (r1 != 0) goto L15
            throwMissingMainDispatcherException()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L15:
            throw r1
    }

    public static /* synthetic */ kotlinx.coroutines.internal.MissingMainCoroutineDispatcher createMissingDispatcher$default(java.lang.Throwable r1, int r2) {
            r2 = r2 & 1
            r0 = 0
            if (r2 == 0) goto L6
            r1 = r0
        L6:
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r1 = createMissingDispatcher(r1, r0)
            return r1
    }

    private static /* synthetic */ void getSUPPORT_MISSING$annotations() {
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final boolean isMissing(@org.jetbrains.annotations.NotNull kotlinx.coroutines.MainCoroutineDispatcher r0) {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.MissingMainCoroutineDispatcher
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void throwMissingMainDispatcherException() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            throw r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.MainCoroutineDispatcher tryCreateDispatcher(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.MainDispatcherFactory r0, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r1) {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.createDispatcher(r1)     // Catch: java.lang.Throwable -> L5
            goto Le
        L5:
            r1 = move-exception
            java.lang.String r0 = r0.hintOnError()
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = createMissingDispatcher(r1, r0)
        Le:
            return r0
    }
}
