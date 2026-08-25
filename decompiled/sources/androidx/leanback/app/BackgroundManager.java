package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundManager {
    private static final int CHANGE_BG_DELAY_MS = 500;
    private static final int FADE_DURATION = 500;
    private static final java.lang.String FRAGMENT_TAG = "androidx.leanback.app.BackgroundManager";
    private final android.view.animation.Interpolator mAccelerateInterpolator;
    private final android.animation.Animator.AnimatorListener mAnimationListener;
    private final android.animation.ValueAnimator.AnimatorUpdateListener mAnimationUpdateListener;
    public final android.animation.ValueAnimator mAnimator;
    public boolean mAttached;
    private boolean mAutoReleaseOnStop;
    public int mBackgroundColor;
    public android.graphics.drawable.Drawable mBackgroundDrawable;
    private android.view.View mBgView;
    public androidx.leanback.app.BackgroundManager.ChangeBackgroundRunnable mChangeRunnable;
    private boolean mChangeRunnablePending;
    public android.app.Activity mContext;
    private final android.view.animation.Interpolator mDecelerateInterpolator;
    private androidx.leanback.app.BackgroundFragment mFragmentState;
    public android.os.Handler mHandler;
    private int mHeightPx;
    public int mImageInWrapperIndex;
    private long mLastSetTime;
    public androidx.leanback.app.BackgroundManager.TranslucentLayerDrawable mLayerDrawable;
    private androidx.leanback.app.BackgroundManager.BackgroundContinuityService mService;
    private int mThemeDrawableResourceId;
    private int mWidthPx;



    /* JADX INFO: loaded from: classes2.dex */
    public static class BackgroundContinuityService {
        private static final boolean DEBUG = false;
        private static final java.lang.String TAG = "BackgroundContinuity";
        private static androidx.leanback.app.BackgroundManager.BackgroundContinuityService sService;
        private int mColor;
        private int mCount;
        private android.graphics.drawable.Drawable mDrawable;
        private int mLastThemeDrawableId;
        private java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState> mLastThemeDrawableState;

        static {
                androidx.leanback.app.BackgroundManager$BackgroundContinuityService r0 = new androidx.leanback.app.BackgroundManager$BackgroundContinuityService
                r0.<init>()
                androidx.leanback.app.BackgroundManager.BackgroundContinuityService.sService = r0
                return
        }

        private BackgroundContinuityService() {
                r0 = this;
                r0.<init>()
                r0.reset()
                return
        }

        public static androidx.leanback.app.BackgroundManager.BackgroundContinuityService getInstance() {
                androidx.leanback.app.BackgroundManager$BackgroundContinuityService r0 = androidx.leanback.app.BackgroundManager.BackgroundContinuityService.sService
                int r1 = r0.mCount
                int r1 = r1 + 1
                r0.mCount = r1
                return r0
        }

        private void reset() {
                r1 = this;
                r0 = 0
                r1.mColor = r0
                r0 = 0
                r1.mDrawable = r0
                return
        }

        public int getColor() {
                r1 = this;
                int r0 = r1.mColor
                return r0
        }

        public android.graphics.drawable.Drawable getDrawable() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mDrawable
                return r0
        }

        public android.graphics.drawable.Drawable getThemeDrawable(android.content.Context r3, int r4) {
                r2 = this;
                java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState> r0 = r2.mLastThemeDrawableState
                if (r0 == 0) goto L15
                int r1 = r2.mLastThemeDrawableId
                if (r1 != r4) goto L15
                java.lang.Object r0 = r0.get()
                android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
                if (r0 == 0) goto L15
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                goto L16
            L15:
                r0 = 0
            L16:
                if (r0 != 0) goto L29
                android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r3, r4)
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                android.graphics.drawable.Drawable$ConstantState r1 = r0.getConstantState()
                r3.<init>(r1)
                r2.mLastThemeDrawableState = r3
                r2.mLastThemeDrawableId = r4
            L29:
                return r0
        }

        public void setColor(int r1) {
                r0 = this;
                r0.mColor = r1
                r1 = 0
                r0.mDrawable = r1
                return
        }

        public void setDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.mDrawable = r1
                return
        }

        public void unref() {
                r3 = this;
                int r0 = r3.mCount
                if (r0 <= 0) goto Le
                int r0 = r0 + (-1)
                r3.mCount = r0
                if (r0 != 0) goto Ld
                r3.reset()
            Ld:
                return
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Can't unref, count "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r3.mCount
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class BitmapDrawable extends android.graphics.drawable.Drawable {
        public boolean mMutated;
        public androidx.leanback.app.BackgroundManager.BitmapDrawable.ConstantState mState;

        public static final class ConstantState extends android.graphics.drawable.Drawable.ConstantState {
            public final android.graphics.Bitmap mBitmap;
            public final android.graphics.Matrix mMatrix;
            public final android.graphics.Paint mPaint;

            public ConstantState(android.graphics.Bitmap r2, android.graphics.Matrix r3) {
                    r1 = this;
                    r1.<init>()
                    android.graphics.Paint r0 = new android.graphics.Paint
                    r0.<init>()
                    r1.mPaint = r0
                    r1.mBitmap = r2
                    if (r3 == 0) goto Lf
                    goto L14
                Lf:
                    android.graphics.Matrix r3 = new android.graphics.Matrix
                    r3.<init>()
                L14:
                    r1.mMatrix = r3
                    r2 = 1
                    r0.setFilterBitmap(r2)
                    return
            }

            public ConstantState(androidx.leanback.app.BackgroundManager.BitmapDrawable.ConstantState r4) {
                    r3 = this;
                    r3.<init>()
                    android.graphics.Paint r0 = new android.graphics.Paint
                    r0.<init>()
                    r3.mPaint = r0
                    android.graphics.Bitmap r1 = r4.mBitmap
                    r3.mBitmap = r1
                    android.graphics.Matrix r1 = r4.mMatrix
                    if (r1 == 0) goto L1a
                    android.graphics.Matrix r1 = new android.graphics.Matrix
                    android.graphics.Matrix r2 = r4.mMatrix
                    r1.<init>(r2)
                    goto L1f
                L1a:
                    android.graphics.Matrix r1 = new android.graphics.Matrix
                    r1.<init>()
                L1f:
                    r3.mMatrix = r1
                    android.graphics.Paint r1 = r4.mPaint
                    int r1 = r1.getAlpha()
                    r2 = 255(0xff, float:3.57E-43)
                    if (r1 == r2) goto L34
                    android.graphics.Paint r1 = r4.mPaint
                    int r1 = r1.getAlpha()
                    r0.setAlpha(r1)
                L34:
                    android.graphics.Paint r1 = r4.mPaint
                    android.graphics.ColorFilter r1 = r1.getColorFilter()
                    if (r1 == 0) goto L45
                    android.graphics.Paint r4 = r4.mPaint
                    android.graphics.ColorFilter r4 = r4.getColorFilter()
                    r0.setColorFilter(r4)
                L45:
                    r4 = 1
                    r0.setFilterBitmap(r4)
                    return
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public int getChangingConfigurations() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.graphics.drawable.Drawable.ConstantState
            public android.graphics.drawable.Drawable newDrawable() {
                    r1 = this;
                    androidx.leanback.app.BackgroundManager$BitmapDrawable r0 = new androidx.leanback.app.BackgroundManager$BitmapDrawable
                    r0.<init>(r1)
                    return r0
            }
        }

        public BitmapDrawable() {
                r2 = this;
                r2.<init>()
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = new androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState
                r1 = 0
                r0.<init>(r1, r1)
                r2.mState = r0
                return
        }

        public BitmapDrawable(android.graphics.Bitmap r2, android.graphics.Matrix r3) {
                r1 = this;
                r1.<init>()
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = new androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState
                r0.<init>(r2, r3)
                r1.mState = r0
                return
        }

        public BitmapDrawable(androidx.leanback.app.BackgroundManager.BitmapDrawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.mState = r1
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r4) {
                r3 = this;
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r3.mState
                android.graphics.Bitmap r1 = r0.mBitmap
                if (r1 != 0) goto L7
                return
            L7:
                android.graphics.Paint r0 = r0.mPaint
                int r0 = r0.getAlpha()
                r1 = 255(0xff, float:3.57E-43)
                if (r0 >= r1) goto L24
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r3.mState
                android.graphics.Paint r0 = r0.mPaint
                android.graphics.ColorFilter r0 = r0.getColorFilter()
                if (r0 != 0) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Can't draw with translucent alpha and color filter"
                r4.<init>(r0)
                throw r4
            L24:
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r3.mState
                android.graphics.Bitmap r1 = r0.mBitmap
                android.graphics.Matrix r2 = r0.mMatrix
                android.graphics.Paint r0 = r0.mPaint
                r4.drawBitmap(r1, r2, r0)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public android.graphics.ColorFilter getColorFilter() {
                r1 = this;
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r1.mState
                android.graphics.Paint r0 = r0.mPaint
                android.graphics.ColorFilter r0 = r0.getColorFilter()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable.ConstantState getConstantState() {
                r1 = this;
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r1.getConstantState()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public androidx.leanback.app.BackgroundManager.BitmapDrawable.ConstantState getConstantState() {
                r1 = this;
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r1.mState
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        @androidx.annotation.NonNull
        public android.graphics.drawable.Drawable mutate() {
                r2 = this;
                boolean r0 = r2.mMutated
                if (r0 != 0) goto L10
                r0 = 1
                r2.mMutated = r0
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = new androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r1 = r2.mState
                r0.<init>(r1)
                r2.mState = r0
            L10:
                return r2
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
                r1 = this;
                r1.mutate()
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r1.mState
                android.graphics.Paint r0 = r0.mPaint
                int r0 = r0.getAlpha()
                if (r0 == r2) goto L17
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r1.mState
                android.graphics.Paint r0 = r0.mPaint
                r0.setAlpha(r2)
                r1.invalidateSelf()
            L17:
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter r2) {
                r1 = this;
                r1.mutate()
                androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r0 = r1.mState
                android.graphics.Paint r0 = r0.mPaint
                r0.setColorFilter(r2)
                r1.invalidateSelf()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class ChangeBackgroundRunnable implements java.lang.Runnable {
        public final android.graphics.drawable.Drawable mDrawable;
        public final /* synthetic */ androidx.leanback.app.BackgroundManager this$0;

        public ChangeBackgroundRunnable(androidx.leanback.app.BackgroundManager r1, android.graphics.drawable.Drawable r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mDrawable = r2
                return
        }

        private void runTask() {
                r5 = this;
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r1 = r0.mLayerDrawable
                if (r1 != 0) goto L7
                return
            L7:
                r2 = 0
                if (r1 != 0) goto Lc
                r1 = r2
                goto L12
            Lc:
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r1 = r1.mWrapper
                int r3 = r0.mImageInWrapperIndex
                r1 = r1[r3]
            L12:
                if (r1 == 0) goto L39
                android.graphics.drawable.Drawable r3 = r5.mDrawable
                android.graphics.drawable.Drawable r4 = r1.getDrawable()
                boolean r0 = r0.sameDrawable(r3, r4)
                if (r0 == 0) goto L21
                return
            L21:
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r3 = r0.mLayerDrawable
                int r4 = androidx.leanback.R.id.background_imagein
                android.app.Activity r0 = r0.mContext
                r3.clearDrawable(r4, r0)
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r0.mLayerDrawable
                int r3 = androidx.leanback.R.id.background_imageout
                android.graphics.drawable.Drawable r1 = r1.getDrawable()
                r0.updateDrawable(r3, r1)
            L39:
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                boolean r1 = r0.mAttached
                if (r1 != 0) goto L40
                goto L7a
            L40:
                androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r1 = r0.mLayerDrawable
                if (r1 != 0) goto L45
                goto L4b
            L45:
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r2 = r1.mWrapper
                int r0 = r0.mImageInWrapperIndex
                r2 = r2[r0]
            L4b:
                if (r2 != 0) goto L6a
                android.graphics.drawable.Drawable r0 = r5.mDrawable
                if (r0 == 0) goto L6a
                int r2 = androidx.leanback.R.id.background_imagein
                r1.updateDrawable(r2, r0)
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r1 = r0.mLayerDrawable
                int r0 = r0.mImageInWrapperIndex
                r2 = 0
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r3 = r1.mWrapper
                r4 = r3[r0]
                if (r4 == 0) goto L6a
                r0 = r3[r0]
                r0.mAlpha = r2
                r1.invalidateSelf()
            L6a:
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                android.animation.ValueAnimator r0 = r0.mAnimator
                r1 = 500(0x1f4, double:2.47E-321)
                r0.setDuration(r1)
                androidx.leanback.app.BackgroundManager r0 = r5.this$0
                android.animation.ValueAnimator r0 = r0.mAnimator
                r0.start()
            L7a:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                r2.runTask()
                androidx.leanback.app.BackgroundManager r0 = r2.this$0
                r1 = 0
                r0.mChangeRunnable = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class DrawableWrapper {
        public int mAlpha;
        public final android.graphics.drawable.Drawable mDrawable;

        public DrawableWrapper(android.graphics.drawable.Drawable r2) {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.mAlpha = r0
                r1.mDrawable = r2
                return
        }

        public DrawableWrapper(androidx.leanback.app.BackgroundManager.DrawableWrapper r2, android.graphics.drawable.Drawable r3) {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.mAlpha = r0
                r1.mDrawable = r3
                int r2 = r2.mAlpha
                r1.mAlpha = r2
                return
        }

        public android.graphics.drawable.Drawable getDrawable() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mDrawable
                return r0
        }

        public void setColor(int r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mDrawable
                android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
                r0.setColor(r2)
                return
        }
    }

    public static class EmptyDrawable extends androidx.leanback.app.BackgroundManager.BitmapDrawable {
        public EmptyDrawable(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class TranslucentLayerDrawable extends android.graphics.drawable.LayerDrawable {
        public int mAlpha;
        public java.lang.ref.WeakReference<androidx.leanback.app.BackgroundManager> mManagerWeakReference;
        public boolean mSuspendInvalidation;
        public androidx.leanback.app.BackgroundManager.DrawableWrapper[] mWrapper;

        public TranslucentLayerDrawable(androidx.leanback.app.BackgroundManager r5, android.graphics.drawable.Drawable[] r6) {
                r4 = this;
                r4.<init>(r6)
                r0 = 255(0xff, float:3.57E-43)
                r4.mAlpha = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r5)
                r4.mManagerWeakReference = r0
                int r5 = r6.length
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r0 = new androidx.leanback.app.BackgroundManager.DrawableWrapper[r5]
                r4.mWrapper = r0
                r0 = 0
            L14:
                if (r0 >= r5) goto L24
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r1 = r4.mWrapper
                androidx.leanback.app.BackgroundManager$DrawableWrapper r2 = new androidx.leanback.app.BackgroundManager$DrawableWrapper
                r3 = r6[r0]
                r2.<init>(r3)
                r1[r0] = r2
                int r0 = r0 + 1
                goto L14
            L24:
                return
        }

        public void clearDrawable(int r4, android.content.Context r5) {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r3.getNumberOfLayers()
                if (r0 >= r1) goto L2a
                int r1 = r3.getId(r0)
                if (r1 != r4) goto L27
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r1 = r3.mWrapper
                r2 = 0
                r1[r0] = r2
                android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
                boolean r0 = r0 instanceof androidx.leanback.app.BackgroundManager.EmptyDrawable
                if (r0 != 0) goto L2a
                androidx.leanback.app.BackgroundManager$EmptyDrawable r0 = new androidx.leanback.app.BackgroundManager$EmptyDrawable
                android.content.res.Resources r5 = r5.getResources()
                r0.<init>(r5)
                super.setDrawableByLayerId(r4, r0)
                goto L2a
            L27:
                int r0 = r0 + 1
                goto L1
            L2a:
                return
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r11) {
                r10 = this;
                r0 = 0
                r1 = 0
            L2:
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r2 = r10.mWrapper
                int r3 = r2.length
                if (r1 >= r3) goto L5b
                r3 = r2[r1]
                if (r3 == 0) goto L58
                r2 = r2[r1]
                android.graphics.drawable.Drawable r2 = r2.getDrawable()
                if (r2 == 0) goto L58
                int r3 = androidx.core.graphics.drawable.DrawableCompat.getAlpha(r2)
                int r4 = r10.mAlpha
                r5 = 255(0xff, float:3.57E-43)
                r6 = 1
                if (r4 >= r5) goto L22
                int r4 = r4 * r3
                r7 = 1
                goto L24
            L22:
                r4 = r3
                r7 = 0
            L24:
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r8 = r10.mWrapper
                r9 = r8[r1]
                int r9 = r9.mAlpha
                if (r9 >= r5) goto L34
                r5 = r8[r1]
                int r5 = r5.mAlpha
                int r4 = r4 * r5
                int r7 = r7 + 1
            L34:
                if (r7 != 0) goto L3a
                r2.draw(r11)
                goto L58
            L3a:
                if (r7 != r6) goto L3f
                int r4 = r4 / 255
                goto L46
            L3f:
                r5 = 2
                if (r7 != r5) goto L46
                r5 = 65025(0xfe01, float:9.112E-41)
                int r4 = r4 / r5
            L46:
                r10.mSuspendInvalidation = r6     // Catch: java.lang.Throwable -> L54
                r2.setAlpha(r4)     // Catch: java.lang.Throwable -> L54
                r2.draw(r11)     // Catch: java.lang.Throwable -> L54
                r2.setAlpha(r3)     // Catch: java.lang.Throwable -> L54
                r10.mSuspendInvalidation = r0
                goto L58
            L54:
                r11 = move-exception
                r10.mSuspendInvalidation = r0
                throw r11
            L58:
                int r1 = r1 + 1
                goto L2
            L5b:
                return
        }

        public int findWrapperIndexById(int r3) {
                r2 = this;
                r0 = 0
            L1:
                int r1 = r2.getNumberOfLayers()
                if (r0 >= r1) goto L11
                int r1 = r2.getId(r0)
                if (r1 != r3) goto Le
                return r0
            Le:
                int r0 = r0 + 1
                goto L1
            L11:
                r3 = -1
                return r3
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getAlpha() {
                r1 = this;
                int r0 = r1.mAlpha
                return r0
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getOpacity() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                boolean r0 = r1.mSuspendInvalidation
                if (r0 != 0) goto L7
                super.invalidateDrawable(r2)
            L7:
                return
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public android.graphics.drawable.Drawable mutate() {
                r7 = this;
                android.graphics.drawable.Drawable r0 = super.mutate()
                int r1 = r7.getNumberOfLayers()
                r2 = 0
            L9:
                if (r2 >= r1) goto L21
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r3 = r7.mWrapper
                r4 = r3[r2]
                if (r4 == 0) goto L1e
                androidx.leanback.app.BackgroundManager$DrawableWrapper r4 = new androidx.leanback.app.BackgroundManager$DrawableWrapper
                r5 = r3[r2]
                android.graphics.drawable.Drawable r6 = r7.getDrawable(r2)
                r4.<init>(r5, r6)
                r3[r2] = r4
            L1e:
                int r2 = r2 + 1
                goto L9
            L21:
                return r0
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
                r1 = this;
                int r0 = r1.mAlpha
                if (r0 == r2) goto L16
                r1.mAlpha = r2
                r1.invalidateSelf()
                java.lang.ref.WeakReference<androidx.leanback.app.BackgroundManager> r2 = r1.mManagerWeakReference
                java.lang.Object r2 = r2.get()
                androidx.leanback.app.BackgroundManager r2 = (androidx.leanback.app.BackgroundManager) r2
                if (r2 == 0) goto L16
                r2.postChangeRunnable()
            L16:
                return
        }

        @Override // android.graphics.drawable.LayerDrawable
        public boolean setDrawableByLayerId(int r1, android.graphics.drawable.Drawable r2) {
                r0 = this;
                androidx.leanback.app.BackgroundManager$DrawableWrapper r1 = r0.updateDrawable(r1, r2)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        public androidx.leanback.app.BackgroundManager.DrawableWrapper updateDrawable(int r3, android.graphics.drawable.Drawable r4) {
                r2 = this;
                super.setDrawableByLayerId(r3, r4)
                r0 = 0
            L4:
                int r1 = r2.getNumberOfLayers()
                if (r0 >= r1) goto L24
                int r1 = r2.getId(r0)
                if (r1 != r3) goto L21
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r3 = r2.mWrapper
                androidx.leanback.app.BackgroundManager$DrawableWrapper r1 = new androidx.leanback.app.BackgroundManager$DrawableWrapper
                r1.<init>(r4)
                r3[r0] = r1
                r2.invalidateSelf()
                androidx.leanback.app.BackgroundManager$DrawableWrapper[] r3 = r2.mWrapper
                r3 = r3[r0]
                return r3
            L21:
                int r0 = r0 + 1
                goto L4
            L24:
                r3 = 0
                return r3
        }
    }

    private BackgroundManager(android.app.Activity r7) {
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.mAutoReleaseOnStop = r0
            androidx.leanback.app.BackgroundManager$1 r1 = new androidx.leanback.app.BackgroundManager$1
            r1.<init>(r6)
            r6.mAnimationListener = r1
            androidx.leanback.app.BackgroundManager$2 r2 = new androidx.leanback.app.BackgroundManager$2
            r2.<init>(r6)
            r6.mAnimationUpdateListener = r2
            r6.mContext = r7
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r3 = androidx.leanback.app.BackgroundManager.BackgroundContinuityService.getInstance()
            r6.mService = r3
            android.app.Activity r3 = r6.mContext
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            r6.mHeightPx = r3
            android.app.Activity r3 = r6.mContext
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            r6.mWidthPx = r3
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r6.mHandler = r3
            androidx.interpolator.view.animation.FastOutLinearInInterpolator r3 = new androidx.interpolator.view.animation.FastOutLinearInInterpolator
            r3.<init>()
            android.app.Activity r4 = r6.mContext
            r5 = 17432581(0x10a0005, float:2.534661E-38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r5)
            r6.mAccelerateInterpolator = r4
            android.app.Activity r4 = r6.mContext
            r5 = 17432582(0x10a0006, float:2.5346614E-38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r5)
            r6.mDecelerateInterpolator = r4
            r4 = 2
            int[] r4 = new int[r4]
            r4 = {x008e: FILL_ARRAY_DATA , data: [0, 255} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofInt(r4)
            r6.mAnimator = r4
            r4.addListener(r1)
            r4.addUpdateListener(r2)
            r4.setInterpolator(r3)
            android.content.res.Resources$Theme r1 = r7.getTheme()
            int[] r0 = new int[r0]
            r2 = 16842836(0x1010054, float:2.3693793E-38)
            r3 = 0
            r0[r3] = r2
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r0)
            r1 = -1
            int r1 = r0.getResourceId(r3, r1)
            r6.mThemeDrawableResourceId = r1
            r0.recycle()
            r6.createFragment(r7)
            return
    }

    private void createFragment(android.app.Activity r3) {
            r2 = this;
            android.app.FragmentManager r0 = r3.getFragmentManager()
            java.lang.String r1 = androidx.leanback.app.BackgroundManager.FRAGMENT_TAG
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            androidx.leanback.app.BackgroundFragment r0 = (androidx.leanback.app.BackgroundFragment) r0
            if (r0 != 0) goto L23
            androidx.leanback.app.BackgroundFragment r0 = new androidx.leanback.app.BackgroundFragment
            r0.<init>()
            android.app.FragmentManager r3 = r3.getFragmentManager()
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            android.app.FragmentTransaction r3 = r3.add(r0, r1)
            r3.commit()
            goto L29
        L23:
            androidx.leanback.app.BackgroundManager r3 = r0.getBackgroundManager()
            if (r3 != 0) goto L2f
        L29:
            r0.setBackgroundManager(r2)
            r2.mFragmentState = r0
            return
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Created duplicated BackgroundManager for same activity, please use getInstance() instead"
            r3.<init>(r0)
            throw r3
    }

    public static androidx.leanback.app.BackgroundManager getInstance(android.app.Activity r2) {
            android.app.FragmentManager r0 = r2.getFragmentManager()
            java.lang.String r1 = androidx.leanback.app.BackgroundManager.FRAGMENT_TAG
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            androidx.leanback.app.BackgroundFragment r0 = (androidx.leanback.app.BackgroundFragment) r0
            if (r0 == 0) goto L15
            androidx.leanback.app.BackgroundManager r0 = r0.getBackgroundManager()
            if (r0 == 0) goto L15
            return r0
        L15:
            androidx.leanback.app.BackgroundManager r0 = new androidx.leanback.app.BackgroundManager
            r0.<init>(r2)
            return r0
    }

    private long getRunnableDelay() {
            r4 = this;
            long r0 = r4.mLastSetTime
            r2 = 500(0x1f4, double:2.47E-321)
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    private android.graphics.drawable.Drawable getThemeDrawable() {
            r3 = this;
            int r0 = r3.mThemeDrawableResourceId
            r1 = -1
            if (r0 == r1) goto Le
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r1 = r3.mService
            android.app.Activity r2 = r3.mContext
            android.graphics.drawable.Drawable r0 = r1.getThemeDrawable(r2, r0)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L1d
            android.app.Activity r0 = r3.mContext
            androidx.leanback.app.BackgroundManager$EmptyDrawable r1 = new androidx.leanback.app.BackgroundManager$EmptyDrawable
            android.content.res.Resources r0 = r0.getResources()
            r1.<init>(r0)
            r0 = r1
        L1d:
            return r0
    }

    private void lazyInit() {
            r6 = this;
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r6.mLayerDrawable
            if (r0 == 0) goto L5
            return
        L5:
            android.app.Activity r0 = r6.mContext
            int r1 = androidx.leanback.R.drawable.lb_background
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            int r1 = r0.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r1]
            r3 = 0
            r4 = 0
        L1b:
            if (r4 >= r1) goto L26
            android.graphics.drawable.Drawable r5 = r0.getDrawable(r4)
            r2[r4] = r5
            int r4 = r4 + 1
            goto L1b
        L26:
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r4 = new androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable
            r4.<init>(r6, r2)
        L2b:
            if (r3 >= r1) goto L37
            int r2 = r0.getId(r3)
            r4.setId(r3, r2)
            int r3 = r3 + 1
            goto L2b
        L37:
            r6.mLayerDrawable = r4
            int r0 = androidx.leanback.R.id.background_imagein
            int r0 = r4.findWrapperIndexById(r0)
            r6.mImageInWrapperIndex = r0
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r6.mLayerDrawable
            int r1 = androidx.leanback.R.id.background_imageout
            r0.findWrapperIndexById(r1)
            android.view.View r0 = r6.mBgView
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r1 = r6.mLayerDrawable
            androidx.leanback.widget.BackgroundHelper.setBackgroundPreservingAlpha(r0, r1)
            return
    }

    private void setDrawableInternal(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.mAttached
            if (r0 == 0) goto L29
            androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable r0 = r2.mChangeRunnable
            if (r0 == 0) goto L1b
            android.graphics.drawable.Drawable r0 = r0.mDrawable
            boolean r0 = r2.sameDrawable(r3, r0)
            if (r0 == 0) goto L11
            return
        L11:
            android.os.Handler r0 = r2.mHandler
            androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable r1 = r2.mChangeRunnable
            r0.removeCallbacks(r1)
            r0 = 0
            r2.mChangeRunnable = r0
        L1b:
            androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable r0 = new androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable
            r0.<init>(r2, r3)
            r2.mChangeRunnable = r0
            r3 = 1
            r2.mChangeRunnablePending = r3
            r2.postChangeRunnable()
            return
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must attach before setting background drawable"
            r3.<init>(r0)
            throw r3
    }

    private void syncWithService() {
            r2 = this;
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r0 = r2.mService
            int r0 = r0.getColor()
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r1 = r2.mService
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            r2.mBackgroundColor = r0
            if (r1 != 0) goto L12
            r0 = 0
            goto L1e
        L12:
            android.graphics.drawable.Drawable$ConstantState r0 = r1.getConstantState()
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            android.graphics.drawable.Drawable r0 = r0.mutate()
        L1e:
            r2.mBackgroundDrawable = r0
            r2.updateImmediate()
            return
    }

    private void updateImmediate() {
            r3 = this;
            boolean r0 = r3.mAttached
            if (r0 != 0) goto L5
            return
        L5:
            r3.lazyInit()
            android.graphics.drawable.Drawable r0 = r3.mBackgroundDrawable
            if (r0 != 0) goto L18
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r3.mLayerDrawable
            int r1 = androidx.leanback.R.id.background_imagein
            android.graphics.drawable.Drawable r2 = r3.getDefaultDrawable()
            r0.updateDrawable(r1, r2)
            goto L1f
        L18:
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r1 = r3.mLayerDrawable
            int r2 = androidx.leanback.R.id.background_imagein
            r1.updateDrawable(r2, r0)
        L1f:
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r3.mLayerDrawable
            int r1 = androidx.leanback.R.id.background_imageout
            android.app.Activity r2 = r3.mContext
            r0.clearDrawable(r1, r2)
            return
    }

    public void attach(android.view.Window r1) {
            r0 = this;
            android.view.View r1 = r1.getDecorView()
            r0.attachToViewInternal(r1)
            return
    }

    public void attachToView(android.view.View r3) {
            r2 = this;
            r2.attachToViewInternal(r3)
            android.app.Activity r3 = r2.mContext
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L15
            r0 = 0
            goto L1b
        L15:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
        L1b:
            r3.setBackground(r0)
            return
    }

    public final void attachToViewInternal(android.view.View r3) {
            r2 = this;
            boolean r0 = r2.mAttached
            if (r0 != 0) goto Ld
            r2.mBgView = r3
            r3 = 1
            r2.mAttached = r3
            r2.syncWithService()
            return
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already attached to "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            android.view.View r1 = r2.mBgView
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void clearDrawable() {
            r1 = this;
            r0 = 0
            r1.setDrawable(r0)
            return
    }

    public final void detach() {
            r2 = this;
            r2.release()
            r0 = 0
            r2.mBgView = r0
            r1 = 0
            r2.mAttached = r1
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r1 = r2.mService
            if (r1 == 0) goto L12
            r1.unref()
            r2.mService = r0
        L12:
            return
    }

    @androidx.annotation.ColorInt
    public final int getColor() {
            r1 = this;
            int r0 = r1.mBackgroundColor
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getDefaultDimLayer() {
            r2 = this;
            android.app.Activity r0 = r2.mContext
            int r1 = androidx.leanback.R.color.lb_background_protection
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
            return r0
    }

    public final android.graphics.drawable.Drawable getDefaultDrawable() {
            r2 = this;
            int r0 = r2.mBackgroundColor
            if (r0 == 0) goto Lc
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r1 = r2.mBackgroundColor
            r0.<init>(r1)
            return r0
        Lc:
            android.graphics.drawable.Drawable r0 = r2.getThemeDrawable()
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getDimLayer() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBackgroundDrawable
            return r0
    }

    public boolean isAttached() {
            r1 = this;
            boolean r0 = r1.mAttached
            return r0
    }

    public boolean isAutoReleaseOnStop() {
            r1 = this;
            boolean r0 = r1.mAutoReleaseOnStop
            return r0
    }

    public final void onActivityStart() {
            r0 = this;
            r0.updateImmediate()
            return
    }

    public final void postChangeRunnable() {
            r4 = this;
            androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable r0 = r4.mChangeRunnable
            if (r0 == 0) goto L3a
            boolean r0 = r4.mChangeRunnablePending
            if (r0 != 0) goto L9
            goto L3a
        L9:
            android.animation.ValueAnimator r0 = r4.mAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L12
            goto L3a
        L12:
            androidx.leanback.app.BackgroundFragment r0 = r4.mFragmentState
            boolean r0 = r0.isResumed()
            if (r0 != 0) goto L1b
            goto L3a
        L1b:
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r4.mLayerDrawable
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto L26
            goto L3a
        L26:
            long r0 = r4.getRunnableDelay()
            long r2 = java.lang.System.currentTimeMillis()
            r4.mLastSetTime = r2
            android.os.Handler r2 = r4.mHandler
            androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable r3 = r4.mChangeRunnable
            r2.postDelayed(r3, r0)
            r0 = 0
            r4.mChangeRunnablePending = r0
        L3a:
            return
    }

    public void release() {
            r4 = this;
            androidx.leanback.app.BackgroundManager$ChangeBackgroundRunnable r0 = r4.mChangeRunnable
            r1 = 0
            if (r0 == 0) goto Lc
            android.os.Handler r2 = r4.mHandler
            r2.removeCallbacks(r0)
            r4.mChangeRunnable = r1
        Lc:
            android.animation.ValueAnimator r0 = r4.mAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L19
            android.animation.ValueAnimator r0 = r4.mAnimator
            r0.cancel()
        L19:
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r4.mLayerDrawable
            if (r0 == 0) goto L2f
            int r2 = androidx.leanback.R.id.background_imagein
            android.app.Activity r3 = r4.mContext
            r0.clearDrawable(r2, r3)
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r4.mLayerDrawable
            int r2 = androidx.leanback.R.id.background_imageout
            android.app.Activity r3 = r4.mContext
            r0.clearDrawable(r2, r3)
            r4.mLayerDrawable = r1
        L2f:
            r4.mBackgroundDrawable = r1
            return
    }

    public final boolean sameDrawable(android.graphics.drawable.Drawable r5, android.graphics.drawable.Drawable r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3e
            if (r6 != 0) goto L6
            goto L3e
        L6:
            r1 = 1
            if (r5 != r6) goto La
            return r1
        La:
            boolean r2 = r5 instanceof androidx.leanback.app.BackgroundManager.BitmapDrawable
            if (r2 == 0) goto L27
            boolean r2 = r6 instanceof androidx.leanback.app.BackgroundManager.BitmapDrawable
            if (r2 == 0) goto L27
            r2 = r5
            androidx.leanback.app.BackgroundManager$BitmapDrawable r2 = (androidx.leanback.app.BackgroundManager.BitmapDrawable) r2
            androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r2 = r2.mState
            android.graphics.Bitmap r2 = r2.mBitmap
            r3 = r6
            androidx.leanback.app.BackgroundManager$BitmapDrawable r3 = (androidx.leanback.app.BackgroundManager.BitmapDrawable) r3
            androidx.leanback.app.BackgroundManager$BitmapDrawable$ConstantState r3 = r3.mState
            android.graphics.Bitmap r3 = r3.mBitmap
            boolean r2 = r2.sameAs(r3)
            if (r2 == 0) goto L27
            return r1
        L27:
            boolean r2 = r5 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L3e
            boolean r2 = r6 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L3e
            android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5
            int r5 = r5.getColor()
            android.graphics.drawable.ColorDrawable r6 = (android.graphics.drawable.ColorDrawable) r6
            int r6 = r6.getColor()
            if (r5 != r6) goto L3e
            return r1
        L3e:
            return r0
    }

    public void setAutoReleaseOnStop(boolean r1) {
            r0 = this;
            r0.mAutoReleaseOnStop = r1
            return
    }

    public void setBitmap(android.graphics.Bitmap r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L7
            r6.setDrawable(r0)
            return
        L7:
            int r1 = r7.getWidth()
            if (r1 <= 0) goto L69
            int r1 = r7.getHeight()
            if (r1 > 0) goto L14
            goto L69
        L14:
            int r1 = r7.getWidth()
            int r2 = r6.mWidthPx
            if (r1 != r2) goto L24
            int r1 = r7.getHeight()
            int r2 = r6.mHeightPx
            if (r1 == r2) goto L5c
        L24:
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            int r2 = r6.mHeightPx
            int r3 = r0 * r2
            int r4 = r6.mWidthPx
            int r5 = r4 * r1
            if (r3 <= r5) goto L3a
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L3e
        L3a:
            float r1 = (float) r4
            float r2 = (float) r0
            float r2 = r1 / r2
        L3e:
            float r1 = (float) r4
            float r1 = r1 / r2
            int r1 = (int) r1
            int r1 = java.lang.Math.min(r1, r0)
            r3 = 0
            int r0 = r0 - r1
            int r0 = r0 / 2
            int r0 = java.lang.Math.max(r3, r0)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r1.setScale(r2, r2)
            int r0 = -r0
            float r0 = (float) r0
            r2 = 0
            r1.preTranslate(r0, r2)
            r0 = r1
        L5c:
            androidx.leanback.app.BackgroundManager$BitmapDrawable r1 = new androidx.leanback.app.BackgroundManager$BitmapDrawable
            android.app.Activity r2 = r6.mContext
            r2.getResources()
            r1.<init>(r7, r0)
            r6.setDrawable(r1)
        L69:
            return
    }

    public void setColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r0 = r1.mService
            r0.setColor(r2)
            r1.mBackgroundColor = r2
            r2 = 0
            r1.mBackgroundDrawable = r2
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r2 = r1.mLayerDrawable
            if (r2 != 0) goto Lf
            return
        Lf:
            android.graphics.drawable.Drawable r2 = r1.getDefaultDrawable()
            r1.setDrawableInternal(r2)
            return
    }

    @java.lang.Deprecated
    public void setDimLayer(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    public void setDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.leanback.app.BackgroundManager$BackgroundContinuityService r0 = r1.mService
            r0.setDrawable(r2)
            r1.mBackgroundDrawable = r2
            androidx.leanback.app.BackgroundManager$TranslucentLayerDrawable r0 = r1.mLayerDrawable
            if (r0 != 0) goto Lc
            return
        Lc:
            if (r2 != 0) goto L16
            android.graphics.drawable.Drawable r2 = r1.getDefaultDrawable()
            r1.setDrawableInternal(r2)
            goto L19
        L16:
            r1.setDrawableInternal(r2)
        L19:
            return
    }

    public void setThemeDrawableResourceId(int r1) {
            r0 = this;
            r0.mThemeDrawableResourceId = r1
            return
    }
}
