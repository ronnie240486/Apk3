package io.realm.internal.async;

/* JADX INFO: loaded from: classes2.dex */
public final class RealmAsyncTaskImpl implements io.realm.RealmAsyncTask {
    private volatile boolean isCancelled;
    private final java.util.concurrent.Future<?> pendingTask;
    private final java.util.concurrent.ThreadPoolExecutor service;

    public RealmAsyncTaskImpl(java.util.concurrent.Future<?> r2, java.util.concurrent.ThreadPoolExecutor r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isCancelled = r0
            r1.pendingTask = r2
            r1.service = r3
            return
    }

    @Override // io.realm.RealmAsyncTask
    public void cancel() {
            r2 = this;
            java.util.concurrent.Future<?> r0 = r2.pendingTask
            r1 = 1
            r0.cancel(r1)
            r2.isCancelled = r1
            java.util.concurrent.ThreadPoolExecutor r0 = r2.service
            java.util.concurrent.BlockingQueue r0 = r0.getQueue()
            java.util.concurrent.Future<?> r1 = r2.pendingTask
            r0.remove(r1)
            return
    }

    @Override // io.realm.RealmAsyncTask
    public boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.isCancelled
            return r0
    }
}
