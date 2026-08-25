package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestCoordinator {

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum RequestState extends java.lang.Enum<com.bumptech.glide.request.RequestCoordinator.RequestState> {
        private static final /* synthetic */ com.bumptech.glide.request.RequestCoordinator.RequestState[] $VALUES = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState CLEARED = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState FAILED = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState PAUSED = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState RUNNING = null;
        public static final com.bumptech.glide.request.RequestCoordinator.RequestState SUCCESS = null;
        private final boolean isComplete;

        static {
                com.bumptech.glide.request.RequestCoordinator$RequestState r0 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r1 = "RUNNING"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING = r0
                com.bumptech.glide.request.RequestCoordinator$RequestState r1 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r3 = "PAUSED"
                r4 = 1
                r1.<init>(r3, r4, r2)
                com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED = r1
                com.bumptech.glide.request.RequestCoordinator$RequestState r3 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r5 = "CLEARED"
                r6 = 2
                r3.<init>(r5, r6, r2)
                com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED = r3
                com.bumptech.glide.request.RequestCoordinator$RequestState r5 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r7 = "SUCCESS"
                r8 = 3
                r5.<init>(r7, r8, r4)
                com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS = r5
                com.bumptech.glide.request.RequestCoordinator$RequestState r7 = new com.bumptech.glide.request.RequestCoordinator$RequestState
                java.lang.String r9 = "FAILED"
                r10 = 4
                r7.<init>(r9, r10, r4)
                com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED = r7
                r9 = 5
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r9 = new com.bumptech.glide.request.RequestCoordinator.RequestState[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.bumptech.glide.request.RequestCoordinator.RequestState.$VALUES = r9
                return
        }

        private RequestState(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.isComplete = r3
                return
        }

        public static com.bumptech.glide.request.RequestCoordinator.RequestState valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.request.RequestCoordinator$RequestState> r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.request.RequestCoordinator$RequestState r1 = (com.bumptech.glide.request.RequestCoordinator.RequestState) r1
                return r1
        }

        public static com.bumptech.glide.request.RequestCoordinator.RequestState[] values() {
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.request.RequestCoordinator$RequestState[] r0 = (com.bumptech.glide.request.RequestCoordinator.RequestState[]) r0
                return r0
        }

        public final boolean isComplete() {
                r1 = this;
                boolean r0 = r1.isComplete
                return r0
        }
    }

    boolean canNotifyCleared(com.bumptech.glide.request.Request r1);

    boolean canNotifyStatusChanged(com.bumptech.glide.request.Request r1);

    boolean canSetImage(com.bumptech.glide.request.Request r1);

    com.bumptech.glide.request.RequestCoordinator getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(com.bumptech.glide.request.Request r1);

    void onRequestSuccess(com.bumptech.glide.request.Request r1);
}
