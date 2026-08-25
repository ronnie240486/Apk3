package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPropertyAnimatorCompat {
    public int mOldLayerType;
    private final java.lang.ref.WeakReference<android.view.View> mView;


    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator withEndAction(android.view.ViewPropertyAnimator r0, java.lang.Runnable r1) {
                android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator withLayer(android.view.ViewPropertyAnimator r0) {
                android.view.ViewPropertyAnimator r0 = r0.withLayer()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator withStartAction(android.view.ViewPropertyAnimator r0, java.lang.Runnable r1) {
                android.view.ViewPropertyAnimator r0 = r0.withStartAction(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(18)
    public static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.animation.Interpolator getInterpolator(android.view.ViewPropertyAnimator r0) {
                android.animation.TimeInterpolator r0 = r0.getInterpolator()
                android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator setUpdateListener(android.view.ViewPropertyAnimator r0, android.animation.ValueAnimator.AnimatorUpdateListener r1) {
                android.view.ViewPropertyAnimator r0 = r0.setUpdateListener(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator translationZ(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.translationZ(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator translationZBy(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.translationZBy(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator z(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.z(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewPropertyAnimator zBy(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.zBy(r1)
                return r0
        }
    }

    public static class ViewPropertyAnimatorListenerApi14 implements androidx.core.view.ViewPropertyAnimatorListener {
        public androidx.core.view.ViewPropertyAnimatorCompat mVpa;

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r3.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r1 == 0) goto Ld
                androidx.core.view.ViewPropertyAnimatorListener r0 = (androidx.core.view.ViewPropertyAnimatorListener) r0
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L13
                r0.onAnimationCancel(r3)
            L13:
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        @android.annotation.SuppressLint({"WrongConstant"})
        public void onAnimationEnd(@androidx.annotation.NonNull android.view.View r4) {
                r3 = this;
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto Lf
                r4.setLayerType(r0, r2)
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                r0.mOldLayerType = r1
            Lf:
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.util.Objects.requireNonNull(r0)
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r1 == 0) goto L21
                r2 = r0
                androidx.core.view.ViewPropertyAnimatorListener r2 = (androidx.core.view.ViewPropertyAnimatorListener) r2
            L21:
                if (r2 == 0) goto L26
                r2.onAnimationEnd(r4)
            L26:
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(@androidx.annotation.NonNull android.view.View r4) {
                r3 = this;
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto Lc
                r0 = 2
                r4.setLayerType(r0, r1)
            Lc:
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.util.Objects.requireNonNull(r0)
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r2 == 0) goto L1e
                r1 = r0
                androidx.core.view.ViewPropertyAnimatorListener r1 = (androidx.core.view.ViewPropertyAnimatorListener) r1
            L1e:
                if (r1 == 0) goto L23
                r1.onAnimationStart(r4)
            L23:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-X-OeeZ3zgiQP_YgN-Cy4Y7jVqc, reason: not valid java name */
    public static /* synthetic */ void m38$r8$lambda$XOeeZ3zgiQP_YgNCy4Y7jVqc(androidx.core.view.ViewPropertyAnimatorUpdateListener r0, android.view.View r1, android.animation.ValueAnimator r2) {
            lambda$setUpdateListener$0(r0, r1, r2)
            return
    }

    public ViewPropertyAnimatorCompat(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mOldLayerType = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mView = r0
            return
    }

    private static /* synthetic */ void lambda$setUpdateListener$0(androidx.core.view.ViewPropertyAnimatorUpdateListener r0, android.view.View r1, android.animation.ValueAnimator r2) {
            r0.onAnimationUpdate(r1)
            return
    }

    private void setListenerInternal(android.view.View r3, androidx.core.view.ViewPropertyAnimatorListener r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            androidx.core.view.ViewPropertyAnimatorCompat$1 r1 = new androidx.core.view.ViewPropertyAnimatorCompat$1
            r1.<init>(r4, r3)
            r0.setListener(r1)
            goto L17
        Lf:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            r3.setListener(r4)
        L17:
            return
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat alpha(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alphaBy(r2)
        L11:
            return r1
    }

    public void cancel() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    public long getDuration() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getDuration()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.animation.Interpolator r0 = androidx.core.view.ViewPropertyAnimatorCompat.Api18Impl.getInterpolator(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    public long getStartDelay() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getStartDelay()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotation(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotation(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationX(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationXBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationY(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationYBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleX(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleXBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleY(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleYBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setDuration(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(@androidx.annotation.Nullable android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setInterpolator(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setListener(@androidx.annotation.Nullable androidx.core.view.ViewPropertyAnimatorListener r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Ld
            r1.setListenerInternal(r0, r2)
        Ld:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(@androidx.annotation.Nullable androidx.core.view.ViewPropertyAnimatorUpdateListener r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L19
            r1 = 0
            if (r3 == 0) goto L12
            androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0 r1 = new androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0
            r1.<init>(r3, r0)
        L12:
            android.view.ViewPropertyAnimator r3 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api19Impl.setUpdateListener(r3, r1)
        L19:
            return r2
    }

    public void start() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.start()
        L11:
            return
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationX(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationXBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationYBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationZ(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZ(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZBy(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat withEndAction(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withEndAction(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"WrongConstant"})
    public androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withLayer(r0)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat withStartAction(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withStartAction(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat x(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.x(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat xBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.xBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat y(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.y(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat yBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.yBy(r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat z(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.z(r0, r2)
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.view.ViewPropertyAnimatorCompat zBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.zBy(r0, r2)
        L11:
            return r1
    }
}
