package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
final class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = null;
    private static final java.lang.String TAG = "FragmentManager";
    public final int mBreadCrumbShortTitleRes;
    public final java.lang.CharSequence mBreadCrumbShortTitleText;
    public final int mBreadCrumbTitleRes;
    public final java.lang.CharSequence mBreadCrumbTitleText;
    public final int[] mCurrentMaxLifecycleStates;
    public final java.util.ArrayList<java.lang.String> mFragmentWhos;
    public final int mIndex;
    public final java.lang.String mName;
    public final int[] mOldMaxLifecycleStates;
    public final int[] mOps;
    public final boolean mReorderingAllowed;
    public final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    public final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    public final int mTransition;


    static {
            androidx.fragment.app.BackStackState$1 r0 = new androidx.fragment.app.BackStackState$1
            r0.<init>()
            androidx.fragment.app.BackStackState.CREATOR = r0
            return
    }

    public BackStackState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.mOps = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragmentWhos = r0
            int[] r0 = r2.createIntArray()
            r1.mOldMaxLifecycleStates = r0
            int[] r0 = r2.createIntArray()
            r1.mCurrentMaxLifecycleStates = r0
            int r0 = r2.readInt()
            r1.mTransition = r0
            java.lang.String r0 = r2.readString()
            r1.mName = r0
            int r0 = r2.readInt()
            r1.mIndex = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbTitleText = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbShortTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbShortTitleText = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementTargetNames = r0
            int r2 = r2.readInt()
            if (r2 == 0) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            r1.mReorderingAllowed = r2
            return
    }

    public BackStackState(androidx.fragment.app.BackStackRecord r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            int r1 = r0 * 5
            int[] r1 = new int[r1]
            r7.mOps = r1
            boolean r1 = r8.mAddToBackStack
            if (r1 == 0) goto L9e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7.mFragmentWhos = r1
            int[] r1 = new int[r0]
            r7.mOldMaxLifecycleStates = r1
            int[] r1 = new int[r0]
            r7.mCurrentMaxLifecycleStates = r1
            r1 = 0
            r2 = 0
        L24:
            if (r1 >= r0) goto L75
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r8.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            int[] r4 = r7.mOps
            int r5 = r2 + 1
            int r6 = r3.mCmd
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r2 = r7.mFragmentWhos
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L3f
            java.lang.String r4 = r4.mWho
            goto L40
        L3f:
            r4 = 0
        L40:
            r2.add(r4)
            int[] r2 = r7.mOps
            int r4 = r5 + 1
            int r6 = r3.mEnterAnim
            r2[r5] = r6
            int r5 = r4 + 1
            int r6 = r3.mExitAnim
            r2[r4] = r6
            int r4 = r5 + 1
            int r6 = r3.mPopEnterAnim
            r2[r5] = r6
            int r5 = r4 + 1
            int r6 = r3.mPopExitAnim
            r2[r4] = r6
            int[] r2 = r7.mOldMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r4 = r3.mOldMaxState
            int r4 = r4.ordinal()
            r2[r1] = r4
            int[] r2 = r7.mCurrentMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r3 = r3.mCurrentMaxState
            int r3 = r3.ordinal()
            r2[r1] = r3
            int r1 = r1 + 1
            r2 = r5
            goto L24
        L75:
            int r0 = r8.mTransition
            r7.mTransition = r0
            java.lang.String r0 = r8.mName
            r7.mName = r0
            int r0 = r8.mIndex
            r7.mIndex = r0
            int r0 = r8.mBreadCrumbTitleRes
            r7.mBreadCrumbTitleRes = r0
            java.lang.CharSequence r0 = r8.mBreadCrumbTitleText
            r7.mBreadCrumbTitleText = r0
            int r0 = r8.mBreadCrumbShortTitleRes
            r7.mBreadCrumbShortTitleRes = r0
            java.lang.CharSequence r0 = r8.mBreadCrumbShortTitleText
            r7.mBreadCrumbShortTitleText = r0
            java.util.ArrayList<java.lang.String> r0 = r8.mSharedElementSourceNames
            r7.mSharedElementSourceNames = r0
            java.util.ArrayList<java.lang.String> r0 = r8.mSharedElementTargetNames
            r7.mSharedElementTargetNames = r0
            boolean r8 = r8.mReorderingAllowed
            r7.mReorderingAllowed = r8
            return
        L9e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r8.<init>(r0)
            throw r8
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r10) {
            r9 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r10)
            r1 = 0
            r2 = 0
        L7:
            int[] r3 = r9.mOps
            int r4 = r3.length
            if (r1 >= r4) goto L9e
            androidx.fragment.app.FragmentTransaction$Op r4 = new androidx.fragment.app.FragmentTransaction$Op
            r4.<init>()
            int r5 = r1 + 1
            r1 = r3[r1]
            r4.mCmd = r1
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r1 == 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Instantiate "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " op #"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = " base fragment #"
            r1.append(r3)
            int[] r3 = r9.mOps
            r3 = r3[r5]
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r1)
        L48:
            java.util.ArrayList<java.lang.String> r1 = r9.mFragmentWhos
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L59
            androidx.fragment.app.Fragment r1 = r10.findActiveFragment(r1)
            r4.mFragment = r1
            goto L5c
        L59:
            r1 = 0
            r4.mFragment = r1
        L5c:
            androidx.lifecycle.Lifecycle$State[] r1 = androidx.lifecycle.Lifecycle.State.values()
            int[] r3 = r9.mOldMaxLifecycleStates
            r3 = r3[r2]
            r1 = r1[r3]
            r4.mOldMaxState = r1
            androidx.lifecycle.Lifecycle$State[] r1 = androidx.lifecycle.Lifecycle.State.values()
            int[] r3 = r9.mCurrentMaxLifecycleStates
            r3 = r3[r2]
            r1 = r1[r3]
            r4.mCurrentMaxState = r1
            int[] r1 = r9.mOps
            int r3 = r5 + 1
            r5 = r1[r5]
            r4.mEnterAnim = r5
            int r6 = r3 + 1
            r3 = r1[r3]
            r4.mExitAnim = r3
            int r7 = r6 + 1
            r6 = r1[r6]
            r4.mPopEnterAnim = r6
            int r8 = r7 + 1
            r1 = r1[r7]
            r4.mPopExitAnim = r1
            r0.mEnterAnim = r5
            r0.mExitAnim = r3
            r0.mPopEnterAnim = r6
            r0.mPopExitAnim = r1
            r0.addOp(r4)
            int r2 = r2 + 1
            r1 = r8
            goto L7
        L9e:
            int r10 = r9.mTransition
            r0.mTransition = r10
            java.lang.String r10 = r9.mName
            r0.mName = r10
            int r10 = r9.mIndex
            r0.mIndex = r10
            r10 = 1
            r0.mAddToBackStack = r10
            int r1 = r9.mBreadCrumbTitleRes
            r0.mBreadCrumbTitleRes = r1
            java.lang.CharSequence r1 = r9.mBreadCrumbTitleText
            r0.mBreadCrumbTitleText = r1
            int r1 = r9.mBreadCrumbShortTitleRes
            r0.mBreadCrumbShortTitleRes = r1
            java.lang.CharSequence r1 = r9.mBreadCrumbShortTitleText
            r0.mBreadCrumbShortTitleText = r1
            java.util.ArrayList<java.lang.String> r1 = r9.mSharedElementSourceNames
            r0.mSharedElementSourceNames = r1
            java.util.ArrayList<java.lang.String> r1 = r9.mSharedElementTargetNames
            r0.mSharedElementTargetNames = r1
            boolean r1 = r9.mReorderingAllowed
            r0.mReorderingAllowed = r1
            r0.bumpBackStackNesting(r10)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.mOps
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mFragmentWhos
            r2.writeStringList(r3)
            int[] r3 = r1.mOldMaxLifecycleStates
            r2.writeIntArray(r3)
            int[] r3 = r1.mCurrentMaxLifecycleStates
            r2.writeIntArray(r3)
            int r3 = r1.mTransition
            r2.writeInt(r3)
            java.lang.String r3 = r1.mName
            r2.writeString(r3)
            int r3 = r1.mIndex
            r2.writeInt(r3)
            int r3 = r1.mBreadCrumbTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbTitleText
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.mBreadCrumbShortTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbShortTitleText
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementTargetNames
            r2.writeStringList(r3)
            boolean r3 = r1.mReorderingAllowed
            r2.writeInt(r3)
            return
    }
}
