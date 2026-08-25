package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class FragmentStatePagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private androidx.fragment.app.FragmentTransaction mCurTransaction;
    private androidx.fragment.app.Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mFragments;
    private java.util.ArrayList<androidx.fragment.app.Fragment.SavedState> mSavedState;

    @java.lang.Deprecated
    public FragmentStatePagerAdapter(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FragmentStatePagerAdapter(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCurTransaction = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mSavedState = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mFragments = r1
            r2.mCurrentPrimaryItem = r0
            r2.mFragmentManager = r3
            r2.mBehavior = r4
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4, @androidx.annotation.NonNull java.lang.Object r5) {
            r2 = this;
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 != 0) goto Le
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
            r2.mCurTransaction = r3
        Le:
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r3 = r2.mSavedState
            int r3 = r3.size()
            r0 = 0
            if (r3 > r4) goto L1d
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r3 = r2.mSavedState
            r3.add(r0)
            goto Le
        L1d:
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r3 = r2.mSavedState
            boolean r1 = r5.isAdded()
            if (r1 == 0) goto L2c
            androidx.fragment.app.FragmentManager r1 = r2.mFragmentManager
            androidx.fragment.app.Fragment$SavedState r1 = r1.saveFragmentInstanceState(r5)
            goto L2d
        L2c:
            r1 = r0
        L2d:
            r3.set(r4, r1)
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r2.mFragments
            r3.set(r4, r0)
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            r3.remove(r5)
            androidx.fragment.app.Fragment r3 = r2.mCurrentPrimaryItem
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L44
            r2.mCurrentPrimaryItem = r0
        L44:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@androidx.annotation.NonNull android.view.ViewGroup r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 == 0) goto L19
            boolean r0 = r2.mExecutingFinishUpdate
            if (r0 != 0) goto L16
            r0 = 1
            r1 = 0
            r2.mExecutingFinishUpdate = r0     // Catch: java.lang.Throwable -> L12
            r3.commitNowAllowingStateLoss()     // Catch: java.lang.Throwable -> L12
            r2.mExecutingFinishUpdate = r1
            goto L16
        L12:
            r3 = move-exception
            r2.mExecutingFinishUpdate = r1
            throw r3
        L16:
            r3 = 0
            r2.mCurTransaction = r3
        L19:
            return
    }

    @androidx.annotation.NonNull
    public abstract androidx.fragment.app.Fragment getItem(int r1);

    @Override // androidx.viewpager.widget.PagerAdapter
    @androidx.annotation.NonNull
    public java.lang.Object instantiateItem(@androidx.annotation.NonNull android.view.ViewGroup r4, int r5) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mFragments
            int r0 = r0.size()
            if (r0 <= r5) goto L13
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mFragments
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            androidx.fragment.app.FragmentTransaction r0 = r3.mCurTransaction
            if (r0 != 0) goto L1f
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r3.mCurTransaction = r0
        L1f:
            androidx.fragment.app.Fragment r0 = r3.getItem(r5)
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r3.mSavedState
            int r1 = r1.size()
            if (r1 <= r5) goto L38
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r3.mSavedState
            java.lang.Object r1 = r1.get(r5)
            androidx.fragment.app.Fragment$SavedState r1 = (androidx.fragment.app.Fragment.SavedState) r1
            if (r1 == 0) goto L38
            r0.setInitialSavedState(r1)
        L38:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mFragments
            int r1 = r1.size()
            if (r1 > r5) goto L47
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mFragments
            r2 = 0
            r1.add(r2)
            goto L38
        L47:
            r1 = 0
            r0.setMenuVisibility(r1)
            int r2 = r3.mBehavior
            if (r2 != 0) goto L52
            r0.setUserVisibleHint(r1)
        L52:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mFragments
            r1.set(r5, r0)
            androidx.fragment.app.FragmentTransaction r5 = r3.mCurTransaction
            int r4 = r4.getId()
            r5.add(r4, r0)
            int r4 = r3.mBehavior
            r5 = 1
            if (r4 != r5) goto L6c
            androidx.fragment.app.FragmentTransaction r4 = r3.mCurTransaction
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.STARTED
            r4.setMaxLifecycle(r0, r5)
        L6c:
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull java.lang.Object r2) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.View r2 = r2.getView()
            if (r2 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@androidx.annotation.Nullable android.os.Parcelable r6, @androidx.annotation.Nullable java.lang.ClassLoader r7) {
            r5 = this;
            if (r6 == 0) goto L87
            android.os.Bundle r6 = (android.os.Bundle) r6
            r6.setClassLoader(r7)
            java.lang.String r7 = "states"
            android.os.Parcelable[] r7 = r6.getParcelableArray(r7)
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r0 = r5.mSavedState
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r5.mFragments
            r0.clear()
            r0 = 0
            if (r7 == 0) goto L2b
            r1 = 0
        L1c:
            int r2 = r7.length
            if (r1 >= r2) goto L2b
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r2 = r5.mSavedState
            r3 = r7[r1]
            androidx.fragment.app.Fragment$SavedState r3 = (androidx.fragment.app.Fragment.SavedState) r3
            r2.add(r3)
            int r1 = r1 + 1
            goto L1c
        L2b:
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L33:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "f"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L33
            r2 = 1
            java.lang.String r2 = r1.substring(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.Fragment r3 = r3.getFragment(r6, r1)
            if (r3 == 0) goto L70
        L58:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.mFragments
            int r1 = r1.size()
            if (r1 > r2) goto L67
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.mFragments
            r4 = 0
            r1.add(r4)
            goto L58
        L67:
            r3.setMenuVisibility(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.mFragments
            r1.set(r2, r3)
            goto L33
        L70:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bad fragment at key "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "FragmentStatePagerAdapt"
            android.util.Log.w(r2, r1)
            goto L33
        L87:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @androidx.annotation.Nullable
    public android.os.Parcelable saveState() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r0 = r5.mSavedState
            int r0 = r0.size()
            if (r0 <= 0) goto L21
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r5.mSavedState
            int r1 = r1.size()
            androidx.fragment.app.Fragment$SavedState[] r1 = new androidx.fragment.app.Fragment.SavedState[r1]
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r2 = r5.mSavedState
            r2.toArray(r1)
            java.lang.String r2 = "states"
            r0.putParcelableArray(r2, r1)
            goto L22
        L21:
            r0 = 0
        L22:
            r1 = 0
        L23:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mFragments
            int r2 = r2.size()
            if (r1 >= r2) goto L50
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mFragments
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L4d
            boolean r3 = r2.isAdded()
            if (r3 == 0) goto L4d
            if (r0 != 0) goto L42
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L42:
            java.lang.String r3 = "f"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r4.putFragment(r0, r3, r2)
        L4d:
            int r1 = r1 + 1
            goto L23
        L50:
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4, @androidx.annotation.NonNull java.lang.Object r5) {
            r2 = this;
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.Fragment r3 = r2.mCurrentPrimaryItem
            if (r5 == r3) goto L4c
            r4 = 1
            if (r3 == 0) goto L2c
            r0 = 0
            r3.setMenuVisibility(r0)
            int r3 = r2.mBehavior
            if (r3 != r4) goto L27
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 != 0) goto L1d
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
            r2.mCurTransaction = r3
        L1d:
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            androidx.fragment.app.Fragment r0 = r2.mCurrentPrimaryItem
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            r3.setMaxLifecycle(r0, r1)
            goto L2c
        L27:
            androidx.fragment.app.Fragment r3 = r2.mCurrentPrimaryItem
            r3.setUserVisibleHint(r0)
        L2c:
            r5.setMenuVisibility(r4)
            int r3 = r2.mBehavior
            if (r3 != r4) goto L47
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 != 0) goto L3f
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
            r2.mCurTransaction = r3
        L3f:
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
            r3.setMaxLifecycle(r5, r4)
            goto L4a
        L47:
            r5.setUserVisibleHint(r4)
        L4a:
            r2.mCurrentPrimaryItem = r5
        L4c:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@androidx.annotation.NonNull android.view.ViewGroup r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = -1
            if (r3 == r0) goto L8
            return
        L8:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ViewPager with adapter "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " requires a view id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }
}
