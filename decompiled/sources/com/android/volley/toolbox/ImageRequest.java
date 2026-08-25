package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class ImageRequest extends com.android.volley.Request<android.graphics.Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final java.lang.Object sDecodeLock = null;
    private final android.graphics.Bitmap.Config mDecodeConfig;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private com.android.volley.Response.Listener<android.graphics.Bitmap> mListener;
    private final java.lang.Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final android.widget.ImageView.ScaleType mScaleType;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.android.volley.toolbox.ImageRequest.sDecodeLock = r0
            return
    }

    @java.lang.Deprecated
    public ImageRequest(java.lang.String r9, com.android.volley.Response.Listener<android.graphics.Bitmap> r10, int r11, int r12, android.graphics.Bitmap.Config r13, com.android.volley.Response.ErrorListener r14) {
            r8 = this;
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public ImageRequest(java.lang.String r3, com.android.volley.Response.Listener<android.graphics.Bitmap> r4, int r5, int r6, android.widget.ImageView.ScaleType r7, android.graphics.Bitmap.Config r8, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r9) {
            r2 = this;
            r0 = 0
            r2.<init>(r0, r3, r9)
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.mLock = r3
            com.android.volley.DefaultRetryPolicy r3 = new com.android.volley.DefaultRetryPolicy
            r9 = 1000(0x3e8, float:1.401E-42)
            r0 = 2
            r1 = 1073741824(0x40000000, float:2.0)
            r3.<init>(r9, r0, r1)
            r2.setRetryPolicy(r3)
            r2.mListener = r4
            r2.mDecodeConfig = r8
            r2.mMaxWidth = r5
            r2.mMaxHeight = r6
            r2.mScaleType = r7
            return
    }

    private com.android.volley.Response<android.graphics.Bitmap> doParse(com.android.volley.NetworkResponse r14) {
            r13 = this;
            byte[] r0 = r14.data
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            int r2 = r13.mMaxWidth
            r3 = 0
            if (r2 != 0) goto L1a
            int r2 = r13.mMaxHeight
            if (r2 != 0) goto L1a
            android.graphics.Bitmap$Config r2 = r13.mDecodeConfig
            r1.inPreferredConfig = r2
            int r2 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2, r1)
            goto L70
        L1a:
            r2 = 1
            r1.inJustDecodeBounds = r2
            int r4 = r0.length
            android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4, r1)
            int r4 = r1.outWidth
            int r5 = r1.outHeight
            int r6 = r13.mMaxWidth
            int r7 = r13.mMaxHeight
            android.widget.ImageView$ScaleType r8 = r13.mScaleType
            int r6 = getResizedDimension(r6, r7, r4, r5, r8)
            int r7 = r13.mMaxHeight
            int r8 = r13.mMaxWidth
            android.widget.ImageView$ScaleType r9 = r13.mScaleType
            int r7 = getResizedDimension(r7, r8, r5, r4, r9)
            r1.inJustDecodeBounds = r3
            double r8 = (double) r4
            double r10 = (double) r6
            double r8 = r8 / r10
            double r4 = (double) r5
            double r10 = (double) r7
            double r4 = r4 / r10
            double r4 = java.lang.Math.min(r8, r4)
            r8 = 1065353216(0x3f800000, float:1.0)
        L47:
            r9 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r8
            double r10 = (double) r9
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 > 0) goto L52
            r8 = r9
            goto L47
        L52:
            int r4 = (int) r8
            r1.inSampleSize = r4
            int r4 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4, r1)
            if (r0 == 0) goto L70
            int r1 = r0.getWidth()
            if (r1 > r6) goto L68
            int r1 = r0.getHeight()
            if (r1 <= r7) goto L70
        L68:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r0, r6, r7, r2)
            r0.recycle()
            r0 = r1
        L70:
            if (r0 != 0) goto L7c
            com.android.volley.ParseError r0 = new com.android.volley.ParseError
            r0.<init>(r14)
            com.android.volley.Response r14 = com.android.volley.Response.error(r0)
            return r14
        L7c:
            com.android.volley.Cache$Entry r14 = com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(r14)
            com.android.volley.Response r14 = com.android.volley.Response.success(r0, r14)
            return r14
    }

    private static int getResizedDimension(int r4, int r5, int r6, int r7, android.widget.ImageView.ScaleType r8) {
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            return r6
        L5:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            if (r8 != r0) goto Ld
            if (r4 != 0) goto Lc
            return r6
        Lc:
            return r4
        Ld:
            if (r4 != 0) goto L17
            double r4 = (double) r5
            double r7 = (double) r7
            double r4 = r4 / r7
            double r6 = (double) r6
            double r6 = r6 * r4
            int r4 = (int) r6
            return r4
        L17:
            if (r5 != 0) goto L1a
            return r4
        L1a:
            double r0 = (double) r7
            double r6 = (double) r6
            double r0 = r0 / r6
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            if (r8 != r6) goto L2c
            double r6 = (double) r4
            double r6 = r6 * r0
            double r2 = (double) r5
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L2b
            double r2 = r2 / r0
            int r4 = (int) r2
        L2b:
            return r4
        L2c:
            double r6 = (double) r4
            double r6 = r6 * r0
            double r2 = (double) r5
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            double r2 = r2 / r0
            int r4 = (int) r2
        L36:
            return r4
    }

    @Override // com.android.volley.Request
    public void cancel() {
            r2 = this;
            super.cancel()
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 0
            r2.mListener = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.android.volley.Request
    public final void deliverResponse(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.android.volley.Response$Listener<android.graphics.Bitmap> r1 = r2.mListener     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.onResponse(r3)
        Ld:
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // com.android.volley.Request
    public com.android.volley.Request.Priority getPriority() {
            r1 = this;
            com.android.volley.Request$Priority r0 = com.android.volley.Request.Priority.LOW
            return r0
    }

    @Override // com.android.volley.Request
    public final com.android.volley.Response<android.graphics.Bitmap> parseNetworkResponse(com.android.volley.NetworkResponse r6) {
            r5 = this;
            java.lang.Object r0 = com.android.volley.toolbox.ImageRequest.sDecodeLock
            monitor-enter(r0)
            com.android.volley.Response r6 = r5.doParse(r6)     // Catch: java.lang.Throwable -> L9 java.lang.OutOfMemoryError -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r6
        L9:
            r6 = move-exception
            goto L30
        Lb:
            r1 = move-exception
            java.lang.String r2 = "Caught OOM for %d byte image, url=%s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9
            r4 = 0
            byte[] r6 = r6.data     // Catch: java.lang.Throwable -> L9
            int r6 = r6.length     // Catch: java.lang.Throwable -> L9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L9
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9
            r6 = 1
            java.lang.String r4 = r5.getUrl()     // Catch: java.lang.Throwable -> L9
            r3[r6] = r4     // Catch: java.lang.Throwable -> L9
            com.android.volley.VolleyLog.e(r2, r3)     // Catch: java.lang.Throwable -> L9
            com.android.volley.ParseError r6 = new com.android.volley.ParseError     // Catch: java.lang.Throwable -> L9
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L9
            com.android.volley.Response r6 = com.android.volley.Response.error(r6)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r6
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r6
    }
}
