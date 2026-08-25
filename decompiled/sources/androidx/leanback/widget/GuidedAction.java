package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class GuidedAction extends androidx.leanback.widget.Action {
    public static final long ACTION_ID_CANCEL = -5;
    public static final long ACTION_ID_CONTINUE = -7;
    public static final long ACTION_ID_CURRENT = -3;
    public static final long ACTION_ID_FINISH = -6;
    public static final long ACTION_ID_NEXT = -2;
    public static final long ACTION_ID_NO = -9;
    public static final long ACTION_ID_OK = -4;
    public static final long ACTION_ID_YES = -8;
    public static final int CHECKBOX_CHECK_SET_ID = -1;
    public static final int DEFAULT_CHECK_SET_ID = 1;
    public static final int NO_CHECK_SET = 0;
    private static final java.lang.String TAG = "GuidedAction";
    public int mActionFlags;
    public java.lang.String[] mAutofillHints;
    public int mCheckSetId;
    public int mDescriptionEditInputType;
    public int mDescriptionInputType;
    private java.lang.CharSequence mEditDescription;
    public int mEditInputType;
    private java.lang.CharSequence mEditTitle;
    public int mEditable;
    public int mInputType;
    public android.content.Intent mIntent;
    public java.util.List<androidx.leanback.widget.GuidedAction> mSubActions;

    /* JADX INFO: loaded from: classes3.dex */
    public static class Builder extends androidx.leanback.widget.GuidedAction.BuilderBase<androidx.leanback.widget.GuidedAction.Builder> {
        @java.lang.Deprecated
        public Builder() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public Builder(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public androidx.leanback.widget.GuidedAction build() {
                r1 = this;
                androidx.leanback.widget.GuidedAction r0 = new androidx.leanback.widget.GuidedAction
                r0.<init>()
                r1.applyValues(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class BuilderBase<B extends androidx.leanback.widget.GuidedAction.BuilderBase> {
        private int mActionFlags;
        private java.lang.String[] mAutofillHints;
        private int mCheckSetId;
        private android.content.Context mContext;
        private java.lang.CharSequence mDescription;
        private int mDescriptionEditInputType;
        private int mDescriptionInputType;
        private java.lang.CharSequence mEditDescription;
        private int mEditInputType;
        private java.lang.CharSequence mEditTitle;
        private int mEditable;
        private android.graphics.drawable.Drawable mIcon;
        private long mId;
        private int mInputType;
        private android.content.Intent mIntent;
        private java.util.List<androidx.leanback.widget.GuidedAction> mSubActions;
        private java.lang.CharSequence mTitle;

        public BuilderBase(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mEditable = r0
                r1 = 524289(0x80001, float:7.34685E-40)
                r2.mInputType = r1
                r2.mDescriptionInputType = r1
                r1 = 1
                r2.mEditInputType = r1
                r2.mDescriptionEditInputType = r1
                r2.mCheckSetId = r0
                r2.mContext = r3
                r3 = 112(0x70, float:1.57E-43)
                r2.mActionFlags = r3
                return
        }

        private boolean isChecked() {
                r2 = this;
                int r0 = r2.mActionFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 != r1) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        private void setFlags(int r3, int r4) {
                r2 = this;
                int r0 = r2.mActionFlags
                int r1 = ~r4
                r0 = r0 & r1
                r3 = r3 & r4
                r3 = r3 | r0
                r2.mActionFlags = r3
                return
        }

        public final void applyValues(androidx.leanback.widget.GuidedAction r3) {
                r2 = this;
                long r0 = r2.mId
                r3.setId(r0)
                java.lang.CharSequence r0 = r2.mTitle
                r3.setLabel1(r0)
                java.lang.CharSequence r0 = r2.mEditTitle
                r3.setEditTitle(r0)
                java.lang.CharSequence r0 = r2.mDescription
                r3.setLabel2(r0)
                java.lang.CharSequence r0 = r2.mEditDescription
                r3.setEditDescription(r0)
                android.graphics.drawable.Drawable r0 = r2.mIcon
                r3.setIcon(r0)
                android.content.Intent r0 = r2.mIntent
                r3.mIntent = r0
                int r0 = r2.mEditable
                r3.mEditable = r0
                int r0 = r2.mInputType
                r3.mInputType = r0
                int r0 = r2.mDescriptionInputType
                r3.mDescriptionInputType = r0
                java.lang.String[] r0 = r2.mAutofillHints
                r3.mAutofillHints = r0
                int r0 = r2.mEditInputType
                r3.mEditInputType = r0
                int r0 = r2.mDescriptionEditInputType
                r3.mDescriptionEditInputType = r0
                int r0 = r2.mActionFlags
                r3.mActionFlags = r0
                int r0 = r2.mCheckSetId
                r3.mCheckSetId = r0
                java.util.List<androidx.leanback.widget.GuidedAction> r0 = r2.mSubActions
                r3.mSubActions = r0
                return
        }

        public B autoSaveRestoreEnabled(boolean r2) {
                r1 = this;
                r0 = 64
                if (r2 == 0) goto L7
                r2 = 64
                goto L8
            L7:
                r2 = 0
            L8:
                r1.setFlags(r2, r0)
                return r1
        }

        public B autofillHints(java.lang.String... r1) {
                r0 = this;
                r0.mAutofillHints = r1
                return r0
        }

        public B checkSetId(int r2) {
                r1 = this;
                r1.mCheckSetId = r2
                int r2 = r1.mEditable
                if (r2 != 0) goto L7
                return r1
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Editable actions cannot also be in check sets"
                r2.<init>(r0)
                throw r2
        }

        public B checked(boolean r2) {
                r1 = this;
                r0 = 1
                r1.setFlags(r2, r0)
                int r2 = r1.mEditable
                if (r2 != 0) goto L9
                return r1
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Editable actions cannot also be checked"
                r2.<init>(r0)
                throw r2
        }

        public B clickAction(long r6) {
                r5 = this;
                r0 = 17039370(0x104000a, float:2.42446E-38)
                r1 = -4
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 != 0) goto L14
                r5.mId = r1
                android.content.Context r6 = r5.mContext
                java.lang.String r6 = r6.getString(r0)
                r5.mTitle = r6
                goto L6e
            L14:
                r1 = 17039360(0x1040000, float:2.424457E-38)
                r2 = -5
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L27
                r5.mId = r2
                android.content.Context r6 = r5.mContext
                java.lang.String r6 = r6.getString(r1)
                r5.mTitle = r6
                goto L6e
            L27:
                r2 = -6
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L3a
                r5.mId = r2
                android.content.Context r6 = r5.mContext
                int r7 = androidx.leanback.R.string.lb_guidedaction_finish_title
                java.lang.String r6 = r6.getString(r7)
                r5.mTitle = r6
                goto L6e
            L3a:
                r2 = -7
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L4d
                r5.mId = r2
                android.content.Context r6 = r5.mContext
                int r7 = androidx.leanback.R.string.lb_guidedaction_continue_title
                java.lang.String r6 = r6.getString(r7)
                r5.mTitle = r6
                goto L6e
            L4d:
                r2 = -8
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L5e
                r5.mId = r2
                android.content.Context r6 = r5.mContext
                java.lang.String r6 = r6.getString(r0)
                r5.mTitle = r6
                goto L6e
            L5e:
                r2 = -9
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L6e
                r5.mId = r2
                android.content.Context r6 = r5.mContext
                java.lang.String r6 = r6.getString(r1)
                r5.mTitle = r6
            L6e:
                return r5
        }

        public B description(@androidx.annotation.StringRes int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                java.lang.String r2 = r0.getString(r2)
                r1.mDescription = r2
                return r1
        }

        public B description(java.lang.CharSequence r1) {
                r0 = this;
                r0.mDescription = r1
                return r0
        }

        public B descriptionEditInputType(int r1) {
                r0 = this;
                r0.mDescriptionEditInputType = r1
                return r0
        }

        public B descriptionEditable(boolean r2) {
                r1 = this;
                r0 = 2
                if (r2 != 0) goto Lb
                int r2 = r1.mEditable
                if (r2 != r0) goto La
                r2 = 0
                r1.mEditable = r2
            La:
                return r1
            Lb:
                r1.mEditable = r0
                boolean r2 = r1.isChecked()
                if (r2 != 0) goto L18
                int r2 = r1.mCheckSetId
                if (r2 != 0) goto L18
                return r1
            L18:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Editable actions cannot also be checked"
                r2.<init>(r0)
                throw r2
        }

        public B descriptionInputType(int r1) {
                r0 = this;
                r0.mDescriptionInputType = r1
                return r0
        }

        public B editDescription(@androidx.annotation.StringRes int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                java.lang.String r2 = r0.getString(r2)
                r1.mEditDescription = r2
                return r1
        }

        public B editDescription(java.lang.CharSequence r1) {
                r0 = this;
                r0.mEditDescription = r1
                return r0
        }

        public B editInputType(int r1) {
                r0 = this;
                r0.mEditInputType = r1
                return r0
        }

        public B editTitle(@androidx.annotation.StringRes int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                java.lang.String r2 = r0.getString(r2)
                r1.mEditTitle = r2
                return r1
        }

        public B editTitle(java.lang.CharSequence r1) {
                r0 = this;
                r0.mEditTitle = r1
                return r0
        }

        public B editable(boolean r2) {
                r1 = this;
                r0 = 1
                if (r2 != 0) goto Lb
                int r2 = r1.mEditable
                if (r2 != r0) goto La
                r2 = 0
                r1.mEditable = r2
            La:
                return r1
            Lb:
                r1.mEditable = r0
                boolean r2 = r1.isChecked()
                if (r2 != 0) goto L18
                int r2 = r1.mCheckSetId
                if (r2 != 0) goto L18
                return r1
            L18:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Editable actions cannot also be checked"
                r2.<init>(r0)
                throw r2
        }

        public B enabled(boolean r2) {
                r1 = this;
                r0 = 16
                if (r2 == 0) goto L7
                r2 = 16
                goto L8
            L7:
                r2 = 0
            L8:
                r1.setFlags(r2, r0)
                return r1
        }

        public B focusable(boolean r2) {
                r1 = this;
                r0 = 32
                if (r2 == 0) goto L7
                r2 = 32
                goto L8
            L7:
                r2 = 0
            L8:
                r1.setFlags(r2, r0)
                return r1
        }

        public android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.mContext
                return r0
        }

        public B hasEditableActivatorView(boolean r2) {
                r1 = this;
                r0 = 3
                if (r2 != 0) goto Lb
                int r2 = r1.mEditable
                if (r2 != r0) goto La
                r2 = 0
                r1.mEditable = r2
            La:
                return r1
            Lb:
                r1.mEditable = r0
                boolean r2 = r1.isChecked()
                if (r2 != 0) goto L18
                int r2 = r1.mCheckSetId
                if (r2 != 0) goto L18
                return r1
            L18:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Editable actions cannot also be checked"
                r2.<init>(r0)
                throw r2
        }

        public B hasNext(boolean r2) {
                r1 = this;
                r0 = 4
                if (r2 == 0) goto L5
                r2 = 4
                goto L6
            L5:
                r2 = 0
            L6:
                r1.setFlags(r2, r0)
                return r1
        }

        public B icon(@androidx.annotation.DrawableRes int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
                androidx.leanback.widget.GuidedAction$BuilderBase r2 = r1.icon(r2)
                return r2
        }

        public B icon(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.mIcon = r1
                return r0
        }

        @java.lang.Deprecated
        public B iconResourceId(@androidx.annotation.DrawableRes int r1, android.content.Context r2) {
                r0 = this;
                android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r2, r1)
                androidx.leanback.widget.GuidedAction$BuilderBase r1 = r0.icon(r1)
                return r1
        }

        public B id(long r1) {
                r0 = this;
                r0.mId = r1
                return r0
        }

        public B infoOnly(boolean r2) {
                r1 = this;
                r0 = 8
                if (r2 == 0) goto L7
                r2 = 8
                goto L8
            L7:
                r2 = 0
            L8:
                r1.setFlags(r2, r0)
                return r1
        }

        public B inputType(int r1) {
                r0 = this;
                r0.mInputType = r1
                return r0
        }

        public B intent(android.content.Intent r1) {
                r0 = this;
                r0.mIntent = r1
                return r0
        }

        public B multilineDescription(boolean r2) {
                r1 = this;
                r0 = 2
                if (r2 == 0) goto L5
                r2 = 2
                goto L6
            L5:
                r2 = 0
            L6:
                r1.setFlags(r2, r0)
                return r1
        }

        public B subActions(java.util.List<androidx.leanback.widget.GuidedAction> r1) {
                r0 = this;
                r0.mSubActions = r1
                return r0
        }

        public B title(@androidx.annotation.StringRes int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                java.lang.String r2 = r0.getString(r2)
                r1.mTitle = r2
                return r1
        }

        public B title(java.lang.CharSequence r1) {
                r0 = this;
                r0.mTitle = r1
                return r0
        }
    }

    public GuidedAction() {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            return
    }

    private void setFlags(int r3, int r4) {
            r2 = this;
            int r0 = r2.mActionFlags
            int r1 = ~r4
            r0 = r0 & r1
            r3 = r3 & r4
            r3 = r3 | r0
            r2.mActionFlags = r3
            return
    }

    public java.lang.String[] getAutofillHints() {
            r1 = this;
            java.lang.String[] r0 = r1.mAutofillHints
            return r0
    }

    public int getCheckSetId() {
            r1 = this;
            int r0 = r1.mCheckSetId
            return r0
    }

    public java.lang.CharSequence getDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getLabel2()
            return r0
    }

    public int getDescriptionEditInputType() {
            r1 = this;
            int r0 = r1.mDescriptionEditInputType
            return r0
    }

    public int getDescriptionInputType() {
            r1 = this;
            int r0 = r1.mDescriptionInputType
            return r0
    }

    public java.lang.CharSequence getEditDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mEditDescription
            return r0
    }

    public int getEditInputType() {
            r1 = this;
            int r0 = r1.mEditInputType
            return r0
    }

    public java.lang.CharSequence getEditTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mEditTitle
            return r0
    }

    public int getInputType() {
            r1 = this;
            int r0 = r1.mInputType
            return r0
    }

    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            return r0
    }

    public java.util.List<androidx.leanback.widget.GuidedAction> getSubActions() {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mSubActions
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getLabel1()
            return r0
    }

    public boolean hasEditableActivatorView() {
            r2 = this;
            int r0 = r2.mEditable
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean hasMultilineDescription() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasNext() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 4
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean hasSubActions() {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mSubActions
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasTextEditable() {
            r3 = this;
            int r0 = r3.mEditable
            r1 = 1
            if (r0 == r1) goto La
            r2 = 2
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public boolean infoOnly() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 8
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final boolean isAutoSaveRestoreEnabled() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 64
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isChecked() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public boolean isDescriptionEditable() {
            r2 = this;
            int r0 = r2.mEditable
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean isEditTitleUsed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mEditTitle
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isEditable() {
            r2 = this;
            int r0 = r2.mEditable
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isEnabled() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 16
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isFocusable() {
            r2 = this;
            int r0 = r2.mActionFlags
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final boolean needAutoSaveDescription() {
            r4 = this;
            boolean r0 = r4.isDescriptionEditable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            int r0 = r4.getDescriptionEditInputType()
            r0 = r0 & 4080(0xff0, float:5.717E-42)
            r3 = 128(0x80, float:1.8E-43)
            if (r0 == r3) goto L1d
            r3 = 144(0x90, float:2.02E-43)
            if (r0 == r3) goto L1d
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 != 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
    }

    public final boolean needAutoSaveTitle() {
            r4 = this;
            boolean r0 = r4.isEditable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            int r0 = r4.getEditInputType()
            r0 = r0 & 4080(0xff0, float:5.717E-42)
            r3 = 128(0x80, float:1.8E-43)
            if (r0 == r3) goto L1d
            r3 = 144(0x90, float:2.02E-43)
            if (r0 == r3) goto L1d
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 != 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
    }

    public void onRestoreInstanceState(android.os.Bundle r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.needAutoSaveTitle()
            if (r0 == 0) goto L10
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L31
            r1.setTitle(r2)
            goto L31
        L10:
            boolean r0 = r1.needAutoSaveDescription()
            if (r0 == 0) goto L20
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L31
            r1.setDescription(r2)
            goto L31
        L20:
            int r0 = r1.getCheckSetId()
            if (r0 == 0) goto L31
            boolean r0 = r1.isChecked()
            boolean r2 = r2.getBoolean(r3, r0)
            r1.setChecked(r2)
        L31:
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.needAutoSaveTitle()
            if (r0 == 0) goto L18
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 == 0) goto L18
            java.lang.CharSequence r0 = r1.getTitle()
            java.lang.String r0 = r0.toString()
            r2.putString(r3, r0)
            goto L3d
        L18:
            boolean r0 = r1.needAutoSaveDescription()
            if (r0 == 0) goto L30
            java.lang.CharSequence r0 = r1.getDescription()
            if (r0 == 0) goto L30
            java.lang.CharSequence r0 = r1.getDescription()
            java.lang.String r0 = r0.toString()
            r2.putString(r3, r0)
            goto L3d
        L30:
            int r0 = r1.getCheckSetId()
            if (r0 == 0) goto L3d
            boolean r0 = r1.isChecked()
            r2.putBoolean(r3, r0)
        L3d:
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            r0 = 1
            r1.setFlags(r2, r0)
            return
    }

    public void setDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setLabel2(r1)
            return
    }

    public void setEditDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mEditDescription = r1
            return
    }

    public void setEditTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mEditTitle = r1
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            r0 = 16
            if (r2 == 0) goto L7
            r2 = 16
            goto L8
        L7:
            r2 = 0
        L8:
            r1.setFlags(r2, r0)
            return
    }

    public void setFocusable(boolean r2) {
            r1 = this;
            r0 = 32
            if (r2 == 0) goto L7
            r2 = 32
            goto L8
        L7:
            r2 = 0
        L8:
            r1.setFlags(r2, r0)
            return
    }

    public void setIntent(android.content.Intent r1) {
            r0 = this;
            r0.mIntent = r1
            return
    }

    public void setSubActions(java.util.List<androidx.leanback.widget.GuidedAction> r1) {
            r0 = this;
            r0.mSubActions = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.setLabel1(r1)
            return
    }
}
