package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {


    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }









    public static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {

        @androidx.annotation.Nullable
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        public AnimationInfo(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r1, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mLoadedAnim = r1
                r0.mIsPop = r3
                return
        }

        @androidx.annotation.Nullable
        public final androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(@androidx.annotation.NonNull android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.mLoadedAnim
                if (r0 == 0) goto L7
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = r4.mAnimation
                return r5
            L7:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L1e
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                boolean r2 = r4.mIsPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.mAnimation = r5
                r4.mLoadedAnim = r3
                return r5
        }
    }

    public static class SpecialEffectsInfo {

        @androidx.annotation.NonNull
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;

        @androidx.annotation.NonNull
        private final androidx.core.os.CancellationSignal mSignal;

        public SpecialEffectsInfo(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r1, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r2) {
                r0 = this;
                r0.<init>()
                r0.mOperation = r1
                r0.mSignal = r2
                return
        }

        public final void completeSpecialEffect() {
                r2 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.mOperation
                androidx.core.os.CancellationSignal r1 = r2.mSignal
                r0.completeSpecialEffect(r1)
                return
        }

        @androidx.annotation.NonNull
        public final androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.mOperation
                return r0
        }

        @androidx.annotation.NonNull
        public final androidx.core.os.CancellationSignal getSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.mSignal
                return r0
        }

        public final boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.mOperation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.mOperation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L1b
                if (r1 == r2) goto L1b
                goto L1d
            L1b:
                r0 = 0
                goto L1e
            L1d:
                r0 = 1
            L1e:
                return r0
        }
    }

    public static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;

        @androidx.annotation.Nullable
        private final java.lang.Object mSharedElementTransition;

        @androidx.annotation.Nullable
        private final java.lang.Object mTransition;

        public TransitionInfo(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r2, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r3, boolean r4, boolean r5) {
                r1 = this;
                r1.<init>(r2, r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r3 != r0) goto L36
                if (r4 == 0) goto L16
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReenterTransition()
                goto L1e
            L16:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getEnterTransition()
            L1e:
                r1.mTransition = r3
                if (r4 == 0) goto L2b
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowReturnTransitionOverlap()
                goto L33
            L2b:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowEnterTransitionOverlap()
            L33:
                r1.mOverlapAllowed = r3
                goto L4e
            L36:
                if (r4 == 0) goto L41
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReturnTransition()
                goto L49
            L41:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getExitTransition()
            L49:
                r1.mTransition = r3
                r3 = 1
                r1.mOverlapAllowed = r3
            L4e:
                if (r5 == 0) goto L68
                if (r4 == 0) goto L5d
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementReturnTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L5d:
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementEnterTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L68:
                r2 = 0
                r1.mSharedElementTransition = r2
            L6b:
                return
        }

        @androidx.annotation.Nullable
        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto Lf
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto Lf
                return r0
            Lf:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L1a
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " for fragment "
                r1.append(r4)
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r3.getOperation()
                androidx.fragment.app.Fragment r4 = r4.getFragment()
                r1.append(r4)
                java.lang.String r4 = " is not a valid framework Transition or AndroidX Transition"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @androidx.annotation.Nullable
        public final androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r3 = this;
                java.lang.Object r0 = r3.mTransition
                androidx.fragment.app.FragmentTransitionImpl r0 = r3.getHandlingImpl(r0)
                java.lang.Object r1 = r3.mSharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r3.getHandlingImpl(r1)
                if (r0 == 0) goto L42
                if (r1 == 0) goto L42
                if (r0 != r1) goto L13
                goto L42
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                r1.append(r2)
                java.lang.String r2 = " returned Transition "
                r1.append(r2)
                java.lang.Object r2 = r3.mTransition
                r1.append(r2)
                java.lang.String r2 = " which uses a different Transition  type than its shared element transition "
                r1.append(r2)
                java.lang.Object r2 = r3.mSharedElementTransition
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L42:
                if (r0 == 0) goto L45
                goto L46
            L45:
                r0 = r1
            L46:
                return r0
        }

        @androidx.annotation.Nullable
        public java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                return r0
        }

        @androidx.annotation.Nullable
        public final java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mTransition
                return r0
        }

        public boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public final boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.mOverlapAllowed
                return r0
        }
    }

    public DefaultSpecialEffectsController(@androidx.annotation.NonNull android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void startAnimations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r17, @androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r18, boolean r19, @androidx.annotation.NonNull java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> r20) {
            r16 = this;
            android.view.ViewGroup r6 = r16.getContainer()
            android.content.Context r7 = r6.getContext()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r17.iterator()
            r0 = 0
        L12:
            boolean r1 = r9.hasNext()
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r9.next()
            r12 = r1
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r12 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r12
            boolean r1 = r12.isVisibilityUnchanged()
            if (r1 == 0) goto L2c
            r12.completeSpecialEffect()
            goto L3d
        L2c:
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r1 = r12.getAnimation(r7)
            if (r1 != 0) goto L36
            r12.completeSpecialEffect()
            goto L3d
        L36:
            android.animation.Animator r13 = r1.animator
            if (r13 != 0) goto L40
            r8.add(r12)
        L3d:
            r14 = r20
            goto L12
        L40:
            androidx.fragment.app.SpecialEffectsController$Operation r4 = r12.getOperation()
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r14 = r20
            java.lang.Object r15 = r14.get(r4)
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L79
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Ignoring Animator set on "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " as this Fragment was involved in a Transition."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.v(r2, r1)
        L75:
            r12.completeSpecialEffect()
            goto L12
        L79:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r4.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r0 != r2) goto L83
            r3 = 1
            goto L84
        L83:
            r3 = 0
        L84:
            r15 = r18
            if (r3 == 0) goto L8b
            r15.remove(r4)
        L8b:
            android.view.View r5 = r1.mView
            r6.startViewTransition(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$2 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$2
            r0 = r2
            r1 = r6
            r10 = r2
            r2 = r5
            r11 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r13.addListener(r10)
            r13.setTarget(r11)
            r13.start()
            androidx.core.os.CancellationSignal r0 = r12.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$3 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$3
            r1.<init>(r13)
            r0.setOnCancelListener(r1)
            r0 = 1
            goto L12
        Lb3:
            java.util.Iterator r1 = r8.iterator()
        Lb7:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L157
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r4.getOperation()
            androidx.fragment.app.Fragment r8 = r5.getFragment()
            java.lang.String r9 = "Ignoring Animation set on "
            if (r19 == 0) goto Lf0
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r5 == 0) goto Lec
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = " as Animations cannot run alongside Transitions."
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        Lec:
            r4.completeSpecialEffect()
            goto Lb7
        Lf0:
            if (r0 == 0) goto L113
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r5 == 0) goto L10f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = " as Animations cannot run alongside Animators."
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L10f:
            r4.completeSpecialEffect()
            goto Lb7
        L113:
            android.view.View r8 = r8.mView
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r9 = r4.getAnimation(r7)
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r9)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r9 = (androidx.fragment.app.FragmentAnim.AnimationOrAnimator) r9
            android.view.animation.Animation r9 = r9.animation
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r9)
            android.view.animation.Animation r9 = (android.view.animation.Animation) r9
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r5 == r10) goto L136
            r8.startAnimation(r9)
            r4.completeSpecialEffect()
            goto L149
        L136:
            r6.startViewTransition(r8)
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r5 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            r5.<init>(r9, r6, r8)
            androidx.fragment.app.DefaultSpecialEffectsController$4 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$4
            r9.<init>(r6, r8, r4)
            r5.setAnimationListener(r9)
            r8.startAnimation(r5)
        L149:
            androidx.core.os.CancellationSignal r5 = r4.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$5 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$5
            r9.<init>(r8, r6, r4)
            r5.setOnCancelListener(r9)
            goto Lb7
        L157:
            return
    }

    @androidx.annotation.NonNull
    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r32, @androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r33, boolean r34, @androidx.annotation.Nullable androidx.fragment.app.SpecialEffectsController.Operation r35, @androidx.annotation.Nullable androidx.fragment.app.SpecialEffectsController.Operation r36) {
            r31 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r4 = r32.iterator()
            r5 = 0
        L10:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
            boolean r7 = r6.isVisibilityUnchanged()
            if (r7 == 0) goto L23
            goto L10
        L23:
            androidx.fragment.app.FragmentTransitionImpl r7 = r6.getHandlingImpl()
            if (r5 != 0) goto L2b
            r5 = r7
            goto L10
        L2b:
            if (r7 == 0) goto L10
            if (r5 != r7) goto L30
            goto L10
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r6.getOperation()
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r1.append(r2)
            java.lang.String r2 = " returned Transition "
            r1.append(r2)
            java.lang.Object r2 = r6.getTransition()
            r1.append(r2)
            java.lang.String r2 = " which uses a different Transition  type than other Fragments."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            if (r5 != 0) goto L7c
            java.util.Iterator r0 = r32.iterator()
        L62:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.getOperation()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r2, r4)
            r1.completeSpecialEffect()
            goto L62
        L7b:
            return r3
        L7c:
            android.view.View r4 = new android.view.View
            android.view.ViewGroup r6 = r31.getContainer()
            android.content.Context r6 = r6.getContext()
            r4.<init>(r6)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
            java.util.Iterator r16 = r32.iterator()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r1
            r8 = r2
            r11 = r6
            r10 = r7
            r17 = 0
            r7 = r31
        Lac:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L310
            java.lang.Object r6 = r16.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
            boolean r18 = r6.hasSharedElementTransition()
            if (r18 == 0) goto L2fe
            if (r9 == 0) goto L2fe
            if (r8 == 0) goto L2fe
            java.lang.Object r6 = r6.getSharedElementTransition()
            java.lang.Object r6 = r5.cloneTransition(r6)
            java.lang.Object r11 = r5.wrapTransitionInSet(r6)
            androidx.fragment.app.Fragment r6 = r36.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r6 = r6.mAnimationInfo
            if (r6 == 0) goto Lda
            java.util.ArrayList<java.lang.String> r6 = r6.mSharedElementSourceNames
            if (r6 != 0) goto Ldf
        Lda:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        Ldf:
            androidx.fragment.app.Fragment r8 = r35.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r8 = r8.mAnimationInfo
            if (r8 == 0) goto Leb
            java.util.ArrayList<java.lang.String> r8 = r8.mSharedElementSourceNames
            if (r8 != 0) goto Lf0
        Leb:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        Lf0:
            androidx.fragment.app.Fragment r9 = r35.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r9 = r9.mAnimationInfo
            if (r9 == 0) goto Lfc
            java.util.ArrayList<java.lang.String> r9 = r9.mSharedElementTargetNames
            if (r9 != 0) goto L101
        Lfc:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L101:
            r18 = 0
            r18 = r3
            r19 = r10
            r10 = 0
        L108:
            int r3 = r9.size()
            if (r10 >= r3) goto L127
            java.lang.Object r3 = r9.get(r10)
            int r3 = r6.indexOf(r3)
            r20 = r9
            r9 = -1
            if (r3 == r9) goto L122
            java.lang.Object r9 = r8.get(r10)
            r6.set(r3, r9)
        L122:
            int r10 = r10 + 1
            r9 = r20
            goto L108
        L127:
            androidx.fragment.app.Fragment r3 = r36.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r3 = r3.mAnimationInfo
            if (r3 == 0) goto L133
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementTargetNames
            if (r3 != 0) goto L138
        L133:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L138:
            if (r0 != 0) goto L14b
            androidx.fragment.app.Fragment r8 = r35.getFragment()
            androidx.core.app.SharedElementCallback r8 = r8.getExitTransitionCallback()
            androidx.fragment.app.Fragment r9 = r36.getFragment()
            androidx.core.app.SharedElementCallback r9 = r9.getEnterTransitionCallback()
            goto L15b
        L14b:
            androidx.fragment.app.Fragment r8 = r35.getFragment()
            androidx.core.app.SharedElementCallback r8 = r8.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r9 = r36.getFragment()
            androidx.core.app.SharedElementCallback r9 = r9.getExitTransitionCallback()
        L15b:
            int r10 = r6.size()
            r20 = 0
            r21 = r4
            r4 = 0
        L164:
            if (r4 >= r10) goto L184
            java.lang.Object r20 = r6.get(r4)
            r22 = r10
            r10 = r20
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r20 = r3.get(r4)
            r23 = r14
            r14 = r20
            java.lang.String r14 = (java.lang.String) r14
            r12.put(r10, r14)
            int r4 = r4 + 1
            r10 = r22
            r14 = r23
            goto L164
        L184:
            r23 = r14
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            androidx.fragment.app.Fragment r10 = r35.getFragment()
            android.view.View r10 = r10.mView
            r7.findNamedViews(r4, r10)
            r4.retainAll(r6)
            if (r8 == 0) goto L1d9
            r8.onMapSharedElements(r6, r4)
            int r8 = r6.size()
            int r8 = r8 + (-1)
        L1a2:
            if (r8 < 0) goto L1d6
            java.lang.Object r10 = r6.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r14 = r4.get(r10)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L1b8
            r12.remove(r10)
            r20 = r5
            goto L1d1
        L1b8:
            r20 = r5
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r14)
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L1d1
            java.lang.Object r5 = r12.remove(r10)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r10 = androidx.core.view.ViewCompat.getTransitionName(r14)
            r12.put(r10, r5)
        L1d1:
            int r8 = r8 + (-1)
            r5 = r20
            goto L1a2
        L1d6:
            r20 = r5
            goto L1e2
        L1d9:
            r20 = r5
            java.util.Set r5 = r4.keySet()
            r12.retainAll(r5)
        L1e2:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            androidx.fragment.app.Fragment r8 = r36.getFragment()
            android.view.View r8 = r8.mView
            r7.findNamedViews(r5, r8)
            r5.retainAll(r3)
            java.util.Collection r8 = r12.values()
            r5.retainAll(r8)
            if (r9 == 0) goto L239
            r9.onMapSharedElements(r3, r5)
            int r8 = r3.size()
            int r8 = r8 + (-1)
        L205:
            if (r8 < 0) goto L23c
            java.lang.Object r9 = r3.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r5.get(r9)
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L21f
            java.lang.String r9 = androidx.fragment.app.FragmentTransition.findKeyForValue(r12, r9)
            if (r9 == 0) goto L236
            r12.remove(r9)
            goto L236
        L21f:
            java.lang.String r14 = androidx.core.view.ViewCompat.getTransitionName(r10)
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L236
            java.lang.String r9 = androidx.fragment.app.FragmentTransition.findKeyForValue(r12, r9)
            if (r9 == 0) goto L236
            java.lang.String r10 = androidx.core.view.ViewCompat.getTransitionName(r10)
            r12.put(r9, r10)
        L236:
            int r8 = r8 + (-1)
            goto L205
        L239:
            androidx.fragment.app.FragmentTransition.retainValues(r12, r5)
        L23c:
            java.util.Set r8 = r12.keySet()
            r7.retainMatchingViews(r4, r8)
            java.util.Collection r8 = r12.values()
            r7.retainMatchingViews(r5, r8)
            boolean r8 = r12.isEmpty()
            if (r8 == 0) goto L269
            r15.clear()
            r13.clear()
            r3 = 0
            r9 = r1
            r8 = r2
            r11 = r3
            r5 = r12
            r10 = r19
            r4 = r20
            r3 = r21
            r14 = r23
            r21 = r13
            r13 = r18
            goto L308
        L269:
            androidx.fragment.app.Fragment r7 = r36.getFragment()
            androidx.fragment.app.Fragment r8 = r35.getFragment()
            r9 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r7, r8, r0, r4, r9)
            android.view.ViewGroup r7 = r31.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$6 r8 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r8.<init>(r2, r1, r0, r5)
            androidx.core.view.OneShotPreDrawListener.add(r7, r8)
            java.util.Collection r7 = r4.values()
            r15.addAll(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L2a4
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.get(r6)
            r10 = r4
            android.view.View r10 = (android.view.View) r10
            r4 = r20
            r4.setEpicenter(r11, r10)
            r19 = r10
            goto L2a7
        L2a4:
            r4 = r20
            r7 = 0
        L2a7:
            java.util.Collection r6 = r5.values()
            r13.addAll(r6)
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L2d3
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r5.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L2d3
            android.view.ViewGroup r5 = r31.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r6 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r14 = r23
            r6.<init>(r4, r3, r14)
            androidx.core.view.OneShotPreDrawListener.add(r5, r6)
            r17 = 1
            goto L2d5
        L2d3:
            r14 = r23
        L2d5:
            r3 = r21
            r4.setSharedElementTargets(r11, r3, r15)
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = 0
            r6 = r4
            r7 = r11
            r20 = r11
            r11 = r5
            r5 = r12
            r12 = r20
            r21 = r13
            r6.scheduleRemoveTargets(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r13 = r18
            r13.put(r1, r6)
            r13.put(r2, r6)
            r7 = r31
            r9 = r1
            r8 = r2
            r10 = r19
            r11 = r20
            goto L308
        L2fe:
            r19 = r10
            r21 = r13
            r13 = r3
            r3 = r4
            r4 = r5
            r5 = r12
            r10 = r19
        L308:
            r12 = r5
            r5 = r4
            r4 = r3
            r3 = r13
            r13 = r21
            goto Lac
        L310:
            r19 = r10
            r21 = r13
            r13 = r3
            r3 = r4
            r4 = r5
            r5 = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r32.iterator()
            r2 = 0
            r6 = 0
            r12 = r6
        L324:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L476
            java.lang.Object r6 = r1.next()
            r16 = r6
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r16 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r16
            boolean r6 = r16.isVisibilityUnchanged()
            if (r6 == 0) goto L345
            androidx.fragment.app.SpecialEffectsController$Operation r6 = r16.getOperation()
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r13.put(r6, r10)
            r16.completeSpecialEffect()
            goto L324
        L345:
            java.lang.Object r6 = r16.getTransition()
            java.lang.Object r10 = r4.cloneTransition(r6)
            androidx.fragment.app.SpecialEffectsController$Operation r6 = r16.getOperation()
            if (r11 == 0) goto L35a
            if (r6 == r9) goto L357
            if (r6 != r8) goto L35a
        L357:
            r18 = 1
            goto L35c
        L35a:
            r18 = 0
        L35c:
            if (r10 != 0) goto L37f
            if (r18 != 0) goto L368
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r13.put(r6, r10)
            r16.completeSpecialEffect()
        L368:
            r6 = r33
            r34 = r1
            r18 = r5
            r24 = r7
            r25 = r8
            r26 = r9
            r29 = r11
            r5 = r19
            r1 = r21
            r21 = r3
            r3 = r13
            goto L461
        L37f:
            r20 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r34 = r1
            androidx.fragment.app.Fragment r1 = r6.getFragment()
            android.view.View r1 = r1.mView
            r7.captureTransitioningViews(r13, r1)
            if (r18 == 0) goto L39f
            if (r6 != r9) goto L399
            r13.removeAll(r15)
            goto L39f
        L399:
            r1 = r21
            r13.removeAll(r1)
            goto L3a1
        L39f:
            r1 = r21
        L3a1:
            boolean r18 = r13.isEmpty()
            if (r18 == 0) goto L3c2
            r4.addTarget(r10, r3)
            r21 = r3
            r18 = r5
            r24 = r7
            r25 = r8
            r26 = r9
            r29 = r11
            r30 = r12
            r5 = r13
            r27 = r19
            r3 = r20
            r7 = r6
            r6 = r33
            goto L42e
        L3c2:
            r4.addTargets(r10, r13)
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r35 = r6
            r6 = r4
            r24 = r7
            r7 = r10
            r25 = r8
            r8 = r10
            r26 = r9
            r9 = r13
            r28 = r10
            r27 = r19
            r10 = r18
            r29 = r11
            r11 = r21
            r30 = r12
            r12 = r22
            r21 = r3
            r18 = r5
            r5 = r13
            r3 = r20
            r13 = r23
            r6.scheduleRemoveTargets(r7, r8, r9, r10, r11, r12, r13)
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r35.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r6 != r7) goto L428
            r6 = r33
            r7 = r35
            r6.remove(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r5)
            androidx.fragment.app.Fragment r9 = r7.getFragment()
            android.view.View r9 = r9.mView
            r8.remove(r9)
            androidx.fragment.app.Fragment r9 = r7.getFragment()
            android.view.View r9 = r9.mView
            r10 = r28
            r4.scheduleHideFragmentView(r10, r9, r8)
            android.view.ViewGroup r8 = r31.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$8 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r9.<init>(r5)
            androidx.core.view.OneShotPreDrawListener.add(r8, r9)
            goto L42e
        L428:
            r6 = r33
            r7 = r35
            r10 = r28
        L42e:
            androidx.fragment.app.SpecialEffectsController$Operation$State r8 = r7.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r9 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r8 != r9) goto L441
            r0.addAll(r5)
            if (r17 == 0) goto L43e
            r4.setEpicenter(r10, r14)
        L43e:
            r5 = r27
            goto L446
        L441:
            r5 = r27
            r4.setEpicenter(r10, r5)
        L446:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r3.put(r7, r8)
            boolean r7 = r16.isOverlapAllowed()
            if (r7 == 0) goto L45a
            r7 = 0
            r12 = r30
            java.lang.Object r7 = r4.mergeTransitionsTogether(r12, r10, r7)
            r12 = r7
            goto L461
        L45a:
            r12 = r30
            r7 = 0
            java.lang.Object r2 = r4.mergeTransitionsTogether(r2, r10, r7)
        L461:
            r13 = r3
            r19 = r5
            r5 = r18
            r3 = r21
            r7 = r24
            r8 = r25
            r9 = r26
            r11 = r29
            r21 = r1
            r1 = r34
            goto L324
        L476:
            r18 = r5
            r25 = r8
            r26 = r9
            r3 = r13
            r1 = r21
            r13 = r11
            java.lang.Object r2 = r4.mergeTransitionsInSequence(r12, r2, r13)
            java.util.Iterator r5 = r32.iterator()
        L488:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L504
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
            boolean r7 = r6.isVisibilityUnchanged()
            if (r7 == 0) goto L49b
            goto L488
        L49b:
            java.lang.Object r7 = r6.getTransition()
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r6.getOperation()
            if (r13 == 0) goto L4af
            r9 = r26
            r10 = r25
            if (r8 == r9) goto L4ad
            if (r8 != r10) goto L4b3
        L4ad:
            r11 = 1
            goto L4b4
        L4af:
            r10 = r25
            r9 = r26
        L4b3:
            r11 = 0
        L4b4:
            if (r7 != 0) goto L4b8
            if (r11 == 0) goto L4ff
        L4b8:
            android.view.ViewGroup r7 = r31.getContainer()
            boolean r7 = androidx.core.view.ViewCompat.isLaidOut(r7)
            if (r7 != 0) goto L4eb
            r7 = 2
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
            if (r7 == 0) goto L4e7
            java.lang.String r7 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            android.view.ViewGroup r11 = r31.getContainer()
            r7.append(r11)
            java.lang.String r11 = " has not been laid out. Completing operation "
            r7.append(r11)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentManager"
            android.util.Log.v(r8, r7)
        L4e7:
            r6.completeSpecialEffect()
            goto L4ff
        L4eb:
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r6.getOperation()
            androidx.fragment.app.Fragment r7 = r7.getFragment()
            androidx.core.os.CancellationSignal r8 = r6.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$9 r11 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r11.<init>(r6)
            r4.setListenerForTransitionEnd(r7, r2, r8, r11)
        L4ff:
            r26 = r9
            r25 = r10
            goto L488
        L504:
            android.view.ViewGroup r5 = r31.getContainer()
            boolean r5 = androidx.core.view.ViewCompat.isLaidOut(r5)
            if (r5 != 0) goto L50f
            return r3
        L50f:
            r5 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r0, r5)
            java.util.ArrayList r10 = r4.prepareSetNameOverridesReordered(r1)
            android.view.ViewGroup r5 = r31.getContainer()
            r4.beginDelayedTransition(r5, r2)
            android.view.ViewGroup r7 = r31.getContainer()
            r6 = r4
            r8 = r15
            r9 = r1
            r11 = r18
            r6.setNameOverridesReordered(r7, r8, r9, r10, r11)
            r2 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r0, r2)
            r4.swapSharedElementTargets(r13, r15, r1)
            return r3
    }

    public final void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L37
            r5.add(r0)
            goto L37
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L37
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2b
            r4.captureTransitioningViews(r5, r2)
        L2b:
            int r1 = r1 + 1
            goto L1c
        L2e:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L37
            r5.add(r6)
        L37:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public final void executeOperations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r11, boolean r12) {
            r10 = this;
            r0 = r11
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
            r7 = r2
            r8 = r7
        La:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.fragment.app.Fragment r4 = r2.getFragment()
            android.view.View r4 = r4.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r4)
            int[] r5 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r2.getFinalState()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L3f
            r3 = 2
            if (r5 == r3) goto L3f
            r3 = 3
            if (r5 == r3) goto L3f
            r3 = 4
            if (r5 == r3) goto L39
            goto La
        L39:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 == r3) goto La
            r8 = r2
            goto La
        L3f:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 != r3) goto La
            if (r7 != 0) goto La
            r7 = r2
            goto La
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r11)
            java.util.Iterator r11 = r0.iterator()
        L5a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r0 = (androidx.fragment.app.SpecialEffectsController.Operation) r0
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            r0.markStartedSpecialEffect(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r6.<init>(r0, r5, r12)
            r1.add(r6)
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            r0.markStartedSpecialEffect(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r9 = 0
            if (r12 == 0) goto L86
            if (r0 != r7) goto L89
            goto L88
        L86:
            if (r0 != r8) goto L89
        L88:
            r9 = 1
        L89:
            r6.<init>(r0, r5, r12, r9)
            r4.add(r6)
            androidx.fragment.app.DefaultSpecialEffectsController$1 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$1
            r5.<init>(r10, r2, r0)
            r0.addCompletionListener(r5)
            goto L5a
        L98:
            r3 = r10
            r5 = r2
            r6 = r12
            java.util.Map r11 = r3.startTransitions(r4, r5, r6, r7, r8)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.startAnimations(r1, r2, r12, r11)
            java.util.Iterator r11 = r2.iterator()
        Lac:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lc6
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r12 = (androidx.fragment.app.SpecialEffectsController.Operation) r12
            androidx.fragment.app.Fragment r0 = r12.getFragment()
            android.view.View r0 = r0.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r12.getFinalState()
            r12.applyState(r0)
            goto Lac
        Lc6:
            r2.clear()
            return
    }

    public final void findNamedViews(java.util.Map<java.lang.String, android.view.View> r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L26
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L23
            r4.findNamedViews(r5, r2)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    public final void retainMatchingViews(@androidx.annotation.NonNull androidx.collection.ArrayMap<java.lang.String, android.view.View> r2, @androidx.annotation.NonNull java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L8
            r2.remove()
            goto L8
        L28:
            return
    }
}
