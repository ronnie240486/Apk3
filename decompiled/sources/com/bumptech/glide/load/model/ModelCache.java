package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class ModelCache<A, B> {
    private static final int DEFAULT_SIZE = 250;
    private final com.bumptech.glide.util.LruCache<com.bumptech.glide.load.model.ModelCache.ModelKey<A>, B> cache;


    @androidx.annotation.VisibleForTesting
    public static final class ModelKey<A> {
        private static final java.util.Queue<com.bumptech.glide.load.model.ModelCache.ModelKey<?>> KEY_QUEUE = null;
        private int height;
        private A model;
        private int width;

        static {
                r0 = 0
                java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r0)
                com.bumptech.glide.load.model.ModelCache.ModelKey.KEY_QUEUE = r0
                return
        }

        private ModelKey() {
                r0 = this;
                r0.<init>()
                return
        }

        public static <A> com.bumptech.glide.load.model.ModelCache.ModelKey<A> get(A r2, int r3, int r4) {
                java.util.Queue<com.bumptech.glide.load.model.ModelCache$ModelKey<?>> r0 = com.bumptech.glide.load.model.ModelCache.ModelKey.KEY_QUEUE
                monitor-enter(r0)
                java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L15
                com.bumptech.glide.load.model.ModelCache$ModelKey r1 = (com.bumptech.glide.load.model.ModelCache.ModelKey) r1     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L11
                com.bumptech.glide.load.model.ModelCache$ModelKey r1 = new com.bumptech.glide.load.model.ModelCache$ModelKey
                r1.<init>()
            L11:
                r1.init(r2, r3, r4)
                return r1
            L15:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r2
        }

        private void init(A r1, int r2, int r3) {
                r0 = this;
                r0.model = r1
                r0.width = r2
                r0.height = r3
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.model.ModelCache.ModelKey
                r1 = 0
                if (r0 == 0) goto L1e
                com.bumptech.glide.load.model.ModelCache$ModelKey r4 = (com.bumptech.glide.load.model.ModelCache.ModelKey) r4
                int r0 = r3.width
                int r2 = r4.width
                if (r0 != r2) goto L1e
                int r0 = r3.height
                int r2 = r4.height
                if (r0 != r2) goto L1e
                A r0 = r3.model
                A r4 = r4.model
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.height
                int r0 = r0 * 31
                int r1 = r2.width
                int r0 = r0 + r1
                int r0 = r0 * 31
                A r1 = r2.model
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public void release() {
                r2 = this;
                java.util.Queue<com.bumptech.glide.load.model.ModelCache$ModelKey<?>> r0 = com.bumptech.glide.load.model.ModelCache.ModelKey.KEY_QUEUE
                monitor-enter(r0)
                r0.offer(r2)     // Catch: java.lang.Throwable -> L8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                throw r1
        }
    }

    public ModelCache() {
            r2 = this;
            r0 = 250(0xfa, double:1.235E-321)
            r2.<init>(r0)
            return
    }

    public ModelCache(long r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.model.ModelCache$1 r0 = new com.bumptech.glide.load.model.ModelCache$1
            r0.<init>(r2)
            r1.cache = r0
            return
    }

    public void clear() {
            r1 = this;
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.model.ModelCache$ModelKey<A>, B> r0 = r1.cache
            r0.clearMemory()
            return
    }

    @androidx.annotation.Nullable
    public B get(A r1, int r2, int r3) {
            r0 = this;
            com.bumptech.glide.load.model.ModelCache$ModelKey r1 = com.bumptech.glide.load.model.ModelCache.ModelKey.get(r1, r2, r3)
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.model.ModelCache$ModelKey<A>, B> r2 = r0.cache
            java.lang.Object r2 = r2.get(r1)
            r1.release()
            return r2
    }

    public void put(A r1, int r2, int r3, B r4) {
            r0 = this;
            com.bumptech.glide.load.model.ModelCache$ModelKey r1 = com.bumptech.glide.load.model.ModelCache.ModelKey.get(r1, r2, r3)
            com.bumptech.glide.util.LruCache<com.bumptech.glide.load.model.ModelCache$ModelKey<A>, B> r2 = r0.cache
            r2.put(r1, r4)
            return
    }
}
