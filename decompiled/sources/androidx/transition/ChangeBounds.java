package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeBounds extends androidx.transition.Transition {
    private static final android.util.Property<android.view.View, android.graphics.PointF> BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> BOTTOM_RIGHT_PROPERTY = null;
    private static final android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> DRAWABLE_ORIGIN_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> POSITION_PROPERTY = null;
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final java.lang.String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final java.lang.String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final java.lang.String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final android.util.Property<android.view.View, android.graphics.PointF> TOP_LEFT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> TOP_LEFT_PROPERTY = null;
    private static androidx.transition.RectEvaluator sRectEvaluator;
    private static final java.lang.String[] sTransitionProperties = null;
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;











    public static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private android.view.View mView;

        public ViewBounds(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        private void setLeftTopRightBottom() {
                r5 = this;
                android.view.View r0 = r5.mView
                int r1 = r5.mLeft
                int r2 = r5.mTop
                int r3 = r5.mRight
                int r4 = r5.mBottom
                androidx.transition.ViewUtils.setLeftTopRightBottom(r0, r1, r2, r3, r4)
                r0 = 0
                r5.mTopLeftCalls = r0
                r5.mBottomRightCalls = r0
                return
        }

        public final void setBottomRight(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mRight = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mBottom = r2
                int r2 = r1.mBottomRightCalls
                int r2 = r2 + 1
                r1.mBottomRightCalls = r2
                int r0 = r1.mTopLeftCalls
                if (r0 != r2) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }

        public final void setTopLeft(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mLeft = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mTop = r2
                int r2 = r1.mTopLeftCalls
                int r2 = r2 + 1
                r1.mTopLeftCalls = r2
                int r0 = r1.mBottomRightCalls
                if (r2 != r0) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeBounds:bounds"
            java.lang.String r1 = "android:changeBounds:clip"
            java.lang.String r2 = "android:changeBounds:parent"
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            androidx.transition.ChangeBounds.sTransitionProperties = r0
            androidx.transition.ChangeBounds$1 r0 = new androidx.transition.ChangeBounds$1
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1)
            androidx.transition.ChangeBounds.DRAWABLE_ORIGIN_PROPERTY = r0
            androidx.transition.ChangeBounds$2 r0 = new androidx.transition.ChangeBounds$2
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1)
            androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY = r0
            androidx.transition.ChangeBounds$3 r0 = new androidx.transition.ChangeBounds$3
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY = r0
            androidx.transition.ChangeBounds$4 r0 = new androidx.transition.ChangeBounds$4
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$5 r0 = new androidx.transition.ChangeBounds$5
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1)
            androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$6 r0 = new androidx.transition.ChangeBounds$6
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1)
            androidx.transition.ChangeBounds.POSITION_PROPERTY = r0
            androidx.transition.RectEvaluator r0 = new androidx.transition.RectEvaluator
            r0.<init>()
            androidx.transition.ChangeBounds.sRectEvaluator = r0
            return
    }

    public ChangeBounds() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.mTempLocation = r0
            r0 = 0
            r1.mResizeClip = r0
            r1.mReparent = r0
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public ChangeBounds(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 2
            int[] r0 = new int[r0]
            r2.mTempLocation = r0
            r0 = 0
            r2.mResizeClip = r0
            r2.mReparent = r0
            int[] r1 = androidx.transition.Styleable.CHANGE_BOUNDS
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r1 = "resizeClip"
            boolean r4 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r3, r4, r1, r0, r0)
            r3.recycle()
            r2.setResizeClip(r4)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r8) {
            r7 = this;
            android.view.View r0 = r8.view
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r1 != 0) goto L14
            int r1 = r0.getWidth()
            if (r1 != 0) goto L14
            int r1 = r0.getHeight()
            if (r1 == 0) goto L77
        L14:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r6 = r0.getBottom()
            r2.<init>(r3, r4, r5, r6)
            java.lang.String r3 = "android:changeBounds:bounds"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.view.View r2 = r8.view
            android.view.ViewParent r2 = r2.getParent()
            java.lang.String r3 = "android:changeBounds:parent"
            r1.put(r3, r2)
            boolean r1 = r7.mReparent
            if (r1 == 0) goto L68
            android.view.View r1 = r8.view
            int[] r2 = r7.mTempLocation
            r1.getLocationInWindow(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            int[] r2 = r7.mTempLocation
            r3 = 0
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowX"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            int[] r2 = r7.mTempLocation
            r3 = 1
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowY"
            r1.put(r3, r2)
        L68:
            boolean r1 = r7.mResizeClip
            if (r1 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.values
            android.graphics.Rect r0 = androidx.core.view.ViewCompat.getClipBounds(r0)
            java.lang.String r1 = "android:changeBounds:clip"
            r8.put(r1, r0)
        L77:
            return
    }

    private boolean parentMatches(android.view.View r4, android.view.View r5) {
            r3 = this;
            boolean r0 = r3.mReparent
            r1 = 1
            if (r0 == 0) goto L15
            androidx.transition.TransitionValues r0 = r3.getMatchedTransitionValues(r4, r1)
            r2 = 0
            if (r0 != 0) goto L11
            if (r4 != r5) goto Lf
            goto L15
        Lf:
            r1 = 0
            goto L15
        L11:
            android.view.View r4 = r0.view
            if (r5 != r4) goto Lf
        L15:
            return r1
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    public android.animation.Animator createAnimator(@androidx.annotation.NonNull android.view.ViewGroup r19, @androidx.annotation.Nullable androidx.transition.TransitionValues r20, @androidx.annotation.Nullable androidx.transition.TransitionValues r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            if (r2 == 0) goto L25e
            if (r3 != 0) goto Le
            goto L25e
        Le:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.values
            java.util.Map<java.lang.String, java.lang.Object> r6 = r3.values
            java.lang.String r7 = "android:changeBounds:parent"
            java.lang.Object r5 = r5.get(r7)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r6.get(r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r5 == 0) goto L25b
            if (r6 != 0) goto L26
            goto L25b
        L26:
            android.view.View r14 = r3.view
            boolean r5 = r0.parentMatches(r5, r6)
            if (r5 == 0) goto L1ba
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.values
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r1 = r1.get(r5)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r8 = r3.values
            java.lang.Object r5 = r8.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r8 = r1.left
            int r10 = r5.left
            int r9 = r1.top
            int r11 = r5.top
            int r12 = r1.right
            int r13 = r5.right
            int r1 = r1.bottom
            int r5 = r5.bottom
            int r15 = r12 - r8
            int r6 = r1 - r9
            int r7 = r13 - r10
            int r4 = r5 - r11
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            r16 = r14
            java.lang.String r14 = "android:changeBounds:clip"
            java.lang.Object r2 = r2.get(r14)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.values
            java.lang.Object r3 = r3.get(r14)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r15 == 0) goto L70
            if (r6 != 0) goto L74
        L70:
            if (r7 == 0) goto L83
            if (r4 == 0) goto L83
        L74:
            if (r8 != r10) goto L7b
            if (r9 == r11) goto L79
            goto L7b
        L79:
            r14 = 0
            goto L7c
        L7b:
            r14 = 1
        L7c:
            if (r12 != r13) goto L80
            if (r1 == r5) goto L84
        L80:
            int r14 = r14 + 1
            goto L84
        L83:
            r14 = 0
        L84:
            if (r2 == 0) goto L8c
            boolean r17 = r2.equals(r3)
            if (r17 == 0) goto L90
        L8c:
            if (r2 != 0) goto L92
            if (r3 == 0) goto L92
        L90:
            int r14 = r14 + 1
        L92:
            if (r14 <= 0) goto L1b8
            r19 = r3
            boolean r3 = r0.mResizeClip
            r0 = 2
            if (r3 != 0) goto L12f
            r3 = r16
            androidx.transition.ViewUtils.setLeftTopRightBottom(r3, r8, r9, r12, r1)
            if (r14 != r0) goto L100
            if (r15 != r7) goto Lbb
            if (r6 != r4) goto Lbb
            androidx.transition.PathMotion r0 = r18.getPathMotion()
            float r1 = (float) r8
            float r2 = (float) r9
            float r4 = (float) r10
            float r5 = (float) r11
            android.graphics.Path r0 = r0.getPath(r1, r2, r4, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            r2 = 0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r3, r1, r2, r0)
            goto L198
        Lbb:
            androidx.transition.ChangeBounds$ViewBounds r2 = new androidx.transition.ChangeBounds$ViewBounds
            r2.<init>(r3)
            androidx.transition.PathMotion r4 = r18.getPathMotion()
            float r6 = (float) r8
            float r7 = (float) r9
            float r8 = (float) r10
            float r9 = (float) r11
            android.graphics.Path r4 = r4.getPath(r6, r7, r8, r9)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r6 = androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY
            r7 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r2, r6, r7, r4)
            androidx.transition.PathMotion r6 = r18.getPathMotion()
            float r8 = (float) r12
            float r1 = (float) r1
            float r9 = (float) r13
            float r5 = (float) r5
            android.graphics.Path r1 = r6.getPath(r8, r1, r9, r5)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r5 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r5, r7, r1)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r6 = 0
            r0[r6] = r4
            r4 = 1
            r0[r4] = r1
            r5.playTogether(r0)
            androidx.transition.ChangeBounds$7 r0 = new androidx.transition.ChangeBounds$7
            r0.<init>(r2)
            r5.addListener(r0)
            r0 = r5
            goto L198
        L100:
            if (r8 != r10) goto L11a
            if (r9 == r11) goto L105
            goto L11a
        L105:
            androidx.transition.PathMotion r0 = r18.getPathMotion()
            float r2 = (float) r12
            float r1 = (float) r1
            float r4 = (float) r13
            float r5 = (float) r5
            android.graphics.Path r0 = r0.getPath(r2, r1, r4, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY
            r2 = 0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r3, r1, r2, r0)
            goto L198
        L11a:
            r2 = 0
            androidx.transition.PathMotion r0 = r18.getPathMotion()
            float r1 = (float) r8
            float r4 = (float) r9
            float r5 = (float) r10
            float r6 = (float) r11
            android.graphics.Path r0 = r0.getPath(r1, r4, r5, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r3, r1, r2, r0)
            goto L198
        L12f:
            r3 = r16
            int r1 = java.lang.Math.max(r15, r7)
            int r12 = java.lang.Math.max(r6, r4)
            int r1 = r1 + r8
            int r12 = r12 + r9
            androidx.transition.ViewUtils.setLeftTopRightBottom(r3, r8, r9, r1, r12)
            if (r8 != r10) goto L145
            if (r9 == r11) goto L143
            goto L145
        L143:
            r1 = 0
            goto L158
        L145:
            androidx.transition.PathMotion r1 = r18.getPathMotion()
            float r8 = (float) r8
            float r9 = (float) r9
            float r12 = (float) r10
            float r14 = (float) r11
            android.graphics.Path r1 = r1.getPath(r8, r9, r12, r14)
            android.util.Property<android.view.View, android.graphics.PointF> r8 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            r9 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r1)
        L158:
            if (r2 != 0) goto L161
            android.graphics.Rect r2 = new android.graphics.Rect
            r8 = 0
            r2.<init>(r8, r8, r15, r6)
            goto L162
        L161:
            r8 = 0
        L162:
            if (r19 != 0) goto L16a
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r8, r8, r7, r4)
            goto L16c
        L16a:
            r6 = r19
        L16c:
            boolean r4 = r2.equals(r6)
            if (r4 != 0) goto L193
            androidx.core.view.ViewCompat.setClipBounds(r3, r2)
            androidx.transition.RectEvaluator r4 = androidx.transition.ChangeBounds.sRectEvaluator
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r2
            r2 = 1
            r0[r2] = r6
            java.lang.String r2 = "clipBounds"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r3, r2, r4, r0)
            androidx.transition.ChangeBounds$8 r0 = new androidx.transition.ChangeBounds$8
            r7 = r0
            r8 = r3
            r9 = r19
            r12 = r13
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.addListener(r0)
            goto L194
        L193:
            r4 = 0
        L194:
            android.animation.Animator r0 = androidx.transition.TransitionUtils.mergeAnimators(r1, r4)
        L198:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1b5
            android.view.ViewParent r1 = r3.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            androidx.transition.ViewGroupUtils.suppressLayout(r1, r2)
            androidx.transition.ChangeBounds$9 r2 = new androidx.transition.ChangeBounds$9
            r2.<init>(r1)
            r4 = r18
            r4.addListener(r2)
            goto L1b7
        L1b5:
            r4 = r18
        L1b7:
            return r0
        L1b8:
            r4 = r0
            goto L1f5
        L1ba:
            r4 = r0
            r0 = r14
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.values
            java.lang.String r6 = "android:changeBounds:windowX"
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            java.lang.String r7 = "android:changeBounds:windowY"
            java.lang.Object r2 = r2.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r8 = r3.values
            java.lang.Object r6 = r8.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.values
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r5 != r6) goto L1f7
            if (r2 == r3) goto L1f5
            goto L1f7
        L1f5:
            r0 = 0
            return r0
        L1f7:
            int[] r7 = r4.mTempLocation
            r1.getLocationInWindow(r7)
            int r7 = r0.getWidth()
            int r8 = r0.getHeight()
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r9)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r7)
            r0.draw(r8)
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            r8.<init>(r7)
            float r7 = androidx.transition.ViewUtils.getTransitionAlpha(r0)
            r9 = 0
            androidx.transition.ViewUtils.setTransitionAlpha(r0, r9)
            androidx.transition.ViewOverlayApi18 r9 = new androidx.transition.ViewOverlayApi18
            r9.<init>(r1)
            r9.add(r8)
            androidx.transition.PathMotion r9 = r18.getPathMotion()
            int[] r10 = r4.mTempLocation
            r11 = 0
            r12 = r10[r11]
            int r5 = r5 - r12
            float r5 = (float) r5
            r12 = 1
            r13 = r10[r12]
            int r2 = r2 - r13
            float r2 = (float) r2
            r13 = r10[r11]
            int r6 = r6 - r13
            float r6 = (float) r6
            r10 = r10[r12]
            int r3 = r3 - r10
            float r3 = (float) r3
            android.graphics.Path r2 = r9.getPath(r5, r2, r6, r3)
            android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> r3 = androidx.transition.ChangeBounds.DRAWABLE_ORIGIN_PROPERTY
            r5 = 0
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r3, r5, r2)
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r12]
            r3[r11] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r8, r3)
            androidx.transition.ChangeBounds$10 r3 = new androidx.transition.ChangeBounds$10
            r3.<init>(r1, r8, r0, r7)
            r2.addListener(r3)
            return r2
        L25b:
            r4 = r0
            r5 = 0
            return r5
        L25e:
            r4 = r0
            r5 = 0
            return r5
    }

    public boolean getResizeClip() {
            r1 = this;
            boolean r0 = r1.mResizeClip
            return r0
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeBounds.sTransitionProperties
            return r0
    }

    public void setResizeClip(boolean r1) {
            r0 = this;
            r0.mResizeClip = r1
            return
    }
}
