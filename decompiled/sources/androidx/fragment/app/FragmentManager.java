package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    public static boolean USE_STATE_MANAGER = true;
    public java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    public int mCurState;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private java.lang.Runnable mExecCommit;
    private boolean mExecutingActions;
    private java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> mExitAnimationCancellationSignals;
    private androidx.fragment.app.FragmentFactory mFragmentFactory;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private final androidx.fragment.app.FragmentTransition.Callback mFragmentTransitionCallback;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory;
    public java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private androidx.fragment.app.Fragment mParent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> mPostponedTransactions;

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners;
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults;
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;












    public interface BackStackEntry {
        @androidx.annotation.Nullable
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @androidx.annotation.StringRes
        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @androidx.annotation.Nullable
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @androidx.annotation.StringRes
        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @androidx.annotation.Nullable
        java.lang.String getName();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        public FragmentIntentSenderContract() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(@androidx.annotation.NonNull android.content.Context r4, androidx.activity.result.IntentSenderRequest r5) {
                r3 = this;
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r4.<init>(r0)
                android.content.Intent r0 = r5.getFillInIntent()
                if (r0 == 0) goto L42
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L42
                r4.putExtra(r1, r2)
                r0.removeExtra(r1)
                r1 = 0
                java.lang.String r2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                boolean r0 = r0.getBooleanExtra(r2, r1)
                if (r0 == 0) goto L42
                androidx.activity.result.IntentSenderRequest$Builder r0 = new androidx.activity.result.IntentSenderRequest$Builder
                android.content.IntentSender r1 = r5.getIntentSender()
                r0.<init>(r1)
                r1 = 0
                androidx.activity.result.IntentSenderRequest$Builder r0 = r0.setFillInIntent(r1)
                int r1 = r5.getFlagsValues()
                int r5 = r5.getFlagsMask()
                androidx.activity.result.IntentSenderRequest$Builder r5 = r0.setFlags(r1, r5)
                androidx.activity.result.IntentSenderRequest r5 = r5.build()
            L42:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r4.putExtra(r0, r5)
                r5 = 2
                boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r5 == 0) goto L64
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "CreateIntent created the following intent: "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r5)
            L64:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(@androidx.annotation.NonNull android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @androidx.annotation.NonNull
        public androidx.activity.result.ActivityResult parseResult(int r2, @androidx.annotation.Nullable android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, @androidx.annotation.Nullable android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void onFragmentActivityCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentAttached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentDestroyed(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentDetached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPaused(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPreAttached(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentPreCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentResumed(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentSaveInstanceState(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentStarted(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentStopped(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentViewCreated(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.os.Bundle r4) {
                r0 = this;
                return
        }

        public void onFragmentViewDestroyed(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = null;
        public int mRequestCode;
        public java.lang.String mWho;


        static {
                androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
                r0.<init>()
                androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR = r0
                return
        }

        public LaunchedFragmentInfo(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mWho = r0
                int r2 = r2.readInt()
                r1.mRequestCode = r2
                return
        }

        public LaunchedFragmentInfo(@androidx.annotation.NonNull java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mWho = r1
                r0.mRequestCode = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.mWho
                r1.writeString(r2)
                int r2 = r0.mRequestCode
                r1.writeInt(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        public LifecycleAwareResultListener(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle r1, @androidx.annotation.NonNull androidx.fragment.app.FragmentResultListener r2, @androidx.annotation.NonNull androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mListener = r2
                r0.mObserver = r3
                return
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r2 = r0.isAtLeast(r2)
                return r2
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r1 = this;
                androidx.fragment.app.FragmentResultListener r0 = r1.mListener
                r0.onFragmentResult(r2, r3)
                return
        }

        public void removeObserver() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                return
        }
    }

    public interface OnBackStackChangedListener {
        @androidx.annotation.MainThread
        void onBackStackChanged();
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OpGenerator {
        boolean generateOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r2);
    }

    public class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        public final int mFlags;
        public final int mId;
        public final java.lang.String mName;
        public final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        public PopBackStackState(@androidx.annotation.Nullable androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                r0.mId = r3
                r0.mFlags = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r8) {
                r6 = this;
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                if (r0 == 0) goto L1a
                int r1 = r6.mId
                if (r1 >= 0) goto L1a
                java.lang.String r1 = r6.mName
                if (r1 != 0) goto L1a
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r0 = r0.popBackStackImmediate()
                if (r0 == 0) goto L1a
                r7 = 0
                return r7
            L1a:
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                java.lang.String r3 = r6.mName
                int r4 = r6.mId
                int r5 = r6.mFlags
                r1 = r7
                r2 = r8
                boolean r7 = r0.popBackStackState(r1, r2, r3, r4, r5)
                return r7
        }
    }

    public static class StartEnterTransitionListener implements androidx.fragment.app.Fragment.OnStartEnterTransitionListener {
        public final boolean mIsBack;
        private int mNumPostponed;
        public final androidx.fragment.app.BackStackRecord mRecord;

        public StartEnterTransitionListener(@androidx.annotation.NonNull androidx.fragment.app.BackStackRecord r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mIsBack = r2
                r0.mRecord = r1
                return
        }

        public final void completeTransaction() {
                r5 = this;
                int r0 = r5.mNumPostponed
                r1 = 1
                if (r0 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                androidx.fragment.app.BackStackRecord r2 = r5.mRecord
                androidx.fragment.app.FragmentManager r2 = r2.mManager
                java.util.List r2 = r2.getFragments()
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L30
                java.lang.Object r3 = r2.next()
                androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
                r4 = 0
                r3.setOnStartEnterTransitionListener(r4)
                if (r0 == 0) goto L14
                boolean r4 = r3.isPostponed()
                if (r4 == 0) goto L14
                r3.startPostponedEnterTransition()
                goto L14
            L30:
                androidx.fragment.app.BackStackRecord r2 = r5.mRecord
                androidx.fragment.app.FragmentManager r3 = r2.mManager
                boolean r4 = r5.mIsBack
                r0 = r0 ^ r1
                r3.completeExecute(r2, r4, r0, r1)
                return
        }

        public boolean isReady() {
                r1 = this;
                int r0 = r1.mNumPostponed
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void onStartEnterTransition() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + (-1)
                r1.mNumPostponed = r0
                if (r0 == 0) goto L9
                return
            L9:
                androidx.fragment.app.BackStackRecord r0 = r1.mRecord
                androidx.fragment.app.FragmentManager r0 = r0.mManager
                r0.scheduleCommit()
                return
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void startListening() {
                r1 = this;
                int r0 = r1.mNumPostponed
                int r0 = r0 + 1
                r1.mNumPostponed = r0
                return
        }
    }

    public FragmentManager() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingActions = r0
            androidx.fragment.app.FragmentStore r0 = new androidx.fragment.app.FragmentStore
            r0.<init>()
            r2.mFragmentStore = r0
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = new androidx.fragment.app.FragmentLayoutInflaterFactory
            r0.<init>(r2)
            r2.mLayoutInflaterFactory = r0
            androidx.fragment.app.FragmentManager$1 r0 = new androidx.fragment.app.FragmentManager$1
            r0.<init>(r2)
            r2.mOnBackPressedCallback = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.mBackStackIndex = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResults = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResultListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mExitAnimationCancellationSignals = r0
            androidx.fragment.app.FragmentManager$2 r0 = new androidx.fragment.app.FragmentManager$2
            r0.<init>(r2)
            r2.mFragmentTransitionCallback = r0
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
            r0.<init>(r2)
            r2.mLifecycleCallbacksDispatcher = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mOnAttachListeners = r0
            r0 = -1
            r2.mCurState = r0
            r0 = 0
            r2.mFragmentFactory = r0
            androidx.fragment.app.FragmentManager$3 r1 = new androidx.fragment.app.FragmentManager$3
            r1.<init>(r2)
            r2.mHostFragmentFactory = r1
            r2.mSpecialEffectsControllerFactory = r0
            androidx.fragment.app.FragmentManager$4 r0 = new androidx.fragment.app.FragmentManager$4
            r0.<init>()
            r2.mDefaultSpecialEffectsControllerFactory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mLaunchedFragments = r0
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>(r2)
            r2.mExecCommit = r0
            return
    }

    public static /* synthetic */ java.util.Map access$000(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r0.mResults
            return r0
    }

    public static /* synthetic */ java.util.Map access$100(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r0.mResultListeners
            return r0
    }

    public static /* synthetic */ androidx.fragment.app.FragmentStore access$200(androidx.fragment.app.FragmentManager r0) {
            androidx.fragment.app.FragmentStore r0 = r0.mFragmentStore
            return r0
    }

    private void addAddedFragments(@androidx.annotation.NonNull androidx.collection.ArraySet<androidx.fragment.app.Fragment> r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            r1 = 5
            int r0 = java.lang.Math.min(r0, r1)
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getFragments()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r3 = r2.mState
            if (r3 >= r0) goto L15
            r4.moveToState(r2, r0)
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L15
            boolean r3 = r2.mHidden
            if (r3 != 0) goto L15
            boolean r3 = r2.mIsNewlyAdded
            if (r3 == 0) goto L15
            r5.add(r2)
            goto L15
        L38:
            return
    }

    private void cancelExitAnimation(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r4)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L29
            java.util.Iterator r1 = r0.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.core.os.CancellationSignal r2 = (androidx.core.os.CancellationSignal) r2
            r2.cancel()
            goto Le
        L1e:
            r0.clear()
            r3.destroyFragmentView(r4)
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r3.mExitAnimationCancellationSignals
            r0.remove(r4)
        L29:
            return
    }

    private void checkStateLoss() {
            r2 = this;
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    private void cleanupExec() {
            r1 = this;
            r0 = 0
            r1.mExecutingActions = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mTmpRecords
            r0.clear()
            return
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getActiveFragmentStateManagers()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L11
            androidx.fragment.app.SpecialEffectsControllerFactory r3 = r4.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto L11
        L31:
            return r0
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, int r6, int r7) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r6 >= r7) goto L36
            java.lang.Object r1 = r5.get(r6)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L13
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L13
            androidx.fragment.app.SpecialEffectsControllerFactory r3 = r4.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto L13
        L33:
            int r6 = r6 + 1
            goto L5
        L36:
            return r0
    }

    private void completeShowHideFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r8) {
            r7 = this;
            android.view.View r0 = r8.mView
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L77
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            android.content.Context r0 = r0.getContext()
            boolean r3 = r8.mHidden
            r3 = r3 ^ r2
            boolean r4 = r8.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r8, r3, r4)
            if (r0 == 0) goto L4d
            android.animation.Animator r3 = r0.animator
            if (r3 == 0) goto L4d
            android.view.View r4 = r8.mView
            r3.setTarget(r4)
            boolean r3 = r8.mHidden
            if (r3 == 0) goto L42
            boolean r3 = r8.isHideReplaced()
            if (r3 == 0) goto L30
            r8.setHideReplaced(r1)
            goto L47
        L30:
            android.view.ViewGroup r3 = r8.mContainer
            android.view.View r4 = r8.mView
            r3.startViewTransition(r4)
            android.animation.Animator r5 = r0.animator
            androidx.fragment.app.FragmentManager$7 r6 = new androidx.fragment.app.FragmentManager$7
            r6.<init>(r3, r4, r8)
            r5.addListener(r6)
            goto L47
        L42:
            android.view.View r3 = r8.mView
            r3.setVisibility(r1)
        L47:
            android.animation.Animator r0 = r0.animator
            r0.start()
            goto L77
        L4d:
            if (r0 == 0) goto L5b
            android.view.View r3 = r8.mView
            android.view.animation.Animation r4 = r0.animation
            r3.startAnimation(r4)
            android.view.animation.Animation r0 = r0.animation
            r0.start()
        L5b:
            boolean r0 = r8.mHidden
            if (r0 == 0) goto L68
            boolean r0 = r8.isHideReplaced()
            if (r0 != 0) goto L68
            r0 = 8
            goto L69
        L68:
            r0 = 0
        L69:
            android.view.View r3 = r8.mView
            r3.setVisibility(r0)
            boolean r0 = r8.isHideReplaced()
            if (r0 == 0) goto L77
            r8.setHideReplaced(r1)
        L77:
            boolean r0 = r8.mAdded
            if (r0 == 0) goto L83
            boolean r0 = r7.isMenuAvailable(r8)
            if (r0 == 0) goto L83
            r7.mNeedMenuInvalidate = r2
        L83:
            r8.mHiddenChanged = r1
            boolean r0 = r8.mHidden
            r8.onHiddenChanged(r0)
            return
    }

    private void destroyFragmentView(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            r4.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mLifecycleCallbacksDispatcher
            r1 = 0
            r0.dispatchOnFragmentViewDestroyed(r4, r1)
            r0 = 0
            r4.mContainer = r0
            r4.mView = r0
            r4.mViewLifecycleOwner = r0
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r2 = r4.mViewLifecycleOwnerLiveData
            r2.setValue(r0)
            r4.mInLayout = r1
            return
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(@androidx.annotation.Nullable androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    private void dispatchStateChange(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.mExecutingActions = r0     // Catch: java.lang.Throwable -> L2e
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore     // Catch: java.lang.Throwable -> L2e
            r2.dispatchStateChange(r4)     // Catch: java.lang.Throwable -> L2e
            r3.moveToState(r4, r1)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L28
            java.util.Set r4 = r3.collectAllSpecialEffectsController()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L18:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L28
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L2e
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2     // Catch: java.lang.Throwable -> L2e
            r2.forceCompleteAllOperations()     // Catch: java.lang.Throwable -> L2e
            goto L18
        L28:
            r3.mExecutingActions = r1
            r3.execPendingActions(r0)
            return
        L2e:
            r4 = move-exception
            r3.mExecutingActions = r1
            throw r4
    }

    private void doPendingDeferredStart() {
            r1 = this;
            boolean r0 = r1.mHavePendingDeferredStart
            if (r0 == 0) goto La
            r0 = 0
            r1.mHavePendingDeferredStart = r0
            r1.startPendingDeferredFragments()
        La:
            return
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean r0) {
            androidx.fragment.app.FragmentManager.DEBUG = r0
            return
    }

    @androidx.fragment.app.FragmentStateManagerControl
    public static void enableNewStateManager(boolean r0) {
            androidx.fragment.app.FragmentManager.USE_STATE_MANAGER = r0
            return
    }

    private void endAnimatingAwayFragments() {
            r2 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1c
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forceCompleteAllOperations()
            goto Lc
        L1c:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L41
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r2.cancelExitAnimation(r1)
            r2.moveToState(r1)
            goto L2e
        L41:
            return
    }

    private void ensureExecReady(boolean r3) {
            r2 = this;
            boolean r0 = r2.mExecutingActions
            if (r0 != 0) goto L5a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1c
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L52
            if (r3 != 0) goto L31
            r2.checkStateLoss()
        L31:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r2.mTmpRecords
            if (r3 != 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpRecords = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpIsPop = r3
        L43:
            r3 = 1
            r2.mExecutingActions = r3
            r3 = 0
            r0 = 0
            r2.executePostponedTransaction(r0, r0)     // Catch: java.lang.Throwable -> L4e
            r2.mExecutingActions = r3
            return
        L4e:
            r0 = move-exception
            r2.mExecutingActions = r3
            throw r0
        L52:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L5a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    private static void executeOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r4, int r5, int r6) {
        L0:
            if (r5 >= r6) goto L2c
            java.lang.Object r0 = r3.get(r5)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            java.lang.Object r1 = r4.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == 0) goto L23
            r1 = -1
            r0.bumpBackStackNesting(r1)
            int r1 = r6 + (-1)
            if (r5 != r1) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r0.executePopOps(r2)
            goto L29
        L23:
            r0.bumpBackStackNesting(r2)
            r0.executeOps()
        L29:
            int r5 = r5 + 1
            goto L0
        L2c:
            return
    }

    private void executeOpsTogether(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r21, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r22, int r23, int r24) {
            r20 = this;
            r6 = r20
            r15 = r21
            r5 = r22
            r4 = r23
            r3 = r24
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r2 = r0.mReorderingAllowed
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mTmpAddedFragments = r0
            goto L21
        L1e:
            r0.clear()
        L21:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            java.util.List r1 = r1.getFragments()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r20.getPrimaryNavigationFragment()
            r7 = r4
            r16 = 0
        L33:
            r14 = 1
            if (r7 >= r3) goto L16e
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r11 = 3
            if (r9 != 0) goto L123
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.mTmpAddedFragments
            r12 = 0
        L4c:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r13 = r8.mOps
            int r13 = r13.size()
            if (r12 >= r13) goto L121
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r13 = r8.mOps
            java.lang.Object r13 = r13.get(r12)
            androidx.fragment.app.FragmentTransaction$Op r13 = (androidx.fragment.app.FragmentTransaction.Op) r13
            int r1 = r13.mCmd
            if (r1 == r14) goto L114
            r10 = 2
            r14 = 9
            if (r1 == r10) goto L9a
            if (r1 == r11) goto L81
            r10 = 6
            if (r1 == r10) goto L81
            r10 = 7
            if (r1 == r10) goto L114
            r10 = 8
            if (r1 == r10) goto L72
            goto L97
        L72:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r8.mOps
            androidx.fragment.app.FragmentTransaction$Op r10 = new androidx.fragment.app.FragmentTransaction$Op
            r10.<init>(r14, r0)
            r1.add(r12, r10)
            int r12 = r12 + 1
            androidx.fragment.app.Fragment r0 = r13.mFragment
            goto L97
        L81:
            androidx.fragment.app.Fragment r1 = r13.mFragment
            r9.remove(r1)
            androidx.fragment.app.Fragment r1 = r13.mFragment
            if (r1 != r0) goto L97
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            androidx.fragment.app.FragmentTransaction$Op r10 = new androidx.fragment.app.FragmentTransaction$Op
            r10.<init>(r14, r1)
            r0.add(r12, r10)
            int r12 = r12 + 1
            r0 = 0
        L97:
            r4 = 1
            goto L11a
        L9a:
            androidx.fragment.app.Fragment r1 = r13.mFragment
            int r10 = r1.mContainerId
            int r18 = r9.size()
            r17 = 1
            int r18 = r18 + (-1)
            r11 = r18
            r18 = 0
        Laa:
            if (r11 < 0) goto L103
            java.lang.Object r19 = r9.get(r11)
            r14 = r19
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r4 = r14.mContainerId
            if (r4 != r10) goto Lf8
            if (r14 != r1) goto Lbf
            r19 = r10
            r18 = 1
            goto Lfa
        Lbf:
            if (r14 != r0) goto Ld3
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            androidx.fragment.app.FragmentTransaction$Op r4 = new androidx.fragment.app.FragmentTransaction$Op
            r19 = r10
            r10 = 9
            r4.<init>(r10, r14)
            r0.add(r12, r4)
            int r12 = r12 + 1
            r0 = 0
            goto Ld7
        Ld3:
            r19 = r10
            r10 = 9
        Ld7:
            androidx.fragment.app.FragmentTransaction$Op r4 = new androidx.fragment.app.FragmentTransaction$Op
            r10 = 3
            r4.<init>(r10, r14)
            int r10 = r13.mEnterAnim
            r4.mEnterAnim = r10
            int r10 = r13.mPopEnterAnim
            r4.mPopEnterAnim = r10
            int r10 = r13.mExitAnim
            r4.mExitAnim = r10
            int r10 = r13.mPopExitAnim
            r4.mPopExitAnim = r10
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r8.mOps
            r10.add(r12, r4)
            r9.remove(r14)
            r4 = 1
            int r12 = r12 + r4
            goto Lfa
        Lf8:
            r19 = r10
        Lfa:
            int r11 = r11 + (-1)
            r4 = r23
            r10 = r19
            r14 = 9
            goto Laa
        L103:
            if (r18 == 0) goto L10d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r8.mOps
            r1.remove(r12)
            int r12 = r12 + (-1)
            goto L97
        L10d:
            r4 = 1
            r13.mCmd = r4
            r9.add(r1)
            goto L11a
        L114:
            r4 = 1
            androidx.fragment.app.Fragment r1 = r13.mFragment
            r9.add(r1)
        L11a:
            int r12 = r12 + r4
            r4 = r23
            r11 = 3
            r14 = 1
            goto L4c
        L121:
            r4 = 1
            goto L15c
        L123:
            r4 = 1
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mTmpAddedFragments
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r9 = r8.mOps
            int r9 = r9.size()
            int r9 = r9 - r4
        L12d:
            if (r9 < 0) goto L15c
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r8.mOps
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.FragmentTransaction$Op r10 = (androidx.fragment.app.FragmentTransaction.Op) r10
            int r11 = r10.mCmd
            if (r11 == r4) goto L152
            r4 = 3
            if (r11 == r4) goto L14c
            switch(r11) {
                case 6: goto L14c;
                case 7: goto L153;
                case 8: goto L14a;
                case 9: goto L147;
                case 10: goto L142;
                default: goto L141;
            }
        L141:
            goto L158
        L142:
            androidx.lifecycle.Lifecycle$State r11 = r10.mOldMaxState
            r10.mCurrentMaxState = r11
            goto L158
        L147:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            goto L158
        L14a:
            r0 = 0
            goto L158
        L14c:
            androidx.fragment.app.Fragment r10 = r10.mFragment
            r1.add(r10)
            goto L158
        L152:
            r4 = 3
        L153:
            androidx.fragment.app.Fragment r10 = r10.mFragment
            r1.remove(r10)
        L158:
            int r9 = r9 + (-1)
            r4 = 1
            goto L12d
        L15c:
            if (r16 != 0) goto L166
            boolean r1 = r8.mAddToBackStack
            if (r1 == 0) goto L163
            goto L166
        L163:
            r16 = 0
            goto L168
        L166:
            r16 = 1
        L168:
            int r7 = r7 + 1
            r4 = r23
            goto L33
        L16e:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            r0.clear()
            if (r2 != 0) goto L1c7
            int r0 = r6.mCurState
            r1 = 1
            if (r0 < r1) goto L1c7
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L1af
            r0 = r23
        L180:
            if (r0 >= r3) goto L1c7
            java.lang.Object r4 = r15.get(r0)
            androidx.fragment.app.BackStackRecord r4 = (androidx.fragment.app.BackStackRecord) r4
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r4.mOps
            java.util.Iterator r4 = r4.iterator()
        L18e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1ac
            java.lang.Object r7 = r4.next()
            androidx.fragment.app.FragmentTransaction$Op r7 = (androidx.fragment.app.FragmentTransaction.Op) r7
            androidx.fragment.app.Fragment r7 = r7.mFragment
            if (r7 == 0) goto L18e
            androidx.fragment.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L18e
            androidx.fragment.app.FragmentStateManager r7 = r6.createOrGetFragmentStateManager(r7)
            androidx.fragment.app.FragmentStore r8 = r6.mFragmentStore
            r8.makeActive(r7)
            goto L18e
        L1ac:
            int r0 = r0 + 1
            goto L180
        L1af:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            android.content.Context r7 = r0.getContext()
            androidx.fragment.app.FragmentContainer r8 = r6.mContainer
            r13 = 0
            androidx.fragment.app.FragmentTransition$Callback r14 = r6.mFragmentTransitionCallback
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r4 = 1
            androidx.fragment.app.FragmentTransition.startTransitions(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1c8
        L1c7:
            r4 = 1
        L1c8:
            executeOps(r21, r22, r23, r24)
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 == 0) goto L24f
            int r0 = r3 + (-1)
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r23
        L1dd:
            if (r1 >= r3) goto L227
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            if (r0 == 0) goto L206
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r7 = r2.mOps
            int r7 = r7.size()
            int r7 = r7 - r4
        L1ee:
            if (r7 < 0) goto L224
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r8 = r2.mOps
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.Op) r8
            androidx.fragment.app.Fragment r8 = r8.mFragment
            if (r8 == 0) goto L203
            androidx.fragment.app.FragmentStateManager r8 = r6.createOrGetFragmentStateManager(r8)
            r8.moveToExpectedState()
        L203:
            int r7 = r7 + (-1)
            goto L1ee
        L206:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r2.mOps
            java.util.Iterator r2 = r2.iterator()
        L20c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L224
            java.lang.Object r7 = r2.next()
            androidx.fragment.app.FragmentTransaction$Op r7 = (androidx.fragment.app.FragmentTransaction.Op) r7
            androidx.fragment.app.Fragment r7 = r7.mFragment
            if (r7 == 0) goto L20c
            androidx.fragment.app.FragmentStateManager r7 = r6.createOrGetFragmentStateManager(r7)
            r7.moveToExpectedState()
            goto L20c
        L224:
            int r1 = r1 + 1
            goto L1dd
        L227:
            int r1 = r6.mCurState
            r6.moveToState(r1, r4)
            r7 = r23
            java.util.Set r1 = r6.collectChangedControllers(r15, r7, r3)
            java.util.Iterator r1 = r1.iterator()
        L236:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24b
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.mOperationDirectionIsPop = r0
            r2.markPostponedState()
            r2.executePendingOperations()
            goto L236
        L24b:
            r0 = r3
            r3 = r5
            goto L2a7
        L24f:
            r7 = r23
            if (r2 == 0) goto L273
            androidx.collection.ArraySet r8 = new androidx.collection.ArraySet
            r8.<init>()
            r6.addAddedFragments(r8)
            r0 = r20
            r1 = r21
            r9 = r2
            r2 = r22
            r14 = r3
            r3 = r23
            r13 = r7
            r12 = 1
            r4 = r24
            r11 = r5
            r5 = r8
            int r0 = r0.postponePostponableTransactions(r1, r2, r3, r4, r5)
            r6.makeRemovedFragmentsInvisible(r8)
            goto L279
        L273:
            r9 = r2
            r14 = r3
            r11 = r5
            r13 = r7
            r12 = 1
            r0 = r14
        L279:
            if (r0 == r13) goto L2a5
            if (r9 == 0) goto L2a5
            int r1 = r6.mCurState
            if (r1 < r12) goto L29c
            androidx.fragment.app.FragmentHostCallback<?> r1 = r6.mHost
            android.content.Context r7 = r1.getContext()
            androidx.fragment.app.FragmentContainer r8 = r6.mContainer
            r1 = 1
            androidx.fragment.app.FragmentTransition$Callback r2 = r6.mFragmentTransitionCallback
            r9 = r21
            r10 = r22
            r3 = r11
            r11 = r23
            r4 = 1
            r12 = r0
            r13 = r1
            r0 = r14
            r14 = r2
            androidx.fragment.app.FragmentTransition.startTransitions(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L29f
        L29c:
            r3 = r11
            r0 = r14
            r4 = 1
        L29f:
            int r1 = r6.mCurState
            r6.moveToState(r1, r4)
            goto L2a7
        L2a5:
            r3 = r11
            r0 = r14
        L2a7:
            r1 = r23
        L2a9:
            if (r1 >= r0) goto L2ca
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2c4
            int r4 = r2.mIndex
            if (r4 < 0) goto L2c4
            r4 = -1
            r2.mIndex = r4
        L2c4:
            r2.runOnCommitRunnables()
            int r1 = r1 + 1
            goto L2a9
        L2ca:
            if (r16 == 0) goto L2cf
            r20.reportBackStackChanged()
        L2cf:
            return
    }

    private void executePostponedTransaction(@androidx.annotation.Nullable java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Boolean> r9) {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r7.mPostponedTransactions
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            r2 = 0
        Lc:
            if (r2 >= r0) goto L90
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r3 = r7.mPostponedTransactions
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r3 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r3
            r4 = -1
            if (r8 == 0) goto L46
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L46
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L46
            if (r9 == 0) goto L46
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r7.mPostponedTransactions
            r4.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            androidx.fragment.app.BackStackRecord r4 = r3.mRecord
            androidx.fragment.app.FragmentManager r5 = r4.mManager
            boolean r3 = r3.mIsBack
            r5.completeExecute(r4, r3, r1, r1)
            goto L8c
        L46:
            boolean r5 = r3.isReady()
            if (r5 != 0) goto L5a
            if (r8 == 0) goto L8c
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r6 = r8.size()
            boolean r5 = r5.interactsWith(r8, r1, r6)
            if (r5 == 0) goto L8c
        L5a:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r5 = r7.mPostponedTransactions
            r5.remove(r2)
            int r2 = r2 + (-1)
            int r0 = r0 + (-1)
            if (r8 == 0) goto L89
            boolean r5 = r3.mIsBack
            if (r5 != 0) goto L89
            androidx.fragment.app.BackStackRecord r5 = r3.mRecord
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L89
            if (r9 == 0) goto L89
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L89
            androidx.fragment.app.BackStackRecord r4 = r3.mRecord
            androidx.fragment.app.FragmentManager r5 = r4.mManager
            boolean r3 = r3.mIsBack
            r5.completeExecute(r4, r3, r1, r1)
            goto L8c
        L89:
            r3.completeTransaction()
        L8c:
            int r2 = r2 + 1
            goto Lc
        L90:
            return
    }

    @androidx.annotation.NonNull
    public static <F extends androidx.fragment.app.Fragment> F findFragment(@androidx.annotation.NonNull android.view.View r3) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " does not have a Fragment set"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.Nullable
    private static androidx.fragment.app.Fragment findViewFragment(@androidx.annotation.NonNull android.view.View r2) {
        L0:
            r0 = 0
            if (r2 == 0) goto L17
            androidx.fragment.app.Fragment r1 = getViewFragment(r2)
            if (r1 == 0) goto La
            return r1
        La:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            goto L0
        L15:
            r2 = r0
            goto L0
        L17:
            return r0
    }

    private void forcePostponedTransactions() {
            r4 = this;
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            r1 = 0
            if (r0 == 0) goto L23
            java.util.Set r0 = r4.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            boolean r3 = r2.mIsContainerPostponed
            if (r3 == 0) goto Ld
            r2.mIsContainerPostponed = r1
            r2.executePendingOperations()
            goto Ld
        L23:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r4.mPostponedTransactions
            if (r0 == 0) goto L3b
        L27:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r4.mPostponedTransactions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r0 = r4.mPostponedTransactions
            java.lang.Object r0 = r0.remove(r1)
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r0 = (androidx.fragment.app.FragmentManager.StartEnterTransitionListener) r0
            r0.completeTransaction()
            goto L27
        L3b:
            return
    }

    private boolean generateOpsForPendingActions(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L39
            r2 = 0
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r2
        Le:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            r3 = 0
        L15:
            if (r2 >= r1) goto L27
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L39
            boolean r4 = r4.generateOps(r6, r7)     // Catch: java.lang.Throwable -> L39
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L15
        L27:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            r6.clear()     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.FragmentHostCallback<?> r6 = r5.mHost     // Catch: java.lang.Throwable -> L39
            android.os.Handler r6 = r6.getHandler()     // Catch: java.lang.Throwable -> L39
            java.lang.Runnable r7 = r5.mExecCommit     // Catch: java.lang.Throwable -> L39
            r6.removeCallbacks(r7)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r3
        L39:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r6
    }

    @androidx.annotation.NonNull
    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.fragment.app.FragmentManagerViewModel r2 = r0.getChildNonConfig(r2)
            return r2
    }

    private android.view.ViewGroup getFragmentContainer(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r3.mContainerId
            r1 = 0
            if (r0 > 0) goto Lb
            return r1
        Lb:
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            boolean r0 = r0.onHasView()
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            int r3 = r3.mContainerId
            android.view.View r3 = r0.onFindViewById(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L22
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L22:
            return r1
    }

    @androidx.annotation.Nullable
    public static androidx.fragment.app.Fragment getViewFragment(@androidx.annotation.NonNull android.view.View r1) {
            int r0 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto Ld
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static boolean isLoggingEnabled(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.DEBUG
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private boolean isMenuAvailable(@androidx.annotation.NonNull androidx.fragment.app.Fragment r6) {
            r5 = this;
            boolean r0 = r6.mHasMenu
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            boolean r0 = r6.mMenuVisible
            if (r0 != 0) goto L34
        La:
            androidx.fragment.app.FragmentManager r6 = r6.mChildFragmentManager
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L19:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r0.next()
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            if (r4 == 0) goto L2b
            boolean r3 = r6.isMenuAvailable(r4)
        L2b:
            if (r3 == 0) goto L19
            r6 = 1
            goto L30
        L2f:
            r6 = 0
        L30:
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            return r1
    }

    private void makeRemovedFragmentsInvisible(@androidx.annotation.NonNull androidx.collection.ArraySet<androidx.fragment.app.Fragment> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L22
            java.lang.Object r2 = r6.valueAt(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r3 = r2.mAdded
            if (r3 != 0) goto L1f
            android.view.View r3 = r2.requireView()
            float r4 = r3.getAlpha()
            r2.mPostponedAlpha = r4
            r2 = 0
            r3.setAlpha(r2)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    private boolean popBackStackImmediate(@androidx.annotation.Nullable java.lang.String r9, int r10, int r11) {
            r8 = this;
            r0 = 0
            r8.execPendingActions(r0)
            r0 = 1
            r8.ensureExecReady(r0)
            androidx.fragment.app.Fragment r1 = r8.mPrimaryNav
            if (r1 == 0) goto L1b
            if (r10 >= 0) goto L1b
            if (r9 != 0) goto L1b
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r1 = r1.popBackStackImmediate()
            if (r1 == 0) goto L1b
            return r0
        L1b:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r8.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r4 = r8.mTmpIsPop
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.popBackStackState(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3b
            r8.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r8.mTmpRecords     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<java.lang.Boolean> r11 = r8.mTmpIsPop     // Catch: java.lang.Throwable -> L36
            r8.removeRedundantOperationsAndExecute(r10, r11)     // Catch: java.lang.Throwable -> L36
            r8.cleanupExec()
            goto L3b
        L36:
            r9 = move-exception
            r8.cleanupExec()
            throw r9
        L3b:
            r8.updateOnBackPressedCallbackEnabled()
            r8.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r10 = r8.mFragmentStore
            r10.burpActive()
            return r9
    }

    private int postponePostponableTransactions(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r9, int r10, int r11, @androidx.annotation.NonNull androidx.collection.ArraySet<androidx.fragment.app.Fragment> r12) {
            r7 = this;
            int r0 = r11 + (-1)
            r1 = r11
        L3:
            if (r0 < r10) goto L5a
            java.lang.Object r2 = r8.get(r0)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r9.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r4 = r2.isPostponed()
            r5 = 0
            if (r4 == 0) goto L26
            int r4 = r0 + 1
            boolean r4 = r2.interactsWith(r8, r4, r11)
            if (r4 != 0) goto L26
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            if (r4 == 0) goto L57
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r4 = r7.mPostponedTransactions
            if (r4 != 0) goto L34
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.mPostponedTransactions = r4
        L34:
            androidx.fragment.app.FragmentManager$StartEnterTransitionListener r4 = new androidx.fragment.app.FragmentManager$StartEnterTransitionListener
            r4.<init>(r2, r3)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r6 = r7.mPostponedTransactions
            r6.add(r4)
            r2.setOnStartPostponedListener(r4)
            if (r3 == 0) goto L47
            r2.executeOps()
            goto L4a
        L47:
            r2.executePopOps(r5)
        L4a:
            int r1 = r1 + (-1)
            if (r0 == r1) goto L54
            r8.remove(r0)
            r8.add(r1, r2)
        L54:
            r7.addAddedFragments(r12)
        L57:
            int r0 = r0 + (-1)
            goto L3
        L5a:
            return r1
    }

    private void removeRedundantOperationsAndExecute(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L62
            r4.executePostponedTransaction(r5, r6)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L1a:
            if (r1 >= r0) goto L5c
            java.lang.Object r3 = r5.get(r1)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L59
            if (r2 == r1) goto L2b
            r4.executeOpsTogether(r5, r6, r2, r1)
        L2b:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
        L39:
            if (r2 >= r0) goto L54
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r5.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L54
            int r2 = r2 + 1
            goto L39
        L54:
            r4.executeOpsTogether(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L59:
            int r1 = r1 + 1
            goto L1a
        L5c:
            if (r2 == r0) goto L61
            r4.executeOpsTogether(r5, r6, r2, r0)
        L61:
            return
        L62:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    private void reportBackStackChanged() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r2.mBackStackChangeListeners
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChanged()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    private void setVisibleRemovingFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L33
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r2 = r2 + r1
            int r1 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r2 = r2 + r1
            if (r2 <= 0) goto L33
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r0.getTag(r1)
            if (r2 != 0) goto L26
            r0.setTag(r1, r4)
        L26:
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r4 = r4.getPopDirection()
            r0.setPopDirection(r4)
        L33:
            return
    }

    private void startPendingDeferredFragments() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            r2.performPendingDeferredStart(r1)
            goto Lc
        L1c:
            return
    }

    private void throwException(java.lang.RuntimeException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L2d
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L28
            r0.onDump(r6, r5, r2, r4)     // Catch: java.lang.Exception -> L28
            goto L37
        L28:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            goto L37
        L2d:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L33
            r7.dump(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L37:
            throw r8
    }

    private void updateOnBackPressedCallbackEnabled() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            if (r1 != 0) goto L13
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback     // Catch: java.lang.Throwable -> L2a
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L25
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r0.setEnabled(r2)
            return
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    public final void addCancellationSignal(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r4) {
            r2 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L12
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.put(r3, r1)
        L12:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r2.mExitAnimationCancellationSignals
            java.lang.Object r3 = r0.get(r3)
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r4)
            return
    }

    public final androidx.fragment.app.FragmentStateManager addFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            androidx.fragment.app.FragmentStateManager r0 = r3.createOrGetFragmentStateManager(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeActive(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L43
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.addFragment(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L3a
            r4.mHiddenChanged = r1
        L3a:
            boolean r4 = r3.isMenuAvailable(r4)
            if (r4 == 0) goto L43
            r4 = 1
            r3.mNeedMenuInvalidate = r4
        L43:
            return r0
    }

    public void addFragmentOnAttachListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.add(r2)
            return
    }

    public void addOnBackStackChangedListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackChangeListeners = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.add(r2)
            return
    }

    public final void addRetainedFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.addRetainedFragment(r2)
            return
    }

    public final int allocBackStackIndex() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mBackStackIndex
            int r0 = r0.getAndIncrement()
            return r0
    }

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    public final void attachController(@androidx.annotation.NonNull androidx.fragment.app.FragmentHostCallback<?> r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentContainer r4, @androidx.annotation.Nullable androidx.fragment.app.Fragment r5) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto Ld6
            r2.mHost = r3
            r2.mContainer = r4
            r2.mParent = r5
            if (r5 == 0) goto L15
            androidx.fragment.app.FragmentManager$8 r4 = new androidx.fragment.app.FragmentManager$8
            r4.<init>(r5)
            r2.addFragmentOnAttachListener(r4)
            goto L1f
        L15:
            boolean r4 = r3 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r4 == 0) goto L1f
            r4 = r3
            androidx.fragment.app.FragmentOnAttachListener r4 = (androidx.fragment.app.FragmentOnAttachListener) r4
            r2.addFragmentOnAttachListener(r4)
        L1f:
            androidx.fragment.app.Fragment r4 = r2.mParent
            if (r4 == 0) goto L26
            r2.updateOnBackPressedCallbackEnabled()
        L26:
            boolean r4 = r3 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r4 == 0) goto L3b
            r4 = r3
            androidx.activity.OnBackPressedDispatcherOwner r4 = (androidx.activity.OnBackPressedDispatcherOwner) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.mOnBackPressedDispatcher = r0
            if (r5 == 0) goto L36
            r4 = r5
        L36:
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r0.addCallback(r4, r1)
        L3b:
            if (r5 == 0) goto L46
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getChildNonConfig(r5)
            r2.mNonConfig = r3
            goto L5f
        L46:
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L57
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            androidx.lifecycle.ViewModelStore r3 = r3.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r3 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r3)
            r2.mNonConfig = r3
            goto L5f
        L57:
            androidx.fragment.app.FragmentManagerViewModel r3 = new androidx.fragment.app.FragmentManagerViewModel
            r4 = 0
            r3.<init>(r4)
            r2.mNonConfig = r3
        L5f:
            androidx.fragment.app.FragmentManagerViewModel r3 = r2.mNonConfig
            boolean r4 = r2.isStateSaved()
            r3.setIsStateSaved(r4)
            androidx.fragment.app.FragmentStore r3 = r2.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r4 = r2.mNonConfig
            r3.setNonConfig(r4)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r2.mHost
            boolean r4 = r3 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r4 == 0) goto Ld5
            androidx.activity.result.ActivityResultRegistryOwner r3 = (androidx.activity.result.ActivityResultRegistryOwner) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L8b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            java.lang.String r0 = ":"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5, r0)
            goto L8d
        L8b:
            java.lang.String r4 = ""
        L8d:
            java.lang.String r5 = "FragmentManager:"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r4)
            java.lang.String r5 = "StartActivityForResult"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5)
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            androidx.fragment.app.FragmentManager$9 r1 = new androidx.fragment.app.FragmentManager$9
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r5 = r3.register(r5, r0, r1)
            r2.mStartActivityForResult = r5
            java.lang.String r5 = "StartIntentSenderForResult"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5)
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r0 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r0.<init>()
            androidx.fragment.app.FragmentManager$10 r1 = new androidx.fragment.app.FragmentManager$10
            r1.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r5 = r3.register(r5, r0, r1)
            r2.mStartIntentSenderForResult = r5
            java.lang.String r5 = "RequestPermissions"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5)
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r5 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r5.<init>()
            androidx.fragment.app.FragmentManager$11 r0 = new androidx.fragment.app.FragmentManager$11
            r0.<init>(r2)
            androidx.activity.result.ActivityResultLauncher r3 = r3.register(r4, r5, r0)
            r2.mRequestPermissions = r3
        Ld5:
            return
        Ld6:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
    }

    public final void attachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "attach: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1d:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L50
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L50
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.addFragment(r5)
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L47:
            boolean r5 = r4.isMenuAvailable(r5)
            if (r5 == 0) goto L50
            r5 = 1
            r4.mNeedMenuInvalidate = r5
        L50:
            return
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction beginTransaction() {
            r1 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r1.mResults
            r0.remove(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r1.mResultListeners
            java.lang.Object r2 = r0.remove(r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r2
            if (r2 == 0) goto Ld
            r2.removeObserver()
        Ld:
            return
    }

    public final void completeExecute(@androidx.annotation.NonNull androidx.fragment.app.BackStackRecord r10, boolean r11, boolean r12, boolean r13) {
            r9 = this;
            if (r11 == 0) goto L6
            r10.executePopOps(r13)
            goto L9
        L6:
            r10.executeOps()
        L9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 1
            r2.<init>(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            r2.add(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r3.add(r11)
            if (r12 == 0) goto L34
            int r11 = r9.mCurState
            if (r11 < r8) goto L34
            androidx.fragment.app.FragmentHostCallback<?> r11 = r9.mHost
            android.content.Context r0 = r11.getContext()
            androidx.fragment.app.FragmentContainer r1 = r9.mContainer
            r4 = 0
            r5 = 1
            r6 = 1
            androidx.fragment.app.FragmentTransition$Callback r7 = r9.mFragmentTransitionCallback
            androidx.fragment.app.FragmentTransition.startTransitions(r0, r1, r2, r3, r4, r5, r6, r7)
        L34:
            if (r13 == 0) goto L3b
            int r11 = r9.mCurState
            r9.moveToState(r11, r8)
        L3b:
            androidx.fragment.app.FragmentStore r11 = r9.mFragmentStore
            java.util.List r11 = r11.getActiveFragments()
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L7e
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            if (r12 == 0) goto L47
            android.view.View r0 = r12.mView
            if (r0 == 0) goto L47
            boolean r0 = r12.mIsNewlyAdded
            if (r0 == 0) goto L47
            int r0 = r12.mContainerId
            boolean r0 = r10.interactsWith(r0)
            if (r0 == 0) goto L47
            float r0 = r12.mPostponedAlpha
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L71
            android.view.View r2 = r12.mView
            r2.setAlpha(r0)
        L71:
            if (r13 == 0) goto L76
            r12.mPostponedAlpha = r1
            goto L47
        L76:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.mPostponedAlpha = r0
            r0 = 0
            r12.mIsNewlyAdded = r0
            goto L47
        L7e:
            return
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.lang.String r1 = r4.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.FragmentStateManager r0 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r3.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore
            r0.<init>(r1, r2, r4)
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.restoreState(r4)
            int r4 = r3.mCurState
            r0.setFragmentManagerState(r4)
            return r0
    }

    public final void detachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "detach: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1d:
            boolean r1 = r5.mDetached
            if (r1 != 0) goto L53
            r1 = 1
            r5.mDetached = r1
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L53
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "remove from detach: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L43:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            r0.removeFragment(r5)
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L50
            r4.mNeedMenuInvalidate = r1
        L50:
            r4.setVisibleRemovingFragment(r5)
        L53:
            return
    }

    public final void dispatchActivityCreated() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    public final void dispatchAttach() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r2.dispatchStateChange(r0)
            return
    }

    public final void dispatchConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performConfigurationChanged(r3)
            goto La
        L1c:
            return
    }

    public final boolean dispatchContextItemSelected(@androidx.annotation.NonNull android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performContextItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    public final void dispatchCreate() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 1
            r2.dispatchStateChange(r0)
            return
    }

    public final boolean dispatchCreateOptionsMenu(@androidx.annotation.NonNull android.view.Menu r8, @androidx.annotation.NonNull android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            r0 = 0
            androidx.fragment.app.FragmentStore r3 = r7.mFragmentStore
            java.util.List r3 = r3.getFragments()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L13:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L13
            boolean r6 = r7.isParentMenuVisible(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.performCreateOptionsMenu(r8, r9)
            if (r6 == 0) goto L13
            if (r0 != 0) goto L34
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L34:
            r0.add(r5)
            r4 = 1
            goto L13
        L39:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            if (r8 == 0) goto L5b
        L3d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            int r8 = r8.size()
            if (r1 >= r8) goto L5b
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            java.lang.Object r8 = r8.get(r1)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r0 == 0) goto L55
            boolean r9 = r0.contains(r8)
            if (r9 != 0) goto L58
        L55:
            r8.onDestroyOptionsMenu()
        L58:
            int r1 = r1 + 1
            goto L3d
        L5b:
            r7.mCreatedMenus = r0
            return r4
    }

    public final void dispatchDestroy() {
            r2 = this;
            r0 = 1
            r2.mDestroyed = r0
            r2.execPendingActions(r0)
            r2.endAnimatingAwayFragments()
            r0 = -1
            r2.dispatchStateChange(r0)
            r0 = 0
            r2.mHost = r0
            r2.mContainer = r0
            r2.mParent = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.mOnBackPressedDispatcher
            if (r1 == 0) goto L1f
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r1.remove()
            r2.mOnBackPressedDispatcher = r0
        L1f:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L30
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r2.mStartIntentSenderForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            r0.unregister()
        L30:
            return
    }

    public final void dispatchDestroyView() {
            r1 = this;
            r0 = 1
            r1.dispatchStateChange(r0)
            return
    }

    public final void dispatchLowMemory() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performLowMemory()
            goto La
        L1c:
            return
    }

    public final void dispatchMultiWindowModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performMultiWindowModeChanged(r3)
            goto La
        L1c:
            return
    }

    public final void dispatchOnAttachFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r2.mOnAttachListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentOnAttachListener r1 = (androidx.fragment.app.FragmentOnAttachListener) r1
            r1.onAttachFragment(r2, r3)
            goto L6
        L16:
            return
    }

    public final boolean dispatchOptionsItemSelected(@androidx.annotation.NonNull android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performOptionsItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    public final void dispatchOptionsMenuClosed(@androidx.annotation.NonNull android.view.Menu r3) {
            r2 = this;
            int r0 = r2.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L10
            r1.performOptionsMenuClosed(r3)
            goto L10
        L22:
            return
    }

    public final void dispatchPause() {
            r1 = this;
            r0 = 5
            r1.dispatchStateChange(r0)
            return
    }

    public final void dispatchPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            r1.performPictureInPictureModeChanged(r3)
            goto La
        L1c:
            return
    }

    public final boolean dispatchPrepareOptionsMenu(@androidx.annotation.NonNull android.view.Menu r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r4 = r5.isParentMenuVisible(r3)
            if (r4 == 0) goto L11
            boolean r3 = r3.performPrepareOptionsMenu(r6)
            if (r3 == 0) goto L11
            r2 = 1
            goto L11
        L2d:
            return r2
    }

    public final void dispatchPrimaryNavigationFragmentChanged() {
            r1 = this;
            r1.updateOnBackPressedCallbackEnabled()
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            r1.dispatchParentPrimaryNavigationFragmentChanged(r0)
            return
    }

    public final void dispatchResume() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 7
            r2.dispatchStateChange(r0)
            return
    }

    public final void dispatchStart() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 5
            r2.dispatchStateChange(r0)
            return
    }

    public final void dispatchStop() {
            r2 = this;
            r0 = 1
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    public final void dispatchViewCreated() {
            r1 = this;
            r0 = 2
            r1.dispatchStateChange(r0)
            return
    }

    public void dump(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.io.FileDescriptor r6, @androidx.annotation.NonNull java.io.PrintWriter r7, @androidx.annotation.Nullable java.lang.String[] r8) {
            r4 = this;
            java.lang.String r0 = "    "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0)
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.dump(r5, r6, r7, r8)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r4.mCreatedMenus
            r8 = 0
            if (r6 == 0) goto L43
            int r6 = r6.size()
            if (r6 <= 0) goto L43
            r7.print(r5)
            java.lang.String r1 = "Fragments Created Menus:"
            r7.println(r1)
            r1 = 0
        L1f:
            if (r1 >= r6) goto L43
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r4.mCreatedMenus
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r2 = r2.toString()
            r7.println(r2)
            int r1 = r1 + 1
            goto L1f
        L43:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r4.mBackStack
            if (r6 == 0) goto L7d
            int r6 = r6.size()
            if (r6 <= 0) goto L7d
            r7.print(r5)
            java.lang.String r1 = "Back Stack:"
            r7.println(r1)
            r1 = 0
        L56:
            if (r1 >= r6) goto L7d
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r3 = r2.toString()
            r7.println(r3)
            r2.dump(r0, r7)
            int r1 = r1 + 1
            goto L56
        L7d:
            r7.print(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Back Stack Index: "
            r6.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mBackStackIndex
            int r0 = r0.get()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7.println(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r4.mPendingActions
            monitor-enter(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r4.mPendingActions     // Catch: java.lang.Throwable -> L13e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L13e
            if (r0 <= 0) goto Lcd
            r7.print(r5)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r1 = "Pending Actions:"
            r7.println(r1)     // Catch: java.lang.Throwable -> L13e
        Lad:
            if (r8 >= r0) goto Lcd
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r4.mPendingActions     // Catch: java.lang.Throwable -> L13e
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L13e
            androidx.fragment.app.FragmentManager$OpGenerator r1 = (androidx.fragment.app.FragmentManager.OpGenerator) r1     // Catch: java.lang.Throwable -> L13e
            r7.print(r5)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r2 = "  #"
            r7.print(r2)     // Catch: java.lang.Throwable -> L13e
            r7.print(r8)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r2 = ": "
            r7.print(r2)     // Catch: java.lang.Throwable -> L13e
            r7.println(r1)     // Catch: java.lang.Throwable -> L13e
            int r8 = r8 + 1
            goto Lad
        Lcd:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L13e
            r7.print(r5)
            java.lang.String r6 = "FragmentManager misc state:"
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mHost="
            r7.print(r6)
            androidx.fragment.app.FragmentHostCallback<?> r6 = r4.mHost
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mContainer="
            r7.print(r6)
            androidx.fragment.app.FragmentContainer r6 = r4.mContainer
            r7.println(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            if (r6 == 0) goto L101
            r7.print(r5)
            java.lang.String r6 = "  mParent="
            r7.print(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            r7.println(r6)
        L101:
            r7.print(r5)
            java.lang.String r6 = "  mCurState="
            r7.print(r6)
            int r6 = r4.mCurState
            r7.print(r6)
            java.lang.String r6 = " mStateSaved="
            r7.print(r6)
            boolean r6 = r4.mStateSaved
            r7.print(r6)
            java.lang.String r6 = " mStopped="
            r7.print(r6)
            boolean r6 = r4.mStopped
            r7.print(r6)
            java.lang.String r6 = " mDestroyed="
            r7.print(r6)
            boolean r6 = r4.mDestroyed
            r7.println(r6)
            boolean r6 = r4.mNeedMenuInvalidate
            if (r6 == 0) goto L13d
            r7.print(r5)
            java.lang.String r5 = "  mNeedMenuInvalidate="
            r7.print(r5)
            boolean r5 = r4.mNeedMenuInvalidate
            r7.println(r5)
        L13d:
            return
        L13e:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L13e
            throw r5
    }

    public final void enqueueAction(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OpGenerator r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L1d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1a
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            r2.checkStateLoss()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r2.mPendingActions
            monitor-enter(r0)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L30
            if (r4 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            throw r3     // Catch: java.lang.Throwable -> L3a
        L30:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r2.mPendingActions     // Catch: java.lang.Throwable -> L3a
            r4.add(r3)     // Catch: java.lang.Throwable -> L3a
            r2.scheduleCommit()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3
    }

    public final boolean execPendingActions(boolean r4) {
            r3 = this;
            r3.ensureExecReady(r4)
            r4 = 1
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r3.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r2 = r3.mTmpIsPop
            boolean r1 = r3.generateOpsForPendingActions(r1, r2)
            if (r1 == 0) goto L22
            r3.mExecutingActions = r4
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r3.mTmpRecords     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList<java.lang.Boolean> r1 = r3.mTmpIsPop     // Catch: java.lang.Throwable -> L1d
            r3.removeRedundantOperationsAndExecute(r0, r1)     // Catch: java.lang.Throwable -> L1d
            r3.cleanupExec()
            r0 = 1
            goto L5
        L1d:
            r4 = move-exception
            r3.cleanupExec()
            throw r4
        L22:
            r3.updateOnBackPressedCallbackEnabled()
            r3.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            r4.burpActive()
            return r0
    }

    public final void execSingleAction(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OpGenerator r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mDestroyed
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.ensureExecReady(r3)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r1.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            boolean r2 = r2.generateOps(r3, r0)
            if (r2 == 0) goto L2b
            r2 = 1
            r1.mExecutingActions = r2
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r1.mTmpRecords     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList<java.lang.Boolean> r3 = r1.mTmpIsPop     // Catch: java.lang.Throwable -> L26
            r1.removeRedundantOperationsAndExecute(r2, r3)     // Catch: java.lang.Throwable -> L26
            r1.cleanupExec()
            goto L2b
        L26:
            r2 = move-exception
            r1.cleanupExec()
            throw r2
        L2b:
            r1.updateOnBackPressedCallbackEnabled()
            r1.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r2 = r1.mFragmentStore
            r2.burpActive()
            return
    }

    public boolean executePendingTransactions() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.execPendingActions(r0)
            r1.forcePostponedTransactions()
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.Fragment findActiveFragment(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findActiveFragment(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment findFragmentById(@androidx.annotation.IdRes int r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentById(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment findFragmentByTag(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByTag(r2)
            return r2
    }

    public final androidx.fragment.app.Fragment findFragmentByWho(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByWho(r2)
            return r2
    }

    public final int getActiveFragmentCount() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    @androidx.annotation.NonNull
    public final java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentManager$BackStackEntry r2 = (androidx.fragment.app.FragmentManager.BackStackEntry) r2
            return r2
    }

    public int getBackStackEntryCount() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentContainer getContainer() {
            r1 = this;
            androidx.fragment.app.FragmentContainer r0 = r1.mContainer
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment getFragment(@androidx.annotation.NonNull android.os.Bundle r5, @androidx.annotation.NonNull java.lang.String r6) {
            r4 = this;
            java.lang.String r5 = r5.getString(r6)
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            androidx.fragment.app.Fragment r0 = r4.findActiveFragment(r5)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ": unique id "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L2f:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
            r1 = this;
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            return r0
        L10:
            androidx.fragment.app.FragmentFactory r0 = r1.mHostFragmentFactory
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentStore getFragmentStore() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getFragments()
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentHostCallback<?> getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            return r0
    }

    @androidx.annotation.NonNull
    public final android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
            r1 = this;
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = r1.mLayoutInflaterFactory
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            return r0
    }

    @androidx.annotation.Nullable
    public final androidx.fragment.app.Fragment getParent() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParent
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
            r1 = this;
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r0.getSpecialEffectsControllerFactory()
            return r0
        L10:
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mDefaultSpecialEffectsControllerFactory
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.lifecycle.ViewModelStore getViewModelStore(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.lifecycle.ViewModelStore r2 = r0.getViewModelStore(r2)
            return r2
    }

    public final void handleOnBackPressed() {
            r1 = this;
            r0 = 1
            r1.execPendingActions(r0)
            androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L10
            r1.popBackStackImmediate()
            goto L15
        L10:
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
        L15:
            return
    }

    public final void hideFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hide: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L2c
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.setVisibleRemovingFragment(r3)
        L2c:
            return
    }

    public final void invalidateMenuForFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r2 = r1.isMenuAvailable(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            r1.mNeedMenuInvalidate = r2
        Ld:
            return
    }

    public boolean isDestroyed() {
            r1 = this;
            boolean r0 = r1.mDestroyed
            return r0
    }

    public final boolean isParentMenuVisible(@androidx.annotation.Nullable androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1.isMenuVisible()
            return r1
    }

    public final boolean isPrimaryNavigation(@androidx.annotation.Nullable androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.getPrimaryNavigationFragment()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L19
            androidx.fragment.app.Fragment r4 = r1.mParent
            boolean r4 = r3.isPrimaryNavigation(r4)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public boolean isStateSaved() {
            r1 = this;
            boolean r0 = r1.mStateSaved
            if (r0 != 0) goto Lb
            boolean r0 = r1.mStopped
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public final void launchRequestPermissions(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull java.lang.String[] r3, int r4) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r1.mRequestPermissions
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r2 = r1.mRequestPermissions
            r2.launch(r3)
            goto L1b
        L16:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onRequestPermissionsFromFragment(r2, r3, r4)
        L1b:
            return
    }

    public final void launchStartActivityForResult(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r1.mStartActivityForResult
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            if (r3 == 0) goto L19
            if (r5 == 0) goto L19
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r2, r5)
        L19:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r2 = r1.mStartActivityForResult
            r2.launch(r3)
            goto L24
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onStartActivityFromFragment(r2, r3, r4, r5)
        L24:
            return
    }

    public final void launchStartIntentSenderForResult(@androidx.annotation.NonNull androidx.fragment.app.Fragment r12, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender r13, int r14, @androidx.annotation.Nullable android.content.Intent r15, int r16, int r17, int r18, @androidx.annotation.Nullable android.os.Bundle r19) throws android.content.IntentSender.SendIntentException {
            r11 = this;
            r0 = r11
            r2 = r12
            r9 = r19
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            if (r1 == 0) goto L95
            java.lang.String r1 = "FragmentManager"
            r3 = 2
            if (r9 == 0) goto L4c
            if (r15 != 0) goto L1b
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r5 = 1
            java.lang.String r6 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r6, r5)
            goto L1c
        L1b:
            r4 = r15
        L1c:
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto L46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ActivityOptions "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = " were added to fillInIntent "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " for fragment "
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r1, r5)
        L46:
            java.lang.String r5 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r5, r9)
            goto L4d
        L4c:
            r4 = r15
        L4d:
            androidx.activity.result.IntentSenderRequest$Builder r5 = new androidx.activity.result.IntentSenderRequest$Builder
            r6 = r13
            r5.<init>(r13)
            androidx.activity.result.IntentSenderRequest$Builder r4 = r5.setFillInIntent(r4)
            r7 = r16
            r8 = r17
            androidx.activity.result.IntentSenderRequest$Builder r4 = r4.setFlags(r8, r7)
            androidx.activity.result.IntentSenderRequest r4 = r4.build()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r5 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r6 = r2.mWho
            r10 = r14
            r5.<init>(r6, r14)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r6 = r0.mLaunchedFragments
            r6.addLast(r5)
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L8f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Fragment "
            r3.append(r5)
            r3.append(r12)
            java.lang.String r2 = "is launching an IntentSender for result "
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.v(r1, r2)
        L8f:
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            r1.launch(r4)
            goto Lac
        L95:
            r6 = r13
            r10 = r14
            r7 = r16
            r8 = r17
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.onStartIntentSenderFromFragment(r2, r3, r4, r5, r6, r7, r8, r9)
        Lac:
            return
    }

    public final void moveFragmentToExpectedState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            boolean r0 = r0.containsActiveFragment(r1)
            if (r0 != 0) goto L3b
            r0 = 3
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " to state "
            r0.append(r5)
            int r5 = r4.mCurState
            r0.append(r5)
            java.lang.String r5 = "since it is not added to "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r5)
        L3a:
            return
        L3b:
            int r0 = r4.mCurState
            r4.moveToState(r5, r0)
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L82
            boolean r1 = r5.mIsNewlyAdded
            if (r1 == 0) goto L82
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L82
            float r1 = r5.mPostponedAlpha
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L56
            r0.setAlpha(r1)
        L56:
            r5.mPostponedAlpha = r2
            r0 = 0
            r5.mIsNewlyAdded = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            android.content.Context r0 = r0.getContext()
            r1 = 1
            boolean r2 = r5.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r0, r5, r1, r2)
            if (r0 == 0) goto L82
            android.view.animation.Animation r1 = r0.animation
            if (r1 == 0) goto L76
            android.view.View r0 = r5.mView
            r0.startAnimation(r1)
            goto L82
        L76:
            android.animation.Animator r1 = r0.animator
            android.view.View r2 = r5.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.animator
            r0.start()
        L82:
            boolean r0 = r5.mHiddenChanged
            if (r0 == 0) goto L89
            r4.completeShowHideFragment(r5)
        L89:
            return
    }

    public final void moveToState(int r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 != 0) goto L10
            r0 = -1
            if (r4 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "No activity"
            r4.<init>(r5)
            throw r4
        L10:
            if (r5 != 0) goto L17
            int r5 = r3.mCurState
            if (r4 != r5) goto L17
            return
        L17:
            r3.mCurState = r4
            boolean r4 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            r5 = 0
            if (r4 == 0) goto L24
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            r4.moveToExpectedState()
            goto L76
        L24:
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            java.util.List r4 = r4.getFragments()
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3.moveFragmentToExpectedState(r0)
            goto L2e
        L3e:
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            java.util.List r4 = r4.getActiveFragmentStateManagers()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.FragmentStateManager r0 = (androidx.fragment.app.FragmentStateManager) r0
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r2 = r1.mIsNewlyAdded
            if (r2 != 0) goto L61
            r3.moveFragmentToExpectedState(r1)
        L61:
            boolean r2 = r1.mRemoving
            if (r2 == 0) goto L6d
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L6d
            r1 = 1
            goto L6e
        L6d:
            r1 = 0
        L6e:
            if (r1 == 0) goto L4a
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeInactive(r0)
            goto L4a
        L76:
            r3.startPendingDeferredFragments()
            boolean r4 = r3.mNeedMenuInvalidate
            if (r4 == 0) goto L8b
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            if (r4 == 0) goto L8b
            int r0 = r3.mCurState
            r1 = 7
            if (r0 != r1) goto L8b
            r4.onSupportInvalidateOptionsMenu()
            r3.mNeedMenuInvalidate = r5
        L8b:
            return
    }

    public final void moveToState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            int r0 = r1.mCurState
            r1.moveToState(r2, r0)
            return
    }

    public final void moveToState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r17, int r18) {
            r16 = this;
            r0 = r16
            r7 = r17
            androidx.fragment.app.FragmentStore r1 = r0.mFragmentStore
            java.lang.String r2 = r7.mWho
            androidx.fragment.app.FragmentStateManager r1 = r1.getFragmentStateManager(r2)
            r8 = 1
            if (r1 != 0) goto L1b
            androidx.fragment.app.FragmentStateManager r1 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r0.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r3 = r0.mFragmentStore
            r1.<init>(r2, r3, r7)
            r1.setFragmentManagerState(r8)
        L1b:
            r9 = r1
            boolean r1 = r7.mFromLayout
            r10 = 2
            if (r1 == 0) goto L30
            boolean r1 = r7.mInLayout
            if (r1 == 0) goto L30
            int r1 = r7.mState
            if (r1 != r10) goto L30
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L32
        L30:
            r1 = r18
        L32:
            int r2 = r9.computeExpectedState()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.mState
            r12 = 3
            java.lang.String r13 = "FragmentManager"
            r2 = -1
            r3 = 5
            r4 = 4
            if (r1 > r11) goto L86
            if (r1 >= r11) goto L51
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r0.mExitAnimationCancellationSignals
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L51
            r16.cancelExitAnimation(r17)
        L51:
            int r1 = r7.mState
            if (r1 == r2) goto L61
            if (r1 == 0) goto L66
            if (r1 == r8) goto L6b
            if (r1 == r10) goto L75
            if (r1 == r4) goto L7a
            if (r1 == r3) goto L7f
            goto L1ba
        L61:
            if (r11 <= r2) goto L66
            r9.attach()
        L66:
            if (r11 <= 0) goto L6b
            r9.create()
        L6b:
            if (r11 <= r2) goto L70
            r9.ensureInflatedView()
        L70:
            if (r11 <= r8) goto L75
            r9.createView()
        L75:
            if (r11 <= r10) goto L7a
            r9.activityCreated()
        L7a:
            if (r11 <= r4) goto L7f
            r9.start()
        L7f:
            if (r11 <= r3) goto L1ba
            r9.resume()
            goto L1ba
        L86:
            if (r1 <= r11) goto L1ba
            if (r1 == 0) goto L1b3
            if (r1 == r8) goto L1a3
            if (r1 == r10) goto Ld0
            if (r1 == r4) goto La1
            if (r1 == r3) goto L9c
            r5 = 7
            if (r1 == r5) goto L97
            goto L1ba
        L97:
            if (r11 >= r5) goto L9c
            r9.pause()
        L9c:
            if (r11 >= r3) goto La1
            r9.stop()
        La1:
            if (r11 >= r4) goto Ld0
            boolean r1 = isLoggingEnabled(r12)
            if (r1 == 0) goto Lbd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        Lbd:
            android.view.View r1 = r7.mView
            if (r1 == 0) goto Ld0
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            boolean r1 = r1.onShouldSaveFragmentState(r7)
            if (r1 == 0) goto Ld0
            android.util.SparseArray<android.os.Parcelable> r1 = r7.mSavedViewState
            if (r1 != 0) goto Ld0
            r9.saveViewState()
        Ld0:
            if (r11 >= r10) goto L1a3
            r1 = 0
            android.view.View r3 = r7.mView
            if (r3 == 0) goto L198
            android.view.ViewGroup r4 = r7.mContainer
            if (r4 == 0) goto L198
            r4.endViewTransition(r3)
            android.view.View r3 = r7.mView
            r3.clearAnimation()
            boolean r3 = r17.isRemovingParent()
            if (r3 != 0) goto L198
            int r3 = r0.mCurState
            r4 = 0
            if (r3 <= r2) goto L10f
            boolean r2 = r0.mDestroyed
            if (r2 != 0) goto L10f
            android.view.View r2 = r7.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L10f
            float r2 = r7.mPostponedAlpha
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L10f
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            android.content.Context r1 = r1.getContext()
            r2 = 0
            boolean r3 = r17.getPopDirection()
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r1 = androidx.fragment.app.FragmentAnim.loadAnimation(r1, r7, r2, r3)
        L10f:
            r7.mPostponedAlpha = r4
            android.view.ViewGroup r14 = r7.mContainer
            android.view.View r15 = r7.mView
            if (r1 == 0) goto L166
            androidx.fragment.app.FragmentTransition$Callback r5 = r0.mFragmentTransitionCallback
            r14.startViewTransition(r15)
            androidx.core.os.CancellationSignal r6 = new androidx.core.os.CancellationSignal
            r6.<init>()
            androidx.fragment.app.FragmentAnim$1 r2 = new androidx.fragment.app.FragmentAnim$1
            r2.<init>(r7)
            r6.setOnCancelListener(r2)
            r5.onStart(r7, r6)
            android.view.animation.Animation r2 = r1.animation
            if (r2 == 0) goto L14a
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r2 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            android.view.animation.Animation r1 = r1.animation
            r2.<init>(r1, r14, r15)
            android.view.View r1 = r7.mView
            r7.setAnimatingAway(r1)
            androidx.fragment.app.FragmentAnim$2 r1 = new androidx.fragment.app.FragmentAnim$2
            r1.<init>(r14, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.mView
            r1.startAnimation(r2)
            goto L166
        L14a:
            android.animation.Animator r4 = r1.animator
            r7.setAnimator(r4)
            androidx.fragment.app.FragmentAnim$3 r3 = new androidx.fragment.app.FragmentAnim$3
            r1 = r3
            r2 = r14
            r12 = r3
            r3 = r15
            r8 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addListener(r12)
            android.view.View r1 = r7.mView
            r8.setTarget(r1)
            r8.start()
        L166:
            r14.removeView(r15)
            boolean r1 = isLoggingEnabled(r10)
            if (r1 == 0) goto L193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Removing view "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L193:
            android.view.ViewGroup r1 = r7.mContainer
            if (r14 == r1) goto L198
            return
        L198:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r0.mExitAnimationCancellationSignals
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L1a3
            r9.destroyFragmentView()
        L1a3:
            r1 = 1
            if (r11 >= r1) goto L1b3
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r2 = r0.mExitAnimationCancellationSignals
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L1b0
            r8 = 1
            goto L1b4
        L1b0:
            r9.destroy()
        L1b3:
            r8 = r11
        L1b4:
            if (r8 >= 0) goto L1b9
            r9.detach()
        L1b9:
            r11 = r8
        L1ba:
            int r1 = r7.mState
            if (r1 == r11) goto L1ed
            r1 = 3
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L1eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L1eb:
            r7.mState = r11
        L1ed:
            return
    }

    public final void noteStateNotSaved() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r1.noteStateNotSaved()
            goto L19
        L2d:
            return
    }

    public final void onContainerAvailable(@androidx.annotation.NonNull androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto Lc
            android.view.View r3 = r2.mView
            if (r3 == 0) goto Lc
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto Lc
            r2.mContainer = r6
            r1.addViewToContainer()
            goto Lc
        L34:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.beginTransaction()
            return r0
    }

    public final void performPendingDeferredStart(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L20
            boolean r1 = r2.mExecutingActions
            if (r1 == 0) goto L10
            r3 = 1
            r2.mHavePendingDeferredStart = r3
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            boolean r1 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r1 == 0) goto L1b
            r3.moveToExpectedState()
            goto L20
        L1b:
            int r3 = r2.mCurState
            r2.moveToState(r0, r3)
        L20:
            return
    }

    public void popBackStack() {
            r4 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.enqueueAction(r0, r3)
            return
    }

    public void popBackStack(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad id: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
            r4.<init>(r3)
            throw r4
    }

    public void popBackStack(@androidx.annotation.Nullable java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
    }

    public boolean popBackStackImmediate() {
            r3 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            boolean r0 = r3.popBackStackImmediate(r0, r1, r2)
            return r0
    }

    public boolean popBackStackImmediate(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L8
            r0 = 0
            boolean r2 = r1.popBackStackImmediate(r0, r2, r3)
            return r2
        L8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad id: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            r3.<init>(r2)
            throw r3
    }

    public boolean popBackStackImmediate(@androidx.annotation.Nullable java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r2 = r1.popBackStackImmediate(r2, r0, r3)
            return r2
    }

    public final boolean popBackStackState(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r7, @androidx.annotation.Nullable java.lang.String r8, int r9, int r10) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r5.mBackStack
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r8 != 0) goto L27
            if (r9 >= 0) goto L27
            r3 = r10 & 1
            if (r3 != 0) goto L27
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r8 >= 0) goto L17
            return r1
        L17:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            java.lang.Object r8 = r9.remove(r8)
            r6.add(r8)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.add(r6)
            goto L9e
        L27:
            if (r8 != 0) goto L2e
            if (r9 < 0) goto L2c
            goto L2e
        L2c:
            r8 = -1
            goto L7a
        L2e:
            int r0 = r0.size()
            int r0 = r0 - r2
        L33:
            if (r0 < 0) goto L54
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mBackStack
            java.lang.Object r3 = r3.get(r0)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            if (r8 == 0) goto L4a
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L4a
            goto L54
        L4a:
            if (r9 < 0) goto L51
            int r3 = r3.mIndex
            if (r9 != r3) goto L51
            goto L54
        L51:
            int r0 = r0 + (-1)
            goto L33
        L54:
            if (r0 >= 0) goto L57
            return r1
        L57:
            r10 = r10 & r2
            if (r10 == 0) goto L79
        L5a:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L79
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r5.mBackStack
            java.lang.Object r10 = r10.get(r0)
            androidx.fragment.app.BackStackRecord r10 = (androidx.fragment.app.BackStackRecord) r10
            if (r8 == 0) goto L72
            java.lang.String r3 = r10.getName()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L5a
        L72:
            if (r9 < 0) goto L79
            int r10 = r10.mIndex
            if (r9 != r10) goto L79
            goto L5a
        L79:
            r8 = r0
        L7a:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r2
            if (r8 != r9) goto L84
            return r1
        L84:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r5.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r2
        L8b:
            if (r9 <= r8) goto L9e
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r5.mBackStack
            java.lang.Object r10 = r10.remove(r9)
            r6.add(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L8b
        L9e:
            return r2
    }

    public void putFragment(@androidx.annotation.NonNull android.os.Bundle r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r2)
            r0.<init>(r1)
            r3.throwException(r0)
        L14:
            java.lang.String r6 = r6.mWho
            r4.putString(r5, r6)
            return
    }

    public void registerFragmentLifecycleCallbacks(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.registerFragmentLifecycleCallbacks(r2, r3)
            return
    }

    public final void removeCancellationSignal(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r3) {
            r1 = this;
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r0 = r1.mExitAnimationCancellationSignals
            java.lang.Object r0 = r0.get(r2)
            java.util.HashSet r0 = (java.util.HashSet) r0
            if (r0 == 0) goto L28
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L28
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L28
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r3 = r1.mExitAnimationCancellationSignals
            r3.remove(r2)
            int r3 = r2.mState
            r0 = 5
            if (r3 >= r0) goto L28
            r1.destroyFragmentView(r2)
            int r3 = r1.mCurState
            r1.moveToState(r2, r3)
        L28:
            return
    }

    public final void removeFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " nesting="
            r0.append(r1)
            int r1 = r4.mBackStackNesting
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L28:
            boolean r0 = r4.isInBackStack()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.mDetached
            if (r2 == 0) goto L34
            if (r0 == 0) goto L46
        L34:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            r0.removeFragment(r4)
            boolean r0 = r3.isMenuAvailable(r4)
            if (r0 == 0) goto L41
            r3.mNeedMenuInvalidate = r1
        L41:
            r4.mRemoving = r1
            r3.setVisibleRemovingFragment(r4)
        L46:
            return
    }

    public void removeFragmentOnAttachListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.remove(r2)
            return
    }

    public void removeOnBackStackChangedListener(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public final void removeRetainedFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.removeRetainedFragment(r2)
            return
    }

    public final void restoreAllState(@androidx.annotation.Nullable android.os.Parcelable r3, @androidx.annotation.Nullable androidx.fragment.app.FragmentManagerNonConfig r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            r0.restoreFromSnapshot(r4)
            r2.restoreSaveState(r3)
            return
    }

    public final void restoreSaveState(@androidx.annotation.Nullable android.os.Parcelable r12) {
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            androidx.fragment.app.FragmentManagerState r12 = (androidx.fragment.app.FragmentManagerState) r12
            java.util.ArrayList<androidx.fragment.app.FragmentState> r0 = r12.mActive
            if (r0 != 0) goto La
            return
        La:
            androidx.fragment.app.FragmentStore r0 = r11.mFragmentStore
            r0.resetActiveFragments()
            java.util.ArrayList<androidx.fragment.app.FragmentState> r0 = r12.mActive
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "): "
            r3 = 2
            java.lang.String r4 = "FragmentManager"
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            r10 = r1
            androidx.fragment.app.FragmentState r10 = (androidx.fragment.app.FragmentState) r10
            if (r10 == 0) goto L15
            androidx.fragment.app.FragmentManagerViewModel r1 = r11.mNonConfig
            java.lang.String r5 = r10.mWho
            androidx.fragment.app.Fragment r1 = r1.findRetainedFragmentByWho(r5)
            if (r1 == 0) goto L58
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto L4e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "restoreSaveState: re-attaching retained "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
        L4e:
            androidx.fragment.app.FragmentStateManager r5 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r11.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore
            r5.<init>(r6, r7, r1, r10)
            goto L70
        L58:
            androidx.fragment.app.FragmentStateManager r1 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r11.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore
            androidx.fragment.app.FragmentHostCallback<?> r5 = r11.mHost
            android.content.Context r5 = r5.getContext()
            java.lang.ClassLoader r8 = r5.getClassLoader()
            androidx.fragment.app.FragmentFactory r9 = r11.getFragmentFactory()
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L70:
            androidx.fragment.app.Fragment r1 = r5.getFragment()
            r1.mFragmentManager = r11
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L95
            java.lang.String r3 = "restoreSaveState: active ("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r6 = r1.mWho
            r3.append(r6)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.v(r4, r1)
        L95:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r11.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r5.restoreState(r1)
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore
            r1.makeActive(r5)
            int r1 = r11.mCurState
            r5.setFragmentManagerState(r1)
            goto L15
        Lae:
            androidx.fragment.app.FragmentManagerViewModel r0 = r11.mNonConfig
            java.util.Collection r0 = r0.getRetainedFragments()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lba:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L111
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentStore r5 = r11.mFragmentStore
            java.lang.String r6 = r1.mWho
            boolean r5 = r5.containsActiveFragment(r6)
            if (r5 != 0) goto Lba
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto Lf4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Discarding retained Fragment "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = " that was not found in the set of active Fragments "
            r5.append(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentState> r6 = r12.mActive
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
        Lf4:
            androidx.fragment.app.FragmentManagerViewModel r5 = r11.mNonConfig
            r5.removeRetainedFragment(r1)
            r1.mFragmentManager = r11
            androidx.fragment.app.FragmentStateManager r5 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r11.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore
            r5.<init>(r6, r7, r1)
            r6 = 1
            r5.setFragmentManagerState(r6)
            r5.moveToExpectedState()
            r1.mRemoving = r6
            r5.moveToExpectedState()
            goto Lba
        L111:
            androidx.fragment.app.FragmentStore r0 = r11.mFragmentStore
            java.util.ArrayList<java.lang.String> r1 = r12.mAdded
            r0.restoreAddedFragments(r1)
            androidx.fragment.app.BackStackState[] r0 = r12.mBackStack
            r1 = 0
            if (r0 == 0) goto L16e
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.fragment.app.BackStackState[] r5 = r12.mBackStack
            int r5 = r5.length
            r0.<init>(r5)
            r11.mBackStack = r0
            r0 = 0
        L128:
            androidx.fragment.app.BackStackState[] r5 = r12.mBackStack
            int r6 = r5.length
            if (r0 >= r6) goto L171
            r5 = r5[r0]
            androidx.fragment.app.BackStackRecord r5 = r5.instantiate(r11)
            boolean r6 = isLoggingEnabled(r3)
            if (r6 == 0) goto L166
            java.lang.String r6 = "restoreAllState: back stack #"
            java.lang.String r7 = " (index "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r6, r0, r7)
            int r7 = r5.mIndex
            r6.append(r7)
            r6.append(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r4, r6)
            androidx.fragment.app.LogWriter r6 = new androidx.fragment.app.LogWriter
            r6.<init>()
            java.io.PrintWriter r7 = new java.io.PrintWriter
            r7.<init>(r6)
            java.lang.String r6 = "  "
            r5.dump(r6, r7, r1)
            r7.close()
        L166:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r11.mBackStack
            r6.add(r5)
            int r0 = r0 + 1
            goto L128
        L16e:
            r0 = 0
            r11.mBackStack = r0
        L171:
            java.util.concurrent.atomic.AtomicInteger r0 = r11.mBackStackIndex
            int r2 = r12.mBackStackIndex
            r0.set(r2)
            java.lang.String r0 = r12.mPrimaryNavActiveWho
            if (r0 == 0) goto L185
            androidx.fragment.app.Fragment r0 = r11.findActiveFragment(r0)
            r11.mPrimaryNav = r0
            r11.dispatchParentPrimaryNavigationFragmentChanged(r0)
        L185:
            java.util.ArrayList<java.lang.String> r0 = r12.mResultKeys
            if (r0 == 0) goto L1b0
        L189:
            int r2 = r0.size()
            if (r1 >= r2) goto L1b0
            java.util.ArrayList<android.os.Bundle> r2 = r12.mResults
            java.lang.Object r2 = r2.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.fragment.app.FragmentHostCallback<?> r3 = r11.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setClassLoader(r3)
            java.util.Map<java.lang.String, android.os.Bundle> r3 = r11.mResults
            java.lang.Object r4 = r0.get(r1)
            r3.put(r4, r2)
            int r1 = r1 + 1
            goto L189
        L1b0:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r12 = r12.mLaunchedFragments
            r0.<init>(r12)
            r11.mLaunchedFragments = r0
            return
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.getSnapshot()
            return r0
    }

    public final android.os.Parcelable saveAllState() {
            r9 = this;
            r9.forcePostponedTransactions()
            r9.endAnimatingAwayFragments()
            r0 = 1
            r9.execPendingActions(r0)
            r9.mStateSaved = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r9.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r9.mFragmentStore
            java.util.ArrayList r0 = r0.saveActiveFragments()
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2e
            boolean r0 = isLoggingEnabled(r3)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "saveAllState: no fragments!"
            android.util.Log.v(r2, r0)
        L2d:
            return r4
        L2e:
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore
            java.util.ArrayList r1 = r1.saveAddedFragments()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r9.mBackStack
            if (r5 == 0) goto L74
            int r5 = r5.size()
            if (r5 <= 0) goto L74
            androidx.fragment.app.BackStackState[] r4 = new androidx.fragment.app.BackStackState[r5]
            r6 = 0
        L41:
            if (r6 >= r5) goto L74
            androidx.fragment.app.BackStackState r7 = new androidx.fragment.app.BackStackState
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r9.mBackStack
            java.lang.Object r8 = r8.get(r6)
            androidx.fragment.app.BackStackRecord r8 = (androidx.fragment.app.BackStackRecord) r8
            r7.<init>(r8)
            r4[r6] = r7
            boolean r7 = isLoggingEnabled(r3)
            if (r7 == 0) goto L71
            java.lang.String r7 = "saveAllState: adding back stack #"
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r7, r6, r8)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r9.mBackStack
            java.lang.Object r8 = r8.get(r6)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r2, r7)
        L71:
            int r6 = r6 + 1
            goto L41
        L74:
            androidx.fragment.app.FragmentManagerState r2 = new androidx.fragment.app.FragmentManagerState
            r2.<init>()
            r2.mActive = r0
            r2.mAdded = r1
            r2.mBackStack = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r9.mBackStackIndex
            int r0 = r0.get()
            r2.mBackStackIndex = r0
            androidx.fragment.app.Fragment r0 = r9.mPrimaryNav
            if (r0 == 0) goto L8f
            java.lang.String r0 = r0.mWho
            r2.mPrimaryNavActiveWho = r0
        L8f:
            java.util.ArrayList<java.lang.String> r0 = r2.mResultKeys
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r9.mResults
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.ArrayList<android.os.Bundle> r0 = r2.mResults
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r9.mResults
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r9.mLaunchedFragments
            r0.<init>(r1)
            r2.mLaunchedFragments = r0
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L24
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " is not currently in the FragmentManager"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5, r3)
            r1.<init>(r5)
            r4.throwException(r1)
        L24:
            androidx.fragment.app.Fragment$SavedState r5 = r0.saveInstanceState()
            return r5
    }

    public final void scheduleCommit() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$StartEnterTransitionListener> r1 = r5.mPostponedTransactions     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3a
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L3a
            if (r4 != r3) goto L1b
            r2 = 1
        L1b:
            if (r1 != 0) goto L1f
            if (r2 == 0) goto L38
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost     // Catch: java.lang.Throwable -> L3a
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L3a
            java.lang.Runnable r2 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3a
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost     // Catch: java.lang.Throwable -> L3a
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L3a
            java.lang.Runnable r2 = r5.mExecCommit     // Catch: java.lang.Throwable -> L3a
            r1.post(r2)     // Catch: java.lang.Throwable -> L3a
            r5.updateOnBackPressedCallbackEnabled()     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    public final void setExitAnimationOrder(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.getFragmentContainer(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    public void setFragmentFactory(@androidx.annotation.NonNull androidx.fragment.app.FragmentFactory r1) {
            r0 = this;
            r0.mFragmentFactory = r1
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r2.mResultListeners
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L16
            r0.onFragmentResult(r3, r4)
            goto L1b
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.mResults
            r0.put(r3, r4)
        L1b:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    public final void setFragmentResultListener(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentResultListener r6) {
            r3 = this;
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r5.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            return
        Ld:
            androidx.fragment.app.FragmentManager$6 r0 = new androidx.fragment.app.FragmentManager$6
            r0.<init>(r3, r4, r6, r5)
            r5.addObserver(r0)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r1 = r3.mResultListeners
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = new androidx.fragment.app.FragmentManager$LifecycleAwareResultListener
            r2.<init>(r5, r6, r0)
            java.lang.Object r4 = r1.put(r4, r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r4 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r4
            if (r4 == 0) goto L27
            r4.removeObserver()
        L27:
            return
    }

    public final void setMaxLifecycle(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.Fragment r0 = r2.findActiveFragment(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 != r2) goto L17
        L14:
            r3.mMaxState = r4
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not an active fragment of FragmentManager "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public final void setPrimaryNavigationFragment(@androidx.annotation.Nullable androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L36:
            androidx.fragment.app.Fragment r0 = r3.mPrimaryNav
            r3.mPrimaryNav = r4
            r3.dispatchParentPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.Fragment r4 = r3.mPrimaryNav
            r3.dispatchParentPrimaryNavigationFragmentChanged(r4)
            return
    }

    public final void showFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1e:
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L2b
            r0 = 0
            r3.mHidden = r0
            boolean r0 = r3.mHiddenChanged
            r0 = r0 ^ 1
            r3.mHiddenChanged = r0
        L2b:
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mParent
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L45
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.Fragment r1 = r4.mParent
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6d
        L45:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            if (r1 == 0) goto L68
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6d
        L68:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6d:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterFragmentLifecycleCallbacks(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.unregisterFragmentLifecycleCallbacks(r2)
            return
    }
}
