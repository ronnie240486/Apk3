package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifTextureView extends android.view.TextureView {
    private static final android.widget.ImageView.ScaleType[] sScaleTypeArray = null;
    private pl.droidsonroids.gif.InputSource mInputSource;
    private pl.droidsonroids.gif.GifTextureView.RenderThread mRenderThread;
    private android.widget.ImageView.ScaleType mScaleType;
    private float mSpeedFactor;
    private final android.graphics.Matrix mTransform;
    private pl.droidsonroids.gif.GifViewUtils.GifViewAttributes viewAttributes;

    /* JADX INFO: renamed from: pl.droidsonroids.gif.GifTextureView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L49
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L54
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L60
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface PlaceholderDrawListener {
        void onDrawPlaceholder(android.graphics.Canvas r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class RenderThread extends java.lang.Thread implements android.view.TextureView.SurfaceTextureListener {
        public final pl.droidsonroids.gif.ConditionVariable isSurfaceValid;
        private pl.droidsonroids.gif.GifInfoHandle mGifInfoHandle;
        private final java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> mGifTextureViewReference;
        private java.io.IOException mIOException;
        public long[] mSavedState;


        public RenderThread(pl.droidsonroids.gif.GifTextureView r2) {
                r1 = this;
                java.lang.String r0 = "GifRenderThread"
                r1.<init>(r0)
                pl.droidsonroids.gif.ConditionVariable r0 = new pl.droidsonroids.gif.ConditionVariable
                r0.<init>()
                r1.isSurfaceValid = r0
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                r0.<init>()
                r1.mGifInfoHandle = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mGifTextureViewReference = r0
                return
        }

        public static /* synthetic */ pl.droidsonroids.gif.GifInfoHandle access$300(pl.droidsonroids.gif.GifTextureView.RenderThread r0) {
                pl.droidsonroids.gif.GifInfoHandle r0 = r0.mGifInfoHandle
                return r0
        }

        public static /* synthetic */ java.io.IOException access$600(pl.droidsonroids.gif.GifTextureView.RenderThread r0) {
                java.io.IOException r0 = r0.mIOException
                return r0
        }

        public final void dispose(@androidx.annotation.NonNull pl.droidsonroids.gif.GifTextureView r2, @androidx.annotation.Nullable pl.droidsonroids.gif.GifTextureView.PlaceholderDrawListener r3) {
                r1 = this;
                pl.droidsonroids.gif.ConditionVariable r0 = r1.isSurfaceValid
                r0.close()
                if (r3 == 0) goto Ld
                pl.droidsonroids.gif.PlaceholderDrawingSurfaceTextureListener r0 = new pl.droidsonroids.gif.PlaceholderDrawingSurfaceTextureListener
                r0.<init>(r3)
                goto Le
            Ld:
                r0 = 0
            Le:
                pl.droidsonroids.gif.GifTextureView.access$200(r2, r0)
                pl.droidsonroids.gif.GifInfoHandle r2 = r1.mGifInfoHandle
                r2.postUnbindSurface()
                r1.interrupt()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r1 = r0.mGifTextureViewReference
                java.lang.Object r1 = r1.get()
                pl.droidsonroids.gif.GifTextureView r1 = (pl.droidsonroids.gif.GifTextureView) r1
                if (r1 == 0) goto Lf
                pl.droidsonroids.gif.GifInfoHandle r2 = r0.mGifInfoHandle
                pl.droidsonroids.gif.GifTextureView.access$400(r1, r2)
            Lf:
                pl.droidsonroids.gif.ConditionVariable r1 = r0.isSurfaceValid
                r1.open()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
                r0 = this;
                pl.droidsonroids.gif.ConditionVariable r1 = r0.isSurfaceValid
                r1.close()
                pl.droidsonroids.gif.GifInfoHandle r1 = r0.mGifInfoHandle
                r1.postUnbindSurface()
                r0.interrupt()
                r1 = 1
                return r1
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
                r0 = this;
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r0 = r4.mGifTextureViewReference     // Catch: java.io.IOException -> La5
                java.lang.Object r0 = r0.get()     // Catch: java.io.IOException -> La5
                pl.droidsonroids.gif.GifTextureView r0 = (pl.droidsonroids.gif.GifTextureView) r0     // Catch: java.io.IOException -> La5
                if (r0 != 0) goto Lb
                return
            Lb:
                pl.droidsonroids.gif.InputSource r1 = pl.droidsonroids.gif.GifTextureView.access$000(r0)     // Catch: java.io.IOException -> La5
                pl.droidsonroids.gif.GifInfoHandle r1 = r1.open()     // Catch: java.io.IOException -> La5
                r4.mGifInfoHandle = r1     // Catch: java.io.IOException -> La5
                r2 = 1
                boolean r3 = r0.isOpaque()     // Catch: java.io.IOException -> La5
                r1.setOptions(r2, r3)     // Catch: java.io.IOException -> La5
                pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r1 = pl.droidsonroids.gif.GifTextureView.access$100(r0)     // Catch: java.io.IOException -> La5
                int r1 = r1.mLoopCount     // Catch: java.io.IOException -> La5
                if (r1 < 0) goto L30
                pl.droidsonroids.gif.GifInfoHandle r1 = r4.mGifInfoHandle     // Catch: java.io.IOException -> La5
                pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = pl.droidsonroids.gif.GifTextureView.access$100(r0)     // Catch: java.io.IOException -> La5
                int r0 = r0.mLoopCount     // Catch: java.io.IOException -> La5
                r1.setLoopCount(r0)     // Catch: java.io.IOException -> La5
            L30:
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r0 = r4.mGifTextureViewReference
                java.lang.Object r0 = r0.get()
                pl.droidsonroids.gif.GifTextureView r0 = (pl.droidsonroids.gif.GifTextureView) r0
                if (r0 != 0) goto L40
                pl.droidsonroids.gif.GifInfoHandle r0 = r4.mGifInfoHandle
                r0.recycle()
                return
            L40:
                pl.droidsonroids.gif.GifTextureView.access$200(r0, r4)
                boolean r1 = r0.isAvailable()
                pl.droidsonroids.gif.ConditionVariable r2 = r4.isSurfaceValid
                r2.set(r1)
                if (r1 == 0) goto L56
                pl.droidsonroids.gif.GifTextureView$RenderThread$1 r1 = new pl.droidsonroids.gif.GifTextureView$RenderThread$1
                r1.<init>(r4, r0)
                r0.post(r1)
            L56:
                pl.droidsonroids.gif.GifInfoHandle r1 = r4.mGifInfoHandle
                float r0 = pl.droidsonroids.gif.GifTextureView.access$500(r0)
                r1.setSpeedFactor(r0)
            L5f:
                boolean r0 = r4.isInterrupted()
                if (r0 != 0) goto L98
                pl.droidsonroids.gif.ConditionVariable r0 = r4.isSurfaceValid     // Catch: java.lang.InterruptedException -> L91
                r0.block()     // Catch: java.lang.InterruptedException -> L91
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r0 = r4.mGifTextureViewReference
                java.lang.Object r0 = r0.get()
                pl.droidsonroids.gif.GifTextureView r0 = (pl.droidsonroids.gif.GifTextureView) r0
                if (r0 != 0) goto L75
                goto L98
            L75:
                android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
                if (r0 != 0) goto L7c
                goto L5f
            L7c:
                android.view.Surface r1 = new android.view.Surface
                r1.<init>(r0)
                pl.droidsonroids.gif.GifInfoHandle r0 = r4.mGifInfoHandle     // Catch: java.lang.Throwable -> L8c
                long[] r2 = r4.mSavedState     // Catch: java.lang.Throwable -> L8c
                r0.bindSurface(r1, r2)     // Catch: java.lang.Throwable -> L8c
                r1.release()
                goto L5f
            L8c:
                r0 = move-exception
                r1.release()
                throw r0
            L91:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L98:
                pl.droidsonroids.gif.GifInfoHandle r0 = r4.mGifInfoHandle
                r0.recycle()
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                r0.<init>()
                r4.mGifInfoHandle = r0
                return
            La5:
                r0 = move-exception
                r4.mIOException = r0
                return
        }
    }

    static {
            r0 = 8
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r2 = 0
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r2 = 1
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            r2 = 2
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2 = 3
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            r2 = 4
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r2 = 5
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2 = 6
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2 = 7
            r0[r2] = r1
            pl.droidsonroids.gif.GifTextureView.sScaleTypeArray = r0
            return
    }

    public GifTextureView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.mScaleType = r2
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r1.mTransform = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.mSpeedFactor = r2
            r2 = 0
            r0 = 0
            r1.init(r2, r0, r0)
            return
    }

    public GifTextureView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.mScaleType = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.mTransform = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mSpeedFactor = r1
            r1 = 0
            r0.init(r2, r1, r1)
            return
    }

    public GifTextureView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.mScaleType = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.mTransform = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mSpeedFactor = r1
            r1 = 0
            r0.init(r2, r3, r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public GifTextureView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.mScaleType = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.mTransform = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mSpeedFactor = r1
            r0.init(r2, r3, r4)
            return
    }

    public static /* synthetic */ pl.droidsonroids.gif.InputSource access$000(pl.droidsonroids.gif.GifTextureView r0) {
            pl.droidsonroids.gif.InputSource r0 = r0.mInputSource
            return r0
    }

    public static /* synthetic */ pl.droidsonroids.gif.GifViewUtils.GifViewAttributes access$100(pl.droidsonroids.gif.GifTextureView r0) {
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = r0.viewAttributes
            return r0
    }

    public static /* synthetic */ void access$200(pl.droidsonroids.gif.GifTextureView r0, android.view.TextureView.SurfaceTextureListener r1) {
            r0.setSuperSurfaceTextureListener(r1)
            return
    }

    public static /* synthetic */ void access$400(pl.droidsonroids.gif.GifTextureView r0, pl.droidsonroids.gif.GifInfoHandle r1) {
            r0.updateTextureViewSize(r1)
            return
    }

    public static /* synthetic */ float access$500(pl.droidsonroids.gif.GifTextureView r0) {
            float r0 = r0.mSpeedFactor
            return r0
    }

    private static pl.droidsonroids.gif.InputSource findSource(android.content.res.TypedArray r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            int r1 = pl.droidsonroids.gif.R.styleable.GifTextureView_gifSource
            boolean r1 = r3.getValue(r1, r0)
            if (r1 != 0) goto Lf
            r3 = 0
            return r3
        Lf:
            int r1 = r0.resourceId
            if (r1 == 0) goto L49
            android.content.res.Resources r1 = r3.getResources()
            int r2 = r0.resourceId
            java.lang.String r1 = r1.getResourceTypeName(r2)
            java.util.List<java.lang.String> r2 = pl.droidsonroids.gif.GifViewUtils.SUPPORTED_RESOURCE_TYPE_NAMES
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L31
            pl.droidsonroids.gif.InputSource$ResourcesSource r1 = new pl.droidsonroids.gif.InputSource$ResourcesSource
            android.content.res.Resources r3 = r3.getResources()
            int r0 = r0.resourceId
            r1.<init>(r3, r0)
            return r1
        L31:
            java.lang.String r2 = "string"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3b
            goto L49
        L3b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected string, drawable, mipmap or raw resource type. '"
            java.lang.String r2 = "' is not supported"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r3.<init>(r0)
            throw r3
        L49:
            pl.droidsonroids.gif.InputSource$AssetSource r1 = new pl.droidsonroids.gif.InputSource$AssetSource
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.AssetManager r3 = r3.getAssets()
            java.lang.CharSequence r0 = r0.string
            java.lang.String r0 = r0.toString()
            r1.<init>(r3, r0)
            return r1
    }

    private void init(android.util.AttributeSet r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3c
            r1 = -1
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "scaleType"
            int r1 = r5.getAttributeIntValue(r2, r3, r1)
            if (r1 < 0) goto L18
            android.widget.ImageView$ScaleType[] r2 = pl.droidsonroids.gif.GifTextureView.sScaleTypeArray
            int r3 = r2.length
            if (r1 >= r3) goto L18
            r1 = r2[r1]
            r4.mScaleType = r1
        L18:
            android.content.Context r1 = r4.getContext()
            int[] r2 = pl.droidsonroids.gif.R.styleable.GifTextureView
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r5, r2, r6, r7)
            pl.droidsonroids.gif.InputSource r2 = findSource(r1)
            r4.mInputSource = r2
            int r2 = pl.droidsonroids.gif.R.styleable.GifTextureView_isOpaque
            boolean r0 = r1.getBoolean(r2, r0)
            super.setOpaque(r0)
            r1.recycle()
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = new pl.droidsonroids.gif.GifViewUtils$GifViewAttributes
            r0.<init>(r4, r5, r6, r7)
            r4.viewAttributes = r0
            goto L46
        L3c:
            super.setOpaque(r0)
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r5 = new pl.droidsonroids.gif.GifViewUtils$GifViewAttributes
            r5.<init>()
            r4.viewAttributes = r5
        L46:
            boolean r5 = r4.isInEditMode()
            if (r5 != 0) goto L5a
            pl.droidsonroids.gif.GifTextureView$RenderThread r5 = new pl.droidsonroids.gif.GifTextureView$RenderThread
            r5.<init>(r4)
            r4.mRenderThread = r5
            pl.droidsonroids.gif.InputSource r6 = r4.mInputSource
            if (r6 == 0) goto L5a
            r5.start()
        L5a:
            return
    }

    private void setSuperSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener r1) {
            r0 = this;
            super.setSurfaceTextureListener(r1)
            return
    }

    private void updateTextureViewSize(pl.droidsonroids.gif.GifInfoHandle r11) {
            r10 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r10.getWidth()
            float r1 = (float) r1
            int r2 = r10.getHeight()
            float r2 = (float) r2
            int r3 = r11.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r1
            int r4 = r11.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r2
            android.graphics.RectF r5 = new android.graphics.RectF
            int r6 = r11.getWidth()
            float r6 = (float) r6
            int r7 = r11.getHeight()
            float r7 = (float) r7
            r8 = 0
            r5.<init>(r8, r8, r6, r7)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r8, r8, r1, r2)
            int[] r7 = pl.droidsonroids.gif.GifTextureView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType
            android.widget.ImageView$ScaleType r8 = r10.mScaleType
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L9a;
                case 2: goto L8b;
                case 3: goto L67;
                case 4: goto L5e;
                case 5: goto L55;
                case 6: goto L4c;
                case 7: goto L4b;
                case 8: goto L42;
                default: goto L41;
            }
        L41:
            goto L9f
        L42:
            android.graphics.Matrix r11 = r10.mTransform
            r0.set(r11)
            r0.preScale(r3, r4)
            goto L9f
        L4b:
            return
        L4c:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.START
            r0.setRectToRect(r5, r6, r11)
            r0.preScale(r3, r4)
            goto L9f
        L55:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.END
            r0.setRectToRect(r5, r6, r11)
            r0.preScale(r3, r4)
            goto L9f
        L5e:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r5, r6, r11)
            r0.preScale(r3, r4)
            goto L9f
        L67:
            int r5 = r11.getWidth()
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L7a
            int r11 = r11.getHeight()
            float r11 = (float) r11
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 > 0) goto L7a
            goto L81
        L7a:
            float r11 = r8 / r3
            float r8 = r8 / r4
            float r8 = java.lang.Math.min(r11, r8)
        L81:
            float r3 = r3 * r8
            float r8 = r8 * r4
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r8, r1, r2)
            goto L9f
        L8b:
            float r11 = java.lang.Math.min(r3, r4)
            float r8 = r8 / r11
            float r3 = r3 * r8
            float r8 = r8 * r4
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r8, r1, r2)
            goto L9f
        L9a:
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r4, r1, r2)
        L9f:
            super.setTransform(r0)
            return
    }

    @androidx.annotation.Nullable
    public java.io.IOException getIOException() {
            r3 = this;
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r3.mRenderThread
            java.io.IOException r0 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$600(r0)
            if (r0 == 0) goto Lf
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r3.mRenderThread
            java.io.IOException r0 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$600(r0)
            return r0
        Lf:
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r3.mRenderThread
            pl.droidsonroids.gif.GifInfoHandle r0 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$300(r0)
            int r0 = r0.getNativeErrorCode()
            int r1 = pl.droidsonroids.gif.GifIOException.$r8$clinit
            pl.droidsonroids.gif.GifError r1 = pl.droidsonroids.gif.GifError.NO_ERROR
            int r1 = r1.errorCode
            r2 = 0
            if (r0 != r1) goto L23
            goto L29
        L23:
            pl.droidsonroids.gif.GifIOException r1 = new pl.droidsonroids.gif.GifIOException
            r1.<init>(r0, r2)
            r2 = r1
        L29:
            return r2
    }

    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.mScaleType
            return r0
    }

    @Override // android.view.TextureView
    public android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.TextureView
    public android.graphics.Matrix getTransform(android.graphics.Matrix r2) {
            r1 = this;
            if (r2 != 0) goto L7
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
        L7:
            android.graphics.Matrix r0 = r1.mTransform
            r2.set(r0)
            return r2
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r2.mRenderThread
            r1 = 0
            r0.dispose(r2, r1)
            super.onDetachedFromWindow()
            android.graphics.SurfaceTexture r0 = r2.getSurfaceTexture()
            if (r0 == 0) goto L12
            r0.release()
        L12:
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof pl.droidsonroids.gif.GifViewSavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            pl.droidsonroids.gif.GifViewSavedState r3 = (pl.droidsonroids.gif.GifViewSavedState) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r2.mRenderThread
            long[][] r3 = r3.mStates
            r1 = 0
            r3 = r3[r1]
            r0.mSavedState = r3
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r3.mRenderThread
            pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$300(r0)
            long[] r1 = r1.getSavedState()
            r0.mSavedState = r1
            pl.droidsonroids.gif.GifViewSavedState r0 = new pl.droidsonroids.gif.GifViewSavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r2 = r3.viewAttributes
            boolean r2 = r2.freezesAnimation
            if (r2 == 0) goto L1d
            pl.droidsonroids.gif.GifTextureView$RenderThread r2 = r3.mRenderThread
            long[] r2 = r2.mSavedState
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r0.<init>(r1, r2)
            return r0
    }

    public void setFreezesAnimation(boolean r2) {
            r1 = this;
            pl.droidsonroids.gif.GifViewUtils$GifViewAttributes r0 = r1.viewAttributes
            r0.freezesAnimation = r2
            return
    }

    public void setImageMatrix(android.graphics.Matrix r1) {
            r0 = this;
            r0.setTransform(r1)
            return
    }

    public synchronized void setInputSource(@androidx.annotation.Nullable pl.droidsonroids.gif.InputSource r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.setInputSource(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void setInputSource(@androidx.annotation.Nullable pl.droidsonroids.gif.InputSource r2, @androidx.annotation.Nullable pl.droidsonroids.gif.GifTextureView.PlaceholderDrawListener r3) {
            r1 = this;
            monitor-enter(r1)
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r1.mRenderThread     // Catch: java.lang.Throwable -> L20
            r0.dispose(r1, r3)     // Catch: java.lang.Throwable -> L20
            pl.droidsonroids.gif.GifTextureView$RenderThread r3 = r1.mRenderThread     // Catch: java.lang.InterruptedException -> Lc java.lang.Throwable -> L20
            r3.join()     // Catch: java.lang.InterruptedException -> Lc java.lang.Throwable -> L20
            goto L10
        Lc:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L20
        L10:
            r1.mInputSource = r2     // Catch: java.lang.Throwable -> L20
            pl.droidsonroids.gif.GifTextureView$RenderThread r3 = new pl.droidsonroids.gif.GifTextureView$RenderThread     // Catch: java.lang.Throwable -> L20
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r1.mRenderThread = r3     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L1e
            r3.start()     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r1)
            return
        L20:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.view.TextureView
    public void setOpaque(boolean r2) {
            r1 = this;
            boolean r0 = r1.isOpaque()
            if (r2 == r0) goto Le
            super.setOpaque(r2)
            pl.droidsonroids.gif.InputSource r2 = r1.mInputSource
            r1.setInputSource(r2)
        Le:
            return
    }

    public void setScaleType(@androidx.annotation.NonNull android.widget.ImageView.ScaleType r1) {
            r0 = this;
            r0.mScaleType = r1
            pl.droidsonroids.gif.GifTextureView$RenderThread r1 = r0.mRenderThread
            pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$300(r1)
            r0.updateTextureViewSize(r1)
            return
    }

    public void setSpeed(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            r1.mSpeedFactor = r2
            pl.droidsonroids.gif.GifTextureView$RenderThread r0 = r1.mRenderThread
            pl.droidsonroids.gif.GifInfoHandle r0 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$300(r0)
            r0.setSpeedFactor(r2)
            return
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(android.graphics.SurfaceTexture r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing SurfaceTexture is not supported"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing SurfaceTextureListener is not supported"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.TextureView
    public void setTransform(android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mTransform
            r0.set(r2)
            pl.droidsonroids.gif.GifTextureView$RenderThread r2 = r1.mRenderThread
            pl.droidsonroids.gif.GifInfoHandle r2 = pl.droidsonroids.gif.GifTextureView.RenderThread.access$300(r2)
            r1.updateTextureViewSize(r2)
            return
    }
}
