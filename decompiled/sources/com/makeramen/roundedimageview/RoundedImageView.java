package com.makeramen.roundedimageview;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedImageView extends android.widget.ImageView {
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final android.graphics.Shader.TileMode DEFAULT_TILE_MODE = null;
    private static final android.widget.ImageView.ScaleType[] SCALE_TYPES = null;
    public static final java.lang.String TAG = "RoundedImageView";
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;
    private static final int TILE_MODE_UNDEFINED = -2;
    private android.graphics.drawable.Drawable mBackgroundDrawable;
    private int mBackgroundResource;
    private android.content.res.ColorStateList mBorderColor;
    private float mBorderWidth;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mColorMod;
    private final float[] mCornerRadii;
    private android.graphics.drawable.Drawable mDrawable;
    private boolean mHasColorFilter;
    private boolean mIsOval;
    private boolean mMutateBackground;
    private int mResource;
    private android.widget.ImageView.ScaleType mScaleType;
    private android.graphics.Shader.TileMode mTileModeX;
    private android.graphics.Shader.TileMode mTileModeY;

    /* JADX INFO: renamed from: com.makeramen.roundedimageview.RoundedImageView$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L49
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L54
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    static {
            java.lang.Class<com.makeramen.roundedimageview.RoundedImageView> r0 = com.makeramen.roundedimageview.RoundedImageView.class
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            com.makeramen.roundedimageview.RoundedImageView.DEFAULT_TILE_MODE = r0
            r0 = 8
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[r0]
            r1 = 0
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
            r0[r1] = r2
            r1 = 1
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_XY
            r0[r1] = r2
            r1 = 2
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_START
            r0[r1] = r2
            r1 = 3
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0[r1] = r2
            r1 = 4
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_END
            r0[r1] = r2
            r1 = 5
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER
            r0[r1] = r2
            r1 = 6
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0[r1] = r2
            r1 = 7
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0[r1] = r2
            com.makeramen.roundedimageview.RoundedImageView.SCALE_TYPES = r0
            return
    }

    public RoundedImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 4
            float[] r1 = new float[r1]
            r1 = {x002a: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            r0.mCornerRadii = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.mBorderColor = r1
            r1 = 0
            r0.mBorderWidth = r1
            r1 = 0
            r0.mColorFilter = r1
            r1 = 0
            r0.mColorMod = r1
            r0.mHasColorFilter = r1
            r0.mIsOval = r1
            r0.mMutateBackground = r1
            android.graphics.Shader$TileMode r1 = com.makeramen.roundedimageview.RoundedImageView.DEFAULT_TILE_MODE
            r0.mTileModeX = r1
            r0.mTileModeY = r1
            return
    }

    public RoundedImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RoundedImageView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            r0 = 4
            float[] r0 = new float[r0]
            r0 = {x0112: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            r9.mCornerRadii = r0
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r1)
            r9.mBorderColor = r2
            r2 = 0
            r9.mBorderWidth = r2
            r3 = 0
            r9.mColorFilter = r3
            r3 = 0
            r9.mColorMod = r3
            r9.mHasColorFilter = r3
            r9.mIsOval = r3
            r9.mMutateBackground = r3
            android.graphics.Shader$TileMode r4 = com.makeramen.roundedimageview.RoundedImageView.DEFAULT_TILE_MODE
            r9.mTileModeX = r4
            r9.mTileModeY = r4
            int[] r4 = com.makeramen.roundedimageview.R.styleable.RoundedImageView
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r4, r12, r3)
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_android_scaleType
            r12 = -1
            int r11 = r10.getInt(r11, r12)
            if (r11 < 0) goto L3f
            android.widget.ImageView$ScaleType[] r4 = com.makeramen.roundedimageview.RoundedImageView.SCALE_TYPES
            r11 = r4[r11]
            r9.setScaleType(r11)
            goto L44
        L3f:
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.FIT_CENTER
            r9.setScaleType(r11)
        L44:
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_corner_radius
            int r11 = r10.getDimensionPixelSize(r11, r12)
            float r11 = (float) r11
            int r4 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_corner_radius_top_left
            int r4 = r10.getDimensionPixelSize(r4, r12)
            float r4 = (float) r4
            r0[r3] = r4
            int r4 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_corner_radius_top_right
            int r4 = r10.getDimensionPixelSize(r4, r12)
            float r4 = (float) r4
            r5 = 1
            r0[r5] = r4
            r4 = 2
            int r6 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_corner_radius_bottom_right
            int r6 = r10.getDimensionPixelSize(r6, r12)
            float r6 = (float) r6
            r0[r4] = r6
            r4 = 3
            int r6 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_corner_radius_bottom_left
            int r6 = r10.getDimensionPixelSize(r6, r12)
            float r6 = (float) r6
            r0[r4] = r6
            int r0 = r0.length
            r4 = 0
            r6 = 0
        L75:
            if (r4 >= r0) goto L86
            float[] r7 = r9.mCornerRadii
            r8 = r7[r4]
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L82
            r7[r4] = r2
            goto L83
        L82:
            r6 = 1
        L83:
            int r4 = r4 + 1
            goto L75
        L86:
            if (r6 != 0) goto L9a
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L8d
            r11 = 0
        L8d:
            float[] r0 = r9.mCornerRadii
            int r0 = r0.length
            r4 = 0
        L91:
            if (r4 >= r0) goto L9a
            float[] r6 = r9.mCornerRadii
            r6[r4] = r11
            int r4 = r4 + 1
            goto L91
        L9a:
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_border_width
            int r11 = r10.getDimensionPixelSize(r11, r12)
            float r11 = (float) r11
            r9.mBorderWidth = r11
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 >= 0) goto La9
            r9.mBorderWidth = r2
        La9:
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_border_color
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            r9.mBorderColor = r11
            if (r11 != 0) goto Lb9
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r1)
            r9.mBorderColor = r11
        Lb9:
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_mutate_background
            boolean r11 = r10.getBoolean(r11, r3)
            r9.mMutateBackground = r11
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_oval
            boolean r11 = r10.getBoolean(r11, r3)
            r9.mIsOval = r11
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_tile_mode
            r12 = -2
            int r11 = r10.getInt(r11, r12)
            if (r11 == r12) goto Le0
            android.graphics.Shader$TileMode r0 = parseTileMode(r11)
            r9.setTileModeX(r0)
            android.graphics.Shader$TileMode r11 = parseTileMode(r11)
            r9.setTileModeY(r11)
        Le0:
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_tile_mode_x
            int r11 = r10.getInt(r11, r12)
            if (r11 == r12) goto Lef
            android.graphics.Shader$TileMode r11 = parseTileMode(r11)
            r9.setTileModeX(r11)
        Lef:
            int r11 = com.makeramen.roundedimageview.R.styleable.RoundedImageView_riv_tile_mode_y
            int r11 = r10.getInt(r11, r12)
            if (r11 == r12) goto Lfe
            android.graphics.Shader$TileMode r11 = parseTileMode(r11)
            r9.setTileModeY(r11)
        Lfe:
            r9.updateDrawableAttrs()
            r9.updateBackgroundDrawableAttrs(r5)
            boolean r11 = r9.mMutateBackground
            if (r11 == 0) goto L10d
            android.graphics.drawable.Drawable r11 = r9.mBackgroundDrawable
            super.setBackgroundDrawable(r11)
        L10d:
            r10.recycle()
            return
    }

    private void applyColorMod() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDrawable
            if (r0 == 0) goto L17
            boolean r1 = r2.mColorMod
            if (r1 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.mDrawable = r0
            boolean r1 = r2.mHasColorFilter
            if (r1 == 0) goto L17
            android.graphics.ColorFilter r1 = r2.mColorFilter
            r0.setColorFilter(r1)
        L17:
            return
    }

    private static android.graphics.Shader.TileMode parseTileMode(int r1) {
            if (r1 == 0) goto L10
            r0 = 1
            if (r1 == r0) goto Ld
            r0 = 2
            if (r1 == r0) goto La
            r1 = 0
            return r1
        La:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            return r1
        Ld:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            return r1
        L10:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
    }

    private android.graphics.drawable.Drawable resolveBackgroundResource() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r4.mBackgroundResource
            if (r2 == 0) goto L29
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)     // Catch: java.lang.Exception -> L11
            goto L29
        L11:
            r0 = move-exception
            java.lang.String r2 = "Unable to find resource: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = r4.mBackgroundResource
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RoundedImageView"
            android.util.Log.w(r3, r2, r0)
            r0 = 0
            r4.mBackgroundResource = r0
        L29:
            android.graphics.drawable.Drawable r0 = com.makeramen.roundedimageview.RoundedDrawable.fromDrawable(r1)
            return r0
    }

    private android.graphics.drawable.Drawable resolveResource() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r4.mResource
            if (r2 == 0) goto L29
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)     // Catch: java.lang.Exception -> L11
            goto L29
        L11:
            r0 = move-exception
            java.lang.String r2 = "Unable to find resource: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = r4.mResource
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RoundedImageView"
            android.util.Log.w(r3, r2, r0)
            r0 = 0
            r4.mResource = r0
        L29:
            android.graphics.drawable.Drawable r0 = com.makeramen.roundedimageview.RoundedDrawable.fromDrawable(r1)
            return r0
    }

    private void updateAttrs(android.graphics.drawable.Drawable r5, android.widget.ImageView.ScaleType r6) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r5 instanceof com.makeramen.roundedimageview.RoundedDrawable
            r1 = 0
            if (r0 == 0) goto L41
            com.makeramen.roundedimageview.RoundedDrawable r5 = (com.makeramen.roundedimageview.RoundedDrawable) r5
            com.makeramen.roundedimageview.RoundedDrawable r6 = r5.setScaleType(r6)
            float r0 = r4.mBorderWidth
            com.makeramen.roundedimageview.RoundedDrawable r6 = r6.setBorderWidth(r0)
            android.content.res.ColorStateList r0 = r4.mBorderColor
            com.makeramen.roundedimageview.RoundedDrawable r6 = r6.setBorderColor(r0)
            boolean r0 = r4.mIsOval
            com.makeramen.roundedimageview.RoundedDrawable r6 = r6.setOval(r0)
            android.graphics.Shader$TileMode r0 = r4.mTileModeX
            com.makeramen.roundedimageview.RoundedDrawable r6 = r6.setTileModeX(r0)
            android.graphics.Shader$TileMode r0 = r4.mTileModeY
            r6.setTileModeY(r0)
            float[] r6 = r4.mCornerRadii
            if (r6 == 0) goto L3d
            r0 = r6[r1]
            r1 = 1
            r1 = r6[r1]
            r2 = 2
            r2 = r6[r2]
            r3 = 3
            r6 = r6[r3]
            r5.setCornerRadius(r0, r1, r2, r6)
        L3d:
            r4.applyColorMod()
            goto L57
        L41:
            boolean r0 = r5 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L57
            android.graphics.drawable.LayerDrawable r5 = (android.graphics.drawable.LayerDrawable) r5
            int r0 = r5.getNumberOfLayers()
        L4b:
            if (r1 >= r0) goto L57
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r1)
            r4.updateAttrs(r2, r6)
            int r1 = r1 + 1
            goto L4b
        L57:
            return
    }

    private void updateBackgroundDrawableAttrs(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMutateBackground
            if (r0 == 0) goto L15
            if (r2 == 0) goto Le
            android.graphics.drawable.Drawable r2 = r1.mBackgroundDrawable
            android.graphics.drawable.Drawable r2 = com.makeramen.roundedimageview.RoundedDrawable.fromDrawable(r2)
            r1.mBackgroundDrawable = r2
        Le:
            android.graphics.drawable.Drawable r2 = r1.mBackgroundDrawable
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r1.updateAttrs(r2, r0)
        L15:
            return
    }

    private void updateDrawableAttrs() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDrawable
            android.widget.ImageView$ScaleType r1 = r2.mScaleType
            r2.updateAttrs(r0, r1)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            r0.invalidate()
            return
    }

    @androidx.annotation.ColorInt
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

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.getMaxCornerRadius()
            return r0
    }

    public float getCornerRadius(int r2) {
            r1 = this;
            float[] r0 = r1.mCornerRadii
            r2 = r0[r2]
            return r2
    }

    public float getMaxCornerRadius() {
            r5 = this;
            float[] r0 = r5.mCornerRadii
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L10
            r4 = r0[r3]
            float r2 = java.lang.Math.max(r4, r2)
            int r3 = r3 + 1
            goto L5
        L10:
            return r2
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.mScaleType
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
            boolean r0 = r1.mIsOval
            return r0
    }

    public void mutateBackground(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMutateBackground
            if (r0 != r2) goto L5
            return
        L5:
            r1.mMutateBackground = r2
            r2 = 1
            r1.updateBackgroundDrawableAttrs(r2)
            r1.invalidate()
            return
    }

    public boolean mutatesBackground() {
            r1 = this;
            boolean r0 = r1.mMutateBackground
            return r0
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.mBackgroundDrawable = r0
            r1.setBackgroundDrawable(r0)
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mBackgroundDrawable = r1
            r1 = 1
            r0.updateBackgroundDrawableAttrs(r1)
            android.graphics.drawable.Drawable r1 = r0.mBackgroundDrawable
            super.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            int r0 = r1.mBackgroundResource
            if (r0 == r2) goto Lf
            r1.mBackgroundResource = r2
            android.graphics.drawable.Drawable r2 = r1.resolveBackgroundResource()
            r1.mBackgroundDrawable = r2
            r1.setBackgroundDrawable(r2)
        Lf:
            return
    }

    public void setBorderColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setBorderColor(r1)
            return
    }

    public void setBorderColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBorderColor
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            return
        L9:
            if (r2 == 0) goto Lc
            goto L12
        Lc:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        L12:
            r1.mBorderColor = r2
            r1.updateDrawableAttrs()
            r2 = 0
            r1.updateBackgroundDrawableAttrs(r2)
            float r2 = r1.mBorderWidth
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L25
            r1.invalidate()
        L25:
            return
    }

    public void setBorderWidth(float r2) {
            r1 = this;
            float r0 = r1.mBorderWidth
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r1.mBorderWidth = r2
            r1.updateDrawableAttrs()
            r2 = 0
            r1.updateBackgroundDrawableAttrs(r2)
            r1.invalidate()
            return
    }

    public void setBorderWidth(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setBorderWidth(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.mColorFilter
            if (r0 == r2) goto L11
            r1.mColorFilter = r2
            r2 = 1
            r1.mHasColorFilter = r2
            r1.mColorMod = r2
            r1.applyColorMod()
            r1.invalidate()
        L11:
            return
    }

    public void setCornerRadius(float r1) {
            r0 = this;
            r0.setCornerRadius(r1, r1, r1, r1)
            return
    }

    public void setCornerRadius(float r7, float r8, float r9, float r10) {
            r6 = this;
            float[] r0 = r6.mCornerRadii
            r1 = 0
            r2 = r0[r1]
            r3 = 2
            r4 = 3
            r5 = 1
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L1f
            r2 = r0[r5]
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L1f
            r2 = r0[r3]
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L1f
            r2 = r0[r4]
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L1f
            return
        L1f:
            r0[r1] = r7
            r0[r5] = r8
            r0[r4] = r9
            r0[r3] = r10
            r6.updateDrawableAttrs()
            r6.updateBackgroundDrawableAttrs(r1)
            r6.invalidate()
            return
    }

    public void setCornerRadius(int r3, float r4) {
            r2 = this;
            float[] r0 = r2.mCornerRadii
            r1 = r0[r3]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L9
            return
        L9:
            r0[r3] = r4
            r2.updateDrawableAttrs()
            r3 = 0
            r2.updateBackgroundDrawableAttrs(r3)
            r2.invalidate()
            return
    }

    public void setCornerRadiusDimen(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCornerRadius(r2, r2, r2, r2)
            return
    }

    public void setCornerRadiusDimen(int r2, @androidx.annotation.DimenRes int r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r3 = r0.getDimensionPixelSize(r3)
            float r3 = (float) r3
            r1.setCornerRadius(r2, r3)
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.mResource = r0
            com.makeramen.roundedimageview.RoundedDrawable r2 = com.makeramen.roundedimageview.RoundedDrawable.fromBitmap(r2)
            r1.mDrawable = r2
            r1.updateDrawableAttrs()
            android.graphics.drawable.Drawable r2 = r1.mDrawable
            super.setImageDrawable(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.mResource = r0
            android.graphics.drawable.Drawable r2 = com.makeramen.roundedimageview.RoundedDrawable.fromDrawable(r2)
            r1.mDrawable = r2
            r1.updateDrawableAttrs()
            android.graphics.drawable.Drawable r2 = r1.mDrawable
            super.setImageDrawable(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            int r0 = r1.mResource
            if (r0 == r2) goto L14
            r1.mResource = r2
            android.graphics.drawable.Drawable r2 = r1.resolveResource()
            r1.mDrawable = r2
            r1.updateDrawableAttrs()
            android.graphics.drawable.Drawable r2 = r1.mDrawable
            super.setImageDrawable(r2)
        L14:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            r0.setImageDrawable(r1)
            return
    }

    public void setOval(boolean r1) {
            r0 = this;
            r0.mIsOval = r1
            r0.updateDrawableAttrs()
            r1 = 0
            r0.updateBackgroundDrawableAttrs(r1)
            r0.invalidate()
            return
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType r3) {
            r2 = this;
            android.widget.ImageView$ScaleType r0 = r2.mScaleType
            if (r0 == r3) goto L24
            r2.mScaleType = r3
            int[] r0 = com.makeramen.roundedimageview.RoundedImageView.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L15;
                case 2: goto L15;
                case 3: goto L15;
                case 4: goto L15;
                case 5: goto L15;
                case 6: goto L15;
                case 7: goto L15;
                default: goto L11;
            }
        L11:
            super.setScaleType(r3)
            goto L1a
        L15:
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY
            super.setScaleType(r3)
        L1a:
            r2.updateDrawableAttrs()
            r3 = 0
            r2.updateBackgroundDrawableAttrs(r3)
            r2.invalidate()
        L24:
            return
    }

    public void setTileModeX(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mTileModeX
            if (r0 != r2) goto L5
            return
        L5:
            r1.mTileModeX = r2
            r1.updateDrawableAttrs()
            r2 = 0
            r1.updateBackgroundDrawableAttrs(r2)
            r1.invalidate()
            return
    }

    public void setTileModeY(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mTileModeY
            if (r0 != r2) goto L5
            return
        L5:
            r1.mTileModeY = r2
            r1.updateDrawableAttrs()
            r2 = 0
            r1.updateBackgroundDrawableAttrs(r2)
            r1.invalidate()
            return
    }
}
