package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends androidx.appcompat.app.AppCompatDialog {
    public final androidx.appcompat.app.AlertController mAlert;

    public static class Builder {
        private final androidx.appcompat.app.AlertController.AlertParams P;
        private final int mTheme;

        public Builder(@androidx.annotation.NonNull android.content.Context r2) {
                r1 = this;
                r0 = 0
                int r0 = androidx.appcompat.app.AlertDialog.resolveDialogTheme(r2, r0)
                r1.<init>(r2, r0)
                return
        }

        public Builder(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.StyleRes int r5) {
                r3 = this;
                r3.<init>()
                androidx.appcompat.app.AlertController$AlertParams r0 = new androidx.appcompat.app.AlertController$AlertParams
                android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
                int r2 = androidx.appcompat.app.AlertDialog.resolveDialogTheme(r4, r5)
                r1.<init>(r4, r2)
                r0.<init>(r1)
                r3.P = r0
                r3.mTheme = r5
                return
        }

        @androidx.annotation.NonNull
        public androidx.appcompat.app.AlertDialog create() {
                r3 = this;
                androidx.appcompat.app.AlertDialog r0 = new androidx.appcompat.app.AlertDialog
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                android.content.Context r1 = r1.mContext
                int r2 = r3.mTheme
                r0.<init>(r1, r2)
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                androidx.appcompat.app.AlertController r2 = r0.mAlert
                r1.apply(r2)
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                boolean r1 = r1.mCancelable
                r0.setCancelable(r1)
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                boolean r1 = r1.mCancelable
                if (r1 == 0) goto L23
                r1 = 1
                r0.setCanceledOnTouchOutside(r1)
            L23:
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                android.content.DialogInterface$OnCancelListener r1 = r1.mOnCancelListener
                r0.setOnCancelListener(r1)
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                android.content.DialogInterface$OnDismissListener r1 = r1.mOnDismissListener
                r0.setOnDismissListener(r1)
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                android.content.DialogInterface$OnKeyListener r1 = r1.mOnKeyListener
                if (r1 == 0) goto L3a
                r0.setOnKeyListener(r1)
            L3a:
                return r0
        }

        @androidx.annotation.NonNull
        public android.content.Context getContext() {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                android.content.Context r0 = r0.mContext
                return r0
        }

        public androidx.appcompat.app.AlertDialog.Builder setAdapter(android.widget.ListAdapter r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mAdapter = r2
                r0.mOnClickListener = r3
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setCancelable(boolean r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mCancelable = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setCursor(android.database.Cursor r2, android.content.DialogInterface.OnClickListener r3, java.lang.String r4) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mCursor = r2
                r0.mLabelColumn = r4
                r0.mOnClickListener = r3
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setCustomTitle(@androidx.annotation.Nullable android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mCustomTitleView = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setIcon(@androidx.annotation.DrawableRes int r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mIconId = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mIcon = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setIconAttribute(@androidx.annotation.AttrRes int r4) {
                r3 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                androidx.appcompat.app.AlertController$AlertParams r1 = r3.P
                android.content.Context r1 = r1.mContext
                android.content.res.Resources$Theme r1 = r1.getTheme()
                r2 = 1
                r1.resolveAttribute(r4, r0, r2)
                androidx.appcompat.app.AlertController$AlertParams r4 = r3.P
                int r0 = r0.resourceId
                r4.mIconId = r0
                return r3
        }

        @java.lang.Deprecated
        public androidx.appcompat.app.AlertDialog.Builder setInverseBackgroundForced(boolean r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mForceInverseBackground = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setItems(@androidx.annotation.ArrayRes int r3, android.content.DialogInterface.OnClickListener r4) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                android.content.res.Resources r1 = r1.getResources()
                java.lang.CharSequence[] r3 = r1.getTextArray(r3)
                r0.mItems = r3
                androidx.appcompat.app.AlertController$AlertParams r3 = r2.P
                r3.mOnClickListener = r4
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setItems(java.lang.CharSequence[] r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mItems = r2
                r0.mOnClickListener = r3
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setMessage(@androidx.annotation.StringRes int r3) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.mMessage = r3
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setMessage(@androidx.annotation.Nullable java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mMessage = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(@androidx.annotation.ArrayRes int r3, boolean[] r4, android.content.DialogInterface.OnMultiChoiceClickListener r5) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                android.content.res.Resources r1 = r1.getResources()
                java.lang.CharSequence[] r3 = r1.getTextArray(r3)
                r0.mItems = r3
                androidx.appcompat.app.AlertController$AlertParams r3 = r2.P
                r3.mOnCheckboxClickListener = r5
                r3.mCheckedItems = r4
                r4 = 1
                r3.mIsMultiChoice = r4
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(android.database.Cursor r2, java.lang.String r3, java.lang.String r4, android.content.DialogInterface.OnMultiChoiceClickListener r5) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mCursor = r2
                r0.mOnCheckboxClickListener = r5
                r0.mIsCheckedColumn = r3
                r0.mLabelColumn = r4
                r2 = 1
                r0.mIsMultiChoice = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] r2, boolean[] r3, android.content.DialogInterface.OnMultiChoiceClickListener r4) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mItems = r2
                r0.mOnCheckboxClickListener = r4
                r0.mCheckedItems = r3
                r2 = 1
                r0.mIsMultiChoice = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButton(@androidx.annotation.StringRes int r3, android.content.DialogInterface.OnClickListener r4) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.mNegativeButtonText = r3
                androidx.appcompat.app.AlertController$AlertParams r3 = r2.P
                r3.mNegativeButtonListener = r4
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mNegativeButtonText = r2
                r0.mNegativeButtonListener = r3
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButtonIcon(android.graphics.drawable.Drawable r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mNegativeButtonIcon = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButton(@androidx.annotation.StringRes int r3, android.content.DialogInterface.OnClickListener r4) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.mNeutralButtonText = r3
                androidx.appcompat.app.AlertController$AlertParams r3 = r2.P
                r3.mNeutralButtonListener = r4
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mNeutralButtonText = r2
                r0.mNeutralButtonListener = r3
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButtonIcon(android.graphics.drawable.Drawable r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mNeutralButtonIcon = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mOnCancelListener = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mOnDismissListener = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mOnItemSelectedListener = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mOnKeyListener = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButton(@androidx.annotation.StringRes int r3, android.content.DialogInterface.OnClickListener r4) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.mPositiveButtonText = r3
                androidx.appcompat.app.AlertController$AlertParams r3 = r2.P
                r3.mPositiveButtonListener = r4
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mPositiveButtonText = r2
                r0.mPositiveButtonListener = r3
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButtonIcon(android.graphics.drawable.Drawable r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mPositiveButtonIcon = r2
                return r1
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public androidx.appcompat.app.AlertDialog.Builder setRecycleOnMeasureEnabled(boolean r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mRecycleOnMeasure = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(@androidx.annotation.ArrayRes int r3, int r4, android.content.DialogInterface.OnClickListener r5) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                android.content.res.Resources r1 = r1.getResources()
                java.lang.CharSequence[] r3 = r1.getTextArray(r3)
                r0.mItems = r3
                androidx.appcompat.app.AlertController$AlertParams r3 = r2.P
                r3.mOnClickListener = r5
                r3.mCheckedItem = r4
                r4 = 1
                r3.mIsSingleChoice = r4
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.database.Cursor r2, int r3, java.lang.String r4, android.content.DialogInterface.OnClickListener r5) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mCursor = r2
                r0.mOnClickListener = r5
                r0.mCheckedItem = r3
                r0.mLabelColumn = r4
                r2 = 1
                r0.mIsSingleChoice = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter r2, int r3, android.content.DialogInterface.OnClickListener r4) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mAdapter = r2
                r0.mOnClickListener = r4
                r0.mCheckedItem = r3
                r2 = 1
                r0.mIsSingleChoice = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] r2, int r3, android.content.DialogInterface.OnClickListener r4) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mItems = r2
                r0.mOnClickListener = r4
                r0.mCheckedItem = r3
                r2 = 1
                r0.mIsSingleChoice = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setTitle(@androidx.annotation.StringRes int r3) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                android.content.Context r1 = r0.mContext
                java.lang.CharSequence r3 = r1.getText(r3)
                r0.mTitle = r3
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setTitle(@androidx.annotation.Nullable java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mTitle = r2
                return r1
        }

        public androidx.appcompat.app.AlertDialog.Builder setView(int r3) {
                r2 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r2.P
                r1 = 0
                r0.mView = r1
                r0.mViewLayoutResId = r3
                r3 = 0
                r0.mViewSpacingSpecified = r3
                return r2
        }

        public androidx.appcompat.app.AlertDialog.Builder setView(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mView = r2
                r2 = 0
                r0.mViewLayoutResId = r2
                r0.mViewSpacingSpecified = r2
                return r1
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @java.lang.Deprecated
        public androidx.appcompat.app.AlertDialog.Builder setView(android.view.View r2, int r3, int r4, int r5, int r6) {
                r1 = this;
                androidx.appcompat.app.AlertController$AlertParams r0 = r1.P
                r0.mView = r2
                r2 = 0
                r0.mViewLayoutResId = r2
                r2 = 1
                r0.mViewSpacingSpecified = r2
                r0.mViewSpacingLeft = r3
                r0.mViewSpacingTop = r4
                r0.mViewSpacingRight = r5
                r0.mViewSpacingBottom = r6
                return r1
        }

        public androidx.appcompat.app.AlertDialog show() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.create()
                r0.show()
                return r0
        }
    }

    public AlertDialog(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.StyleRes int r3) {
            r1 = this;
            int r3 = resolveDialogTheme(r2, r3)
            r1.<init>(r2, r3)
            androidx.appcompat.app.AlertController r2 = new androidx.appcompat.app.AlertController
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.mAlert = r2
            return
    }

    public static int resolveDialogTheme(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.StyleRes int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = androidx.appcompat.R.attr.alertDialogTheme
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    public android.widget.Button getButton(int r2) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            android.widget.Button r2 = r0.getButton(r2)
            return r2
    }

    public android.widget.ListView getListView() {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            android.widget.ListView r0 = r0.getListView()
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.appcompat.app.AlertController r1 = r0.mAlert
            r1.installContent()
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            boolean r0 = r0.onKeyDown(r2, r3)
            if (r0 == 0) goto La
            r2 = 1
            return r2
        La:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            boolean r0 = r0.onKeyUp(r2, r3)
            if (r0 == 0) goto La
            r2 = 1
            return r2
        La:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    public void setButton(int r7, java.lang.CharSequence r8, android.content.DialogInterface.OnClickListener r9) {
            r6 = this;
            androidx.appcompat.app.AlertController r0 = r6.mAlert
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r0.setButton(r1, r2, r3, r4, r5)
            return
    }

    public void setButton(int r7, java.lang.CharSequence r8, android.graphics.drawable.Drawable r9, android.content.DialogInterface.OnClickListener r10) {
            r6 = this;
            androidx.appcompat.app.AlertController r0 = r6.mAlert
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r10
            r5 = r9
            r0.setButton(r1, r2, r3, r4, r5)
            return
    }

    public void setButton(int r7, java.lang.CharSequence r8, android.os.Message r9) {
            r6 = this;
            androidx.appcompat.app.AlertController r0 = r6.mAlert
            r3 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            r0.setButton(r1, r2, r3, r4, r5)
            return
    }

    public void setCustomTitle(android.view.View r2) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            r0.setCustomTitle(r2)
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            r0.setIcon(r2)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            r0.setIcon(r2)
            return
    }

    public void setIconAttribute(int r4) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            r1.resolveAttribute(r4, r0, r2)
            androidx.appcompat.app.AlertController r4 = r3.mAlert
            int r0 = r0.resourceId
            r4.setIcon(r0)
            return
    }

    public void setMessage(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            r0.setMessage(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            r0.setTitle(r2)
            return
    }

    public void setView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.app.AlertController r0 = r1.mAlert
            r0.setView(r2)
            return
    }

    public void setView(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            androidx.appcompat.app.AlertController r0 = r6.mAlert
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.setView(r1, r2, r3, r4, r5)
            return
    }
}
