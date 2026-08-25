package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetDialog extends com.google.android.material.sidesheet.SheetDialog<com.google.android.material.sidesheet.SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = 0;
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = 0;


    static {
            int r0 = com.google.android.material.R.attr.sideSheetDialogTheme
            com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_THEME_ATTR = r0
            int r0 = com.google.android.material.R.style.Theme_Material3_Light_SideSheetDialog
            com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = r0
            return
    }

    public SideSheetDialog(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SideSheetDialog(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.StyleRes int r4) {
            r2 = this;
            int r0 = com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_THEME_ATTR
            int r1 = com.google.android.material.sidesheet.SideSheetDialog.SIDE_SHEET_DIALOG_DEFAULT_THEME_RES
            r2.<init>(r3, r4, r0, r1)
            r3 = 1
            r2.supportRequestWindowFeature(r3)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final void addSheetCancelOnHideCallback(com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> r2) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetDialog$1 r0 = new com.google.android.material.sidesheet.SideSheetDialog$1
            r0.<init>(r1)
            r2.addCallback(r0)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
            r0 = this;
            super.cancel()
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.android.material.sidesheet.Sheet getBehavior() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.getBehavior()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.NonNull
    public com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> getBehavior() {
            r2 = this;
            com.google.android.material.sidesheet.Sheet r0 = super.getBehavior()
            boolean r1 = r0 instanceof com.google.android.material.sidesheet.SideSheetBehavior
            if (r1 == 0) goto Lb
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The view is not associated with SideSheetBehavior"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.NonNull
    public final com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> getBehaviorFromSheet(@androidx.annotation.NonNull android.widget.FrameLayout r1) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r1 = com.google.android.material.sidesheet.SideSheetBehavior.from(r1)
            return r1
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.IdRes
    public final int getDialogId() {
            r1 = this;
            int r0 = com.google.android.material.R.id.m3_side_sheet
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @androidx.annotation.LayoutRes
    public final int getLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.m3_side_sheet_dialog
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final void getStateOnStart() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
            r1 = this;
            boolean r0 = super.isDismissWithSheetAnimationEnabled()
            return r0
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean r1) {
            r0 = this;
            super.setCancelable(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean r1) {
            r0 = this;
            super.setCanceledOnTouchOutside(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@androidx.annotation.LayoutRes int r1) {
            r0 = this;
            super.setContentView(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            super.setContentView(r1)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@androidx.annotation.Nullable android.view.View r1, @androidx.annotation.Nullable android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            super.setContentView(r1, r2)
            return
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean r1) {
            r0 = this;
            super.setDismissWithSheetAnimationEnabled(r1)
            return
    }
}
