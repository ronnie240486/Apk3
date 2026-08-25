package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/scheduling/NanoTimeSource;", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "()V", "nanoTime", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NanoTimeSource extends kotlinx.coroutines.scheduling.SchedulerTimeSource {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.NanoTimeSource INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.NanoTimeSource r0 = new kotlinx.coroutines.scheduling.NanoTimeSource
            r0.<init>()
            kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE = r0
            return
    }

    private NanoTimeSource() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerTimeSource
    public long nanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }
}
