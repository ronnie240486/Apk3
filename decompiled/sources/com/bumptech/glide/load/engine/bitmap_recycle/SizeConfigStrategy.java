package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
public class SizeConfigStrategy implements com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy {
    private static final android.graphics.Bitmap.Config[] ALPHA_8_IN_CONFIGS = null;
    private static final android.graphics.Bitmap.Config[] ARGB_4444_IN_CONFIGS = null;
    private static final android.graphics.Bitmap.Config[] ARGB_8888_IN_CONFIGS = null;
    private static final int MAX_SIZE_MULTIPLE = 8;
    private static final android.graphics.Bitmap.Config[] RGBA_F16_IN_CONFIGS = null;
    private static final android.graphics.Bitmap.Config[] RGB_565_IN_CONFIGS = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key, android.graphics.Bitmap> groupedMap;
    private final com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool keyPool;
    private final java.util.Map<android.graphics.Bitmap.Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> sortedSizes;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config = null;

        static {
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch: java.lang.NoSuchFieldError -> L33
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    @androidx.annotation.VisibleForTesting
    public static final class Key implements com.bumptech.glide.load.engine.bitmap_recycle.Poolable {
        private android.graphics.Bitmap.Config config;
        private final com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool pool;
        public int size;

        public Key(com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.KeyPool r1) {
                r0 = this;
                r0.<init>()
                r0.pool = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key
                r1 = 0
                if (r0 == 0) goto L18
                com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r4 = (com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key) r4
                int r0 = r3.size
                int r2 = r4.size
                if (r0 != r2) goto L18
                android.graphics.Bitmap$Config r0 = r3.config
                android.graphics.Bitmap$Config r4 = r4.config
                boolean r4 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r4)
                if (r4 == 0) goto L18
                r1 = 1
            L18:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.size
                int r0 = r0 * 31
                android.graphics.Bitmap$Config r1 = r2.config
                if (r1 == 0) goto Ld
                int r1 = r1.hashCode()
                goto Le
            Ld:
                r1 = 0
            Le:
                int r0 = r0 + r1
                return r0
        }

        public void init(int r1, android.graphics.Bitmap.Config r2) {
                r0 = this;
                r0.size = r1
                r0.config = r2
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public void offer() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool r0 = r1.pool
                r0.offer(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.size
                android.graphics.Bitmap$Config r1 = r2.config
                java.lang.String r0 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.getBitmapString(r0, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static class KeyPool extends com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key> {
        public KeyPool() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final com.bumptech.glide.load.engine.bitmap_recycle.Poolable create() {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r0 = new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key get(int r2, android.graphics.Bitmap.Config r3) {
                r1 = this;
                com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r1.get()
                com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r0 = (com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key) r0
                r0.init(r2, r3)
                return r0
        }
    }

    static {
            r0 = 2
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r0]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 0
            r0[r2] = r1
            r1 = 0
            r3 = 1
            r0[r3] = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r1 < r4) goto L1f
            r1 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.graphics.Bitmap$Config[] r0 = (android.graphics.Bitmap.Config[]) r0
            int r1 = r0.length
            int r1 = r1 - r3
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGBA_F16
            r0[r1] = r4
        L1f:
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.ARGB_8888_IN_CONFIGS = r0
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.RGBA_F16_IN_CONFIGS = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0[r2] = r1
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.RGB_565_IN_CONFIGS = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            r0[r2] = r1
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.ARGB_4444_IN_CONFIGS = r0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r3]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            r0[r2] = r1
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.ALPHA_8_IN_CONFIGS = r0
            return
    }

    public SizeConfigStrategy() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool r0 = new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool
            r0.<init>()
            r1.keyPool = r0
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap
            r0.<init>()
            r1.groupedMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.sortedSizes = r0
            return
    }

    private void decrementBitmapOfSize(java.lang.Integer r4, android.graphics.Bitmap r5) {
            r3 = this;
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            java.util.NavigableMap r0 = r3.getSizesForConfig(r0)
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L28
            int r5 = r1.intValue()
            r2 = 1
            if (r5 != r2) goto L1b
            r0.remove(r4)
            goto L27
        L1b:
            int r5 = r1.intValue()
            int r5 = r5 - r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
        L27:
            return
        L28:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Tried to decrement empty size, size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", removed: "
            r1.append(r4)
            java.lang.String r4 = r3.logBitmap(r5)
            r1.append(r4)
            java.lang.String r4 = ", this: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.Key findBestKey(int r9, android.graphics.Bitmap.Config r10) {
            r8 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool r0 = r8.keyPool
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r0 = r0.get(r9, r10)
            android.graphics.Bitmap$Config[] r1 = getInConfigs(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.getSizesForConfig(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool r9 = r8.keyPool
            r9.offer(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool r9 = r8.keyPool
            int r10 = r5.intValue()
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r0 = r9.get(r10, r4)
            goto L4c
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
    }

    public static java.lang.String getBitmapString(int r2, android.graphics.Bitmap.Config r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "]("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static android.graphics.Bitmap.Config[] getInConfigs(android.graphics.Bitmap.Config r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L11
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L11
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.RGBA_F16_IN_CONFIGS
            return r3
        L11:
            int[] r0 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r2 = 2
            if (r0 == r2) goto L31
            r2 = 3
            if (r0 == r2) goto L2e
            r2 = 4
            if (r0 == r2) goto L2b
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[r1]
            r1 = 0
            r0[r1] = r3
            return r0
        L2b:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.ALPHA_8_IN_CONFIGS
            return r3
        L2e:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.ARGB_4444_IN_CONFIGS
            return r3
        L31:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.RGB_565_IN_CONFIGS
            return r3
        L34:
            android.graphics.Bitmap$Config[] r3 = com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy.ARGB_8888_IN_CONFIGS
            return r3
    }

    private java.util.NavigableMap<java.lang.Integer, java.lang.Integer> getSizesForConfig(android.graphics.Bitmap.Config r3) {
            r2 = this;
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r2.sortedSizes
            java.lang.Object r0 = r0.get(r3)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L14
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r2.sortedSizes
            r1.put(r3, r0)
        L14:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @androidx.annotation.Nullable
    public android.graphics.Bitmap get(int r3, int r4, android.graphics.Bitmap.Config r5) {
            r2 = this;
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r3, r4, r5)
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r0 = r2.findBestKey(r0, r5)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key, android.graphics.Bitmap> r1 = r2.groupedMap
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L1e
            int r0 = r0.size
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.decrementBitmapOfSize(r0, r1)
            r1.reconfigure(r3, r4, r5)
        L1e:
            return r1
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
            java.lang.String r1 = getBitmapString(r1, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public java.lang.String logBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r2)
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            java.lang.String r2 = getBitmapString(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public void put(android.graphics.Bitmap r4) {
            r3 = this;
            int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$KeyPool r1 = r3.keyPool
            android.graphics.Bitmap$Config r2 = r4.getConfig()
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key r0 = r1.get(r0, r2)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key, android.graphics.Bitmap> r1 = r3.groupedMap
            r1.put(r0, r4)
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            java.util.NavigableMap r4 = r3.getSizesForConfig(r4)
            int r1 = r0.size
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r0.size
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r1 != 0) goto L31
            goto L36
        L31:
            int r1 = r1.intValue()
            int r2 = r2 + r1
        L36:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4.put(r0, r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @androidx.annotation.Nullable
    public android.graphics.Bitmap removeLast() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key, android.graphics.Bitmap> r0 = r2.groupedMap
            java.lang.Object r0 = r0.removeLast()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L15
            int r1 = com.bumptech.glide.util.Util.getBitmapByteSize(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.decrementBitmapOfSize(r1, r0)
        L15:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "SizeConfigStrategy{groupedMap="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap<com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$Key, android.graphics.Bitmap> r1 = r4.groupedMap
            r0.append(r1)
            java.lang.String r1 = ", sortedSizes=("
            r0.append(r1)
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r4.sortedSizes
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 91
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = "], "
            r0.append(r2)
            goto L1a
        L3f:
            java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r4.sortedSizes
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.String r3 = ""
            r0.replace(r1, r2, r3)
        L56:
            java.lang.String r1 = ")}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
