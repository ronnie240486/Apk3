package kotlinx.coroutines;

/* JADX INFO: compiled from: AbstractTimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0006\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000e\u001a\u00020\nH\u0081\b\u001a\t\u0010\u000f\u001a\u00020\nH\u0081\b\u001a\t\u0010\u0010\u001a\u00020\nH\u0081\b\u001a\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0081\b\u001a\t\u0010\u0014\u001a\u00020\nH\u0081\b\u001a\u0019\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0081\b\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0019"}, d2 = {"timeSource", "Lkotlinx/coroutines/AbstractTimeSource;", "getTimeSource", "()Lkotlinx/coroutines/AbstractTimeSource;", "setTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "currentTimeMillis", "", "nanoTime", "parkNanos", "", "blocker", "", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AbstractTimeSourceKt {

    @org.jetbrains.annotations.Nullable
    private static kotlinx.coroutines.AbstractTimeSource timeSource;

    @kotlin.internal.InlineOnly
    private static final long currentTimeMillis() {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L8
            r0 = 0
            goto L10
        L8:
            long r0 = r0.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L10:
            if (r0 != 0) goto L17
            long r0 = java.lang.System.currentTimeMillis()
            goto L1b
        L17:
            long r0 = r0.longValue()
        L1b:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.AbstractTimeSource getTimeSource() {
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.timeSource
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final long nanoTime() {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L8
            r0 = 0
            goto L10
        L8:
            long r0 = r0.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L10:
            if (r0 != 0) goto L17
            long r0 = java.lang.System.nanoTime()
            goto L1b
        L17:
            long r0 = r0.longValue()
        L1b:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final void parkNanos(java.lang.Object r1, long r2) {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0.parkNanos(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)
        L12:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void registerTimeLoopThread() {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.registerTimeLoopThread()
        La:
            return
    }

    public static final void setTimeSource(@org.jetbrains.annotations.Nullable kotlinx.coroutines.AbstractTimeSource r0) {
            kotlinx.coroutines.AbstractTimeSourceKt.timeSource = r0
            return
    }

    @kotlin.internal.InlineOnly
    private static final void trackTask() {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.trackTask()
        La:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void unTrackTask() {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.unTrackTask()
        La:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void unpark(java.lang.Thread r1) {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0.unpark(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L12:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void unregisterTimeLoopThread() {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.unregisterTimeLoopThread()
        La:
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Runnable wrapTask(java.lang.Runnable r1) {
            kotlinx.coroutines.AbstractTimeSource r0 = getTimeSource()
            if (r0 != 0) goto L7
            goto Lf
        L7:
            java.lang.Runnable r0 = r0.wrapTask(r1)
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = r0
        Lf:
            return r1
    }
}
