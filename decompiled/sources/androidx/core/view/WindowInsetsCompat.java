package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    @androidx.annotation.NonNull
    public static final androidx.core.view.WindowInsetsCompat CONSUMED = null;
    private static final java.lang.String TAG = "WindowInsetsCompat";
    private final androidx.core.view.WindowInsetsCompat.Impl mImpl;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(21)
    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    public static class Api21ReflectionHolder {
        private static java.lang.reflect.Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static java.lang.reflect.Field sStableInsets;
        private static java.lang.reflect.Field sViewAttachInfoField;

        static {
                java.lang.Class<android.view.View> r0 = android.view.View.class
                java.lang.String r1 = "mAttachInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r0 = "android.view.View$AttachInfo"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mStableInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets = r2     // Catch: java.lang.ReflectiveOperationException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mContentInsets"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sReflectionSucceeded = r1     // Catch: java.lang.ReflectiveOperationException -> L2d
                goto L44
            L2d:
                r0 = move-exception
                java.lang.String r1 = "Failed to get visible insets from AttachInfo "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r2 = r0.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r1, r0)
            L44:
                return
        }

        private Api21ReflectionHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r4) {
                boolean r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sReflectionSucceeded
                r1 = 0
                if (r0 == 0) goto L67
                boolean r0 = r4.isAttachedToWindow()
                if (r0 != 0) goto Lc
                goto L67
            Lc:
                android.view.View r0 = r4.getRootView()
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                if (r0 == 0) goto L67
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.reflect.Field r3 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets     // Catch: java.lang.IllegalAccessException -> L50
                java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalAccessException -> L50
                if (r2 == 0) goto L67
                if (r0 == 0) goto L67
                androidx.core.view.WindowInsetsCompat$Builder r3 = new androidx.core.view.WindowInsetsCompat$Builder     // Catch: java.lang.IllegalAccessException -> L50
                r3.<init>()     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r2)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.view.WindowInsetsCompat$Builder r2 = r3.setStableInsets(r2)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.view.WindowInsetsCompat$Builder r0 = r2.setSystemWindowInsets(r0)     // Catch: java.lang.IllegalAccessException -> L50
                androidx.core.view.WindowInsetsCompat r0 = r0.build()     // Catch: java.lang.IllegalAccessException -> L50
                r0.setRootWindowInsets(r0)     // Catch: java.lang.IllegalAccessException -> L50
                android.view.View r4 = r4.getRootView()     // Catch: java.lang.IllegalAccessException -> L50
                r0.copyRootViewBounds(r4)     // Catch: java.lang.IllegalAccessException -> L50
                return r0
            L50:
                r4 = move-exception
                java.lang.String r0 = "Failed to get insets from AttachInfo. "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r2 = r4.getMessage()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r0, r4)
            L67:
                return r1
        }
    }

    public static final class Builder {
        private final androidx.core.view.WindowInsetsCompat.BuilderImpl mImpl;

        public Builder() {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L11
                androidx.core.view.WindowInsetsCompat$BuilderImpl30 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl30
                r0.<init>()
                r2.mImpl = r0
                goto L24
            L11:
                r1 = 29
                if (r0 < r1) goto L1d
                androidx.core.view.WindowInsetsCompat$BuilderImpl29 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl29
                r0.<init>()
                r2.mImpl = r0
                goto L24
            L1d:
                androidx.core.view.WindowInsetsCompat$BuilderImpl20 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl20
                r0.<init>()
                r2.mImpl = r0
            L24:
                return
        }

        public Builder(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L11
                androidx.core.view.WindowInsetsCompat$BuilderImpl30 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl30
                r0.<init>(r3)
                r2.mImpl = r0
                goto L24
            L11:
                r1 = 29
                if (r0 < r1) goto L1d
                androidx.core.view.WindowInsetsCompat$BuilderImpl29 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl29
                r0.<init>(r3)
                r2.mImpl = r0
                goto L24
            L1d:
                androidx.core.view.WindowInsetsCompat$BuilderImpl20 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl20
                r0.<init>(r3)
                r2.mImpl = r0
            L24:
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat build() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                androidx.core.view.WindowInsetsCompat r0 = r0.build()
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat.Builder setDisplayCutout(@androidx.annotation.Nullable androidx.core.view.DisplayCutoutCompat r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setDisplayCutout(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat.Builder setInsets(int r2, @androidx.annotation.NonNull androidx.core.graphics.Insets r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setInsets(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat.Builder setInsetsIgnoringVisibility(int r2, @androidx.annotation.NonNull androidx.core.graphics.Insets r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setInsetsIgnoringVisibility(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setMandatorySystemGestureInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setMandatorySystemGestureInsets(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setStableInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setStableInsets(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemGestureInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setSystemGestureInsets(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemWindowInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setSystemWindowInsets(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setTappableElementInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setTappableElementInsets(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat.Builder setVisible(int r2, boolean r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setVisible(r2, r3)
                return r1
        }
    }

    public static class BuilderImpl {
        private final androidx.core.view.WindowInsetsCompat mInsets;
        public androidx.core.graphics.Insets[] mInsetsTypeMask;

        public BuilderImpl() {
                r2 = this;
                androidx.core.view.WindowInsetsCompat r0 = new androidx.core.view.WindowInsetsCompat
                r1 = 0
                r0.<init>(r1)
                r2.<init>(r0)
                return
        }

        public BuilderImpl(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mInsets = r1
                return
        }

        public final void applyInsetTypes() {
                r5 = this;
                androidx.core.graphics.Insets[] r0 = r5.mInsetsTypeMask
                if (r0 == 0) goto L58
                r1 = 1
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r2]
                androidx.core.graphics.Insets[] r2 = r5.mInsetsTypeMask
                r3 = 2
                int r4 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r3)
                r2 = r2[r4]
                if (r2 != 0) goto L1c
                androidx.core.view.WindowInsetsCompat r2 = r5.mInsets
                androidx.core.graphics.Insets r2 = r2.getInsets(r3)
            L1c:
                if (r0 != 0) goto L24
                androidx.core.view.WindowInsetsCompat r0 = r5.mInsets
                androidx.core.graphics.Insets r0 = r0.getInsets(r1)
            L24:
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.max(r0, r2)
                r5.setSystemWindowInsets(r0)
                androidx.core.graphics.Insets[] r0 = r5.mInsetsTypeMask
                r1 = 16
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L3a
                r5.setSystemGestureInsets(r0)
            L3a:
                androidx.core.graphics.Insets[] r0 = r5.mInsetsTypeMask
                r1 = 32
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L49
                r5.setMandatorySystemGestureInsets(r0)
            L49:
                androidx.core.graphics.Insets[] r0 = r5.mInsetsTypeMask
                r1 = 64
                int r1 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L58
                r5.setTappableElementInsets(r0)
            L58:
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat build() {
                r1 = this;
                r1.applyInsetTypes()
                androidx.core.view.WindowInsetsCompat r0 = r1.mInsets
                return r0
        }

        public void setDisplayCutout(@androidx.annotation.Nullable androidx.core.view.DisplayCutoutCompat r1) {
                r0 = this;
                return
        }

        public void setInsets(int r4, @androidx.annotation.NonNull androidx.core.graphics.Insets r5) {
                r3 = this;
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                if (r0 != 0) goto La
                r0 = 9
                androidx.core.graphics.Insets[] r0 = new androidx.core.graphics.Insets[r0]
                r3.mInsetsTypeMask = r0
            La:
                r0 = 1
            Lb:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L1f
                r1 = r4 & r0
                if (r1 != 0) goto L14
                goto L1c
            L14:
                androidx.core.graphics.Insets[] r1 = r3.mInsetsTypeMask
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r0)
                r1[r2] = r5
            L1c:
                int r0 = r0 << 1
                goto Lb
            L1f:
                return
        }

        public void setInsetsIgnoringVisibility(int r1, @androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r0 = this;
                r2 = 8
                if (r1 == r2) goto L5
                return
            L5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Ignoring visibility inset not available for IME"
                r1.<init>(r2)
                throw r1
        }

        public void setMandatorySystemGestureInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        public void setStableInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        public void setSystemGestureInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        public void setSystemWindowInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        public void setTappableElementInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        public void setVisible(int r1, boolean r2) {
                r0 = this;
                return
        }
    }

    @androidx.annotation.RequiresApi(api = 20)
    public static class BuilderImpl20 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        private static java.lang.reflect.Constructor<android.view.WindowInsets> sConstructor;
        private static boolean sConstructorFetched;
        private static java.lang.reflect.Field sConsumedField;
        private static boolean sConsumedFieldFetched;
        private android.view.WindowInsets mPlatformInsets;
        private androidx.core.graphics.Insets mStableInsets;

        public BuilderImpl20() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r0 = createWindowInsetsInstance()
                r1.mPlatformInsets = r0
                return
        }

        public BuilderImpl20(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.WindowInsets r1 = r1.toWindowInsets()
                r0.mPlatformInsets = r1
                return
        }

        @androidx.annotation.Nullable
        private static android.view.WindowInsets createWindowInsetsInstance() {
                boolean r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched
                r1 = 1
                java.lang.String r2 = "WindowInsetsCompat"
                if (r0 != 0) goto L1a
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.String r3 = "CONSUMED"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L12
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField = r0     // Catch: java.lang.ReflectiveOperationException -> L12
                goto L18
            L12:
                r0 = move-exception
                java.lang.String r3 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r3, r0)
            L18:
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched = r1
            L1a:
                java.lang.reflect.Field r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField
                r3 = 0
                if (r0 == 0) goto L33
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L2d
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                if (r0 == 0) goto L33
                android.view.WindowInsets r4 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
                r4.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                return r4
            L2d:
                r0 = move-exception
                java.lang.String r4 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r4, r0)
            L33:
                boolean r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched
                r4 = 0
                if (r0 != 0) goto L4f
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L47
                java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
                r5[r4] = r6     // Catch: java.lang.ReflectiveOperationException -> L47
                java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L47
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor = r0     // Catch: java.lang.ReflectiveOperationException -> L47
                goto L4d
            L47:
                r0 = move-exception
                java.lang.String r5 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r5, r0)
            L4d:
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched = r1
            L4f:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor
                if (r0 == 0) goto L69
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L63
                android.graphics.Rect r5 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L63
                r5.<init>()     // Catch: java.lang.ReflectiveOperationException -> L63
                r1[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L63
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L63
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L63
                return r0
            L63:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r1, r0)
            L69:
                return r3
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat build() {
                r2 = this;
                r2.applyInsetTypes()
                android.view.WindowInsets r0 = r2.mPlatformInsets
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.graphics.Insets[] r1 = r2.mInsetsTypeMask
                r0.setOverriddenInsets(r1)
                androidx.core.graphics.Insets r1 = r2.mStableInsets
                r0.setStableInsets(r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setStableInsets(@androidx.annotation.Nullable androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mStableInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r5) {
                r4 = this;
                android.view.WindowInsets r0 = r4.mPlatformInsets
                if (r0 == 0) goto L12
                int r1 = r5.left
                int r2 = r5.top
                int r3 = r5.right
                int r5 = r5.bottom
                android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
                r4.mPlatformInsets = r5
            L12:
                return
        }
    }

    @androidx.annotation.RequiresApi(api = 29)
    public static class BuilderImpl29 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        public final android.view.WindowInsets.Builder mPlatBuilder;

        public BuilderImpl29() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                r1.mPlatBuilder = r0
                return
        }

        public BuilderImpl29(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2) {
                r1 = this;
                r1.<init>(r2)
                android.view.WindowInsets r2 = r2.toWindowInsets()
                if (r2 == 0) goto Lf
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>(r2)
                goto L14
            Lf:
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
            L14:
                r1.mPlatBuilder = r0
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat build() {
                r2 = this;
                r2.applyInsetTypes()
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.view.WindowInsets r0 = r0.build()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.graphics.Insets[] r1 = r2.mInsetsTypeMask
                r0.setOverriddenInsets(r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setDisplayCutout(@androidx.annotation.Nullable androidx.core.view.DisplayCutoutCompat r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                if (r2 == 0) goto L9
                android.view.DisplayCutout r2 = r2.unwrap()
                goto La
            L9:
                r2 = 0
            La:
                r0.setDisplayCutout(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setMandatorySystemGestureInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setMandatorySystemGestureInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setStableInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setStableInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemGestureInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setSystemGestureInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setSystemWindowInsets(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setTappableElementInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.setTappableElementInsets(r2)
                return
        }
    }

    @androidx.annotation.RequiresApi(30)
    public static class BuilderImpl30 extends androidx.core.view.WindowInsetsCompat.BuilderImpl29 {
        public BuilderImpl30() {
                r0 = this;
                r0.<init>()
                return
        }

        public BuilderImpl30(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsets(int r2, @androidx.annotation.NonNull androidx.core.graphics.Insets r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r3 = r3.toPlatformInsets()
                r0.setInsets(r2, r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsetsIgnoringVisibility(int r2, @androidx.annotation.NonNull androidx.core.graphics.Insets r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r3 = r3.toPlatformInsets()
                r0.setInsetsIgnoringVisibility(r2, r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setVisible(int r2, boolean r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.mPlatBuilder
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                r0.setVisible(r2, r3)
                return
        }
    }

    public static class Impl {

        @androidx.annotation.NonNull
        public static final androidx.core.view.WindowInsetsCompat CONSUMED = null;
        public final androidx.core.view.WindowInsetsCompat mHost;

        static {
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                r0.<init>()
                androidx.core.view.WindowInsetsCompat r0 = r0.build()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeDisplayCutout()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat.Impl.CONSUMED = r0
                return
        }

        public Impl(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mHost = r1
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        public void copyRootViewBounds(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                return
        }

        public void copyWindowDataInto(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.core.view.WindowInsetsCompat.Impl
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.core.view.WindowInsetsCompat$Impl r5 = (androidx.core.view.WindowInsetsCompat.Impl) r5
                boolean r1 = r4.isRound()
                boolean r3 = r5.isRound()
                if (r1 != r3) goto L4b
                boolean r1 = r4.isConsumed()
                boolean r3 = r5.isConsumed()
                if (r1 != r3) goto L4b
                androidx.core.graphics.Insets r1 = r4.getSystemWindowInsets()
                androidx.core.graphics.Insets r3 = r5.getSystemWindowInsets()
                boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
                if (r1 == 0) goto L4b
                androidx.core.graphics.Insets r1 = r4.getStableInsets()
                androidx.core.graphics.Insets r3 = r5.getStableInsets()
                boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
                if (r1 == 0) goto L4b
                androidx.core.view.DisplayCutoutCompat r1 = r4.getDisplayCutout()
                androidx.core.view.DisplayCutoutCompat r5 = r5.getDisplayCutout()
                boolean r5 = androidx.core.util.ObjectsCompat.equals(r1, r5)
                if (r5 == 0) goto L4b
                goto L4c
            L4b:
                r0 = 0
            L4c:
                return r0
        }

        @androidx.annotation.Nullable
        public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsets(int r1) {
                r0 = this;
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                r2 = r2 & 8
                if (r2 != 0) goto L7
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.NONE
                return r2
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Unable to query the maximum insets for IME"
                r2.<init>(r0)
                throw r2
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getStableInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getSystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getSystemWindowInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getTappableElementInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.isRound()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                boolean r1 = r3.isConsumed()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                androidx.core.graphics.Insets r1 = r3.getSystemWindowInsets()
                r2 = 2
                r0[r2] = r1
                androidx.core.graphics.Insets r1 = r3.getStableInsets()
                r2 = 3
                r0[r2] = r1
                androidx.core.view.DisplayCutoutCompat r1 = r3.getDisplayCutout()
                r2 = 4
                r0[r2] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat inset(int r1, int r2, int r3, int r4) {
                r0 = this;
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED
                return r1
        }

        public boolean isConsumed() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isRound() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isVisible(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        public void setOverriddenInsets(androidx.core.graphics.Insets[] r1) {
                r0 = this;
                return
        }

        public void setRootViewData(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        public void setRootWindowInsets(@androidx.annotation.Nullable androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                return
        }

        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }
    }

    @androidx.annotation.RequiresApi(20)
    public static class Impl20 extends androidx.core.view.WindowInsetsCompat.Impl {
        private static java.lang.Class<?> sAttachInfoClass;
        private static java.lang.reflect.Field sAttachInfoField;
        private static java.lang.reflect.Method sGetViewRootImplMethod;
        private static java.lang.reflect.Field sVisibleInsetsField;
        private static boolean sVisibleRectReflectionFetched;
        private androidx.core.graphics.Insets[] mOverriddenInsets;

        @androidx.annotation.NonNull
        public final android.view.WindowInsets mPlatformInsets;
        public androidx.core.graphics.Insets mRootViewVisibleInsets;
        private androidx.core.view.WindowInsetsCompat mRootWindowInsets;
        private androidx.core.graphics.Insets mSystemWindowInsets;

        public Impl20(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.mSystemWindowInsets = r1
                r0.mPlatformInsets = r2
                return
        }

        public Impl20(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat.Impl20 r3) {
                r1 = this;
                android.view.WindowInsets r0 = new android.view.WindowInsets
                android.view.WindowInsets r3 = r3.mPlatformInsets
                r0.<init>(r3)
                r1.<init>(r2, r0)
                return
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"WrongConstant"})
        private androidx.core.graphics.Insets getInsets(int r4, boolean r5) {
                r3 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                r1 = 1
            L3:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L17
                r2 = r4 & r1
                if (r2 != 0) goto Lc
                goto L14
            Lc:
                androidx.core.graphics.Insets r2 = r3.getInsetsForType(r1, r5)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.max(r0, r2)
            L14:
                int r1 = r1 << 1
                goto L3
            L17:
                return r0
        }

        private androidx.core.graphics.Insets getRootStableInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                if (r0 == 0) goto L9
                androidx.core.graphics.Insets r0 = r0.getStableInsets()
                return r0
            L9:
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        @androidx.annotation.Nullable
        private androidx.core.graphics.Insets getVisibleInsets(@androidx.annotation.NonNull android.view.View r5) {
                r4 = this;
                java.lang.String r0 = "WindowInsetsCompat"
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L5c
                boolean r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched
                if (r1 != 0) goto Lf
                loadReflectionField()
            Lf:
                java.lang.reflect.Method r1 = androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod
                r2 = 0
                if (r1 == 0) goto L5b
                java.lang.Class<?> r3 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass
                if (r3 == 0) goto L5b
                java.lang.reflect.Field r3 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField
                if (r3 != 0) goto L1d
                goto L5b
            L1d:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.Object r5 = r1.invoke(r5, r3)     // Catch: java.lang.ReflectiveOperationException -> L46
                if (r5 != 0) goto L31
                java.lang.String r5 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L46
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L46
                android.util.Log.w(r0, r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L46
                return r2
            L31:
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField     // Catch: java.lang.ReflectiveOperationException -> L46
                java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.ReflectiveOperationException -> L46
                android.graphics.Rect r5 = (android.graphics.Rect) r5     // Catch: java.lang.ReflectiveOperationException -> L46
                if (r5 == 0) goto L45
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r5)     // Catch: java.lang.ReflectiveOperationException -> L46
            L45:
                return r2
            L46:
                r5 = move-exception
                java.lang.String r1 = "Failed to get visible insets. (Reflection error). "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r3 = r5.getMessage()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r0, r1, r5)
            L5b:
                return r2
            L5c:
                java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
                r5.<init>(r0)
                throw r5
        }

        @android.annotation.SuppressLint({"PrivateApi"})
        private static void loadReflectionField() {
                r0 = 1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "getViewRootImpl"
                r3 = 0
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L37
                androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r1 = "android.view.View$AttachInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L37
                androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r2 = "mVisibleInsets"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L37
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r1 = "android.view.ViewRootImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r2 = "mAttachInfo"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L37
                androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField     // Catch: java.lang.ReflectiveOperationException -> L37
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L37
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L37
                goto L4e
            L37:
                r1 = move-exception
                java.lang.String r2 = "Failed to get visible insets. (Reflection error). "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.String r3 = r1.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WindowInsetsCompat"
                android.util.Log.e(r3, r2, r1)
            L4e:
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched = r0
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void copyRootViewBounds(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                androidx.core.graphics.Insets r1 = r0.getVisibleInsets(r1)
                if (r1 != 0) goto L8
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            L8:
                r0.setRootViewData(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void copyWindowDataInto(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                r2.setRootWindowInsets(r0)
                androidx.core.graphics.Insets r0 = r1.mRootViewVisibleInsets
                r2.setRootViewData(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = super.equals(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                androidx.core.view.WindowInsetsCompat$Impl20 r2 = (androidx.core.view.WindowInsetsCompat.Impl20) r2
                androidx.core.graphics.Insets r0 = r1.mRootViewVisibleInsets
                androidx.core.graphics.Insets r2 = r2.mRootViewVisibleInsets
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsets(int r2) {
                r1 = this;
                r0 = 0
                androidx.core.graphics.Insets r2 = r1.getInsets(r2, r0)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsetsForType(int r5, boolean r6) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == r0) goto Ld7
                r0 = 2
                r2 = 0
                if (r5 == r0) goto L91
                r6 = 8
                if (r5 == r6) goto L55
                r6 = 16
                if (r5 == r6) goto L50
                r6 = 32
                if (r5 == r6) goto L4b
                r6 = 64
                if (r5 == r6) goto L46
                r6 = 128(0x80, float:1.8E-43)
                if (r5 == r6) goto L1f
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                return r5
            L1f:
                androidx.core.view.WindowInsetsCompat r5 = r4.mRootWindowInsets
                if (r5 == 0) goto L28
                androidx.core.view.DisplayCutoutCompat r5 = r5.getDisplayCutout()
                goto L2c
            L28:
                androidx.core.view.DisplayCutoutCompat r5 = r4.getDisplayCutout()
            L2c:
                if (r5 == 0) goto L43
                int r6 = r5.getSafeInsetLeft()
                int r0 = r5.getSafeInsetTop()
                int r1 = r5.getSafeInsetRight()
                int r5 = r5.getSafeInsetBottom()
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r6, r0, r1, r5)
                return r5
            L43:
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                return r5
            L46:
                androidx.core.graphics.Insets r5 = r4.getTappableElementInsets()
                return r5
            L4b:
                androidx.core.graphics.Insets r5 = r4.getMandatorySystemGestureInsets()
                return r5
            L50:
                androidx.core.graphics.Insets r5 = r4.getSystemGestureInsets()
                return r5
            L55:
                androidx.core.graphics.Insets[] r5 = r4.mOverriddenInsets
                if (r5 == 0) goto L5f
                int r6 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r6)
                r2 = r5[r6]
            L5f:
                if (r2 == 0) goto L62
                return r2
            L62:
                androidx.core.graphics.Insets r5 = r4.getSystemWindowInsets()
                androidx.core.graphics.Insets r6 = r4.getRootStableInsets()
                int r5 = r5.bottom
                int r0 = r6.bottom
                if (r5 <= r0) goto L75
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r1, r1, r1, r5)
                return r5
            L75:
                androidx.core.graphics.Insets r5 = r4.mRootViewVisibleInsets
                if (r5 == 0) goto L8e
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L8e
                androidx.core.graphics.Insets r5 = r4.mRootViewVisibleInsets
                int r5 = r5.bottom
                int r6 = r6.bottom
                if (r5 <= r6) goto L8e
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r1, r1, r1, r5)
                return r5
            L8e:
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                return r5
            L91:
                if (r6 == 0) goto Lb8
                androidx.core.graphics.Insets r5 = r4.getRootStableInsets()
                androidx.core.graphics.Insets r6 = r4.getStableInsets()
                int r0 = r5.left
                int r2 = r6.left
                int r0 = java.lang.Math.max(r0, r2)
                int r2 = r5.right
                int r3 = r6.right
                int r2 = java.lang.Math.max(r2, r3)
                int r5 = r5.bottom
                int r6 = r6.bottom
                int r5 = java.lang.Math.max(r5, r6)
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r0, r1, r2, r5)
                return r5
            Lb8:
                androidx.core.graphics.Insets r5 = r4.getSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat r6 = r4.mRootWindowInsets
                if (r6 == 0) goto Lc4
                androidx.core.graphics.Insets r2 = r6.getStableInsets()
            Lc4:
                int r6 = r5.bottom
                if (r2 == 0) goto Lce
                int r0 = r2.bottom
                int r6 = java.lang.Math.min(r6, r0)
            Lce:
                int r0 = r5.left
                int r5 = r5.right
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r0, r1, r5, r6)
                return r5
            Ld7:
                if (r6 == 0) goto Lee
                androidx.core.graphics.Insets r5 = r4.getRootStableInsets()
                int r5 = r5.top
                androidx.core.graphics.Insets r6 = r4.getSystemWindowInsets()
                int r6 = r6.top
                int r5 = java.lang.Math.max(r5, r6)
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r1, r5, r1, r1)
                return r5
            Lee:
                androidx.core.graphics.Insets r5 = r4.getSystemWindowInsets()
                int r5 = r5.top
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r1, r5, r1, r1)
                return r5
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                r0 = 1
                androidx.core.graphics.Insets r2 = r1.getInsets(r2, r0)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public final androidx.core.graphics.Insets getSystemWindowInsets() {
                r4 = this;
                androidx.core.graphics.Insets r0 = r4.mSystemWindowInsets
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.mPlatformInsets
                int r0 = r0.getSystemWindowInsetLeft()
                android.view.WindowInsets r1 = r4.mPlatformInsets
                int r1 = r1.getSystemWindowInsetTop()
                android.view.WindowInsets r2 = r4.mPlatformInsets
                int r2 = r2.getSystemWindowInsetRight()
                android.view.WindowInsets r3 = r4.mPlatformInsets
                int r3 = r3.getSystemWindowInsetBottom()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0, r1, r2, r3)
                r4.mSystemWindowInsets = r0
            L22:
                androidx.core.graphics.Insets r0 = r4.mSystemWindowInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat inset(int r3, int r4, int r5, int r6) {
                r2 = this;
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                android.view.WindowInsets r1 = r2.mPlatformInsets
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1)
                r0.<init>(r1)
                androidx.core.graphics.Insets r1 = r2.getSystemWindowInsets()
                androidx.core.graphics.Insets r1 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r3, r4, r5, r6)
                r0.setSystemWindowInsets(r1)
                androidx.core.graphics.Insets r1 = r2.getStableInsets()
                androidx.core.graphics.Insets r3 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r3, r4, r5, r6)
                r0.setStableInsets(r3)
                androidx.core.view.WindowInsetsCompat r3 = r0.build()
                return r3
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isRound() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                boolean r0 = r0.isRound()
                return r0
        }

        public boolean isTypeVisible(int r4) {
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 == r1) goto L14
                r2 = 2
                if (r4 == r2) goto L14
                r2 = 4
                if (r4 == r2) goto L13
                r2 = 8
                if (r4 == r2) goto L14
                r2 = 128(0x80, float:1.8E-43)
                if (r4 == r2) goto L14
                return r1
            L13:
                return r0
            L14:
                androidx.core.graphics.Insets r4 = r3.getInsetsForType(r4, r0)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                boolean r4 = r4.equals(r0)
                r4 = r4 ^ r1
                return r4
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @android.annotation.SuppressLint({"WrongConstant"})
        public boolean isVisible(int r4) {
                r3 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L16
                r2 = r4 & r1
                if (r2 != 0) goto Lb
                goto L13
            Lb:
                boolean r2 = r3.isTypeVisible(r1)
                if (r2 != 0) goto L13
                r4 = 0
                return r4
            L13:
                int r1 = r1 << 1
                goto L2
            L16:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(androidx.core.graphics.Insets[] r1) {
                r0 = this;
                r0.mOverriddenInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setRootViewData(@androidx.annotation.NonNull androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mRootViewVisibleInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setRootWindowInsets(@androidx.annotation.Nullable androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.mRootWindowInsets = r1
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class Impl21 extends androidx.core.view.WindowInsetsCompat.Impl20 {
        private androidx.core.graphics.Insets mStableInsets;

        public Impl21(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mStableInsets = r1
                return
        }

        public Impl21(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat.Impl21 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mStableInsets = r1
                androidx.core.graphics.Insets r1 = r2.mStableInsets
                r0.mStableInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeStableInsets()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public final androidx.core.graphics.Insets getStableInsets() {
                r4 = this;
                androidx.core.graphics.Insets r0 = r4.mStableInsets
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.mPlatformInsets
                int r0 = r0.getStableInsetLeft()
                android.view.WindowInsets r1 = r4.mPlatformInsets
                int r1 = r1.getStableInsetTop()
                android.view.WindowInsets r2 = r4.mPlatformInsets
                int r2 = r2.getStableInsetRight()
                android.view.WindowInsets r3 = r4.mPlatformInsets
                int r3 = r3.getStableInsetBottom()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0, r1, r2, r3)
                r4.mStableInsets = r0
            L22:
                androidx.core.graphics.Insets r0 = r4.mStableInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isConsumed() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                boolean r0 = r0.isConsumed()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(@androidx.annotation.Nullable androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mStableInsets = r1
                return
        }
    }

    @androidx.annotation.RequiresApi(28)
    public static class Impl28 extends androidx.core.view.WindowInsetsCompat.Impl21 {
        public Impl28(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public Impl28(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat.Impl28 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeDisplayCutout()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.core.view.WindowInsetsCompat.Impl28
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.core.view.WindowInsetsCompat$Impl28 r5 = (androidx.core.view.WindowInsetsCompat.Impl28) r5
                android.view.WindowInsets r1 = r4.mPlatformInsets
                android.view.WindowInsets r3 = r5.mPlatformInsets
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L21
                androidx.core.graphics.Insets r1 = r4.mRootViewVisibleInsets
                androidx.core.graphics.Insets r5 = r5.mRootViewVisibleInsets
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.Nullable
        public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.DisplayCutout r0 = r0.getDisplayCutout()
                androidx.core.view.DisplayCutoutCompat r0 = androidx.core.view.DisplayCutoutCompat.wrap(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r0 = r0.hashCode()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(29)
    public static class Impl29 extends androidx.core.view.WindowInsetsCompat.Impl28 {
        private androidx.core.graphics.Insets mMandatorySystemGestureInsets;
        private androidx.core.graphics.Insets mSystemGestureInsets;
        private androidx.core.graphics.Insets mTappableElementInsets;

        public Impl29(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mSystemGestureInsets = r1
                r0.mMandatorySystemGestureInsets = r1
                r0.mTappableElementInsets = r1
                return
        }

        public Impl29(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat.Impl29 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mSystemGestureInsets = r1
                r0.mMandatorySystemGestureInsets = r1
                r0.mTappableElementInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mMandatorySystemGestureInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mMandatorySystemGestureInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mMandatorySystemGestureInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getSystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mSystemGestureInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getSystemGestureInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mSystemGestureInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mSystemGestureInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getTappableElementInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mTappableElementInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getTappableElementInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mTappableElementInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mTappableElementInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat inset(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r2 = r0.inset(r2, r3, r4, r5)
                androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(@androidx.annotation.Nullable androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Impl30 extends androidx.core.view.WindowInsetsCompat.Impl29 {

        @androidx.annotation.NonNull
        public static final androidx.core.view.WindowInsetsCompat CONSUMED = null;

        static {
                android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED = r0
                return
        }

        public Impl30(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public Impl30(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat.Impl30 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public final void copyRootViewBounds(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsets(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r2 = r0.getInsets(r2)
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.toCompatInsets(r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @androidx.annotation.NonNull
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                android.graphics.Insets r2 = r0.getInsetsIgnoringVisibility(r2)
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.toCompatInsets(r2)
                return r2
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r2 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r2)
                boolean r2 = r0.isVisible(r2)
                return r2
        }
    }

    public static final class Type {

        /* JADX INFO: loaded from: classes2.dex */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface InsetsType {
        }

        private Type() {
                r0 = this;
                r0.<init>()
                return
        }

        public static int captionBar() {
                r0 = 4
                return r0
        }

        public static int displayCutout() {
                r0 = 128(0x80, float:1.8E-43)
                return r0
        }

        public static int ime() {
                r0 = 8
                return r0
        }

        public static int indexOf(int r3) {
                r0 = 1
                if (r3 == r0) goto L3a
                r1 = 2
                if (r3 == r1) goto L39
                r0 = 4
                if (r3 == r0) goto L38
                r1 = 8
                if (r3 == r1) goto L36
                r2 = 16
                if (r3 == r2) goto L35
                r0 = 32
                if (r3 == r0) goto L33
                r0 = 64
                if (r3 == r0) goto L31
                r0 = 128(0x80, float:1.8E-43)
                if (r3 == r0) goto L2f
                r0 = 256(0x100, float:3.59E-43)
                if (r3 != r0) goto L22
                return r1
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "type needs to be >= FIRST and <= LAST, type="
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
            L2f:
                r3 = 7
                return r3
            L31:
                r3 = 6
                return r3
            L33:
                r3 = 5
                return r3
            L35:
                return r0
            L36:
                r3 = 3
                return r3
            L38:
                return r1
            L39:
                return r0
            L3a:
                r3 = 0
                return r3
        }

        public static int mandatorySystemGestures() {
                r0 = 32
                return r0
        }

        public static int navigationBars() {
                r0 = 2
                return r0
        }

        public static int statusBars() {
                r0 = 1
                return r0
        }

        public static int systemBars() {
                r0 = 7
                return r0
        }

        public static int systemGestures() {
                r0 = 16
                return r0
        }

        public static int tappableElement() {
                r0 = 64
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(30)
    public static final class TypeImpl30 {
        private TypeImpl30() {
                r0 = this;
                r0.<init>()
                return
        }

        public static int toPlatformType(int r4) {
                r0 = 1
                r1 = 0
                r2 = 1
            L3:
                r3 = 256(0x100, float:3.59E-43)
                if (r2 > r3) goto L53
                r3 = r4 & r2
                if (r3 == 0) goto L50
                if (r2 == r0) goto L4b
                r3 = 2
                if (r2 == r3) goto L46
                r3 = 4
                if (r2 == r3) goto L41
                r3 = 8
                if (r2 == r3) goto L3c
                r3 = 16
                if (r2 == r3) goto L37
                r3 = 32
                if (r2 == r3) goto L32
                r3 = 64
                if (r2 == r3) goto L2d
                r3 = 128(0x80, float:1.8E-43)
                if (r2 == r3) goto L28
                goto L50
            L28:
                int r3 = android.view.WindowInsets.Type.displayCutout()
                goto L4f
            L2d:
                int r3 = android.view.WindowInsets.Type.tappableElement()
                goto L4f
            L32:
                int r3 = android.view.WindowInsets.Type.mandatorySystemGestures()
                goto L4f
            L37:
                int r3 = android.view.WindowInsets.Type.systemGestures()
                goto L4f
            L3c:
                int r3 = android.view.WindowInsets.Type.ime()
                goto L4f
            L41:
                int r3 = android.view.WindowInsets.Type.captionBar()
                goto L4f
            L46:
                int r3 = android.view.WindowInsets.Type.navigationBars()
                goto L4f
            L4b:
                int r3 = android.view.WindowInsets.Type.statusBars()
            L4f:
                r1 = r1 | r3
            L50:
                int r2 = r2 << 1
                goto L3
            L53:
                return r1
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
            goto Lf
        Lb:
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
        Lf:
            return
    }

    @androidx.annotation.RequiresApi(20)
    private WindowInsetsCompat(@androidx.annotation.NonNull android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.WindowInsetsCompat$Impl30 r0 = new androidx.core.view.WindowInsetsCompat$Impl30
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L30
        L11:
            r1 = 29
            if (r0 < r1) goto L1d
            androidx.core.view.WindowInsetsCompat$Impl29 r0 = new androidx.core.view.WindowInsetsCompat$Impl29
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L30
        L1d:
            r1 = 28
            if (r0 < r1) goto L29
            androidx.core.view.WindowInsetsCompat$Impl28 r0 = new androidx.core.view.WindowInsetsCompat$Impl28
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L30
        L29:
            androidx.core.view.WindowInsetsCompat$Impl21 r0 = new androidx.core.view.WindowInsetsCompat$Impl21
            r0.<init>(r2, r3)
            r2.mImpl = r0
        L30:
            return
    }

    public WindowInsetsCompat(@androidx.annotation.Nullable androidx.core.view.WindowInsetsCompat r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L6b
            androidx.core.view.WindowInsetsCompat$Impl r3 = r3.mImpl
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            boolean r1 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl30
            if (r1 == 0) goto L1c
            androidx.core.view.WindowInsetsCompat$Impl30 r0 = new androidx.core.view.WindowInsetsCompat$Impl30
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl30 r1 = (androidx.core.view.WindowInsetsCompat.Impl30) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L67
        L1c:
            r1 = 29
            if (r0 < r1) goto L2f
            boolean r1 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl29
            if (r1 == 0) goto L2f
            androidx.core.view.WindowInsetsCompat$Impl29 r0 = new androidx.core.view.WindowInsetsCompat$Impl29
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl29 r1 = (androidx.core.view.WindowInsetsCompat.Impl29) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L67
        L2f:
            r1 = 28
            if (r0 < r1) goto L42
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl28
            if (r0 == 0) goto L42
            androidx.core.view.WindowInsetsCompat$Impl28 r0 = new androidx.core.view.WindowInsetsCompat$Impl28
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl28 r1 = (androidx.core.view.WindowInsetsCompat.Impl28) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L67
        L42:
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl21
            if (r0 == 0) goto L51
            androidx.core.view.WindowInsetsCompat$Impl21 r0 = new androidx.core.view.WindowInsetsCompat$Impl21
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl21 r1 = (androidx.core.view.WindowInsetsCompat.Impl21) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L67
        L51:
            boolean r0 = r3 instanceof androidx.core.view.WindowInsetsCompat.Impl20
            if (r0 == 0) goto L60
            androidx.core.view.WindowInsetsCompat$Impl20 r0 = new androidx.core.view.WindowInsetsCompat$Impl20
            r1 = r3
            androidx.core.view.WindowInsetsCompat$Impl20 r1 = (androidx.core.view.WindowInsetsCompat.Impl20) r1
            r0.<init>(r2, r1)
            r2.mImpl = r0
            goto L67
        L60:
            androidx.core.view.WindowInsetsCompat$Impl r0 = new androidx.core.view.WindowInsetsCompat$Impl
            r0.<init>(r2)
            r2.mImpl = r0
        L67:
            r3.copyWindowDataInto(r2)
            goto L72
        L6b:
            androidx.core.view.WindowInsetsCompat$Impl r3 = new androidx.core.view.WindowInsetsCompat$Impl
            r3.<init>(r2)
            r2.mImpl = r3
        L72:
            return
    }

    public static androidx.core.graphics.Insets insetInsets(@androidx.annotation.NonNull androidx.core.graphics.Insets r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.left
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.top
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.right
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.bottom
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.of(r0, r2, r3, r1)
            return r5
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(20)
    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(@androidx.annotation.NonNull android.view.WindowInsets r1) {
            r0 = 0
            androidx.core.view.WindowInsetsCompat r1 = toWindowInsetsCompat(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(20)
    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(@androidx.annotation.NonNull android.view.WindowInsets r1, @androidx.annotation.Nullable android.view.View r2) {
            androidx.core.view.WindowInsetsCompat r0 = new androidx.core.view.WindowInsetsCompat
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            r0.<init>(r1)
            if (r2 == 0) goto L21
            boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r1 == 0) goto L21
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.getRootWindowInsets(r2)
            r0.setRootWindowInsets(r1)
            android.view.View r1 = r2.getRootView()
            r0.copyRootViewBounds(r1)
        L21:
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeDisplayCutout()
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
            return r0
    }

    public final void copyRootViewBounds(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.copyRootViewBounds(r2)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.core.view.WindowInsetsCompat
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.core.view.WindowInsetsCompat r2 = (androidx.core.view.WindowInsetsCompat) r2
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat$Impl r2 = r2.mImpl
            boolean r2 = androidx.core.util.ObjectsCompat.equals(r0, r2)
            return r2
    }

    @androidx.annotation.Nullable
    public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.DisplayCutoutCompat r0 = r0.getDisplayCutout()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.Insets getInsets(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r2 = r0.getInsets(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r2 = r0.getInsetsIgnoringVisibility(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetBottom() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.bottom
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetLeft() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.left
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetRight() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.right
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetTop() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.top
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.graphics.Insets getStableInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemGestureInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.bottom
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.left
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetRight() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.right
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetTop() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.top
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.graphics.Insets getTappableElementInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public boolean hasInsets() {
            r3 = this;
            r0 = -1
            androidx.core.graphics.Insets r1 = r3.getInsets(r0)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.NONE
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L25
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            r0 = r0 ^ r1
            androidx.core.graphics.Insets r0 = r3.getInsetsIgnoringVisibility(r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L25
            androidx.core.view.DisplayCutoutCompat r0 = r3.getDisplayCutout()
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = 0
            goto L26
        L25:
            r0 = 1
        L26:
            return r0
    }

    @java.lang.Deprecated
    public boolean hasStableInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.view.WindowInsetsCompat inset(@androidx.annotation.IntRange(from = 0) int r2, @androidx.annotation.IntRange(from = 0) int r3, @androidx.annotation.IntRange(from = 0) int r4, @androidx.annotation.IntRange(from = 0) int r5) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r2 = r0.inset(r2, r3, r4, r5)
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.core.view.WindowInsetsCompat inset(@androidx.annotation.NonNull androidx.core.graphics.Insets r4) {
            r3 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            androidx.core.view.WindowInsetsCompat r4 = r3.inset(r0, r1, r2, r4)
            return r4
    }

    public boolean isConsumed() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isConsumed()
            return r0
    }

    public boolean isRound() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isRound()
            return r0
    }

    public boolean isVisible(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r2 = r0.isVisible(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>(r1)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r2, r3, r4, r5)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r0.setSystemWindowInsets(r2)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            return r2
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>(r1)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r2)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r0.setSystemWindowInsets(r2)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            return r2
    }

    public final void setOverriddenInsets(androidx.core.graphics.Insets[] r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setOverriddenInsets(r2)
            return
    }

    public final void setRootViewData(@androidx.annotation.NonNull androidx.core.graphics.Insets r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setRootViewData(r2)
            return
    }

    public final void setRootWindowInsets(@androidx.annotation.Nullable androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setRootWindowInsets(r2)
            return
    }

    public final void setStableInsets(@androidx.annotation.Nullable androidx.core.graphics.Insets r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setStableInsets(r2)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(20)
    public android.view.WindowInsets toWindowInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl20
            if (r1 == 0) goto Lb
            androidx.core.view.WindowInsetsCompat$Impl20 r0 = (androidx.core.view.WindowInsetsCompat.Impl20) r0
            android.view.WindowInsets r0 = r0.mPlatformInsets
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }
}
