package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
abstract class SpecialEffectsController {
    private final android.view.ViewGroup mContainer;
    public boolean mIsContainerPostponed;
    public boolean mOperationDirectionIsPop;
    public final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mPendingOperations;
    public final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mRunningOperations;



    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact = null;
        public static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L4d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L58
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {

        @androidx.annotation.NonNull
        private final androidx.fragment.app.FragmentStateManager mFragmentStateManager;

        public FragmentStateManagerOperation(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r2, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r4, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r5) {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r4.getFragment()
                r1.<init>(r2, r3, r0, r5)
                r1.mFragmentStateManager = r4
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
                r1 = this;
                super.complete()
                androidx.fragment.app.FragmentStateManager r0 = r1.mFragmentStateManager
                r0.moveToExpectedState()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void onStart() {
                r4 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r4.getLifecycleImpact()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                if (r0 != r1) goto L74
                androidx.fragment.app.FragmentStateManager r0 = r4.mFragmentStateManager
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r1 = r0.mView
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L3f
                r0.setFocusedView(r1)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L3f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "requestFocus: Saved focused view "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " for Fragment "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "FragmentManager"
                android.util.Log.v(r2, r1)
            L3f:
                androidx.fragment.app.Fragment r1 = r4.getFragment()
                android.view.View r1 = r1.requireView()
                android.view.ViewParent r2 = r1.getParent()
                r3 = 0
                if (r2 != 0) goto L56
                androidx.fragment.app.FragmentStateManager r2 = r4.mFragmentStateManager
                r2.addViewToContainer()
                r1.setAlpha(r3)
            L56:
                float r2 = r1.getAlpha()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L68
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L68
                r2 = 4
                r1.setVisibility(r2)
            L68:
                androidx.fragment.app.Fragment$AnimationInfo r0 = r0.mAnimationInfo
                if (r0 != 0) goto L6f
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L71
            L6f:
                float r0 = r0.mPostOnViewCreatedAlpha
            L71:
                r1.setAlpha(r0)
            L74:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Operation {

        @androidx.annotation.NonNull
        private final java.util.List<java.lang.Runnable> mCompletionListeners;

        @androidx.annotation.NonNull
        private androidx.fragment.app.SpecialEffectsController.Operation.State mFinalState;

        @androidx.annotation.NonNull
        private final androidx.fragment.app.Fragment mFragment;
        private boolean mIsCanceled;
        private boolean mIsComplete;

        @androidx.annotation.NonNull
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact mLifecycleImpact;

        @androidx.annotation.NonNull
        private final java.util.HashSet<androidx.core.os.CancellationSignal> mSpecialEffectsSignals;


        public static final enum LifecycleImpact extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact ADDING = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact NONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact REMOVING = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r3 = "ADDING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING = r1
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r5 = "REMOVING"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING = r3
                    r5 = 3
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r5 = new androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES = r5
                    return
            }

            private LifecycleImpact(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact> r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact) r1
                    return r1
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]) r0
                    return r0
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final enum State extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.State> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.State[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State GONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State INVISIBLE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State REMOVED = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State VISIBLE = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r3 = "VISIBLE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE = r1
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r5 = "GONE"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.GONE = r3
                    androidx.fragment.app.SpecialEffectsController$Operation$State r5 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r7 = "INVISIBLE"
                    r8 = 3
                    r5.<init>(r7, r8)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE = r5
                    r7 = 4
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r7 = new androidx.fragment.app.SpecialEffectsController.Operation.State[r7]
                    r7[r2] = r0
                    r7[r4] = r1
                    r7[r6] = r3
                    r7[r8] = r5
                    androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES = r7
                    return
            }

            private State(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @androidx.annotation.NonNull
            public static androidx.fragment.app.SpecialEffectsController.Operation.State from(int r2) {
                    if (r2 == 0) goto L1b
                    r0 = 4
                    if (r2 == r0) goto L18
                    r0 = 8
                    if (r2 != r0) goto Lc
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                    return r2
                Lc:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Unknown visibility "
                    java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
                    r0.<init>(r2)
                    throw r0
                L18:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r2
                L1b:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    return r2
            }

            @androidx.annotation.NonNull
            public static androidx.fragment.app.SpecialEffectsController.Operation.State from(@androidx.annotation.NonNull android.view.View r2) {
                    float r0 = r2.getAlpha()
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L12
                    int r0 = r2.getVisibility()
                    if (r0 != 0) goto L12
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r2
                L12:
                    int r2 = r2.getVisibility()
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = from(r2)
                    return r2
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$State> r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = (androidx.fragment.app.SpecialEffectsController.Operation.State) r1
                    return r1
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State[]) r0
                    return r0
            }

            public final void applyState(@androidx.annotation.NonNull android.view.View r6) {
                    r5 = this;
                    int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State
                    int r1 = r5.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    java.lang.String r2 = "FragmentManager"
                    r3 = 2
                    if (r0 == r1) goto L80
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    if (r0 == r3) goto L5e
                    r4 = 3
                    if (r0 == r4) goto L3b
                    r4 = 4
                    if (r0 == r4) goto L1a
                    goto Lad
                L1a:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L37
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L37:
                    r6.setVisibility(r4)
                    goto Lad
                L3b:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L58
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to GONE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L58:
                    r0 = 8
                    r6.setVisibility(r0)
                    goto Lad
                L5e:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L7b
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to VISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L7b:
                    r0 = 0
                    r6.setVisibility(r0)
                    goto Lad
                L80:
                    android.view.ViewParent r0 = r6.getParent()
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    if (r0 == 0) goto Lad
                    boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r1 == 0) goto Laa
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "SpecialEffectsController: Removing view "
                    r1.append(r3)
                    r1.append(r6)
                    java.lang.String r3 = " from container "
                    r1.append(r3)
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r2, r1)
                Laa:
                    r0.removeView(r6)
                Lad:
                    return
            }
        }

        public Operation(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r2, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, @androidx.annotation.NonNull androidx.fragment.app.Fragment r4, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r5) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCompletionListeners = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mSpecialEffectsSignals = r0
                r0 = 0
                r1.mIsCanceled = r0
                r1.mIsComplete = r0
                r1.mFinalState = r2
                r1.mLifecycleImpact = r3
                r1.mFragment = r4
                androidx.fragment.app.SpecialEffectsController$Operation$1 r2 = new androidx.fragment.app.SpecialEffectsController$Operation$1
                r2.<init>(r1)
                r5.setOnCancelListener(r2)
                return
        }

        public final void addCompletionListener(@androidx.annotation.NonNull java.lang.Runnable r2) {
                r1 = this;
                java.util.List<java.lang.Runnable> r0 = r1.mCompletionListeners
                r0.add(r2)
                return
        }

        public final void cancel() {
                r2 = this;
                boolean r0 = r2.mIsCanceled
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.mIsCanceled = r0
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r2.mSpecialEffectsSignals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L14
                r2.complete()
                goto L2f
            L14:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.HashSet<androidx.core.os.CancellationSignal> r1 = r2.mSpecialEffectsSignals
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L1f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r0.next()
                androidx.core.os.CancellationSignal r1 = (androidx.core.os.CancellationSignal) r1
                r1.cancel()
                goto L1f
            L2f:
                return
        }

        @androidx.annotation.CallSuper
        public void complete() {
                r2 = this;
                boolean r0 = r2.mIsComplete
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L27
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SpecialEffectsController: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " has called complete."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L27:
                r0 = 1
                r2.mIsComplete = r0
                java.util.List<java.lang.Runnable> r0 = r2.mCompletionListeners
                java.util.Iterator r0 = r0.iterator()
            L30:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L40
                java.lang.Object r1 = r0.next()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                goto L30
            L40:
                return
        }

        public final void completeSpecialEffect(@androidx.annotation.NonNull androidx.core.os.CancellationSignal r2) {
                r1 = this;
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                java.util.HashSet<androidx.core.os.CancellationSignal> r2 = r1.mSpecialEffectsSignals
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L13
                r1.complete()
            L13:
                return
        }

        @androidx.annotation.NonNull
        public androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.mFinalState
                return r0
        }

        @androidx.annotation.NonNull
        public final androidx.fragment.app.Fragment getFragment() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.mFragment
                return r0
        }

        @androidx.annotation.NonNull
        public final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r1.mLifecycleImpact
                return r0
        }

        public final boolean isCanceled() {
                r1 = this;
                boolean r0 = r1.mIsCanceled
                return r0
        }

        public final boolean isComplete() {
                r1 = this;
                boolean r0 = r1.mIsComplete
                return r0
        }

        public final void markStartedSpecialEffect(@androidx.annotation.NonNull androidx.core.os.CancellationSignal r2) {
                r1 = this;
                r1.onStart()
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                r0.add(r2)
                return
        }

        public final void mergeWith(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r6, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r7) {
                r5 = this;
                int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact
                int r7 = r7.ordinal()
                r7 = r0[r7]
                r0 = 1
                java.lang.String r1 = "SpecialEffectsController: For fragment "
                java.lang.String r2 = "FragmentManager"
                r3 = 2
                if (r7 == r0) goto L83
                java.lang.String r0 = " mFinalState = "
                if (r7 == r3) goto L4d
                r4 = 3
                if (r7 == r4) goto L19
                goto Lb6
            L19:
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r5.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r7 == r4) goto Lb6
                boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r7 == 0) goto L4a
                java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.fragment.app.Fragment r1 = r5.mFragment
                r7.append(r1)
                r7.append(r0)
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r5.mFinalState
                r7.append(r0)
                java.lang.String r0 = " -> "
                r7.append(r0)
                r7.append(r6)
                java.lang.String r0 = ". "
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                android.util.Log.v(r2, r7)
            L4a:
                r5.mFinalState = r6
                goto Lb6
            L4d:
                boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r6 == 0) goto L7a
                java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.fragment.app.Fragment r7 = r5.mFragment
                r6.append(r7)
                r6.append(r0)
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r5.mFinalState
                r6.append(r7)
                java.lang.String r7 = " -> REMOVED. mLifecycleImpact  = "
                r6.append(r7)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = r5.mLifecycleImpact
                r6.append(r7)
                java.lang.String r7 = " to REMOVING."
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r2, r6)
            L7a:
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                r5.mFinalState = r6
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r6 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                r5.mLifecycleImpact = r6
                goto Lb6
            L83:
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r5.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r6 != r7) goto Lb6
                boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r6 == 0) goto Lae
                java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.fragment.app.Fragment r7 = r5.mFragment
                r6.append(r7)
                java.lang.String r7 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                r6.append(r7)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = r5.mLifecycleImpact
                r6.append(r7)
                java.lang.String r7 = " to ADDING."
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r2, r6)
            Lae:
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r5.mFinalState = r6
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r6 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                r5.mLifecycleImpact = r6
            Lb6:
                return
        }

        public void onStart() {
                r0 = this;
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = "Operation "
                java.lang.String r1 = "{"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
                int r2 = java.lang.System.identityHashCode(r4)
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                java.lang.String r2 = "} "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mFinalState = "
                r0.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r4.mFinalState
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mLifecycleImpact = "
                r0.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r4.mLifecycleImpact
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "mFragment = "
                r0.append(r1)
                androidx.fragment.app.Fragment r1 = r4.mFragment
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public SpecialEffectsController(@androidx.annotation.NonNull android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingOperations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRunningOperations = r0
            r0 = 0
            r1.mOperationDirectionIsPop = r0
            r1.mIsContainerPostponed = r0
            r1.mContainer = r2
            return
    }

    private void enqueue(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r4, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r6) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            monitor-enter(r0)
            androidx.core.os.CancellationSignal r1 = new androidx.core.os.CancellationSignal     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.Fragment r2 = r6.getFragment()     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.findPendingOperation(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L17
            r2.mergeWith(r4, r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L17:
            androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation r2 = new androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r3.mPendingOperations     // Catch: java.lang.Throwable -> L33
            r4.add(r2)     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.SpecialEffectsController$1 r4 = new androidx.fragment.app.SpecialEffectsController$1     // Catch: java.lang.Throwable -> L33
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L33
            r2.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.SpecialEffectsController$2 r4 = new androidx.fragment.app.SpecialEffectsController$2     // Catch: java.lang.Throwable -> L33
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L33
            r2.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.SpecialEffectsController.Operation findPendingOperation(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L6
            return r1
        L23:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.SpecialEffectsController.Operation findRunningOperation(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mRunningOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L6
            return r1
        L23:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    public static androidx.fragment.app.SpecialEffectsController getOrCreateController(@androidx.annotation.NonNull android.view.ViewGroup r0, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1) {
            androidx.fragment.app.SpecialEffectsControllerFactory r1 = r1.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r0 = getOrCreateController(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.fragment.app.SpecialEffectsController getOrCreateController(@androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsControllerFactory r4) {
            int r0 = androidx.fragment.R.id.special_effects_controller_view_tag
            java.lang.Object r1 = r3.getTag(r0)
            boolean r2 = r1 instanceof androidx.fragment.app.SpecialEffectsController
            if (r2 == 0) goto Ld
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            return r1
        Ld:
            androidx.fragment.app.SpecialEffectsController r4 = r4.createController(r3)
            r3.setTag(r0, r4)
            return r4
    }

    private void updateFinalState() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r4.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r1.getLifecycleImpact()
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r2 != r3) goto L6
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r2 = r2.requireView()
            int r2 = r2.getVisibility()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r2)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r1.mergeWith(r2, r3)
            goto L6
        L30:
            return
    }

    public final void enqueueAdd(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "SpecialEffectsController: Enqueuing add operation for fragment "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            r2.enqueue(r3, r0, r4)
            return
    }

    public final void enqueueHide(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    public final void enqueueRemove(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            r2.enqueue(r0, r1, r3)
            return
    }

    public final void enqueueShow(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "SpecialEffectsController: Enqueuing show operation for fragment "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    public abstract void executeOperations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r1, boolean r2);

    public final void executePendingOperations() {
            r7 = this;
            boolean r0 = r7.mIsContainerPostponed
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            r1 = 0
            if (r0 != 0) goto L14
            r7.forceCompleteAllOperations()
            r7.mOperationDirectionIsPop = r1
            return
        L14:
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r7.mPendingOperations
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L96
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L98
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L98
            r3.clear()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L98
        L2f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L98
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> L98
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L58
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r5.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "SpecialEffectsController: Cancelling operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> L98
            r5.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L98
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L98
        L58:
            r3.cancel()     // Catch: java.lang.Throwable -> L98
            boolean r4 = r3.isComplete()     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto L2f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L98
            r4.add(r3)     // Catch: java.lang.Throwable -> L98
            goto L2f
        L67:
            r7.updateFinalState()     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L98
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L98
            r3.clear()     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L98
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L98
        L7f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L98
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4     // Catch: java.lang.Throwable -> L98
            r4.onStart()     // Catch: java.lang.Throwable -> L98
            goto L7f
        L8f:
            boolean r3 = r7.mOperationDirectionIsPop     // Catch: java.lang.Throwable -> L98
            r7.executeOperations(r2, r3)     // Catch: java.lang.Throwable -> L98
            r7.mOperationDirectionIsPop = r1     // Catch: java.lang.Throwable -> L98
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            return
        L98:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            throw r1
    }

    public final void forceCompleteAllOperations() {
            r9 = this;
            android.view.ViewGroup r0 = r9.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r9.mPendingOperations
            monitor-enter(r1)
            r9.updateFinalState()     // Catch: java.lang.Throwable -> Ldd
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r9.mPendingOperations     // Catch: java.lang.Throwable -> Ldd
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldd
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldd
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Ldd
            r3.onStart()     // Catch: java.lang.Throwable -> Ldd
            goto L12
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldd
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r9.mRunningOperations     // Catch: java.lang.Throwable -> Ldd
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldd
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldd
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldd
            r4 = 2
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldd
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Ldd
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L7b
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r5.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = "SpecialEffectsController: "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L51
            java.lang.String r6 = ""
            goto L69
        L51:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r6.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "Container "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldd
            android.view.ViewGroup r7 = r9.mContainer     // Catch: java.lang.Throwable -> Ldd
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = " is not attached to window. "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ldd
        L69:
            r5.append(r6)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = "Cancelling running operation "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ldd
            r5.append(r3)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Ldd
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> Ldd
        L7b:
            r3.cancel()     // Catch: java.lang.Throwable -> Ldd
            goto L2d
        L7f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldd
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r9.mPendingOperations     // Catch: java.lang.Throwable -> Ldd
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldd
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ldd
        L8a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldd
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Ldd
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> Ldd
            if (r5 == 0) goto Ld7
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r6.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "SpecialEffectsController: "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto Lad
            java.lang.String r7 = ""
            goto Lc5
        Lad:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r7.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r8 = "Container "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ldd
            android.view.ViewGroup r8 = r9.mContainer     // Catch: java.lang.Throwable -> Ldd
            r7.append(r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r8 = " is not attached to window. "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ldd
        Lc5:
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = "Cancelling pending operation "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ldd
            r6.append(r3)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ldd
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> Ldd
        Ld7:
            r3.cancel()     // Catch: java.lang.Throwable -> Ldd
            goto L8a
        Ldb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldd
            return
        Ldd:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ldd
            throw r0
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.findPendingOperation(r0)
            if (r0 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r0.getLifecycleImpact()
            goto L10
        Lf:
            r0 = 0
        L10:
            androidx.fragment.app.Fragment r3 = r3.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r2.findRunningOperation(r3)
            if (r3 == 0) goto L25
            if (r0 == 0) goto L20
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r0 != r1) goto L25
        L20:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r3.getLifecycleImpact()
            return r3
        L25:
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.ViewGroup getContainer() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mContainer
            return r0
    }

    public final void markPostponedState() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r6.mPendingOperations
            monitor-enter(r0)
            r6.updateFinalState()     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L3f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3f
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L3d
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3f
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2     // Catch: java.lang.Throwable -> L3f
            androidx.fragment.app.Fragment r3 = r2.getFragment()     // Catch: java.lang.Throwable -> L3f
            android.view.View r3 = r3.mView     // Catch: java.lang.Throwable -> L3f
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r3)     // Catch: java.lang.Throwable -> L3f
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r2.getFinalState()     // Catch: java.lang.Throwable -> L3f
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L3f
            if (r4 != r5) goto L3a
            if (r3 == r5) goto L3a
            androidx.fragment.app.Fragment r1 = r2.getFragment()     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.isPostponed()     // Catch: java.lang.Throwable -> L3f
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L3a:
            int r1 = r1 + (-1)
            goto L11
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
    }
}
