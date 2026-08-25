package com.bumptech.glide;

/* JADX INFO: loaded from: classes3.dex */
public class RequestBuilder<TranscodeType> extends com.bumptech.glide.request.BaseRequestOptions<com.bumptech.glide.RequestBuilder<TranscodeType>> implements com.bumptech.glide.ModelTypes<com.bumptech.glide.RequestBuilder<TranscodeType>> {
    public static final com.bumptech.glide.request.RequestOptions DOWNLOAD_ONLY_OPTIONS = null;
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private com.bumptech.glide.RequestBuilder<TranscodeType> errorBuilder;
    private final com.bumptech.glide.Glide glide;
    private final com.bumptech.glide.GlideContext glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;

    @androidx.annotation.Nullable
    private java.lang.Object model;

    @androidx.annotation.Nullable
    private java.util.List<com.bumptech.glide.request.RequestListener<TranscodeType>> requestListeners;
    private final com.bumptech.glide.RequestManager requestManager;

    @androidx.annotation.Nullable
    private java.lang.Float thumbSizeMultiplier;

    @androidx.annotation.Nullable
    private com.bumptech.glide.RequestBuilder<TranscodeType> thumbnailBuilder;
    private final java.lang.Class<TranscodeType> transcodeClass;

    @androidx.annotation.NonNull
    private com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> transitionOptions;

    /* JADX INFO: renamed from: com.bumptech.glide.RequestBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;
        public static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$Priority = null;

        static {
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$com$bumptech$glide$Priority = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$com$bumptech$glide$Priority     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$com$bumptech$glide$Priority     // Catch: java.lang.NoSuchFieldError -> L28
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$com$bumptech$glide$Priority     // Catch: java.lang.NoSuchFieldError -> L33
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L4e
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L58
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L62
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L6d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L78
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L83
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L8f
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                return
        }
    }

    static {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.load.engine.DiskCacheStrategy r1 = com.bumptech.glide.load.engine.DiskCacheStrategy.DATA
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.diskCacheStrategy(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.Priority r1 = com.bumptech.glide.Priority.LOW
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.priority(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            r1 = 1
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.skipMemoryCache(r1)
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.RequestBuilder.DOWNLOAD_ONLY_OPTIONS = r0
            return
    }

    @android.annotation.SuppressLint({"CheckResult"})
    public RequestBuilder(@androidx.annotation.NonNull com.bumptech.glide.Glide r2, com.bumptech.glide.RequestManager r3, java.lang.Class<TranscodeType> r4, android.content.Context r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isDefaultTransitionOptionsSet = r0
            r1.glide = r2
            r1.requestManager = r3
            r1.transcodeClass = r4
            r1.context = r5
            com.bumptech.glide.Glide r5 = r3.glide
            com.bumptech.glide.GlideContext r5 = r5.getGlideContext()
            com.bumptech.glide.TransitionOptions r4 = r5.getDefaultTransitionOptions(r4)
            r1.transitionOptions = r4
            com.bumptech.glide.GlideContext r2 = r2.getGlideContext()
            r1.glideContext = r2
            java.util.List r2 = r3.getDefaultRequestListeners()
            r1.initRequestListeners(r2)
            com.bumptech.glide.request.RequestOptions r2 = r3.getDefaultRequestOptions()
            r1.apply(r2)
            return
    }

    @android.annotation.SuppressLint({"CheckResult"})
    public RequestBuilder(java.lang.Class<TranscodeType> r4, com.bumptech.glide.RequestBuilder<?> r5) {
            r3 = this;
            com.bumptech.glide.Glide r0 = r5.glide
            com.bumptech.glide.RequestManager r1 = r5.requestManager
            android.content.Context r2 = r5.context
            r3.<init>(r0, r1, r4, r2)
            java.lang.Object r4 = r5.model
            r3.model = r4
            boolean r4 = r5.isModelSet
            r3.isModelSet = r4
            r3.apply(r5)
            return
    }

    private com.bumptech.glide.request.Request buildRequest(com.bumptech.glide.request.target.Target<TranscodeType> r12, @androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r13, com.bumptech.glide.request.BaseRequestOptions<?> r14, java.util.concurrent.Executor r15) {
            r11 = this;
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r5 = r11.transitionOptions
            com.bumptech.glide.Priority r6 = r14.getPriority()
            int r7 = r14.getOverrideWidth()
            int r8 = r14.getOverrideHeight()
            r4 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r9 = r14
            r10 = r15
            com.bumptech.glide.request.Request r12 = r0.buildRequestRecursive(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    private com.bumptech.glide.request.Request buildRequestRecursive(java.lang.Object r24, com.bumptech.glide.request.target.Target<TranscodeType> r25, @androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r26, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r27, com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r28, com.bumptech.glide.Priority r29, int r30, int r31, com.bumptech.glide.request.BaseRequestOptions<?> r32, java.util.concurrent.Executor r33) {
            r23 = this;
            r11 = r23
            com.bumptech.glide.RequestBuilder<TranscodeType> r0 = r11.errorBuilder
            if (r0 == 0) goto L12
            com.bumptech.glide.request.ErrorRequestCoordinator r0 = new com.bumptech.glide.request.ErrorRequestCoordinator
            r13 = r24
            r1 = r27
            r0.<init>(r13, r1)
            r4 = r0
            r15 = r4
            goto L19
        L12:
            r13 = r24
            r1 = r27
            r0 = 0
            r15 = r0
            r4 = r1
        L19:
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            com.bumptech.glide.request.Request r0 = r0.buildThumbnailRequestRecursive(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r15 != 0) goto L34
            return r0
        L34:
            com.bumptech.glide.RequestBuilder<TranscodeType> r1 = r11.errorBuilder
            int r1 = r1.getOverrideWidth()
            com.bumptech.glide.RequestBuilder<TranscodeType> r2 = r11.errorBuilder
            int r2 = r2.getOverrideHeight()
            boolean r3 = com.bumptech.glide.util.Util.isValidDimensions(r30, r31)
            if (r3 == 0) goto L56
            com.bumptech.glide.RequestBuilder<TranscodeType> r3 = r11.errorBuilder
            boolean r3 = r3.isValidOverride()
            if (r3 != 0) goto L56
            int r1 = r32.getOverrideWidth()
            int r2 = r32.getOverrideHeight()
        L56:
            r19 = r1
            r20 = r2
            com.bumptech.glide.RequestBuilder<TranscodeType> r12 = r11.errorBuilder
            com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r1 = r12.transitionOptions
            com.bumptech.glide.Priority r18 = r12.getPriority()
            com.bumptech.glide.RequestBuilder<TranscodeType> r2 = r11.errorBuilder
            r13 = r24
            r14 = r25
            r3 = r15
            r15 = r26
            r16 = r3
            r17 = r1
            r21 = r2
            r22 = r33
            com.bumptech.glide.request.Request r1 = r12.buildRequestRecursive(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.setRequests(r0, r1)
            return r3
    }

    private com.bumptech.glide.request.Request buildThumbnailRequestRecursive(java.lang.Object r19, com.bumptech.glide.request.target.Target<TranscodeType> r20, com.bumptech.glide.request.RequestListener<TranscodeType> r21, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r22, com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r23, com.bumptech.glide.Priority r24, int r25, int r26, com.bumptech.glide.request.BaseRequestOptions<?> r27, java.util.concurrent.Executor r28) {
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.RequestBuilder<TranscodeType> r0 = r11.thumbnailBuilder
            if (r0 == 0) goto L94
            boolean r1 = r11.isThumbnailBuilt
            if (r1 != 0) goto L8c
            com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r1 = r0.transitionOptions
            boolean r2 = r0.isDefaultTransitionOptionsSet
            if (r2 == 0) goto L19
            r14 = r23
            goto L1a
        L19:
            r14 = r1
        L1a:
            boolean r0 = r0.isPrioritySet()
            if (r0 == 0) goto L27
            com.bumptech.glide.RequestBuilder<TranscodeType> r0 = r11.thumbnailBuilder
            com.bumptech.glide.Priority r0 = r0.getPriority()
            goto L2b
        L27:
            com.bumptech.glide.Priority r0 = r11.getThumbnailPriority(r13)
        L2b:
            r15 = r0
            com.bumptech.glide.RequestBuilder<TranscodeType> r0 = r11.thumbnailBuilder
            int r0 = r0.getOverrideWidth()
            com.bumptech.glide.RequestBuilder<TranscodeType> r1 = r11.thumbnailBuilder
            int r1 = r1.getOverrideHeight()
            boolean r2 = com.bumptech.glide.util.Util.isValidDimensions(r25, r26)
            if (r2 == 0) goto L4e
            com.bumptech.glide.RequestBuilder<TranscodeType> r2 = r11.thumbnailBuilder
            boolean r2 = r2.isValidOverride()
            if (r2 != 0) goto L4e
            int r0 = r27.getOverrideWidth()
            int r1 = r27.getOverrideHeight()
        L4e:
            r16 = r0
            r17 = r1
            com.bumptech.glide.request.ThumbnailRequestCoordinator r10 = new com.bumptech.glide.request.ThumbnailRequestCoordinator
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            com.bumptech.glide.request.Request r10 = r0.obtainRequest(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.isThumbnailBuilt = r0
            com.bumptech.glide.RequestBuilder<TranscodeType> r9 = r11.thumbnailBuilder
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            com.bumptech.glide.request.Request r0 = r0.buildRequestRecursive(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.isThumbnailBuilt = r1
            r13.setRequests(r12, r0)
            return r13
        L8c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L94:
            java.lang.Float r0 = r11.thumbSizeMultiplier
            if (r0 == 0) goto Ld4
            com.bumptech.glide.request.ThumbnailRequestCoordinator r14 = new com.bumptech.glide.request.ThumbnailRequestCoordinator
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.request.Request r15 = r0.obtainRequest(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.bumptech.glide.request.BaseRequestOptions r0 = r27.clone()
            java.lang.Float r1 = r11.thumbSizeMultiplier
            float r1 = r1.floatValue()
            com.bumptech.glide.request.BaseRequestOptions r4 = r0.sizeMultiplier(r1)
            com.bumptech.glide.Priority r7 = r11.getThumbnailPriority(r13)
            r0 = r18
            r1 = r19
            com.bumptech.glide.request.Request r0 = r0.obtainRequest(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.setRequests(r15, r0)
            return r14
        Ld4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.request.Request r0 = r0.obtainRequest(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    private com.bumptech.glide.RequestBuilder<TranscodeType> cloneWithNullErrorAndThumbnail() {
            r2 = this;
            com.bumptech.glide.RequestBuilder r0 = r2.clone()
            r1 = 0
            com.bumptech.glide.RequestBuilder r0 = r0.error(r1)
            com.bumptech.glide.RequestBuilder r0 = r0.thumbnail(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.Priority getThumbnailPriority(@androidx.annotation.NonNull com.bumptech.glide.Priority r3) {
            r2 = this;
            int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$com$bumptech$glide$Priority
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L33
            r0 = 2
            if (r3 == r0) goto L30
            r0 = 3
            if (r3 == r0) goto L2d
            r0 = 4
            if (r3 != r0) goto L15
            goto L2d
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown priority: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.bumptech.glide.Priority r1 = r2.getPriority()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L2d:
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.IMMEDIATE
            return r3
        L30:
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.HIGH
            return r3
        L33:
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL
            return r3
    }

    @android.annotation.SuppressLint({"CheckResult"})
    private void initRequestListeners(java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.request.RequestListener r0 = (com.bumptech.glide.request.RequestListener) r0
            r1.addListener(r0)
            goto L4
        L14:
            return
    }

    private <Y extends com.bumptech.glide.request.target.Target<TranscodeType>> Y into(@androidx.annotation.NonNull Y r2, @androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r3, com.bumptech.glide.request.BaseRequestOptions<?> r4, java.util.concurrent.Executor r5) {
            r1 = this;
            com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            boolean r0 = r1.isModelSet
            if (r0 == 0) goto L39
            com.bumptech.glide.request.Request r3 = r1.buildRequest(r2, r3, r4, r5)
            com.bumptech.glide.request.Request r5 = r2.getRequest()
            boolean r0 = r3.isEquivalentTo(r5)
            if (r0 == 0) goto L2b
            boolean r4 = r1.isSkipMemoryCacheWithCompletePreviousRequest(r4, r5)
            if (r4 != 0) goto L2b
            java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r5)
            com.bumptech.glide.request.Request r3 = (com.bumptech.glide.request.Request) r3
            boolean r3 = r3.isRunning()
            if (r3 != 0) goto L2a
            r5.begin()
        L2a:
            return r2
        L2b:
            com.bumptech.glide.RequestManager r4 = r1.requestManager
            r4.clear(r2)
            r2.setRequest(r3)
            com.bumptech.glide.RequestManager r4 = r1.requestManager
            r4.track(r2, r3)
            return r2
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "You must call #load() before calling #into()"
            r2.<init>(r3)
            throw r2
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(com.bumptech.glide.request.BaseRequestOptions<?> r1, com.bumptech.glide.request.Request r2) {
            r0 = this;
            boolean r1 = r1.isMemoryCacheable()
            if (r1 != 0) goto Le
            boolean r1 = r2.isComplete()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.RequestBuilder<TranscodeType> loadGeneric(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.loadGeneric(r2)
            return r2
        Lf:
            r1.model = r2
            r2 = 1
            r1.isModelSet = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            return r2
    }

    private com.bumptech.glide.request.Request obtainRequest(java.lang.Object r18, com.bumptech.glide.request.target.Target<TranscodeType> r19, com.bumptech.glide.request.RequestListener<TranscodeType> r20, com.bumptech.glide.request.BaseRequestOptions<?> r21, com.bumptech.glide.request.RequestCoordinator r22, com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r23, com.bumptech.glide.Priority r24, int r25, int r26, java.util.concurrent.Executor r27) {
            r17 = this;
            r0 = r17
            android.content.Context r1 = r0.context
            com.bumptech.glide.GlideContext r2 = r0.glideContext
            java.lang.Object r4 = r0.model
            java.lang.Class<TranscodeType> r5 = r0.transcodeClass
            java.util.List<com.bumptech.glide.request.RequestListener<TranscodeType>> r12 = r0.requestListeners
            com.bumptech.glide.load.engine.Engine r14 = r2.getEngine()
            com.bumptech.glide.request.transition.TransitionFactory r15 = r23.getTransitionFactory()
            r3 = r18
            r6 = r21
            r7 = r25
            r8 = r26
            r9 = r24
            r10 = r19
            r11 = r20
            r13 = r22
            r16 = r27
            com.bumptech.glide.request.SingleRequest r1 = com.bumptech.glide.request.SingleRequest.obtain(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> addListener(@androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.addListener(r2)
            return r2
        Lf:
            if (r2 == 0) goto L21
            java.util.List<com.bumptech.glide.request.RequestListener<TranscodeType>> r0 = r1.requestListeners
            if (r0 != 0) goto L1c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.requestListeners = r0
        L1c:
            java.util.List<com.bumptech.glide.request.RequestListener<TranscodeType>> r0 = r1.requestListeners
            r0.add(r2)
        L21:
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            return r2
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions<?> r1) {
            r0 = this;
            com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.request.BaseRequestOptions r1 = super.apply(r1)
            com.bumptech.glide.RequestBuilder r1 = (com.bumptech.glide.RequestBuilder) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions apply(@androidx.annotation.NonNull com.bumptech.glide.request.BaseRequestOptions r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.apply(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> clone() {
            r3 = this;
            com.bumptech.glide.request.BaseRequestOptions r0 = super.clone()
            com.bumptech.glide.RequestBuilder r0 = (com.bumptech.glide.RequestBuilder) r0
            com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r1 = r0.transitionOptions
            com.bumptech.glide.TransitionOptions r1 = r1.clone()
            r0.transitionOptions = r1
            java.util.List<com.bumptech.glide.request.RequestListener<TranscodeType>> r1 = r0.requestListeners
            if (r1 == 0) goto L1b
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.bumptech.glide.request.RequestListener<TranscodeType>> r2 = r0.requestListeners
            r1.<init>(r2)
            r0.requestListeners = r1
        L1b:
            com.bumptech.glide.RequestBuilder<TranscodeType> r1 = r0.thumbnailBuilder
            if (r1 == 0) goto L25
            com.bumptech.glide.RequestBuilder r1 = r1.clone()
            r0.thumbnailBuilder = r1
        L25:
            com.bumptech.glide.RequestBuilder<TranscodeType> r1 = r0.errorBuilder
            if (r1 == 0) goto L2f
            com.bumptech.glide.RequestBuilder r1 = r1.clone()
            r0.errorBuilder = r1
        L2f:
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions clone() {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            return r0
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @androidx.annotation.CheckResult
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo45clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            return r0
    }

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.bumptech.glide.request.FutureTarget<java.io.File> downloadOnly(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.getDownloadOnlyRequest()
            com.bumptech.glide.request.FutureTarget r2 = r0.submit(r2, r3)
            return r2
    }

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public <Y extends com.bumptech.glide.request.target.Target<java.io.File>> Y downloadOnly(@androidx.annotation.NonNull Y r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r0 = r1.getDownloadOnlyRequest()
            com.bumptech.glide.request.target.Target r2 = r0.into(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestBuilder<TranscodeType> error(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.error(r2)
            return r2
        Lf:
            r1.errorBuilder = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> error(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L8
            r2 = 0
            com.bumptech.glide.RequestBuilder r2 = r1.error(r2)
            return r2
        L8:
            com.bumptech.glide.RequestBuilder r0 = r1.cloneWithNullErrorAndThumbnail()
            com.bumptech.glide.RequestBuilder r2 = r0.load(r2)
            com.bumptech.glide.RequestBuilder r2 = r1.error(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<java.io.File> getDownloadOnlyRequest() {
            r2 = this;
            com.bumptech.glide.RequestBuilder r0 = new com.bumptech.glide.RequestBuilder
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0.<init>(r1, r2)
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.RequestBuilder.DOWNLOAD_ONLY_OPTIONS
            com.bumptech.glide.RequestBuilder r0 = r0.apply(r1)
            return r0
    }

    @java.lang.Deprecated
    public com.bumptech.glide.request.FutureTarget<TranscodeType> into(int r1, int r2) {
            r0 = this;
            com.bumptech.glide.request.FutureTarget r1 = r0.submit(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public <Y extends com.bumptech.glide.request.target.Target<TranscodeType>> Y into(@androidx.annotation.NonNull Y r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = com.bumptech.glide.util.Executors.mainThreadExecutor()
            r1 = 0
            com.bumptech.glide.request.target.Target r3 = r2.into(r3, r1, r2, r0)
            return r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, TranscodeType> into(@androidx.annotation.NonNull android.widget.ImageView r4) {
            r3 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            com.bumptech.glide.util.Preconditions.checkNotNull(r4)
            boolean r0 = r3.isTransformationSet()
            if (r0 != 0) goto L4c
            boolean r0 = r3.isTransformationAllowed()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.optionalCenterInside()
            goto L4d
        L31:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.optionalFitCenter()
            goto L4d
        L3a:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.optionalCenterInside()
            goto L4d
        L43:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.optionalCenterCrop()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.GlideContext r1 = r3.glideContext
            java.lang.Class<TranscodeType> r2 = r3.transcodeClass
            com.bumptech.glide.request.target.ViewTarget r4 = r1.buildImageViewTarget(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.Executors.mainThreadExecutor()
            com.bumptech.glide.request.target.Target r4 = r3.into(r4, r1, r0, r2)
            com.bumptech.glide.request.target.ViewTarget r4 = (com.bumptech.glide.request.target.ViewTarget) r4
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> listener(@androidx.annotation.Nullable com.bumptech.glide.request.RequestListener<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.listener(r2)
            return r2
        Lf:
            r0 = 0
            r1.requestListeners = r0
            com.bumptech.glide.RequestBuilder r2 = r1.addListener(r2)
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r2 = r1.loadGeneric(r2)
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.NONE
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(r0)
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r0)
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r2 = r1.loadGeneric(r2)
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.NONE
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(r0)
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r0)
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.loadGeneric(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.loadGeneric(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r2 = r1.loadGeneric(r2)
            android.content.Context r0 = r1.context
            com.bumptech.glide.load.Key r0 = com.bumptech.glide.signature.AndroidResourceSignature.obtain(r0)
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.signatureOf(r0)
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r0)
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.loadGeneric(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.loadGeneric(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.loadGeneric(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> load(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            com.bumptech.glide.RequestBuilder r2 = r1.loadGeneric(r2)
            boolean r0 = r2.isDiskCacheStrategySet()
            if (r0 != 0) goto L14
            com.bumptech.glide.load.engine.DiskCacheStrategy r0 = com.bumptech.glide.load.engine.DiskCacheStrategy.NONE
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.diskCacheStrategyOf(r0)
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r0)
        L14:
            boolean r0 = r2.isSkipMemoryCacheSet()
            if (r0 != 0) goto L23
            r0 = 1
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheOf(r0)
            com.bumptech.glide.RequestBuilder r2 = r2.apply(r0)
        L23:
            return r2
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @Override // com.bumptech.glide.ModelTypes
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object load(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.bumptech.glide.RequestBuilder r1 = r0.load(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.target.Target<TranscodeType> preload() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            com.bumptech.glide.request.target.Target r0 = r1.preload(r0, r0)
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.target.Target<TranscodeType> preload(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.RequestManager r0 = r1.requestManager
            com.bumptech.glide.request.target.PreloadTarget r2 = com.bumptech.glide.request.target.PreloadTarget.obtain(r0, r2, r3)
            com.bumptech.glide.request.target.Target r2 = r1.into(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.FutureTarget<TranscodeType> submit() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            com.bumptech.glide.request.FutureTarget r0 = r1.submit(r0, r0)
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.FutureTarget<TranscodeType> submit(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.request.RequestFutureTarget r0 = new com.bumptech.glide.request.RequestFutureTarget
            r0.<init>(r2, r3)
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.Executors.directExecutor()
            com.bumptech.glide.request.target.Target r2 = r1.into(r0, r0, r1, r2)
            com.bumptech.glide.request.FutureTarget r2 = (com.bumptech.glide.request.FutureTarget) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> thumbnail(float r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.thumbnail(r2)
            return r2
        Lf:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L27
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L27
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.thumbSizeMultiplier = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            return r2
        L27:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sizeMultiplier must be between 0 and 1"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> thumbnail(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.thumbnail(r2)
            return r2
        Lf:
            r1.thumbnailBuilder = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> thumbnail(@androidx.annotation.Nullable java.util.List<com.bumptech.glide.RequestBuilder<TranscodeType>> r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L2b
        La:
            int r1 = r4.size()
            int r1 = r1 + (-1)
        L10:
            if (r1 < 0) goto L26
            java.lang.Object r2 = r4.get(r1)
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            if (r2 != 0) goto L1b
            goto L23
        L1b:
            if (r0 != 0) goto L1f
            r0 = r2
            goto L23
        L1f:
            com.bumptech.glide.RequestBuilder r0 = r2.thumbnail(r0)
        L23:
            int r1 = r1 + (-1)
            goto L10
        L26:
            com.bumptech.glide.RequestBuilder r4 = r3.thumbnail(r0)
            return r4
        L2b:
            com.bumptech.glide.RequestBuilder r4 = r3.thumbnail(r0)
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> thumbnail(@androidx.annotation.Nullable com.bumptech.glide.RequestBuilder<TranscodeType>... r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.bumptech.glide.RequestBuilder r2 = r1.thumbnail(r2)
            return r2
        Lf:
            r2 = 0
            com.bumptech.glide.RequestBuilder r2 = r1.thumbnail(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.RequestBuilder<TranscodeType> transition(@androidx.annotation.NonNull com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.isAutoCloneEnabled()
            if (r0 == 0) goto Lf
            com.bumptech.glide.RequestBuilder r0 = r1.clone()
            com.bumptech.glide.RequestBuilder r2 = r0.transition(r2)
            return r2
        Lf:
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.TransitionOptions r2 = (com.bumptech.glide.TransitionOptions) r2
            r1.transitionOptions = r2
            r2 = 0
            r1.isDefaultTransitionOptionsSet = r2
            com.bumptech.glide.request.BaseRequestOptions r2 = r1.selfOrThrowIfLocked()
            com.bumptech.glide.RequestBuilder r2 = (com.bumptech.glide.RequestBuilder) r2
            return r2
    }
}
