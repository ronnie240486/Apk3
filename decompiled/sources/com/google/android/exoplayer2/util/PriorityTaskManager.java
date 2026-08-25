package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class PriorityTaskManager {
    private int highestPriority;
    private final java.lang.Object lock;
    private final java.util.PriorityQueue<java.lang.Integer> queue;

    /* JADX INFO: loaded from: classes.dex */
    public static class PriorityTooLowException extends java.io.IOException {
        public PriorityTooLowException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Priority too low [priority="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", highest="
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = "]"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    public PriorityTaskManager() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.lock = r0
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            java.util.Comparator r1 = java.util.Collections.reverseOrder()
            r2 = 10
            r0.<init>(r2, r1)
            r3.queue = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.highestPriority = r0
            return
    }

    public void add(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            java.util.PriorityQueue<java.lang.Integer> r1 = r3.queue     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L16
            r1.add(r2)     // Catch: java.lang.Throwable -> L16
            int r1 = r3.highestPriority     // Catch: java.lang.Throwable -> L16
            int r4 = java.lang.Math.max(r1, r4)     // Catch: java.lang.Throwable -> L16
            r3.highestPriority = r4     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    public void proceed(int r3) throws java.lang.InterruptedException {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L3:
            int r1 = r2.highestPriority     // Catch: java.lang.Throwable -> Lf
            if (r1 == r3) goto Ld
            java.lang.Object r1 = r2.lock     // Catch: java.lang.Throwable -> Lf
            r1.wait()     // Catch: java.lang.Throwable -> Lf
            goto L3
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public boolean proceedNonBlocking(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            int r1 = r2.highestPriority     // Catch: java.lang.Throwable -> Lc
            if (r1 != r3) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r3
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public void proceedOrThrow(int r4) throws com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            int r1 = r3.highestPriority     // Catch: java.lang.Throwable -> L11
            if (r1 != r4) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L9:
            com.google.android.exoplayer2.util.PriorityTaskManager$PriorityTooLowException r1 = new com.google.android.exoplayer2.util.PriorityTaskManager$PriorityTooLowException     // Catch: java.lang.Throwable -> L11
            int r2 = r3.highestPriority     // Catch: java.lang.Throwable -> L11
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L11:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public void remove(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.PriorityQueue<java.lang.Integer> r1 = r2.queue     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L32
            r1.remove(r3)     // Catch: java.lang.Throwable -> L32
            java.util.PriorityQueue<java.lang.Integer> r3 = r2.queue     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L29
        L17:
            java.util.PriorityQueue<java.lang.Integer> r3 = r2.queue     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L32
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L32
        L29:
            r2.highestPriority = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r2.lock     // Catch: java.lang.Throwable -> L32
            r3.notifyAll()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }
}
