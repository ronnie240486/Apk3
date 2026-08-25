package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkImageView extends android.widget.ImageView {

    @androidx.annotation.Nullable
    private android.graphics.Bitmap mDefaultImageBitmap;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable mDefaultImageDrawable;
    private int mDefaultImageId;

    @androidx.annotation.Nullable
    private android.graphics.Bitmap mErrorImageBitmap;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable mErrorImageDrawable;
    private int mErrorImageId;
    private com.android.volley.toolbox.ImageLoader.ImageContainer mImageContainer;
    private com.android.volley.toolbox.ImageLoader mImageLoader;
    private java.lang.String mUrl;

    /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class AnonymousClass1 implements com.android.volley.toolbox.ImageLoader.ImageListener {
        public final /* synthetic */ com.android.volley.toolbox.NetworkImageView this$0;
        public final /* synthetic */ boolean val$isInLayoutPass;


        public AnonymousClass1(com.android.volley.toolbox.NetworkImageView r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$isInLayoutPass = r2
                r0.<init>()
                return
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(com.android.volley.VolleyError r2) {
                r1 = this;
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                int r2 = com.android.volley.toolbox.NetworkImageView.access$000(r2)
                if (r2 == 0) goto L12
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                int r0 = com.android.volley.toolbox.NetworkImageView.access$000(r2)
                r2.setImageResource(r0)
                goto L35
            L12:
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.drawable.Drawable r2 = com.android.volley.toolbox.NetworkImageView.access$100(r2)
                if (r2 == 0) goto L24
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.drawable.Drawable r0 = com.android.volley.toolbox.NetworkImageView.access$100(r2)
                r2.setImageDrawable(r0)
                goto L35
            L24:
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.Bitmap r2 = com.android.volley.toolbox.NetworkImageView.access$200(r2)
                if (r2 == 0) goto L35
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.Bitmap r0 = com.android.volley.toolbox.NetworkImageView.access$200(r2)
                r2.setImageBitmap(r0)
            L35:
                return
        }

        @Override // com.android.volley.toolbox.ImageLoader.ImageListener
        public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L11
                boolean r3 = r1.val$isInLayoutPass
                if (r3 == 0) goto L11
                com.android.volley.toolbox.NetworkImageView r3 = r1.this$0
                com.android.volley.toolbox.NetworkImageView$1$1 r0 = new com.android.volley.toolbox.NetworkImageView$1$1
                r0.<init>(r1, r2)
                r3.post(r0)
                return
            L11:
                android.graphics.Bitmap r3 = r2.getBitmap()
                if (r3 == 0) goto L21
                com.android.volley.toolbox.NetworkImageView r3 = r1.this$0
                android.graphics.Bitmap r2 = r2.getBitmap()
                r3.setImageBitmap(r2)
                goto L56
            L21:
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                int r2 = com.android.volley.toolbox.NetworkImageView.access$300(r2)
                if (r2 == 0) goto L33
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                int r3 = com.android.volley.toolbox.NetworkImageView.access$300(r2)
                r2.setImageResource(r3)
                goto L56
            L33:
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.drawable.Drawable r2 = com.android.volley.toolbox.NetworkImageView.access$400(r2)
                if (r2 == 0) goto L45
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.drawable.Drawable r3 = com.android.volley.toolbox.NetworkImageView.access$400(r2)
                r2.setImageDrawable(r3)
                goto L56
            L45:
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.Bitmap r2 = com.android.volley.toolbox.NetworkImageView.access$500(r2)
                if (r2 == 0) goto L56
                com.android.volley.toolbox.NetworkImageView r2 = r1.this$0
                android.graphics.Bitmap r3 = com.android.volley.toolbox.NetworkImageView.access$500(r2)
                r2.setImageBitmap(r3)
            L56:
                return
        }
    }

    public NetworkImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NetworkImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NetworkImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ int access$000(com.android.volley.toolbox.NetworkImageView r0) {
            int r0 = r0.mErrorImageId
            return r0
    }

    public static /* synthetic */ android.graphics.drawable.Drawable access$100(com.android.volley.toolbox.NetworkImageView r0) {
            android.graphics.drawable.Drawable r0 = r0.mErrorImageDrawable
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap access$200(com.android.volley.toolbox.NetworkImageView r0) {
            android.graphics.Bitmap r0 = r0.mErrorImageBitmap
            return r0
    }

    public static /* synthetic */ int access$300(com.android.volley.toolbox.NetworkImageView r0) {
            int r0 = r0.mDefaultImageId
            return r0
    }

    public static /* synthetic */ android.graphics.drawable.Drawable access$400(com.android.volley.toolbox.NetworkImageView r0) {
            android.graphics.drawable.Drawable r0 = r0.mDefaultImageDrawable
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap access$500(com.android.volley.toolbox.NetworkImageView r0) {
            android.graphics.Bitmap r0 = r0.mDefaultImageBitmap
            return r0
    }

    private void setDefaultImageOrNull() {
            r1 = this;
            int r0 = r1.mDefaultImageId
            if (r0 == 0) goto L8
            r1.setImageResource(r0)
            goto L1c
        L8:
            android.graphics.drawable.Drawable r0 = r1.mDefaultImageDrawable
            if (r0 == 0) goto L10
            r1.setImageDrawable(r0)
            goto L1c
        L10:
            android.graphics.Bitmap r0 = r1.mDefaultImageBitmap
            if (r0 == 0) goto L18
            r1.setImageBitmap(r0)
            goto L1c
        L18:
            r0 = 0
            r1.setImageBitmap(r0)
        L1c:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            r0.invalidate()
            return
    }

    public final void loadImageIfNecessary(boolean r9) {
            r8 = this;
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.widget.ImageView$ScaleType r7 = r8.getScaleType()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2a
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.width
            r5 = -2
            if (r2 != r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            int r6 = r6.height
            if (r6 != r5) goto L2b
            r5 = 1
            goto L2c
        L2a:
            r2 = 0
        L2b:
            r5 = 0
        L2c:
            if (r2 == 0) goto L31
            if (r5 == 0) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            if (r0 != 0) goto L39
            if (r1 != 0) goto L39
            if (r3 != 0) goto L39
            return
        L39:
            java.lang.String r3 = r8.mUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L4f
            com.android.volley.toolbox.ImageLoader$ImageContainer r9 = r8.mImageContainer
            if (r9 == 0) goto L4b
            r9.cancelRequest()
            r9 = 0
            r8.mImageContainer = r9
        L4b:
            r8.setDefaultImageOrNull()
            return
        L4f:
            com.android.volley.toolbox.ImageLoader$ImageContainer r3 = r8.mImageContainer
            if (r3 == 0) goto L70
            java.lang.String r3 = r3.getRequestUrl()
            if (r3 == 0) goto L70
            com.android.volley.toolbox.ImageLoader$ImageContainer r3 = r8.mImageContainer
            java.lang.String r3 = r3.getRequestUrl()
            java.lang.String r6 = r8.mUrl
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L68
            return
        L68:
            com.android.volley.toolbox.ImageLoader$ImageContainer r3 = r8.mImageContainer
            r3.cancelRequest()
            r8.setDefaultImageOrNull()
        L70:
            if (r2 == 0) goto L73
            r0 = 0
        L73:
            if (r5 == 0) goto L77
            r6 = 0
            goto L78
        L77:
            r6 = r1
        L78:
            com.android.volley.toolbox.ImageLoader r2 = r8.mImageLoader
            java.lang.String r3 = r8.mUrl
            com.android.volley.toolbox.NetworkImageView$1 r4 = new com.android.volley.toolbox.NetworkImageView$1
            r4.<init>(r8, r9)
            r5 = r0
            com.android.volley.toolbox.ImageLoader$ImageContainer r9 = r2.get(r3, r4, r5, r6, r7)
            r8.mImageContainer = r9
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            com.android.volley.toolbox.ImageLoader$ImageContainer r0 = r1.mImageContainer
            if (r0 == 0) goto Ld
            r0.cancelRequest()
            r0 = 0
            r1.setImageBitmap(r0)
            r1.mImageContainer = r0
        Ld:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = 1
            r0.loadImageIfNecessary(r1)
            return
    }

    public void setDefaultImageBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.mDefaultImageId = r0
            r0 = 0
            r1.mDefaultImageDrawable = r0
            r1.mDefaultImageBitmap = r2
            return
    }

    public void setDefaultImageDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.mDefaultImageId = r0
            r0 = 0
            r1.mDefaultImageBitmap = r0
            r1.mDefaultImageDrawable = r2
            return
    }

    public void setDefaultImageResId(int r2) {
            r1 = this;
            r0 = 0
            r1.mDefaultImageBitmap = r0
            r1.mDefaultImageDrawable = r0
            r1.mDefaultImageId = r2
            return
    }

    public void setErrorImageBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.mErrorImageId = r0
            r0 = 0
            r1.mErrorImageDrawable = r0
            r1.mErrorImageBitmap = r2
            return
    }

    public void setErrorImageDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.mErrorImageId = r0
            r0 = 0
            r1.mErrorImageBitmap = r0
            r1.mErrorImageDrawable = r2
            return
    }

    public void setErrorImageResId(int r2) {
            r1 = this;
            r0 = 0
            r1.mErrorImageBitmap = r0
            r1.mErrorImageDrawable = r0
            r1.mErrorImageId = r2
            return
    }

    @androidx.annotation.MainThread
    public void setImageUrl(java.lang.String r1, com.android.volley.toolbox.ImageLoader r2) {
            r0 = this;
            com.android.volley.toolbox.Threads.throwIfNotOnMainThread()
            r0.mUrl = r1
            r0.mImageLoader = r2
            r1 = 0
            r0.loadImageIfNecessary(r1)
            return
    }
}
