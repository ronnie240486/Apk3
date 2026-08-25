package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class FadeAndShortSlide extends android.transition.Visibility {
    private static final java.lang.String PROPNAME_SCREEN_POSITION = "android:fadeAndShortSlideTransition:screenPosition";
    public static final androidx.leanback.transition.FadeAndShortSlide.AnonymousClass4 sCalculateBottom = null;
    public static final androidx.leanback.transition.FadeAndShortSlide.AnonymousClass2 sCalculateEnd = null;
    public static final androidx.leanback.transition.FadeAndShortSlide.AnonymousClass1 sCalculateStart = null;
    public static final androidx.leanback.transition.FadeAndShortSlide.AnonymousClass3 sCalculateStartEnd = null;
    public static final androidx.leanback.transition.FadeAndShortSlide.AnonymousClass5 sCalculateTop = null;
    private static final android.animation.TimeInterpolator sDecelerate = null;
    private float mDistance;
    private android.transition.Visibility mFade;
    private androidx.leanback.transition.FadeAndShortSlide.CalculateSlide mSlideCalculator;
    public final androidx.leanback.transition.FadeAndShortSlide.AnonymousClass6 sCalculateTopBottom;







    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class CalculateSlide {
        public CalculateSlide() {
                r0 = this;
                r0.<init>()
                return
        }

        public float getGoneX(androidx.leanback.transition.FadeAndShortSlide r1, android.view.ViewGroup r2, android.view.View r3, int[] r4) {
                r0 = this;
                float r1 = r3.getTranslationX()
                return r1
        }

        public float getGoneY(androidx.leanback.transition.FadeAndShortSlide r1, android.view.ViewGroup r2, android.view.View r3, int[] r4) {
                r0 = this;
                float r1 = r3.getTranslationY()
                return r1
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.leanback.transition.FadeAndShortSlide.sDecelerate = r0
            androidx.leanback.transition.FadeAndShortSlide$1 r0 = new androidx.leanback.transition.FadeAndShortSlide$1
            r0.<init>()
            androidx.leanback.transition.FadeAndShortSlide.sCalculateStart = r0
            androidx.leanback.transition.FadeAndShortSlide$2 r0 = new androidx.leanback.transition.FadeAndShortSlide$2
            r0.<init>()
            androidx.leanback.transition.FadeAndShortSlide.sCalculateEnd = r0
            androidx.leanback.transition.FadeAndShortSlide$3 r0 = new androidx.leanback.transition.FadeAndShortSlide$3
            r0.<init>()
            androidx.leanback.transition.FadeAndShortSlide.sCalculateStartEnd = r0
            androidx.leanback.transition.FadeAndShortSlide$4 r0 = new androidx.leanback.transition.FadeAndShortSlide$4
            r0.<init>()
            androidx.leanback.transition.FadeAndShortSlide.sCalculateBottom = r0
            androidx.leanback.transition.FadeAndShortSlide$5 r0 = new androidx.leanback.transition.FadeAndShortSlide$5
            r0.<init>()
            androidx.leanback.transition.FadeAndShortSlide.sCalculateTop = r0
            return
    }

    public FadeAndShortSlide() {
            r1 = this;
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.<init>(r0)
            return
    }

    public FadeAndShortSlide(int r2) {
            r1 = this;
            r1.<init>()
            android.transition.Fade r0 = new android.transition.Fade
            r0.<init>()
            r1.mFade = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mDistance = r0
            androidx.leanback.transition.FadeAndShortSlide$6 r0 = new androidx.leanback.transition.FadeAndShortSlide$6
            r0.<init>(r1)
            r1.sCalculateTopBottom = r0
            r1.setSlideEdge(r2)
            return
    }

    public FadeAndShortSlide(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.transition.Fade r0 = new android.transition.Fade
            r0.<init>()
            r1.mFade = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mDistance = r0
            androidx.leanback.transition.FadeAndShortSlide$6 r0 = new androidx.leanback.transition.FadeAndShortSlide$6
            r0.<init>(r1)
            r1.sCalculateTopBottom = r0
            int[] r0 = androidx.leanback.R.styleable.lbSlide
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = androidx.leanback.R.styleable.lbSlide_lb_slideEdge
            r0 = 8388611(0x800003, float:1.1754948E-38)
            int r3 = r2.getInt(r3, r0)
            r1.setSlideEdge(r3)
            r2.recycle()
            return
    }

    private void captureValues(android.transition.TransitionValues r3) {
            r2 = this;
            android.view.View r0 = r3.view
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            java.util.Map r3 = r3.values
            java.lang.String r0 = "android:fadeAndShortSlideTransition:screenPosition"
            r3.put(r0, r1)
            return
    }

    @Override // android.transition.Transition
    public android.transition.Transition addListener(android.transition.Transition.TransitionListener r2) {
            r1 = this;
            android.transition.Visibility r0 = r1.mFade
            r0.addListener(r2)
            android.transition.Transition r2 = super.addListener(r2)
            return r2
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureEndValues(android.transition.TransitionValues r2) {
            r1 = this;
            android.transition.Visibility r0 = r1.mFade
            r0.captureEndValues(r2)
            super.captureEndValues(r2)
            r1.captureValues(r2)
            return
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureStartValues(android.transition.TransitionValues r2) {
            r1 = this;
            android.transition.Visibility r0 = r1.mFade
            r0.captureStartValues(r2)
            super.captureStartValues(r2)
            r1.captureValues(r2)
            return
    }

    @Override // android.transition.Transition
    public android.transition.Transition clone() {
            r2 = this;
            android.transition.Transition r0 = super.clone()
            androidx.leanback.transition.FadeAndShortSlide r0 = (androidx.leanback.transition.FadeAndShortSlide) r0
            android.transition.Visibility r1 = r2.mFade
            android.transition.Transition r1 = r1.clone()
            android.transition.Visibility r1 = (android.transition.Visibility) r1
            r0.mFade = r1
            return r0
    }

    @Override // android.transition.Transition
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            android.transition.Transition r0 = r1.clone()
            return r0
    }

    public float getDistance() {
            r1 = this;
            float r0 = r1.mDistance
            return r0
    }

    public final float getHorizontalDistance(android.view.ViewGroup r3) {
            r2 = this;
            float r0 = r2.mDistance
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L8
            goto Lf
        L8:
            int r3 = r3.getWidth()
            int r3 = r3 / 4
            float r0 = (float) r3
        Lf:
            return r0
    }

    public final float getVerticalDistance(android.view.ViewGroup r3) {
            r2 = this;
            float r0 = r2.mDistance
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L8
            goto Lf
        L8:
            int r3 = r3.getHeight()
            int r3 = r3 / 4
            float r0 = (float) r3
        Lf:
            return r0
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup r15, android.view.View r16, android.transition.TransitionValues r17, android.transition.TransitionValues r18) {
            r14 = this;
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r18
            r0 = 0
            if (r13 != 0) goto La
            return r0
        La:
            if (r11 != r12) goto Ld
            return r0
        Ld:
            java.util.Map r0 = r13.values
            java.lang.String r1 = "android:fadeAndShortSlideTransition:screenPosition"
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            r1 = 0
            r2 = r0[r1]
            r1 = 1
            r3 = r0[r1]
            float r6 = r16.getTranslationX()
            androidx.leanback.transition.FadeAndShortSlide$CalculateSlide r1 = r10.mSlideCalculator
            float r4 = r1.getGoneX(r14, r15, r12, r0)
            float r7 = r16.getTranslationY()
            androidx.leanback.transition.FadeAndShortSlide$CalculateSlide r1 = r10.mSlideCalculator
            float r5 = r1.getGoneY(r14, r15, r12, r0)
            android.animation.TimeInterpolator r8 = androidx.leanback.transition.FadeAndShortSlide.sDecelerate
            r0 = r16
            r1 = r18
            r9 = r14
            android.animation.Animator r0 = androidx.leanback.transition.TranslationAnimationCreator.createAnimation(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.transition.Visibility r1 = r10.mFade
            r2 = r17
            android.animation.Animator r1 = r1.onAppear(r15, r12, r2, r13)
            if (r0 != 0) goto L47
            return r1
        L47:
            if (r1 != 0) goto L4a
            return r0
        L4a:
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            android.animation.AnimatorSet$Builder r0 = r2.play(r0)
            r0.with(r1)
            return r2
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup r15, android.view.View r16, android.transition.TransitionValues r17, android.transition.TransitionValues r18) {
            r14 = this;
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r17
            r0 = 0
            if (r13 != 0) goto La
            return r0
        La:
            if (r11 != r12) goto Ld
            return r0
        Ld:
            java.util.Map r0 = r13.values
            java.lang.String r1 = "android:fadeAndShortSlideTransition:screenPosition"
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            r1 = 0
            r2 = r0[r1]
            r1 = 1
            r3 = r0[r1]
            float r4 = r16.getTranslationX()
            androidx.leanback.transition.FadeAndShortSlide$CalculateSlide r1 = r10.mSlideCalculator
            float r6 = r1.getGoneX(r14, r15, r12, r0)
            float r5 = r16.getTranslationY()
            androidx.leanback.transition.FadeAndShortSlide$CalculateSlide r1 = r10.mSlideCalculator
            float r7 = r1.getGoneY(r14, r15, r12, r0)
            android.animation.TimeInterpolator r8 = androidx.leanback.transition.FadeAndShortSlide.sDecelerate
            r0 = r16
            r1 = r17
            r9 = r14
            android.animation.Animator r0 = androidx.leanback.transition.TranslationAnimationCreator.createAnimation(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.transition.Visibility r1 = r10.mFade
            r2 = r18
            android.animation.Animator r1 = r1.onDisappear(r15, r12, r13, r2)
            if (r0 != 0) goto L47
            return r1
        L47:
            if (r1 != 0) goto L4a
            return r0
        L4a:
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            android.animation.AnimatorSet$Builder r0 = r2.play(r0)
            r0.with(r1)
            return r2
    }

    @Override // android.transition.Transition
    public android.transition.Transition removeListener(android.transition.Transition.TransitionListener r2) {
            r1 = this;
            android.transition.Visibility r0 = r1.mFade
            r0.removeListener(r2)
            android.transition.Transition r2 = super.removeListener(r2)
            return r2
    }

    public void setDistance(float r1) {
            r0 = this;
            r0.mDistance = r1
            return
    }

    @Override // android.transition.Transition
    public void setEpicenterCallback(android.transition.Transition.EpicenterCallback r2) {
            r1 = this;
            android.transition.Visibility r0 = r1.mFade
            r0.setEpicenterCallback(r2)
            super.setEpicenterCallback(r2)
            return
    }

    public void setSlideEdge(int r2) {
            r1 = this;
            r0 = 48
            if (r2 == r0) goto L3c
            r0 = 80
            if (r2 == r0) goto L37
            r0 = 112(0x70, float:1.57E-43)
            if (r2 == r0) goto L32
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r0) goto L2d
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r0) goto L28
            r0 = 8388615(0x800007, float:1.1754953E-38)
            if (r2 != r0) goto L20
            androidx.leanback.transition.FadeAndShortSlide$3 r2 = androidx.leanback.transition.FadeAndShortSlide.sCalculateStartEnd
            r1.mSlideCalculator = r2
            goto L40
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid slide direction"
            r2.<init>(r0)
            throw r2
        L28:
            androidx.leanback.transition.FadeAndShortSlide$2 r2 = androidx.leanback.transition.FadeAndShortSlide.sCalculateEnd
            r1.mSlideCalculator = r2
            goto L40
        L2d:
            androidx.leanback.transition.FadeAndShortSlide$1 r2 = androidx.leanback.transition.FadeAndShortSlide.sCalculateStart
            r1.mSlideCalculator = r2
            goto L40
        L32:
            androidx.leanback.transition.FadeAndShortSlide$6 r2 = r1.sCalculateTopBottom
            r1.mSlideCalculator = r2
            goto L40
        L37:
            androidx.leanback.transition.FadeAndShortSlide$4 r2 = androidx.leanback.transition.FadeAndShortSlide.sCalculateBottom
            r1.mSlideCalculator = r2
            goto L40
        L3c:
            androidx.leanback.transition.FadeAndShortSlide$5 r2 = androidx.leanback.transition.FadeAndShortSlide.sCalculateTop
            r1.mSlideCalculator = r2
        L40:
            return
    }
}
