package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
class TranslationAnimationCreator {

    public static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements android.transition.Transition.TransitionListener {
        private final android.view.View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final int mStartX;
        private final int mStartY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final android.view.View mViewInHierarchy;

        public TransitionPositionListener(android.view.View r2, android.view.View r3, int r4, int r5, float r6, float r7) {
                r1 = this;
                r1.<init>()
                r1.mMovingView = r2
                r1.mViewInHierarchy = r3
                float r0 = r2.getTranslationX()
                int r0 = java.lang.Math.round(r0)
                int r4 = r4 - r0
                r1.mStartX = r4
                float r2 = r2.getTranslationY()
                int r2 = java.lang.Math.round(r2)
                int r5 = r5 - r2
                r1.mStartY = r5
                r1.mTerminalX = r6
                r1.mTerminalY = r7
                int r2 = androidx.leanback.R.id.transitionPosition
                java.lang.Object r4 = r3.getTag(r2)
                int[] r4 = (int[]) r4
                r1.mTransitionPosition = r4
                if (r4 == 0) goto L31
                r4 = 0
                r3.setTag(r2, r4)
            L31:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r4) {
                r3 = this;
                int[] r4 = r3.mTransitionPosition
                if (r4 != 0) goto L9
                r4 = 2
                int[] r4 = new int[r4]
                r3.mTransitionPosition = r4
            L9:
                int[] r4 = r3.mTransitionPosition
                r0 = 0
                int r1 = r3.mStartX
                float r1 = (float) r1
                android.view.View r2 = r3.mMovingView
                float r2 = r2.getTranslationX()
                float r2 = r2 + r1
                int r1 = java.lang.Math.round(r2)
                r4[r0] = r1
                int[] r4 = r3.mTransitionPosition
                r0 = 1
                int r1 = r3.mStartY
                float r1 = (float) r1
                android.view.View r2 = r3.mMovingView
                float r2 = r2.getTranslationY()
                float r2 = r2 + r1
                int r1 = java.lang.Math.round(r2)
                r4[r0] = r1
                android.view.View r4 = r3.mViewInHierarchy
                int r0 = androidx.leanback.R.id.transitionPosition
                int[] r1 = r3.mTransitionPosition
                r4.setTag(r0, r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationX()
                r1.mPausedX = r2
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationY()
                r1.mPausedY = r2
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedY
                r2.setTranslationY(r0)
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    private TranslationAnimationCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.animation.Animator createAnimation(android.view.View r6, android.transition.TransitionValues r7, int r8, int r9, float r10, float r11, float r12, float r13, android.animation.TimeInterpolator r14, android.transition.Transition r15) {
            float r0 = r6.getTranslationX()
            float r1 = r6.getTranslationY()
            android.view.View r2 = r7.view
            int r3 = androidx.leanback.R.id.transitionPosition
            java.lang.Object r2 = r2.getTag(r3)
            int[] r2 = (int[]) r2
            if (r2 == 0) goto L20
            r10 = 0
            r10 = r2[r10]
            int r10 = r10 - r8
            float r10 = (float) r10
            float r10 = r10 + r0
            r11 = 1
            r11 = r2[r11]
            int r11 = r11 - r9
            float r11 = (float) r11
            float r11 = r11 + r1
        L20:
            float r2 = r10 - r0
            int r2 = java.lang.Math.round(r2)
            int r2 = r2 + r8
            float r8 = r11 - r1
            int r8 = java.lang.Math.round(r8)
            int r3 = r8 + r9
            r6.setTranslationX(r10)
            r6.setTranslationY(r11)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 != 0) goto L3f
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 != 0) goto L3f
            r6 = 0
            return r6
        L3f:
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            r8.moveTo(r10, r11)
            r8.lineTo(r12, r13)
            android.util.Property r9 = android.view.View.TRANSLATION_X
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r6, r9, r10, r8)
            androidx.leanback.transition.TranslationAnimationCreator$TransitionPositionListener r5 = new androidx.leanback.transition.TranslationAnimationCreator$TransitionPositionListener
            android.view.View r9 = r7.view
            r7 = r5
            r8 = r6
            r10 = r2
            r11 = r3
            r12 = r0
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15.addListener(r5)
            r4.addListener(r5)
            r4.addPauseListener(r5)
            r4.setInterpolator(r14)
            return r4
    }
}
