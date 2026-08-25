package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public final class ShadowOverlayHelper {
    public static final int SHADOW_DYNAMIC = 3;
    public static final int SHADOW_NONE = 1;
    public static final int SHADOW_STATIC = 2;
    public float mFocusedZ;
    public boolean mNeedsOverlay;
    public boolean mNeedsRoundedCorner;
    public boolean mNeedsShadow;
    public boolean mNeedsWrapper;
    public int mRoundedCornerRadius;
    public int mShadowType;
    public float mUnfocusedZ;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private boolean keepForegroundDrawable;
        private boolean needsOverlay;
        private boolean needsRoundedCorner;
        private boolean needsShadow;
        private androidx.leanback.widget.ShadowOverlayHelper.Options options;
        private boolean preferZOrder;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.preferZOrder = r0
                androidx.leanback.widget.ShadowOverlayHelper$Options r0 = androidx.leanback.widget.ShadowOverlayHelper.Options.DEFAULT
                r1.options = r0
                return
        }

        public androidx.leanback.widget.ShadowOverlayHelper build(android.content.Context r7) {
                r6 = this;
                androidx.leanback.widget.ShadowOverlayHelper r0 = new androidx.leanback.widget.ShadowOverlayHelper
                r0.<init>()
                boolean r1 = r6.needsOverlay
                r0.mNeedsOverlay = r1
                boolean r1 = r6.needsRoundedCorner
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L17
                boolean r1 = androidx.leanback.widget.ShadowOverlayHelper.supportsRoundedCorner()
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                r0.mNeedsRoundedCorner = r1
                boolean r1 = r6.needsShadow
                if (r1 == 0) goto L26
                boolean r1 = androidx.leanback.widget.ShadowOverlayHelper.supportsShadow()
                if (r1 == 0) goto L26
                r1 = 1
                goto L27
            L26:
                r1 = 0
            L27:
                r0.mNeedsShadow = r1
                boolean r1 = r0.mNeedsRoundedCorner
                if (r1 == 0) goto L48
                androidx.leanback.widget.ShadowOverlayHelper$Options r1 = r6.options
                int r4 = r1.getRoundedCornerRadius()
                if (r4 != 0) goto L42
                android.content.res.Resources r1 = r7.getResources()
                int r4 = androidx.leanback.R.dimen.lb_rounded_rect_corner_radius
                int r1 = r1.getDimensionPixelSize(r4)
                r0.mRoundedCornerRadius = r1
                goto L48
            L42:
                int r1 = r1.getRoundedCornerRadius()
                r0.mRoundedCornerRadius = r1
            L48:
                boolean r1 = r0.mNeedsShadow
                if (r1 == 0) goto L9e
                boolean r1 = r6.preferZOrder
                if (r1 == 0) goto L98
                boolean r1 = androidx.leanback.widget.ShadowOverlayHelper.supportsDynamicShadow()
                if (r1 != 0) goto L57
                goto L98
            L57:
                r1 = 3
                r0.mShadowType = r1
                androidx.leanback.widget.ShadowOverlayHelper$Options r1 = r6.options
                float r4 = r1.getDynamicShadowUnfocusedZ()
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 >= 0) goto L7a
                android.content.res.Resources r7 = r7.getResources()
                int r1 = androidx.leanback.R.dimen.lb_material_shadow_focused_z
                float r1 = r7.getDimension(r1)
                r0.mFocusedZ = r1
                int r1 = androidx.leanback.R.dimen.lb_material_shadow_normal_z
                float r7 = r7.getDimension(r1)
                r0.mUnfocusedZ = r7
                goto L86
            L7a:
                float r7 = r1.getDynamicShadowFocusedZ()
                r0.mFocusedZ = r7
                float r7 = r1.getDynamicShadowUnfocusedZ()
                r0.mUnfocusedZ = r7
            L86:
                boolean r7 = androidx.leanback.widget.ShadowOverlayHelper.supportsForeground()
                if (r7 == 0) goto L90
                boolean r7 = r6.keepForegroundDrawable
                if (r7 == 0) goto L95
            L90:
                boolean r7 = r0.mNeedsOverlay
                if (r7 == 0) goto L95
                r2 = 1
            L95:
                r0.mNeedsWrapper = r2
                goto Lb1
            L98:
                r7 = 2
                r0.mShadowType = r7
                r0.mNeedsWrapper = r3
                goto Lb1
            L9e:
                r0.mShadowType = r3
                boolean r7 = androidx.leanback.widget.ShadowOverlayHelper.supportsForeground()
                if (r7 == 0) goto Laa
                boolean r7 = r6.keepForegroundDrawable
                if (r7 == 0) goto Laf
            Laa:
                boolean r7 = r0.mNeedsOverlay
                if (r7 == 0) goto Laf
                r2 = 1
            Laf:
                r0.mNeedsWrapper = r2
            Lb1:
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Builder keepForegroundDrawable(boolean r1) {
                r0 = this;
                r0.keepForegroundDrawable = r1
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Builder needsOverlay(boolean r1) {
                r0 = this;
                r0.needsOverlay = r1
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Builder needsRoundedCorner(boolean r1) {
                r0 = this;
                r0.needsRoundedCorner = r1
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Builder needsShadow(boolean r1) {
                r0 = this;
                r0.needsShadow = r1
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Builder options(androidx.leanback.widget.ShadowOverlayHelper.Options r1) {
                r0 = this;
                r0.options = r1
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Builder preferZOrder(boolean r1) {
                r0 = this;
                r0.preferZOrder = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Options {
        public static final androidx.leanback.widget.ShadowOverlayHelper.Options DEFAULT = null;
        private float dynamicShadowFocusedZ;
        private float dynamicShadowUnfocusedZ;
        private int roundedCornerRadius;

        static {
                androidx.leanback.widget.ShadowOverlayHelper$Options r0 = new androidx.leanback.widget.ShadowOverlayHelper$Options
                r0.<init>()
                androidx.leanback.widget.ShadowOverlayHelper.Options.DEFAULT = r0
                return
        }

        public Options() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.roundedCornerRadius = r0
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.dynamicShadowUnfocusedZ = r0
                r1.dynamicShadowFocusedZ = r0
                return
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Options dynamicShadowZ(float r1, float r2) {
                r0 = this;
                r0.dynamicShadowUnfocusedZ = r1
                r0.dynamicShadowFocusedZ = r2
                return r0
        }

        public final float getDynamicShadowFocusedZ() {
                r1 = this;
                float r0 = r1.dynamicShadowFocusedZ
                return r0
        }

        public final float getDynamicShadowUnfocusedZ() {
                r1 = this;
                float r0 = r1.dynamicShadowUnfocusedZ
                return r0
        }

        public final int getRoundedCornerRadius() {
                r1 = this;
                int r0 = r1.roundedCornerRadius
                return r0
        }

        public androidx.leanback.widget.ShadowOverlayHelper.Options roundedCornerRadius(int r1) {
                r0 = this;
                r0.roundedCornerRadius = r1
                return r0
        }
    }

    public ShadowOverlayHelper() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mShadowType = r0
            return
    }

    public static void setNoneWrapperOverlayColor(android.view.View r2, int r3) {
            android.graphics.drawable.Drawable r0 = androidx.leanback.widget.ForegroundHelper.getForeground(r2)
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto Le
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            r0.setColor(r3)
            goto L16
        Le:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r3)
            androidx.leanback.widget.ForegroundHelper.setForeground(r2, r0)
        L16:
            return
    }

    public static void setNoneWrapperShadowFocusLevel(android.view.View r1, float r2) {
            int r0 = androidx.leanback.R.id.lb_shadow_impl
            java.lang.Object r1 = r1.getTag(r0)
            r0 = 3
            setShadowFocusLevel(r1, r0, r2)
            return
    }

    public static void setShadowFocusLevel(java.lang.Object r3, int r4, float r5) {
            if (r3 == 0) goto L29
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb
            r5 = 0
            goto L11
        Lb:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L11
            r5 = 1065353216(0x3f800000, float:1.0)
        L11:
            r0 = 2
            if (r4 == r0) goto L1c
            r0 = 3
            if (r4 == r0) goto L18
            goto L29
        L18:
            androidx.leanback.widget.ShadowHelperApi21.setShadowFocusLevel(r3, r5)
            goto L29
        L1c:
            androidx.leanback.widget.StaticShadowHelper$ShadowImpl r3 = (androidx.leanback.widget.StaticShadowHelper.ShadowImpl) r3
            android.view.View r4 = r3.mNormalShadow
            float r1 = r1 - r5
            r4.setAlpha(r1)
            android.view.View r3 = r3.mFocusShadow
            r3.setAlpha(r5)
        L29:
            return
    }

    public static boolean supportsDynamicShadow() {
            r0 = 1
            return r0
    }

    public static boolean supportsForeground() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean supportsRoundedCorner() {
            r0 = 1
            return r0
    }

    public static boolean supportsShadow() {
            r0 = 1
            return r0
    }

    public androidx.leanback.widget.ShadowOverlayContainer createShadowOverlayContainer(android.content.Context r9) {
            r8 = this;
            boolean r0 = r8.needsWrapper()
            if (r0 == 0) goto L18
            androidx.leanback.widget.ShadowOverlayContainer r0 = new androidx.leanback.widget.ShadowOverlayContainer
            int r3 = r8.mShadowType
            boolean r4 = r8.mNeedsOverlay
            float r5 = r8.mUnfocusedZ
            float r6 = r8.mFocusedZ
            int r7 = r8.mRoundedCornerRadius
            r1 = r0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L18:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
    }

    public int getShadowType() {
            r1 = this;
            int r0 = r1.mShadowType
            return r0
    }

    public boolean needsOverlay() {
            r1 = this;
            boolean r0 = r1.mNeedsOverlay
            return r0
    }

    public boolean needsRoundedCorner() {
            r1 = this;
            boolean r0 = r1.mNeedsRoundedCorner
            return r0
    }

    public boolean needsWrapper() {
            r1 = this;
            boolean r0 = r1.mNeedsWrapper
            return r0
    }

    public void onViewCreated(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.needsWrapper()
            if (r0 != 0) goto L33
            boolean r0 = r3.mNeedsShadow
            r1 = 1
            if (r0 != 0) goto L15
            boolean r0 = r3.mNeedsRoundedCorner
            if (r0 == 0) goto L33
            int r0 = r3.mRoundedCornerRadius
            androidx.leanback.widget.RoundedRectHelperApi21.setClipToRoundedOutline(r4, r1, r0)
            goto L33
        L15:
            int r0 = r3.mShadowType
            r2 = 3
            if (r0 != r2) goto L2a
            float r0 = r3.mUnfocusedZ
            float r1 = r3.mFocusedZ
            int r2 = r3.mRoundedCornerRadius
            java.lang.Object r0 = androidx.leanback.widget.ShadowHelperApi21.addDynamicShadow(r4, r0, r1, r2)
            int r1 = androidx.leanback.R.id.lb_shadow_impl
            r4.setTag(r1, r0)
            goto L33
        L2a:
            boolean r0 = r3.mNeedsRoundedCorner
            if (r0 == 0) goto L33
            int r0 = r3.mRoundedCornerRadius
            androidx.leanback.widget.RoundedRectHelperApi21.setClipToRoundedOutline(r4, r1, r0)
        L33:
            return
    }

    public void prepareParentForShadow(android.view.ViewGroup r3) {
            r2 = this;
            int r0 = r2.mShadowType
            r1 = 2
            if (r0 != r1) goto L9
            r0 = 1
            r3.setLayoutMode(r0)
        L9:
            return
    }

    public void setOverlayColor(android.view.View r2, int r3) {
            r1 = this;
            boolean r0 = r1.needsWrapper()
            if (r0 == 0) goto Lc
            androidx.leanback.widget.ShadowOverlayContainer r2 = (androidx.leanback.widget.ShadowOverlayContainer) r2
            r2.setOverlayColor(r3)
            goto Lf
        Lc:
            setNoneWrapperOverlayColor(r2, r3)
        Lf:
            return
    }

    public void setShadowFocusLevel(android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = r1.needsWrapper()
            if (r0 == 0) goto Lc
            androidx.leanback.widget.ShadowOverlayContainer r2 = (androidx.leanback.widget.ShadowOverlayContainer) r2
            r2.setShadowFocusLevel(r3)
            goto L16
        Lc:
            int r0 = androidx.leanback.R.id.lb_shadow_impl
            java.lang.Object r2 = r2.getTag(r0)
            r0 = 3
            setShadowFocusLevel(r2, r0, r3)
        L16:
            return
    }
}
