package kotlinx.coroutines.debug.internal;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1, reason: invalid class name */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$lambda12$$inlined$sortedBy$1<T> implements java.util.Comparator {
    public DebugProbesImpl$dumpCoroutinesInfoImpl$lambda12$$inlined$sortedBy$1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r3, T r4) {
            r2 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r3 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r3
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r3.info
            long r0 = r3.sequenceNumber
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r4 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r4
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r4 = r4.info
            long r0 = r4.sequenceNumber
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            int r3 = kotlin.comparisons.ComparisonsKt.compareValues(r3, r4)
            return r3
    }
}
