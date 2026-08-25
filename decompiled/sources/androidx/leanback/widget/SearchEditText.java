package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SearchEditText extends androidx.leanback.widget.StreamingTextView {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = null;
    private androidx.leanback.widget.SearchEditText.OnKeyboardDismissListener mKeyboardDismissListener;

    public interface OnKeyboardDismissListener {
        void onKeyboardDismiss();
    }

    static {
            java.lang.Class<androidx.leanback.widget.SearchEditText> r0 = androidx.leanback.widget.SearchEditText.class
            java.lang.String r0 = "SearchEditText"
            androidx.leanback.widget.SearchEditText.TAG = r0
            return
    }

    public SearchEditText(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.leanback.R.style.TextAppearance_Leanback_SearchTextEdit
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchEditText(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.leanback.widget.StreamingTextView, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
            r2 = this;
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L10
            androidx.leanback.widget.SearchEditText$OnKeyboardDismissListener r3 = r2.mKeyboardDismissListener
            if (r3 == 0) goto Le
            r3.onKeyboardDismiss()
        Le:
            r3 = 0
            return r3
        L10:
            boolean r3 = super.onKeyPreIme(r3, r4)
            return r3
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void reset() {
            r0 = this;
            super.reset()
            return
    }

    @Override // androidx.leanback.widget.StreamingTextView, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(java.lang.CharSequence r1) {
            r0 = this;
            super.setFinalRecognizedText(r1)
            return
    }

    public void setOnKeyboardDismissListener(androidx.leanback.widget.SearchEditText.OnKeyboardDismissListener r1) {
            r0 = this;
            r0.mKeyboardDismissListener = r1
            return
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void updateRecognizedText(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            super.updateRecognizedText(r1, r2)
            return
    }

    @Override // androidx.leanback.widget.StreamingTextView
    public /* bridge */ /* synthetic */ void updateRecognizedText(java.lang.String r1, java.util.List r2) {
            r0 = this;
            super.updateRecognizedText(r1, r2)
            return
    }
}
