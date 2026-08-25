package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiEditTextHelper {
    private int mEmojiReplaceStrategy;
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal mHelper;
    private int mMaxEmojiCount;

    public static class HelperInternal {
        public HelperInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public android.text.method.KeyListener getKeyListener(@androidx.annotation.Nullable android.text.method.KeyListener r1) {
                r0 = this;
                return r1
        }

        public boolean isEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r1, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r2) {
                r0 = this;
                return r1
        }

        public void setEmojiReplaceStrategy(int r1) {
                r0 = this;
                return
        }

        public void setEnabled(boolean r1) {
                r0 = this;
                return
        }

        public void setMaxEmojiCount(int r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(19)
    public static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal {
        private final android.widget.EditText mEditText;
        private final androidx.emoji2.viewsintegration.EmojiTextWatcher mTextWatcher;

        public HelperInternal19(@androidx.annotation.NonNull android.widget.EditText r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r1.mEditText = r2
                androidx.emoji2.viewsintegration.EmojiTextWatcher r0 = new androidx.emoji2.viewsintegration.EmojiTextWatcher
                r0.<init>(r2, r3)
                r1.mTextWatcher = r0
                r2.addTextChangedListener(r0)
                android.text.Editable$Factory r3 = androidx.emoji2.viewsintegration.EmojiEditableFactory.getInstance()
                r2.setEditableFactory(r3)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        public final android.text.method.KeyListener getKeyListener(@androidx.annotation.Nullable android.text.method.KeyListener r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.emoji2.viewsintegration.EmojiKeyListener
                if (r0 == 0) goto L5
                return r2
            L5:
                if (r2 != 0) goto L9
                r2 = 0
                return r2
            L9:
                boolean r0 = r2 instanceof android.text.method.NumberKeyListener
                if (r0 == 0) goto Le
                return r2
            Le:
                androidx.emoji2.viewsintegration.EmojiKeyListener r0 = new androidx.emoji2.viewsintegration.EmojiKeyListener
                r0.<init>(r2)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        public final boolean isEnabled() {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextWatcher r0 = r1.mTextWatcher
                boolean r0 = r0.isEnabled()
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        public final android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r3, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.emoji2.viewsintegration.EmojiInputConnection
                if (r0 == 0) goto L5
                return r3
            L5:
                androidx.emoji2.viewsintegration.EmojiInputConnection r0 = new androidx.emoji2.viewsintegration.EmojiInputConnection
                android.widget.EditText r1 = r2.mEditText
                r0.<init>(r1, r3, r4)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        public final void setEmojiReplaceStrategy(int r2) {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextWatcher r0 = r1.mTextWatcher
                r0.setEmojiReplaceStrategy(r2)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        public final void setEnabled(boolean r2) {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextWatcher r0 = r1.mTextWatcher
                r0.setEnabled(r2)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        public final void setMaxEmojiCount(int r2) {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextWatcher r0 = r1.mTextWatcher
                r0.setMaxEmojiCount(r2)
                return
        }
    }

    public EmojiEditTextHelper(@androidx.annotation.NonNull android.widget.EditText r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public EmojiEditTextHelper(@androidx.annotation.NonNull android.widget.EditText r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mMaxEmojiCount = r0
            r0 = 0
            r1.mEmojiReplaceStrategy = r0
            java.lang.String r0 = "editText cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal19 r0 = new androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal19
            r0.<init>(r2, r3)
            r1.mHelper = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiReplaceStrategy() {
            r1 = this;
            int r0 = r1.mEmojiReplaceStrategy
            return r0
    }

    @androidx.annotation.Nullable
    public android.text.method.KeyListener getKeyListener(@androidx.annotation.Nullable android.text.method.KeyListener r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal r0 = r1.mHelper
            android.text.method.KeyListener r2 = r0.getKeyListener(r2)
            return r2
    }

    public int getMaxEmojiCount() {
            r1 = this;
            int r0 = r1.mMaxEmojiCount
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal r0 = r1.mHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.Nullable android.view.inputmethod.InputConnection r2, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal r0 = r1.mHelper
            android.view.inputmethod.InputConnection r2 = r0.onCreateInputConnection(r2, r3)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setEmojiReplaceStrategy(int r2) {
            r1 = this;
            r1.mEmojiReplaceStrategy = r2
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal r0 = r1.mHelper
            r0.setEmojiReplaceStrategy(r2)
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal r0 = r1.mHelper
            r0.setEnabled(r2)
            return
    }

    public void setMaxEmojiCount(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            java.lang.String r0 = "maxEmojiCount should be greater than 0"
            androidx.core.util.Preconditions.checkArgumentNonnegative(r2, r0)
            r1.mMaxEmojiCount = r2
            androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal r0 = r1.mHelper
            r0.setMaxEmojiCount(r2)
            return
    }
}
