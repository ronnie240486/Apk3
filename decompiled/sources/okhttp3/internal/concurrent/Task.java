package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\fH&J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "name", "", "cancelable", "", "(Ljava/lang/String;Z)V", "getCancelable", "()Z", "getName", "()Ljava/lang/String;", "nextExecuteNanoTime", "", "getNextExecuteNanoTime$okhttp", "()J", "setNextExecuteNanoTime$okhttp", "(J)V", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "", "initQueue$okhttp", "runOnce", "toString", "okhttp"}, k = 1, mv = {1, 4, 1})
public abstract class Task {
    private final boolean cancelable;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private long nextExecuteNanoTime;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.concurrent.TaskQueue queue;

    public Task(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.name = r2
            r1.cancelable = r3
            r2 = -1
            r1.nextExecuteNanoTime = r2
            return
    }

    public /* synthetic */ Task(java.lang.String r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2)
            return
    }

    public final boolean getCancelable() {
            r1 = this;
            boolean r0 = r1.cancelable
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final long getNextExecuteNanoTime$okhttp() {
            r2 = this;
            long r0 = r2.nextExecuteNanoTime
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.concurrent.TaskQueue getQueue$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r1.queue
            return r0
    }

    public final void initQueue$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r2) {
            r1 = this;
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r1.queue
            if (r0 != r2) goto La
            return
        La:
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            r1.queue = r2
            return
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "task is in multiple queues"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long r1) {
            r0 = this;
            r0.nextExecuteNanoTime = r1
            return
    }

    public final void setQueue$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.concurrent.TaskQueue r1) {
            r0 = this;
            r0.queue = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
