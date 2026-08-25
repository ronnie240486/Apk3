package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Synchronized.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0087\b¢\u0006\u0002\u0010\u0007*\u0010\b\u0007\u0010\b\"\u00020\u00032\u00020\u0003B\u0002\b\t¨\u0006\n"}, d2 = {"synchronized", "T", "lock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "SynchronizedObject", "Lkotlinx/coroutines/InternalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SynchronizedKt {
    @kotlinx.coroutines.InternalCoroutinesApi
    public static /* synthetic */ void SynchronizedObject$annotations() {
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m1877synchronized(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> Le
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r2
        Le:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }
}
