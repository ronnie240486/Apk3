package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
class AttributeStrategy implements com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy {
    private final com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.Key, android.graphics.Bitmap> groupedMap;
    private final com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.KeyPool keyPool;

    @androidx.annotation.VisibleForTesting
    public static class Key implements com.bumptech.glide.load.engine.bitmap_recycle.Poolable {
        private android.graphics.Bitmap.Config config;
        private int height;
        private final com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.KeyPool pool;
        private int width;

        public Key(com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.KeyPool r1) {
                r0 = this;
                r0.<init>()
                r0.pool = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.Key
                r1 = 0
                if (r0 == 0) goto L1a
                com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key r4 = (com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.Key) r4
                int r0 = r3.width
                int r2 = r4.width
                if (r0 != r2) goto L1a
                int r0 = r3.height
                int r2 = r4.height
                if (r0 != r2) goto L1a
                android.graphics.Bitmap$Config r0 = r3.config
                android.graphics.Bitmap$Config r4 = r4.config
                if (r0 != r4) goto L1a
                r1 = 1
            L1a:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.width
                int r0 = r0 * 31
                int r1 = r2.height
                int r0 = r0 + r1
                int r0 = r0 * 31
                android.graphics.Bitmap$Config r1 = r2.config
                if (r1 == 0) goto L12
                int r1 = r1.hashCode()
                goto L13
            L12:
                r1 = 0
            L13:
                int r0 = r0 + r1
                return r0
        }

        public void init(int r1, int r2, android.graphics.Bitmap.Config r3) {
                r0 = this;
                r0.width = r1
                r0.height = r2
                r0.config = r3
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$KeyPool r0 = r1.pool
                r0.offer(r1)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.width
                int r1 = r3.height
                android.graphics.Bitmap$Config r2 = r3.config
                java.lang.String r0 = com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.getBitmapString(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static class KeyPool extends com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool<com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.Key> {
        public KeyPool() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final com.bumptech.glide.load.engine.bitmap_recycle.Poolable create() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key r0 = new com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key
                r0.<init>(r1)
                return r0
        }
    }

    public AttributeStrategy() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$KeyPool r0 = new com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$KeyPool
            r0.<init>()
            r1.keyPool = r0
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap
            r0.<init>()
            r1.groupedMap = r0
            return
    }

    public static java.lang.String getBitmapString(int r3, int r4, android.graphics.Bitmap.Config r5) {
            java.lang.String r0 = "["
            java.lang.String r1 = "x"
            java.lang.String r2 = "], "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1, r4, r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static java.lang.String getBitmapString(android.graphics.Bitmap r2) {
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            java.lang.String r2 = getBitmapString(r0, r1, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public android.graphics.Bitmap get(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$KeyPool r0 = r1.keyPool
            com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r0.get()
            com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key r0 = (com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.Key) r0
            r0.init(r2, r3, r4)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key, android.graphics.Bitmap> r2 = r1.groupedMap
            java.lang.Object r2 = r2.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public int getSize(android.graphics.Bitmap r1) {
            r0 = this;
            int r1 = com.bumptech.glide.util.Util.getBitmapByteSize(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public java.lang.String logBitmap(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            java.lang.String r1 = getBitmapString(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public java.lang.String logBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            java.lang.String r1 = getBitmapString(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public void put(android.graphics.Bitmap r5) {
            r4 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$KeyPool r0 = r4.keyPool
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            android.graphics.Bitmap$Config r3 = r5.getConfig()
            com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r0.get()
            com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key r0 = (com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy.Key) r0
            r0.init(r1, r2, r3)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key, android.graphics.Bitmap> r1 = r4.groupedMap
            r1.put(r0, r5)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public android.graphics.Bitmap removeLast() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key, android.graphics.Bitmap> r0 = r1.groupedMap
            java.lang.Object r0 = r0.removeLast()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AttributeStrategy:\n  "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy$Key, android.graphics.Bitmap> r1 = r2.groupedMap
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
