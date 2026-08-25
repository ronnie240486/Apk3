package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
final class Jobs {
    private final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> jobs;
    private final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> onlyCacheJobs;

    public Jobs() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.jobs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.onlyCacheJobs = r0
            return
    }

    private java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> getJobMap(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> r1 = r0.onlyCacheJobs
            goto L7
        L5:
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> r1 = r0.jobs
        L7:
            return r1
    }

    public final com.bumptech.glide.load.engine.EngineJob<?> get(com.bumptech.glide.load.Key r1, boolean r2) {
            r0 = this;
            java.util.Map r2 = r0.getJobMap(r2)
            java.lang.Object r1 = r2.get(r1)
            com.bumptech.glide.load.engine.EngineJob r1 = (com.bumptech.glide.load.engine.EngineJob) r1
            return r1
    }

    public final void put(com.bumptech.glide.load.Key r2, com.bumptech.glide.load.engine.EngineJob<?> r3) {
            r1 = this;
            boolean r0 = r3.onlyRetrieveFromCache()
            java.util.Map r0 = r1.getJobMap(r0)
            r0.put(r2, r3)
            return
    }

    public final void removeIfCurrent(com.bumptech.glide.load.Key r3, com.bumptech.glide.load.engine.EngineJob<?> r4) {
            r2 = this;
            boolean r0 = r4.onlyRetrieveFromCache()
            java.util.Map r0 = r2.getJobMap(r0)
            java.lang.Object r1 = r0.get(r3)
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L15
            r0.remove(r3)
        L15:
            return
    }
}
