package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ShadowOverlayContainer extends android.widget.FrameLayout {
    public static final int SHADOW_DYNAMIC = 3;
    public static final int SHADOW_NONE = 1;
    public static final int SHADOW_STATIC = 2;
    private static final android.graphics.Rect sTempRect = null;
    private float mFocusedZ;
    private boolean mInitialized;
    public int mOverlayColor;
    private android.graphics.Paint mOverlayPaint;
    private int mRoundedCornerRadius;
    private boolean mRoundedCorners;
    private java.lang.Object mShadowImpl;
    private int mShadowType;
    private float mUnfocusedZ;
    private android.view.View mWrappedView;

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.leanback.widget.ShadowOverlayContainer.sTempRect = r0
            return
    }

    public ShadowOverlayContainer(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public ShadowOverlayContainer(android.content.Context r1, int r2, boolean r3, float r4, float r5, int r6) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.mShadowType = r1
            r0.mUnfocusedZ = r4
            r0.mFocusedZ = r5
            r0.initialize(r2, r3, r6)
            return
    }

    public ShadowOverlayContainer(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ShadowOverlayContainer(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.mShadowType = r1
            r0.useStaticShadow()
            r0.useDynamicShadow()
            return
    }

    public static void prepareParentForShadow(android.view.ViewGroup r1) {
            r0 = 1
            r1.setLayoutMode(r0)
            return
    }

    public static boolean supportsDynamicShadow() {
            r0 = 1
            return r0
    }

    public static boolean supportsShadow() {
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            android.graphics.Paint r0 = r7.mOverlayPaint
            if (r0 == 0) goto L2d
            int r0 = r7.mOverlayColor
            if (r0 == 0) goto L2d
            android.view.View r0 = r7.mWrappedView
            int r0 = r0.getLeft()
            float r2 = (float) r0
            android.view.View r0 = r7.mWrappedView
            int r0 = r0.getTop()
            float r3 = (float) r0
            android.view.View r0 = r7.mWrappedView
            int r0 = r0.getRight()
            float r4 = (float) r0
            android.view.View r0 = r7.mWrappedView
            int r0 = r0.getBottom()
            float r5 = (float) r0
            android.graphics.Paint r6 = r7.mOverlayPaint
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L2d:
            return
    }

    public int getShadowType() {
            r1 = this;
            int r0 = r1.mShadowType
            return r0
    }

    public android.view.View getWrappedView() {
            r1 = this;
            android.view.View r0 = r1.mWrappedView
            return r0
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void initialize(int r4, boolean r5, int r6) {
            r3 = this;
            boolean r0 = r3.mInitialized
            if (r0 != 0) goto L6e
            r0 = 1
            r3.mInitialized = r0
            r3.mRoundedCornerRadius = r6
            r1 = 0
            if (r6 <= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            r3.mRoundedCorners = r2
            r3.mShadowType = r4
            r2 = 2
            if (r4 == r2) goto L25
            r2 = 3
            if (r4 == r2) goto L1a
            goto L4c
        L1a:
            float r4 = r3.mUnfocusedZ
            float r2 = r3.mFocusedZ
            java.lang.Object r4 = androidx.leanback.widget.ShadowHelperApi21.addDynamicShadow(r3, r4, r2, r6)
            r3.mShadowImpl = r4
            goto L4c
        L25:
            r3.setLayoutMode(r0)
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r6 = androidx.leanback.R.layout.lb_shadow
            r4.inflate(r6, r3, r0)
            androidx.leanback.widget.StaticShadowHelper$ShadowImpl r4 = new androidx.leanback.widget.StaticShadowHelper$ShadowImpl
            r4.<init>()
            int r6 = androidx.leanback.R.id.lb_shadow_normal
            android.view.View r6 = r3.findViewById(r6)
            r4.mNormalShadow = r6
            int r6 = androidx.leanback.R.id.lb_shadow_focused
            android.view.View r6 = r3.findViewById(r6)
            r4.mFocusShadow = r6
            r3.mShadowImpl = r4
        L4c:
            if (r5 == 0) goto L67
            r3.setWillNotDraw(r1)
            r3.mOverlayColor = r1
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.mOverlayPaint = r4
            int r5 = r3.mOverlayColor
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.mOverlayPaint
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            goto L6d
        L67:
            r3.setWillNotDraw(r0)
            r4 = 0
            r3.mOverlayPaint = r4
        L6d:
            return
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
    }

    @java.lang.Deprecated
    public void initialize(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.initialize(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public void initialize(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 1
            goto L6
        L4:
            int r2 = r1.mShadowType
        L6:
            if (r4 == 0) goto L17
            android.content.Context r4 = r1.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r0 = androidx.leanback.R.dimen.lb_rounded_rect_corner_radius
            int r4 = r4.getDimensionPixelSize(r0)
            goto L18
        L17:
            r4 = 0
        L18:
            r1.initialize(r2, r3, r4)
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L2c
            android.view.View r1 = r0.mWrappedView
            if (r1 == 0) goto L2c
            android.graphics.Rect r2 = androidx.leanback.widget.ShadowOverlayContainer.sTempRect
            float r1 = r1.getPivotX()
            int r1 = (int) r1
            r2.left = r1
            android.view.View r1 = r0.mWrappedView
            float r1 = r1.getPivotY()
            int r1 = (int) r1
            r2.top = r1
            android.view.View r1 = r0.mWrappedView
            r0.offsetDescendantRectToMyCoords(r1, r2)
            int r1 = r2.left
            float r1 = (float) r1
            r0.setPivotX(r1)
            int r1 = r2.top
            float r1 = (float) r1
            r0.setPivotY(r1)
        L2c:
            return
    }

    public void setOverlayColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.mOverlayPaint
            if (r0 == 0) goto L10
            int r1 = r2.mOverlayColor
            if (r3 == r1) goto L10
            r2.mOverlayColor = r3
            r0.setColor(r3)
            r2.invalidate()
        L10:
            return
    }

    public void setShadowFocusLevel(float r3) {
            r2 = this;
            java.lang.Object r0 = r2.mShadowImpl
            if (r0 == 0) goto L9
            int r1 = r2.mShadowType
            androidx.leanback.widget.ShadowOverlayHelper.setShadowFocusLevel(r0, r1, r3)
        L9:
            return
    }

    public void useDynamicShadow() {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()
            int r1 = androidx.leanback.R.dimen.lb_material_shadow_normal_z
            float r0 = r0.getDimension(r1)
            android.content.res.Resources r1 = r3.getResources()
            int r2 = androidx.leanback.R.dimen.lb_material_shadow_focused_z
            float r1 = r1.getDimension(r2)
            r3.useDynamicShadow(r0, r1)
            return
    }

    public void useDynamicShadow(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.mInitialized
            if (r0 != 0) goto L12
            boolean r0 = supportsDynamicShadow()
            if (r0 == 0) goto L11
            r0 = 3
            r1.mShadowType = r0
            r1.mUnfocusedZ = r2
            r1.mFocusedZ = r3
        L11:
            return
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already initialized"
            r2.<init>(r3)
            throw r2
    }

    public void useStaticShadow() {
            r2 = this;
            boolean r0 = r2.mInitialized
            if (r0 != 0) goto Le
            boolean r0 = supportsShadow()
            if (r0 == 0) goto Ld
            r0 = 2
            r2.mShadowType = r0
        Ld:
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already initialized"
            r0.<init>(r1)
            throw r0
    }

    public void wrap(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.mInitialized
            if (r0 == 0) goto L43
            android.view.View r0 = r5.mWrappedView
            if (r0 != 0) goto L43
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            if (r0 == 0) goto L30
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r2 = r0.width
            int r3 = r0.height
            r1.<init>(r2, r3)
            int r2 = r0.width
            r3 = -2
            r4 = -1
            if (r2 != r4) goto L1f
            r2 = -1
            goto L20
        L1f:
            r2 = -2
        L20:
            r0.width = r2
            int r2 = r0.height
            if (r2 != r4) goto L27
            r3 = -1
        L27:
            r0.height = r3
            r5.setLayoutParams(r0)
            r5.addView(r6, r1)
            goto L33
        L30:
            r5.addView(r6)
        L33:
            boolean r0 = r5.mRoundedCorners
            if (r0 == 0) goto L40
            int r0 = r5.mShadowType
            r1 = 3
            if (r0 == r1) goto L40
            r0 = 1
            androidx.leanback.widget.RoundedRectHelper.setClipToRoundedOutline(r5, r0)
        L40:
            r5.mWrappedView = r6
            return
        L43:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
    }
}
