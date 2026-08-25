package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleRequest<R> implements com.bumptech.glide.request.Request, com.bumptech.glide.request.target.SizeReadyCallback, com.bumptech.glide.request.ResourceCallback {
    private static final java.lang.String GLIDE_TAG = "Glide";
    private static final boolean IS_VERBOSE_LOGGABLE = false;
    private static final java.lang.String TAG = "Request";
    private final com.bumptech.glide.request.transition.TransitionFactory<? super R> animationFactory;
    private final java.util.concurrent.Executor callbackExecutor;
    private final android.content.Context context;
    private volatile com.bumptech.glide.load.engine.Engine engine;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable errorDrawable;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable fallbackDrawable;
    private final com.bumptech.glide.GlideContext glideContext;

    @androidx.annotation.GuardedBy("requestLock")
    private int height;

    @androidx.annotation.GuardedBy("requestLock")
    private boolean isCallingCallbacks;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.load.engine.Engine.LoadStatus loadStatus;

    @androidx.annotation.Nullable
    private final java.lang.Object model;
    private final int overrideHeight;
    private final int overrideWidth;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable placeholderDrawable;
    private final com.bumptech.glide.Priority priority;
    private final com.bumptech.glide.request.RequestCoordinator requestCoordinator;

    @androidx.annotation.Nullable
    private final java.util.List<com.bumptech.glide.request.RequestListener<R>> requestListeners;
    private final java.lang.Object requestLock;
    private final com.bumptech.glide.request.BaseRequestOptions<?> requestOptions;

    @androidx.annotation.Nullable
    private java.lang.RuntimeException requestOrigin;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.load.engine.Resource<R> resource;

    @androidx.annotation.GuardedBy("requestLock")
    private long startTime;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;

    @androidx.annotation.GuardedBy("requestLock")
    private com.bumptech.glide.request.SingleRequest.Status status;

    @androidx.annotation.Nullable
    private final java.lang.String tag;
    private final com.bumptech.glide.request.target.Target<R> target;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.request.RequestListener<R> targetListener;
    private final java.lang.Class<R> transcodeClass;

    @androidx.annotation.GuardedBy("requestLock")
    private int width;

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Status extends java.lang.Enum<com.bumptech.glide.request.SingleRequest.Status> {
        private static final /* synthetic */ com.bumptech.glide.request.SingleRequest.Status[] $VALUES = null;
        public static final com.bumptech.glide.request.SingleRequest.Status CLEARED = null;
        public static final com.bumptech.glide.request.SingleRequest.Status COMPLETE = null;
        public static final com.bumptech.glide.request.SingleRequest.Status FAILED = null;
        public static final com.bumptech.glide.request.SingleRequest.Status PENDING = null;
        public static final com.bumptech.glide.request.SingleRequest.Status RUNNING = null;
        public static final com.bumptech.glide.request.SingleRequest.Status WAITING_FOR_SIZE = null;

        static {
                com.bumptech.glide.request.SingleRequest$Status r0 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.request.SingleRequest.Status.PENDING = r0
                com.bumptech.glide.request.SingleRequest$Status r1 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.request.SingleRequest.Status.RUNNING = r1
                com.bumptech.glide.request.SingleRequest$Status r3 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r5 = "WAITING_FOR_SIZE"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE = r3
                com.bumptech.glide.request.SingleRequest$Status r5 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r7 = "COMPLETE"
                r8 = 3
                r5.<init>(r7, r8)
                com.bumptech.glide.request.SingleRequest.Status.COMPLETE = r5
                com.bumptech.glide.request.SingleRequest$Status r7 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r9 = "FAILED"
                r10 = 4
                r7.<init>(r9, r10)
                com.bumptech.glide.request.SingleRequest.Status.FAILED = r7
                com.bumptech.glide.request.SingleRequest$Status r9 = new com.bumptech.glide.request.SingleRequest$Status
                java.lang.String r11 = "CLEARED"
                r12 = 5
                r9.<init>(r11, r12)
                com.bumptech.glide.request.SingleRequest.Status.CLEARED = r9
                r11 = 6
                com.bumptech.glide.request.SingleRequest$Status[] r11 = new com.bumptech.glide.request.SingleRequest.Status[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.bumptech.glide.request.SingleRequest.Status.$VALUES = r11
                return
        }

        private Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.request.SingleRequest.Status valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.request.SingleRequest$Status> r0 = com.bumptech.glide.request.SingleRequest.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.request.SingleRequest$Status r1 = (com.bumptech.glide.request.SingleRequest.Status) r1
                return r1
        }

        public static com.bumptech.glide.request.SingleRequest.Status[] values() {
                com.bumptech.glide.request.SingleRequest$Status[] r0 = com.bumptech.glide.request.SingleRequest.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.request.SingleRequest$Status[] r0 = (com.bumptech.glide.request.SingleRequest.Status[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "Request"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE = r0
            return
    }

    private SingleRequest(android.content.Context r4, com.bumptech.glide.GlideContext r5, @androidx.annotation.NonNull java.lang.Object r6, @androidx.annotation.Nullable java.lang.Object r7, java.lang.Class<R> r8, com.bumptech.glide.request.BaseRequestOptions<?> r9, int r10, int r11, com.bumptech.glide.Priority r12, com.bumptech.glide.request.target.Target<R> r13, @androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<R> r14, @androidx.annotation.Nullable java.util.List<com.bumptech.glide.request.RequestListener<R>> r15, com.bumptech.glide.request.RequestCoordinator r16, com.bumptech.glide.load.engine.Engine r17, com.bumptech.glide.request.transition.TransitionFactory<? super R> r18, java.util.concurrent.Executor r19) {
            r3 = this;
            r0 = r3
            r3.<init>()
            boolean r1 = com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE
            if (r1 == 0) goto L11
            int r1 = r3.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L12
        L11:
            r1 = 0
        L12:
            r0.tag = r1
            com.bumptech.glide.util.pool.StateVerifier r1 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r0.stateVerifier = r1
            r1 = r6
            r0.requestLock = r1
            r1 = r4
            r0.context = r1
            r1 = r5
            r0.glideContext = r1
            r2 = r7
            r0.model = r2
            r2 = r8
            r0.transcodeClass = r2
            r2 = r9
            r0.requestOptions = r2
            r2 = r10
            r0.overrideWidth = r2
            r2 = r11
            r0.overrideHeight = r2
            r2 = r12
            r0.priority = r2
            r2 = r13
            r0.target = r2
            r2 = r14
            r0.targetListener = r2
            r2 = r15
            r0.requestListeners = r2
            r2 = r16
            r0.requestCoordinator = r2
            r2 = r17
            r0.engine = r2
            r2 = r18
            r0.animationFactory = r2
            r2 = r19
            r0.callbackExecutor = r2
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.PENDING
            r0.status = r2
            java.lang.RuntimeException r2 = r0.requestOrigin
            if (r2 != 0) goto L6b
            com.bumptech.glide.GlideExperiments r1 = r5.getExperiments()
            java.lang.Class<com.bumptech.glide.GlideBuilder$LogRequestOrigins> r2 = com.bumptech.glide.GlideBuilder.LogRequestOrigins.class
            boolean r1 = r1.isEnabled(r2)
            if (r1 == 0) goto L6b
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Glide request origin trace"
            r1.<init>(r2)
            r0.requestOrigin = r1
        L6b:
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void assertNotCallingCallbacks() {
            r2 = this;
            boolean r0 = r2.isCallingCallbacks
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean canNotifyCleared() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyCleared(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean canNotifyStatusChanged() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto Ld
            boolean r0 = r0.canNotifyStatusChanged(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean canSetResource() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto Ld
            boolean r0 = r0.canSetImage(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void cancel() {
            r1 = this;
            r1.assertNotCallingCallbacks()
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            r0.throwIfRecycled()
            com.bumptech.glide.request.target.Target<R> r0 = r1.target
            r0.removeCallback(r1)
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r1.loadStatus
            if (r0 == 0) goto L17
            r0.cancel()
            r0 = 0
            r1.loadStatus = r0
        L17:
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable getErrorDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.errorDrawable
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            android.graphics.drawable.Drawable r0 = r0.getErrorPlaceholder()
            r1.errorDrawable = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getErrorId()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getErrorId()
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r1.errorDrawable = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.errorDrawable
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable getFallbackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.fallbackDrawable
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            android.graphics.drawable.Drawable r0 = r0.getFallbackDrawable()
            r1.fallbackDrawable = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getFallbackId()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getFallbackId()
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r1.fallbackDrawable = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.fallbackDrawable
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable getPlaceholderDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.placeholderDrawable
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            android.graphics.drawable.Drawable r0 = r0.getPlaceholderDrawable()
            r1.placeholderDrawable = r0
            if (r0 != 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getPlaceholderId()
            if (r0 <= 0) goto L22
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r1.requestOptions
            int r0 = r0.getPlaceholderId()
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r1.placeholderDrawable = r0
        L22:
            android.graphics.drawable.Drawable r0 = r1.placeholderDrawable
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private boolean isFirstReadyResource() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto L11
            com.bumptech.glide.request.RequestCoordinator r0 = r0.getRoot()
            boolean r0 = r0.isAnyResourceSet()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @androidx.annotation.GuardedBy("requestLock")
    private android.graphics.drawable.Drawable loadDrawable(@androidx.annotation.DrawableRes int r3) {
            r2 = this;
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r2.requestOptions
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto Lf
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r2.requestOptions
            android.content.res.Resources$Theme r0 = r0.getTheme()
            goto L15
        Lf:
            android.content.Context r0 = r2.context
            android.content.res.Resources$Theme r0 = r0.getTheme()
        L15:
            com.bumptech.glide.GlideContext r1 = r2.glideContext
            android.graphics.drawable.Drawable r3 = com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.getDrawable(r1, r3, r0)
            return r3
    }

    private void logV(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = " this: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r2, r0)
            java.lang.String r0 = r1.tag
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Request"
            android.util.Log.v(r0, r2)
            return
    }

    private static int maybeApplySizeMultiplier(int r1, float r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L5
            goto Lc
        L5:
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
        Lc:
            return r1
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void notifyLoadFailed() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto L7
            r0.onRequestFailed(r1)
        L7:
            return
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void notifyLoadSuccess() {
            r1 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r1.requestCoordinator
            if (r0 == 0) goto L7
            r0.onRequestSuccess(r1)
        L7:
            return
    }

    public static <R> com.bumptech.glide.request.SingleRequest<R> obtain(android.content.Context r18, com.bumptech.glide.GlideContext r19, java.lang.Object r20, java.lang.Object r21, java.lang.Class<R> r22, com.bumptech.glide.request.BaseRequestOptions<?> r23, int r24, int r25, com.bumptech.glide.Priority r26, com.bumptech.glide.request.target.Target<R> r27, com.bumptech.glide.request.RequestListener<R> r28, @androidx.annotation.Nullable java.util.List<com.bumptech.glide.request.RequestListener<R>> r29, com.bumptech.glide.request.RequestCoordinator r30, com.bumptech.glide.load.engine.Engine r31, com.bumptech.glide.request.transition.TransitionFactory<? super R> r32, java.util.concurrent.Executor r33) {
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            com.bumptech.glide.request.SingleRequest r17 = new com.bumptech.glide.request.SingleRequest
            r0 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r17
    }

    private void onLoadFailed(com.bumptech.glide.load.engine.GlideException r9, int r10) {
            r8 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r8.stateVerifier
            r0.throwIfRecycled()
            java.lang.Object r0 = r8.requestLock
            monitor-enter(r0)
            java.lang.RuntimeException r1 = r8.requestOrigin     // Catch: java.lang.Throwable -> La4
            r9.setOrigin(r1)     // Catch: java.lang.Throwable -> La4
            com.bumptech.glide.GlideContext r1 = r8.glideContext     // Catch: java.lang.Throwable -> La4
            int r1 = r1.getLogLevel()     // Catch: java.lang.Throwable -> La4
            if (r1 > r10) goto L4f
            java.lang.String r10 = "Glide"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r2.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "Load failed for "
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r3 = r8.model     // Catch: java.lang.Throwable -> La4
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = " with size ["
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            int r3 = r8.width     // Catch: java.lang.Throwable -> La4
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            int r3 = r8.height     // Catch: java.lang.Throwable -> La4
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La4
            android.util.Log.w(r10, r2, r9)     // Catch: java.lang.Throwable -> La4
            r10 = 4
            if (r1 > r10) goto L4f
            java.lang.String r10 = "Glide"
            r9.logRootCauses(r10)     // Catch: java.lang.Throwable -> La4
        L4f:
            r10 = 0
            r8.loadStatus = r10     // Catch: java.lang.Throwable -> La4
            com.bumptech.glide.request.SingleRequest$Status r10 = com.bumptech.glide.request.SingleRequest.Status.FAILED     // Catch: java.lang.Throwable -> La4
            r8.status = r10     // Catch: java.lang.Throwable -> La4
            r10 = 1
            r8.isCallingCallbacks = r10     // Catch: java.lang.Throwable -> La4
            r1 = 0
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r2 = r8.requestListeners     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L7d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La0
            r3 = 0
        L63:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> La0
            com.bumptech.glide.request.RequestListener r4 = (com.bumptech.glide.request.RequestListener) r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r8.model     // Catch: java.lang.Throwable -> La0
            com.bumptech.glide.request.target.Target<R> r6 = r8.target     // Catch: java.lang.Throwable -> La0
            boolean r7 = r8.isFirstReadyResource()     // Catch: java.lang.Throwable -> La0
            boolean r4 = r4.onLoadFailed(r9, r5, r6, r7)     // Catch: java.lang.Throwable -> La0
            r3 = r3 | r4
            goto L63
        L7d:
            r3 = 0
        L7e:
            com.bumptech.glide.request.RequestListener<R> r2 = r8.targetListener     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L91
            java.lang.Object r4 = r8.model     // Catch: java.lang.Throwable -> La0
            com.bumptech.glide.request.target.Target<R> r5 = r8.target     // Catch: java.lang.Throwable -> La0
            boolean r6 = r8.isFirstReadyResource()     // Catch: java.lang.Throwable -> La0
            boolean r9 = r2.onLoadFailed(r9, r4, r5, r6)     // Catch: java.lang.Throwable -> La0
            if (r9 == 0) goto L91
            goto L92
        L91:
            r10 = 0
        L92:
            r9 = r3 | r10
            if (r9 != 0) goto L99
            r8.setErrorPlaceholder()     // Catch: java.lang.Throwable -> La0
        L99:
            r8.isCallingCallbacks = r1     // Catch: java.lang.Throwable -> La4
            r8.notifyLoadFailed()     // Catch: java.lang.Throwable -> La4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            return
        La0:
            r9 = move-exception
            r8.isCallingCallbacks = r1     // Catch: java.lang.Throwable -> La4
            throw r9     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r9
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void onResourceReady(com.bumptech.glide.load.engine.Resource<R> r10, R r11, com.bumptech.glide.load.DataSource r12, boolean r13) {
            r9 = this;
            boolean r13 = r9.isFirstReadyResource()
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE
            r9.status = r0
            r9.resource = r10
            com.bumptech.glide.GlideContext r10 = r9.glideContext
            int r10 = r10.getLogLevel()
            r0 = 3
            if (r10 > r0) goto L67
            java.lang.String r10 = "Finished loading "
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.model
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.width
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.height
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.startTime
            double r0 = com.bumptech.glide.util.LogTime.getElapsedMillis(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r10)
        L67:
            r10 = 1
            r9.isCallingCallbacks = r10
            r6 = 0
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r9.requestListeners     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L8e
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> Lb6
            r0 = 0
            r8 = 0
        L75:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.RequestListener r0 = (com.bumptech.glide.request.RequestListener) r0     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r2 = r9.model     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.target.Target<R> r3 = r9.target     // Catch: java.lang.Throwable -> Lb6
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb6
            r8 = r8 | r0
            goto L75
        L8e:
            r8 = 0
        L8f:
            com.bumptech.glide.request.RequestListener<R> r0 = r9.targetListener     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto La1
            java.lang.Object r2 = r9.model     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.target.Target<R> r3 = r9.target     // Catch: java.lang.Throwable -> Lb6
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto La1
            goto La2
        La1:
            r10 = 0
        La2:
            r10 = r10 | r8
            if (r10 != 0) goto Lb0
            com.bumptech.glide.request.transition.TransitionFactory<? super R> r10 = r9.animationFactory     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.transition.Transition r10 = r10.build(r12, r13)     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.target.Target<R> r12 = r9.target     // Catch: java.lang.Throwable -> Lb6
            r12.onResourceReady(r11, r10)     // Catch: java.lang.Throwable -> Lb6
        Lb0:
            r9.isCallingCallbacks = r6
            r9.notifyLoadSuccess()
            return
        Lb6:
            r10 = move-exception
            r9.isCallingCallbacks = r6
            throw r10
    }

    @androidx.annotation.GuardedBy("requestLock")
    private void setErrorPlaceholder() {
            r2 = this;
            boolean r0 = r2.canNotifyStatusChanged()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            java.lang.Object r1 = r2.model
            if (r1 != 0) goto L10
            android.graphics.drawable.Drawable r0 = r2.getFallbackDrawable()
        L10:
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.getErrorDrawable()
        L16:
            if (r0 != 0) goto L1c
            android.graphics.drawable.Drawable r0 = r2.getPlaceholderDrawable()
        L1c:
            com.bumptech.glide.request.target.Target<R> r1 = r2.target
            r1.onLoadFailed(r0)
            return
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
            r5 = this;
            java.lang.Object r0 = r5.requestLock
            monitor-enter(r0)
            r5.assertNotCallingCallbacks()     // Catch: java.lang.Throwable -> La8
            com.bumptech.glide.util.pool.StateVerifier r1 = r5.stateVerifier     // Catch: java.lang.Throwable -> La8
            r1.throwIfRecycled()     // Catch: java.lang.Throwable -> La8
            long r1 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> La8
            r5.startTime = r1     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = r5.model     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L3c
            int r1 = r5.overrideWidth     // Catch: java.lang.Throwable -> La8
            int r2 = r5.overrideHeight     // Catch: java.lang.Throwable -> La8
            boolean r1 = com.bumptech.glide.util.Util.isValidDimensions(r1, r2)     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L27
            int r1 = r5.overrideWidth     // Catch: java.lang.Throwable -> La8
            r5.width = r1     // Catch: java.lang.Throwable -> La8
            int r1 = r5.overrideHeight     // Catch: java.lang.Throwable -> La8
            r5.height = r1     // Catch: java.lang.Throwable -> La8
        L27:
            android.graphics.drawable.Drawable r1 = r5.getFallbackDrawable()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L2f
            r1 = 5
            goto L30
        L2f:
            r1 = 3
        L30:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La8
            r5.onLoadFailed(r2, r1)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            return
        L3c:
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.status     // Catch: java.lang.Throwable -> La8
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> La8
            if (r1 == r2) goto La0
            com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> La8
            if (r1 != r3) goto L50
            com.bumptech.glide.load.engine.Resource<R> r1 = r5.resource     // Catch: java.lang.Throwable -> La8
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch: java.lang.Throwable -> La8
            r3 = 0
            r5.onResourceReady(r1, r2, r3)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            return
        L50:
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> La8
            r5.status = r1     // Catch: java.lang.Throwable -> La8
            int r3 = r5.overrideWidth     // Catch: java.lang.Throwable -> La8
            int r4 = r5.overrideHeight     // Catch: java.lang.Throwable -> La8
            boolean r3 = com.bumptech.glide.util.Util.isValidDimensions(r3, r4)     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto L66
            int r3 = r5.overrideWidth     // Catch: java.lang.Throwable -> La8
            int r4 = r5.overrideHeight     // Catch: java.lang.Throwable -> La8
            r5.onSizeReady(r3, r4)     // Catch: java.lang.Throwable -> La8
            goto L6b
        L66:
            com.bumptech.glide.request.target.Target<R> r3 = r5.target     // Catch: java.lang.Throwable -> La8
            r3.getSize(r5)     // Catch: java.lang.Throwable -> La8
        L6b:
            com.bumptech.glide.request.SingleRequest$Status r3 = r5.status     // Catch: java.lang.Throwable -> La8
            if (r3 == r2) goto L71
            if (r3 != r1) goto L80
        L71:
            boolean r1 = r5.canNotifyStatusChanged()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L80
            com.bumptech.glide.request.target.Target<R> r1 = r5.target     // Catch: java.lang.Throwable -> La8
            android.graphics.drawable.Drawable r2 = r5.getPlaceholderDrawable()     // Catch: java.lang.Throwable -> La8
            r1.onLoadStarted(r2)     // Catch: java.lang.Throwable -> La8
        L80:
            boolean r1 = com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r1.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch: java.lang.Throwable -> La8
            long r2 = r5.startTime     // Catch: java.lang.Throwable -> La8
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> La8
            r1.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La8
            r5.logV(r1)     // Catch: java.lang.Throwable -> La8
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            return
        La0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La8
            throw r1     // Catch: java.lang.Throwable -> La8
        La8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
            r5 = this;
            java.lang.Object r0 = r5.requestLock
            monitor-enter(r0)
            r5.assertNotCallingCallbacks()     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.util.pool.StateVerifier r1 = r5.stateVerifier     // Catch: java.lang.Throwable -> L39
            r1.throwIfRecycled()     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.status     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> L39
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return
        L13:
            r5.cancel()     // Catch: java.lang.Throwable -> L39
            com.bumptech.glide.load.engine.Resource<R> r1 = r5.resource     // Catch: java.lang.Throwable -> L39
            r3 = 0
            if (r1 == 0) goto L1e
            r5.resource = r3     // Catch: java.lang.Throwable -> L39
            goto L1f
        L1e:
            r1 = r3
        L1f:
            boolean r3 = r5.canNotifyCleared()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L2e
            com.bumptech.glide.request.target.Target<R> r3 = r5.target     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r4 = r5.getPlaceholderDrawable()     // Catch: java.lang.Throwable -> L39
            r3.onLoadCleared(r4)     // Catch: java.lang.Throwable -> L39
        L2e:
            r5.status = r2     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L38
            com.bumptech.glide.load.engine.Engine r0 = r5.engine
            r0.release(r1)
        L38:
            return
        L39:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public java.lang.Object getLock() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            r0.throwIfRecycled()
            java.lang.Object r0 = r1.requestLock
            return r0
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(com.bumptech.glide.request.Request r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof com.bumptech.glide.request.SingleRequest
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.requestLock
            monitor-enter(r2)
            int r4 = r1.overrideWidth     // Catch: java.lang.Throwable -> L61
            int r5 = r1.overrideHeight     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r1.model     // Catch: java.lang.Throwable -> L61
            java.lang.Class<R> r7 = r1.transcodeClass     // Catch: java.lang.Throwable -> L61
            com.bumptech.glide.request.BaseRequestOptions<?> r8 = r1.requestOptions     // Catch: java.lang.Throwable -> L61
            com.bumptech.glide.Priority r9 = r1.priority     // Catch: java.lang.Throwable -> L61
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r10 = r1.requestListeners     // Catch: java.lang.Throwable -> L61
            if (r10 == 0) goto L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L61
            goto L23
        L22:
            r10 = 0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            com.bumptech.glide.request.SingleRequest r0 = (com.bumptech.glide.request.SingleRequest) r0
            java.lang.Object r11 = r0.requestLock
            monitor-enter(r11)
            int r2 = r0.overrideWidth     // Catch: java.lang.Throwable -> L5e
            int r12 = r0.overrideHeight     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r13 = r0.model     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<R> r14 = r0.transcodeClass     // Catch: java.lang.Throwable -> L5e
            com.bumptech.glide.request.BaseRequestOptions<?> r15 = r0.requestOptions     // Catch: java.lang.Throwable -> L5e
            com.bumptech.glide.Priority r3 = r0.priority     // Catch: java.lang.Throwable -> L5e
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r0.requestListeners     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L3e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L5e
            goto L3f
        L3e:
            r0 = 0
        L3f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5e
            if (r4 != r2) goto L5c
            if (r5 != r12) goto L5c
            boolean r2 = com.bumptech.glide.util.Util.bothModelsNullEquivalentOrEquals(r6, r13)
            if (r2 == 0) goto L5c
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L5c
            boolean r2 = r8.equals(r15)
            if (r2 == 0) goto L5c
            if (r9 != r3) goto L5c
            if (r10 != r0) goto L5c
            r3 = 1
            goto L5d
        L5c:
            r3 = 0
        L5d:
            return r3
        L5e:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5e
            throw r0
        L61:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            throw r0
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.requestLock
            monitor-enter(r0)
            com.bumptech.glide.request.SingleRequest$Status r1 = r3.status     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> L13
            if (r1 == r2) goto L10
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L13
            if (r1 != r2) goto Le
            goto L10
        Le:
            r1 = 0
            goto L11
        L10:
            r1 = 1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(com.bumptech.glide.load.engine.GlideException r2) {
            r1 = this;
            r0 = 5
            r1.onLoadFailed(r2, r0)
            return
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(com.bumptech.glide.load.engine.Resource<?> r6, com.bumptech.glide.load.DataSource r7, boolean r8) {
            r5 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r5.stateVerifier
            r0.throwIfRecycled()
            r0 = 0
            java.lang.Object r1 = r5.requestLock     // Catch: java.lang.Throwable -> Lb8
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb8
            r5.loadStatus = r0     // Catch: java.lang.Throwable -> Lb5
            if (r6 != 0) goto L2f
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r7.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = "Expected to receive a Resource<R> with an object of "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Class<R> r8 = r5.transcodeClass     // Catch: java.lang.Throwable -> Lb5
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = " inside, but instead got null."
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb5
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb5
            r5.onLoadFailed(r6)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb5
            return
        L2f:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto L5a
            java.lang.Class<R> r3 = r5.transcodeClass     // Catch: java.lang.Throwable -> Lb5
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Lb5
            if (r3 != 0) goto L42
            goto L5a
        L42:
            boolean r3 = r5.canSetResource()     // Catch: java.lang.Throwable -> Lb5
            if (r3 != 0) goto L55
            r5.resource = r0     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.request.SingleRequest$Status r7 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Lb1
            r5.status = r7     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r6)
            return
        L55:
            r5.onResourceReady(r6, r2, r7, r8)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb5
            return
        L5a:
            r5.resource = r0     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r8.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "Expected to receive an object of "
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class<R> r0 = r5.transcodeClass     // Catch: java.lang.Throwable -> Lb1
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = " but instead got "
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L79
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Lb1
            goto L7b
        L79:
            java.lang.String r0 = ""
        L7b:
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "{"
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            r8.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "} inside Resource{"
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            r8.append(r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "}."
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L9b
            java.lang.String r0 = ""
            goto L9d
        L9b:
            java.lang.String r0 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L9d:
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb1
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb1
            r5.onLoadFailed(r7)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r6)
            return
        Lb1:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto Lb6
        Lb5:
            r6 = move-exception
        Lb6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb5
            throw r6     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r6 = move-exception
            if (r0 == 0) goto Lc0
            com.bumptech.glide.load.engine.Engine r7 = r5.engine
            r7.release(r0)
        Lc0:
            throw r6
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int r25, int r26) {
            r24 = this;
            r15 = r24
            com.bumptech.glide.util.pool.StateVerifier r0 = r15.stateVerifier
            r0.throwIfRecycled()
            java.lang.Object r14 = r15.requestLock
            monitor-enter(r14)
            boolean r0 = com.bumptech.glide.request.SingleRequest.IS_VERBOSE_LOGGABLE     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r1.<init>()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "Got onSizeReady in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L10b
            long r2 = r15.startTime     // Catch: java.lang.Throwable -> L10b
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L10b
            r1.append(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10b
            r15.logV(r1)     // Catch: java.lang.Throwable -> L10b
        L28:
            com.bumptech.glide.request.SingleRequest$Status r1 = r15.status     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L10b
            if (r1 == r2) goto L30
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L10b
            return
        L30:
            com.bumptech.glide.request.SingleRequest$Status r13 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> L10b
            r15.status = r13     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.BaseRequestOptions<?> r1 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            float r1 = r1.getSizeMultiplier()     // Catch: java.lang.Throwable -> L10b
            r2 = r25
            int r2 = maybeApplySizeMultiplier(r2, r1)     // Catch: java.lang.Throwable -> L10b
            r15.width = r2     // Catch: java.lang.Throwable -> L10b
            r2 = r26
            int r1 = maybeApplySizeMultiplier(r2, r1)     // Catch: java.lang.Throwable -> L10b
            r15.height = r1     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r1.<init>()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = "finished setup for calling load in "
            r1.append(r2)     // Catch: java.lang.Throwable -> L10b
            long r2 = r15.startTime     // Catch: java.lang.Throwable -> L10b
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L10b
            r1.append(r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10b
            r15.logV(r1)     // Catch: java.lang.Throwable -> L10b
        L66:
            com.bumptech.glide.load.engine.Engine r1 = r15.engine     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.GlideContext r2 = r15.glideContext     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r3 = r15.model     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.BaseRequestOptions<?> r4 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.load.Key r4 = r4.getSignature()     // Catch: java.lang.Throwable -> L10b
            int r5 = r15.width     // Catch: java.lang.Throwable -> L10b
            int r6 = r15.height     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.BaseRequestOptions<?> r7 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            java.lang.Class r7 = r7.getResourceClass()     // Catch: java.lang.Throwable -> L10b
            java.lang.Class<R> r8 = r15.transcodeClass     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.Priority r9 = r15.priority     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.BaseRequestOptions<?> r10 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.load.engine.DiskCacheStrategy r10 = r10.getDiskCacheStrategy()     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.BaseRequestOptions<?> r11 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            java.util.Map r11 = r11.getTransformations()     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.request.BaseRequestOptions<?> r12 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            boolean r12 = r12.isTransformationRequired()     // Catch: java.lang.Throwable -> L10b
            r16 = r13
            com.bumptech.glide.request.BaseRequestOptions<?> r13 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            boolean r13 = r13.isScaleOnlyOrNoTransform()     // Catch: java.lang.Throwable -> L10b
            r21 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            com.bumptech.glide.load.Options r0 = r0.getOptions()     // Catch: java.lang.Throwable -> L10b
            r25 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            boolean r0 = r0.isMemoryCacheable()     // Catch: java.lang.Throwable -> L10b
            r26 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            boolean r0 = r0.getUseUnlimitedSourceGeneratorsPool()     // Catch: java.lang.Throwable -> L10b
            r17 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            boolean r0 = r0.getUseAnimationPool()     // Catch: java.lang.Throwable -> L10b
            r18 = r0
            com.bumptech.glide.request.BaseRequestOptions<?> r0 = r15.requestOptions     // Catch: java.lang.Throwable -> L10b
            boolean r0 = r0.getOnlyRetrieveFromCache()     // Catch: java.lang.Throwable -> L10b
            r19 = r0
            java.util.concurrent.Executor r0 = r15.callbackExecutor     // Catch: java.lang.Throwable -> L10b
            r22 = r16
            r23 = r14
            r14 = r25
            r15 = r26
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r24
            r20 = r0
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r1.load(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L107
            r1 = r24
            r1.loadStatus = r0     // Catch: java.lang.Throwable -> L111
            com.bumptech.glide.request.SingleRequest$Status r0 = r1.status     // Catch: java.lang.Throwable -> L111
            r2 = r22
            if (r0 == r2) goto Le9
            r0 = 0
            r1.loadStatus = r0     // Catch: java.lang.Throwable -> L111
        Le9:
            if (r21 == 0) goto L105
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r0.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch: java.lang.Throwable -> L111
            long r2 = r1.startTime     // Catch: java.lang.Throwable -> L111
            double r2 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)     // Catch: java.lang.Throwable -> L111
            r0.append(r2)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L111
            r1.logV(r0)     // Catch: java.lang.Throwable -> L111
        L105:
            monitor-exit(r23)     // Catch: java.lang.Throwable -> L111
            return
        L107:
            r0 = move-exception
            r1 = r24
            goto L10f
        L10b:
            r0 = move-exception
            r23 = r14
            r1 = r15
        L10f:
            monitor-exit(r23)     // Catch: java.lang.Throwable -> L111
            throw r0
        L111:
            r0 = move-exception
            goto L10f
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
            r2 = this;
            java.lang.Object r0 = r2.requestLock
            monitor-enter(r0)
            boolean r1 = r2.isRunning()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lc
            r2.clear()     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }
}
