package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsAnimationCompat {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WindowInsetsAnimCompat";
    private androidx.core.view.WindowInsetsAnimationCompat.Impl mImpl;

    /* JADX INFO: loaded from: classes.dex */
    public static final class BoundsCompat {
        private final androidx.core.graphics.Insets mLowerBound;
        private final androidx.core.graphics.Insets mUpperBound;

        @androidx.annotation.RequiresApi(30)
        private BoundsCompat(@androidx.annotation.NonNull android.view.WindowInsetsAnimation.Bounds r2) {
                r1 = this;
                r1.<init>()
                androidx.core.graphics.Insets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl30.getLowerBounds(r2)
                r1.mLowerBound = r0
                androidx.core.graphics.Insets r2 = androidx.core.view.WindowInsetsAnimationCompat.Impl30.getHigherBounds(r2)
                r1.mUpperBound = r2
                return
        }

        public BoundsCompat(@androidx.annotation.NonNull androidx.core.graphics.Insets r1, @androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r0 = this;
                r0.<init>()
                r0.mLowerBound = r1
                r0.mUpperBound = r2
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(30)
        public static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat toBoundsCompat(@androidx.annotation.NonNull android.view.WindowInsetsAnimation.Bounds r1) {
                androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r0 = new androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getLowerBound() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mLowerBound
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getUpperBound() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mUpperBound
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat inset(@androidx.annotation.NonNull androidx.core.graphics.Insets r7) {
                r6 = this;
                androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r0 = new androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat
                androidx.core.graphics.Insets r1 = r6.mLowerBound
                int r2 = r7.left
                int r3 = r7.top
                int r4 = r7.right
                int r5 = r7.bottom
                androidx.core.graphics.Insets r1 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r2, r3, r4, r5)
                androidx.core.graphics.Insets r2 = r6.mUpperBound
                int r3 = r7.left
                int r4 = r7.top
                int r5 = r7.right
                int r7 = r7.bottom
                androidx.core.graphics.Insets r7 = androidx.core.view.WindowInsetsCompat.insetInsets(r2, r3, r4, r5, r7)
                r0.<init>(r1, r7)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(30)
        public android.view.WindowInsetsAnimation.Bounds toBounds() {
                r1 = this;
                android.view.WindowInsetsAnimation$Bounds r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl30.createPlatformBounds(r1)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Bounds{lower="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.core.graphics.Insets r1 = r2.mLowerBound
                r0.append(r1)
                java.lang.String r1 = " upper="
                r0.append(r1)
                androidx.core.graphics.Insets r1 = r2.mUpperBound
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        public android.view.WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DispatchMode {
        }

        public Callback(int r1) {
                r0 = this;
                r0.<init>()
                r0.mDispatchMode = r1
                return
        }

        public final int getDispatchMode() {
                r1 = this;
                int r0 = r1.mDispatchMode
                return r0
        }

        public void onEnd(@androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat r1) {
                r0 = this;
                return
        }

        public void onPrepare(@androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat r1) {
                r0 = this;
                return
        }

        @androidx.annotation.NonNull
        public abstract androidx.core.view.WindowInsetsCompat onProgress(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r2);

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(@androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r2) {
                r0 = this;
                return r2
        }
    }

    public static class Impl {
        private float mAlpha;
        private final long mDurationMillis;
        private float mFraction;

        @androidx.annotation.Nullable
        private final android.view.animation.Interpolator mInterpolator;
        private final int mTypeMask;

        public Impl(int r1, @androidx.annotation.Nullable android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.mTypeMask = r1
                r0.mInterpolator = r2
                r0.mDurationMillis = r3
                return
        }

        public float getAlpha() {
                r1 = this;
                float r0 = r1.mAlpha
                return r0
        }

        public long getDurationMillis() {
                r2 = this;
                long r0 = r2.mDurationMillis
                return r0
        }

        public float getFraction() {
                r1 = this;
                float r0 = r1.mFraction
                return r0
        }

        public float getInterpolatedFraction() {
                r2 = this;
                android.view.animation.Interpolator r0 = r2.mInterpolator
                if (r0 == 0) goto Lb
                float r1 = r2.mFraction
                float r0 = r0.getInterpolation(r1)
                return r0
            Lb:
                float r0 = r2.mFraction
                return r0
        }

        @androidx.annotation.Nullable
        public android.view.animation.Interpolator getInterpolator() {
                r1 = this;
                android.view.animation.Interpolator r0 = r1.mInterpolator
                return r0
        }

        public int getTypeMask() {
                r1 = this;
                int r0 = r1.mTypeMask
                return r0
        }

        public void setAlpha(float r1) {
                r0 = this;
                r0.mAlpha = r1
                return
        }

        public void setFraction(float r1) {
                r0 = this;
                r0.mFraction = r1
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class Impl21 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {

        /* JADX INFO: loaded from: classes.dex */
        @androidx.annotation.RequiresApi(21)
        public static class Impl21OnApplyWindowInsetsListener implements android.view.View.OnApplyWindowInsetsListener {
            private static final int COMPAT_ANIMATION_DURATION = 160;
            public final androidx.core.view.WindowInsetsAnimationCompat.Callback mCallback;
            private androidx.core.view.WindowInsetsCompat mLastInsets;




            public Impl21OnApplyWindowInsetsListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                    r0 = this;
                    r0.<init>()
                    r0.mCallback = r2
                    androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.getRootWindowInsets(r1)
                    if (r1 == 0) goto L15
                    androidx.core.view.WindowInsetsCompat$Builder r2 = new androidx.core.view.WindowInsetsCompat$Builder
                    r2.<init>(r1)
                    androidx.core.view.WindowInsetsCompat r1 = r2.build()
                    goto L16
                L15:
                    r1 = 0
                L16:
                    r0.mLastInsets = r1
                    return
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View r14, android.view.WindowInsets r15) {
                    r13 = this;
                    boolean r0 = r14.isLaidOut()
                    if (r0 != 0) goto L11
                    androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r15, r14)
                    r13.mLastInsets = r0
                    android.view.WindowInsets r14 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r14, r15)
                    return r14
                L11:
                    androidx.core.view.WindowInsetsCompat r6 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r15, r14)
                    androidx.core.view.WindowInsetsCompat r0 = r13.mLastInsets
                    if (r0 != 0) goto L1f
                    androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.getRootWindowInsets(r14)
                    r13.mLastInsets = r0
                L1f:
                    androidx.core.view.WindowInsetsCompat r0 = r13.mLastInsets
                    if (r0 != 0) goto L2a
                    r13.mLastInsets = r6
                    android.view.WindowInsets r14 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r14, r15)
                    return r14
                L2a:
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.getCallback(r14)
                    if (r0 == 0) goto L3d
                    android.view.WindowInsets r0 = r0.mDispachedInsets
                    boolean r0 = java.util.Objects.equals(r0, r15)
                    if (r0 == 0) goto L3d
                    android.view.WindowInsets r14 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r14, r15)
                    return r14
                L3d:
                    androidx.core.view.WindowInsetsCompat r0 = r13.mLastInsets
                    r1 = 1
                    r2 = 0
                    r4 = 0
                L42:
                    r3 = 256(0x100, float:3.59E-43)
                    if (r1 > r3) goto L58
                    androidx.core.graphics.Insets r3 = r6.getInsets(r1)
                    androidx.core.graphics.Insets r5 = r0.getInsets(r1)
                    boolean r3 = r3.equals(r5)
                    if (r3 != 0) goto L55
                    r4 = r4 | r1
                L55:
                    int r1 = r1 << 1
                    goto L42
                L58:
                    if (r4 != 0) goto L5f
                    android.view.WindowInsets r14 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r14, r15)
                    return r14
                L5f:
                    androidx.core.view.WindowInsetsCompat r3 = r13.mLastInsets
                    androidx.core.view.WindowInsetsAnimationCompat r7 = new androidx.core.view.WindowInsetsAnimationCompat
                    android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
                    r0.<init>()
                    r8 = 160(0xa0, double:7.9E-322)
                    r7.<init>(r4, r0, r8)
                    r0 = 0
                    r7.setFraction(r0)
                    r0 = 2
                    float[] r0 = new float[r0]
                    r0 = {x00fe: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                    android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
                    long r8 = r7.getDurationMillis()
                    android.animation.ValueAnimator r8 = r0.setDuration(r8)
                    androidx.core.graphics.Insets r0 = r6.getInsets(r4)
                    androidx.core.graphics.Insets r1 = r3.getInsets(r4)
                    int r5 = r0.left
                    int r9 = r1.left
                    int r5 = java.lang.Math.min(r5, r9)
                    int r9 = r0.top
                    int r10 = r1.top
                    int r9 = java.lang.Math.min(r9, r10)
                    int r10 = r0.right
                    int r11 = r1.right
                    int r10 = java.lang.Math.min(r10, r11)
                    int r11 = r0.bottom
                    int r12 = r1.bottom
                    int r11 = java.lang.Math.min(r11, r12)
                    androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r5, r9, r10, r11)
                    int r9 = r0.left
                    int r10 = r1.left
                    int r9 = java.lang.Math.max(r9, r10)
                    int r10 = r0.top
                    int r11 = r1.top
                    int r10 = java.lang.Math.max(r10, r11)
                    int r11 = r0.right
                    int r12 = r1.right
                    int r11 = java.lang.Math.max(r11, r12)
                    int r0 = r0.bottom
                    int r1 = r1.bottom
                    int r0 = java.lang.Math.max(r0, r1)
                    androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r9, r10, r11, r0)
                    androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r9 = new androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat
                    r9.<init>(r5, r0)
                    androidx.core.view.WindowInsetsAnimationCompat.Impl21.dispatchOnPrepare(r14, r7, r15, r2)
                    androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1 r10 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1
                    r0 = r10
                    r1 = r7
                    r2 = r6
                    r5 = r14
                    r0.<init>(r1, r2, r3, r4, r5)
                    r8.addUpdateListener(r10)
                    androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2
                    r0.<init>(r7, r14)
                    r8.addListener(r0)
                    androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3
                    r0.<init>(r14, r7, r9, r8)
                    androidx.core.view.OneShotPreDrawListener.add(r14, r0)
                    r13.mLastInsets = r6
                    android.view.WindowInsets r14 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r14, r15)
                    return r14
            }
        }

        public Impl21(int r1, @androidx.annotation.Nullable android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @androidx.annotation.NonNull
        private static android.view.View.OnApplyWindowInsetsListener createProxyListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener
                r0.<init>(r1, r2)
                return r0
        }

        public static void dispatchOnEnd(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat r3) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r2)
                if (r0 == 0) goto L10
                r0.onEnd(r3)
                int r0 = r0.getDispatchMode()
                if (r0 != 0) goto L10
                return
            L10:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L27
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L17:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L27
                android.view.View r1 = r2.getChildAt(r0)
                dispatchOnEnd(r1, r3)
                int r0 = r0 + 1
                goto L17
            L27:
                return
        }

        public static void dispatchOnPrepare(android.view.View r2, androidx.core.view.WindowInsetsAnimationCompat r3, android.view.WindowInsets r4, boolean r5) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r2)
                r1 = 0
                if (r0 == 0) goto L17
                r0.mDispachedInsets = r4
                if (r5 != 0) goto L17
                r0.onPrepare(r3)
                int r5 = r0.getDispatchMode()
                if (r5 != 0) goto L16
                r5 = 1
                goto L17
            L16:
                r5 = 0
            L17:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L2d
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            L1d:
                int r0 = r2.getChildCount()
                if (r1 >= r0) goto L2d
                android.view.View r0 = r2.getChildAt(r1)
                dispatchOnPrepare(r0, r3, r4, r5)
                int r1 = r1 + 1
                goto L1d
            L2d:
                return
        }

        public static void dispatchOnProgress(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3, @androidx.annotation.NonNull java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r4) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r2)
                if (r0 == 0) goto L11
                androidx.core.view.WindowInsetsCompat r3 = r0.onProgress(r3, r4)
                int r0 = r0.getDispatchMode()
                if (r0 != 0) goto L11
                return
            L11:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L28
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L18:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L28
                android.view.View r1 = r2.getChildAt(r0)
                dispatchOnProgress(r1, r3, r4)
                int r0 = r0 + 1
                goto L18
            L28:
                return
        }

        public static void dispatchOnStart(android.view.View r2, androidx.core.view.WindowInsetsAnimationCompat r3, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r4) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r2)
                if (r0 == 0) goto L10
                r0.onStart(r3, r4)
                int r0 = r0.getDispatchMode()
                if (r0 != 0) goto L10
                return
            L10:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L27
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L17:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L27
                android.view.View r1 = r2.getChildAt(r0)
                dispatchOnStart(r1, r3, r4)
                int r0 = r0 + 1
                goto L17
            L27:
                return
        }

        @androidx.annotation.NonNull
        public static android.view.WindowInsets forwardToViewIfNeeded(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.WindowInsets r2) {
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                java.lang.Object r0 = r1.getTag(r0)
                if (r0 == 0) goto L9
                return r2
            L9:
                android.view.WindowInsets r1 = r1.onApplyWindowInsets(r2)
                return r1
        }

        @androidx.annotation.Nullable
        public static androidx.core.view.WindowInsetsAnimationCompat.Callback getCallback(android.view.View r1) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r1 = r1.getTag(r0)
                boolean r0 = r1 instanceof androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener
                if (r0 == 0) goto Lf
                androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener r1 = (androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener) r1
                androidx.core.view.WindowInsetsAnimationCompat$Callback r1 = r1.mCallback
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        public static void setCallback(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.WindowInsetsAnimationCompat.Callback r3) {
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                java.lang.Object r0 = r2.getTag(r0)
                if (r3 != 0) goto L14
                int r3 = androidx.core.R.id.tag_window_insets_animation_callback
                r1 = 0
                r2.setTag(r3, r1)
                if (r0 != 0) goto L22
                r2.setOnApplyWindowInsetsListener(r1)
                goto L22
            L14:
                android.view.View$OnApplyWindowInsetsListener r3 = createProxyListener(r2, r3)
                int r1 = androidx.core.R.id.tag_window_insets_animation_callback
                r2.setTag(r1, r3)
                if (r0 != 0) goto L22
                r2.setOnApplyWindowInsetsListener(r3)
            L22:
                return
        }
    }

    @androidx.annotation.RequiresApi(30)
    public static class Impl30 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {

        @androidx.annotation.NonNull
        private final android.view.WindowInsetsAnimation mWrapped;

        /* JADX INFO: loaded from: classes.dex */
        @androidx.annotation.RequiresApi(30)
        public static class ProxyCallback extends android.view.WindowInsetsAnimation.Callback {
            private final java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> mAnimations;
            private final androidx.core.view.WindowInsetsAnimationCompat.Callback mCompat;
            private java.util.List<androidx.core.view.WindowInsetsAnimationCompat> mRORunningAnimations;
            private java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> mTmpRunningAnimations;

            public ProxyCallback(@androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                    r1 = this;
                    int r0 = r2.getDispatchMode()
                    r1.<init>(r0)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    r1.mAnimations = r0
                    r1.mCompat = r2
                    return
            }

            @androidx.annotation.NonNull
            private androidx.core.view.WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(@androidx.annotation.NonNull android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> r0 = r2.mAnimations
                    java.lang.Object r0 = r0.get(r3)
                    androidx.core.view.WindowInsetsAnimationCompat r0 = (androidx.core.view.WindowInsetsAnimationCompat) r0
                    if (r0 != 0) goto L13
                    androidx.core.view.WindowInsetsAnimationCompat r0 = androidx.core.view.WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(r3)
                    java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> r1 = r2.mAnimations
                    r1.put(r3, r0)
                L13:
                    return r0
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@androidx.annotation.NonNull android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r2.mCompat
                    androidx.core.view.WindowInsetsAnimationCompat r1 = r2.getWindowInsetsAnimationCompat(r3)
                    r0.onEnd(r1)
                    java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> r0 = r2.mAnimations
                    r0.remove(r3)
                    return
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@androidx.annotation.NonNull android.view.WindowInsetsAnimation r2) {
                    r1 = this;
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r1.mCompat
                    androidx.core.view.WindowInsetsAnimationCompat r2 = r1.getWindowInsetsAnimationCompat(r2)
                    r0.onPrepare(r2)
                    return
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @androidx.annotation.NonNull
            public android.view.WindowInsets onProgress(@androidx.annotation.NonNull android.view.WindowInsets r4, @androidx.annotation.NonNull java.util.List<android.view.WindowInsetsAnimation> r5) {
                    r3 = this;
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> r0 = r3.mTmpRunningAnimations
                    if (r0 != 0) goto L16
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r5.size()
                    r0.<init>(r1)
                    r3.mTmpRunningAnimations = r0
                    java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                    r3.mRORunningAnimations = r0
                    goto L19
                L16:
                    r0.clear()
                L19:
                    int r0 = r5.size()
                    int r0 = r0 + (-1)
                L1f:
                    if (r0 < 0) goto L3a
                    java.lang.Object r1 = r5.get(r0)
                    android.view.WindowInsetsAnimation r1 = (android.view.WindowInsetsAnimation) r1
                    androidx.core.view.WindowInsetsAnimationCompat r2 = r3.getWindowInsetsAnimationCompat(r1)
                    float r1 = r1.getFraction()
                    r2.setFraction(r1)
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> r1 = r3.mTmpRunningAnimations
                    r1.add(r2)
                    int r0 = r0 + (-1)
                    goto L1f
                L3a:
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r5 = r3.mCompat
                    androidx.core.view.WindowInsetsCompat r4 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r4)
                    java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r0 = r3.mRORunningAnimations
                    androidx.core.view.WindowInsetsCompat r4 = r5.onProgress(r4, r0)
                    android.view.WindowInsets r4 = r4.toWindowInsets()
                    return r4
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @androidx.annotation.NonNull
            public android.view.WindowInsetsAnimation.Bounds onStart(@androidx.annotation.NonNull android.view.WindowInsetsAnimation r2, @androidx.annotation.NonNull android.view.WindowInsetsAnimation.Bounds r3) {
                    r1 = this;
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r1.mCompat
                    androidx.core.view.WindowInsetsAnimationCompat r2 = r1.getWindowInsetsAnimationCompat(r2)
                    androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r3 = androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(r3)
                    androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r2 = r0.onStart(r2, r3)
                    android.view.WindowInsetsAnimation$Bounds r2 = r2.toBounds()
                    return r2
            }
        }

        public Impl30(int r2, android.view.animation.Interpolator r3, long r4) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = new android.view.WindowInsetsAnimation
                r0.<init>(r2, r3, r4)
                r2 = 0
                r3 = 0
                r4 = 0
                r1.<init>(r2, r3, r4)
                r1.mWrapped = r0
                return
        }

        public Impl30(@androidx.annotation.NonNull android.view.WindowInsetsAnimation r5) {
                r4 = this;
                r0 = 0
                r1 = 0
                r2 = 0
                r4.<init>(r0, r1, r2)
                r4.mWrapped = r5
                return
        }

        @androidx.annotation.NonNull
        public static android.view.WindowInsetsAnimation.Bounds createPlatformBounds(@androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r2) {
                android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
                androidx.core.graphics.Insets r1 = r2.getLowerBound()
                android.graphics.Insets r1 = r1.toPlatformInsets()
                androidx.core.graphics.Insets r2 = r2.getUpperBound()
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        public static androidx.core.graphics.Insets getHigherBounds(@androidx.annotation.NonNull android.view.WindowInsetsAnimation.Bounds r0) {
                android.graphics.Insets r0 = r0.getUpperBound()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @androidx.annotation.NonNull
        public static androidx.core.graphics.Insets getLowerBounds(@androidx.annotation.NonNull android.view.WindowInsetsAnimation.Bounds r0) {
                android.graphics.Insets r0 = r0.getLowerBound()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        public static void setCallback(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                if (r2 == 0) goto L8
                androidx.core.view.WindowInsetsAnimationCompat$Impl30$ProxyCallback r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl30$ProxyCallback
                r0.<init>(r2)
                goto L9
            L8:
                r0 = 0
            L9:
                r1.setWindowInsetsAnimationCallback(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
                r2 = this;
                android.view.WindowInsetsAnimation r0 = r2.mWrapped
                long r0 = r0.getDurationMillis()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                float r0 = r0.getFraction()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                float r0 = r0.getInterpolatedFraction()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        @androidx.annotation.Nullable
        public android.view.animation.Interpolator getInterpolator() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                android.view.animation.Interpolator r0 = r0.getInterpolator()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                int r0 = r0.getTypeMask()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float r2) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                r0.setFraction(r2)
                return
        }
    }

    public WindowInsetsAnimationCompat(int r3, @androidx.annotation.Nullable android.view.animation.Interpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.WindowInsetsAnimationCompat$Impl30 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl30
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            goto L18
        L11:
            androidx.core.view.WindowInsetsAnimationCompat$Impl21 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
        L18:
            return
    }

    @androidx.annotation.RequiresApi(30)
    private WindowInsetsAnimationCompat(@androidx.annotation.NonNull android.view.WindowInsetsAnimation r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r4.<init>(r0, r1, r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L14
            androidx.core.view.WindowInsetsAnimationCompat$Impl30 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl30
            r0.<init>(r5)
            r4.mImpl = r0
        L14:
            return
    }

    @androidx.annotation.RequiresApi(30)
    public static androidx.core.view.WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(android.view.WindowInsetsAnimation r1) {
            androidx.core.view.WindowInsetsAnimationCompat r0 = new androidx.core.view.WindowInsetsAnimationCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float getAlpha() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            float r0 = r0.getAlpha()
            return r0
    }

    public long getDurationMillis() {
            r2 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r2.mImpl
            long r0 = r0.getDurationMillis()
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float getFraction() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            float r0 = r0.getFraction()
            return r0
    }

    public float getInterpolatedFraction() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            float r0 = r0.getInterpolatedFraction()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            android.view.animation.Interpolator r0 = r0.getInterpolator()
            return r0
    }

    public int getTypeMask() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            int r0 = r0.getTypeMask()
            return r0
    }

    public void setAlpha(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            r0.setAlpha(r2)
            return
    }

    public void setFraction(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            r0.setFraction(r2)
            return
    }
}
