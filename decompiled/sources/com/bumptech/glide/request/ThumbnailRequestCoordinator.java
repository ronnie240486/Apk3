package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes2.dex */
public class ThumbnailRequestCoordinator implements com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request {
    private volatile com.bumptech.glide.request.Request full;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState fullState;

    @androidx.annotation.GuardedBy("requestLock")
    private boolean isRunningDuringBegin;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.request.RequestCoordinator parent;
    private final java.lang.Object requestLock;
    private volatile com.bumptech.glide.request.Request thumb;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.RequestCoordinator.RequestState thumbState;

    public ThumbnailRequestCoordinator(java.lang.Object r2, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.RequestCoordinator$RequestState r0 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED
            r1.fullState = r0
            r1.thumbState = r0
            r1.requestLock = r2
            r1.parent = r3
            return
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
            r4 = this;
            java.lang.Object r0 = r4.requestLock
            monitor-enter(r0)
            r1 = 1
            r4.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L33
            r1 = 0
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.fullState     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L2f
            if (r2 == r3) goto L1a
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.thumbState     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L2f
            if (r2 == r3) goto L1a
            r4.thumbState = r3     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.request.Request r2 = r4.thumb     // Catch: java.lang.Throwable -> L2f
            r2.begin()     // Catch: java.lang.Throwable -> L2f
        L1a:
            boolean r2 = r4.isRunningDuringBegin     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L2b
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = r4.fullState     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> L2f
            if (r2 == r3) goto L2b
            r4.fullState = r3     // Catch: java.lang.Throwable -> L2f
            com.bumptech.glide.request.Request r2 = r4.full     // Catch: java.lang.Throwable -> L2f
            r2.begin()     // Catch: java.lang.Throwable -> L2f
        L2b:
            r4.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L2f:
            r2 = move-exception
            r4.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L33
        L33:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyCleared()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L19
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L19
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.fullState     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L1c
            if (r3 == r1) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanNotifyStatusChanged()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L19
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L19
            boolean r3 = r2.isAnyResourceSet()     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.parentCanSetImage()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L19
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L17
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.fullState     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L1c
            if (r3 == r1) goto L19
        L17:
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            r1 = 0
            r2.isRunningDuringBegin = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> L18
            r2.fullState = r1     // Catch: java.lang.Throwable -> L18
            r2.thumbState = r1     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
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
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isAnyResourceSet()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L19
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
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.fullState     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.CLEARED     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.fullState     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.ThumbnailRequestCoordinator
            r1 = 0
            if (r0 == 0) goto L2e
            com.bumptech.glide.request.ThumbnailRequestCoordinator r4 = (com.bumptech.glide.request.ThumbnailRequestCoordinator) r4
            com.bumptech.glide.request.Request r0 = r3.full
            if (r0 != 0) goto L10
            com.bumptech.glide.request.Request r0 = r4.full
            if (r0 != 0) goto L2e
            goto L1a
        L10:
            com.bumptech.glide.request.Request r0 = r3.full
            com.bumptech.glide.request.Request r2 = r4.full
            boolean r0 = r0.isEquivalentTo(r2)
            if (r0 == 0) goto L2e
        L1a:
            com.bumptech.glide.request.Request r0 = r3.thumb
            if (r0 != 0) goto L23
            com.bumptech.glide.request.Request r4 = r4.thumb
            if (r4 != 0) goto L2e
            goto L2d
        L23:
            com.bumptech.glide.request.Request r0 = r3.thumb
            com.bumptech.glide.request.Request r4 = r4.thumb
            boolean r4 = r0.isEquivalentTo(r4)
            if (r4 == 0) goto L2e
        L2d:
            r1 = 1
        L2e:
            return r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r3.fullState     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.RequestCoordinator$RequestState r2 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L11
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L1e
            r2.thumbState = r3     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L11:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L1e
            r2.fullState = r3     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L1c
            r3.onRequestFailed(r2)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L11
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L2b
            r2.thumbState = r3     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L11:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L2b
            r2.fullState = r3     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.request.RequestCoordinator r3 = r2.parent     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L1c
            r3.onRequestSuccess(r2)     // Catch: java.lang.Throwable -> L2b
        L1c:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.thumbState     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.isComplete()     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L29
            com.bumptech.glide.request.Request r3 = r2.thumb     // Catch: java.lang.Throwable -> L2b
            r3.clear()     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r2.thumbState     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.isComplete()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L14
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L27
            r2.thumbState = r1     // Catch: java.lang.Throwable -> L27
            com.bumptech.glide.request.Request r1 = r2.thumb     // Catch: java.lang.Throwable -> L27
            r1.pause()     // Catch: java.lang.Throwable -> L27
        L14:
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r2.fullState     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.isComplete()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L25
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.PAUSED     // Catch: java.lang.Throwable -> L27
            r2.fullState = r1     // Catch: java.lang.Throwable -> L27
            com.bumptech.glide.request.Request r1 = r2.full     // Catch: java.lang.Throwable -> L27
            r1.pause()     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    public void setRequests(com.bumptech.glide.request.Request r1, com.bumptech.glide.request.Request r2) {
            r0 = this;
            r0.full = r1
            r0.thumb = r2
            return
    }
}
