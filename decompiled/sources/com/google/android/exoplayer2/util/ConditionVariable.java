package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public class ConditionVariable {
    private final com.google.android.exoplayer2.util.Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
            r1 = this;
            com.google.android.exoplayer2.util.Clock r0 = com.google.android.exoplayer2.util.Clock.DEFAULT
            r1.<init>(r0)
            return
    }

    public ConditionVariable(com.google.android.exoplayer2.util.Clock r1) {
            r0 = this;
            r0.<init>()
            r0.clock = r1
            return
    }

    public synchronized void block() throws java.lang.InterruptedException {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.isOpen     // Catch: java.lang.Throwable -> Lb
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

    public synchronized boolean block(long r4) throws java.lang.InterruptedException {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            boolean r4 = r3.isOpen     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            return r4
        Lb:
            com.google.android.exoplayer2.util.Clock r0 = r3.clock     // Catch: java.lang.Throwable -> L32
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L32
            long r4 = r4 + r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1a
            r3.block()     // Catch: java.lang.Throwable -> L32
            goto L2e
        L1a:
            boolean r2 = r3.isOpen     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L2e
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L2e
            long r0 = r4 - r0
            r3.wait(r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.exoplayer2.util.Clock r0 = r3.clock     // Catch: java.lang.Throwable -> L32
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L32
            goto L1a
        L2e:
            boolean r4 = r3.isOpen     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            return r4
        L32:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void blockUninterruptible() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
        L2:
            boolean r1 = r2.isOpen     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto Lc
            r2.wait()     // Catch: java.lang.InterruptedException -> La java.lang.Throwable -> L17
            goto L2
        La:
            r0 = 1
            goto L2
        Lc:
            if (r0 == 0) goto L15
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L17
            r0.interrupt()     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r2)
            return
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean close() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isOpen     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r2.isOpen = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean isOpen() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isOpen     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized boolean open() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isOpen     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L8
            r0 = 0
            monitor-exit(r1)
            return r0
        L8:
            r0 = 1
            r1.isOpen = r0     // Catch: java.lang.Throwable -> L10
            r1.notifyAll()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
