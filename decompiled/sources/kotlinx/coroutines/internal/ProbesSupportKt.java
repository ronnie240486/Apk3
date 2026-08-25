package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ProbesSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0080\b¨\u0006\u0004"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ProbesSupportKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r0) {
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r0)
            return r0
    }
}
