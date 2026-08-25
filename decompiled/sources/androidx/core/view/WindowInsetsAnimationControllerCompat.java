package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final androidx.core.view.WindowInsetsAnimationControllerCompat.Impl mImpl;

    /* JADX INFO: loaded from: classes.dex */
    public static class Impl {
        public Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public void finish(boolean r1) {
                r0 = this;
                return
        }

        public float getCurrentAlpha() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public float getCurrentFraction() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getCurrentInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getHiddenStateInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getShownStateInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        public int getTypes() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isCancelled() {
                r1 = this;
                r0 = 1
                return r0
        }

        public boolean isFinished() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void setInsetsAndAlpha(@androidx.annotation.Nullable androidx.core.graphics.Insets r1, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Impl30 extends androidx.core.view.WindowInsetsAnimationControllerCompat.Impl {
        private final android.view.WindowInsetsAnimationController mController;

        public Impl30(@androidx.annotation.NonNull android.view.WindowInsetsAnimationController r1) {
                r0 = this;
                r0.<init>()
                r0.mController = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public final void finish(boolean r2) {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                r0.finish(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentAlpha() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                float r0 = r0.getCurrentAlpha()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentFraction() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                float r0 = r0.getCurrentFraction()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getCurrentInsets() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                android.graphics.Insets r0 = r0.getCurrentInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getHiddenStateInsets() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                android.graphics.Insets r0 = r0.getHiddenStateInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getShownStateInsets() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                android.graphics.Insets r0 = r0.getShownStateInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @android.annotation.SuppressLint({"WrongConstant"})
        public int getTypes() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                int r0 = r0.getTypes()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public final boolean isCancelled() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public final boolean isFinished() {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                boolean r0 = r0.isFinished()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void setInsetsAndAlpha(@androidx.annotation.Nullable androidx.core.graphics.Insets r2, float r3, float r4) {
                r1 = this;
                android.view.WindowInsetsAnimationController r0 = r1.mController
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.graphics.Insets r2 = r2.toPlatformInsets()
            La:
                r0.setInsetsAndAlpha(r2, r3, r4)
                return
        }
    }

    @androidx.annotation.RequiresApi(30)
    public WindowInsetsAnimationControllerCompat(@androidx.annotation.NonNull android.view.WindowInsetsAnimationController r2) {
            r1 = this;
            r1.<init>()
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl30 r0 = new androidx.core.view.WindowInsetsAnimationControllerCompat$Impl30
            r0.<init>(r2)
            r1.mImpl = r0
            return
    }

    public void finish(boolean r2) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            r0.finish(r2)
            return
    }

    public float getCurrentAlpha() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            float r0 = r0.getCurrentAlpha()
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float getCurrentFraction() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            float r0 = r0.getCurrentFraction()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.Insets getCurrentInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getCurrentInsets()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.Insets getHiddenStateInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getHiddenStateInsets()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.Insets getShownStateInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getShownStateInsets()
            return r0
    }

    public int getTypes() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            int r0 = r0.getTypes()
            return r0
    }

    public boolean isCancelled() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isCancelled()
            return r0
    }

    public boolean isFinished() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isFinished()
            return r0
    }

    public boolean isReady() {
            r1 = this;
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto Le
            boolean r0 = r1.isCancelled()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void setInsetsAndAlpha(@androidx.annotation.Nullable androidx.core.graphics.Insets r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationControllerCompat$Impl r0 = r1.mImpl
            r0.setInsetsAndAlpha(r2, r3, r4)
            return
    }
}
