package io.realm.internal.async;

/* JADX INFO: loaded from: classes2.dex */
public class BgPriorityCallable<T> implements java.util.concurrent.Callable<T> {
    private final java.util.concurrent.Callable<T> callable;

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
            r1 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            java.util.concurrent.Callable<T> r0 = r1.callable
            java.lang.Object r0 = r0.call()
            return r0
    }
}
