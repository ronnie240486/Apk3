package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
class MultiModelLoader<Model, Data> implements com.bumptech.glide.load.model.ModelLoader<Model, Data> {
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> exceptionListPool;
    private final java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> modelLoaders;

    public static class MultiFetcher<Data> implements com.bumptech.glide.load.data.DataFetcher<Data>, com.bumptech.glide.load.data.DataFetcher.DataCallback<Data> {
        private com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Data> callback;
        private int currentIndex;

        @androidx.annotation.Nullable
        private java.util.List<java.lang.Throwable> exceptions;
        private final java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> fetchers;
        private boolean isCancelled;
        private com.bumptech.glide.Priority priority;
        private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> throwableListPool;

        public MultiFetcher(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r1, @androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
                r0 = this;
                r0.<init>()
                r0.throwableListPool = r2
                com.bumptech.glide.util.Preconditions.checkNotEmpty(r1)
                r0.fetchers = r1
                r1 = 0
                r0.currentIndex = r1
                return
        }

        private void startNextOrFail() {
                r4 = this;
                boolean r0 = r4.isCancelled
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r4.currentIndex
                java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r1 = r4.fetchers
                int r1 = r1.size()
                int r1 = r1 + (-1)
                if (r0 >= r1) goto L1f
                int r0 = r4.currentIndex
                int r0 = r0 + 1
                r4.currentIndex = r0
                com.bumptech.glide.Priority r0 = r4.priority
                com.bumptech.glide.load.data.DataFetcher$DataCallback<? super Data> r1 = r4.callback
                r4.loadData(r0, r1)
                goto L37
            L1f:
                java.util.List<java.lang.Throwable> r0 = r4.exceptions
                com.bumptech.glide.util.Preconditions.checkNotNull(r0)
                com.bumptech.glide.load.data.DataFetcher$DataCallback<? super Data> r0 = r4.callback
                com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List<java.lang.Throwable> r3 = r4.exceptions
                r2.<init>(r3)
                java.lang.String r3 = "Fetch failed"
                r1.<init>(r3, r2)
                r0.onLoadFailed(r1)
            L37:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
                r2 = this;
                r0 = 1
                r2.isCancelled = r0
                java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r0 = r2.fetchers
                java.util.Iterator r0 = r0.iterator()
            L9:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.load.data.DataFetcher r1 = (com.bumptech.glide.load.data.DataFetcher) r1
                r1.cancel()
                goto L9
            L19:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
                r2 = this;
                java.util.List<java.lang.Throwable> r0 = r2.exceptions
                if (r0 == 0) goto L9
                androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r1 = r2.throwableListPool
                r1.release(r0)
            L9:
                r0 = 0
                r2.exceptions = r0
                java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r0 = r2.fetchers
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.load.data.DataFetcher r1 = (com.bumptech.glide.load.data.DataFetcher) r1
                r1.cleanup()
                goto L12
            L22:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public java.lang.Class<Data> getDataClass() {
                r2 = this;
                java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r0 = r2.fetchers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bumptech.glide.load.data.DataFetcher r0 = (com.bumptech.glide.load.data.DataFetcher) r0
                java.lang.Class r0 = r0.getDataClass()
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.DataSource getDataSource() {
                r2 = this;
                java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r0 = r2.fetchers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bumptech.glide.load.data.DataFetcher r0 = (com.bumptech.glide.load.data.DataFetcher) r0
                com.bumptech.glide.load.DataSource r0 = r0.getDataSource()
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@androidx.annotation.NonNull com.bumptech.glide.Priority r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Data> r3) {
                r1 = this;
                r1.priority = r2
                r1.callback = r3
                androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r3 = r1.throwableListPool
                java.lang.Object r3 = r3.acquire()
                java.util.List r3 = (java.util.List) r3
                r1.exceptions = r3
                java.util.List<com.bumptech.glide.load.data.DataFetcher<Data>> r3 = r1.fetchers
                int r0 = r1.currentIndex
                java.lang.Object r3 = r3.get(r0)
                com.bumptech.glide.load.data.DataFetcher r3 = (com.bumptech.glide.load.data.DataFetcher) r3
                r3.loadData(r2, r1)
                boolean r2 = r1.isCancelled
                if (r2 == 0) goto L22
                r1.cancel()
            L22:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onDataReady(@androidx.annotation.Nullable Data r2) {
                r1 = this;
                if (r2 == 0) goto L8
                com.bumptech.glide.load.data.DataFetcher$DataCallback<? super Data> r0 = r1.callback
                r0.onDataReady(r2)
                goto Lb
            L8:
                r1.startNextOrFail()
            Lb:
                return
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onLoadFailed(@androidx.annotation.NonNull java.lang.Exception r2) {
                r1 = this;
                java.util.List<java.lang.Throwable> r0 = r1.exceptions
                java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
                java.util.List r0 = (java.util.List) r0
                r0.add(r2)
                r1.startNextOrFail()
                return
        }
    }

    public MultiModelLoader(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r1, @androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
            r0 = this;
            r0.<init>()
            r0.modelLoaders = r1
            r0.exceptionListPool = r2
            return
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(@androidx.annotation.NonNull Model r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.Options r11) {
            r7 = this;
            java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r0 = r7.modelLoaders
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 0
            r4 = r2
        Le:
            if (r3 >= r0) goto L2e
            java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r5 = r7.modelLoaders
            java.lang.Object r5 = r5.get(r3)
            com.bumptech.glide.load.model.ModelLoader r5 = (com.bumptech.glide.load.model.ModelLoader) r5
            boolean r6 = r5.handles(r8)
            if (r6 == 0) goto L2b
            com.bumptech.glide.load.model.ModelLoader$LoadData r5 = r5.buildLoadData(r8, r9, r10, r11)
            if (r5 == 0) goto L2b
            com.bumptech.glide.load.Key r4 = r5.sourceKey
            com.bumptech.glide.load.data.DataFetcher<Data> r5 = r5.fetcher
            r1.add(r5)
        L2b:
            int r3 = r3 + 1
            goto Le
        L2e:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L42
            if (r4 == 0) goto L42
            com.bumptech.glide.load.model.ModelLoader$LoadData r2 = new com.bumptech.glide.load.model.ModelLoader$LoadData
            com.bumptech.glide.load.model.MultiModelLoader$MultiFetcher r8 = new com.bumptech.glide.load.model.MultiModelLoader$MultiFetcher
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r7.exceptionListPool
            r8.<init>(r1, r9)
            r2.<init>(r4, r8)
        L42:
            return r2
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@androidx.annotation.NonNull Model r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r0 = r2.modelLoaders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.model.ModelLoader r1 = (com.bumptech.glide.load.model.ModelLoader) r1
            boolean r1 = r1.handles(r3)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MultiModelLoader{modelLoaders="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, Data>> r1 = r2.modelLoaders
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
