package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
class SlideKitkat extends android.transition.Visibility {
    private static final java.lang.String TAG = "SlideKitkat";
    private static final android.animation.TimeInterpolator sAccelerate = null;
    private static final androidx.leanback.transition.SlideKitkat.CalculateSlide sCalculateBottom = null;
    private static final androidx.leanback.transition.SlideKitkat.CalculateSlide sCalculateEnd = null;
    private static final androidx.leanback.transition.SlideKitkat.CalculateSlide sCalculateLeft = null;
    private static final androidx.leanback.transition.SlideKitkat.CalculateSlide sCalculateRight = null;
    private static final androidx.leanback.transition.SlideKitkat.CalculateSlide sCalculateStart = null;
    private static final androidx.leanback.transition.SlideKitkat.CalculateSlide sCalculateTop = null;
    private static final android.animation.TimeInterpolator sDecelerate = null;
    private androidx.leanback.transition.SlideKitkat.CalculateSlide mSlideCalculator;
    private int mSlideEdge;







    public interface CalculateSlide {
        float getGone(android.view.View r1);

        float getHere(android.view.View r1);

        android.util.Property<android.view.View, java.lang.Float> getProperty();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class CalculateSlideHorizontal implements androidx.leanback.transition.SlideKitkat.CalculateSlide {
        public CalculateSlideHorizontal() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getHere(android.view.View r1) {
                r0 = this;
                float r1 = r1.getTranslationX()
                return r1
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public android.util.Property<android.view.View, java.lang.Float> getProperty() {
                r1 = this;
                android.util.Property r0 = android.view.View.TRANSLATION_X
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class CalculateSlideVertical implements androidx.leanback.transition.SlideKitkat.CalculateSlide {
        public CalculateSlideVertical() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public float getHere(android.view.View r1) {
                r0 = this;
                float r1 = r1.getTranslationY()
                return r1
        }

        @Override // androidx.leanback.transition.SlideKitkat.CalculateSlide
        public android.util.Property<android.view.View, java.lang.Float> getProperty() {
                r1 = this;
                android.util.Property r0 = android.view.View.TRANSLATION_Y
                return r0
        }
    }

    public static class SlideAnimatorListener extends android.animation.AnimatorListenerAdapter {
        private boolean mCanceled;
        private final float mEndValue;
        private final int mFinalVisibility;
        private float mPausedValue;
        private final android.util.Property<android.view.View, java.lang.Float> mProp;
        private final float mTerminalValue;
        private final android.view.View mView;

        public SlideAnimatorListener(android.view.View r2, android.util.Property<android.view.View, java.lang.Float> r3, float r4, float r5, int r6) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mCanceled = r0
                r1.mProp = r3
                r1.mView = r2
                r1.mTerminalValue = r4
                r1.mEndValue = r5
                r1.mFinalVisibility = r6
                r2.setVisibility(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r4) {
                r3 = this;
                r4 = 2
                float[] r4 = new float[r4]
                android.view.View r0 = r3.mView
                float r0 = r0.getTranslationX()
                r1 = 0
                r4[r1] = r0
                android.view.View r0 = r3.mView
                float r0 = r0.getTranslationY()
                r1 = 1
                r4[r1] = r0
                android.view.View r0 = r3.mView
                int r2 = androidx.leanback.R.id.lb_slide_transition_value
                r0.setTag(r2, r4)
                android.util.Property<android.view.View, java.lang.Float> r4 = r3.mProp
                android.view.View r0 = r3.mView
                float r2 = r3.mTerminalValue
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r4.set(r0, r2)
                r3.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                boolean r3 = r2.mCanceled
                if (r3 != 0) goto L11
                android.util.Property<android.view.View, java.lang.Float> r3 = r2.mProp
                android.view.View r0 = r2.mView
                float r1 = r2.mTerminalValue
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r3.set(r0, r1)
            L11:
                android.view.View r3 = r2.mView
                int r0 = r2.mFinalVisibility
                r3.setVisibility(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r3) {
                r2 = this;
                android.util.Property<android.view.View, java.lang.Float> r3 = r2.mProp
                android.view.View r0 = r2.mView
                java.lang.Object r3 = r3.get(r0)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r2.mPausedValue = r3
                android.util.Property<android.view.View, java.lang.Float> r3 = r2.mProp
                android.view.View r0 = r2.mView
                float r1 = r2.mEndValue
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r3.set(r0, r1)
                android.view.View r3 = r2.mView
                int r0 = r2.mFinalVisibility
                r3.setVisibility(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r3) {
                r2 = this;
                android.util.Property<android.view.View, java.lang.Float> r3 = r2.mProp
                android.view.View r0 = r2.mView
                float r1 = r2.mPausedValue
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r3.set(r0, r1)
                android.view.View r3 = r2.mView
                r0 = 0
                r3.setVisibility(r0)
                return
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sDecelerate = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sAccelerate = r0
            androidx.leanback.transition.SlideKitkat$1 r0 = new androidx.leanback.transition.SlideKitkat$1
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sCalculateLeft = r0
            androidx.leanback.transition.SlideKitkat$2 r0 = new androidx.leanback.transition.SlideKitkat$2
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sCalculateTop = r0
            androidx.leanback.transition.SlideKitkat$3 r0 = new androidx.leanback.transition.SlideKitkat$3
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sCalculateRight = r0
            androidx.leanback.transition.SlideKitkat$4 r0 = new androidx.leanback.transition.SlideKitkat$4
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sCalculateBottom = r0
            androidx.leanback.transition.SlideKitkat$5 r0 = new androidx.leanback.transition.SlideKitkat$5
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sCalculateStart = r0
            androidx.leanback.transition.SlideKitkat$6 r0 = new androidx.leanback.transition.SlideKitkat$6
            r0.<init>()
            androidx.leanback.transition.SlideKitkat.sCalculateEnd = r0
            return
    }

    public SlideKitkat() {
            r1 = this;
            r1.<init>()
            r0 = 80
            r1.setSlideEdge(r0)
            return
    }

    public SlideKitkat(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>()
            int[] r0 = androidx.leanback.R.styleable.lbSlide
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
            int r0 = androidx.leanback.R.styleable.lbSlide_lb_slideEdge
            r1 = 80
            int r0 = r8.getInt(r0, r1)
            r6.setSlideEdge(r0)
            int r0 = androidx.leanback.R.styleable.lbSlide_android_duration
            r1 = -1
            int r0 = r8.getInt(r0, r1)
            long r2 = (long) r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L25
            r6.setDuration(r2)
        L25:
            int r0 = androidx.leanback.R.styleable.lbSlide_android_startDelay
            int r0 = r8.getInt(r0, r1)
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L33
            r6.setStartDelay(r0)
        L33:
            int r0 = androidx.leanback.R.styleable.lbSlide_android_interpolator
            r1 = 0
            int r0 = r8.getResourceId(r0, r1)
            if (r0 <= 0) goto L43
            android.view.animation.Interpolator r7 = android.view.animation.AnimationUtils.loadInterpolator(r7, r0)
            r6.setInterpolator(r7)
        L43:
            r8.recycle()
            return
    }

    private android.animation.Animator createAnimation(android.view.View r8, android.util.Property<android.view.View, java.lang.Float> r9, float r10, float r11, float r12, android.animation.TimeInterpolator r13, int r14) {
            r7 = this;
            int r0 = androidx.leanback.R.id.lb_slide_transition_value
            java.lang.Object r1 = r8.getTag(r0)
            float[] r1 = (float[]) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            if (r10 != r9) goto L13
            r10 = r1[r2]
            goto L15
        L13:
            r10 = r1[r3]
        L15:
            r1 = 0
            r8.setTag(r0, r1)
        L19:
            r0 = 2
            float[] r0 = new float[r0]
            r0[r3] = r10
            r0[r2] = r11
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r8, r9, r0)
            androidx.leanback.transition.SlideKitkat$SlideAnimatorListener r6 = new androidx.leanback.transition.SlideKitkat$SlideAnimatorListener
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.addListener(r6)
            r10.addPauseListener(r6)
            r10.setInterpolator(r13)
            return r10
    }

    public int getSlideEdge() {
            r1 = this;
            int r0 = r1.mSlideEdge
            return r0
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup r9, android.transition.TransitionValues r10, int r11, android.transition.TransitionValues r12, int r13) {
            r8 = this;
            r9 = 0
            if (r12 == 0) goto L7
            android.view.View r10 = r12.view
            r1 = r10
            goto L8
        L7:
            r1 = r9
        L8:
            if (r1 != 0) goto Lb
            return r9
        Lb:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r9 = r8.mSlideCalculator
            float r5 = r9.getHere(r1)
            androidx.leanback.transition.SlideKitkat$CalculateSlide r9 = r8.mSlideCalculator
            float r3 = r9.getGone(r1)
            androidx.leanback.transition.SlideKitkat$CalculateSlide r9 = r8.mSlideCalculator
            android.util.Property r2 = r9.getProperty()
            android.animation.TimeInterpolator r6 = androidx.leanback.transition.SlideKitkat.sDecelerate
            r7 = 0
            r0 = r8
            r4 = r5
            android.animation.Animator r9 = r0.createAnimation(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup r9, android.transition.TransitionValues r10, int r11, android.transition.TransitionValues r12, int r13) {
            r8 = this;
            r9 = 0
            if (r10 == 0) goto L7
            android.view.View r10 = r10.view
            r1 = r10
            goto L8
        L7:
            r1 = r9
        L8:
            if (r1 != 0) goto Lb
            return r9
        Lb:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r9 = r8.mSlideCalculator
            float r5 = r9.getHere(r1)
            androidx.leanback.transition.SlideKitkat$CalculateSlide r9 = r8.mSlideCalculator
            float r4 = r9.getGone(r1)
            androidx.leanback.transition.SlideKitkat$CalculateSlide r9 = r8.mSlideCalculator
            android.util.Property r2 = r9.getProperty()
            android.animation.TimeInterpolator r6 = androidx.leanback.transition.SlideKitkat.sAccelerate
            r7 = 4
            r0 = r8
            r3 = r5
            android.animation.Animator r9 = r0.createAnimation(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public void setSlideEdge(int r2) {
            r1 = this;
            r0 = 3
            if (r2 == r0) goto L39
            r0 = 5
            if (r2 == r0) goto L34
            r0 = 48
            if (r2 == r0) goto L2f
            r0 = 80
            if (r2 == r0) goto L2a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r0) goto L25
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r2 != r0) goto L1d
            androidx.leanback.transition.SlideKitkat$CalculateSlide r0 = androidx.leanback.transition.SlideKitkat.sCalculateEnd
            r1.mSlideCalculator = r0
            goto L3d
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid slide direction"
            r2.<init>(r0)
            throw r2
        L25:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r0 = androidx.leanback.transition.SlideKitkat.sCalculateStart
            r1.mSlideCalculator = r0
            goto L3d
        L2a:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r0 = androidx.leanback.transition.SlideKitkat.sCalculateBottom
            r1.mSlideCalculator = r0
            goto L3d
        L2f:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r0 = androidx.leanback.transition.SlideKitkat.sCalculateTop
            r1.mSlideCalculator = r0
            goto L3d
        L34:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r0 = androidx.leanback.transition.SlideKitkat.sCalculateRight
            r1.mSlideCalculator = r0
            goto L3d
        L39:
            androidx.leanback.transition.SlideKitkat$CalculateSlide r0 = androidx.leanback.transition.SlideKitkat.sCalculateLeft
            r1.mSlideCalculator = r0
        L3d:
            r1.mSlideEdge = r2
            return
    }
}
