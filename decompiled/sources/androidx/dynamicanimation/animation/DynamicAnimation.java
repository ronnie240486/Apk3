package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DynamicAnimation<T extends androidx.dynamicanimation.animation.DynamicAnimation<T>> implements androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback {
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ALPHA = null;
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_X = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty ROTATION_Y = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_X = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCALE_Y = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_X = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty SCROLL_Y = null;
    private static final float THRESHOLD_MULTIPLIER = 0.75f;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_X = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Y = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty TRANSLATION_Z = null;
    private static final float UNSET = Float.MAX_VALUE;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty X = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty Y = null;
    public static final androidx.dynamicanimation.animation.DynamicAnimation.ViewProperty Z = null;
    private final java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener> mEndListeners;
    private long mLastFrameTime;
    public float mMaxValue;
    public float mMinValue;
    private float mMinVisibleChange;
    public final androidx.dynamicanimation.animation.FloatPropertyCompat mProperty;
    public boolean mRunning;
    public boolean mStartValueIsSet;
    public final java.lang.Object mTarget;
    private final java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener> mUpdateListeners;
    public float mValue;
    public float mVelocity;
















    public static class MassState {
        public float mValue;
        public float mVelocity;

        public MassState() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnAnimationEndListener {
        void onAnimationEnd(androidx.dynamicanimation.animation.DynamicAnimation r1, boolean r2, float r3, float r4);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(androidx.dynamicanimation.animation.DynamicAnimation r1, float r2, float r3);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ViewProperty extends androidx.dynamicanimation.animation.FloatPropertyCompat<android.view.View> {
        private ViewProperty(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* synthetic */ ViewProperty(java.lang.String r1, androidx.dynamicanimation.animation.DynamicAnimation.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            androidx.dynamicanimation.animation.DynamicAnimation$1 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$1
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.TRANSLATION_X = r0
            androidx.dynamicanimation.animation.DynamicAnimation$2 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$2
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.TRANSLATION_Y = r0
            androidx.dynamicanimation.animation.DynamicAnimation$3 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$3
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.TRANSLATION_Z = r0
            androidx.dynamicanimation.animation.DynamicAnimation$4 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$4
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.SCALE_X = r0
            androidx.dynamicanimation.animation.DynamicAnimation$5 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$5
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.SCALE_Y = r0
            androidx.dynamicanimation.animation.DynamicAnimation$6 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$6
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.ROTATION = r0
            androidx.dynamicanimation.animation.DynamicAnimation$7 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$7
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.ROTATION_X = r0
            androidx.dynamicanimation.animation.DynamicAnimation$8 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$8
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.ROTATION_Y = r0
            androidx.dynamicanimation.animation.DynamicAnimation$9 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$9
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.X = r0
            androidx.dynamicanimation.animation.DynamicAnimation$10 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$10
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.Y = r0
            androidx.dynamicanimation.animation.DynamicAnimation$11 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$11
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.Z = r0
            androidx.dynamicanimation.animation.DynamicAnimation$12 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$12
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.ALPHA = r0
            androidx.dynamicanimation.animation.DynamicAnimation$13 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$13
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.SCROLL_X = r0
            androidx.dynamicanimation.animation.DynamicAnimation$14 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$14
            r0.<init>()
            androidx.dynamicanimation.animation.DynamicAnimation.SCROLL_Y = r0
            return
    }

    public DynamicAnimation(androidx.dynamicanimation.animation.FloatValueHolder r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mVelocity = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mValue = r0
            r1 = 0
            r2.mStartValueIsSet = r1
            r2.mRunning = r1
            r2.mMaxValue = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mMinValue = r0
            r0 = 0
            r2.mLastFrameTime = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mEndListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mUpdateListeners = r0
            r0 = 0
            r2.mTarget = r0
            androidx.dynamicanimation.animation.DynamicAnimation$15 r0 = new androidx.dynamicanimation.animation.DynamicAnimation$15
            r0.<init>(r3)
            r2.mProperty = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.mMinVisibleChange = r3
            return
    }

    public <K> DynamicAnimation(K r3, androidx.dynamicanimation.animation.FloatPropertyCompat<K> r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mVelocity = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mValue = r0
            r1 = 0
            r2.mStartValueIsSet = r1
            r2.mRunning = r1
            r2.mMaxValue = r0
            float r0 = -r0
            r2.mMinValue = r0
            r0 = 0
            r2.mLastFrameTime = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mEndListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mUpdateListeners = r0
            r2.mTarget = r3
            r2.mProperty = r4
            androidx.dynamicanimation.animation.DynamicAnimation$ViewProperty r3 = androidx.dynamicanimation.animation.DynamicAnimation.ROTATION
            if (r4 == r3) goto L52
            androidx.dynamicanimation.animation.DynamicAnimation$ViewProperty r3 = androidx.dynamicanimation.animation.DynamicAnimation.ROTATION_X
            if (r4 == r3) goto L52
            androidx.dynamicanimation.animation.DynamicAnimation$ViewProperty r3 = androidx.dynamicanimation.animation.DynamicAnimation.ROTATION_Y
            if (r4 != r3) goto L38
            goto L52
        L38:
            androidx.dynamicanimation.animation.DynamicAnimation$ViewProperty r3 = androidx.dynamicanimation.animation.DynamicAnimation.ALPHA
            r0 = 998244352(0x3b800000, float:0.00390625)
            if (r4 != r3) goto L41
            r2.mMinVisibleChange = r0
            goto L57
        L41:
            androidx.dynamicanimation.animation.DynamicAnimation$ViewProperty r3 = androidx.dynamicanimation.animation.DynamicAnimation.SCALE_X
            if (r4 == r3) goto L4f
            androidx.dynamicanimation.animation.DynamicAnimation$ViewProperty r3 = androidx.dynamicanimation.animation.DynamicAnimation.SCALE_Y
            if (r4 != r3) goto L4a
            goto L4f
        L4a:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.mMinVisibleChange = r3
            goto L57
        L4f:
            r2.mMinVisibleChange = r0
            goto L57
        L52:
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r2.mMinVisibleChange = r3
        L57:
            return
    }

    private void endAnimationInternal(boolean r5) {
            r4 = this;
            r0 = 0
            r4.mRunning = r0
            androidx.dynamicanimation.animation.AnimationHandler r1 = androidx.dynamicanimation.animation.AnimationHandler.getInstance()
            r1.removeCallback(r4)
            r1 = 0
            r4.mLastFrameTime = r1
            r4.mStartValueIsSet = r0
        L10:
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r1 = r4.mEndListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r1 = r4.mEndListeners
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L2f
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r1 = r4.mEndListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener r1 = (androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener) r1
            float r2 = r4.mValue
            float r3 = r4.mVelocity
            r1.onAnimationEnd(r4, r5, r2, r3)
        L2f:
            int r0 = r0 + 1
            goto L10
        L32:
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r5 = r4.mEndListeners
            removeNullEntries(r5)
            return
    }

    private float getPropertyValue() {
            r2 = this;
            androidx.dynamicanimation.animation.FloatPropertyCompat r0 = r2.mProperty
            java.lang.Object r1 = r2.mTarget
            float r0 = r0.getValue(r1)
            return r0
    }

    private static <T> void removeEntry(java.util.ArrayList<T> r1, T r2) {
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto La
            r0 = 0
            r1.set(r2, r0)
        La:
            return
    }

    private static <T> void removeNullEntries(java.util.ArrayList<T> r2) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L14
            java.lang.Object r1 = r2.get(r0)
            if (r1 != 0) goto L11
            r2.remove(r0)
        L11:
            int r0 = r0 + (-1)
            goto L6
        L14:
            return
    }

    private void startAnimationInternal() {
            r3 = this;
            boolean r0 = r3.mRunning
            if (r0 != 0) goto L31
            r0 = 1
            r3.mRunning = r0
            boolean r0 = r3.mStartValueIsSet
            if (r0 != 0) goto L11
            float r0 = r3.getPropertyValue()
            r3.mValue = r0
        L11:
            float r0 = r3.mValue
            float r1 = r3.mMaxValue
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L29
            float r1 = r3.mMinValue
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L29
            androidx.dynamicanimation.animation.AnimationHandler r0 = androidx.dynamicanimation.animation.AnimationHandler.getInstance()
            r1 = 0
            r0.addAnimationFrameCallback(r3, r1)
            goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Starting value need to be in between min value and max value"
            r0.<init>(r1)
            throw r0
        L31:
            return
    }

    public T addEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r0 = r1.mEndListeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r0 = r1.mEndListeners
            r0.add(r2)
        Ld:
            return r1
    }

    public T addUpdateListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener r2) {
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L14
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r0 = r1.mUpdateListeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L13
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r0 = r1.mUpdateListeners
            r0.add(r2)
        L13:
            return r1
        L14:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Error: Update listeners must be added beforethe animation."
            r2.<init>(r0)
            throw r2
    }

    public void cancel() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L13
            boolean r0 = r2.mRunning
            if (r0 == 0) goto L12
            r0 = 1
            r2.endAnimationInternal(r0)
        L12:
            return
        L13:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Animations may only be canceled on the main thread"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long r7) {
            r6 = this;
            long r0 = r6.mLastFrameTime
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            r6.mLastFrameTime = r7
            float r7 = r6.mValue
            r6.setPropertyValue(r7)
            return r2
        L11:
            long r0 = r7 - r0
            r6.mLastFrameTime = r7
            boolean r7 = r6.updateValueAndVelocity(r0)
            float r8 = r6.mValue
            float r0 = r6.mMaxValue
            float r8 = java.lang.Math.min(r8, r0)
            r6.mValue = r8
            float r0 = r6.mMinValue
            float r8 = java.lang.Math.max(r8, r0)
            r6.mValue = r8
            r6.setPropertyValue(r8)
            if (r7 == 0) goto L33
            r6.endAnimationInternal(r2)
        L33:
            return r7
    }

    public float getMinimumVisibleChange() {
            r1 = this;
            float r0 = r1.mMinVisibleChange
            return r0
    }

    public final float getValueThreshold() {
            r2 = this;
            float r0 = r2.mMinVisibleChange
            r1 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r1
            return r0
    }

    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.mRunning
            return r0
    }

    public void removeEndListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener> r0 = r1.mEndListeners
            removeEntry(r0, r2)
            return
    }

    public void removeUpdateListener(androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r0 = r1.mUpdateListeners
            removeEntry(r0, r2)
            return
    }

    public T setMaxValue(float r1) {
            r0 = this;
            r0.mMaxValue = r1
            return r0
    }

    public T setMinValue(float r1) {
            r0 = this;
            r0.mMinValue = r1
            return r0
    }

    public T setMinimumVisibleChange(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r1.mMinVisibleChange = r2
            r0 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r0
            r1.setValueThreshold(r2)
            return r1
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Minimum visible change must be positive."
            r2.<init>(r0)
            throw r2
    }

    public final void setPropertyValue(float r4) {
            r3 = this;
            androidx.dynamicanimation.animation.FloatPropertyCompat r0 = r3.mProperty
            java.lang.Object r1 = r3.mTarget
            r0.setValue(r1, r4)
            r4 = 0
        L8:
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r0 = r3.mUpdateListeners
            int r0 = r0.size()
            if (r4 >= r0) goto L2a
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r0 = r3.mUpdateListeners
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L27
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r0 = r3.mUpdateListeners
            java.lang.Object r0 = r0.get(r4)
            androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener r0 = (androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener) r0
            float r1 = r3.mValue
            float r2 = r3.mVelocity
            r0.onAnimationUpdate(r3, r1, r2)
        L27:
            int r4 = r4 + 1
            goto L8
        L2a:
            java.util.ArrayList<androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener> r4 = r3.mUpdateListeners
            removeNullEntries(r4)
            return
    }

    public T setStartValue(float r1) {
            r0 = this;
            r0.mValue = r1
            r1 = 1
            r0.mStartValueIsSet = r1
            return r0
    }

    public T setStartVelocity(float r1) {
            r0 = this;
            r0.mVelocity = r1
            return r0
    }

    public abstract void setValueThreshold(float r1);

    public void start() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L12
            boolean r0 = r2.mRunning
            if (r0 != 0) goto L11
            r2.startAnimationInternal()
        L11:
            return
        L12:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Animations may only be started on the main thread"
            r0.<init>(r1)
            throw r0
    }

    public abstract boolean updateValueAndVelocity(long r1);
}
