package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
public final class TargetTracker implements com.bumptech.glide.manager.LifecycleListener {
    private final java.util.Set<com.bumptech.glide.request.target.Target<?>> targets;

    public TargetTracker() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.targets = r0
            return
    }

    public void clear() {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r1.targets
            r0.clear()
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<com.bumptech.glide.request.target.Target<?>> getAll() {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r1.targets
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            return r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r2.targets
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.target.Target r1 = (com.bumptech.glide.request.target.Target) r1
            r1.onDestroy()
            goto La
        L1a:
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r2.targets
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.target.Target r1 = (com.bumptech.glide.request.target.Target) r1
            r1.onStart()
            goto La
        L1a:
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r2.targets
            java.util.List r0 = com.bumptech.glide.util.Util.getSnapshot(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.target.Target r1 = (com.bumptech.glide.request.target.Target) r1
            r1.onStop()
            goto La
        L1a:
            return
    }

    public void track(@androidx.annotation.NonNull com.bumptech.glide.request.target.Target<?> r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r1.targets
            r0.add(r2)
            return
    }

    public void untrack(@androidx.annotation.NonNull com.bumptech.glide.request.target.Target<?> r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.Target<?>> r0 = r1.targets
            r0.remove(r2)
            return
    }
}
