package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(19)
final class SizeStrategy implements com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy {
    private static final int MAX_SIZE_MULTIPLE = 8;
    private final com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.Key, android.graphics.Bitmap> groupedMap;
    private final com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.KeyPool keyPool;
    private final java.util.NavigableMap<java.lang.Integer, java.lang.Integer> sortedSizes;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public static final class Key implements com.bumptech.glide.load.engine.bitmap_recycle.Poolable {
        private final com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.KeyPool pool;
        public int size;

        public Key(com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.KeyPool r1) {
                r0 = this;
                r0.<init>()
                r0.pool = r1
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.Key
                r1 = 0
                if (r0 == 0) goto Le
                com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key r3 = (com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.Key) r3
                int r0 = r2.size
                int r3 = r3.size
                if (r0 != r3) goto Le
                r1 = 1
            Le:
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.size
                return r0
        }

        public void init(int r1) {
                r0 = this;
                r0.size = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool r0 = r1.pool
                r0.offer(r1)
                return
        }

        public java.lang.String toString() {
                r1 = this;
                int r0 = r1.size
                java.lang.String r0 = com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.getBitmapString(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.VisibleForTesting
    public static class KeyPool extends com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool<com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.Key> {
        public KeyPool() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final com.bumptech.glide.load.engine.bitmap_recycle.Poolable create() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key r0 = new com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.Key get(int r2) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r1.get()
                com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key r0 = (com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy.Key) r0
                r0.init(r2)
                return r0
        }
    }

    public SizeStrategy() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool r0 = new com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool
            r0.<init>()
            r1.keyPool = r0
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap
            r0.<init>()
            r1.groupedMap = r0
            com.bumptech.glide.load.engine.bitmap_recycle.PrettyPrintTreeMap r0 = new com.bumptech.glide.load.engine.bitmap_recycle.PrettyPrintTreeMap
            r0.<init>()
            r1.sortedSizes = r0
            return
    }

    private void decrementBitmapOfSize(java.lang.Integer r4) {
            r3 = this;
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r0 = r3.sortedSizes
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r2 = 1
            if (r1 != r2) goto L15
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r0 = r3.sortedSizes
            r0.remove(r4)
            goto L23
        L15:
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r1 = r3.sortedSizes
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r4, r0)
        L23:
            return
    }

    public static java.lang.String getBitmapString(int r2) {
            java.lang.String r0 = "["
            java.lang.String r1 = "]"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1)
            return r2
    }

    private static java.lang.String getBitmapString(android.graphics.Bitmap r0) {
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r0)
            java.lang.String r0 = getBitmapString(r0)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @androidx.annotation.Nullable
    public android.graphics.Bitmap get(int r5, int r6, android.graphics.Bitmap.Config r7) {
            r4 = this;
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r5, r6, r7)
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool r1 = r4.keyPool
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key r1 = r1.get(r0)
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r2 = r4.sortedSizes
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.ceilingKey(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L35
            int r3 = r2.intValue()
            if (r3 == r0) goto L35
            int r3 = r2.intValue()
            int r0 = r0 * 8
            if (r3 > r0) goto L35
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool r0 = r4.keyPool
            r0.offer(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool r0 = r4.keyPool
            int r1 = r2.intValue()
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key r1 = r0.get(r1)
        L35:
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key, android.graphics.Bitmap> r0 = r4.groupedMap
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L45
            r0.reconfigure(r5, r6, r7)
            r4.decrementBitmapOfSize(r2)
        L45:
            return r0
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
            int r1 = com.bumptech.glide.util.Util.getBitmapByteSize(r1, r2, r3)
            java.lang.String r1 = getBitmapString(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public java.lang.String logBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            java.lang.String r1 = getBitmapString(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public void put(android.graphics.Bitmap r4) {
            r3 = this;
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$KeyPool r1 = r3.keyPool
            com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key r0 = r1.get(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key, android.graphics.Bitmap> r1 = r3.groupedMap
            r1.put(r0, r4)
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r4 = r3.sortedSizes
            int r1 = r0.size
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r1 = r3.sortedSizes
            int r0 = r0.size
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r4 != 0) goto L29
            goto L2e
        L29:
            int r4 = r4.intValue()
            int r2 = r2 + r4
        L2e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r4)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @androidx.annotation.Nullable
    public android.graphics.Bitmap removeLast() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key, android.graphics.Bitmap> r0 = r2.groupedMap
            java.lang.Object r0 = r0.removeLast()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            int r1 = com.bumptech.glide.util.Util.getBitmapByteSize(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.decrementBitmapOfSize(r1)
        L15:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "SizeStrategy:\n  "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeStrategy$Key, android.graphics.Bitmap> r1 = r2.groupedMap
            r0.append(r1)
            java.lang.String r1 = "\n  SortedSizes"
            r0.append(r1)
            java.util.NavigableMap<java.lang.Integer, java.lang.Integer> r1 = r2.sortedSizes
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
