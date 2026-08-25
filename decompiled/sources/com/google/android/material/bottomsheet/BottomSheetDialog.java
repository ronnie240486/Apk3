package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDialog extends androidx.appcompat.app.AppCompatDialog {
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> behavior;
    private android.widget.FrameLayout bottomSheet;

    @androidx.annotation.NonNull
    private com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    public boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private android.widget.FrameLayout container;
    private androidx.coordinatorlayout.widget.CoordinatorLayout coordinator;
    public boolean dismissWithAnimation;
    private com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;






    /* JADX INFO: loaded from: classes2.dex */
    public static class EdgeToEdgeCallback extends com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback {

        @androidx.annotation.NonNull
        private final androidx.core.view.WindowInsetsCompat insetsCompat;

        @androidx.annotation.Nullable
        private final java.lang.Boolean lightBottomSheet;
        private boolean lightStatusBar;

        @androidx.annotation.Nullable
        private android.view.Window window;

        private EdgeToEdgeCallback(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2) {
                r0 = this;
                r0.<init>()
                r0.insetsCompat = r2
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r1)
                com.google.android.material.shape.MaterialShapeDrawable r2 = r2.getMaterialShapeDrawable()
                if (r2 == 0) goto L14
                android.content.res.ColorStateList r2 = r2.getFillColor()
                goto L18
            L14:
                android.content.res.ColorStateList r2 = androidx.core.view.ViewCompat.getBackgroundTintList(r1)
            L18:
                if (r2 == 0) goto L29
                int r1 = r2.getDefaultColor()
                boolean r1 = com.google.android.material.color.MaterialColors.isColorLight(r1)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.lightBottomSheet = r1
                goto L49
            L29:
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
                if (r2 == 0) goto L46
                android.graphics.drawable.Drawable r1 = r1.getBackground()
                android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
                int r1 = r1.getColor()
                boolean r1 = com.google.android.material.color.MaterialColors.isColorLight(r1)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.lightBottomSheet = r1
                goto L49
            L46:
                r1 = 0
                r0.lightBottomSheet = r1
            L49:
                return
        }

        public /* synthetic */ EdgeToEdgeCallback(android.view.View r1, androidx.core.view.WindowInsetsCompat r2, com.google.android.material.bottomsheet.BottomSheetDialog.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void setPaddingForPosition(android.view.View r5) {
                r4 = this;
                int r0 = r5.getTop()
                androidx.core.view.WindowInsetsCompat r1 = r4.insetsCompat
                int r1 = r1.getSystemWindowInsetTop()
                if (r0 >= r1) goto L39
                android.view.Window r0 = r4.window
                if (r0 == 0) goto L1e
                java.lang.Boolean r1 = r4.lightBottomSheet
                if (r1 != 0) goto L17
                boolean r1 = r4.lightStatusBar
                goto L1b
            L17:
                boolean r1 = r1.booleanValue()
            L1b:
                com.google.android.material.internal.EdgeToEdgeUtils.setLightStatusBar(r0, r1)
            L1e:
                int r0 = r5.getPaddingLeft()
                androidx.core.view.WindowInsetsCompat r1 = r4.insetsCompat
                int r1 = r1.getSystemWindowInsetTop()
                int r2 = r5.getTop()
                int r1 = r1 - r2
                int r2 = r5.getPaddingRight()
                int r3 = r5.getPaddingBottom()
                r5.setPadding(r0, r1, r2, r3)
                goto L58
            L39:
                int r0 = r5.getTop()
                if (r0 == 0) goto L58
                android.view.Window r0 = r4.window
                if (r0 == 0) goto L48
                boolean r1 = r4.lightStatusBar
                com.google.android.material.internal.EdgeToEdgeUtils.setLightStatusBar(r0, r1)
            L48:
                int r0 = r5.getPaddingLeft()
                r1 = 0
                int r2 = r5.getPaddingRight()
                int r3 = r5.getPaddingBottom()
                r5.setPadding(r0, r1, r2, r3)
            L58:
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onLayout(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                r0.setPaddingForPosition(r1)
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@androidx.annotation.NonNull android.view.View r1, float r2) {
                r0 = this;
                r0.setPaddingForPosition(r1)
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@androidx.annotation.NonNull android.view.View r1, int r2) {
                r0 = this;
                r0.setPaddingForPosition(r1)
                return
        }

        public final void setWindow(@androidx.annotation.Nullable android.view.Window r2) {
                r1 = this;
                android.view.Window r0 = r1.window
                if (r0 != r2) goto L5
                return
            L5:
                r1.window = r2
                if (r2 == 0) goto L17
                android.view.View r0 = r2.getDecorView()
                androidx.core.view.WindowInsetsControllerCompat r2 = androidx.core.view.WindowCompat.getInsetsController(r2, r0)
                boolean r2 = r2.isAppearanceLightStatusBars()
                r1.lightStatusBar = r2
            L17:
                return
        }
    }

    public BottomSheetDialog(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r1 = 1
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.R.attr.enableEdgeToEdge
            r1[r0] = r2
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1)
            boolean r4 = r4.getBoolean(r0, r0)
            r3.edgeToEdgeEnabled = r4
            return
    }

    public BottomSheetDialog(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.StyleRes int r4) {
            r2 = this;
            int r4 = getThemeResId(r3, r4)
            r2.<init>(r3, r4)
            r3 = 1
            r2.cancelable = r3
            r2.canceledOnTouchOutside = r3
            com.google.android.material.bottomsheet.BottomSheetDialog$5 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$5
            r4.<init>(r2)
            r2.bottomSheetCallback = r4
            r2.supportRequestWindowFeature(r3)
            android.content.Context r4 = r2.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r3 = new int[r3]
            int r0 = com.google.android.material.R.attr.enableEdgeToEdge
            r1 = 0
            r3[r1] = r0
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r3)
            boolean r3 = r3.getBoolean(r1, r1)
            r2.edgeToEdgeEnabled = r3
            return
    }

    public static /* synthetic */ com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback access$000(com.google.android.material.bottomsheet.BottomSheetDialog r0) {
            com.google.android.material.bottomsheet.BottomSheetDialog$EdgeToEdgeCallback r0 = r0.edgeToEdgeCallback
            return r0
    }

    public static /* synthetic */ com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback access$002(com.google.android.material.bottomsheet.BottomSheetDialog r0, com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback r1) {
            r0.edgeToEdgeCallback = r1
            return r1
    }

    public static /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior access$100(com.google.android.material.bottomsheet.BottomSheetDialog r0) {
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r0.behavior
            return r0
    }

    public static /* synthetic */ android.widget.FrameLayout access$200(com.google.android.material.bottomsheet.BottomSheetDialog r0) {
            android.widget.FrameLayout r0 = r0.bottomSheet
            return r0
    }

    private android.widget.FrameLayout ensureContainerAndBehavior() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.container
            if (r0 != 0) goto L3b
            android.content.Context r0 = r3.getContext()
            int r1 = com.google.android.material.R.layout.design_bottom_sheet_dialog
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.container = r0
            int r1 = com.google.android.material.R.id.coordinator
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r3.coordinator = r0
            android.widget.FrameLayout r0 = r3.container
            int r1 = com.google.android.material.R.id.design_bottom_sheet
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.bottomSheet = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r0)
            r3.behavior = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = r3.bottomSheetCallback
            r0.addBottomSheetCallback(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r3.behavior
            boolean r1 = r3.cancelable
            r0.setHideable(r1)
        L3b:
            android.widget.FrameLayout r0 = r3.container
            return r0
    }

    private static int getThemeResId(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            if (r3 != 0) goto L19
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = com.google.android.material.R.attr.bottomSheetDialogTheme
            r1 = 1
            boolean r2 = r2.resolveAttribute(r0, r3, r1)
            if (r2 == 0) goto L17
            int r3 = r3.resourceId
            goto L19
        L17:
            int r3 = com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog
        L19:
            return r3
    }

    @java.lang.Deprecated
    public static void setLightStatusBar(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L14
            int r0 = r2.getSystemUiVisibility()
            if (r3 == 0) goto Lf
            r3 = r0 | 8192(0x2000, float:1.148E-41)
            goto L11
        Lf:
            r3 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
        L11:
            r2.setSystemUiVisibility(r3)
        L14:
            return
    }

    private android.view.View wrapInBottomSheet(int r3, @androidx.annotation.Nullable android.view.View r4, @androidx.annotation.Nullable android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r2.ensureContainerAndBehavior()
            android.widget.FrameLayout r0 = r2.container
            int r1 = com.google.android.material.R.id.coordinator
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            if (r3 == 0) goto L1a
            if (r4 != 0) goto L1a
            android.view.LayoutInflater r4 = r2.getLayoutInflater()
            r1 = 0
            android.view.View r4 = r4.inflate(r3, r0, r1)
        L1a:
            boolean r3 = r2.edgeToEdgeEnabled
            if (r3 == 0) goto L28
            android.widget.FrameLayout r3 = r2.bottomSheet
            com.google.android.material.bottomsheet.BottomSheetDialog$1 r1 = new com.google.android.material.bottomsheet.BottomSheetDialog$1
            r1.<init>(r2)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r3, r1)
        L28:
            android.widget.FrameLayout r3 = r2.bottomSheet
            r3.removeAllViews()
            if (r5 != 0) goto L35
            android.widget.FrameLayout r3 = r2.bottomSheet
            r3.addView(r4)
            goto L3a
        L35:
            android.widget.FrameLayout r3 = r2.bottomSheet
            r3.addView(r4, r5)
        L3a:
            int r3 = com.google.android.material.R.id.touch_outside
            android.view.View r3 = r0.findViewById(r3)
            com.google.android.material.bottomsheet.BottomSheetDialog$2 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$2
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.widget.FrameLayout r3 = r2.bottomSheet
            com.google.android.material.bottomsheet.BottomSheetDialog$3 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$3
            r4.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r4)
            android.widget.FrameLayout r3 = r2.bottomSheet
            com.google.android.material.bottomsheet.BottomSheetDialog$4 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$4
            r4.<init>()
            r3.setOnTouchListener(r4)
            android.widget.FrameLayout r3 = r2.container
            return r3
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
            r3 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.getBehavior()
            boolean r1 = r3.dismissWithAnimation
            if (r1 == 0) goto L14
            int r1 = r0.getState()
            r2 = 5
            if (r1 != r2) goto L10
            goto L14
        L10:
            r0.setState(r2)
            goto L17
        L14:
            super.cancel()
        L17:
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> getBehavior() {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.behavior
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.behavior
            return r0
    }

    public boolean getDismissWithAnimation() {
            r1 = this;
            boolean r0 = r1.dismissWithAnimation
            return r0
    }

    public boolean getEdgeToEdgeEnabled() {
            r1 = this;
            boolean r0 = r1.edgeToEdgeEnabled
            return r0
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L3a
            boolean r1 = r5.edgeToEdgeEnabled
            r2 = 1
            if (r1 == 0) goto L1c
            int r1 = r0.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 >= r3) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            android.widget.FrameLayout r3 = r5.container
            if (r3 == 0) goto L26
            r4 = r1 ^ 1
            r3.setFitsSystemWindows(r4)
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = r5.coordinator
            if (r3 == 0) goto L2f
            r4 = r1 ^ 1
            r3.setFitsSystemWindows(r4)
        L2f:
            r1 = r1 ^ r2
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r0, r1)
            com.google.android.material.bottomsheet.BottomSheetDialog$EdgeToEdgeCallback r1 = r5.edgeToEdgeCallback
            if (r1 == 0) goto L3a
            r1.setWindow(r0)
        L3a:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r3.setStatusBarColor(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r1)
            r1 = 23
            if (r0 >= r1) goto L1d
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r0)
        L1d:
            r0 = -1
            r3.setLayout(r0, r0)
        L21:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetDialog$EdgeToEdgeCallback r0 = r2.edgeToEdgeCallback
            if (r0 == 0) goto L8
            r1 = 0
            r0.setWindow(r1)
        L8:
            return
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r2.behavior
            if (r0 == 0) goto L14
            int r0 = r0.getState()
            r1 = 5
            if (r0 != r1) goto L14
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r2.behavior
            r1 = 4
            r0.setState(r1)
        L14:
            return
    }

    public final void removeDefaultCallback() {
            r2 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r2.behavior
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = r2.bottomSheetCallback
            r0.removeBottomSheetCallback(r1)
            return
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean r2) {
            r1 = this;
            super.setCancelable(r2)
            boolean r0 = r1.cancelable
            if (r0 == r2) goto L10
            r1.cancelable = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r1.behavior
            if (r0 == 0) goto L10
            r0.setHideable(r2)
        L10:
            return
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean r3) {
            r2 = this;
            super.setCanceledOnTouchOutside(r3)
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = r2.cancelable
            if (r1 != 0) goto Lc
            r2.cancelable = r0
        Lc:
            r2.canceledOnTouchOutside = r3
            r2.canceledOnTouchOutsideSet = r0
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@androidx.annotation.LayoutRes int r2) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInBottomSheet(r2, r0, r0)
            super.setContentView(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            android.view.View r3 = r2.wrapInBottomSheet(r0, r3, r1)
            super.setContentView(r3)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInBottomSheet(r0, r2, r3)
            super.setContentView(r2)
            return
    }

    public void setDismissWithAnimation(boolean r1) {
            r0 = this;
            r0.dismissWithAnimation = r1
            return
    }

    public final boolean shouldWindowCloseOnTouchOutside() {
            r5 = this;
            boolean r0 = r5.canceledOnTouchOutsideSet
            if (r0 != 0) goto L20
            android.content.Context r0 = r5.getContext()
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 16843611(0x101035b, float:2.3695965E-38)
            r4 = 0
            r2[r4] = r3
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            boolean r2 = r0.getBoolean(r4, r1)
            r5.canceledOnTouchOutside = r2
            r0.recycle()
            r5.canceledOnTouchOutsideSet = r1
        L20:
            boolean r0 = r5.canceledOnTouchOutside
            return r0
    }
}
