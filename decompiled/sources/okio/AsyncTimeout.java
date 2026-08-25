package okio;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "", "now", "remainingNanos", "", "enter", "", "exit", "Lokio/Sink;", "sink", "Lokio/Source;", "source", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "inQueue", "Z", "next", "Lokio/AsyncTimeout;", "timeoutAt", "J", "<init>", "()V", "Companion", "Watchdog", "okio"}, k = 1, mv = {1, 4, 1})
public class AsyncTimeout extends okio.Timeout {

    @org.jetbrains.annotations.NotNull
    public static final okio.AsyncTimeout.Companion Companion = null;
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static okio.AsyncTimeout head;
    private boolean inQueue;
    private okio.AsyncTimeout next;
    private long timeoutAt;

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", "", "head", "Lokio/AsyncTimeout;", "awaitTimeout", "awaitTimeout$okio", "cancelScheduledTimeout", "", "node", "scheduleTimeout", "", "timeoutNanos", "hasDeadline", "okio"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$cancelScheduledTimeout(okio.AsyncTimeout.Companion r0, okio.AsyncTimeout r1) {
                boolean r0 = r0.cancelScheduledTimeout(r1)
                return r0
        }

        public static final /* synthetic */ void access$scheduleTimeout(okio.AsyncTimeout.Companion r0, okio.AsyncTimeout r1, long r2, boolean r4) {
                r0.scheduleTimeout(r1, r2, r4)
                return
        }

        private final boolean cancelScheduledTimeout(okio.AsyncTimeout r5) {
                r4 = this;
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)
                boolean r1 = okio.AsyncTimeout.access$getInQueue$p(r5)     // Catch: java.lang.Throwable -> L30
                r2 = 0
                if (r1 != 0) goto Lc
                monitor-exit(r0)
                return r2
            Lc:
                okio.AsyncTimeout.access$setInQueue$p(r5, r2)     // Catch: java.lang.Throwable -> L30
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L30
            L13:
                if (r1 == 0) goto L2d
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r1)     // Catch: java.lang.Throwable -> L30
                if (r3 != r5) goto L28
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r5)     // Catch: java.lang.Throwable -> L30
                okio.AsyncTimeout.access$setNext$p(r1, r3)     // Catch: java.lang.Throwable -> L30
                r1 = 0
                okio.AsyncTimeout.access$setNext$p(r5, r1)     // Catch: java.lang.Throwable -> L30
                monitor-exit(r0)
                return r2
            L28:
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getNext$p(r1)     // Catch: java.lang.Throwable -> L30
                goto L13
            L2d:
                r5 = 1
                monitor-exit(r0)
                return r5
            L30:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
        }

        private final void scheduleTimeout(okio.AsyncTimeout r7, long r8, boolean r10) {
                r6 = this;
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)
                boolean r1 = okio.AsyncTimeout.access$getInQueue$p(r7)     // Catch: java.lang.Throwable -> La0
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L94
                okio.AsyncTimeout.access$setInQueue$p(r7, r2)     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> La0
                if (r1 != 0) goto L24
                okio.AsyncTimeout r1 = new okio.AsyncTimeout     // Catch: java.lang.Throwable -> La0
                r1.<init>()     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout.access$setHead$cp(r1)     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout$Watchdog r1 = new okio.AsyncTimeout$Watchdog     // Catch: java.lang.Throwable -> La0
                r1.<init>()     // Catch: java.lang.Throwable -> La0
                r1.start()     // Catch: java.lang.Throwable -> La0
            L24:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La0
                r3 = 0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 == 0) goto L3e
                if (r10 == 0) goto L3e
                long r3 = r7.deadlineNanoTime()     // Catch: java.lang.Throwable -> La0
                long r3 = r3 - r1
                long r8 = java.lang.Math.min(r8, r3)     // Catch: java.lang.Throwable -> La0
                long r8 = r8 + r1
                okio.AsyncTimeout.access$setTimeoutAt$p(r7, r8)     // Catch: java.lang.Throwable -> La0
                goto L4e
            L3e:
                if (r5 == 0) goto L45
                long r8 = r8 + r1
                okio.AsyncTimeout.access$setTimeoutAt$p(r7, r8)     // Catch: java.lang.Throwable -> La0
                goto L4e
            L45:
                if (r10 == 0) goto L8e
                long r8 = r7.deadlineNanoTime()     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout.access$setTimeoutAt$p(r7, r8)     // Catch: java.lang.Throwable -> La0
            L4e:
                long r8 = okio.AsyncTimeout.access$remainingNanos(r7, r1)     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout r10 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> La0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.lang.Throwable -> La0
            L59:
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> La0
                if (r3 == 0) goto L77
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> La0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> La0
                long r3 = okio.AsyncTimeout.access$remainingNanos(r3, r1)     // Catch: java.lang.Throwable -> La0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L6f
                goto L77
            L6f:
                okio.AsyncTimeout r10 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> La0
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.lang.Throwable -> La0
                goto L59
            L77:
                okio.AsyncTimeout r8 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout.access$setNext$p(r7, r8)     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout.access$setNext$p(r10, r7)     // Catch: java.lang.Throwable -> La0
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> La0
                if (r10 != r7) goto L8a
                r0.notify()     // Catch: java.lang.Throwable -> La0
            L8a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
                monitor-exit(r0)
                return
            L8e:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> La0
                r7.<init>()     // Catch: java.lang.Throwable -> La0
                throw r7     // Catch: java.lang.Throwable -> La0
            L94:
                java.lang.String r7 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La0
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La0
                r8.<init>(r7)     // Catch: java.lang.Throwable -> La0
                throw r8     // Catch: java.lang.Throwable -> La0
            La0:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
        }

        @org.jetbrains.annotations.Nullable
        public final okio.AsyncTimeout awaitTimeout$okio() throws java.lang.InterruptedException {
                r9 = this;
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getNext$p(r1)
                r2 = 0
                if (r1 != 0) goto L3a
                long r3 = java.lang.System.nanoTime()
                long r5 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp()
                r0.wait(r5)
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getHead$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getNext$p(r0)
                if (r0 != 0) goto L39
                long r0 = java.lang.System.nanoTime()
                long r0 = r0 - r3
                long r3 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp()
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L39
                okio.AsyncTimeout r2 = okio.AsyncTimeout.access$getHead$cp()
            L39:
                return r2
            L3a:
                long r3 = java.lang.System.nanoTime()
                long r3 = okio.AsyncTimeout.access$remainingNanos(r1, r3)
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L55
                r5 = 1000000(0xf4240, double:4.940656E-318)
                long r7 = r3 / r5
                long r5 = r5 * r7
                long r3 = r3 - r5
                int r1 = (int) r3
                r0.wait(r7, r1)
                return r2
            L55:
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getHead$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r1)
                okio.AsyncTimeout.access$setNext$p(r0, r3)
                okio.AsyncTimeout.access$setNext$p(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "okio"}, k = 1, mv = {1, 4, 1})
    public static final class Watchdog extends java.lang.Thread {
        public Watchdog() {
                r1 = this;
                java.lang.String r0 = "Okio Watchdog"
                r1.<init>(r0)
                r0 = 1
                r1.setDaemon(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.AsyncTimeout$Companion r1 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> L1e
                okio.AsyncTimeout r1 = r1.awaitTimeout$okio()     // Catch: java.lang.Throwable -> L1e
                okio.AsyncTimeout r2 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L1e
                if (r1 != r2) goto L15
                r1 = 0
                okio.AsyncTimeout.access$setHead$cp(r1)     // Catch: java.lang.Throwable -> L1e
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                return
            L15:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1e
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                if (r1 == 0) goto L0
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1e:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
        }
    }



    static {
            okio.AsyncTimeout$Companion r0 = new okio.AsyncTimeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.AsyncTimeout.Companion = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toMillis(r1)
            okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            okio.AsyncTimeout.IDLE_TIMEOUT_NANOS = r0
            return
    }

    public AsyncTimeout() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okio.AsyncTimeout access$getHead$cp() {
            okio.AsyncTimeout r0 = okio.AsyncTimeout.head
            return r0
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
            long r0 = okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS
            return r0
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
            long r0 = okio.AsyncTimeout.IDLE_TIMEOUT_NANOS
            return r0
    }

    public static final /* synthetic */ boolean access$getInQueue$p(okio.AsyncTimeout r0) {
            boolean r0 = r0.inQueue
            return r0
    }

    public static final /* synthetic */ okio.AsyncTimeout access$getNext$p(okio.AsyncTimeout r0) {
            okio.AsyncTimeout r0 = r0.next
            return r0
    }

    public static final /* synthetic */ long access$getTimeoutAt$p(okio.AsyncTimeout r2) {
            long r0 = r2.timeoutAt
            return r0
    }

    public static final /* synthetic */ long access$remainingNanos(okio.AsyncTimeout r0, long r1) {
            long r0 = r0.remainingNanos(r1)
            return r0
    }

    public static final /* synthetic */ void access$setHead$cp(okio.AsyncTimeout r0) {
            okio.AsyncTimeout.head = r0
            return
    }

    public static final /* synthetic */ void access$setInQueue$p(okio.AsyncTimeout r0, boolean r1) {
            r0.inQueue = r1
            return
    }

    public static final /* synthetic */ void access$setNext$p(okio.AsyncTimeout r0, okio.AsyncTimeout r1) {
            r0.next = r1
            return
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(okio.AsyncTimeout r0, long r1) {
            r0.timeoutAt = r1
            return
    }

    private final long remainingNanos(long r3) {
            r2 = this;
            long r0 = r2.timeoutAt
            long r0 = r0 - r3
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public final java.io.IOException access$newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r1) {
            r0 = this;
            java.io.IOException r1 = r0.newTimeoutException(r1)
            return r1
    }

    public final void enter() {
            r6 = this;
            long r0 = r6.timeoutNanos()
            boolean r2 = r6.hasDeadline()
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            okio.AsyncTimeout$Companion r3 = okio.AsyncTimeout.Companion
            okio.AsyncTimeout.Companion.access$scheduleTimeout(r3, r6, r0, r2)
            return
    }

    public final boolean exit() {
            r1 = this;
            okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
            boolean r0 = okio.AsyncTimeout.Companion.access$cancelScheduledTimeout(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.io.IOException newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Ld
            r0.initCause(r3)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.AsyncTimeout$sink$1 r0 = new okio.AsyncTimeout$sink$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.AsyncTimeout$source$1 r0 = new okio.AsyncTimeout$source$1
            r0.<init>(r1, r2)
            return r0
    }

    public void timedOut() {
            r0 = this;
            return
    }

    public final <T> T withTimeout(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.enter()
            r0 = 1
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r1 = r2.exit()
            if (r1 != 0) goto L1a
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r3
        L1a:
            r3 = 0
            java.io.IOException r3 = r2.access$newTimeoutException(r3)
            throw r3
        L20:
            r3 = move-exception
            goto L2f
        L22:
            r3 = move-exception
            boolean r1 = r2.exit()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L2a
            goto L2e
        L2a:
            java.io.IOException r3 = r2.access$newTimeoutException(r3)     // Catch: java.lang.Throwable -> L20
        L2e:
            throw r3     // Catch: java.lang.Throwable -> L20
        L2f:
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r1 = r2.exit()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r3
    }
}
