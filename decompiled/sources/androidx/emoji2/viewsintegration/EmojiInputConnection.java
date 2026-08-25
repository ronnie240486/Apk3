package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiInputConnection extends android.view.inputmethod.InputConnectionWrapper {
    private final androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper mEmojiCompatDeleteHelper;
    private final android.widget.TextView mTextView;

    public static class EmojiCompatDeleteHelper {
        public EmojiCompatDeleteHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean handleDeleteSurroundingText(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r1, @androidx.annotation.NonNull android.text.Editable r2, @androidx.annotation.IntRange(from = 0) int r3, @androidx.annotation.IntRange(from = 0) int r4, boolean r5) {
                r0 = this;
                boolean r1 = androidx.emoji2.text.EmojiCompat.handleDeleteSurroundingText(r1, r2, r3, r4, r5)
                return r1
        }

        public void updateEditorInfoAttrs(@androidx.annotation.NonNull android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
                if (r0 == 0) goto Ld
                androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
                r0.updateEditorInfo(r2)
            Ld:
                return
        }
    }

    public EmojiInputConnection(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.NonNull android.view.inputmethod.InputConnection r4, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = new androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper
            r0.<init>()
            r1 = 0
            r2.<init>(r4, r1)
            r2.mTextView = r3
            r2.mEmojiCompatDeleteHelper = r0
            r0.updateEditorInfoAttrs(r5)
            return
    }

    private android.text.Editable getEditable() {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            android.text.Editable r0 = r0.getEditableText()
            return r0
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int r7, int r8) {
            r6 = this;
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = r6.mEmojiCompatDeleteHelper
            android.text.Editable r2 = r6.getEditable()
            r5 = 0
            r1 = r6
            r3 = r7
            r4 = r8
            boolean r0 = r0.handleDeleteSurroundingText(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L19
            boolean r7 = super.deleteSurroundingText(r7, r8)
            if (r7 == 0) goto L17
            goto L19
        L17:
            r7 = 0
            goto L1a
        L19:
            r7 = 1
        L1a:
            return r7
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int r7, int r8) {
            r6 = this;
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = r6.mEmojiCompatDeleteHelper
            android.text.Editable r2 = r6.getEditable()
            r5 = 1
            r1 = r6
            r3 = r7
            r4 = r8
            boolean r0 = r0.handleDeleteSurroundingText(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L19
            boolean r7 = super.deleteSurroundingTextInCodePoints(r7, r8)
            if (r7 == 0) goto L17
            goto L19
        L17:
            r7 = 0
            goto L1a
        L19:
            r7 = 1
        L1a:
            return r7
    }
}
