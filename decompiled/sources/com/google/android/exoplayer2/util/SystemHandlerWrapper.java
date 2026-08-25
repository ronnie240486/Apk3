package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
final class SystemHandlerWrapper implements com.google.android.exoplayer2.util.HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;

    @androidx.annotation.GuardedBy("messagePool")
    private static final java.util.List<com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage> messagePool = null;
    private final android.os.Handler handler;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.SystemHandlerWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SystemMessage implements com.google.android.exoplayer2.util.HandlerWrapper.Message {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.util.SystemHandlerWrapper handler;

        @androidx.annotation.Nullable
        private android.os.Message message;

        private SystemMessage() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ SystemMessage(com.google.android.exoplayer2.util.SystemHandlerWrapper.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void recycle() {
                r1 = this;
                r0 = 0
                r1.message = r0
                r1.handler = r0
                com.google.android.exoplayer2.util.SystemHandlerWrapper.access$100(r1)
                return
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public com.google.android.exoplayer2.util.HandlerWrapper getTarget() {
                r1 = this;
                com.google.android.exoplayer2.util.SystemHandlerWrapper r0 = r1.handler
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.util.HandlerWrapper r0 = (com.google.android.exoplayer2.util.HandlerWrapper) r0
                return r0
        }

        public boolean sendAtFrontOfQueue(android.os.Handler r2) {
                r1 = this;
                android.os.Message r0 = r1.message
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                android.os.Message r0 = (android.os.Message) r0
                boolean r2 = r2.sendMessageAtFrontOfQueue(r0)
                r1.recycle()
                return r2
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public void sendToTarget() {
                r1 = this;
                android.os.Message r0 = r1.message
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                android.os.Message r0 = (android.os.Message) r0
                r0.sendToTarget()
                r1.recycle()
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage setMessage(android.os.Message r1, com.google.android.exoplayer2.util.SystemHandlerWrapper r2) {
                r0 = this;
                r0.message = r1
                r0.handler = r2
                return r0
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 50
            r0.<init>(r1)
            com.google.android.exoplayer2.util.SystemHandlerWrapper.messagePool = r0
            return
    }

    public SystemHandlerWrapper(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage r0) {
            recycleMessage(r0)
            return
    }

    private static com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage obtainSystemMessage() {
            java.util.List<com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage> r0 = com.google.android.exoplayer2.util.SystemHandlerWrapper.messagePool
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L10
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r1 = new com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            goto L1c
        L10:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1e
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r1 = (com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage) r1     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    private static void recycleMessage(com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage r3) {
            java.util.List<com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage> r0 = com.google.android.exoplayer2.util.SystemHandlerWrapper.messagePool
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L10
            r2 = 50
            if (r1 >= r2) goto Le
            r0.add(r3)     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public android.os.Looper getLooper() {
            r1 = this;
            android.os.Handler r0 = r1.handler
            android.os.Looper r0 = r0.getLooper()
            return r0
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean hasMessages(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r2 = r0.hasMessages(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r3) {
            r2 = this;
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r0 = obtainSystemMessage()
            android.os.Handler r1 = r2.handler
            android.os.Message r3 = r1.obtainMessage(r3)
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r3 = r0.setMessage(r3, r2)
            return r3
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r3, int r4, int r5) {
            r2 = this;
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r0 = obtainSystemMessage()
            android.os.Handler r1 = r2.handler
            android.os.Message r3 = r1.obtainMessage(r3, r4, r5)
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r3 = r0.setMessage(r3, r2)
            return r3
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r3, int r4, int r5, @androidx.annotation.Nullable java.lang.Object r6) {
            r2 = this;
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r0 = obtainSystemMessage()
            android.os.Handler r1 = r2.handler
            android.os.Message r3 = r1.obtainMessage(r3, r4, r5, r6)
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r3 = r0.setMessage(r3, r2)
            return r3
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r2 = this;
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r0 = obtainSystemMessage()
            android.os.Handler r1 = r2.handler
            android.os.Message r3 = r1.obtainMessage(r3, r4)
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r3 = r0.setMessage(r3, r2)
            return r3
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean post(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r2 = r0.post(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postAtFrontOfQueue(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r2 = r0.postAtFrontOfQueue(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postDelayed(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r2 = r0.postDelayed(r2, r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeCallbacksAndMessages(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            r0.removeCallbacksAndMessages(r2)
            return
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeMessages(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            r0.removeMessages(r2)
            return
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessage(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r2 = r0.sendEmptyMessage(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int r2, long r3) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r2 = r0.sendEmptyMessageAtTime(r2, r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int r4, int r5) {
            r3 = this;
            android.os.Handler r0 = r3.handler
            long r1 = (long) r5
            boolean r4 = r0.sendEmptyMessageDelayed(r4, r1)
            return r4
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(com.google.android.exoplayer2.util.HandlerWrapper.Message r2) {
            r1 = this;
            com.google.android.exoplayer2.util.SystemHandlerWrapper$SystemMessage r2 = (com.google.android.exoplayer2.util.SystemHandlerWrapper.SystemMessage) r2
            android.os.Handler r0 = r1.handler
            boolean r2 = r2.sendAtFrontOfQueue(r0)
            return r2
    }
}
