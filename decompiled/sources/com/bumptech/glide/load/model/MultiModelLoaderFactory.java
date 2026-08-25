package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes3.dex */
public class MultiModelLoaderFactory {
    private static final com.bumptech.glide.load.model.MultiModelLoaderFactory.Factory DEFAULT_FACTORY = null;
    private static final com.bumptech.glide.load.model.ModelLoader<java.lang.Object, java.lang.Object> EMPTY_MODEL_LOADER = null;
    private final java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?>> alreadyUsedEntries;
    private final java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?>> entries;
    private final com.bumptech.glide.load.model.MultiModelLoaderFactory.Factory factory;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> throwableListPool;

    /* JADX INFO: loaded from: classes2.dex */
    public static class EmptyModelLoader implements com.bumptech.glide.load.model.ModelLoader<java.lang.Object, java.lang.Object> {
        public EmptyModelLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        @androidx.annotation.Nullable
        public com.bumptech.glide.load.model.ModelLoader.LoadData<java.lang.Object> buildLoadData(@androidx.annotation.NonNull java.lang.Object r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public boolean handles(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Entry<Model, Data> {
        public final java.lang.Class<Data> dataClass;
        public final com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> factory;
        private final java.lang.Class<Model> modelClass;

        public Entry(@androidx.annotation.NonNull java.lang.Class<Model> r1, @androidx.annotation.NonNull java.lang.Class<Data> r2, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r3) {
                r0 = this;
                r0.<init>()
                r0.modelClass = r1
                r0.dataClass = r2
                r0.factory = r3
                return
        }

        public boolean handles(@androidx.annotation.NonNull java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<Model> r0 = r1.modelClass
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }

        public boolean handles(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2) {
                r0 = this;
                boolean r1 = r0.handles(r1)
                if (r1 == 0) goto L10
                java.lang.Class<Data> r1 = r0.dataClass
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public <Model, Data> com.bumptech.glide.load.model.MultiModelLoader<Model, Data> build(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r2, @androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r3) {
                r1 = this;
                com.bumptech.glide.load.model.MultiModelLoader r0 = new com.bumptech.glide.load.model.MultiModelLoader
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory
            r0.<init>()
            com.bumptech.glide.load.model.MultiModelLoaderFactory.DEFAULT_FACTORY = r0
            com.bumptech.glide.load.model.MultiModelLoaderFactory$EmptyModelLoader r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory$EmptyModelLoader
            r0.<init>()
            com.bumptech.glide.load.model.MultiModelLoaderFactory.EMPTY_MODEL_LOADER = r0
            return
    }

    public MultiModelLoaderFactory(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r3) {
            r2 = this;
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory r0 = com.bumptech.glide.load.model.MultiModelLoaderFactory.DEFAULT_FACTORY
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.entries = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.alreadyUsedEntries = r1
            r2.throwableListPool = r3
            r2.factory = r0
            return
    }

    private <Model, Data> void add(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4, boolean r5) {
            r1 = this;
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry
            r0.<init>(r2, r3, r4)
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r2 = r1.entries
            if (r5 == 0) goto Le
            int r3 = r2.size()
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2.add(r3, r0)
            return
    }

    @androidx.annotation.NonNull
    private <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> build(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?> r1) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r1 = r1.factory
            com.bumptech.glide.load.model.ModelLoader r1 = r1.build(r0)
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.load.model.ModelLoader r1 = (com.bumptech.glide.load.model.ModelLoader) r1
            return r1
    }

    @androidx.annotation.NonNull
    private static <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> emptyModelLoader() {
            com.bumptech.glide.load.model.ModelLoader<java.lang.Object, java.lang.Object> r0 = com.bumptech.glide.load.model.MultiModelLoaderFactory.EMPTY_MODEL_LOADER
            return r0
    }

    @androidx.annotation.NonNull
    private <Model, Data> com.bumptech.glide.load.model.ModelLoaderFactory<Model, Data> getFactory(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry<?, ?> r1) {
            r0 = this;
            com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r1 = r1.factory
            return r1
    }

    public final synchronized <Model, Data> void append(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.add(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.NonNull
    public synchronized <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> build(@androidx.annotation.NonNull java.lang.Class<Model> r8, @androidx.annotation.NonNull java.lang.Class<Data> r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r7.entries     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r3 = 1
            r4 = 0
        Lf:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L69
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r5 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r5     // Catch: java.lang.Throwable -> L69
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r6 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L69
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L25
            r4 = 1
            goto Lf
        L25:
            boolean r6 = r5.handles(r8, r9)     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto Lf
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r6 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L69
            r6.add(r5)     // Catch: java.lang.Throwable -> L69
            com.bumptech.glide.load.model.ModelLoader r6 = r7.build(r5)     // Catch: java.lang.Throwable -> L69
            r0.add(r6)     // Catch: java.lang.Throwable -> L69
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r6 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L69
            r6.remove(r5)     // Catch: java.lang.Throwable -> L69
            goto Lf
        L3d:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L69
            if (r1 <= r3) goto L4d
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Factory r8 = r7.factory     // Catch: java.lang.Throwable -> L69
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r7.throwableListPool     // Catch: java.lang.Throwable -> L69
            com.bumptech.glide.load.model.MultiModelLoader r8 = r8.build(r0, r9)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)
            return r8
        L4d:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L69
            if (r1 != r3) goto L5b
            java.lang.Object r8 = r0.get(r2)     // Catch: java.lang.Throwable -> L69
            com.bumptech.glide.load.model.ModelLoader r8 = (com.bumptech.glide.load.model.ModelLoader) r8     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)
            return r8
        L5b:
            if (r4 == 0) goto L63
            com.bumptech.glide.load.model.ModelLoader r8 = emptyModelLoader()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)
            return r8
        L63:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException     // Catch: java.lang.Throwable -> L69
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L69
        L69:
            r8 = move-exception
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r9 = r7.alreadyUsedEntries     // Catch: java.lang.Throwable -> L70
            r9.clear()     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L70:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @androidx.annotation.NonNull
    public final synchronized <Model> java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> build(@androidx.annotation.NonNull java.lang.Class<Model> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r4.entries     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3b
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3b
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r2 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r2     // Catch: java.lang.Throwable -> L3b
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r3 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L21
            goto Lc
        L21:
            boolean r3 = r2.handles(r5)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto Lc
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r3 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L3b
            r3.add(r2)     // Catch: java.lang.Throwable -> L3b
            com.bumptech.glide.load.model.ModelLoader r3 = r4.build(r2)     // Catch: java.lang.Throwable -> L3b
            r0.add(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r3 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L3b
            r3.remove(r2)     // Catch: java.lang.Throwable -> L3b
            goto Lc
        L39:
            monitor-exit(r4)
            return r0
        L3b:
            r5 = move-exception
            java.util.Set<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r0 = r4.alreadyUsedEntries     // Catch: java.lang.Throwable -> L42
            r0.clear()     // Catch: java.lang.Throwable -> L42
            throw r5     // Catch: java.lang.Throwable -> L42
        L42:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @androidx.annotation.NonNull
    public final synchronized java.util.List<java.lang.Class<?>> getDataClasses(@androidx.annotation.NonNull java.lang.Class<?> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r4.entries     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2e
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r2 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<Data> r3 = r2.dataClass     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto Lc
            boolean r3 = r2.handles(r5)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto Lc
            java.lang.Class<Data> r2 = r2.dataClass     // Catch: java.lang.Throwable -> L2e
            r0.add(r2)     // Catch: java.lang.Throwable -> L2e
            goto Lc
        L2c:
            monitor-exit(r4)
            return r0
        L2e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized <Model, Data> void prepend(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.add(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.NonNull
    public final synchronized <Model, Data> java.util.List<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> remove(@androidx.annotation.NonNull java.lang.Class<Model> r5, @androidx.annotation.NonNull java.lang.Class<Data> r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.List<com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry<?, ?>> r1 = r4.entries     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.load.model.MultiModelLoaderFactory$Entry r2 = (com.bumptech.glide.load.model.MultiModelLoaderFactory.Entry) r2     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r2.handles(r5, r6)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto Lc
            r1.remove()     // Catch: java.lang.Throwable -> L2b
            com.bumptech.glide.load.model.ModelLoaderFactory r2 = r4.getFactory(r2)     // Catch: java.lang.Throwable -> L2b
            r0.add(r2)     // Catch: java.lang.Throwable -> L2b
            goto Lc
        L29:
            monitor-exit(r4)
            return r0
        L2b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @androidx.annotation.NonNull
    public final synchronized <Model, Data> java.util.List<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> replace(@androidx.annotation.NonNull java.lang.Class<Model> r3, @androidx.annotation.NonNull java.lang.Class<Data> r4, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.List r0 = r2.remove(r3, r4)     // Catch: java.lang.Throwable -> L10
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r2.add(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return r0
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3     // Catch: java.lang.Throwable -> L10
        L10:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
