package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiTextWatcher implements android.text.TextWatcher {
    private final android.widget.EditText mEditText;
    private int mEmojiReplaceStrategy;
    private boolean mEnabled;
    private final boolean mExpectInitializedEmojiCompat;
    private androidx.emoji2.text.EmojiCompat.InitCallback mInitCallback;
    private int mMaxEmojiCount;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(19)
    public static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<android.widget.EditText> mViewRef;

        public InitCallbackImpl(android.widget.EditText r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mViewRef = r0
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
                r2 = this;
                super.onInitialized()
                java.lang.ref.Reference<android.widget.EditText> r0 = r2.mViewRef
                java.lang.Object r0 = r0.get()
                android.widget.EditText r0 = (android.widget.EditText) r0
                r1 = 1
                androidx.emoji2.viewsintegration.EmojiTextWatcher.processTextOnEnablingEvent(r0, r1)
                return
        }
    }

    public EmojiTextWatcher(android.widget.EditText r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mMaxEmojiCount = r0
            r0 = 0
            r1.mEmojiReplaceStrategy = r0
            r1.mEditText = r2
            r1.mExpectInitializedEmojiCompat = r3
            r2 = 1
            r1.mEnabled = r2
            return
    }

    private androidx.emoji2.text.EmojiCompat.InitCallback getInitCallback() {
            r2 = this;
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            if (r0 != 0) goto Ld
            androidx.emoji2.viewsintegration.EmojiTextWatcher$InitCallbackImpl r0 = new androidx.emoji2.viewsintegration.EmojiTextWatcher$InitCallbackImpl
            android.widget.EditText r1 = r2.mEditText
            r0.<init>(r1)
            r2.mInitCallback = r0
        Ld:
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            return r0
    }

    public static void processTextOnEnablingEvent(@androidx.annotation.Nullable android.widget.EditText r2, int r3) {
            r0 = 1
            if (r3 != r0) goto L31
            if (r2 == 0) goto L31
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L31
            android.text.Editable r2 = r2.getEditableText()
            int r3 = android.text.Selection.getSelectionStart(r2)
            int r0 = android.text.Selection.getSelectionEnd(r2)
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            r1.process(r2)
            if (r3 < 0) goto L26
            if (r0 < 0) goto L26
            android.text.Selection.setSelection(r2, r3, r0)
            goto L31
        L26:
            if (r3 < 0) goto L2c
            android.text.Selection.setSelection(r2, r3)
            goto L31
        L2c:
            if (r0 < 0) goto L31
            android.text.Selection.setSelection(r2, r0)
        L31:
            return
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == 0) goto L11
            boolean r0 = r1.mExpectInitializedEmojiCompat
            if (r0 != 0) goto Lf
            boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            r6 = this;
            android.widget.EditText r0 = r6.mEditText
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L43
            boolean r0 = r6.shouldSkipForDisabledOrNotConfigured()
            if (r0 == 0) goto Lf
            goto L43
        Lf:
            if (r9 > r10) goto L43
            boolean r9 = r7 instanceof android.text.Spannable
            if (r9 == 0) goto L43
            androidx.emoji2.text.EmojiCompat r9 = androidx.emoji2.text.EmojiCompat.get()
            int r9 = r9.getLoadState()
            if (r9 == 0) goto L38
            r0 = 1
            if (r9 == r0) goto L26
            r7 = 3
            if (r9 == r7) goto L38
            goto L43
        L26:
            r1 = r7
            android.text.Spannable r1 = (android.text.Spannable) r1
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r3 = r8 + r10
            int r4 = r6.mMaxEmojiCount
            int r5 = r6.mEmojiReplaceStrategy
            r2 = r8
            r0.process(r1, r2, r3, r4, r5)
            goto L43
        L38:
            androidx.emoji2.text.EmojiCompat r7 = androidx.emoji2.text.EmojiCompat.get()
            androidx.emoji2.text.EmojiCompat$InitCallback r8 = r6.getInitCallback()
            r7.registerInitCallback(r8)
        L43:
            return
    }

    public final void setEmojiReplaceStrategy(int r1) {
            r0 = this;
            r0.mEmojiReplaceStrategy = r1
            return
    }

    public void setEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.mEnabled
            if (r0 == r3) goto L22
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            if (r0 == 0) goto L11
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            androidx.emoji2.text.EmojiCompat$InitCallback r1 = r2.mInitCallback
            r0.unregisterInitCallback(r1)
        L11:
            r2.mEnabled = r3
            if (r3 == 0) goto L22
            android.widget.EditText r3 = r2.mEditText
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r0 = r0.getLoadState()
            processTextOnEnablingEvent(r3, r0)
        L22:
            return
    }

    public final void setMaxEmojiCount(int r1) {
            r0 = this;
            r0.mMaxEmojiCount = r1
            return
    }
}
