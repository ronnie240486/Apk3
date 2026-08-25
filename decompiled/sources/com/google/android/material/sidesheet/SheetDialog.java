package com.google.android.material.sidesheet;

import com.google.android.material.sidesheet.SheetCallback;

/* JADX INFO: loaded from: classes.dex */
abstract class SheetDialog<C extends com.google.android.material.sidesheet.SheetCallback> extends androidx.appcompat.app.AppCompatDialog {
    private static final int COORDINATOR_LAYOUT_ID = 0;
    private static final int TOUCH_OUTSIDE_ID = 0;

    @androidx.annotation.Nullable
    private com.google.android.material.sidesheet.Sheet<C> behavior;
    public boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;

    @androidx.annotation.Nullable
    private android.widget.FrameLayout container;
    public boolean dismissWithAnimation;

    @androidx.annotation.Nullable
    private android.widget.FrameLayout sheet;


    public static /* synthetic */ void $r8$lambda$VGnGVLSseC7TxVJ3rWV_WOd4ps0(com.google.android.material.sidesheet.SheetDialog r0, android.view.View r1) {
            r0.lambda$wrapInSheet$0(r1)
            return
    }

    static {
            int r0 = com.google.android.material.R.id.coordinator
            com.google.android.material.sidesheet.SheetDialog.COORDINATOR_LAYOUT_ID = r0
            int r0 = com.google.android.material.R.id.touch_outside
            com.google.android.material.sidesheet.SheetDialog.TOUCH_OUTSIDE_ID = r0
            return
    }

    public SheetDialog(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.StyleRes int r2, @androidx.annotation.AttrRes int r3, @androidx.annotation.StyleRes int r4) {
            r0 = this;
            int r2 = getThemeResId(r1, r2, r3, r4)
            r0.<init>(r1, r2)
            r1 = 1
            r0.cancelable = r1
            r0.canceledOnTouchOutside = r1
            r0.supportRequestWindowFeature(r1)
            return
    }

    private void ensureContainerAndBehavior() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.container
            if (r0 != 0) goto L2a
            android.content.Context r0 = r3.getContext()
            int r1 = r3.getLayoutResId()
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.container = r0
            int r1 = r3.getDialogId()
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.sheet = r0
            com.google.android.material.sidesheet.Sheet r0 = r3.getBehaviorFromSheet(r0)
            r3.behavior = r0
            r3.addSheetCancelOnHideCallback(r0)
        L2a:
            return
    }

    @androidx.annotation.NonNull
    private android.widget.FrameLayout getContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.container
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            android.widget.FrameLayout r0 = r1.container
            return r0
    }

    @androidx.annotation.NonNull
    private android.widget.FrameLayout getSheet() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.sheet
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            android.widget.FrameLayout r0 = r1.sheet
            return r0
    }

    private static int getThemeResId(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.StyleRes int r2, @androidx.annotation.AttrRes int r3, @androidx.annotation.StyleRes int r4) {
            if (r2 != 0) goto L16
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r0 = 1
            boolean r1 = r1.resolveAttribute(r3, r2, r0)
            if (r1 == 0) goto L15
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r4
        L16:
            return r2
    }

    private /* synthetic */ void lambda$wrapInSheet$0(android.view.View r1) {
            r0 = this;
            boolean r1 = r0.cancelable
            if (r1 == 0) goto L13
            boolean r1 = r0.isShowing()
            if (r1 == 0) goto L13
            boolean r1 = r0.shouldWindowCloseOnTouchOutside()
            if (r1 == 0) goto L13
            r0.cancel()
        L13:
            return
    }

    private boolean shouldWindowCloseOnTouchOutside() {
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

    private android.view.View wrapInSheet(int r3, @androidx.annotation.Nullable android.view.View r4, @androidx.annotation.Nullable android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r2.ensureContainerAndBehavior()
            android.widget.FrameLayout r0 = r2.getContainer()
            int r1 = com.google.android.material.sidesheet.SheetDialog.COORDINATOR_LAYOUT_ID
            android.view.View r0 = r0.findViewById(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            if (r3 == 0) goto L1c
            if (r4 != 0) goto L1c
            android.view.LayoutInflater r4 = r2.getLayoutInflater()
            r1 = 0
            android.view.View r4 = r4.inflate(r3, r0, r1)
        L1c:
            android.widget.FrameLayout r3 = r2.getSheet()
            r3.removeAllViews()
            if (r5 != 0) goto L29
            r3.addView(r4)
            goto L2c
        L29:
            r3.addView(r4, r5)
        L2c:
            int r3 = com.google.android.material.sidesheet.SheetDialog.TOUCH_OUTSIDE_ID
            android.view.View r3 = r0.findViewById(r3)
            com.google.android.material.sidesheet.SheetDialog$$ExternalSyntheticLambda0 r4 = new com.google.android.material.sidesheet.SheetDialog$$ExternalSyntheticLambda0
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.widget.FrameLayout r3 = r2.getSheet()
            com.google.android.material.sidesheet.SheetDialog$1 r4 = new com.google.android.material.sidesheet.SheetDialog$1
            r4.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r4)
            android.widget.FrameLayout r3 = r2.container
            return r3
    }

    public abstract void addSheetCancelOnHideCallback(com.google.android.material.sidesheet.Sheet<C> r1);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
            r3 = this;
            com.google.android.material.sidesheet.Sheet r0 = r3.getBehavior()
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
    public com.google.android.material.sidesheet.Sheet<C> getBehavior() {
            r1 = this;
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r1.behavior
            if (r0 != 0) goto L7
            r1.ensureContainerAndBehavior()
        L7:
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r1.behavior
            return r0
    }

    @androidx.annotation.NonNull
    public abstract com.google.android.material.sidesheet.Sheet<C> getBehaviorFromSheet(@androidx.annotation.NonNull android.widget.FrameLayout r1);

    @androidx.annotation.IdRes
    public abstract int getDialogId();

    @androidx.annotation.LayoutRes
    public abstract int getLayoutResId();

    public abstract void getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
            r1 = this;
            boolean r0 = r1.dismissWithAnimation
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@androidx.annotation.Nullable android.os.Bundle r3) {
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

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r2.behavior
            if (r0 == 0) goto L17
            int r0 = r0.getState()
            r1 = 5
            if (r0 != r1) goto L17
            com.google.android.material.sidesheet.Sheet<C extends com.google.android.material.sidesheet.SheetCallback> r0 = r2.behavior
            r2.getStateOnStart()
            r1 = 3
            r0.setState(r1)
        L17:
            return
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean r2) {
            r1 = this;
            super.setCancelable(r2)
            boolean r0 = r1.cancelable
            if (r0 == r2) goto L9
            r1.cancelable = r2
        L9:
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
            android.view.View r2 = r1.wrapInSheet(r2, r0, r0)
            super.setContentView(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@androidx.annotation.Nullable android.view.View r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            android.view.View r3 = r2.wrapInSheet(r0, r3, r1)
            super.setContentView(r3)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@androidx.annotation.Nullable android.view.View r2, @androidx.annotation.Nullable android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.wrapInSheet(r0, r2, r3)
            super.setContentView(r2)
            return
    }

    public void setDismissWithSheetAnimationEnabled(boolean r1) {
            r0 = this;
            r0.dismissWithAnimation = r1
            return
    }
}
