package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class ModelLoaderRegistry {
    private final com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache cache;
    private final com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory;

    public static class ModelLoaderCache {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache.Entry<?>> cachedModelLoaders;

        public static class Entry<Model> {
            public final java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> loaders;

            public Entry(java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.loaders = r1
                    return
            }
        }

        public ModelLoaderCache() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.cachedModelLoaders = r0
                return
        }

        public void clear() {
                r1 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry<?>> r0 = r1.cachedModelLoaders
                r0.clear()
                return
        }

        @androidx.annotation.Nullable
        public <Model> java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> get(java.lang.Class<Model> r2) {
                r1 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry<?>> r0 = r1.cachedModelLoaders
                java.lang.Object r2 = r0.get(r2)
                com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry r2 = (com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache.Entry) r2
                if (r2 != 0) goto Lc
                r2 = 0
                goto Le
            Lc:
                java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> r2 = r2.loaders
            Le:
                return r2
        }

        public <Model> void put(java.lang.Class<Model> r3, java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> r4) {
                r2 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry<?>> r0 = r2.cachedModelLoaders
                com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry r1 = new com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry
                r1.<init>(r4)
                java.lang.Object r4 = r0.put(r3, r1)
                com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache$Entry r4 = (com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache.Entry) r4
                if (r4 != 0) goto L10
                return
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Already cached loaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }
    }

    public ModelLoaderRegistry(@androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
            r1 = this;
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = new com.bumptech.glide.load.model.MultiModelLoaderFactory
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private ModelLoaderRegistry(@androidx.annotation.NonNull com.bumptech.glide.load.model.MultiModelLoaderFactory r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r0 = new com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache
            r0.<init>()
            r1.cache = r0
            r1.multiModelLoaderFactory = r2
            return
    }

    @androidx.annotation.NonNull
    private static <A> java.lang.Class<A> getClass(@androidx.annotation.NonNull A r0) {
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @androidx.annotation.NonNull
    private synchronized <A> java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> getModelLoadersForClass(@androidx.annotation.NonNull java.lang.Class<A> r3) {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r0 = r2.cache     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L18
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r2.multiModelLoaderFactory     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = r0.build(r3)     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r1 = r2.cache     // Catch: java.lang.Throwable -> L1a
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r2)
            return r0
        L1a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private <Model, Data> void tearDown(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.load.model.ModelLoaderFactory r0 = (com.bumptech.glide.load.model.ModelLoaderFactory) r0
            r0.teardown()
            goto L4
        L14:
            return
    }

    public synchronized <Model, Data> void append(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r1.multiModelLoaderFactory     // Catch: java.lang.Throwable -> Ld
            r0.append(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r2 = r1.cache     // Catch: java.lang.Throwable -> Ld
            r2.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> build(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r1.multiModelLoaderFactory     // Catch: java.lang.Throwable -> L9
            com.bumptech.glide.load.model.ModelLoader r2 = r0.build(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.NonNull
    public synchronized java.util.List<java.lang.Class<?>> getDataClasses(@androidx.annotation.NonNull java.lang.Class<?> r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r1.multiModelLoaderFactory     // Catch: java.lang.Throwable -> L9
            java.util.List r2 = r0.getDataClasses(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @androidx.annotation.NonNull
    public <A> java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> getModelLoaders(@androidx.annotation.NonNull A r9) {
            r8 = this;
            java.lang.Class r0 = getClass(r9)
            java.util.List r0 = r8.getModelLoadersForClass(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L44
            int r1 = r0.size()
            java.util.List r2 = java.util.Collections.emptyList()
            r3 = 0
            r4 = 1
            r5 = 0
        L19:
            if (r5 >= r1) goto L37
            java.lang.Object r6 = r0.get(r5)
            com.bumptech.glide.load.model.ModelLoader r6 = (com.bumptech.glide.load.model.ModelLoader) r6
            boolean r7 = r6.handles(r9)
            if (r7 == 0) goto L34
            if (r4 == 0) goto L31
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r1 - r5
            r2.<init>(r4)
            r4 = 0
        L31:
            r2.add(r6)
        L34:
            int r5 = r5 + 1
            goto L19
        L37:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L3e
            return r2
        L3e:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r1 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException
            r1.<init>(r9, r0)
            throw r1
        L44:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException
            r0.<init>(r9)
            throw r0
    }

    public synchronized <Model, Data> void prepend(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r1.multiModelLoaderFactory     // Catch: java.lang.Throwable -> Ld
            r0.prepend(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r2 = r1.cache     // Catch: java.lang.Throwable -> Ld
            r2.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <Model, Data> void remove(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r1.multiModelLoaderFactory     // Catch: java.lang.Throwable -> L11
            java.util.List r2 = r0.remove(r2, r3)     // Catch: java.lang.Throwable -> L11
            r1.tearDown(r2)     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r2 = r1.cache     // Catch: java.lang.Throwable -> L11
            r2.clear()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized <Model, Data> void replace(@androidx.annotation.NonNull java.lang.Class<Model> r2, @androidx.annotation.NonNull java.lang.Class<Data> r3, @androidx.annotation.NonNull com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> r4) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.model.MultiModelLoaderFactory r0 = r1.multiModelLoaderFactory     // Catch: java.lang.Throwable -> L11
            java.util.List r2 = r0.replace(r2, r3, r4)     // Catch: java.lang.Throwable -> L11
            r1.tearDown(r2)     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.load.model.ModelLoaderRegistry$ModelLoaderCache r2 = r1.cache     // Catch: java.lang.Throwable -> L11
            r2.clear()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
