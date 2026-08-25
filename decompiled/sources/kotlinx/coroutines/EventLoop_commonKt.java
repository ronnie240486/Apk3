package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000*\u001e\b\u0002\u0010\u0012\u001a\u0004\b\u0000\u0010\u0013\"\b\u0012\u0004\u0012\u0002H\u00130\u00142\b\u0012\u0004\u0012\u0002H\u00130\u0014¨\u0006\u0015"}, d2 = {"CLOSED_EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "getCLOSED_EMPTY$annotations", "()V", "DISPOSED_TASK", "getDISPOSED_TASK$annotations", "MAX_DELAY_NS", "", "MAX_MS", "MS_TO_NS", "SCHEDULE_COMPLETED", "", "SCHEDULE_DISPOSED", "SCHEDULE_OK", "delayNanosToMillis", "timeNanos", "delayToNanos", "timeMillis", "Queue", "T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EventLoop_commonKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol CLOSED_EMPTY = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol DISPOSED_TASK = null;
    private static final long MAX_DELAY_NS = 4611686018427387903L;
    private static final long MAX_MS = 9223372036854L;
    private static final long MS_TO_NS = 1000000;
    private static final int SCHEDULE_COMPLETED = 1;
    private static final int SCHEDULE_DISPOSED = 2;
    private static final int SCHEDULE_OK = 0;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REMOVED_TASK"
            r0.<init>(r1)
            kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSED_EMPTY"
            r0.<init>(r1)
            kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED_EMPTY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getDISPOSED_TASK$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK
            return r0
    }

    public static final long delayNanosToMillis(long r2) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            return r2
    }

    public static final long delayToNanos(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L1b
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1b
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r3
        L1b:
            return r0
    }

    private static /* synthetic */ void getCLOSED_EMPTY$annotations() {
            return
    }

    private static /* synthetic */ void getDISPOSED_TASK$annotations() {
            return
    }
}
