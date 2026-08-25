package com.makeramen.roundedimageview;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedDrawable extends android.graphics.drawable.Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final java.lang.String TAG = "RoundedDrawable";
    private final android.graphics.Bitmap mBitmap;
    private final int mBitmapHeight;
    private final android.graphics.Paint mBitmapPaint;
    private final android.graphics.RectF mBitmapRect;
    private final int mBitmapWidth;
    private android.content.res.ColorStateList mBorderColor;
    private final android.graphics.Paint mBorderPaint;
    private final android.graphics.RectF mBorderRect;
    private float mBorderWidth;
    private final android.graphics.RectF mBounds;
    private float mCornerRadius;
    private final boolean[] mCornersRounded;
    private final android.graphics.RectF mDrawableRect;
    private boolean mOval;
    private boolean mRebuildShader;
    private android.widget.ImageView.ScaleType mScaleType;
    private final android.graphics.Matrix mShaderMatrix;
    private final android.graphics.RectF mSquareCornersRect;
    private android.graphics.Shader.TileMode mTileModeX;
    private android.graphics.Shader.TileMode mTileModeY;

    /* JADX INFO: renamed from: com.makeramen.roundedimageview.RoundedDrawable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L49
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L54
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public RoundedDrawable(android.graphics.Bitmap r6) {
            r5 = this;
            r5.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.mBounds = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.mDrawableRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.mBitmapRect = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.mBorderRect = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r5.mShaderMatrix = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.mSquareCornersRect = r1
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            r5.mTileModeX = r1
            r5.mTileModeY = r1
            r1 = 1
            r5.mRebuildShader = r1
            r2 = 0
            r5.mCornerRadius = r2
            r3 = 4
            boolean[] r3 = new boolean[r3]
            r3 = {x0096: FILL_ARRAY_DATA , data: [1, 1, 1, 1} // fill-array
            r5.mCornersRounded = r3
            r3 = 0
            r5.mOval = r3
            r5.mBorderWidth = r2
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r3)
            r5.mBorderColor = r4
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5.mScaleType = r4
            r5.mBitmap = r6
            int r4 = r6.getWidth()
            r5.mBitmapWidth = r4
            int r6 = r6.getHeight()
            r5.mBitmapHeight = r6
            float r4 = (float) r4
            float r6 = (float) r6
            r0.set(r2, r2, r4, r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r5.mBitmapPaint = r6
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r6.setStyle(r0)
            r6.setAntiAlias(r1)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r5.mBorderPaint = r6
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r0)
            r6.setAntiAlias(r1)
            android.content.res.ColorStateList r0 = r5.mBorderColor
            int[] r1 = r5.getState()
            int r0 = r0.getColorForState(r1, r3)
            r6.setColor(r0)
            float r0 = r5.mBorderWidth
            r6.setStrokeWidth(r0)
            return
    }

    private static boolean all(boolean[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Ld
            boolean r3 = r4[r2]
            if (r3 == 0) goto La
            return r1
        La:
            int r2 = r2 + 1
            goto L3
        Ld:
            r4 = 1
            return r4
    }

    private static boolean any(boolean[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            boolean r3 = r4[r2]
            if (r3 == 0) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    public static android.graphics.Bitmap drawableToBitmap(android.graphics.drawable.Drawable r5) {
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            android.graphics.Bitmap r5 = r5.getBitmap()
            return r5
        Lb:
            int r0 = r5.getIntrinsicWidth()
            r1 = 2
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r5.getIntrinsicHeight()
            int r1 = java.lang.Math.max(r2, r1)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L37
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)     // Catch: java.lang.Exception -> L37
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L37
            r1.<init>(r0)     // Catch: java.lang.Exception -> L37
            int r2 = r1.getWidth()     // Catch: java.lang.Exception -> L37
            int r3 = r1.getHeight()     // Catch: java.lang.Exception -> L37
            r4 = 0
            r5.setBounds(r4, r4, r2, r3)     // Catch: java.lang.Exception -> L37
            r5.draw(r1)     // Catch: java.lang.Exception -> L37
            goto L43
        L37:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.String r5 = "RoundedDrawable"
            java.lang.String r0 = "Failed to create bitmap from drawable!"
            android.util.Log.w(r5, r0)
            r0 = 0
        L43:
            return r0
    }

    public static com.makeramen.roundedimageview.RoundedDrawable fromBitmap(android.graphics.Bitmap r1) {
            if (r1 == 0) goto L8
            com.makeramen.roundedimageview.RoundedDrawable r0 = new com.makeramen.roundedimageview.RoundedDrawable
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    public static android.graphics.drawable.Drawable fromDrawable(android.graphics.drawable.Drawable r4) {
            if (r4 == 0) goto L32
            boolean r0 = r4 instanceof com.makeramen.roundedimageview.RoundedDrawable
            if (r0 == 0) goto L7
            return r4
        L7:
            boolean r0 = r4 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L27
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4
            int r0 = r4.getNumberOfLayers()
            r1 = 0
        L12:
            if (r1 >= r0) goto L26
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r1)
            int r3 = r4.getId(r1)
            android.graphics.drawable.Drawable r2 = fromDrawable(r2)
            r4.setDrawableByLayerId(r3, r2)
            int r1 = r1 + 1
            goto L12
        L26:
            return r4
        L27:
            android.graphics.Bitmap r0 = drawableToBitmap(r4)
            if (r0 == 0) goto L32
            com.makeramen.roundedimageview.RoundedDrawable r4 = new com.makeramen.roundedimageview.RoundedDrawable
            r4.<init>(r0)
        L32:
            return r4
    }

    private static boolean only(int r5, boolean[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            r3 = 1
            if (r2 >= r0) goto L12
            boolean r4 = r6[r2]
            if (r2 != r5) goto Lb
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r4 == r3) goto Lf
            return r1
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r3
    }

    private void redrawBitmapForSquareCorners(android.graphics.Canvas r9) {
            r8 = this;
            boolean[] r0 = r8.mCornersRounded
            boolean r0 = all(r0)
            if (r0 == 0) goto L9
            return
        L9:
            float r0 = r8.mCornerRadius
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            return
        L11:
            android.graphics.RectF r0 = r8.mDrawableRect
            float r1 = r0.left
            float r2 = r0.top
            float r0 = r0.width()
            float r0 = r0 + r1
            android.graphics.RectF r3 = r8.mDrawableRect
            float r3 = r3.height()
            float r3 = r3 + r2
            float r4 = r8.mCornerRadius
            boolean[] r5 = r8.mCornersRounded
            r6 = 0
            boolean r5 = r5[r6]
            if (r5 != 0) goto L3c
            android.graphics.RectF r5 = r8.mSquareCornersRect
            float r6 = r1 + r4
            float r7 = r2 + r4
            r5.set(r1, r2, r6, r7)
            android.graphics.RectF r5 = r8.mSquareCornersRect
            android.graphics.Paint r6 = r8.mBitmapPaint
            r9.drawRect(r5, r6)
        L3c:
            boolean[] r5 = r8.mCornersRounded
            r6 = 1
            boolean r5 = r5[r6]
            if (r5 != 0) goto L51
            android.graphics.RectF r5 = r8.mSquareCornersRect
            float r6 = r0 - r4
            r5.set(r6, r2, r0, r4)
            android.graphics.RectF r2 = r8.mSquareCornersRect
            android.graphics.Paint r5 = r8.mBitmapPaint
            r9.drawRect(r2, r5)
        L51:
            boolean[] r2 = r8.mCornersRounded
            r5 = 2
            boolean r2 = r2[r5]
            if (r2 != 0) goto L68
            android.graphics.RectF r2 = r8.mSquareCornersRect
            float r5 = r0 - r4
            float r6 = r3 - r4
            r2.set(r5, r6, r0, r3)
            android.graphics.RectF r0 = r8.mSquareCornersRect
            android.graphics.Paint r2 = r8.mBitmapPaint
            r9.drawRect(r0, r2)
        L68:
            boolean[] r0 = r8.mCornersRounded
            r2 = 3
            boolean r0 = r0[r2]
            if (r0 != 0) goto L7e
            android.graphics.RectF r0 = r8.mSquareCornersRect
            float r2 = r3 - r4
            float r4 = r4 + r1
            r0.set(r1, r2, r4, r3)
            android.graphics.RectF r0 = r8.mSquareCornersRect
            android.graphics.Paint r1 = r8.mBitmapPaint
            r9.drawRect(r0, r1)
        L7e:
            return
    }

    private void redrawBorderForSquareCorners(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            boolean[] r1 = r0.mCornersRounded
            boolean r1 = all(r1)
            if (r1 == 0) goto Lb
            return
        Lb:
            float r1 = r0.mCornerRadius
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L13
            return
        L13:
            android.graphics.RectF r1 = r0.mDrawableRect
            float r8 = r1.left
            float r9 = r1.top
            float r1 = r1.width()
            float r1 = r1 + r8
            android.graphics.RectF r2 = r0.mDrawableRect
            float r2 = r2.height()
            float r16 = r2 + r9
            float r15 = r0.mCornerRadius
            float r2 = r0.mBorderWidth
            r3 = 1073741824(0x40000000, float:2.0)
            float r17 = r2 / r3
            boolean[] r2 = r0.mCornersRounded
            r3 = 0
            boolean r2 = r2[r3]
            if (r2 != 0) goto L4d
            float r3 = r8 - r17
            float r5 = r8 + r15
            android.graphics.Paint r7 = r0.mBorderPaint
            r2 = r19
            r4 = r9
            r6 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
            float r4 = r9 - r17
            float r6 = r9 + r15
            android.graphics.Paint r7 = r0.mBorderPaint
            r3 = r8
            r5 = r8
            r2.drawLine(r3, r4, r5, r6, r7)
        L4d:
            boolean[] r2 = r0.mCornersRounded
            r3 = 1
            boolean r2 = r2[r3]
            if (r2 != 0) goto L6c
            float r2 = r1 - r15
            float r3 = r2 - r17
            android.graphics.Paint r7 = r0.mBorderPaint
            r2 = r19
            r4 = r9
            r5 = r1
            r6 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
            float r4 = r9 - r17
            float r6 = r9 + r15
            android.graphics.Paint r7 = r0.mBorderPaint
            r3 = r1
            r2.drawLine(r3, r4, r5, r6, r7)
        L6c:
            boolean[] r2 = r0.mCornersRounded
            r3 = 2
            boolean r2 = r2[r3]
            if (r2 != 0) goto L94
            float r2 = r1 - r15
            float r11 = r2 - r17
            float r13 = r1 + r17
            android.graphics.Paint r2 = r0.mBorderPaint
            r10 = r19
            r12 = r16
            r14 = r16
            r9 = r15
            r15 = r2
            r10.drawLine(r11, r12, r13, r14, r15)
            float r4 = r16 - r9
            android.graphics.Paint r7 = r0.mBorderPaint
            r2 = r19
            r3 = r1
            r5 = r1
            r6 = r16
            r2.drawLine(r3, r4, r5, r6, r7)
            goto L95
        L94:
            r9 = r15
        L95:
            boolean[] r1 = r0.mCornersRounded
            r2 = 3
            boolean r1 = r1[r2]
            if (r1 != 0) goto Lb8
            float r11 = r8 - r17
            float r13 = r8 + r9
            android.graphics.Paint r15 = r0.mBorderPaint
            r10 = r19
            r12 = r16
            r14 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
            float r4 = r16 - r9
            android.graphics.Paint r7 = r0.mBorderPaint
            r2 = r19
            r3 = r8
            r5 = r8
            r6 = r16
            r2.drawLine(r3, r4, r5, r6, r7)
        Lb8:
            return
    }

    private void updateShaderMatrix() {
            r7 = this;
            int[] r0 = com.makeramen.roundedimageview.RoundedDrawable.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType
            android.widget.ImageView$ScaleType r1 = r7.mScaleType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L1d9
            r1 = 2
            if (r0 == r1) goto L15e
            r1 = 3
            if (r0 == r1) goto Ld3
            r1 = 5
            if (r0 == r1) goto La3
            r1 = 6
            if (r0 == r1) goto L73
            r1 = 7
            if (r0 == r1) goto L50
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBitmapRect
            r0.set(r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBounds
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r1, r2, r4)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBorderRect
            r0.mapRect(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r2 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r2, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBorderRect
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L212
        L50:
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBounds
            r0.set(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r2 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r2, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            r0.reset()
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBorderRect
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L212
        L73:
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBitmapRect
            r0.set(r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBounds
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.START
            r0.setRectToRect(r1, r2, r4)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBorderRect
            r0.mapRect(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r2 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r2, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBorderRect
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L212
        La3:
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBitmapRect
            r0.set(r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBounds
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.END
            r0.setRectToRect(r1, r2, r4)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBorderRect
            r0.mapRect(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r2 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r2, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBorderRect
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L212
        Ld3:
            android.graphics.Matrix r0 = r7.mShaderMatrix
            r0.reset()
            int r0 = r7.mBitmapWidth
            float r0 = (float) r0
            android.graphics.RectF r1 = r7.mBounds
            float r1 = r1.width()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lf5
            int r0 = r7.mBitmapHeight
            float r0 = (float) r0
            android.graphics.RectF r1 = r7.mBounds
            float r1 = r1.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lf5
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L10d
        Lf5:
            android.graphics.RectF r0 = r7.mBounds
            float r0 = r0.width()
            int r1 = r7.mBitmapWidth
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r7.mBounds
            float r1 = r1.height()
            int r4 = r7.mBitmapHeight
            float r4 = (float) r4
            float r1 = r1 / r4
            float r0 = java.lang.Math.min(r0, r1)
        L10d:
            android.graphics.RectF r1 = r7.mBounds
            float r1 = r1.width()
            int r4 = r7.mBitmapWidth
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r2
            float r1 = r1 + r2
            int r1 = (int) r1
            float r1 = (float) r1
            android.graphics.RectF r4 = r7.mBounds
            float r4 = r4.height()
            int r5 = r7.mBitmapHeight
            float r5 = (float) r5
            float r5 = r5 * r0
            float r4 = r4 - r5
            float r4 = r4 * r2
            float r4 = r4 + r2
            int r2 = (int) r4
            float r2 = (float) r2
            android.graphics.Matrix r4 = r7.mShaderMatrix
            r4.setScale(r0, r0)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            r0.postTranslate(r1, r2)
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBitmapRect
            r0.set(r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBorderRect
            r0.mapRect(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r2 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r2, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBitmapRect
            android.graphics.RectF r2 = r7.mBorderRect
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L212
        L15e:
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBounds
            r0.set(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r4 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            r0.reset()
            int r0 = r7.mBitmapWidth
            float r0 = (float) r0
            android.graphics.RectF r1 = r7.mBorderRect
            float r1 = r1.height()
            float r1 = r1 * r0
            android.graphics.RectF r0 = r7.mBorderRect
            float r0 = r0.width()
            int r4 = r7.mBitmapHeight
            float r4 = (float) r4
            float r0 = r0 * r4
            r4 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1a9
            android.graphics.RectF r0 = r7.mBorderRect
            float r0 = r0.height()
            int r1 = r7.mBitmapHeight
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r7.mBorderRect
            float r1 = r1.width()
            int r4 = r7.mBitmapWidth
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r4 = r1 * r2
            r1 = 0
            goto L1c1
        L1a9:
            android.graphics.RectF r0 = r7.mBorderRect
            float r0 = r0.width()
            int r1 = r7.mBitmapWidth
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.RectF r1 = r7.mBorderRect
            float r1 = r1.height()
            int r5 = r7.mBitmapHeight
            float r5 = (float) r5
            float r5 = r5 * r0
            float r1 = r1 - r5
            float r1 = r1 * r2
        L1c1:
            android.graphics.Matrix r5 = r7.mShaderMatrix
            r5.setScale(r0, r0)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            float r4 = r4 + r2
            int r4 = (int) r4
            float r4 = (float) r4
            float r5 = r7.mBorderWidth
            float r6 = r5 / r3
            float r6 = r6 + r4
            float r1 = r1 + r2
            int r1 = (int) r1
            float r1 = (float) r1
            float r5 = r5 / r3
            float r5 = r5 + r1
            r0.postTranslate(r6, r5)
            goto L212
        L1d9:
            android.graphics.RectF r0 = r7.mBorderRect
            android.graphics.RectF r1 = r7.mBounds
            r0.set(r1)
            android.graphics.RectF r0 = r7.mBorderRect
            float r1 = r7.mBorderWidth
            float r4 = r1 / r3
            float r1 = r1 / r3
            r0.inset(r4, r1)
            android.graphics.Matrix r0 = r7.mShaderMatrix
            r0.reset()
            android.graphics.Matrix r0 = r7.mShaderMatrix
            android.graphics.RectF r1 = r7.mBorderRect
            float r1 = r1.width()
            int r3 = r7.mBitmapWidth
            float r3 = (float) r3
            float r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2, r2)
            int r1 = (int) r1
            float r1 = (float) r1
            android.graphics.RectF r3 = r7.mBorderRect
            float r3 = r3.height()
            int r4 = r7.mBitmapHeight
            float r4 = (float) r4
            float r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r4, r2, r2)
            int r2 = (int) r2
            float r2 = (float) r2
            r0.setTranslate(r1, r2)
        L212:
            android.graphics.RectF r0 = r7.mDrawableRect
            android.graphics.RectF r1 = r7.mBorderRect
            r0.set(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.mRebuildShader
            if (r0 == 0) goto L26
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r1 = r4.mBitmap
            android.graphics.Shader$TileMode r2 = r4.mTileModeX
            android.graphics.Shader$TileMode r3 = r4.mTileModeY
            r0.<init>(r1, r2, r3)
            android.graphics.Shader$TileMode r1 = r4.mTileModeX
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            if (r1 != r2) goto L1e
            android.graphics.Shader$TileMode r1 = r4.mTileModeY
            if (r1 != r2) goto L1e
            android.graphics.Matrix r1 = r4.mShaderMatrix
            r0.setLocalMatrix(r1)
        L1e:
            android.graphics.Paint r1 = r4.mBitmapPaint
            r1.setShader(r0)
            r0 = 0
            r4.mRebuildShader = r0
        L26:
            boolean r0 = r4.mOval
            r1 = 0
            if (r0 == 0) goto L48
            float r0 = r4.mBorderWidth
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            android.graphics.RectF r0 = r4.mDrawableRect
            android.graphics.Paint r1 = r4.mBitmapPaint
            r5.drawOval(r0, r1)
            android.graphics.RectF r0 = r4.mBorderRect
            android.graphics.Paint r1 = r4.mBorderPaint
            r5.drawOval(r0, r1)
            goto L8c
        L40:
            android.graphics.RectF r0 = r4.mDrawableRect
            android.graphics.Paint r1 = r4.mBitmapPaint
            r5.drawOval(r0, r1)
            goto L8c
        L48:
            boolean[] r0 = r4.mCornersRounded
            boolean r0 = any(r0)
            if (r0 == 0) goto L78
            float r0 = r4.mCornerRadius
            float r2 = r4.mBorderWidth
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6d
            android.graphics.RectF r1 = r4.mDrawableRect
            android.graphics.Paint r2 = r4.mBitmapPaint
            r5.drawRoundRect(r1, r0, r0, r2)
            android.graphics.RectF r1 = r4.mBorderRect
            android.graphics.Paint r2 = r4.mBorderPaint
            r5.drawRoundRect(r1, r0, r0, r2)
            r4.redrawBitmapForSquareCorners(r5)
            r4.redrawBorderForSquareCorners(r5)
            goto L8c
        L6d:
            android.graphics.RectF r1 = r4.mDrawableRect
            android.graphics.Paint r2 = r4.mBitmapPaint
            r5.drawRoundRect(r1, r0, r0, r2)
            r4.redrawBitmapForSquareCorners(r5)
            goto L8c
        L78:
            android.graphics.RectF r0 = r4.mDrawableRect
            android.graphics.Paint r2 = r4.mBitmapPaint
            r5.drawRect(r0, r2)
            float r0 = r4.mBorderWidth
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8c
            android.graphics.RectF r0 = r4.mBorderRect
            android.graphics.Paint r1 = r4.mBorderPaint
            r5.drawRect(r0, r1)
        L8c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.mBitmapPaint
            int r0 = r0.getAlpha()
            return r0
    }

    public int getBorderColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBorderColor
            int r0 = r0.getDefaultColor()
            return r0
    }

    public android.content.res.ColorStateList getBorderColors() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBorderColor
            return r0
    }

    public float getBorderWidth() {
            r1 = this;
            float r0 = r1.mBorderWidth
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.mBitmapPaint
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.mCornerRadius
            return r0
    }

    public float getCornerRadius(int r2) {
            r1 = this;
            boolean[] r0 = r1.mCornersRounded
            boolean r2 = r0[r2]
            if (r2 == 0) goto L9
            float r2 = r1.mCornerRadius
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mBitmapHeight
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mBitmapWidth
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.mScaleType
            return r0
    }

    public android.graphics.Bitmap getSourceBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mBitmap
            return r0
    }

    public android.graphics.Shader.TileMode getTileModeX() {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mTileModeX
            return r0
    }

    public android.graphics.Shader.TileMode getTileModeY() {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mTileModeY
            return r0
    }

    public boolean isOval() {
            r1 = this;
            boolean r0 = r1.mOval
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBorderColor
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            super.onBoundsChange(r2)
            android.graphics.RectF r0 = r1.mBounds
            r0.set(r2)
            r1.updateShaderMatrix()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.mBorderColor
            r1 = 0
            int r0 = r0.getColorForState(r3, r1)
            android.graphics.Paint r1 = r2.mBorderPaint
            int r1 = r1.getColor()
            if (r1 == r0) goto L16
            android.graphics.Paint r3 = r2.mBorderPaint
            r3.setColor(r0)
            r3 = 1
            return r3
        L16:
            boolean r3 = super.onStateChange(r3)
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBitmapPaint
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    public com.makeramen.roundedimageview.RoundedDrawable setBorderColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            com.makeramen.roundedimageview.RoundedDrawable r1 = r0.setBorderColor(r1)
            return r1
    }

    public com.makeramen.roundedimageview.RoundedDrawable setBorderColor(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 == 0) goto L3
            goto L8
        L3:
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L8:
            r3.mBorderColor = r4
            android.graphics.Paint r0 = r3.mBorderPaint
            int[] r1 = r3.getState()
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return r3
    }

    public com.makeramen.roundedimageview.RoundedDrawable setBorderWidth(float r2) {
            r1 = this;
            r1.mBorderWidth = r2
            android.graphics.Paint r0 = r1.mBorderPaint
            r0.setStrokeWidth(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBitmapPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public com.makeramen.roundedimageview.RoundedDrawable setCornerRadius(float r1) {
            r0 = this;
            r0.setCornerRadius(r1, r1, r1, r1)
            return r0
    }

    public com.makeramen.roundedimageview.RoundedDrawable setCornerRadius(float r5, float r6, float r7, float r8) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 4
            r0.<init>(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r0.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            r0.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r0.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r0.add(r1)
            r1 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r0.remove(r2)
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L9a
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L6f
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            boolean r2 = java.lang.Float.isInfinite(r0)
            if (r2 != 0) goto L58
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L58
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L58
            r4.mCornerRadius = r0
            goto L71
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Invalid radius value: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L6f:
            r4.mCornerRadius = r1
        L71:
            boolean[] r0 = r4.mCornersRounded
            r2 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L7a
            r5 = 1
            goto L7b
        L7a:
            r5 = 0
        L7b:
            r0[r2] = r5
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 <= 0) goto L83
            r5 = 1
            goto L84
        L83:
            r5 = 0
        L84:
            r0[r3] = r5
            r5 = 2
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 <= 0) goto L8d
            r6 = 1
            goto L8e
        L8d:
            r6 = 0
        L8e:
            r0[r5] = r6
            r5 = 3
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L96
            goto L97
        L96:
            r3 = 0
        L97:
            r0[r5] = r3
            return r4
        L9a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Multiple nonzero corner radii not yet supported."
            r5.<init>(r6)
            throw r5
    }

    public com.makeramen.roundedimageview.RoundedDrawable setCornerRadius(int r5, float r6) {
            r4 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 == 0) goto L18
            float r2 = r4.mCornerRadius
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 == 0) goto L18
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L18
        L10:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Multiple nonzero corner radii not yet supported."
            r5.<init>(r6)
            throw r5
        L18:
            if (r1 != 0) goto L2a
            boolean[] r6 = r4.mCornersRounded
            boolean r6 = only(r5, r6)
            if (r6 == 0) goto L24
            r4.mCornerRadius = r0
        L24:
            boolean[] r6 = r4.mCornersRounded
            r0 = 0
            r6[r5] = r0
            goto L37
        L2a:
            float r1 = r4.mCornerRadius
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L32
            r4.mCornerRadius = r6
        L32:
            boolean[] r6 = r4.mCornersRounded
            r0 = 1
            r6[r5] = r0
        L37:
            return r4
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBitmapPaint
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBitmapPaint
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    public com.makeramen.roundedimageview.RoundedDrawable setOval(boolean r1) {
            r0 = this;
            r0.mOval = r1
            return r0
    }

    public com.makeramen.roundedimageview.RoundedDrawable setScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            if (r2 != 0) goto L4
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
        L4:
            android.widget.ImageView$ScaleType r0 = r1.mScaleType
            if (r0 == r2) goto Ld
            r1.mScaleType = r2
            r1.updateShaderMatrix()
        Ld:
            return r1
    }

    public com.makeramen.roundedimageview.RoundedDrawable setTileModeX(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mTileModeX
            if (r0 == r2) goto Lc
            r1.mTileModeX = r2
            r2 = 1
            r1.mRebuildShader = r2
            r1.invalidateSelf()
        Lc:
            return r1
    }

    public com.makeramen.roundedimageview.RoundedDrawable setTileModeY(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mTileModeY
            if (r0 == r2) goto Lc
            r1.mTileModeY = r2
            r2 = 1
            r1.mRebuildShader = r2
            r1.invalidateSelf()
        Lc:
            return r1
    }

    public android.graphics.Bitmap toBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = drawableToBitmap(r1)
            return r0
    }
}
