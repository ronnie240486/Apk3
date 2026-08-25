package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.result.ActivityResultCaller {
    public static final java.lang.Object USE_DEFAULT_TRANSITION = null;
    public boolean mAdded;
    public androidx.fragment.app.Fragment.AnimationInfo mAnimationInfo;
    public android.os.Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentManager mChildFragmentManager;
    public android.view.ViewGroup mContainer;
    public int mContainerId;

    @androidx.annotation.LayoutRes
    private int mContentLayoutId;
    public androidx.lifecycle.SavedStateViewModelFactory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public androidx.fragment.app.FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public androidx.fragment.app.FragmentHostCallback<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    public android.view.LayoutInflater mLayoutInflater;
    public androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    public androidx.lifecycle.Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<androidx.fragment.app.Fragment.OnPreAttachedListener> mOnPreAttachedListeners;
    public androidx.fragment.app.Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public java.lang.Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public android.os.Bundle mSavedFragmentState;
    public androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;

    @androidx.annotation.Nullable
    public java.lang.Boolean mSavedUserVisibleHint;
    public android.os.Bundle mSavedViewRegistryState;
    public android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    public int mState;
    public java.lang.String mTag;
    public androidx.fragment.app.Fragment mTarget;
    public int mTargetRequestCode;
    public java.lang.String mTargetWho;
    public boolean mUserVisibleHint;
    public android.view.View mView;

    @androidx.annotation.Nullable
    public androidx.fragment.app.FragmentViewLifecycleOwner mViewLifecycleOwner;
    public androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> mViewLifecycleOwnerLiveData;

    @androidx.annotation.NonNull
    public java.lang.String mWho;




    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass4 extends androidx.fragment.app.FragmentContainer {
        public final /* synthetic */ androidx.fragment.app.Fragment this$0;

        public AnonymousClass4(androidx.fragment.app.Fragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.FragmentContainer
        @androidx.annotation.Nullable
        public android.view.View onFindViewById(int r3) {
                r2 = this;
                androidx.fragment.app.Fragment r0 = r2.this$0
                android.view.View r0 = r0.mView
                if (r0 == 0) goto Lb
                android.view.View r3 = r0.findViewById(r3)
                return r3
            Lb:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Fragment "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.fragment.app.Fragment r1 = r2.this$0
                r0.append(r1)
                java.lang.String r1 = " does not have a view"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.this$0
                android.view.View r0 = r0.mView
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }






    public static class AnimationInfo {
        public java.lang.Boolean mAllowEnterTransitionOverlap;
        public java.lang.Boolean mAllowReturnTransitionOverlap;
        public android.view.View mAnimatingAway;
        public android.animation.Animator mAnimator;
        public int mEnterAnim;
        public java.lang.Object mEnterTransition;
        public androidx.core.app.SharedElementCallback mEnterTransitionCallback;
        public boolean mEnterTransitionPostponed;
        public int mExitAnim;
        public java.lang.Object mExitTransition;
        public androidx.core.app.SharedElementCallback mExitTransitionCallback;
        public android.view.View mFocusedView;
        public boolean mIsHideReplaced;
        public boolean mIsPop;
        public int mNextTransition;
        public int mPopEnterAnim;
        public int mPopExitAnim;
        public float mPostOnViewCreatedAlpha;
        public java.lang.Object mReenterTransition;
        public java.lang.Object mReturnTransition;
        public java.lang.Object mSharedElementEnterTransition;
        public java.lang.Object mSharedElementReturnTransition;
        public java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
        public java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
        public androidx.fragment.app.Fragment.OnStartEnterTransitionListener mStartEnterTransitionListener;

        public AnimationInfo() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mEnterTransition = r0
                java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
                r2.mReturnTransition = r1
                r2.mExitTransition = r0
                r2.mReenterTransition = r1
                r2.mSharedElementEnterTransition = r0
                r2.mSharedElementReturnTransition = r1
                r2.mEnterTransitionCallback = r0
                r2.mExitTransitionCallback = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.mPostOnViewCreatedAlpha = r1
                r2.mFocusedView = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class InstantiationException extends java.lang.RuntimeException {
        public InstantiationException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class OnPreAttachedListener {
        private OnPreAttachedListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ OnPreAttachedListener(androidx.fragment.app.Fragment.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onPreAttached();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnStartEnterTransitionListener {
        void onStartEnterTransition();

        void startListening();
    }

    /* JADX INFO: loaded from: classes2.dex */
    @android.annotation.SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements android.os.Parcelable {

        @androidx.annotation.NonNull
        public static final android.os.Parcelable.Creator<androidx.fragment.app.Fragment.SavedState> CREATOR = null;
        public final android.os.Bundle mState;


        static {
                androidx.fragment.app.Fragment$SavedState$1 r0 = new androidx.fragment.app.Fragment$SavedState$1
                r0.<init>()
                androidx.fragment.app.Fragment.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Bundle r1) {
                r0 = this;
                r0.<init>()
                r0.mState = r1
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>()
                android.os.Bundle r1 = r1.readBundle()
                r0.mState = r1
                if (r2 == 0) goto L10
                if (r1 == 0) goto L10
                r1.setClassLoader(r2)
            L10:
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                android.os.Bundle r2 = r0.mState
                r1.writeBundle(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION = r0
            return
    }

    public Fragment() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mState = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.mWho = r0
            r0 = 0
            r1.mTargetWho = r0
            r1.mIsPrimaryNavigationFragment = r0
            androidx.fragment.app.FragmentManagerImpl r0 = new androidx.fragment.app.FragmentManagerImpl
            r0.<init>()
            r1.mChildFragmentManager = r0
            r0 = 1
            r1.mMenuVisible = r0
            r1.mUserVisibleHint = r0
            androidx.fragment.app.Fragment$1 r0 = new androidx.fragment.app.Fragment$1
            r0.<init>(r1)
            r1.mPostponedDurationRunnable = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            r1.mMaxState = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.mViewLifecycleOwnerLiveData = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.mNextLocalRequestCode = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnPreAttachedListeners = r0
            r1.initLifecycle()
            return
    }

    @androidx.annotation.ContentView
    public Fragment(@androidx.annotation.LayoutRes int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    private androidx.fragment.app.Fragment.AnimationInfo ensureAnimationInfo() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto Lb
            androidx.fragment.app.Fragment$AnimationInfo r0 = new androidx.fragment.app.Fragment$AnimationInfo
            r0.<init>()
            r1.mAnimationInfo = r0
        Lb:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            return r0
    }

    private int getMinimumMaxLifecycleState() {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            int r1 = r1.getMinimumMaxLifecycleState()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1a:
            int r0 = r0.ordinal()
            return r0
    }

    private void initLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r1)
            r1.mSavedStateRegistryController = r0
            r0 = 0
            r1.mDefaultFactory = r0
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = 0
            androidx.fragment.app.Fragment r1 = instantiate(r1, r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable android.os.Bundle r6) {
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            java.lang.Class r4 = androidx.fragment.app.FragmentFactory.loadFragmentClass(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            java.lang.reflect.Constructor r4 = r4.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            java.lang.Object r4 = r4.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            if (r6 == 0) goto L2b
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            r6.setClassLoader(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
            r4.setArguments(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L39 java.lang.IllegalAccessException -> L46 java.lang.InstantiationException -> L51
        L2b:
            return r4
        L2c:
            r4 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r6 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r0 = ": calling Fragment constructor caused an exception"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r0)
            r6.<init>(r5, r4)
            throw r6
        L39:
            r4 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r6 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r0 = ": could not find Fragment constructor"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r0)
            r6.<init>(r5, r4)
            throw r6
        L46:
            r4 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r6 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r0)
            r6.<init>(r5, r4)
            throw r6
        L51:
            r4 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r6 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r0)
            r6.<init>(r5, r4)
            throw r6
    }

    @androidx.annotation.NonNull
    private <I, O> androidx.activity.result.ActivityResultLauncher<I> prepareCallInternal(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r9, @androidx.annotation.NonNull androidx.arch.core.util.Function<java.lang.Void, androidx.activity.result.ActivityResultRegistry> r10, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r11) {
            r8 = this;
            int r0 = r8.mState
            r1 = 1
            if (r0 > r1) goto L1e
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            androidx.fragment.app.Fragment$8 r1 = new androidx.fragment.app.Fragment$8
            r2 = r1
            r3 = r8
            r4 = r10
            r5 = r0
            r6 = r9
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r8.registerOnPreAttachListener(r1)
            androidx.fragment.app.Fragment$9 r10 = new androidx.fragment.app.Fragment$9
            r10.<init>(r0, r9)
            return r10
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment "
            java.lang.String r11 = " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r8, r11)
            r9.<init>(r10)
            throw r9
    }

    private void registerOnPreAttachListener(@androidx.annotation.NonNull androidx.fragment.app.Fragment.OnPreAttachedListener r2) {
            r1 = this;
            int r0 = r1.mState
            if (r0 < 0) goto L8
            r2.onPreAttached()
            goto Ld
        L8:
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r1.mOnPreAttachedListeners
            r0.add(r2)
        Ld:
            return
    }

    private void restoreViewState() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESTORE_VIEW_STATE: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            android.view.View r0 = r4.mView
            r1 = 0
            if (r0 == 0) goto L5e
            android.os.Bundle r2 = r4.mSavedFragmentState
            android.util.SparseArray<android.os.Parcelable> r3 = r4.mSavedViewState
            if (r3 == 0) goto L2d
            r0.restoreHierarchyState(r3)
            r4.mSavedViewState = r1
        L2d:
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L3a
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r4.mViewLifecycleOwner
            android.os.Bundle r3 = r4.mSavedViewRegistryState
            r0.performRestore(r3)
            r4.mSavedViewRegistryState = r1
        L3a:
            r0 = 0
            r4.mCalled = r0
            r4.onViewStateRestored(r2)
            boolean r0 = r4.mCalled
            if (r0 == 0) goto L50
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L5e
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r4.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r2)
            goto L5e
        L50:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            r0.<init>(r1)
            throw r0
        L5e:
            r4.mSavedFragmentState = r1
            return
    }

    public final void callStartTransitionListener(boolean r4) {
            r3 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r3.mAnimationInfo
            r1 = 0
            if (r0 != 0) goto L6
            goto Le
        L6:
            r2 = 0
            r0.mEnterTransitionPostponed = r2
            androidx.fragment.app.Fragment$OnStartEnterTransitionListener r2 = r0.mStartEnterTransitionListener
            r0.mStartEnterTransitionListener = r1
            r1 = r2
        Le:
            if (r1 == 0) goto L14
            r1.onStartEnterTransition()
            goto L43
        L14:
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L43
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L43
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r1 = r3.mFragmentManager
            if (r1 == 0) goto L43
            androidx.fragment.app.SpecialEffectsControllerFactory r1 = r1.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r0, r1)
            r0.markPostponedState()
            if (r4 == 0) goto L40
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            android.os.Handler r4 = r4.getHandler()
            androidx.fragment.app.Fragment$3 r1 = new androidx.fragment.app.Fragment$3
            r1.<init>(r0)
            r4.post(r1)
            goto L43
        L40:
            r0.executePendingOperations()
        L43:
            return
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentContainer createFragmentContainer() {
            r1 = this;
            androidx.fragment.app.Fragment$4 r0 = new androidx.fragment.app.Fragment$4
            r0.<init>(r1)
            return r0
    }

    public void dump(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.io.FileDescriptor r4, @androidx.annotation.NonNull java.io.PrintWriter r5, @androidx.annotation.Nullable java.lang.String[] r6) {
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.mFragmentId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.mContainerId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.mTag
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.mState
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.mWho
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.mBackStackNesting
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.mAdded
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.mRemoving
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.mFromLayout
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.mInLayout
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.mHidden
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.mDetached
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.mMenuVisible
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.mHasMenu
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.mRetainInstance
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.mUserVisibleHint
            r5.println(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto Lc8
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            r5.println(r0)
        Lc8:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 == 0) goto Ld9
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            r5.println(r0)
        Ld9:
            androidx.fragment.app.Fragment r0 = r2.mParentFragment
            if (r0 == 0) goto Lea
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.Fragment r0 = r2.mParentFragment
            r5.println(r0)
        Lea:
            android.os.Bundle r0 = r2.mArguments
            if (r0 == 0) goto Lfb
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.mArguments
            r5.println(r0)
        Lfb:
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto L10c
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.mSavedFragmentState
            r5.println(r0)
        L10c:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.mSavedViewState
            if (r0 == 0) goto L11d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.mSavedViewState
            r5.println(r0)
        L11d:
            android.os.Bundle r0 = r2.mSavedViewRegistryState
            if (r0 == 0) goto L12e
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.mSavedViewRegistryState
            r5.println(r0)
        L12e:
            androidx.fragment.app.Fragment r0 = r2.getTargetFragment()
            if (r0 == 0) goto L149
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.mTargetRequestCode
            r5.println(r0)
        L149:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            boolean r0 = r2.getPopDirection()
            r5.println(r0)
            int r0 = r2.getEnterAnim()
            if (r0 == 0) goto L16d
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            int r0 = r2.getEnterAnim()
            r5.println(r0)
        L16d:
            int r0 = r2.getExitAnim()
            if (r0 == 0) goto L182
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            int r0 = r2.getExitAnim()
            r5.println(r0)
        L182:
            int r0 = r2.getPopEnterAnim()
            if (r0 == 0) goto L197
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            int r0 = r2.getPopEnterAnim()
            r5.println(r0)
        L197:
            int r0 = r2.getPopExitAnim()
            if (r0 == 0) goto L1ac
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            int r0 = r2.getPopExitAnim()
            r5.println(r0)
        L1ac:
            android.view.ViewGroup r0 = r2.mContainer
            if (r0 == 0) goto L1bd
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.mContainer
            r5.println(r0)
        L1bd:
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L1ce
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.mView
            r5.println(r0)
        L1ce:
            android.view.View r0 = r2.getAnimatingAway()
            if (r0 == 0) goto L1e3
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.getAnimatingAway()
            r5.println(r0)
        L1e3:
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L1f0
            androidx.loader.app.LoaderManager r0 = androidx.loader.app.LoaderManager.getInstance(r2)
            r0.dump(r3, r4, r5, r6)
        L1f0:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            java.lang.String r1 = "  "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1)
            r0.dump(r3, r4, r5, r6)
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.Fragment findFragmentByWho(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mWho
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return r1
        L9:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            androidx.fragment.app.Fragment r2 = r0.findFragmentByWho(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public final java.lang.String generateActivityResultKey() {
            r2 = this;
            java.lang.String r0 = "fragment_"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            java.lang.String r1 = "_rq#"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.FragmentActivity getActivity() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.app.Activity r0 = r0.getActivity()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
        Lc:
            return r0
    }

    public boolean getAllowEnterTransitionOverlap() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.mAllowEnterTransitionOverlap
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    public boolean getAllowReturnTransitionOverlap() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.mAllowReturnTransitionOverlap
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            goto Lf
        Le:
            r0 = 1
        Lf:
            return r0
    }

    public final android.view.View getAnimatingAway() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.mAnimatingAway
            return r0
    }

    @androidx.annotation.Nullable
    public final android.os.Bundle getArguments() {
            r1 = this;
            android.os.Bundle r0 = r1.mArguments
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentManager getChildFragmentManager() {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto L7
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " has not been attached yet."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public android.content.Context getContext() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.content.Context r0 = r0.getContext()
        La:
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r1 = this;
            androidx.lifecycle.viewmodel.CreationExtras r0 = androidx.lifecycle.HasDefaultViewModelProviderFactory.CC.$default$getDefaultViewModelCreationExtras(r1)
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L5a
            androidx.lifecycle.SavedStateViewModelFactory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L57
            r0 = 0
            android.content.Context r1 = r3.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        L11:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L24
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L1d
            r0 = r1
            android.app.Application r0 = (android.app.Application) r0
            goto L24
        L1d:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L11
        L24:
            if (r0 != 0) goto L4c
            r1 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r1 == 0) goto L4c
            java.lang.String r1 = "Could not find Application instance from Context "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            android.content.Context r2 = r3.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
            r1.append(r2)
            java.lang.String r2 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L4c:
            androidx.lifecycle.SavedStateViewModelFactory r1 = new androidx.lifecycle.SavedStateViewModelFactory
            android.os.Bundle r2 = r3.getArguments()
            r1.<init>(r0, r3, r2)
            r3.mDefaultFactory = r1
        L57:
            androidx.lifecycle.SavedStateViewModelFactory r0 = r3.mDefaultFactory
            return r0
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    public final int getEnterAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.mEnterAnim
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getEnterTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.mEnterTransition
            return r0
    }

    public final androidx.core.app.SharedElementCallback getEnterTransitionCallback() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.core.app.SharedElementCallback r0 = r0.mEnterTransitionCallback
            return r0
    }

    public final int getExitAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.mExitAnim
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getExitTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.mExitTransition
            return r0
    }

    public final androidx.core.app.SharedElementCallback getExitTransitionCallback() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.core.app.SharedElementCallback r0 = r0.mExitTransitionCallback
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.Object getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.Object r0 = r0.onGetHost()
        La:
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.mFragmentId
            return r0
    }

    @androidx.annotation.NonNull
    public final android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mLayoutInflater
            if (r0 != 0) goto L9
            r0 = 0
            android.view.LayoutInflater r0 = r1.performGetLayoutInflater(r0)
        L9:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r2 = r1.mHost
            if (r2 == 0) goto L12
            android.view.LayoutInflater r2 = r2.onGetLayoutInflater()
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            android.view.LayoutInflater$Factory2 r0 = r0.getLayoutInflaterFactory()
            androidx.core.view.LayoutInflaterCompat.setFactory2(r2, r0)
            return r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @androidx.annotation.NonNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getLoaderManager() {
            r1 = this;
            androidx.loader.app.LoaderManager r0 = androidx.loader.app.LoaderManager.getInstance(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.Fragment getParentFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParentFragment
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentManager getParentFragmentManager() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not associated with a fragment manager."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final boolean getPopDirection() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.mIsPop
            return r0
    }

    public final int getPopEnterAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.mPopEnterAnim
            return r0
    }

    public final int getPopExitAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.mPopExitAnim
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getReenterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.mReenterTransition
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.getExitTransition()
        L10:
            return r0
    }

    @androidx.annotation.NonNull
    public final android.content.res.Resources getResources() {
            r1 = this;
            android.content.Context r0 = r1.requireContext()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
            r1 = this;
            boolean r0 = r1.mRetainInstance
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getReturnTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.mReturnTransition
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.getEnterTransition()
        L10:
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @androidx.annotation.NonNull
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getSharedElementEnterTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.mSharedElementEnterTransition
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getSharedElementReturnTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.mSharedElementReturnTransition
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.getSharedElementEnterTransition()
        L10:
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String getString(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public final java.lang.String getString(@androidx.annotation.StringRes int r2, @androidx.annotation.Nullable java.lang.Object... r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    @androidx.annotation.Nullable
    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.mTag
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public final androidx.fragment.app.Fragment getTargetFragment() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mTarget
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L12
            java.lang.String r1 = r2.mTargetWho
            if (r1 == 0) goto L12
            androidx.fragment.app.Fragment r0 = r0.findActiveFragment(r1)
            return r0
        L12:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
            r1 = this;
            int r0 = r1.mTargetRequestCode
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.CharSequence getText(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
            r1 = this;
            boolean r0 = r1.mUserVisibleHint
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.mView
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public androidx.lifecycle.LifecycleOwner getViewLifecycleOwner() {
            r2 = this;
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r2.mViewLifecycleOwner
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.lifecycle.LifecycleOwner> getViewLifecycleOwnerLiveData() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r1.mViewLifecycleOwnerLiveData
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L1f
            int r0 = r2.getMinimumMaxLifecycleState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            int r1 = r1.ordinal()
            if (r0 == r1) goto L17
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore(r2)
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
            r1 = this;
            boolean r0 = r1.mHasMenu
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public final void initState() {
            r3 = this;
            r3.initLifecycle()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.mWho = r0
            r0 = 0
            r3.mAdded = r0
            r3.mRemoving = r0
            r3.mFromLayout = r0
            r3.mInLayout = r0
            r3.mRestored = r0
            r3.mBackStackNesting = r0
            r1 = 0
            r3.mFragmentManager = r1
            androidx.fragment.app.FragmentManagerImpl r2 = new androidx.fragment.app.FragmentManagerImpl
            r2.<init>()
            r3.mChildFragmentManager = r2
            r3.mHost = r1
            r3.mFragmentId = r0
            r3.mContainerId = r0
            r3.mTag = r1
            r3.mHidden = r0
            r3.mDetached = r0
            return
    }

    public final boolean isAdded() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mAdded
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean isDetached() {
            r1 = this;
            boolean r0 = r1.mDetached
            return r0
    }

    public final boolean isHidden() {
            r1 = this;
            boolean r0 = r1.mHidden
            return r0
    }

    public final boolean isHideReplaced() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.mIsHideReplaced
            return r0
    }

    public final boolean isInBackStack() {
            r1 = this;
            int r0 = r1.mBackStackNesting
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isInLayout() {
            r1 = this;
            boolean r0 = r1.mInLayout
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L12
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L10
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.isParentMenuVisible(r1)
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public final boolean isPostponed() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.mEnterTransitionPostponed
            return r0
    }

    public final boolean isRemoving() {
            r1 = this;
            boolean r0 = r1.mRemoving
            return r0
    }

    public final boolean isRemovingParent() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.getParentFragment()
            if (r0 == 0) goto L14
            boolean r1 = r0.isRemoving()
            if (r1 != 0) goto L12
            boolean r0 = r0.isRemovingParent()
            if (r0 == 0) goto L14
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public final boolean isResumed() {
            r2 = this;
            int r0 = r2.mState
            r1 = 7
            if (r0 < r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final boolean isStateSaved() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isStateSaved()
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L20
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L20
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L20
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L20
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public void onActivityCreated(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @java.lang.Deprecated
    public void onActivityResult(int r3, int r4, @androidx.annotation.Nullable android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " received the following in onActivityResult(): requestCode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " resultCode: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " data: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L35:
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public void onAttach(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onAttach(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            androidx.fragment.app.FragmentHostCallback<?> r2 = r1.mHost
            if (r2 != 0) goto L9
            r2 = 0
            goto Ld
        L9:
            android.app.Activity r2 = r2.getActivity()
        Ld:
            if (r2 == 0) goto L15
            r0 = 0
            r1.mCalled = r0
            r1.onAttach(r2)
        L15:
            return
    }

    @androidx.annotation.MainThread
    @java.lang.Deprecated
    public void onAttachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.CallSuper
    public void onConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @androidx.annotation.MainThread
    public boolean onContextItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r3) {
            r2 = this;
            r0 = 1
            r2.mCalled = r0
            r2.restoreChildFragmentState(r3)
            androidx.fragment.app.FragmentManager r3 = r2.mChildFragmentManager
            int r1 = r3.mCurState
            if (r1 < r0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L13
            r3.dispatchCreate()
        L13:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public android.view.animation.Animation onCreateAnimation(int r1, boolean r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public android.animation.Animator onCreateAnimator(int r1, boolean r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @androidx.annotation.MainThread
    public void onCreateContextMenu(@androidx.annotation.NonNull android.view.ContextMenu r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @androidx.annotation.MainThread
    public void onCreateOptionsMenu(@androidx.annotation.NonNull android.view.Menu r1, @androidx.annotation.NonNull android.view.MenuInflater r2) {
            r0 = this;
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.MainThread
    public android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r2, @androidx.annotation.Nullable android.view.ViewGroup r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            int r4 = r1.mContentLayoutId
            if (r4 == 0) goto La
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            return r2
        La:
            r2 = 0
            return r2
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onDestroy() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @androidx.annotation.MainThread
    public void onDestroyOptionsMenu() {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onDestroyView() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onDetach() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @androidx.annotation.NonNull
    public android.view.LayoutInflater onGetLayoutInflater(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.getLayoutInflater(r1)
            return r1
    }

    @androidx.annotation.MainThread
    public void onHiddenChanged(boolean r1) {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.UiThread
    @java.lang.Deprecated
    public void onInflate(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.util.AttributeSet r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.UiThread
    public void onInflate(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            androidx.fragment.app.FragmentHostCallback<?> r2 = r1.mHost
            if (r2 != 0) goto L9
            r2 = 0
            goto Ld
        L9:
            android.app.Activity r2 = r2.getActivity()
        Ld:
            if (r2 == 0) goto L15
            r0 = 0
            r1.mCalled = r0
            r1.onInflate(r2, r3, r4)
        L15:
            return
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onMultiWindowModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @androidx.annotation.MainThread
    public boolean onOptionsItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @androidx.annotation.MainThread
    public void onOptionsMenuClosed(@androidx.annotation.NonNull android.view.Menu r1) {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onPause() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @androidx.annotation.MainThread
    public void onPrepareOptionsMenu(@androidx.annotation.NonNull android.view.Menu r1) {
            r0 = this;
            return
    }

    @androidx.annotation.MainThread
    public void onPrimaryNavigationFragmentChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull int[] r3) {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onResume() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @androidx.annotation.MainThread
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r1) {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onStart() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onStop() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @androidx.annotation.MainThread
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            return
    }

    @androidx.annotation.CallSuper
    @androidx.annotation.MainThread
    public void onViewStateRestored(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    public final void performActivityCreated(android.os.Bundle r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.noteStateNotSaved()
            r0 = 3
            r2.mState = r0
            r0 = 0
            r2.mCalled = r0
            r2.onActivityCreated(r3)
            boolean r3 = r2.mCalled
            if (r3 == 0) goto L1b
            r2.restoreViewState()
            androidx.fragment.app.FragmentManager r3 = r2.mChildFragmentManager
            r3.dispatchActivityCreated()
            return
        L1b:
            androidx.fragment.app.SuperNotCalledException r3 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onActivityCreated()"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1)
            r3.<init>(r0)
            throw r3
    }

    public final void performAttach() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r3.mOnPreAttachedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment$OnPreAttachedListener r1 = (androidx.fragment.app.Fragment.OnPreAttachedListener) r1
            r1.onPreAttached()
            goto L6
        L16:
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r3.mOnPreAttachedListeners
            r0.clear()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost
            androidx.fragment.app.FragmentContainer r2 = r3.createFragmentContainer()
            r0.attachController(r1, r2, r3)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            android.content.Context r0 = r0.getContext()
            r3.onAttach(r0)
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            r0.dispatchOnAttachFragment(r3)
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchAttach()
            return
        L43:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void performConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r2) {
            r1 = this;
            r1.onConfigurationChanged(r2)
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.dispatchConfigurationChanged(r2)
            return
    }

    public final boolean performContextItemSelected(@androidx.annotation.NonNull android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L13
            boolean r0 = r1.onContextItemSelected(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r2 = r0.dispatchContextItemSelected(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final void performCreate(android.os.Bundle r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            r0 = 1
            r3.mState = r0
            r1 = 0
            r3.mCalled = r1
            androidx.lifecycle.LifecycleRegistry r1 = r3.mLifecycleRegistry
            androidx.fragment.app.Fragment$5 r2 = new androidx.fragment.app.Fragment$5
            r2.<init>(r3)
            r1.addObserver(r2)
            androidx.savedstate.SavedStateRegistryController r1 = r3.mSavedStateRegistryController
            r1.performRestore(r4)
            r3.onCreate(r4)
            r3.mIsCreated = r0
            boolean r4 = r3.mCalled
            if (r4 == 0) goto L2b
            androidx.lifecycle.LifecycleRegistry r4 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r4.handleLifecycleEvent(r0)
            return
        L2b:
            androidx.fragment.app.SuperNotCalledException r4 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onCreate()"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            r4.<init>(r0)
            throw r4
    }

    public final boolean performCreateOptionsMenu(@androidx.annotation.NonNull android.view.Menu r3, @androidx.annotation.NonNull android.view.MenuInflater r4) {
            r2 = this;
            boolean r0 = r2.mHidden
            r1 = 0
            if (r0 != 0) goto L18
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L11
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L11
            r1 = 1
            r2.onCreateOptionsMenu(r3, r4)
        L11:
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            boolean r3 = r0.dispatchCreateOptionsMenu(r3, r4)
            r1 = r1 | r3
        L18:
            return r1
    }

    public void performCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable android.view.ViewGroup r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.noteStateNotSaved()
            r0 = 1
            r2.mPerformedCreateView = r0
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = new androidx.fragment.app.FragmentViewLifecycleOwner
            androidx.lifecycle.ViewModelStore r1 = r2.getViewModelStore()
            r0.<init>(r2, r1)
            r2.mViewLifecycleOwner = r0
            android.view.View r3 = r2.onCreateView(r3, r4, r5)
            r2.mView = r3
            if (r3 == 0) goto L3d
            androidx.fragment.app.FragmentViewLifecycleOwner r3 = r2.mViewLifecycleOwner
            r3.initialize()
            android.view.View r3 = r2.mView
            androidx.fragment.app.FragmentViewLifecycleOwner r4 = r2.mViewLifecycleOwner
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r4)
            android.view.View r3 = r2.mView
            androidx.fragment.app.FragmentViewLifecycleOwner r4 = r2.mViewLifecycleOwner
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)
            android.view.View r3 = r2.mView
            androidx.fragment.app.FragmentViewLifecycleOwner r4 = r2.mViewLifecycleOwner
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r3, r4)
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r3 = r2.mViewLifecycleOwnerLiveData
            androidx.fragment.app.FragmentViewLifecycleOwner r4 = r2.mViewLifecycleOwner
            r3.setValue(r4)
            goto L48
        L3d:
            androidx.fragment.app.FragmentViewLifecycleOwner r3 = r2.mViewLifecycleOwner
            boolean r3 = r3.isInitialized()
            if (r3 != 0) goto L49
            r3 = 0
            r2.mViewLifecycleOwner = r3
        L48:
            return
        L49:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r3.<init>(r4)
            throw r3
    }

    public final void performDestroy() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchDestroy()
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            r3.mIsCreated = r0
            r3.onDestroy()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L1b
            return
        L1b:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDestroy()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void performDestroyView() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchDestroyView()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
        L22:
            r0 = 1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDestroyView()
            boolean r1 = r3.mCalled
            if (r1 == 0) goto L39
            androidx.loader.app.LoaderManager r1 = androidx.loader.app.LoaderManager.getInstance(r3)
            r1.markForRedelivery()
            r3.mPerformedCreateView = r0
            return
        L39:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void performDetach() {
            r3 = this;
            r0 = -1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDetach()
            r0 = 0
            r3.mLayoutInflater = r0
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L24
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchDestroy()
            androidx.fragment.app.FragmentManagerImpl r0 = new androidx.fragment.app.FragmentManagerImpl
            r0.<init>()
            r3.mChildFragmentManager = r0
        L24:
            return
        L25:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public final android.view.LayoutInflater performGetLayoutInflater(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.onGetLayoutInflater(r1)
            r0.mLayoutInflater = r1
            return r1
    }

    public final void performLowMemory() {
            r1 = this;
            r1.onLowMemory()
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.dispatchLowMemory()
            return
    }

    public final void performMultiWindowModeChanged(boolean r2) {
            r1 = this;
            r1.onMultiWindowModeChanged(r2)
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.dispatchMultiWindowModeChanged(r2)
            return
    }

    public final boolean performOptionsItemSelected(@androidx.annotation.NonNull android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L1b
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto L14
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto L14
            boolean r0 = r1.onOptionsItemSelected(r2)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r2 = r0.dispatchOptionsItemSelected(r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final void performOptionsMenuClosed(@androidx.annotation.NonNull android.view.Menu r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L14
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto Lf
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto Lf
            r1.onOptionsMenuClosed(r2)
        Lf:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.dispatchOptionsMenuClosed(r2)
        L14:
            return
    }

    public final void performPause() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchPause()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
        L10:
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
            r0 = 6
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onPause()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            return
        L25:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onPause()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void performPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            r1.onPictureInPictureModeChanged(r2)
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.dispatchPictureInPictureModeChanged(r2)
            return
    }

    public final boolean performPrepareOptionsMenu(@androidx.annotation.NonNull android.view.Menu r3) {
            r2 = this;
            boolean r0 = r2.mHidden
            r1 = 0
            if (r0 != 0) goto L18
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L11
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L11
            r1 = 1
            r2.onPrepareOptionsMenu(r3)
        L11:
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            boolean r3 = r0.dispatchPrepareOptionsMenu(r3)
            r1 = r1 | r3
        L18:
            return r1
    }

    public final void performPrimaryNavigationFragmentChanged() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            boolean r0 = r0.isPrimaryNavigation(r2)
            java.lang.Boolean r1 = r2.mIsPrimaryNavigationFragment
            if (r1 == 0) goto L10
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L1e
        L10:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.mIsPrimaryNavigationFragment = r1
            r2.onPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.dispatchPrimaryNavigationFragmentChanged()
        L1e:
            return
    }

    public final void performResume() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r1 = 1
            r0.execPendingActions(r1)
            r0 = 7
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onResume()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L2e
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L28
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            r0.handleLifecycleEvent(r1)
        L28:
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchResume()
            return
        L2e:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onResume()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void performStart() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r1 = 1
            r0.execPendingActions(r1)
            r0 = 5
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onStart()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L2e
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L28
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            r0.handleLifecycleEvent(r1)
        L28:
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchStart()
            return
        L2e:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onStart()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void performStop() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchStop()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
        L10:
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 4
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onStop()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            return
        L25:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onStop()"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public void postponeEnterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            r1 = 1
            r0.mEnterTransitionPostponed = r1
            return
    }

    public final void postponeEnterTransition(long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            r1 = 1
            r0.mEnterTransitionPostponed = r1
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.os.Handler r0 = r0.getHandler()
            goto L1d
        L14:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        L1d:
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            long r3 = r5.toMillis(r3)
            r0.postDelayed(r1, r3)
            return
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r2, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            androidx.fragment.app.Fragment$6 r0 = new androidx.fragment.app.Fragment$6
            r0.<init>(r1)
            androidx.activity.result.ActivityResultLauncher r2 = r1.prepareCallInternal(r2, r0, r3)
            return r2
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r2, @androidx.annotation.NonNull androidx.activity.result.ActivityResultRegistry r3, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r4) {
            r1 = this;
            androidx.fragment.app.Fragment$7 r0 = new androidx.fragment.app.Fragment$7
            r0.<init>(r3)
            androidx.activity.result.ActivityResultLauncher r2 = r1.prepareCallInternal(r2, r0, r4)
            return r2
    }

    public void registerForContextMenu(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            r1.setOnCreateContextMenuListener(r0)
            return
    }

    @java.lang.Deprecated
    public final void requestPermissions(@androidx.annotation.NonNull java.lang.String[] r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            r0.launchRequestPermissions(r1, r2, r3)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Fragment "
            java.lang.String r0 = " not attached to Activity"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r0)
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentActivity requireActivity() {
            r3 = this;
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached to an activity."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public final android.os.Bundle requireArguments() {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " does not have any arguments."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public final android.content.Context requireContext() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached to a context."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager requireFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.Object requireHost() {
            r3 = this;
            java.lang.Object r0 = r3.getHost()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached to a host."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.Fragment requireParentFragment() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.getParentFragment()
            if (r0 != 0) goto L3b
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Fragment "
            if (r0 != 0) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = " is not attached to any Fragment or host"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " is not a child Fragment, it is directly attached to "
            r2.append(r1)
            android.content.Context r1 = r3.getContext()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L3b:
            return r0
    }

    @androidx.annotation.NonNull
    public final android.view.View requireView() {
            r3 = this;
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not return a View from onCreateView() or this was called before onCreateView()."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public final void restoreChildFragmentState(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            if (r2 == 0) goto L14
            java.lang.String r0 = "android:support:fragments"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            if (r2 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.restoreSaveState(r2)
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r2.dispatchCreate()
        L14:
            return
    }

    public void setAllowEnterTransitionOverlap(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.mAllowEnterTransitionOverlap = r2
            return
    }

    public void setAllowReturnTransitionOverlap(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.mAllowReturnTransitionOverlap = r2
            return
    }

    public final void setAnimatingAway(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mAnimatingAway = r2
            return
    }

    public final void setAnimations(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mEnterAnim = r2
            androidx.fragment.app.Fragment$AnimationInfo r2 = r1.ensureAnimationInfo()
            r2.mExitAnim = r3
            androidx.fragment.app.Fragment$AnimationInfo r2 = r1.ensureAnimationInfo()
            r2.mPopEnterAnim = r4
            androidx.fragment.app.Fragment$AnimationInfo r2 = r1.ensureAnimationInfo()
            r2.mPopExitAnim = r5
            return
    }

    public final void setAnimator(android.animation.Animator r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mAnimator = r2
            return
    }

    public void setArguments(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 == 0) goto L13
            boolean r0 = r1.isStateSaved()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added and state has been saved"
            r2.<init>(r0)
            throw r2
        L13:
            r1.mArguments = r2
            return
    }

    public void setEnterSharedElementCallback(@androidx.annotation.Nullable androidx.core.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mEnterTransitionCallback = r2
            return
    }

    public void setEnterTransition(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mEnterTransition = r2
            return
    }

    public void setExitSharedElementCallback(@androidx.annotation.Nullable androidx.core.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mExitTransitionCallback = r2
            return
    }

    public void setExitTransition(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mExitTransition = r2
            return
    }

    public final void setFocusedView(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mFocusedView = r2
            return
    }

    public void setHasOptionsMenu(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHasMenu
            if (r0 == r2) goto L17
            r1.mHasMenu = r2
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L17
            boolean r2 = r1.isHidden()
            if (r2 != 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r2 = r1.mHost
            r2.onSupportInvalidateOptionsMenu()
        L17:
            return
    }

    public final void setHideReplaced(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mIsHideReplaced = r2
            return
    }

    public void setInitialSavedState(@androidx.annotation.Nullable androidx.fragment.app.Fragment.SavedState r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 != 0) goto Lf
            if (r2 == 0) goto Lb
            android.os.Bundle r2 = r2.mState
            if (r2 == 0) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.mSavedFragmentState = r2
            return
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
    }

    public void setMenuVisibility(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMenuVisible
            if (r0 == r2) goto L1b
            r1.mMenuVisible = r2
            boolean r2 = r1.mHasMenu
            if (r2 == 0) goto L1b
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L1b
            boolean r2 = r1.isHidden()
            if (r2 != 0) goto L1b
            androidx.fragment.app.FragmentHostCallback<?> r2 = r1.mHost
            r2.onSupportInvalidateOptionsMenu()
        L1b:
            return
    }

    public final void setNextTransition(int r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L7
            if (r2 != 0) goto L7
            return
        L7:
            r1.ensureAnimationInfo()
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            r0.mNextTransition = r2
            return
    }

    public final void setOnStartEnterTransitionListener(androidx.fragment.app.Fragment.OnStartEnterTransitionListener r3) {
            r2 = this;
            r2.ensureAnimationInfo()
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$OnStartEnterTransitionListener r1 = r0.mStartEnterTransitionListener
            if (r3 != r1) goto La
            return
        La:
            if (r3 == 0) goto L26
            if (r1 != 0) goto Lf
            goto L26
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Trying to set a replacement startPostponedEnterTransition on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L26:
            boolean r1 = r0.mEnterTransitionPostponed
            if (r1 == 0) goto L2c
            r0.mStartEnterTransitionListener = r3
        L2c:
            if (r3 == 0) goto L31
            r3.startListening()
        L31:
            return
    }

    public final void setPopDirection(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L5
            return
        L5:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mIsPop = r2
            return
    }

    public final void setPostOnViewCreatedAlpha(float r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mPostOnViewCreatedAlpha = r2
            return
    }

    public void setReenterTransition(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mReenterTransition = r2
            return
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean r2) {
            r1 = this;
            r1.mRetainInstance = r2
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 == 0) goto L10
            if (r2 == 0) goto Lc
            r0.addRetainedFragment(r1)
            goto L13
        Lc:
            r0.removeRetainedFragment(r1)
            goto L13
        L10:
            r2 = 1
            r1.mRetainInstanceChangedWhileDetached = r2
        L13:
            return
    }

    public void setReturnTransition(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mReturnTransition = r2
            return
    }

    public void setSharedElementEnterTransition(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mSharedElementEnterTransition = r2
            return
    }

    public final void setSharedElementNames(@androidx.annotation.Nullable java.util.ArrayList<java.lang.String> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.String> r3) {
            r1 = this;
            r1.ensureAnimationInfo()
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            r0.mSharedElementSourceNames = r2
            r0.mSharedElementTargetNames = r3
            return
    }

    public void setSharedElementReturnTransition(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mSharedElementReturnTransition = r2
            return
    }

    @java.lang.Deprecated
    public void setTargetFragment(@androidx.annotation.Nullable androidx.fragment.app.Fragment r4, int r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            r1 = 0
            if (r4 == 0) goto L8
            androidx.fragment.app.FragmentManager r2 = r4.mFragmentManager
            goto L9
        L8:
            r2 = r1
        L9:
            if (r0 == 0) goto L1e
            if (r2 == 0) goto L1e
            if (r0 != r2) goto L10
            goto L1e
        L10:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " must share the same FragmentManager to be set as a target fragment"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r5.<init>(r4)
            throw r5
        L1e:
            r0 = r4
        L1f:
            if (r0 == 0) goto L50
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L2c
            androidx.fragment.app.Fragment r0 = r0.getTargetFragment()
            goto L1f
        L2c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " as the target of "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " would create a target cycle"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L50:
            if (r4 != 0) goto L57
            r3.mTargetWho = r1
            r3.mTarget = r1
            goto L6a
        L57:
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L66
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L66
            java.lang.String r4 = r4.mWho
            r3.mTargetWho = r4
            r3.mTarget = r1
            goto L6a
        L66:
            r3.mTargetWho = r1
            r3.mTarget = r4
        L6a:
            r3.mTargetRequestCode = r5
            return
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean r4) {
            r3 = this;
            boolean r0 = r3.mUserVisibleHint
            r1 = 5
            if (r0 != 0) goto L22
            if (r4 == 0) goto L22
            int r0 = r3.mState
            if (r0 >= r1) goto L22
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L22
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L22
            boolean r0 = r3.mIsCreated
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.FragmentStateManager r2 = r0.createOrGetFragmentStateManager(r3)
            r0.performPendingDeferredStart(r2)
        L22:
            r3.mUserVisibleHint = r4
            int r0 = r3.mState
            if (r0 >= r1) goto L2c
            if (r4 != 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r3.mDeferStart = r0
            android.os.Bundle r0 = r3.mSavedFragmentState
            if (r0 == 0) goto L39
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.mSavedUserVisibleHint = r4
        L39:
            return
    }

    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto L9
            boolean r2 = r0.onShouldShowRequestPermissionRationale(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void startActivity(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r2) {
            r1 = this;
            r0 = 0
            r1.startActivity(r2, r0)
            return
    }

    public void startActivity(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 == 0) goto L9
            r1 = -1
            r0.onStartActivityFromFragment(r2, r3, r1, r4)
            return
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Fragment "
            java.lang.String r0 = " not attached to Activity"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r0)
            r3.<init>(r4)
            throw r3
    }

    @java.lang.Deprecated
    public void startActivityForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r2, int r3) {
            r1 = this;
            r0 = 0
            r1.startActivityForResult(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public void startActivityForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r2, int r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            r0.launchStartActivityForResult(r1, r2, r3, r4)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Fragment "
            java.lang.String r4 = " not attached to Activity"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1, r4)
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender r11, int r12, @androidx.annotation.Nullable android.content.Intent r13, int r14, int r15, int r16, @androidx.annotation.Nullable android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r10 = this;
            r9 = r10
            androidx.fragment.app.FragmentHostCallback<?> r0 = r9.mHost
            java.lang.String r1 = "Fragment "
            if (r0 == 0) goto L5f
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " received the following in startIntentSenderForResult() requestCode: "
            r0.append(r1)
            r3 = r12
            r0.append(r12)
            java.lang.String r1 = " IntentSender: "
            r0.append(r1)
            r2 = r11
            r0.append(r11)
            java.lang.String r1 = " fillInIntent: "
            r0.append(r1)
            r4 = r13
            r0.append(r13)
            java.lang.String r1 = " options: "
            r0.append(r1)
            r8 = r17
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            goto L4d
        L48:
            r2 = r11
            r3 = r12
            r4 = r13
            r8 = r17
        L4d:
            androidx.fragment.app.FragmentManager r0 = r10.getParentFragmentManager()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.launchStartIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = " not attached to Activity"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r10, r2)
            r0.<init>(r1)
            throw r0
    }

    public void startPostponedEnterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 == 0) goto L3c
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            boolean r0 = r0.mEnterTransitionPostponed
            if (r0 != 0) goto Ld
            goto L3c
        Ld:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L19
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            r1 = 0
            r0.mEnterTransitionPostponed = r1
            goto L3c
        L19:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L38
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            android.os.Handler r0 = r0.getHandler()
            androidx.fragment.app.Fragment$2 r1 = new androidx.fragment.app.Fragment$2
            r1.<init>(r2)
            r0.postAtFrontOfQueue(r1)
            goto L3c
        L38:
            r0 = 1
            r2.callStartTransitionListener(r0)
        L3c:
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            int r1 = r2.mFragmentId
            if (r1 == 0) goto L45
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.mFragmentId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L45:
            java.lang.String r1 = r2.mTag
            if (r1 == 0) goto L53
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.mTag
            r0.append(r1)
        L53:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterForContextMenu(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            r2.setOnCreateContextMenuListener(r0)
            return
    }
}
