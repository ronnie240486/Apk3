package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    public boolean mAddToBackStack;
    public boolean mAllowAddToBackStack;
    public int mBreadCrumbShortTitleRes;
    public java.lang.CharSequence mBreadCrumbShortTitleText;
    public int mBreadCrumbTitleRes;
    public java.lang.CharSequence mBreadCrumbTitleText;
    private final java.lang.ClassLoader mClassLoader;
    public java.util.ArrayList<java.lang.Runnable> mCommitRunnables;
    public int mEnterAnim;
    public int mExitAnim;
    private final androidx.fragment.app.FragmentFactory mFragmentFactory;

    @androidx.annotation.Nullable
    public java.lang.String mName;
    public java.util.ArrayList<androidx.fragment.app.FragmentTransaction.Op> mOps;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    public boolean mReorderingAllowed;
    public java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    public java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    public int mTransition;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Op {
        public int mCmd;
        public androidx.lifecycle.Lifecycle.State mCurrentMaxState;
        public int mEnterAnim;
        public int mExitAnim;
        public androidx.fragment.app.Fragment mFragment;
        public androidx.lifecycle.Lifecycle.State mOldMaxState;
        public int mPopEnterAnim;
        public int mPopExitAnim;

        public Op() {
                r0 = this;
                r0.<init>()
                return
        }

        public Op(int r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                r0.<init>()
                r0.mCmd = r1
                r0.mFragment = r2
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r0.mOldMaxState = r1
                r0.mCurrentMaxState = r1
                return
        }

        public Op(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                r1.<init>()
                r0 = 10
                r1.mCmd = r0
                r1.mFragment = r2
                androidx.lifecycle.Lifecycle$State r2 = r2.mMaxState
                r1.mOldMaxState = r2
                r1.mCurrentMaxState = r3
                return
        }
    }

    @java.lang.Deprecated
    public FragmentTransaction() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r0 = 0
            r1.mFragmentFactory = r0
            r1.mClassLoader = r0
            return
    }

    public FragmentTransaction(@androidx.annotation.NonNull androidx.fragment.app.FragmentFactory r2, @androidx.annotation.Nullable java.lang.ClassLoader r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r1.mFragmentFactory = r2
            r1.mClassLoader = r3
            return
    }

    @androidx.annotation.NonNull
    private androidx.fragment.app.Fragment createFragment(@androidx.annotation.NonNull java.lang.Class<? extends androidx.fragment.app.Fragment> r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r2.mFragmentFactory
            if (r0 == 0) goto L1e
            java.lang.ClassLoader r1 = r2.mClassLoader
            if (r1 == 0) goto L16
            java.lang.String r3 = r3.getName()
            androidx.fragment.app.Fragment r3 = r0.instantiate(r1, r3)
            if (r4 == 0) goto L15
            r3.setArguments(r4)
        L15:
            return r3
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "The FragmentManager must be attached to itshost to create a Fragment"
            r3.<init>(r4)
            throw r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()"
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction add(@androidx.annotation.IdRes int r3, @androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r3, r4, r0, r1)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction add(@androidx.annotation.IdRes int r2, @androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.Nullable java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.doAddOp(r2, r3, r4, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentTransaction add(@androidx.annotation.IdRes int r1, @androidx.annotation.NonNull java.lang.Class<? extends androidx.fragment.app.Fragment> r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = r0.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentTransaction add(@androidx.annotation.IdRes int r1, @androidx.annotation.NonNull java.lang.Class<? extends androidx.fragment.app.Fragment> r2, @androidx.annotation.Nullable android.os.Bundle r3, @androidx.annotation.Nullable java.lang.String r4) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = r0.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r2, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction add(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r0, r3, r4, r1)
            return r2
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentTransaction add(@androidx.annotation.NonNull java.lang.Class<? extends androidx.fragment.app.Fragment> r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            androidx.fragment.app.Fragment r1 = r0.createFragment(r1, r2)
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r3)
            return r1
    }

    public final void addOp(androidx.fragment.app.FragmentTransaction.Op r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            r0.add(r2)
            int r0 = r1.mEnterAnim
            r2.mEnterAnim = r0
            int r0 = r1.mExitAnim
            r2.mExitAnim = r0
            int r0 = r1.mPopEnterAnim
            r2.mPopEnterAnim = r0
            int r0 = r1.mPopExitAnim
            r2.mPopExitAnim = r0
            return
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction addSharedElement(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull java.lang.String r4) {
            r2 = this;
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r0 != 0) goto Lb
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L64
            java.lang.String r3 = androidx.core.view.ViewCompat.getTransitionName(r3)
            if (r3 == 0) goto L5c
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementSourceNames
            if (r0 != 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mSharedElementTargetNames = r0
            goto L39
        L27:
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementTargetNames
            boolean r0 = r0.contains(r4)
            java.lang.String r1 = "' has already been added to the transaction."
            if (r0 != 0) goto L50
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementSourceNames
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L44
        L39:
            java.util.ArrayList<java.lang.String> r0 = r2.mSharedElementSourceNames
            r0.add(r3)
            java.util.ArrayList<java.lang.String> r3 = r2.mSharedElementTargetNames
            r3.add(r4)
            goto L64
        L44:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A shared element with the source name '"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            r4.<init>(r3)
            throw r4
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A shared element with the target name '"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r1)
            r3.<init>(r4)
            throw r3
        L5c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unique transitionNames are required for all sharedElements"
            r3.<init>(r4)
            throw r3
        L64:
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction addToBackStack(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.mAllowAddToBackStack
            if (r0 == 0) goto La
            r0 = 1
            r1.mAddToBackStack = r0
            r1.mName = r2
            return r1
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This FragmentTransaction is not allowed to be added to the back stack."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction attach(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 7
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction detach(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 6
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction disallowAddToBackStack() {
            r2 = this;
            boolean r0 = r2.mAddToBackStack
            if (r0 != 0) goto L8
            r0 = 0
            r2.mAllowAddToBackStack = r0
            return r2
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
    }

    public void doAddOp(int r4, androidx.fragment.app.Fragment r5, @androidx.annotation.Nullable java.lang.String r6, int r7) {
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Lb2
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Lb2
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L20
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lb2
        L20:
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L4f
            java.lang.String r2 = r5.mTag
            if (r2 == 0) goto L4d
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L31
            goto L4d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change tag of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r5.mTag
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r5, r0, r6)
            r4.<init>(r5)
            throw r4
        L4d:
            r5.mTag = r6
        L4f:
            if (r4 == 0) goto La9
            r2 = -1
            if (r4 == r2) goto L85
            int r6 = r5.mFragmentId
            if (r6 == 0) goto L80
            if (r6 != r4) goto L5b
            goto L80
        L5b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change container ID of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            int r5 = r5.mFragmentId
            r7.append(r5)
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            throw r6
        L80:
            r5.mFragmentId = r4
            r5.mContainerId = r4
            goto La9
        L85:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Can't add fragment "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " with tag "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = " to container view with no id"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        La9:
            androidx.fragment.app.FragmentTransaction$Op r4 = new androidx.fragment.app.FragmentTransaction$Op
            r4.<init>(r7, r5)
            r3.addOp(r4)
            return
        Lb2:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Fragment "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r6 = r0.getCanonicalName()
            r5.append(r6)
            java.lang.String r6 = " must be a public static class to be  properly recreated from instance state."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction hide(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 4
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public boolean isAddToBackStackAllowed() {
            r1 = this;
            boolean r0 = r1.mAllowAddToBackStack
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            boolean r0 = r0.isEmpty()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction remove(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 3
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction replace(@androidx.annotation.IdRes int r2, @androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r2 = r1.replace(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction replace(@androidx.annotation.IdRes int r2, @androidx.annotation.NonNull androidx.fragment.app.Fragment r3, @androidx.annotation.Nullable java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 2
            r1.doAddOp(r2, r3, r4, r0)
            return r1
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Must use non-zero containerViewId"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentTransaction replace(@androidx.annotation.IdRes int r2, @androidx.annotation.NonNull java.lang.Class<? extends androidx.fragment.app.Fragment> r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r2 = r1.replace(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentTransaction replace(@androidx.annotation.IdRes int r1, @androidx.annotation.NonNull java.lang.Class<? extends androidx.fragment.app.Fragment> r2, @androidx.annotation.Nullable android.os.Bundle r3, @androidx.annotation.Nullable java.lang.String r4) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = r0.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r1 = r0.replace(r1, r2, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction runOnCommit(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            r1.disallowAddToBackStack()
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mCommitRunnables
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCommitRunnables = r0
        Le:
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mCommitRunnables
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setAllowOptimization(boolean r1) {
            r0 = this;
            androidx.fragment.app.FragmentTransaction r1 = r0.setReorderingAllowed(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(@androidx.annotation.StringRes int r1) {
            r0 = this;
            r0.mBreadCrumbShortTitleRes = r1
            r1 = 0
            r0.mBreadCrumbShortTitleText = r1
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.mBreadCrumbShortTitleRes = r0
            r1.mBreadCrumbShortTitleText = r2
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(@androidx.annotation.StringRes int r1) {
            r0 = this;
            r0.mBreadCrumbTitleRes = r1
            r1 = 0
            r0.mBreadCrumbTitleText = r1
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.mBreadCrumbTitleRes = r0
            r1.mBreadCrumbTitleText = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setCustomAnimations(@androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r2, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r3) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r2 = r1.setCustomAnimations(r2, r3, r0, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setCustomAnimations(@androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r1, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r2, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r3, @androidx.annotation.AnimRes @androidx.annotation.AnimatorRes int r4) {
            r0 = this;
            r0.mEnterAnim = r1
            r0.mExitAnim = r2
            r0.mPopEnterAnim = r3
            r0.mPopExitAnim = r4
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r3) {
            r1 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r0.<init>(r2, r3)
            r1.addOp(r0)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(@androidx.annotation.Nullable androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 8
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setReorderingAllowed(boolean r1) {
            r0 = this;
            r0.mReorderingAllowed = r1
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setTransition(int r1) {
            r0 = this;
            r0.mTransition = r1
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setTransitionStyle(@androidx.annotation.StyleRes int r1) {
            r0 = this;
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction show(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 5
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }
}
