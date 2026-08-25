package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
class ConditionVariable {
    private volatile boolean mCondition;

    public ConditionVariable() {
            r0 = this;
            r0.<init>()
            return
    }

    public final synchronized void block() throws java.lang.InterruptedException {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.mCondition     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L9
            r1.wait()     // Catch: java.lang.Throwable -> Lb
            goto L1
        L9:
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.mCondition = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void open() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mCondition     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r2.mCondition = r1     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lb
            r2.notify()     // Catch: java.lang.Throwable -> Ld
        Lb:
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void set(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L13
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1.mCondition     // Catch: java.lang.Throwable -> L10
            r0 = 1
            r1.mCondition = r0     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Le
            r1.notify()     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            goto L16
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r2     // Catch: java.lang.Throwable -> L18
        L13:
            r1.close()     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r1)
            return
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
