package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentStateManager {
    private static final java.lang.String TAG = "FragmentManager";
    private static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    private static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final java.lang.String VIEW_REGISTRY_STATE_TAG = "android:view_registry_state";
    private static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;

    @androidx.annotation.NonNull
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState;


    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public FragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentStore r3, @androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            r1.mFragment = r4
            return
    }

    public FragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentStore r4, @androidx.annotation.NonNull androidx.fragment.app.Fragment r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentState r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mMovingToState = r0
            r1 = -1
            r2.mFragmentManagerState = r1
            r2.mDispatcher = r3
            r2.mFragmentStore = r4
            r2.mFragment = r5
            r3 = 0
            r5.mSavedViewState = r3
            r5.mSavedViewRegistryState = r3
            r5.mBackStackNesting = r0
            r5.mInLayout = r0
            r5.mAdded = r0
            androidx.fragment.app.Fragment r4 = r5.mTarget
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.mWho
            goto L22
        L21:
            r4 = r3
        L22:
            r5.mTargetWho = r4
            r5.mTarget = r3
            android.os.Bundle r3 = r6.mSavedFragmentState
            if (r3 == 0) goto L2d
            r5.mSavedFragmentState = r3
            goto L34
        L2d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r5.mSavedFragmentState = r3
        L34:
            return
    }

    public FragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentStore r3, @androidx.annotation.NonNull java.lang.ClassLoader r4, @androidx.annotation.NonNull androidx.fragment.app.FragmentFactory r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentState r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            java.lang.String r2 = r6.mClassName
            androidx.fragment.app.Fragment r2 = r5.instantiate(r4, r2)
            r1.mFragment = r2
            android.os.Bundle r3 = r6.mArguments
            if (r3 == 0) goto L1c
            r3.setClassLoader(r4)
        L1c:
            android.os.Bundle r3 = r6.mArguments
            r2.setArguments(r3)
            java.lang.String r3 = r6.mWho
            r2.mWho = r3
            boolean r3 = r6.mFromLayout
            r2.mFromLayout = r3
            r3 = 1
            r2.mRestored = r3
            int r3 = r6.mFragmentId
            r2.mFragmentId = r3
            int r3 = r6.mContainerId
            r2.mContainerId = r3
            java.lang.String r3 = r6.mTag
            r2.mTag = r3
            boolean r3 = r6.mRetainInstance
            r2.mRetainInstance = r3
            boolean r3 = r6.mRemoving
            r2.mRemoving = r3
            boolean r3 = r6.mDetached
            r2.mDetached = r3
            boolean r3 = r6.mHidden
            r2.mHidden = r3
            androidx.lifecycle.Lifecycle$State[] r3 = androidx.lifecycle.Lifecycle.State.values()
            int r4 = r6.mMaxLifecycleState
            r3 = r3[r4]
            r2.mMaxState = r3
            android.os.Bundle r3 = r6.mSavedFragmentState
            if (r3 == 0) goto L59
            r2.mSavedFragmentState = r3
            goto L60
        L59:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.mSavedFragmentState = r3
        L60:
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L7d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instantiated fragment "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L7d:
            return
    }

    private boolean isFragmentViewChild(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            r1 = 1
            if (r3 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r3 = r3.getParent()
        Lc:
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r3 != r0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = r3.getParent()
            goto Lc
        L1a:
            r3 = 0
            return r3
    }

    private android.os.Bundle saveBasicState() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.onSaveInstanceState(r0)
            androidx.savedstate.SavedStateRegistryController r2 = r1.mSavedStateRegistryController
            r2.performSave(r0)
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            android.os.Parcelable r1 = r1.saveAllState()
            if (r1 == 0) goto L1c
            java.lang.String r2 = "android:support:fragments"
            r0.putParcelable(r2, r1)
        L1c:
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentSaveInstanceState(r2, r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2b
            r0 = 0
        L2b:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L34
            r4.saveViewState()
        L34:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            if (r1 == 0) goto L4a
            if (r0 != 0) goto L41
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L41:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            java.lang.String r2 = "android:view_state"
            r0.putSparseParcelableArray(r2, r1)
        L4a:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            if (r1 == 0) goto L60
            if (r0 != 0) goto L57
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L57:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            java.lang.String r2 = "android:view_registry_state"
            r0.putBundle(r2, r1)
        L60:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            if (r1 != 0) goto L76
            if (r0 != 0) goto L6d
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L6d:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            java.lang.String r2 = "android:user_visible_hint"
            r0.putBoolean(r2, r1)
        L76:
            return r0
    }

    public final void activityCreated() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performActivityCreated(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentActivityCreated(r1, r2, r3)
            return
    }

    public final void addViewToContainer() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            androidx.fragment.app.Fragment r1 = r3.mFragment
            int r0 = r0.findFragmentIndexInContainer(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.ViewGroup r2 = r1.mContainer
            android.view.View r1 = r1.mView
            r2.addView(r1, r0)
            return
    }

    public final void attach() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto ATTACHED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment r1 = r0.mTarget
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            java.lang.String r4 = "Fragment "
            r5 = 0
            if (r1 == 0) goto L5e
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.lang.String r1 = r1.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L3e
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r1.mTarget
            java.lang.String r2 = r2.mWho
            r1.mTargetWho = r2
            r1.mTarget = r5
            r5 = r0
            goto L85
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            androidx.fragment.app.Fragment r4 = r6.mFragment
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            androidx.fragment.app.Fragment r3 = r3.mTarget
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L85
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            androidx.fragment.app.FragmentStateManager r5 = r1.getFragmentStateManager(r0)
            if (r5 == 0) goto L6b
            goto L85
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            androidx.fragment.app.Fragment r4 = r6.mFragment
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.String r3 = r3.mTargetWho
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L85:
            if (r5 == 0) goto L95
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 != 0) goto L92
            androidx.fragment.app.Fragment r0 = r5.mFragment
            int r0 = r0.mState
            r1 = 1
            if (r0 >= r1) goto L95
        L92:
            r5.moveToExpectedState()
        L95:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r1 = r1.getHost()
            r0.mHost = r1
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            r0.mParentFragment = r1
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r2 = 0
            r0.dispatchOnFragmentPreAttached(r1, r2)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performAttach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.dispatchOnFragmentAttached(r1, r2)
            return
    }

    public final int computeExpectedState() {
            r10 = this;
            androidx.fragment.app.Fragment r0 = r10.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L9
            int r0 = r0.mState
            return r0
        L9:
            int r1 = r10.mFragmentManagerState
            int[] r2 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L37
            if (r0 == r6) goto L33
            if (r0 == r4) goto L2e
            if (r0 == r5) goto L28
            int r1 = java.lang.Math.min(r1, r2)
            goto L37
        L28:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L37
        L2e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L37
        L33:
            int r1 = java.lang.Math.min(r1, r3)
        L37:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L67
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L58
            int r0 = r10.mFragmentManagerState
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L67
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L67
            int r1 = java.lang.Math.min(r1, r6)
            goto L67
        L58:
            int r8 = r10.mFragmentManagerState
            if (r8 >= r5) goto L63
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L67
        L63:
            int r1 = java.lang.Math.min(r1, r7)
        L67:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L71
            int r1 = java.lang.Math.min(r1, r7)
        L71:
            r0 = 0
            boolean r8 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r8 == 0) goto L88
            androidx.fragment.app.Fragment r8 = r10.mFragment
            android.view.ViewGroup r9 = r8.mContainer
            if (r9 == 0) goto L88
            androidx.fragment.app.FragmentManager r0 = r8.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r9, r0)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r0.getAwaitingCompletionLifecycleImpact(r10)
        L88:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r0 != r8) goto L92
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto Lb0
        L92:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r0 != r8) goto L9b
            int r1 = java.lang.Math.max(r1, r4)
            goto Lb0
        L9b:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto Lb0
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto Lac
            int r1 = java.lang.Math.min(r1, r7)
            goto Lb0
        Lac:
            int r1 = java.lang.Math.min(r1, r2)
        Lb0:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r2 = r0.mDeferStart
            if (r2 == 0) goto Lbe
            int r0 = r0.mState
            if (r0 >= r3) goto Lbe
            int r1 = java.lang.Math.min(r1, r5)
        Lbe:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto Lda
            java.lang.String r0 = "computeExpectedState() of "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r0, r1, r2)
            androidx.fragment.app.Fragment r2 = r10.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        Lda:
            return r1
    }

    public final void create() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto CREATED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            boolean r1 = r0.mIsCreated
            if (r1 != 0) goto L3a
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            android.os.Bundle r2 = r0.mSavedFragmentState
            r3 = 0
            r1.dispatchOnFragmentPreCreated(r0, r2, r3)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performCreate(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r0.dispatchOnFragmentCreated(r1, r2, r3)
            goto L44
        L3a:
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.restoreChildFragmentState(r1)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r1 = 1
            r0.mState = r1
        L44:
            return
    }

    public final void createView() {
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L22
            java.lang.String r0 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L22:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.os.Bundle r2 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r2)
            r2 = 0
            androidx.fragment.app.Fragment r3 = r7.mFragment
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 == 0) goto L34
            r2 = r4
            goto Lab
        L34:
            int r4 = r3.mContainerId
            if (r4 == 0) goto Lab
            r2 = -1
            if (r4 == r2) goto L91
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            androidx.fragment.app.FragmentContainer r2 = r2.getContainer()
            androidx.fragment.app.Fragment r3 = r7.mFragment
            int r3 = r3.mContainerId
            android.view.View r2 = r2.onFindViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto Lab
            androidx.fragment.app.Fragment r3 = r7.mFragment
            boolean r4 = r3.mRestored
            if (r4 == 0) goto L54
            goto Lab
        L54:
            android.content.res.Resources r0 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L61
            androidx.fragment.app.Fragment r1 = r7.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L61
            int r1 = r1.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L61
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L61
            goto L64
        L61:
            java.lang.String r0 = "unknown"
        L64:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No view found for id 0x"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            androidx.fragment.app.Fragment r3 = r7.mFragment
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L91:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lab:
            androidx.fragment.app.Fragment r3 = r7.mFragment
            r3.mContainer = r2
            android.os.Bundle r4 = r3.mSavedFragmentState
            r3.performCreateView(r0, r2, r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r3 = 2
            if (r0 == 0) goto L178
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r5 = r0.mView
            int r6 = androidx.fragment.R.id.fragment_container_view_tag
            r5.setTag(r6, r0)
            if (r2 == 0) goto Lcd
            r7.addViewToContainer()
        Lcd:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            boolean r2 = r0.mHidden
            if (r2 == 0) goto Lda
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        Lda:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 == 0) goto Lec
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto Lf8
        Lec:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            androidx.fragment.app.FragmentStateManager$1 r2 = new androidx.fragment.app.FragmentStateManager$1
            r2.<init>(r0)
            r0.addOnAttachStateChangeListener(r2)
        Lf8:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r2 = r0.mView
            android.os.Bundle r5 = r0.mSavedFragmentState
            r0.onViewCreated(r2, r5)
            androidx.fragment.app.FragmentManager r0 = r0.mChildFragmentManager
            r0.dispatchViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r7.mDispatcher
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.View r5 = r2.mView
            android.os.Bundle r6 = r2.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r5, r6, r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.View r2 = r2.mView
            float r2 = r2.getAlpha()
            boolean r5 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r5 == 0) goto L16d
            androidx.fragment.app.Fragment r4 = r7.mFragment
            r4.setPostOnViewCreatedAlpha(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.ViewGroup r4 = r2.mContainer
            if (r4 == 0) goto L178
            if (r0 != 0) goto L178
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L164
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r2.setFocusedView(r0)
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r2 == 0) goto L164
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "requestFocus: Saved focused view "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " for Fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r1, r0)
        L164:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setAlpha(r1)
            goto L178
        L16d:
            androidx.fragment.app.Fragment r1 = r7.mFragment
            if (r0 != 0) goto L176
            android.view.ViewGroup r0 = r1.mContainer
            if (r0 == 0) goto L176
            r4 = 1
        L176:
            r1.mIsNewlyAdded = r4
        L178:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r0.mState = r3
            return
    }

    public final void destroy() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom CREATED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r1 = r0.mRemoving
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L3f
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r4 = r5.mFragment
            boolean r1 = r1.shouldDestroy(r4)
            if (r1 == 0) goto L3d
            goto L3f
        L3d:
            r1 = 0
            goto L40
        L3f:
            r1 = 1
        L40:
            if (r1 == 0) goto Lc7
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.fragment.app.FragmentHostCallback<?> r1 = r1.mHost
            boolean r4 = r1 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L55
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            boolean r2 = r1.isCleared()
            goto L68
        L55:
            android.content.Context r4 = r1.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L68
            android.content.Context r1 = r1.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r2 = r2 ^ r1
        L68:
            if (r0 != 0) goto L6c
            if (r2 == 0) goto L77
        L6c:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getNonConfig()
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.clearNonConfigState(r1)
        L77:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performDestroy()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.dispatchOnFragmentDestroyed(r1, r3)
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L8f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L8f
            androidx.fragment.app.Fragment r1 = r1.mFragment
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.String r2 = r2.mWho
            java.lang.String r3 = r1.mTargetWho
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8f
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r1.mTarget = r2
            r2 = 0
            r1.mTargetWho = r2
            goto L8f
        Lb3:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto Lc1
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore
            androidx.fragment.app.Fragment r1 = r2.findActiveFragment(r1)
            r0.mTarget = r1
        Lc1:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            r0.makeInactive(r5)
            goto Le1
        Lc7:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto Ldd
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            if (r0 == 0) goto Ldd
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Ldd
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mTarget = r0
        Ldd:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.mState = r3
        Le1:
            return
    }

    public final void destroyFragmentView() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom CREATE_VIEW: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r1 = r0.mContainer
            if (r1 == 0) goto L28
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L28
            r1.removeView(r0)
        L28:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentViewDestroyed(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 0
            r0.mContainer = r1
            r0.mView = r1
            r0.mViewLifecycleOwner = r1
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mInLayout = r2
            return
    }

    public final void detach() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.String r1 = "movefrom ATTACHED: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1b:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performDetach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentDetached(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = -1
            r1.mState = r3
            r3 = 0
            r1.mHost = r3
            r1.mParentFragment = r3
            r1.mFragmentManager = r3
            boolean r3 = r1.mRemoving
            if (r3 == 0) goto L3f
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L3f
            r4 = 1
        L3f:
            if (r4 != 0) goto L4f
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r3 = r5.mFragment
            boolean r1 = r1.shouldDestroy(r3)
            if (r1 == 0) goto L6c
        L4f:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L67
            java.lang.String r0 = "initState called for fragment: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L67:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.initState()
        L6c:
            return
    }

    public final void ensureInflatedView() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r1 = r0.mFromLayout
            if (r1 == 0) goto L77
            boolean r1 = r0.mInLayout
            if (r1 == 0) goto L77
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L77
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L29:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r1 = r0.performGetLayoutInflater(r1)
            r2 = 0
            androidx.fragment.app.Fragment r3 = r5.mFragment
            android.os.Bundle r3 = r3.mSavedFragmentState
            r0.performCreateView(r1, r2, r3)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L77
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r2 = r0.mView
            int r3 = androidx.fragment.R.id.fragment_container_view_tag
            r2.setTag(r3, r0)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r2 = r0.mHidden
            if (r2 == 0) goto L59
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L59:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r2 = r0.mView
            android.os.Bundle r3 = r0.mSavedFragmentState
            r0.onViewCreated(r2, r3)
            androidx.fragment.app.FragmentManager r0 = r0.mChildFragmentManager
            r0.dispatchViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.view.View r3 = r2.mView
            android.os.Bundle r4 = r2.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r3, r4, r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 2
            r0.mState = r1
        L77:
            return
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mFragment
            return r0
    }

    public final void moveToExpectedState() {
            r7 = this;
            boolean r0 = r7.mMovingToState
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L20
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L1f:
            return
        L20:
            r0 = 0
            r3 = 1
            r7.mMovingToState = r3     // Catch: java.lang.Throwable -> L124
        L24:
            int r4 = r7.computeExpectedState()     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.Fragment r5 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            int r6 = r5.mState     // Catch: java.lang.Throwable -> L124
            if (r4 == r6) goto Lea
            if (r4 <= r6) goto L7a
            int r6 = r6 + 1
            switch(r6) {
                case 0: goto L76;
                case 1: goto L72;
                case 2: goto L6b;
                case 3: goto L67;
                case 4: goto L42;
                case 5: goto L3e;
                case 6: goto L3a;
                case 7: goto L36;
                default: goto L35;
            }     // Catch: java.lang.Throwable -> L124
        L35:
            goto L24
        L36:
            r7.resume()     // Catch: java.lang.Throwable -> L124
            goto L24
        L3a:
            r4 = 6
            r5.mState = r4     // Catch: java.lang.Throwable -> L124
            goto L24
        L3e:
            r7.start()     // Catch: java.lang.Throwable -> L124
            goto L24
        L42:
            android.view.View r4 = r5.mView     // Catch: java.lang.Throwable -> L124
            if (r4 == 0) goto L61
            android.view.ViewGroup r4 = r5.mContainer     // Catch: java.lang.Throwable -> L124
            if (r4 == 0) goto L61
            androidx.fragment.app.FragmentManager r5 = r5.getParentFragmentManager()     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r4, r5)     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.Fragment r5 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            android.view.View r5 = r5.mView     // Catch: java.lang.Throwable -> L124
            int r5 = r5.getVisibility()     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r5)     // Catch: java.lang.Throwable -> L124
            r4.enqueueAdd(r5, r7)     // Catch: java.lang.Throwable -> L124
        L61:
            androidx.fragment.app.Fragment r4 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            r5 = 4
            r4.mState = r5     // Catch: java.lang.Throwable -> L124
            goto L24
        L67:
            r7.activityCreated()     // Catch: java.lang.Throwable -> L124
            goto L24
        L6b:
            r7.ensureInflatedView()     // Catch: java.lang.Throwable -> L124
            r7.createView()     // Catch: java.lang.Throwable -> L124
            goto L24
        L72:
            r7.create()     // Catch: java.lang.Throwable -> L124
            goto L24
        L76:
            r7.attach()     // Catch: java.lang.Throwable -> L124
            goto L24
        L7a:
            int r6 = r6 + (-1)
            switch(r6) {
                case -1: goto Le5;
                case 0: goto Le0;
                case 1: goto Ld7;
                case 2: goto Ld1;
                case 3: goto L8c;
                case 4: goto L88;
                case 5: goto L84;
                case 6: goto L80;
                default: goto L7f;
            }     // Catch: java.lang.Throwable -> L124
        L7f:
            goto L24
        L80:
            r7.pause()     // Catch: java.lang.Throwable -> L124
            goto L24
        L84:
            r4 = 5
            r5.mState = r4     // Catch: java.lang.Throwable -> L124
            goto L24
        L88:
            r7.stop()     // Catch: java.lang.Throwable -> L124
            goto L24
        L8c:
            r4 = 3
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L124
            if (r5 == 0) goto La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L124
            r5.<init>()     // Catch: java.lang.Throwable -> L124
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.Fragment r6 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            r5.append(r6)     // Catch: java.lang.Throwable -> L124
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L124
            android.util.Log.d(r1, r5)     // Catch: java.lang.Throwable -> L124
        La9:
            androidx.fragment.app.Fragment r5 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            android.view.View r6 = r5.mView     // Catch: java.lang.Throwable -> L124
            if (r6 == 0) goto Lb6
            android.util.SparseArray<android.os.Parcelable> r5 = r5.mSavedViewState     // Catch: java.lang.Throwable -> L124
            if (r5 != 0) goto Lb6
            r7.saveViewState()     // Catch: java.lang.Throwable -> L124
        Lb6:
            androidx.fragment.app.Fragment r5 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            android.view.View r6 = r5.mView     // Catch: java.lang.Throwable -> L124
            if (r6 == 0) goto Lcb
            android.view.ViewGroup r6 = r5.mContainer     // Catch: java.lang.Throwable -> L124
            if (r6 == 0) goto Lcb
            androidx.fragment.app.FragmentManager r5 = r5.getParentFragmentManager()     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.SpecialEffectsController r5 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r6, r5)     // Catch: java.lang.Throwable -> L124
            r5.enqueueRemove(r7)     // Catch: java.lang.Throwable -> L124
        Lcb:
            androidx.fragment.app.Fragment r5 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            r5.mState = r4     // Catch: java.lang.Throwable -> L124
            goto L24
        Ld1:
            r5.mInLayout = r0     // Catch: java.lang.Throwable -> L124
            r5.mState = r2     // Catch: java.lang.Throwable -> L124
            goto L24
        Ld7:
            r7.destroyFragmentView()     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.Fragment r4 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            r4.mState = r3     // Catch: java.lang.Throwable -> L124
            goto L24
        Le0:
            r7.destroy()     // Catch: java.lang.Throwable -> L124
            goto L24
        Le5:
            r7.detach()     // Catch: java.lang.Throwable -> L124
            goto L24
        Lea:
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L124
            if (r1 == 0) goto L121
            boolean r1 = r5.mHiddenChanged     // Catch: java.lang.Throwable -> L124
            if (r1 == 0) goto L121
            android.view.View r1 = r5.mView     // Catch: java.lang.Throwable -> L124
            if (r1 == 0) goto L10f
            android.view.ViewGroup r1 = r5.mContainer     // Catch: java.lang.Throwable -> L124
            if (r1 == 0) goto L10f
            androidx.fragment.app.FragmentManager r2 = r5.getParentFragmentManager()     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r1, r2)     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.Fragment r2 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L124
            if (r2 == 0) goto L10c
            r1.enqueueHide(r7)     // Catch: java.lang.Throwable -> L124
            goto L10f
        L10c:
            r1.enqueueShow(r7)     // Catch: java.lang.Throwable -> L124
        L10f:
            androidx.fragment.app.Fragment r1 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            androidx.fragment.app.FragmentManager r2 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L124
            if (r2 == 0) goto L118
            r2.invalidateMenuForFragment(r1)     // Catch: java.lang.Throwable -> L124
        L118:
            androidx.fragment.app.Fragment r1 = r7.mFragment     // Catch: java.lang.Throwable -> L124
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L124
            boolean r2 = r1.mHidden     // Catch: java.lang.Throwable -> L124
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L124
        L121:
            r7.mMovingToState = r0
            return
        L124:
            r1 = move-exception
            r7.mMovingToState = r0
            throw r1
    }

    public final void pause() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom RESUMED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performPause()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentPaused(r1, r2)
            return
    }

    public final void restoreState(@androidx.annotation.NonNull java.lang.ClassLoader r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            return
        L7:
            r0.setClassLoader(r4)
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r4.mSavedViewState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_registry_state"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4.mSavedViewRegistryState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            java.lang.String r0 = r0.getString(r1)
            r4.mTargetWho = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.String r0 = r4.mTargetWho
            if (r0 == 0) goto L3f
            android.os.Bundle r0 = r4.mSavedFragmentState
            r1 = 0
            java.lang.String r2 = "android:target_req_state"
            int r0 = r0.getInt(r2, r1)
            r4.mTargetRequestCode = r0
        L3f:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.Boolean r0 = r4.mSavedUserVisibleHint
            r1 = 1
            if (r0 == 0) goto L52
            boolean r0 = r0.booleanValue()
            r4.mUserVisibleHint = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r0 = 0
            r4.mSavedUserVisibleHint = r0
            goto L5c
        L52:
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r2 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r2, r1)
            r4.mUserVisibleHint = r0
        L5c:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            boolean r0 = r4.mUserVisibleHint
            if (r0 != 0) goto L64
            r4.mDeferStart = r1
        L64:
            return
    }

    public final void resume() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment$AnimationInfo r0 = r0.mAnimationInfo
            r2 = 0
            if (r0 != 0) goto L24
            r0 = r2
            goto L26
        L24:
            android.view.View r0 = r0.mFocusedView
        L26:
            if (r0 == 0) goto L78
            boolean r3 = r6.isFragmentViewChild(r0)
            if (r3 == 0) goto L78
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L52
            java.lang.String r0 = "succeeded"
            goto L54
        L52:
            java.lang.String r0 = "failed"
        L54:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r4.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            android.view.View r0 = r0.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
        L78:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.setFocusedView(r2)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r3 = 0
            r0.dispatchOnFragmentResumed(r1, r3)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.mSavedFragmentState = r2
            r0.mSavedViewState = r2
            r0.mSavedViewRegistryState = r2
            return
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.Fragment.SavedState saveInstanceState() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            int r0 = r0.mState
            r1 = 0
            r2 = -1
            if (r0 <= r2) goto L13
            android.os.Bundle r0 = r3.saveBasicState()
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment$SavedState r1 = new androidx.fragment.app.Fragment$SavedState
            r1.<init>(r0)
        L13:
            return r1
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentState saveState() {
            r4 = this;
            androidx.fragment.app.FragmentState r0 = new androidx.fragment.app.FragmentState
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r2 = r1.mState
            r3 = -1
            if (r2 <= r3) goto L40
            android.os.Bundle r2 = r0.mSavedFragmentState
            if (r2 != 0) goto L40
            android.os.Bundle r1 = r4.saveBasicState()
            r0.mSavedFragmentState = r1
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            if (r2 == 0) goto L44
            if (r1 != 0) goto L27
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L27:
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            java.lang.String r3 = "android:target_state"
            r1.putString(r3, r2)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mTargetRequestCode
            if (r1 == 0) goto L44
            android.os.Bundle r2 = r0.mSavedFragmentState
            java.lang.String r3 = "android:target_req_state"
            r2.putInt(r3, r1)
            goto L44
        L40:
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.mSavedFragmentState = r1
        L44:
            return r0
    }

    public final void saveViewState() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            return
        L7:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L1d
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewState = r0
        L1d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r1.mViewLifecycleOwner
            r1.performSave(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L33
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewRegistryState = r0
        L33:
            return
    }

    public final void setFragmentManagerState(int r1) {
            r0 = this;
            r0.mFragmentManagerState = r1
            return
    }

    public final void start() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto STARTED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStart()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStarted(r1, r2)
            return
    }

    public final void stop() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "movefrom STARTED: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1b:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStop()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStopped(r1, r2)
            return
    }
}
