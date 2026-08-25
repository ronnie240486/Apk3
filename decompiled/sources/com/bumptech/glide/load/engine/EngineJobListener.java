package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
interface EngineJobListener {
    void onEngineJobCancelled(com.bumptech.glide.load.engine.EngineJob<?> r1, com.bumptech.glide.load.Key r2);

    void onEngineJobComplete(com.bumptech.glide.load.engine.EngineJob<?> r1, com.bumptech.glide.load.Key r2, com.bumptech.glide.load.engine.EngineResource<?> r3);
}
