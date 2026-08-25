package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseKeyPool<T extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable> {
    private static final int MAX_SIZE = 20;
    private final java.util.Queue<T> keyPool;

    public BaseKeyPool() {
            r1 = this;
            r1.<init>()
            r0 = 20
            java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r0)
            r1.keyPool = r0
            return
    }

    public abstract T create();

    public final T get() {
            r1 = this;
            java.util.Queue<T extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable> r0 = r1.keyPool
            java.lang.Object r0 = r0.poll()
            com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = (com.bumptech.glide.load.engine.bitmap_recycle.Poolable) r0
            if (r0 != 0) goto Le
            com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r1.create()
        Le:
            return r0
    }

    public void offer(T r3) {
            r2 = this;
            java.util.Queue<T extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable> r0 = r2.keyPool
            int r0 = r0.size()
            r1 = 20
            if (r0 >= r1) goto Lf
            java.util.Queue<T extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable> r0 = r2.keyPool
            r0.offer(r3)
        Lf:
            return
    }
}
