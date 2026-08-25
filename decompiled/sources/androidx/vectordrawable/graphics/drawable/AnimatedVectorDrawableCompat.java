package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatedVectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final java.lang.String ANIMATED_VECTOR = "animated-vector";
    private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
    private static final java.lang.String LOGTAG = "AnimatedVDCompat";
    private static final java.lang.String TARGET = "target";
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState mAnimatedVectorState;
    public java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> mAnimationCallbacks;
    private android.animation.Animator.AnimatorListener mAnimatorListener;
    private android.animation.ArgbEvaluator mArgbEvaluator;
    public final android.graphics.drawable.Drawable.Callback mCallback;
    private android.content.Context mContext;



    /* JADX INFO: loaded from: classes3.dex */
    public static class AnimatedVectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        public android.animation.AnimatorSet mAnimatorSet;
        public java.util.ArrayList<android.animation.Animator> mAnimators;
        public int mChangingConfigurations;
        public androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> mTargetNameMap;
        public androidx.vectordrawable.graphics.drawable.VectorDrawableCompat mVectorDrawable;

        public AnimatedVectorDrawableCompatState(android.content.Context r3, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState r4, android.graphics.drawable.Drawable.Callback r5, android.content.res.Resources r6) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L87
                int r3 = r4.mChangingConfigurations
                r2.mChangingConfigurations = r3
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = r4.mVectorDrawable
                r0 = 0
                if (r3 == 0) goto L42
                android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
                if (r6 == 0) goto L1d
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r6)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) r3
                r2.mVectorDrawable = r3
                goto L25
            L1d:
                android.graphics.drawable.Drawable r3 = r3.newDrawable()
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) r3
                r2.mVectorDrawable = r3
            L25:
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = r2.mVectorDrawable
                android.graphics.drawable.Drawable r3 = r3.mutate()
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) r3
                r2.mVectorDrawable = r3
                r3.setCallback(r5)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = r2.mVectorDrawable
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = r4.mVectorDrawable
                android.graphics.Rect r5 = r5.getBounds()
                r3.setBounds(r5)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = r2.mVectorDrawable
                r3.setAllowCaching()
            L42:
                java.util.ArrayList<android.animation.Animator> r3 = r4.mAnimators
                if (r3 == 0) goto L87
                int r3 = r3.size()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                r2.mAnimators = r5
                androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
                r5.<init>(r3)
                r2.mTargetNameMap = r5
            L58:
                if (r0 >= r3) goto L84
                java.util.ArrayList<android.animation.Animator> r5 = r4.mAnimators
                java.lang.Object r5 = r5.get(r0)
                android.animation.Animator r5 = (android.animation.Animator) r5
                android.animation.Animator r6 = r5.clone()
                androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> r1 = r4.mTargetNameMap
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = r2.mVectorDrawable
                java.lang.Object r1 = r1.getTargetByName(r5)
                r6.setTarget(r1)
                java.util.ArrayList<android.animation.Animator> r1 = r2.mAnimators
                r1.add(r6)
                androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> r1 = r2.mTargetNameMap
                r1.put(r6, r5)
                int r0 = r0 + 1
                goto L58
            L84:
                r2.setupAnimatorSet()
            L87:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.mChangingConfigurations
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "No constant state support for SDK < 24."
                r2.<init>(r0)
                throw r2
        }

        public void setupAnimatorSet() {
                r2 = this;
                android.animation.AnimatorSet r0 = r2.mAnimatorSet
                if (r0 != 0) goto Lb
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r2.mAnimatorSet = r0
            Lb:
                android.animation.AnimatorSet r0 = r2.mAnimatorSet
                java.util.ArrayList<android.animation.Animator> r1 = r2.mAnimators
                r0.playTogether(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(24)
    public static class AnimatedVectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

        public AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegateState = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r3 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.mDelegateDrawable = r1
                android.graphics.drawable.Drawable$Callback r2 = r0.mCallback
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                r0.mDelegateDrawable = r3
                android.graphics.drawable.Drawable$Callback r1 = r0.mCallback
                r3.setCallback(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                r0.mDelegateDrawable = r3
                android.graphics.drawable.Drawable$Callback r4 = r0.mCallback
                r3.setCallback(r4)
                return r0
        }
    }

    public AnimatedVectorDrawableCompat() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    private AnimatedVectorDrawableCompat(@androidx.annotation.Nullable android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    private AnimatedVectorDrawableCompat(@androidx.annotation.Nullable android.content.Context r3, @androidx.annotation.Nullable androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState r4, @androidx.annotation.Nullable android.content.res.Resources r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mArgbEvaluator = r0
            r2.mAnimatorListener = r0
            r2.mAnimationCallbacks = r0
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$1 r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$1
            r0.<init>(r2)
            r2.mCallback = r0
            r2.mContext = r3
            if (r4 == 0) goto L18
            r2.mAnimatedVectorState = r4
            goto L1f
        L18:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState
            r1.<init>(r3, r4, r0, r5)
            r2.mAnimatedVectorState = r1
        L1f:
            return
    }

    public static void clearAnimationCallbacks(android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L11
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            r2.clearAnimationCallbacks()
            goto L16
        L11:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2 = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) r2
            r2.clearAnimationCallbacks()
        L16:
            return
    }

    @androidx.annotation.Nullable
    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat create(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.DrawableRes int r7) {
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "AnimatedVDCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L2e
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            r0.<init>(r6)
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.ResourcesCompat.getDrawable(r1, r7, r6)
            r0.mDelegateDrawable = r6
            android.graphics.drawable.Drawable$Callback r7 = r0.mCallback
            r6.setCallback(r7)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState r6 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
            android.graphics.drawable.Drawable r7 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L2e:
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.XmlResourceParser r7 = r2.getXml(r7)     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
        L3a:
            int r3 = r7.next()     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            r4 = 2
            if (r3 == r4) goto L45
            r5 = 1
            if (r3 == r5) goto L45
            goto L3a
        L45:
            if (r3 != r4) goto L54
            android.content.res.Resources r3 = r6.getResources()     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            android.content.res.Resources$Theme r4 = r6.getTheme()     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r6 = createFromXmlInner(r6, r3, r7, r2, r4)     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            return r6
        L54:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
            throw r6     // Catch: java.io.IOException -> L5c org.xmlpull.v1.XmlPullParserException -> L61
        L5c:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L65
        L61:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L65:
            r6 = 0
            return r6
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat createFromXmlInner(android.content.Context r1, android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            r0.<init>(r1)
            r0.inflate(r2, r3, r4, r5)
            return r0
    }

    public static void registerAnimationCallback(android.graphics.drawable.Drawable r2, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r3) {
            if (r2 == 0) goto L1b
            if (r3 != 0) goto L5
            goto L1b
        L5:
            boolean r0 = r2 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto La
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            registerPlatformCallback(r2, r3)
            goto L1b
        L16:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2 = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) r2
            r2.registerAnimationCallback(r3)
        L1b:
            return
    }

    @androidx.annotation.RequiresApi(23)
    private static void registerPlatformCallback(@androidx.annotation.NonNull android.graphics.drawable.AnimatedVectorDrawable r1, @androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            android.graphics.drawable.Animatable2$AnimationCallback r0 = r2.mPlatformCallback
            if (r0 != 0) goto Lb
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1 r0 = new androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1
            r0.<init>(r2)
            r2.mPlatformCallback = r0
        Lb:
            android.graphics.drawable.Animatable2$AnimationCallback r2 = r2.mPlatformCallback
            r1.registerAnimationCallback(r2)
            return
    }

    private void removeAnimatorSetListener() {
            r2 = this;
            android.animation.Animator$AnimatorListener r0 = r2.mAnimatorListener
            if (r0 == 0) goto Le
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r2.mAnimatedVectorState
            android.animation.AnimatorSet r1 = r1.mAnimatorSet
            r1.removeListener(r0)
            r0 = 0
            r2.mAnimatorListener = r0
        Le:
            return
    }

    private void setupAnimatorsForTarget(java.lang.String r3, android.animation.Animator r4) {
            r2 = this;
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            java.lang.Object r0 = r0.getTargetByName(r3)
            r4.setTarget(r0)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            java.util.ArrayList<android.animation.Animator> r1 = r0.mAnimators
            if (r1 != 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mAnimators = r1
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r0.mTargetNameMap = r1
        L21:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            java.util.ArrayList<android.animation.Animator> r0 = r0.mAnimators
            r0.add(r4)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> r0 = r0.mTargetNameMap
            r0.put(r4, r3)
            return
    }

    private void setupColorAnimator(android.animation.Animator r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.animation.AnimatorSet
            if (r0 == 0) goto L20
            r0 = r4
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            if (r0 == 0) goto L20
            r1 = 0
        Le:
            int r2 = r0.size()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r0.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            r3.setupColorAnimator(r2)
            int r1 = r1 + 1
            goto Le
        L20:
            boolean r0 = r4 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L4b
            android.animation.ObjectAnimator r4 = (android.animation.ObjectAnimator) r4
            java.lang.String r0 = r4.getPropertyName()
            java.lang.String r1 = "fillColor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "strokeColor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4b
        L3b:
            android.animation.ArgbEvaluator r0 = r3.mArgbEvaluator
            if (r0 != 0) goto L46
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r3.mArgbEvaluator = r0
        L46:
            android.animation.ArgbEvaluator r0 = r3.mArgbEvaluator
            r4.setEvaluator(r0)
        L4b:
            return
    }

    public static boolean unregisterAnimationCallback(android.graphics.drawable.Drawable r2, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r3) {
            r0 = 0
            if (r2 == 0) goto L1f
            if (r3 != 0) goto L6
            goto L1f
        L6:
            boolean r1 = r2 instanceof android.graphics.drawable.Animatable
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L18
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            boolean r2 = unregisterPlatformCallback(r2, r3)
            return r2
        L18:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2 = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) r2
            boolean r2 = r2.unregisterAnimationCallback(r3)
            return r2
        L1f:
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    private static boolean unregisterPlatformCallback(android.graphics.drawable.AnimatedVectorDrawable r1, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            android.graphics.drawable.Animatable2$AnimationCallback r0 = r2.mPlatformCallback
            if (r0 != 0) goto Lb
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1 r0 = new androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1
            r0.<init>(r2)
            r2.mPlatformCallback = r0
        Lb:
            android.graphics.drawable.Animatable2$AnimationCallback r2 = r2.mPlatformCallback
            boolean r1 = r1.unregisterAnimationCallback(r2)
            return r1
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(r0, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.clearAnimationCallbacks()
            return
        La:
            r1.removeAnimatorSetListener()
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            if (r0 != 0) goto L12
            return
        L12:
            r0.clear()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
            r0 = this;
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.draw(r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.draw(r2)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r2 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r2 = r2.mAnimatorSet
            boolean r2 = r2.isStarted()
            if (r2 == 0) goto L1c
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getAlpha(r0)
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r2.mAnimatedVectorState
            int r1 = r1.mChangingConfigurations
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.DrawableCompat.getColorFilter(r0)
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
            android.graphics.drawable.Drawable r1 = r2.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.getPadding(r1)
            return r1
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
            r1 = this;
            int[] r0 = super.getState()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.mDelegateDrawable
            if (r0 == 0) goto L8
            androidx.core.graphics.drawable.DrawableCompat.inflate(r0, r7, r8, r9, r10)
            return
        L8:
            int r0 = r8.getEventType()
            int r1 = r8.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            if (r0 == r2) goto L8f
            int r3 = r8.getDepth()
            if (r3 >= r1) goto L1d
            r3 = 3
            if (r0 == r3) goto L8f
        L1d:
            r3 = 2
            if (r0 != r3) goto L8a
            java.lang.String r0 = r8.getName()
            java.lang.String r3 = "animated-vector"
            boolean r3 = r3.equals(r0)
            r4 = 0
            if (r3 == 0) goto L57
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r7, r10, r9, r0)
            int r3 = r0.getResourceId(r4, r4)
            if (r3 == 0) goto L53
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r3 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(r7, r3, r10)
            r3.setAllowCaching()
            android.graphics.drawable.Drawable$Callback r4 = r6.mCallback
            r3.setCallback(r4)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r4 = r6.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r4 = r4.mVectorDrawable
            if (r4 == 0) goto L4f
            r5 = 0
            r4.setCallback(r5)
        L4f:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r4 = r6.mAnimatedVectorState
            r4.mVectorDrawable = r3
        L53:
            r0.recycle()
            goto L8a
        L57:
            java.lang.String r3 = "target"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L8a
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET
            android.content.res.TypedArray r0 = r7.obtainAttributes(r9, r0)
            java.lang.String r3 = r0.getString(r4)
            int r4 = r0.getResourceId(r2, r4)
            if (r4 == 0) goto L87
            android.content.Context r5 = r6.mContext
            if (r5 == 0) goto L7c
            android.animation.Animator r4 = androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.loadAnimator(r5, r4)
            r6.setupAnimatorsForTarget(r3, r4)
            goto L87
        L7c:
            r0.recycle()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Context can't be null when inflating animators"
            r7.<init>(r8)
            throw r7
        L87:
            r0.recycle()
        L8a:
            int r0 = r8.next()
            goto L12
        L8f:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r7 = r6.mAnimatedVectorState
            r7.setupAnimatorSet()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r0)
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = r0.isRunning()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            r0 = this;
            super.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            r0.mutate()
        L7:
            return r1
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setBounds(r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r2 = r0.setState(r2)
            return r2
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            registerPlatformCallback(r0, r2)
            return
        La:
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            if (r0 != 0) goto L18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAnimationCallbacks = r0
        L18:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L21
            return
        L21:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            r0.add(r2)
            android.animation.Animator$AnimatorListener r2 = r1.mAnimatorListener
            if (r2 != 0) goto L31
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$2 r2 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$2
            r2.<init>(r1)
            r1.mAnimatorListener = r2
        L31:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r2 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r2 = r2.mAnimatorSet
            android.animation.Animator$AnimatorListener r0 = r1.mAnimatorListener
            r2.addListener(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setAutoMirrored(r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
            r0 = this;
            super.setChangingConfigurations(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            super.setColorFilter(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setColorFilter(r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
            r0 = this;
            super.setFilterBitmap(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
            return
        L8:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setVisible(r2, r3)
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L15
            return
        L15:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            r0.start()
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            r0.end()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            unregisterPlatformCallback(r0, r2)
        L9:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            if (r0 == 0) goto L20
            if (r2 != 0) goto L10
            goto L20
        L10:
            boolean r2 = r0.remove(r2)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            int r0 = r0.size()
            if (r0 != 0) goto L1f
            r1.removeAnimatorSetListener()
        L1f:
            return r2
        L20:
            r2 = 0
            return r2
    }
}
