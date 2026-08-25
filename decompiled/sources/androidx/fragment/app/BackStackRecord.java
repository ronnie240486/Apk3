package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
final class BackStackRecord extends androidx.fragment.app.FragmentTransaction implements androidx.fragment.app.FragmentManager.BackStackEntry, androidx.fragment.app.FragmentManager.OpGenerator {
    private static final java.lang.String TAG = "FragmentManager";
    public boolean mCommitted;
    public int mIndex;
    public final androidx.fragment.app.FragmentManager mManager;

    public BackStackRecord(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3) {
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.getFragmentFactory()
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            if (r1 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.mIndex = r0
            r2.mManager = r3
            return
    }

    private static boolean isFragmentPostponed(androidx.fragment.app.FragmentTransaction.Op r1) {
            androidx.fragment.app.Fragment r1 = r1.mFragment
            if (r1 == 0) goto L1c
            boolean r0 = r1.mAdded
            if (r0 == 0) goto L1c
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L1c
            boolean r0 = r1.mDetached
            if (r0 != 0) goto L1c
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L1c
            boolean r1 = r1.isPostponed()
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    public final void bumpBackStackNesting(int r8) {
            r7 = this;
            boolean r0 = r7.mAddToBackStack
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Bump nesting in "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L2a:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r7.mOps
            int r1 = r1.size()
            r3 = 0
        L31:
            if (r3 >= r1) goto L6b
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r7.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L68
            int r6 = r5.mBackStackNesting
            int r6 = r6 + r8
            r5.mBackStackNesting = r6
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r5 == 0) goto L68
            java.lang.String r5 = "Bump nesting of "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            androidx.fragment.app.Fragment r6 = r4.mFragment
            r5.append(r6)
            java.lang.String r6 = " to "
            r5.append(r6)
            androidx.fragment.app.Fragment r4 = r4.mFragment
            int r4 = r4.mBackStackNesting
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r2, r4)
        L68:
            int r3 = r3 + 1
            goto L31
        L6b:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
            r1 = this;
            r0 = 0
            int r0 = r1.commitInternal(r0)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
            r1 = this;
            r0 = 1
            int r0 = r1.commitInternal(r0)
            return r0
    }

    public final int commitInternal(boolean r3) {
            r2 = this;
            boolean r0 = r2.mCommitted
            if (r0 != 0) goto L4e
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Commit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r0 = "  "
            r2.dump(r0, r1)
            r1.close()
        L33:
            r0 = 1
            r2.mCommitted = r0
            boolean r0 = r2.mAddToBackStack
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            int r0 = r0.allocBackStackIndex()
            r2.mIndex = r0
            goto L46
        L43:
            r0 = -1
            r2.mIndex = r0
        L46:
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r0.enqueueAction(r2, r3)
            int r3 = r2.mIndex
            return r3
        L4e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 0
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 1
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction detach(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r1 = r2.mManager
            if (r0 != r1) goto L9
            goto L25
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot detach Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            androidx.fragment.app.FragmentTransaction r3 = super.detach(r3)
            return r3
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void doAddOp(int r1, androidx.fragment.app.Fragment r2, @androidx.annotation.Nullable java.lang.String r3, int r4) {
            r0 = this;
            super.doAddOp(r1, r2, r3, r4)
            androidx.fragment.app.FragmentManager r1 = r0.mManager
            r2.mFragmentManager = r1
            return
    }

    public void dump(java.lang.String r2, java.io.PrintWriter r3) {
            r1 = this;
            r0 = 1
            r1.dump(r2, r3, r0)
            return
    }

    public void dump(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.mName
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.mIndex
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.mCommitted
            r7.println(r0)
            int r0 = r5.mTransition
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.mTransition
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.mEnterAnim
            if (r0 != 0) goto L40
            int r0 = r5.mExitAnim
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.mExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.mPopEnterAnim
            if (r0 != 0) goto L67
            int r0 = r5.mPopExitAnim
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mPopEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.mPopExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.mBreadCrumbTitleRes
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            r7.println(r0)
        La9:
            int r0 = r5.mBreadCrumbShortTitleRes
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbShortTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            r7.println(r0)
        Lcc:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L193
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 0
        Le3:
            if (r1 >= r0) goto L193
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            int r3 = r2.mCmd
            switch(r3) {
                case 0: goto L120;
                case 1: goto L11d;
                case 2: goto L11a;
                case 3: goto L117;
                case 4: goto L114;
                case 5: goto L111;
                case 6: goto L10e;
                case 7: goto L10b;
                case 8: goto L108;
                case 9: goto L105;
                case 10: goto L102;
                default: goto Lf2;
            }
        Lf2:
            java.lang.String r3 = "cmd="
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r4 = r2.mCmd
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L122
        L102:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L122
        L105:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L122
        L108:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L122
        L10b:
            java.lang.String r3 = "ATTACH"
            goto L122
        L10e:
            java.lang.String r3 = "DETACH"
            goto L122
        L111:
            java.lang.String r3 = "SHOW"
            goto L122
        L114:
            java.lang.String r3 = "HIDE"
            goto L122
        L117:
            java.lang.String r3 = "REMOVE"
            goto L122
        L11a:
            java.lang.String r3 = "REPLACE"
            goto L122
        L11d:
            java.lang.String r3 = "ADD"
            goto L122
        L120:
            java.lang.String r3 = "NULL"
        L122:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            androidx.fragment.app.Fragment r3 = r2.mFragment
            r7.println(r3)
            if (r8 == 0) goto L18f
            int r3 = r2.mEnterAnim
            if (r3 != 0) goto L149
            int r3 = r2.mExitAnim
            if (r3 == 0) goto L168
        L149:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.mEnterAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.mExitAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L168:
            int r3 = r2.mPopEnterAnim
            if (r3 != 0) goto L170
            int r3 = r2.mPopExitAnim
            if (r3 == 0) goto L18f
        L170:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.mPopEnterAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.mPopExitAnim
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L18f:
            int r1 = r1 + 1
            goto Le3
        L193:
            return
    }

    public final void executeOps() {
            r10 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r10.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r2 >= r0) goto Le3
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r10.mOps
            java.lang.Object r4 = r4.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L26
            r5.setPopDirection(r1)
            int r6 = r10.mTransition
            r5.setNextTransition(r6)
            java.util.ArrayList<java.lang.String> r6 = r10.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r7 = r10.mSharedElementTargetNames
            r5.setSharedElementNames(r6, r7)
        L26:
            int r6 = r4.mCmd
            switch(r6) {
                case 1: goto Lb7;
                case 2: goto L2b;
                case 3: goto La6;
                case 4: goto L95;
                case 5: goto L7f;
                case 6: goto L6e;
                case 7: goto L58;
                case 8: goto L51;
                case 9: goto L49;
                case 10: goto L40;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown cmd: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r4.mCmd
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            androidx.lifecycle.Lifecycle$State r7 = r4.mCurrentMaxState
            r6.setMaxLifecycle(r5, r7)
            goto Lcc
        L49:
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r7 = 0
            r6.setPrimaryNavigationFragment(r7)
            goto Lcc
        L51:
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setPrimaryNavigationFragment(r5)
            goto Lcc
        L58:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setExitAnimationOrder(r5, r1)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.attachFragment(r5)
            goto Lcc
        L6e:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.detachFragment(r5)
            goto Lcc
        L7f:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setExitAnimationOrder(r5, r1)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.showFragment(r5)
            goto Lcc
        L95:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.hideFragment(r5)
            goto Lcc
        La6:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.removeFragment(r5)
            goto Lcc
        Lb7:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setExitAnimationOrder(r5, r1)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.addFragment(r5)
        Lcc:
            boolean r6 = r10.mReorderingAllowed
            if (r6 != 0) goto Ldf
            int r4 = r4.mCmd
            if (r4 == r3) goto Ldf
            if (r5 == 0) goto Ldf
            boolean r3 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r3 != 0) goto Ldf
            androidx.fragment.app.FragmentManager r3 = r10.mManager
            r3.moveFragmentToExpectedState(r5)
        Ldf:
            int r2 = r2 + 1
            goto L8
        Le3:
            boolean r0 = r10.mReorderingAllowed
            if (r0 != 0) goto Lf2
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 != 0) goto Lf2
            androidx.fragment.app.FragmentManager r0 = r10.mManager
            int r1 = r0.mCurState
            r0.moveToState(r1, r3)
        Lf2:
            return
    }

    public final void executePopOps(boolean r9) {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto Lf6
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r8.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r3 = r2.mFragment
            if (r3 == 0) goto L38
            r3.setPopDirection(r1)
            int r4 = r8.mTransition
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 4097(0x1001, float:5.741E-42)
            r7 = 4099(0x1003, float:5.744E-42)
            if (r4 == r6) goto L2e
            if (r4 == r7) goto L2c
            if (r4 == r5) goto L29
            r5 = 0
            goto L2e
        L29:
            r5 = 4097(0x1001, float:5.741E-42)
            goto L2e
        L2c:
            r5 = 4099(0x1003, float:5.744E-42)
        L2e:
            r3.setNextTransition(r5)
            java.util.ArrayList<java.lang.String> r4 = r8.mSharedElementTargetNames
            java.util.ArrayList<java.lang.String> r5 = r8.mSharedElementSourceNames
            r3.setSharedElementNames(r4, r5)
        L38:
            int r4 = r2.mCmd
            switch(r4) {
                case 1: goto Lc9;
                case 2: goto L3d;
                case 3: goto Lb8;
                case 4: goto La7;
                case 5: goto L91;
                case 6: goto L80;
                case 7: goto L6a;
                case 8: goto L62;
                case 9: goto L5b;
                case 10: goto L52;
                default: goto L3d;
            }
        L3d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown cmd: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.mCmd
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L52:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            androidx.lifecycle.Lifecycle$State r5 = r2.mOldMaxState
            r4.setMaxLifecycle(r3, r5)
            goto Lde
        L5b:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setPrimaryNavigationFragment(r3)
            goto Lde
        L62:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r5 = 0
            r4.setPrimaryNavigationFragment(r5)
            goto Lde
        L6a:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.detachFragment(r3)
            goto Lde
        L80:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.attachFragment(r3)
            goto Lde
        L91:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.hideFragment(r3)
            goto Lde
        La7:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.showFragment(r3)
            goto Lde
        Lb8:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.addFragment(r3)
            goto Lde
        Lc9:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.removeFragment(r3)
        Lde:
            boolean r4 = r8.mReorderingAllowed
            if (r4 != 0) goto Lf2
            int r2 = r2.mCmd
            r4 = 3
            if (r2 == r4) goto Lf2
            if (r3 == 0) goto Lf2
            boolean r2 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r2 != 0) goto Lf2
            androidx.fragment.app.FragmentManager r2 = r8.mManager
            r2.moveFragmentToExpectedState(r3)
        Lf2:
            int r0 = r0 + (-1)
            goto L8
        Lf6:
            boolean r0 = r8.mReorderingAllowed
            if (r0 != 0) goto L107
            if (r9 == 0) goto L107
            boolean r9 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r9 != 0) goto L107
            androidx.fragment.app.FragmentManager r9 = r8.mManager
            int r0 = r9.mCurState
            r9.moveToState(r0, r1)
        L107:
            return
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            r3.add(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.add(r3)
            boolean r3 = r2.mAddToBackStack
            if (r3 == 0) goto L3b
            androidx.fragment.app.FragmentManager r3 = r2.mManager
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4 = r3.mBackStack
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.mBackStack = r4
        L36:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r3.mBackStack
            r3.add(r2)
        L3b:
            r3 = 1
            return r3
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @androidx.annotation.Nullable
    public java.lang.CharSequence getBreadCrumbShortTitle() {
            r2 = this;
            int r0 = r2.mBreadCrumbShortTitleRes
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mBreadCrumbShortTitleRes
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.mBreadCrumbShortTitleText
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
            r1 = this;
            int r0 = r1.mBreadCrumbShortTitleRes
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @androidx.annotation.Nullable
    public java.lang.CharSequence getBreadCrumbTitle() {
            r2 = this;
            int r0 = r2.mBreadCrumbTitleRes
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mBreadCrumbTitleRes
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.mBreadCrumbTitleText
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
            r1 = this;
            int r0 = r1.mBreadCrumbTitleRes
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
            r1 = this;
            int r0 = r1.mIndex
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @androidx.annotation.Nullable
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction hide(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r1 = r2.mManager
            if (r0 != r1) goto L9
            goto L25
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot hide Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            androidx.fragment.app.FragmentTransaction r3 = super.hide(r3)
            return r3
    }

    public final boolean interactsWith(int r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r4.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L23
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r4.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r3 = r3.mFragment
            if (r3 == 0) goto L19
            int r3 = r3.mContainerId
            goto L1a
        L19:
            r3 = 0
        L1a:
            if (r3 == 0) goto L20
            if (r3 != r5) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            return r1
    }

    public final boolean interactsWith(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            if (r12 != r11) goto L4
            return r0
        L4:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r9.mOps
            int r1 = r1.size()
            r2 = -1
            r3 = 0
        Lc:
            if (r3 >= r1) goto L52
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r9.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r4 = r4.mFragment
            if (r4 == 0) goto L1d
            int r4 = r4.mContainerId
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 == 0) goto L4f
            if (r4 == r2) goto L4f
            r2 = r11
        L23:
            if (r2 >= r12) goto L4e
            java.lang.Object r5 = r10.get(r2)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r5.mOps
            int r6 = r6.size()
            r7 = 0
        L32:
            if (r7 >= r6) goto L4b
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r8 = r5.mOps
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.Op) r8
            androidx.fragment.app.Fragment r8 = r8.mFragment
            if (r8 == 0) goto L43
            int r8 = r8.mContainerId
            goto L44
        L43:
            r8 = 0
        L44:
            if (r8 != r4) goto L48
            r10 = 1
            return r10
        L48:
            int r7 = r7 + 1
            goto L32
        L4b:
            int r2 = r2 + 1
            goto L23
        L4e:
            r2 = r4
        L4f:
            int r3 = r3 + 1
            goto Lc
        L52:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final boolean isPostponed() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r3.mOps
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r3.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            boolean r2 = isFragmentPostponed(r2)
            if (r2 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction remove(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r1 = r2.mManager
            if (r0 != r1) goto L9
            goto L25
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            androidx.fragment.app.FragmentTransaction r3 = super.remove(r3)
            return r3
    }

    public void runOnCommitRunnables() {
            r2 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r2.mCommitRunnables
            if (r0 == 0) goto L1e
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L5
        L1b:
            r0 = 0
            r2.mCommitRunnables = r0
        L1e:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto L4f
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            java.lang.String r1 = "Cannot set maximum Lifecycle to "
            if (r5 != r0) goto L2c
            int r0 = r4.mState
            r2 = -1
            if (r0 > r2) goto L12
            goto L2c
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " after the Fragment has been created"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L2c:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r0) goto L35
            androidx.fragment.app.FragmentTransaction r4 = super.setMaxLifecycle(r4, r5)
            return r4
        L35:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public final void setOnStartPostponedListener(androidx.fragment.app.Fragment.OnStartEnterTransitionListener r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r3.mOps
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r3.mOps
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.Op) r1
            boolean r2 = isFragmentPostponed(r1)
            if (r2 == 0) goto L1c
            androidx.fragment.app.Fragment r1 = r1.mFragment
            r1.setOnStartEnterTransitionListener(r4)
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(@androidx.annotation.Nullable androidx.fragment.app.Fragment r3) {
            r2 = this;
            if (r3 == 0) goto L27
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L27
            androidx.fragment.app.FragmentManager r1 = r2.mManager
            if (r0 != r1) goto Lb
            goto L27
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            androidx.fragment.app.FragmentTransaction r3 = super.setPrimaryNavigationFragment(r3)
            return r3
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentTransaction show(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r1 = r2.mManager
            if (r0 != r1) goto L9
            goto L25
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot show Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = " is already attached to a FragmentManager."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            androidx.fragment.app.FragmentTransaction r3 = super.show(r3)
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.mIndex
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.mIndex
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.mName
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.mName
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
