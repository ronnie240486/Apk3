package androidx.constraintlayout.utils.widget;

/* JADX INFO: loaded from: classes2.dex */
public class MotionLabel extends android.view.View implements androidx.constraintlayout.motion.widget.FloatLayout {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private boolean mAutoSize;
    private int mAutoSizeTextType;
    public float mBackgroundPanX;
    public float mBackgroundPanY;
    private float mBaseTextSize;
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private java.lang.String mFontFamily;
    private int mGravity;
    private android.text.Layout mLayout;
    public boolean mNotBuilt;
    public android.graphics.Matrix mOutlinePositionMatrix;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    public android.text.TextPaint mPaint;
    public android.graphics.Path mPath;
    public android.graphics.RectF mRect;
    public float mRotate;
    private float mRound;
    private float mRoundPercent;
    private int mStyleIndex;
    public android.graphics.Paint mTempPaint;
    public android.graphics.Rect mTempRect;
    private java.lang.String mText;
    private android.graphics.drawable.Drawable mTextBackground;
    private android.graphics.Bitmap mTextBackgroundBitmap;
    private android.graphics.Rect mTextBounds;
    private int mTextFillColor;
    private int mTextOutlineColor;
    private float mTextOutlineThickness;
    private float mTextPanX;
    private float mTextPanY;
    private android.graphics.BitmapShader mTextShader;
    private android.graphics.Matrix mTextShaderMatrix;
    private float mTextSize;
    private int mTextureEffect;
    private float mTextureHeight;
    private float mTextureWidth;
    private java.lang.CharSequence mTransformed;
    private int mTypefaceIndex;
    private boolean mUseOutline;
    public android.view.ViewOutlineProvider mViewOutlineProvider;
    public float mZoom;
    public android.graphics.Paint paintCache;
    public float paintTextSize;



    public MotionLabel(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r5.mPaint = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.mPath = r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r5.mTextFillColor = r0
            r5.mTextOutlineColor = r0
            r0 = 0
            r5.mUseOutline = r0
            r1 = 0
            r5.mRoundPercent = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r5.mRound = r2
            r3 = 1111490560(0x42400000, float:48.0)
            r5.mTextSize = r3
            r5.mBaseTextSize = r2
            r5.mTextOutlineThickness = r1
            java.lang.String r3 = "Hello World"
            r5.mText = r3
            r3 = 1
            r5.mNotBuilt = r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.mTextBounds = r4
            r5.mPaddingLeft = r3
            r5.mPaddingRight = r3
            r5.mPaddingTop = r3
            r5.mPaddingBottom = r3
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r5.mGravity = r3
            r5.mAutoSizeTextType = r0
            r5.mAutoSize = r0
            r5.mTextureHeight = r2
            r5.mTextureWidth = r2
            r5.mTextPanX = r1
            r5.mTextPanY = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.paintCache = r1
            r5.mTextureEffect = r0
            r5.mBackgroundPanX = r2
            r5.mBackgroundPanY = r2
            r5.mZoom = r2
            r5.mRotate = r2
            r0 = 0
            r5.init(r6, r0)
            return
    }

    public MotionLabel(android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r5.mPaint = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.mPath = r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r5.mTextFillColor = r0
            r5.mTextOutlineColor = r0
            r0 = 0
            r5.mUseOutline = r0
            r1 = 0
            r5.mRoundPercent = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r5.mRound = r2
            r3 = 1111490560(0x42400000, float:48.0)
            r5.mTextSize = r3
            r5.mBaseTextSize = r2
            r5.mTextOutlineThickness = r1
            java.lang.String r3 = "Hello World"
            r5.mText = r3
            r3 = 1
            r5.mNotBuilt = r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.mTextBounds = r4
            r5.mPaddingLeft = r3
            r5.mPaddingRight = r3
            r5.mPaddingTop = r3
            r5.mPaddingBottom = r3
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r5.mGravity = r3
            r5.mAutoSizeTextType = r0
            r5.mAutoSize = r0
            r5.mTextureHeight = r2
            r5.mTextureWidth = r2
            r5.mTextPanX = r1
            r5.mTextPanY = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.paintCache = r1
            r5.mTextureEffect = r0
            r5.mBackgroundPanX = r2
            r5.mBackgroundPanY = r2
            r5.mZoom = r2
            r5.mRotate = r2
            r5.init(r6, r7)
            return
    }

    public MotionLabel(android.content.Context r5, @androidx.annotation.Nullable android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.text.TextPaint r7 = new android.text.TextPaint
            r7.<init>()
            r4.mPaint = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r4.mPath = r7
            r7 = 65535(0xffff, float:9.1834E-41)
            r4.mTextFillColor = r7
            r4.mTextOutlineColor = r7
            r7 = 0
            r4.mUseOutline = r7
            r0 = 0
            r4.mRoundPercent = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.mRound = r1
            r2 = 1111490560(0x42400000, float:48.0)
            r4.mTextSize = r2
            r4.mBaseTextSize = r1
            r4.mTextOutlineThickness = r0
            java.lang.String r2 = "Hello World"
            r4.mText = r2
            r2 = 1
            r4.mNotBuilt = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4.mTextBounds = r3
            r4.mPaddingLeft = r2
            r4.mPaddingRight = r2
            r4.mPaddingTop = r2
            r4.mPaddingBottom = r2
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r4.mGravity = r2
            r4.mAutoSizeTextType = r7
            r4.mAutoSize = r7
            r4.mTextureHeight = r1
            r4.mTextureWidth = r1
            r4.mTextPanX = r0
            r4.mTextPanY = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.paintCache = r0
            r4.mTextureEffect = r7
            r4.mBackgroundPanX = r1
            r4.mBackgroundPanY = r1
            r4.mZoom = r1
            r4.mRotate = r1
            r4.init(r5, r6)
            return
    }

    public static /* synthetic */ float access$000(androidx.constraintlayout.utils.widget.MotionLabel r0) {
            float r0 = r0.mRoundPercent
            return r0
    }

    public static /* synthetic */ float access$100(androidx.constraintlayout.utils.widget.MotionLabel r0) {
            float r0 = r0.mRound
            return r0
    }

    private void adjustTexture(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mTextShaderMatrix
            if (r0 != 0) goto L5
            return
        L5:
            float r4 = r4 - r2
            r1.mFloatWidth = r4
            float r5 = r5 - r3
            r1.mFloatHeight = r5
            r1.updateShaderMatrix()
            return
    }

    private float getHorizontalOffset() {
            r6 = this;
            float r0 = r6.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Ld
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L12
        Ld:
            float r0 = r6.mTextSize
            float r2 = r6.mBaseTextSize
            float r0 = r0 / r2
        L12:
            android.text.TextPaint r2 = r6.mPaint
            java.lang.String r3 = r6.mText
            r4 = 0
            int r5 = r3.length()
            float r2 = r2.measureText(r3, r4, r5)
            float r2 = r2 * r0
            float r0 = r6.mFloatWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L2f
            int r0 = r6.getMeasuredWidth()
            float r0 = (float) r0
            goto L31
        L2f:
            float r0 = r6.mFloatWidth
        L31:
            int r3 = r6.getPaddingLeft()
            float r3 = (float) r3
            float r0 = r0 - r3
            int r3 = r6.getPaddingRight()
            float r3 = (float) r3
            float r0 = r0 - r3
            float r0 = r0 - r2
            float r2 = r6.mTextPanX
            float r2 = r2 + r1
            float r2 = r2 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            return r2
    }

    private float getVerticalOffset() {
            r5 = this;
            float r0 = r5.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Ld
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L12
        Ld:
            float r0 = r5.mTextSize
            float r2 = r5.mBaseTextSize
            float r0 = r0 / r2
        L12:
            android.text.TextPaint r2 = r5.mPaint
            android.graphics.Paint$FontMetrics r2 = r2.getFontMetrics()
            float r3 = r5.mFloatHeight
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L26
            int r3 = r5.getMeasuredHeight()
            float r3 = (float) r3
            goto L28
        L26:
            float r3 = r5.mFloatHeight
        L28:
            int r4 = r5.getPaddingTop()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            float r4 = (float) r4
            float r3 = r3 - r4
            float r4 = r2.descent
            float r2 = r2.ascent
            float r4 = r4 - r2
            float r4 = r4 * r0
            float r3 = r3 - r4
            float r4 = r5.mTextPanY
            float r1 = r1 - r4
            float r1 = r1 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r0 = r0 * r2
            float r1 = r1 - r0
            return r1
    }

    private void init(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.setUpTheme(r6, r7)
            r6 = 1
            if (r7 == 0) goto L165
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.MotionLabel
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = 0
        L16:
            if (r2 >= r0) goto L162
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_text
            if (r3 != r4) goto L29
            java.lang.CharSequence r3 = r7.getText(r3)
            r5.setText(r3)
            goto L15e
        L29:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_fontFamily
            if (r3 != r4) goto L35
            java.lang.String r3 = r7.getString(r3)
            r5.mFontFamily = r3
            goto L15e
        L35:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_scaleFromTextSize
            if (r3 != r4) goto L45
            float r4 = r5.mBaseTextSize
            int r4 = (int) r4
            int r3 = r7.getDimensionPixelSize(r3, r4)
            float r3 = (float) r3
            r5.mBaseTextSize = r3
            goto L15e
        L45:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_textSize
            if (r3 != r4) goto L55
            float r4 = r5.mTextSize
            int r4 = (int) r4
            int r3 = r7.getDimensionPixelSize(r3, r4)
            float r3 = (float) r3
            r5.mTextSize = r3
            goto L15e
        L55:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_textStyle
            if (r3 != r4) goto L63
            int r4 = r5.mStyleIndex
            int r3 = r7.getInt(r3, r4)
            r5.mStyleIndex = r3
            goto L15e
        L63:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_typeface
            if (r3 != r4) goto L71
            int r4 = r5.mTypefaceIndex
            int r3 = r7.getInt(r3, r4)
            r5.mTypefaceIndex = r3
            goto L15e
        L71:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_textColor
            if (r3 != r4) goto L7f
            int r4 = r5.mTextFillColor
            int r3 = r7.getColor(r3, r4)
            r5.mTextFillColor = r3
            goto L15e
        L7f:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_borderRound
            if (r3 != r4) goto L90
            float r4 = r5.mRound
            float r3 = r7.getDimension(r3, r4)
            r5.mRound = r3
            r5.setRound(r3)
            goto L15e
        L90:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_borderRoundPercent
            if (r3 != r4) goto La1
            float r4 = r5.mRoundPercent
            float r3 = r7.getFloat(r3, r4)
            r5.mRoundPercent = r3
            r5.setRoundPercent(r3)
            goto L15e
        La1:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_gravity
            if (r3 != r4) goto Laf
            r4 = -1
            int r3 = r7.getInt(r3, r4)
            r5.setGravity(r3)
            goto L15e
        Laf:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_android_autoSizeTextType
            if (r3 != r4) goto Lbb
            int r3 = r7.getInt(r3, r1)
            r5.mAutoSizeTextType = r3
            goto L15e
        Lbb:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textOutlineColor
            if (r3 != r4) goto Lcb
            int r4 = r5.mTextOutlineColor
            int r3 = r7.getInt(r3, r4)
            r5.mTextOutlineColor = r3
            r5.mUseOutline = r6
            goto L15e
        Lcb:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textOutlineThickness
            if (r3 != r4) goto Ldb
            float r4 = r5.mTextOutlineThickness
            float r3 = r7.getDimension(r3, r4)
            r5.mTextOutlineThickness = r3
            r5.mUseOutline = r6
            goto L15e
        Ldb:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackground
            if (r3 != r4) goto Le9
            android.graphics.drawable.Drawable r3 = r7.getDrawable(r3)
            r5.mTextBackground = r3
            r5.mUseOutline = r6
            goto L15e
        Le9:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundPanX
            if (r3 != r4) goto Lf7
            float r4 = r5.mBackgroundPanX
            float r3 = r7.getFloat(r3, r4)
            r5.mBackgroundPanX = r3
            goto L15e
        Lf7:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundPanY
            if (r3 != r4) goto L104
            float r4 = r5.mBackgroundPanY
            float r3 = r7.getFloat(r3, r4)
            r5.mBackgroundPanY = r3
            goto L15e
        L104:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textPanX
            if (r3 != r4) goto L111
            float r4 = r5.mTextPanX
            float r3 = r7.getFloat(r3, r4)
            r5.mTextPanX = r3
            goto L15e
        L111:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textPanY
            if (r3 != r4) goto L11e
            float r4 = r5.mTextPanY
            float r3 = r7.getFloat(r3, r4)
            r5.mTextPanY = r3
            goto L15e
        L11e:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundRotate
            if (r3 != r4) goto L12b
            float r4 = r5.mRotate
            float r3 = r7.getFloat(r3, r4)
            r5.mRotate = r3
            goto L15e
        L12b:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textBackgroundZoom
            if (r3 != r4) goto L138
            float r4 = r5.mZoom
            float r3 = r7.getFloat(r3, r4)
            r5.mZoom = r3
            goto L15e
        L138:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textureHeight
            if (r3 != r4) goto L145
            float r4 = r5.mTextureHeight
            float r3 = r7.getDimension(r3, r4)
            r5.mTextureHeight = r3
            goto L15e
        L145:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textureWidth
            if (r3 != r4) goto L152
            float r4 = r5.mTextureWidth
            float r3 = r7.getDimension(r3, r4)
            r5.mTextureWidth = r3
            goto L15e
        L152:
            int r4 = androidx.constraintlayout.widget.R.styleable.MotionLabel_textureEffect
            if (r3 != r4) goto L15e
            int r4 = r5.mTextureEffect
            int r3 = r7.getInt(r3, r4)
            r5.mTextureEffect = r3
        L15e:
            int r2 = r2 + 1
            goto L16
        L162:
            r7.recycle()
        L165:
            r5.setupTexture()
            int r7 = r5.getPaddingLeft()
            r5.mPaddingLeft = r7
            int r7 = r5.getPaddingRight()
            r5.mPaddingRight = r7
            int r7 = r5.getPaddingTop()
            r5.mPaddingTop = r7
            int r7 = r5.getPaddingBottom()
            r5.mPaddingBottom = r7
            java.lang.String r7 = r5.mFontFamily
            int r0 = r5.mTypefaceIndex
            int r1 = r5.mStyleIndex
            r5.setTypefaceFromAttrs(r7, r0, r1)
            android.text.TextPaint r7 = r5.mPaint
            int r0 = r5.mTextFillColor
            r7.setColor(r0)
            android.text.TextPaint r7 = r5.mPaint
            float r0 = r5.mTextOutlineThickness
            r7.setStrokeWidth(r0)
            android.text.TextPaint r7 = r5.mPaint
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r7.setStyle(r0)
            android.text.TextPaint r7 = r5.mPaint
            r0 = 128(0x80, float:1.8E-43)
            r7.setFlags(r0)
            float r7 = r5.mTextSize
            r5.setTextSize(r7)
            android.text.TextPaint r7 = r5.mPaint
            r7.setAntiAlias(r6)
            return
    }

    private void setTypefaceFromAttrs(java.lang.String r5, int r6, int r7) {
            r4 = this;
            if (r5 == 0) goto Lc
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r7)
            if (r5 == 0) goto Ld
            r4.setTypeface(r5)
            return
        Lc:
            r5 = 0
        Ld:
            r0 = 2
            r1 = 1
            if (r6 == r1) goto L1d
            if (r6 == r0) goto L1a
            r2 = 3
            if (r6 == r2) goto L17
            goto L1f
        L17:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            goto L1f
        L1a:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            goto L1f
        L1d:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
        L1f:
            r6 = 0
            r2 = 0
            if (r7 <= 0) goto L51
            if (r5 != 0) goto L2a
            android.graphics.Typeface r5 = android.graphics.Typeface.defaultFromStyle(r7)
            goto L2e
        L2a:
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r7)
        L2e:
            r4.setTypeface(r5)
            if (r5 == 0) goto L38
            int r5 = r5.getStyle()
            goto L39
        L38:
            r5 = 0
        L39:
            int r5 = ~r5
            r5 = r5 & r7
            android.text.TextPaint r7 = r4.mPaint
            r3 = r5 & 1
            if (r3 == 0) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            r7.setFakeBoldText(r1)
            android.text.TextPaint r7 = r4.mPaint
            r5 = r5 & r0
            if (r5 == 0) goto L4d
            r6 = -1098907648(0xffffffffbe800000, float:-0.25)
        L4d:
            r7.setTextSkewX(r6)
            goto L5e
        L51:
            android.text.TextPaint r7 = r4.mPaint
            r7.setFakeBoldText(r2)
            android.text.TextPaint r7 = r4.mPaint
            r7.setTextSkewX(r6)
            r4.setTypeface(r5)
        L5e:
            return
    }

    private void setUpTheme(android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
            r2 = this;
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r0 = androidx.appcompat.R.attr.colorPrimary
            r1 = 1
            r3.resolveAttribute(r0, r4, r1)
            android.text.TextPaint r3 = r2.mPaint
            int r4 = r4.data
            r2.mTextFillColor = r4
            r3.setColor(r4)
            return
    }

    private void setupTexture() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.mTextBackground
            if (r0 == 0) goto Laf
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.mTextShaderMatrix = r0
            android.graphics.drawable.Drawable r0 = r7.mTextBackground
            int r0 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r7.mTextBackground
            int r1 = r1.getIntrinsicHeight()
            r2 = 128(0x80, float:1.8E-43)
            if (r0 > 0) goto L2f
            int r0 = r7.getWidth()
            if (r0 != 0) goto L2f
            float r0 = r7.mTextureWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L2c
            r0 = 128(0x80, float:1.8E-43)
            goto L2f
        L2c:
            float r0 = r7.mTextureWidth
            int r0 = (int) r0
        L2f:
            if (r1 > 0) goto L44
            int r1 = r7.getHeight()
            if (r1 != 0) goto L44
            float r1 = r7.mTextureHeight
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L40
            goto L43
        L40:
            float r1 = r7.mTextureHeight
            int r2 = (int) r1
        L43:
            r1 = r2
        L44:
            int r2 = r7.mTextureEffect
            if (r2 == 0) goto L4c
            int r0 = r0 / 2
            int r1 = r1 / 2
        L4c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r7.mTextBackgroundBitmap = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r7.mTextBackgroundBitmap
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = r7.mTextBackground
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.setBounds(r4, r4, r2, r3)
            android.graphics.drawable.Drawable r1 = r7.mTextBackground
            r2 = 1
            r1.setFilterBitmap(r2)
            android.graphics.drawable.Drawable r1 = r7.mTextBackground
            r1.draw(r0)
            int r0 = r7.mTextureEffect
            if (r0 == 0) goto La4
            android.graphics.Bitmap r0 = r7.mTextBackgroundBitmap
            r1 = 4
            java.lang.System.nanoTime()
            int r3 = r0.getWidth()
            int r5 = r0.getHeight()
            int r3 = r3 / 2
            int r5 = r5 / 2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r5, r2)
        L8e:
            if (r4 >= r1) goto La2
            r6 = 32
            if (r3 < r6) goto La2
            if (r5 >= r6) goto L97
            goto La2
        L97:
            int r3 = r3 / 2
            int r5 = r5 / 2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r5, r2)
            int r4 = r4 + 1
            goto L8e
        La2:
            r7.mTextBackgroundBitmap = r0
        La4:
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r1 = r7.mTextBackgroundBitmap
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            r0.<init>(r1, r2, r2)
            r7.mTextShader = r0
        Laf:
            return
    }

    private void updateShaderMatrix() {
            r11 = this;
            float r0 = r11.mBackgroundPanX
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = 0
            goto Ld
        Lb:
            float r0 = r11.mBackgroundPanX
        Ld:
            float r2 = r11.mBackgroundPanY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L17
            r2 = 0
            goto L19
        L17:
            float r2 = r11.mBackgroundPanY
        L19:
            float r3 = r11.mZoom
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L24
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L26
        L24:
            float r3 = r11.mZoom
        L26:
            float r4 = r11.mRotate
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L2f
            goto L31
        L2f:
            float r1 = r11.mRotate
        L31:
            android.graphics.Matrix r4 = r11.mTextShaderMatrix
            r4.reset()
            android.graphics.Bitmap r4 = r11.mTextBackgroundBitmap
            int r4 = r4.getWidth()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r11.mTextBackgroundBitmap
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r6 = r11.mTextureWidth
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L4f
            float r6 = r11.mFloatWidth
            goto L51
        L4f:
            float r6 = r11.mTextureWidth
        L51:
            float r7 = r11.mTextureHeight
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L5c
            float r7 = r11.mFloatHeight
            goto L5e
        L5c:
            float r7 = r11.mTextureHeight
        L5e:
            float r8 = r4 * r7
            float r9 = r5 * r6
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L69
            float r8 = r6 / r4
            goto L6b
        L69:
            float r8 = r7 / r5
        L6b:
            float r3 = r3 * r8
            android.graphics.Matrix r8 = r11.mTextShaderMatrix
            r8.postScale(r3, r3)
            float r4 = r4 * r3
            float r8 = r6 - r4
            float r3 = r3 * r5
            float r5 = r7 - r3
            float r9 = r11.mTextureHeight
            boolean r9 = java.lang.Float.isNaN(r9)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r9 != 0) goto L87
            float r5 = r11.mTextureHeight
            float r5 = r5 / r10
        L87:
            float r9 = r11.mTextureWidth
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto L92
            float r8 = r11.mTextureWidth
            float r8 = r8 / r10
        L92:
            float r0 = r0 * r8
            float r0 = r0 + r6
            float r0 = r0 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r4
            float r2 = r2 * r5
            float r2 = r2 + r7
            float r2 = r2 - r3
            float r2 = r2 * r4
            android.graphics.Matrix r3 = r11.mTextShaderMatrix
            r3.postTranslate(r0, r2)
            android.graphics.Matrix r0 = r11.mTextShaderMatrix
            float r6 = r6 / r10
            float r7 = r7 / r10
            r0.postRotate(r1, r6, r7)
            android.graphics.BitmapShader r0 = r11.mTextShader
            android.graphics.Matrix r1 = r11.mTextShaderMatrix
            r0.setLocalMatrix(r1)
            return
    }

    public final void buildShape(float r11) {
            r10 = this;
            boolean r0 = r10.mUseOutline
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto Lb
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            android.graphics.Path r0 = r10.mPath
            r0.reset()
            java.lang.String r3 = r10.mText
            int r5 = r3.length()
            android.text.TextPaint r0 = r10.mPaint
            android.graphics.Rect r2 = r10.mTextBounds
            r9 = 0
            r0.getTextBounds(r3, r9, r5, r2)
            android.text.TextPaint r2 = r10.mPaint
            r4 = 0
            r6 = 0
            r7 = 0
            android.graphics.Path r8 = r10.mPath
            r2.getTextPath(r3, r4, r5, r6, r7, r8)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getLoc()
            r0.append(r1)
            java.lang.String r1 = " scale "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MotionLabel"
            android.util.Log.v(r1, r0)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.postScale(r11, r11)
            android.graphics.Path r11 = r10.mPath
            r11.transform(r0)
        L56:
            android.graphics.Rect r11 = r10.mTextBounds
            int r0 = r11.right
            int r0 = r0 + (-1)
            r11.right = r0
            int r0 = r11.left
            int r0 = r0 + 1
            r11.left = r0
            int r0 = r11.bottom
            int r0 = r0 + 1
            r11.bottom = r0
            int r0 = r11.top
            int r0 = r0 + (-1)
            r11.top = r0
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>()
            int r0 = r10.getHeight()
            float r0 = (float) r0
            r11.bottom = r0
            int r0 = r10.getWidth()
            float r0 = (float) r0
            r11.right = r0
            r10.mNotBuilt = r9
            return
    }

    public float getRound() {
            r1 = this;
            float r0 = r1.mRound
            return r0
    }

    public float getRoundPercent() {
            r1 = this;
            float r0 = r1.mRoundPercent
            return r0
    }

    public float getScaleFromTextSize() {
            r1 = this;
            float r0 = r1.mBaseTextSize
            return r0
    }

    public float getTextBackgroundPanX() {
            r1 = this;
            float r0 = r1.mBackgroundPanX
            return r0
    }

    public float getTextBackgroundPanY() {
            r1 = this;
            float r0 = r1.mBackgroundPanY
            return r0
    }

    public float getTextBackgroundRotate() {
            r1 = this;
            float r0 = r1.mRotate
            return r0
    }

    public float getTextBackgroundZoom() {
            r1 = this;
            float r0 = r1.mZoom
            return r0
    }

    public int getTextOutlineColor() {
            r1 = this;
            int r0 = r1.mTextOutlineColor
            return r0
    }

    public float getTextPanX() {
            r1 = this;
            float r0 = r1.mTextPanX
            return r0
    }

    public float getTextPanY() {
            r1 = this;
            float r0 = r1.mTextPanY
            return r0
    }

    public float getTextureHeight() {
            r1 = this;
            float r0 = r1.mTextureHeight
            return r0
    }

    public float getTextureWidth() {
            r1 = this;
            float r0 = r1.mTextureWidth
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.text.TextPaint r0 = r1.mPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float r9, float r10, float r11, float r12) {
            r8 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r9 + r0
            int r1 = (int) r1
            float r2 = (float) r1
            float r2 = r9 - r2
            r8.mDeltaLeft = r2
            float r2 = r11 + r0
            int r2 = (int) r2
            int r3 = r2 - r1
            float r4 = r12 + r0
            int r4 = (int) r4
            float r0 = r0 + r10
            int r0 = (int) r0
            int r5 = r4 - r0
            float r6 = r11 - r9
            r8.mFloatWidth = r6
            float r7 = r12 - r10
            r8.mFloatHeight = r7
            r8.adjustTexture(r9, r10, r11, r12)
            int r9 = r8.getMeasuredHeight()
            if (r9 != r5) goto L32
            int r9 = r8.getMeasuredWidth()
            if (r9 == r3) goto L2e
            goto L32
        L2e:
            super.layout(r1, r0, r2, r4)
            goto L42
        L32:
            r9 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            r8.measure(r10, r9)
            super.layout(r1, r0, r2, r4)
        L42:
            boolean r9 = r8.mAutoSize
            if (r9 == 0) goto Ld8
            android.graphics.Rect r9 = r8.mTempRect
            if (r9 != 0) goto L67
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r8.mTempPaint = r9
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.mTempRect = r9
            android.graphics.Paint r9 = r8.mTempPaint
            android.text.TextPaint r10 = r8.mPaint
            r9.set(r10)
            android.graphics.Paint r9 = r8.mTempPaint
            float r9 = r9.getTextSize()
            r8.paintTextSize = r9
        L67:
            r8.mFloatWidth = r6
            r8.mFloatHeight = r7
            android.graphics.Paint r9 = r8.mTempPaint
            java.lang.String r10 = r8.mText
            r11 = 0
            int r12 = r10.length()
            android.graphics.Rect r0 = r8.mTempRect
            r9.getTextBounds(r10, r11, r12, r0)
            android.graphics.Rect r9 = r8.mTempRect
            int r9 = r9.width()
            r10 = 1067869798(0x3fa66666, float:1.3)
            android.graphics.Rect r11 = r8.mTempRect
            int r11 = r11.height()
            float r11 = (float) r11
            float r11 = r11 * r10
            int r10 = r8.mPaddingRight
            float r10 = (float) r10
            float r6 = r6 - r10
            int r10 = r8.mPaddingLeft
            float r10 = (float) r10
            float r6 = r6 - r10
            int r10 = r8.mPaddingBottom
            float r10 = (float) r10
            float r7 = r7 - r10
            int r10 = r8.mPaddingTop
            float r10 = (float) r10
            float r7 = r7 - r10
            float r9 = (float) r9
            float r10 = r9 * r7
            float r12 = r11 * r6
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto Laf
            android.text.TextPaint r10 = r8.mPaint
            float r11 = r8.paintTextSize
            float r11 = r11 * r6
            float r11 = r11 / r9
            r10.setTextSize(r11)
            goto Lb9
        Laf:
            android.text.TextPaint r9 = r8.mPaint
            float r10 = r8.paintTextSize
            float r10 = r10 * r7
            float r10 = r10 / r11
            r9.setTextSize(r10)
        Lb9:
            boolean r9 = r8.mUseOutline
            if (r9 != 0) goto Lc5
            float r9 = r8.mBaseTextSize
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto Ld8
        Lc5:
            float r9 = r8.mBaseTextSize
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto Ld0
            r9 = 1065353216(0x3f800000, float:1.0)
            goto Ld5
        Ld0:
            float r9 = r8.mTextSize
            float r10 = r8.mBaseTextSize
            float r9 = r9 / r10
        Ld5:
            r8.buildShape(r9)
        Ld8:
            return
    }

    @Override // android.view.View
    public void layout(int r9, int r10, int r11, int r12) {
            r8 = this;
            super.layout(r9, r10, r11, r12)
            float r0 = r8.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Le
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Le:
            float r1 = r8.mTextSize
            float r2 = r8.mBaseTextSize
            float r1 = r1 / r2
        L13:
            int r2 = r11 - r9
            float r2 = (float) r2
            r8.mFloatWidth = r2
            int r2 = r12 - r10
            float r2 = (float) r2
            r8.mFloatHeight = r2
            boolean r2 = r8.mAutoSize
            if (r2 == 0) goto La8
            android.graphics.Rect r2 = r8.mTempRect
            if (r2 != 0) goto L42
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.mTempPaint = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r8.mTempRect = r2
            android.graphics.Paint r2 = r8.mTempPaint
            android.text.TextPaint r3 = r8.mPaint
            r2.set(r3)
            android.graphics.Paint r2 = r8.mTempPaint
            float r2 = r2.getTextSize()
            r8.paintTextSize = r2
        L42:
            android.graphics.Paint r2 = r8.mTempPaint
            java.lang.String r3 = r8.mText
            r4 = 0
            int r5 = r3.length()
            android.graphics.Rect r6 = r8.mTempRect
            r2.getTextBounds(r3, r4, r5, r6)
            android.graphics.Rect r2 = r8.mTempRect
            int r2 = r2.width()
            r3 = 1067869798(0x3fa66666, float:1.3)
            android.graphics.Rect r4 = r8.mTempRect
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            float r4 = r8.mFloatWidth
            int r5 = r8.mPaddingRight
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r8.mPaddingLeft
            float r5 = (float) r5
            float r4 = r4 - r5
            float r5 = r8.mFloatHeight
            int r6 = r8.mPaddingBottom
            float r6 = (float) r6
            float r5 = r5 - r6
            int r6 = r8.mPaddingTop
            float r6 = (float) r6
            float r5 = r5 - r6
            if (r0 == 0) goto L99
            float r2 = (float) r2
            float r6 = r2 * r5
            float r3 = (float) r3
            float r7 = r3 * r4
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L8e
            android.text.TextPaint r3 = r8.mPaint
            float r5 = r8.paintTextSize
            float r5 = r5 * r4
            float r5 = r5 / r2
            r3.setTextSize(r5)
            goto La8
        L8e:
            android.text.TextPaint r2 = r8.mPaint
            float r4 = r8.paintTextSize
            float r4 = r4 * r5
            float r4 = r4 / r3
            r2.setTextSize(r4)
            goto La8
        L99:
            float r1 = (float) r2
            float r2 = r1 * r5
            float r3 = (float) r3
            float r6 = r3 * r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto La6
            float r4 = r4 / r1
            r1 = r4
            goto La8
        La6:
            float r5 = r5 / r3
            r1 = r5
        La8:
            boolean r2 = r8.mUseOutline
            if (r2 != 0) goto Lae
            if (r0 != 0) goto Lb8
        Lae:
            float r9 = (float) r9
            float r10 = (float) r10
            float r11 = (float) r11
            float r12 = (float) r12
            r8.adjustTexture(r9, r10, r11, r12)
            r8.buildShape(r1)
        Lb8:
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            float r0 = r4.mBaseTextSize
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Ld
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L12
        Ld:
            float r0 = r4.mTextSize
            float r2 = r4.mBaseTextSize
            float r0 = r0 / r2
        L12:
            super.onDraw(r5)
            boolean r2 = r4.mUseOutline
            if (r2 != 0) goto L38
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L38
            int r0 = r4.mPaddingLeft
            float r0 = (float) r0
            float r1 = r4.getHorizontalOffset()
            float r0 = r0 + r1
            int r1 = r4.mPaddingTop
            float r1 = (float) r1
            float r2 = r4.getVerticalOffset()
            float r1 = r1 + r2
            java.lang.String r2 = r4.mText
            float r3 = r4.mDeltaLeft
            float r3 = r3 + r0
            android.text.TextPaint r0 = r4.mPaint
            r5.drawText(r2, r3, r1, r0)
            return
        L38:
            boolean r1 = r4.mNotBuilt
            if (r1 == 0) goto L3f
            r4.buildShape(r0)
        L3f:
            android.graphics.Matrix r1 = r4.mOutlinePositionMatrix
            if (r1 != 0) goto L4a
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r4.mOutlinePositionMatrix = r1
        L4a:
            boolean r1 = r4.mUseOutline
            if (r1 == 0) goto Lea
            android.graphics.Paint r1 = r4.paintCache
            android.text.TextPaint r2 = r4.mPaint
            r1.set(r2)
            android.graphics.Matrix r1 = r4.mOutlinePositionMatrix
            r1.reset()
            int r1 = r4.mPaddingLeft
            float r1 = (float) r1
            float r2 = r4.getHorizontalOffset()
            float r1 = r1 + r2
            int r2 = r4.mPaddingTop
            float r2 = (float) r2
            float r3 = r4.getVerticalOffset()
            float r2 = r2 + r3
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r3.postTranslate(r1, r2)
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r3.preScale(r0, r0)
            android.graphics.Path r0 = r4.mPath
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r0.transform(r3)
            android.graphics.BitmapShader r0 = r4.mTextShader
            if (r0 == 0) goto L8d
            android.text.TextPaint r0 = r4.mPaint
            r3 = 1
            r0.setFilterBitmap(r3)
            android.text.TextPaint r0 = r4.mPaint
            android.graphics.BitmapShader r3 = r4.mTextShader
            r0.setShader(r3)
            goto L94
        L8d:
            android.text.TextPaint r0 = r4.mPaint
            int r3 = r4.mTextFillColor
            r0.setColor(r3)
        L94:
            android.text.TextPaint r0 = r4.mPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
            android.text.TextPaint r0 = r4.mPaint
            float r3 = r4.mTextOutlineThickness
            r0.setStrokeWidth(r3)
            android.graphics.Path r0 = r4.mPath
            android.text.TextPaint r3 = r4.mPaint
            r5.drawPath(r0, r3)
            android.graphics.BitmapShader r0 = r4.mTextShader
            if (r0 == 0) goto Lb3
            android.text.TextPaint r0 = r4.mPaint
            r3 = 0
            r0.setShader(r3)
        Lb3:
            android.text.TextPaint r0 = r4.mPaint
            int r3 = r4.mTextOutlineColor
            r0.setColor(r3)
            android.text.TextPaint r0 = r4.mPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            android.text.TextPaint r0 = r4.mPaint
            float r3 = r4.mTextOutlineThickness
            r0.setStrokeWidth(r3)
            android.graphics.Path r0 = r4.mPath
            android.text.TextPaint r3 = r4.mPaint
            r5.drawPath(r0, r3)
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            r5.reset()
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            float r0 = -r1
            float r1 = -r2
            r5.postTranslate(r0, r1)
            android.graphics.Path r5 = r4.mPath
            android.graphics.Matrix r0 = r4.mOutlinePositionMatrix
            r5.transform(r0)
            android.text.TextPaint r5 = r4.mPaint
            android.graphics.Paint r0 = r4.paintCache
            r5.set(r0)
            goto L13a
        Lea:
            int r0 = r4.mPaddingLeft
            float r0 = (float) r0
            float r1 = r4.getHorizontalOffset()
            float r0 = r0 + r1
            int r1 = r4.mPaddingTop
            float r1 = (float) r1
            float r2 = r4.getVerticalOffset()
            float r1 = r1 + r2
            android.graphics.Matrix r2 = r4.mOutlinePositionMatrix
            r2.reset()
            android.graphics.Matrix r2 = r4.mOutlinePositionMatrix
            r2.preTranslate(r0, r1)
            android.graphics.Path r2 = r4.mPath
            android.graphics.Matrix r3 = r4.mOutlinePositionMatrix
            r2.transform(r3)
            android.text.TextPaint r2 = r4.mPaint
            int r3 = r4.mTextFillColor
            r2.setColor(r3)
            android.text.TextPaint r2 = r4.mPaint
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r3)
            android.text.TextPaint r2 = r4.mPaint
            float r3 = r4.mTextOutlineThickness
            r2.setStrokeWidth(r3)
            android.graphics.Path r2 = r4.mPath
            android.text.TextPaint r3 = r4.mPaint
            r5.drawPath(r2, r3)
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            r5.reset()
            android.graphics.Matrix r5 = r4.mOutlinePositionMatrix
            float r0 = -r0
            float r1 = -r1
            r5.preTranslate(r0, r1)
            android.graphics.Path r5 = r4.mPath
            android.graphics.Matrix r0 = r4.mOutlinePositionMatrix
            r5.transform(r0)
        L13a:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r9, int r10) {
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            r2 = 0
            r8.mAutoSize = r2
            int r3 = r8.getPaddingLeft()
            r8.mPaddingLeft = r3
            int r3 = r8.getPaddingRight()
            r8.mPaddingRight = r3
            int r3 = r8.getPaddingTop()
            r8.mPaddingTop = r3
            int r3 = r8.getPaddingBottom()
            r8.mPaddingBottom = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L3a
            if (r1 == r3) goto L32
            goto L3a
        L32:
            int r0 = r8.mAutoSizeTextType
            if (r0 == 0) goto L75
            r0 = 1
            r8.mAutoSize = r0
            goto L75
        L3a:
            android.text.TextPaint r4 = r8.mPaint
            java.lang.String r5 = r8.mText
            int r6 = r5.length()
            android.graphics.Rect r7 = r8.mTextBounds
            r4.getTextBounds(r5, r2, r6, r7)
            r2 = 1065353048(0x3f7fff58, float:0.99999)
            if (r0 == r3) goto L55
            android.graphics.Rect r9 = r8.mTextBounds
            int r9 = r9.width()
            float r9 = (float) r9
            float r9 = r9 + r2
            int r9 = (int) r9
        L55:
            int r0 = r8.mPaddingLeft
            int r4 = r8.mPaddingRight
            int r0 = r0 + r4
            int r9 = r9 + r0
            if (r1 == r3) goto L75
            android.text.TextPaint r0 = r8.mPaint
            r3 = 0
            int r0 = r0.getFontMetricsInt(r3)
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L6f
            int r0 = java.lang.Math.min(r10, r0)
        L6f:
            int r10 = r8.mPaddingTop
            int r1 = r8.mPaddingBottom
            int r10 = r10 + r1
            int r10 = r10 + r0
        L75:
            r8.setMeasuredDimension(r9, r10)
            return
    }

    @android.annotation.SuppressLint({"RtlHardcoded"})
    public void setGravity(int r8) {
            r7 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r8 & r0
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != 0) goto Lb
            r8 = r8 | r2
        Lb:
            r1 = r8 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L11
            r8 = r8 | 48
        L11:
            int r1 = r7.mGravity
            if (r8 == r1) goto L18
            r7.invalidate()
        L18:
            r7.mGravity = r8
            r1 = r8 & 112(0x70, float:1.57E-43)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 48
            if (r1 == r6) goto L2f
            r6 = 80
            if (r1 == r6) goto L2c
            r7.mTextPanY = r3
            goto L31
        L2c:
            r7.mTextPanY = r4
            goto L31
        L2f:
            r7.mTextPanY = r5
        L31:
            r8 = r8 & r0
            r0 = 3
            if (r8 == r0) goto L45
            r0 = 5
            if (r8 == r0) goto L42
            if (r8 == r2) goto L45
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r8 == r0) goto L42
            r7.mTextPanX = r3
            goto L47
        L42:
            r7.mTextPanX = r4
            goto L47
        L45:
            r7.mTextPanX = r5
        L47:
            return
    }

    @androidx.annotation.RequiresApi(21)
    public void setRound(float r5) {
            r4 = this;
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L12
            r4.mRound = r5
            float r5 = r4.mRoundPercent
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mRoundPercent = r0
            r4.setRoundPercent(r5)
            return
        L12:
            float r0 = r4.mRound
            r1 = 1
            r2 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r4.mRound = r5
            r3 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L6b
            android.graphics.Path r5 = r4.mPath
            if (r5 != 0) goto L2f
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r4.mPath = r5
        L2f:
            android.graphics.RectF r5 = r4.mRect
            if (r5 != 0) goto L3a
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.mRect = r5
        L3a:
            android.view.ViewOutlineProvider r5 = r4.mViewOutlineProvider
            if (r5 != 0) goto L48
            androidx.constraintlayout.utils.widget.MotionLabel$2 r5 = new androidx.constraintlayout.utils.widget.MotionLabel$2
            r5.<init>(r4)
            r4.mViewOutlineProvider = r5
            r4.setOutlineProvider(r5)
        L48:
            r4.setClipToOutline(r1)
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.RectF r2 = r4.mRect
            float r5 = (float) r5
            float r1 = (float) r1
            r2.set(r3, r3, r5, r1)
            android.graphics.Path r5 = r4.mPath
            r5.reset()
            android.graphics.Path r5 = r4.mPath
            android.graphics.RectF r1 = r4.mRect
            float r2 = r4.mRound
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r1, r2, r2, r3)
            goto L6e
        L6b:
            r4.setClipToOutline(r2)
        L6e:
            if (r0 == 0) goto L73
            r4.invalidateOutline()
        L73:
            return
    }

    @androidx.annotation.RequiresApi(21)
    public void setRoundPercent(float r6) {
            r5 = this;
            float r0 = r5.mRoundPercent
            r1 = 1
            r2 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r5.mRoundPercent = r6
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L63
            android.graphics.Path r6 = r5.mPath
            if (r6 != 0) goto L1d
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.mPath = r6
        L1d:
            android.graphics.RectF r6 = r5.mRect
            if (r6 != 0) goto L28
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r5.mRect = r6
        L28:
            android.view.ViewOutlineProvider r6 = r5.mViewOutlineProvider
            if (r6 != 0) goto L36
            androidx.constraintlayout.utils.widget.MotionLabel$1 r6 = new androidx.constraintlayout.utils.widget.MotionLabel$1
            r6.<init>(r5)
            r5.mViewOutlineProvider = r6
            r5.setOutlineProvider(r6)
        L36:
            r5.setClipToOutline(r1)
            int r6 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = java.lang.Math.min(r6, r1)
            float r2 = (float) r2
            float r4 = r5.mRoundPercent
            float r2 = r2 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            android.graphics.RectF r4 = r5.mRect
            float r6 = (float) r6
            float r1 = (float) r1
            r4.set(r3, r3, r6, r1)
            android.graphics.Path r6 = r5.mPath
            r6.reset()
            android.graphics.Path r6 = r5.mPath
            android.graphics.RectF r1 = r5.mRect
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r6.addRoundRect(r1, r2, r2, r3)
            goto L66
        L63:
            r5.setClipToOutline(r2)
        L66:
            if (r0 == 0) goto L6b
            r5.invalidateOutline()
        L6b:
            return
    }

    public void setScaleFromTextSize(float r1) {
            r0 = this;
            r0.mBaseTextSize = r1
            return
    }

    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.mText = r1
            r0.invalidate()
            return
    }

    public void setTextBackgroundPanX(float r1) {
            r0 = this;
            r0.mBackgroundPanX = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextBackgroundPanY(float r1) {
            r0 = this;
            r0.mBackgroundPanY = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextBackgroundRotate(float r1) {
            r0 = this;
            r0.mRotate = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextBackgroundZoom(float r1) {
            r0 = this;
            r0.mZoom = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextFillColor(int r1) {
            r0 = this;
            r0.mTextFillColor = r1
            r0.invalidate()
            return
    }

    public void setTextOutlineColor(int r1) {
            r0 = this;
            r0.mTextOutlineColor = r1
            r1 = 1
            r0.mUseOutline = r1
            r0.invalidate()
            return
    }

    public void setTextOutlineThickness(float r2) {
            r1 = this;
            r1.mTextOutlineThickness = r2
            r0 = 1
            r1.mUseOutline = r0
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L12
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.mTextOutlineThickness = r2
            r2 = 0
            r1.mUseOutline = r2
        L12:
            r1.invalidate()
            return
    }

    public void setTextPanX(float r1) {
            r0 = this;
            r0.mTextPanX = r1
            r0.invalidate()
            return
    }

    public void setTextPanY(float r1) {
            r0 = this;
            r0.mTextPanY = r1
            r0.invalidate()
            return
    }

    public void setTextSize(float r3) {
            r2 = this;
            r2.mTextSize = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getLoc()
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " / "
            r0.append(r1)
            float r1 = r2.mBaseTextSize
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MotionLabel"
            android.util.Log.v(r1, r0)
            android.text.TextPaint r0 = r2.mPaint
            float r1 = r2.mBaseTextSize
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L34
            goto L36
        L34:
            float r3 = r2.mBaseTextSize
        L36:
            r0.setTextSize(r3)
            float r3 = r2.mBaseTextSize
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L44
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L49
        L44:
            float r3 = r2.mTextSize
            float r0 = r2.mBaseTextSize
            float r3 = r3 / r0
        L49:
            r2.buildShape(r3)
            r2.requestLayout()
            r2.invalidate()
            return
    }

    public void setTextureHeight(float r1) {
            r0 = this;
            r0.mTextureHeight = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTextureWidth(float r1) {
            r0 = this;
            r0.mTextureWidth = r1
            r0.updateShaderMatrix()
            r0.invalidate()
            return
    }

    public void setTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.text.TextPaint r0 = r1.mPaint
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == r2) goto L1a
            android.text.TextPaint r0 = r1.mPaint
            r0.setTypeface(r2)
            android.text.Layout r2 = r1.mLayout
            if (r2 == 0) goto L1a
            r2 = 0
            r1.mLayout = r2
            r1.requestLayout()
            r1.invalidate()
        L1a:
            return
    }
}
