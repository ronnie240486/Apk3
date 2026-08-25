package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class GlideContext extends android.content.ContextWrapper {

    @androidx.annotation.VisibleForTesting
    public static final com.bumptech.glide.TransitionOptions<?, ?> DEFAULT_TRANSITION_OPTIONS = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.request.RequestOptions defaultRequestOptions;
    private final com.bumptech.glide.Glide.RequestOptionsFactory defaultRequestOptionsFactory;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> defaultTransitionOptions;
    private final com.bumptech.glide.load.engine.Engine engine;
    private final com.bumptech.glide.GlideExperiments experiments;
    private final com.bumptech.glide.request.target.ImageViewTargetFactory imageViewTargetFactory;
    private final int logLevel;
    private final com.bumptech.glide.Registry registry;

    static {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.GlideContext.DEFAULT_TRANSITION_OPTIONS = r0
            return
    }

    public GlideContext(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2, @androidx.annotation.NonNull com.bumptech.glide.Registry r3, @androidx.annotation.NonNull com.bumptech.glide.request.target.ImageViewTargetFactory r4, @androidx.annotation.NonNull com.bumptech.glide.Glide.RequestOptionsFactory r5, @androidx.annotation.NonNull java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r6, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r7, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Engine r8, @androidx.annotation.NonNull com.bumptech.glide.GlideExperiments r9, int r10) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            r0.<init>(r1)
            r0.arrayPool = r2
            r0.registry = r3
            r0.imageViewTargetFactory = r4
            r0.defaultRequestOptionsFactory = r5
            r0.defaultRequestListeners = r7
            r0.defaultTransitionOptions = r6
            r0.engine = r8
            r0.experiments = r9
            r0.logLevel = r10
            return
    }

    @androidx.annotation.NonNull
    public <X> com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, X> buildImageViewTarget(@androidx.annotation.NonNull android.widget.ImageView r2, @androidx.annotation.NonNull java.lang.Class<X> r3) {
            r1 = this;
            com.bumptech.glide.request.target.ImageViewTargetFactory r0 = r1.imageViewTargetFactory
            com.bumptech.glide.request.target.ViewTarget r2 = r0.buildTarget(r2, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool getArrayPool() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            return r0
    }

    public java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> getDefaultRequestListeners() {
            r1 = this;
            java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r0 = r1.defaultRequestListeners
            return r0
    }

    public synchronized com.bumptech.glide.request.RequestOptions getDefaultRequestOptions() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.RequestOptions r0 = r1.defaultRequestOptions     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            com.bumptech.glide.Glide$RequestOptionsFactory r0 = r1.defaultRequestOptionsFactory     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.request.RequestOptions r0 = r0.build()     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.lock()     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0     // Catch: java.lang.Throwable -> L17
            r1.defaultRequestOptions = r0     // Catch: java.lang.Throwable -> L17
        L13:
            com.bumptech.glide.request.RequestOptions r0 = r1.defaultRequestOptions     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public <T> com.bumptech.glide.TransitionOptions<?, T> getDefaultTransitionOptions(@androidx.annotation.NonNull java.lang.Class<T> r5) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r0 = r4.defaultTransitionOptions
            java.lang.Object r0 = r0.get(r5)
            com.bumptech.glide.TransitionOptions r0 = (com.bumptech.glide.TransitionOptions) r0
            if (r0 != 0) goto L33
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r1 = r4.defaultTransitionOptions
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L14
            java.lang.Object r0 = r2.getValue()
            com.bumptech.glide.TransitionOptions r0 = (com.bumptech.glide.TransitionOptions) r0
            goto L14
        L33:
            if (r0 != 0) goto L37
            com.bumptech.glide.TransitionOptions<?, ?> r0 = com.bumptech.glide.GlideContext.DEFAULT_TRANSITION_OPTIONS
        L37:
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.Engine getEngine() {
            r1 = this;
            com.bumptech.glide.load.engine.Engine r0 = r1.engine
            return r0
    }

    public com.bumptech.glide.GlideExperiments getExperiments() {
            r1 = this;
            com.bumptech.glide.GlideExperiments r0 = r1.experiments
            return r0
    }

    public int getLogLevel() {
            r1 = this;
            int r0 = r1.logLevel
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.Registry getRegistry() {
            r1 = this;
            com.bumptech.glide.Registry r0 = r1.registry
            return r0
    }
}
