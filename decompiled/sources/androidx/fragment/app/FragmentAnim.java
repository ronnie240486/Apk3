package androidx.fragment.app;

/* JADX INFO: loaded from: classes3.dex */
class FragmentAnim {




    public static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        public AnimationOrAnimator(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.animation = r0
                r1.animator = r2
                return
        }

        public AnimationOrAnimator(android.view.animation.Animation r1) {
                r0 = this;
                r0.<init>()
                r0.animation = r1
                r1 = 0
                r0.animator = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        public EndViewTransitionAnimation(@androidx.annotation.NonNull android.view.animation.Animation r2, @androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.mAnimating = r0
                r1.mParent = r3
                r1.mChild = r4
                r1.addAnimation(r2)
                r3.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, @androidx.annotation.NonNull android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, @androidx.annotation.NonNull android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mEnded
                if (r0 != 0) goto L11
                boolean r0 = r2.mAnimating
                if (r0 == 0) goto L11
                r0 = 0
                r2.mAnimating = r0
                android.view.ViewGroup r0 = r2.mParent
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.mParent
                android.view.View r1 = r2.mChild
                r0.endViewTransition(r1)
                r0 = 1
                r2.mTransitionEnded = r0
            L1b:
                return
        }
    }

    private FragmentAnim() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getNextAnim(androidx.fragment.app.Fragment r0, boolean r1, boolean r2) {
            if (r2 == 0) goto Le
            if (r1 == 0) goto L9
            int r0 = r0.getPopEnterAnim()
            return r0
        L9:
            int r0 = r0.getPopExitAnim()
            return r0
        Le:
            if (r1 == 0) goto L15
            int r0 = r0.getEnterAnim()
            return r0
        L15:
            int r0 = r0.getExitAnim()
            return r0
    }

    public static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull androidx.fragment.app.Fragment r6, boolean r7, boolean r8) {
            androidx.fragment.app.Fragment$AnimationInfo r0 = r6.mAnimationInfo
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto L9
        L7:
            int r0 = r0.mNextTransition
        L9:
            int r8 = getNextAnim(r6, r7, r8)
            r6.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r2 = r6.mContainer
            r3 = 0
            if (r2 == 0) goto L22
            int r4 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r6.mContainer
            r2.setTag(r4, r3)
        L22:
            android.view.ViewGroup r2 = r6.mContainer
            if (r2 == 0) goto L2d
            android.animation.LayoutTransition r2 = r2.getLayoutTransition()
            if (r2 == 0) goto L2d
            return r3
        L2d:
            android.view.animation.Animation r2 = r6.onCreateAnimation(r0, r7, r8)
            if (r2 == 0) goto L39
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r2)
            return r5
        L39:
            android.animation.Animator r6 = r6.onCreateAnimator(r0, r7, r8)
            if (r6 == 0) goto L45
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r6)
            return r5
        L45:
            if (r8 != 0) goto L4d
            if (r0 == 0) goto L4d
            int r8 = transitToAnimResourceId(r0, r7)
        L4d:
            if (r8 == 0) goto L8f
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L71
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch: java.lang.RuntimeException -> L6d android.content.res.Resources.NotFoundException -> L6f
            if (r7 == 0) goto L6b
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L6d android.content.res.Resources.NotFoundException -> L6f
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L6d android.content.res.Resources.NotFoundException -> L6f
            return r0
        L6b:
            r1 = 1
            goto L71
        L6d:
            goto L71
        L6f:
            r5 = move-exception
            throw r5
        L71:
            if (r1 != 0) goto L8f
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch: java.lang.RuntimeException -> L7f
            if (r7 == 0) goto L8f
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L7f
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L7f
            return r0
        L7f:
            r7 = move-exception
            if (r6 != 0) goto L8e
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L8f
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r6 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r6.<init>(r5)
            return r6
        L8e:
            throw r7
        L8f:
            return r3
    }

    @androidx.annotation.AnimRes
    private static int transitToAnimResourceId(int r1, boolean r2) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r1 == r0) goto L1e
            r0 = 4099(0x1003, float:5.744E-42)
            if (r1 == r0) goto L16
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r0) goto Le
            r1 = -1
            goto L25
        Le:
            if (r2 == 0) goto L13
            int r1 = androidx.fragment.R.animator.fragment_close_enter
            goto L25
        L13:
            int r1 = androidx.fragment.R.animator.fragment_close_exit
            goto L25
        L16:
            if (r2 == 0) goto L1b
            int r1 = androidx.fragment.R.animator.fragment_fade_enter
            goto L25
        L1b:
            int r1 = androidx.fragment.R.animator.fragment_fade_exit
            goto L25
        L1e:
            if (r2 == 0) goto L23
            int r1 = androidx.fragment.R.animator.fragment_open_enter
            goto L25
        L23:
            int r1 = androidx.fragment.R.animator.fragment_open_exit
        L25:
            return r1
    }
}
