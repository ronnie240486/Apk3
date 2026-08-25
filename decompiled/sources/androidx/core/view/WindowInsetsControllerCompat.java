package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final androidx.core.view.WindowInsetsControllerCompat.Impl mImpl;

    /* JADX INFO: loaded from: classes.dex */
    public static class Impl {
        public Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        public void controlWindowInsetsAnimation(int r1, long r2, android.view.animation.Interpolator r4, android.os.CancellationSignal r5, androidx.core.view.WindowInsetsAnimationControlListenerCompat r6) {
                r0 = this;
                return
        }

        public int getSystemBarsBehavior() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void hide(int r1) {
                r0 = this;
                return
        }

        public boolean isAppearanceLightNavigationBars() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isAppearanceLightStatusBars() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void removeOnControllableInsetsChangedListener(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        public void setAppearanceLightNavigationBars(boolean r1) {
                r0 = this;
                return
        }

        public void setAppearanceLightStatusBars(boolean r1) {
                r0 = this;
                return
        }

        public void setSystemBarsBehavior(int r1) {
                r0 = this;
                return
        }

        public void show(int r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(20)
    public static class Impl20 extends androidx.core.view.WindowInsetsControllerCompat.Impl {

        @androidx.annotation.NonNull
        private final android.view.View mView;

        @androidx.annotation.NonNull
        public final android.view.Window mWindow;

        public static /* synthetic */ void $r8$lambda$pAhi3kcyEfefAOVk6cMro6TSEfc(android.view.View r0) {
                lambda$showForType$0(r0)
                return
        }

        public Impl20(@androidx.annotation.NonNull android.view.Window r1, @androidx.annotation.NonNull android.view.View r2) {
                r0 = this;
                r0.<init>()
                r0.mWindow = r1
                r0.mView = r2
                return
        }

        private void hideForType(int r3) {
                r2 = this;
                r0 = 1
                if (r3 == r0) goto L2c
                r0 = 2
                if (r3 == r0) goto L28
                r0 = 8
                if (r3 == r0) goto Lb
                goto L27
            Lb:
                android.view.Window r3 = r2.mWindow
                android.content.Context r3 = r3.getContext()
                java.lang.String r0 = "input_method"
                java.lang.Object r3 = r3.getSystemService(r0)
                android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                android.os.IBinder r0 = r0.getWindowToken()
                r1 = 0
                r3.hideSoftInputFromWindow(r0, r1)
            L27:
                return
            L28:
                r2.setSystemUiFlag(r0)
                return
            L2c:
                r3 = 4
                r2.setSystemUiFlag(r3)
                return
        }

        private static /* synthetic */ void lambda$showForType$0(android.view.View r2) {
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                return
        }

        private void showForType(int r3) {
                r2 = this;
                r0 = 1
                if (r3 == r0) goto L44
                r1 = 2
                if (r3 == r1) goto L40
                r1 = 8
                if (r3 == r1) goto Lb
                goto L3f
            Lb:
                android.view.View r3 = r2.mView
                boolean r1 = r3.isInEditMode()
                if (r1 != 0) goto L21
                boolean r1 = r3.onCheckIsTextEditor()
                if (r1 == 0) goto L1a
                goto L21
            L1a:
                android.view.Window r3 = r2.mWindow
                android.view.View r3 = r3.getCurrentFocus()
                goto L24
            L21:
                r3.requestFocus()
            L24:
                if (r3 != 0) goto L2f
                android.view.Window r3 = r2.mWindow
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r3 = r3.findViewById(r1)
            L2f:
                if (r3 == 0) goto L3f
                boolean r1 = r3.hasWindowFocus()
                if (r1 == 0) goto L3f
                androidx.core.view.ViewKt$$ExternalSyntheticLambda0 r1 = new androidx.core.view.ViewKt$$ExternalSyntheticLambda0
                r1.<init>(r3, r0)
                r3.post(r1)
            L3f:
                return
            L40:
                r2.unsetSystemUiFlag(r1)
                return
            L44:
                r3 = 4
                r2.unsetSystemUiFlag(r3)
                r3 = 1024(0x400, float:1.435E-42)
                r2.unsetWindowFlag(r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void controlWindowInsetsAnimation(int r1, long r2, android.view.animation.Interpolator r4, android.os.CancellationSignal r5, androidx.core.view.WindowInsetsAnimationControlListenerCompat r6) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final int getSystemBarsBehavior() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void hide(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L10
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto Ld
            La:
                r2.hideForType(r0)
            Ld:
                int r0 = r0 << 1
                goto L1
            L10:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void removeOnControllableInsetsChangedListener(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void setSystemBarsBehavior(int r4) {
                r3 = this;
                if (r4 == 0) goto L1b
                r0 = 1
                r1 = 2048(0x800, float:2.87E-42)
                r2 = 4096(0x1000, float:5.74E-42)
                if (r4 == r0) goto L14
                r0 = 2
                if (r4 == r0) goto Ld
                goto L20
            Ld:
                r3.unsetSystemUiFlag(r1)
                r3.setSystemUiFlag(r2)
                goto L20
            L14:
                r3.unsetSystemUiFlag(r2)
                r3.setSystemUiFlag(r1)
                goto L20
            L1b:
                r4 = 6144(0x1800, float:8.61E-42)
                r3.unsetSystemUiFlag(r4)
            L20:
                return
        }

        public final void setSystemUiFlag(int r3) {
                r2 = this;
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                r3 = r3 | r1
                r0.setSystemUiVisibility(r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void show(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L10
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto Ld
            La:
                r2.showForType(r0)
            Ld:
                int r0 = r0 << 1
                goto L1
            L10:
                return
        }

        public final void unsetSystemUiFlag(int r3) {
                r2 = this;
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                int r3 = ~r3
                r3 = r3 & r1
                r0.setSystemUiVisibility(r3)
                return
        }

        public final void unsetWindowFlag(int r2) {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                r0.clearFlags(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Impl23 extends androidx.core.view.WindowInsetsControllerCompat.Impl20 {
        public Impl23(@androidx.annotation.NonNull android.view.Window r1, @androidx.annotation.Nullable android.view.View r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                android.view.View r0 = r0.getDecorView()
                int r0 = r0.getSystemUiVisibility()
                r0 = r0 & 8192(0x2000, float:1.148E-41)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean r3) {
                r2 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                if (r3 == 0) goto L14
                r3 = 67108864(0x4000000, float:1.5046328E-36)
                r2.unsetWindowFlag(r3)
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                android.view.Window r1 = r2.mWindow
                r1.addFlags(r3)
                r2.setSystemUiFlag(r0)
                goto L17
            L14:
                r2.unsetSystemUiFlag(r0)
            L17:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Impl26 extends androidx.core.view.WindowInsetsControllerCompat.Impl23 {
        public Impl26(@androidx.annotation.NonNull android.view.Window r1, @androidx.annotation.Nullable android.view.View r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                android.view.View r0 = r0.getDecorView()
                int r0 = r0.getSystemUiVisibility()
                r0 = r0 & 16
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean r3) {
                r2 = this;
                r0 = 16
                if (r3 == 0) goto L14
                r3 = 134217728(0x8000000, float:3.85186E-34)
                r2.unsetWindowFlag(r3)
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                android.view.Window r1 = r2.mWindow
                r1.addFlags(r3)
                r2.setSystemUiFlag(r0)
                goto L17
            L14:
                r2.unsetSystemUiFlag(r0)
            L17:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Impl30 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        public final androidx.core.view.WindowInsetsControllerCompat mCompatController;
        public final android.view.WindowInsetsController mInsetsController;
        private final androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener, android.view.WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        public android.view.Window mWindow;


        public static /* synthetic */ void $r8$lambda$cdZqTFRvo8KSnFk5DhCaM1suM5Y(androidx.core.view.WindowInsetsControllerCompat.Impl30 r0, androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1, android.view.WindowInsetsController r2, int r3) {
                r0.lambda$addOnControllableInsetsChangedListener$0(r1, r2, r3)
                return
        }

        public Impl30(@androidx.annotation.NonNull android.view.Window r3, @androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat r4) {
                r2 = this;
                android.view.WindowInsetsController r0 = r3.getInsetsController()
                r2.<init>()
                androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
                r1.<init>()
                r2.mListeners = r1
                r2.mInsetsController = r0
                r2.mCompatController = r4
                r2.mWindow = r3
                return
        }

        public Impl30(@androidx.annotation.NonNull android.view.WindowInsetsController r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat r3) {
                r1 = this;
                r1.<init>()
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                r1.mListeners = r0
                r1.mInsetsController = r2
                r1.mCompatController = r3
                return
        }

        private /* synthetic */ void lambda$addOnControllableInsetsChangedListener$0(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2, android.view.WindowInsetsController r3, int r4) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                if (r0 != r3) goto L9
                androidx.core.view.WindowInsetsControllerCompat r3 = r1.mCompatController
                r2.onControllableInsetsChanged(r3, r4)
            L9:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void addOnControllableInsetsChangedListener(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r3) {
                r2 = this;
                androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r0 = r2.mListeners
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L9
                return
            L9:
                androidx.core.view.WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0
                r0.<init>(r2, r3)
                androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r1 = r2.mListeners
                r1.put(r3, r0)
                android.view.WindowInsetsController r3 = r2.mInsetsController
                r3.addOnControllableInsetsChangedListener(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void controlWindowInsetsAnimation(int r8, long r9, @androidx.annotation.Nullable android.view.animation.Interpolator r11, @androidx.annotation.Nullable android.os.CancellationSignal r12, @androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationControlListenerCompat r13) {
                r7 = this;
                androidx.core.view.WindowInsetsControllerCompat$Impl30$1 r6 = new androidx.core.view.WindowInsetsControllerCompat$Impl30$1
                r6.<init>(r13)
                android.view.WindowInsetsController r0 = r7.mInsetsController
                r1 = r8
                r2 = r9
                r4 = r11
                r5 = r12
                r0.controlWindowInsetsAnimation(r1, r2, r4, r5, r6)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        @android.annotation.SuppressLint({"WrongConstant"})
        public final int getSystemBarsBehavior() {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                int r0 = r0.getSystemBarsBehavior()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void hide(int r2) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r0.hide(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                int r0 = r0.getSystemBarsAppearance()
                r0 = r0 & 16
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                int r0 = r0.getSystemBarsAppearance()
                r0 = r0 & 8
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void removeOnControllableInsetsChangedListener(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2) {
                r1 = this;
                androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r0 = r1.mListeners
                java.lang.Object r2 = r0.remove(r2)
                android.view.WindowInsetsController$OnControllableInsetsChangedListener r2 = (android.view.WindowInsetsController.OnControllableInsetsChangedListener) r2
                if (r2 == 0) goto Lf
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r0.removeOnControllableInsetsChangedListener(r2)
            Lf:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean r4) {
                r3 = this;
                r0 = 16
                if (r4 == 0) goto L1a
                android.view.Window r4 = r3.mWindow
                if (r4 == 0) goto L14
                android.view.View r4 = r4.getDecorView()
                int r1 = r4.getSystemUiVisibility()
                r1 = r1 | r0
                r4.setSystemUiVisibility(r1)
            L14:
                android.view.WindowInsetsController r4 = r3.mInsetsController
                r4.setSystemBarsAppearance(r0, r0)
                goto L32
            L1a:
                android.view.Window r4 = r3.mWindow
                if (r4 == 0) goto L2c
                android.view.View r4 = r4.getDecorView()
                int r1 = r4.getSystemUiVisibility()
                r2 = -17
                r1 = r1 & r2
                r4.setSystemUiVisibility(r1)
            L2c:
                android.view.WindowInsetsController r4 = r3.mInsetsController
                r1 = 0
                r4.setSystemBarsAppearance(r1, r0)
            L32:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean r4) {
                r3 = this;
                r0 = 8
                if (r4 == 0) goto L1c
                android.view.Window r4 = r3.mWindow
                if (r4 == 0) goto L16
                r1 = 8192(0x2000, float:1.148E-41)
                android.view.View r4 = r4.getDecorView()
                int r2 = r4.getSystemUiVisibility()
                r1 = r1 | r2
                r4.setSystemUiVisibility(r1)
            L16:
                android.view.WindowInsetsController r4 = r3.mInsetsController
                r4.setSystemBarsAppearance(r0, r0)
                goto L34
            L1c:
                android.view.Window r4 = r3.mWindow
                if (r4 == 0) goto L2e
                android.view.View r4 = r4.getDecorView()
                int r1 = r4.getSystemUiVisibility()
                r2 = -8193(0xffffffffffffdfff, float:NaN)
                r1 = r1 & r2
                r4.setSystemUiVisibility(r1)
            L2e:
                android.view.WindowInsetsController r4 = r3.mInsetsController
                r1 = 0
                r4.setSystemBarsAppearance(r1, r0)
            L34:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void setSystemBarsBehavior(int r2) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r0.setSystemBarsBehavior(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void show(int r4) {
                r3 = this;
                android.view.Window r0 = r3.mWindow
                if (r0 == 0) goto L1d
                r1 = r4 & 8
                if (r1 == 0) goto L1d
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 32
                if (r1 >= r2) goto L1d
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r0.isActive()
            L1d:
                android.view.WindowInsetsController r0 = r3.mInsetsController
                r0.show(r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat r1, int r2);
    }

    public WindowInsetsControllerCompat(@androidx.annotation.NonNull android.view.Window r3, @androidx.annotation.NonNull android.view.View r4) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.WindowInsetsControllerCompat$Impl30 r4 = new androidx.core.view.WindowInsetsControllerCompat$Impl30
            r4.<init>(r3, r2)
            r2.mImpl = r4
            goto L30
        L11:
            r1 = 26
            if (r0 < r1) goto L1d
            androidx.core.view.WindowInsetsControllerCompat$Impl26 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl26
            r0.<init>(r3, r4)
            r2.mImpl = r0
            goto L30
        L1d:
            r1 = 23
            if (r0 < r1) goto L29
            androidx.core.view.WindowInsetsControllerCompat$Impl23 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl23
            r0.<init>(r3, r4)
            r2.mImpl = r0
            goto L30
        L29:
            androidx.core.view.WindowInsetsControllerCompat$Impl20 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl20
            r0.<init>(r3, r4)
            r2.mImpl = r0
        L30:
            return
    }

    @androidx.annotation.RequiresApi(30)
    @java.lang.Deprecated
    private WindowInsetsControllerCompat(@androidx.annotation.NonNull android.view.WindowInsetsController r2) {
            r1 = this;
            r1.<init>()
            androidx.core.view.WindowInsetsControllerCompat$Impl30 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl30
            r0.<init>(r2, r1)
            r1.mImpl = r0
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(30)
    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat toWindowInsetsControllerCompat(@androidx.annotation.NonNull android.view.WindowInsetsController r1) {
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r1)
            return r0
    }

    public void addOnControllableInsetsChangedListener(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.addOnControllableInsetsChangedListener(r2)
            return
    }

    public void controlWindowInsetsAnimation(int r8, long r9, @androidx.annotation.Nullable android.view.animation.Interpolator r11, @androidx.annotation.Nullable android.os.CancellationSignal r12, @androidx.annotation.NonNull androidx.core.view.WindowInsetsAnimationControlListenerCompat r13) {
            r7 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r7.mImpl
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.controlWindowInsetsAnimation(r1, r2, r4, r5, r6)
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            int r0 = r0.getSystemBarsBehavior()
            return r0
    }

    public void hide(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.hide(r2)
            return
    }

    public boolean isAppearanceLightNavigationBars() {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isAppearanceLightNavigationBars()
            return r0
    }

    public boolean isAppearanceLightStatusBars() {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isAppearanceLightStatusBars()
            return r0
    }

    public void removeOnControllableInsetsChangedListener(@androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.removeOnControllableInsetsChangedListener(r2)
            return
    }

    public void setAppearanceLightNavigationBars(boolean r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.setAppearanceLightNavigationBars(r2)
            return
    }

    public void setAppearanceLightStatusBars(boolean r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.setAppearanceLightStatusBars(r2)
            return
    }

    public void setSystemBarsBehavior(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.setSystemBarsBehavior(r2)
            return
    }

    public void show(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.show(r2)
            return
    }
}
