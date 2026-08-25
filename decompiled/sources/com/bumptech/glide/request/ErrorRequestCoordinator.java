package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorRequestCoordinator implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request {
    private volatile com.bumptech.glide.request.Request error;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState errorState;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.request.RequestCoordinator parent;
    private volatile com.bumptech.glide.request.Request primary;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState primaryState;
    private final java.lang.Object requestLock;

    public ErrorRequestCoordinator(java.lang.Object r2, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
            r1.primaryState = r0
            r1.errorState = r0
            r1.requestLock = r2
            r1.parent = r3
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean isValidRequest(com.bumptech.glide.request.Request r3) {
            r2 = this;
            com.bumptech.glide.request.Request r0 = r2.primary
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L19
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = r2.primaryState
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED
            if (r0 != r1) goto L17
            com.bumptech.glide.request.Request r0 = r2.error
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            goto L1a
        L19:
            r3 = 1
        L1a:
            return r3
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean parentCanNotifyCleared() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.parent
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyCleared(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean parentCanNotifyStatusChanged() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.parent
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyStatusChanged(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean parentCanSetImage() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.parent
            if (r0 == 0) goto Ld
            boolean r0 = r0.canSetImage(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L12
            if (r1 == r2) goto L10
            r3.primaryState = r2     // Catch: java.lang.Throwable -> L12
            com.bumptech.glide.request.Request r1 = r3.primary     // Catch: java.lang.Throwable -> L12
            r1.begin()     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyCleared()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L11
            boolean r3 = r2.isValidRequest(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyStatusChanged()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L11
            boolean r3 = r2.isValidRequest(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanSetImage()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L11
            boolean r3 = r2.isValidRequest(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L19
            r3.primaryState = r1     // Catch: java.lang.Throwable -> L19
            com.bumptech.glide.request.Request r2 = r3.primary     // Catch: java.lang.Throwable -> L19
            r2.clear()     // Catch: java.lang.Throwable -> L19
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r3.errorState     // Catch: java.lang.Throwable -> L19
            if (r2 == r1) goto L17
            r3.errorState = r1     // Catch: java.lang.Throwable -> L19
            com.bumptech.glide.request.Request r1 = r3.error     // Catch: java.lang.Throwable -> L19
            r1.clear()     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public com.bumptech.glide.request.RequestCoordinator getRoot() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator r1 = r2.parent     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lc
            com.bumptech.glide.request.RequestCoordinator r1 = r1.getRoot()     // Catch: java.lang.Throwable -> Lf
            goto Ld
        Lc:
            r1 = r2
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.primary     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isAnyResourceSet()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            com.bumptech.glide.request.Request r1 = r2.error     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isAnyResourceSet()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L12
            if (r1 != r2) goto Lf
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L12
            if (r1 != r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L13
            if (r1 == r2) goto L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto Le
            goto L10
        Le:
            r1 = 0
            goto L11
        L10:
            r1 = 1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.ErrorRequestCoordinator
            r1 = 0
            if (r0 == 0) goto L1c
            com.bumptech.glide.request.ErrorRequestCoordinator r4 = (com.bumptech.glide.request.ErrorRequestCoordinator) r4
            com.bumptech.glide.request.Request r0 = r3.primary
            com.bumptech.glide.request.Request r2 = r4.primary
            boolean r0 = r0.isEquivalentTo(r2)
            if (r0 == 0) goto L1c
            com.bumptech.glide.request.Request r0 = r3.error
            com.bumptech.glide.request.Request r4 = r4.error
            boolean r4 = r0.isEquivalentTo(r4)
            if (r4 == 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L13
            if (r1 == r2) goto L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto Le
            goto L10
        Le:
            r1 = 0
            goto L11
        L10:
            r1 = 1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.error     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L1e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L2b
            r2.primaryState = r3     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.errorState     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L2b
            if (r3 == r1) goto L1c
            r2.errorState = r1     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.request.Request r3 = r2.error     // Catch: java.lang.Throwable -> L2b
            r3.begin()     // Catch: java.lang.Throwable -> L2b
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L1e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L2b
            r2.errorState = r3     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L29
            r3.onRequestFailed(r2)     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.primary     // Catch: java.lang.Throwable -> L25
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L10
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L25
            r2.primaryState = r3     // Catch: java.lang.Throwable -> L25
            goto L1c
        L10:
            com.bumptech.glide.request.Request r1 = r2.error     // Catch: java.lang.Throwable -> L25
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L1c
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L25
            r2.errorState = r3     // Catch: java.lang.Throwable -> L25
        L1c:
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L23
            r3.onRequestSuccess(r2)     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.primaryState     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L21
            if (r1 != r2) goto L12
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L21
            r3.primaryState = r1     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.request.Request r1 = r3.primary     // Catch: java.lang.Throwable -> L21
            r1.pause()     // Catch: java.lang.Throwable -> L21
        L12:
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.errorState     // Catch: java.lang.Throwable -> L21
            if (r1 != r2) goto L1f
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L21
            r3.errorState = r1     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.request.Request r1 = r3.error     // Catch: java.lang.Throwable -> L21
            r1.pause()     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public void setRequests(com.bumptech.glide.request.Request r1, com.bumptech.glide.request.Request r2) {
            r0 = this;
            r0.primary = r1
            r0.error = r2
            return
    }
}
