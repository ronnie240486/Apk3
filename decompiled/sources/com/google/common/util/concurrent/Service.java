package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Create an AbstractIdleService")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public interface Service {

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Listener {
        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void failed(com.google.common.util.concurrent.Service.State r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        public void running() {
                r0 = this;
                return
        }

        public void starting() {
                r0 = this;
                return
        }

        public void stopping(com.google.common.util.concurrent.Service.State r1) {
                r0 = this;
                return
        }

        public void terminated(com.google.common.util.concurrent.Service.State r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum State extends java.lang.Enum<com.google.common.util.concurrent.Service.State> {
        private static final /* synthetic */ com.google.common.util.concurrent.Service.State[] $VALUES = null;
        public static final com.google.common.util.concurrent.Service.State FAILED = null;
        public static final com.google.common.util.concurrent.Service.State NEW = null;
        public static final com.google.common.util.concurrent.Service.State RUNNING = null;
        public static final com.google.common.util.concurrent.Service.State STARTING = null;
        public static final com.google.common.util.concurrent.Service.State STOPPING = null;
        public static final com.google.common.util.concurrent.Service.State TERMINATED = null;

        private static /* synthetic */ com.google.common.util.concurrent.Service.State[] $values() {
                r0 = 6
                com.google.common.util.concurrent.Service$State[] r0 = new com.google.common.util.concurrent.Service.State[r0]
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
                r2 = 0
                r0[r2] = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING
                r2 = 1
                r0[r2] = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                r2 = 2
                r0[r2] = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING
                r2 = 3
                r0[r2] = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED
                r2 = 4
                r0[r2] = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.util.concurrent.Service$State r0 = new com.google.common.util.concurrent.Service$State
                java.lang.String r1 = "NEW"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.NEW = r0
                com.google.common.util.concurrent.Service$State r0 = new com.google.common.util.concurrent.Service$State
                java.lang.String r1 = "STARTING"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.STARTING = r0
                com.google.common.util.concurrent.Service$State r0 = new com.google.common.util.concurrent.Service$State
                java.lang.String r1 = "RUNNING"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.RUNNING = r0
                com.google.common.util.concurrent.Service$State r0 = new com.google.common.util.concurrent.Service$State
                java.lang.String r1 = "STOPPING"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.STOPPING = r0
                com.google.common.util.concurrent.Service$State r0 = new com.google.common.util.concurrent.Service$State
                java.lang.String r1 = "TERMINATED"
                r2 = 4
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.TERMINATED = r0
                com.google.common.util.concurrent.Service$State r0 = new com.google.common.util.concurrent.Service$State
                java.lang.String r1 = "FAILED"
                r2 = 5
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.Service.State.FAILED = r0
                com.google.common.util.concurrent.Service$State[] r0 = $values()
                com.google.common.util.concurrent.Service.State.$VALUES = r0
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.util.concurrent.Service.State valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.util.concurrent.Service$State> r0 = com.google.common.util.concurrent.Service.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.util.concurrent.Service$State r1 = (com.google.common.util.concurrent.Service.State) r1
                return r1
        }

        public static com.google.common.util.concurrent.Service.State[] values() {
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.util.concurrent.Service$State[] r0 = (com.google.common.util.concurrent.Service.State[]) r0
                return r0
        }
    }

    void addListener(com.google.common.util.concurrent.Service.Listener r1, java.util.concurrent.Executor r2);

    void awaitRunning();

    void awaitRunning(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.TimeoutException;

    java.lang.Throwable failureCause();

    boolean isRunning();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    com.google.common.util.concurrent.Service startAsync();

    com.google.common.util.concurrent.Service.State state();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    com.google.common.util.concurrent.Service stopAsync();
}
