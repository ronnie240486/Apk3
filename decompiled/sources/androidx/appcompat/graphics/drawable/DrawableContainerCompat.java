package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
public class DrawableContainerCompat extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final java.lang.String TAG = "DrawableContainerCompat";
    private int mAlpha;
    private java.lang.Runnable mAnimationRunnable;
    private androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback mBlockInvalidateCallback;
    private int mCurIndex;
    private android.graphics.drawable.Drawable mCurrDrawable;
    private androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private android.graphics.Rect mHotspotBounds;
    private android.graphics.drawable.Drawable mLastDrawable;
    private boolean mMutated;


    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean canApplyTheme(android.graphics.drawable.Drawable.ConstantState r0) {
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        public static void getOutline(android.graphics.drawable.Drawable r0, android.graphics.Outline r1) {
                r0.getOutline(r1)
                return
        }

        public static android.content.res.Resources getResources(android.content.res.Resources.Theme r0) {
                android.content.res.Resources r0 = r0.getResources()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class BlockInvalidateCallback implements android.graphics.drawable.Drawable.Callback {
        private android.graphics.drawable.Drawable.Callback mCallback;

        public BlockInvalidateCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2, @androidx.annotation.NonNull java.lang.Runnable r3, long r4) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.mCallback
                if (r0 == 0) goto L7
                r0.scheduleDrawable(r2, r3, r4)
            L7:
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2, @androidx.annotation.NonNull java.lang.Runnable r3) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.mCallback
                if (r0 == 0) goto L7
                r0.unscheduleDrawable(r2, r3)
            L7:
                return
        }

        public android.graphics.drawable.Drawable.Callback unwrap() {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.mCallback
                r1 = 0
                r2.mCallback = r1
                return r0
        }

        public androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback wrap(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.mCallback = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState {
        public boolean mAutoMirrored;
        public boolean mCanConstantState;
        public int mChangingConfigurations;
        public boolean mCheckedConstantSize;
        public boolean mCheckedConstantState;
        public boolean mCheckedOpacity;
        public boolean mCheckedPadding;
        public boolean mCheckedStateful;
        public int mChildrenChangingConfigurations;
        public android.graphics.ColorFilter mColorFilter;
        public int mConstantHeight;
        public int mConstantMinimumHeight;
        public int mConstantMinimumWidth;
        public android.graphics.Rect mConstantPadding;
        public boolean mConstantSize;
        public int mConstantWidth;
        public int mDensity;
        public boolean mDither;
        public android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> mDrawableFutures;
        public android.graphics.drawable.Drawable[] mDrawables;
        public int mEnterFadeDuration;
        public int mExitFadeDuration;
        public boolean mHasColorFilter;
        public boolean mHasTintList;
        public boolean mHasTintMode;
        public int mLayoutDirection;
        public int mNumChildren;
        public int mOpacity;
        public final androidx.appcompat.graphics.drawable.DrawableContainerCompat mOwner;
        public android.content.res.Resources mSourceRes;
        public boolean mStateful;
        public android.content.res.ColorStateList mTintList;
        public android.graphics.PorterDuff.Mode mTintMode;
        public boolean mVariablePadding;

        public DrawableContainerState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState r5, androidx.appcompat.graphics.drawable.DrawableContainerCompat r6, android.content.res.Resources r7) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r4.mVariablePadding = r0
                r4.mConstantSize = r0
                r1 = 1
                r4.mDither = r1
                r4.mEnterFadeDuration = r0
                r4.mExitFadeDuration = r0
                r4.mOwner = r6
                r6 = 0
                if (r7 == 0) goto L16
                r2 = r7
                goto L1c
            L16:
                if (r5 == 0) goto L1b
                android.content.res.Resources r2 = r5.mSourceRes
                goto L1c
            L1b:
                r2 = r6
            L1c:
                r4.mSourceRes = r2
                if (r5 == 0) goto L23
                int r2 = r5.mDensity
                goto L24
            L23:
                r2 = 0
            L24:
                int r3 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.$r8$clinit
                if (r7 != 0) goto L29
                goto L2f
            L29:
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r2 = r7.densityDpi
            L2f:
                if (r2 != 0) goto L33
                r2 = 160(0xa0, float:2.24E-43)
            L33:
                r4.mDensity = r2
                if (r5 == 0) goto Lf6
                int r7 = r5.mChangingConfigurations
                r4.mChangingConfigurations = r7
                int r7 = r5.mChildrenChangingConfigurations
                r4.mChildrenChangingConfigurations = r7
                r4.mCheckedConstantState = r1
                r4.mCanConstantState = r1
                boolean r7 = r5.mVariablePadding
                r4.mVariablePadding = r7
                boolean r7 = r5.mConstantSize
                r4.mConstantSize = r7
                boolean r7 = r5.mDither
                r4.mDither = r7
                int r7 = r5.mLayoutDirection
                r4.mLayoutDirection = r7
                int r7 = r5.mEnterFadeDuration
                r4.mEnterFadeDuration = r7
                int r7 = r5.mExitFadeDuration
                r4.mExitFadeDuration = r7
                boolean r7 = r5.mAutoMirrored
                r4.mAutoMirrored = r7
                android.graphics.ColorFilter r7 = r5.mColorFilter
                r4.mColorFilter = r7
                boolean r7 = r5.mHasColorFilter
                r4.mHasColorFilter = r7
                android.content.res.ColorStateList r7 = r5.mTintList
                r4.mTintList = r7
                android.graphics.PorterDuff$Mode r7 = r5.mTintMode
                r4.mTintMode = r7
                boolean r7 = r5.mHasTintList
                r4.mHasTintList = r7
                boolean r7 = r5.mHasTintMode
                r4.mHasTintMode = r7
                int r7 = r5.mDensity
                if (r7 != r2) goto La4
                boolean r7 = r5.mCheckedPadding
                if (r7 == 0) goto L8e
                android.graphics.Rect r7 = r5.mConstantPadding
                if (r7 == 0) goto L8a
                android.graphics.Rect r6 = new android.graphics.Rect
                android.graphics.Rect r7 = r5.mConstantPadding
                r6.<init>(r7)
            L8a:
                r4.mConstantPadding = r6
                r4.mCheckedPadding = r1
            L8e:
                boolean r6 = r5.mCheckedConstantSize
                if (r6 == 0) goto La4
                int r6 = r5.mConstantWidth
                r4.mConstantWidth = r6
                int r6 = r5.mConstantHeight
                r4.mConstantHeight = r6
                int r6 = r5.mConstantMinimumWidth
                r4.mConstantMinimumWidth = r6
                int r6 = r5.mConstantMinimumHeight
                r4.mConstantMinimumHeight = r6
                r4.mCheckedConstantSize = r1
            La4:
                boolean r6 = r5.mCheckedOpacity
                if (r6 == 0) goto Lae
                int r6 = r5.mOpacity
                r4.mOpacity = r6
                r4.mCheckedOpacity = r1
            Lae:
                boolean r6 = r5.mCheckedStateful
                if (r6 == 0) goto Lb8
                boolean r6 = r5.mStateful
                r4.mStateful = r6
                r4.mCheckedStateful = r1
            Lb8:
                android.graphics.drawable.Drawable[] r6 = r5.mDrawables
                int r7 = r6.length
                android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
                r4.mDrawables = r7
                int r7 = r5.mNumChildren
                r4.mNumChildren = r7
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r5.mDrawableFutures
                if (r5 == 0) goto Lce
                android.util.SparseArray r5 = r5.clone()
                r4.mDrawableFutures = r5
                goto Ld7
            Lce:
                android.util.SparseArray r5 = new android.util.SparseArray
                int r7 = r4.mNumChildren
                r5.<init>(r7)
                r4.mDrawableFutures = r5
            Ld7:
                int r5 = r4.mNumChildren
            Ld9:
                if (r0 >= r5) goto Lfe
                r7 = r6[r0]
                if (r7 == 0) goto Lf3
                r7 = r6[r0]
                android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
                if (r7 == 0) goto Led
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r4.mDrawableFutures
                r1.put(r0, r7)
                goto Lf3
            Led:
                android.graphics.drawable.Drawable[] r7 = r4.mDrawables
                r1 = r6[r0]
                r7[r0] = r1
            Lf3:
                int r0 = r0 + 1
                goto Ld9
            Lf6:
                r5 = 10
                android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
                r4.mDrawables = r5
                r4.mNumChildren = r0
            Lfe:
                return
        }

        private void createAllFutures() {
                r6 = this;
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r6.mDrawableFutures
                if (r0 == 0) goto L2d
                int r0 = r0.size()
                r1 = 0
            L9:
                if (r1 >= r0) goto L2a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r6.mDrawableFutures
                int r2 = r2.keyAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r6.mDrawableFutures
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.graphics.drawable.Drawable[] r4 = r6.mDrawables
                android.content.res.Resources r5 = r6.mSourceRes
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r5)
                android.graphics.drawable.Drawable r3 = r6.prepareDrawable(r3)
                r4[r2] = r3
                int r1 = r1 + 1
                goto L9
            L2a:
                r0 = 0
                r6.mDrawableFutures = r0
            L2d:
                return
        }

        private android.graphics.drawable.Drawable prepareDrawable(android.graphics.drawable.Drawable r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto Lb
                int r0 = r2.mLayoutDirection
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            Lb:
                android.graphics.drawable.Drawable r3 = r3.mutate()
                androidx.appcompat.graphics.drawable.DrawableContainerCompat r0 = r2.mOwner
                r3.setCallback(r0)
                return r3
        }

        public final int addChild(android.graphics.drawable.Drawable r5) {
                r4 = this;
                int r0 = r4.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r4.mDrawables
                int r1 = r1.length
                if (r0 < r1) goto Lc
                int r1 = r0 + 10
                r4.growArray(r0, r1)
            Lc:
                r5.mutate()
                r1 = 0
                r2 = 1
                r5.setVisible(r1, r2)
                androidx.appcompat.graphics.drawable.DrawableContainerCompat r3 = r4.mOwner
                r5.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r4.mDrawables
                r3[r0] = r5
                int r3 = r4.mNumChildren
                int r3 = r3 + r2
                r4.mNumChildren = r3
                int r2 = r4.mChildrenChangingConfigurations
                int r5 = r5.getChangingConfigurations()
                r5 = r5 | r2
                r4.mChildrenChangingConfigurations = r5
                r4.mCheckedOpacity = r1
                r4.mCheckedStateful = r1
                r5 = 0
                r4.mConstantPadding = r5
                r4.mCheckedPadding = r1
                r4.mCheckedConstantSize = r1
                r4.mCheckedConstantState = r1
                return r0
        }

        @androidx.annotation.RequiresApi(21)
        public final void applyTheme(android.content.res.Resources.Theme r6) {
                r5 = this;
                if (r6 == 0) goto L32
                r5.createAllFutures()
                int r0 = r5.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r5.mDrawables
                r2 = 0
            La:
                if (r2 >= r0) goto L2b
                r3 = r1[r2]
                if (r3 == 0) goto L28
                r3 = r1[r2]
                boolean r3 = androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r3)
                if (r3 == 0) goto L28
                r3 = r1[r2]
                androidx.core.graphics.drawable.DrawableCompat.applyTheme(r3, r6)
                int r3 = r5.mChildrenChangingConfigurations
                r4 = r1[r2]
                int r4 = r4.getChangingConfigurations()
                r3 = r3 | r4
                r5.mChildrenChangingConfigurations = r3
            L28:
                int r2 = r2 + 1
                goto La
            L2b:
                android.content.res.Resources r6 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getResources(r6)
                r5.updateDensity(r6)
            L32:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @androidx.annotation.RequiresApi(21)
        public boolean canApplyTheme() {
                r6 = this;
                int r0 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r6.mDrawables
                r2 = 0
                r3 = 0
            L6:
                if (r3 >= r0) goto L28
                r4 = r1[r3]
                r5 = 1
                if (r4 == 0) goto L14
                boolean r4 = androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r4)
                if (r4 == 0) goto L25
                return r5
            L14:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r4 = r6.mDrawableFutures
                java.lang.Object r4 = r4.get(r3)
                android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
                if (r4 == 0) goto L25
                boolean r4 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.canApplyTheme(r4)
                if (r4 == 0) goto L25
                return r5
            L25:
                int r3 = r3 + 1
                goto L6
            L28:
                return r2
        }

        public boolean canConstantState() {
                r6 = this;
                boolean r0 = r6.mCheckedConstantState
                if (r0 == 0) goto L7
                boolean r0 = r6.mCanConstantState
                return r0
            L7:
                r6.createAllFutures()
                r0 = 1
                r6.mCheckedConstantState = r0
                int r1 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r2 = r6.mDrawables
                r3 = 0
                r4 = 0
            L13:
                if (r4 >= r1) goto L23
                r5 = r2[r4]
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
                if (r5 != 0) goto L20
                r6.mCanConstantState = r3
                return r3
            L20:
                int r4 = r4 + 1
                goto L13
            L23:
                r6.mCanConstantState = r0
                return r0
        }

        public final void computeConstantSize() {
                r6 = this;
                r0 = 1
                r6.mCheckedConstantSize = r0
                r6.createAllFutures()
                int r0 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r6.mDrawables
                r2 = -1
                r6.mConstantHeight = r2
                r6.mConstantWidth = r2
                r2 = 0
                r6.mConstantMinimumHeight = r2
                r6.mConstantMinimumWidth = r2
            L14:
                if (r2 >= r0) goto L43
                r3 = r1[r2]
                int r4 = r3.getIntrinsicWidth()
                int r5 = r6.mConstantWidth
                if (r4 <= r5) goto L22
                r6.mConstantWidth = r4
            L22:
                int r4 = r3.getIntrinsicHeight()
                int r5 = r6.mConstantHeight
                if (r4 <= r5) goto L2c
                r6.mConstantHeight = r4
            L2c:
                int r4 = r3.getMinimumWidth()
                int r5 = r6.mConstantMinimumWidth
                if (r4 <= r5) goto L36
                r6.mConstantMinimumWidth = r4
            L36:
                int r3 = r3.getMinimumHeight()
                int r4 = r6.mConstantMinimumHeight
                if (r3 <= r4) goto L40
                r6.mConstantMinimumHeight = r3
            L40:
                int r2 = r2 + 1
                goto L14
            L43:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r2 = this;
                int r0 = r2.mChangingConfigurations
                int r1 = r2.mChildrenChangingConfigurations
                r0 = r0 | r1
                return r0
        }

        public final android.graphics.drawable.Drawable getChild(int r5) {
                r4 = this;
                android.graphics.drawable.Drawable[] r0 = r4.mDrawables
                r0 = r0[r5]
                if (r0 == 0) goto L7
                return r0
            L7:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r4.mDrawableFutures
                r1 = 0
                if (r0 == 0) goto L38
                int r0 = r0.indexOfKey(r5)
                if (r0 < 0) goto L38
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r4.mDrawableFutures
                java.lang.Object r2 = r2.valueAt(r0)
                android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
                android.content.res.Resources r3 = r4.mSourceRes
                android.graphics.drawable.Drawable r2 = r2.newDrawable(r3)
                android.graphics.drawable.Drawable r2 = r4.prepareDrawable(r2)
                android.graphics.drawable.Drawable[] r3 = r4.mDrawables
                r3[r5] = r2
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.mDrawableFutures
                r5.removeAt(r0)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.mDrawableFutures
                int r5 = r5.size()
                if (r5 != 0) goto L37
                r4.mDrawableFutures = r1
            L37:
                return r2
            L38:
                return r1
        }

        public final int getChildCount() {
                r1 = this;
                int r0 = r1.mNumChildren
                return r0
        }

        public final int getConstantHeight() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantHeight
                return r0
        }

        public final int getConstantMinimumHeight() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantMinimumHeight
                return r0
        }

        public final int getConstantMinimumWidth() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantMinimumWidth
                return r0
        }

        public final android.graphics.Rect getConstantPadding() {
                r8 = this;
                boolean r0 = r8.mVariablePadding
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                android.graphics.Rect r0 = r8.mConstantPadding
                if (r0 != 0) goto L57
                boolean r2 = r8.mCheckedPadding
                if (r2 == 0) goto Lf
                goto L57
            Lf:
                r8.createAllFutures()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                int r2 = r8.mNumChildren
                android.graphics.drawable.Drawable[] r3 = r8.mDrawables
                r4 = 0
                r5 = 0
            L1d:
                if (r5 >= r2) goto L51
                r6 = r3[r5]
                boolean r6 = r6.getPadding(r0)
                if (r6 == 0) goto L4e
                if (r1 != 0) goto L2e
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L2e:
                int r6 = r0.left
                int r7 = r1.left
                if (r6 <= r7) goto L36
                r1.left = r6
            L36:
                int r6 = r0.top
                int r7 = r1.top
                if (r6 <= r7) goto L3e
                r1.top = r6
            L3e:
                int r6 = r0.right
                int r7 = r1.right
                if (r6 <= r7) goto L46
                r1.right = r6
            L46:
                int r6 = r0.bottom
                int r7 = r1.bottom
                if (r6 <= r7) goto L4e
                r1.bottom = r6
            L4e:
                int r5 = r5 + 1
                goto L1d
            L51:
                r0 = 1
                r8.mCheckedPadding = r0
                r8.mConstantPadding = r1
                return r1
            L57:
                return r0
        }

        public final int getConstantWidth() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantWidth
                return r0
        }

        public final int getEnterFadeDuration() {
                r1 = this;
                int r0 = r1.mEnterFadeDuration
                return r0
        }

        public final int getExitFadeDuration() {
                r1 = this;
                int r0 = r1.mExitFadeDuration
                return r0
        }

        public final int getOpacity() {
                r6 = this;
                boolean r0 = r6.mCheckedOpacity
                if (r0 == 0) goto L7
                int r0 = r6.mOpacity
                return r0
            L7:
                r6.createAllFutures()
                int r0 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r6.mDrawables
                if (r0 <= 0) goto L18
                r2 = 0
                r2 = r1[r2]
                int r2 = r2.getOpacity()
                goto L19
            L18:
                r2 = -2
            L19:
                r3 = 1
                r4 = 1
            L1b:
                if (r4 >= r0) goto L2a
                r5 = r1[r4]
                int r5 = r5.getOpacity()
                int r2 = android.graphics.drawable.Drawable.resolveOpacity(r2, r5)
                int r4 = r4 + 1
                goto L1b
            L2a:
                r6.mOpacity = r2
                r6.mCheckedOpacity = r3
                return r2
        }

        public void growArray(int r3, int r4) {
                r2 = this;
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
                android.graphics.drawable.Drawable[] r0 = r2.mDrawables
                if (r0 == 0) goto La
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
            La:
                r2.mDrawables = r4
                return
        }

        public final boolean isConstantSize() {
                r1 = this;
                boolean r0 = r1.mConstantSize
                return r0
        }

        public final boolean isStateful() {
                r6 = this;
                boolean r0 = r6.mCheckedStateful
                if (r0 == 0) goto L7
                boolean r0 = r6.mStateful
                return r0
            L7:
                r6.createAllFutures()
                int r0 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r6.mDrawables
                r2 = 0
                r3 = 0
            L10:
                r4 = 1
                if (r3 >= r0) goto L20
                r5 = r1[r3]
                boolean r5 = r5.isStateful()
                if (r5 == 0) goto L1d
                r2 = 1
                goto L20
            L1d:
                int r3 = r3 + 1
                goto L10
            L20:
                r6.mStateful = r2
                r6.mCheckedStateful = r4
                return r2
        }

        public void mutate() {
                r4 = this;
                int r0 = r4.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r4.mDrawables
                r2 = 0
            L5:
                if (r2 >= r0) goto L13
                r3 = r1[r2]
                if (r3 == 0) goto L10
                r3 = r1[r2]
                r3.mutate()
            L10:
                int r2 = r2 + 1
                goto L5
            L13:
                return
        }

        public final void setConstantSize(boolean r1) {
                r0 = this;
                r0.mConstantSize = r1
                return
        }

        public final void setEnterFadeDuration(int r1) {
                r0 = this;
                r0.mEnterFadeDuration = r1
                return
        }

        public final void setExitFadeDuration(int r1) {
                r0 = this;
                r0.mExitFadeDuration = r1
                return
        }

        public final void setVariablePadding(boolean r1) {
                r0 = this;
                r0.mVariablePadding = r1
                return
        }

        public final void updateDensity(android.content.res.Resources r2) {
                r1 = this;
                if (r2 == 0) goto L1b
                r1.mSourceRes = r2
                int r0 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.$r8$clinit
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                int r2 = r2.densityDpi
                if (r2 != 0) goto L10
                r2 = 160(0xa0, float:2.24E-43)
            L10:
                int r0 = r1.mDensity
                r1.mDensity = r2
                if (r0 == r2) goto L1b
                r2 = 0
                r1.mCheckedConstantSize = r2
                r1.mCheckedPadding = r2
            L1b:
                return
        }
    }

    public DrawableContainerCompat() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.mAlpha = r0
            r0 = -1
            r1.mCurIndex = r0
            return
    }

    private void initializeDrawableForDisplay(android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r4.mBlockInvalidateCallback
            if (r0 != 0) goto Lb
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback
            r0.<init>()
            r4.mBlockInvalidateCallback = r0
        Lb:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r4.mBlockInvalidateCallback
            android.graphics.drawable.Drawable$Callback r1 = r5.getCallback()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r0.wrap(r1)
            r5.setCallback(r0)
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r4.mDrawableContainerState     // Catch: java.lang.Throwable -> L98
            int r0 = r0.mEnterFadeDuration     // Catch: java.lang.Throwable -> L98
            if (r0 > 0) goto L27
            boolean r0 = r4.mHasAlpha     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L27
            int r0 = r4.mAlpha     // Catch: java.lang.Throwable -> L98
            r5.setAlpha(r0)     // Catch: java.lang.Throwable -> L98
        L27:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r4.mDrawableContainerState     // Catch: java.lang.Throwable -> L98
            boolean r1 = r0.mHasColorFilter     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L33
            android.graphics.ColorFilter r0 = r0.mColorFilter     // Catch: java.lang.Throwable -> L98
            r5.setColorFilter(r0)     // Catch: java.lang.Throwable -> L98
            goto L47
        L33:
            boolean r1 = r0.mHasTintList     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L3c
            android.content.res.ColorStateList r0 = r0.mTintList     // Catch: java.lang.Throwable -> L98
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r5, r0)     // Catch: java.lang.Throwable -> L98
        L3c:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r4.mDrawableContainerState     // Catch: java.lang.Throwable -> L98
            boolean r1 = r0.mHasTintMode     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L47
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode     // Catch: java.lang.Throwable -> L98
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r5, r0)     // Catch: java.lang.Throwable -> L98
        L47:
            boolean r0 = r4.isVisible()     // Catch: java.lang.Throwable -> L98
            r1 = 1
            r5.setVisible(r0, r1)     // Catch: java.lang.Throwable -> L98
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r4.mDrawableContainerState     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.mDither     // Catch: java.lang.Throwable -> L98
            r5.setDither(r0)     // Catch: java.lang.Throwable -> L98
            int[] r0 = r4.getState()     // Catch: java.lang.Throwable -> L98
            r5.setState(r0)     // Catch: java.lang.Throwable -> L98
            int r0 = r4.getLevel()     // Catch: java.lang.Throwable -> L98
            r5.setLevel(r0)     // Catch: java.lang.Throwable -> L98
            android.graphics.Rect r0 = r4.getBounds()     // Catch: java.lang.Throwable -> L98
            r5.setBounds(r0)     // Catch: java.lang.Throwable -> L98
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L98
            r1 = 23
            if (r0 < r1) goto L78
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r4)     // Catch: java.lang.Throwable -> L98
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r5, r0)     // Catch: java.lang.Throwable -> L98
        L78:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r4.mDrawableContainerState     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.mAutoMirrored     // Catch: java.lang.Throwable -> L98
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r5, r0)     // Catch: java.lang.Throwable -> L98
            android.graphics.Rect r0 = r4.mHotspotBounds     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L8e
            int r1 = r0.left     // Catch: java.lang.Throwable -> L98
            int r2 = r0.top     // Catch: java.lang.Throwable -> L98
            int r3 = r0.right     // Catch: java.lang.Throwable -> L98
            int r0 = r0.bottom     // Catch: java.lang.Throwable -> L98
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r5, r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L98
        L8e:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r4.mBlockInvalidateCallback
            android.graphics.drawable.Drawable$Callback r0 = r0.unwrap()
            r5.setCallback(r0)
            return
        L98:
            r0 = move-exception
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r1 = r4.mBlockInvalidateCallback
            android.graphics.drawable.Drawable$Callback r1 = r1.unwrap()
            r5.setCallback(r1)
            throw r0
    }

    private boolean needsMirroring() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            r1 = 1
            if (r0 == 0) goto Le
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public final void animate(boolean r14) {
            r13 = this;
            r0 = 1
            r13.mHasAlpha = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.mCurrDrawable
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.mEnterAnimationEnd
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.mAlpha
            r3.setAlpha(r9)
            r13.mEnterAnimationEnd = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r9 = r13.mDrawableContainerState
            int r9 = r9.mEnterFadeDuration
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.mAlpha
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.mEnterAnimationEnd = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.mLastDrawable
            if (r9 == 0) goto L65
            long r10 = r13.mExitAnimationEnd
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.mLastDrawable = r0
            r13.mExitAnimationEnd = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r4 = r13.mDrawableContainerState
            int r4 = r4.mExitFadeDuration
            int r3 = r3 / r4
            int r4 = r13.mAlpha
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.mExitAnimationEnd = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.mAnimationRunnable
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.RequiresApi(21)
    public void applyTheme(@androidx.annotation.NonNull android.content.res.Resources.Theme r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.applyTheme(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.RequiresApi(21)
    public boolean canApplyTheme() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    public androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L7
            r0.draw(r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto Le
            r0.draw(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.mAlpha
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r1 = r2.mDrawableContainerState
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            boolean r0 = r0.canConstantState()
            if (r0 == 0) goto L13
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            int r1 = r2.getChangingConfigurations()
            r0.mChangingConfigurations = r1
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.NonNull
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            return r0
    }

    final int getCurrentIndex() {
            r1 = this;
            int r0 = r1.mCurIndex
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.mHotspotBounds
            if (r0 == 0) goto L8
            r2.set(r0)
            goto Lb
        L8:
            super.getHotspotBounds(r2)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantHeight()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L18
            int r0 = r0.getIntrinsicHeight()
            goto L19
        L18:
            r0 = -1
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantWidth()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L18
            int r0 = r0.getIntrinsicWidth()
            goto L19
        L18:
            r0 = -1
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantMinimumHeight()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L18
            int r0 = r0.getMinimumHeight()
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantMinimumWidth()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L18
            int r0 = r0.getMinimumWidth()
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L12
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getOpacity()
            goto L13
        L12:
            r0 = -2
        L13:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.RequiresApi(21)
    public void getOutline(@androidx.annotation.NonNull android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L7
            androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getOutline(r0, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@androidx.annotation.NonNull android.graphics.Rect r4) {
            r3 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r3.mDrawableContainerState
            android.graphics.Rect r0 = r0.getConstantPadding()
            if (r0 == 0) goto L1c
            r4.set(r0)
            int r1 = r0.left
            int r2 = r0.top
            r1 = r1 | r2
            int r2 = r0.bottom
            r1 = r1 | r2
            int r0 = r0.right
            r0 = r0 | r1
            if (r0 == 0) goto L1a
            r0 = 1
            goto L29
        L1a:
            r0 = 0
            goto L29
        L1c:
            android.graphics.drawable.Drawable r0 = r3.mCurrDrawable
            if (r0 == 0) goto L25
            boolean r0 = r0.getPadding(r4)
            goto L29
        L25:
            boolean r0 = super.getPadding(r4)
        L29:
            boolean r1 = r3.needsMirroring()
            if (r1 == 0) goto L37
            int r1 = r4.left
            int r2 = r4.right
            r4.left = r2
            r4.right = r1
        L37:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            if (r0 == 0) goto L9
            r1 = 0
            r0.mCheckedOpacity = r1
            r0.mCheckedStateful = r1
        L9:
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r3 != r0) goto L1a
            android.graphics.drawable.Drawable$Callback r3 = r2.getCallback()
            if (r3 == 0) goto L1a
            android.graphics.drawable.Drawable$Callback r3 = r2.getCallback()
            r3.invalidateDrawable(r2)
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.mAutoMirrored
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.mLastDrawable
            r1 = 1
            if (r0 == 0) goto Ld
            r0.jumpToCurrentState()
            r0 = 0
            r7.mLastDrawable = r0
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.drawable.Drawable r2 = r7.mCurrDrawable
            if (r2 == 0) goto L20
            r2.jumpToCurrentState()
            boolean r2 = r7.mHasAlpha
            if (r2 == 0) goto L20
            android.graphics.drawable.Drawable r2 = r7.mCurrDrawable
            int r3 = r7.mAlpha
            r2.setAlpha(r3)
        L20:
            long r2 = r7.mExitAnimationEnd
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2b
            r7.mExitAnimationEnd = r4
            r0 = 1
        L2b:
            long r2 = r7.mEnterAnimationEnd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            r7.mEnterAnimationEnd = r4
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3a
            r7.invalidateSelf()
        L3a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.mMutated
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L17
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.cloneConstantState()
            r0.mutate()
            r1.setConstantState(r0)
            r0 = 1
            r1.mMutated = r0
        L17:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto Le
            r0.setBounds(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r10) {
            r9 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r1 = r9.mCurIndex
            int r2 = r0.mNumChildren
            android.graphics.drawable.Drawable[] r3 = r0.mDrawables
            r4 = 0
            r5 = 0
            r6 = 0
        Lb:
            if (r5 >= r2) goto L25
            r7 = r3[r5]
            if (r7 == 0) goto L22
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            if (r7 < r8) goto L1e
            r7 = r3[r5]
            boolean r7 = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r7, r10)
            goto L1f
        L1e:
            r7 = 0
        L1f:
            if (r5 != r1) goto L22
            r6 = r7
        L22:
            int r5 = r5 + 1
            goto Lb
        L25:
            r0.mLayoutDirection = r10
            return r6
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L12
            boolean r2 = r0.setLevel(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@androidx.annotation.NonNull int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L12
            boolean r2 = r0.setState(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2, @androidx.annotation.NonNull java.lang.Runnable r3, long r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.scheduleDrawable(r1, r3, r4)
        L11:
            return
    }

    public final boolean selectDrawable(int r10) {
            r9 = this;
            int r0 = r9.mCurIndex
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r0 = r0.mExitFadeDuration
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.mLastDrawable
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            if (r0 == 0) goto L29
            r9.mLastDrawable = r0
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r0 = r0.mExitFadeDuration
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.mExitAnimationEnd = r0
            goto L35
        L29:
            r9.mLastDrawable = r4
            r9.mExitAnimationEnd = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r1 = r0.mNumChildren
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.getChild(r10)
            r9.mCurrDrawable = r0
            r9.mCurIndex = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r10 = r9.mDrawableContainerState
            int r10 = r10.mEnterFadeDuration
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.mEnterAnimationEnd = r2
        L51:
            r9.initializeDrawableForDisplay(r0)
            goto L5a
        L55:
            r9.mCurrDrawable = r4
            r10 = -1
            r9.mCurIndex = r10
        L5a:
            long r0 = r9.mEnterAnimationEnd
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.mExitAnimationEnd
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.mAnimationRunnable
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$1 r0 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$1
            r0.<init>(r9)
            r9.mAnimationRunnable = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.animate(r10)
        L79:
            r9.invalidateSelf()
            return r10
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r7) {
            r6 = this;
            boolean r0 = r6.mHasAlpha
            if (r0 == 0) goto L8
            int r0 = r6.mAlpha
            if (r0 == r7) goto L21
        L8:
            r0 = 1
            r6.mHasAlpha = r0
            r6.mAlpha = r7
            android.graphics.drawable.Drawable r0 = r6.mCurrDrawable
            if (r0 == 0) goto L21
            long r1 = r6.mEnterAnimationEnd
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            r0.setAlpha(r7)
            goto L21
        L1d:
            r7 = 0
            r6.animate(r7)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            boolean r1 = r0.mAutoMirrored
            if (r1 == r3) goto Lf
            r0.mAutoMirrored = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r0 == 0) goto Lf
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r1 = 1
            r0.mHasColorFilter = r1
            android.graphics.ColorFilter r1 = r0.mColorFilter
            if (r1 == r3) goto L12
            r0.mColorFilter = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r0 == 0) goto L12
            r0.setColorFilter(r3)
        L12:
            return
    }

    public void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState r2) {
            r1 = this;
            r1.mDrawableContainerState = r2
            int r0 = r1.mCurIndex
            if (r0 < 0) goto L11
            android.graphics.drawable.Drawable r2 = r2.getChild(r0)
            r1.mCurrDrawable = r2
            if (r2 == 0) goto L11
            r1.initializeDrawableForDisplay(r2)
        L11:
            r2 = 0
            r1.mLastDrawable = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            boolean r1 = r0.mDither
            if (r1 == r3) goto Lf
            r0.mDither = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r0 == 0) goto Lf
            r0.setDither(r3)
        Lf:
            return
    }

    public void setEnterFadeDuration(int r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.mEnterFadeDuration = r2
            return
    }

    public void setExitFadeDuration(int r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.mExitFadeDuration = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L7
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.mHotspotBounds
            if (r0 != 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r3, r4, r5)
            r1.mHotspotBounds = r0
            goto Lf
        Lc:
            r0.set(r2, r3, r4, r5)
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L16
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r2, r3, r4, r5)
        L16:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r1 = 1
            r0.mHasTintList = r1
            android.content.res.ColorStateList r1 = r0.mTintList
            if (r1 == r3) goto L10
            r0.mTintList = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@androidx.annotation.NonNull android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r1 = 1
            r0.mHasTintMode = r1
            android.graphics.PorterDuff$Mode r1 = r0.mTintMode
            if (r1 == r3) goto L10
            r0.mTintMode = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            android.graphics.drawable.Drawable r1 = r2.mLastDrawable
            if (r1 == 0) goto Lb
            r1.setVisible(r3, r4)
        Lb:
            android.graphics.drawable.Drawable r1 = r2.mCurrDrawable
            if (r1 == 0) goto L12
            r1.setVisible(r3, r4)
        L12:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2, @androidx.annotation.NonNull java.lang.Runnable r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.unscheduleDrawable(r1, r3)
        L11:
            return
    }

    public final void updateDensity(android.content.res.Resources r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.updateDensity(r2)
            return
    }
}
