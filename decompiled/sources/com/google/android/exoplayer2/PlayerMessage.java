package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerMessage {
    private final com.google.android.exoplayer2.util.Clock clock;
    private boolean deleteAfterDelivery;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private android.os.Looper looper;
    private int mediaItemIndex;

    @androidx.annotation.Nullable
    private java.lang.Object payload;
    private long positionMs;
    private final com.google.android.exoplayer2.PlayerMessage.Sender sender;
    private final com.google.android.exoplayer2.PlayerMessage.Target target;
    private final com.google.android.exoplayer2.Timeline timeline;
    private int type;

    /* JADX INFO: loaded from: classes.dex */
    public interface Sender {
        void sendMessage(com.google.android.exoplayer2.PlayerMessage r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Target {
        void handleMessage(int r1, @androidx.annotation.Nullable java.lang.Object r2) throws com.google.android.exoplayer2.ExoPlaybackException;
    }

    public PlayerMessage(com.google.android.exoplayer2.PlayerMessage.Sender r1, com.google.android.exoplayer2.PlayerMessage.Target r2, com.google.android.exoplayer2.Timeline r3, int r4, com.google.android.exoplayer2.util.Clock r5, android.os.Looper r6) {
            r0 = this;
            r0.<init>()
            r0.sender = r1
            r0.target = r2
            r0.timeline = r3
            r0.looper = r6
            r0.clock = r5
            r0.mediaItemIndex = r4
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.positionMs = r1
            r1 = 1
            r0.deleteAfterDelivery = r1
            return
    }

    public synchronized boolean blockUntilDelivered() throws java.lang.InterruptedException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isSent     // Catch: java.lang.Throwable -> L24
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L24
            android.os.Looper r0 = r2.looper     // Catch: java.lang.Throwable -> L24
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L24
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L24
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L24
        L18:
            boolean r0 = r2.isProcessed     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L20
            r2.wait()     // Catch: java.lang.Throwable -> L24
            goto L18
        L20:
            boolean r0 = r2.isDelivered     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean blockUntilDelivered(long r7) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isSent     // Catch: java.lang.Throwable -> L48
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L48
            android.os.Looper r0 = r6.looper     // Catch: java.lang.Throwable -> L48
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L48
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L48
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.exoplayer2.util.Clock r0 = r6.clock     // Catch: java.lang.Throwable -> L48
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L48
            long r0 = r0 + r7
        L1f:
            boolean r2 = r6.isProcessed     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L3a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3a
            com.google.android.exoplayer2.util.Clock r2 = r6.clock     // Catch: java.lang.Throwable -> L48
            r2.onThreadBlocked()     // Catch: java.lang.Throwable -> L48
            r6.wait(r7)     // Catch: java.lang.Throwable -> L48
            com.google.android.exoplayer2.util.Clock r7 = r6.clock     // Catch: java.lang.Throwable -> L48
            long r7 = r7.elapsedRealtime()     // Catch: java.lang.Throwable -> L48
            long r7 = r0 - r7
            goto L1f
        L3a:
            if (r2 == 0) goto L40
            boolean r7 = r6.isDelivered     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            return r7
        L40:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L48
            throw r7     // Catch: java.lang.Throwable -> L48
        L48:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.PlayerMessage cancel() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isSent     // Catch: java.lang.Throwable -> Lf
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r1.isCanceled = r0     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            r1.markAsProcessed(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r1
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public boolean getDeleteAfterDelivery() {
            r1 = this;
            boolean r0 = r1.deleteAfterDelivery
            return r0
    }

    public android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.looper
            return r0
    }

    public int getMediaItemIndex() {
            r1 = this;
            int r0 = r1.mediaItemIndex
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getPayload() {
            r1 = this;
            java.lang.Object r0 = r1.payload
            return r0
    }

    public long getPositionMs() {
            r2 = this;
            long r0 = r2.positionMs
            return r0
    }

    public com.google.android.exoplayer2.PlayerMessage.Target getTarget() {
            r1 = this;
            com.google.android.exoplayer2.PlayerMessage$Target r0 = r1.target
            return r0
    }

    public com.google.android.exoplayer2.Timeline getTimeline() {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public synchronized boolean isCanceled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCanceled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void markAsProcessed(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDelivered     // Catch: java.lang.Throwable -> Le
            r2 = r2 | r0
            r1.isDelivered = r2     // Catch: java.lang.Throwable -> Le
            r2 = 1
            r1.isProcessed = r2     // Catch: java.lang.Throwable -> Le
            r1.notifyAll()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage send() {
            r6 = this;
            boolean r0 = r6.isSent
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r2 = r6.positionMs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L17
            boolean r0 = r6.deleteAfterDelivery
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
        L17:
            r6.isSent = r1
            com.google.android.exoplayer2.PlayerMessage$Sender r0 = r6.sender
            r0.sendMessage(r6)
            return r6
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage setDeleteAfterDelivery(boolean r2) {
            r1 = this;
            boolean r0 = r1.isSent
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.deleteAfterDelivery = r2
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.PlayerMessage setHandler(android.os.Handler r1) {
            r0 = this;
            android.os.Looper r1 = r1.getLooper()
            com.google.android.exoplayer2.PlayerMessage r1 = r0.setLooper(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage setLooper(android.os.Looper r2) {
            r1 = this;
            boolean r0 = r1.isSent
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.looper = r2
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage setPayload(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isSent
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.payload = r2
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage setPosition(int r5, long r6) {
            r4 = this;
            boolean r0 = r4.isSent
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            if (r5 < 0) goto L2c
            com.google.android.exoplayer2.Timeline r0 = r4.timeline
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            com.google.android.exoplayer2.Timeline r0 = r4.timeline
            int r0 = r0.getWindowCount()
            if (r5 >= r0) goto L2c
        L27:
            r4.mediaItemIndex = r5
            r4.positionMs = r6
            return r4
        L2c:
            com.google.android.exoplayer2.IllegalSeekPositionException r0 = new com.google.android.exoplayer2.IllegalSeekPositionException
            com.google.android.exoplayer2.Timeline r1 = r4.timeline
            r0.<init>(r1, r5, r6)
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage setPosition(long r2) {
            r1 = this;
            boolean r0 = r1.isSent
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.positionMs = r2
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.PlayerMessage setType(int r2) {
            r1 = this;
            boolean r0 = r1.isSent
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.type = r2
            return r1
    }
}
