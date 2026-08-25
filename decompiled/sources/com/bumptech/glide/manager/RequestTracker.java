package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes2.dex */
public class RequestTracker {
    private static final java.lang.String TAG = "RequestTracker";
    private boolean isPaused;
    private final java.util.List<com.bumptech.glide.request.Request> pendingRequests;
    private final java.util.Set<com.bumptech.glide.request.Request> requests;

    public RequestTracker() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.requests = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.pendingRequests = r0
            return
    }

    public boolean clearAndRemove(@androidx.annotation.Nullable com.bumptech.glide.request.Request r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Set<com.bumptech.glide.request.Request> r1 = r3.requests
            boolean r1 = r1.remove(r4)
            java.util.List<com.bumptech.glide.request.Request> r2 = r3.pendingRequests
            boolean r2 = r2.remove(r4)
            if (r2 != 0) goto L16
            if (r1 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1b
            r4.clear()
        L1b:
            return r0
    }

    public void clearRequests() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.Request> r0 = r2.requests
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.Request r1 = (com.bumptech.glide.request.Request) r1
            r2.clearAndRemove(r1)
            goto La
        L1a:
            java.util.List<com.bumptech.glide.request.Request> r0 = r2.pendingRequests
            r0.clear()
            return
    }

    public boolean isPaused() {
            r1 = this;
            boolean r0 = r1.isPaused
            return r0
    }

    public void pauseAllRequests() {
            r3 = this;
            r0 = 1
            r3.isPaused = r0
            java.util.Set<com.bumptech.glide.request.Request> r0 = r3.requests
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.Request r1 = (com.bumptech.glide.request.Request) r1
            boolean r2 = r1.isRunning()
            if (r2 != 0) goto L25
            boolean r2 = r1.isComplete()
            if (r2 == 0) goto Ld
        L25:
            r1.clear()
            java.util.List<com.bumptech.glide.request.Request> r2 = r3.pendingRequests
            r2.add(r1)
            goto Ld
        L2e:
            return
    }

    public void pauseRequests() {
            r3 = this;
            r0 = 1
            r3.isPaused = r0
            java.util.Set<com.bumptech.glide.request.Request> r0 = r3.requests
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.Request r1 = (com.bumptech.glide.request.Request) r1
            boolean r2 = r1.isRunning()
            if (r2 == 0) goto Ld
            r1.pause()
            java.util.List<com.bumptech.glide.request.Request> r2 = r3.pendingRequests
            r2.add(r1)
            goto Ld
        L28:
            return
    }

    public void restartRequests() {
            r3 = this;
            java.util.Set<com.bumptech.glide.request.Request> r0 = r3.requests
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.Request r1 = (com.bumptech.glide.request.Request) r1
            boolean r2 = r1.isComplete()
            if (r2 != 0) goto La
            boolean r2 = r1.isCleared()
            if (r2 != 0) goto La
            r1.clear()
            boolean r2 = r3.isPaused
            if (r2 != 0) goto L2d
            r1.begin()
            goto La
        L2d:
            java.util.List<com.bumptech.glide.request.Request> r2 = r3.pendingRequests
            r2.add(r1)
            goto La
        L33:
            return
    }

    public void resumeRequests() {
            r3 = this;
            r0 = 0
            r3.isPaused = r0
            java.util.Set<com.bumptech.glide.request.Request> r0 = r3.requests
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.Request r1 = (com.bumptech.glide.request.Request) r1
            boolean r2 = r1.isComplete()
            if (r2 != 0) goto Ld
            boolean r2 = r1.isRunning()
            if (r2 != 0) goto Ld
            r1.begin()
            goto Ld
        L29:
            java.util.List<com.bumptech.glide.request.Request> r0 = r3.pendingRequests
            r0.clear()
            return
    }

    public void runRequest(@androidx.annotation.NonNull com.bumptech.glide.request.Request r3) {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.Request> r0 = r2.requests
            r0.add(r3)
            boolean r0 = r2.isPaused
            if (r0 != 0) goto Ld
            r3.begin()
            goto L23
        Ld:
            r3.clear()
            r0 = 2
            java.lang.String r1 = "RequestTracker"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "Paused, delaying request"
            android.util.Log.v(r1, r0)
        L1e:
            java.util.List<com.bumptech.glide.request.Request> r0 = r2.pendingRequests
            r0.add(r3)
        L23:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{numRequests="
            r0.append(r1)
            java.util.Set<com.bumptech.glide.request.Request> r1 = r2.requests
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", isPaused="
            r0.append(r1)
            boolean r1 = r2.isPaused
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
