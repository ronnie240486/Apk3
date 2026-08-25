package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
class ActivityFragmentLifecycle implements com.bumptech.glide.manager.Lifecycle {
    private boolean isDestroyed;
    private boolean isStarted;
    private final java.util.Set<com.bumptech.glide.manager.LifecycleListener> lifecycleListeners;

    public ActivityFragmentLifecycle() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.lifecycleListeners = r0
            return
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(@androidx.annotation.NonNull com.bumptech.glide.manager.LifecycleListener r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r1.lifecycleListeners
            r0.add(r2)
            boolean r0 = r1.isDestroyed
            if (r0 == 0) goto Ld
            r2.onDestroy()
            goto L18
        Ld:
            boolean r0 = r1.isStarted
            if (r0 == 0) goto L15
            r2.onStart()
            goto L18
        L15:
            r2.onStop()
        L18:
            return
    }

    public final void onDestroy() {
            r2 = this;
            r0 = 1
            r2.isDestroyed = r0
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r2.lifecycleListeners
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.LifecycleListener r1 = (com.bumptech.glide.manager.LifecycleListener) r1
            r1.onDestroy()
            goto Ld
        L1d:
            return
    }

    public final void onStart() {
            r2 = this;
            r0 = 1
            r2.isStarted = r0
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r2.lifecycleListeners
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.LifecycleListener r1 = (com.bumptech.glide.manager.LifecycleListener) r1
            r1.onStart()
            goto Ld
        L1d:
            return
    }

    public final void onStop() {
            r2 = this;
            r0 = 0
            r2.isStarted = r0
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r2.lifecycleListeners
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.LifecycleListener r1 = (com.bumptech.glide.manager.LifecycleListener) r1
            r1.onStop()
            goto Ld
        L1d:
            return
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(@androidx.annotation.NonNull com.bumptech.glide.manager.LifecycleListener r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.LifecycleListener> r0 = r1.lifecycleListeners
            r0.remove(r2)
            return
    }
}
