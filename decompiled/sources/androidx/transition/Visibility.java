package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends androidx.transition.Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final java.lang.String PROPNAME_PARENT = "android:visibility:parent";
    private static final java.lang.String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private static final java.lang.String[] sTransitionProperties = null;
    private int mMode;


    public static class DisappearListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat {
        public boolean mCanceled;
        private final int mFinalVisibility;
        private boolean mLayoutSuppressed;
        private final android.view.ViewGroup mParent;
        private final boolean mSuppressLayout;
        private final android.view.View mView;

        public DisappearListener(android.view.View r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mCanceled = r0
                r1.mView = r2
                r1.mFinalVisibility = r3
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.mParent = r2
                r2 = 1
                r1.mSuppressLayout = r2
                r1.suppressLayout(r2)
                return
        }

        private void hideViewWhenNotCanceled() {
                r2 = this;
                boolean r0 = r2.mCanceled
                if (r0 != 0) goto L12
                android.view.View r0 = r2.mView
                int r1 = r2.mFinalVisibility
                androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
                android.view.ViewGroup r0 = r2.mParent
                if (r0 == 0) goto L12
                r0.invalidate()
            L12:
                r0 = 0
                r2.suppressLayout(r0)
                return
        }

        private void suppressLayout(boolean r2) {
                r1 = this;
                boolean r0 = r1.mSuppressLayout
                if (r0 == 0) goto L11
                boolean r0 = r1.mLayoutSuppressed
                if (r0 == r2) goto L11
                android.view.ViewGroup r0 = r1.mParent
                if (r0 == 0) goto L11
                r1.mLayoutSuppressed = r2
                androidx.transition.ViewGroupUtils.suppressLayout(r0, r2)
            L11:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.hideViewWhenNotCanceled()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mCanceled
                if (r2 != 0) goto Lb
                android.view.View r2 = r1.mView
                int r0 = r1.mFinalVisibility
                androidx.transition.ViewUtils.setTransitionVisibility(r2, r0)
            Lb:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mCanceled
                if (r2 != 0) goto La
                android.view.View r2 = r1.mView
                r0 = 0
                androidx.transition.ViewUtils.setTransitionVisibility(r2, r0)
            La:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                r0.hideViewWhenNotCanceled()
                r1.removeListener(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                r1 = 0
                r0.suppressLayout(r1)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                r1 = 1
                r0.suppressLayout(r1)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@androidx.annotation.NonNull androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @android.annotation.SuppressLint({"UniqueConstants"})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Mode {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class VisibilityInfo {
        public android.view.ViewGroup mEndParent;
        public int mEndVisibility;
        public boolean mFadeIn;
        public android.view.ViewGroup mStartParent;
        public int mStartVisibility;
        public boolean mVisibilityChange;

        public VisibilityInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.transition.Visibility.sTransitionProperties = r0
            return
    }

    public Visibility() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.mMode = r0
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public Visibility(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 3
            r2.mMode = r0
            int[] r0 = androidx.transition.Styleable.VISIBILITY_TRANSITION
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r0 = "transitionVisibilityMode"
            r1 = 0
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r3, r4, r0, r1, r1)
            r3.recycle()
            if (r4 == 0) goto L1e
            r2.setMode(r4)
        L1e:
            return
    }

    private void captureValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r4.view
            int r0 = r0.getVisibility()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.values
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "android:visibility:visibility"
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            android.view.View r1 = r4.view
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "android:visibility:parent"
            r0.put(r2, r1)
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r1 = r4.view
            r1.getLocationOnScreen(r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.values
            java.lang.String r1 = "android:visibility:screenLocation"
            r4.put(r1, r0)
            return
    }

    private androidx.transition.Visibility.VisibilityInfo getVisibilityChangeInfo(androidx.transition.TransitionValues r8, androidx.transition.TransitionValues r9) {
            r7 = this;
            androidx.transition.Visibility$VisibilityInfo r0 = new androidx.transition.Visibility$VisibilityInfo
            r0.<init>()
            r1 = 0
            r0.mVisibilityChange = r1
            r0.mFadeIn = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.values
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.values
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.mStartVisibility = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.values
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.mStartParent = r6
            goto L37
        L33:
            r0.mStartVisibility = r4
            r0.mStartParent = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.values
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.values
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.mEndVisibility = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.values
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.mEndParent = r2
            goto L5e
        L5a:
            r0.mEndVisibility = r4
            r0.mEndParent = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.mStartVisibility
            int r9 = r0.mEndVisibility
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.mStartParent
            android.view.ViewGroup r4 = r0.mEndParent
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L80
            if (r8 != 0) goto L79
            r0.mFadeIn = r1
            r0.mVisibilityChange = r2
            goto La7
        L79:
            if (r9 != 0) goto La7
            r0.mFadeIn = r2
            r0.mVisibilityChange = r2
            goto La7
        L80:
            android.view.ViewGroup r8 = r0.mEndParent
            if (r8 != 0) goto L89
            r0.mFadeIn = r1
            r0.mVisibilityChange = r2
            goto La7
        L89:
            android.view.ViewGroup r8 = r0.mStartParent
            if (r8 != 0) goto La7
            r0.mFadeIn = r2
            r0.mVisibilityChange = r2
            goto La7
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.mEndVisibility
            if (r8 != 0) goto L9d
            r0.mFadeIn = r2
            r0.mVisibilityChange = r2
            goto La7
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.mStartVisibility
            if (r8 != 0) goto La7
            r0.mFadeIn = r1
            r0.mVisibilityChange = r2
        La7:
            return r0
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
    public android.animation.Animator createAnimator(@androidx.annotation.NonNull android.view.ViewGroup r9, @androidx.annotation.Nullable androidx.transition.TransitionValues r10, @androidx.annotation.Nullable androidx.transition.TransitionValues r11) {
            r8 = this;
            androidx.transition.Visibility$VisibilityInfo r0 = r8.getVisibilityChangeInfo(r10, r11)
            boolean r1 = r0.mVisibilityChange
            if (r1 == 0) goto L2e
            android.view.ViewGroup r1 = r0.mStartParent
            if (r1 != 0) goto L10
            android.view.ViewGroup r1 = r0.mEndParent
            if (r1 == 0) goto L2e
        L10:
            boolean r1 = r0.mFadeIn
            if (r1 == 0) goto L21
            int r5 = r0.mStartVisibility
            int r7 = r0.mEndVisibility
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            android.animation.Animator r9 = r2.onAppear(r3, r4, r5, r6, r7)
            return r9
        L21:
            int r3 = r0.mStartVisibility
            int r5 = r0.mEndVisibility
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            android.animation.Animator r9 = r0.onDisappear(r1, r2, r3, r4, r5)
            return r9
        L2e:
            r9 = 0
            return r9
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mMode
            return r0
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.Visibility.sTransitionProperties
            return r0
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(androidx.transition.TransitionValues r5, androidx.transition.TransitionValues r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L6
            if (r6 != 0) goto L6
            return r0
        L6:
            if (r5 == 0) goto L1b
            if (r6 == 0) goto L1b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.values
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.values
            boolean r2 = r3.containsKey(r2)
            if (r1 == r2) goto L1b
            return r0
        L1b:
            androidx.transition.Visibility$VisibilityInfo r5 = r4.getVisibilityChangeInfo(r5, r6)
            boolean r6 = r5.mVisibilityChange
            if (r6 == 0) goto L2c
            int r6 = r5.mStartVisibility
            if (r6 == 0) goto L2b
            int r5 = r5.mEndVisibility
            if (r5 != 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }

    public boolean isVisible(androidx.transition.TransitionValues r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.values
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.values
            java.lang.String r2 = "android:visibility:parent"
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            if (r1 != 0) goto L21
            if (r4 == 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    public android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.animation.Animator onAppear(android.view.ViewGroup r3, androidx.transition.TransitionValues r4, int r5, androidx.transition.TransitionValues r6, int r7) {
            r2 = this;
            int r5 = r2.mMode
            r7 = 1
            r5 = r5 & r7
            r0 = 0
            if (r5 != r7) goto L2d
            if (r6 != 0) goto La
            goto L2d
        La:
            if (r4 != 0) goto L26
            android.view.View r5 = r6.view
            android.view.ViewParent r5 = r5.getParent()
            android.view.View r5 = (android.view.View) r5
            r7 = 0
            androidx.transition.TransitionValues r1 = r2.getMatchedTransitionValues(r5, r7)
            androidx.transition.TransitionValues r5 = r2.getTransitionValues(r5, r7)
            androidx.transition.Visibility$VisibilityInfo r5 = r2.getVisibilityChangeInfo(r1, r5)
            boolean r5 = r5.mVisibilityChange
            if (r5 == 0) goto L26
            return r0
        L26:
            android.view.View r5 = r6.view
            android.animation.Animator r3 = r2.onAppear(r3, r5, r4, r6)
            return r3
        L2d:
            return r0
    }

    public android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.animation.Animator onDisappear(android.view.ViewGroup r18, androidx.transition.TransitionValues r19, int r20, androidx.transition.TransitionValues r21, int r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.mMode
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L12
            return r7
        L12:
            if (r2 != 0) goto L15
            return r7
        L15:
            android.view.View r5 = r2.view
            if (r3 == 0) goto L1c
            android.view.View r8 = r3.view
            goto L1d
        L1c:
            r8 = r7
        L1d:
            int r9 = androidx.transition.R.id.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L2d
            r8 = r7
            r13 = 1
            goto L95
        L2d:
            if (r8 == 0) goto L40
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L36
            goto L40
        L36:
            r10 = 4
            if (r4 != r10) goto L3a
            goto L3c
        L3a:
            if (r5 != r8) goto L45
        L3c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L48
        L40:
            if (r8 == 0) goto L45
            r10 = r7
            r13 = 0
            goto L48
        L45:
            r8 = r7
            r10 = r8
            r13 = 1
        L48:
            if (r13 == 0) goto L8f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L51
            goto L8b
        L51:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L8f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            androidx.transition.TransitionValues r14 = r0.getTransitionValues(r13, r11)
            androidx.transition.TransitionValues r15 = r0.getMatchedTransitionValues(r13, r11)
            androidx.transition.Visibility$VisibilityInfo r14 = r0.getVisibilityChangeInfo(r14, r15)
            boolean r14 = r14.mVisibilityChange
            if (r14 != 0) goto L74
            android.view.View r8 = androidx.transition.TransitionUtils.copyViewImage(r1, r5, r13)
            goto L8f
        L74:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L8f
            r13 = -1
            if (r14 == r13) goto L8f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L8f
            boolean r13 = r0.mCanRemoveViews
            if (r13 == 0) goto L8f
        L8b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L95
        L8f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L95:
            if (r10 == 0) goto Le7
            if (r13 != 0) goto Lca
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.values
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r12]
            r4 = r4[r11]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r12]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r11]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            androidx.transition.ViewGroupOverlayApi18 r4 = new androidx.transition.ViewGroupOverlayApi18
            r4.<init>(r1)
            r4.add(r10)
        Lca:
            android.animation.Animator r2 = r0.onDisappear(r1, r10, r2, r3)
            if (r13 != 0) goto Le6
            if (r2 != 0) goto Ldb
            androidx.transition.ViewGroupOverlayApi18 r3 = new androidx.transition.ViewGroupOverlayApi18
            r3.<init>(r1)
            r3.remove(r10)
            goto Le6
        Ldb:
            r5.setTag(r9, r10)
            androidx.transition.Visibility$1 r3 = new androidx.transition.Visibility$1
            r3.<init>(r0, r1, r10, r5)
            r0.addListener(r3)
        Le6:
            return r2
        Le7:
            if (r8 == 0) goto L109
            int r5 = r8.getVisibility()
            androidx.transition.ViewUtils.setTransitionVisibility(r8, r12)
            android.animation.Animator r1 = r0.onDisappear(r1, r8, r2, r3)
            if (r1 == 0) goto L105
            androidx.transition.Visibility$DisappearListener r2 = new androidx.transition.Visibility$DisappearListener
            r2.<init>(r8, r4)
            r1.addListener(r2)
            r1.addPauseListener(r2)
            r0.addListener(r2)
            goto L108
        L105:
            androidx.transition.ViewUtils.setTransitionVisibility(r8, r5)
        L108:
            return r1
        L109:
            return r7
    }

    public void setMode(int r2) {
            r1 = this;
            r0 = r2 & (-4)
            if (r0 != 0) goto L7
            r1.mMode = r2
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only MODE_IN and MODE_OUT flags are allowed"
            r2.<init>(r0)
            throw r2
    }
}
