package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public class ErrorDialogFragment extends android.app.DialogFragment {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;

    @androidx.annotation.Nullable
    private android.app.Dialog zac;

    public ErrorDialogFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.ErrorDialogFragment newInstance(@androidx.annotation.NonNull android.app.Dialog r1) {
            r0 = 0
            com.google.android.gms.common.ErrorDialogFragment r1 = newInstance(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.ErrorDialogFragment newInstance(@androidx.annotation.NonNull android.app.Dialog r2, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r3) {
            com.google.android.gms.common.ErrorDialogFragment r0 = new com.google.android.gms.common.ErrorDialogFragment
            r0.<init>()
            java.lang.String r1 = "Cannot display null dialog"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            r2.setOnCancelListener(r1)
            r2.setOnDismissListener(r1)
            r0.zaa = r2
            if (r3 == 0) goto L1a
            r0.zab = r3
        L1a:
            return r0
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.NonNull android.content.DialogInterface r2) {
            r1 = this;
            android.content.DialogInterface$OnCancelListener r0 = r1.zab
            if (r0 == 0) goto L7
            r0.onCancel(r2)
        L7:
            return
    }

    @Override // android.app.DialogFragment
    @androidx.annotation.NonNull
    public android.app.Dialog onCreateDialog(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = r1.zaa
            if (r2 != 0) goto L23
            r2 = 0
            r1.setShowsDialog(r2)
            android.app.Dialog r2 = r1.zac
            if (r2 != 0) goto L21
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.app.Activity r0 = r1.getActivity()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.Context r0 = (android.content.Context) r0
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            r1.zac = r2
        L21:
            android.app.Dialog r2 = r1.zac
        L23:
            return r2
    }

    @Override // android.app.DialogFragment
    public void show(@androidx.annotation.NonNull android.app.FragmentManager r1, @androidx.annotation.Nullable java.lang.String r2) {
            r0 = this;
            super.show(r1, r2)
            return
    }
}
